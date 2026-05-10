import argparse
import subprocess
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parent


def run(args, check=True):
    print("+ " + " ".join(args))
    result = subprocess.run(args, cwd=ROOT, text=True, stdout=subprocess.PIPE, stderr=subprocess.STDOUT)
    if result.stdout:
        print(result.stdout.rstrip())
    if check and result.returncode != 0:
        raise SystemExit(result.returncode)
    return result


def git_output(args):
    return run(["git"] + args).stdout.strip()


def ensure_repo():
    if git_output(["rev-parse", "--is-inside-work-tree"]) != "true":
        raise SystemExit("Not inside a git repository.")


def current_branch():
    return git_output(["branch", "--show-current"])


def has_changes():
    return bool(run(["git", "status", "--porcelain"]).stdout.strip())


def main():
    parser = argparse.ArgumentParser(description="Commit and push this VBook extension repo.")
    parser.add_argument("-m", "--message", default="Update vbook extensions", help="Commit message.")
    parser.add_argument("--remote", default="origin", help="Git remote name.")
    parser.add_argument("--branch", default="main", help="Branch to push.")
    parser.add_argument("--dry-run", action="store_true", help="Show status without committing or pushing.")
    args = parser.parse_args()

    ensure_repo()
    branch = current_branch()
    if branch and branch != args.branch:
        print(f"Current branch is {branch!r}; pushing to {args.branch!r}.")

    run(["git", "status", "--short"])
    if not has_changes():
        print("No changes to commit.")
        return 0

    if args.dry_run:
        print("Dry run: would run git add -A, git commit, then git push.")
        return 0

    run(["git", "add", "-A"])
    run(["git", "commit", "-m", args.message])
    run(["git", "push", args.remote, args.branch])
    print("Push complete.")
    return 0


if __name__ == "__main__":
    try:
        raise SystemExit(main())
    except KeyboardInterrupt:
        print("Cancelled.", file=sys.stderr)
        raise SystemExit(130)
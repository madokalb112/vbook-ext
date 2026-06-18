package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q5a {
    public final long a;
    public final f4a b;
    public final vvb c;
    public final boolean d;
    public final boolean e;
    public final q55 f;
    public final gm3 g;
    public final boolean h;
    public final lm8 i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;

    public q5a(long j, f4a f4aVar, vvb vvbVar, boolean z, boolean z2, q55 q55Var, gm3 gm3Var, boolean z3, lm8 lm8Var, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        f4aVar.getClass();
        lm8Var.getClass();
        this.a = j;
        this.b = f4aVar;
        this.c = vvbVar;
        this.d = z;
        this.e = z2;
        this.f = q55Var;
        this.g = gm3Var;
        this.h = z3;
        this.i = lm8Var;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
        this.n = z8;
    }

    public static q5a a(q5a q5aVar, long j, f4a f4aVar, vvb vvbVar, boolean z, boolean z2, q55 q55Var, gm3 gm3Var, boolean z3, lm8 lm8Var, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i) {
        q5aVar.getClass();
        long j2 = (i & 2) != 0 ? q5aVar.a : j;
        f4a f4aVar2 = (i & 4) != 0 ? q5aVar.b : f4aVar;
        if ((i & 8) != 0) {
            q5aVar.getClass();
        }
        vvb vvbVar2 = (i & 16) != 0 ? q5aVar.c : vvbVar;
        boolean z9 = (i & 32) != 0 ? q5aVar.d : z;
        boolean z10 = (i & 64) != 0 ? q5aVar.e : z2;
        q55 q55Var2 = (i & Token.CASE) != 0 ? q5aVar.f : q55Var;
        gm3 gm3Var2 = (i & 256) != 0 ? q5aVar.g : gm3Var;
        boolean z11 = (i & 512) != 0 ? q5aVar.h : z3;
        lm8 lm8Var2 = (i & 1024) != 0 ? q5aVar.i : lm8Var;
        boolean z12 = (i & 2048) != 0 ? q5aVar.j : z4;
        boolean z13 = (i & 4096) != 0 ? q5aVar.k : z5;
        boolean z14 = (i & 8192) != 0 ? q5aVar.l : z6;
        boolean z15 = (i & 16384) != 0 ? q5aVar.m : z7;
        boolean z16 = (i & 32768) != 0 ? q5aVar.n : z8;
        q5aVar.getClass();
        f4aVar2.getClass();
        lm8Var2.getClass();
        return new q5a(j2, f4aVar2, vvbVar2, z9, z10, q55Var2, gm3Var2, z11, lm8Var2, z12, z13, z14, z15, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5a)) {
            return false;
        }
        q5a q5aVar = (q5a) obj;
        return this.a == q5aVar.a && this.b == q5aVar.b && lc5.Q(this.c, q5aVar.c) && this.d == q5aVar.d && this.e == q5aVar.e && lc5.Q(this.f, q5aVar.f) && lc5.Q(this.g, q5aVar.g) && this.h == q5aVar.h && this.i == q5aVar.i && this.j == q5aVar.j && this.k == q5aVar.k && this.l == q5aVar.l && this.m == q5aVar.m && this.n == q5aVar.n;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + xv5.b(Long.hashCode(0L) * 31, 31, this.a)) * 961;
        vvb vvbVar = this.c;
        int iC = j39.c(j39.c((iHashCode + (vvbVar == null ? 0 : vvbVar.hashCode())) * 31, 31, this.d), 31, this.e);
        q55 q55Var = this.f;
        int iHashCode2 = (iC + (q55Var == null ? 0 : q55Var.hashCode())) * 31;
        gm3 gm3Var = this.g;
        return Boolean.hashCode(this.n) + j39.c(j39.c(j39.c(j39.c((this.i.hashCode() + j39.c((iHashCode2 + (gm3Var != null ? gm3Var.hashCode() : 0)) * 31, 31, this.h)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        return "SyncState(lastBackup=0, lastSyncAt=" + this.a + ", syncMethod=" + this.b + ", googleDriveInfo=null, webDavInfo=" + this.c + ", isCloudSyncing=" + this.d + ", isTestingWebDav=" + this.e + ", importProgress=" + this.f + ", exportProgress=" + this.g + ", isError=" + this.h + ", restoreMode=" + this.i + ", backupSetting=" + this.j + ", backupShelf=" + this.k + ", backupExtension=" + this.l + ", backupContent=" + this.m + ", backupAppData=" + this.n + ")";
    }
}

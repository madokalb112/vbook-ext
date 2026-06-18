package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q6 {
    public int a;
    public int b;
    public int c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof q6)) {
                return false;
            }
            q6 q6Var = (q6) obj;
            int i = this.a;
            if (i != q6Var.a) {
                return false;
            }
            if (i != 8 || Math.abs(this.c - this.b) != 1 || this.c != q6Var.b || this.b != q6Var.c) {
                return this.c == q6Var.c && this.b == q6Var.b;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        return tw2.q(sb, this.c, ",p:null]");
    }
}

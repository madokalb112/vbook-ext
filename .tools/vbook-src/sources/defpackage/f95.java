package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f95 {
    public final String a;
    public final j95 b;
    public final to3 c;

    public f95(String str, j95 j95Var, to3 to3Var) {
        str.getClass();
        j95Var.getClass();
        this.a = str;
        this.b = j95Var;
        this.c = to3Var;
    }

    public static f95 a(f95 f95Var, j95 j95Var, to3 to3Var, int i) {
        String str = f95Var.a;
        if ((i & 4) != 0) {
            to3Var = f95Var.c;
        }
        f95Var.getClass();
        str.getClass();
        return new f95(str, j95Var, to3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f95)) {
            return false;
        }
        f95 f95Var = (f95) obj;
        return lc5.Q(this.a, f95Var.a) && this.b == f95Var.b && lc5.Q(this.c, f95Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        to3 to3Var = this.c;
        return iHashCode + (to3Var == null ? 0 : to3Var.hashCode());
    }

    public final String toString() {
        return "InstallExtensionState(url=" + this.a + ", status=" + this.b + ", info=" + this.c + ")";
    }

    public /* synthetic */ f95(String str, int i) {
        this((i & 1) != 0 ? "" : str, j95.a, null);
    }
}

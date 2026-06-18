package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vn2 {
    public final oa8 a;
    public final int b;
    public final int c;

    public vn2(oa8 oa8Var, int i, int i2) {
        gx1.y(oa8Var, "Null dependency anInterface.");
        this.a = oa8Var;
        this.b = i;
        this.c = i2;
    }

    public static vn2 a(oa8 oa8Var) {
        return new vn2(oa8Var, 1, 0);
    }

    public static vn2 b(Class cls) {
        return new vn2(cls, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vn2)) {
            return false;
        }
        vn2 vn2Var = (vn2) obj;
        return this.a.equals(vn2Var.a) && this.b == vn2Var.b && this.c == vn2Var.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                gp.i(dx1.f(i2, "Unsupported injection: "));
                return null;
            }
            str = "deferred";
        }
        return ky0.s(str, "}", sb);
    }

    public vn2(Class cls, int i, int i2) {
        this(oa8.a(cls), i, i2);
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z87 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;

    public z87(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = i;
        this.f = i2;
    }

    public static z87 a(z87 z87Var, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            z = z87Var.a;
        }
        boolean z5 = z;
        if ((i3 & 2) != 0) {
            z2 = z87Var.b;
        }
        boolean z6 = z2;
        if ((i3 & 4) != 0) {
            z3 = z87Var.c;
        }
        boolean z7 = z3;
        if ((i3 & 8) != 0) {
            z4 = z87Var.d;
        }
        boolean z8 = z4;
        if ((i3 & 16) != 0) {
            i = z87Var.e;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = z87Var.f;
        }
        z87Var.getClass();
        return new z87(i4, i2, z5, z6, z7, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z87)) {
            return false;
        }
        z87 z87Var = (z87) obj;
        return this.a == z87Var.a && this.b == z87Var.b && this.c == z87Var.c && this.d == z87Var.d && this.e == z87Var.e && this.f == z87Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + tw2.d(this.e, j39.c(j39.c(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("NotificationState(community=", this.a, ", updateApp=", this.b, ", updateExtension=");
        ky0.D(sbR, this.c, ", updateNewChap=", this.d, ", updateRule=");
        sbR.append(this.e);
        sbR.append(", updateTime=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}

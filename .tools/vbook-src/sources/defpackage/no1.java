package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class no1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;

    public no1(boolean z, int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
    }

    public static no1 a(no1 no1Var, int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = no1Var.a;
        }
        int i5 = i;
        if ((i4 & 2) != 0) {
            i2 = no1Var.b;
        }
        int i6 = i2;
        if ((i4 & 4) != 0) {
            i3 = no1Var.c;
        }
        int i7 = no1Var.d;
        boolean z = no1Var.e;
        no1Var.getClass();
        return new no1(z, i5, i6, i3, i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no1)) {
            return false;
        }
        no1 no1Var = (no1) obj;
        return this.a == no1Var.a && this.b == no1Var.b && this.c == no1Var.c && this.d == no1Var.d && this.e == no1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + tw2.d(this.d, tw2.d(this.c, tw2.d(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = xv5.t(this.a, this.b, "ConnectionState(delay=", ", thread=", ", retry=");
        ky0.u(this.c, this.d, ", dns=", ", cronet=", sbT);
        return xv5.q(")", sbT, this.e);
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vh5 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;

    public vh5(int i, int i2, int i3, int i4, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh5)) {
            return false;
        }
        vh5 vh5Var = (vh5) obj;
        return this.a == vh5Var.a && this.b == vh5Var.b && this.c == vh5Var.c && this.d == vh5Var.d && this.e.equals(vh5Var.e);
    }

    public final int hashCode() {
        return j39.a(tw2.d(this.d, tw2.d(this.c, tw2.d(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbT = xv5.t(this.a, this.b, "KF6Section(index=", ", start=", ", end=");
        ky0.u(this.c, this.d, ", length=", ", href=", sbT);
        return ky0.s(this.e, ", next=null)", sbT);
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b75 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    public b75(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b75)) {
            return false;
        }
        b75 b75Var = (b75) obj;
        return this.a.equals(b75Var.a) && this.b == b75Var.b && this.c == b75Var.c && this.d == b75Var.d && this.e == b75Var.e && this.f == b75Var.f && this.g == b75Var.g && this.h == b75Var.h && this.i == b75Var.i && this.j == b75Var.j && this.k == b75Var.k && this.l == b75Var.l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + tw2.d(this.k, tw2.d(this.j, tw2.d(this.i, tw2.d(this.h, tw2.d(this.g, tw2.d(this.f, tw2.d(this.e, tw2.d(this.d, tw2.d(this.c, tw2.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = dx1.n("IndxHeader(magic=", this.a, ", length=", ", type=", this.b);
        ky0.u(this.c, this.d, ", idxt=", ", numRecords=", sbN);
        ky0.u(this.e, this.f, ", encoding=", ", language=", sbN);
        ky0.u(this.g, this.h, ", total=", ", ordt=", sbN);
        ky0.u(this.i, this.j, ", ligt=", ", numLigt=", sbN);
        sbN.append(this.k);
        sbN.append(", numCncx=");
        sbN.append(this.l);
        sbN.append(")");
        return sbN.toString();
    }
}

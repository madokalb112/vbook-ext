package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xh6 {
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
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final String q;
    public final String r;

    public xh6(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, String str2, String str3) {
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
        this.m = i12;
        this.n = i13;
        this.o = i14;
        this.p = i15;
        this.q = str2;
        this.r = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh6)) {
            return false;
        }
        xh6 xh6Var = (xh6) obj;
        return this.a.equals(xh6Var.a) && this.b == xh6Var.b && this.c == xh6Var.c && this.d == xh6Var.d && this.e == xh6Var.e && this.f == xh6Var.f && this.g == xh6Var.g && this.h == xh6Var.h && this.i == xh6Var.i && this.j == xh6Var.j && this.k == xh6Var.k && this.l == xh6Var.l && this.m == xh6Var.m && this.n == xh6Var.n && this.o == xh6Var.o && this.p == xh6Var.p && this.q.equals(xh6Var.q) && this.r.equals(xh6Var.r);
    }

    public final int hashCode() {
        return this.r.hashCode() + j39.a(tw2.d(this.p, tw2.d(this.o, tw2.d(this.n, tw2.d(this.m, tw2.d(this.l, tw2.d(this.k, tw2.d(this.j, tw2.d(this.i, tw2.d(this.h, tw2.d(this.g, tw2.d(this.f, tw2.d(this.e, tw2.d(this.d, tw2.d(this.c, tw2.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.q);
    }

    public final String toString() {
        StringBuilder sbN = dx1.n("MobiHeader(identifier=", this.a, ", length=", ", type=", this.b);
        ky0.u(this.c, this.d, ", encoding=", ", uid=", sbN);
        ky0.u(this.e, this.f, ", version=", ", titleOffset=", sbN);
        ky0.u(this.g, this.h, ", titleLength=", ", localeRegion=", sbN);
        ky0.u(this.i, this.j, ", localeLanguage=", ", resourceStart=", sbN);
        ky0.u(this.k, this.l, ", huffcdic=", ", numHuffcdic=", sbN);
        ky0.u(this.m, this.n, ", exthFlag=", ", trailingFlags=", sbN);
        ky0.u(this.o, this.p, ", indx=", ", title=", sbN);
        return tw2.s(sbN, this.q, ", languege=", this.r, ")");
    }
}

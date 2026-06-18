package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g71 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;

    public g71(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
    }

    public static by3 a(dwa dwaVar, dd4 dd4Var) {
        if (dwaVar == dwa.b) {
            dd4Var.f0(1539238463);
            by3 by3VarG0 = i12.g0(tv6.d, dd4Var);
            dd4Var.q(false);
            return by3VarG0;
        }
        dd4Var.f0(1539331773);
        by3 by3VarG02 = i12.g0(tv6.c, dd4Var);
        dd4Var.q(false);
        return by3VarG02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g71)) {
            return false;
        }
        g71 g71Var = (g71) obj;
        return lc1.d(this.a, g71Var.a) && lc1.d(this.b, g71Var.b) && lc1.d(this.m, g71Var.m) && lc1.d(this.c, g71Var.c) && lc1.d(this.d, g71Var.d) && lc1.d(this.e, g71Var.e) && lc1.d(this.f, g71Var.f) && lc1.d(this.g, g71Var.g) && lc1.d(this.h, g71Var.h) && lc1.d(this.i, g71Var.i) && lc1.d(this.j, g71Var.j) && lc1.d(this.k, g71Var.k) && lc1.d(this.l, g71Var.l);
    }

    public final int hashCode() {
        int i = lc1.k;
        return Long.hashCode(this.l) + xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.m), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }
}

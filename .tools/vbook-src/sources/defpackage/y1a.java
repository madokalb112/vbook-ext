package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y1a {
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
    public final long n;
    public final long o;
    public final long p;

    public y1a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
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
        this.n = j14;
        this.o = j15;
        this.p = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y1a)) {
            return false;
        }
        y1a y1aVar = (y1a) obj;
        return lc1.d(this.a, y1aVar.a) && lc1.d(this.b, y1aVar.b) && lc1.d(this.c, y1aVar.c) && lc1.d(this.d, y1aVar.d) && lc1.d(this.e, y1aVar.e) && lc1.d(this.f, y1aVar.f) && lc1.d(this.g, y1aVar.g) && lc1.d(this.h, y1aVar.h) && lc1.d(this.i, y1aVar.i) && lc1.d(this.j, y1aVar.j) && lc1.d(this.k, y1aVar.k) && lc1.d(this.l, y1aVar.l) && lc1.d(this.m, y1aVar.m) && lc1.d(this.n, y1aVar.n) && lc1.d(this.o, y1aVar.o) && lc1.d(this.p, y1aVar.p);
    }

    public final int hashCode() {
        int i = lc1.k;
        return Long.hashCode(this.p) + xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }
}

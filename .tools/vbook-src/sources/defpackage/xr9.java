package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xr9 {
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

    public xr9(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr9)) {
            return false;
        }
        xr9 xr9Var = (xr9) obj;
        return lc1.d(this.a, xr9Var.a) && lc1.d(this.b, xr9Var.b) && lc1.d(this.c, xr9Var.c) && lc1.d(this.d, xr9Var.d) && lc1.d(this.e, xr9Var.e) && lc1.d(this.f, xr9Var.f) && lc1.d(this.g, xr9Var.g) && lc1.d(this.h, xr9Var.h) && lc1.d(this.i, xr9Var.i) && lc1.d(this.j, xr9Var.j) && lc1.d(this.k, xr9Var.k);
    }

    public final int hashCode() {
        int i = lc1.k;
        return Long.hashCode(this.k) + xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        String strJ = lc1.j(this.a);
        String strJ2 = lc1.j(this.b);
        String strJ3 = lc1.j(this.c);
        String strJ4 = lc1.j(this.d);
        String strJ5 = lc1.j(this.e);
        String strJ6 = lc1.j(this.f);
        String strJ7 = lc1.j(this.g);
        String strJ8 = lc1.j(this.h);
        String strJ9 = lc1.j(this.i);
        String strJ10 = lc1.j(this.j);
        String strJ11 = lc1.j(this.k);
        StringBuilder sbQ = j39.q("StatisticColors(readHighlightContainer=", strJ, ", readHighlightContent=", strJ2, ", listenHighlightContainer=");
        j39.y(sbQ, strJ3, ", listenHighlightContent=", strJ4, ", totalHighlightContainer=");
        j39.y(sbQ, strJ5, ", totalHighlightContent=", strJ6, ", readAccent=");
        j39.y(sbQ, strJ7, ", listenAccent=", strJ8, ", splitTrack=");
        j39.y(sbQ, strJ9, ", segmentDivider=", strJ10, ", tabTrack=");
        return ky0.s(strJ11, ")", sbQ);
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c47 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public c47(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c47)) {
            return false;
        }
        c47 c47Var = (c47) obj;
        return lc1.d(this.a, c47Var.a) && lc1.d(this.d, c47Var.d) && lc1.d(this.b, c47Var.b) && lc1.d(this.e, c47Var.e) && lc1.d(this.c, c47Var.c) && lc1.d(this.f, c47Var.f) && lc1.d(this.g, c47Var.g);
    }

    public final int hashCode() {
        int i = lc1.k;
        return Long.hashCode(this.g) + xv5.b(xv5.b(xv5.b(xv5.b(xv5.b(Long.hashCode(this.a) * 31, 31, this.d), 31, this.b), 31, this.e), 31, this.c), 31, this.f);
    }
}

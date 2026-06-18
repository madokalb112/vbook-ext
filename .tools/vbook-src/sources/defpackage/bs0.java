package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bs0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public bs0(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bs0)) {
            return false;
        }
        bs0 bs0Var = (bs0) obj;
        return lc1.d(this.a, bs0Var.a) && lc1.d(this.b, bs0Var.b) && lc1.d(this.c, bs0Var.c) && lc1.d(this.d, bs0Var.d);
    }

    public final int hashCode() {
        int i = lc1.k;
        return Long.hashCode(this.d) + xv5.b(xv5.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}

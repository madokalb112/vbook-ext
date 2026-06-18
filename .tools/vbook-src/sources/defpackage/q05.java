package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q05 {
    public final long a;
    public final String b;
    public final int c;
    public final int d;

    public q05(long j, String str) {
        str.getClass();
        this.a = j;
        this.b = str;
        int i = oa5.c;
        this.c = (int) (j >> 32);
        this.d = (int) (j & 4294967295L);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.c);
        sb.append('x');
        sb.append(this.d);
        sb.append(",'");
        return ky0.s(this.b, "')", sb);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q05)) {
            return false;
        }
        q05 q05Var = (q05) obj;
        return oa5.a(this.a, q05Var.a) && lc5.Q(this.b, q05Var.b);
    }

    public final int hashCode() {
        int i = oa5.c;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageInfo(size=");
        sb.append(this.c);
        sb.append('x');
        sb.append(this.d);
        sb.append(", mimeType='");
        return ky0.s(this.b, "')", sb);
    }
}

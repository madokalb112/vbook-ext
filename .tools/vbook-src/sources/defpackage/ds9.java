package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ds9 {
    public final long a;
    public final long b;
    public final int c;
    public final List d;

    public /* synthetic */ ds9(long j, long j2, int i) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, 1, lc3.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds9)) {
            return false;
        }
        ds9 ds9Var = (ds9) obj;
        return this.a == ds9Var.a && this.b == ds9Var.b && this.c == ds9Var.c && lc5.Q(this.d, ds9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + tw2.d(this.c, xv5.b(Long.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbO = j39.o(this.a, "StatisticSummary(readTime=", ", listenTime=");
        sbO.append(this.b);
        sbO.append(", averageDivisor=");
        sbO.append(this.c);
        sbO.append(", sessions=");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }

    public ds9(long j, long j2, int i, List list) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = list;
    }
}

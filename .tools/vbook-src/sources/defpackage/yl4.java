package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yl4 {
    public final long a;
    public final List b;

    public yl4(long j, List list) {
        list.getClass();
        this.a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl4)) {
            return false;
        }
        yl4 yl4Var = (yl4) obj;
        return this.a == yl4Var.a && lc5.Q(this.b, yl4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "HistorySection(time=" + this.a + ", books=" + this.b + ")";
    }
}

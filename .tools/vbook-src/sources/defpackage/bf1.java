package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bf1 {
    public final lm9 a;
    public final List b;
    public final ha5 c;

    public bf1(lm9 lm9Var, List list, ha5 ha5Var) {
        lm9Var.getClass();
        this.a = lm9Var;
        this.b = list;
        this.c = ha5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf1)) {
            return false;
        }
        bf1 bf1Var = (bf1) obj;
        return lc5.Q(this.a, bf1Var.a) && this.b.equals(bf1Var.b) && this.c.equals(bf1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + j39.d(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "DownloadContext(dataFetcher=" + this.a + ", chapters=" + this.b + ", downloadRange=" + this.c + ")";
    }
}

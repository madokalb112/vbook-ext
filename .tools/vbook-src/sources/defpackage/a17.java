package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a17 {
    public final boolean a;
    public final List b;

    public a17(List list, boolean z) {
        list.getClass();
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a17)) {
            return false;
        }
        a17 a17Var = (a17) obj;
        return this.a == a17Var.a && lc5.Q(this.b, a17Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "NERSkipListState(isLoading=" + this.a + ", skips=" + this.b + ")";
    }
}

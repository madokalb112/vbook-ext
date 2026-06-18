package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ko4 {
    public final List a;
    public final List b;

    public ko4(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko4)) {
            return false;
        }
        ko4 ko4Var = (ko4) obj;
        return lc5.Q(this.a, ko4Var.a) && lc5.Q(this.b, ko4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HomeSearchSuggestState(books=" + this.a + ", histories=" + this.b + ")";
    }
}

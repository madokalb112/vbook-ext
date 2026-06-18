package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uo3 {
    public final boolean a;
    public final List b;

    public uo3(List list, boolean z) {
        list.getClass();
        this.a = z;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo3)) {
            return false;
        }
        uo3 uo3Var = (uo3) obj;
        return this.a == uo3Var.a && lc5.Q(this.b, uo3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ExtensionListState(isLoading=" + this.a + ", extensions=" + this.b + ")";
    }
}

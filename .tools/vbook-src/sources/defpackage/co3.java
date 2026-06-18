package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class co3 {
    public final List a = lc3.a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof co3) && this.a.equals(((co3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return "ExtensionDevListState(isLoading=true, extensions=" + this.a + ")";
    }
}

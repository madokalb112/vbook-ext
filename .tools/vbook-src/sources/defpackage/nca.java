package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nca {
    public final st5 a;
    public final List b;

    public nca(st5 st5Var, List list) {
        st5Var.getClass();
        list.getClass();
        this.a = st5Var;
        this.b = list;
    }

    public static nca a(st5 st5Var, List list) {
        st5Var.getClass();
        list.getClass();
        return new nca(st5Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nca)) {
            return false;
        }
        nca ncaVar = (nca) obj;
        return lc5.Q(this.a, ncaVar.a) && lc5.Q(this.b, ncaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextContentState(listState=" + this.a + ", pages=" + this.b + ")";
    }
}

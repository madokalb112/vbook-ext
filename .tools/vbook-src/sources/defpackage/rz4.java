package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rz4 {
    public final st5 a;
    public final List b;

    public rz4(st5 st5Var, List list) {
        st5Var.getClass();
        list.getClass();
        this.a = st5Var;
        this.b = list;
    }

    public static rz4 a(st5 st5Var, List list) {
        st5Var.getClass();
        list.getClass();
        return new rz4(st5Var, list);
    }

    public static /* synthetic */ rz4 b(rz4 rz4Var, st5 st5Var, List list, int i) {
        if ((i & 1) != 0) {
            st5Var = rz4Var.a;
        }
        if ((i & 2) != 0) {
            list = rz4Var.b;
        }
        rz4Var.getClass();
        return a(st5Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz4)) {
            return false;
        }
        rz4 rz4Var = (rz4) obj;
        return lc5.Q(this.a, rz4Var.a) && lc5.Q(this.b, rz4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageContentState(listState=" + this.a + ", pages=" + this.b + ")";
    }
}

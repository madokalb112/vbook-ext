package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h95 {
    public final String a;
    public final j95 b;
    public final List c;

    public h95(String str, j95 j95Var, List list) {
        str.getClass();
        j95Var.getClass();
        this.a = str;
        this.b = j95Var;
        this.c = list;
    }

    public static h95 a(h95 h95Var, j95 j95Var, List list, int i) {
        String str = h95Var.a;
        if ((i & 4) != 0) {
            list = h95Var.c;
        }
        h95Var.getClass();
        str.getClass();
        list.getClass();
        return new h95(str, j95Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h95)) {
            return false;
        }
        h95 h95Var = (h95) obj;
        return lc5.Q(this.a, h95Var.a) && this.b == h95Var.b && lc5.Q(this.c, h95Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallSourceState(url=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", extensions=");
        return tw2.t(sb, this.c, ")");
    }

    public /* synthetic */ h95(String str, int i) {
        this((i & 1) != 0 ? "" : str, j95.a, lc3.a);
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class so4 {
    public final int a;
    public final int b;
    public final List c;

    public so4(int i, List list, int i2) {
        list.getClass();
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    public static so4 a(so4 so4Var, int i, int i2, List list, int i3) {
        if ((i3 & 1) != 0) {
            i = so4Var.a;
        }
        if ((i3 & 2) != 0) {
            i2 = so4Var.b;
        }
        so4Var.getClass();
        if ((i3 & 8) != 0) {
            list = so4Var.c;
        }
        so4Var.getClass();
        list.getClass();
        return new so4(i, list, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so4)) {
            return false;
        }
        so4 so4Var = (so4) obj;
        return this.a == so4Var.a && this.b == so4Var.b && lc5.Q(this.c, so4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + tw2.d(0, tw2.d(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return tw2.t(xv5.t(this.a, this.b, "HomeState(filterTab=", ", downloadCount=", ", messageCount=0, tabBookCount="), this.c, ")");
    }
}

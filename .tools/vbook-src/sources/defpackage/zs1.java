package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zs1 {
    public final boolean a;
    public final boolean b;
    public final List c;

    public zs1(boolean z, boolean z2, List list) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = list;
    }

    public static zs1 a(zs1 zs1Var, boolean z, boolean z2, List list, int i) {
        if ((i & 1) != 0) {
            z = zs1Var.a;
        }
        if ((i & 2) != 0) {
            z2 = zs1Var.b;
        }
        if ((i & 4) != 0) {
            list = zs1Var.c;
        }
        zs1Var.getClass();
        list.getClass();
        return new zs1(z, z2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs1)) {
            return false;
        }
        zs1 zs1Var = (zs1) obj;
        return this.a == zs1Var.a && this.b == zs1Var.b && lc5.Q(this.c, zs1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + j39.c(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return tw2.t(j39.r("ContextMenuState(isShowOneLine=", this.a, ", isShowContextHighlight=", this.b, ", contextMenuItems="), this.c, ")");
    }
}

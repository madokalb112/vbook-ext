package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zl4 {
    public final boolean a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final List h;

    public zl4(boolean z, int i, int i2, boolean z2, boolean z3, boolean z4, boolean z5, List list) {
        list.getClass();
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = list;
    }

    public static zl4 a(zl4 zl4Var, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, ArrayList arrayList, int i3) {
        boolean z5 = (i3 & 1) != 0 ? zl4Var.a : false;
        if ((i3 & 2) != 0) {
            i = zl4Var.b;
        }
        if ((i3 & 4) != 0) {
            i2 = zl4Var.c;
        }
        if ((i3 & 8) != 0) {
            z = zl4Var.d;
        }
        if ((i3 & 16) != 0) {
            z2 = zl4Var.e;
        }
        if ((i3 & 32) != 0) {
            z3 = zl4Var.f;
        }
        if ((i3 & 64) != 0) {
            z4 = zl4Var.g;
        }
        List list = arrayList;
        if ((i3 & Token.CASE) != 0) {
            list = zl4Var.h;
        }
        List list2 = list;
        zl4Var.getClass();
        list2.getClass();
        boolean z6 = z4;
        boolean z7 = z3;
        boolean z8 = z2;
        boolean z9 = z;
        return new zl4(z5, i, i2, z9, z8, z7, z6, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl4)) {
            return false;
        }
        zl4 zl4Var = (zl4) obj;
        return this.a == zl4Var.a && this.b == zl4Var.b && this.c == zl4Var.c && this.d == zl4Var.d && this.e == zl4Var.e && this.f == zl4Var.f && this.g == zl4Var.g && lc5.Q(this.h, zl4Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + j39.c(j39.c(j39.c(j39.c(tw2.d(this.c, tw2.d(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryState(isLoading=");
        sb.append(this.a);
        sb.append(", viewType=");
        sb.append(this.b);
        sb.append(", shelfSize=");
        j39.x(sb, this.c, ", isShowReadPercent=", this.d, ", isShowTotalChapter=");
        ky0.D(sb, this.e, ", isShowNewChapter=", this.f, ", isSaveReadHistory=");
        sb.append(this.g);
        sb.append(", sections=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}

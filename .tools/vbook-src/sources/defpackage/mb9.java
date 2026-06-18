package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mb9 {
    public final boolean a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;

    public mb9(boolean z, int i, int i2, boolean z2, boolean z3, boolean z4, List list, List list2, List list3, List list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = list;
        this.h = list2;
        this.i = list3;
        this.j = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb9)) {
            return false;
        }
        mb9 mb9Var = (mb9) obj;
        return this.a == mb9Var.a && this.b == mb9Var.b && this.c == mb9Var.c && this.d == mb9Var.d && this.e == mb9Var.e && this.f == mb9Var.f && lc5.Q(this.g, mb9Var.g) && lc5.Q(this.h, mb9Var.h) && lc5.Q(this.i, mb9Var.i) && lc5.Q(this.j, mb9Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + j39.d(j39.d(j39.d(j39.c(j39.c(j39.c(tw2.d(this.c, tw2.d(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), this.g, 31), this.h, 31), this.i, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShelHomeState(isLoading=");
        sb.append(this.a);
        sb.append(", viewType=");
        sb.append(this.b);
        sb.append(", shelfSize=");
        j39.x(sb, this.c, ", isShowReadPercent=", this.d, ", isShowTotalChapter=");
        ky0.D(sb, this.e, ", isShowNewChapter=", this.f, ", recentReadBooks=");
        sb.append(this.g);
        sb.append(", newAddNotViewBooks=");
        sb.append(this.h);
        sb.append(", newUpdateBooks=");
        sb.append(this.i);
        sb.append(", oftenReadBooks=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}

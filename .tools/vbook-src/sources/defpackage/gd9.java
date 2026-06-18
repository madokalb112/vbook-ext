package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gd9 {
    public final boolean a;
    public final List b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public gd9(boolean z, List list, int i, int i2, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        this.a = z;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd9)) {
            return false;
        }
        gd9 gd9Var = (gd9) obj;
        return this.a == gd9Var.a && lc5.Q(this.b, gd9Var.b) && this.c == gd9Var.c && this.d == gd9Var.d && this.e == gd9Var.e && this.f == gd9Var.f && this.g == gd9Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + j39.c(j39.c(tw2.d(this.d, tw2.d(this.c, j39.d(Boolean.hashCode(this.a) * 31, this.b, 31), 31), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShelfState(isLoading=");
        sb.append(this.a);
        sb.append(", books=");
        sb.append(this.b);
        sb.append(", viewType=");
        ky0.u(this.c, this.d, ", shelfSize=", ", isShowReadPercent=", sb);
        ky0.D(sb, this.e, ", isShowTotalChapter=", this.f, ", isShowNewChapter=");
        return xv5.q(")", sb, this.g);
    }
}

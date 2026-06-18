package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ac9 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public ac9(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public static ac9 a(ac9 ac9Var, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, int i6) {
        if ((i6 & 1) != 0) {
            i = ac9Var.a;
        }
        int i7 = i;
        if ((i6 & 2) != 0) {
            i2 = ac9Var.b;
        }
        int i8 = i2;
        if ((i6 & 4) != 0) {
            i3 = ac9Var.c;
        }
        int i9 = i3;
        if ((i6 & 8) != 0) {
            i4 = ac9Var.d;
        }
        int i10 = i4;
        if ((i6 & 16) != 0) {
            i5 = ac9Var.e;
        }
        int i11 = i5;
        if ((i6 & 32) != 0) {
            z = ac9Var.f;
        }
        boolean z4 = z;
        boolean z5 = (i6 & 64) != 0 ? ac9Var.g : z2;
        boolean z6 = (i6 & Token.CASE) != 0 ? ac9Var.h : z3;
        ac9Var.getClass();
        return new ac9(i7, i8, i9, i10, i11, z4, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac9)) {
            return false;
        }
        ac9 ac9Var = (ac9) obj;
        return this.a == ac9Var.a && this.b == ac9Var.b && this.c == ac9Var.c && this.d == ac9Var.d && this.e == ac9Var.e && this.f == ac9Var.f && this.g == ac9Var.g && this.h == ac9Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + j39.c(j39.c(tw2.d(this.e, tw2.d(this.d, tw2.d(this.c, tw2.d(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbT = xv5.t(this.a, this.b, "ShelfConfig(filterType=", ", viewType=", ", columnSize=");
        ky0.u(this.c, this.d, ", sortBy=", ", sortOrder=", sbT);
        j39.x(sbT, this.e, ", isShowReadPercent=", this.f, ", isShowTotalChapter=");
        sbT.append(this.g);
        sbT.append(", isShowNewChapter=");
        sbT.append(this.h);
        sbT.append(")");
        return sbT.toString();
    }
}

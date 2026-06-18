package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lz5 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final int f;
    public final int g;
    public final boolean h;
    public final String i;
    public final List j;

    public lz5(long j, boolean z, boolean z2, String str, boolean z3, int i, int i2, boolean z4, String str2, List list) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = z3;
        this.f = i;
        this.g = i2;
        this.h = z4;
        this.i = str2;
        this.j = list;
    }

    public static lz5 a(lz5 lz5Var, long j, boolean z, boolean z2, String str, boolean z3, int i, int i2, boolean z4, String str2, List list, int i3) {
        if ((i3 & 1) != 0) {
            j = lz5Var.a;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            z = lz5Var.b;
        }
        boolean z5 = z;
        boolean z6 = (i3 & 4) != 0 ? lz5Var.c : z2;
        String str3 = (i3 & 8) != 0 ? lz5Var.d : str;
        boolean z7 = (i3 & 16) != 0 ? lz5Var.e : z3;
        int i4 = (i3 & 32) != 0 ? lz5Var.f : i;
        int i5 = (i3 & 64) != 0 ? lz5Var.g : i2;
        boolean z8 = (i3 & Token.CASE) != 0 ? lz5Var.h : z4;
        String str4 = (i3 & 256) != 0 ? lz5Var.i : str2;
        List list2 = (i3 & 512) != 0 ? lz5Var.j : list;
        lz5Var.getClass();
        str3.getClass();
        str4.getClass();
        list2.getClass();
        return new lz5(j2, z5, z6, str3, z7, i4, i5, z8, str4, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz5)) {
            return false;
        }
        lz5 lz5Var = (lz5) obj;
        return this.a == lz5Var.a && this.b == lz5Var.b && this.c == lz5Var.c && lc5.Q(this.d, lz5Var.d) && this.e == lz5Var.e && this.f == lz5Var.f && this.g == lz5Var.g && this.h == lz5Var.h && lc5.Q(this.i, lz5Var.i) && lc5.Q(this.j, lz5Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + j39.a(j39.c(tw2.d(this.g, tw2.d(this.f, j39.c(j39.a(j39.c(j39.c(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h), 31, this.i);
    }

    public final String toString() {
        return "ListItemState(lastUpdateTime=" + this.a + ", isLoading=" + this.b + ", hasPageSource=" + this.c + ", pageSource=" + this.d + ", hasMore=" + this.e + ", displayType=" + this.f + ", columnSize=" + this.g + ", isError=" + this.h + ", errorMessage=" + this.i + ", books=" + this.j + ")";
    }

    public /* synthetic */ lz5() {
        this(0L, true, false, "", false, -1, 0, false, "", lc3.a);
    }
}

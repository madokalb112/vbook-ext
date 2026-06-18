package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wq2 {
    public final boolean a;
    public final String b;
    public final String c;
    public final List d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final ho2 i;
    public final boolean j;
    public final String k;
    public final boolean l;
    public final boolean m;

    public wq2(boolean z, String str, String str2, List list, int i, boolean z2, boolean z3, String str3, ho2 ho2Var, boolean z4, String str4, boolean z5, boolean z6) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = i;
        this.f = z2;
        this.g = z3;
        this.h = str3;
        this.i = ho2Var;
        this.j = z4;
        this.k = str4;
        this.l = z5;
        this.m = z6;
    }

    public static wq2 a(wq2 wq2Var, boolean z, String str, String str2, List list, int i, boolean z2, boolean z3, String str3, ho2 ho2Var, boolean z4, String str4, boolean z5, boolean z6, int i2) {
        if ((i2 & 1) != 0) {
            z = wq2Var.a;
        }
        boolean z7 = z;
        String str5 = (i2 & 2) != 0 ? wq2Var.b : str;
        String str6 = (i2 & 4) != 0 ? wq2Var.c : str2;
        List list2 = (i2 & 8) != 0 ? wq2Var.d : list;
        int i3 = (i2 & 16) != 0 ? wq2Var.e : i;
        boolean z8 = (i2 & 32) != 0 ? wq2Var.f : z2;
        boolean z9 = (i2 & 64) != 0 ? wq2Var.g : z3;
        String str7 = (i2 & Token.CASE) != 0 ? wq2Var.h : str3;
        ho2 ho2Var2 = (i2 & 256) != 0 ? wq2Var.i : ho2Var;
        boolean z10 = (i2 & 512) != 0 ? wq2Var.j : z4;
        String str8 = (i2 & 1024) != 0 ? wq2Var.k : str4;
        boolean z11 = (i2 & 2048) != 0 ? wq2Var.l : z5;
        boolean z12 = (i2 & 4096) != 0 ? wq2Var.m : z6;
        wq2Var.getClass();
        str7.getClass();
        str8.getClass();
        return new wq2(z7, str5, str6, list2, i3, z8, z9, str7, ho2Var2, z10, str8, z11, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq2)) {
            return false;
        }
        wq2 wq2Var = (wq2) obj;
        return this.a == wq2Var.a && lc5.Q(this.b, wq2Var.b) && lc5.Q(this.c, wq2Var.c) && lc5.Q(this.d, wq2Var.d) && this.e == wq2Var.e && this.f == wq2Var.f && this.g == wq2Var.g && this.h.equals(wq2Var.h) && lc5.Q(this.i, wq2Var.i) && this.j == wq2Var.j && this.k.equals(wq2Var.k) && this.l == wq2Var.l && this.m == wq2Var.m;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        int iA = j39.a(j39.c(j39.c(tw2.d(this.e, (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31), 31, this.f), 31, this.g), 31, this.h);
        ho2 ho2Var = this.i;
        return Boolean.hashCode(this.m) + j39.c(j39.a(j39.c((iA + (ho2Var != null ? ho2Var.hashCode() : 0)) * 31, 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DetailState(isLoading=");
        sb.append(this.a);
        sb.append(", extensionId=");
        sb.append(this.b);
        sb.append(", lastReadChapter=");
        sb.append(this.c);
        sb.append(", sections=");
        sb.append(this.d);
        sb.append(", chapterCount=");
        j39.x(sb, this.e, ", hasMoreChapter=", this.f, ", isLoadingChapter=");
        sb.append(this.g);
        sb.append(", source=");
        sb.append(this.h);
        sb.append(", detail=");
        sb.append(this.i);
        sb.append(", isError=");
        sb.append(this.j);
        sb.append(", errorMessage=");
        j39.z(sb, this.k, ", isInShelf=", this.l, ", isSupportDownload=");
        return xv5.q(")", sb, this.m);
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ho2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final List o;
    public final List p;
    public final List q;
    public final List r;
    public final List s;

    public ho2(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2, boolean z, boolean z2, List list, List list2, List list3, List list4, List list5) {
        j39.w(str3, str5, str6, str7, str9);
        str10.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = i;
        this.l = i2;
        this.m = z;
        this.n = z2;
        this.o = list;
        this.p = list2;
        this.q = list3;
        this.r = list4;
        this.s = list5;
    }

    public static ho2 a(ho2 ho2Var, String str, String str2, String str3, String str4, String str5, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, int i) {
        String str6 = ho2Var.a;
        String str7 = (i & 2) != 0 ? ho2Var.b : str;
        String str8 = ho2Var.c;
        String str9 = (i & 8) != 0 ? ho2Var.d : str2;
        String str10 = ho2Var.e;
        String str11 = (i & 32) != 0 ? ho2Var.f : str3;
        String str12 = (i & 64) != 0 ? ho2Var.g : str4;
        String str13 = (i & Token.CASE) != 0 ? ho2Var.h : str5;
        String str14 = ho2Var.i;
        String str15 = str7;
        String str16 = str9;
        String str17 = str11;
        String str18 = str12;
        String str19 = str13;
        String str20 = ho2Var.j;
        int i2 = ho2Var.k;
        int i3 = ho2Var.l;
        boolean z = ho2Var.m;
        boolean z2 = ho2Var.n;
        List list = (i & 16384) != 0 ? ho2Var.o : arrayList;
        List list2 = (i & 32768) != 0 ? ho2Var.p : arrayList2;
        List list3 = (i & Parser.ARGC_LIMIT) != 0 ? ho2Var.q : arrayList3;
        List list4 = (i & 131072) != 0 ? ho2Var.r : arrayList4;
        List list5 = (i & 262144) != 0 ? ho2Var.s : arrayList5;
        ho2Var.getClass();
        str8.getClass();
        str16.getClass();
        str10.getClass();
        str17.getClass();
        str18.getClass();
        str14.getClass();
        str20.getClass();
        return new ho2(str6, str15, str8, str16, str10, str17, str18, str19, str14, str20, i2, i3, z, z2, list, list2, list3, list4, list5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho2)) {
            return false;
        }
        ho2 ho2Var = (ho2) obj;
        return this.a.equals(ho2Var.a) && this.b.equals(ho2Var.b) && lc5.Q(this.c, ho2Var.c) && this.d.equals(ho2Var.d) && lc5.Q(this.e, ho2Var.e) && lc5.Q(this.f, ho2Var.f) && lc5.Q(this.g, ho2Var.g) && this.h.equals(ho2Var.h) && lc5.Q(this.i, ho2Var.i) && lc5.Q(this.j, ho2Var.j) && this.k == ho2Var.k && this.l == ho2Var.l && this.m == ho2Var.m && this.n == ho2Var.n && this.o.equals(ho2Var.o) && this.p.equals(ho2Var.p) && this.q.equals(ho2Var.q) && this.r.equals(ho2Var.r) && this.s.equals(ho2Var.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + j39.d(j39.d(j39.d(j39.d(j39.c(j39.c(tw2.d(this.l, tw2.d(this.k, j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31), 31, this.m), 31, this.n), this.o, 31), this.p, 31), this.q, 31), this.r, 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("Detail(rawName=", this.a, ", name=", this.b, ", path=");
        j39.y(sbQ, this.c, ", author=", this.d, ", cover=");
        j39.y(sbQ, this.e, ", detail=", this.f, ", description=");
        j39.y(sbQ, this.g, ", language=", this.h, ", source=");
        j39.y(sbQ, this.i, ", sourceId=", this.j, ", type=");
        ky0.u(this.k, this.l, ", format=", ", ongoing=", sbQ);
        ky0.D(sbQ, this.m, ", isNsfw=", this.n, ", tags=");
        sbQ.append(this.o);
        sbQ.append(", genres=");
        sbQ.append(this.p);
        sbQ.append(", suggestSections=");
        sbQ.append(this.q);
        sbQ.append(", reviewSections=");
        sbQ.append(this.r);
        sbQ.append(", commentSections=");
        return tw2.t(sbQ, this.s, ")");
    }
}

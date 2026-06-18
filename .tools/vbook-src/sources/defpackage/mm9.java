package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mm9 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final List i;
    public final List j;
    public final List k;
    public final List l;
    public final ArrayList m;
    public final int n;
    public final int o;
    public final boolean p;
    public final boolean q;

    public mm9(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, List list3, List list4, ArrayList arrayList, int i, int i2, boolean z, boolean z2) {
        j39.w(str2, str4, str5, str6, str7);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = list;
        this.j = list2;
        this.k = list3;
        this.l = list4;
        this.m = arrayList;
        this.n = i;
        this.o = i2;
        this.p = z;
        this.q = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm9)) {
            return false;
        }
        mm9 mm9Var = (mm9) obj;
        return this.a.equals(mm9Var.a) && lc5.Q(this.b, mm9Var.b) && this.c.equals(mm9Var.c) && lc5.Q(this.d, mm9Var.d) && lc5.Q(this.e, mm9Var.e) && lc5.Q(this.f, mm9Var.f) && lc5.Q(this.g, mm9Var.g) && this.h.equals(mm9Var.h) && this.i.equals(mm9Var.i) && this.j.equals(mm9Var.j) && this.k.equals(mm9Var.k) && this.l.equals(mm9Var.l) && this.m.equals(mm9Var.m) && this.n == mm9Var.n && this.o == mm9Var.o && this.p == mm9Var.p && this.q == mm9Var.q;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + j39.c(j39.c(tw2.d(this.o, tw2.d(this.n, (this.m.hashCode() + j39.d(j39.d(j39.d(j39.d(j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), this.i, 31), this.j, 31), this.k, 31), this.l, 31)) * 31, 31), 31), 31, this.p), 31, this.q);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("SourceDetail(name=", this.a, ", path=", this.b, ", author=");
        j39.y(sbQ, this.c, ", cover=", this.d, ", detail=");
        j39.y(sbQ, this.e, ", description=", this.f, ", extensionId=");
        j39.y(sbQ, this.g, ", locale=", this.h, ", tags=");
        sbQ.append(this.i);
        sbQ.append(", genres=");
        sbQ.append(this.j);
        sbQ.append(", suggests=");
        sbQ.append(this.k);
        sbQ.append(", reviews=");
        sbQ.append(this.l);
        sbQ.append(", comments=");
        sbQ.append(this.m);
        sbQ.append(", type=");
        sbQ.append(this.n);
        sbQ.append(", format=");
        j39.x(sbQ, this.o, ", ongoing=", this.p, ", isNsfw=");
        return xv5.q(", hasTableOfContent=true)", sbQ, this.q);
    }
}

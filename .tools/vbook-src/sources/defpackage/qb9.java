package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qb9 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final String m;
    public final String n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final int s;
    public final int t;
    public final List u;
    public final List v;

    public qb9(boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z3, boolean z4, long j, String str8, String str9, boolean z5, boolean z6, boolean z7, boolean z8, int i, int i2, List list, List list2) {
        j39.w(str, str4, str5, str6, str9);
        list.getClass();
        list2.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = z3;
        this.k = z4;
        this.l = j;
        this.m = str8;
        this.n = str9;
        this.o = z5;
        this.p = z6;
        this.q = z7;
        this.r = z8;
        this.s = i;
        this.t = i2;
        this.u = list;
        this.v = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb9)) {
            return false;
        }
        qb9 qb9Var = (qb9) obj;
        return this.a == qb9Var.a && this.b == qb9Var.b && lc5.Q(this.c, qb9Var.c) && this.d.equals(qb9Var.d) && this.e.equals(qb9Var.e) && lc5.Q(this.f, qb9Var.f) && lc5.Q(this.g, qb9Var.g) && lc5.Q(this.h, qb9Var.h) && this.i.equals(qb9Var.i) && this.j == qb9Var.j && this.k == qb9Var.k && this.l == qb9Var.l && this.m.equals(qb9Var.m) && lc5.Q(this.n, qb9Var.n) && this.o == qb9Var.o && this.p == qb9Var.p && this.q == qb9Var.q && this.r == qb9Var.r && this.s == qb9Var.s && this.t == qb9Var.t && lc5.Q(this.u, qb9Var.u) && lc5.Q(this.v, qb9Var.v);
    }

    public final int hashCode() {
        return this.v.hashCode() + j39.d(tw2.d(this.t, tw2.d(this.s, j39.c(j39.c(j39.c(j39.c(j39.a(j39.a(xv5.b(j39.c(j39.c(j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(j39.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31), 31), this.u, 31);
    }

    public final String toString() {
        StringBuilder sbR = j39.r("ShelfBookDetailState(isLoading=", this.a, ", verified=", this.b, ", bookId=");
        j39.y(sbR, this.c, ", bookName=", this.d, ", bookAuthor=");
        j39.y(sbR, this.e, ", bookCover=", this.f, ", bookPath=");
        j39.y(sbR, this.g, ", bookSource=", this.h, ", sourceId=");
        j39.z(sbR, this.i, ", isFavorite=", this.j, ", isFollow=");
        sbR.append(this.k);
        sbR.append(", lastRead=");
        sbR.append(this.l);
        j39.y(sbR, ", readPercent=", this.m, ", lastReadChapter=", this.n);
        sbR.append(", isBook=");
        sbR.append(this.o);
        sbR.append(", isOffline=");
        sbR.append(this.p);
        sbR.append(", isSupportDownload=");
        sbR.append(this.q);
        sbR.append(", isSupportExport=");
        sbR.append(this.r);
        tw2.v(this.s, this.t, ", status=", ", location=", sbR);
        sbR.append(", categories=");
        sbR.append(this.u);
        sbR.append(", allCategories=");
        sbR.append(this.v);
        sbR.append(")");
        return sbR.toString();
    }
}

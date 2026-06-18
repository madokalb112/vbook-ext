package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zv5 {
    public final boolean A;
    public final Map B;
    public final Map C;
    public final int D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final long I;
    public final String a;
    public final Map b;
    public final Map c;
    public final String d;
    public final int e;
    public final int f;
    public final List g;
    public final String h;
    public final String i;
    public final String j;
    public final Map k;
    public final String l;
    public final String m;
    public final int n;
    public final int o;
    public final boolean p;
    public final String q;
    public final String r;
    public final int s;
    public final double t;
    public final int u;
    public final long v;
    public final long w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public zv5(double d, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, long j2, long j3, long j4, long j5, long j6, long j7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, Map map, Map map2, Map map3, Map map4, Map map5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        str.getClass();
        map.getClass();
        map2.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        map3.getClass();
        str6.getClass();
        str8.getClass();
        str9.getClass();
        map4.getClass();
        map5.getClass();
        this.a = str;
        this.b = map;
        this.c = map2;
        this.d = str2;
        this.e = i;
        this.f = i2;
        this.g = list;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = map3;
        this.l = str6;
        this.m = str7;
        this.n = i3;
        this.o = i4;
        this.p = z;
        this.q = str8;
        this.r = str9;
        this.s = i5;
        this.t = d;
        this.u = i6;
        this.v = j;
        this.w = j2;
        this.x = z2;
        this.y = z3;
        this.z = z4;
        this.A = z5;
        this.B = map4;
        this.C = map5;
        this.D = i7;
        this.E = j3;
        this.F = j4;
        this.G = j5;
        this.H = j6;
        this.I = j7;
    }

    public static zv5 a(zv5 zv5Var, Map map, LinkedHashMap linkedHashMap, List list, LinkedHashMap linkedHashMap2, int i, String str, String str2, int i2, double d, boolean z, boolean z2, int i3) {
        String str3 = zv5Var.a;
        Map map2 = (i3 & 2) != 0 ? zv5Var.b : map;
        Map map3 = (i3 & 4) != 0 ? zv5Var.c : linkedHashMap;
        String str4 = zv5Var.d;
        int i4 = zv5Var.e;
        int i5 = zv5Var.f;
        List list2 = (i3 & 64) != 0 ? zv5Var.g : list;
        String str5 = zv5Var.h;
        String str6 = zv5Var.i;
        String str7 = zv5Var.j;
        Map map4 = (i3 & 1024) != 0 ? zv5Var.k : linkedHashMap2;
        String str8 = zv5Var.l;
        String str9 = zv5Var.m;
        int i6 = zv5Var.n;
        int i7 = (i3 & 16384) != 0 ? zv5Var.o : i;
        boolean z3 = zv5Var.p;
        String str10 = (65536 & i3) != 0 ? zv5Var.q : str;
        String str11 = (131072 & i3) != 0 ? zv5Var.r : str2;
        int i8 = (262144 & i3) != 0 ? zv5Var.s : i2;
        double d2 = (524288 & i3) != 0 ? zv5Var.t : d;
        int i9 = zv5Var.u;
        int i10 = i7;
        long j = zv5Var.v;
        int i11 = i8;
        double d3 = d2;
        long j2 = zv5Var.w;
        boolean z4 = (i3 & 8388608) != 0 ? zv5Var.x : z;
        boolean z5 = zv5Var.y;
        boolean z6 = (i3 & 33554432) != 0 ? zv5Var.z : z2;
        boolean z7 = zv5Var.A;
        Map map5 = zv5Var.B;
        Map map6 = zv5Var.C;
        int i12 = zv5Var.D;
        long j3 = zv5Var.E;
        long j4 = zv5Var.F;
        long j5 = zv5Var.G;
        long j6 = zv5Var.H;
        long j7 = zv5Var.I;
        zv5Var.getClass();
        str3.getClass();
        map2.getClass();
        map3.getClass();
        str4.getClass();
        list2.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        map4.getClass();
        str8.getClass();
        str10.getClass();
        str11.getClass();
        map5.getClass();
        map6.getClass();
        return new zv5(d3, i4, i5, i6, i10, i11, i9, i12, j, j2, j3, j4, j5, j6, j7, str3, str4, str5, str6, str7, str8, str9, str10, str11, list2, map2, map3, map4, map5, map6, z3, z4, z5, z6, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv5)) {
            return false;
        }
        zv5 zv5Var = (zv5) obj;
        return lc5.Q(this.a, zv5Var.a) && lc5.Q(this.b, zv5Var.b) && lc5.Q(this.c, zv5Var.c) && lc5.Q(this.d, zv5Var.d) && this.e == zv5Var.e && this.f == zv5Var.f && lc5.Q(this.g, zv5Var.g) && lc5.Q(this.h, zv5Var.h) && lc5.Q(this.i, zv5Var.i) && lc5.Q(this.j, zv5Var.j) && lc5.Q(this.k, zv5Var.k) && lc5.Q(this.l, zv5Var.l) && this.m.equals(zv5Var.m) && this.n == zv5Var.n && this.o == zv5Var.o && this.p == zv5Var.p && lc5.Q(this.q, zv5Var.q) && lc5.Q(this.r, zv5Var.r) && this.s == zv5Var.s && Double.compare(this.t, zv5Var.t) == 0 && this.u == zv5Var.u && this.v == zv5Var.v && this.w == zv5Var.w && this.x == zv5Var.x && this.y == zv5Var.y && this.z == zv5Var.z && this.A == zv5Var.A && lc5.Q(this.B, zv5Var.B) && lc5.Q(this.C, zv5Var.C) && this.D == zv5Var.D && this.E == zv5Var.E && this.F == zv5Var.F && this.G == zv5Var.G && this.H == zv5Var.H && this.I == zv5Var.I;
    }

    public final int hashCode() {
        return Long.hashCode(this.I) + xv5.b(xv5.b(xv5.b(xv5.b(tw2.d(this.D, j39.b(j39.b(j39.c(j39.c(j39.c(j39.c(xv5.b(xv5.b(tw2.d(this.u, (Double.hashCode(this.t) + tw2.d(this.s, j39.a(j39.a(j39.c(tw2.d(this.o, tw2.d(this.n, j39.a(j39.a(j39.b(j39.a(j39.a(j39.a(j39.d(tw2.d(this.f, tw2.d(this.e, j39.a(j39.b(j39.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), this.g, 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31), 31), 31, this.p), 31, this.q), 31, this.r), 31)) * 31, 31), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31), 31, this.E), 31, this.F), 31, this.G), 31, this.H);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryBook(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", author=");
        sb.append(this.c);
        sb.append(", cover=");
        sb.append(this.d);
        sb.append(", type=");
        ky0.u(this.e, this.f, ", format=", ", categories=", sb);
        sb.append(this.g);
        sb.append(", language=");
        sb.append(this.h);
        sb.append(", pathId=");
        j39.y(sb, this.i, ", path=", this.j, ", description=");
        sb.append(this.k);
        sb.append(", source=");
        sb.append(this.l);
        sb.append(", sourceId=");
        dx1.t(this.n, this.m, ", status=", ", location=", sb);
        j39.x(sb, this.o, ", isNsfw=", this.p, ", lastReadChapterName=");
        j39.y(sb, this.q, ", lastReadChapterId=", this.r, ", lastReadChapterIndex=");
        sb.append(this.s);
        sb.append(", lastReadChapterPercent=");
        sb.append(this.t);
        sb.append(", totalChapter=");
        sb.append(this.u);
        sb.append(", totalReadTime=");
        sb.append(this.v);
        dx1.z(sb, ", totalListenedTime=", this.w, ", isFollow=");
        ky0.D(sb, this.x, ", isFavorite=", this.y, ", isHidden=");
        ky0.D(sb, this.z, ", isPined=", this.A, ", extras=");
        sb.append(this.B);
        sb.append(", translate=");
        sb.append(this.C);
        sb.append(", newUpdateCount=");
        sb.append(this.D);
        sb.append(", readScore=");
        sb.append(this.E);
        dx1.z(sb, ", lastUpdate=", this.F, ", lastRead=");
        sb.append(this.G);
        dx1.z(sb, ", createAt=", this.H, ", updateAt=");
        return xv5.n(this.I, ")", sb);
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class f2a {
    public static final e2a Companion = new e2a();
    public static final dp5[] J;
    public final boolean A;
    public final int B;
    public final Map C;
    public final Map D;
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
    public final String k;
    public final String l;
    public final int m;
    public final int n;
    public final Map o;
    public final boolean p;
    public final String q;
    public final String r;
    public final int s;
    public final float t;
    public final int u;
    public final long v;
    public final long w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        dv9 dv9Var = new dv9(14);
        xu5 xu5Var = xu5.b;
        J = new dp5[]{null, ex1.Z(xu5Var, dv9Var), ex1.Z(xu5Var, new dv9(15)), null, null, null, ex1.Z(xu5Var, new dv9(16)), null, null, null, null, null, null, null, ex1.Z(xu5Var, new dv9(17)), null, null, null, null, null, null, null, null, null, null, null, null, null, ex1.Z(xu5Var, new dv9(18)), ex1.Z(xu5Var, new dv9(19)), null, null, null, null, null};
    }

    public f2a(int i, int i2, String str, Map map, Map map2, String str2, int i3, int i4, List list, String str3, String str4, String str5, String str6, String str7, int i5, int i6, Map map3, boolean z, String str8, String str9, int i7, float f, int i8, long j, long j2, boolean z2, boolean z3, boolean z4, boolean z5, int i9, Map map4, Map map5, long j3, long j4, long j5, long j6, long j7) {
        if ((7 != (i2 & 7)) || (-1 != i)) {
            int[] iArr = {i, i2};
            int[] iArr2 = {-1, 7};
            m39 m39VarE = d2a.a.e();
            m39VarE.getClass();
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 2; i10++) {
                int i11 = iArr2[i10] & (~iArr[i10]);
                if (i11 != 0) {
                    for (int i12 = 0; i12 < 32; i12++) {
                        if ((i11 & 1) != 0) {
                            arrayList.add(m39VarE.g((i10 * 32) + i12));
                        }
                        i11 >>>= 1;
                    }
                }
            }
            throw new kh6(m39VarE.a(), arrayList);
        }
        this.a = str;
        this.b = map;
        this.c = map2;
        this.d = str2;
        this.e = i3;
        this.f = i4;
        this.g = list;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = i5;
        this.n = i6;
        this.o = map3;
        this.p = z;
        this.q = str8;
        this.r = str9;
        this.s = i7;
        this.t = f;
        this.u = i8;
        this.v = j;
        this.w = j2;
        this.x = z2;
        this.y = z3;
        this.z = z4;
        this.A = z5;
        this.B = i9;
        this.C = map4;
        this.D = map5;
        this.E = j3;
        this.F = j4;
        this.G = j5;
        this.H = j6;
        this.I = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2a)) {
            return false;
        }
        f2a f2aVar = (f2a) obj;
        return lc5.Q(this.a, f2aVar.a) && lc5.Q(this.b, f2aVar.b) && lc5.Q(this.c, f2aVar.c) && lc5.Q(this.d, f2aVar.d) && this.e == f2aVar.e && this.f == f2aVar.f && lc5.Q(this.g, f2aVar.g) && lc5.Q(this.h, f2aVar.h) && lc5.Q(this.i, f2aVar.i) && lc5.Q(this.j, f2aVar.j) && lc5.Q(this.k, f2aVar.k) && lc5.Q(this.l, f2aVar.l) && this.m == f2aVar.m && this.n == f2aVar.n && lc5.Q(this.o, f2aVar.o) && this.p == f2aVar.p && lc5.Q(this.q, f2aVar.q) && lc5.Q(this.r, f2aVar.r) && this.s == f2aVar.s && Float.compare(this.t, f2aVar.t) == 0 && this.u == f2aVar.u && this.v == f2aVar.v && this.w == f2aVar.w && this.x == f2aVar.x && this.y == f2aVar.y && this.z == f2aVar.z && this.A == f2aVar.A && this.B == f2aVar.B && lc5.Q(this.C, f2aVar.C) && lc5.Q(this.D, f2aVar.D) && this.E == f2aVar.E && this.F == f2aVar.F && this.G == f2aVar.G && this.H == f2aVar.H && this.I == f2aVar.I;
    }

    public final int hashCode() {
        int iA = j39.a(j39.a(j39.a(j39.a(j39.d(tw2.d(this.f, tw2.d(this.e, j39.a(j39.b(j39.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), this.g, 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
        String str = this.l;
        return Long.hashCode(this.I) + xv5.b(xv5.b(xv5.b(xv5.b(j39.b(j39.b(tw2.d(this.B, j39.c(j39.c(j39.c(j39.c(xv5.b(xv5.b(tw2.d(this.u, tw2.c(this.t, tw2.d(this.s, j39.a(j39.a(j39.c(j39.b(tw2.d(this.n, tw2.d(this.m, (iA + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31), 31), 31), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31), 31, this.C), 31, this.D), 31, this.E), 31, this.F), 31, this.G), 31, this.H);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncBook(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", author=");
        sb.append(this.c);
        sb.append(", cover=");
        sb.append(this.d);
        sb.append(", type=");
        ky0.u(this.e, this.f, ", format=", ", category=", sb);
        sb.append(this.g);
        sb.append(", language=");
        sb.append(this.h);
        sb.append(", pathId=");
        j39.y(sb, this.i, ", path=", this.j, ", source=");
        j39.y(sb, this.k, ", extensionId=", this.l, ", status=");
        ky0.u(this.m, this.n, ", location=", ", description=", sb);
        sb.append(this.o);
        sb.append(", isNsfw=");
        sb.append(this.p);
        sb.append(", lastReadChapterName=");
        j39.y(sb, this.q, ", lastReadChapterId=", this.r, ", lastReadChapterIndex=");
        sb.append(this.s);
        sb.append(", lastReadChapterPercent=");
        sb.append(this.t);
        sb.append(", totalChapter=");
        sb.append(this.u);
        sb.append(", totalReadTime=");
        sb.append(this.v);
        dx1.z(sb, ", totalListenedTime=", this.w, ", follow=");
        ky0.D(sb, this.x, ", favorite=", this.y, ", hidden=");
        ky0.D(sb, this.z, ", pined=", this.A, ", newUpdateCount=");
        sb.append(this.B);
        sb.append(", translate=");
        sb.append(this.C);
        sb.append(", extras=");
        sb.append(this.D);
        sb.append(", readScore=");
        sb.append(this.E);
        dx1.z(sb, ", lastUpdate=", this.F, ", lastRead=");
        sb.append(this.G);
        dx1.z(sb, ", createAt=", this.H, ", updateAt=");
        return xv5.n(this.I, ")", sb);
    }

    public f2a(String str, Map map, Map map2, String str2, int i, int i2, List list, String str3, String str4, String str5, String str6, String str7, int i3, int i4, Map map3, boolean z, String str8, String str9, int i5, float f, int i6, long j, long j2, boolean z2, boolean z3, boolean z4, boolean z5, int i7, Map map4, Map map5, long j3, long j4, long j5, long j6, long j7) {
        str.getClass();
        map.getClass();
        map2.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        map3.getClass();
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
        this.k = str6;
        this.l = str7;
        this.m = i3;
        this.n = i4;
        this.o = map3;
        this.p = z;
        this.q = str8;
        this.r = str9;
        this.s = i5;
        this.t = f;
        this.u = i6;
        this.v = j;
        this.w = j2;
        this.x = z2;
        this.y = z3;
        this.z = z4;
        this.A = z5;
        this.B = i7;
        this.C = map4;
        this.D = map5;
        this.E = j3;
        this.F = j4;
        this.G = j5;
        this.H = j6;
        this.I = j7;
    }
}

package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class t3a {
    public static final s3a Companion = new s3a();
    public static final dp5[] y;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final Map p;
    public final Map q;
    public final Map r;
    public final Map s;
    public final Map t;
    public final long u;
    public final long v;
    public final long w;
    public final long x;

    static {
        dv9 dv9Var = new dv9(21);
        xu5 xu5Var = xu5.b;
        y = new dp5[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ex1.Z(xu5Var, dv9Var), ex1.Z(xu5Var, new dv9(22)), ex1.Z(xu5Var, new dv9(23)), ex1.Z(xu5Var, new dv9(24)), ex1.Z(xu5Var, new dv9(25)), null, null, null, null};
    }

    public t3a(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9, int i2, boolean z, boolean z2, boolean z3, boolean z4, Map map, Map map2, Map map3, Map map4, Map map5, long j, long j2, long j3, long j4) {
        j39.w(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        map5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = i2;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = map;
        this.q = map2;
        this.r = map3;
        this.s = map4;
        this.t = map5;
        this.u = j;
        this.v = j2;
        this.w = j3;
        this.x = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3a)) {
            return false;
        }
        t3a t3aVar = (t3a) obj;
        return lc5.Q(this.a, t3aVar.a) && lc5.Q(this.b, t3aVar.b) && lc5.Q(this.c, t3aVar.c) && this.d == t3aVar.d && lc5.Q(this.e, t3aVar.e) && lc5.Q(this.f, t3aVar.f) && lc5.Q(this.g, t3aVar.g) && lc5.Q(this.h, t3aVar.h) && lc5.Q(this.i, t3aVar.i) && lc5.Q(this.j, t3aVar.j) && this.k == t3aVar.k && this.l == t3aVar.l && this.m == t3aVar.m && this.n == t3aVar.n && this.o == t3aVar.o && lc5.Q(this.p, t3aVar.p) && lc5.Q(this.q, t3aVar.q) && lc5.Q(this.r, t3aVar.r) && lc5.Q(this.s, t3aVar.s) && lc5.Q(this.t, t3aVar.t) && this.u == t3aVar.u && this.v == t3aVar.v && this.w == t3aVar.w && this.x == t3aVar.x;
    }

    public final int hashCode() {
        return Long.hashCode(this.x) + xv5.b(xv5.b(xv5.b(j39.b(j39.b(j39.b(j39.b(j39.b(j39.c(j39.c(j39.c(j39.c(tw2.d(this.k, j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(tw2.d(this.d, j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("SyncExtension(id=", this.a, ", name=", this.b, ", author=");
        dx1.t(this.d, this.c, ", version=", ", source=", sbQ);
        j39.y(sbQ, this.e, ", path=", this.f, ", regex=");
        j39.y(sbQ, this.g, ", icon=", this.h, ", description=");
        j39.y(sbQ, this.i, ", language=", this.j, ", type=");
        j39.x(sbQ, this.k, ", nsfw=", this.l, ", development=");
        ky0.D(sbQ, this.m, ", draft=", this.n, ", encrypt=");
        sbQ.append(this.o);
        sbQ.append(", scriptMetadata=");
        sbQ.append(this.p);
        sbQ.append(", settingMetadata=");
        sbQ.append(this.q);
        sbQ.append(", scriptData=");
        sbQ.append(this.r);
        sbQ.append(", settingData=");
        sbQ.append(this.s);
        sbQ.append(", translateData=");
        sbQ.append(this.t);
        sbQ.append(", pinedAt=");
        sbQ.append(this.u);
        dx1.z(sbQ, ", lastUse=", this.v, ", createAt=");
        sbQ.append(this.w);
        return dx1.l(sbQ, ", updateAt=", this.x, ")");
    }

    public /* synthetic */ t3a(int i, String str, String str2, String str3, int i2, String str4, String str5, String str6, String str7, String str8, String str9, int i3, boolean z, boolean z2, boolean z3, boolean z4, Map map, Map map2, Map map3, Map map4, Map map5, long j, long j2, long j3, long j4) {
        if (16777215 != (i & 16777215)) {
            qu1.w0(i, 16777215, r3a.a.e());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i2;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = i3;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = map;
        this.q = map2;
        this.r = map3;
        this.s = map4;
        this.t = map5;
        this.u = j;
        this.v = j2;
        this.w = j3;
        this.x = j4;
    }
}

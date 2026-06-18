package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vm3 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final ar3 n;
    public final cr3 o;
    public final fn3 p;
    public final Map q;
    public final Map r;
    public final Map s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final long w;
    public final long x;

    public vm3(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, int i2, boolean z, String str9, boolean z2, ar3 ar3Var, cr3 cr3Var, fn3 fn3Var, Map map, Map map2, Map map3, boolean z3, boolean z4, boolean z5, long j, long j2) {
        j39.w(str, str2, str3, str4, str5);
        str6.getClass();
        str9.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = i2;
        this.k = z;
        this.l = str9;
        this.m = z2;
        this.n = ar3Var;
        this.o = cr3Var;
        this.p = fn3Var;
        this.q = map;
        this.r = map2;
        this.s = map3;
        this.t = z3;
        this.u = z4;
        this.v = z5;
        this.w = j;
        this.x = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm3)) {
            return false;
        }
        vm3 vm3Var = (vm3) obj;
        return lc5.Q(this.a, vm3Var.a) && lc5.Q(this.b, vm3Var.b) && lc5.Q(this.c, vm3Var.c) && this.d == vm3Var.d && lc5.Q(this.e, vm3Var.e) && lc5.Q(this.f, vm3Var.f) && lc5.Q(this.g, vm3Var.g) && this.h.equals(vm3Var.h) && this.i.equals(vm3Var.i) && this.j == vm3Var.j && this.k == vm3Var.k && lc5.Q(this.l, vm3Var.l) && this.m == vm3Var.m && this.n.equals(vm3Var.n) && this.o.equals(vm3Var.o) && this.p.equals(vm3Var.p) && lc5.Q(this.q, vm3Var.q) && lc5.Q(this.r, vm3Var.r) && lc5.Q(this.s, vm3Var.s) && this.t == vm3Var.t && this.u == vm3Var.u && this.v == vm3Var.v && this.w == vm3Var.w && this.x == vm3Var.x;
    }

    public final int hashCode() {
        return Long.hashCode(this.x) + xv5.b(j39.c(j39.c(j39.c(j39.c(j39.b(j39.b(j39.b((this.p.hashCode() + ((this.o.a.hashCode() + ((this.n.hashCode() + j39.c(j39.a(j39.c(tw2.d(this.j, j39.a(j39.a(j39.a(j39.a(j39.a(tw2.d(this.d, j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31, this.k), 31, this.l), 31, this.m)) * 31)) * 31)) * 31, 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, true), 31, this.v), 31, this.w);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("Extension(id=", this.a, ", name=", this.b, ", author=");
        dx1.t(this.d, this.c, ", version=", ", source=", sbQ);
        j39.y(sbQ, this.e, ", icon=", this.f, ", description=");
        j39.y(sbQ, this.g, ", language=", this.h, ", country=");
        dx1.t(this.j, this.i, ", type=", ", nsfw=", sbQ);
        sbQ.append(this.k);
        sbQ.append(", path=");
        sbQ.append(this.l);
        sbQ.append(", encrypt=");
        sbQ.append(this.m);
        sbQ.append(", script=");
        sbQ.append(this.n);
        sbQ.append(", setting=");
        sbQ.append(this.o);
        sbQ.append(", connection=");
        sbQ.append(this.p);
        sbQ.append(", scriptData=");
        sbQ.append(this.q);
        sbQ.append(", translateData=");
        sbQ.append(this.r);
        sbQ.append(", settingData=");
        sbQ.append(this.s);
        sbQ.append(", isDevelopment=");
        sbQ.append(this.t);
        sbQ.append(", isDraft=");
        ky0.D(sbQ, this.u, ", isInstalled=true, isPined=", this.v, ", createAt=");
        sbQ.append(this.w);
        return dx1.l(sbQ, ", updateAt=", this.x, ")");
    }
}

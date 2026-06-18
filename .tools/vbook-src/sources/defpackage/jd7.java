package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class jd7 {
    public static final id7 Companion = new id7();
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;
    public final String G;
    public final boolean H;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final boolean n;
    public final int o;
    public final String p;
    public final String q;
    public final boolean r;
    public final long s;
    public final int t;
    public final long u;
    public final int v;
    public final String w;
    public final String x;
    public final String y;
    public final String z;

    public /* synthetic */ jd7(int i, int i2, String str, String str2, String str3, int i3, String str4, String str5, String str6, String str7, long j, String str8, String str9, String str10, String str11, boolean z, int i4, String str12, String str13, boolean z2, long j2, int i5, long j3, int i6, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, boolean z3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i3;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str6;
        }
        if ((i & Token.CASE) == 0) {
            this.h = "";
        } else {
            this.h = str7;
        }
        if ((i & 256) == 0) {
            this.i = 0L;
        } else {
            this.i = j;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str8;
        }
        if ((i & 1024) == 0) {
            this.k = "";
        } else {
            this.k = str9;
        }
        if ((i & 2048) == 0) {
            this.l = "";
        } else {
            this.l = str10;
        }
        if ((i & 4096) == 0) {
            this.m = "";
        } else {
            this.m = str11;
        }
        this.n = (i & 8192) == 0 ? true : z;
        if ((i & 16384) == 0) {
            this.o = 0;
        } else {
            this.o = i4;
        }
        if ((32768 & i) == 0) {
            this.p = "";
        } else {
            this.p = str12;
        }
        if ((65536 & i) == 0) {
            this.q = "";
        } else {
            this.q = str13;
        }
        if ((131072 & i) == 0) {
            this.r = false;
        } else {
            this.r = z2;
        }
        if ((262144 & i) == 0) {
            this.s = 0L;
        } else {
            this.s = j2;
        }
        if ((524288 & i) == 0) {
            this.t = 0;
        } else {
            this.t = i5;
        }
        this.u = (1048576 & i) != 0 ? j3 : 0L;
        if ((2097152 & i) == 0) {
            this.v = 0;
        } else {
            this.v = i6;
        }
        if ((4194304 & i) == 0) {
            this.w = "";
        } else {
            this.w = str14;
        }
        if ((8388608 & i) == 0) {
            this.x = "";
        } else {
            this.x = str15;
        }
        if ((16777216 & i) == 0) {
            this.y = "";
        } else {
            this.y = str16;
        }
        if ((33554432 & i) == 0) {
            this.z = "";
        } else {
            this.z = str17;
        }
        if ((67108864 & i) == 0) {
            this.A = "";
        } else {
            this.A = str18;
        }
        if ((134217728 & i) == 0) {
            this.B = "";
        } else {
            this.B = str19;
        }
        if ((268435456 & i) == 0) {
            this.C = "";
        } else {
            this.C = str20;
        }
        if ((536870912 & i) == 0) {
            this.D = "";
        } else {
            this.D = str21;
        }
        if ((1073741824 & i) == 0) {
            this.E = "";
        } else {
            this.E = str22;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = "";
        } else {
            this.F = str23;
        }
        if ((i2 & 1) == 0) {
            this.G = "";
        } else {
            this.G = str24;
        }
        if ((i2 & 2) == 0) {
            this.H = false;
        } else {
            this.H = z3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd7)) {
            return false;
        }
        jd7 jd7Var = (jd7) obj;
        return lc5.Q(this.a, jd7Var.a) && lc5.Q(this.b, jd7Var.b) && lc5.Q(this.c, jd7Var.c) && this.d == jd7Var.d && lc5.Q(this.e, jd7Var.e) && lc5.Q(this.f, jd7Var.f) && lc5.Q(this.g, jd7Var.g) && lc5.Q(this.h, jd7Var.h) && this.i == jd7Var.i && lc5.Q(this.j, jd7Var.j) && lc5.Q(this.k, jd7Var.k) && lc5.Q(this.l, jd7Var.l) && lc5.Q(this.m, jd7Var.m) && this.n == jd7Var.n && this.o == jd7Var.o && lc5.Q(this.p, jd7Var.p) && lc5.Q(this.q, jd7Var.q) && this.r == jd7Var.r && this.s == jd7Var.s && this.t == jd7Var.t && this.u == jd7Var.u && this.v == jd7Var.v && lc5.Q(this.w, jd7Var.w) && lc5.Q(this.x, jd7Var.x) && lc5.Q(this.y, jd7Var.y) && lc5.Q(this.z, jd7Var.z) && lc5.Q(this.A, jd7Var.A) && lc5.Q(this.B, jd7Var.B) && lc5.Q(this.C, jd7Var.C) && lc5.Q(this.D, jd7Var.D) && lc5.Q(this.E, jd7Var.E) && lc5.Q(this.F, jd7Var.F) && lc5.Q(this.G, jd7Var.G) && this.H == jd7Var.H;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.H) + j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(tw2.d(this.v, xv5.b(tw2.d(this.t, xv5.b(j39.c(j39.a(j39.a(tw2.d(this.o, j39.c(j39.a(j39.a(j39.a(j39.a(xv5.b(j39.a(j39.a(j39.a(j39.a(tw2.d(this.d, j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31), 31, this.u), 31), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31, this.D), 31, this.E), 31, this.F), 31, this.G);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("OldSyncExtension(id=", this.a, ", name=", this.b, ", author=");
        dx1.t(this.d, this.c, ", version=", ", source=", sbQ);
        j39.y(sbQ, this.e, ", icon=", this.f, ", regexp=");
        j39.y(sbQ, this.g, ", description=", this.h, ", lastUpdate=");
        sbQ.append(this.i);
        sbQ.append(", url=");
        sbQ.append(this.j);
        j39.y(sbQ, ", local=", this.k, ", language=", this.l);
        sbQ.append(", type=");
        sbQ.append(this.m);
        sbQ.append(", isEnable=");
        sbQ.append(this.n);
        sbQ.append(", priority=");
        sbQ.append(this.o);
        sbQ.append(", tag=");
        sbQ.append(this.p);
        sbQ.append(", agent=");
        sbQ.append(this.q);
        sbQ.append(", debug=");
        sbQ.append(this.r);
        dx1.z(sbQ, ", lastUse=", this.s, ", searchIndex=");
        sbQ.append(this.t);
        sbQ.append(", delayConnect=");
        sbQ.append(this.u);
        sbQ.append(", numConnect=");
        sbQ.append(this.v);
        sbQ.append(", discovery=");
        sbQ.append(this.w);
        j39.y(sbQ, ", home=", this.x, ", detail=", this.y);
        j39.y(sbQ, ", page=", this.z, ", site=", this.A);
        j39.y(sbQ, ", toc=", this.B, ", chap=", this.C);
        j39.y(sbQ, ", search=", this.D, ", genre=", this.E);
        j39.y(sbQ, ", data=", this.F, ", config=", this.G);
        sbQ.append(", encrypt=");
        sbQ.append(this.H);
        sbQ.append(")");
        return sbQ.toString();
    }
}

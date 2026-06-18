package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class uc7 {
    public static final tc7 Companion = new tc7();
    public final int A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final String E;
    public final boolean F;
    public final boolean G;
    public final String H;
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
    public final float l;
    public final int m;
    public final float n;
    public final String o;
    public final String p;
    public final long q;
    public final long r;
    public final long s;
    public final boolean t;
    public final long u;
    public final long v;
    public final long w;
    public final boolean x;
    public final int y;
    public final int z;

    public /* synthetic */ uc7(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i3, float f, int i4, float f2, String str11, String str12, long j, long j2, long j3, boolean z, long j4, long j5, long j6, boolean z2, int i5, int i6, int i7, boolean z3, boolean z4, boolean z5, String str13, boolean z6, boolean z7, String str14) {
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
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str7;
        }
        if ((i & Token.CASE) == 0) {
            this.h = "";
        } else {
            this.h = str8;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str9;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str10;
        }
        if ((i & 1024) == 0) {
            this.k = 0;
        } else {
            this.k = i3;
        }
        if ((i & 2048) == 0) {
            this.l = 0.0f;
        } else {
            this.l = f;
        }
        if ((i & 4096) == 0) {
            this.m = 0;
        } else {
            this.m = i4;
        }
        if ((i & 8192) == 0) {
            this.n = 0.0f;
        } else {
            this.n = f2;
        }
        if ((i & 16384) == 0) {
            this.o = "";
        } else {
            this.o = str11;
        }
        if ((32768 & i) == 0) {
            this.p = "";
        } else {
            this.p = str12;
        }
        if ((65536 & i) == 0) {
            this.q = 0L;
        } else {
            this.q = j;
        }
        if ((131072 & i) == 0) {
            this.r = 0L;
        } else {
            this.r = j2;
        }
        if ((262144 & i) == 0) {
            this.s = 0L;
        } else {
            this.s = j3;
        }
        if ((524288 & i) == 0) {
            this.t = false;
        } else {
            this.t = z;
        }
        this.u = (1048576 & i) == 0 ? -1L : j4;
        if ((2097152 & i) == 0) {
            this.v = 0L;
        } else {
            this.v = j5;
        }
        this.w = (4194304 & i) != 0 ? j6 : 0L;
        if ((8388608 & i) == 0) {
            this.x = false;
        } else {
            this.x = z2;
        }
        if ((16777216 & i) == 0) {
            this.y = 0;
        } else {
            this.y = i5;
        }
        if ((33554432 & i) == 0) {
            this.z = 0;
        } else {
            this.z = i6;
        }
        if ((67108864 & i) == 0) {
            this.A = 0;
        } else {
            this.A = i7;
        }
        if ((134217728 & i) == 0) {
            this.B = false;
        } else {
            this.B = z3;
        }
        if ((268435456 & i) == 0) {
            this.C = false;
        } else {
            this.C = z4;
        }
        if ((536870912 & i) == 0) {
            this.D = false;
        } else {
            this.D = z5;
        }
        if ((1073741824 & i) == 0) {
            this.E = "";
        } else {
            this.E = str13;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.F = false;
        } else {
            this.F = z6;
        }
        if ((i2 & 1) == 0) {
            this.G = false;
        } else {
            this.G = z7;
        }
        if ((i2 & 2) == 0) {
            this.H = "";
        } else {
            this.H = str14;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc7)) {
            return false;
        }
        uc7 uc7Var = (uc7) obj;
        return lc5.Q(this.a, uc7Var.a) && lc5.Q(this.b, uc7Var.b) && lc5.Q(this.c, uc7Var.c) && lc5.Q(this.d, uc7Var.d) && lc5.Q(this.e, uc7Var.e) && lc5.Q(this.f, uc7Var.f) && lc5.Q(this.g, uc7Var.g) && lc5.Q(this.h, uc7Var.h) && lc5.Q(this.i, uc7Var.i) && lc5.Q(this.j, uc7Var.j) && this.k == uc7Var.k && Float.compare(this.l, uc7Var.l) == 0 && this.m == uc7Var.m && Float.compare(this.n, uc7Var.n) == 0 && lc5.Q(this.o, uc7Var.o) && lc5.Q(this.p, uc7Var.p) && this.q == uc7Var.q && this.r == uc7Var.r && this.s == uc7Var.s && this.t == uc7Var.t && this.u == uc7Var.u && this.v == uc7Var.v && this.w == uc7Var.w && this.x == uc7Var.x && this.y == uc7Var.y && this.z == uc7Var.z && this.A == uc7Var.A && this.B == uc7Var.B && this.C == uc7Var.C && this.D == uc7Var.D && lc5.Q(this.E, uc7Var.E) && this.F == uc7Var.F && this.G == uc7Var.G && lc5.Q(this.H, uc7Var.H);
    }

    public final int hashCode() {
        return this.H.hashCode() + j39.c(j39.c(j39.a(j39.c(j39.c(j39.c(tw2.d(this.A, tw2.d(this.z, tw2.d(this.y, j39.c(xv5.b(xv5.b(xv5.b(j39.c(xv5.b(xv5.b(xv5.b(j39.a(j39.a(tw2.c(this.n, tw2.d(this.m, tw2.c(this.l, tw2.d(this.k, j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31), 31), 31), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31), 31), 31), 31, this.B), 31, this.C), 31, this.D), 31, this.E), 31, this.F), 31, this.G);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("OldSyncBook(id=", this.a, ", extensionId=", this.b, ", name=");
        j39.y(sbQ, this.c, ", author=", this.d, ", nameTrans=");
        j39.y(sbQ, this.e, ", authorTrans=", this.f, ", cover=");
        j39.y(sbQ, this.g, ", path=", this.h, ", referencePath=");
        j39.y(sbQ, this.i, ", bookSource=", this.j, ", location=");
        sbQ.append(this.k);
        sbQ.append(", percent=");
        sbQ.append(this.l);
        sbQ.append(", lastReadIndex=");
        sbQ.append(this.m);
        sbQ.append(", lastReadPosition=");
        sbQ.append(this.n);
        sbQ.append(", lastChapter=");
        j39.y(sbQ, this.o, ", lastChapterTrans=", this.p, ", timestamp=");
        sbQ.append(this.q);
        dx1.z(sbQ, ", totalReadingTime=", this.r, ", totalTtsTime=");
        sbQ.append(this.s);
        sbQ.append(", supportUpdate=");
        sbQ.append(this.t);
        dx1.z(sbQ, ", bookFolder=", this.u, ", lastUpdate=");
        sbQ.append(this.v);
        dx1.z(sbQ, ", lastNewChap=", this.w, ", followNewChap=");
        sbQ.append(this.x);
        sbQ.append(", bookType=");
        sbQ.append(this.y);
        sbQ.append(", bookStatus=");
        ky0.u(this.z, this.A, ", chapterCount=", ", isNew=", sbQ);
        ky0.D(sbQ, this.B, ", isNsfw=", this.C, ", isHideChapterName=");
        sbQ.append(this.D);
        sbQ.append(", tags=");
        sbQ.append(this.E);
        sbQ.append(", enableTrans=");
        ky0.D(sbQ, this.F, ", favorite=", this.G, ", config=");
        return ky0.s(this.H, ")", sbQ);
    }
}

package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39
public final class f1b {
    public static final e1b Companion = new e1b();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final hhb g;
    public final int h;
    public final String i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final long n;
    public final long o;

    public /* synthetic */ f1b(int i, int i2, String str, String str2, String str3, int i3, int i4, hhb hhbVar, int i5, String str4, int i6, boolean z, boolean z2, int i7, long j, long j2) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i3;
        }
        if ((i & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i4;
        }
        if ((i & 64) == 0) {
            this.g = new hhb();
        } else {
            this.g = hhbVar;
        }
        if ((i & Token.CASE) == 0) {
            this.h = 0;
        } else {
            this.h = i5;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str4;
        }
        if ((i & 512) == 0) {
            this.j = 0;
        } else {
            this.j = i6;
        }
        if ((i & 1024) == 0) {
            this.k = false;
        } else {
            this.k = z;
        }
        if ((i & 2048) == 0) {
            this.l = false;
        } else {
            this.l = z2;
        }
        if ((i & 4096) == 0) {
            this.m = 0;
        } else {
            this.m = i7;
        }
        this.n = (i & 8192) == 0 ? -1L : j;
        this.o = (i & 16384) == 0 ? 0L : j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1b)) {
            return false;
        }
        f1b f1bVar = (f1b) obj;
        return this.a == f1bVar.a && lc5.Q(this.b, f1bVar.b) && lc5.Q(this.c, f1bVar.c) && lc5.Q(this.d, f1bVar.d) && this.e == f1bVar.e && this.f == f1bVar.f && lc5.Q(this.g, f1bVar.g) && this.h == f1bVar.h && lc5.Q(this.i, f1bVar.i) && this.j == f1bVar.j && this.k == f1bVar.k && this.l == f1bVar.l && this.m == f1bVar.m && this.n == f1bVar.n && this.o == f1bVar.o;
    }

    public final int hashCode() {
        return Long.hashCode(this.o) + xv5.b(tw2.d(this.m, j39.c(j39.c(tw2.d(this.j, j39.a(tw2.d(this.h, (this.g.hashCode() + tw2.d(this.f, tw2.d(this.e, j39.a(j39.a(j39.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31)) * 31, 31), 31, this.i), 31), 31, this.k), 31, this.l), 31), 31, this.n);
    }

    public final String toString() {
        StringBuilder sbP = j39.p("TopicDto(id=", ", title=", this.b, ", content=", this.a);
        j39.y(sbP, this.c, ", background=", this.d, ", category=");
        ky0.u(this.e, this.f, ", type=", ", user=", sbP);
        sbP.append(this.g);
        sbP.append(", status=");
        sbP.append(this.h);
        sbP.append(", tag=");
        dx1.t(this.j, this.i, ", likes=", ", liked=", sbP);
        ky0.D(sbP, this.k, ", pined=", this.l, ", comments=");
        sbP.append(this.m);
        sbP.append(", updatedAt=");
        sbP.append(this.n);
        return dx1.l(sbP, ", createdAt=", this.o, ")");
    }
}

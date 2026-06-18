package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wk0 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final sgb g;
    public final int h;
    public final List i;
    public final float j;
    public final int k;
    public final boolean l;
    public final int m;
    public final long n;
    public final long o;

    public wk0(int i, String str, String str2, String str3, String str4, String str5, sgb sgbVar, int i2, List list, float f, int i3, boolean z, int i4, long j, long j2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = sgbVar;
        this.h = i2;
        this.i = list;
        this.j = f;
        this.k = i3;
        this.l = z;
        this.m = i4;
        this.n = j;
        this.o = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk0)) {
            return false;
        }
        wk0 wk0Var = (wk0) obj;
        return this.a == wk0Var.a && this.b.equals(wk0Var.b) && this.c.equals(wk0Var.c) && this.d.equals(wk0Var.d) && this.e.equals(wk0Var.e) && this.f.equals(wk0Var.f) && this.g.equals(wk0Var.g) && this.h == wk0Var.h && this.i.equals(wk0Var.i) && Float.compare(this.j, wk0Var.j) == 0 && this.k == wk0Var.k && this.l == wk0Var.l && this.m == wk0Var.m && this.n == wk0Var.n && this.o == wk0Var.o;
    }

    public final int hashCode() {
        return Long.hashCode(this.o) + xv5.b(tw2.d(this.m, j39.c(tw2.d(this.k, tw2.c(this.j, j39.d(tw2.d(this.h, (this.g.hashCode() + j39.a(j39.a(j39.a(j39.a(j39.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31), this.i, 31), 31), 31), 31, this.l), 31), 31, this.n);
    }

    public final String toString() {
        StringBuilder sbP = j39.p("BookTopic(id=", ", name=", this.b, ", cover=", this.a);
        j39.y(sbP, this.c, ", extension=", this.d, ", path=");
        j39.y(sbP, this.e, ", content=", this.f, ", user=");
        sbP.append(this.g);
        sbP.append(", status=");
        sbP.append(this.h);
        sbP.append(", tags=");
        sbP.append(this.i);
        sbP.append(", rate=");
        sbP.append(this.j);
        sbP.append(", likes=");
        j39.x(sbP, this.k, ", liked=", this.l, ", comments=");
        sbP.append(this.m);
        sbP.append(", updatedAt=");
        sbP.append(this.n);
        return dx1.l(sbP, ", createdAt=", this.o, ")");
    }
}

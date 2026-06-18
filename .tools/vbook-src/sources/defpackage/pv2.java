package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pv2 {
    public final int a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final sgb f;
    public final int g;
    public final List h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final long m;
    public final long n;

    public pv2(int i, String str, String str2, List list, String str3, sgb sgbVar, int i2, List list2, int i3, boolean z, boolean z2, int i4, long j, long j2) {
        str.getClass();
        str3.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = str3;
        this.f = sgbVar;
        this.g = i2;
        this.h = list2;
        this.i = i3;
        this.j = z;
        this.k = z2;
        this.l = i4;
        this.m = j;
        this.n = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv2)) {
            return false;
        }
        pv2 pv2Var = (pv2) obj;
        return this.a == pv2Var.a && lc5.Q(this.b, pv2Var.b) && this.c.equals(pv2Var.c) && this.d.equals(pv2Var.d) && lc5.Q(this.e, pv2Var.e) && this.f.equals(pv2Var.f) && this.g == pv2Var.g && this.h.equals(pv2Var.h) && this.i == pv2Var.i && this.j == pv2Var.j && this.k == pv2Var.k && this.l == pv2Var.l && this.m == pv2Var.m && this.n == pv2Var.n;
    }

    public final int hashCode() {
        return Long.hashCode(this.n) + xv5.b(tw2.d(this.l, j39.c(j39.c(tw2.d(this.i, j39.d(tw2.d(this.g, (this.f.hashCode() + j39.a(j39.d(j39.a(j39.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), this.d, 31), 31, this.e)) * 31, 31), this.h, 31), 31), 31, this.j), 31, this.k), 31), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbP = j39.p("DiscussTopic(id=", ", title=", this.b, ", content=", this.a);
        sbP.append(this.c);
        sbP.append(", images=");
        sbP.append(this.d);
        sbP.append(", background=");
        sbP.append(this.e);
        sbP.append(", user=");
        sbP.append(this.f);
        sbP.append(", status=");
        sbP.append(this.g);
        sbP.append(", tags=");
        sbP.append(this.h);
        sbP.append(", likes=");
        j39.x(sbP, this.i, ", liked=", this.j, ", pined=");
        sbP.append(this.k);
        sbP.append(", comments=");
        sbP.append(this.l);
        sbP.append(", updatedAt=");
        sbP.append(this.m);
        return dx1.l(sbP, ", createdAt=", this.n, ")");
    }
}

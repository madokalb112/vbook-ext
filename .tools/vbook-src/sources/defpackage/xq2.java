package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xq2 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final sgb e;
    public final int f;
    public final List g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final long l;
    public final long m;
    public final List n;

    public xq2(int i, String str, int i2, int i3, sgb sgbVar, int i4, List list, int i5, boolean z, boolean z2, int i6, long j, long j2, List list2) {
        str.getClass();
        list2.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = sgbVar;
        this.f = i4;
        this.g = list;
        this.h = i5;
        this.i = z;
        this.j = z2;
        this.k = i6;
        this.l = j;
        this.m = j2;
        this.n = list2;
    }

    public static xq2 a(xq2 xq2Var, int i, boolean z, int i2, int i3) {
        int i4 = xq2Var.a;
        String str = xq2Var.b;
        int i5 = xq2Var.c;
        int i6 = xq2Var.d;
        sgb sgbVar = xq2Var.e;
        int i7 = xq2Var.f;
        List list = xq2Var.g;
        int i8 = (i3 & Token.CASE) != 0 ? xq2Var.h : i;
        boolean z2 = (i3 & 256) != 0 ? xq2Var.i : z;
        boolean z3 = xq2Var.j;
        int i9 = (i3 & 1024) != 0 ? xq2Var.k : i2;
        long j = xq2Var.l;
        long j2 = xq2Var.m;
        int i10 = i9;
        List list2 = xq2Var.n;
        xq2Var.getClass();
        str.getClass();
        list2.getClass();
        return new xq2(i4, str, i5, i6, sgbVar, i7, list, i8, z2, z3, i10, j, j2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq2)) {
            return false;
        }
        xq2 xq2Var = (xq2) obj;
        return this.a == xq2Var.a && lc5.Q(this.b, xq2Var.b) && this.c == xq2Var.c && this.d == xq2Var.d && this.e.equals(xq2Var.e) && this.f == xq2Var.f && this.g.equals(xq2Var.g) && this.h == xq2Var.h && this.i == xq2Var.i && this.j == xq2Var.j && this.k == xq2Var.k && this.l == xq2Var.l && this.m == xq2Var.m && lc5.Q(this.n, xq2Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + xv5.b(xv5.b(tw2.d(this.k, j39.c(j39.c(tw2.d(this.h, j39.d(tw2.d(this.f, (this.e.hashCode() + tw2.d(this.d, tw2.d(this.c, j39.a(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31)) * 31, 31), this.g, 31), 31), 31, this.i), 31, this.j), 31), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbP = j39.p("DetailTopic(id=", ", title=", this.b, ", category=", this.a);
        ky0.u(this.c, this.d, ", type=", ", user=", sbP);
        sbP.append(this.e);
        sbP.append(", status=");
        sbP.append(this.f);
        sbP.append(", tags=");
        sbP.append(this.g);
        sbP.append(", likes=");
        sbP.append(this.h);
        sbP.append(", liked=");
        ky0.D(sbP, this.i, ", pined=", this.j, ", comments=");
        sbP.append(this.k);
        sbP.append(", updatedAt=");
        sbP.append(this.l);
        dx1.z(sbP, ", createdAt=", this.m, ", blocks=");
        return tw2.t(sbP, this.n, ")");
    }
}

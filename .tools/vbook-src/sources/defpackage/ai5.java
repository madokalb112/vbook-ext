package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ai5 {
    public final int a;
    public final dh9 b;
    public final List c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public ai5 h = null;

    public ai5(int i, dh9 dh9Var, List list, int i2, int i3, int i4, String str) {
        this.a = i;
        this.b = dh9Var;
        this.c = list;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai5)) {
            return false;
        }
        ai5 ai5Var = (ai5) obj;
        return this.a == ai5Var.a && this.b.equals(ai5Var.b) && this.c.equals(ai5Var.c) && this.d == ai5Var.d && this.e == ai5Var.e && this.f == ai5Var.f && this.g.equals(ai5Var.g) && lc5.Q(this.h, ai5Var.h);
    }

    public final int hashCode() {
        int iA = j39.a(tw2.d(this.f, tw2.d(this.e, tw2.d(this.d, j39.d((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, this.c, 31), 31), 31), 31), 31, this.g);
        ai5 ai5Var = this.h;
        return iA + (ai5Var == null ? 0 : ai5Var.hashCode());
    }

    public final String toString() {
        ai5 ai5Var = this.h;
        StringBuilder sb = new StringBuilder("KF8Section(index=");
        sb.append(this.a);
        sb.append(", skeleton=");
        sb.append(this.b);
        sb.append(", frags=");
        sb.append(this.c);
        sb.append(", fragEnd=");
        sb.append(this.d);
        sb.append(", length=");
        ky0.u(this.e, this.f, ", totalLength=", ", href=", sb);
        sb.append(this.g);
        sb.append(", next=");
        sb.append(ai5Var);
        sb.append(")");
        return sb.toString();
    }
}

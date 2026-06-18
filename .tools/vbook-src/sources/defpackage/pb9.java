package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pb9 {
    public final m53 a;
    public final String b;
    public final ib4 c;
    public final boolean d;
    public final boolean e;

    public pb9(m53 m53Var, String str, ib4 ib4Var, int i) {
        boolean z = (i & 8) == 0;
        boolean z2 = (i & 16) == 0;
        m53Var.getClass();
        str.getClass();
        ib4Var.getClass();
        this.a = m53Var;
        this.b = str;
        this.c = ib4Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb9)) {
            return false;
        }
        pb9 pb9Var = (pb9) obj;
        return lc5.Q(this.a, pb9Var.a) && lc5.Q(this.b, pb9Var.b) && lc5.Q(this.c, pb9Var.c) && this.d == pb9Var.d && this.e == pb9Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j39.c((this.c.hashCode() + j39.a(this.a.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShelfBookActionItem(icon=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", onClick=");
        sb.append(this.c);
        sb.append(", isPremium=");
        sb.append(this.d);
        sb.append(", isDanger=");
        return xv5.q(")", sb, this.e);
    }
}

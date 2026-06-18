package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c37 {
    public final Object a;
    public final Object b;
    public final Map c;
    public final rj1 d;

    public c37(Object obj, Object obj2, Map map, rj1 rj1Var) {
        this.a = obj;
        this.b = obj2;
        this.c = map;
        this.d = rj1Var;
    }

    public final void a(dd4 dd4Var, int i) {
        int i2;
        dd4Var.h0(295512821);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            this.d.c(this.a, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new sz4(this, i, 5);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c37.class != obj.getClass()) {
            return false;
        }
        c37 c37Var = (c37) obj;
        return lc5.Q(this.a, c37Var.a) && lc5.Q(this.b, c37Var.b) && lc5.Q(this.c, c37Var.c) && this.d == c37Var.d;
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NavEntry(key=" + this.a + ", contentKey=" + this.b + ", metadata=" + this.c + ", content=" + this.d + ')';
    }

    public c37(c37 c37Var, rj1 rj1Var) {
        this(c37Var.a, c37Var.b, c37Var.c, rj1Var);
    }
}

package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sh6 {
    public final em7 a;
    public final xh6 b;
    public final Map c;
    public final xh5 d;

    public sh6(em7 em7Var, xh6 xh6Var, Map map, xh5 xh5Var) {
        this.a = em7Var;
        this.b = xh6Var;
        this.c = map;
        this.d = xh5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh6)) {
            return false;
        }
        sh6 sh6Var = (sh6) obj;
        return this.a.equals(sh6Var.a) && this.b.equals(sh6Var.b) && this.c.equals(sh6Var.c) && lc5.Q(this.d, sh6Var.d);
    }

    public final int hashCode() {
        int iB = j39.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        xh5 xh5Var = this.d;
        return iB + (xh5Var == null ? 0 : xh5Var.hashCode());
    }

    public final String toString() {
        return "MobiEntryHeaders(palmdoc=" + this.a + ", mobi=" + this.b + ", exth=" + this.c + ", kf8=" + this.d + ")";
    }
}

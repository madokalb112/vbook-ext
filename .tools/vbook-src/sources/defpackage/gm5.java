package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gm5 {
    public final vl5 a;
    public final vl5 b;
    public final List c;

    public gm5(vl5 vl5Var, vl5 vl5Var2, List list) {
        list.getClass();
        this.a = vl5Var;
        this.b = vl5Var2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm5)) {
            return false;
        }
        gm5 gm5Var = (gm5) obj;
        return lc5.Q(this.a, gm5Var.a) && lc5.Q(this.b, gm5Var.b) && lc5.Q(this.c, gm5Var.c);
    }

    public final int hashCode() {
        vl5 vl5Var = this.a;
        int iHashCode = (vl5Var == null ? 0 : vl5Var.hashCode()) * 31;
        vl5 vl5Var2 = this.b;
        return this.c.hashCode() + ((iHashCode + (vl5Var2 != null ? vl5Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LanguageState(currentLanguage=");
        sb.append(this.a);
        sb.append(", systemLanguage=");
        sb.append(this.b);
        sb.append(", languages=");
        return tw2.t(sb, this.c, ")");
    }
}

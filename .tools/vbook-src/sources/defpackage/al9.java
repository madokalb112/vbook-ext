package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class al9 {
    public final List a;
    public final List b;
    public final List c;

    public al9(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al9)) {
            return false;
        }
        al9 al9Var = (al9) obj;
        return this.a.equals(al9Var.a) && this.b.equals(al9Var.b) && this.c.equals(al9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + j39.d(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SolidDef(vertices=");
        sb.append(this.a);
        sb.append(", faces=");
        sb.append(this.b);
        sb.append(", edges=");
        return tw2.t(sb, this.c, ")");
    }
}

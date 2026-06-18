package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pz0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final int d;

    public pz0(String str, String str2, ArrayList arrayList, int i) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz0)) {
            return false;
        }
        pz0 pz0Var = (pz0) obj;
        return lc5.Q(this.a, pz0Var.a) && lc5.Q(this.b, pz0Var.b) && this.c.equals(pz0Var.c) && this.d == pz0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + j39.a(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("Category(id=", this.a, ", name=", this.b, ", books=");
        sbQ.append(this.c);
        sbQ.append(", bookCount=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}

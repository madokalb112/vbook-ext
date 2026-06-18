package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qf3 {
    public final String a;
    public final String b;
    public final List c;

    public qf3(String str, String str2, List list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf3)) {
            return false;
        }
        qf3 qf3Var = (qf3) obj;
        return lc5.Q(this.a, qf3Var.a) && lc5.Q(this.b, qf3Var.b) && lc5.Q(this.c, qf3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + j39.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return tw2.t(j39.q("EpubReference(href=", this.a, ", text=", this.b, ", children="), this.c, ")");
    }
}

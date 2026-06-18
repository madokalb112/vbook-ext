package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q87 {
    public final w16 a;
    public final List b;

    public q87(w16 w16Var, List list) {
        w16Var.getClass();
        list.getClass();
        this.a = w16Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q87)) {
            return false;
        }
        q87 q87Var = (q87) obj;
        return lc5.Q(this.a, q87Var.a) && lc5.Q(this.b, q87Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "NotificationSection(date=" + this.a + ", notifications=" + this.b + ")";
    }
}

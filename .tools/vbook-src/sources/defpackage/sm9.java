package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sm9 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final qm9 e;
    public final List f;

    public sm9(String str, String str2, String str3, String str4, qm9 qm9Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = qm9Var;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm9)) {
            return false;
        }
        sm9 sm9Var = (sm9) obj;
        return this.a.equals(sm9Var.a) && this.b.equals(sm9Var.b) && this.c.equals(sm9Var.c) && this.d.equals(sm9Var.d) && lc5.Q(this.e, sm9Var.e) && this.f.equals(sm9Var.f);
    }

    public final int hashCode() {
        int iA = j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        qm9 qm9Var = this.e;
        return this.f.hashCode() + ((iA + (qm9Var == null ? 0 : qm9Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("SourceExploreSection(id=", this.a, ", title=", this.b, ", subtitle=");
        j39.y(sbQ, this.c, ", type=", this.d, ", action=");
        sbQ.append(this.e);
        sbQ.append(", items=");
        sbQ.append(this.f);
        sbQ.append(")");
        return sbQ.toString();
    }
}

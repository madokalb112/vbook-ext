package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rm9 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final qm9 f;

    public rm9(String str, String str2, String str3, String str4, String str5, qm9 qm9Var) {
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = qm9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm9)) {
            return false;
        }
        rm9 rm9Var = (rm9) obj;
        return this.a.equals(rm9Var.a) && this.b.equals(rm9Var.b) && this.c.equals(rm9Var.c) && this.d.equals(rm9Var.d) && lc5.Q(this.e, rm9Var.e) && lc5.Q(this.f, rm9Var.f);
    }

    public final int hashCode() {
        int iA = j39.a(j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        qm9 qm9Var = this.f;
        return iA + (qm9Var == null ? 0 : qm9Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("SourceExploreItem(name=", this.a, ", cover=", this.b, ", description=");
        j39.y(sbQ, this.c, ", tag=", this.d, ", data=");
        sbQ.append(this.e);
        sbQ.append(", action=");
        sbQ.append(this.f);
        sbQ.append(")");
        return sbQ.toString();
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class el3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final wk3 f;

    public el3(String str, String str2, String str3, String str4, String str5, wk3 wk3Var) {
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = wk3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el3)) {
            return false;
        }
        el3 el3Var = (el3) obj;
        return this.a.equals(el3Var.a) && this.b.equals(el3Var.b) && this.c.equals(el3Var.c) && this.d.equals(el3Var.d) && lc5.Q(this.e, el3Var.e) && lc5.Q(this.f, el3Var.f);
    }

    public final int hashCode() {
        int iA = j39.a(j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        wk3 wk3Var = this.f;
        return iA + (wk3Var == null ? 0 : wk3Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("ExploreItem(name=", this.a, ", cover=", this.b, ", description=");
        j39.y(sbQ, this.c, ", tag=", this.d, ", data=");
        sbQ.append(this.e);
        sbQ.append(", action=");
        sbQ.append(this.f);
        sbQ.append(")");
        return sbQ.toString();
    }
}

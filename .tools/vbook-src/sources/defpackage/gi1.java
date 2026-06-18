package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gi1 {
    public final String a;
    public final String b;
    public final String c;
    public final hi1 d;

    public gi1(String str, String str2, String str3, hi1 hi1Var) {
        str.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = hi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi1)) {
            return false;
        }
        gi1 gi1Var = (gi1) obj;
        return lc5.Q(this.a, gi1Var.a) && lc5.Q(this.b, gi1Var.b) && lc5.Q(this.c, gi1Var.c) && this.d == gi1Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + j39.a((iHashCode + (str == null ? 0 : str.hashCode())) * 961, 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("CompletionItem(label=", this.a, ", detail=", this.b, ", documentation=null, insertText=");
        sbQ.append(this.c);
        sbQ.append(", kind=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}

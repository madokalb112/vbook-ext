package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w98 {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public w98(int i, String str, String str2, boolean z) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w98)) {
            return false;
        }
        w98 w98Var = (w98) obj;
        return lc5.Q(this.a, w98Var.a) && lc5.Q(this.b, w98Var.b) && this.c == w98Var.c && this.d == w98Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + tw2.d(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("Word(chinese=", this.a, ", vietnamese=", this.b, ", type=");
        sbQ.append(this.c);
        sbQ.append(", isPriv=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}

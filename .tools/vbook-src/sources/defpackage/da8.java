package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class da8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;

    public da8(String str, String str2, String str3, String str4, int i, int i2) {
        tw2.A(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da8)) {
            return false;
        }
        da8 da8Var = (da8) obj;
        return lc5.Q(this.a, da8Var.a) && lc5.Q(this.b, da8Var.b) && lc5.Q(this.c, da8Var.c) && lc5.Q(this.d, da8Var.d) && this.e == da8Var.e && this.f == da8Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + tw2.d(this.e, j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("QtWord(id=", this.a, ", bookId=", this.b, ", word=");
        j39.y(sbQ, this.c, ", trans=", this.d, ", type=");
        sbQ.append(this.e);
        sbQ.append(", mode=");
        sbQ.append(this.f);
        sbQ.append(")");
        return sbQ.toString();
    }
}

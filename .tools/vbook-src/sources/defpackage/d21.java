package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d21 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public d21(String str, String str2, int i, String str3, boolean z, boolean z2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d21)) {
            return false;
        }
        d21 d21Var = (d21) obj;
        return this.a.equals(d21Var.a) && lc5.Q(this.b, d21Var.b) && this.c == d21Var.c && this.d.equals(d21Var.d) && this.e == d21Var.e && this.f == d21Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j39.c(j39.a(tw2.d(this.c, j39.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("Chapter(name=", this.a, ", path=", this.b, ", type=");
        ky0.w(this.c, ", description=", this.d, ", isLock=", sbQ);
        sbQ.append(this.e);
        sbQ.append(", isPay=");
        sbQ.append(this.f);
        sbQ.append(")");
        return sbQ.toString();
    }
}

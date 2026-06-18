package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ih9 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public ih9(String str, boolean z, String str2, String str3) {
        j39.v(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih9)) {
            return false;
        }
        ih9 ih9Var = (ih9) obj;
        return lc5.Q(this.a, ih9Var.a) && lc5.Q(this.b, ih9Var.b) && lc5.Q(this.c, ih9Var.c) && this.d == ih9Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("SkipWordRule(id=", this.a, ", word=", this.b, ", replace=");
        sbQ.append(this.c);
        sbQ.append(", ignoreCase=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}

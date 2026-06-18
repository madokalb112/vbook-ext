package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yy2 {
    public final String a;
    public final String b;
    public final int c;

    public yy2(String str, String str2, int i) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy2)) {
            return false;
        }
        yy2 yy2Var = (yy2) obj;
        return lc5.Q(this.a, yy2Var.a) && this.b.equals(yy2Var.b) && this.c == yy2Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + j39.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return tw2.q(j39.q("DocxTocItem(title=", this.a, ", href=", this.b, ", level="), this.c, ")");
    }
}

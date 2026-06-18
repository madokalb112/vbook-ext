package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wy2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public wy2(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy2)) {
            return false;
        }
        wy2 wy2Var = (wy2) obj;
        return lc5.Q(this.a, wy2Var.a) && lc5.Q(this.b, wy2Var.b) && lc5.Q(this.c, wy2Var.c) && lc5.Q(this.d, wy2Var.d) && lc5.Q(this.e, wy2Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j39.a(j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = j39.q("DocxMetadata(title=", this.a, ", creator=", this.b, ", subject=");
        j39.y(sbQ, this.c, ", description=", this.d, ", lastModifiedBy=");
        return ky0.s(this.e, ")", sbQ);
    }

    public /* synthetic */ wy2() {
        this("", "", "", "", "");
    }
}

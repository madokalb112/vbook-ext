package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qm9 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public qm9(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm9)) {
            return false;
        }
        qm9 qm9Var = (qm9) obj;
        return this.a.equals(qm9Var.a) && this.b.equals(qm9Var.b) && this.c.equals(qm9Var.c) && this.d.equals(qm9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j39.a(j39.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return tw2.s(j39.q("SourceExploreAction(type=", this.a, ", script=", this.b, ", input="), this.c, ", data=", this.d, ")");
    }
}

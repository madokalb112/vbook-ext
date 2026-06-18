package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j00 {
    public final String a;
    public final bbb b;

    public j00(String str, bbb bbbVar) {
        this.a = str;
        this.b = bbbVar;
        if (bw9.a0(str)) {
            gp.l("Name can't be blank");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j00)) {
            return false;
        }
        j00 j00Var = (j00) obj;
        return this.a.equals(j00Var.a) && this.b.equals(j00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AttributeKey: ".concat(this.a);
    }
}

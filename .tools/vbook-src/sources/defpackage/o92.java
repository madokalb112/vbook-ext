package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o92 {
    public final String a;
    public final String b;
    public final long c;

    public o92(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o92)) {
            return false;
        }
        o92 o92Var = (o92) obj;
        return lc5.Q(this.a, o92Var.a) && lc5.Q(this.b, o92Var.b) && this.c == o92Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + j39.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return xv5.n(this.c, ")", j39.q("DbCategory(id=", this.a, ", name=", this.b, ", createAt="));
    }
}

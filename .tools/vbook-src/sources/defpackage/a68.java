package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a68 {
    public final int a;
    public final int b;
    public final Integer c;
    public final Integer d;

    public a68(int i, int i2, Integer num, Integer num2) {
        this.a = i;
        this.b = i2;
        this.c = num;
        this.d = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a68)) {
            return false;
        }
        a68 a68Var = (a68) obj;
        return this.a == a68Var.a && this.b == a68Var.b && lc5.Q(this.c, a68Var.c) && lc5.Q(this.d, a68Var.d);
    }

    public final int hashCode() {
        int iD = tw2.d(this.b, Integer.hashCode(this.a) * 31, 31);
        Integer num = this.c;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbT = xv5.t(this.a, this.b, "Ptagx(tag=", ", tagValueCount=", ", valueCount=");
        sbT.append(this.c);
        sbT.append(", valueBytes=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}

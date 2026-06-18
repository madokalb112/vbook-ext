package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y55 implements xv1 {
    public Boolean a;
    public Integer b;
    public Integer c;
    public Integer d;

    public y55(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.a = bool;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    public final Object c() {
        return new y55(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y55)) {
            return false;
        }
        y55 y55Var = (y55) obj;
        return lc5.Q(this.a, y55Var.a) && lc5.Q(this.b, y55Var.b) && lc5.Q(this.c, y55Var.c) && lc5.Q(this.d, y55Var.d);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        Integer num = this.b;
        int iHashCode2 = iHashCode + (num != null ? num.hashCode() : 0);
        Integer num2 = this.c;
        int iHashCode3 = iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        Integer num3 = this.d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Boolean bool = this.a;
        sb.append(bool != null ? bool.booleanValue() ? "-" : "+" : " ");
        Object obj = this.b;
        if (obj == null) {
            obj = "??";
        }
        sb.append(obj);
        sb.append(':');
        Object obj2 = this.c;
        if (obj2 == null) {
            obj2 = "??";
        }
        sb.append(obj2);
        sb.append(':');
        Integer num = this.d;
        sb.append(num != null ? num : "??");
        return sb.toString();
    }
}

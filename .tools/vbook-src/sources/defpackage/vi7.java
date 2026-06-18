package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vi7 {
    public final long a;
    public final rj7 b;

    public vi7() {
        long jL = ah1.l(4284900966L);
        rj7 rj7VarO = gjb.o(3, 0.0f);
        this.a = jL;
        this.b = rj7VarO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!vi7.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        vi7 vi7Var = (vi7) obj;
        return lc1.d(this.a, vi7Var.a) && lc5.Q(this.b, vi7Var.b);
    }

    public final int hashCode() {
        int i = lc1.k;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        xv5.x(this.a, ", drawPadding=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ra6 {
    public final pn2 a;
    public final kk b;
    public final float c;
    public final float d;

    public ra6(pn2 pn2Var, kk kkVar, float f, float f2) {
        pn2Var.getClass();
        kkVar.getClass();
        this.a = pn2Var;
        this.b = kkVar;
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra6)) {
            return false;
        }
        ra6 ra6Var = (ra6) obj;
        return lc5.Q(this.a, ra6Var.a) && lc5.Q(this.b, ra6Var.b) && x13.c(this.c, ra6Var.c) && x13.c(this.d, ra6Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + tw2.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        String strD = x13.d(this.c);
        String strD2 = x13.d(this.d);
        StringBuilder sb = new StringBuilder("MeasurerFrameSize(density=");
        sb.append(this.a);
        sb.append(", textMeasurer=");
        sb.append(this.b);
        sb.append(", width=");
        return tw2.s(sb, strD, ", height=", strD2, ")");
    }
}

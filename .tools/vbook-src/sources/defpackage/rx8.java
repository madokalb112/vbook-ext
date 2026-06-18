package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rx8 {
    public final int a;
    public final float b;
    public final t89 c;
    public final float d;
    public final long e;
    public final sx8 f;
    public final tx8 g;

    public rx8(int i, float f, t89 t89Var, float f2, long j, sx8 sx8Var, tx8 tx8Var) {
        t89Var.getClass();
        tx8Var.getClass();
        this.a = i;
        this.b = f;
        this.c = t89Var;
        this.d = f2;
        this.e = j;
        this.f = sx8Var;
        this.g = tx8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx8)) {
            return false;
        }
        rx8 rx8Var = (rx8) obj;
        return this.a == rx8Var.a && x13.c(this.b, rx8Var.b) && lc5.Q(this.c, rx8Var.c) && x13.c(this.d, rx8Var.d) && lc1.d(this.e, rx8Var.e) && this.f == rx8Var.f && this.g == rx8Var.g;
    }

    public final int hashCode() {
        int iC = tw2.c(this.d, (this.c.hashCode() + tw2.c(this.b, tw2.d(this.a, Integer.hashCode(500) * 31, 31), 31)) * 31, 31);
        int i = lc1.k;
        return this.g.hashCode() + ((this.f.hashCode() + xv5.b(iC, 31, this.e)) * 31);
    }

    public final String toString() {
        String strD = x13.d(this.b);
        String strD2 = x13.d(this.d);
        String strJ = lc1.j(this.e);
        StringBuilder sbP = j39.p("ScrollbarLayoutSettings(durationAnimationMillis=500, hideDelayMillis=", ", scrollbarPadding=", strD, ", thumbShape=", this.a);
        sbP.append(this.c);
        sbP.append(", thumbThickness=");
        sbP.append(strD2);
        sbP.append(", thumbColor=");
        sbP.append(strJ);
        sbP.append(", side=");
        sbP.append(this.f);
        sbP.append(", selectionActionable=");
        sbP.append(this.g);
        sbP.append(")");
        return sbP.toString();
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x38 {
    public static final x38 d = new x38(0.0f, new bb1(0.0f, 0.0f), 0);
    public final float a;
    public final bb1 b;
    public final int c;

    public x38(float f, bb1 bb1Var, int i) {
        this.a = f;
        this.b = bb1Var;
        this.c = i;
        if (Float.isNaN(f)) {
            gp.l("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x38)) {
            return false;
        }
        x38 x38Var = (x38) obj;
        return this.a == x38Var.a && lc5.Q(this.b, x38Var.b) && this.c == x38Var.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append(this.b);
        sb.append(", steps=");
        return tw2.p(sb, this.c, ')');
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nm7 {
    public final br9 a;
    public final br9 b;

    public nm7(ym7 ym7Var, ym7 ym7Var2) {
        ym7Var.getClass();
        ym7Var2.getClass();
        this.a = ym7Var;
        this.b = ym7Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm7)) {
            return false;
        }
        nm7 nm7Var = (nm7) obj;
        return lc5.Q(this.a, nm7Var.a) && lc5.Q(this.b, nm7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ParallaxState(tiltX=" + this.a + ", tiltY=" + this.b + ")";
    }
}

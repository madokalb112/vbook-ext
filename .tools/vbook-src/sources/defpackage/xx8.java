package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xx8 {
    public static final xx8 e = new xx8(vx8.b, 0.0f, um1.K, new wx8(1, null));
    public final vx8 a;
    public final float b;
    public final ib4 c;
    public final kb4 d;

    public xx8(vx8 vx8Var, float f, ib4 ib4Var, kb4 kb4Var) {
        this.a = vx8Var;
        this.b = f;
        this.c = ib4Var;
        this.d = kb4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx8)) {
            return false;
        }
        xx8 xx8Var = (xx8) obj;
        return this.a == xx8Var.a && Float.compare(this.b, xx8Var.b) == 0 && this.c.equals(xx8Var.c) && this.d.equals(xx8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + tw2.c(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "ScrollInfo(direction=" + this.a + ", speedMultiplier=" + this.b + ", maxScrollDistanceProvider=" + this.c + ", onScroll=" + this.d + ')';
    }
}

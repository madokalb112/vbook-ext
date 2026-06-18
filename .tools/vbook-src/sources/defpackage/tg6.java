package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tg6 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public tg6(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg6)) {
            return false;
        }
        tg6 tg6Var = (tg6) obj;
        return Float.compare(this.a, tg6Var.a) == 0 && Float.compare(this.b, tg6Var.b) == 0 && Float.compare(this.c, tg6Var.c) == 0 && Float.compare(this.d, tg6Var.d) == 0 && Float.compare(this.e, tg6Var.e) == 0 && Float.compare(4.0f, 4.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(4.0f) + tw2.c(this.e, tw2.c(this.d, tw2.c(this.c, tw2.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "MeteorState(startX=" + this.a + ", startY=" + this.b + ", angle=" + this.c + ", length=" + this.d + ", depth=" + this.e + ", thickness=4.0)";
    }
}

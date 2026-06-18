package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lo8 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;
    public final List g;
    public final float h;

    public lo8(float f, float f2, float f3, float f4, int i, int i2, List list, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = i;
        this.f = i2;
        this.g = list;
        this.h = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo8)) {
            return false;
        }
        lo8 lo8Var = (lo8) obj;
        return Float.compare(this.a, lo8Var.a) == 0 && Float.compare(this.b, lo8Var.b) == 0 && Float.compare(this.c, lo8Var.c) == 0 && Float.compare(this.d, lo8Var.d) == 0 && this.e == lo8Var.e && this.f == lo8Var.f && this.g.equals(lo8Var.g) && Float.compare(this.h, lo8Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + j39.d(tw2.d(this.f, tw2.d(this.e, tw2.c(this.d, tw2.c(this.c, tw2.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RingConfig(startX=");
        sb.append(this.a);
        sb.append(", startY=");
        sb.append(this.b);
        sb.append(", endX=");
        sb.append(this.c);
        sb.append(", endY=");
        sb.append(this.d);
        sb.append(", durationX=");
        ky0.u(this.e, this.f, ", durationY=", ", radii=", sb);
        sb.append(this.g);
        sb.append(", depth=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yk9 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final blb i;
    public final bl9 j;
    public final float k;
    public final float l;
    public final int m;

    public yk9(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, blb blbVar, bl9 bl9Var, float f9, float f10, int i) {
        bl9Var.getClass();
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = blbVar;
        this.j = bl9Var;
        this.k = f9;
        this.l = f10;
        this.m = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk9)) {
            return false;
        }
        yk9 yk9Var = (yk9) obj;
        return Float.compare(this.a, yk9Var.a) == 0 && Float.compare(this.b, yk9Var.b) == 0 && Float.compare(this.c, yk9Var.c) == 0 && Float.compare(this.d, yk9Var.d) == 0 && Float.compare(this.e, yk9Var.e) == 0 && Float.compare(this.f, yk9Var.f) == 0 && Float.compare(this.g, yk9Var.g) == 0 && Float.compare(this.h, yk9Var.h) == 0 && this.i.equals(yk9Var.i) && this.j == yk9Var.j && Float.compare(this.k, yk9Var.k) == 0 && Float.compare(this.l, yk9Var.l) == 0 && this.m == yk9Var.m;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m) + tw2.c(this.l, tw2.c(this.k, (this.j.hashCode() + ((this.i.hashCode() + tw2.c(this.h, tw2.c(this.g, tw2.c(this.f, tw2.c(this.e, tw2.c(this.d, tw2.c(this.c, tw2.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SolidConfig(cx=");
        sb.append(this.a);
        sb.append(", cy=");
        sb.append(this.b);
        sb.append(", fx1=");
        sb.append(this.c);
        sb.append(", fx2=");
        sb.append(this.d);
        sb.append(", fy1=");
        sb.append(this.e);
        sb.append(", fy2=");
        sb.append(this.f);
        sb.append(", ampX=");
        sb.append(this.g);
        sb.append(", ampY=");
        sb.append(this.h);
        sb.append(", rotSpeeds=");
        sb.append(this.i);
        sb.append(", solidType=");
        sb.append(this.j);
        sb.append(", depth=");
        sb.append(this.k);
        sb.append(", scale=");
        sb.append(this.l);
        sb.append(", colorIdx=");
        return tw2.q(sb, this.m, ")");
    }
}

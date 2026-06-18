package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class p89 extends tu6 {
    public final float b;
    public final t89 c;
    public final boolean d;
    public final long e;
    public final long f;

    public p89(float f, t89 t89Var, boolean z, long j, long j2) {
        this.b = f;
        this.c = t89Var;
        this.d = z;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p89)) {
            return false;
        }
        p89 p89Var = (p89) obj;
        return x13.c(this.b, p89Var.b) && lc5.Q(this.c, p89Var.c) && this.d == p89Var.d && lc1.d(this.e, p89Var.e) && lc1.d(this.f, p89Var.f);
    }

    public final nu6 f() {
        return new ih0(new ej8(this, 4));
    }

    public final int hashCode() {
        int iC = j39.c((this.c.hashCode() + (Float.hashCode(this.b) * 31)) * 31, 31, this.d);
        int i = lc1.k;
        return Long.hashCode(this.f) + xv5.b(iC, 31, this.e);
    }

    public final void i(e95 e95Var) {
        jc1 jc1Var = e95Var.b;
        jc1Var.c(new x13(this.b), "elevation");
        jc1Var.c(this.c, "shape");
        jc1Var.c(Boolean.valueOf(this.d), "clip");
        jc1Var.c(new lc1(this.e), "ambientColor");
        jc1Var.c(new lc1(this.f), "spotColor");
    }

    public final void j(nu6 nu6Var) {
        ih0 ih0Var = (ih0) nu6Var;
        ej8 ej8Var = new ej8(this, 4);
        ih0Var.A = ej8Var;
        pu1.z0(ih0Var, ej8Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) x13.d(this.b));
        sb.append(", shape=");
        sb.append(this.c);
        sb.append(", clip=");
        sb.append(this.d);
        sb.append(", ambientColor=");
        xv5.x(this.e, ", spotColor=", sb);
        sb.append((Object) lc1.j(this.f));
        sb.append(')');
        return sb.toString();
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class lj7 extends tu6 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final kb4 f;

    public lj7(float f, float f2, float f3, float f4, kb4 kb4Var) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = kb4Var;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            o75.a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        lj7 lj7Var = obj instanceof lj7 ? (lj7) obj : null;
        return lj7Var != null && x13.c(this.b, lj7Var.b) && x13.c(this.c, lj7Var.c) && x13.c(this.d, lj7Var.d) && x13.c(this.e, lj7Var.e);
    }

    public final nu6 f() {
        oj7 oj7Var = new oj7();
        oj7Var.A = this.b;
        oj7Var.B = this.c;
        oj7Var.C = this.d;
        oj7Var.D = this.e;
        oj7Var.E = true;
        return oj7Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + tw2.c(this.e, tw2.c(this.d, tw2.c(this.c, Float.hashCode(this.b) * 31, 31), 31), 31);
    }

    public final void i(e95 e95Var) {
        this.f.invoke(e95Var);
    }

    public final void j(nu6 nu6Var) {
        oj7 oj7Var = (oj7) nu6Var;
        oj7Var.A = this.b;
        oj7Var.B = this.c;
        oj7Var.C = this.d;
        oj7Var.D = this.e;
        oj7Var.E = true;
    }
}

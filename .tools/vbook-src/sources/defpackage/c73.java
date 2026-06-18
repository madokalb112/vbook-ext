package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c73 {
    public final cn7 a;
    public final cn7 b;
    public final cn7 c;
    public final cn7 d;
    public final cn7 e;
    public final cn7 f;
    public final cn7 g;
    public final cn7 h;
    public final cn7 i;
    public final cn7 j;
    public final cn7 k;

    public c73(long j, xr xrVar, boolean z, boolean z2, boolean z3, boolean z4, cm7 cm7Var, double d, float f, float f2, c64 c64Var) {
        xrVar.getClass();
        cm7Var.getClass();
        c64Var.getClass();
        this.a = dk9.x(new lc1(j));
        this.b = dk9.x(xrVar);
        this.c = dk9.x(Boolean.valueOf(z));
        this.d = dk9.x(Boolean.valueOf(z2));
        this.e = dk9.x(Boolean.valueOf(z3));
        this.f = dk9.x(Boolean.valueOf(z4));
        this.g = dk9.x(c64Var);
        this.h = dk9.x(Float.valueOf(f));
        this.i = dk9.x(Float.valueOf(f2));
        this.j = dk9.x(cm7Var);
        this.k = dk9.x(Double.valueOf(d));
    }

    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    public c73(long j, boolean z, boolean z2, boolean z3, boolean z4, cm7 cm7Var, float f, float f2, c64 c64Var) {
        this(j, xr.c, z, z2, z3, z4, cm7Var, 0.0d, f, f2, c64Var);
    }
}

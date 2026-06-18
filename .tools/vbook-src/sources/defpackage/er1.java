package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class er1 extends nu6 implements rm1, na6 {
    public lh7 A;
    public final gy8 B;
    public boolean C;
    public ro0 D;
    public final gx8 E;
    public boolean G;
    public boolean I;
    public final ho0 F = new ho0(0);
    public long H = -1;

    public er1(lh7 lh7Var, gy8 gy8Var, boolean z, ro0 ro0Var, gx8 gx8Var) {
        this.A = lh7Var;
        this.B = gy8Var;
        this.C = z;
        this.D = ro0Var;
        this.E = gx8Var;
    }

    public static final float e1(er1 er1Var, ro0 ro0Var, long j) {
        float f;
        kf8 kf8Var;
        int iCompare;
        long j2 = er1Var.H;
        g07 g07Var = er1Var.F.a;
        int i = g07Var.c - 1;
        Object[] objArr = g07Var.a;
        if (i < objArr.length) {
            kf8Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                kf8 kf8Var2 = (kf8) ((dr1) objArr[i]).a.invoke();
                if (kf8Var2 != null) {
                    long jF = kf8Var2.f();
                    long jL0 = sw1.l0(er1Var.f1());
                    f = 0.0f;
                    int iOrdinal = er1Var.A.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jF & 4294967295L)), Float.intBitsToFloat((int) (jL0 & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            mn5.g();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jF >> 32)), Float.intBitsToFloat((int) (jL0 >> 32)));
                    }
                    if (iCompare <= 0) {
                        kf8Var = kf8Var2;
                    } else if (kf8Var == null) {
                        kf8Var = kf8Var2;
                    }
                }
                i--;
            }
        } else {
            f = 0.0f;
            kf8Var = null;
        }
        if (kf8Var == null) {
            kf8 kf8Var3 = er1Var.G ? (kf8) er1Var.E.invoke() : null;
            if (kf8Var3 == null) {
                return f;
            }
            kf8Var = kf8Var3;
        }
        long jL02 = sw1.l0(j2);
        int iOrdinal2 = er1Var.A.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = kf8Var.b;
            return ro0Var.a(f2 - ((int) (j & 4294967295L)), kf8Var.d - f2, Float.intBitsToFloat((int) (jL02 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = kf8Var.a;
            return ro0Var.a(f3 - ((int) (j >> 32)), kf8Var.c - f3, Float.intBitsToFloat((int) (jL02 >> 32)));
        }
        mn5.g();
        return f;
    }

    public static boolean g1(er1 er1Var, kf8 kf8Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = er1Var.f1();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jI1 = er1Var.i1(j3, j2, kf8Var);
        return Math.abs(Float.intBitsToFloat((int) (jI1 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jI1 & 4294967295L))) <= 0.5f;
    }

    public final boolean T0() {
        return false;
    }

    public final void a(long j) {
        int iV;
        long jF1 = f1();
        this.H = j;
        int iOrdinal = this.A.ordinal();
        if (iOrdinal == 0) {
            iV = lc5.V((int) (j & 4294967295L), (int) (jF1 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                mn5.g();
                return;
            }
            iV = lc5.V((int) (j >> 32), (int) (jF1 >> 32));
        }
        if (iV >= 0) {
            return;
        }
        long j2 = !this.C ? this.A == lh7.a ? ((long) (((int) (jF1 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jF1 >> 32)) - ((int) (j >> 32)))) << 32 : 0L;
        kf8 kf8Var = (kf8) this.E.invoke();
        if (kf8Var == null || this.I || this.G || !g1(this, kf8Var, jF1, 0L, 2) || g1(this, kf8Var, 0L, j2, 1)) {
            return;
        }
        this.G = true;
        h1(j2);
    }

    public final long f1() {
        long j = this.H;
        if (na5.b(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void h1(long j) {
        ro0 ro0Var = this.D;
        if (ro0Var == null) {
            ro0Var = (ro0) md2.y(this, to0.a);
        }
        ro0 ro0Var2 = ro0Var;
        if (this.I) {
            t75.c("launchAnimation called when previous animation was running");
        }
        ro0 ro0Var3 = this.D;
        if (ro0Var3 == null) {
            ro0Var3 = (ro0) md2.y(this, to0.a);
        }
        ro0Var3.getClass();
        ro0.a.getClass();
        sfb sfbVar = new sfb(qo0.b);
        ah1.J(S0(), null, zx1.d, new y61(this, sfbVar, ro0Var2, j, (jt1) null), 1);
    }

    public final long i1(long j, long j2, kf8 kf8Var) {
        long jL0 = sw1.l0(j);
        int iOrdinal = this.A.ordinal();
        if (iOrdinal == 0) {
            ro0 ro0Var = this.D;
            if (ro0Var == null) {
                ro0Var = (ro0) md2.y(this, to0.a);
            }
            float f = kf8Var.b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(ro0Var.a(f - ((int) (j2 & 4294967295L)), kf8Var.d - f, Float.intBitsToFloat((int) (jL0 & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            mn5.g();
            return 0L;
        }
        ro0 ro0Var2 = this.D;
        if (ro0Var2 == null) {
            ro0Var2 = (ro0) md2.y(this, to0.a);
        }
        float f2 = kf8Var.a;
        return (((long) Float.floatToRawIntBits(ro0Var2.a(f2 - ((int) (j2 >> 32)), kf8Var.c - f2, Float.intBitsToFloat((int) (jL0 >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }
}

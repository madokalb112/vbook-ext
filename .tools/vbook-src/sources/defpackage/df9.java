package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class df9 extends kp4 {
    public int y;
    public int z;

    public static final void t(df9 df9Var, float f, float f2) {
        df9Var.y = f <= ((float) (((int) (df9Var.j() >> 32)) / 2)) ? 0 : (int) (df9Var.j() >> 32);
        df9Var.z = f2 > ((float) (((int) (df9Var.j() & 4294967295L)) / 2)) ? (int) (df9Var.j() & 4294967295L) : 0;
    }

    public static final Object u(df9 df9Var, float f, float f2, float f3, float f4, tl0 tl0Var) {
        float f5;
        long j;
        ym ymVar = new ym(new eb7((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L)), ah1.y0, null, 12);
        float fAbs = Math.abs(f3 - f);
        float fAbs2 = Math.abs(f4 - f2);
        if (fAbs == 0.0f) {
            f5 = 400.0f * fAbs2;
            j = df9Var.j() & 4294967295L;
        } else {
            f5 = 400.0f * fAbs;
            j = df9Var.j() >> 32;
        }
        Object objB = ym.b(ymVar, new eb7((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L)), ah1.a0((int) (f5 / ((int) j)), 0, b83.b, 2), new hy7(df9Var, 23), tl0Var, 4);
        return objB == xx1.a ? objB : heb.a;
    }

    @Override // defpackage.kp4, defpackage.sw8
    public final void b(float f, float f2) {
        if (this.u) {
            if (this.c < 0.0f) {
                this.c = f;
            }
            if (this.d < 0.0f) {
                this.d = f2;
            }
            float fE = f - e();
            dk7 dk7VarF = f();
            dk7 dk7Var = dk7.b;
            dk7 dk7Var2 = dk7.c;
            dk7 dk7Var3 = dk7.a;
            dk7 dk7VarF2 = dk7VarF == dk7Var3 ? f > this.o ? dk7Var2 : dk7Var : f();
            v(f, f2, dk7VarF2);
            if (f() == dk7Var3) {
                if (dk7VarF2 == dk7Var && !g()) {
                    this.u = false;
                    return;
                } else if (dk7VarF2 == dk7Var2 && !h()) {
                    this.u = false;
                    return;
                } else {
                    dk7VarF2.getClass();
                    this.k.setValue(dk7VarF2);
                    this.m = dk7VarF2;
                }
            }
            if (Math.abs(fE) >= this.n) {
                if (fE > 0.0f) {
                    dk7Var = dk7Var2;
                }
                this.m = dk7Var;
            }
        }
    }

    @Override // defpackage.sw8
    public final void c() {
        this.u = false;
        vx1 vx1Var = this.b;
        this.v = vx1Var != null ? ah1.J(vx1Var, null, null, new tl0(this, null), 3) : null;
    }

    @Override // defpackage.kp4, defpackage.sw8
    public final heb l(boolean z, eb7 eb7Var) {
        df9 df9Var;
        boolean zG = g();
        heb hebVar = heb.a;
        if (!zG) {
            return hebVar;
        }
        q();
        vx1 vx1Var = this.b;
        oq9 oq9VarJ = null;
        if (vx1Var != null) {
            df9Var = this;
            oq9VarJ = ah1.J(vx1Var, rw2.a, null, new cf9(z, df9Var, eb7Var, oq9VarJ, 0), 2);
        } else {
            df9Var = this;
        }
        df9Var.w = oq9VarJ;
        return hebVar;
    }

    @Override // defpackage.kp4, defpackage.sw8
    public final heb m(boolean z, eb7 eb7Var) {
        df9 df9Var;
        boolean zH = h();
        heb hebVar = heb.a;
        if (!zH) {
            return hebVar;
        }
        q();
        vx1 vx1Var = this.b;
        oq9 oq9VarJ = null;
        if (vx1Var != null) {
            df9Var = this;
            oq9VarJ = ah1.J(vx1Var, rw2.a, null, new cf9(z, df9Var, eb7Var, oq9VarJ, 1), 2);
        } else {
            df9Var = this;
        }
        df9Var.w = oq9VarJ;
        return hebVar;
    }

    @Override // defpackage.kp4, defpackage.sw8
    public final void p(float f, float f2) {
        df9 df9Var;
        int iD = d();
        this.u = false;
        if (iD < 0) {
            return;
        }
        q();
        vx1 vx1Var = this.b;
        oq9 oq9VarJ = null;
        if (vx1Var != null) {
            df9Var = this;
            oq9VarJ = ah1.J(vx1Var, rw2.a, null, new jp4(df9Var, f, f2, oq9VarJ, 2), 2);
        } else {
            df9Var = this;
        }
        df9Var.w = oq9VarJ;
    }

    public final void v(float f, float f2, dk7 dk7Var) {
        if ((this.d > ((int) (j() & 4294967295L)) / 3 && this.d < (((int) (j() & 4294967295L)) * 2) / 3) || dk7Var == dk7.c) {
            f2 = (int) (j() & 4294967295L);
        }
        if (this.d > ((int) (j() & 4294967295L)) / 3 && this.d < ((int) (j() & 4294967295L)) / 2 && dk7Var == dk7.b) {
            f2 = 1.0f;
        }
        n(f);
        o(f2);
    }
}

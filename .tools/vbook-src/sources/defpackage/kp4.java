package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class kp4 extends sw8 {
    public boolean u;
    public oq9 v;
    public oq9 w;
    public boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp4(st5 st5Var) {
        super(st5Var);
        st5Var.getClass();
        this.x = true;
    }

    public static p9b r(float f, float f2, int i) {
        return ah1.a0((int) ((Math.abs(f2 - f) * 400.0f) / i), 0, null, 6);
    }

    @Override // defpackage.sw8
    public void b(float f, float f2) {
        if (this.u) {
            if (this.c < 0.0f) {
                this.c = f;
            }
            if (this.d < 0.0f) {
                this.d = f2;
            }
            float fE = f - e();
            n(f);
            o(f2);
            dk7 dk7VarF = f();
            dk7 dk7Var = dk7.a;
            dk7 dk7Var2 = dk7.b;
            dk7 dk7Var3 = dk7.c;
            if (dk7VarF == dk7Var) {
                dk7 dk7Var4 = f > this.o ? dk7Var3 : dk7Var2;
                if (dk7Var4 == dk7Var2 && !g()) {
                    this.u = false;
                    return;
                } else if (dk7Var4 == dk7Var3 && !h()) {
                    this.u = false;
                    return;
                } else {
                    this.k.setValue(dk7Var4);
                    this.m = dk7Var4;
                }
            }
            if (Math.abs(fE) >= this.n) {
                if (fE > 0.0f) {
                    dk7Var2 = dk7Var3;
                }
                this.m = dk7Var2;
            }
        }
    }

    @Override // defpackage.sw8
    public final boolean g() {
        return d() < i().j().n - 1;
    }

    @Override // defpackage.sw8
    public final boolean h() {
        return d() > 0;
    }

    @Override // defpackage.sw8
    public final boolean k() {
        return f() != dk7.a;
    }

    @Override // defpackage.sw8
    public heb l(boolean z, eb7 eb7Var) {
        boolean zG = g();
        heb hebVar = heb.a;
        if (!zG) {
            return hebVar;
        }
        q();
        vx1 vx1Var = this.b;
        this.w = vx1Var != null ? ah1.J(vx1Var, rw2.a, null, new hp4(z, this, null, 0), 2) : null;
        return hebVar;
    }

    @Override // defpackage.sw8
    public heb m(boolean z, eb7 eb7Var) {
        boolean zH = h();
        heb hebVar = heb.a;
        if (!zH) {
            return hebVar;
        }
        q();
        vx1 vx1Var = this.b;
        this.w = vx1Var != null ? ah1.J(vx1Var, rw2.a, null, new hp4(z, this, null, 1), 2) : null;
        return hebVar;
    }

    @Override // defpackage.sw8
    public void p(float f, float f2) {
        kp4 kp4Var;
        int iD = d();
        this.u = false;
        if (iD < 0) {
            return;
        }
        q();
        vx1 vx1Var = this.b;
        oq9 oq9VarJ = null;
        if (vx1Var != null) {
            aj2 aj2Var = rw2.a;
            kp4Var = this;
            oq9VarJ = ah1.J(vx1Var, nh2.c, null, new jp4(kp4Var, f, f2, oq9VarJ, 0), 2);
        } else {
            kp4Var = this;
        }
        kp4Var.w = oq9VarJ;
    }

    public final void q() {
        oq9 oq9Var = this.w;
        jt1 jt1Var = null;
        if (oq9Var != null) {
            oq9Var.cancel(null);
        }
        oq9 oq9Var2 = this.v;
        if (oq9Var2 != null) {
            oq9Var2.cancel(null);
        }
        if (!this.x) {
            ah1.S(hc3.a, new l64(this, jt1Var, 7));
        }
        this.x = true;
        cn7 cn7Var = this.k;
        dk7 dk7Var = dk7.a;
        cn7Var.setValue(dk7Var);
        this.m = dk7Var;
    }

    public final Object s(int i, jt1 jt1Var) {
        if (i >= 0) {
            int i2 = 1;
            if (i <= i().j().n - 1) {
                aj2 aj2Var = rw2.a;
                return ah1.b0(r76.a.f, new ip4(this, i, null, i2), jt1Var);
            }
        }
        return heb.a;
    }
}

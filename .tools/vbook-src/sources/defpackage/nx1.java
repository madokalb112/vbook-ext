package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class nx1 extends n0 implements lt1 {
    public static final mx1 b = new mx1(g83.d, new hu1(1));

    public nx1() {
        super(g83.d);
    }

    public abstract void A(jx1 jx1Var, Runnable runnable);

    @Override // defpackage.lt1
    public final jt1 E(kt1 kt1Var) {
        return new kw2(this, kt1Var);
    }

    @Override // defpackage.lt1
    public final void K0(jt1 jt1Var) {
        jt1Var.getClass();
        kw2 kw2Var = (kw2) jt1Var;
        kw2Var.k();
        ay0 ay0VarN = kw2Var.n();
        if (ay0VarN != null) {
            ay0VarN.o();
        }
    }

    public void N(jx1 jx1Var, Runnable runnable) {
        lw2.b(this, jx1Var, runnable);
    }

    public boolean R(jx1 jx1Var) {
        return !(this instanceof xdb);
    }

    public nx1 e0(int i) {
        qx1.r(i);
        return new by5(this, i);
    }

    @Override // defpackage.n0, defpackage.jx1
    public final hx1 get(ix1 ix1Var) {
        return sdc.k0(this, ix1Var);
    }

    @Override // defpackage.n0, defpackage.jx1
    public final jx1 minusKey(ix1 ix1Var) {
        return sdc.r0(this, ix1Var);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + md2.c0(this);
    }
}

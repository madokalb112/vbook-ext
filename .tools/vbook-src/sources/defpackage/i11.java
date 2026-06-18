package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class i11 extends k11 {
    private volatile /* synthetic */ int consumed$volatile;
    public final h11 d;

    static {
        AtomicIntegerFieldUpdater.newUpdater(i11.class, "consumed$volatile");
    }

    public /* synthetic */ i11(h11 h11Var) {
        this(h11Var, hc3.a, -3, ar0.a);
    }

    @Override // defpackage.k11, defpackage.b24
    public final Object a(c24 c24Var, jt1 jt1Var) {
        int i = this.b;
        xx1 xx1Var = xx1.a;
        if (i == -3) {
            Object objN = ex1.N(c24Var, this.d, false, jt1Var);
            if (objN == xx1Var) {
                return objN;
            }
        } else {
            Object objA = super.a(c24Var, jt1Var);
            if (objA == xx1Var) {
                return objA;
            }
        }
        return heb.a;
    }

    @Override // defpackage.k11
    public final String d() {
        return "channel=" + this.d;
    }

    @Override // defpackage.k11
    public final Object e(o38 o38Var, jt1 jt1Var) throws Throwable {
        Object objN = ex1.N(new z29(o38Var), this.d, false, jt1Var);
        return objN == xx1.a ? objN : heb.a;
    }

    @Override // defpackage.k11
    public final k11 g(jx1 jx1Var, int i, ar0 ar0Var) {
        return new i11(this.d, jx1Var, i, ar0Var);
    }

    @Override // defpackage.k11
    public final b24 h() {
        return new i11(this.d);
    }

    @Override // defpackage.k11
    public final h11 i(vx1 vx1Var) {
        return this.b == -3 ? this.d : super.i(vx1Var);
    }

    public i11(h11 h11Var, jx1 jx1Var, int i, ar0 ar0Var) {
        super(jx1Var, i, ar0Var);
        this.d = h11Var;
    }
}

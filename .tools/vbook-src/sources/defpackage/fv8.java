package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class fv8 extends m0 implements yx1 {
    public final jt1 f;

    public fv8(jt1 jt1Var, jx1 jx1Var) {
        super(jx1Var, true);
        this.f = jt1Var;
    }

    @Override // defpackage.pe5
    public final boolean O() {
        return true;
    }

    @Override // defpackage.yx1
    public final yx1 getCallerFrame() {
        jt1 jt1Var = this.f;
        if (jt1Var instanceof yx1) {
            return (yx1) jt1Var;
        }
        return null;
    }

    @Override // defpackage.pe5
    public void m(Object obj) {
        lw2.a(bx1.J(this.f), gc1.e0(obj));
    }

    @Override // defpackage.pe5
    public void n(Object obj) {
        this.f.resumeWith(gc1.e0(obj));
    }

    public void s0() {
    }
}

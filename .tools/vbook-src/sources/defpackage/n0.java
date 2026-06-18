package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class n0 implements hx1 {
    public final ix1 a;

    public n0(ix1 ix1Var) {
        ix1Var.getClass();
        this.a = ix1Var;
    }

    @Override // defpackage.jx1
    public final Object fold(Object obj, yb4 yb4Var) {
        return yb4Var.invoke(obj, this);
    }

    @Override // defpackage.jx1
    public /* bridge */ hx1 get(ix1 ix1Var) {
        return gx1.G(this, ix1Var);
    }

    @Override // defpackage.hx1
    public ix1 getKey() {
        return this.a;
    }

    @Override // defpackage.jx1
    public /* bridge */ jx1 minusKey(ix1 ix1Var) {
        return gx1.Q(this, ix1Var);
    }

    @Override // defpackage.jx1
    public final /* bridge */ jx1 plus(jx1 jx1Var) {
        return gx1.T(this, jx1Var);
    }
}

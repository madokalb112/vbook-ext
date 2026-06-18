package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class n11 extends m11 {
    public n11(b24 b24Var, jx1 jx1Var, int i, ar0 ar0Var, int i2) {
        super(b24Var, (i2 & 2) != 0 ? hc3.a : jx1Var, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? ar0.a : ar0Var);
    }

    @Override // defpackage.k11
    public final k11 g(jx1 jx1Var, int i, ar0 ar0Var) {
        return new n11(this.d, jx1Var, i, ar0Var);
    }

    @Override // defpackage.k11
    public final b24 h() {
        return this.d;
    }

    @Override // defpackage.m11
    public final Object j(c24 c24Var, jt1 jt1Var) {
        Object objA = this.d.a(c24Var, jt1Var);
        return objA == xx1.a ? objA : heb.a;
    }
}

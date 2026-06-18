package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class l11 extends k11 {
    public final yb4 d;

    public l11(yb4 yb4Var, jx1 jx1Var, int i, ar0 ar0Var) {
        super(jx1Var, i, ar0Var);
        this.d = yb4Var;
    }

    @Override // defpackage.k11
    public Object e(o38 o38Var, jt1 jt1Var) {
        Object objInvoke = this.d.invoke(o38Var, jt1Var);
        return objInvoke == xx1.a ? objInvoke : heb.a;
    }

    @Override // defpackage.k11
    public k11 g(jx1 jx1Var, int i, ar0 ar0Var) {
        return new l11(this.d, jx1Var, i, ar0Var);
    }

    @Override // defpackage.k11
    public final String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }
}

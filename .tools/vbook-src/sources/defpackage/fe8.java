package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fe8 implements dr9, b24, mc4 {
    public final /* synthetic */ dr9 a;

    public fe8(b07 b07Var) {
        this.a = b07Var;
    }

    @Override // defpackage.b24
    public final Object a(c24 c24Var, jt1 jt1Var) {
        return this.a.a(c24Var, jt1Var);
    }

    @Override // defpackage.mc4
    public final b24 c(jx1 jx1Var, int i, ar0 ar0Var) {
        return ((((i < 0 || i >= 2) && i != -2) || ar0Var != ar0.b) && !((i == 0 || i == -3) && ar0Var == ar0.a)) ? new n11(this, jx1Var, i, ar0Var) : this;
    }

    @Override // defpackage.dr9
    public final Object getValue() {
        return this.a.getValue();
    }
}

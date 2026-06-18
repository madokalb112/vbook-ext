package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class my1 extends kp4 {
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my1(st5 st5Var, int i) {
        super(st5Var);
        this.y = i;
    }

    @Override // defpackage.sw8
    public final void c() {
        int i = 3;
        switch (this.y) {
            case 0:
                this.u = false;
                ym ymVarA = lc5.a(e(), 0.01f);
                vx1 vx1Var = this.b;
                this.v = vx1Var != null ? ah1.J(vx1Var, null, null, new pc(this, ymVarA, oq9Var, i), 3) : null;
                break;
            case 1:
                this.u = false;
                vx1 vx1Var2 = this.b;
                if (vx1Var2 != null) {
                    ah1.J(vx1Var2, null, null, new l64(this, (jt1) null, 18), 3);
                }
                break;
            case 2:
                this.u = false;
                ym ymVarA2 = lc5.a(e(), 0.01f);
                vx1 vx1Var3 = this.b;
                this.v = vx1Var3 != null ? ah1.J(vx1Var3, null, null, new pc(this, ymVarA2, oq9Var, 12), 3) : null;
                break;
            default:
                this.u = false;
                ym ymVarA3 = lc5.a(e(), 0.01f);
                vx1 vx1Var4 = this.b;
                this.v = vx1Var4 != null ? ah1.J(vx1Var4, null, null, new pc(this, ymVarA3, oq9Var, 13), 3) : null;
                break;
        }
    }

    @Override // defpackage.kp4, defpackage.sw8
    public heb l(boolean z, eb7 eb7Var) {
        int i = this.y;
        int i2 = 0;
        heb hebVar = heb.a;
        switch (i) {
            case 2:
                if (g()) {
                    q();
                    vx1 vx1Var = this.b;
                    this.w = vx1Var != null ? ah1.J(vx1Var, rw2.a, null, new gf9(z, this, oq9Var, i2), 2) : null;
                }
                return hebVar;
            case 3:
                if (g()) {
                    q();
                    vx1 vx1Var2 = this.b;
                    this.w = vx1Var2 != null ? ah1.J(vx1Var2, rw2.a, null, new qh9(z, this, oq9Var, i2), 2) : null;
                }
                return hebVar;
            default:
                return super.l(z, eb7Var);
        }
    }

    @Override // defpackage.kp4, defpackage.sw8
    public heb m(boolean z, eb7 eb7Var) {
        int i = this.y;
        int i2 = 1;
        heb hebVar = heb.a;
        switch (i) {
            case 2:
                if (h()) {
                    q();
                    vx1 vx1Var = this.b;
                    this.w = vx1Var != null ? ah1.J(vx1Var, rw2.a, null, new gf9(z, this, oq9Var, i2), 2) : null;
                }
                return hebVar;
            case 3:
                if (h()) {
                    q();
                    vx1 vx1Var2 = this.b;
                    this.w = vx1Var2 != null ? ah1.J(vx1Var2, rw2.a, null, new qh9(z, this, oq9Var, i2), 2) : null;
                }
                return hebVar;
            default:
                return super.m(z, eb7Var);
        }
    }
}

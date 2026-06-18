package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class af2 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af2(cf2 cf2Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = cf2Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        cf2 cf2Var = this.b;
        switch (i) {
            case 0:
                return new af2(cf2Var, jt1Var, 0);
            case 1:
                return new af2(cf2Var, jt1Var, 1);
            case 2:
                return new af2(cf2Var, jt1Var, 2);
            default:
                return new af2(cf2Var, jt1Var, 3);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                ((af2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((af2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 2:
                ((af2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((af2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        cf2 cf2Var = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                cf2Var.i(cf2Var.f, qe2.a);
                break;
            case 1:
                e11.e0(obj);
                cf2Var.i(cf2Var.f, re2.a);
                break;
            case 2:
                e11.e0(obj);
                cf2Var.i(cf2Var.f, se2.a);
                break;
            default:
                e11.e0(obj);
                cf2Var.i(cf2Var.f, te2.a);
                break;
        }
        return hebVar;
    }
}

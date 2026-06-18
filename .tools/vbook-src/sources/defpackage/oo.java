package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oo extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ib4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo(ib4 ib4Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = ib4Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new oo(this.b, jt1Var, 0);
            default:
                return new oo(this.b, jt1Var, 1);
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
                ((oo) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((oo) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                e11.e0(obj);
                break;
            default:
                e11.e0(obj);
                this.b.invoke();
                break;
        }
        return hebVar;
    }
}

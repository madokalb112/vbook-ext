package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c43 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v33 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c43(v33 v33Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = v33Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        v33 v33Var = this.b;
        switch (i) {
            case 0:
                return new c43(v33Var, jt1Var, 0);
            case 1:
                return new c43(v33Var, jt1Var, 1);
            case 2:
                return new c43(v33Var, jt1Var, 2);
            default:
                return new c43(v33Var, jt1Var, 3);
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
                ((c43) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((c43) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 2:
                ((c43) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((c43) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
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
            case 1:
                e11.e0(obj);
                break;
            case 2:
                e11.e0(obj);
                break;
            default:
                e11.e0(obj);
                break;
        }
        return hebVar;
    }
}

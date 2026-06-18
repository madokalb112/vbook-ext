package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uz7 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z18 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uz7(z18 z18Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = z18Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        z18 z18Var = this.b;
        switch (i) {
            case 0:
                return new uz7(z18Var, jt1Var, 0);
            case 1:
                return new uz7(z18Var, jt1Var, 1);
            case 2:
                return new uz7(z18Var, jt1Var, 2);
            case 3:
                return new uz7(z18Var, jt1Var, 3);
            default:
                return new uz7(z18Var, jt1Var, 4);
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
                ((uz7) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((uz7) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 2:
                ((uz7) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 3:
                ((uz7) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((uz7) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        z18 z18Var = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                z18Var.b.q(null);
                break;
            case 1:
                e11.e0(obj);
                z18Var.b.q(null);
                break;
            case 2:
                e11.e0(obj);
                z18Var.b.q(null);
                break;
            case 3:
                e11.e0(obj);
                z18Var.b.q(null);
                break;
            default:
                e11.e0(obj);
                z18Var.b.q(null);
                break;
        }
        return hebVar;
    }
}

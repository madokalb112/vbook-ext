package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class am3 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z44 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ am3(z44 z44Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = z44Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new am3(this.b, jt1Var, 0);
            case 1:
                return new am3(this.b, jt1Var, 1);
            case 2:
                return new am3(this.b, jt1Var, 2);
            case 3:
                return new am3(this.b, jt1Var, 3);
            case 4:
                return new am3(this.b, jt1Var, 4);
            case 5:
                return new am3(this.b, jt1Var, 5);
            case 6:
                return new am3(this.b, jt1Var, 6);
            default:
                return new am3(this.b, jt1Var, 7);
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
                ((am3) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((am3) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 2:
                ((am3) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 3:
                ((am3) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 4:
                ((am3) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 5:
                ((am3) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 6:
                ((am3) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((am3) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        z44 z44Var = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                z44.a(z44Var);
                break;
            case 1:
                e11.e0(obj);
                z44.a(z44Var);
                break;
            case 2:
                e11.e0(obj);
                z44.a(z44Var);
                break;
            case 3:
                e11.e0(obj);
                z44.a(z44Var);
                break;
            case 4:
                e11.e0(obj);
                z44.a(z44Var);
                break;
            case 5:
                e11.e0(obj);
                z44.a(z44Var);
                break;
            case 6:
                e11.e0(obj);
                z44.a(z44Var);
                break;
            default:
                e11.e0(obj);
                z44.a(z44Var);
                break;
        }
        return hebVar;
    }
}

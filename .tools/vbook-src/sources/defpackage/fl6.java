package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fl6 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mo4 b;
    public final /* synthetic */ a07 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fl6(mo4 mo4Var, a07 a07Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = mo4Var;
        this.c = a07Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        a07 a07Var = this.c;
        mo4 mo4Var = this.b;
        switch (i) {
            case 0:
                return new fl6(mo4Var, a07Var, jt1Var, 0);
            default:
                return new fl6(mo4Var, a07Var, jt1Var, 1);
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
                ((fl6) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((fl6) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.c;
        mo4 mo4Var = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                mo4Var.j(((wga) a07Var.getValue()).a.b);
                break;
            default:
                e11.e0(obj);
                mo4Var.j(((wga) a07Var.getValue()).a.b);
                break;
        }
        return hebVar;
    }
}

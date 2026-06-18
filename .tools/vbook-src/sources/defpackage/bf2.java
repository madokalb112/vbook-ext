package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bf2 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf2 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf2(cf2 cf2Var, String str, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = cf2Var;
        this.c = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        String str = this.c;
        cf2 cf2Var = this.b;
        switch (i) {
            case 0:
                return new bf2(cf2Var, str, jt1Var, 0);
            default:
                return new bf2(cf2Var, str, jt1Var, 1);
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
                ((bf2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((bf2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        String str = this.c;
        cf2 cf2Var = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                cf2Var.i(cf2Var.f, new ve2(str));
                break;
            default:
                e11.e0(obj);
                cf2Var.i(cf2Var.f, new we2(str));
                break;
        }
        return hebVar;
    }
}

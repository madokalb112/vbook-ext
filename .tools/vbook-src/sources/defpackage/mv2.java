package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mv2 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pz5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mv2(pz5 pz5Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = pz5Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        pz5 pz5Var = this.b;
        switch (i) {
            case 0:
                return new mv2(pz5Var, jt1Var, 0);
            default:
                return new mv2(pz5Var, jt1Var, 1);
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
                ((mv2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((mv2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        pz5 pz5Var = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                za1 za1VarA = vtb.a(pz5Var);
                aj2 aj2Var = rw2.a;
                pz5Var.g(za1VarA, nh2.c, new mv2(pz5Var, null, 1));
                break;
            default:
                e11.e0(obj);
                qa1 qa1Var = r95.a;
                long jC = qa1Var.k().c() - pz5Var.V;
                mc8 mc8Var = k63.b;
                if (jC > k63.e(lx1.z0(10, o63.MINUTES))) {
                    pz5Var.V = qa1Var.k().c();
                }
                break;
        }
        return hebVar;
    }
}

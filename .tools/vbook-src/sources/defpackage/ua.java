package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ua extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ib4 d;
    public final /* synthetic */ yb4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ua(ib4 ib4Var, yb4 yb4Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = ib4Var;
        this.e = yb4Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                ua uaVar = new ua(this.d, this.e, jt1Var, 0);
                uaVar.c = obj;
                return uaVar;
            default:
                ua uaVar2 = new ua(this.d, this.e, jt1Var, 1);
                uaVar2.c = obj;
                return uaVar2;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((ua) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        yb4 yb4Var = this.e;
        ib4 ib4Var = this.d;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                vx1 vx1Var = (vx1) this.c;
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    rg8 rg8Var = new rg8();
                    pp1 pp1VarC = dk9.C(ib4Var);
                    ta taVar = new ta(rg8Var, vx1Var, yb4Var, 0);
                    this.c = null;
                    this.b = 1;
                    if (pp1VarC.a(taVar, this) == xx1Var) {
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    vx1 vx1Var2 = (vx1) this.c;
                    rg8 rg8Var2 = new rg8();
                    pp1 pp1VarC2 = dk9.C(ib4Var);
                    ta taVar2 = new ta(rg8Var2, vx1Var2, yb4Var, 1);
                    this.b = 1;
                    if (pp1VarC2.a(taVar2, this) == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }
}

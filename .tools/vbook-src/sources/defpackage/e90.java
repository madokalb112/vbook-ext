package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e90 extends o1a implements yb4 {
    public final /* synthetic */ int a = 1;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e90(int i, jt1 jt1Var, String str) {
        super(2, jt1Var);
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        String str = this.c;
        switch (i) {
            case 0:
                e90 e90Var = new e90(str, jt1Var);
                e90Var.b = obj;
                return e90Var;
            default:
                e90 e90Var2 = new e90(this.d, jt1Var, str);
                e90Var2.b = obj;
                return e90Var2;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                return ((e90) create((owb) obj, (jt1) obj2)).invokeSuspend(hebVar);
            default:
                ((e90) create((pz6) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.a;
        heb hebVar = heb.a;
        String str = this.c;
        switch (i) {
            case 0:
                owb owbVar = (owb) this.b;
                int i2 = this.d;
                jt1 jt1Var = null;
                if (i2 != 0) {
                    if (i2 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                aj2 aj2Var = rw2.a;
                fj4 fj4Var = r76.a.f;
                d90 d90Var = new d90(owbVar, str, jt1Var, 0);
                this.b = null;
                this.d = 1;
                Object objB0 = ah1.b0(fj4Var, d90Var, this);
                xx1 xx1Var = xx1.a;
                return objB0 == xx1Var ? xx1Var : hebVar;
            default:
                e11.e0(obj);
                pz6 pz6Var = (pz6) this.b;
                e18 e18VarQ = i12.Q(str);
                Integer num = new Integer(this.d);
                pz6Var.getClass();
                pz6Var.f(e18VarQ, num);
                return hebVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e90(String str, jt1 jt1Var) {
        super(2, jt1Var);
        this.c = str;
    }
}

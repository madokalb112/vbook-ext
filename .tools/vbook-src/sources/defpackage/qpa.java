package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qpa extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ rpa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qpa(rpa rpaVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = rpaVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        rpa rpaVar = this.c;
        switch (i) {
            case 0:
                return new qpa(rpaVar, jt1Var, 0);
            default:
                return new qpa(rpaVar, jt1Var, 1);
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
        return ((qpa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        rpa rpaVar = this.c;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    y0c y0cVarE = ((d1c) rpaVar.c).e();
                    rb9 rb9Var = new rb9(rpaVar, 8);
                    this.b = 1;
                    if (y0cVarE.a(rb9Var, this) == xx1Var) {
                    }
                }
                break;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    t0c t0cVar = rpaVar.c;
                    this.b = 1;
                    b92 b92Var = ((d1c) t0cVar).a.K;
                    ((qj) ((yf1) b92Var).a).q(-571959754, "DELETE FROM DbTrash\nWHERE type = 0", (kb4) null);
                    b92Var.w(-571959754, new oc2(10));
                    if (hebVar == xx1Var) {
                    }
                }
                break;
        }
        return hebVar;
    }
}

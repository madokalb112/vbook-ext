package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e89 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ g89 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e89(g89 g89Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = g89Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        g89 g89Var = this.c;
        switch (i) {
            case 0:
                return new e89(g89Var, jt1Var, 0);
            default:
                return new e89(g89Var, jt1Var, 1);
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
        return ((e89) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        g89 g89Var = this.c;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    b24 data = g89Var.b.getData();
                    d89 d89Var = new d89(g89Var.c);
                    this.b = 1;
                    if (data.a(d89Var, this) == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return heb.a;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                b24 data2 = g89Var.b.getData();
                this.b = 1;
                Object objN = cx1.N(data2, this);
                return objN == xx1Var ? xx1Var : objN;
        }
    }
}

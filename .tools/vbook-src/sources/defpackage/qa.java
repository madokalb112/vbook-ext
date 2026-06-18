package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qa extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ yb4 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ vx1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qa(yb4 yb4Var, Object obj, vx1 vx1Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = yb4Var;
        this.d = obj;
        this.e = vx1Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new qa(this.c, this.d, this.e, jt1Var, 0);
            default:
                return new qa(this.c, this.d, this.e, jt1Var, 1);
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
        return ((qa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = this.e;
        Object obj2 = this.d;
        yb4 yb4Var = this.c;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    if (yb4Var.invoke(obj2, this) == xx1Var) {
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                wx1.K(vx1Var, new ia());
                break;
            default:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    if (yb4Var.invoke(obj2, this) == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                wx1.K(vx1Var, new ja());
                break;
        }
        return hebVar;
    }
}

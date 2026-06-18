package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f24 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ b24 c;
    public final /* synthetic */ n38 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f24(b24 b24Var, n38 n38Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = b24Var;
        this.d = n38Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new f24(this.c, this.d, jt1Var, 0);
            default:
                return new f24(this.c, this.d, jt1Var, 1);
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
        return ((f24) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        n38 n38Var = this.d;
        b24 b24Var = this.c;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    e24 e24Var = new e24(n38Var, 0);
                    this.b = 1;
                    if (b24Var.a(e24Var, this) == xx1Var) {
                    }
                } else if (i2 == 1 || i2 == 2) {
                    e11.e0(obj);
                } else {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                }
                break;
            default:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    e24 e24Var2 = new e24(n38Var, 2);
                    this.b = 1;
                    if (b24Var.a(e24Var2, this) == xx1Var) {
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

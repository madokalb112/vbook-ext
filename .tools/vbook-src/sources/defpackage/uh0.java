package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uh0 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ wh0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uh0(wh0 wh0Var, String str, long j, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = wh0Var;
        this.d = str;
        this.e = j;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new uh0(this.c, this.d, this.e, jt1Var, 0);
            default:
                return new uh0(this.c, this.d, this.e, jt1Var, 1);
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
        return ((uh0) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        wh0 wh0Var = this.c;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    uf4 uf4Var = wh0Var.a;
                    this.b = 1;
                    String str = this.d;
                    str.getClass();
                    Object objN = cx1.N(cx1.L(new x52(((h42) uf4Var.b).getData(), str, this.e)), this);
                    if (objN == xx1Var) {
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i3 = this.b;
                heb hebVar = heb.a;
                if (i3 == 0) {
                    e11.e0(obj);
                    uf4 uf4Var2 = wh0Var.a;
                    this.b = 1;
                    Object objG = qu1.G((h42) uf4Var2.b, new f62(this.d, this.e, null, 0), this);
                    if (objG != xx1Var) {
                        objG = hebVar;
                    }
                    if (objG == xx1Var) {
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

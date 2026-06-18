package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ph0 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ wh0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ph0(wh0 wh0Var, String str, boolean z, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = wh0Var;
        this.d = str;
        this.e = z;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new ph0(this.c, this.d, this.e, jt1Var, 0);
            default:
                return new ph0(this.c, this.d, this.e, jt1Var, 1);
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
        return ((ph0) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        boolean z = this.e;
        String str = this.d;
        wh0 wh0Var = this.c;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                uf4 uf4Var = wh0Var.a;
                this.b = 1;
                str.getClass();
                Object objN = cx1.N(cx1.L(new f52(((h42) uf4Var.b).getData(), str, z)), this);
                return objN == xx1Var ? xx1Var : objN;
            default:
                int i3 = this.b;
                heb hebVar = heb.a;
                if (i3 == 0) {
                    e11.e0(obj);
                    uf4 uf4Var2 = wh0Var.a;
                    this.b = 1;
                    Object objG = qu1.G((h42) uf4Var2.b, new gl0(str, z, null), this);
                    if (objG != xx1Var) {
                        objG = hebVar;
                    }
                    if (objG == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qh0 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ wh0 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qh0(wh0 wh0Var, String str, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = wh0Var;
        this.d = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        String str = this.d;
        wh0 wh0Var = this.c;
        switch (i) {
            case 0:
                return new qh0(wh0Var, str, jt1Var, 0);
            case 1:
                return new qh0(wh0Var, str, jt1Var, 1);
            case 2:
                return new qh0(wh0Var, str, jt1Var, 2);
            case 3:
                return new qh0(wh0Var, str, jt1Var, 3);
            case 4:
                return new qh0(wh0Var, str, jt1Var, 4);
            case 5:
                return new qh0(wh0Var, str, jt1Var, 5);
            default:
                return new qh0(wh0Var, str, jt1Var, 6);
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
        return ((qh0) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        String str = this.d;
        wh0 wh0Var = this.c;
        xx1 xx1Var = xx1.a;
        jt1 jt1Var = null;
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
                Object objN = cx1.N(cx1.L(new i52(((h42) uf4Var.b).getData(), str, 0)), this);
                return objN == xx1Var ? xx1Var : objN;
            case 1:
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
                uf4 uf4Var2 = wh0Var.a;
                this.b = 1;
                str.getClass();
                Object objN2 = cx1.N(cx1.L(new i52(((h42) uf4Var2.b).getData(), str, 1)), this);
                return objN2 == xx1Var ? xx1Var : objN2;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                uf4 uf4Var3 = wh0Var.a;
                this.b = 1;
                str.getClass();
                Object objN3 = cx1.N(cx1.L(new i52(((h42) uf4Var3.b).getData(), str, 2)), this);
                return objN3 == xx1Var ? xx1Var : objN3;
            case 3:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                uf4 uf4Var4 = wh0Var.a;
                this.b = 1;
                str.getClass();
                Object objN4 = cx1.N(cx1.L(new i52(((h42) uf4Var4.b).getData(), str, 3)), this);
                return objN4 == xx1Var ? xx1Var : objN4;
            case 4:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                uf4 uf4Var5 = wh0Var.a;
                this.b = 1;
                str.getClass();
                Object objN5 = cx1.N(cx1.L(new i52(((h42) uf4Var5.b).getData(), str, 4)), this);
                return objN5 == xx1Var ? xx1Var : objN5;
            case 5:
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                uf4 uf4Var6 = wh0Var.a;
                this.b = 1;
                str.getClass();
                Object objN6 = cx1.N(cx1.L(new i52(((h42) uf4Var6.b).getData(), str, 5)), this);
                return objN6 == xx1Var ? xx1Var : objN6;
            default:
                int i8 = this.b;
                heb hebVar = heb.a;
                if (i8 == 0) {
                    e11.e0(obj);
                    uf4 uf4Var7 = wh0Var.a;
                    this.b = 1;
                    Object objG = qu1.G((h42) uf4Var7.b, new pg(str, jt1Var, 8), this);
                    if (objG != xx1Var) {
                        objG = hebVar;
                    }
                    if (objG == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i8 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
        }
    }
}

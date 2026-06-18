package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class e8 extends o1a implements zb4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ ct7 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ zb4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e8(zb4 zb4Var, jt1 jt1Var, int i) {
        super(3, jt1Var);
        this.a = i;
        this.e = zb4Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        zb4 zb4Var = this.e;
        ct7 ct7Var = (ct7) obj;
        jt1 jt1Var = (jt1) obj3;
        switch (i) {
            case 0:
                e8 e8Var = new e8(zb4Var, jt1Var, 0);
                e8Var.c = ct7Var;
                e8Var.d = obj2;
                return e8Var.invokeSuspend(hebVar);
            default:
                e8 e8Var2 = new e8(zb4Var, jt1Var, 1);
                e8Var2.c = ct7Var;
                e8Var2.d = obj2;
                return e8Var2.invokeSuspend(hebVar);
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        zb4 zb4Var = this.e;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                ct7 ct7Var = this.c;
                Object obj2 = this.d;
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        e11.e0(obj);
                    } else if (i2 != 2) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    if (obj2 instanceof wh7) {
                        Object obj3 = ct7Var.a;
                        this.c = ct7Var;
                        this.d = null;
                        this.b = 1;
                        obj = zb4Var.c(obj3, obj2, this);
                        if (obj != xx1Var) {
                        }
                        break;
                    }
                }
                wh7 wh7Var = (wh7) obj;
                if (wh7Var != null) {
                    this.c = null;
                    this.d = null;
                    this.b = 2;
                    if (ct7Var.d(this, wh7Var) != xx1Var) {
                    }
                    break;
                }
                break;
            default:
                ct7 ct7Var2 = this.c;
                Object obj4 = this.d;
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    Object obj5 = ct7Var2.a;
                    this.c = ct7Var2;
                    this.d = null;
                    this.b = 1;
                    obj = zb4Var.c(obj5, obj4, this);
                    if (obj != xx1Var) {
                    }
                } else if (i3 == 1) {
                    e11.e0(obj);
                } else if (i3 != 2) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                wh7 wh7Var2 = (wh7) obj;
                if (wh7Var2 != null) {
                    this.c = null;
                    this.d = null;
                    this.b = 2;
                    if (ct7Var2.d(this, wh7Var2) != xx1Var) {
                    }
                }
                break;
        }
        return xx1Var;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d8 extends o1a implements zb4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ ct7 c;
    public /* synthetic */ gv4 d;
    public final /* synthetic */ yb4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d8(yb4 yb4Var, jt1 jt1Var, int i) {
        super(3, jt1Var);
        this.a = i;
        this.e = yb4Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        yb4 yb4Var = this.e;
        ct7 ct7Var = (ct7) obj;
        gv4 gv4Var = (gv4) obj2;
        jt1 jt1Var = (jt1) obj3;
        switch (i) {
            case 0:
                d8 d8Var = new d8(yb4Var, jt1Var, 0);
                d8Var.c = ct7Var;
                d8Var.d = gv4Var;
                return d8Var.invokeSuspend(hebVar);
            default:
                d8 d8Var2 = new d8(yb4Var, jt1Var, 1);
                d8Var2.c = ct7Var;
                d8Var2.d = gv4Var;
                return d8Var2.invokeSuspend(hebVar);
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        yb4 yb4Var = this.e;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                ct7 ct7Var = this.c;
                gv4 gv4Var = this.d;
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    this.c = ct7Var;
                    this.d = null;
                    this.b = 1;
                    obj = yb4Var.invoke(gv4Var, this);
                    if (obj != xx1Var) {
                    }
                } else if (i2 == 1) {
                    e11.e0(obj);
                } else if (i2 != 2) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                gv4 gv4Var2 = (gv4) obj;
                if (gv4Var2 != null) {
                    this.c = null;
                    this.d = null;
                    this.b = 2;
                    if (ct7Var.d(this, gv4Var2) != xx1Var) {
                    }
                }
                break;
            default:
                ct7 ct7Var2 = this.c;
                gv4 gv4Var3 = this.d;
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    this.c = ct7Var2;
                    this.d = null;
                    this.b = 1;
                    obj = yb4Var.invoke(gv4Var3, this);
                    if (obj != xx1Var) {
                    }
                } else if (i3 == 1) {
                    e11.e0(obj);
                } else if (i3 != 2) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                gv4 gv4Var4 = (gv4) obj;
                if (gv4Var4 != null) {
                    this.c = null;
                    this.d = null;
                    this.b = 2;
                    if (ct7Var2.d(this, gv4Var4) != xx1Var) {
                    }
                }
                break;
        }
        return xx1Var;
    }
}

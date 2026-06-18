package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xm6 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ st5 c;
    public final /* synthetic */ a07 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ a07 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xm6(st5 st5Var, a07 a07Var, String str, a07 a07Var2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = st5Var;
        this.d = a07Var;
        this.e = str;
        this.f = a07Var2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new xm6(this.c, this.d, this.e, this.f, jt1Var, 0);
            default:
                return new xm6(this.c, this.d, this.e, this.f, jt1Var, 1);
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
        return ((xm6) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.a;
        heb hebVar = heb.a;
        st5 st5Var = this.c;
        a07 a07Var = this.f;
        String str = this.e;
        a07 a07Var2 = this.d;
        xx1 xx1Var = xx1.a;
        int i2 = 1;
        jt1 jt1Var = null;
        switch (i) {
            case 0:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    aj2 aj2Var = rw2.a;
                    wm6 wm6Var = new wm6(a07Var2, str, jt1Var, 0);
                    this.b = 1;
                    obj = ah1.b0(aj2Var, wm6Var, this);
                    if (obj != xx1Var) {
                    }
                } else if (i3 == 1) {
                    e11.e0(obj);
                } else if (i3 != 2) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                int iIntValue = ((Number) obj).intValue();
                a07Var.setValue(Integer.valueOf(iIntValue));
                if (iIntValue != -1) {
                    this.b = 2;
                    if (pu1.v0(st5Var, iIntValue, this) != xx1Var) {
                    }
                }
                break;
            default:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    aj2 aj2Var2 = rw2.a;
                    wm6 wm6Var2 = new wm6(a07Var2, str, jt1Var, i2);
                    this.b = 1;
                    obj = ah1.b0(aj2Var2, wm6Var2, this);
                    if (obj != xx1Var) {
                    }
                } else if (i4 == 1) {
                    e11.e0(obj);
                } else if (i4 != 2) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                int iIntValue2 = ((Number) obj).intValue();
                a07Var.setValue(Integer.valueOf(iIntValue2));
                if (iIntValue2 != -1) {
                    this.b = 2;
                    if (pu1.v0(st5Var, iIntValue2, this) != xx1Var) {
                    }
                }
                break;
        }
        return xx1Var;
    }
}

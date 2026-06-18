package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oo4 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ro4 c;
    public final /* synthetic */ to3 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo4(ro4 ro4Var, to3 to3Var, String str, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = ro4Var;
        this.d = to3Var;
        this.e = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new oo4(this.c, this.d, this.e, jt1Var, 0);
            default:
                return new oo4(this.c, this.d, this.e, jt1Var, 1);
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
        return ((oo4) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        String str = this.e;
        xx1 xx1Var = xx1.a;
        ro4 ro4Var = this.c;
        to3 to3Var = this.d;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    xm3 xm3Var = (xm3) ro4Var.v.get(to3Var.a);
                    if (xm3Var == null || (!xm3Var.a && !xm3Var.b && xm3Var.f == null)) {
                        String str2 = to3Var.a;
                        this.b = 1;
                        if (ro4.j(ro4Var, str2, str, this) == xx1Var) {
                        }
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    xm3 xm3Var2 = (xm3) ro4Var.v.get(to3Var.a);
                    if ((xm3Var2 == null || (!xm3Var2.a && !xm3Var2.b && xm3Var2.f == null)) && to3Var.q) {
                        String str3 = to3Var.a;
                        this.b = 1;
                        if (ro4.j(ro4Var, str3, str, this) == xx1Var) {
                        }
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

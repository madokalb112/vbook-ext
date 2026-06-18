package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rt2 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ut2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rt2(ut2 ut2Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = ut2Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        ut2 ut2Var = this.c;
        switch (i) {
            case 0:
                return new rt2(ut2Var, jt1Var, 0);
            default:
                return new rt2(ut2Var, jt1Var, 1);
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
        return ((rt2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i = this.a;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        ut2 ut2Var = this.c;
        jt1 jt1Var = null;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    q11 q11VarA0 = cx1.A0(new u31(((cq3) ut2Var.H).e, 2), new xa(jt1Var, ut2Var, 2));
                    sg sgVar = new sg(ut2Var, 10);
                    this.b = 1;
                    if (q11VarA0.a(sgVar, this) == xx1Var) {
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
                    vm3 vm3Var = (vm3) ut2Var.M.getValue();
                    if (vm3Var != null) {
                        fr9 fr9Var = ut2Var.K;
                        if (fr9Var != null) {
                            do {
                                value = fr9Var.getValue();
                            } while (!fr9Var.j(value, pt2.a((pt2) value, true, false, false, false, null, 62)));
                        }
                        this.b = 1;
                        if (ut2.D(ut2Var, vm3Var, this) == xx1Var) {
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

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fea extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ gea c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fea(gea geaVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = geaVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        gea geaVar = this.c;
        switch (i) {
            case 0:
                return new fea(geaVar, jt1Var, 0);
            default:
                return new fea(geaVar, jt1Var, 1);
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
        return ((fea) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        gea geaVar = this.c;
        jt1 jt1Var = null;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    fr9 fr9Var = geaVar.s;
                    y0c y0cVarD = ((d1c) geaVar.d).d(geaVar.c, true);
                    eea eeaVar = new eea(geaVar, null);
                    this.b = 1;
                    Object objM0 = h67.m0(this, s77.a, r90.d, new xa((Object) eeaVar, jt1Var, 13), new b24[]{fr9Var, y0cVarD});
                    if (objM0 != xx1Var) {
                        objM0 = hebVar;
                    }
                    if (objM0 != xx1Var) {
                        objM0 = hebVar;
                    }
                    if (objM0 == xx1Var) {
                    }
                }
                break;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1 || i3 == 2) {
                        e11.e0(obj);
                    } else {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    e11.e0(obj);
                    boolean zBooleanValue = ((Boolean) geaVar.s.getValue()).booleanValue();
                    t0c t0cVar = geaVar.d;
                    if (zBooleanValue) {
                        this.b = 1;
                        ((d1c) t0cVar).a.A.L("general");
                        if (hebVar == xx1Var) {
                        }
                    } else {
                        String str = geaVar.c;
                        this.b = 2;
                        ((d1c) t0cVar).a.A.L(str);
                        if (hebVar == xx1Var) {
                        }
                    }
                }
                break;
        }
        return hebVar;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dja extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ eja c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dja(eja ejaVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = ejaVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        eja ejaVar = this.c;
        switch (i) {
            case 0:
                return new dja(ejaVar, jt1Var, 0);
            case 1:
                return new dja(ejaVar, jt1Var, 1);
            case 2:
                return new dja(ejaVar, jt1Var, 2);
            default:
                return new dja(ejaVar, jt1Var, 3);
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
        return ((dja) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        int i2 = 0;
        xx1 xx1Var = xx1.a;
        eja ejaVar = this.c;
        heb hebVar = heb.a;
        int i3 = 1;
        switch (i) {
            case 0:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    kb3 kb3VarE = ((c98) ejaVar.d).E(ejaVar.c);
                    cja cjaVar = new cja(ejaVar, i2);
                    this.b = 1;
                    if (kb3VarE.a(cjaVar, this) == xx1Var) {
                    }
                } else if (i4 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 1:
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    kb3 kb3VarF = ((c98) ejaVar.d).F(ejaVar.c);
                    cja cjaVar2 = new cja(ejaVar, i3);
                    this.b = 1;
                    if (kb3VarF.a(cjaVar2, this) == xx1Var) {
                    }
                } else if (i5 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 2:
                int i6 = this.b;
                if (i6 == 0) {
                    e11.e0(obj);
                    pp1 pp1VarR = qx1.R(((c98) ejaVar.d).a.F.a0(1));
                    aj2 aj2Var = rw2.a;
                    y34 y34VarE = qx1.E(pp1VarR, nh2.c);
                    cja cjaVar3 = new cja(ejaVar, 2);
                    this.b = 1;
                    Object objA = y34VarE.a(new pw5(cjaVar3, 6), this);
                    if (objA != xx1Var) {
                        objA = hebVar;
                    }
                    if (objA == xx1Var) {
                    }
                } else if (i6 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i7 = this.b;
                if (i7 == 0) {
                    e11.e0(obj);
                    pp1 pp1VarR2 = qx1.R(((c98) ejaVar.d).a.F.a0(0));
                    aj2 aj2Var2 = rw2.a;
                    y34 y34VarE2 = qx1.E(pp1VarR2, nh2.c);
                    cja cjaVar4 = new cja(ejaVar, 3);
                    this.b = 1;
                    Object objA2 = y34VarE2.a(new pw5(cjaVar4, 7), this);
                    if (objA2 != xx1Var) {
                        objA2 = hebVar;
                    }
                    if (objA2 == xx1Var) {
                    }
                } else if (i7 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return hebVar;
    }
}

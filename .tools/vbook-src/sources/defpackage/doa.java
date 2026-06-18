package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class doa extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ joa c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doa(joa joaVar, int i, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 4;
        this.c = joaVar;
        this.b = i;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        joa joaVar = this.c;
        switch (i) {
            case 0:
                return new doa(joaVar, jt1Var, 0);
            case 1:
                return new doa(joaVar, jt1Var, 1);
            case 2:
                return new doa(joaVar, jt1Var, 2);
            case 3:
                return new doa(joaVar, jt1Var, 3);
            default:
                return new doa(joaVar, this.b, jt1Var);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                return ((doa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
            case 1:
                return ((doa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
            case 2:
                return ((doa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
            case 3:
                ((doa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                return xx1.a;
            default:
                ((doa) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                return hebVar;
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.a;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        joa joaVar = this.c;
        jt1 jt1Var = null;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    h8b h8bVar = joaVar.c;
                    fr9 fr9Var = h8bVar.c;
                    fr9 fr9Var2 = h8bVar.b;
                    f45 f45Var = new f45(3, 4, jt1Var);
                    coa coaVar = new coa(joaVar, 0);
                    this.b = 1;
                    Object objM0 = h67.m0(this, coaVar, r90.d, new xa((Object) f45Var, jt1Var, 13), new b24[]{fr9Var, fr9Var2});
                    if (objM0 != xx1Var) {
                        objM0 = hebVar;
                    }
                    if (objM0 == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 1:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    d6a d6aVar = vg3.a;
                    tg3 tg3Var = new tg3(0, (xz6) vg3.a.getValue(), ug8.a(d8b.class));
                    c69 c69Var = new c69(joaVar, jt1Var, 8);
                    this.b = 1;
                    if (cx1.G(tg3Var, c69Var, this) == xx1Var) {
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
            case 2:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    b24 b24VarL = cx1.L(new u31(joaVar.c.a, 6));
                    coa coaVar2 = new coa(joaVar, 1);
                    this.b = 1;
                    if (b24VarL.a(coaVar2, this) == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i4 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
            case 3:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                        if2.c();
                    }
                    return null;
                }
                e11.e0(obj);
                fr9 fr9Var3 = joaVar.c.a;
                coa coaVar3 = new coa(joaVar, 2);
                this.b = 1;
                fr9Var3.a(coaVar3, this);
                return xx1Var;
            default:
                e11.e0(obj);
                joaVar.d.a(this.b, 0, ((gna) joaVar.v.getValue()).a);
                return hebVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ doa(joa joaVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = joaVar;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jsb extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ gqb c;
    public final /* synthetic */ qsb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsb(qsb qsbVar, gqb gqbVar, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 5;
        this.d = qsbVar;
        this.c = gqbVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        gqb gqbVar = this.c;
        qsb qsbVar = this.d;
        switch (i) {
            case 0:
                return new jsb(gqbVar, qsbVar, jt1Var, 0);
            case 1:
                return new jsb(gqbVar, qsbVar, jt1Var, 1);
            case 2:
                return new jsb(gqbVar, qsbVar, jt1Var, 2);
            case 3:
                return new jsb(gqbVar, qsbVar, jt1Var, 3);
            case 4:
                return new jsb(gqbVar, qsbVar, jt1Var, 4);
            default:
                return new jsb(qsbVar, gqbVar, jt1Var);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.a;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                return ((jsb) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
            case 1:
                ((jsb) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                return xx1Var;
            case 2:
                return ((jsb) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
            case 3:
                ((jsb) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                return xx1Var;
            case 4:
                return ((jsb) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
            default:
                ((jsb) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                return xx1Var;
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.a;
        heb hebVar = heb.a;
        gqb gqbVar = this.c;
        qsb qsbVar = this.d;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    b24 b24VarP = gqbVar.p();
                    isb isbVar = new isb(qsbVar, 0);
                    this.b = 1;
                    if (b24VarP.a(isbVar, this) == xx1Var) {
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 1:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    fr9 fr9VarR = gqbVar.r();
                    isb isbVar2 = new isb(qsbVar, 1);
                    this.b = 1;
                    fr9VarR.a(isbVar2, this);
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                    if2.c();
                }
                break;
            case 2:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    b24 b24VarE = gqbVar.e();
                    isb isbVar3 = new isb(qsbVar, 2);
                    this.b = 1;
                    if (b24VarE.a(isbVar3, this) == xx1Var) {
                    }
                } else if (i4 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 3:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    dr9 dr9VarH = gqbVar.h();
                    isb isbVar4 = new isb(qsbVar, 3);
                    this.b = 1;
                    if (dr9VarH.a(isbVar4, this) == xx1Var) {
                    }
                }
                if2.c();
                break;
            case 4:
                int i6 = this.b;
                if (i6 == 0) {
                    e11.e0(obj);
                    b24 b24VarO = gqbVar.o();
                    isb isbVar5 = new isb(qsbVar, 4);
                    this.b = 1;
                    if (b24VarO.a(isbVar5, this) == xx1Var) {
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
                    ea9 ea9Var = qsbVar.s;
                    rb9 rb9Var = new rb9(gqbVar, 12);
                    this.b = 1;
                    ea9Var.a(rb9Var, this);
                } else if (i7 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                    if2.c();
                }
                break;
        }
        return xx1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jsb(gqb gqbVar, qsb qsbVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = gqbVar;
        this.d = qsbVar;
    }
}

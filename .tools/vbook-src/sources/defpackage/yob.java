package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yob extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ qsb c;
    public final /* synthetic */ zob d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yob(qsb qsbVar, zob zobVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = qsbVar;
        this.d = zobVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        zob zobVar = this.d;
        qsb qsbVar = this.c;
        switch (i) {
            case 0:
                return new yob(qsbVar, zobVar, jt1Var, 0);
            case 1:
                return new yob(qsbVar, zobVar, jt1Var, 1);
            case 2:
                return new yob(qsbVar, zobVar, jt1Var, 2);
            case 3:
                return new yob(qsbVar, zobVar, jt1Var, 3);
            case 4:
                return new yob(qsbVar, zobVar, jt1Var, 4);
            default:
                return new yob(qsbVar, zobVar, jt1Var, 5);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                ((yob) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 1:
                ((yob) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 2:
                ((yob) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 3:
                ((yob) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            case 4:
                ((yob) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((yob) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return xx1Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        zob zobVar = this.d;
        qsb qsbVar = this.c;
        xx1 xx1Var = xx1.a;
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
                    fe8 fe8Var = qsbVar.g;
                    xob xobVar = new xob(zobVar, 0);
                    this.b = 1;
                    if (fe8Var.a.a(xobVar, this) == xx1Var) {
                    }
                }
                if2.c();
                break;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    fe8 fe8Var2 = qsbVar.h;
                    xob xobVar2 = new xob(zobVar, 1);
                    this.b = 1;
                    if (fe8Var2.a.a(xobVar2, this) == xx1Var) {
                    }
                }
                if2.c();
                break;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    fe8 fe8Var3 = qsbVar.j;
                    xob xobVar3 = new xob(zobVar, 2);
                    this.b = 1;
                    if (fe8Var3.a.a(xobVar3, this) == xx1Var) {
                    }
                }
                if2.c();
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
                    fe8 fe8Var4 = qsbVar.l;
                    xob xobVar4 = new xob(zobVar, 3);
                    this.b = 1;
                    if (fe8Var4.a.a(xobVar4, this) == xx1Var) {
                    }
                }
                if2.c();
                break;
            case 4:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    fe8 fe8Var5 = qsbVar.k;
                    xob xobVar5 = new xob(zobVar, 4);
                    this.b = 1;
                    if (fe8Var5.a.a(xobVar5, this) == xx1Var) {
                    }
                }
                if2.c();
                break;
            default:
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    ng8 ng8Var = new ng8();
                    fe8 fe8Var6 = qsbVar.m;
                    l51 l51Var = new l51(18, ng8Var, zobVar);
                    this.b = 1;
                    if (fe8Var6.a.a(l51Var, this) == xx1Var) {
                    }
                }
                if2.c();
                break;
        }
        return null;
    }
}

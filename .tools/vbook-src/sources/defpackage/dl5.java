package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dl5 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yb4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dl5(yb4 yb4Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = yb4Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        yb4 yb4Var = this.d;
        switch (i) {
            case 0:
                dl5 dl5Var = new dl5(yb4Var, jt1Var, 0);
                dl5Var.c = obj;
                return dl5Var;
            case 1:
                dl5 dl5Var2 = new dl5(yb4Var, jt1Var, 1);
                dl5Var2.c = obj;
                return dl5Var2;
            case 2:
                dl5 dl5Var3 = new dl5(yb4Var, jt1Var, 2);
                dl5Var3.c = obj;
                return dl5Var3;
            default:
                dl5 dl5Var4 = new dl5(yb4Var, jt1Var, 3);
                dl5Var4.c = obj;
                return dl5Var4;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                return ((dl5) create((gv4) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 1:
                return ((dl5) create((pz6) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 2:
                return ((dl5) create((pz6) obj, (jt1) obj2)).invokeSuspend(hebVar);
            default:
                return ((dl5) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        yb4 yb4Var = this.d;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    gv4 gv4Var = (gv4) this.c;
                    this.c = yb4Var;
                    this.b = 1;
                    obj = ql9.r(gv4Var, this);
                    if (obj != xx1Var) {
                    }
                    return xx1Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        e11.e0(obj);
                        return obj;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yb4Var = (yb4) this.c;
                e11.e0(obj);
                this.c = null;
                this.b = 2;
                Object objInvoke = yb4Var.invoke(obj, this);
                if (objInvoke != xx1Var) {
                    return objInvoke;
                }
                return xx1Var;
            case 1:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    pz6 pz6Var = (pz6) this.c;
                    this.b = 1;
                    obj = yb4Var.invoke(pz6Var, this);
                    if (obj == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                pz6 pz6Var2 = (pz6) obj;
                pz6Var2.getClass();
                ((AtomicBoolean) pz6Var2.b.b).set(true);
                return pz6Var2;
            case 2:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    pz6 pz6VarG = ((pz6) this.c).g();
                    this.c = pz6VarG;
                    this.b = 1;
                    return yb4Var.invoke(pz6VarG, this) == xx1Var ? xx1Var : pz6VarG;
                }
                if (i4 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pz6 pz6Var3 = (pz6) this.c;
                e11.e0(obj);
                return pz6Var3;
            default:
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    vx1 vx1Var = (vx1) this.c;
                    this.b = 1;
                    if (yb4Var.invoke(vx1Var, this) == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i5 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return heb.a;
        }
    }
}

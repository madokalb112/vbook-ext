package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pr3 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ sr3 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pr3(sr3 sr3Var, String str, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = sr3Var;
        this.d = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        String str = this.d;
        sr3 sr3Var = this.c;
        switch (i) {
            case 0:
                return new pr3(sr3Var, str, jt1Var, 0);
            case 1:
                return new pr3(sr3Var, str, jt1Var, 1);
            default:
                return new pr3(sr3Var, str, jt1Var, 2);
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
        return ((pr3) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        Object objG0 = lc3.a;
        String str = this.d;
        sr3 sr3Var = this.c;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                io3 io3Var = sr3Var.e;
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        e11.e0(obj);
                    } else if (i2 != 2) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    u31 u31Var = new u31(((jo3) io3Var).c, 2);
                    this.b = 1;
                    obj = cx1.N(u31Var, this);
                    if (obj == xx1Var) {
                    }
                }
                List list = (List) obj;
                if (str.length() != 0) {
                    objG0 = list.contains(str) ? fc1.G0(list, str) : fc1.J0(list, str);
                }
                this.b = 2;
                jo3 jo3Var = (jo3) io3Var;
                qt qtVar = jo3Var.a;
                te5 te5Var = ue5.d;
                te5Var.getClass();
                qtVar.Q.e(qt.T[43], te5Var.b(new wv(tv9.a, 0), objG0));
                fr9 fr9Var = jo3Var.c;
                fr9Var.getClass();
                fr9Var.l(null, objG0);
                if (hebVar == xx1Var) {
                }
                break;
            case 1:
                io3 io3Var2 = sr3Var.e;
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        e11.e0(obj);
                    } else if (i3 != 2) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    u31 u31Var2 = new u31(((jo3) io3Var2).b, 2);
                    this.b = 1;
                    obj = cx1.N(u31Var2, this);
                    if (obj == xx1Var) {
                    }
                }
                List list2 = (List) obj;
                if (str.length() != 0) {
                    objG0 = list2.contains(str) ? fc1.G0(list2, str) : fc1.J0(list2, str);
                }
                this.b = 2;
                jo3 jo3Var2 = (jo3) io3Var2;
                qt qtVar2 = jo3Var2.a;
                te5 te5Var2 = ue5.d;
                te5Var2.getClass();
                qtVar2.P.e(qt.T[42], te5Var2.b(new wv(tv9.a, 0), objG0));
                fr9 fr9Var2 = jo3Var2.b;
                fr9Var2.getClass();
                fr9Var2.l(null, objG0);
                if (hebVar == xx1Var) {
                }
                break;
            default:
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
                    qp3 qp3Var = sr3Var.c;
                    this.b = 1;
                    ((cq3) qp3Var).a(str);
                    if (hebVar == xx1Var) {
                    }
                }
                break;
        }
        return hebVar;
    }
}

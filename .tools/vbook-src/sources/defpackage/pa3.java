package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pa3 extends o1a implements yb4 {
    public final /* synthetic */ int a = 1;
    public int b;
    public a07 c;
    public final /* synthetic */ a07 d;
    public final /* synthetic */ a07 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa3(a07 a07Var, a07 a07Var2, a07 a07Var3, jt1 jt1Var) {
        super(2, jt1Var);
        this.c = a07Var;
        this.d = a07Var2;
        this.e = a07Var3;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        a07 a07Var = this.e;
        a07 a07Var2 = this.d;
        switch (i) {
            case 0:
                return new pa3(a07Var2, a07Var, jt1Var);
            default:
                return new pa3(this.c, a07Var2, a07Var, jt1Var);
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
        return ((pa3) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.a;
        a07 a07Var = this.e;
        xx1 xx1Var = xx1.a;
        a07 a07Var2 = this.d;
        heb hebVar = heb.a;
        int i2 = 1;
        jt1 jt1Var = null;
        switch (i) {
            case 0:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        a07Var = this.c;
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    aj2 aj2Var = rw2.a;
                    nh2 nh2Var = nh2.c;
                    l12 l12Var = new l12(a07Var2, jt1Var, i2);
                    this.c = a07Var;
                    this.b = 1;
                    obj = ah1.b0(nh2Var, l12Var, this);
                    if (obj == xx1Var) {
                    }
                }
                a07Var.setValue((List) obj);
                break;
            default:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        e11.e0(obj);
                    } else if (i4 != 2) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    aj2 aj2Var2 = rw2.a;
                    nh2 nh2Var2 = nh2.c;
                    l12 l12Var2 = new l12(this.c, jt1Var, 4);
                    this.b = 1;
                    obj = ah1.b0(nh2Var2, l12Var2, this);
                    if (obj == xx1Var) {
                    }
                }
                List list = (List) obj;
                if (list.isEmpty()) {
                    a07Var2.setValue("");
                } else {
                    pp1 pp1VarC = dk9.C(new vb9(a07Var, 14));
                    aj2 aj2Var3 = rw2.a;
                    b24 b24VarS = cx1.S(pp1VarC, nh2.c);
                    l51 l51Var = new l51(13, list, a07Var2);
                    this.b = 2;
                    if (b24VarS.a(l51Var, this) == xx1Var) {
                    }
                }
                break;
        }
        return hebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa3(a07 a07Var, a07 a07Var2, jt1 jt1Var) {
        super(2, jt1Var);
        this.d = a07Var;
        this.e = a07Var2;
    }
}

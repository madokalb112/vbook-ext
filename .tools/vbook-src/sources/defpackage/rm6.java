package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rm6 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ List d;
    public final /* synthetic */ a07 e;
    public final /* synthetic */ a07 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm6(List list, a07 a07Var, a07 a07Var2, a07 a07Var3, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 0;
        this.d = list;
        this.c = a07Var;
        this.e = a07Var2;
        this.f = a07Var3;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new rm6(this.d, this.c, this.e, this.f, jt1Var);
            case 1:
                return new rm6(this.c, this.d, this.e, this.f, jt1Var, 1);
            default:
                return new rm6(this.c, this.d, this.e, this.f, jt1Var, 2);
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
        return ((rm6) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    aj2 aj2Var = rw2.a;
                    nh2 nh2Var = nh2.c;
                    hl hlVar = new hl(this.d, this.c, this.e, this.f, null, 4);
                    this.b = 1;
                    if (ah1.b0(nh2Var, hlVar, this) == xx1Var) {
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
                    a07 a07Var = this.c;
                    pp1 pp1VarC = dk9.C(new lz4(a07Var, 21));
                    vm6 vm6Var = new vm6(this.d, this.e, a07Var, this.f, 0);
                    this.b = 1;
                    if (pp1VarC.a(vm6Var, this) == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    a07 a07Var2 = this.c;
                    pp1 pp1VarC2 = dk9.C(new bq6(a07Var2, 8));
                    vm6 vm6Var2 = new vm6(this.d, this.e, a07Var2, this.f, 1);
                    this.b = 1;
                    if (pp1VarC2.a(vm6Var2, this) == xx1Var) {
                    }
                } else if (i4 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rm6(a07 a07Var, List list, a07 a07Var2, a07 a07Var3, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = a07Var;
        this.d = list;
        this.e = a07Var2;
        this.f = a07Var3;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ht5 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ br9 c;
    public final /* synthetic */ a07 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ht5(br9 br9Var, a07 a07Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = br9Var;
        this.d = a07Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        a07 a07Var = this.d;
        br9 br9Var = this.c;
        switch (i) {
            case 0:
                return new ht5(br9Var, a07Var, jt1Var, 0);
            case 1:
                return new ht5(br9Var, a07Var, jt1Var, 1);
            case 2:
                return new ht5(br9Var, a07Var, jt1Var, 2);
            default:
                return new ht5(br9Var, a07Var, jt1Var, 3);
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
        return ((ht5) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.d;
        br9 br9Var = this.c;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    pp1 pp1VarC = dk9.C(new op0(br9Var, 11));
                    mz4 mz4Var = new mz4(a07Var, 1);
                    this.b = 1;
                    if (pp1VarC.a(mz4Var, this) == xx1Var) {
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
                    pp1 pp1VarC2 = dk9.C(new op0(br9Var, 12));
                    mz4 mz4Var2 = new mz4(a07Var, 2);
                    this.b = 1;
                    if (pp1VarC2.a(mz4Var2, this) == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 2:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    pp1 pp1VarC3 = dk9.C(new op0(br9Var, 13));
                    mz4 mz4Var3 = new mz4(a07Var, 3);
                    this.b = 1;
                    if (pp1VarC3.a(mz4Var3, this) == xx1Var) {
                    }
                } else if (i4 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    pp1 pp1VarC4 = dk9.C(new op0(br9Var, 14));
                    mz4 mz4Var4 = new mz4(a07Var, 4);
                    this.b = 1;
                    if (pp1VarC4.a(mz4Var4, this) == xx1Var) {
                    }
                } else if (i5 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }
}

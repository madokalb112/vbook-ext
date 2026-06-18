package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sq2 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ wq5 d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sq2(kb4 kb4Var, wq5 wq5Var, float f, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = kb4Var;
        this.d = wq5Var;
        this.e = f;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new sq2(this.c, this.d, this.e, jt1Var, 0);
            default:
                return new sq2(this.c, this.d, this.e, jt1Var, 1);
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
        return ((sq2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        final float f = this.e;
        final wq5 wq5Var = this.d;
        xx1 xx1Var = xx1.a;
        final int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    final int i4 = 0;
                    pp1 pp1VarC = dk9.C(new ib4() { // from class: rq2
                        @Override // defpackage.ib4
                        public final Object invoke() {
                            int i5 = i4;
                            float f2 = f;
                            wq5 wq5Var2 = wq5Var;
                            switch (i5) {
                                case 0:
                                    return Float.valueOf(wq5Var2.h() <= 0 ? wx1.P(wq5Var2.i() / f2, 0.0f, 0.7f) : 0.7f);
                                default:
                                    return Float.valueOf(wq5Var2.h() <= 0 ? wx1.P(wq5Var2.i() / f2, 0.0f, 0.7f) : 0.7f);
                            }
                        }
                    });
                    r51 r51Var = new r51(2, this.c, kc5.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1);
                    this.b = 1;
                    if (cx1.G(pp1VarC, r51Var, this) == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    pp1 pp1VarC2 = dk9.C(new ib4() { // from class: rq2
                        @Override // defpackage.ib4
                        public final Object invoke() {
                            int i52 = i2;
                            float f2 = f;
                            wq5 wq5Var2 = wq5Var;
                            switch (i52) {
                                case 0:
                                    return Float.valueOf(wq5Var2.h() <= 0 ? wx1.P(wq5Var2.i() / f2, 0.0f, 0.7f) : 0.7f);
                                default:
                                    return Float.valueOf(wq5Var2.h() <= 0 ? wx1.P(wq5Var2.i() / f2, 0.0f, 0.7f) : 0.7f);
                            }
                        }
                    });
                    r51 r51Var2 = new r51(2, this.c, kc5.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2);
                    this.b = 1;
                    if (cx1.G(pp1VarC2, r51Var2, this) == xx1Var) {
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

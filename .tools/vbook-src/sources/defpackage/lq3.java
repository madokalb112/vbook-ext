package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lq3 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mq3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lq3(mq3 mq3Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = mq3Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        mq3 mq3Var = this.d;
        switch (i) {
            case 0:
                lq3 lq3Var = new lq3(mq3Var, jt1Var, 0);
                lq3Var.c = obj;
                return lq3Var;
            case 1:
                lq3 lq3Var2 = new lq3(mq3Var, jt1Var, 1);
                lq3Var2.c = obj;
                return lq3Var2;
            case 2:
                lq3 lq3Var3 = new lq3(mq3Var, jt1Var, 2);
                lq3Var3.c = obj;
                return lq3Var3;
            default:
                lq3 lq3Var4 = new lq3(mq3Var, jt1Var, 3);
                lq3Var4.c = obj;
                return lq3Var4;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        kb5 kb5Var = (kb5) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((lq3) create(kb5Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        mq3 mq3Var = this.d;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                kb5 kb5Var = (kb5) this.c;
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    this.c = null;
                    this.b = 1;
                    if (mq3.b(mq3Var, kb5Var, this) == xx1Var) {
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 1:
                kb5 kb5Var2 = (kb5) this.c;
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    this.c = null;
                    this.b = 1;
                    if (mq3.c(mq3Var, kb5Var2, this) == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 2:
                kb5 kb5Var3 = (kb5) this.c;
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    this.c = null;
                    this.b = 1;
                    if (mq3.d(mq3Var, kb5Var3, this) == xx1Var) {
                    }
                } else if (i4 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                kb5 kb5Var4 = (kb5) this.c;
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    this.c = null;
                    this.b = 1;
                    if (mq3.a(mq3Var, kb5Var4, this) == xx1Var) {
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

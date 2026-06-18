package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class iw8 extends o1a implements yb4 {
    public final /* synthetic */ int a = 0;
    public int b;
    public final /* synthetic */ float c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw8(n7c n7cVar, eb7 eb7Var, eb7 eb7Var2, float f, jt1 jt1Var) {
        super(2, jt1Var);
        this.d = n7cVar;
        this.e = eb7Var;
        this.f = eb7Var2;
        this.c = f;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                iw8 iw8Var = new iw8(this.c, (ko) obj3, (og8) obj2, jt1Var);
                iw8Var.d = obj;
                return iw8Var;
            default:
                return new iw8((n7c) this.d, (eb7) obj3, (eb7) obj2, this.c, jt1Var);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                return ((iw8) create((tw8) obj, (jt1) obj2)).invokeSuspend(hebVar);
            default:
                return ((iw8) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    ot1 ot1Var = new ot1((og8) obj2, (tw8) this.d);
                    this.b = 1;
                    if (uj9.c(0.0f, this.c, (ko) obj3, ot1Var, this, 4) == xx1Var) {
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    n7c n7cVar = (n7c) this.d;
                    long j = ((eb7) obj3).a;
                    long j2 = ((eb7) obj2).a;
                    this.b = 1;
                    if (n7cVar.m(j, j2, this.c, this) == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw8(float f, ko koVar, og8 og8Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.c = f;
        this.e = koVar;
        this.f = og8Var;
    }
}

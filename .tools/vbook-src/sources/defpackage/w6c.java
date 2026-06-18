package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w6c extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ eb7 c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6c(Object obj, eb7 eb7Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
        this.c = eb7Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        eb7 eb7Var = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return new w6c((n7c) obj2, eb7Var, jt1Var, 0);
            default:
                return new w6c((e7c) obj2, eb7Var, jt1Var, 1);
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
        return ((w6c) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        eb7 eb7Var = this.c;
        xx1 xx1Var = xx1.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                n7c n7cVar = (n7c) obj2;
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    boolean zK = n7cVar.k();
                    float fMax = zK ? Math.max(n7cVar.b, ((ti7) n7cVar.d.getValue()) != null ? 1.0f : 0.0f) : n7cVar.e;
                    long jI = zK ? 0L : eb7.i(fMax, n7cVar.b(eb7Var.a));
                    this.b = 1;
                    if (n7c.a(n7cVar, fMax, jI, this, 4) == xx1Var) {
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                e7c e7cVar = (e7c) obj2;
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    long jO0 = vo1.o0(e7cVar.C.c.i(vo1.g0(eb7Var.a)));
                    o7c o7cVar = e7cVar.C;
                    this.b = 1;
                    if (o7cVar.c.h(vo1.g0(jO0), true, this) == xx1Var) {
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
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class s6c extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ n7c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s6c(n7c n7cVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = n7cVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        n7c n7cVar = this.c;
        switch (i) {
            case 0:
                return new s6c(n7cVar, jt1Var, 0);
            default:
                return new s6c(n7cVar, jt1Var, 1);
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
        return ((s6c) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
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
                    n7c n7cVar = this.c;
                    if (!((Boolean) n7cVar.q.getValue()).booleanValue()) {
                        bb1 bb1Var = ((ti7) n7cVar.d.getValue()) != null ? new bb1(1.0f, 1.0f) : null;
                        if (bb1Var != null) {
                            float fFloatValue = new Float(n7cVar.f()).floatValue();
                            if (fFloatValue < bb1Var.a || fFloatValue > bb1Var.b) {
                                float fFloatValue2 = ((Number) wx1.S(new Float(n7cVar.f()), bb1Var)).floatValue();
                                this.b = 1;
                                if (n7c.a(n7cVar, fFloatValue2, 0L, this, 6) == xx1Var) {
                                }
                            }
                        }
                    }
                }
                break;
            default:
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
                    this.b = 1;
                    n7c n7cVar2 = this.c;
                    Object objC = uj9.c(n7cVar2.e(), 0.0f, (ko) null, new f7c(n7cVar2, 1), this, 12);
                    if (objC != xx1Var) {
                        objC = hebVar;
                    }
                    if (objC == xx1Var) {
                    }
                }
                break;
        }
        return hebVar;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sa7 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wh7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sa7(wh7 wh7Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = wh7Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        wh7 wh7Var = this.d;
        switch (i) {
            case 0:
                sa7 sa7Var = new sa7(wh7Var, jt1Var, 0);
                sa7Var.c = obj;
                return sa7Var;
            default:
                sa7 sa7Var2 = new sa7(wh7Var, jt1Var, 1);
                sa7Var2.c = obj;
                return sa7Var2;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        i3c i3cVar = (i3c) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((sa7) create(i3cVar, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        wh7 wh7Var = this.d;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                i3c i3cVar = (i3c) this.c;
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    bv0 bv0Var = i3cVar.a;
                    this.c = null;
                    this.b = 1;
                    if (((vh7) wh7Var).e(bv0Var, this) == xx1Var) {
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                i3c i3cVar2 = (i3c) this.c;
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    bv0 bv0Var2 = i3cVar2.a;
                    this.c = null;
                    this.b = 1;
                    if (((vh7) wh7Var).e(bv0Var2, this) == xx1Var) {
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

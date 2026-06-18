package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tz7 extends om8 implements yb4 {
    public final /* synthetic */ int b;
    public int c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tz7(int i, int i2, jt1 jt1Var) {
        super(i, jt1Var);
        this.b = i2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.b) {
            case 0:
                tz7 tz7Var = new tz7(2, 0, jt1Var);
                tz7Var.d = obj;
                return tz7Var;
            default:
                tz7 tz7Var2 = new tz7(2, 1, jt1Var);
                tz7Var2.d = obj;
                return tz7Var2;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        heb hebVar = heb.a;
        u1a u1aVar = (u1a) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((tz7) create(u1aVar, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.b;
        nx7 nx7Var = nx7.b;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.c;
                if (i2 == 0) {
                    e11.e0(obj);
                    u1a u1aVar = (u1a) this.d;
                    this.c = 1;
                    Object objJ = aaa.j(u1aVar, nx7Var, this);
                    if (objJ == xx1Var) {
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                u1a u1aVar2 = (u1a) this.d;
                int i3 = this.c;
                if (i3 == 0) {
                    e11.e0(obj);
                    this.d = null;
                    this.c = 1;
                    Object objJ2 = aaa.j(u1aVar2, nx7Var, this);
                    if (objJ2 == xx1Var) {
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

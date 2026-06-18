package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dj8 extends o1a implements kb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ gj8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dj8(gj8 gj8Var, jt1 jt1Var, int i) {
        super(1, jt1Var);
        this.a = i;
        this.c = gj8Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new dj8(this.c, jt1Var, 0);
            default:
                return new dj8(this.c, jt1Var, 1);
        }
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = (jt1) obj;
        switch (i) {
        }
        return ((dj8) create(jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        gj8 gj8Var = this.c;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    if (gj8.a(gj8Var, vx8.a, this) == xx1Var) {
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
                    this.b = 1;
                    if (gj8.a(gj8Var, vx8.b, this) == xx1Var) {
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

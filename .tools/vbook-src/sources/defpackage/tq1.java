package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tq1 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ut0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tq1(ut0 ut0Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = ut0Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                tq1 tq1Var = new tq1(this.c, jt1Var, 0);
                tq1Var.b = obj;
                return tq1Var;
            default:
                tq1 tq1Var2 = new tq1(this.c, jt1Var, 1);
                tq1Var2.b = obj;
                return tq1Var2;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((tq1) create(obj, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        boolean z = true;
        ut0 ut0Var = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                if (obj2 == null && !ut0Var.i()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                e11.e0(obj);
                if (obj2 == null && !ut0Var.i()) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}

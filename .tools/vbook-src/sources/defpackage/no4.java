package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class no4 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ro4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ no4(ro4 ro4Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = ro4Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        ro4 ro4Var = this.b;
        switch (i) {
            case 0:
                return new no4(ro4Var, jt1Var, 0);
            default:
                return new no4(ro4Var, jt1Var, 1);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                ((no4) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((no4) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i = this.a;
        heb hebVar = heb.a;
        ro4 ro4Var = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                ly8 ly8Var = ro4Var.e;
                fr9 fr9Var = ro4Var.f;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, jo4.a((jo4) value, false, !((my8) ly8Var).b(), ((my8) ly8Var).c(), null, 9)));
                }
                break;
            default:
                e11.e0(obj);
                ro4Var.k();
                break;
        }
        return hebVar;
    }
}

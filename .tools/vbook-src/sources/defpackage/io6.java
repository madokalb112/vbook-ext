package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class io6 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb9 b;
    public final /* synthetic */ vx1 c;
    public final /* synthetic */ a07 d;

    public /* synthetic */ io6(int i, vx1 vx1Var, a07 a07Var, kb9 kb9Var) {
        this.a = i;
        this.b = kb9Var;
        this.c = vx1Var;
        this.d = a07Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        lb9 lb9Var = lb9.b;
        lb9 lb9Var2 = lb9.a;
        int i2 = 1;
        heb hebVar = heb.a;
        a07 a07Var = this.d;
        vx1 vx1Var = this.c;
        kb9 kb9Var = this.b;
        jt1 jt1Var = null;
        switch (i) {
            case 0:
                if (kb9Var.b() == lb9Var && kb9Var.c()) {
                    if (kb9Var.d() != lb9.c) {
                        ah1.J(vx1Var, null, null, new ro6(kb9Var, jt1Var, 0), 3);
                    }
                } else if (kb9Var.d() != lb9Var2) {
                    ah1.J(vx1Var, null, null, new ro6(kb9Var, jt1Var, i2), 3).invokeOnCompletion(true, true, new cl6(a07Var, 29));
                }
                break;
            case 1:
                if (((Boolean) kb9Var.b.d.invoke(lb9Var2)).booleanValue()) {
                    ah1.J(vx1Var, null, null, new ro6(kb9Var, jt1Var, 7), 3).invokeOnCompletion(new lo6(kb9Var, a07Var, 1));
                }
                break;
            case 2:
                if (kb9Var.b() == lb9Var && kb9Var.c()) {
                    ah1.J(vx1Var, null, null, new ro6(kb9Var, jt1Var, 5), 3);
                } else {
                    ah1.J(vx1Var, null, null, new ro6(kb9Var, jt1Var, 6), 3).invokeOnCompletion(true, true, new cl6(a07Var, 28));
                }
                break;
            default:
                if (((Boolean) kb9Var.b.d.invoke(lb9Var2)).booleanValue() && kb9Var.d() != lb9Var2) {
                    ah1.J(vx1Var, null, null, new ro6(kb9Var, jt1Var, 4), 3).invokeOnCompletion(new lo6(kb9Var, a07Var, 2));
                }
                break;
        }
        return hebVar;
    }
}

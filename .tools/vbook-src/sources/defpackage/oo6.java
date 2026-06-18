package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class oo6 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vx1 b;
    public final /* synthetic */ kb9 c;
    public final /* synthetic */ a07 d;

    public /* synthetic */ oo6(int i, vx1 vx1Var, a07 a07Var, kb9 kb9Var) {
        this.a = i;
        this.b = vx1Var;
        this.c = kb9Var;
        this.d = a07Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.d;
        kb9 kb9Var = this.c;
        vx1 vx1Var = this.b;
        float fFloatValue = ((Float) obj).floatValue();
        switch (i) {
            case 0:
                ah1.J(vx1Var, null, null, new uo6(kb9Var, fFloatValue, null, 1), 3).invokeOnCompletion(new lo6(kb9Var, a07Var, 0));
                break;
            default:
                ah1.J(vx1Var, null, null, new uo6(kb9Var, fFloatValue, null, 0), 3).invokeOnCompletion(new lo6(kb9Var, a07Var, 3));
                break;
        }
        return hebVar;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ot1 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ og8 b;
    public final /* synthetic */ tw8 c;

    public /* synthetic */ ot1(og8 og8Var, tw8 tw8Var) {
        this.a = 1;
        this.b = og8Var;
        this.c = tw8Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        og8 og8Var = this.b;
        tw8 tw8Var = this.c;
        float fFloatValue = ((Float) obj).floatValue();
        ((Float) obj2).getClass();
        switch (i) {
            case 0:
                tw8Var.a(Math.abs(fFloatValue - og8Var.a));
                og8Var.a = fFloatValue;
                break;
            case 1:
                float f = og8Var.a;
                og8Var.a = tw8Var.a(fFloatValue - f) + f;
                break;
            default:
                tw8Var.a(Math.abs(fFloatValue - og8Var.a));
                og8Var.a = fFloatValue;
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ot1(tw8 tw8Var, og8 og8Var, int i) {
        this.a = i;
        this.c = tw8Var;
        this.b = og8Var;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class kq6 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ib4 f;

    public /* synthetic */ kq6(kb4 kb4Var, float f, float f2, float f3, ib4 ib4Var, int i) {
        this.a = i;
        this.b = kb4Var;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = ib4Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        ib4 ib4Var = this.f;
        float f = this.e;
        float f2 = this.d;
        float f3 = this.c;
        kb4 kb4Var = this.b;
        switch (i) {
            case 0:
                kb4Var.invoke(Float.valueOf(Math.max(f3 - f2, f)));
                if (ib4Var != null) {
                    ib4Var.invoke();
                }
                break;
            case 1:
                kb4Var.invoke(Float.valueOf(Math.min(f3 + f2, f)));
                if (ib4Var != null) {
                    ib4Var.invoke();
                }
                break;
            case 2:
                kb4Var.invoke(Float.valueOf(Math.max(f3 - f2, f)));
                if (ib4Var != null) {
                    ib4Var.invoke();
                }
                break;
            default:
                kb4Var.invoke(Float.valueOf(Math.min(f3 + f2, f)));
                if (ib4Var != null) {
                    ib4Var.invoke();
                }
                break;
        }
        return hebVar;
    }
}

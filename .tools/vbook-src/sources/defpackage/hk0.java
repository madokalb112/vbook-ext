package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hk0 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb4 b;
    public final /* synthetic */ xm3 c;

    public /* synthetic */ hk0(yb4 yb4Var, xm3 xm3Var, int i) {
        this.a = i;
        this.b = yb4Var;
        this.c = xm3Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        xm3 xm3Var = this.c;
        yb4 yb4Var = this.b;
        switch (i) {
            case 0:
                ji0 ji0Var = (ji0) obj;
                ji0Var.getClass();
                yb4Var.invoke(xm3Var.d.a, ji0Var);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                yb4Var.invoke(xm3Var.d.a, str);
                break;
        }
        return hebVar;
    }
}

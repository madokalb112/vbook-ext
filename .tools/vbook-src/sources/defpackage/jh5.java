package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class jh5 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng8 b;

    public /* synthetic */ jh5(ng8 ng8Var, int i) {
        this.a = i;
        this.b = ng8Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        ng8 ng8Var = this.b;
        switch (i) {
            case 0:
                ng8Var.a = true;
                break;
            case 1:
                if (((j09) obj).f.a.a.b.length() > 0) {
                    ng8Var.a = false;
                }
                break;
            default:
                ng8Var.a = true;
                break;
        }
        return hebVar;
    }
}

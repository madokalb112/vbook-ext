package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ik6 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u83 b;

    public /* synthetic */ ik6(u83 u83Var, int i) {
        this.a = i;
        this.b = u83Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        u83 u83Var = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).booleanValue();
                u83Var.b();
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                u83Var.getClass();
                u83Var.c(str);
                break;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                u83Var.getClass();
                u83Var.b.setValue(str2);
                break;
            default:
                p17 p17Var = (p17) obj;
                p17Var.getClass();
                u83Var.d(p17Var.c, p17Var.d, p17Var.e, !lc5.Q(p17Var.b, "general"));
                break;
        }
        return hebVar;
    }
}

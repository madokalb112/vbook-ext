package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ek6 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t83 b;

    public /* synthetic */ ek6(t83 t83Var, int i) {
        this.a = i;
        this.b = t83Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        t83 t83Var = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).booleanValue();
                t83Var.a(false);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                t83Var.getClass();
                t83Var.c.setValue(str);
                break;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                t83Var.getClass();
                t83Var.d.setValue(str2);
                break;
            default:
                String str3 = (String) obj;
                str3.getClass();
                t83Var.getClass();
                t83Var.e.setValue(str3);
                break;
        }
        return hebVar;
    }
}

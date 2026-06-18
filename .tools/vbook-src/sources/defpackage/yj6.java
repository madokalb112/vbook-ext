package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class yj6 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q83 b;

    public /* synthetic */ yj6(q83 q83Var, int i) {
        this.a = i;
        this.b = q83Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        q83 q83Var = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                q83Var.a.setValue(Boolean.FALSE);
                q83Var.b.setValue("");
                q83Var.c.setValue("");
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                q83Var.getClass();
                q83Var.b.setValue(str);
                break;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                q83Var.getClass();
                q83Var.c.setValue(str2);
                break;
            default:
                da8 da8Var = (da8) obj;
                da8Var.getClass();
                q83.a(q83Var, da8Var.c, da8Var.d, 4);
                break;
        }
        return hebVar;
    }
}

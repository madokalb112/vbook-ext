package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class sj6 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o83 b;

    public /* synthetic */ sj6(o83 o83Var, int i) {
        this.a = i;
        this.b = o83Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        o83 o83Var = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).booleanValue();
                o83Var.a(false);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                o83Var.getClass();
                o83Var.b.setValue(str);
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                o83Var.getClass();
                o83Var.c.setValue(str2);
                break;
        }
        return hebVar;
    }
}

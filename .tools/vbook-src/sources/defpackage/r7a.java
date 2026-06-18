package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class r7a implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s83 b;

    public /* synthetic */ r7a(s83 s83Var, int i) {
        this.a = i;
        this.b = s83Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        s83 s83Var = this.b;
        switch (i) {
            case 0:
                ih9 ih9Var = (ih9) obj;
                ih9Var.getClass();
                s83Var.b(ih9Var.b, ih9Var.c, ih9Var.d);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                s83Var.getClass();
                s83Var.b.setValue(str);
                break;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                s83Var.getClass();
                s83Var.c.setValue(str2);
                break;
            default:
                ((Boolean) obj).booleanValue();
                s83Var.a();
                break;
        }
        return hebVar;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ot6 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ a07 d;
    public final /* synthetic */ a07 e;

    public /* synthetic */ ot6(kb4 kb4Var, a07 a07Var, a07 a07Var2, a07 a07Var3, int i) {
        this.a = i;
        this.b = kb4Var;
        this.c = a07Var;
        this.d = a07Var2;
        this.e = a07Var3;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.e;
        a07 a07Var2 = this.d;
        a07 a07Var3 = this.c;
        kb4 kb4Var = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                if (((Boolean) a07Var3.getValue()).booleanValue()) {
                    kb4Var.invoke(str);
                } else {
                    ((kb4) a07Var2.getValue()).invoke(str);
                }
                a07Var.setValue(Boolean.FALSE);
                break;
            default:
                str.getClass();
                if (((Boolean) a07Var3.getValue()).booleanValue()) {
                    kb4Var.invoke(str);
                } else {
                    ((kb4) a07Var2.getValue()).invoke(str);
                }
                a07Var.setValue(Boolean.FALSE);
                break;
        }
        return hebVar;
    }
}

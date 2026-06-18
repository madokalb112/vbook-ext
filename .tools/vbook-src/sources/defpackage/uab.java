package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class uab implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ a07 c;

    public /* synthetic */ uab(a07 a07Var, a07 a07Var2, int i) {
        this.a = i;
        this.b = a07Var;
        this.c = a07Var2;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.c;
        a07 a07Var2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                a07Var2.setValue(Boolean.FALSE);
                a07Var.setValue(str);
                break;
            case 1:
                ihb ihbVar = (ihb) obj;
                ihbVar.getClass();
                a07Var2.setValue(ihbVar);
                a07Var.setValue(Boolean.TRUE);
                break;
            case 2:
                na5 na5Var = (na5) obj;
                a07Var2.setValue(Integer.valueOf((int) (na5Var.a >> 32)));
                a07Var.setValue(Integer.valueOf((int) (na5Var.a & 4294967295L)));
                break;
            default:
                wl5 wl5Var = (wl5) obj;
                wl5Var.getClass();
                a07Var2.setValue(wl5Var.a);
                a07Var.setValue(Boolean.FALSE);
                break;
        }
        return hebVar;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class vt2 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;
    public final /* synthetic */ a07 c;

    public /* synthetic */ vt2(int i, kb4 kb4Var, a07 a07Var) {
        this.a = i;
        this.b = kb4Var;
        this.c = a07Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.c;
        kb4 kb4Var = this.b;
        switch (i) {
            case 0:
                to3 to3Var = (to3) obj;
                to3Var.getClass();
                a07Var.setValue(Boolean.FALSE);
                kb4Var.invoke(to3Var.a);
                break;
            case 1:
                Integer num = (Integer) obj;
                num.getClass();
                kb4Var.invoke(num);
                a07Var.setValue(Boolean.FALSE);
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                a07Var.setValue(Boolean.FALSE);
                kb4Var.invoke(str);
                break;
            default:
                Long l = (Long) obj;
                l.getClass();
                a07Var.setValue(Boolean.FALSE);
                kb4Var.invoke(l);
                break;
        }
        return hebVar;
    }
}

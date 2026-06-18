package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class wl3 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ a07 d;

    public /* synthetic */ wl3(int i, kb4 kb4Var, kb4 kb4Var2, a07 a07Var) {
        this.a = i;
        this.b = kb4Var;
        this.c = kb4Var2;
        this.d = a07Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.d;
        kb4 kb4Var = this.c;
        kb4 kb4Var2 = this.b;
        switch (i) {
            case 0:
                kb4Var2.invoke((String) a07Var.getValue());
                kb4Var.invoke(Boolean.FALSE);
                break;
            case 1:
                kb4Var2.invoke((String) a07Var.getValue());
                kb4Var.invoke(Boolean.FALSE);
                break;
            case 2:
                kb4Var2.invoke(Boolean.FALSE);
                kb4Var.invoke((String) a07Var.getValue());
                a07Var.setValue("");
                break;
            case 3:
                kb4Var2.invoke((String) a07Var.getValue());
                kb4Var.invoke(Boolean.FALSE);
                break;
            case 4:
                kb4Var2.invoke((String) a07Var.getValue());
                kb4Var.invoke(Boolean.FALSE);
                break;
            case 5:
                kb4Var2.invoke((lm8) a07Var.getValue());
                kb4Var.invoke(Boolean.FALSE);
                break;
            default:
                kb4Var2.invoke((String) a07Var.getValue());
                kb4Var.invoke(Boolean.FALSE);
                break;
        }
        return hebVar;
    }
}

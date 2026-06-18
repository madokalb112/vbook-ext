package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class pi6 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ a07 e;

    public /* synthetic */ pi6(kb4 kb4Var, kb4 kb4Var2, a07 a07Var, String str) {
        this.a = 1;
        this.b = kb4Var;
        this.c = kb4Var2;
        this.d = str;
        this.e = a07Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.e;
        kb4 kb4Var = this.c;
        String str = this.d;
        kb4 kb4Var2 = this.b;
        switch (i) {
            case 0:
                kb4Var2.invoke(((wga) a07Var.getValue()).a.b);
                a07Var.setValue(new wga(str, 0L, 6));
                kb4Var.invoke(Boolean.FALSE);
                break;
            case 1:
                kb4Var2.invoke(Boolean.FALSE);
                kb4Var.invoke(((wga) a07Var.getValue()).a.b);
                a07Var.setValue(new wga(str, 0L, 6));
                break;
            default:
                kb4Var2.invoke(((wga) a07Var.getValue()).a.b);
                a07Var.setValue(new wga(str, 0L, 6));
                kb4Var.invoke(Boolean.FALSE);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ pi6(int i, kb4 kb4Var, kb4 kb4Var2, a07 a07Var, String str) {
        this.a = i;
        this.b = kb4Var;
        this.d = str;
        this.c = kb4Var2;
        this.e = a07Var;
    }
}

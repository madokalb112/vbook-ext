package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class iz4 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ a07 d;

    public /* synthetic */ iz4(a07 a07Var, a07 a07Var2, a07 a07Var3, int i) {
        this.a = i;
        this.b = a07Var;
        this.c = a07Var2;
        this.d = a07Var3;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        a07 a07Var = this.d;
        a07 a07Var2 = this.c;
        a07 a07Var3 = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((Boolean) a07Var3.getValue()).booleanValue() || ((Boolean) a07Var2.getValue()).booleanValue() || ((Boolean) a07Var.getValue()).booleanValue());
            default:
                Boolean bool = Boolean.FALSE;
                a07Var3.setValue(bool);
                a07Var2.setValue(bool);
                a07Var.setValue((Object) null);
                return heb.a;
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class jq6 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ a07 d;

    public /* synthetic */ jq6(int i, kb4 kb4Var, a07 a07Var) {
        this.a = 1;
        this.b = i;
        this.c = kb4Var;
        this.d = a07Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.d;
        int i2 = this.b;
        kb4 kb4Var = this.c;
        switch (i) {
            case 0:
                a07Var.setValue(Boolean.FALSE);
                kb4Var.invoke(Integer.valueOf(i2));
                break;
            case 1:
                int i3 = i2 + 1;
                String strValueOf = String.valueOf(i3);
                int length = String.valueOf(i3).length();
                a07Var.setValue(new wga(strValueOf, zk9.h(length, length), 4));
                kb4Var.invoke(Boolean.FALSE);
                break;
            case 2:
                a07Var.setValue(Boolean.FALSE);
                kb4Var.invoke(Integer.valueOf(i2));
                break;
            default:
                a07Var.setValue(Boolean.FALSE);
                kb4Var.invoke(Integer.valueOf(i2));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ jq6(kb4 kb4Var, int i, a07 a07Var, int i2) {
        this.a = i2;
        this.c = kb4Var;
        this.b = i;
        this.d = a07Var;
    }
}

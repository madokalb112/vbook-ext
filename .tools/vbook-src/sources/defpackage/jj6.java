package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class jj6 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kn2 b;

    public /* synthetic */ jj6(kn2 kn2Var, int i) {
        this.a = i;
        this.b = kn2Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        kn2 kn2Var = this.b;
        switch (i) {
            case 0:
                kn2Var.c.setValue(Boolean.valueOf(!((Boolean) kn2Var.c.getValue()).booleanValue()));
                break;
            case 1:
                cn7 cn7Var = kn2Var.a;
                Boolean bool = Boolean.FALSE;
                cn7Var.setValue(bool);
                kn2Var.b.setValue("");
                kn2Var.c.setValue(bool);
                break;
            case 2:
                kn2.a(kn2Var, "");
                break;
            default:
                kn2.a(kn2Var, "");
                break;
        }
        return hebVar;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class s7a implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s83 b;

    public /* synthetic */ s7a(s83 s83Var, int i) {
        this.a = i;
        this.b = s83Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        s83 s83Var = this.b;
        switch (i) {
            case 0:
                s83Var.b("", "", false);
                break;
            case 1:
                s83Var.a();
                break;
            case 2:
                s83Var.d.setValue(Boolean.valueOf(!((Boolean) s83Var.d.getValue()).booleanValue()));
                break;
            default:
                s83Var.b("", "", false);
                break;
        }
        return hebVar;
    }
}

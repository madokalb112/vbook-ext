package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class dpb implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;

    public /* synthetic */ dpb(a07 a07Var, int i) {
        this.a = i;
        this.b = a07Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.b;
        switch (i) {
            case 0:
                a07Var.setValue(Boolean.valueOf(!((Boolean) a07Var.getValue()).booleanValue()));
                return hebVar;
            case 1:
                return ((wga) a07Var.getValue()).a.b;
            default:
                a07Var.setValue(Boolean.TRUE);
                return hebVar;
        }
    }
}

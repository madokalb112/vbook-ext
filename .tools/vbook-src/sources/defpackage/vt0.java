package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class vt0 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jt0 b;

    public /* synthetic */ vt0(jt0 jt0Var, int i) {
        this.a = i;
        this.b = jt0Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        jt0 jt0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                if (th != null && !jt0Var.i()) {
                    jt0Var.a(th);
                }
                break;
            default:
                if (th != null && !jt0Var.d()) {
                    jt0Var.a(th);
                }
                break;
        }
        return hebVar;
    }
}

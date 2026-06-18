package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class qr5 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jh4 b;
    public final /* synthetic */ sr5 c;

    public /* synthetic */ qr5(jh4 jh4Var, sr5 sr5Var, int i) {
        this.a = i;
        this.b = jh4Var;
        this.c = sr5Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        sr5 sr5Var = this.c;
        jh4 jh4Var = this.b;
        ym ymVar = (ym) obj;
        switch (i) {
            case 0:
                jh4Var.g(((Number) ymVar.d()).floatValue());
                sr5Var.c.invoke();
                break;
            default:
                jh4Var.g(((Number) ymVar.d()).floatValue());
                sr5Var.c.invoke();
                break;
        }
        return hebVar;
    }
}

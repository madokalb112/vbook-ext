package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ve0 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wha b;
    public final /* synthetic */ kb4 c;

    public /* synthetic */ ve0(wha whaVar, kb4 kb4Var, int i) {
        this.a = i;
        this.b = whaVar;
        this.c = kb4Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        kb4 kb4Var = this.c;
        wha whaVar = this.b;
        switch (i) {
            case 0:
                qha qhaVar = (qha) obj;
                if (whaVar != null) {
                    whaVar.a.setValue(qhaVar);
                }
                if (kb4Var != null) {
                    kb4Var.invoke(qhaVar);
                }
                return heb.a;
            default:
                whaVar.c.add(kb4Var);
                return new kb0(10, whaVar, kb4Var);
        }
    }
}

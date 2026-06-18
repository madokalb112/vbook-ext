package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nl7 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ br9 b;
    public final /* synthetic */ a07 c;

    public nl7(int i, a07 a07Var, br9 br9Var) {
        this.a = i;
        this.b = br9Var;
        this.c = a07Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        if (this.a == ((Number) this.b.getValue()).intValue()) {
            this.c.setValue(bool);
        }
        return heb.a;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class qnb implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ kb4 d;

    public /* synthetic */ qnb(boolean z, kb4 kb4Var, kb4 kb4Var2, int i) {
        this.a = i;
        this.b = z;
        this.c = kb4Var;
        this.d = kb4Var2;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        kb4 kb4Var = this.d;
        kb4 kb4Var2 = this.c;
        boolean z = this.b;
        Float f = (Float) obj;
        switch (i) {
            case 0:
                float fFloatValue = f.floatValue();
                if (z && fFloatValue > 0.0f) {
                    kb4Var2.invoke(Boolean.FALSE);
                }
                kb4Var.invoke(f);
                break;
            default:
                float fFloatValue2 = f.floatValue();
                if (z && fFloatValue2 > 0.0f) {
                    kb4Var2.invoke(Boolean.FALSE);
                }
                kb4Var.invoke(f);
                break;
        }
        return hebVar;
    }
}

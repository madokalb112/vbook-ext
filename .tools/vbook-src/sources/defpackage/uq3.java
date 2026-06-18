package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class uq3 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn2 b;

    public /* synthetic */ uq3(fn2 fn2Var, int i) {
        this.a = i;
        this.b = fn2Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        fn2 fn2Var = this.b;
        switch (i) {
            case 0:
                to3 to3Var = (to3) obj;
                to3Var.getClass();
                String str = to3Var.a;
                String str2 = to3Var.b;
                fn2Var.getClass();
                str.getClass();
                str2.getClass();
                fn2Var.b.setValue(str);
                fn2Var.c.setValue(str2);
                fn2Var.a(true);
                break;
            default:
                ((Boolean) obj).booleanValue();
                fn2Var.a(false);
                break;
        }
        return hebVar;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xg3 implements ht3 {
    public final /* synthetic */ int a;
    public final kg2 b;

    public /* synthetic */ xg3(kg2 kg2Var, int i) {
        this.a = i;
        this.b = kg2Var;
    }

    @Override // defpackage.r58
    public final Object get() {
        int i = this.a;
        kg2 kg2Var = this.b;
        switch (i) {
            case 0:
                return new wg3((s58) kg2Var.a);
            default:
                gy3 gy3Var = (gy3) kg2Var.a;
                gy3Var.getClass();
                k59 k59Var = k59.a;
                return k59.a(gy3Var);
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class zn6 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f28 b;

    public /* synthetic */ zn6(f28 f28Var, int i) {
        this.a = i;
        this.b = f28Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        f28 f28Var = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) f28Var.a.getValue();
                bool.booleanValue();
                return dk9.x(bool);
            default:
                f28Var.a(false);
                return heb.a;
        }
    }
}

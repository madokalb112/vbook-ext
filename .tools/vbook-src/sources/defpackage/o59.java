package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o59 implements ht3 {
    public final /* synthetic */ int a;
    public final q58 b;
    public final q58 c;

    public /* synthetic */ o59(q58 q58Var, q58 q58Var2, int i) {
        this.a = i;
        this.b = q58Var;
        this.c = q58Var2;
    }

    @Override // defpackage.r58
    public final Object get() {
        int i = this.a;
        q58 q58Var = this.c;
        q58 q58Var2 = this.b;
        switch (i) {
            case 0:
                return new n59((iua) q58Var2.get(), (wjb) q58Var.get());
            default:
                return new j69((i89) q58Var2.get(), (i89) q58Var.get());
        }
    }
}

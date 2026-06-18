package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mj8 extends rl5 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj8(pj8 pj8Var, int i) {
        super(1);
        this.a = i;
        this.b = pj8Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        pj8 pj8Var = this.b;
        switch (i) {
            case 0:
                bn8 bn8Var = (bn8) obj;
                bn8Var.getClass();
                bn8Var.C(eb7.f(pj8Var.e()));
                break;
            case 1:
                bn8 bn8Var2 = (bn8) obj;
                bn8Var2.getClass();
                bn8Var2.B(eb7.e(pj8Var.e()));
                break;
            case 2:
                bn8 bn8Var3 = (bn8) obj;
                bn8Var3.getClass();
                bn8Var3.C(eb7.f(((eb7) pj8Var.t.d()).a));
                break;
            default:
                bn8 bn8Var4 = (bn8) obj;
                bn8Var4.getClass();
                bn8Var4.B(eb7.e(((eb7) pj8Var.t.d()).a));
                break;
        }
        return hebVar;
    }
}

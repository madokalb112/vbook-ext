package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uc8 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc8 b;

    public /* synthetic */ uc8(vc8 vc8Var, int i) {
        this.a = i;
        this.b = vc8Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        vc8 vc8Var = this.b;
        switch (i) {
            case 0:
                return vc8Var.c();
            case 1:
                return vc8Var.f();
            default:
                return vc8Var.d();
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ff extends rl5 implements yb4 {
    public final /* synthetic */ ou6 a;
    public final /* synthetic */ yb4 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff(ou6 ou6Var, yb4 yb4Var, int i) {
        super(2);
        this.a = ou6Var;
        this.b = yb4Var;
        this.c = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iX0 = qu1.x0(this.c | 1);
        lc5.N(this.a, this.b, (dd4) obj, iX0);
        return heb.a;
    }
}

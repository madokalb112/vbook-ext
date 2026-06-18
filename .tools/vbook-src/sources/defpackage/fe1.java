package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fe1 extends rl5 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mf4 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ rj1 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe1(mf4 mf4Var, int i, int i2, rj1 rj1Var, int i3, int i4, int i5) {
        super(2);
        this.a = i5;
        this.b = mf4Var;
        this.c = i;
        this.d = i2;
        this.e = rj1Var;
        this.f = i4;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int i2 = this.f;
                t96.f(this.b, this.c, this.d, this.e, (dd4) obj, 3073, i2);
                break;
            default:
                ((Number) obj2).intValue();
                int i3 = this.f;
                fx1.o(this.b, this.c, this.d, this.e, (dd4) obj, 3073, i3);
                break;
        }
        return hebVar;
    }
}

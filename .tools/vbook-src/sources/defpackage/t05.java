package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class t05 extends rl5 implements yb4 {
    public final /* synthetic */ n15 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ mf4 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ pc1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t05(n15 n15Var, String str, mf4 mf4Var, int i, pc1 pc1Var, int i2, int i3) {
        super(2);
        this.a = n15Var;
        this.b = str;
        this.c = mf4Var;
        this.d = i;
        this.e = pc1Var;
        this.f = i2;
        this.s = i3;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ny1.b(this.a, this.b, this.c, this.d, this.e, (dd4) obj, this.f | 1, this.s);
        return heb.a;
    }
}

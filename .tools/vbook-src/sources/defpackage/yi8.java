package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yi8 extends rl5 implements yb4 {
    public final /* synthetic */ gj8 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ ou6 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ rj1 f;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi8(gj8 gj8Var, Object obj, ou6 ou6Var, boolean z, boolean z2, rj1 rj1Var, int i) {
        super(2);
        this.a = gj8Var;
        this.b = obj;
        this.c = ou6Var;
        this.d = z;
        this.e = z2;
        this.f = rj1Var;
        this.s = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fx1.n(this.a, this.b, this.c, this.d, this.e, this.f, (dd4) obj, qu1.x0(this.s | 1));
        return heb.a;
    }
}

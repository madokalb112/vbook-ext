package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yh0 extends rl5 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh0(int i, boolean z) {
        super(1);
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        lp4 lp4Var = jf0.G;
        bn8 bn8Var = (bn8) obj;
        float fB = bn8Var.E.b() * 12.0f;
        float fB2 = bn8Var.E.b() * 12.0f;
        bn8Var.g((fB <= 0.0f || fB2 <= 0.0f) ? null : new xh0(fB, fB2, this.a));
        bn8Var.r(lp4Var);
        bn8Var.e(this.b);
        return heb.a;
    }
}

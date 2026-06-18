package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class t12 extends rl5 implements yb4 {
    public final /* synthetic */ Boolean a;
    public final /* synthetic */ ou6 b;
    public final /* synthetic */ by3 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ rj1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t12(Boolean bool, ou6 ou6Var, by3 by3Var, String str, rj1 rj1Var, int i) {
        super(2);
        this.a = bool;
        this.b = ou6Var;
        this.c = by3Var;
        this.d = str;
        this.e = rj1Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iX0 = qu1.x0(24577);
        tu1.c(this.a, this.b, this.c, this.d, this.e, (dd4) obj, iX0);
        return heb.a;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cma extends kt1 {
    public /* synthetic */ Object a;
    public final /* synthetic */ fma b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cma(fma fmaVar, kt1 kt1Var) {
        super(kt1Var);
        this.b = fmaVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.r(this);
    }
}

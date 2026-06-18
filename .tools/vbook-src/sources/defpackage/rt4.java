package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rt4 extends kt1 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bu4 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt4(bu4 bu4Var, kt1 kt1Var) {
        super(kt1Var);
        this.b = bu4Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.g(null, this);
    }
}

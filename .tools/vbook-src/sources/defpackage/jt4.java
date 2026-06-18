package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jt4 extends kt1 {
    public Object a;
    public bu4 b;
    public t07 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ bu4 f;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt4(bu4 bu4Var, kt1 kt1Var) {
        super(kt1Var);
        this.f = bu4Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.s |= Integer.MIN_VALUE;
        return this.f.c(null, this);
    }
}

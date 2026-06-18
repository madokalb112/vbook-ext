package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k97 extends kt1 {
    public int a;
    public String b;
    public zl9 c;
    public uc2 d;
    public zx2 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ q97 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k97(q97 q97Var, kt1 kt1Var) {
        super(kt1Var);
        this.s = q97Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.t(0, this, null);
    }
}

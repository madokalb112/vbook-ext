package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class era extends kt1 {
    public int a;
    public int b;
    public rg8 c;
    public rg8 d;
    public hra e;
    public aq4 f;
    public /* synthetic */ Object s;
    public final /* synthetic */ hra t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public era(hra hraVar, kt1 kt1Var) {
        super(kt1Var);
        this.t = hraVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.L0(0, null, null, this);
    }
}

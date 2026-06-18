package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qf1 extends kt1 {
    public int a;
    public String b;
    public z92 c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ tf1 f;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf1(tf1 tf1Var, kt1 kt1Var) {
        super(kt1Var);
        this.f = tf1Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.s |= Integer.MIN_VALUE;
        return this.f.u(0, null, false, this);
    }
}

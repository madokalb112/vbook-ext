package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m7c extends kt1 {
    public long a;
    public long b;
    public long c;
    public float d;
    public /* synthetic */ Object e;
    public final /* synthetic */ n7c f;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7c(n7c n7cVar, kt1 kt1Var) {
        super(kt1Var);
        this.f = n7cVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.s |= Integer.MIN_VALUE;
        return this.f.m(0L, 0L, 0.0f, this);
    }
}

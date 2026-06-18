package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m7a extends kt1 {
    public String a;
    public n7a b;
    public int c;
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ n7a f;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7a(n7a n7aVar, kt1 kt1Var) {
        super(kt1Var);
        this.f = n7aVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.s |= Integer.MIN_VALUE;
        return this.f.t(null, 0, 0L, this);
    }
}

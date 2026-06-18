package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cc0 extends kt1 {
    public String a;
    public ec0 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ec0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc0(ec0 ec0Var, kt1 kt1Var) {
        super(kt1Var);
        this.e = ec0Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return ec0.a(this.e, this);
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cr2 extends kt1 {
    public ir2 a;
    public zv5 b;
    public ir2 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ dr2 f;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr2(dr2 dr2Var, jt1 jt1Var) {
        super(jt1Var);
        this.f = dr2Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.s |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}

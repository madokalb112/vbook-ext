package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zt4 extends kt1 {
    public Object[] a;
    public String b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ bu4 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt4(bu4 bu4Var, kt1 kt1Var) {
        super(kt1Var);
        this.e = bu4Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.o(null, this);
    }
}

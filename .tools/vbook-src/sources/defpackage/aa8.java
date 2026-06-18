package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class aa8 extends kt1 {
    public String a;
    public t07 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ca8 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa8(ca8 ca8Var, kt1 kt1Var) {
        super(kt1Var);
        this.e = ca8Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.u(0, this, null);
    }
}

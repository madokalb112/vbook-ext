package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class aq7 extends kt1 {
    public int a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dq7 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq7(dq7 dq7Var, kt1 kt1Var) {
        super(kt1Var);
        this.d = dq7Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.u(0, null, false, this);
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k36 extends kt1 {
    public te5 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ mc8 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k36(mc8 mc8Var, kt1 kt1Var) {
        super(kt1Var);
        this.c = mc8Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.u(this);
    }
}

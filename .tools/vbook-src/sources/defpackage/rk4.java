package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rk4 extends kt1 {
    public long a;
    public owb b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yk4 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk4(yk4 yk4Var, kt1 kt1Var) {
        super(kt1Var);
        this.d = yk4Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(0L, this);
    }
}

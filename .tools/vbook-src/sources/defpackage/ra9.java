package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ra9 extends kt1 {
    public String a;
    public pa9 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sa9 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra9(sa9 sa9Var, jt1 jt1Var) {
        super(jt1Var);
        this.d = sa9Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return sa9.a(this.d, null, null, this);
    }
}

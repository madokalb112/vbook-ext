package defpackage;

/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pk5 extends kt1 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ qk5 c;
    public c24 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk5(qk5 qk5Var, jt1 jt1Var) {
        super(jt1Var);
        this.c = qk5Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}

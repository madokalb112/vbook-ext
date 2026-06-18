package defpackage;

/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wk5 extends kt1 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ xk5 c;
    public Object d;
    public int e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk5(xk5 xk5Var, jt1 jt1Var) {
        super(jt1Var);
        this.c = xk5Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}

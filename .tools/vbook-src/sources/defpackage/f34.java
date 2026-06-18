package defpackage;

/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f34 extends kt1 {
    public g34 a;
    public /* synthetic */ Object b;
    public int c;
    public final /* synthetic */ g34 d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f34(g34 g34Var, jt1 jt1Var) {
        super(jt1Var);
        this.d = g34Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class l88 extends kt1 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ pw5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l88(pw5 pw5Var, jt1 jt1Var) {
        super(jt1Var);
        this.c = pw5Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}

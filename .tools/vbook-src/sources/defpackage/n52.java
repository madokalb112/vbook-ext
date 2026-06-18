package defpackage;

/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class n52 extends kt1 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ o52 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n52(o52 o52Var, jt1 jt1Var) {
        super(jt1Var);
        this.c = o52Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}

package defpackage;

/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a34 extends kt1 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ v24 c;
    public c34 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a34(v24 v24Var, jt1 jt1Var) {
        super(jt1Var);
        this.c = v24Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}

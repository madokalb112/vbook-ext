package defpackage;

/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class u24 extends kt1 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ tg3 c;
    public tg3 d;
    public c24 e;
    public Throwable f;
    public long s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u24(tg3 tg3Var, jt1 jt1Var) {
        super(jt1Var);
        this.c = tg3Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}

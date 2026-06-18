package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g24 extends kt1 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ pp1 c;
    public c24 d;
    public Iterator e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g24(pp1 pp1Var, jt1 jt1Var) {
        super(jt1Var);
        this.c = pp1Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}

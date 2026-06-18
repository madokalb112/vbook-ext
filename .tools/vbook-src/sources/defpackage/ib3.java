package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ib3 extends kt1 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ l51 c;
    public c24 d;
    public Collection e;
    public Iterator f;
    public Collection s;
    public String t;
    public String u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib3(l51 l51Var, jt1 jt1Var) {
        super(jt1Var);
        this.c = l51Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}

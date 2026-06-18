package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g88 extends kt1 {
    public Object a;
    public zn7 b;
    public Iterator c;
    public int d;
    public int e;
    public int f;
    public /* synthetic */ Object s;
    public final /* synthetic */ c98 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g88(c98 c98Var, kt1 kt1Var) {
        super(kt1Var);
        this.t = c98Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.v(null, this);
    }
}

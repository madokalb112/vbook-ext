package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nz5 extends kt1 {
    public Object a;
    public b07 b;
    public Object c;
    public HashMap d;
    public int e;
    public int f;
    public int s;
    public long t;
    public /* synthetic */ Object u;
    public final /* synthetic */ pz5 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz5(pz5 pz5Var, kt1 kt1Var) {
        super(kt1Var);
        this.v = pz5Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return pz5.D(this.v, this);
    }
}

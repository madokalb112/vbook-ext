package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class l97 extends kt1 {
    public String a;
    public Iterator b;
    public b93 c;
    public String d;
    public q97 e;
    public String f;
    public String s;
    public g83 t;
    public int u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ q97 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l97(q97 q97Var, kt1 kt1Var) {
        super(kt1Var);
        this.y = q97Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.p(null, null, this);
    }
}

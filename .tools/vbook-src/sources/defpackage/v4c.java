package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v4c extends kt1 {
    public long A;
    public boolean B;
    public /* synthetic */ Object C;
    public final /* synthetic */ w4c D;
    public int E;
    public Object a;
    public Object b;
    public r5a c;
    public String d;
    public String e;
    public String f;
    public Map s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4c(w4c w4cVar, kt1 kt1Var) {
        super(kt1Var);
        this.D = w4cVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return w4c.a(this.D, this);
    }
}

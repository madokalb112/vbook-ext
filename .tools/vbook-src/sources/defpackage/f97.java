package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f97 extends kt1 {
    public v92 a;
    public Iterator b;
    public String c;
    public nf1 d;
    public String e;
    public String f;
    public g83 s;
    public int t;
    public int u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ nf1 x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f97(nf1 nf1Var, kt1 kt1Var) {
        super(kt1Var);
        this.x = nf1Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.i(null, null, this);
    }
}

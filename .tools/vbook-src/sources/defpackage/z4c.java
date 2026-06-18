package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z4c extends kt1 {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ nc1 D;
    public int E;
    public a82 a;
    public String b;
    public String c;
    public String d;
    public String e;
    public gnb f;
    public List s;
    public List t;
    public xg5 u;
    public Iterator v;
    public String w;
    public xg5 x;
    public long y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4c(nc1 nc1Var, kt1 kt1Var) {
        super(kt1Var);
        this.D = nc1Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.G(null, null, this);
    }
}

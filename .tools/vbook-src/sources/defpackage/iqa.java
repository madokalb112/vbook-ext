package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class iqa extends kt1 {
    public List a;
    public f36 b;
    public f36 c;
    public f36 d;
    public Iterator e;
    public p5b f;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ hra u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqa(hra hraVar, kt1 kt1Var) {
        super(kt1Var);
        this.u = hraVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return hra.F(this.u, this);
    }
}

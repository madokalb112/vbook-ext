package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q5c extends kt1 {
    public Object a;
    public Object b;
    public Map c;
    public yy d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ r5c s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5c(r5c r5cVar, kt1 kt1Var) {
        super(kt1Var);
        this.s = r5cVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.n(null, null, this);
    }
}

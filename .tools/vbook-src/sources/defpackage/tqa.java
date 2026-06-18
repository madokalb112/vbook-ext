package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tqa extends kt1 {
    public int a;
    public int b;
    public b93 c;
    public Iterator d;
    public b93 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ hra s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqa(hra hraVar, kt1 kt1Var) {
        super(kt1Var);
        this.s = hraVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.C0(0, this, null);
    }
}

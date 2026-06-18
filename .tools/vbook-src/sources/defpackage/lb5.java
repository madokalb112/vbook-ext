package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lb5 extends kt1 {
    public ww a;
    public List b;
    public int c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ob5 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb5(ob5 ob5Var, kt1 kt1Var) {
        super(kt1Var);
        this.s = ob5Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.b(null, 0, this);
    }
}

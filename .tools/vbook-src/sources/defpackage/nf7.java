package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nf7 extends kt1 {
    public yv0 a;
    public r07 b;
    public HashMap c;
    public yv0 d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ of7 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf7(of7 of7Var, kt1 kt1Var) {
        super(kt1Var);
        this.s = of7Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.c(null, this);
    }
}

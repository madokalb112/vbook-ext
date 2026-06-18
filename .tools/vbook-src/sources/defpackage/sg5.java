package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sg5 extends kt1 {
    public je2 a;
    public tg5 b;
    public LinkedHashMap c;
    public String d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ tg5 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg5(tg5 tg5Var, vc0 vc0Var) {
        super(vc0Var);
        this.s = tg5Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.t |= Integer.MIN_VALUE;
        return tg5.a(this.s, null, this);
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class km9 extends kt1 {
    public String a;
    public String b;
    public Object c;
    public List d;
    public List e;
    public /* synthetic */ Object f;
    public final /* synthetic */ lm9 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km9(lm9 lm9Var, kt1 kt1Var) {
        super(kt1Var);
        this.s = lm9Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.l(null, this);
    }
}

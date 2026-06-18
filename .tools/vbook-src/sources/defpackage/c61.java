package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c61 extends kt1 {
    public String a;
    public List b;
    public String c;
    public String d;
    public zq e;
    public int f;
    public /* synthetic */ Object s;
    public final /* synthetic */ p61 t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c61(p61 p61Var, kt1 kt1Var) {
        super(kt1Var);
        this.t = p61Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.c(null, null, null, null, this);
    }
}

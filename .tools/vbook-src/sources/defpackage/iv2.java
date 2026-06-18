package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class iv2 extends kt1 {
    public List a;
    public String b;
    public List c;
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ jv2 f;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv2(jv2 jv2Var, kt1 kt1Var) {
        super(kt1Var);
        this.f = jv2Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.s |= Integer.MIN_VALUE;
        return this.f.E(this);
    }
}

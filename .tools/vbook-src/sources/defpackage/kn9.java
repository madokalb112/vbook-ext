package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kn9 extends kt1 {
    public List a;
    public Map b;
    public HashMap c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ln9 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn9(ln9 ln9Var, kt1 kt1Var) {
        super(kt1Var);
        this.e = ln9Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return ln9.D(this.e, this);
    }
}

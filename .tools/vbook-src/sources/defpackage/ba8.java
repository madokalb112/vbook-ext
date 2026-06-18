package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ba8 extends kt1 {
    public List a;
    public Iterator b;
    public List c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ca8 f;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba8(ca8 ca8Var, kt1 kt1Var) {
        super(kt1Var);
        this.f = ca8Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.s |= Integer.MIN_VALUE;
        return this.f.x(null, this);
    }
}

package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ff4 extends kt1 {
    public Object a;
    public Context b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ wd0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff4(wd0 wd0Var, kt1 kt1Var) {
        super(kt1Var);
        this.e = wd0Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, 0, this);
    }
}

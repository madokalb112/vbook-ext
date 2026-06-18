package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o13 extends kt1 {
    public Iterator a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ p13 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o13(p13 p13Var, kt1 kt1Var) {
        super(kt1Var);
        this.d = p13Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(this);
    }
}

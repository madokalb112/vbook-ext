package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nf3 extends kt1 {
    public kf3 a;
    public lg6 b;
    public byte[] c;
    public List d;
    public Iterator e;
    public int f;
    public int s;
    public /* synthetic */ Object t;
    public final /* synthetic */ nc1 u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf3(nc1 nc1Var, kt1 kt1Var) {
        super(kt1Var);
        this.u = nc1Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.i(this);
    }
}

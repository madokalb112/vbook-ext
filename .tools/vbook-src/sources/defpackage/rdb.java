package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rdb extends kt1 {
    public odb a;
    public udb b;
    public List c;
    public Iterator d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ nc1 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdb(nc1 nc1Var, kt1 kt1Var) {
        super(kt1Var);
        this.s = nc1Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.i(this);
    }
}

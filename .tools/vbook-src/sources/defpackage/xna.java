package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xna extends kt1 {
    public LinkedHashSet a;
    public Iterator b;
    public bi5 c;
    public he8 d;
    public he8 e;
    public int f;
    public /* synthetic */ Object s;
    public final /* synthetic */ zna t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xna(zna znaVar, kt1 kt1Var) {
        super(kt1Var);
        this.t = znaVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.o(null, this);
    }
}

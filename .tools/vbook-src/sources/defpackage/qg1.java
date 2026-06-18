package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qg1 extends kt1 {
    public final /* synthetic */ vg1 A;
    public int B;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f;
    public Long s;
    public Collection t;
    public Iterator u;
    public bi5 v;
    public Collection w;
    public ng x;
    public Collection y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg1(vg1 vg1Var, kt1 kt1Var) {
        super(kt1Var);
        this.A = vg1Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(0, 0, null, null, null, this);
    }
}

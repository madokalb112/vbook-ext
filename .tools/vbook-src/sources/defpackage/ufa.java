package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ufa {
    public final qv5 a;
    public final kga b;
    public final wga c;
    public final boolean d;
    public final boolean e;
    public final aja f;
    public final ob7 g;
    public final beb h;
    public final id2 i;
    public final s00 j = lj5.a;
    public final kb4 k;
    public final int l;

    public ufa(qv5 qv5Var, kga kgaVar, wga wgaVar, boolean z, boolean z2, aja ajaVar, ob7 ob7Var, beb bebVar, id2 id2Var, kb4 kb4Var, int i) {
        this.a = qv5Var;
        this.b = kgaVar;
        this.c = wgaVar;
        this.d = z;
        this.e = z2;
        this.f = ajaVar;
        this.g = ob7Var;
        this.h = bebVar;
        this.i = id2Var;
        this.k = kb4Var;
        this.l = i;
    }

    public final void a(List list) {
        rg2 rg2Var = this.a.d;
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, new ay3());
        this.k.invoke(rg2Var.k(arrayList));
    }
}

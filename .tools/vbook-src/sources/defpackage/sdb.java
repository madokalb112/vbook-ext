package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sdb extends kt1 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ nc1 C;
    public int D;
    public String a;
    public odb b;
    public a82 c;
    public zn7 d;
    public zn7 e;
    public List f;
    public List s;
    public List t;
    public Iterator u;
    public String v;
    public String w;
    public long x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdb(nc1 nc1Var, kt1 kt1Var) {
        super(kt1Var);
        this.C = nc1Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.h(null, null, this);
    }
}

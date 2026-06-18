package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lkb extends kt1 {
    public final /* synthetic */ pkb A;
    public int B;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public lm8 f;
    public kb4 s;
    public yn7 t;
    public List u;
    public Iterator v;
    public int w;
    public int x;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkb(pkb pkbVar, kt1 kt1Var) {
        super(kt1Var);
        this.A = pkbVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.f(false, false, false, false, false, null, null, null, this);
    }
}

package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ckb extends kt1 {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ pkb D;
    public int E;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public kb4 f;
    public zn7 s;
    public yn7 t;
    public List u;
    public pg8 v;
    public r07 w;
    public yn7 x;
    public Iterator y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckb(pkb pkbVar, kt1 kt1Var) {
        super(kt1Var);
        this.D = pkbVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.c(false, false, false, false, false, null, this);
    }
}

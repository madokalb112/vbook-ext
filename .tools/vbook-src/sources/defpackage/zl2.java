package defpackage;

import java.util.zip.Deflater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zl2 extends kt1 {
    public lp8 a;
    public uf4 b;
    public byte[] c;
    public byte[] d;
    public Deflater e;
    public /* synthetic */ Object f;
    public final /* synthetic */ bm2 s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl2(bm2 bm2Var, kt1 kt1Var) {
        super(kt1Var);
        this.s = bm2Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.c(null, null, 0.0f, this);
    }
}

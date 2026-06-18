package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class woa implements kb4 {
    public final /* synthetic */ jka a;
    public final /* synthetic */ st5 b;
    public final /* synthetic */ nca c;
    public final /* synthetic */ zx7 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ zb4 f;
    public final /* synthetic */ a07 s;
    public final /* synthetic */ a07 t;
    public final /* synthetic */ a07 u;

    public /* synthetic */ woa(jka jkaVar, st5 st5Var, nca ncaVar, zx7 zx7Var, int i, zb4 zb4Var, a07 a07Var, a07 a07Var2, a07 a07Var3) {
        this.a = jkaVar;
        this.b = st5Var;
        this.c = ncaVar;
        this.d = zx7Var;
        this.e = i;
        this.f = zb4Var;
        this.s = a07Var;
        this.t = a07Var2;
        this.u = a07Var3;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        eb7 eb7Var = (eb7) obj;
        if (this.a.d() == t19.a) {
            long j = eb7Var.a;
            int i = (int) (j >> 32);
            float fIntBitsToFloat = Float.intBitsToFloat(i);
            roa roaVar = yoa.a;
            float fFloatValue = fIntBitsToFloat - ((Number) this.s.getValue()).floatValue();
            int i2 = (int) (j & 4294967295L);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i2) - ((Number) this.t.getValue()).floatValue();
            int iIntValue = ((Number) this.u.getValue()).intValue();
            st5 st5Var = this.b;
            yia yiaVarB = yoa.b(fFloatValue, fIntBitsToFloat2, iIntValue, st5Var.j().k, st5Var.j().p, this.c.b);
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
            v1a v1aVar = this.d;
            o9a o9aVarK = tl9.k(fIntBitsToFloat3, fIntBitsToFloat4, (int) (v1aVar.K >> 32), (int) (v1aVar.K & 4294967295L), this.e);
            float fIntBitsToFloat5 = Float.intBitsToFloat(i);
            this.f.c(new eb7((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat5) << 32)), o9aVarK, yiaVarB);
        }
        return heb.a;
    }
}

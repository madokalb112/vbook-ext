package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class p9 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sq0 b;
    public final /* synthetic */ xp4 c;

    public /* synthetic */ p9(sq0 sq0Var, xp4 xp4Var, int i) {
        this.a = i;
        this.b = sq0Var;
        this.c = xp4Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        xp4 xp4Var = this.c;
        switch (i) {
            case 0:
                r43 r43Var = (r43) obj;
                r43Var.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (r43Var.f() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (r43Var.f() & 4294967295L));
                y91 y91VarP0 = r43Var.p0();
                long jG = y91VarP0.G();
                y91VarP0.x().i();
                try {
                    ((lp8) y91VarP0.b).n(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                    fz1.T(r43Var);
                    j39.s(y91VarP0, jG);
                    r43.G0(r43Var, this.b, 0L, 0L, 0.0f, (s43) null, (qc1) null, 0, Token.ELSE);
                    r43.J(r43Var, lc1.c, 0L, 0L, 0.0f, new jw9(r43Var.k0(0.5f), 0.0f, 0, 0, (ih) null, 30), 110);
                    float fIntBitsToFloat3 = (1.0f - xp4Var.d) * Float.intBitsToFloat((int) (r43Var.f() >> 32));
                    float fK0 = r43Var.k0(4.0f);
                    float fK02 = r43Var.k0(1.0f);
                    sw1.G(r43Var, (((long) Float.floatToRawIntBits(fIntBitsToFloat3 - fK0)) << 32) | (((long) Float.floatToRawIntBits(-fK02)) & 4294967295L), (((long) Float.floatToRawIntBits(fK0 * 2.0f)) << 32) | (((long) Float.floatToRawIntBits((2.0f * fK02) + Float.intBitsToFloat((int) (r43Var.f() & 4294967295L)))) & 4294967295L), fK02);
                    return hebVar;
                } catch (Throwable th) {
                    j39.s(y91VarP0, jG);
                    throw th;
                }
            default:
                r43 r43Var2 = (r43) obj;
                r43Var2.getClass();
                r43.G0(r43Var2, this.b, 0L, 0L, 0.0f, (s43) null, (qc1) null, 0, Token.ELSE);
                r43.J(r43Var2, lc1.c, 0L, 0L, 0.0f, new jw9(r43Var2.k0(0.5f), 0.0f, 0, 0, (ih) null, 30), 110);
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (r43Var2.f() & 4294967295L));
                float f = fIntBitsToFloat4 - ((xp4Var.a * fIntBitsToFloat4) / 360.0f);
                float fK03 = r43Var2.k0(4.0f);
                float fK04 = r43Var2.k0(1.0f);
                sw1.G(r43Var2, (((long) Float.floatToRawIntBits(f - fK03)) & 4294967295L) | (Float.floatToRawIntBits(-fK04) << 32), (((long) Float.floatToRawIntBits((fK04 * 2.0f) + Float.intBitsToFloat((int) (r43Var2.f() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fK03 * 2.0f)) & 4294967295L), fK04);
                return hebVar;
        }
    }
}

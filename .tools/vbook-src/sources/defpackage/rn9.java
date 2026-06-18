package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rn9 implements kb4 {
    public final /* synthetic */ qg8 a;
    public final /* synthetic */ og8 b;
    public final /* synthetic */ ym7 c;
    public final /* synthetic */ hk9 d;
    public final /* synthetic */ ym7 e;

    public rn9(qg8 qg8Var, og8 og8Var, ym7 ym7Var, hk9 hk9Var, ym7 ym7Var2) {
        this.a = qg8Var;
        this.b = og8Var;
        this.c = ym7Var;
        this.d = hk9Var;
        this.e = ym7Var2;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        float fSqrt;
        float fCos;
        float fSin;
        long jLongValue = ((Number) obj).longValue() / 1000000;
        qg8 qg8Var = this.a;
        float fR = wx1.R(jLongValue - qg8Var.a, 0L, 64L);
        qg8Var.a = jLongValue;
        og8 og8Var = this.b;
        og8Var.a = ((fR / 1000.0f) * ((((this.c.h() - 1.0f) * 3.0f) + 1.0f) - og8Var.a) * 5.0f) + og8Var.a;
        ym7 ym7Var = this.e;
        ym7Var.i(((fR / 16.67f) * og8Var.a * 0.0025f) + ym7Var.h());
        hk9 hk9Var = this.d;
        Iterator it = hk9Var.iterator();
        int i = 0;
        while (true) {
            em4 em4Var = (em4) it;
            if (!em4Var.hasNext()) {
                return heb.a;
            }
            Object next = em4Var.next();
            int i2 = i + 1;
            if (i < 0) {
                gc1.i0();
                throw null;
            }
            qq9 qq9Var = (qq9) next;
            float fH = ((ym7Var.h() * qq9Var.f) + qq9Var.g) % 1.0f;
            if ((fH > 0.98f || fH < 0.01f) && qq9Var.h != ((int) ym7Var.h())) {
                do {
                    float fH2 = vb8.a.h() * 360.0f;
                    fSqrt = ((float) Math.sqrt(r7.h())) * 1.5f;
                    double d = fH2 * 0.017453292f;
                    fCos = ((float) Math.cos(d)) * fSqrt;
                    fSin = ((float) Math.sin(d)) * fSqrt;
                } while (fSqrt < 0.15f);
                hk9Var.set(i, new qq9(fCos, fSin, qq9Var.c, qq9Var.d, qq9Var.e, qq9Var.f, qq9Var.g, (int) ym7Var.h()));
            }
            i = i2;
        }
    }
}

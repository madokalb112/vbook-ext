package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class po implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg8 b;
    public final /* synthetic */ og8 c;
    public final /* synthetic */ ym7 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ po(qg8 qg8Var, og8 og8Var, ym7 ym7Var, Object obj, int i) {
        this.a = i;
        this.b = qg8Var;
        this.c = og8Var;
        this.d = ym7Var;
        this.e = obj;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        float f;
        float f2;
        int i = this.a;
        heb hebVar = heb.a;
        Object obj2 = this.e;
        ym7 ym7Var = this.d;
        og8 og8Var = this.c;
        qg8 qg8Var = this.b;
        switch (i) {
            case 0:
                long jLongValue = ((Number) obj).longValue() / 1000000;
                float fR = wx1.R(jLongValue - qg8Var.a, 0L, 64L);
                qg8Var.a = jLongValue;
                og8Var.a = ((fR / 1000.0f) * (ym7Var.h() - og8Var.a) * 2.5f) + og8Var.a;
                ym7 ym7Var2 = (ym7) obj2;
                ym7Var2.i((fR * og8Var.a) + ym7Var2.h());
                return hebVar;
            default:
                long jLongValue2 = ((Number) obj).longValue() / 1000000;
                float fR2 = wx1.R(jLongValue2 - qg8Var.a, 0L, 64L);
                qg8Var.a = jLongValue2;
                float fH = ((fR2 / 1000.0f) * (ym7Var.h() - og8Var.a) * 2.5f) + og8Var.a;
                og8Var.a = fH;
                float f3 = (fR2 / 16.67f) * fH;
                hk9 hk9Var = (hk9) obj2;
                Iterator it = hk9Var.iterator();
                int i2 = 0;
                while (true) {
                    em4 em4Var = (em4) it;
                    if (!em4Var.hasNext()) {
                        return hebVar;
                    }
                    Object next = em4Var.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        gc1.i0();
                        throw null;
                    }
                    vn7 vn7Var = (vn7) next;
                    float f4 = vn7Var.a;
                    float fAbs = vn7Var.c;
                    float f5 = (fAbs * f3) + f4;
                    float f6 = vn7Var.b;
                    float fAbs2 = vn7Var.d;
                    float f7 = (fAbs2 * f3) + f6;
                    if (f5 < 0.02f) {
                        fAbs = Math.abs(fAbs);
                        f5 = 0.02f;
                    }
                    if (f5 > 0.98f) {
                        fAbs = -Math.abs(fAbs);
                        f = 0.98f;
                    } else {
                        f = f5;
                    }
                    if (f7 < 0.02f) {
                        fAbs2 = Math.abs(fAbs2);
                        f7 = 0.02f;
                    }
                    if (f7 > 0.98f) {
                        fAbs2 = -Math.abs(fAbs2);
                        f2 = 0.98f;
                    } else {
                        f2 = f7;
                    }
                    ub8 ub8Var = vb8.a;
                    float fH2 = ((ub8Var.h() - 0.5f) * 4.0E-6f) + fAbs;
                    float fH3 = ((ub8Var.h() - 0.5f) * 4.0E-6f) + fAbs2;
                    float fSqrt = (float) Math.sqrt((fH3 * fH3) + (fH2 * fH2));
                    if (fSqrt > 2.5E-4f) {
                        fH2 = (fH2 / fSqrt) * 2.5E-4f;
                        fH3 = (fH3 / fSqrt) * 2.5E-4f;
                    }
                    hk9Var.set(i2, new vn7(f, f2, fH2, fH3, vn7Var.e, vn7Var.f));
                    i2 = i3;
                }
                break;
        }
    }
}

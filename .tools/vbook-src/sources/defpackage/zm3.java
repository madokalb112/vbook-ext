package defpackage;

import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class zm3 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ a07 c;

    public /* synthetic */ zm3(boolean z, a07 a07Var, int i) {
        this.a = i;
        this.b = z;
        this.c = a07Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.c;
        final boolean z = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                } else {
                    p35 p35VarC = i25.c((m53) f53.X.getValue(), dd4Var, 0);
                    Object objQ = dd4Var.Q();
                    Object obj4 = vl1.a;
                    if (objQ == obj4) {
                        objQ = new dh1(1);
                        dd4Var.p0(objQ);
                    }
                    sw1.r(p35VarC, (ou6) null, 0L, (ib4) objQ, dd4Var, 3072, 6);
                    p35 p35VarC2 = i25.c((m53) a53.s.getValue(), dd4Var, 0);
                    Object objQ2 = dd4Var.Q();
                    if (objQ2 == obj4) {
                        objQ2 = new dh1(1);
                        dd4Var.p0(objQ2);
                    }
                    sw1.r(p35VarC2, (ou6) null, 0L, (ib4) objQ2, dd4Var, 3072, 6);
                    if (!z) {
                        dd4Var.f0(-552819620);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(-553050260);
                        p35 p35VarC3 = i25.c((m53) f53.j0.getValue(), dd4Var, 0);
                        boolean zF = dd4Var.f(a07Var);
                        Object objQ3 = dd4Var.Q();
                        if (zF || objQ3 == obj4) {
                            objQ3 = new zl3(a07Var, 3);
                            dd4Var.p0(objQ3);
                        }
                        sw1.r(p35VarC3, (ou6) null, 0L, (ib4) objQ3, dd4Var, 0, 6);
                        dd4Var.q(false);
                    }
                }
                break;
            default:
                ii9 ii9Var = (ii9) obj;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ii9Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? dd4Var2.f(ii9Var) : dd4Var2.h(ii9Var) ? 4 : 2;
                }
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    dd4Var2.Y();
                } else {
                    vh9 vh9Var = vh9.a;
                    ou6 ou6VarH = tg9.h(lu6.a, 12.0f);
                    final float fFloatValue = ((Number) a07Var.getValue()).floatValue();
                    final long jC = lc1.c(0.6f, ((q96) dd4Var2.j(s96.a)).a.a);
                    vh9Var.a(ii9Var, s32.X(ou6VarH, new zb4() { // from class: uma
                        @Override // defpackage.zb4
                        public final Object c(Object obj5, Object obj6, Object obj7) {
                            ou6 ou6Var = (ou6) obj5;
                            dd4 dd4Var3 = (dd4) obj6;
                            ((Integer) obj7).getClass();
                            ou6Var.getClass();
                            dd4Var3.f0(502859237);
                            Object objQ4 = dd4Var3.Q();
                            Object obj8 = vl1.a;
                            if (objQ4 == obj8) {
                                objQ4 = new ym7(0.0f);
                                dd4Var3.p0(objQ4);
                            }
                            ym7 ym7Var = (ym7) objQ4;
                            float fH = ym7Var.h();
                            float f = fFloatValue;
                            boolean zC = dd4Var3.c(fH) | dd4Var3.c(f);
                            Object objQ5 = dd4Var3.Q();
                            if (zC || objQ5 == obj8) {
                                objQ5 = new ym7(ym7Var.h() * f);
                                dd4Var3.p0(objQ5);
                            }
                            ym7 ym7Var2 = (ym7) objQ5;
                            d75 d75VarT = fx1.t(fx1.G0(dd4Var3, 0), 0.0f, 1.0f, ah1.H(ah1.a0(800, Context.VERSION_ES6, null, 4), null, 0L, 6), dd4Var3, 29112, 0);
                            Object objQ6 = dd4Var3.Q();
                            if (objQ6 == obj8) {
                                objQ6 = new lma(ym7Var, 1);
                                dd4Var3.p0(objQ6);
                            }
                            ou6 ou6VarJ = m79.J(lu6.a, (kb4) objQ6);
                            boolean zF2 = dd4Var3.f(ym7Var2) | dd4Var3.f(d75VarT);
                            boolean z2 = z;
                            boolean zG = zF2 | dd4Var3.g(z2);
                            long j = jC;
                            boolean zE = dd4Var3.e(j) | zG;
                            Object objQ7 = dd4Var3.Q();
                            if (zE || objQ7 == obj8) {
                                lu5 lu5Var = new lu5(z2, j, ym7Var2, d75VarT, ym7Var);
                                dd4Var3.p0(lu5Var);
                                objQ7 = lu5Var;
                            }
                            ou6 ou6VarE = ou6Var.e(md2.C(ou6VarJ, (kb4) objQ7));
                            dd4Var3.q(false);
                            return ou6VarE;
                        }
                    }), false, (rh9) null, (yb4) null, (zb4) null, 0.0f, 0.0f, dd4Var2, 100663304 | (iIntValue2 & 14), 252);
                }
                break;
        }
        return hebVar;
    }
}

package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class z07 implements ac4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ c17 b;
    public final /* synthetic */ br9 c;

    public /* synthetic */ z07(a07 a07Var, c17 c17Var) {
        this.c = a07Var;
        this.b = c17Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        dd4 dd4Var;
        int i = this.a;
        heb hebVar = heb.a;
        Object obj5 = vl1.a;
        br9 br9Var = this.c;
        c17 c17Var = this.b;
        switch (i) {
            case 0:
                pj7 pj7Var = (pj7) obj2;
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((yn0) obj).getClass();
                pj7Var.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= dd4Var2.f(pj7Var) ? 32 : 16;
                }
                if (!dd4Var2.V(iIntValue & 1, (iIntValue & Token.TARGET) != 144)) {
                    dd4Var2.Y();
                } else if (!((a17) br9Var.getValue()).a) {
                    dd4Var2.f0(-1486885898);
                    if (((a17) br9Var.getValue()).b.isEmpty()) {
                        dd4Var2.f0(-1486873436);
                        bx1.d(lx1.n0(dd4Var2), wn9.K((pv9) zu9.Q.getValue(), dd4Var2), wn9.K((pv9) zu9.R.getValue(), dd4Var2), gjb.k0(tg9.c, pj7Var), (String) null, (ib4) null, dd4Var2, 0, 48);
                        dd4Var = dd4Var2;
                        dd4Var.q(false);
                    } else {
                        dd4Var = dd4Var2;
                        dd4Var.f0(-1486472978);
                        px3 px3Var = tg9.c;
                        szb szbVarW = yib.w(pj7Var, new rj7(16.0f, 8.0f, 16.0f, 8.0f));
                        rj7 rj7VarQ = gjb.q(0.0f, 0.0f, 4.0f, 0.0f, 11);
                        boolean zF = dd4Var.f(br9Var) | dd4Var.f(c17Var);
                        Object objQ = dd4Var.Q();
                        if (zF || objQ == obj5) {
                            objQ = new ej4(29, br9Var, c17Var);
                            dd4Var.p0(objQ);
                        }
                        gx1.h(px3Var, null, szbVarW, null, null, null, false, rj7VarQ, 0L, 0L, 0.0f, (kb4) objQ, dd4Var, 100663302, 0, 3834);
                        dd4Var.q(false);
                    }
                    dd4Var.q(false);
                } else {
                    dd4Var2.f0(-1485643325);
                    dd4Var2.q(false);
                }
                break;
            default:
                dr5 dr5Var = (dr5) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                dd4 dd4Var3 = (dd4) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                dr5Var.getClass();
                int i2 = (iIntValue3 & 6) == 0 ? (dd4Var3.f(dr5Var) ? 4 : 2) | iIntValue3 : iIntValue3;
                if ((iIntValue3 & 48) == 0) {
                    i2 |= dd4Var3.d(iIntValue2) ? 32 : 16;
                }
                if (!dd4Var3.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    dd4Var3.Y();
                } else {
                    w78 w78Var = (w78) ((a17) br9Var.getValue()).b.get(iIntValue2);
                    ou6 ou6VarN0 = gjb.n0(dr5.a(dr5Var, tg9.f(lu6.a, 1.0f)), 0.0f, 4.0f, 1);
                    boolean zF2 = dd4Var3.f(c17Var) | dd4Var3.f(br9Var) | ((i2 & Token.ASSIGN_MOD) == 32);
                    Object objQ2 = dd4Var3.Q();
                    if (zF2 || objQ2 == obj5) {
                        objQ2 = new lj(c17Var, iIntValue2, br9Var, 5);
                        dd4Var3.p0(objQ2);
                    }
                    jf0.k(w78Var, ou6VarN0, (ib4) objQ2, dd4Var3, 0);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ z07(c17 c17Var, br9 br9Var) {
        this.b = c17Var;
        this.c = br9Var;
    }
}

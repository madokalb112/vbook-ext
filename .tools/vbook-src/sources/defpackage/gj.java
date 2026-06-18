package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class gj implements zb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gj(ib4 ib4Var, boolean z) {
        this.c = ib4Var;
        this.b = z;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = vl1.a;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                final ib4 ib4Var = (ib4) obj5;
                ou6 ou6Var = (ou6) obj;
                dd4 dd4Var = (dd4) obj2;
                ((Integer) obj3).getClass();
                dd4Var.f0(-196777734);
                final long j = ((cka) dd4Var.j(dka.a)).a;
                boolean zE = dd4Var.e(j) | dd4Var.f(ib4Var);
                final boolean z = this.b;
                boolean zG = zE | dd4Var.g(z);
                Object objQ = dd4Var.Q();
                if (zG || objQ == obj4) {
                    objQ = new kb4() { // from class: hj
                        @Override // defpackage.kb4
                        public final Object invoke(Object obj6) {
                            pw0 pw0Var = (pw0) obj6;
                            return pw0Var.a(new zi(0, ib4Var, t1c.P(pw0Var, Float.intBitsToFloat((int) (pw0Var.a.f() >> 32)) / 2.0f), new gh0(j, 5), z));
                        }
                    };
                    dd4Var.p0(objQ);
                }
                ou6 ou6VarB = md2.B(ou6Var, (kb4) objQ);
                dd4Var.q(false);
                return ou6VarB;
            default:
                rh9 rh9Var = (rh9) obj5;
                ii9 ii9Var = (ii9) obj;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ii9Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? dd4Var2.f(ii9Var) : dd4Var2.h(ii9Var) ? 4 : 2;
                }
                if (dd4Var2.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                    vh9 vh9Var = vh9.a;
                    ou6 ou6VarH = tg9.h(lu6.a, 12.0f);
                    Object objQ2 = dd4Var2.Q();
                    if (objQ2 == obj4) {
                        objQ2 = new vw8(4, (byte) 0);
                        dd4Var2.p0(objQ2);
                    }
                    vh9Var.a(ii9Var, ou6VarH, this.b, rh9Var, (yb4) objQ2, (zb4) null, 2.0f, 0.0f, dd4Var2, 102260792 | (iIntValue & 14), 160);
                } else {
                    dd4Var2.Y();
                }
                return heb.a;
        }
    }

    public /* synthetic */ gj(rh9 rh9Var, boolean z) {
        this.b = z;
        this.c = rh9Var;
    }
}

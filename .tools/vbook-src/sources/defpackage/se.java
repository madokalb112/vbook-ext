package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class se implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ou6 c;

    public /* synthetic */ se(long j, ou6 ou6Var) {
        this.a = 0;
        this.b = j;
        this.c = ou6Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        ou6 ou6Var = this.c;
        heb hebVar = heb.a;
        long j = this.b;
        dd4 dd4Var = (dd4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    ou6 ou6Var2 = this.c;
                    if (j == 9205357640488583168L) {
                        dd4Var.f0(-1243644858);
                        xe.b(0, 0, dd4Var, ou6Var2);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(-1244013944);
                        ou6 ou6VarM = tg9.m(ou6Var2, a23.b(j), a23.a(j), 0.0f, 0.0f, 12);
                        ha6 ha6VarD = pn0.d(bv4.c, false);
                        int iHashCode = Long.hashCode(dd4Var.T);
                        lr7 lr7VarL = dd4Var.l();
                        ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarM);
                        ml1.k.getClass();
                        um1 um1Var = ll1.b;
                        dd4Var.j0();
                        if (dd4Var.S) {
                            dd4Var.k(um1Var);
                        } else {
                            dd4Var.s0();
                        }
                        un9.s(ll1.f, dd4Var, ha6VarD);
                        un9.s(ll1.e, dd4Var, lr7VarL);
                        un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
                        un9.r(dd4Var, ll1.h);
                        un9.s(ll1.d, dd4Var, ou6VarL0);
                        xe.b(0, 1, dd4Var, null);
                        dd4Var.q(true);
                        dd4Var.q(false);
                    }
                }
                break;
            case 1:
                num.getClass();
                s32.S(j, ou6Var, dd4Var, qu1.x0(49));
                break;
            case 2:
                num.getClass();
                ql9.m(j, ou6Var, dd4Var, qu1.x0(49));
                break;
            case 3:
                num.getClass();
                ql9.k(j, ou6Var, dd4Var, qu1.x0(49));
                break;
            case 4:
                num.getClass();
                ql9.h(j, ou6Var, dd4Var, qu1.x0(49));
                break;
            case 5:
                num.getClass();
                ql9.l(j, ou6Var, dd4Var, qu1.x0(49));
                break;
            case 6:
                num.getClass();
                ql9.j(j, ou6Var, dd4Var, qu1.x0(49));
                break;
            case 7:
                num.getClass();
                ql9.o(j, ou6Var, dd4Var, qu1.x0(49));
                break;
            case 8:
                num.getClass();
                ql9.n(j, ou6Var, dd4Var, qu1.x0(49));
                break;
            default:
                num.getClass();
                ql9.i(j, ou6Var, dd4Var, qu1.x0(49));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ se(long j, ou6 ou6Var, int i, int i2) {
        this.a = i2;
        this.b = j;
        this.c = ou6Var;
    }
}

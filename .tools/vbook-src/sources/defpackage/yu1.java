package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yu1 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yu1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                rj1 rj1Var = (rj1) obj3;
                if ((((Number) obj2).intValue() & 3) == 2 && dd4Var.F()) {
                    dd4Var.Y();
                } else {
                    boolean zBooleanValue = ((Boolean) dd4Var.j(ev1.a)).booleanValue();
                    lu6 lu6Var = lu6.a;
                    if (!zBooleanValue) {
                        dd4Var.f0(-373726479);
                        ou6 ou6VarA = kc5.A(lu6Var, kc5.J(dd4Var), 14);
                        eq8 eq8VarA = dq8.a(new mv(8.0f, true, new gp(6)), bv4.w, dd4Var, 6);
                        int iT = fe.T(dd4Var);
                        lr7 lr7VarL = dd4Var.l();
                        ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarA);
                        ml1.k.getClass();
                        um1 um1Var = ll1.b;
                        dd4Var.j0();
                        if (dd4Var.S) {
                            dd4Var.k(um1Var);
                        } else {
                            dd4Var.s0();
                        }
                        un9.s(ll1.f, dd4Var, eq8VarA);
                        un9.s(ll1.e, dd4Var, lr7VarL);
                        jm jmVar = ll1.g;
                        if (dd4Var.S || !lc5.Q(dd4Var.Q(), Integer.valueOf(iT))) {
                            dd4Var.p0(Integer.valueOf(iT));
                            dd4Var.b(Integer.valueOf(iT), jmVar);
                        }
                        un9.s(ll1.d, dd4Var, ou6VarL0);
                        rj1Var.invoke(dd4Var, 0);
                        dd4Var.q(true);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(-373733426);
                        ou6 ou6VarQ = kc5.Q(lu6Var, kc5.J(dd4Var), 14);
                        ie1 ie1VarA = ge1.a(new mv(8.0f, false, new gp(7)), bv4.z, dd4Var, 6);
                        int iT2 = fe.T(dd4Var);
                        lr7 lr7VarL2 = dd4Var.l();
                        ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarQ);
                        ml1.k.getClass();
                        um1 um1Var2 = ll1.b;
                        dd4Var.j0();
                        if (dd4Var.S) {
                            dd4Var.k(um1Var2);
                        } else {
                            dd4Var.s0();
                        }
                        un9.s(ll1.f, dd4Var, ie1VarA);
                        un9.s(ll1.e, dd4Var, lr7VarL2);
                        jm jmVar2 = ll1.g;
                        if (dd4Var.S || !lc5.Q(dd4Var.Q(), Integer.valueOf(iT2))) {
                            dd4Var.p0(Integer.valueOf(iT2));
                            dd4Var.b(Integer.valueOf(iT2), jmVar2);
                        }
                        un9.s(ll1.d, dd4Var, ou6VarL02);
                        rj1Var.invoke(dd4Var, 0);
                        dd4Var.q(true);
                        dd4Var.q(false);
                    }
                }
                break;
            default:
                String str = (String) obj;
                List list = (List) obj2;
                str.getClass();
                list.getClass();
                ((f28) obj3).b(str, list);
                break;
        }
        return hebVar;
    }
}

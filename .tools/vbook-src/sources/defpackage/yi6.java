package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class yi6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ a07 c;

    public /* synthetic */ yi6(boolean z, a07 a07Var, int i) {
        this.a = i;
        this.b = z;
        this.c = a07Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        lu6 lu6Var = lu6.a;
        Object obj3 = vl1.a;
        jt1 jt1Var = null;
        a07 a07Var = this.c;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(1 & iIntValue, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    Object objQ = dd4Var.Q();
                    if (objQ == obj3) {
                        objQ = ky0.f(dd4Var);
                    }
                    z44 z44Var = (z44) objQ;
                    Object objQ2 = dd4Var.Q();
                    if (objQ2 == obj3) {
                        objQ2 = new tb3(z44Var, jt1Var, 4);
                        dd4Var.p0(objQ2);
                    }
                    lc5.u((yb4) objQ2, dd4Var, z44Var);
                    wga wgaVar = (wga) a07Var.getValue();
                    qj5 qj5Var = new qj5(0, 0, Token.ELSE);
                    uw1 uw1Var = ((q96) dd4Var.j(s96.a)).c.b;
                    ou6 ou6VarB = jv3.B(tg9.f(lu6Var, 1.0f), z44Var);
                    Object objQ3 = dd4Var.Q();
                    if (objQ3 == obj3) {
                        objQ3 = new ci6(a07Var, 13);
                        dd4Var.p0(objQ3);
                    }
                    lx1.l(wgaVar, (kb4) objQ3, ou6VarB, false, null, fw.i, null, null, this.b, null, qj5Var, null, true, 0, 0, uw1Var, null, dd4Var, 1572912, 12779520, 6119352);
                    un9.a(dd4Var, tg9.h(lu6Var, 12.0f));
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    Object objQ4 = dd4Var2.Q();
                    if (objQ4 == obj3) {
                        objQ4 = ky0.f(dd4Var2);
                    }
                    z44 z44Var2 = (z44) objQ4;
                    Object objQ5 = dd4Var2.Q();
                    if (objQ5 == obj3) {
                        objQ5 = new tb3(z44Var2, jt1Var, 5);
                        dd4Var2.p0(objQ5);
                    }
                    lc5.u((yb4) objQ5, dd4Var2, z44Var2);
                    wga wgaVar2 = (wga) a07Var.getValue();
                    qj5 qj5Var2 = new qj5(0, 0, Token.ELSE);
                    uw1 uw1Var2 = ((q96) dd4Var2.j(s96.a)).c.b;
                    ou6 ou6VarB2 = jv3.B(tg9.f(lu6Var, 1.0f), z44Var2);
                    Object objQ6 = dd4Var2.Q();
                    if (objQ6 == obj3) {
                        objQ6 = new ci6(a07Var, 14);
                        dd4Var2.p0(objQ6);
                    }
                    lx1.l(wgaVar2, (kb4) objQ6, ou6VarB2, false, null, gjb.p, null, null, this.b, null, qj5Var2, null, true, 0, 0, uw1Var2, null, dd4Var2, 1572912, 12779520, 6119352);
                    un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
                }
                break;
        }
        return hebVar;
    }
}

package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ws1 implements ac4 {
    public final /* synthetic */ js1 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ a07 d;

    public ws1(js1 js1Var, boolean z, kb4 kb4Var, a07 a07Var) {
        this.a = js1Var;
        this.b = z;
        this.c = kb4Var;
        this.d = a07Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        uw1 uw1VarD;
        xi8 xi8Var = (xi8) obj;
        ((Boolean) obj2).getClass();
        dd4 dd4Var = (dd4) obj3;
        int iIntValue = ((Number) obj4).intValue();
        xi8Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= dd4Var.f(xi8Var) ? 4 : 2;
        }
        int i = 0;
        if (dd4Var.V(iIntValue & 1, (iIntValue & Token.DO) != 130)) {
            ou6 ou6VarF = tg9.f(lu6.a, 1.0f);
            if (this.b) {
                dd4Var.f0(1115927899);
                ur9 ur9Var = s96.a;
                uw1VarD = uw1.d(((q96) dd4Var.j(ur9Var)).c.d, ((q96) dd4Var.j(ur9Var)).c.a.a, ((q96) dd4Var.j(ur9Var)).c.a.b, (ax1) null, (ax1) null, 12);
                dd4Var.q(false);
            } else {
                dd4Var.f0(1115925168);
                uw1VarD = ((q96) dd4Var.j(s96.a)).c.a;
                dd4Var.q(false);
            }
            ou6 ou6VarN0 = gjb.n0(fe.L(t96.w(ou6VarF, uw1VarD), dd1.g(((q96) dd4Var.j(s96.a)).a, 1.0f), jf0.G), 12.0f, 0.0f, 2);
            kb4 kb4Var = this.c;
            boolean zF = dd4Var.f(kb4Var);
            a07 a07Var = this.d;
            boolean zF2 = zF | dd4Var.f(a07Var);
            Object objQ = dd4Var.Q();
            Object obj5 = vl1.a;
            if (zF2 || objQ == obj5) {
                objQ = new us1(0, kb4Var, a07Var);
                dd4Var.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            boolean zF3 = dd4Var.f(a07Var);
            js1 js1Var = this.a;
            boolean zH = zF3 | dd4Var.h(js1Var) | dd4Var.f(kb4Var);
            Object objQ2 = dd4Var.Q();
            if (zH || objQ2 == obj5) {
                objQ2 = new vs1(kb4Var, a07Var, js1Var, i);
                dd4Var.p0(objQ2);
            }
            kc5.j(xi8Var, js1Var, ou6VarN0, ib4Var, (kb4) objQ2, dd4Var, (iIntValue & 14) | 64);
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }
}

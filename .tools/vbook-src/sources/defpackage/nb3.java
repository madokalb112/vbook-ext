package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class nb3 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb4 b;
    public final /* synthetic */ a07 c;

    public /* synthetic */ nb3(a07 a07Var, kb4 kb4Var) {
        this.a = 2;
        this.c = a07Var;
        this.b = kb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = vl1.a;
        a07 a07Var = this.c;
        kb4 kb4Var = this.b;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    boolean zA0 = true ^ bw9.a0((String) a07Var.getValue());
                    boolean zF = dd4Var.f(kb4Var) | dd4Var.f(a07Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj3) {
                        objQ = new l50(2, kb4Var, a07Var);
                        dd4Var.p0(objQ);
                    }
                    lc5.J((ib4) objQ, null, zA0, null, null, null, s32.g, dd4Var, 805306368, 506);
                }
                break;
            case 1:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    boolean zF2 = dd4Var2.f(kb4Var);
                    Object objQ2 = dd4Var2.Q();
                    if (zF2 || objQ2 == obj3) {
                        objQ2 = new l50(5, kb4Var, a07Var);
                        dd4Var2.p0(objQ2);
                    }
                    lc5.J((ib4) objQ2, null, false, null, null, null, md2.s, dd4Var2, 805306368, 510);
                }
                break;
            case 2:
                dd4 dd4Var3 = (dd4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dd4Var3.Y();
                } else {
                    lu6 lu6Var = lu6.a;
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var3, 0);
                    int iHashCode = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL = dd4Var3.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var3, ou6VarF);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(ll1.f, dd4Var3, ie1VarA);
                    un9.s(ll1.e, dd4Var3, lr7VarL);
                    un9.s(ll1.g, dd4Var3, Integer.valueOf(iHashCode));
                    un9.r(dd4Var3, ll1.h);
                    un9.s(ll1.d, dd4Var3, ou6VarL0);
                    ou6 ou6VarM0 = gjb.m0(xv5.h(lu6Var, 12.0f, dd4Var3, lu6Var, 1.0f), 16.0f, 8.0f);
                    boolean z = ((lm8) a07Var.getValue()) == lm8.a;
                    String strK = wn9.K((pv9) vu9.j.getValue(), dd4Var3);
                    String strK2 = wn9.K((pv9) vu9.k.getValue(), dd4Var3);
                    boolean zF3 = dd4Var3.f(a07Var);
                    Object objQ3 = dd4Var3.Q();
                    if (zF3 || objQ3 == obj3) {
                        objQ3 = new cl6(a07Var, 10);
                        dd4Var3.p0(objQ3);
                    }
                    e11.w(strK, strK2, ou6VarM0, false, z, (kb4) objQ3, dd4Var3, 384, 8);
                    ou6 ou6VarM02 = gjb.m0(tg9.f(lu6Var, 1.0f), 16.0f, 8.0f);
                    boolean z2 = ((lm8) a07Var.getValue()) == lm8.b;
                    String strK3 = wn9.K((pv9) vu9.f.getValue(), dd4Var3);
                    String strK4 = wn9.K((pv9) vu9.g.getValue(), dd4Var3);
                    boolean zF4 = dd4Var3.f(a07Var);
                    Object objQ4 = dd4Var3.Q();
                    if (zF4 || objQ4 == obj3) {
                        objQ4 = new cl6(a07Var, 11);
                        dd4Var3.p0(objQ4);
                    }
                    e11.w(strK3, strK4, ou6VarM02, false, z2, (kb4) objQ4, dd4Var3, 384, 8);
                    ou6 ou6VarM03 = gjb.m0(tg9.f(lu6Var, 1.0f), 16.0f, 8.0f);
                    boolean z3 = ((lm8) a07Var.getValue()) == lm8.c;
                    String strK5 = wn9.K((pv9) vu9.h.getValue(), dd4Var3);
                    String strK6 = wn9.K((pv9) vu9.i.getValue(), dd4Var3);
                    boolean zF5 = dd4Var3.f(a07Var);
                    Object objQ5 = dd4Var3.Q();
                    if (zF5 || objQ5 == obj3) {
                        objQ5 = new cl6(a07Var, 12);
                        dd4Var3.p0(objQ5);
                    }
                    e11.w(strK5, strK6, ou6VarM03, false, z3, (kb4) objQ5, dd4Var3, 384, 8);
                    un9.a(dd4Var3, tg9.h(lu6Var, 12.0f));
                    String strK7 = wn9.K((pv9) iu9.v.getValue(), dd4Var3);
                    ou6 ou6VarF2 = tg9.f(gjb.n0(lu6Var, 12.0f, 0.0f, 2), 1.0f);
                    boolean zF6 = dd4Var3.f(kb4Var) | dd4Var3.f(a07Var);
                    Object objQ6 = dd4Var3.Q();
                    if (zF6 || objQ6 == obj3) {
                        objQ6 = new l50(7, kb4Var, a07Var);
                        dd4Var3.p0(objQ6);
                    }
                    kc5.n(null, strK7, false, null, ou6VarF2, null, null, null, (ib4) objQ6, dd4Var3, 24582, 236);
                    xv5.A(lu6Var, 8.0f, dd4Var3, true);
                }
                break;
            default:
                dd4 dd4Var4 = (dd4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!dd4Var4.V(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    dd4Var4.Y();
                } else {
                    boolean zF7 = dd4Var4.f(kb4Var) | dd4Var4.f(a07Var);
                    Object objQ7 = dd4Var4.Q();
                    if (zF7 || objQ7 == obj3) {
                        objQ7 = new l50(9, kb4Var, a07Var);
                        dd4Var4.p0(objQ7);
                    }
                    lc5.J((ib4) objQ7, null, false, null, null, null, yb0.s, dd4Var4, 805306368, 510);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ nb3(int i, kb4 kb4Var, a07 a07Var) {
        this.a = i;
        this.b = kb4Var;
        this.c = a07Var;
    }
}

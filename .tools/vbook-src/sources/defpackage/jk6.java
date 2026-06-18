package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class jk6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u83 b;

    public /* synthetic */ jk6(u83 u83Var, int i) {
        this.a = i;
        this.b = u83Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        long jC;
        final int i;
        int i2 = this.a;
        lu6 lu6Var = lu6.a;
        jt1 jt1Var = null;
        heb hebVar = heb.a;
        Object obj3 = vl1.a;
        final u83 u83Var = this.b;
        int i3 = 1;
        switch (i2) {
            case 0:
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    p35 p35VarC = i25.c((m53) f53.H.getValue(), dd4Var, 0);
                    if (((Boolean) u83Var.e.getValue()).booleanValue()) {
                        dd4Var.f0(-1529340531);
                        jC = ((q96) dd4Var.j(s96.a)).a.a;
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(-1529245640);
                        jC = lc1.c(0.5f, ((q96) dd4Var.j(s96.a)).a.q);
                        dd4Var.q(false);
                    }
                    ou6 ou6VarN = tg9.n(lu6Var, 24.0f);
                    boolean zF = dd4Var.f(u83Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj3) {
                        final int i4 = 7;
                        objQ = new ib4() { // from class: kk6
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i5 = i4;
                                heb hebVar2 = heb.a;
                                u83 u83Var2 = u83Var;
                                switch (i5) {
                                    case 0:
                                        u83Var2.d.setValue(Boolean.TRUE);
                                        break;
                                    case 1:
                                        u83Var2.d.setValue(Boolean.FALSE);
                                        break;
                                    case 2:
                                        u83Var2.c(js8.l(0, u83Var2.a()));
                                        break;
                                    case 3:
                                        u83Var2.c(js8.l(1, u83Var2.a()));
                                        break;
                                    case 4:
                                        u83Var2.c(js8.l(2, u83Var2.a()));
                                        break;
                                    case 5:
                                        u83Var2.c(js8.l(-1, u83Var2.a()));
                                        break;
                                    case 6:
                                        u83Var2.c(js8.l(Integer.MAX_VALUE, u83Var2.a()));
                                        break;
                                    case 7:
                                        u83Var2.e.setValue(Boolean.valueOf(!((Boolean) u83Var2.e.getValue()).booleanValue()));
                                        break;
                                    default:
                                        u83Var2.b();
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var.p0(objQ);
                    }
                    mx4.a(p35VarC, (String) null, fw.J(null, (ib4) objQ, ou6VarN, false, 15), jC, dd4Var, 48, 0);
                }
                break;
            case 1:
                dd4 dd4Var2 = (dd4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd4Var2.Y();
                } else {
                    boolean zF2 = dd4Var2.f(u83Var);
                    Object objQ2 = dd4Var2.Q();
                    if (zF2 || objQ2 == obj3) {
                        final int i5 = 8;
                        objQ2 = new ib4() { // from class: kk6
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i52 = i5;
                                heb hebVar2 = heb.a;
                                u83 u83Var2 = u83Var;
                                switch (i52) {
                                    case 0:
                                        u83Var2.d.setValue(Boolean.TRUE);
                                        break;
                                    case 1:
                                        u83Var2.d.setValue(Boolean.FALSE);
                                        break;
                                    case 2:
                                        u83Var2.c(js8.l(0, u83Var2.a()));
                                        break;
                                    case 3:
                                        u83Var2.c(js8.l(1, u83Var2.a()));
                                        break;
                                    case 4:
                                        u83Var2.c(js8.l(2, u83Var2.a()));
                                        break;
                                    case 5:
                                        u83Var2.c(js8.l(-1, u83Var2.a()));
                                        break;
                                    case 6:
                                        u83Var2.c(js8.l(Integer.MAX_VALUE, u83Var2.a()));
                                        break;
                                    case 7:
                                        u83Var2.e.setValue(Boolean.valueOf(!((Boolean) u83Var2.e.getValue()).booleanValue()));
                                        break;
                                    default:
                                        u83Var2.b();
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var2.p0(objQ2);
                    }
                    lc5.J((ib4) objQ2, null, false, null, null, null, s32.n, dd4Var2, 805306368, 510);
                }
                break;
            default:
                dd4 dd4Var3 = (dd4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dd4Var3.Y();
                } else {
                    Object objQ3 = dd4Var3.Q();
                    if (objQ3 == obj3) {
                        objQ3 = ky0.f(dd4Var3);
                    }
                    z44 z44Var = (z44) objQ3;
                    Object objQ4 = dd4Var3.Q();
                    if (objQ4 == obj3) {
                        objQ4 = new tb3(z44Var, jt1Var, 12);
                        dd4Var3.p0(objQ4);
                    }
                    lc5.u((yb4) objQ4, dd4Var3, z44Var);
                    ou6 ou6VarQ = kc5.Q(tg9.f(lu6Var, 1.0f), kc5.J(dd4Var3), 14);
                    ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var3, 0);
                    int iHashCode = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL = dd4Var3.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var3, ou6VarQ);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var);
                    } else {
                        dd4Var3.s0();
                    }
                    jm jmVar = ll1.f;
                    un9.s(jmVar, dd4Var3, ie1VarA);
                    jm jmVar2 = ll1.e;
                    un9.s(jmVar2, dd4Var3, lr7VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    jm jmVar3 = ll1.g;
                    un9.s(jmVar3, dd4Var3, numValueOf);
                    kd kdVar = ll1.h;
                    un9.r(dd4Var3, kdVar);
                    jm jmVar4 = ll1.d;
                    un9.s(jmVar4, dd4Var3, ou6VarL0);
                    cn7 cn7Var = u83Var.b;
                    cn7 cn7Var2 = u83Var.d;
                    cn7 cn7Var3 = u83Var.f;
                    String str = (String) cn7Var.getValue();
                    boolean z = !((Boolean) cn7Var3.getValue()).booleanValue();
                    qj5 qj5Var = new qj5(0, 7, Token.INC);
                    uw1 uw1Var = s00.p(dd4Var3).b;
                    ou6 ou6VarN0 = gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2);
                    if (((Boolean) cn7Var3.getValue()).booleanValue()) {
                        ou6VarN0 = jv3.B(ou6VarN0, z44Var);
                    }
                    boolean zF3 = dd4Var3.f(u83Var);
                    Object objQ5 = dd4Var3.Q();
                    if (zF3 || objQ5 == obj3) {
                        objQ5 = new ik6(u83Var, 2);
                        dd4Var3.p0(objQ5);
                    }
                    lx1.m(str, (kb4) objQ5, ou6VarN0, false, z, null, s32.p, null, null, null, false, null, qj5Var, null, false, 0, 0, uw1Var, null, dd4Var3, 1572864, 196608, 6258600);
                    un9.a(dd4Var3, tg9.h(lu6Var, 12.0f));
                    String strA = u83Var.a();
                    qj5 qj5Var2 = new qj5(0, 7, Token.INC);
                    uw1 uw1Var2 = s00.p(dd4Var3).b;
                    ou6 ou6VarN02 = gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2);
                    if (!((Boolean) cn7Var3.getValue()).booleanValue()) {
                        ou6VarN02 = jv3.B(ou6VarN02, z44Var);
                    }
                    boolean zF4 = dd4Var3.f(u83Var);
                    Object objQ6 = dd4Var3.Q();
                    if (zF4 || objQ6 == obj3) {
                        objQ6 = new ik6(u83Var, i3);
                        dd4Var3.p0(objQ6);
                    }
                    lx1.m(strA, (kb4) objQ6, ou6VarN02, false, false, null, s32.q, null, null, jf0.G(-2088785732, new jk6(u83Var, 0), dd4Var3), false, null, qj5Var2, null, false, 0, 0, uw1Var2, null, dd4Var3, 806879232, 196608, 6258104);
                    ou6 ou6VarA = kc5.A(gjb.m0(tg9.f(lu6Var, 1.0f), 8.0f, 8.0f), kc5.J(dd4Var3), 14);
                    wf0 wf0Var = bv4.x;
                    iv ivVar = pv.a;
                    eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var3, 48);
                    int iHashCode2 = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL2 = dd4Var3.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var3, ou6VarA);
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(jmVar, dd4Var3, eq8VarA);
                    un9.s(jmVar2, dd4Var3, lr7VarL2);
                    ky0.v(iHashCode2, dd4Var3, jmVar3, dd4Var3, kdVar);
                    un9.s(jmVar4, dd4Var3, ou6VarL02);
                    ou6 ou6VarG = fw.G(t96.w(lu6Var, s00.p(dd4Var3).b), 1.0f, dd1.g(s00.o(dd4Var3), 4.0f), s00.p(dd4Var3).b);
                    wf0 wf0Var2 = bv4.w;
                    eq8 eq8VarA2 = dq8.a(ivVar, wf0Var2, dd4Var3, 0);
                    int iHashCode3 = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL3 = dd4Var3.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var3, ou6VarG);
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(jmVar, dd4Var3, eq8VarA2);
                    un9.s(jmVar2, dd4Var3, lr7VarL3);
                    ky0.v(iHashCode3, dd4Var3, jmVar3, dd4Var3, kdVar);
                    un9.s(jmVar4, dd4Var3, ou6VarL03);
                    String strK = wn9.K((pv9) mu9.E.getValue(), dd4Var3);
                    boolean zBooleanValue = ((Boolean) cn7Var2.getValue()).booleanValue();
                    boolean zF5 = dd4Var3.f(u83Var);
                    Object objQ7 = dd4Var3.Q();
                    if (zF5 || objQ7 == obj3) {
                        i = 0;
                        objQ7 = new ib4() { // from class: kk6
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i52 = i;
                                heb hebVar2 = heb.a;
                                u83 u83Var2 = u83Var;
                                switch (i52) {
                                    case 0:
                                        u83Var2.d.setValue(Boolean.TRUE);
                                        break;
                                    case 1:
                                        u83Var2.d.setValue(Boolean.FALSE);
                                        break;
                                    case 2:
                                        u83Var2.c(js8.l(0, u83Var2.a()));
                                        break;
                                    case 3:
                                        u83Var2.c(js8.l(1, u83Var2.a()));
                                        break;
                                    case 4:
                                        u83Var2.c(js8.l(2, u83Var2.a()));
                                        break;
                                    case 5:
                                        u83Var2.c(js8.l(-1, u83Var2.a()));
                                        break;
                                    case 6:
                                        u83Var2.c(js8.l(Integer.MAX_VALUE, u83Var2.a()));
                                        break;
                                    case 7:
                                        u83Var2.e.setValue(Boolean.valueOf(!((Boolean) u83Var2.e.getValue()).booleanValue()));
                                        break;
                                    default:
                                        u83Var2.b();
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var3.p0(objQ7);
                    } else {
                        i = 0;
                    }
                    y86.l(strK, zBooleanValue, (ib4) objQ7, dd4Var3, i);
                    String strK2 = wn9.K((pv9) iu9.i.getValue(), dd4Var3);
                    final int i6 = 1;
                    boolean z2 = !((Boolean) cn7Var2.getValue()).booleanValue();
                    boolean zF6 = dd4Var3.f(u83Var);
                    Object objQ8 = dd4Var3.Q();
                    if (zF6 || objQ8 == obj3) {
                        objQ8 = new ib4() { // from class: kk6
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i52 = i6;
                                heb hebVar2 = heb.a;
                                u83 u83Var2 = u83Var;
                                switch (i52) {
                                    case 0:
                                        u83Var2.d.setValue(Boolean.TRUE);
                                        break;
                                    case 1:
                                        u83Var2.d.setValue(Boolean.FALSE);
                                        break;
                                    case 2:
                                        u83Var2.c(js8.l(0, u83Var2.a()));
                                        break;
                                    case 3:
                                        u83Var2.c(js8.l(1, u83Var2.a()));
                                        break;
                                    case 4:
                                        u83Var2.c(js8.l(2, u83Var2.a()));
                                        break;
                                    case 5:
                                        u83Var2.c(js8.l(-1, u83Var2.a()));
                                        break;
                                    case 6:
                                        u83Var2.c(js8.l(Integer.MAX_VALUE, u83Var2.a()));
                                        break;
                                    case 7:
                                        u83Var2.e.setValue(Boolean.valueOf(!((Boolean) u83Var2.e.getValue()).booleanValue()));
                                        break;
                                    default:
                                        u83Var2.b();
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var3.p0(objQ8);
                    }
                    y86.l(strK2, z2, (ib4) objQ8, dd4Var3, 0);
                    ky0.A(dd4Var3, true, lu6Var, 8.0f, dd4Var3);
                    ou6 ou6VarG2 = fw.G(t96.w(lu6Var, s00.p(dd4Var3).b), 1.0f, dd1.g(s00.o(dd4Var3), 4.0f), s00.p(dd4Var3).b);
                    eq8 eq8VarA3 = dq8.a(ivVar, wf0Var2, dd4Var3, 0);
                    int iHashCode4 = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL4 = dd4Var3.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var3, ou6VarG2);
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(jmVar, dd4Var3, eq8VarA3);
                    un9.s(jmVar2, dd4Var3, lr7VarL4);
                    ky0.v(iHashCode4, dd4Var3, jmVar3, dd4Var3, kdVar);
                    un9.s(jmVar4, dd4Var3, ou6VarL04);
                    boolean zF7 = dd4Var3.f(u83Var);
                    Object objQ9 = dd4Var3.Q();
                    if (zF7 || objQ9 == obj3) {
                        final int i7 = 2;
                        objQ9 = new ib4() { // from class: kk6
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i52 = i7;
                                heb hebVar2 = heb.a;
                                u83 u83Var2 = u83Var;
                                switch (i52) {
                                    case 0:
                                        u83Var2.d.setValue(Boolean.TRUE);
                                        break;
                                    case 1:
                                        u83Var2.d.setValue(Boolean.FALSE);
                                        break;
                                    case 2:
                                        u83Var2.c(js8.l(0, u83Var2.a()));
                                        break;
                                    case 3:
                                        u83Var2.c(js8.l(1, u83Var2.a()));
                                        break;
                                    case 4:
                                        u83Var2.c(js8.l(2, u83Var2.a()));
                                        break;
                                    case 5:
                                        u83Var2.c(js8.l(-1, u83Var2.a()));
                                        break;
                                    case 6:
                                        u83Var2.c(js8.l(Integer.MAX_VALUE, u83Var2.a()));
                                        break;
                                    case 7:
                                        u83Var2.e.setValue(Boolean.valueOf(!((Boolean) u83Var2.e.getValue()).booleanValue()));
                                        break;
                                    default:
                                        u83Var2.b();
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var3.p0(objQ9);
                    }
                    y86.a("aa", 0, (ib4) objQ9, dd4Var3, 54);
                    boolean zF8 = dd4Var3.f(u83Var);
                    Object objQ10 = dd4Var3.Q();
                    if (zF8 || objQ10 == obj3) {
                        final int i8 = 3;
                        objQ10 = new ib4() { // from class: kk6
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i52 = i8;
                                heb hebVar2 = heb.a;
                                u83 u83Var2 = u83Var;
                                switch (i52) {
                                    case 0:
                                        u83Var2.d.setValue(Boolean.TRUE);
                                        break;
                                    case 1:
                                        u83Var2.d.setValue(Boolean.FALSE);
                                        break;
                                    case 2:
                                        u83Var2.c(js8.l(0, u83Var2.a()));
                                        break;
                                    case 3:
                                        u83Var2.c(js8.l(1, u83Var2.a()));
                                        break;
                                    case 4:
                                        u83Var2.c(js8.l(2, u83Var2.a()));
                                        break;
                                    case 5:
                                        u83Var2.c(js8.l(-1, u83Var2.a()));
                                        break;
                                    case 6:
                                        u83Var2.c(js8.l(Integer.MAX_VALUE, u83Var2.a()));
                                        break;
                                    case 7:
                                        u83Var2.e.setValue(Boolean.valueOf(!((Boolean) u83Var2.e.getValue()).booleanValue()));
                                        break;
                                    default:
                                        u83Var2.b();
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var3.p0(objQ10);
                    }
                    y86.a("Aa", 1, (ib4) objQ10, dd4Var3, 54);
                    boolean zF9 = dd4Var3.f(u83Var);
                    Object objQ11 = dd4Var3.Q();
                    if (zF9 || objQ11 == obj3) {
                        final int i9 = 4;
                        objQ11 = new ib4() { // from class: kk6
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i52 = i9;
                                heb hebVar2 = heb.a;
                                u83 u83Var2 = u83Var;
                                switch (i52) {
                                    case 0:
                                        u83Var2.d.setValue(Boolean.TRUE);
                                        break;
                                    case 1:
                                        u83Var2.d.setValue(Boolean.FALSE);
                                        break;
                                    case 2:
                                        u83Var2.c(js8.l(0, u83Var2.a()));
                                        break;
                                    case 3:
                                        u83Var2.c(js8.l(1, u83Var2.a()));
                                        break;
                                    case 4:
                                        u83Var2.c(js8.l(2, u83Var2.a()));
                                        break;
                                    case 5:
                                        u83Var2.c(js8.l(-1, u83Var2.a()));
                                        break;
                                    case 6:
                                        u83Var2.c(js8.l(Integer.MAX_VALUE, u83Var2.a()));
                                        break;
                                    case 7:
                                        u83Var2.e.setValue(Boolean.valueOf(!((Boolean) u83Var2.e.getValue()).booleanValue()));
                                        break;
                                    default:
                                        u83Var2.b();
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var3.p0(objQ11);
                    }
                    y86.a("Aa", 2, (ib4) objQ11, dd4Var3, 54);
                    boolean zF10 = dd4Var3.f(u83Var);
                    Object objQ12 = dd4Var3.Q();
                    if (zF10 || objQ12 == obj3) {
                        final int i10 = 5;
                        objQ12 = new ib4() { // from class: kk6
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i52 = i10;
                                heb hebVar2 = heb.a;
                                u83 u83Var2 = u83Var;
                                switch (i52) {
                                    case 0:
                                        u83Var2.d.setValue(Boolean.TRUE);
                                        break;
                                    case 1:
                                        u83Var2.d.setValue(Boolean.FALSE);
                                        break;
                                    case 2:
                                        u83Var2.c(js8.l(0, u83Var2.a()));
                                        break;
                                    case 3:
                                        u83Var2.c(js8.l(1, u83Var2.a()));
                                        break;
                                    case 4:
                                        u83Var2.c(js8.l(2, u83Var2.a()));
                                        break;
                                    case 5:
                                        u83Var2.c(js8.l(-1, u83Var2.a()));
                                        break;
                                    case 6:
                                        u83Var2.c(js8.l(Integer.MAX_VALUE, u83Var2.a()));
                                        break;
                                    case 7:
                                        u83Var2.e.setValue(Boolean.valueOf(!((Boolean) u83Var2.e.getValue()).booleanValue()));
                                        break;
                                    default:
                                        u83Var2.b();
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var3.p0(objQ12);
                    }
                    y86.a("Aa", 0, (ib4) objQ12, dd4Var3, 54);
                    boolean zF11 = dd4Var3.f(u83Var);
                    Object objQ13 = dd4Var3.Q();
                    if (zF11 || objQ13 == obj3) {
                        final int i11 = 6;
                        objQ13 = new ib4() { // from class: kk6
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i52 = i11;
                                heb hebVar2 = heb.a;
                                u83 u83Var2 = u83Var;
                                switch (i52) {
                                    case 0:
                                        u83Var2.d.setValue(Boolean.TRUE);
                                        break;
                                    case 1:
                                        u83Var2.d.setValue(Boolean.FALSE);
                                        break;
                                    case 2:
                                        u83Var2.c(js8.l(0, u83Var2.a()));
                                        break;
                                    case 3:
                                        u83Var2.c(js8.l(1, u83Var2.a()));
                                        break;
                                    case 4:
                                        u83Var2.c(js8.l(2, u83Var2.a()));
                                        break;
                                    case 5:
                                        u83Var2.c(js8.l(-1, u83Var2.a()));
                                        break;
                                    case 6:
                                        u83Var2.c(js8.l(Integer.MAX_VALUE, u83Var2.a()));
                                        break;
                                    case 7:
                                        u83Var2.e.setValue(Boolean.valueOf(!((Boolean) u83Var2.e.getValue()).booleanValue()));
                                        break;
                                    default:
                                        u83Var2.b();
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var3.p0(objQ13);
                    }
                    y86.a("AA", 0, (ib4) objQ13, dd4Var3, 54);
                    tw2.x(dd4Var3, true, true, true);
                    un9.a(dd4Var3, tg9.h(lu6Var, 12.0f));
                }
                break;
        }
        return hebVar;
    }
}

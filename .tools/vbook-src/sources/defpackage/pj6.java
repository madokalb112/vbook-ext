package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class pj6 implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cv2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ a07 d;
    public final /* synthetic */ kb4 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ br9 s;

    public /* synthetic */ pj6(cv2 cv2Var, String str, a07 a07Var, kb4 kb4Var, String str2, a07 a07Var2, int i) {
        this.a = i;
        this.b = cv2Var;
        this.c = str;
        this.d = a07Var;
        this.e = kb4Var;
        this.f = str2;
        this.s = a07Var2;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        final a07 a07Var;
        heb hebVar;
        br9 br9Var;
        a07 a07Var2;
        final a07 a07Var3;
        int i = this.a;
        heb hebVar2 = heb.a;
        iv ivVar = pv.a;
        jv jvVar = pv.c;
        lu6 lu6Var = lu6.a;
        Object obj4 = vl1.a;
        jt1 jt1Var = null;
        br9 br9Var2 = this.s;
        kb4 kb4Var = this.e;
        String str = this.c;
        switch (i) {
            case 0:
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((co0) obj).getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                } else {
                    final uk9 uk9Var = (uk9) dd4Var.j(xm1.q);
                    Object objQ = dd4Var.Q();
                    if (objQ == obj4) {
                        objQ = ky0.f(dd4Var);
                    }
                    z44 z44Var = (z44) objQ;
                    Object objQ2 = dd4Var.Q();
                    if (objQ2 == obj4) {
                        int length = str.length();
                        objQ2 = dk9.x(new wga(str, zk9.h(length, length), 4));
                        dd4Var.p0(objQ2);
                    }
                    final a07 a07Var4 = (a07) objQ2;
                    String str2 = ((wga) a07Var4.getValue()).a.b;
                    final cv2 cv2Var = this.b;
                    boolean zF = dd4Var.f(cv2Var);
                    Object objQ3 = dd4Var.Q();
                    if (zF || objQ3 == obj4) {
                        objQ3 = new rj6(cv2Var, a07Var4, null, 1);
                        dd4Var.p0(objQ3);
                    }
                    lc5.u((yb4) objQ3, dd4Var, str2);
                    boolean zF2 = dd4Var.f(uk9Var);
                    Object objQ4 = dd4Var.Q();
                    if (zF2 || objQ4 == obj4) {
                        objQ4 = new n85(z44Var, uk9Var, null, 2);
                        dd4Var.p0(objQ4);
                    }
                    lc5.u((yb4) objQ4, dd4Var, z44Var);
                    px3 px3Var = tg9.c;
                    ou6 ou6VarE = yn2.E(yib.E(fe.L(px3Var, ((q96) dd4Var.j(s96.a)).a.p, jf0.G), 15), dd4Var, 0);
                    ie1 ie1VarA = ge1.a(jvVar, bv4.z, dd4Var, 0);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarE);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    jm jmVar = ll1.f;
                    un9.s(jmVar, dd4Var, ie1VarA);
                    jm jmVar2 = ll1.e;
                    un9.s(jmVar2, dd4Var, lr7VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    jm jmVar3 = ll1.g;
                    un9.s(jmVar3, dd4Var, numValueOf);
                    kd kdVar = ll1.h;
                    un9.r(dd4Var, kdVar);
                    jm jmVar4 = ll1.d;
                    un9.s(jmVar4, dd4Var, ou6VarL0);
                    ou6 ou6VarH = tg9.h(tg9.f(lu6Var, 1.0f), 64.0f);
                    eq8 eq8VarA = dq8.a(ivVar, bv4.x, dd4Var, 48);
                    int iHashCode2 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL2 = dd4Var.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarH);
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(jmVar, dd4Var, eq8VarA);
                    un9.s(jmVar2, dd4Var, lr7VarL2);
                    ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
                    un9.s(jmVar4, dd4Var, ou6VarL02);
                    un9.a(dd4Var, tg9.r(lu6Var, 8.0f));
                    p35 p35VarC = i25.c((m53) a53.d.getValue(), dd4Var, 0);
                    String strK = wn9.K((pv9) vt9.I.getValue(), dd4Var);
                    ou6 ou6VarW = t96.w(tg9.n(lu6Var, 40.0f), tp8.a);
                    boolean zF3 = dd4Var.f(kb4Var);
                    Object objQ5 = dd4Var.Q();
                    if (zF3 || objQ5 == obj4) {
                        objQ5 = new b41(25, kb4Var);
                        dd4Var.p0(objQ5);
                    }
                    mx4.a(p35VarC, strK, gjb.l0(fw.J(null, (ib4) objQ5, ou6VarW, false, 15), 8.0f), 0L, dd4Var, 0, 8);
                    wga wgaVar = (wga) a07Var4.getValue();
                    long j = lc1.i;
                    bp5 bp5Var = new bp5(1.0f, true);
                    Object objQ6 = dd4Var.Q();
                    if (objQ6 == obj4) {
                        objQ6 = new ci6(a07Var4, 18);
                        dd4Var.p0(objQ6);
                    }
                    kb4 kb4Var2 = (kb4) objQ6;
                    boolean zF4 = dd4Var.f(uk9Var) | dd4Var.f(cv2Var);
                    final a07 a07Var5 = this.d;
                    boolean zF5 = zF4 | dd4Var.f(a07Var5);
                    Object objQ7 = dd4Var.Q();
                    if (zF5 || objQ7 == obj4) {
                        final int i2 = 1;
                        objQ7 = new ib4() { // from class: nj6
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i3 = i2;
                                heb hebVar3 = heb.a;
                                a07 a07Var6 = a07Var5;
                                a07 a07Var7 = a07Var4;
                                cv2 cv2Var2 = cv2Var;
                                an2 an2Var = uk9Var;
                                switch (i3) {
                                    case 0:
                                        if (an2Var != null) {
                                            an2Var.a();
                                        }
                                        cv2Var2.k(((wga) a07Var7.getValue()).a.b);
                                        ((kb4) a07Var6.getValue()).invoke(((wga) a07Var7.getValue()).a.b);
                                        break;
                                    default:
                                        if (an2Var != null) {
                                            an2Var.a();
                                        }
                                        cv2Var2.k(((wga) a07Var7.getValue()).a.b);
                                        ((kb4) a07Var6.getValue()).invoke(((wga) a07Var7.getValue()).a.b);
                                        break;
                                }
                                return hebVar3;
                            }
                        };
                        a07Var = a07Var5;
                        dd4Var.p0(objQ7);
                    } else {
                        a07Var = a07Var5;
                    }
                    e11.A(wgaVar, this.f, 0L, j, null, z44Var, bp5Var, kb4Var2, (ib4) objQ7, dd4Var, 12807168, 4);
                    dd4Var.q(true);
                    y86.c(0.0f, 6, 6, 0L, dd4Var, tg9.f(lu6Var, 1.0f));
                    List list = ((av2) br9Var2.getValue()).a;
                    ou6 ou6VarN0 = gjb.n0(px3Var, 0.0f, 12.0f, 1);
                    boolean zF6 = dd4Var.f(uk9Var) | dd4Var.f(cv2Var) | dd4Var.f(a07Var);
                    Object objQ8 = dd4Var.Q();
                    if (zF6 || objQ8 == obj4) {
                        final int i3 = 1;
                        objQ8 = new kb4() { // from class: oj6
                            @Override // defpackage.kb4
                            public final Object invoke(Object obj5) {
                                int i4 = i3;
                                heb hebVar3 = heb.a;
                                a07 a07Var6 = a07Var;
                                cv2 cv2Var2 = cv2Var;
                                an2 an2Var = uk9Var;
                                String str3 = (String) obj5;
                                switch (i4) {
                                    case 0:
                                        str3.getClass();
                                        if (an2Var != null) {
                                            an2Var.a();
                                        }
                                        cv2Var2.k(str3);
                                        ((kb4) a07Var6.getValue()).invoke(str3);
                                        break;
                                    default:
                                        str3.getClass();
                                        if (an2Var != null) {
                                            an2Var.a();
                                        }
                                        cv2Var2.k(str3);
                                        ((kb4) a07Var6.getValue()).invoke(str3);
                                        break;
                                }
                                return hebVar3;
                            }
                        };
                        dd4Var.p0(objQ8);
                    }
                    kb4 kb4Var3 = (kb4) objQ8;
                    Object objQ9 = dd4Var.Q();
                    if (objQ9 == obj4) {
                        objQ9 = new ci6(a07Var4, 19);
                        dd4Var.p0(objQ9);
                    }
                    kb4 kb4Var4 = (kb4) objQ9;
                    boolean zF7 = dd4Var.f(cv2Var);
                    Object objQ10 = dd4Var.Q();
                    if (zF7 || objQ10 == obj4) {
                        final int i4 = 0;
                        objQ10 = new kb4() { // from class: mj6
                            @Override // defpackage.kb4
                            public final Object invoke(Object obj5) {
                                int i5 = i4;
                                heb hebVar3 = heb.a;
                                cv2 cv2Var2 = cv2Var;
                                String str3 = (String) obj5;
                                switch (i5) {
                                    case 0:
                                        str3.getClass();
                                        za1 za1VarA = vtb.a(cv2Var2);
                                        aj2 aj2Var = rw2.a;
                                        cv2Var2.g(za1VarA, nh2.c, new bv2(cv2Var2, str3, null, 0));
                                        break;
                                    default:
                                        str3.getClass();
                                        za1 za1VarA2 = vtb.a(cv2Var2);
                                        aj2 aj2Var2 = rw2.a;
                                        cv2Var2.g(za1VarA2, nh2.c, new bv2(cv2Var2, str3, null, 0));
                                        break;
                                }
                                return hebVar3;
                            }
                        };
                        dd4Var.p0(objQ10);
                    }
                    wx1.d(list, ou6VarN0, kb4Var3, kb4Var4, (kb4) objQ10, dd4Var, 3120);
                    dd4Var.q(true);
                }
                break;
            default:
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((co0) obj).getClass();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dd4Var2.Y();
                } else {
                    final uk9 uk9Var2 = (uk9) dd4Var2.j(xm1.q);
                    Object objQ11 = dd4Var2.Q();
                    if (objQ11 == obj4) {
                        objQ11 = ky0.f(dd4Var2);
                    }
                    z44 z44Var2 = (z44) objQ11;
                    Object objQ12 = dd4Var2.Q();
                    if (objQ12 == obj4) {
                        int length2 = str.length();
                        hebVar = hebVar2;
                        br9Var = br9Var2;
                        objQ12 = dk9.x(new wga(str, zk9.h(length2, length2), 4));
                        dd4Var2.p0(objQ12);
                    } else {
                        hebVar = hebVar2;
                        br9Var = br9Var2;
                    }
                    a07 a07Var6 = (a07) objQ12;
                    String str3 = ((wga) a07Var6.getValue()).a.b;
                    final cv2 cv2Var2 = this.b;
                    boolean zF8 = dd4Var2.f(cv2Var2);
                    Object objQ13 = dd4Var2.Q();
                    if (zF8 || objQ13 == obj4) {
                        objQ13 = new rj6(cv2Var2, a07Var6, null, 0);
                        dd4Var2.p0(objQ13);
                    }
                    lc5.u((yb4) objQ13, dd4Var2, str3);
                    boolean zF9 = dd4Var2.f(uk9Var2);
                    Object objQ14 = dd4Var2.Q();
                    if (zF9 || objQ14 == obj4) {
                        objQ14 = new n85(z44Var2, uk9Var2, jt1Var, 1);
                        dd4Var2.p0(objQ14);
                    }
                    lc5.u((yb4) objQ14, dd4Var2, z44Var2);
                    ou6 ou6VarE2 = yn2.E(gjb.k0(tg9.r(lu6Var, 360.0f), yib.e(dd4Var2, 13)), dd4Var2, 0);
                    ur9 ur9Var = s96.a;
                    ou6 ou6VarL = fe.L(t96.w(ou6VarE2, ((q96) dd4Var2.j(ur9Var)).c.c), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 1.0f), jf0.G);
                    ie1 ie1VarA2 = ge1.a(jvVar, bv4.z, dd4Var2, 0);
                    int iHashCode3 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL3 = dd4Var2.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarL);
                    ml1.k.getClass();
                    um1 um1Var2 = ll1.b;
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var2);
                    } else {
                        dd4Var2.s0();
                    }
                    jm jmVar5 = ll1.f;
                    un9.s(jmVar5, dd4Var2, ie1VarA2);
                    jm jmVar6 = ll1.e;
                    un9.s(jmVar6, dd4Var2, lr7VarL3);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    jm jmVar7 = ll1.g;
                    un9.s(jmVar7, dd4Var2, numValueOf2);
                    kd kdVar2 = ll1.h;
                    un9.r(dd4Var2, kdVar2);
                    jm jmVar8 = ll1.d;
                    un9.s(jmVar8, dd4Var2, ou6VarL03);
                    ou6 ou6VarN02 = gjb.n0(tg9.f(lu6Var, 1.0f), 0.0f, 6.0f, 1);
                    eq8 eq8VarA2 = dq8.a(ivVar, bv4.x, dd4Var2, 48);
                    int iHashCode4 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL4 = dd4Var2.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var2, ou6VarN02);
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var2);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(jmVar5, dd4Var2, eq8VarA2);
                    un9.s(jmVar6, dd4Var2, lr7VarL4);
                    ky0.v(iHashCode4, dd4Var2, jmVar7, dd4Var2, kdVar2);
                    un9.s(jmVar8, dd4Var2, ou6VarL04);
                    un9.a(dd4Var2, tg9.r(lu6Var, 6.0f));
                    p35 p35VarC2 = i25.c((m53) a53.w.getValue(), dd4Var2, 0);
                    String strK2 = wn9.K((pv9) vt9.w0.getValue(), dd4Var2);
                    ou6 ou6VarW2 = t96.w(tg9.n(lu6Var, 40.0f), tp8.a);
                    boolean zF10 = dd4Var2.f(kb4Var);
                    Object objQ15 = dd4Var2.Q();
                    if (zF10 || objQ15 == obj4) {
                        objQ15 = new b41(24, kb4Var);
                        dd4Var2.p0(objQ15);
                    }
                    mx4.a(p35VarC2, strK2, gjb.l0(fw.J(null, (ib4) objQ15, ou6VarW2, false, 15), 8.0f), 0L, dd4Var2, 0, 8);
                    wga wgaVar2 = (wga) a07Var6.getValue();
                    long j2 = lc1.i;
                    bp5 bp5Var2 = new bp5(1.0f, true);
                    Object objQ16 = dd4Var2.Q();
                    if (objQ16 == obj4) {
                        a07Var2 = a07Var6;
                        objQ16 = new ci6(a07Var2, 16);
                        dd4Var2.p0(objQ16);
                    } else {
                        a07Var2 = a07Var6;
                    }
                    kb4 kb4Var5 = (kb4) objQ16;
                    boolean zF11 = dd4Var2.f(uk9Var2) | dd4Var2.f(cv2Var2);
                    final a07 a07Var7 = this.d;
                    boolean zF12 = zF11 | dd4Var2.f(a07Var7);
                    Object objQ17 = dd4Var2.Q();
                    if (zF12 || objQ17 == obj4) {
                        final int i5 = 0;
                        final a07 a07Var8 = a07Var2;
                        objQ17 = new ib4() { // from class: nj6
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i32 = i5;
                                heb hebVar3 = heb.a;
                                a07 a07Var62 = a07Var7;
                                a07 a07Var72 = a07Var8;
                                cv2 cv2Var22 = cv2Var2;
                                an2 an2Var = uk9Var2;
                                switch (i32) {
                                    case 0:
                                        if (an2Var != null) {
                                            an2Var.a();
                                        }
                                        cv2Var22.k(((wga) a07Var72.getValue()).a.b);
                                        ((kb4) a07Var62.getValue()).invoke(((wga) a07Var72.getValue()).a.b);
                                        break;
                                    default:
                                        if (an2Var != null) {
                                            an2Var.a();
                                        }
                                        cv2Var22.k(((wga) a07Var72.getValue()).a.b);
                                        ((kb4) a07Var62.getValue()).invoke(((wga) a07Var72.getValue()).a.b);
                                        break;
                                }
                                return hebVar3;
                            }
                        };
                        a07Var3 = a07Var7;
                        dd4Var2.p0(objQ17);
                    } else {
                        a07Var3 = a07Var7;
                    }
                    e11.A(wgaVar2, this.f, 0L, j2, null, z44Var2, bp5Var2, kb4Var5, (ib4) objQ17, dd4Var2, 12807168, 4);
                    dd4Var2.q(true);
                    if (((av2) br9Var.getValue()).a.isEmpty()) {
                        dd4Var2.f0(-1041090887);
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(-1041887556);
                        y86.c(0.0f, 6, 6, 0L, dd4Var2, tg9.f(lu6Var, 1.0f));
                        List list2 = ((av2) br9Var.getValue()).a;
                        ou6 ou6VarN03 = gjb.n0(tg9.f(lu6Var, 1.0f), 0.0f, 12.0f, 1);
                        boolean zF13 = dd4Var2.f(uk9Var2) | dd4Var2.f(cv2Var2) | dd4Var2.f(a07Var3);
                        Object objQ18 = dd4Var2.Q();
                        if (zF13 || objQ18 == obj4) {
                            final int i6 = 0;
                            objQ18 = new kb4() { // from class: oj6
                                @Override // defpackage.kb4
                                public final Object invoke(Object obj5) {
                                    int i42 = i6;
                                    heb hebVar3 = heb.a;
                                    a07 a07Var62 = a07Var3;
                                    cv2 cv2Var22 = cv2Var2;
                                    an2 an2Var = uk9Var2;
                                    String str32 = (String) obj5;
                                    switch (i42) {
                                        case 0:
                                            str32.getClass();
                                            if (an2Var != null) {
                                                an2Var.a();
                                            }
                                            cv2Var22.k(str32);
                                            ((kb4) a07Var62.getValue()).invoke(str32);
                                            break;
                                        default:
                                            str32.getClass();
                                            if (an2Var != null) {
                                                an2Var.a();
                                            }
                                            cv2Var22.k(str32);
                                            ((kb4) a07Var62.getValue()).invoke(str32);
                                            break;
                                    }
                                    return hebVar3;
                                }
                            };
                            dd4Var2.p0(objQ18);
                        }
                        kb4 kb4Var6 = (kb4) objQ18;
                        Object objQ19 = dd4Var2.Q();
                        if (objQ19 == obj4) {
                            objQ19 = new ci6(a07Var2, 17);
                            dd4Var2.p0(objQ19);
                        }
                        kb4 kb4Var7 = (kb4) objQ19;
                        boolean zF14 = dd4Var2.f(cv2Var2);
                        Object objQ20 = dd4Var2.Q();
                        if (zF14 || objQ20 == obj4) {
                            final int i7 = 1;
                            objQ20 = new kb4() { // from class: mj6
                                @Override // defpackage.kb4
                                public final Object invoke(Object obj5) {
                                    int i52 = i7;
                                    heb hebVar3 = heb.a;
                                    cv2 cv2Var22 = cv2Var2;
                                    String str32 = (String) obj5;
                                    switch (i52) {
                                        case 0:
                                            str32.getClass();
                                            za1 za1VarA = vtb.a(cv2Var22);
                                            aj2 aj2Var = rw2.a;
                                            cv2Var22.g(za1VarA, nh2.c, new bv2(cv2Var22, str32, null, 0));
                                            break;
                                        default:
                                            str32.getClass();
                                            za1 za1VarA2 = vtb.a(cv2Var22);
                                            aj2 aj2Var2 = rw2.a;
                                            cv2Var22.g(za1VarA2, nh2.c, new bv2(cv2Var22, str32, null, 0));
                                            break;
                                    }
                                    return hebVar3;
                                }
                            };
                            dd4Var2.p0(objQ20);
                        }
                        wx1.d(list2, ou6VarN03, kb4Var6, kb4Var7, (kb4) objQ20, dd4Var2, 3120);
                        dd4Var2.q(false);
                    }
                    dd4Var2.q(true);
                }
                break;
        }
        return hebVar2;
    }
}

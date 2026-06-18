package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class pda implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pda(int i, a07 a07Var, Object obj, Object obj2) {
        this.a = i;
        this.d = obj;
        this.c = obj2;
        this.b = a07Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        Object obj4;
        boolean z2;
        Object obj5;
        boolean z3;
        Object obj6;
        boolean z4;
        Object obj7;
        int i = this.a;
        ou6 ou6Var = lu6.a;
        heb hebVar = heb.a;
        Object obj8 = vl1.a;
        Object obj9 = this.c;
        Object obj10 = this.d;
        Object obj11 = this.b;
        boolean z5 = false;
        int i2 = 1;
        switch (i) {
            case 0:
                final a07 a07Var = (a07) obj11;
                final ma8 ma8Var = (ma8) obj10;
                aw3 aw3Var = (aw3) obj9;
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dd4Var.Y();
                } else {
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
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
                    p35 p35VarC = i25.c((m53) f53.J.getValue(), dd4Var, 0);
                    boolean zF = dd4Var.f(a07Var);
                    Object objQ = dd4Var.Q();
                    Object obj12 = objQ;
                    if (zF || objQ == obj8) {
                        vb9 vb9Var = new vb9(a07Var, 16);
                        dd4Var.p0(vb9Var);
                        obj12 = vb9Var;
                    }
                    sw1.r(p35VarC, (ou6) null, 0L, (ib4) obj12, dd4Var, 0, 6);
                    boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
                    boolean zF2 = dd4Var.f(a07Var);
                    Object objQ2 = dd4Var.Q();
                    Object obj13 = objQ2;
                    if (zF2 || objQ2 == obj8) {
                        vb9 vb9Var2 = new vb9(a07Var, 15);
                        dd4Var.p0(vb9Var2);
                        obj13 = vb9Var2;
                    }
                    ib4 ib4Var = (ib4) obj13;
                    boolean zF3 = dd4Var.f(a07Var) | dd4Var.f(ma8Var);
                    Object objQ3 = dd4Var.Q();
                    Object obj14 = objQ3;
                    if (zF3 || objQ3 == obj8) {
                        final int i3 = 0;
                        ib4 ib4Var2 = new ib4() { // from class: mda
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i4 = i3;
                                heb hebVar2 = heb.a;
                                a07 a07Var2 = a07Var;
                                ma8 ma8Var2 = ma8Var;
                                switch (i4) {
                                    case 0:
                                        a07Var2.setValue(Boolean.FALSE);
                                        ma8Var2.getClass();
                                        za1 za1VarA = vtb.a(ma8Var2);
                                        aj2 aj2Var = rw2.a;
                                        ma8Var2.g(za1VarA, nh2.c, new mt4(ma8Var2, (jt1) null, 24));
                                        break;
                                    default:
                                        a07Var2.setValue(Boolean.FALSE);
                                        ma8Var2.k();
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var.p0(ib4Var2);
                        obj14 = ib4Var2;
                    }
                    ib4 ib4Var3 = (ib4) obj14;
                    boolean zF4 = dd4Var.f(a07Var) | dd4Var.f(aw3Var);
                    Object objQ4 = dd4Var.Q();
                    Object obj15 = objQ4;
                    if (zF4 || objQ4 == obj8) {
                        uz2 uz2Var = new uz2(aw3Var, a07Var, 4);
                        dd4Var.p0(uz2Var);
                        obj15 = uz2Var;
                    }
                    ib4 ib4Var4 = (ib4) obj15;
                    boolean zF5 = dd4Var.f(a07Var) | dd4Var.f(ma8Var);
                    Object objQ5 = dd4Var.Q();
                    if (zF5 || objQ5 == obj8) {
                        z = true;
                        final boolean z6 = true ? 1 : 0;
                        ib4 ib4Var5 = new ib4() { // from class: mda
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i4 = z6;
                                heb hebVar2 = heb.a;
                                a07 a07Var2 = a07Var;
                                ma8 ma8Var2 = ma8Var;
                                switch (i4) {
                                    case 0:
                                        a07Var2.setValue(Boolean.FALSE);
                                        ma8Var2.getClass();
                                        za1 za1VarA = vtb.a(ma8Var2);
                                        aj2 aj2Var = rw2.a;
                                        ma8Var2.g(za1VarA, nh2.c, new mt4(ma8Var2, (jt1) null, 24));
                                        break;
                                    default:
                                        a07Var2.setValue(Boolean.FALSE);
                                        ma8Var2.k();
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var.p0(ib4Var5);
                        obj4 = ib4Var5;
                    } else {
                        z = true;
                        obj4 = objQ5;
                    }
                    md2.o(zBooleanValue, ib4Var, ib4Var3, ib4Var4, (ib4) obj4, dd4Var, 0);
                    dd4Var.q(z);
                }
                break;
            case 1:
                final a07 a07Var2 = (a07) obj11;
                final gea geaVar = (gea) obj10;
                aw3 aw3Var2 = (aw3) obj9;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    dd4Var2.Y();
                } else {
                    ha6 ha6VarD2 = pn0.d(bv4.b, false);
                    int iHashCode2 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL2 = dd4Var2.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var2, ou6Var);
                    ml1.k.getClass();
                    um1 um1Var2 = ll1.b;
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var2);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(ll1.f, dd4Var2, ha6VarD2);
                    un9.s(ll1.e, dd4Var2, lr7VarL2);
                    un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode2));
                    un9.r(dd4Var2, ll1.h);
                    un9.s(ll1.d, dd4Var2, ou6VarL02);
                    p35 p35VarC2 = i25.c((m53) f53.J.getValue(), dd4Var2, 0);
                    boolean zF6 = dd4Var2.f(a07Var2);
                    Object objQ6 = dd4Var2.Q();
                    Object obj16 = objQ6;
                    if (zF6 || objQ6 == obj8) {
                        vb9 vb9Var3 = new vb9(a07Var2, 17);
                        dd4Var2.p0(vb9Var3);
                        obj16 = vb9Var3;
                    }
                    sw1.r(p35VarC2, (ou6) null, 0L, (ib4) obj16, dd4Var2, 0, 6);
                    boolean zBooleanValue2 = ((Boolean) a07Var2.getValue()).booleanValue();
                    boolean zF7 = dd4Var2.f(a07Var2);
                    Object objQ7 = dd4Var2.Q();
                    Object obj17 = objQ7;
                    if (zF7 || objQ7 == obj8) {
                        vb9 vb9Var4 = new vb9(a07Var2, 18);
                        dd4Var2.p0(vb9Var4);
                        obj17 = vb9Var4;
                    }
                    ib4 ib4Var6 = (ib4) obj17;
                    boolean zF8 = dd4Var2.f(a07Var2) | dd4Var2.f(geaVar);
                    Object objQ8 = dd4Var2.Q();
                    Object obj18 = objQ8;
                    if (zF8 || objQ8 == obj8) {
                        final int i4 = 0;
                        ib4 ib4Var7 = new ib4() { // from class: aea
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i5 = i4;
                                heb hebVar2 = heb.a;
                                a07 a07Var3 = a07Var2;
                                gea geaVar2 = geaVar;
                                switch (i5) {
                                    case 0:
                                        a07Var3.setValue(Boolean.FALSE);
                                        za1 za1VarA = vtb.a(geaVar2);
                                        aj2 aj2Var = rw2.a;
                                        geaVar2.g(za1VarA, nh2.c, new b69(geaVar2, null, 24));
                                        break;
                                    default:
                                        a07Var3.setValue(Boolean.FALSE);
                                        za1 za1VarA2 = vtb.a(geaVar2);
                                        aj2 aj2Var2 = rw2.a;
                                        geaVar2.g(za1VarA2, nh2.c, new fea(geaVar2, null, 1));
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var2.p0(ib4Var7);
                        obj18 = ib4Var7;
                    }
                    ib4 ib4Var8 = (ib4) obj18;
                    boolean zF9 = dd4Var2.f(a07Var2) | dd4Var2.f(aw3Var2);
                    Object objQ9 = dd4Var2.Q();
                    Object obj19 = objQ9;
                    if (zF9 || objQ9 == obj8) {
                        uz2 uz2Var2 = new uz2(aw3Var2, a07Var2, 5);
                        dd4Var2.p0(uz2Var2);
                        obj19 = uz2Var2;
                    }
                    ib4 ib4Var9 = (ib4) obj19;
                    boolean zF10 = dd4Var2.f(a07Var2) | dd4Var2.f(geaVar);
                    Object objQ10 = dd4Var2.Q();
                    if (zF10 || objQ10 == obj8) {
                        z2 = true;
                        final boolean z7 = true ? 1 : 0;
                        ib4 ib4Var10 = new ib4() { // from class: aea
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i5 = z7;
                                heb hebVar2 = heb.a;
                                a07 a07Var3 = a07Var2;
                                gea geaVar2 = geaVar;
                                switch (i5) {
                                    case 0:
                                        a07Var3.setValue(Boolean.FALSE);
                                        za1 za1VarA = vtb.a(geaVar2);
                                        aj2 aj2Var = rw2.a;
                                        geaVar2.g(za1VarA, nh2.c, new b69(geaVar2, null, 24));
                                        break;
                                    default:
                                        a07Var3.setValue(Boolean.FALSE);
                                        za1 za1VarA2 = vtb.a(geaVar2);
                                        aj2 aj2Var2 = rw2.a;
                                        geaVar2.g(za1VarA2, nh2.c, new fea(geaVar2, null, 1));
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var2.p0(ib4Var10);
                        obj5 = ib4Var10;
                    } else {
                        z2 = true;
                        obj5 = objQ10;
                    }
                    jv3.a(zBooleanValue2, ib4Var6, ib4Var8, ib4Var9, (ib4) obj5, dd4Var2, 0);
                    dd4Var2.q(z2);
                }
                break;
            case 2:
                final a07 a07Var3 = (a07) obj11;
                final rpa rpaVar = (rpa) obj10;
                aw3 aw3Var3 = (aw3) obj9;
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    dd4Var3.Y();
                } else {
                    ha6 ha6VarD3 = pn0.d(bv4.b, false);
                    int iHashCode3 = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL3 = dd4Var3.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var3, ou6Var);
                    ml1.k.getClass();
                    um1 um1Var3 = ll1.b;
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var3);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(ll1.f, dd4Var3, ha6VarD3);
                    un9.s(ll1.e, dd4Var3, lr7VarL3);
                    un9.s(ll1.g, dd4Var3, Integer.valueOf(iHashCode3));
                    un9.r(dd4Var3, ll1.h);
                    un9.s(ll1.d, dd4Var3, ou6VarL03);
                    p35 p35VarC3 = i25.c((m53) f53.J.getValue(), dd4Var3, 0);
                    boolean zF11 = dd4Var3.f(a07Var3);
                    Object objQ11 = dd4Var3.Q();
                    Object obj20 = objQ11;
                    if (zF11 || objQ11 == obj8) {
                        vb9 vb9Var5 = new vb9(a07Var3, 29);
                        dd4Var3.p0(vb9Var5);
                        obj20 = vb9Var5;
                    }
                    sw1.r(p35VarC3, (ou6) null, 0L, (ib4) obj20, dd4Var3, 0, 6);
                    boolean zBooleanValue3 = ((Boolean) a07Var3.getValue()).booleanValue();
                    boolean zF12 = dd4Var3.f(a07Var3);
                    Object objQ12 = dd4Var3.Q();
                    Object obj21 = objQ12;
                    if (zF12 || objQ12 == obj8) {
                        gpa gpaVar = new gpa(a07Var3, 0);
                        dd4Var3.p0(gpaVar);
                        obj21 = gpaVar;
                    }
                    ib4 ib4Var11 = (ib4) obj21;
                    boolean zF13 = dd4Var3.f(a07Var3) | dd4Var3.f(rpaVar);
                    Object objQ13 = dd4Var3.Q();
                    Object obj22 = objQ13;
                    if (zF13 || objQ13 == obj8) {
                        final int i5 = 0;
                        ib4 ib4Var12 = new ib4() { // from class: ipa
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i6 = i5;
                                heb hebVar2 = heb.a;
                                a07 a07Var4 = a07Var3;
                                rpa rpaVar2 = rpaVar;
                                switch (i6) {
                                    case 0:
                                        a07Var4.setValue(Boolean.FALSE);
                                        za1 za1VarA = vtb.a(rpaVar2);
                                        aj2 aj2Var = rw2.a;
                                        rpaVar2.g(za1VarA, nh2.c, new qoa(rpaVar2, (jt1) null, 3));
                                        break;
                                    default:
                                        a07Var4.setValue(Boolean.FALSE);
                                        za1 za1VarA2 = vtb.a(rpaVar2);
                                        aj2 aj2Var2 = rw2.a;
                                        rpaVar2.g(za1VarA2, nh2.c, new qpa(rpaVar2, null, 1));
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var3.p0(ib4Var12);
                        obj22 = ib4Var12;
                    }
                    ib4 ib4Var13 = (ib4) obj22;
                    boolean zF14 = dd4Var3.f(a07Var3) | dd4Var3.f(aw3Var3);
                    Object objQ14 = dd4Var3.Q();
                    Object obj23 = objQ14;
                    if (zF14 || objQ14 == obj8) {
                        uz2 uz2Var3 = new uz2(aw3Var3, a07Var3, 6);
                        dd4Var3.p0(uz2Var3);
                        obj23 = uz2Var3;
                    }
                    ib4 ib4Var14 = (ib4) obj23;
                    boolean zF15 = dd4Var3.f(a07Var3) | dd4Var3.f(rpaVar);
                    Object objQ15 = dd4Var3.Q();
                    if (zF15 || objQ15 == obj8) {
                        z3 = true;
                        final boolean z8 = true ? 1 : 0;
                        ib4 ib4Var15 = new ib4() { // from class: ipa
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i6 = z8;
                                heb hebVar2 = heb.a;
                                a07 a07Var4 = a07Var3;
                                rpa rpaVar2 = rpaVar;
                                switch (i6) {
                                    case 0:
                                        a07Var4.setValue(Boolean.FALSE);
                                        za1 za1VarA = vtb.a(rpaVar2);
                                        aj2 aj2Var = rw2.a;
                                        rpaVar2.g(za1VarA, nh2.c, new qoa(rpaVar2, (jt1) null, 3));
                                        break;
                                    default:
                                        a07Var4.setValue(Boolean.FALSE);
                                        za1 za1VarA2 = vtb.a(rpaVar2);
                                        aj2 aj2Var2 = rw2.a;
                                        rpaVar2.g(za1VarA2, nh2.c, new qpa(rpaVar2, null, 1));
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var3.p0(ib4Var15);
                        obj6 = ib4Var15;
                    } else {
                        z3 = true;
                        obj6 = objQ15;
                    }
                    h67.a(zBooleanValue3, ib4Var11, ib4Var13, ib4Var14, (ib4) obj6, dd4Var3, 0);
                    dd4Var3.q(z3);
                }
                break;
            case 3:
                final a07 a07Var4 = (a07) obj11;
                final yva yvaVar = (yva) obj10;
                aw3 aw3Var4 = (aw3) obj9;
                dd4 dd4Var4 = (dd4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (!dd4Var4.V(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    dd4Var4.Y();
                } else {
                    ha6 ha6VarD4 = pn0.d(bv4.b, false);
                    int iHashCode4 = Long.hashCode(dd4Var4.T);
                    lr7 lr7VarL4 = dd4Var4.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var4, ou6Var);
                    ml1.k.getClass();
                    um1 um1Var4 = ll1.b;
                    dd4Var4.j0();
                    if (dd4Var4.S) {
                        dd4Var4.k(um1Var4);
                    } else {
                        dd4Var4.s0();
                    }
                    un9.s(ll1.f, dd4Var4, ha6VarD4);
                    un9.s(ll1.e, dd4Var4, lr7VarL4);
                    un9.s(ll1.g, dd4Var4, Integer.valueOf(iHashCode4));
                    un9.r(dd4Var4, ll1.h);
                    un9.s(ll1.d, dd4Var4, ou6VarL04);
                    p35 p35VarC4 = i25.c((m53) f53.J.getValue(), dd4Var4, 0);
                    boolean zF16 = dd4Var4.f(a07Var4);
                    Object objQ16 = dd4Var4.Q();
                    Object obj24 = objQ16;
                    if (zF16 || objQ16 == obj8) {
                        gpa gpaVar2 = new gpa(a07Var4, 3);
                        dd4Var4.p0(gpaVar2);
                        obj24 = gpaVar2;
                    }
                    sw1.r(p35VarC4, (ou6) null, 0L, (ib4) obj24, dd4Var4, 0, 6);
                    boolean zBooleanValue4 = ((Boolean) a07Var4.getValue()).booleanValue();
                    boolean zF17 = dd4Var4.f(a07Var4);
                    Object objQ17 = dd4Var4.Q();
                    Object obj25 = objQ17;
                    if (zF17 || objQ17 == obj8) {
                        gpa gpaVar3 = new gpa(a07Var4, 4);
                        dd4Var4.p0(gpaVar3);
                        obj25 = gpaVar3;
                    }
                    ib4 ib4Var16 = (ib4) obj25;
                    boolean zF18 = dd4Var4.f(a07Var4) | dd4Var4.f(yvaVar);
                    Object objQ18 = dd4Var4.Q();
                    Object obj26 = objQ18;
                    if (zF18 || objQ18 == obj8) {
                        final int i6 = 0;
                        ib4 ib4Var17 = new ib4() { // from class: wva
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i7 = i6;
                                heb hebVar2 = heb.a;
                                a07 a07Var5 = a07Var4;
                                yva yvaVar2 = yvaVar;
                                switch (i7) {
                                    case 0:
                                        a07Var5.setValue(Boolean.FALSE);
                                        za1 za1VarA = vtb.a(yvaVar2);
                                        aj2 aj2Var = rw2.a;
                                        yvaVar2.g(za1VarA, nh2.c, new qoa(yvaVar2, (jt1) null, 11));
                                        break;
                                    default:
                                        a07Var5.setValue(Boolean.FALSE);
                                        za1 za1VarA2 = vtb.a(yvaVar2);
                                        aj2 aj2Var2 = rw2.a;
                                        yvaVar2.g(za1VarA2, nh2.c, new dd9(yvaVar2, (jt1) null, 17));
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var4.p0(ib4Var17);
                        obj26 = ib4Var17;
                    }
                    ib4 ib4Var18 = (ib4) obj26;
                    boolean zF19 = dd4Var4.f(a07Var4) | dd4Var4.f(aw3Var4);
                    Object objQ19 = dd4Var4.Q();
                    Object obj27 = objQ19;
                    if (zF19 || objQ19 == obj8) {
                        uz2 uz2Var4 = new uz2(aw3Var4, a07Var4, 7);
                        dd4Var4.p0(uz2Var4);
                        obj27 = uz2Var4;
                    }
                    ib4 ib4Var19 = (ib4) obj27;
                    boolean zF20 = dd4Var4.f(a07Var4) | dd4Var4.f(yvaVar);
                    Object objQ20 = dd4Var4.Q();
                    if (zF20 || objQ20 == obj8) {
                        z4 = true;
                        final boolean z9 = true ? 1 : 0;
                        ib4 ib4Var20 = new ib4() { // from class: wva
                            @Override // defpackage.ib4
                            public final Object invoke() {
                                int i7 = z9;
                                heb hebVar2 = heb.a;
                                a07 a07Var5 = a07Var4;
                                yva yvaVar2 = yvaVar;
                                switch (i7) {
                                    case 0:
                                        a07Var5.setValue(Boolean.FALSE);
                                        za1 za1VarA = vtb.a(yvaVar2);
                                        aj2 aj2Var = rw2.a;
                                        yvaVar2.g(za1VarA, nh2.c, new qoa(yvaVar2, (jt1) null, 11));
                                        break;
                                    default:
                                        a07Var5.setValue(Boolean.FALSE);
                                        za1 za1VarA2 = vtb.a(yvaVar2);
                                        aj2 aj2Var2 = rw2.a;
                                        yvaVar2.g(za1VarA2, nh2.c, new dd9(yvaVar2, (jt1) null, 17));
                                        break;
                                }
                                return hebVar2;
                            }
                        };
                        dd4Var4.p0(ib4Var20);
                        obj7 = ib4Var20;
                    } else {
                        z4 = true;
                        obj7 = objQ20;
                    }
                    kl8.a(zBooleanValue4, ib4Var16, ib4Var18, ib4Var19, (ib4) obj7, dd4Var4, 0);
                    dd4Var4.q(z4);
                }
                break;
            case 4:
                xq2 xq2Var = (xq2) obj10;
                List list = (List) obj9;
                a07 a07Var5 = (a07) obj11;
                dd4 dd4Var5 = (dd4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((dr5) obj).getClass();
                if (!dd4Var5.V(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    dd4Var5.Y();
                } else {
                    boolean zBooleanValue5 = ((Boolean) a07Var5.getValue()).booleanValue();
                    Object objQ21 = dd4Var5.Q();
                    Object obj28 = objQ21;
                    if (objQ21 == obj8) {
                        w0b w0bVar = new w0b(a07Var5, 0);
                        dd4Var5.p0(w0bVar);
                        obj28 = w0bVar;
                    }
                    gjb.K(xq2Var, list, zBooleanValue5, null, (kb4) obj28, dd4Var5, 24584);
                }
                break;
            case 5:
                k4b k4bVar = (k4b) obj10;
                kb4 kb4Var = (kb4) obj9;
                a07 a07Var6 = (a07) obj11;
                dd4 dd4Var6 = (dd4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (!dd4Var6.V(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    dd4Var6.Y();
                } else {
                    Object objQ22 = dd4Var6.Q();
                    Object obj29 = objQ22;
                    if (objQ22 == obj8) {
                        ko0 ko0Var = new ko0();
                        dd4Var6.p0(ko0Var);
                        obj29 = ko0Var;
                    }
                    ko0 ko0Var2 = (ko0) obj29;
                    dd4Var6.f0(1402648528);
                    List list2 = k4bVar.i;
                    int size = list2.size();
                    int i7 = 0;
                    while (i7 < size) {
                        p5b p5bVar = (p5b) list2.get(i7);
                        boolean zEquals = p5bVar.a.equals(k4bVar.b);
                        int i8 = i7;
                        String str = p5bVar.b;
                        ou6 ou6VarO = zEquals ? vo1.O(ou6Var, ko0Var2) : ou6Var;
                        rj1 rj1VarG = jf0.G(-2123627486, new bt6(p5bVar, i2), dd4Var6);
                        Boolean boolValueOf = Boolean.valueOf(zEquals);
                        boolean zF21 = dd4Var6.f(kb4Var) | dd4Var6.h(p5bVar);
                        Object objQ23 = dd4Var6.Q();
                        if (zF21 || objQ23 == obj8) {
                            objQ23 = new ct6(kb4Var, p5bVar, a07Var6, 1);
                            dd4Var6.p0(objQ23);
                        }
                        dd4 dd4Var7 = dd4Var6;
                        gx1.c(str, null, rj1VarG, boolValueOf, ou6VarO, (ib4) objQ23, dd4Var7, 384, 2);
                        i7 = i8 + 1;
                        dd4Var6 = dd4Var7;
                        z5 = false;
                        i2 = 1;
                    }
                    dd4 dd4Var8 = dd4Var6;
                    dd4Var8.q(z5);
                    boolean zH = dd4Var8.h(ko0Var2);
                    Object objQ24 = dd4Var8.Q();
                    Object obj30 = objQ24;
                    if (zH || objQ24 == obj8) {
                        is6 is6Var = new is6(ko0Var2, null, 3);
                        dd4Var8.p0(is6Var);
                        obj30 = is6Var;
                    }
                    lc5.u((yb4) obj30, dd4Var8, hebVar);
                }
                break;
            default:
                ib4 ib4Var21 = (ib4) obj11;
                zob zobVar = (zob) obj10;
                ib4 ib4Var22 = (ib4) obj9;
                dd4 dd4Var9 = (dd4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((fq8) obj).getClass();
                if (!dd4Var9.V(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    dd4Var9.Y();
                } else {
                    p35 p35VarC5 = i25.c((m53) f53.p0.getValue(), dd4Var9, 0);
                    boolean zF22 = dd4Var9.f(ib4Var21) | dd4Var9.h(zobVar);
                    Object objQ25 = dd4Var9.Q();
                    Object obj31 = objQ25;
                    if (zF22 || objQ25 == obj8) {
                        znb znbVar = new znb(ib4Var21, zobVar, 4);
                        dd4Var9.p0(znbVar);
                        obj31 = znbVar;
                    }
                    vo1.H(p35VarC5, null, 0.0f, false, (ib4) obj31, dd4Var9, 0, 14);
                    p35 p35VarC6 = i25.c((m53) f53.o0.getValue(), dd4Var9, 0);
                    boolean zF23 = dd4Var9.f(ib4Var22) | dd4Var9.h(zobVar);
                    Object objQ26 = dd4Var9.Q();
                    Object obj32 = objQ26;
                    if (zF23 || objQ26 == obj8) {
                        znb znbVar2 = new znb(ib4Var22, zobVar, 5);
                        dd4Var9.p0(znbVar2);
                        obj32 = znbVar2;
                    }
                    vo1.H(p35VarC6, null, 0.0f, false, (ib4) obj32, dd4Var9, 0, 14);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ pda(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }
}

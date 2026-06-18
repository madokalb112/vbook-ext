package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class oq2 implements ac4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ br9 c;
    public final /* synthetic */ qtb d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ oq2(ir2 ir2Var, t27 t27Var, String str, a07 a07Var, a07 a07Var2, a07 a07Var3, a07 a07Var4) {
        this.d = ir2Var;
        this.e = t27Var;
        this.f = str;
        this.b = a07Var;
        this.s = a07Var2;
        this.c = a07Var3;
        this.t = a07Var4;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        pj7 pj7Var;
        int i = this.a;
        heb hebVar = heb.a;
        Object obj5 = vl1.a;
        final br9 br9Var = this.c;
        a07 a07Var = this.b;
        Object obj6 = this.t;
        Object obj7 = this.s;
        Object obj8 = this.f;
        Object obj9 = this.e;
        qtb qtbVar = this.d;
        final int i2 = 1;
        final int i3 = 0;
        switch (i) {
            case 0:
                final ir2 ir2Var = (ir2) qtbVar;
                final t27 t27Var = (t27) obj9;
                String str = (String) obj8;
                a07 a07Var2 = (a07) obj7;
                a07 a07Var3 = (a07) obj6;
                pj7 pj7Var2 = (pj7) obj2;
                dd4 dd4Var = (dd4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((yn0) obj).getClass();
                pj7Var2.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= dd4Var.f(pj7Var2) ? 32 : 16;
                }
                int i4 = iIntValue;
                if (!dd4Var.V(i4 & 1, (i4 & Token.TARGET) != 144)) {
                    dd4Var.Y();
                } else {
                    final int i5 = 3;
                    if (((wq2) br9Var.getValue()).a && ((wq2) br9Var.getValue()).i == null) {
                        dd4Var.f0(871636697);
                        fx1.a((i4 >> 3) & 14, dd4Var, yib.B(tg9.f(lu6.a, 1.0f), 14), pj7Var2);
                        dd4Var.q(false);
                    } else if (((wq2) br9Var.getValue()).j) {
                        dd4Var.f0(871893687);
                        ou6 ou6VarK0 = gjb.k0(yib.B(gjb.l0(tg9.c, 24.0f), 14), pj7Var2);
                        String str2 = ((wq2) br9Var.getValue()).k;
                        boolean zF = dd4Var.f(ir2Var);
                        Object objQ = dd4Var.Q();
                        if (zF || objQ == obj5) {
                            objQ = new ib4() { // from class: op2
                                @Override // defpackage.ib4
                                public final Object invoke() {
                                    int i6 = i3;
                                    heb hebVar2 = heb.a;
                                    ir2 ir2Var2 = ir2Var;
                                    switch (i6) {
                                        case 0:
                                            ir2Var2.I();
                                            break;
                                        case 1:
                                            za1 za1VarA = vtb.a(ir2Var2);
                                            aj2 aj2Var = rw2.a;
                                            ir2Var2.g(za1VarA, nh2.c, new et1(ir2Var2, null, null, 11));
                                            break;
                                        case 2:
                                            yd5 yd5Var = ir2Var2.W;
                                            if (yd5Var != null) {
                                                yd5Var.cancel(null);
                                            }
                                            za1 za1VarA2 = vtb.a(ir2Var2);
                                            aj2 aj2Var2 = rw2.a;
                                            ir2Var2.W = ir2Var2.g(za1VarA2, nh2.c, new ar2(ir2Var2, null));
                                            break;
                                        case 3:
                                            yd5 yd5Var2 = ir2Var2.W;
                                            if (yd5Var2 != null) {
                                                yd5Var2.cancel(null);
                                            }
                                            za1 za1VarA3 = vtb.a(ir2Var2);
                                            aj2 aj2Var3 = rw2.a;
                                            ir2Var2.W = ir2Var2.g(za1VarA3, nh2.c, new qi(ir2Var2, (jt1) null, 2));
                                            break;
                                        default:
                                            ir2Var2.I();
                                            break;
                                    }
                                    return hebVar2;
                                }
                            };
                            dd4Var.p0(objQ);
                        }
                        ib4 ib4Var = (ib4) objQ;
                        boolean zF2 = dd4Var.f(t27Var) | dd4Var.f(str);
                        Object objQ2 = dd4Var.Q();
                        if (zF2 || objQ2 == obj5) {
                            objQ2 = new fq2(t27Var, str, 0);
                            dd4Var.p0(objQ2);
                        }
                        fw.h(0, ib4Var, (ib4) objQ2, dd4Var, ou6VarK0, str2);
                        dd4Var.q(false);
                    } else if (((wq2) br9Var.getValue()).i == null) {
                        dd4Var.f0(874297613);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(872524785);
                        wq2 wq2Var = (wq2) br9Var.getValue();
                        ou6 ou6VarE = yn2.E(tg9.c, dd4Var, 6);
                        boolean zF3 = dd4Var.f(a07Var);
                        Object objQ3 = dd4Var.Q();
                        if (zF3 || objQ3 == obj5) {
                            objQ3 = new bv1(a07Var, 6);
                            dd4Var.p0(objQ3);
                        }
                        ib4 ib4Var2 = (ib4) objQ3;
                        boolean zF4 = dd4Var.f(a07Var2);
                        Object objQ4 = dd4Var.Q();
                        if (zF4 || objQ4 == obj5) {
                            objQ4 = new bv1(a07Var2, 7);
                            dd4Var.p0(objQ4);
                        }
                        ib4 ib4Var3 = (ib4) objQ4;
                        boolean zF5 = dd4Var.f(t27Var) | dd4Var.f(br9Var);
                        Object objQ5 = dd4Var.Q();
                        if (zF5 || objQ5 == obj5) {
                            objQ5 = new n82(18, t27Var, br9Var);
                            dd4Var.p0(objQ5);
                        }
                        kb4 kb4Var = (kb4) objQ5;
                        boolean zF6 = dd4Var.f(t27Var) | dd4Var.f(br9Var);
                        Object objQ6 = dd4Var.Q();
                        if (zF6 || objQ6 == obj5) {
                            objQ6 = new yb4() { // from class: pp2
                                @Override // defpackage.yb4
                                public final Object invoke(Object obj10, Object obj11) {
                                    int i6 = i2;
                                    heb hebVar2 = heb.a;
                                    br9 br9Var2 = br9Var;
                                    t27 t27Var2 = t27Var;
                                    String str3 = (String) obj10;
                                    String str4 = (String) obj11;
                                    switch (i6) {
                                        case 0:
                                            str3.getClass();
                                            str4.getClass();
                                            String str5 = ((wq2) br9Var2.getValue()).b;
                                            str5.getClass();
                                            t27Var2.getClass();
                                            t27Var2.a.d(new fg1(str5, str3, str4));
                                            break;
                                        default:
                                            str3.getClass();
                                            str4.getClass();
                                            String str6 = ((wq2) br9Var2.getValue()).b;
                                            str6.getClass();
                                            pu1.o0(t27Var2, str6, str3, str4);
                                            break;
                                    }
                                    return hebVar2;
                                }
                            };
                            dd4Var.p0(objQ6);
                        }
                        yb4 yb4Var = (yb4) objQ6;
                        boolean zF7 = dd4Var.f(t27Var) | dd4Var.f(br9Var);
                        Object objQ7 = dd4Var.Q();
                        if (zF7 || objQ7 == obj5) {
                            objQ7 = new yb4() { // from class: pp2
                                @Override // defpackage.yb4
                                public final Object invoke(Object obj10, Object obj11) {
                                    int i6 = i3;
                                    heb hebVar2 = heb.a;
                                    br9 br9Var2 = br9Var;
                                    t27 t27Var2 = t27Var;
                                    String str3 = (String) obj10;
                                    String str4 = (String) obj11;
                                    switch (i6) {
                                        case 0:
                                            str3.getClass();
                                            str4.getClass();
                                            String str5 = ((wq2) br9Var2.getValue()).b;
                                            str5.getClass();
                                            t27Var2.getClass();
                                            t27Var2.a.d(new fg1(str5, str3, str4));
                                            break;
                                        default:
                                            str3.getClass();
                                            str4.getClass();
                                            String str6 = ((wq2) br9Var2.getValue()).b;
                                            str6.getClass();
                                            pu1.o0(t27Var2, str6, str3, str4);
                                            break;
                                    }
                                    return hebVar2;
                                }
                            };
                            dd4Var.p0(objQ7);
                        }
                        yb4 yb4Var2 = (yb4) objQ7;
                        boolean zF8 = dd4Var.f(ir2Var);
                        Object objQ8 = dd4Var.Q();
                        if (zF8 || objQ8 == obj5) {
                            objQ8 = new ib4() { // from class: op2
                                @Override // defpackage.ib4
                                public final Object invoke() {
                                    int i6 = i2;
                                    heb hebVar2 = heb.a;
                                    ir2 ir2Var2 = ir2Var;
                                    switch (i6) {
                                        case 0:
                                            ir2Var2.I();
                                            break;
                                        case 1:
                                            za1 za1VarA = vtb.a(ir2Var2);
                                            aj2 aj2Var = rw2.a;
                                            ir2Var2.g(za1VarA, nh2.c, new et1(ir2Var2, null, null, 11));
                                            break;
                                        case 2:
                                            yd5 yd5Var = ir2Var2.W;
                                            if (yd5Var != null) {
                                                yd5Var.cancel(null);
                                            }
                                            za1 za1VarA2 = vtb.a(ir2Var2);
                                            aj2 aj2Var2 = rw2.a;
                                            ir2Var2.W = ir2Var2.g(za1VarA2, nh2.c, new ar2(ir2Var2, null));
                                            break;
                                        case 3:
                                            yd5 yd5Var2 = ir2Var2.W;
                                            if (yd5Var2 != null) {
                                                yd5Var2.cancel(null);
                                            }
                                            za1 za1VarA3 = vtb.a(ir2Var2);
                                            aj2 aj2Var3 = rw2.a;
                                            ir2Var2.W = ir2Var2.g(za1VarA3, nh2.c, new qi(ir2Var2, (jt1) null, 2));
                                            break;
                                        default:
                                            ir2Var2.I();
                                            break;
                                    }
                                    return hebVar2;
                                }
                            };
                            dd4Var.p0(objQ8);
                        }
                        ib4 ib4Var4 = (ib4) objQ8;
                        boolean zF9 = dd4Var.f(ir2Var);
                        Object objQ9 = dd4Var.Q();
                        if (zF9 || objQ9 == obj5) {
                            objQ9 = new qp2(ir2Var, i3);
                            dd4Var.p0(objQ9);
                        }
                        kb4 kb4Var2 = (kb4) objQ9;
                        boolean zF10 = dd4Var.f(ir2Var);
                        Object objQ10 = dd4Var.Q();
                        if (zF10 || objQ10 == obj5) {
                            final int i6 = 2;
                            objQ10 = new ib4() { // from class: op2
                                @Override // defpackage.ib4
                                public final Object invoke() {
                                    int i62 = i6;
                                    heb hebVar2 = heb.a;
                                    ir2 ir2Var2 = ir2Var;
                                    switch (i62) {
                                        case 0:
                                            ir2Var2.I();
                                            break;
                                        case 1:
                                            za1 za1VarA = vtb.a(ir2Var2);
                                            aj2 aj2Var = rw2.a;
                                            ir2Var2.g(za1VarA, nh2.c, new et1(ir2Var2, null, null, 11));
                                            break;
                                        case 2:
                                            yd5 yd5Var = ir2Var2.W;
                                            if (yd5Var != null) {
                                                yd5Var.cancel(null);
                                            }
                                            za1 za1VarA2 = vtb.a(ir2Var2);
                                            aj2 aj2Var2 = rw2.a;
                                            ir2Var2.W = ir2Var2.g(za1VarA2, nh2.c, new ar2(ir2Var2, null));
                                            break;
                                        case 3:
                                            yd5 yd5Var2 = ir2Var2.W;
                                            if (yd5Var2 != null) {
                                                yd5Var2.cancel(null);
                                            }
                                            za1 za1VarA3 = vtb.a(ir2Var2);
                                            aj2 aj2Var3 = rw2.a;
                                            ir2Var2.W = ir2Var2.g(za1VarA3, nh2.c, new qi(ir2Var2, (jt1) null, 2));
                                            break;
                                        default:
                                            ir2Var2.I();
                                            break;
                                    }
                                    return hebVar2;
                                }
                            };
                            dd4Var.p0(objQ10);
                        }
                        ib4 ib4Var5 = (ib4) objQ10;
                        boolean zF11 = dd4Var.f(ir2Var);
                        Object objQ11 = dd4Var.Q();
                        if (zF11 || objQ11 == obj5) {
                            objQ11 = new ib4() { // from class: op2
                                @Override // defpackage.ib4
                                public final Object invoke() {
                                    int i62 = i5;
                                    heb hebVar2 = heb.a;
                                    ir2 ir2Var2 = ir2Var;
                                    switch (i62) {
                                        case 0:
                                            ir2Var2.I();
                                            break;
                                        case 1:
                                            za1 za1VarA = vtb.a(ir2Var2);
                                            aj2 aj2Var = rw2.a;
                                            ir2Var2.g(za1VarA, nh2.c, new et1(ir2Var2, null, null, 11));
                                            break;
                                        case 2:
                                            yd5 yd5Var = ir2Var2.W;
                                            if (yd5Var != null) {
                                                yd5Var.cancel(null);
                                            }
                                            za1 za1VarA2 = vtb.a(ir2Var2);
                                            aj2 aj2Var2 = rw2.a;
                                            ir2Var2.W = ir2Var2.g(za1VarA2, nh2.c, new ar2(ir2Var2, null));
                                            break;
                                        case 3:
                                            yd5 yd5Var2 = ir2Var2.W;
                                            if (yd5Var2 != null) {
                                                yd5Var2.cancel(null);
                                            }
                                            za1 za1VarA3 = vtb.a(ir2Var2);
                                            aj2 aj2Var3 = rw2.a;
                                            ir2Var2.W = ir2Var2.g(za1VarA3, nh2.c, new qi(ir2Var2, (jt1) null, 2));
                                            break;
                                        default:
                                            ir2Var2.I();
                                            break;
                                    }
                                    return hebVar2;
                                }
                            };
                            dd4Var.p0(objQ11);
                        }
                        ib4 ib4Var6 = (ib4) objQ11;
                        boolean zF12 = dd4Var.f(ir2Var);
                        Object objQ12 = dd4Var.Q();
                        final int i7 = 4;
                        if (zF12 || objQ12 == obj5) {
                            objQ12 = new ib4() { // from class: op2
                                @Override // defpackage.ib4
                                public final Object invoke() {
                                    int i62 = i7;
                                    heb hebVar2 = heb.a;
                                    ir2 ir2Var2 = ir2Var;
                                    switch (i62) {
                                        case 0:
                                            ir2Var2.I();
                                            break;
                                        case 1:
                                            za1 za1VarA = vtb.a(ir2Var2);
                                            aj2 aj2Var = rw2.a;
                                            ir2Var2.g(za1VarA, nh2.c, new et1(ir2Var2, null, null, 11));
                                            break;
                                        case 2:
                                            yd5 yd5Var = ir2Var2.W;
                                            if (yd5Var != null) {
                                                yd5Var.cancel(null);
                                            }
                                            za1 za1VarA2 = vtb.a(ir2Var2);
                                            aj2 aj2Var2 = rw2.a;
                                            ir2Var2.W = ir2Var2.g(za1VarA2, nh2.c, new ar2(ir2Var2, null));
                                            break;
                                        case 3:
                                            yd5 yd5Var2 = ir2Var2.W;
                                            if (yd5Var2 != null) {
                                                yd5Var2.cancel(null);
                                            }
                                            za1 za1VarA3 = vtb.a(ir2Var2);
                                            aj2 aj2Var3 = rw2.a;
                                            ir2Var2.W = ir2Var2.g(za1VarA3, nh2.c, new qi(ir2Var2, (jt1) null, 2));
                                            break;
                                        default:
                                            ir2Var2.I();
                                            break;
                                    }
                                    return hebVar2;
                                }
                            };
                            dd4Var.p0(objQ12);
                        }
                        ib4 ib4Var7 = (ib4) objQ12;
                        Object objQ13 = dd4Var.Q();
                        if (objQ13 == obj5) {
                            objQ13 = new r02(a07Var3, 4);
                            dd4Var.p0(objQ13);
                        }
                        kb4 kb4Var3 = (kb4) objQ13;
                        boolean zF13 = dd4Var.f(t27Var);
                        Object objQ14 = dd4Var.Q();
                        if (zF13 || objQ14 == obj5) {
                            objQ14 = new cl0(t27Var, 3);
                            dd4Var.p0(objQ14);
                        }
                        fw.g(wq2Var, pj7Var2, ou6VarE, ib4Var2, ib4Var3, kb4Var, yb4Var, yb4Var2, ib4Var4, kb4Var2, ib4Var5, ib4Var6, ib4Var7, kb4Var3, (kb4) objQ14, dd4Var, i4 & Token.ASSIGN_MOD);
                        dd4Var.q(false);
                    }
                }
                break;
            default:
                p5a p5aVar = (p5a) qtbVar;
                List list = (List) obj9;
                vx1 vx1Var = (vx1) obj8;
                m8 m8Var = (m8) obj7;
                aw3 aw3Var = (aw3) obj6;
                pj7 pj7Var3 = (pj7) obj2;
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((yn0) obj).getClass();
                pj7Var3.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= dd4Var2.f(pj7Var3) ? 32 : 16;
                }
                int i8 = iIntValue2;
                if (!dd4Var2.V(i8 & 1, (i8 & Token.TARGET) != 144)) {
                    dd4Var2.Y();
                } else {
                    q5a q5aVar = (q5a) br9Var.getValue();
                    boolean zF14 = dd4Var2.f(p5aVar);
                    Object objQ15 = dd4Var2.Q();
                    if (zF14 || objQ15 == obj5) {
                        objQ15 = new j5a(p5aVar, 0);
                        dd4Var2.p0(objQ15);
                    }
                    kb4 kb4Var4 = (kb4) objQ15;
                    Object objQ16 = dd4Var2.Q();
                    if (objQ16 == obj5) {
                        objQ16 = new dh1(1);
                        dd4Var2.p0(objQ16);
                    }
                    ib4 ib4Var8 = (ib4) objQ16;
                    boolean zH = dd4Var2.h(list) | dd4Var2.h(vx1Var) | dd4Var2.f(m8Var);
                    Object objQ17 = dd4Var2.Q();
                    if (zH || objQ17 == obj5) {
                        objQ17 = new fb3(29, list, vx1Var, m8Var);
                        dd4Var2.p0(objQ17);
                    }
                    kb4 kb4Var5 = (kb4) objQ17;
                    boolean zF15 = dd4Var2.f(p5aVar);
                    Object objQ18 = dd4Var2.Q();
                    if (zF15 || objQ18 == obj5) {
                        pj7Var = pj7Var3;
                        m98 m98Var = new m98(0, p5aVar, p5a.class, "syncNow", "syncNow()V", 0, 24);
                        dd4Var2.p0(m98Var);
                        objQ18 = m98Var;
                    } else {
                        pj7Var = pj7Var3;
                    }
                    ib4 ib4Var9 = (ib4) ((ei5) objQ18);
                    boolean zF16 = dd4Var2.f(aw3Var);
                    Object objQ19 = dd4Var2.Q();
                    if (zF16 || objQ19 == obj5) {
                        objQ19 = new k51(aw3Var, 11);
                        dd4Var2.p0(objQ19);
                    }
                    ib4 ib4Var10 = (ib4) objQ19;
                    boolean zF17 = dd4Var2.f(a07Var);
                    Object objQ20 = dd4Var2.Q();
                    if (zF17 || objQ20 == obj5) {
                        objQ20 = new vb9(a07Var, 5);
                        dd4Var2.p0(objQ20);
                    }
                    gjb.B(q5aVar, pj7Var, null, kb4Var4, ib4Var8, kb4Var5, ib4Var9, ib4Var10, (ib4) objQ20, dd4Var2, (i8 & Token.ASSIGN_MOD) | 24576);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ oq2(p5a p5aVar, List list, vx1 vx1Var, m8 m8Var, aw3 aw3Var, a07 a07Var, a07 a07Var2) {
        this.d = p5aVar;
        this.e = list;
        this.f = vx1Var;
        this.s = m8Var;
        this.t = aw3Var;
        this.b = a07Var;
        this.c = a07Var2;
    }
}

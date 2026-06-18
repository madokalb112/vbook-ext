package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class jc9 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mb9 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ kb4 e;

    public /* synthetic */ jc9(mb9 mb9Var, int i, kb4 kb4Var, kb4 kb4Var2, int i2) {
        this.a = i2;
        this.b = mb9Var;
        this.c = i;
        this.d = kb4Var;
        this.e = kb4Var2;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        aq5 aq5Var;
        List list;
        kb4 kb4Var;
        List list2;
        List list3;
        mb9 mb9Var;
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.c;
        final int i3 = 0;
        int i4 = 4;
        final int i5 = 1;
        switch (i) {
            case 0:
                aq5 aq5Var2 = (aq5) obj;
                aq5Var2.getClass();
                final mb9 mb9Var2 = this.b;
                List list4 = mb9Var2.h;
                List list5 = mb9Var2.j;
                List list6 = mb9Var2.i;
                List list7 = mb9Var2.g;
                boolean zIsEmpty = list4.isEmpty();
                final kb4 kb4Var2 = this.d;
                final kb4 kb4Var3 = this.e;
                if (!zIsEmpty) {
                    aq5.b0(aq5Var2, "last_add_grid2", new ax8(17), fz1.r, 4);
                    aq5.b0(aq5Var2, "last_add_grid2_content", new ax8(20), new rj1(new zb4() { // from class: nc9
                        @Override // defpackage.zb4
                        public final Object c(Object obj2, Object obj3, Object obj4) {
                            int i6 = i3;
                            heb hebVar2 = heb.a;
                            lu6 lu6Var = lu6.a;
                            mb9 mb9Var3 = mb9Var2;
                            switch (i6) {
                                case 0:
                                    dd4 dd4Var = (dd4) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    ((dq5) obj2).getClass();
                                    if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        dd4Var.Y();
                                    } else {
                                        p7c.b(mb9Var3.h, gjb.p0(tg9.j(lu6Var, 24.0f, 0.0f, 2), 4.0f, 12.0f, 0.0f, 8.0f, 4), kb4Var2, kb4Var3, dd4Var, 0);
                                    }
                                    break;
                                default:
                                    dd4 dd4Var2 = (dd4) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    ((dq5) obj2).getClass();
                                    if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        dd4Var2.Y();
                                    } else {
                                        p7c.b(mb9Var3.h, gjb.p0(tg9.j(lu6Var, 24.0f, 0.0f, 2), 4.0f, 12.0f, 0.0f, 8.0f, 4), kb4Var2, kb4Var3, dd4Var2, 0);
                                    }
                                    break;
                            }
                            return hebVar2;
                        }
                    }, true, -834100682), 4);
                }
                if (list7.isEmpty()) {
                    aq5Var = aq5Var2;
                    list = list6;
                } else {
                    aq5.b0(aq5Var2, "recent_grid2", new ax8(21), fz1.s, 4);
                    final List listS0 = fc1.S0(list7, 6);
                    final int i6 = 0;
                    aq5.b0(aq5Var2, "recent_grid1_content", new ax8(22), new rj1(new zb4() { // from class: oc9
                        @Override // defpackage.zb4
                        public final Object c(Object obj2, Object obj3, Object obj4) {
                            int i7 = i6;
                            heb hebVar2 = heb.a;
                            lu6 lu6Var = lu6.a;
                            switch (i7) {
                                case 0:
                                    dd4 dd4Var = (dd4) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    ((dq5) obj2).getClass();
                                    if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        dd4Var.Y();
                                    } else {
                                        p7c.b(listS0, gjb.p0(tg9.j(lu6Var, 24.0f, 0.0f, 2), 4.0f, 12.0f, 0.0f, 8.0f, 4), kb4Var2, kb4Var3, dd4Var, 0);
                                    }
                                    break;
                                default:
                                    dd4 dd4Var2 = (dd4) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    ((dq5) obj2).getClass();
                                    if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        dd4Var2.Y();
                                    } else {
                                        p7c.b(listS0, gjb.p0(tg9.j(lu6Var, 24.0f, 0.0f, 2), 4.0f, 12.0f, 0.0f, 8.0f, 4), kb4Var2, kb4Var3, dd4Var2, 0);
                                    }
                                    break;
                            }
                            return hebVar2;
                        }
                    }, true, 387425901), 4);
                    final List listT0 = fc1.t0(list7, 2);
                    list = list6;
                    final int i7 = 0;
                    aq5.d0(aq5Var2, Math.min(i2, listT0.size()), new m41(3, listT0), new ax8(18), new rj1(new ac4() { // from class: pc9
                        @Override // defpackage.ac4
                        public final Object g(Object obj2, Object obj3, Object obj4, Object obj5) {
                            int i8 = i7;
                            heb hebVar2 = heb.a;
                            lu6 lu6Var = lu6.a;
                            mb9 mb9Var3 = mb9Var2;
                            List list8 = listT0;
                            switch (i8) {
                                case 0:
                                    dq5 dq5Var = (dq5) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    dd4 dd4Var = (dd4) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    dq5Var.getClass();
                                    int i9 = (iIntValue2 & 6) == 0 ? iIntValue2 | (dd4Var.f(dq5Var) ? 4 : 2) : iIntValue2;
                                    if ((iIntValue2 & 48) == 0) {
                                        i9 |= dd4Var.d(iIntValue) ? 32 : 16;
                                    }
                                    if (!dd4Var.V(i9 & 1, (i9 & Token.EXPR_VOID) != 146)) {
                                        dd4Var.Y();
                                    } else {
                                        sdc.b((ob9) list8.get(iIntValue), mb9Var3.d, mb9Var3.e, mb9Var3.f, dq5.a(dq5Var, gjb.p0(gjb.l0(tg9.f(lu6Var, 1.0f), 4.0f), 0.0f, 0.0f, 0.0f, 4.0f, 7)), kb4Var2, kb4Var3, dd4Var, 0);
                                    }
                                    break;
                                default:
                                    dq5 dq5Var2 = (dq5) obj2;
                                    int iIntValue3 = ((Integer) obj3).intValue();
                                    dd4 dd4Var2 = (dd4) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    dq5Var2.getClass();
                                    int i10 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var2.f(dq5Var2) ? 4 : 2) : iIntValue4;
                                    if ((iIntValue4 & 48) == 0) {
                                        i10 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                                    }
                                    if (!dd4Var2.V(i10 & 1, (i10 & Token.EXPR_VOID) != 146)) {
                                        dd4Var2.Y();
                                    } else {
                                        sdc.a((ob9) list8.get(iIntValue3), mb9Var3.d, mb9Var3.e, mb9Var3.f, dq5.a(dq5Var2, gjb.p0(gjb.l0(tg9.f(lu6Var, 1.0f), 4.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7)), kb4Var2, kb4Var3, dd4Var2, 0);
                                    }
                                    break;
                            }
                            return hebVar2;
                        }
                    }, true, -1094788131), 4);
                    aq5Var = aq5Var2;
                }
                if (!list.isEmpty()) {
                    aq5.b0(aq5Var, "last_update_grid2", new ax8(23), fz1.t, 4);
                    aq5.d0(aq5Var, Math.min(i2, list.size()), new mc9(mb9Var2, 3), new ax8(18), new rj1(new lc9(mb9Var2, kb4Var2, kb4Var3, 3), true, 1160715678), 4);
                }
                if (!list5.isEmpty()) {
                    aq5.b0(aq5Var, "often_read_grid2", new ax8(19), fz1.u, 4);
                    aq5.d0(aq5Var, Math.min(i2, list5.size()), new mc9(mb9Var2, 4), new ax8(18), new rj1(new lc9(mb9Var2, kb4Var2, kb4Var3, i4), true, -878747809), 4);
                }
                break;
            default:
                aq5 aq5Var3 = (aq5) obj;
                aq5Var3.getClass();
                final mb9 mb9Var3 = this.b;
                List list8 = mb9Var3.h;
                List list9 = mb9Var3.j;
                List list10 = mb9Var3.i;
                List list11 = mb9Var3.g;
                boolean zIsEmpty2 = list8.isEmpty();
                final kb4 kb4Var4 = this.d;
                final kb4 kb4Var5 = this.e;
                if (!zIsEmpty2) {
                    aq5.b0(aq5Var3, "last_add_grid1", new qc9(0), fz1.n, 4);
                    aq5.b0(aq5Var3, "last_add_grid1_content", new qc9(3), new rj1(new zb4() { // from class: nc9
                        @Override // defpackage.zb4
                        public final Object c(Object obj2, Object obj3, Object obj4) {
                            int i62 = i5;
                            heb hebVar2 = heb.a;
                            lu6 lu6Var = lu6.a;
                            mb9 mb9Var32 = mb9Var3;
                            switch (i62) {
                                case 0:
                                    dd4 dd4Var = (dd4) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    ((dq5) obj2).getClass();
                                    if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        dd4Var.Y();
                                    } else {
                                        p7c.b(mb9Var32.h, gjb.p0(tg9.j(lu6Var, 24.0f, 0.0f, 2), 4.0f, 12.0f, 0.0f, 8.0f, 4), kb4Var4, kb4Var5, dd4Var, 0);
                                    }
                                    break;
                                default:
                                    dd4 dd4Var2 = (dd4) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    ((dq5) obj2).getClass();
                                    if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        dd4Var2.Y();
                                    } else {
                                        p7c.b(mb9Var32.h, gjb.p0(tg9.j(lu6Var, 24.0f, 0.0f, 2), 4.0f, 12.0f, 0.0f, 8.0f, 4), kb4Var4, kb4Var5, dd4Var2, 0);
                                    }
                                    break;
                            }
                            return hebVar2;
                        }
                    }, true, -1536035275), 4);
                }
                if (list11.isEmpty()) {
                    kb4Var = kb4Var5;
                    list2 = list9;
                    list3 = list10;
                    mb9Var = mb9Var3;
                } else {
                    aq5.b0(aq5Var3, "recent_grid1", new qc9(4), fz1.o, 4);
                    final List listS02 = fc1.S0(list11, 6);
                    aq5.b0(aq5Var3, "recent_grid1_content", new qc9(5), new rj1(new zb4() { // from class: oc9
                        @Override // defpackage.zb4
                        public final Object c(Object obj2, Object obj3, Object obj4) {
                            int i72 = i5;
                            heb hebVar2 = heb.a;
                            lu6 lu6Var = lu6.a;
                            switch (i72) {
                                case 0:
                                    dd4 dd4Var = (dd4) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    ((dq5) obj2).getClass();
                                    if (!dd4Var.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        dd4Var.Y();
                                    } else {
                                        p7c.b(listS02, gjb.p0(tg9.j(lu6Var, 24.0f, 0.0f, 2), 4.0f, 12.0f, 0.0f, 8.0f, 4), kb4Var4, kb4Var5, dd4Var, 0);
                                    }
                                    break;
                                default:
                                    dd4 dd4Var2 = (dd4) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    ((dq5) obj2).getClass();
                                    if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        dd4Var2.Y();
                                    } else {
                                        p7c.b(listS02, gjb.p0(tg9.j(lu6Var, 24.0f, 0.0f, 2), 4.0f, 12.0f, 0.0f, 8.0f, 4), kb4Var4, kb4Var5, dd4Var2, 0);
                                    }
                                    break;
                            }
                            return hebVar2;
                        }
                    }, true, -314508692), 4);
                    final List listT02 = fc1.t0(list11, 2);
                    int iMin = Math.min(i2, listT02.size());
                    m41 m41Var = new m41(i4, listT02);
                    qc9 qc9Var = new qc9(1);
                    list2 = list9;
                    final int i8 = 1;
                    list3 = list10;
                    ac4 ac4Var = new ac4() { // from class: pc9
                        @Override // defpackage.ac4
                        public final Object g(Object obj2, Object obj3, Object obj4, Object obj5) {
                            int i82 = i8;
                            heb hebVar2 = heb.a;
                            lu6 lu6Var = lu6.a;
                            mb9 mb9Var32 = mb9Var3;
                            List list82 = listT02;
                            switch (i82) {
                                case 0:
                                    dq5 dq5Var = (dq5) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    dd4 dd4Var = (dd4) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    dq5Var.getClass();
                                    int i9 = (iIntValue2 & 6) == 0 ? iIntValue2 | (dd4Var.f(dq5Var) ? 4 : 2) : iIntValue2;
                                    if ((iIntValue2 & 48) == 0) {
                                        i9 |= dd4Var.d(iIntValue) ? 32 : 16;
                                    }
                                    if (!dd4Var.V(i9 & 1, (i9 & Token.EXPR_VOID) != 146)) {
                                        dd4Var.Y();
                                    } else {
                                        sdc.b((ob9) list82.get(iIntValue), mb9Var32.d, mb9Var32.e, mb9Var32.f, dq5.a(dq5Var, gjb.p0(gjb.l0(tg9.f(lu6Var, 1.0f), 4.0f), 0.0f, 0.0f, 0.0f, 4.0f, 7)), kb4Var4, kb4Var5, dd4Var, 0);
                                    }
                                    break;
                                default:
                                    dq5 dq5Var2 = (dq5) obj2;
                                    int iIntValue3 = ((Integer) obj3).intValue();
                                    dd4 dd4Var2 = (dd4) obj4;
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    dq5Var2.getClass();
                                    int i10 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var2.f(dq5Var2) ? 4 : 2) : iIntValue4;
                                    if ((iIntValue4 & 48) == 0) {
                                        i10 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                                    }
                                    if (!dd4Var2.V(i10 & 1, (i10 & Token.EXPR_VOID) != 146)) {
                                        dd4Var2.Y();
                                    } else {
                                        sdc.a((ob9) list82.get(iIntValue3), mb9Var32.d, mb9Var32.e, mb9Var32.f, dq5.a(dq5Var2, gjb.p0(gjb.l0(tg9.f(lu6Var, 1.0f), 4.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7)), kb4Var4, kb4Var5, dd4Var2, 0);
                                    }
                                    break;
                            }
                            return hebVar2;
                        }
                    };
                    mb9Var = mb9Var3;
                    kb4Var = kb4Var5;
                    aq5.d0(aq5Var3, iMin, m41Var, qc9Var, new rj1(ac4Var, true, -1796722724), 4);
                }
                if (!list3.isEmpty()) {
                    aq5.b0(aq5Var3, "last_update_grid1", new qc9(6), fz1.p, 4);
                    aq5.d0(aq5Var3, Math.min(i2, list3.size()), new mc9(mb9Var, 8), new qc9(1), new rj1(new lc9(mb9Var, kb4Var4, kb4Var, 8), true, 458781085), 4);
                }
                if (!list2.isEmpty()) {
                    aq5.b0(aq5Var3, "often_read_grid1", new qc9(2), fz1.q, 4);
                    aq5.d0(aq5Var3, Math.min(i2, list2.size()), new mc9(mb9Var, 9), new qc9(1), new rj1(new lc9(mb9Var, kb4Var4, kb4Var, 9), true, -1580682402), 4);
                }
                break;
        }
        return hebVar;
    }
}

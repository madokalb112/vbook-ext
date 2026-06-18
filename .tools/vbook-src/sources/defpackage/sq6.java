package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sq6 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ kb4 d;

    public /* synthetic */ sq6(int i, kb4 kb4Var, String str, List list) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = kb4Var;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        p96 p96VarK0;
        boolean z;
        long j;
        p96 p96VarK02;
        boolean z2;
        boolean z3;
        int i = this.a;
        int i2 = 3;
        lu6 lu6Var = lu6.a;
        heb hebVar = heb.a;
        Object obj5 = vl1.a;
        String str = this.c;
        List list = this.b;
        kb4 kb4Var = this.d;
        switch (i) {
            case 0:
                dr5 dr5Var = (dr5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                xf0 xf0Var = bv4.f;
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | (dd4Var.f(dr5Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= dd4Var.d(iIntValue) ? 32 : 16;
                }
                if (!dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    dd4Var.Y();
                } else {
                    zd1 zd1Var = (zd1) list.get(iIntValue);
                    dd4Var.f0(1524328114);
                    String str2 = zd1Var.a;
                    String str3 = zd1Var.c;
                    String str4 = zd1Var.b;
                    boolean zQ = lc5.Q(str2, str);
                    boolean z4 = zd1Var.a.length() == 0;
                    boolean zF = dd4Var.f(str4);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj5) {
                        lc1 lc1Var = new lc1(str4.length() == 0 ? lc1.b : kf0.H(str4));
                        dd4Var.p0(lc1Var);
                        objQ = lc1Var;
                    }
                    long j2 = ((lc1) objQ).a;
                    boolean zF2 = dd4Var.f(str3);
                    Object objQ2 = dd4Var.Q();
                    if (zF2 || objQ2 == obj5) {
                        lc1 lc1Var2 = new lc1(str4.length() == 0 ? lc1.e : kf0.H(str3));
                        dd4Var.p0(lc1Var2);
                        objQ2 = lc1Var2;
                    }
                    long j3 = ((lc1) objQ2).a;
                    ou6 ou6VarN = tg9.n(lu6Var, 40.0f);
                    if (zQ) {
                        dd4Var.f0(-1613372475);
                        g83 g83Var = o96.a;
                        p96VarK0 = rw1.k0(g83.q(), dd4Var);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(-1613371993);
                        dd4Var.q(false);
                        p96VarK0 = tp8.a;
                    }
                    ou6 ou6VarW = t96.w(ou6VarN, p96VarK0);
                    if (zQ) {
                        z = z4;
                        j = j2;
                    } else {
                        z = z4;
                        j = lc1.i;
                    }
                    ou6 ou6VarL0 = gjb.l0(fe.L(ou6VarW, j, jf0.G), zQ ? 3.0f : 1.5f);
                    if (zQ) {
                        dd4Var.f0(-1613364315);
                        g83 g83Var2 = o96.a;
                        p96VarK02 = rw1.k0(g83.q(), dd4Var);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(-1613363833);
                        dd4Var.q(false);
                        p96VarK02 = tp8.a;
                    }
                    ou6 ou6VarW2 = t96.w(ou6VarL0, p96VarK02);
                    boolean zF3 = dd4Var.f(kb4Var) | dd4Var.h(zd1Var);
                    Object objQ3 = dd4Var.Q();
                    if (zF3 || objQ3 == obj5) {
                        z2 = false;
                        objQ3 = new rq6(kb4Var, zd1Var, 0);
                        dd4Var.p0(objQ3);
                    } else {
                        z2 = false;
                    }
                    ou6 ou6VarJ = fw.J(null, (ib4) objQ3, ou6VarW2, z2, 15);
                    ha6 ha6VarD = pn0.d(bv4.b, z2);
                    int iHashCode = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL = dd4Var.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarJ);
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
                    un9.s(ll1.d, dd4Var, ou6VarL02);
                    ym9.a(384, j3, dd4Var, tg9.c, zd1Var.d);
                    zn0 zn0Var = zn0.a;
                    if (z) {
                        dd4Var.f0(567276699);
                        mx4.a(i25.c((m53) a53.p.getValue(), dd4Var, 0), (String) null, zn0Var.a(lu6Var, xf0Var), j2, dd4Var, 48, 0);
                        dd4Var.q(false);
                        z3 = false;
                    } else {
                        dd4Var.f0(567619218);
                        nha.c("Aa", zn0Var.a(lu6Var, xf0Var), j2, (g60) null, wn9.x(16), (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var, 24582, 0, 262120);
                        z3 = false;
                        dd4Var.q(false);
                    }
                    dd4Var.q(true);
                    dd4Var.q(z3);
                }
                break;
            case 1:
                dr5 dr5Var2 = (dr5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i4 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var2.f(dr5Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i4 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var2.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    dd4Var2.Y();
                } else {
                    br3 br3Var = (br3) list.get(iIntValue3);
                    dd4Var2.f0(1866382100);
                    lc5.Q(br3Var.a, str);
                    boolean zF4 = dd4Var2.f(kb4Var) | dd4Var2.h(br3Var);
                    Object objQ4 = dd4Var2.Q();
                    if (zF4 || objQ4 == obj5) {
                        objQ4 = new e7(9, kb4Var, br3Var);
                        dd4Var2.p0(objQ4);
                    }
                    ou6 ou6VarL03 = gjb.l0(fw.J(null, (ib4) objQ4, lu6Var, false, 15), 12.0f);
                    eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var2, 0);
                    int iHashCode2 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL2 = dd4Var2.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var2, ou6VarL03);
                    ml1.k.getClass();
                    um1 um1Var2 = ll1.b;
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var2);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(ll1.f, dd4Var2, eq8VarA);
                    un9.s(ll1.e, dd4Var2, lr7VarL2);
                    un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode2));
                    un9.r(dd4Var2, ll1.h);
                    un9.s(ll1.d, dd4Var2, ou6VarL04);
                    nha.c(br3Var.a, new bp5(1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var2, 0, 0, 262140);
                    dd4Var2.q(true);
                    dd4Var2.q(false);
                }
                break;
            case 2:
                dr5 dr5Var3 = (dr5) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                dd4 dd4Var3 = (dd4) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i5 = (iIntValue6 & 6) == 0 ? iIntValue6 | (dd4Var3.f(dr5Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i5 |= dd4Var3.d(iIntValue5) ? 32 : 16;
                }
                if (!dd4Var3.V(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
                    dd4Var3.Y();
                } else {
                    u78 u78Var = (u78) list.get(iIntValue5);
                    dd4Var3.f0(-1254134098);
                    String str5 = u78Var.b;
                    boolean zEquals = u78Var.a.equals(str);
                    boolean zF5 = dd4Var3.f(kb4Var) | dd4Var3.h(u78Var);
                    Object objQ5 = dd4Var3.Q();
                    if (zF5 || objQ5 == obj5) {
                        objQ5 = new e7(19, kb4Var, u78Var);
                        dd4Var3.p0(objQ5);
                    }
                    fz1.C(0, (ib4) objQ5, dd4Var3, null, null, null, str5, zEquals);
                    dd4Var3.q(false);
                }
                break;
            case 3:
                dr5 dr5Var4 = (dr5) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                dd4 dd4Var4 = (dd4) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                int i6 = (iIntValue8 & 6) == 0 ? iIntValue8 | (dd4Var4.f(dr5Var4) ? 4 : 2) : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i6 |= dd4Var4.d(iIntValue7) ? 32 : 16;
                }
                if (!dd4Var4.V(i6 & 1, (i6 & Token.EXPR_VOID) != 146)) {
                    dd4Var4.Y();
                } else {
                    zd1 zd1Var2 = (zd1) list.get(iIntValue7);
                    dd4Var4.f0(1710490839);
                    boolean zQ2 = lc5.Q(zd1Var2.a, str);
                    ou6 ou6VarO = tg9.o(gjb.l0(lu6Var, 2.0f), 100.0f, 60.0f);
                    boolean zF6 = dd4Var4.f(kb4Var) | dd4Var4.h(zd1Var2);
                    Object objQ6 = dd4Var4.Q();
                    if (zF6 || objQ6 == obj5) {
                        objQ6 = new rq6(kb4Var, zd1Var2, 1);
                        dd4Var4.p0(objQ6);
                    }
                    gc1.f(zQ2, zd1Var2, yn2.s(ou6VarO, false, 0.0f, (ib4) objQ6, 3), dd4Var4, 0);
                    dd4Var4.q(false);
                }
                break;
            case 4:
                dr5 dr5Var5 = (dr5) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                dd4 dd4Var5 = (dd4) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                int i7 = (iIntValue10 & 6) == 0 ? iIntValue10 | (dd4Var5.f(dr5Var5) ? 4 : 2) : iIntValue10;
                if ((iIntValue10 & 48) == 0) {
                    i7 |= dd4Var5.d(iIntValue9) ? 32 : 16;
                }
                if (!dd4Var5.V(i7 & 1, (i7 & Token.EXPR_VOID) != 146)) {
                    dd4Var5.Y();
                } else {
                    zd1 zd1Var3 = (zd1) list.get(iIntValue9);
                    dd4Var5.f0(1861702082);
                    boolean zQ3 = lc5.Q(zd1Var3.a, str);
                    ou6 ou6VarO2 = tg9.o(gjb.l0(lu6Var, 2.0f), 100.0f, 60.0f);
                    boolean zF7 = dd4Var5.f(kb4Var) | dd4Var5.h(zd1Var3);
                    Object objQ7 = dd4Var5.Q();
                    if (zF7 || objQ7 == obj5) {
                        objQ7 = new rq6(kb4Var, zd1Var3, 2);
                        dd4Var5.p0(objQ7);
                    }
                    gc1.f(zQ3, zd1Var3, yn2.s(ou6VarO2, false, 0.0f, (ib4) objQ7, 3), dd4Var5, 0);
                    dd4Var5.q(false);
                }
                break;
            default:
                dq5 dq5Var = (dq5) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                dd4 dd4Var6 = (dd4) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                int i8 = (iIntValue12 & 6) == 0 ? iIntValue12 | (dd4Var6.f(dq5Var) ? 4 : 2) : iIntValue12;
                if ((iIntValue12 & 48) == 0) {
                    i8 |= dd4Var6.d(iIntValue11) ? 32 : 16;
                }
                if (!dd4Var6.V(i8 & 1, (i8 & Token.EXPR_VOID) != 146)) {
                    dd4Var6.Y();
                } else {
                    zrb zrbVar = (zrb) list.get(iIntValue11);
                    dd4Var6.f0(-1247608828);
                    boolean zEquals2 = str.equals(zrbVar.a);
                    boolean zF8 = dd4Var6.f(kb4Var) | dd4Var6.f(zrbVar);
                    Object objQ8 = dd4Var6.Q();
                    if (zF8 || objQ8 == obj5) {
                        objQ8 = new a1b(i2, kb4Var, zrbVar);
                        dd4Var6.p0(objQ8);
                    }
                    fz1.g(zEquals2, zrbVar, null, (ib4) objQ8, dd4Var6, 0);
                    dd4Var6.q(false);
                }
                break;
        }
        return hebVar;
    }
}

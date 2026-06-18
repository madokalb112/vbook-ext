package defpackage;

import java.util.List;
import java.util.Locale;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fk0 implements ac4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ kb4 c;

    public /* synthetic */ fk0(List list, kb4 kb4Var, int i) {
        this.a = i;
        this.b = list;
        this.c = kb4Var;
    }

    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v28 */
    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        ?? r5;
        ?? r52;
        int i = this.a;
        heb hebVar = heb.a;
        Object obj5 = vl1.a;
        lu6 lu6Var = lu6.a;
        List list = this.b;
        kb4 kb4Var = this.c;
        switch (i) {
            case 0:
                dr5 dr5Var = (dr5) obj;
                int iIntValue = ((Number) obj2).intValue();
                dd4 dd4Var = (dd4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (dd4Var.f(dr5Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= dd4Var.d(iIntValue) ? 32 : 16;
                }
                if (!dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    dd4Var.Y();
                } else {
                    ji0 ji0Var = (ji0) list.get(iIntValue);
                    dd4Var.f0(369061437);
                    String str = ji0Var.a;
                    String str2 = ji0Var.b;
                    String str3 = ji0Var.d;
                    String str4 = ji0Var.e;
                    String str5 = ji0Var.c;
                    ou6 ou6VarA = dr5.a(dr5Var, tg9.r(lu6Var, 120.0f));
                    boolean zF = dd4Var.f(kb4Var) | dd4Var.h(ji0Var);
                    Object objQ = dd4Var.Q();
                    if (zF || objQ == obj5) {
                        z = false;
                        objQ = new ek0(kb4Var, ji0Var, 0);
                        dd4Var.p0(objQ);
                    } else {
                        z = false;
                    }
                    fz1.j(str, str2, str3, str4, str5, ou6VarA, (ib4) objQ, dd4Var, 0);
                    dd4Var.q(z);
                }
                break;
            case 1:
                dq5 dq5Var = (dq5) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                dd4 dd4Var2 = (dd4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (dd4Var2.f(dq5Var) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= dd4Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
                    dd4Var2.Y();
                } else {
                    bp0 bp0Var = (bp0) list.get(iIntValue3);
                    dd4Var2.f0(1027440590);
                    boolean zF2 = dd4Var2.f(kb4Var) | dd4Var2.h(bp0Var);
                    Object objQ2 = dd4Var2.Q();
                    if (zF2 || objQ2 == obj5) {
                        r5 = 0;
                        objQ2 = new aq0(kb4Var, bp0Var, 0);
                        dd4Var2.p0(objQ2);
                    } else {
                        r5 = 0;
                    }
                    fz1.o(bp0Var, gjb.m0(fw.J(null, (ib4) objQ2, lu6Var, r5, 15), 8.0f, 4.0f), dd4Var2, r5);
                    dd4Var2.q((boolean) r5);
                }
                break;
            case 2:
                dq5 dq5Var2 = (dq5) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                dd4 dd4Var3 = (dd4) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i4 = (iIntValue6 & 6) == 0 ? iIntValue6 | (dd4Var3.f(dq5Var2) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i4 |= dd4Var3.d(iIntValue5) ? 32 : 16;
                }
                if (!dd4Var3.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
                    dd4Var3.Y();
                } else {
                    to3 to3Var = (to3) list.get(iIntValue5);
                    dd4Var3.f0(-1656511925);
                    ou6 ou6VarR = tg9.r(lu6Var, 92.0f);
                    boolean zF3 = dd4Var3.f(kb4Var) | dd4Var3.h(to3Var);
                    Object objQ3 = dd4Var3.Q();
                    if (zF3 || objQ3 == obj5) {
                        r52 = 0;
                        objQ3 = new gq0(kb4Var, to3Var, 0);
                        dd4Var3.p0(objQ3);
                    } else {
                        r52 = 0;
                    }
                    fz1.i(to3Var, fw.J(null, (ib4) objQ3, ou6VarR, r52, 15), dd4Var3, r52);
                    dd4Var3.q((boolean) r52);
                }
                break;
            case 3:
                dr5 dr5Var2 = (dr5) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                dd4 dd4Var4 = (dd4) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                int i5 = (iIntValue8 & 6) == 0 ? iIntValue8 | (dd4Var4.f(dr5Var2) ? 4 : 2) : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i5 |= dd4Var4.d(iIntValue7) ? 32 : 16;
                }
                if (!dd4Var4.V(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
                    dd4Var4.Y();
                } else {
                    ji0 ji0Var2 = (ji0) list.get(iIntValue7);
                    dd4Var4.f0(1390350029);
                    String str6 = ji0Var2.a;
                    String str7 = ji0Var2.b;
                    String str8 = ji0Var2.d;
                    String str9 = ji0Var2.e;
                    String str10 = ji0Var2.c;
                    ou6 ou6VarA2 = dr5.a(dr5Var2, tg9.r(lu6Var, 120.0f));
                    boolean zF4 = dd4Var4.f(kb4Var) | dd4Var4.h(ji0Var2);
                    Object objQ4 = dd4Var4.Q();
                    if (zF4 || objQ4 == obj5) {
                        objQ4 = new ek0(kb4Var, ji0Var2, 1);
                        dd4Var4.p0(objQ4);
                    }
                    fz1.j(str6, str7, str8, str9, str10, ou6VarA2, (ib4) objQ4, dd4Var4, 0);
                    dd4Var4.q(false);
                }
                break;
            case 4:
                dq5 dq5Var3 = (dq5) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                dd4 dd4Var5 = (dd4) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                int i6 = (iIntValue10 & 6) == 0 ? iIntValue10 | (dd4Var5.f(dq5Var3) ? 4 : 2) : iIntValue10;
                if ((iIntValue10 & 48) == 0) {
                    i6 |= dd4Var5.d(iIntValue9) ? 32 : 16;
                }
                if (!dd4Var5.V(i6 & 1, (i6 & Token.EXPR_VOID) != 146)) {
                    dd4Var5.Y();
                } else {
                    ji0 ji0Var3 = (ji0) list.get(iIntValue9);
                    dd4Var5.f0(-927755328);
                    String str11 = ji0Var3.a;
                    String str12 = ji0Var3.b;
                    String str13 = ji0Var3.d;
                    String str14 = ji0Var3.e;
                    String str15 = ji0Var3.c;
                    ou6 ou6VarA3 = dq5.a(dq5Var3, tg9.f(lu6Var, 1.0f));
                    boolean zF5 = dd4Var5.f(kb4Var) | dd4Var5.h(ji0Var3);
                    Object objQ5 = dd4Var5.Q();
                    if (zF5 || objQ5 == obj5) {
                        objQ5 = new ek0(kb4Var, ji0Var3, 2);
                        dd4Var5.p0(objQ5);
                    }
                    fz1.j(str11, str12, str13, str14, str15, ou6VarA3, (ib4) objQ5, dd4Var5, 0);
                    dd4Var5.q(false);
                }
                break;
            case 5:
                dq5 dq5Var4 = (dq5) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                dd4 dd4Var6 = (dd4) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                int i7 = (iIntValue12 & 6) == 0 ? iIntValue12 | (dd4Var6.f(dq5Var4) ? 4 : 2) : iIntValue12;
                if ((iIntValue12 & 48) == 0) {
                    i7 |= dd4Var6.d(iIntValue11) ? 32 : 16;
                }
                if (!dd4Var6.V(i7 & 1, (i7 & Token.EXPR_VOID) != 146)) {
                    dd4Var6.Y();
                } else {
                    ji0 ji0Var4 = (ji0) list.get(iIntValue11);
                    dd4Var6.f0(-1630355073);
                    ou6 ou6VarA4 = dq5.a(dq5Var4, tg9.f(lu6Var, 1.0f));
                    boolean zF6 = dd4Var6.f(kb4Var) | dd4Var6.h(ji0Var4);
                    Object objQ6 = dd4Var6.Q();
                    if (zF6 || objQ6 == obj5) {
                        objQ6 = new ek0(kb4Var, ji0Var4, 3);
                        dd4Var6.p0(objQ6);
                    }
                    fz1.l(ji0Var4, ou6VarA4, (ib4) objQ6, dd4Var6, 0);
                    dd4Var6.q(false);
                }
                break;
            case 6:
                dq5 dq5Var5 = (dq5) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                dd4 dd4Var7 = (dd4) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                int i8 = (iIntValue14 & 6) == 0 ? iIntValue14 | (dd4Var7.f(dq5Var5) ? 4 : 2) : iIntValue14;
                if ((iIntValue14 & 48) == 0) {
                    i8 |= dd4Var7.d(iIntValue13) ? 32 : 16;
                }
                if (!dd4Var7.V(i8 & 1, (i8 & Token.EXPR_VOID) != 146)) {
                    dd4Var7.Y();
                } else {
                    ji0 ji0Var5 = (ji0) list.get(iIntValue13);
                    dd4Var7.f0(1109856806);
                    ou6 ou6VarA5 = dq5.a(dq5Var5, tg9.f(lu6Var, 1.0f));
                    boolean zF7 = dd4Var7.f(kb4Var) | dd4Var7.h(ji0Var5);
                    Object objQ7 = dd4Var7.Q();
                    if (zF7 || objQ7 == obj5) {
                        objQ7 = new ek0(kb4Var, ji0Var5, 4);
                        dd4Var7.p0(objQ7);
                    }
                    fz1.p(ji0Var5, ou6VarA5, (ib4) objQ7, dd4Var7, 0);
                    dd4Var7.q(false);
                }
                break;
            case 7:
                dq5 dq5Var6 = (dq5) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                dd4 dd4Var8 = (dd4) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                int i9 = (iIntValue16 & 6) == 0 ? iIntValue16 | (dd4Var8.f(dq5Var6) ? 4 : 2) : iIntValue16;
                if ((iIntValue16 & 48) == 0) {
                    i9 |= dd4Var8.d(iIntValue15) ? 32 : 16;
                }
                if (!dd4Var8.V(i9 & 1, (i9 & Token.EXPR_VOID) != 146)) {
                    dd4Var8.Y();
                } else {
                    ji0 ji0Var6 = (ji0) list.get(iIntValue15);
                    dd4Var8.f0(407260967);
                    ou6 ou6VarA6 = dq5.a(dq5Var6, tg9.f(lu6Var, 1.0f));
                    boolean zF8 = dd4Var8.f(kb4Var) | dd4Var8.h(ji0Var6);
                    Object objQ8 = dd4Var8.Q();
                    if (zF8 || objQ8 == obj5) {
                        objQ8 = new ek0(kb4Var, ji0Var6, 5);
                        dd4Var8.p0(objQ8);
                    }
                    fz1.r(ji0Var6, ou6VarA6, (ib4) objQ8, dd4Var8, 0);
                    dd4Var8.q(false);
                }
                break;
            case 8:
                dr5 dr5Var3 = (dr5) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                dd4 dd4Var9 = (dd4) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                int i10 = (iIntValue18 & 6) == 0 ? iIntValue18 | (dd4Var9.f(dr5Var3) ? 4 : 2) : iIntValue18;
                if ((iIntValue18 & 48) == 0) {
                    i10 |= dd4Var9.d(iIntValue17) ? 32 : 16;
                }
                if (!dd4Var9.V(i10 & 1, (i10 & Token.EXPR_VOID) != 146)) {
                    dd4Var9.Y();
                } else {
                    wl5 wl5Var = (wl5) list.get(iIntValue17);
                    dd4Var9.f0(-1504321314);
                    ou6 ou6VarL = fe.L(gjb.m0(tg9.f(lu6Var, 1.0f), 12.0f, 4.0f), dd1.g(s00.o(dd4Var9), 2.0f), s00.p(dd4Var9).c);
                    boolean zF9 = dd4Var9.f(kb4Var) | dd4Var9.f(wl5Var);
                    Object objQ9 = dd4Var9.Q();
                    if (zF9 || objQ9 == obj5) {
                        objQ9 = new e7(18, kb4Var, wl5Var);
                        dd4Var9.p0(objQ9);
                    }
                    ou6 ou6VarM0 = gjb.m0(fw.J(null, (ib4) objQ9, ou6VarL, false, 15), 16.0f, 12.0f);
                    eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var9, 0);
                    int iHashCode = Long.hashCode(dd4Var9.T);
                    lr7 lr7VarL = dd4Var9.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var9, ou6VarM0);
                    ml1.k.getClass();
                    um1 um1Var = ll1.b;
                    dd4Var9.j0();
                    if (dd4Var9.S) {
                        dd4Var9.k(um1Var);
                    } else {
                        dd4Var9.s0();
                    }
                    jm jmVar = ll1.f;
                    un9.s(jmVar, dd4Var9, eq8VarA);
                    jm jmVar2 = ll1.e;
                    un9.s(jmVar2, dd4Var9, lr7VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    jm jmVar3 = ll1.g;
                    un9.s(jmVar3, dd4Var9, numValueOf);
                    kd kdVar = ll1.h;
                    un9.r(dd4Var9, kdVar);
                    jm jmVar4 = ll1.d;
                    bp5 bp5VarG = ky0.g(dd4Var9, ou6VarL0, jmVar4, 1.0f, true);
                    ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var9, 0);
                    int iHashCode2 = Long.hashCode(dd4Var9.T);
                    lr7 lr7VarL2 = dd4Var9.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var9, bp5VarG);
                    dd4Var9.j0();
                    if (dd4Var9.S) {
                        dd4Var9.k(um1Var);
                    } else {
                        dd4Var9.s0();
                    }
                    un9.s(jmVar, dd4Var9, ie1VarA);
                    un9.s(jmVar2, dd4Var9, lr7VarL2);
                    ky0.v(iHashCode2, dd4Var9, jmVar3, dd4Var9, kdVar);
                    un9.s(jmVar4, dd4Var9, ou6VarL02);
                    String str16 = wl5Var.b;
                    String str17 = wl5Var.a;
                    nha.c(str16, tg9.f(lu6Var, 1.0f), s00.o(dd4Var9).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var9).j, dd4Var9, 48, 0, 131064);
                    un9.a(dd4Var9, tg9.r(lu6Var, 4.0f));
                    Locale locale = Locale.ROOT;
                    String upperCase = str17.toUpperCase(locale);
                    upperCase.getClass();
                    nha.c(upperCase, (ou6) null, lc1.c(0.65f, s00.o(dd4Var9).q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var9).k, dd4Var9, 0, 0, 131066);
                    ky0.A(dd4Var9, true, lu6Var, 12.0f, dd4Var9);
                    String upperCase2 = str17.toUpperCase(locale);
                    upperCase2.getClass();
                    nha.c(upperCase2, gjb.m0(fe.L(lu6Var, lc1.c(0.12f, s00.o(dd4Var9).a), tp8.a), 10.0f, 6.0f), s00.o(dd4Var9).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var9).n, dd4Var9, 0, 0, 131064);
                    dd4Var9.q(true);
                    dd4Var9.q(false);
                }
                break;
            default:
                dr5 dr5Var4 = (dr5) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                dd4 dd4Var10 = (dd4) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                int i11 = (iIntValue20 & 6) == 0 ? iIntValue20 | (dd4Var10.f(dr5Var4) ? 4 : 2) : iIntValue20;
                if ((iIntValue20 & 48) == 0) {
                    i11 |= dd4Var10.d(iIntValue19) ? 32 : 16;
                }
                if (!dd4Var10.V(i11 & 1, (i11 & Token.EXPR_VOID) != 146)) {
                    dd4Var10.Y();
                } else {
                    h0a h0aVar = (h0a) list.get(iIntValue19);
                    dd4Var10.f0(2123158935);
                    String str18 = h0aVar.a;
                    String str19 = h0aVar.b;
                    String str20 = h0aVar.d;
                    String str21 = h0aVar.e;
                    String str22 = h0aVar.c;
                    ou6 ou6VarA7 = dr5.a(dr5Var4, tg9.u(tg9.r(lu6Var, 120.0f)));
                    boolean zF10 = dd4Var10.f(kb4Var) | dd4Var10.h(h0aVar);
                    Object objQ10 = dd4Var10.Q();
                    if (zF10 || objQ10 == obj5) {
                        objQ10 = new e7(26, kb4Var, h0aVar);
                        dd4Var10.p0(objQ10);
                    }
                    fz1.j(str18, str19, str20, str21, str22, ou6VarA7, (ib4) objQ10, dd4Var10, 0);
                    dd4Var10.q(false);
                }
                break;
        }
        return hebVar;
    }
}

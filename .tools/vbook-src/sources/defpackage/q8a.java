package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class q8a implements zb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ jj4 e;
    public final /* synthetic */ m53[] f;
    public final /* synthetic */ m53[] s;

    public /* synthetic */ q8a(List list, int i, kb4 kb4Var, jj4 jj4Var, m53[] m53VarArr, m53[] m53VarArr2, int i2) {
        this.a = i2;
        this.b = list;
        this.c = i;
        this.d = kb4Var;
        this.e = jj4Var;
        this.f = m53VarArr;
        this.s = m53VarArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = vl1.a;
        final jj4 jj4Var = this.e;
        final kb4 kb4Var = this.d;
        int i2 = this.c;
        heb hebVar = heb.a;
        final int i3 = 1;
        final int i4 = 0;
        switch (i) {
            case 0:
                co0 co0Var = (co0) obj;
                dd4 dd4Var = (dd4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                co0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= dd4Var.f(co0Var) ? 4 : 2;
                }
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 19) != 18)) {
                    dd4Var.Y();
                } else {
                    ww8 ww8VarJ = kc5.J(dd4Var);
                    lu6 lu6Var = lu6.a;
                    ou6 ou6VarQ = kc5.Q(lu6Var, ww8VarJ, 14);
                    xf0 xf0Var = bv4.e;
                    zn0 zn0Var = zn0.a;
                    d47.a(zn0Var.a(ou6VarQ, xf0Var), lc1.i, dd1.b(((q96) dd4Var.j(s96.a)).a.p, dd4Var), new tz3(), jf0.G(1882372649, new q8a(this.b, this.c, this.d, this.e, this.f, this.s, 2), dd4Var), dd4Var, 196656);
                    if (x13.b(co0Var.c(), 336.0f) < 0) {
                        dd4Var.f0(-1304495919);
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(-1304791907);
                        i12.h(i25.a((m53) f53.z.getValue(), dd4Var), "", zn0Var.a(tg9.n(gjb.l0(lu6Var, 10.0f), 36.0f), bv4.c), dd4Var, 48, 248);
                        dd4Var.q(false);
                    }
                }
                break;
            case 1:
                fq8 fq8Var = (fq8) obj;
                dd4 dd4Var2 = (dd4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                fq8Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= dd4Var2.f(fq8Var) ? 4 : 2;
                }
                if (!dd4Var2.V(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    dd4Var2.Y();
                } else {
                    List list = this.b;
                    int size = list.size();
                    final int i5 = 0;
                    while (i5 < size) {
                        final boolean z = i2 == i5 ? 1 : i4;
                        boolean zF = dd4Var2.f(kb4Var) | dd4Var2.d(i5) | dd4Var2.h(jj4Var);
                        Object objQ = dd4Var2.Q();
                        if (zF || objQ == obj4) {
                            objQ = new ib4() { // from class: s8a
                                @Override // defpackage.ib4
                                public final Object invoke() {
                                    int i6 = i4;
                                    heb hebVar2 = heb.a;
                                    yt7 yt7Var = jj4Var;
                                    int i7 = i5;
                                    kb4 kb4Var2 = kb4Var;
                                    switch (i6) {
                                        case 0:
                                            kb4Var2.invoke(Integer.valueOf(i7));
                                            yt7Var.a(0);
                                            break;
                                        default:
                                            kb4Var2.invoke(Integer.valueOf(i7));
                                            yt7Var.a(0);
                                            break;
                                    }
                                    return hebVar2;
                                }
                            };
                            dd4Var2.p0(objQ);
                        }
                        ib4 ib4Var = (ib4) objQ;
                        final int i6 = 0;
                        final m53[] m53VarArr = this.f;
                        final m53[] m53VarArr2 = this.s;
                        final List list2 = list;
                        final int i7 = i5;
                        t1c.a(fq8Var, z, ib4Var, jf0.G(-951551459, new yb4() { // from class: t8a
                            @Override // defpackage.yb4
                            public final Object invoke(Object obj5, Object obj6) {
                                int i8 = i6;
                                heb hebVar2 = heb.a;
                                Object obj7 = vl1.a;
                                boolean z2 = z;
                                switch (i8) {
                                    case 0:
                                        dd4 dd4Var3 = (dd4) obj5;
                                        int iIntValue3 = ((Integer) obj6).intValue();
                                        if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                            dd4Var3.Y();
                                        } else {
                                            Boolean boolValueOf = Boolean.valueOf(z2);
                                            Object objQ2 = dd4Var3.Q();
                                            if (objQ2 == obj7) {
                                                objQ2 = new h1a(5);
                                                dd4Var3.p0(objQ2);
                                            }
                                            final int i9 = 0;
                                            final m53[] m53VarArr3 = m53VarArr;
                                            final int i10 = i7;
                                            final m53[] m53VarArr4 = m53VarArr2;
                                            final List list3 = list2;
                                            t96.b(boolValueOf, null, (kb4) objQ2, null, null, null, jf0.G(1176842016, new ac4() { // from class: r8a
                                                @Override // defpackage.ac4
                                                public final Object g(Object obj8, Object obj9, Object obj10, Object obj11) {
                                                    int i11 = i9;
                                                    heb hebVar3 = heb.a;
                                                    lu6 lu6Var2 = lu6.a;
                                                    List list4 = list3;
                                                    m53[] m53VarArr5 = m53VarArr4;
                                                    int i12 = i10;
                                                    m53[] m53VarArr6 = m53VarArr3;
                                                    switch (i11) {
                                                        case 0:
                                                            boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                                                            dd4 dd4Var4 = (dd4) obj10;
                                                            ((Integer) obj11).getClass();
                                                            ((in) obj8).getClass();
                                                            mx4.a(i25.c(zBooleanValue ? m53VarArr6[i12] : m53VarArr5[i12], dd4Var4, 0), (String) list4.get(i12), tg9.n(lu6Var2, 24.0f), 0L, dd4Var4, 384, 8);
                                                            break;
                                                        default:
                                                            boolean zBooleanValue2 = ((Boolean) obj9).booleanValue();
                                                            dd4 dd4Var5 = (dd4) obj10;
                                                            ((Integer) obj11).getClass();
                                                            ((in) obj8).getClass();
                                                            mx4.a(i25.c(zBooleanValue2 ? m53VarArr6[i12] : m53VarArr5[i12], dd4Var5, 0), (String) list4.get(i12), tg9.n(lu6Var2, 24.0f), 0L, dd4Var5, 384, 8);
                                                            break;
                                                    }
                                                    return hebVar3;
                                                }
                                            }, dd4Var3), dd4Var3, 1573248, 58);
                                        }
                                        break;
                                    default:
                                        dd4 dd4Var4 = (dd4) obj5;
                                        int iIntValue4 = ((Integer) obj6).intValue();
                                        if (!dd4Var4.V(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                            dd4Var4.Y();
                                        } else {
                                            Boolean boolValueOf2 = Boolean.valueOf(z2);
                                            Object objQ3 = dd4Var4.Q();
                                            if (objQ3 == obj7) {
                                                objQ3 = new h1a(6);
                                                dd4Var4.p0(objQ3);
                                            }
                                            kb4 kb4Var2 = (kb4) objQ3;
                                            final int i11 = 1;
                                            final m53[] m53VarArr5 = m53VarArr;
                                            final int i12 = i7;
                                            final m53[] m53VarArr6 = m53VarArr2;
                                            final List list4 = list2;
                                            t96.b(boolValueOf2, null, kb4Var2, null, null, null, jf0.G(-573613668, new ac4() { // from class: r8a
                                                @Override // defpackage.ac4
                                                public final Object g(Object obj8, Object obj9, Object obj10, Object obj11) {
                                                    int i112 = i11;
                                                    heb hebVar3 = heb.a;
                                                    lu6 lu6Var2 = lu6.a;
                                                    List list42 = list4;
                                                    m53[] m53VarArr52 = m53VarArr6;
                                                    int i122 = i12;
                                                    m53[] m53VarArr62 = m53VarArr5;
                                                    switch (i112) {
                                                        case 0:
                                                            boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                                                            dd4 dd4Var42 = (dd4) obj10;
                                                            ((Integer) obj11).getClass();
                                                            ((in) obj8).getClass();
                                                            mx4.a(i25.c(zBooleanValue ? m53VarArr62[i122] : m53VarArr52[i122], dd4Var42, 0), (String) list42.get(i122), tg9.n(lu6Var2, 24.0f), 0L, dd4Var42, 384, 8);
                                                            break;
                                                        default:
                                                            boolean zBooleanValue2 = ((Boolean) obj9).booleanValue();
                                                            dd4 dd4Var5 = (dd4) obj10;
                                                            ((Integer) obj11).getClass();
                                                            ((in) obj8).getClass();
                                                            mx4.a(i25.c(zBooleanValue2 ? m53VarArr62[i122] : m53VarArr52[i122], dd4Var5, 0), (String) list42.get(i122), tg9.n(lu6Var2, 24.0f), 0L, dd4Var5, 384, 8);
                                                            break;
                                                    }
                                                    return hebVar3;
                                                }
                                            }, dd4Var4), dd4Var4, 1573248, 58);
                                        }
                                        break;
                                }
                                return hebVar2;
                            }
                        }, dd4Var2), null, false, jf0.G(-914556256, new sz4(list2, i7, 8), dd4Var2), dd4Var2, (iIntValue2 & 14) | 1575936);
                        i5 = i7 + 1;
                        list = list2;
                        i4 = 0;
                    }
                }
                break;
            default:
                dd4 dd4Var3 = (dd4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ke1) obj).getClass();
                if (!dd4Var3.V(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    dd4Var3.Y();
                } else {
                    List list3 = this.b;
                    int size2 = list3.size();
                    final int i8 = 0;
                    while (i8 < size2) {
                        int i9 = i2 == i8 ? i3 : 0;
                        boolean zF2 = dd4Var3.f(kb4Var) | dd4Var3.d(i8) | dd4Var3.h(jj4Var);
                        Object objQ2 = dd4Var3.Q();
                        if (zF2 || objQ2 == obj4) {
                            objQ2 = new ib4() { // from class: s8a
                                @Override // defpackage.ib4
                                public final Object invoke() {
                                    int i62 = i3;
                                    heb hebVar2 = heb.a;
                                    yt7 yt7Var = jj4Var;
                                    int i72 = i8;
                                    kb4 kb4Var2 = kb4Var;
                                    switch (i62) {
                                        case 0:
                                            kb4Var2.invoke(Integer.valueOf(i72));
                                            yt7Var.a(0);
                                            break;
                                        default:
                                            kb4Var2.invoke(Integer.valueOf(i72));
                                            yt7Var.a(0);
                                            break;
                                    }
                                    return hebVar2;
                                }
                            };
                            dd4Var3.p0(objQ2);
                        }
                        ib4 ib4Var2 = (ib4) objQ2;
                        mx5 mx5Var = (mx5) dd4Var3.j(r26.a);
                        boolean zH = dd4Var3.h(mx5Var) | dd4Var3.f(ib4Var2);
                        int i10 = i3;
                        Object objQ3 = dd4Var3.Q();
                        if (zH || objQ3 == obj4) {
                            objQ3 = new y6(mx5Var, ib4Var2);
                            dd4Var3.p0(objQ3);
                        }
                        final boolean z2 = i9;
                        final int i11 = 1;
                        final m53[] m53VarArr3 = this.f;
                        final m53[] m53VarArr4 = this.s;
                        final List list4 = list3;
                        final int i12 = i8;
                        dd4 dd4Var4 = dd4Var3;
                        d47.b(z2, (ib4) objQ3, jf0.G(-1701673601, new yb4() { // from class: t8a
                            @Override // defpackage.yb4
                            public final Object invoke(Object obj5, Object obj6) {
                                int i82 = i11;
                                heb hebVar2 = heb.a;
                                Object obj7 = vl1.a;
                                boolean z22 = z2;
                                switch (i82) {
                                    case 0:
                                        dd4 dd4Var32 = (dd4) obj5;
                                        int iIntValue32 = ((Integer) obj6).intValue();
                                        if (!dd4Var32.V(iIntValue32 & 1, (iIntValue32 & 3) != 2)) {
                                            dd4Var32.Y();
                                        } else {
                                            Boolean boolValueOf = Boolean.valueOf(z22);
                                            Object objQ22 = dd4Var32.Q();
                                            if (objQ22 == obj7) {
                                                objQ22 = new h1a(5);
                                                dd4Var32.p0(objQ22);
                                            }
                                            final int i92 = 0;
                                            final m53[] m53VarArr32 = m53VarArr3;
                                            final int i102 = i12;
                                            final m53[] m53VarArr42 = m53VarArr4;
                                            final List list32 = list4;
                                            t96.b(boolValueOf, null, (kb4) objQ22, null, null, null, jf0.G(1176842016, new ac4() { // from class: r8a
                                                @Override // defpackage.ac4
                                                public final Object g(Object obj8, Object obj9, Object obj10, Object obj11) {
                                                    int i112 = i92;
                                                    heb hebVar3 = heb.a;
                                                    lu6 lu6Var2 = lu6.a;
                                                    List list42 = list32;
                                                    m53[] m53VarArr52 = m53VarArr42;
                                                    int i122 = i102;
                                                    m53[] m53VarArr62 = m53VarArr32;
                                                    switch (i112) {
                                                        case 0:
                                                            boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                                                            dd4 dd4Var42 = (dd4) obj10;
                                                            ((Integer) obj11).getClass();
                                                            ((in) obj8).getClass();
                                                            mx4.a(i25.c(zBooleanValue ? m53VarArr62[i122] : m53VarArr52[i122], dd4Var42, 0), (String) list42.get(i122), tg9.n(lu6Var2, 24.0f), 0L, dd4Var42, 384, 8);
                                                            break;
                                                        default:
                                                            boolean zBooleanValue2 = ((Boolean) obj9).booleanValue();
                                                            dd4 dd4Var5 = (dd4) obj10;
                                                            ((Integer) obj11).getClass();
                                                            ((in) obj8).getClass();
                                                            mx4.a(i25.c(zBooleanValue2 ? m53VarArr62[i122] : m53VarArr52[i122], dd4Var5, 0), (String) list42.get(i122), tg9.n(lu6Var2, 24.0f), 0L, dd4Var5, 384, 8);
                                                            break;
                                                    }
                                                    return hebVar3;
                                                }
                                            }, dd4Var32), dd4Var32, 1573248, 58);
                                        }
                                        break;
                                    default:
                                        dd4 dd4Var42 = (dd4) obj5;
                                        int iIntValue4 = ((Integer) obj6).intValue();
                                        if (!dd4Var42.V(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                                            dd4Var42.Y();
                                        } else {
                                            Boolean boolValueOf2 = Boolean.valueOf(z22);
                                            Object objQ32 = dd4Var42.Q();
                                            if (objQ32 == obj7) {
                                                objQ32 = new h1a(6);
                                                dd4Var42.p0(objQ32);
                                            }
                                            kb4 kb4Var2 = (kb4) objQ32;
                                            final int i112 = 1;
                                            final m53[] m53VarArr5 = m53VarArr3;
                                            final int i122 = i12;
                                            final m53[] m53VarArr6 = m53VarArr4;
                                            final List list42 = list4;
                                            t96.b(boolValueOf2, null, kb4Var2, null, null, null, jf0.G(-573613668, new ac4() { // from class: r8a
                                                @Override // defpackage.ac4
                                                public final Object g(Object obj8, Object obj9, Object obj10, Object obj11) {
                                                    int i1122 = i112;
                                                    heb hebVar3 = heb.a;
                                                    lu6 lu6Var2 = lu6.a;
                                                    List list422 = list42;
                                                    m53[] m53VarArr52 = m53VarArr6;
                                                    int i1222 = i122;
                                                    m53[] m53VarArr62 = m53VarArr5;
                                                    switch (i1122) {
                                                        case 0:
                                                            boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                                                            dd4 dd4Var422 = (dd4) obj10;
                                                            ((Integer) obj11).getClass();
                                                            ((in) obj8).getClass();
                                                            mx4.a(i25.c(zBooleanValue ? m53VarArr62[i1222] : m53VarArr52[i1222], dd4Var422, 0), (String) list422.get(i1222), tg9.n(lu6Var2, 24.0f), 0L, dd4Var422, 384, 8);
                                                            break;
                                                        default:
                                                            boolean zBooleanValue2 = ((Boolean) obj9).booleanValue();
                                                            dd4 dd4Var5 = (dd4) obj10;
                                                            ((Integer) obj11).getClass();
                                                            ((in) obj8).getClass();
                                                            mx4.a(i25.c(zBooleanValue2 ? m53VarArr62[i1222] : m53VarArr52[i1222], dd4Var5, 0), (String) list422.get(i1222), tg9.n(lu6Var2, 24.0f), 0L, dd4Var5, 384, 8);
                                                            break;
                                                    }
                                                    return hebVar3;
                                                }
                                            }, dd4Var42), dd4Var42, 1573248, 58);
                                        }
                                        break;
                                }
                                return hebVar2;
                            }
                        }, dd4Var3), null, false, false, null, dd4Var4, 384);
                        i8 = i12 + 1;
                        list3 = list4;
                        dd4Var3 = dd4Var4;
                        i3 = i10;
                    }
                }
                break;
        }
        return hebVar;
    }
}

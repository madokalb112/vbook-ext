package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yfa implements ha6 {
    public final float a;
    public final pj7 b;

    public yfa(float f, pj7 pj7Var) {
        this.a = f;
        this.b = pj7Var;
    }

    public static int c(int i, yb4 yb4Var, List list) {
        Object next;
        Object obj;
        Object next2;
        Object next3;
        Object next4;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                so9.n("Collection contains no element matching the predicate.");
                return 0;
            }
            next = it.next();
        } while (!lc5.Q(do8.b((ca6) next), "TextField"));
        int iIntValue = ((Number) yb4Var.invoke(next, Integer.valueOf(i))).intValue();
        Iterator it2 = list.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (lc5.Q(do8.b((ca6) next2), "Label")) {
                break;
            }
        }
        ca6 ca6Var = (ca6) next2;
        int iIntValue2 = ca6Var != null ? ((Number) yb4Var.invoke(ca6Var, Integer.valueOf(i))).intValue() : 0;
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            if (lc5.Q(do8.b((ca6) next3), "Trailing")) {
                break;
            }
        }
        ca6 ca6Var2 = (ca6) next3;
        int iIntValue3 = ca6Var2 != null ? ((Number) yb4Var.invoke(ca6Var2, Integer.valueOf(i))).intValue() : 0;
        Iterator it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it4.next();
            if (lc5.Q(do8.b((ca6) next4), "Leading")) {
                break;
            }
        }
        ca6 ca6Var3 = (ca6) next4;
        int iIntValue4 = ca6Var3 != null ? ((Number) yb4Var.invoke(ca6Var3, Integer.valueOf(i))).intValue() : 0;
        Iterator it5 = list.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            Object next5 = it5.next();
            if (lc5.Q(do8.b((ca6) next5), "Hint")) {
                obj = next5;
                break;
            }
        }
        ca6 ca6Var4 = (ca6) obj;
        return Math.max(Math.max(iIntValue, Math.max(iIntValue2, ca6Var4 != null ? ((Number) yb4Var.invoke(ca6Var4, Integer.valueOf(i))).intValue() : 0)) + iIntValue4 + iIntValue3, up1.k(do8.a));
    }

    public final int a(dc5 dc5Var, List list, int i) {
        dc5Var.getClass();
        return c(i, new vw8(10, (byte) 0), list);
    }

    public final int b(dc5 dc5Var, List list, int i, yb4 yb4Var) {
        Object next;
        Object obj;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                so9.n("Collection contains no element matching the predicate.");
                return 0;
            }
            next = it.next();
        } while (!lc5.Q(do8.b((ca6) next), "TextField"));
        int iIntValue = ((Number) yb4Var.invoke(next, Integer.valueOf(i))).intValue();
        Iterator it2 = list.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (lc5.Q(do8.b((ca6) next2), "Label")) {
                break;
            }
        }
        ca6 ca6Var = (ca6) next2;
        int iIntValue2 = ca6Var != null ? ((Number) yb4Var.invoke(ca6Var, Integer.valueOf(i))).intValue() : 0;
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            if (lc5.Q(do8.b((ca6) next3), "Trailing")) {
                break;
            }
        }
        ca6 ca6Var2 = (ca6) next3;
        int iIntValue3 = ca6Var2 != null ? ((Number) yb4Var.invoke(ca6Var2, Integer.valueOf(i))).intValue() : 0;
        Iterator it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it4.next();
            if (lc5.Q(do8.b((ca6) next4), "Leading")) {
                break;
            }
        }
        ca6 ca6Var3 = (ca6) next4;
        int iIntValue4 = ca6Var3 != null ? ((Number) yb4Var.invoke(ca6Var3, Integer.valueOf(i))).intValue() : 0;
        Iterator it5 = list.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next5 = null;
                break;
            }
            next5 = it5.next();
            if (lc5.Q(do8.b((ca6) next5), "Hint")) {
                break;
            }
        }
        ca6 ca6Var4 = (ca6) next5;
        int iIntValue5 = ca6Var4 != null ? ((Number) yb4Var.invoke(ca6Var4, Integer.valueOf(i))).intValue() : 0;
        Iterator it6 = list.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next6 = it6.next();
            if (lc5.Q(do8.b((ca6) next6), "Supporting")) {
                obj = next6;
                break;
            }
        }
        ca6 ca6Var5 = (ca6) obj;
        return y86.q(iIntValue, iIntValue2 > 0, iIntValue2, iIntValue4, iIntValue3, iIntValue5, ca6Var5 != null ? ((Number) yb4Var.invoke(ca6Var5, Integer.valueOf(i))).intValue() : 0, do8.a, dc5Var.b(), this.b);
    }

    public final ia6 d(ja6 ja6Var, List list, long j) {
        Object next;
        ia6 ia6Var;
        Object next2;
        pj7 pj7Var;
        ia6 ia6VarC;
        int i;
        Object next3;
        int iZ;
        Object obj;
        Object next4;
        int i2;
        ia6 ia6VarC2;
        ja6Var.getClass();
        list.getClass();
        final yfa yfaVar = this;
        pj7 pj7Var2 = yfaVar.b;
        int iW0 = ja6Var.w0(pj7Var2.d());
        int iW02 = ja6Var.w0(pj7Var2.a());
        final int iW03 = ja6Var.w0(4.0f);
        long jB = up1.b(j, 0, 0, 0, 0, 10);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (lc5.Q(h67.t0((ca6) next), "Leading")) {
                break;
            }
        }
        ca6 ca6Var = (ca6) next;
        jt7 jt7VarC = ca6Var != null ? ca6Var.C(jB) : null;
        float f = do8.b;
        int i3 = jt7VarC != null ? jt7VarC.a : 0;
        int iMax = Math.max(0, jt7VarC != null ? jt7VarC.b : 0);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                ia6Var = null;
                next2 = null;
                break;
            }
            next2 = it2.next();
            ia6Var = null;
            if (lc5.Q(h67.t0((ca6) next2), "Trailing")) {
                break;
            }
        }
        ca6 ca6Var2 = (ca6) next2;
        if (ca6Var2 != null) {
            pj7Var = pj7Var2;
            ia6VarC = ca6Var2.C(vp1.j(-i3, 0, 2, jB));
        } else {
            pj7Var = pj7Var2;
            ia6VarC = ia6Var;
        }
        int i4 = i3 + (ia6VarC != null ? ((jt7) ia6VarC).a : 0);
        int iMax2 = Math.max(iMax, ia6VarC != null ? ((jt7) ia6VarC).b : 0);
        int i5 = -i4;
        long jI = vp1.i(i5, -iW02, jB);
        Iterator it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                i = iW02;
                next3 = ia6Var;
                break;
            }
            next3 = it3.next();
            i = iW02;
            if (lc5.Q(h67.t0((ca6) next3), "Label")) {
                break;
            }
            iW02 = i;
        }
        ca6 ca6Var3 = (ca6) next3;
        ia6 ia6VarC3 = ca6Var3 != null ? ca6Var3.C(jI) : ia6Var;
        if (ia6VarC3 != null) {
            iZ = ia6VarC3.Z(j9.b);
            if (iZ == Integer.MIN_VALUE) {
                iZ = ((jt7) ia6VarC3).b;
            }
        } else {
            iZ = 0;
        }
        final int iMax3 = Math.max(iZ, iW0);
        int i6 = ia6VarC3 != null ? iMax3 + iW03 : iW0;
        int i7 = i6;
        long jI2 = vp1.i(i5, (-i6) - i, up1.b(j, 0, 0, 0, 0, 11));
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            ca6 ca6Var4 = (ca6) it4.next();
            final int i8 = iZ;
            Iterator it5 = it4;
            if (lc5.Q(h67.t0(ca6Var4), "TextField")) {
                final jt7 jt7VarC2 = ca6Var4.C(jI2);
                long jB2 = up1.b(jI2, 0, 0, 0, 0, 14);
                Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = ia6Var;
                        break;
                    }
                    Object next5 = it6.next();
                    Iterator it7 = it6;
                    if (lc5.Q(h67.t0((ca6) next5), "Hint")) {
                        obj = next5;
                        break;
                    }
                    it6 = it7;
                }
                ca6 ca6Var5 = (ca6) obj;
                ia6 ia6VarC4 = ca6Var5 != null ? ca6Var5.C(jB2) : ia6Var;
                long jB3 = up1.b(vp1.j(0, -Math.max(iMax2, Math.max(jt7VarC2.b, ia6VarC4 != null ? ((jt7) ia6VarC4).b : 0) + i7 + i), 1, jB), 0, 0, 0, 0, 11);
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next4 = ia6Var;
                        break;
                    }
                    next4 = it8.next();
                    if (lc5.Q(h67.t0((ca6) next4), "Supporting")) {
                        break;
                    }
                }
                ca6 ca6Var6 = (ca6) next4;
                if (ca6Var6 != null) {
                    i2 = iW0;
                    ia6VarC2 = ca6Var6.C(jB3);
                } else {
                    i2 = iW0;
                    ia6VarC2 = ia6Var;
                }
                int i9 = ia6VarC2 != null ? ((jt7) ia6VarC2).b : 0;
                final int iMax4 = Math.max(Math.max(jt7VarC2.a, Math.max(ia6VarC3 != null ? ((jt7) ia6VarC3).a : 0, ia6VarC4 != null ? ((jt7) ia6VarC4).a : 0)) + (jt7VarC != null ? jt7VarC.a : 0) + (ia6VarC != null ? ((jt7) ia6VarC).a : 0), up1.k(j));
                final ia6 ia6Var2 = ia6VarC3;
                int i10 = jt7VarC2.b;
                boolean z = ia6Var2 != null;
                int i11 = jt7VarC != null ? jt7VarC.b : 0;
                int i12 = ia6VarC != null ? ((jt7) ia6VarC).b : 0;
                final ia6 ia6Var3 = ia6VarC4;
                final ia6 ia6Var4 = ia6VarC2;
                pj7 pj7Var3 = pj7Var;
                final jt7 jt7Var = jt7VarC;
                final ia6 ia6Var5 = ia6VarC;
                final int iQ = y86.q(i10, z, iMax3, i11, i12, ia6VarC4 != null ? ((jt7) ia6VarC4).b : 0, ia6VarC2 != null ? ((jt7) ia6VarC2).b : 0, j, ja6Var.b(), pj7Var3);
                int i13 = iQ - i9;
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    ca6 ca6Var7 = (ca6) it9.next();
                    if (lc5.Q(h67.t0(ca6Var7), "Container")) {
                        final jt7 jt7VarC3 = ca6Var7.C(vp1.a(iMax4 != Integer.MAX_VALUE ? iMax4 : 0, iMax4, i13 != Integer.MAX_VALUE ? i13 : 0, i13));
                        final int i14 = i2;
                        return ja6Var.R(iMax4, iQ, mc3.a, new kb4() { // from class: xfa
                            @Override // defpackage.kb4
                            public final Object invoke(Object obj2) {
                                it7 it7Var = (it7) obj2;
                                it7Var.getClass();
                                jt7 jt7Var2 = ia6Var2;
                                int i15 = iMax4;
                                int i16 = iQ;
                                jt7 jt7Var3 = jt7VarC2;
                                jt7 jt7Var4 = ia6Var3;
                                jt7 jt7Var5 = jt7Var;
                                jt7 jt7Var6 = ia6Var5;
                                jt7 jt7Var7 = jt7VarC3;
                                jt7 jt7Var8 = ia6Var4;
                                yfa yfaVar2 = yfaVar;
                                if (jt7Var2 != null) {
                                    int i17 = i14 - i8;
                                    if (i17 < 0) {
                                        i17 = 0;
                                    }
                                    int i18 = iMax3 + iW03;
                                    float f2 = yfaVar2.a;
                                    float fB = it7Var.b();
                                    it7.l(it7Var, jt7Var7, 0L);
                                    float f3 = do8.b;
                                    int i19 = i16 - (jt7Var8 != null ? jt7Var8.b : 0);
                                    if (jt7Var5 != null) {
                                        it7.n(it7Var, jt7Var5, 0, Math.round(((i19 - jt7Var5.b) / 2.0f) * 1.0f));
                                    }
                                    if (jt7Var6 != null) {
                                        it7.n(it7Var, jt7Var6, i15 - jt7Var6.a, Math.round(((i19 - jt7Var6.b) / 2.0f) * 1.0f));
                                    }
                                    it7.n(it7Var, jt7Var2, jt7Var5 != null ? jt7Var5.a : 0, t96.M(do8.b * fB) - t96.M((r2 - i17) * f2));
                                    it7.n(it7Var, jt7Var3, jt7Var5 != null ? jt7Var5.a : 0, i18);
                                    if (jt7Var4 != null) {
                                        it7.n(it7Var, jt7Var4, jt7Var5 != null ? jt7Var5.a : 0, i18);
                                    }
                                    if (jt7Var8 != null) {
                                        it7.n(it7Var, jt7Var8, 0, i19);
                                    }
                                } else {
                                    float fB2 = it7Var.b();
                                    pj7 pj7Var4 = yfaVar2.b;
                                    it7.l(it7Var, jt7Var7, 0L);
                                    float f4 = do8.b;
                                    int i20 = i16 - (jt7Var8 != null ? jt7Var8.b : 0);
                                    int iM = t96.M(pj7Var4.d() * fB2);
                                    if (jt7Var5 != null) {
                                        it7.n(it7Var, jt7Var5, 0, Math.round(((i20 - jt7Var5.b) / 2.0f) * 1.0f));
                                    }
                                    if (jt7Var6 != null) {
                                        it7.n(it7Var, jt7Var6, i15 - jt7Var6.a, Math.round(((i20 - jt7Var6.b) / 2.0f) * 1.0f));
                                    }
                                    it7.n(it7Var, jt7Var3, jt7Var5 != null ? jt7Var5.a : 0, iM);
                                    if (jt7Var4 != null) {
                                        it7.n(it7Var, jt7Var4, jt7Var5 != null ? jt7Var5.a : 0, iM);
                                    }
                                    if (jt7Var8 != null) {
                                        it7.n(it7Var, jt7Var8, 0, i20);
                                    }
                                }
                                return heb.a;
                            }
                        });
                    }
                    yfaVar = this;
                }
                so9.n("Collection contains no element matching the predicate.");
                return ia6Var;
            }
            yfaVar = this;
            it4 = it5;
            iZ = i8;
            pj7Var = pj7Var;
        }
        so9.n("Collection contains no element matching the predicate.");
        return ia6Var;
    }

    public final int e(dc5 dc5Var, List list, int i) {
        dc5Var.getClass();
        return c(i, new vw8(12, (byte) 0), list);
    }

    public final int g(dc5 dc5Var, List list, int i) {
        dc5Var.getClass();
        return b(dc5Var, list, i, new vw8(11, (byte) 0));
    }

    public final int i(dc5 dc5Var, List list, int i) {
        dc5Var.getClass();
        return b(dc5Var, list, i, new vw8(13, (byte) 0));
    }
}

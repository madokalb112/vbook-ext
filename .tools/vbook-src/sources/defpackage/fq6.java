package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class fq6 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ub4 e;
    public final /* synthetic */ ub4 f;

    public /* synthetic */ fq6(float f, int i, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, int i2) {
        this.b = f;
        this.c = i;
        this.d = ou6Var;
        this.e = kb4Var;
        this.f = kb4Var2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        ub4 ub4Var = this.f;
        ub4 ub4Var2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                gjb.F(this.b, this.c, (ou6) obj3, (kb4) ub4Var2, (kb4) ub4Var, (dd4) obj, qu1.x0(385));
                break;
            default:
                final rj1 rj1Var = (rj1) obj3;
                final yb4 yb4Var = (yb4) ub4Var2;
                final rj1 rj1Var2 = (rj1) ub4Var;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    ww8 ww8VarJ = kc5.J(dd4Var);
                    Object objQ = dd4Var.Q();
                    Object obj4 = vl1.a;
                    if (objQ == obj4) {
                        objQ = lc5.Z(dd4Var);
                        dd4Var.p0(objQ);
                    }
                    vx1 vx1Var = (vx1) objQ;
                    boolean zF = dd4Var.f(ww8VarJ) | dd4Var.f(vx1Var);
                    Object objQ2 = dd4Var.Q();
                    if (zF || objQ2 == obj4) {
                        objQ2 = new kx8(ww8VarJ, vx1Var);
                        dd4Var.p0(objQ2);
                    }
                    final kx8 kx8Var = (kx8) objQ2;
                    ou6 ou6VarX = t96.x(a29.c(kc5.A(tg9.v(tg9.f(lu6.a, 1.0f), bv4.e), ww8VarJ, 14), false, new ax8(2)));
                    final float f = this.b;
                    boolean zC = dd4Var.c(f) | dd4Var.f(rj1Var) | dd4Var.f(yb4Var) | dd4Var.f(rj1Var2) | dd4Var.h(kx8Var);
                    final int i2 = this.c;
                    boolean zD = dd4Var.d(i2) | zC;
                    Object objQ3 = dd4Var.Q();
                    if (zD || objQ3 == obj4) {
                        yb4 yb4Var2 = new yb4() { // from class: px8
                            @Override // defpackage.yb4
                            public final Object invoke(Object obj5, Object obj6) {
                                final cy9 cy9Var = (cy9) obj5;
                                final up1 up1Var = (up1) obj6;
                                cy9Var.getClass();
                                final int iW0 = cy9Var.w0(f);
                                List listK = cy9Var.K(a9a.a, rj1Var);
                                Iterator it = listK.iterator();
                                int i3 = 0;
                                int iMax = 0;
                                while (it.hasNext()) {
                                    iMax = Math.max(iMax, ((ca6) it.next()).d(Integer.MAX_VALUE));
                                }
                                final int i4 = iMax;
                                long jB = up1.b(up1Var.a, 0, 0, i4, iMax, 3);
                                final ArrayList arrayList = new ArrayList(gc1.M(listK, 10));
                                Iterator it2 = listK.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(((ca6) it2.next()).C(jB));
                                }
                                int size = arrayList.size();
                                final int i5 = iW0 * 2;
                                while (i3 < size) {
                                    Object obj7 = arrayList.get(i3);
                                    i3++;
                                    i5 += ((jt7) obj7).a;
                                }
                                final yb4 yb4Var3 = yb4Var;
                                final kx8 kx8Var2 = kx8Var;
                                final int i6 = i2;
                                final rj1 rj1Var3 = rj1Var2;
                                return cy9Var.R(i5, i4, mc3.a, new kb4() { // from class: lx8
                                    @Override // defpackage.kb4
                                    public final Object invoke(Object obj8) {
                                        int i7;
                                        int i8;
                                        it7 it7Var = (it7) obj8;
                                        it7Var.getClass();
                                        ArrayList arrayList2 = new ArrayList();
                                        ArrayList arrayList3 = arrayList;
                                        int size2 = arrayList3.size();
                                        int i9 = iW0;
                                        int i10 = i9;
                                        int i11 = 0;
                                        while (i11 < size2) {
                                            Object obj9 = arrayList3.get(i11);
                                            i11++;
                                            jt7 jt7Var = (jt7) obj9;
                                            it7.n(it7Var, jt7Var, i10, 0);
                                            arrayList2.add(new z8a(it7Var.Y(i10), it7Var.Y(jt7Var.a)));
                                            i10 += jt7Var.a;
                                        }
                                        a9a a9aVar = a9a.b;
                                        cy9 cy9Var2 = cy9Var;
                                        Iterator it3 = cy9Var2.K(a9aVar, yb4Var3).iterator();
                                        while (true) {
                                            boolean zHasNext = it3.hasNext();
                                            i7 = i5;
                                            i8 = i4;
                                            if (!zHasNext) {
                                                break;
                                            }
                                            jt7 jt7VarC = ((ca6) it3.next()).C(up1.b(up1Var.a, i7, i7, 0, 0, 8));
                                            it7.n(it7Var, jt7VarC, 0, i8 - jt7VarC.b);
                                        }
                                        for (ca6 ca6Var : cy9Var2.K(a9a.c, new rj1(new b18(3, rj1Var3, arrayList2), true, 1917359634))) {
                                            if (!((i7 >= 0) & (i8 >= 0))) {
                                                s75.a("width and height must be >= 0");
                                            }
                                            it7.n(it7Var, ca6Var.C(vp1.h(i7, i7, i8, i8)), 0, 0);
                                        }
                                        kx8 kx8Var3 = kx8Var2;
                                        ww8 ww8Var = kx8Var3.a;
                                        Integer num = kx8Var3.c;
                                        int i12 = i6;
                                        if (num == null || num.intValue() != i12) {
                                            kx8Var3.c = Integer.valueOf(i12);
                                            z8a z8aVar = (z8a) fc1.A0(i12, arrayList2);
                                            if (z8aVar != null) {
                                                z8a z8aVar2 = (z8a) fc1.E0(arrayList2);
                                                int iW02 = cy9Var2.w0(z8aVar2.a + z8aVar2.b) + i9;
                                                int iH = iW02 - ww8Var.e.h();
                                                int iW03 = cy9Var2.w0(z8aVar.a) - ((iH / 2) - (cy9Var2.w0(z8aVar.b) / 2));
                                                int i13 = iW02 - iH;
                                                if (i13 < 0) {
                                                    i13 = 0;
                                                }
                                                int iQ = wx1.Q(iW03, 0, i13);
                                                if (ww8Var.a.h() != iQ) {
                                                    ah1.J(kx8Var3.b, null, null, new tl0(kx8Var3, iQ, (jt1) null, 8), 3);
                                                }
                                            }
                                        }
                                        return heb.a;
                                    }
                                });
                            }
                        };
                        dd4Var.p0(yb4Var2);
                        objQ3 = yb4Var2;
                    }
                    yx9.a(ou6VarX, (yb4) objQ3, dd4Var, 0, 0);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ fq6(float f, rj1 rj1Var, yb4 yb4Var, rj1 rj1Var2, int i) {
        this.b = f;
        this.d = rj1Var;
        this.e = yb4Var;
        this.f = rj1Var2;
        this.c = i;
    }
}

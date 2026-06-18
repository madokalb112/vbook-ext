package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class pj1 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ pj1(bp2 bp2Var, ib4 ib4Var, String str, int i, kb4 kb4Var, yb4 yb4Var, kb4 kb4Var2, ib4 ib4Var2, int i2) {
        this.a = 9;
        this.c = bp2Var;
        this.d = ib4Var;
        this.e = str;
        this.b = i;
        this.f = kb4Var;
        this.s = yb4Var;
        this.t = kb4Var2;
        this.u = ib4Var2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int iW0;
        int iW02;
        int i2;
        int i3;
        xa8 xa8Var;
        final Integer numValueOf;
        int iIntValue;
        int iW03;
        int iC;
        int i4 = this.a;
        heb hebVar = heb.a;
        int i5 = this.b;
        Object obj3 = this.u;
        Object obj4 = this.t;
        Object obj5 = this.s;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        switch (i4) {
            case 0:
                ((Integer) obj2).getClass();
                ((rj1) obj9).l(this.d, this.e, this.f, this.s, this.t, this.u, (dd4) obj, qu1.x0(i5) | 1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                t96.h((String) obj9, (List) obj8, (pj7) obj7, (ou6) obj6, (kb4) obj5, (kb4) obj4, (kb4) obj3, (dd4) obj, qu1.x0(i5 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                h67.w((p74) obj9, (ou6) obj8, (pj7) obj7, (kb4) obj6, (kb4) obj5, (kb4) obj4, (ib4) obj3, (dd4) obj, qu1.x0(i5 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                t1c.H((xga) obj9, (pj7) obj8, (ou6) obj7, (kb4) obj6, (kb4) obj5, (kb4) obj4, (ib4) obj3, (dd4) obj, qu1.x0(i5 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ww1.r((su8) obj9, (y37) obj8, (ou6) obj7, (f9) obj6, (kb4) obj5, (kb4) obj4, (yb4) obj3, (dd4) obj, qu1.x0(i5 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                e11.u((String) obj9, (String) obj8, (yub) obj7, (qj5) obj6, (nj5) obj5, (ou6) obj4, (kb4) obj3, (dd4) obj, qu1.x0(i5 | 1));
                break;
            case 6:
                final hyb hybVar = (hyb) obj9;
                yb4 yb4Var = (yb4) obj5;
                yt8 yt8Var = (yt8) obj4;
                yb4 yb4Var2 = (yb4) obj3;
                final cy9 cy9Var = (cy9) obj;
                up1 up1Var = (up1) obj2;
                final int i6 = up1.i(up1Var.a);
                final int iH = up1.h(up1Var.a);
                long jB = up1.b(up1Var.a, 0, 0, 0, 0, 10);
                int iD = hybVar.d(cy9Var, cy9Var.getLayoutDirection());
                int iB = hybVar.b(cy9Var, cy9Var.getLayoutDirection());
                int iC2 = hybVar.c(cy9Var);
                final jt7 jt7VarC = ((ca6) fc1.x0(cy9Var.K(zt8.a, (yb4) obj8))).C(jB);
                int i7 = (-iD) - iB;
                int i8 = -iC2;
                boolean z = true;
                final jt7 jt7VarC2 = ((ca6) fc1.x0(cy9Var.K(zt8.c, (yb4) obj7))).C(vp1.i(i7, i8, jB));
                final jt7 jt7VarC3 = ((ca6) fc1.x0(cy9Var.K(zt8.d, (yb4) obj6))).C(vp1.i(i7, i8, jB));
                int i9 = jt7VarC3.a;
                if (i9 == 0 && jt7VarC3.b == 0) {
                    xa8Var = null;
                } else {
                    int i10 = jt7VarC3.b;
                    zm5 zm5Var = zm5.a;
                    if (i5 == 0) {
                        i = iD;
                        if (cy9Var.getLayoutDirection() == zm5Var) {
                            iW0 = cy9Var.w0(16.0f);
                            i3 = iW0 + i;
                        } else {
                            iW02 = cy9Var.w0(16.0f);
                            i3 = ((i6 - iW02) - i9) - iB;
                        }
                    } else {
                        i = iD;
                        if (i5 != 2 && i5 != 3) {
                            int i11 = ((i6 - i9) + i) - iB;
                            i2 = 2;
                            i3 = i11 / 2;
                            xa8Var = new xa8(i3, i10, i2);
                        } else if (cy9Var.getLayoutDirection() == zm5Var) {
                            iW02 = cy9Var.w0(16.0f);
                            i3 = ((i6 - iW02) - i9) - iB;
                        } else {
                            iW0 = cy9Var.w0(16.0f);
                            i3 = iW0 + i;
                        }
                    }
                    i2 = 2;
                    xa8Var = new xa8(i3, i10, i2);
                }
                final jt7 jt7VarC4 = ((ca6) fc1.x0(cy9Var.K(zt8.e, yb4Var))).C(jB);
                int i12 = 0;
                if (jt7VarC4.a != 0 || jt7VarC4.b != 0) {
                    z = false;
                }
                if (xa8Var != null) {
                    int i13 = xa8Var.c;
                    if (z || i5 == 3) {
                        iW03 = cy9Var.w0(16.0f) + i13;
                        iC = hybVar.c(cy9Var);
                    } else {
                        iW03 = jt7VarC4.b + i13;
                        iC = cy9Var.w0(16.0f);
                    }
                    numValueOf = Integer.valueOf(iC + iW03);
                } else {
                    numValueOf = null;
                }
                int i14 = jt7VarC2.b;
                if (i14 != 0) {
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        Integer numValueOf2 = !z ? Integer.valueOf(jt7VarC4.b) : null;
                        iIntValue = numValueOf2 != null ? numValueOf2.intValue() : hybVar.c(cy9Var);
                    }
                    i12 = i14 + iIntValue;
                }
                final int i15 = i12;
                z85 z85Var = new z85(hybVar, cy9Var);
                yt8Var.a.setValue(new rj7(gjb.W(z85Var, cy9Var.getLayoutDirection()), (jt7VarC.a == 0 && jt7VarC.b == 0) ? z85Var.d() : cy9Var.Y(jt7VarC.b), gjb.V(z85Var, cy9Var.getLayoutDirection()), z ? z85Var.a() : cy9Var.Y(jt7VarC4.b)));
                final jt7 jt7VarC5 = ((ca6) fc1.x0(cy9Var.K(zt8.b, yb4Var2))).C(jB);
                final xa8 xa8Var2 = xa8Var;
                break;
            case 7:
                ((Integer) obj2).getClass();
                p7c.C((co0) obj9, (mb9) obj8, (pj7) obj7, (szb) obj6, (ou6) obj5, (kb4) obj4, (kb4) obj3, (dd4) obj, qu1.x0(i5 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                lc5.K((bja) obj9, (pj7) obj8, (ou6) obj7, (ib4) obj6, (ib4) obj5, (ib4) obj4, (ib4) obj3, (dd4) obj, qu1.x0(i5 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                gjb.u((bp2) obj9, (ib4) obj8, lu6.a, (String) obj7, this.b, (kb4) obj6, (yb4) obj5, (kb4) obj4, (ib4) obj3, (dd4) obj, qu1.x0(12582921));
                break;
            default:
                ((Integer) obj2).getClass();
                fz1.G((lnb) obj9, (ou6) obj8, (ib4) obj7, (ib4) obj6, (ib4) obj5, (ib4) obj4, (kb4) obj3, (dd4) obj, qu1.x0(i5 | 1));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ pj1(hyb hybVar, yb4 yb4Var, yb4 yb4Var2, yb4 yb4Var3, int i, yb4 yb4Var4, yt8 yt8Var, yb4 yb4Var5) {
        this.a = 6;
        this.c = hybVar;
        this.d = yb4Var;
        this.e = yb4Var2;
        this.f = yb4Var3;
        this.b = i;
        this.s = yb4Var4;
        this.t = yt8Var;
        this.u = yb4Var5;
    }

    public /* synthetic */ pj1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.s = obj5;
        this.t = obj6;
        this.u = obj7;
        this.b = i;
    }
}

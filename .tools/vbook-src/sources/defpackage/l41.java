package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class l41 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;

    public /* synthetic */ l41(p35 p35Var, String str, String str2, ou6 ou6Var, ib4 ib4Var, int i) {
        this.a = 9;
        this.c = p35Var;
        this.e = str;
        this.f = str2;
        this.d = ou6Var;
        this.s = ib4Var;
        this.b = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.s;
        Object obj6 = this.d;
        heb hebVar = heb.a;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vm7.l((wga) obj7, (ou6) obj6, (String) obj4, (kb4) obj3, (ib4) obj5, (dd4) obj, qu1.x0(1), this.b);
                return hebVar;
            case 1:
                ((Integer) obj2).getClass();
                ((rj1) obj7).i(this.d, this.e, this.f, this.s, (dd4) obj, qu1.x0(i2) | 1);
                return hebVar;
            case 2:
                ((Integer) obj2).getClass();
                kc5.j((xi8) obj7, (js1) obj4, (ou6) obj6, (ib4) obj5, (kb4) obj3, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar;
            case 3:
                ((Integer) obj2).getClass();
                p7c.g((String) obj4, (t27) obj7, (pj7) obj3, (pj7) obj5, (ou6) obj6, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar;
            case 4:
                ((Integer) obj2).getClass();
                ah1.n((List) obj7, (pj7) obj4, (ou6) obj6, (yb4) obj5, (kb4) obj3, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar;
            case 5:
                ((Integer) obj2).getClass();
                yn2.c((ou6) obj6, (kv) obj7, (nv) obj4, (lr3) obj3, (rj1) obj5, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar;
            case 6:
                ((Integer) obj2).getClass();
                w05.d((String) obj4, (String) obj7, (String) obj3, (sr1) obj5, (ou6) obj6, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar;
            case 7:
                ((Integer) obj2).getClass();
                s96.a((ad1) obj7, (sv6) obj6, (i99) obj4, (xbb) obj3, (rj1) obj5, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar;
            case 8:
                ((Integer) obj2).getClass();
                sw1.d((List) obj7, (ou6) obj6, (kb4) obj3, (kb4) obj4, (kb4) obj5, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar;
            case 9:
                ((Integer) obj2).getClass();
                pu1.y((p35) obj7, (String) obj4, (String) obj3, (ou6) obj6, (ib4) obj5, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar;
            case 10:
                ((Integer) obj2).getClass();
                sdc.a0((String) obj4, (List) obj7, (pj7) obj3, (ou6) obj6, (yb4) obj5, (dd4) obj, qu1.x0(1), this.b);
                return hebVar;
            case 11:
                List list = (List) obj7;
                kb4 kb4Var = (kb4) obj3;
                pn2 pn2Var = (pn2) obj6;
                uka ukaVar = (uka) obj4;
                hk9 hk9Var = (hk9) obj5;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int i3 = 0;
                    for (Object obj8 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            gc1.i0();
                            throw null;
                        }
                        String str = (String) obj8;
                        boolean z = i2 == i3;
                        boolean zF = dd4Var.f(kb4Var) | dd4Var.d(i3);
                        Object objQ = dd4Var.Q();
                        if (zF || objQ == vl1.a) {
                            objQ = new bk0(kb4Var, i3, 10);
                            dd4Var.p0(objQ);
                        }
                        y8a.b(z, (ib4) objQ, (ou6) null, false, jf0.G(-838093223, new bu2(z, str, i3, pn2Var, ukaVar, hk9Var), dd4Var), 0L, 0L, dd4Var, 24576);
                        i3 = i4;
                    }
                } else {
                    dd4Var.Y();
                }
                return hebVar;
            case 12:
                ((Integer) obj2).getClass();
                tl9.c((ul9) obj7, (ou6) obj6, (pj7) obj4, (ib4) obj5, (ib4) obj3, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar;
            case 13:
                ((Integer) obj2).getClass();
                zma.l((t27) obj7, (joa) obj4, (za9) obj5, (ou6) obj6, (kb4) obj3, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar;
            case 14:
                ((Integer) obj2).getClass();
                kl8.K((List) obj7, (pj7) obj4, (ou6) obj6, (ac4) obj5, (kb4) obj3, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar;
            case 15:
                ((Integer) obj2).getClass();
                p7c.Q((p3b) obj7, (o3b) obj6, this.e, this.f, (by3) obj5, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar;
            default:
                ((Integer) obj2).getClass();
                jf0.o((dhb) obj7, (pj7) obj4, (ou6) obj6, (bc4) obj5, (kb4) obj3, (dd4) obj, qu1.x0(i2 | 1));
                return hebVar;
        }
    }

    public /* synthetic */ l41(ou6 ou6Var, kv kvVar, nv nvVar, lr3 lr3Var, rj1 rj1Var, int i) {
        this.a = 5;
        this.d = ou6Var;
        this.c = kvVar;
        this.e = nvVar;
        this.f = lr3Var;
        this.s = rj1Var;
        this.b = i;
    }

    public /* synthetic */ l41(t27 t27Var, joa joaVar, za9 za9Var, ou6 ou6Var, kb4 kb4Var, int i) {
        this.a = 13;
        this.c = t27Var;
        this.e = joaVar;
        this.s = za9Var;
        this.d = ou6Var;
        this.f = kb4Var;
        this.b = i;
    }

    public /* synthetic */ l41(ul9 ul9Var, ou6 ou6Var, pj7 pj7Var, ib4 ib4Var, ib4 ib4Var2, int i) {
        this.a = 12;
        this.c = ul9Var;
        this.d = ou6Var;
        this.e = pj7Var;
        this.s = ib4Var;
        this.f = ib4Var2;
        this.b = i;
    }

    public /* synthetic */ l41(wga wgaVar, ou6 ou6Var, String str, kb4 kb4Var, ib4 ib4Var, int i, int i2) {
        this.a = 0;
        this.c = wgaVar;
        this.d = ou6Var;
        this.e = str;
        this.f = kb4Var;
        this.s = ib4Var;
        this.b = i2;
    }

    public /* synthetic */ l41(Object obj, Object obj2, ou6 ou6Var, ub4 ub4Var, kb4 kb4Var, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.e = obj2;
        this.d = ou6Var;
        this.s = ub4Var;
        this.f = kb4Var;
        this.b = i;
    }

    public /* synthetic */ l41(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.s = obj5;
        this.b = i;
    }

    public /* synthetic */ l41(String str, Object obj, Object obj2, Object obj3, ou6 ou6Var, int i, int i2) {
        this.a = i2;
        this.e = str;
        this.c = obj;
        this.f = obj2;
        this.s = obj3;
        this.d = ou6Var;
        this.b = i;
    }

    public /* synthetic */ l41(String str, List list, pj7 pj7Var, ou6 ou6Var, yb4 yb4Var, int i, int i2) {
        this.a = 10;
        this.e = str;
        this.c = list;
        this.f = pj7Var;
        this.d = ou6Var;
        this.s = yb4Var;
        this.b = i2;
    }

    public /* synthetic */ l41(List list, int i, kb4 kb4Var, pn2 pn2Var, uka ukaVar, hk9 hk9Var) {
        this.a = 11;
        this.c = list;
        this.b = i;
        this.f = kb4Var;
        this.d = pn2Var;
        this.e = ukaVar;
        this.s = hk9Var;
    }

    public /* synthetic */ l41(List list, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, int i) {
        this.a = 8;
        this.c = list;
        this.d = ou6Var;
        this.f = kb4Var;
        this.e = kb4Var2;
        this.s = kb4Var3;
        this.b = i;
    }
}

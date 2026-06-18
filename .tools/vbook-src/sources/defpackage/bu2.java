package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class bu2 implements yb4 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;

    public /* synthetic */ bu2(to3 to3Var, wm3 wm3Var, boolean z, ou6 ou6Var, ib4 ib4Var, int i, int i2) {
        this.e = to3Var;
        this.f = wm3Var;
        this.b = z;
        this.c = ou6Var;
        this.s = ib4Var;
        this.d = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int i = this.a;
        int i2 = this.d;
        heb hebVar = heb.a;
        Object obj3 = this.c;
        Object obj4 = this.s;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                t1c.c((List) obj6, (zk7) obj5, this.b, (ou6) obj3, (kb4) obj4, (dd4) obj, qu1.x0(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                gc1.l((to3) obj6, (wm3) obj5, this.b, (ou6) obj3, (ib4) obj4, (dd4) obj, qu1.x0(49), this.d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                e11.k((String) obj6, this.b, (ou6) obj3, (ib4) obj5, (ib4) obj4, (dd4) obj, qu1.x0(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                sdc.E(this.b, (String) obj5, (List) obj6, (kb4) obj4, (yb4) obj3, (dd4) obj, qu1.x0(i2 | 1));
                break;
            case 4:
                String str = (String) obj6;
                pn2 pn2Var = (pn2) obj5;
                uka ukaVar = (uka) obj3;
                hk9 hk9Var = (hk9) obj4;
                dd4 dd4Var = (dd4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!dd4Var.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                    dd4Var.Y();
                } else {
                    if (this.b) {
                        dd4Var.f0(-990200880);
                        j = ((q96) dd4Var.j(s96.a)).a.a;
                        dd4Var.q(false);
                    } else {
                        dd4Var.f0(-990106485);
                        j = ((q96) dd4Var.j(s96.a)).a.o;
                        dd4Var.q(false);
                    }
                    long j2 = j;
                    boolean zD = dd4Var.d(i2) | dd4Var.f(pn2Var);
                    Object objQ = dd4Var.Q();
                    if (zD || objQ == vl1.a) {
                        objQ = new lr6(hk9Var, i2, pn2Var, 1);
                        dd4Var.p0(objQ);
                    }
                    nha.c(str, (ou6) null, j2, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) objQ, ukaVar, dd4Var, 0, 0, 65530);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                oh9.d((List) obj6, (vp9) obj5, (ib4) obj4, this.b, (ou6) obj3, (dd4) obj, qu1.x0(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                jf0.d(this.b, this.d, (wga) obj6, (ou6) obj3, (kb4) obj4, (kb4) obj5, (dd4) obj, qu1.x0(199681));
                break;
            default:
                ((Integer) obj2).getClass();
                wn9.c(this.b, (String) obj6, (String) obj5, (kb4) obj4, (ib4) obj3, (dd4) obj, qu1.x0(i2 | 1));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ bu2(String str, boolean z, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, int i) {
        this.e = str;
        this.b = z;
        this.c = ou6Var;
        this.f = ib4Var;
        this.s = ib4Var2;
        this.d = i;
    }

    public /* synthetic */ bu2(List list, zk7 zk7Var, boolean z, ou6 ou6Var, kb4 kb4Var, int i) {
        this.e = list;
        this.f = zk7Var;
        this.b = z;
        this.c = ou6Var;
        this.s = kb4Var;
        this.d = i;
    }

    public /* synthetic */ bu2(List list, vp9 vp9Var, ib4 ib4Var, boolean z, ou6 ou6Var, int i) {
        this.e = list;
        this.f = vp9Var;
        this.s = ib4Var;
        this.b = z;
        this.c = ou6Var;
        this.d = i;
    }

    public /* synthetic */ bu2(boolean z, int i, wga wgaVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, int i2) {
        this.b = z;
        this.d = i;
        this.e = wgaVar;
        this.c = ou6Var;
        this.s = kb4Var;
        this.f = kb4Var2;
    }

    public /* synthetic */ bu2(boolean z, String str, int i, pn2 pn2Var, uka ukaVar, hk9 hk9Var) {
        this.b = z;
        this.e = str;
        this.d = i;
        this.f = pn2Var;
        this.c = ukaVar;
        this.s = hk9Var;
    }

    public /* synthetic */ bu2(boolean z, String str, String str2, kb4 kb4Var, ib4 ib4Var, int i) {
        this.b = z;
        this.e = str;
        this.f = str2;
        this.s = kb4Var;
        this.c = ib4Var;
        this.d = i;
    }

    public /* synthetic */ bu2(boolean z, String str, List list, kb4 kb4Var, yb4 yb4Var, int i) {
        this.b = z;
        this.f = str;
        this.e = list;
        this.s = kb4Var;
        this.c = yb4Var;
        this.d = i;
    }
}

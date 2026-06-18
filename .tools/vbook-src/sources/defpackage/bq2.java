package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class bq2 implements kb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ kb4 b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ bq2(ho2 ho2Var, yb4 yb4Var, wq2 wq2Var, kb4 kb4Var, yb4 yb4Var2, pj7 pj7Var, kb4 kb4Var2) {
        this.d = ho2Var;
        this.e = yb4Var;
        this.s = wq2Var;
        this.b = kb4Var;
        this.f = yb4Var2;
        this.t = pj7Var;
        this.c = kb4Var2;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj2 = this.t;
        Object obj3 = this.s;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        int i2 = 1;
        switch (i) {
            case 0:
                ho2 ho2Var = (ho2) obj6;
                yb4 yb4Var = (yb4) obj5;
                wq2 wq2Var = (wq2) obj3;
                yb4 yb4Var2 = (yb4) obj4;
                pj7 pj7Var = (pj7) obj2;
                aq5 aq5Var = (aq5) obj;
                aq5Var.getClass();
                aq5.b0(aq5Var, "header", new oc2(28), new rj1(new dq2(ho2Var, wq2Var, pj7Var, this.c, 1), true, 238848286), 4);
                List list = ho2Var.p;
                List list2 = ho2Var.s;
                List list3 = ho2Var.q;
                List list4 = ho2Var.r;
                if (!list.isEmpty()) {
                    lx1.h0(aq5Var, ho2Var.p, yb4Var);
                }
                if (ho2Var.f.length() > 0) {
                    aq5.b0(aq5Var, "info", new oc2(29), new rj1(new eq2(ho2Var, 2), true, 407015024), 4);
                }
                if (ho2Var.g.length() > 0) {
                    aq5.b0(aq5Var, "introduction", new gq2(0), new rj1(new eq2(ho2Var, 3), true, 645881457), 4);
                }
                if (!list4.isEmpty()) {
                    aq5Var.c0(list4.size(), (kb4) null, (yb4) null, new g7(17, list4), new rj1(new uq2(i2, list4), true, -1117249557));
                }
                if (!list3.isEmpty()) {
                    String str = wq2Var.b;
                    str.getClass();
                    hn9.t(aq5Var, str, list3, this.b, yb4Var);
                }
                if (!list2.isEmpty()) {
                    String str2 = wq2Var.b;
                    str2.getClass();
                    ql9.D(aq5Var, str2, list2, new dh1(1), yb4Var2);
                }
                break;
            default:
                String str3 = (String) obj6;
                List list5 = (List) obj5;
                List list6 = (List) obj4;
                kb4 kb4Var = (kb4) obj3;
                kb4 kb4Var2 = (kb4) obj2;
                at5 at5Var = (at5) obj;
                at5Var.getClass();
                if (str3.length() == 0 && !list5.isEmpty()) {
                    at5.b0(at5Var, (String) null, kf0.k, 3);
                }
                int size = list5.size();
                r54 r54Var = new r54(6, list5);
                kb4 kb4Var3 = this.b;
                kb4 kb4Var4 = this.c;
                at5Var.c0(size, (kb4) null, r54Var, new rj1(new il0(list5, kb4Var3, kb4Var4, kb4Var, 1), true, 802480018));
                if (str3.length() == 0 && !list6.isEmpty()) {
                    at5.b0(at5Var, (String) null, kf0.l, 3);
                }
                at5Var.c0(list6.size(), (kb4) null, new r54(7, list6), new rj1(new il0(list6, kb4Var2, kb4Var4, kb4Var, 2), true, 802480018));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ bq2(String str, List list, List list2, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4) {
        this.d = str;
        this.e = list;
        this.f = list2;
        this.b = kb4Var;
        this.c = kb4Var2;
        this.s = kb4Var3;
        this.t = kb4Var4;
    }
}

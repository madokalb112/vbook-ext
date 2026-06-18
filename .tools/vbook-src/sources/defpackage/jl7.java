package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class jl7 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ co0 c;
    public final /* synthetic */ yb4 d;
    public final /* synthetic */ yb4 e;
    public final /* synthetic */ zb4 f;
    public final /* synthetic */ ib4 s;
    public final /* synthetic */ kb4 t;
    public final /* synthetic */ kb4 u;
    public final /* synthetic */ br9 v;
    public final /* synthetic */ a07 w;

    public /* synthetic */ jl7(List list, co0 co0Var, yb4 yb4Var, yb4 yb4Var2, zb4 zb4Var, ib4 ib4Var, kb4 kb4Var, kb4 kb4Var2, br9 br9Var, a07 a07Var, int i) {
        this.a = i;
        this.b = list;
        this.c = co0Var;
        this.d = yb4Var;
        this.e = yb4Var2;
        this.f = zb4Var;
        this.s = ib4Var;
        this.t = kb4Var;
        this.u = kb4Var2;
        this.v = br9Var;
        this.w = a07Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                at5 at5Var = (at5) obj;
                at5Var.getClass();
                qp6 qp6Var = new qp6(10);
                List list = this.b;
                at5Var.c0(list.size(), new kt6(6, qp6Var, list), new js6(9, list), new rj1(new ol7(list, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, 1), true, 2039820996));
                break;
            default:
                at5 at5Var2 = (at5) obj;
                at5Var2.getClass();
                qp6 qp6Var2 = new qp6(9);
                List list2 = this.b;
                at5Var2.c0(list2.size(), new kt6(4, qp6Var2, list2), new js6(7, list2), new rj1(new ol7(list2, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, 0), true, 2039820996));
                break;
        }
        return hebVar;
    }
}

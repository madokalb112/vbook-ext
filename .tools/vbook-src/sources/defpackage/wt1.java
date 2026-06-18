package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class wt1 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ zb4 c;
    public final /* synthetic */ yb4 d;
    public final /* synthetic */ ib4 e;
    public final /* synthetic */ kb4 f;
    public final /* synthetic */ kb4 s;
    public final /* synthetic */ ou6 t;
    public final /* synthetic */ a07 u;

    public /* synthetic */ wt1(List list, zb4 zb4Var, yb4 yb4Var, ib4 ib4Var, kb4 kb4Var, kb4 kb4Var2, ou6 ou6Var, a07 a07Var, int i) {
        this.a = i;
        this.b = list;
        this.c = zb4Var;
        this.d = yb4Var;
        this.e = ib4Var;
        this.f = kb4Var;
        this.s = kb4Var2;
        this.t = ou6Var;
        this.u = a07Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                at5 at5Var = (at5) obj;
                at5Var.getClass();
                vd1 vd1Var = new vd1(27);
                List list = this.b;
                at5Var.c0(list.size(), new f7(13, vd1Var, list), new g7(14, list), new rj1(new ou1(list, this.c, this.d, this.e, this.f, this.s, this.t, this.u, 1), true, 802480018));
                break;
            default:
                at5 at5Var2 = (at5) obj;
                at5Var2.getClass();
                vd1 vd1Var2 = new vd1(28);
                List list2 = this.b;
                at5Var2.c0(list2.size(), new f7(12, vd1Var2, list2), new g7(13, list2), new rj1(new ou1(list2, this.c, this.d, this.e, this.f, this.s, this.t, this.u, 0), true, 802480018));
                break;
        }
        return hebVar;
    }
}

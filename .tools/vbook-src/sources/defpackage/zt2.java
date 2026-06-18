package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class zt2 implements yb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ List b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ou6 d;
    public final /* synthetic */ ib4 e;
    public final /* synthetic */ kb4 f;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ ub4 w;
    public final /* synthetic */ ub4 x;

    public /* synthetic */ zt2(u4b u4bVar, to3 to3Var, List list, zk7 zk7Var, boolean z, ou6 ou6Var, kb4 kb4Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, int i) {
        this.t = u4bVar;
        this.u = to3Var;
        this.b = list;
        this.v = zk7Var;
        this.c = z;
        this.d = ou6Var;
        this.f = kb4Var;
        this.e = ib4Var;
        this.w = ib4Var2;
        this.x = ib4Var3;
        this.s = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.s;
        ub4 ub4Var = this.x;
        ub4 ub4Var2 = this.w;
        Object obj3 = this.v;
        Object obj4 = this.u;
        Object obj5 = this.t;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                t1c.l((u4b) obj5, (to3) obj4, this.b, (zk7) obj3, this.c, this.d, this.f, this.e, (ib4) ub4Var2, (ib4) ub4Var, (dd4) obj, iX0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                sdc.x(this.b, (st5) obj5, this.c, this.d, (yb4) obj4, (yb4) obj3, (zb4) ub4Var2, this.e, this.f, (kb4) ub4Var, (dd4) obj, iX02);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ zt2(List list, st5 st5Var, boolean z, ou6 ou6Var, yb4 yb4Var, yb4 yb4Var2, zb4 zb4Var, ib4 ib4Var, kb4 kb4Var, kb4 kb4Var2, int i) {
        this.b = list;
        this.t = st5Var;
        this.c = z;
        this.d = ou6Var;
        this.u = yb4Var;
        this.v = yb4Var2;
        this.w = zb4Var;
        this.e = ib4Var;
        this.f = kb4Var;
        this.x = kb4Var2;
        this.s = i;
    }
}

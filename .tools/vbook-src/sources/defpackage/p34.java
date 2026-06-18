package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class p34 implements yb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ou6 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ ub4 u;

    public /* synthetic */ p34(int i, List list, int i2, zk7 zk7Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, int i3) {
        this.b = i;
        this.f = list;
        this.c = i2;
        this.s = zk7Var;
        this.d = ou6Var;
        this.t = kb4Var;
        this.u = kb4Var2;
        this.e = i3;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.e;
        ub4 ub4Var = this.u;
        Object obj3 = this.t;
        Object obj4 = this.s;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                yn2.b(this.d, (kv) obj5, (nv) obj4, (wf0) obj3, this.b, this.c, (rj1) ub4Var, (dd4) obj, iX0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                sdc.o(this.b, (List) obj5, this.c, (zk7) obj4, this.d, (kb4) obj3, (kb4) ub4Var, (dd4) obj, iX02);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ p34(ou6 ou6Var, kv kvVar, nv nvVar, wf0 wf0Var, int i, int i2, rj1 rj1Var, int i3) {
        this.d = ou6Var;
        this.f = kvVar;
        this.s = nvVar;
        this.t = wf0Var;
        this.b = i;
        this.c = i2;
        this.u = rj1Var;
        this.e = i3;
    }
}

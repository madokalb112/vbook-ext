package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class qn3 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ou6 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ qn3(p35 p35Var, String str, String str2, ou6 ou6Var, ib4 ib4Var, int i, int i2) {
        this.a = 1;
        this.f = p35Var;
        this.s = str;
        this.t = str2;
        this.b = ou6Var;
        this.c = ib4Var;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.d;
        Object obj3 = this.t;
        Object obj4 = this.s;
        Object obj5 = this.c;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                t1c.s((to3) obj6, this.b, (ib4) obj5, (ib4) obj4, (ib4) obj3, (dd4) obj, iX0, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                e11.v((p35) obj6, (String) obj4, (String) obj3, this.b, (ib4) obj5, (dd4) obj, iX02, this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iX03 = qu1.x0(i2 | 1);
                gx1.r((String) obj6, this.b, (rj1) obj5, (zb4) obj4, (rj1) obj3, (dd4) obj, iX03, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX04 = qu1.x0(i2 | 1);
                qx8.b((zk7) obj6, (List) obj5, this.b, (rj1) obj4, (rj1) obj3, (dd4) obj, iX04, this.e);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ qn3(zk7 zk7Var, List list, ou6 ou6Var, rj1 rj1Var, rj1 rj1Var2, int i, int i2) {
        this.a = 3;
        this.f = zk7Var;
        this.c = list;
        this.b = ou6Var;
        this.s = rj1Var;
        this.t = rj1Var2;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ qn3(Object obj, ou6 ou6Var, ub4 ub4Var, ub4 ub4Var2, ub4 ub4Var3, int i, int i2, int i3) {
        this.a = i3;
        this.f = obj;
        this.b = ou6Var;
        this.c = ub4Var;
        this.s = ub4Var2;
        this.t = ub4Var3;
        this.d = i;
        this.e = i2;
    }
}

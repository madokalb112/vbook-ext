package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class xt1 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ ou6 b;
    public final /* synthetic */ yb4 c;
    public final /* synthetic */ yb4 d;
    public final /* synthetic */ zb4 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ ub4 v;
    public final /* synthetic */ ub4 w;
    public final /* synthetic */ Object x;

    public /* synthetic */ xt1(ou6 ou6Var, yb4 yb4Var, yb4 yb4Var2, zb4 zb4Var, yb4 yb4Var3, yb4 yb4Var4, float f, rj1 rj1Var, yb4 yb4Var5, pj7 pj7Var, int i) {
        this.b = ou6Var;
        this.c = yb4Var;
        this.d = yb4Var2;
        this.e = zb4Var;
        this.t = yb4Var3;
        this.u = yb4Var4;
        this.f = f;
        this.v = rj1Var;
        this.w = yb4Var5;
        this.x = pj7Var;
        this.s = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.s;
        Object obj3 = this.x;
        ub4 ub4Var = this.w;
        ub4 ub4Var2 = this.v;
        Object obj4 = this.u;
        Object obj5 = this.t;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                lc5.M((List) obj5, (st5) obj4, this.b, this.f, this.c, this.d, this.e, (ib4) ub4Var2, (kb4) ub4Var, (kb4) obj3, (dd4) obj, iX0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                y86.m(this.b, this.c, this.d, this.e, (yb4) obj5, (yb4) obj4, this.f, (rj1) ub4Var2, (yb4) ub4Var, (pj7) obj3, (dd4) obj, iX02);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ xt1(List list, st5 st5Var, ou6 ou6Var, float f, yb4 yb4Var, yb4 yb4Var2, zb4 zb4Var, ib4 ib4Var, kb4 kb4Var, kb4 kb4Var2, int i) {
        this.t = list;
        this.u = st5Var;
        this.b = ou6Var;
        this.f = f;
        this.c = yb4Var;
        this.d = yb4Var2;
        this.e = zb4Var;
        this.v = ib4Var;
        this.w = kb4Var;
        this.x = kb4Var2;
        this.s = i;
    }
}

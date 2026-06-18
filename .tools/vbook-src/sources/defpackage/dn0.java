package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class dn0 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ou6 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ ub4 u;

    public /* synthetic */ dn0(ou6 ou6Var, boolean z, boolean z2, y1a y1aVar, yb4 yb4Var, ta5 ta5Var, t89 t89Var, int i) {
        this.d = ou6Var;
        this.b = z;
        this.c = z2;
        this.s = y1aVar;
        this.u = yb4Var;
        this.e = ta5Var;
        this.t = t89Var;
        this.f = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.f;
        Object obj3 = this.t;
        Object obj4 = this.e;
        ub4 ub4Var = this.u;
        Object obj5 = this.s;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                t1c.a((fq8) obj5, this.b, (ib4) obj4, (rj1) obj3, this.d, this.c, (yb4) ub4Var, (dd4) obj, iX0);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iX02 = qu1.x0(i2 | 1);
                tl9.b(this.b, (List) obj5, this.c, this.d, (pj7) obj3, (ib4) obj4, (ib4) ub4Var, (dd4) obj, iX02);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX03 = qu1.x0(i2 | 1);
                z1a.b(this.d, this.b, this.c, (y1a) obj5, (yb4) ub4Var, (ta5) obj4, (t89) obj3, (dd4) obj, iX03);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ dn0(fq8 fq8Var, boolean z, ib4 ib4Var, rj1 rj1Var, ou6 ou6Var, boolean z2, yb4 yb4Var, int i) {
        this.s = fq8Var;
        this.b = z;
        this.e = ib4Var;
        this.t = rj1Var;
        this.d = ou6Var;
        this.c = z2;
        this.u = yb4Var;
        this.f = i;
    }

    public /* synthetic */ dn0(boolean z, List list, boolean z2, ou6 ou6Var, pj7 pj7Var, ib4 ib4Var, ib4 ib4Var2, int i) {
        this.b = z;
        this.s = list;
        this.c = z2;
        this.d = ou6Var;
        this.t = pj7Var;
        this.e = ib4Var;
        this.u = ib4Var2;
        this.f = i;
    }
}

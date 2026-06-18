package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class tv2 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;

    public /* synthetic */ tv2(int i, int i2, kb4 kb4Var, ou6 ou6Var, String str, List list) {
        this.a = 5;
        this.s = str;
        this.f = list;
        this.d = i;
        this.b = ou6Var;
        this.c = kb4Var;
        this.e = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        int i3 = this.d;
        heb hebVar = heb.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.f;
        Object obj6 = this.s;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                fe.k((ov2) obj5, (ou6) obj4, (String) obj6, (ib4) obj3, (dd4) obj, qu1.x0(i3 | 1), this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                gx1.b((rj1) obj5, (yb4) obj6, (ou6) obj4, (ib4) obj3, (dd4) obj, qu1.x0(i3 | 1), this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                kl8.m((el3) obj5, (ou6) obj4, (x13) obj6, (ib4) obj3, (dd4) obj, qu1.x0(i3 | 1), this.e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                s96.b((ad1) obj5, (i99) obj4, (xbb) obj6, (rj1) obj3, (dd4) obj, qu1.x0(i3 | 1), this.e);
                break;
            case 4:
                ((Integer) obj2).getClass();
                tu1.p((String) obj6, (ou6) obj4, (zb4) obj5, (rj1) obj3, (dd4) obj, qu1.x0(i3 | 1), this.e);
                break;
            case 5:
                ((Integer) obj2).getClass();
                e11.t((String) obj6, (List) obj5, this.d, (ou6) obj4, (kb4) obj3, (dd4) obj, qu1.x0(i2 | 1));
                break;
            case 6:
                a07 a07Var = (a07) obj4;
                a07 a07Var2 = (a07) obj6;
                a07 a07Var3 = (a07) obj3;
                ux7 ux7Var = (ux7) obj;
                eb7 eb7Var = (eb7) obj2;
                ux7Var.getClass();
                a07Var.setValue(Float.valueOf((Float.intBitsToFloat((int) (eb7Var.a >> 32)) / (i3 - ((int) (zma.i(a07Var2) >> 32)))) + zma.j(a07Var)));
                a07Var3.setValue(Float.valueOf((Float.intBitsToFloat((int) (eb7Var.a & 4294967295L)) / (i2 - ((int) (((na5) a07Var2.getValue()).a & 4294967295L)))) + ((Number) a07Var3.getValue()).floatValue()));
                a07Var3.setValue(Float.valueOf(wx1.P(((Number) a07Var3.getValue()).floatValue(), 0.0f, 1.0f)));
                xg9.b((zlb) obj5, ux7Var, 0L);
                break;
            default:
                ((Integer) obj2).getClass();
                sg9.a((String) obj6, (String) obj5, (ou6) obj4, (ib4) obj3, (dd4) obj, qu1.x0(i3 | 1), this.e);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ tv2(int i, int i2, zlb zlbVar, a07 a07Var, a07 a07Var2, a07 a07Var3) {
        this.a = 6;
        this.d = i;
        this.e = i2;
        this.f = zlbVar;
        this.b = a07Var;
        this.s = a07Var2;
        this.c = a07Var3;
    }

    public /* synthetic */ tv2(rj1 rj1Var, yb4 yb4Var, ou6 ou6Var, ib4 ib4Var, int i, int i2) {
        this.a = 1;
        this.f = rj1Var;
        this.s = yb4Var;
        this.b = ou6Var;
        this.c = ib4Var;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ tv2(Object obj, Object obj2, Object obj3, ub4 ub4Var, int i, int i2, int i3) {
        this.a = i3;
        this.f = obj;
        this.b = obj2;
        this.s = obj3;
        this.c = ub4Var;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ tv2(String str, ou6 ou6Var, zb4 zb4Var, rj1 rj1Var, int i, int i2) {
        this.a = 4;
        this.s = str;
        this.b = ou6Var;
        this.f = zb4Var;
        this.c = rj1Var;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ tv2(String str, String str2, ou6 ou6Var, ib4 ib4Var, int i, int i2) {
        this.a = 7;
        this.s = str;
        this.f = str2;
        this.b = ou6Var;
        this.c = ib4Var;
        this.d = i;
        this.e = i2;
    }
}

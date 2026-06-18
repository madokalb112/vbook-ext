package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ch1 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object s;

    public /* synthetic */ ch1(int i, ib4 ib4Var, ou6 ou6Var, t89 t89Var, uka ukaVar, String str, boolean z) {
        this.a = 3;
        this.d = str;
        this.b = z;
        this.c = ou6Var;
        this.e = ukaVar;
        this.f = t89Var;
        this.s = ib4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj3 = this.s;
        Object obj4 = this.c;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(1);
                fe.b(this.b, (zk7) obj7, (t27) obj6, (pj7) obj5, (szb) obj3, (ou6) obj4, (dd4) obj, iX0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(1);
                gc1.p(this.b, (ou6) obj4, (ib4) obj7, (ib4) obj6, (ib4) obj5, (ib4) obj3, (dd4) obj, iX02);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iX03 = qu1.x0(25025);
                wx1.n(this.b, (fxb) obj7, (ou6) obj4, (kb4) obj6, (kb4) obj5, (kb4) obj3, (dd4) obj, iX03);
                break;
            case 3:
                t89 t89Var = (t89) obj5;
                ib4 ib4Var = (ib4) obj3;
                dd4 dd4Var = (dd4) obj;
                ((Integer) obj2).getClass();
                int iX04 = qu1.x0(1);
                rw1.B(iX04, ib4Var, dd4Var, (ou6) obj4, t89Var, (uka) obj6, (String) obj7, this.b);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iX05 = qu1.x0(1);
                sw1.c(this.b, (to3) obj7, (ou6) obj4, (ib4) obj6, (ib4) obj5, (ib4) obj3, (dd4) obj, iX05);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iX06 = qu1.x0(3137);
                ny1.f(this.b, (v78) obj7, (List) obj6, (kb4) obj5, (ac4) obj3, (yb4) obj4, (dd4) obj, iX06);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX07 = qu1.x0(1);
                oh9.f((ib4) obj7, (ib4) obj6, this.b, (rx8) obj5, (ou6) obj4, (yb4) obj3, (dd4) obj, iX07);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ch1(ib4 ib4Var, ib4 ib4Var2, boolean z, rx8 rx8Var, ou6 ou6Var, yb4 yb4Var, int i) {
        this.a = 6;
        this.d = ib4Var;
        this.e = ib4Var2;
        this.b = z;
        this.f = rx8Var;
        this.c = ou6Var;
        this.s = yb4Var;
    }

    public /* synthetic */ ch1(boolean z, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, int i) {
        this.a = 1;
        this.b = z;
        this.c = ou6Var;
        this.d = ib4Var;
        this.e = ib4Var2;
        this.f = ib4Var3;
        this.s = ib4Var4;
    }

    public /* synthetic */ ch1(boolean z, Object obj, ou6 ou6Var, ub4 ub4Var, ub4 ub4Var2, ub4 ub4Var3, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.d = obj;
        this.c = ou6Var;
        this.e = ub4Var;
        this.f = ub4Var2;
        this.s = ub4Var3;
    }

    public /* synthetic */ ch1(boolean z, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.s = obj4;
        this.c = obj5;
    }
}

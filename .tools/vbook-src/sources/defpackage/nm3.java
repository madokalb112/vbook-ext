package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class nm3 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ ub4 s;

    public /* synthetic */ nm3(int i, int i2, kb4 kb4Var, kb4 kb4Var2, ou6 ou6Var, boolean z) {
        this.a = 2;
        this.c = i;
        this.b = z;
        this.e = ou6Var;
        this.f = kb4Var;
        this.s = kb4Var2;
        this.d = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        heb hebVar = heb.a;
        ub4 ub4Var = this.s;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                tw1.d((String) obj4, this.b, (ib4) obj3, (yb4) ub4Var, (dd4) obj, iX0, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                sw1.s((List) obj4, this.b, (ou6) obj3, (kb4) ub4Var, (dd4) obj, iX02, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX03 = qu1.x0(this.d | 1);
                au6.f(this.c, this.b, (ou6) obj4, (kb4) obj3, (kb4) ub4Var, (dd4) obj, iX03);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ nm3(Object obj, boolean z, Object obj2, ub4 ub4Var, int i, int i2, int i3) {
        this.a = i3;
        this.e = obj;
        this.b = z;
        this.f = obj2;
        this.s = ub4Var;
        this.c = i;
        this.d = i2;
    }
}

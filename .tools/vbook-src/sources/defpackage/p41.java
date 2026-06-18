package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class p41 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p41(String str, boolean z, ou6 ou6Var, ib4 ib4Var, int i) {
        this.e = str;
        this.b = z;
        this.f = ou6Var;
        this.c = ib4Var;
        this.d = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        heb hebVar = heb.a;
        Object obj3 = this.c;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (i) {
            case 0:
                ib4 ib4Var = (ib4) obj3;
                dd4 dd4Var = (dd4) obj;
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                vm7.m(iX0, ib4Var, dd4Var, (ou6) obj4, (String) obj5, this.b);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(1);
                fx1.g(this.b, (ib4) obj3, (ib4) obj5, (ib4) obj4, (dd4) obj, iX02, this.d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iX03 = qu1.x0(i2 | 1);
                h67.T((List) obj5, (xr9) obj4, this.b, (wr9) obj3, (dd4) obj, iX03);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX04 = qu1.x0(i2 | 1);
                un9.b(this.b, (u4b) obj5, (ou6) obj4, (ib4) obj3, (dd4) obj, iX04);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ p41(List list, xr9 xr9Var, boolean z, wr9 wr9Var, int i) {
        this.e = list;
        this.f = xr9Var;
        this.b = z;
        this.c = wr9Var;
        this.d = i;
    }

    public /* synthetic */ p41(boolean z, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, int i, int i2) {
        this.b = z;
        this.c = ib4Var;
        this.e = ib4Var2;
        this.f = ib4Var3;
        this.d = i2;
    }

    public /* synthetic */ p41(boolean z, u4b u4bVar, ou6 ou6Var, ib4 ib4Var, int i) {
        this.b = z;
        this.e = u4bVar;
        this.f = ou6Var;
        this.c = ib4Var;
        this.d = i;
    }
}

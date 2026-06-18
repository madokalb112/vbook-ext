package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class in6 implements yb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ ou6 e;

    public /* synthetic */ in6(int i, List list, kb4 kb4Var, ou6 ou6Var, int i2) {
        this.b = i;
        this.c = list;
        this.d = kb4Var;
        this.e = ou6Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                kl8.x(qu1.x0(this.b | 1), this.d, (dd4) obj, this.e, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(1);
                rw1.C(this.b, iX0, this.d, (dd4) obj, this.e, this.c);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ in6(List list, ou6 ou6Var, kb4 kb4Var, int i) {
        this.c = list;
        this.e = ou6Var;
        this.d = kb4Var;
        this.b = i;
    }
}

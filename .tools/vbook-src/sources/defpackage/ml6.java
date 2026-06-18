package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ml6 implements yb4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ou6 d;
    public final /* synthetic */ kb4 e;
    public final /* synthetic */ int f;

    public /* synthetic */ ml6(int i, List list, kb4 kb4Var, ou6 ou6Var, int i2) {
        this.c = i;
        this.b = list;
        this.e = kb4Var;
        this.d = ou6Var;
        this.f = i2;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                h67.Q(this.c, iX0, this.e, (dd4) obj, this.d, this.b);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                au6.a(this.c, iX02, this.e, (dd4) obj, this.d, this.b);
                break;
        }
        return hebVar;
    }

    public /* synthetic */ ml6(List list, int i, ou6 ou6Var, kb4 kb4Var, int i2) {
        this.b = list;
        this.c = i;
        this.d = ou6Var;
        this.e = kb4Var;
        this.f = i2;
    }
}

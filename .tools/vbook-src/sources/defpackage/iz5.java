package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class iz5 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ wq5 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ou6 f;
    public final /* synthetic */ pj7 s;
    public final /* synthetic */ pj7 t;
    public final /* synthetic */ kb4 u;

    public /* synthetic */ iz5(List list, int i, wq5 wq5Var, boolean z, ou6 ou6Var, pj7 pj7Var, pj7 pj7Var2, kb4 kb4Var, int i2, int i3) {
        this.a = i3;
        this.b = list;
        this.c = i;
        this.d = wq5Var;
        this.e = z;
        this.f = ou6Var;
        this.s = pj7Var;
        this.t = pj7Var2;
        this.u = kb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(24577);
                e11.c(this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, (dd4) obj, iX0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(24577);
                e11.d(this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, (dd4) obj, iX02);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iX03 = qu1.x0(24577);
                e11.h(this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, (dd4) obj, iX03);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX04 = qu1.x0(24577);
                e11.g(this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, (dd4) obj, iX04);
                break;
        }
        return hebVar;
    }
}

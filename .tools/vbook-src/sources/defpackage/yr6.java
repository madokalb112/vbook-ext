package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class yr6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ List e;
    public final /* synthetic */ kb4 f;
    public final /* synthetic */ kb4 s;
    public final /* synthetic */ kb4 t;
    public final /* synthetic */ ib4 u;
    public final /* synthetic */ int v;

    public /* synthetic */ yr6(boolean z, boolean z2, float f, List list, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, ib4 ib4Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = z2;
        this.d = f;
        this.e = list;
        this.f = kb4Var;
        this.s = kb4Var2;
        this.t = kb4Var3;
        this.u = ib4Var;
        this.v = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.v;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                vw1.m(this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, (dd4) obj, iX0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                vw1.l(this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, (dd4) obj, iX02);
                break;
        }
        return hebVar;
    }
}

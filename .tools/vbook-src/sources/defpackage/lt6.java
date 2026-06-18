package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class lt6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;
    public final /* synthetic */ List e;
    public final /* synthetic */ int f;
    public final /* synthetic */ float s;
    public final /* synthetic */ kb4 t;
    public final /* synthetic */ kb4 u;
    public final /* synthetic */ kb4 v;
    public final /* synthetic */ kb4 w;
    public final /* synthetic */ kb4 x;
    public final /* synthetic */ kb4 y;
    public final /* synthetic */ kb4 z;

    public /* synthetic */ lt6(boolean z, String str, List list, List list2, int i, float f, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, kb4 kb4Var5, kb4 kb4Var6, kb4 kb4Var7, int i2, int i3) {
        this.a = i3;
        this.b = z;
        this.c = str;
        this.d = list;
        this.e = list2;
        this.f = i;
        this.s = f;
        this.t = kb4Var;
        this.u = kb4Var2;
        this.v = kb4Var3;
        this.w = kb4Var4;
        this.x = kb4Var5;
        this.y = kb4Var6;
        this.z = kb4Var7;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(1);
                fx1.j(this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, (dd4) obj, iX0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(1);
                fx1.l(this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, (dd4) obj, iX02);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX03 = qu1.x0(1);
                fx1.k(this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, (dd4) obj, iX03);
                break;
        }
        return hebVar;
    }
}

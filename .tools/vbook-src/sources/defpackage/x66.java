package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class x66 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ pj7 c;
    public final /* synthetic */ ou6 d;
    public final /* synthetic */ zb4 e;
    public final /* synthetic */ kb4 f;
    public final /* synthetic */ int s;

    public /* synthetic */ x66(List list, pj7 pj7Var, ou6 ou6Var, zb4 zb4Var, kb4 kb4Var, int i, int i2) {
        this.a = i2;
        this.b = list;
        this.c = pj7Var;
        this.d = ou6Var;
        this.e = zb4Var;
        this.f = kb4Var;
        this.s = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.s;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(i2 | 1);
                jf0.h(this.b, this.c, this.d, this.e, this.f, (dd4) obj, iX0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                p7c.z(this.b, this.c, this.d, this.e, this.f, (dd4) obj, iX02);
                break;
        }
        return hebVar;
    }
}

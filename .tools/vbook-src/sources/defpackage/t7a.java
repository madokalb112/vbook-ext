package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class t7a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ pj7 c;
    public final /* synthetic */ ou6 d;
    public final /* synthetic */ kb4 e;
    public final /* synthetic */ kb4 f;
    public final /* synthetic */ int s;

    public /* synthetic */ t7a(List list, pj7 pj7Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, int i, int i2) {
        this.a = i2;
        this.b = list;
        this.c = pj7Var;
        this.d = ou6Var;
        this.e = kb4Var;
        this.f = kb4Var2;
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
                sdc.W(this.b, this.c, this.d, this.e, this.f, (dd4) obj, iX0);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(i2 | 1);
                md2.m(this.b, this.c, this.d, this.e, this.f, (dd4) obj, iX02);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX03 = qu1.x0(i2 | 1);
                h67.a0(this.b, this.c, this.d, this.e, this.f, (dd4) obj, iX03);
                break;
        }
        return hebVar;
    }
}

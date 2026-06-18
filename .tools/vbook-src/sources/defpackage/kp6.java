package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class kp6 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ long c;
    public final /* synthetic */ kb4 d;

    public /* synthetic */ kp6(List list, long j, kb4 kb4Var, int i, int i2) {
        this.a = i2;
        this.b = list;
        this.c = j;
        this.d = kb4Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iX0 = qu1.x0(1);
                sp6.a(this.b, this.c, this.d, (dd4) obj, iX0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iX02 = qu1.x0(1);
                au6.c(this.b, this.c, this.d, (dd4) obj, iX02);
                break;
        }
        return hebVar;
    }
}

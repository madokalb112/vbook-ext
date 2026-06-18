package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class mx8 implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zk7 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ ou6 d;
    public final /* synthetic */ int e;

    public /* synthetic */ mx8(zk7 zk7Var, List list, ou6 ou6Var, int i, int i2) {
        this.a = i2;
        this.b = zk7Var;
        this.c = list;
        this.d = ou6Var;
        this.e = i;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = this.e;
        ou6 ou6Var = this.d;
        List list = this.c;
        zk7 zk7Var = this.b;
        dd4 dd4Var = (dd4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                qx8.a(zk7Var, list, ou6Var, dd4Var, qu1.x0(i2 | 1));
                break;
            default:
                fz1.K(zk7Var, list, ou6Var, dd4Var, qu1.x0(i2 | 1));
                break;
        }
        return hebVar;
    }
}

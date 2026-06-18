package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class bz4 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i45 b;

    public /* synthetic */ bz4(i45 i45Var, int i) {
        this.a = i;
        this.b = i45Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        i45 i45Var = this.b;
        switch (i) {
            case 0:
                List list = (List) i45Var.A.getValue();
                if (list == null) {
                    list = lc3.a;
                }
                if (i45Var.H < list.size() - 1) {
                    i45Var.u(i45Var.H + 1, 0.0f);
                }
                break;
            case 1:
                int i2 = i45Var.H;
                if (i2 > 0) {
                    i45Var.u(i2 - 1, 0.0f);
                }
                break;
            case 2:
                i45Var.getClass();
                za1 za1VarA = vtb.a(i45Var);
                aj2 aj2Var = rw2.a;
                i45Var.g(za1VarA, nh2.c, new yw3(i45Var, (jt1) null, 22));
                break;
            case 3:
                i45Var.getClass();
                za1 za1VarA2 = vtb.a(i45Var);
                aj2 aj2Var2 = rw2.a;
                i45Var.g(za1VarA2, nh2.c, new yw3(i45Var, (jt1) null, 22));
                break;
            default:
                int i3 = i45Var.H;
                za1 za1VarA3 = vtb.a(i45Var);
                aj2 aj2Var3 = rw2.a;
                i45Var.g(za1VarA3, nh2.c, new il(i3, null, i45Var));
                break;
        }
        return hebVar;
    }
}

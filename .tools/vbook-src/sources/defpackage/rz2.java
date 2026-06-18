package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class rz2 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xz2 b;

    public /* synthetic */ rz2(xz2 xz2Var, int i) {
        this.a = i;
        this.b = xz2Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = null;
        xz2 xz2Var = this.b;
        switch (i) {
            case 0:
                bi5 bi5Var = (bi5) obj;
                if (bi5Var != null) {
                    za1 za1VarA = vtb.a(xz2Var);
                    aj2 aj2Var = rw2.a;
                    xz2Var.g(za1VarA, nh2.c, new hl2(xz2Var, bi5Var, null, 2));
                }
                break;
            default:
                List list = (List) obj;
                list.getClass();
                za1 za1VarA2 = vtb.a(xz2Var);
                aj2 aj2Var2 = rw2.a;
                xz2Var.g(za1VarA2, nh2.c, new et1(xz2Var, list, jt1Var, 15));
                break;
        }
        return hebVar;
    }
}

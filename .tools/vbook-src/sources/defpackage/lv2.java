package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class lv2 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pz5 b;

    public /* synthetic */ lv2(pz5 pz5Var, int i) {
        this.a = i;
        this.b = pz5Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        jt1 jt1Var = null;
        heb hebVar = heb.a;
        pz5 pz5Var = this.b;
        switch (i) {
            case 0:
                pz5Var.E();
                return hebVar;
            case 1:
                if (!pz5Var.P && pz5Var.Q) {
                    za1 za1VarA = vtb.a(pz5Var);
                    aj2 aj2Var = rw2.a;
                    pz5Var.g(za1VarA, nh2.c, new mz5(pz5Var, jt1Var, i2));
                }
                return hebVar;
            case 2:
                pz5Var.E();
                return hebVar;
            case 3:
                if (!pz5Var.P && pz5Var.Q) {
                    za1 za1VarA2 = vtb.a(pz5Var);
                    aj2 aj2Var2 = rw2.a;
                    pz5Var.g(za1VarA2, nh2.c, new mz5(pz5Var, jt1Var, i2));
                }
                return hebVar;
            default:
                Collection collectionValues = pz5Var.R.values();
                collectionValues.getClass();
                return fc1.D0(fc1.S0(collectionValues, 5), " ", null, null, new rv5(10), 30);
        }
    }
}

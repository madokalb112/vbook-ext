package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class zu2 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jv2 b;

    public /* synthetic */ zu2(jv2 jv2Var, int i) {
        this.a = i;
        this.b = jv2Var;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = null;
        jv2 jv2Var = this.b;
        switch (i) {
            case 0:
                yd5 yd5Var = jv2Var.V;
                if (yd5Var != null) {
                    yd5Var.cancel(null);
                }
                za1 za1VarA = vtb.a(jv2Var);
                aj2 aj2Var = rw2.a;
                jv2Var.V = jv2Var.g(za1VarA, nh2.c, new ev2(jv2Var, jt1Var, 3));
                return hebVar;
            case 1:
                if (!jv2Var.P && jv2Var.Q) {
                    za1 za1VarA2 = vtb.a(jv2Var);
                    aj2 aj2Var2 = rw2.a;
                    jv2Var.V = jv2Var.g(za1VarA2, nh2.c, new ev2(jv2Var, jt1Var, 1));
                }
                return hebVar;
            default:
                Collection collectionValues = jv2Var.R.values();
                collectionValues.getClass();
                return fc1.D0(fc1.S0(collectionValues, 5), " ", null, null, new gq2(6), 30);
        }
    }
}

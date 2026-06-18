package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class kz2 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pz2 b;
    public final /* synthetic */ List c;

    public /* synthetic */ kz2(pz2 pz2Var, List list, int i) {
        this.a = i;
        this.b = pz2Var;
        this.c = list;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = 0;
        List list = this.c;
        pz2 pz2Var = this.b;
        switch (i) {
            case 0:
                ((u2b) obj).getClass();
                m62 m62Var = pz2Var.a;
                m62Var.t.K();
                for (Object obj2 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        gc1.i0();
                        throw null;
                    }
                    az2 az2Var = (az2) obj2;
                    n92 n92Var = m62Var.t;
                    String str = az2Var.a;
                    String str2 = az2Var.b;
                    String str3 = az2Var.c;
                    boolean z = az2Var.d;
                    long j = i2;
                    qa1 qa1Var = r95.a;
                    n92Var.S(new fa2(str, str2, str3, z, j, qa1Var.k().c(), qa1Var.k().c()));
                    i2 = i3;
                }
                return hebVar;
            default:
                ((u2b) obj).getClass();
                m62 m62Var2 = pz2Var.a;
                m62Var2.t.K();
                if (list != null) {
                    for (Object obj3 : list) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            gc1.i0();
                            throw null;
                        }
                        dz2 dz2Var = (dz2) obj3;
                        n92 n92Var2 = m62Var2.t;
                        String strP = wm9.p();
                        String str4 = dz2Var.a;
                        String str5 = dz2Var.b;
                        boolean z2 = dz2Var.c;
                        long j2 = i2;
                        qa1 qa1Var2 = r95.a;
                        n92Var2.S(new fa2(strP, str4, str5, z2, j2, qa1Var2.k().c(), qa1Var2.k().c()));
                        i2 = i4;
                    }
                }
                return hebVar;
        }
    }
}

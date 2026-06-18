package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class zc9 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd9 b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ kb4 d;

    public /* synthetic */ zc9(gd9 gd9Var, kb4 kb4Var, kb4 kb4Var2, int i) {
        this.a = i;
        this.b = gd9Var;
        this.c = kb4Var;
        this.d = kb4Var2;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                aq5 aq5Var = (aq5) obj;
                aq5Var.getClass();
                gd9 gd9Var = this.b;
                List list = gd9Var.b;
                aq5Var.c0(list.size(), new kt6(16, new qc9(12), list), (yb4) null, new kt6(17, new qc9(13), list), new rj1(new bd9(list, gd9Var, this.c, this.d, 1), true, -1117249557));
                break;
            case 1:
                aq5 aq5Var2 = (aq5) obj;
                aq5Var2.getClass();
                List list2 = this.b.b;
                aq5Var2.c0(list2.size(), new kt6(20, new qc9(14), list2), (yb4) null, new kt6(21, new qc9(7), list2), new rj1(new xq3(list2, this.c, this.d, 6), true, -1117249557));
                break;
            case 2:
                aq5 aq5Var3 = (aq5) obj;
                aq5Var3.getClass();
                gd9 gd9Var2 = this.b;
                List list3 = gd9Var2.b;
                aq5Var3.c0(list3.size(), new kt6(14, new qc9(8), list3), (yb4) null, new kt6(15, new qc9(9), list3), new rj1(new bd9(list3, gd9Var2, this.c, this.d, 0), true, -1117249557));
                break;
            default:
                aq5 aq5Var4 = (aq5) obj;
                aq5Var4.getClass();
                gd9 gd9Var3 = this.b;
                List list4 = gd9Var3.b;
                aq5Var4.c0(list4.size(), new kt6(18, new qc9(10), list4), (yb4) null, new kt6(19, new qc9(11), list4), new rj1(new bd9(list4, gd9Var3, this.c, this.d, 2), true, -1117249557));
                break;
        }
        return hebVar;
    }
}

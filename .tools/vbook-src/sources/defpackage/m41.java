package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class m41 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ m41(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 2;
        int i3 = 0;
        heb hebVar = heb.a;
        int i4 = 1;
        List list = this.b;
        switch (i) {
            case 0:
                at5 at5Var = (at5) obj;
                at5Var.getClass();
                at5Var.c0(list.size(), new f7(8, new k7(10), list), new g7(11, list), new rj1(new s41(i3, list, list), true, 2039820996));
                return hebVar;
            case 1:
                at5 at5Var2 = (at5) obj;
                at5Var2.getClass();
                at5Var2.c0(list.size(), new yq3(25, new zm6(1), list), new r54(23, list), new rj1(new uq2(i2, list), true, 802480018));
                return hebVar;
            case 2:
                at5 at5Var3 = (at5) obj;
                at5Var3.getClass();
                at5Var3.c0(list.size(), new kt6(7, new qp6(14), list), new js6(10, list), new rj1(new s41(i4, list, list), true, 2039820996));
                return hebVar;
            case 3:
                return ky0.r("recent_grid2_", ((ob9) list.get(((Integer) obj).intValue())).a);
            case 4:
                return ky0.r("recent_grid1_", ((ob9) list.get(((Integer) obj).intValue())).a);
            case 5:
                k96 k96Var = (k96) obj;
                k96Var.getClass();
                return (CharSequence) list.get(Integer.parseInt((String) ((i96) k96Var.a()).get(1)) - 1);
            default:
                aq5 aq5Var = (aq5) obj;
                aq5Var.getClass();
                aq5Var.c0(list.size(), new cea(6, new vw8(29, (byte) 0), list), (yb4) null, new js6(29, list), new rj1(new s41(i2, list, list), true, -1942245546));
                return hebVar;
        }
    }
}

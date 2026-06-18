package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class q54 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ kb4 d;

    public /* synthetic */ q54(List list, kb4 kb4Var, kb4 kb4Var2, int i) {
        this.a = i;
        this.b = list;
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
                se3 se3Var = new se3(21);
                List list = this.b;
                aq5Var.c0(list.size(), new yq3(3, se3Var, list), (yb4) null, new r54(0, list), new rj1(new xq3(list, this.c, this.d, 1), true, -1117249557));
                break;
            case 1:
                aq5 aq5Var2 = (aq5) obj;
                aq5Var2.getClass();
                vw8 vw8Var = new vw8(7, (byte) 0);
                List list2 = this.b;
                aq5Var2.c0(list2.size(), new kt6(26, vw8Var, list2), (yb4) null, new js6(19, list2), new rj1(new y7a(list2, list2, this.c, this.d, 0), true, -1942245546));
                break;
            case 2:
                aq5 aq5Var3 = (aq5) obj;
                aq5Var3.getClass();
                vw8 vw8Var2 = new vw8(8, (byte) 0);
                List list3 = this.b;
                aq5Var3.c0(list3.size(), new kt6(29, vw8Var2, list3), (yb4) null, new js6(22, list3), new rj1(new y7a(list3, list3, this.c, this.d, 1), true, -1942245546));
                break;
            case 3:
                aq5 aq5Var4 = (aq5) obj;
                aq5Var4.getClass();
                vw8 vw8Var3 = new vw8(9, (byte) 0);
                List list4 = this.b;
                aq5Var4.c0(list4.size(), new cea(0, vw8Var3, list4), (yb4) null, new js6(23, list4), new rj1(new y7a(list4, list4, this.c, this.d, 2), true, -1942245546));
                break;
            default:
                aq5 aq5Var5 = (aq5) obj;
                aq5Var5.getClass();
                vw8 vw8Var4 = new vw8(17, (byte) 0);
                List list5 = this.b;
                aq5Var5.c0(list5.size(), new cea(2, vw8Var4, list5), (yb4) null, new js6(24, list5), new rj1(new y7a(list5, list5, this.c, this.d, 3), true, -1942245546));
                break;
        }
        return hebVar;
    }
}

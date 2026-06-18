package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class qp0 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ kb4 c;

    public /* synthetic */ qp0(kb4 kb4Var, List list, int i) {
        this.a = i;
        this.c = kb4Var;
        this.b = list;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 1;
        heb hebVar = heb.a;
        kb4 kb4Var = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                aq5 aq5Var = (aq5) obj;
                aq5Var.getClass();
                aq5Var.c0(list.size(), new f7(3, new vi0(12), list), (yb4) null, new g7(6, list), new rj1(new fk0(list, kb4Var, 2), true, -1117249557));
                break;
            case 1:
                eu5 eu5Var = (eu5) obj;
                eu5Var.getClass();
                eu5.b0(eu5Var, list.size(), new rj1(new qs1(i2, kb4Var, list), true, 398555585));
                break;
            case 2:
                at5 at5Var = (at5) obj;
                at5Var.getClass();
                at5Var.c0(list.size(), new f7(27, new kx1(22, (byte) 0), list), new g7(26, list), new rj1(new np3(list, list, kb4Var, 0), true, 2039820996));
                break;
            case 3:
                at5 at5Var2 = (at5) obj;
                at5Var2.getClass();
                if (list.isEmpty()) {
                    at5.b0(at5Var2, "empty", gjb.q, 2);
                }
                at5Var2.c0(list.size(), (kb4) null, new r54(24, list), new rj1(new fk0(list, kb4Var, 8), true, 802480018));
                break;
            case 4:
                kb4Var.invoke(list.get(((Integer) obj).intValue()));
                break;
            case 5:
                kb4Var.invoke(list.get(((Integer) obj).intValue()));
                break;
            case 6:
                kb4Var.invoke(list.get(((Integer) obj).intValue()));
                break;
            case 7:
                kb4Var.invoke(list.get(((Integer) obj).intValue()));
                break;
            case 8:
                kb4Var.invoke(list.get(((Integer) obj).intValue()));
                break;
            default:
                at5 at5Var3 = (at5) obj;
                at5Var3.getClass();
                at5Var3.c0(list.size(), new kt6(24, new qc9(21), list), new js6(15, list), new rj1(new fk0(list, kb4Var, 9), true, 802480018));
                break;
        }
        return hebVar;
    }

    public /* synthetic */ qp0(List list, kb4 kb4Var, int i) {
        this.a = i;
        this.b = list;
        this.c = kb4Var;
    }
}

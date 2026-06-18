package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class w66 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ pj8 c;
    public final /* synthetic */ zb4 d;
    public final /* synthetic */ kb4 e;

    public /* synthetic */ w66(a07 a07Var, pj8 pj8Var, zb4 zb4Var, kb4 kb4Var, int i) {
        this.a = i;
        this.b = a07Var;
        this.c = pj8Var;
        this.d = zb4Var;
        this.e = kb4Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        at5 at5Var = (at5) obj;
        switch (i) {
            case 0:
                at5Var.getClass();
                a07 a07Var = this.b;
                List list = (List) a07Var.getValue();
                at5Var.c0(list.size(), new yq3(16, new uq4(9, (byte) 0), list), new r54(13, list), new rj1(new y66(list, this.c, a07Var, this.d, this.e, 0), true, 2039820996));
                break;
            default:
                at5Var.getClass();
                a07 a07Var2 = this.b;
                List list2 = (List) a07Var2.getValue();
                at5Var.c0(list2.size(), new kt6(9, new qp6(16), list2), new js6(12, list2), new rj1(new y66(list2, this.c, a07Var2, this.d, this.e, 1), true, 2039820996));
                break;
        }
        return hebVar;
    }
}

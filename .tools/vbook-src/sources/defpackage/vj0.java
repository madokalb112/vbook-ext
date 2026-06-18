package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class vj0 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xm3 b;
    public final /* synthetic */ kb4 c;

    public /* synthetic */ vj0(int i, xm3 xm3Var, kb4 kb4Var) {
        this.a = i;
        this.b = xm3Var;
        this.c = kb4Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        kb4 kb4Var = this.c;
        xm3 xm3Var = this.b;
        at5 at5Var = (at5) obj;
        switch (i) {
            case 0:
                at5Var.getClass();
                List list = xm3Var.f;
                at5Var.c0(list.size(), (kb4) null, new g7(2, list), new rj1(new fk0(list, kb4Var, 0), true, 802480018));
                break;
            default:
                at5Var.getClass();
                List list2 = xm3Var.f;
                at5Var.c0(list2.size(), (kb4) null, new r54(4, list2), new rj1(new fk0(list2, kb4Var, 3), true, 802480018));
                break;
        }
        return hebVar;
    }
}

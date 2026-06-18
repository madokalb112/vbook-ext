package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class bn3 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ kb4 d;

    public /* synthetic */ bn3(int i, kb4 kb4Var, String str, List list) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = kb4Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        kb4 kb4Var = this.d;
        String str = this.c;
        List list = this.b;
        at5 at5Var = (at5) obj;
        switch (i) {
            case 0:
                at5Var.getClass();
                at5Var.c0(list.size(), (kb4) null, new g7(25, list), new rj1(new sq6(1, kb4Var, str, list), true, 802480018));
                break;
            case 1:
                at5Var.getClass();
                at5Var.c0(list.size(), new yq3(27, new zm6(12), list), new r54(26, list), new rj1(new sq6(2, kb4Var, str, list), true, 802480018));
                break;
            case 2:
                at5Var.getClass();
                at5Var.c0(list.size(), (kb4) null, new r54(28, list), new rj1(new sq6(0, kb4Var, str, list), true, 802480018));
                break;
            default:
                at5Var.getClass();
                at5Var.c0(list.size(), new kt6(0, new ss6(4), list), new js6(3, list), new rj1(new sq6(3, kb4Var, str, list), true, 802480018));
                break;
        }
        return hebVar;
    }
}

package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class em6 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Set e;
    public final /* synthetic */ yb4 f;
    public final /* synthetic */ kb4 s;

    public /* synthetic */ em6(a07 a07Var, a07 a07Var2, String str, Set set, yb4 yb4Var, kb4 kb4Var, int i) {
        this.a = i;
        this.b = a07Var;
        this.c = a07Var2;
        this.d = str;
        this.e = set;
        this.f = yb4Var;
        this.s = kb4Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.c;
        a07 a07Var2 = this.b;
        at5 at5Var = (at5) obj;
        switch (i) {
            case 0:
                at5Var.getClass();
                if (((wga) a07Var2.getValue()).a.b.length() > 0 && ((List) a07Var.getValue()).isEmpty()) {
                    at5.b0(at5Var, "search_empty", h67.i, 2);
                }
                List list = (List) a07Var.getValue();
                at5Var.c0(list.size(), new yq3(22, new rv5(27), list), new r54(21, list), new rj1(new ym6(0, this.s, this.f, this.d, list, this.e), true, 802480018));
                break;
            default:
                at5Var.getClass();
                if (((wga) a07Var2.getValue()).a.b.length() > 0 && ((List) a07Var.getValue()).isEmpty()) {
                    at5.b0(at5Var, "search_empty", s32.r, 2);
                }
                List list2 = (List) a07Var.getValue();
                at5Var.c0(list2.size(), new yq3(28, new zm6(29), list2), new r54(29, list2), new rj1(new ym6(1, this.s, this.f, this.d, list2, this.e), true, 802480018));
                break;
        }
        return hebVar;
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class pb3 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a07 b;
    public final /* synthetic */ kj8 c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ kb4 e;

    public /* synthetic */ pb3(a07 a07Var, kj8 kj8Var, kb4 kb4Var, kb4 kb4Var2, int i) {
        this.a = i;
        this.b = a07Var;
        this.c = kj8Var;
        this.d = kb4Var;
        this.e = kb4Var2;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                aq5 aq5Var = (aq5) obj;
                aq5Var.getClass();
                a07 a07Var = this.b;
                List list = (List) a07Var.getValue();
                aq5Var.c0(list.size(), new f7(22, new kx1(18, (byte) 0), list), (yb4) null, new g7(24, list), new rj1(new rb3(list, this.c, a07Var, this.d, this.e), true, -1942245546));
                break;
            default:
                aq5 aq5Var2 = (aq5) obj;
                aq5Var2.getClass();
                a07 a07Var2 = this.b;
                List list2 = (List) a07Var2.getValue();
                aq5Var2.c0(list2.size(), new js6(new h1a(4), list2), (yb4) null, new js6(18, list2), new rj1(new rb3(list2, this.c, this.d, this.e, a07Var2), true, -1117249557));
                break;
        }
        return hebVar;
    }
}

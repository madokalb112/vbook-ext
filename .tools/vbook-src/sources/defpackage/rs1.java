package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class rs1 implements kb4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ kb4 e;
    public final /* synthetic */ kb4 f;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ rs1(pj8 pj8Var, boolean z, kb4 kb4Var, boolean z2, kb4 kb4Var2, a07 a07Var, kb4 kb4Var3) {
        this.s = pj8Var;
        this.b = z;
        this.d = kb4Var;
        this.c = z2;
        this.e = kb4Var2;
        this.t = a07Var;
        this.f = kb4Var3;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj2 = this.t;
        Object obj3 = this.s;
        switch (i) {
            case 0:
                pj8 pj8Var = (pj8) obj3;
                a07 a07Var = (a07) obj2;
                at5 at5Var = (at5) obj;
                at5Var.getClass();
                at5.b0(at5Var, "highlight", new rj1(new rp0(pj8Var, this.b, this.d, this.c, this.e), true, 1323484486), 2);
                List list = (List) a07Var.getValue();
                at5Var.c0(list.size(), new f7(9, new qk1(28), list), new g7(12, list), new rj1(new l90(list, pj8Var, a07Var, this.f), true, 2039820996));
                break;
            default:
                List list2 = (List) obj3;
                at5 at5Var2 = (at5) obj;
                at5Var2.getClass();
                rv5 rv5Var = new rv5(24);
                at5Var2.c0(list2.size(), new yq3(19, rv5Var, list2), new r54(14, list2), new rj1(new xf6(list2, this.c, this.d, this.e, this.f, (kb4) obj2), true, 802480018));
                if (this.b) {
                    at5.b0(at5Var2, "load_more", s32.k, 2);
                }
                break;
        }
        return hebVar;
    }

    public /* synthetic */ rs1(List list, boolean z, boolean z2, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4) {
        this.s = list;
        this.b = z;
        this.c = z2;
        this.d = kb4Var;
        this.e = kb4Var2;
        this.f = kb4Var3;
        this.t = kb4Var4;
    }
}

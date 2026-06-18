package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class n64 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r64 b;

    public /* synthetic */ n64(r64 r64Var, int i) {
        this.a = i;
        this.b = r64Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = null;
        r64 r64Var = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                if (!list.isEmpty()) {
                    qtb.h(r64Var, vtb.a(r64Var), new gb3(list, r64Var, (jt1) null));
                }
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                za1 za1VarA = vtb.a(r64Var);
                aj2 aj2Var = rw2.a;
                r64Var.g(za1VarA, nh2.c, new hl2(r64Var, str, null, 24));
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                za1 za1VarA2 = vtb.a(r64Var);
                aj2 aj2Var2 = rw2.a;
                r64Var.g(za1VarA2, nh2.c, new yw3(r64Var, str2, jt1Var, 9));
                break;
        }
        return hebVar;
    }
}

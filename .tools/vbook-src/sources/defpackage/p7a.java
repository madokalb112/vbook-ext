package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class p7a implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8a b;

    public /* synthetic */ p7a(h8a h8aVar, int i) {
        this.a = i;
        this.b = h8aVar;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        int i3 = 2;
        int i4 = 1;
        heb hebVar = heb.a;
        jt1 jt1Var = null;
        h8a h8aVar = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                if (!list.isEmpty()) {
                    za1 za1VarA = vtb.a(h8aVar);
                    aj2 aj2Var = rw2.a;
                    h8aVar.g(za1VarA, nh2.c, new b69(h8aVar, list, null, 19));
                }
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                za1 za1VarA2 = vtb.a(h8aVar);
                aj2 aj2Var2 = rw2.a;
                h8aVar.g(za1VarA2, nh2.c, new g8a(h8aVar, str, jt1Var, i2));
                break;
            case 2:
                List list2 = (List) obj;
                list2.getClass();
                za1 za1VarA3 = vtb.a(h8aVar);
                aj2 aj2Var3 = rw2.a;
                h8aVar.g(za1VarA3, nh2.c, new c69(h8aVar, list2, jt1Var, i3));
                break;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                za1 za1VarA4 = vtb.a(h8aVar);
                aj2 aj2Var4 = rw2.a;
                h8aVar.g(za1VarA4, nh2.c, new f8a(h8aVar, zBooleanValue, jt1Var, i4));
                break;
            case 4:
                ih9 ih9Var = (ih9) obj;
                ih9Var.getClass();
                String str2 = ih9Var.a;
                str2.getClass();
                za1 za1VarA5 = vtb.a(h8aVar);
                aj2 aj2Var5 = rw2.a;
                h8aVar.g(za1VarA5, nh2.c, new g8a(h8aVar, str2, jt1Var, i4));
                break;
            case 5:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                za1 za1VarA6 = vtb.a(h8aVar);
                aj2 aj2Var6 = rw2.a;
                h8aVar.g(za1VarA6, nh2.c, new f8a(h8aVar, zBooleanValue2, jt1Var, 4));
                break;
            case 6:
                boolean z = !((Boolean) obj).booleanValue();
                za1 za1VarA7 = vtb.a(h8aVar);
                aj2 aj2Var7 = rw2.a;
                h8aVar.g(za1VarA7, nh2.c, new f8a(h8aVar, z, jt1Var, i2));
                break;
            case 7:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                za1 za1VarA8 = vtb.a(h8aVar);
                aj2 aj2Var8 = rw2.a;
                h8aVar.g(za1VarA8, nh2.c, new f8a(h8aVar, zBooleanValue3, jt1Var, i3));
                break;
            default:
                boolean z2 = !((Boolean) obj).booleanValue();
                za1 za1VarA9 = vtb.a(h8aVar);
                aj2 aj2Var9 = rw2.a;
                h8aVar.g(za1VarA9, nh2.c, new f8a(h8aVar, z2, jt1Var, 3));
                break;
        }
        return hebVar;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class tq3 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sr3 b;

    public /* synthetic */ tq3(sr3 sr3Var, int i) {
        this.a = i;
        this.b = sr3Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 2;
        int i3 = 3;
        heb hebVar = heb.a;
        jt1 jt1Var = null;
        sr3 sr3Var = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                qtb.h(sr3Var, vtb.a(sr3Var), new pr3(sr3Var, str, jt1Var, i2));
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                sr3Var.x = str2;
                sr3Var.g(vtb.a(sr3Var), rw2.a, new nr3(sr3Var, jt1Var, i3));
                break;
            case 2:
                to3 to3Var = (to3) obj;
                to3Var.getClass();
                za1 za1VarA = vtb.a(sr3Var);
                aj2 aj2Var = rw2.a;
                sr3Var.g(za1VarA, nh2.c, new hl2(sr3Var, to3Var, null, 17));
                break;
            case 3:
                int iIntValue = ((Integer) obj).intValue();
                za1 za1VarA2 = vtb.a(sr3Var);
                aj2 aj2Var2 = rw2.a;
                sr3Var.g(za1VarA2, nh2.c, new tl0(sr3Var, iIntValue, (jt1) null, 2));
                break;
            case 4:
                String str3 = (String) obj;
                str3.getClass();
                za1 za1VarA3 = vtb.a(sr3Var);
                aj2 aj2Var3 = rw2.a;
                sr3Var.g(za1VarA3, nh2.c, new pr3(sr3Var, str3, jt1Var, 1));
                break;
            case 5:
                String str4 = (String) obj;
                str4.getClass();
                za1 za1VarA4 = vtb.a(sr3Var);
                aj2 aj2Var4 = rw2.a;
                sr3Var.g(za1VarA4, nh2.c, new pr3(sr3Var, str4, jt1Var, 0));
                break;
            case 6:
                bi5 bi5Var = (bi5) obj;
                if (bi5Var != null) {
                    za1 za1VarA5 = vtb.a(sr3Var);
                    aj2 aj2Var5 = rw2.a;
                    sr3Var.g(za1VarA5, nh2.c, new hl2(sr3Var, bi5Var, null, 16));
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                za1 za1VarA6 = vtb.a(sr3Var);
                aj2 aj2Var6 = rw2.a;
                sr3Var.g(za1VarA6, nh2.c, new lk0(sr3Var, zBooleanValue, null, 3));
                break;
        }
        return hebVar;
    }
}

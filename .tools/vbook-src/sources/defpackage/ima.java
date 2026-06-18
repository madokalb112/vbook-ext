package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class ima implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ joa b;

    public /* synthetic */ ima(joa joaVar, int i) {
        this.a = i;
        this.b = joaVar;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        joa joaVar = this.b;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                joaVar.getClass();
                za1 za1VarA = vtb.a(joaVar);
                aj2 aj2Var = rw2.a;
                joaVar.g(za1VarA, nh2.c, new foa(fFloatValue, joaVar, (jt1) null, 1));
                break;
            case 1:
                float fFloatValue2 = ((Float) obj).floatValue();
                joaVar.getClass();
                za1 za1VarA2 = vtb.a(joaVar);
                aj2 aj2Var2 = rw2.a;
                joaVar.g(za1VarA2, nh2.c, new foa(fFloatValue2, joaVar, (jt1) null, 2));
                break;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                joaVar.getClass();
                za1 za1VarA3 = vtb.a(joaVar);
                aj2 aj2Var3 = rw2.a;
                joaVar.g(za1VarA3, nh2.c, new bm4(joaVar, zBooleanValue, (jt1) null, 4));
                break;
            case 3:
                float fFloatValue3 = ((Float) obj).floatValue();
                joaVar.getClass();
                za1 za1VarA4 = vtb.a(joaVar);
                aj2 aj2Var4 = rw2.a;
                joaVar.g(za1VarA4, nh2.c, new foa(joaVar, fFloatValue3, (jt1) null, 3));
                break;
            case 4:
                float fFloatValue4 = ((Float) obj).floatValue();
                joaVar.getClass();
                za1 za1VarA5 = vtb.a(joaVar);
                aj2 aj2Var5 = rw2.a;
                joaVar.g(za1VarA5, nh2.c, new foa(joaVar, fFloatValue4, (jt1) null, 3));
                break;
            default:
                float fFloatValue5 = ((Float) obj).floatValue();
                joaVar.getClass();
                za1 za1VarA6 = vtb.a(joaVar);
                aj2 aj2Var6 = rw2.a;
                joaVar.g(za1VarA6, nh2.c, new foa(joaVar, fFloatValue5, (jt1) null, 0));
                break;
        }
        return hebVar;
    }
}

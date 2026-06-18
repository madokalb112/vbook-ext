package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mca extends o1a implements ac4 {
    public int a;
    public /* synthetic */ String b;
    public /* synthetic */ String c;
    public /* synthetic */ String d;
    public final /* synthetic */ hra e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mca(hra hraVar, jt1 jt1Var) {
        super(4, jt1Var);
        this.e = hraVar;
    }

    @Override // defpackage.ac4
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        mca mcaVar = new mca(this.e, (jt1) obj4);
        mcaVar.b = (String) obj;
        mcaVar.c = (String) obj2;
        mcaVar.d = (String) obj3;
        return mcaVar.invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return obj;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = 1;
        Object objJ0 = this.e.J0(str, str2, str3, this);
        xx1 xx1Var = xx1.a;
        return objJ0 == xx1Var ? xx1Var : objJ0;
    }
}

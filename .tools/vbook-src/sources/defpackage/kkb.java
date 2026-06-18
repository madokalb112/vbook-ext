package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kkb extends o1a implements kb4 {
    public int a;
    public final /* synthetic */ pkb b;
    public final /* synthetic */ yn7 c;
    public final /* synthetic */ yn7 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ lm8 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkb(pkb pkbVar, yn7 yn7Var, yn7 yn7Var2, boolean z, lm8 lm8Var, jt1 jt1Var) {
        super(1, jt1Var);
        this.b = pkbVar;
        this.c = yn7Var;
        this.d = yn7Var2;
        this.e = z;
        this.f = lm8Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        return new kkb(this.b, this.c, this.d, this.e, this.f, jt1Var);
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        return ((kkb) create((jt1) obj)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        if (i != 0) {
            if (i == 1) {
                e11.e0(obj);
                return hebVar;
            }
            gp.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e11.e0(obj);
        String strA = this.c.a();
        this.a = 1;
        pkb pkbVar = this.b;
        pkbVar.getClass();
        Object objA0 = wx1.a0(new z42(this.e, pkbVar, this.d, this.f, strA, null), this);
        xx1 xx1Var = xx1.a;
        if (objA0 != xx1Var) {
            objA0 = hebVar;
        }
        return objA0 == xx1Var ? xx1Var : hebVar;
    }
}

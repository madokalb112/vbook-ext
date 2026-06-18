package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a5a extends o1a implements kb4 {
    public int a;
    public final /* synthetic */ f5a b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ j5a t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5a(f5a f5aVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, j5a j5aVar, jt1 jt1Var) {
        super(1, jt1Var);
        this.b = f5aVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.s = z5;
        this.t = j5aVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(jt1 jt1Var) {
        return new a5a(this.b, this.c, this.d, this.e, this.f, this.s, this.t, jt1Var);
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        return ((a5a) create((jt1) obj)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i == 0) {
            e11.e0(obj);
            e4a e4aVar = this.b.b;
            this.a = 1;
            obj = e4aVar.b.c(this.c, this.d, this.e, this.f, this.s, this.t, this);
            xx1 xx1Var = xx1.a;
            if (obj == xx1Var) {
                return xx1Var;
            }
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e11.e0(obj);
        }
        return (String) obj;
    }
}

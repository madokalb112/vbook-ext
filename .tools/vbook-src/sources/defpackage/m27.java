package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class m27 extends o1a implements yb4 {
    public int a;
    public final /* synthetic */ o27 b;
    public final /* synthetic */ w1b c;
    public final /* synthetic */ long d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m27(o27 o27Var, w1b w1bVar, long j, boolean z, jt1 jt1Var) {
        super(2, jt1Var);
        this.b = o27Var;
        this.c = w1bVar;
        this.d = j;
        this.e = z;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new m27(this.b, this.c, this.d, this.e, jt1Var);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((m27) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        kqb kqbVar = this.b.a;
        int i = this.a;
        if (i == 0) {
            e11.e0(obj);
            krb krbVarA = o27.a(this.c);
            this.a = 1;
            Object objB = kqbVar.b(krbVarA, (g20) null, this);
            xx1 xx1Var = xx1.a;
            if (objB == xx1Var) {
                return xx1Var;
            }
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e11.e0(obj);
        }
        long j = this.d;
        if (j > 0) {
            mc8 mc8Var = k63.b;
            kqbVar.a.E(k63.e(lx1.A0(j, o63.MILLISECONDS)));
        }
        if (this.e) {
            kqbVar.c();
        }
        return heb.a;
    }
}

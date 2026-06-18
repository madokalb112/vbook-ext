package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class k7c extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ n7c c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k7c(n7c n7cVar, long j, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = n7cVar;
        this.d = j;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new k7c(this.c, this.d, jt1Var, 0);
            default:
                return new k7c(this.c, this.d, jt1Var, 1);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((k7c) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        long j = this.d;
        xx1 xx1Var = xx1.a;
        n7c n7cVar = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    ym ymVar = n7cVar.i;
                    Float f = new Float(wlb.b(j));
                    od2 od2Var = n7cVar.a;
                    this.b = 1;
                    Object objD = ymVar.d();
                    s9b s9bVar = ymVar.a;
                    if (q07.a(ymVar.h, new vm(ymVar, f, new nd2(od2Var, s9bVar, objD, (vo) s9bVar.a.invoke(f)), ymVar.c.d, (kb4) null, (jt1) null), this) == xx1Var) {
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    ym ymVar2 = n7cVar.j;
                    Float f2 = new Float(wlb.c(j));
                    od2 od2Var2 = n7cVar.a;
                    this.b = 1;
                    Object objD2 = ymVar2.d();
                    s9b s9bVar2 = ymVar2.a;
                    if (q07.a(ymVar2.h, new vm(ymVar2, f2, new nd2(od2Var2, s9bVar2, objD2, (vo) s9bVar2.a.invoke(f2)), ymVar2.c.d, (kb4) null, (jt1) null), this) == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }
}

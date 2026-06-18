package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f62 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f62(Object obj, long j, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
        this.c = j;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                f62 f62Var = new f62((String) obj2, this.c, jt1Var, 0);
                f62Var.b = obj;
                return f62Var;
            case 1:
                f62 f62Var2 = new f62((fo8) obj2, this.c, jt1Var, 1);
                f62Var2.b = obj;
                return f62Var2;
            default:
                f62 f62Var3 = new f62((n7c) obj2, this.c, jt1Var, 2);
                f62Var3.b = obj;
                return f62Var3;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                ((f62) create((pz6) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 1:
                ((f62) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            default:
                return ((f62) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                e11.e0(obj);
                pz6 pz6Var = (pz6) this.b;
                e18 e18VarU = i12.U((String) obj2);
                Long l = new Long(this.c);
                pz6Var.getClass();
                pz6Var.f(e18VarU, l);
                return hebVar;
            case 1:
                vx1 vx1Var = (vx1) this.b;
                e11.e0(obj);
                fo8 fo8Var = (fo8) obj2;
                oq9 oq9Var = fo8Var.w;
                jt1 jt1Var = null;
                if (oq9Var != null) {
                    oq9Var.cancel(null);
                }
                fo8Var.w = ah1.J(vx1Var, null, null, new em(fo8Var, this.c, jt1Var, 3), 3);
                return hebVar;
            default:
                vx1 vx1Var2 = (vx1) this.b;
                e11.e0(obj);
                n7c n7cVar = (n7c) obj2;
                n7cVar.p = (yd5) vx1Var2.q().get(s00.s);
                long j = this.c;
                jt1 jt1Var2 = null;
                ah1.J(vx1Var2, null, null, new k7c(n7cVar, j, jt1Var2, 0), 3);
                return ah1.J(vx1Var2, null, null, new k7c(n7cVar, j, jt1Var2, 1), 3);
        }
    }
}

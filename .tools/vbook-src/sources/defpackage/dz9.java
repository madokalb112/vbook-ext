package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dz9 extends o1a implements yb4 {
    public ah8 a;
    public q05 b;
    public long c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ty9 f;
    public final /* synthetic */ ah8 s;
    public final /* synthetic */ q05 t;
    public final /* synthetic */ long u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dz9(ty9 ty9Var, ah8 ah8Var, q05 q05Var, long j, jt1 jt1Var) {
        super(2, jt1Var);
        this.f = ty9Var;
        this.s = ah8Var;
        this.t = q05Var;
        this.u = j;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        dz9 dz9Var = new dz9(this.f, this.s, this.t, this.u, jt1Var);
        dz9Var.e = obj;
        return dz9Var;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((dz9) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object pm8Var;
        ah8 ah8Var;
        q05 q05Var;
        ty9 ty9Var;
        long j;
        int i = this.d;
        try {
            if (i == 0) {
                e11.e0(obj);
                ty9 ty9Var2 = this.f;
                ah8Var = this.s;
                q05Var = this.t;
                long j2 = this.u;
                q25 q25Var = ty9Var2.a;
                this.e = ty9Var2;
                this.a = ah8Var;
                this.b = q05Var;
                this.c = j2;
                this.d = 1;
                Object objA = q25Var.a(this);
                xx1 xx1Var = xx1.a;
                if (objA == xx1Var) {
                    return xx1Var;
                }
                obj = objA;
                ty9Var = ty9Var2;
                j = j2;
            } else {
                if (i != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = this.c;
                q05Var = this.b;
                ah8Var = this.a;
                ty9Var = (ty9) this.e;
                e11.e0(obj);
            }
            bh8 bh8VarA = ah8Var.a(ty9Var, (s25) obj);
            try {
                q05 q05VarO0 = bh8VarA.o0();
                if (q05Var == null || !q05Var.equals(q05VarO0)) {
                    mi9.f(q05VarO0, ah8Var, j);
                }
                bh8VarA.j();
                pm8Var = bh8VarA;
            } catch (Exception e) {
                try {
                    j39.t(bh8VarA);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception unused) {
                }
                throw e;
            }
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        return new qm8(pm8Var);
    }
}

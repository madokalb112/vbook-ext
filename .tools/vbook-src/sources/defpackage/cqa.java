package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cqa extends o1a implements yb4 {
    public int a;
    public final /* synthetic */ hra b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqa(hra hraVar, int i, int i2, int i3, int i4, jt1 jt1Var) {
        super(2, jt1Var);
        this.b = hraVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new cqa(this.b, this.c, this.d, this.e, this.f, jt1Var);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((cqa) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i = this.a;
        if (i == 0) {
            e11.e0(obj);
            hra hraVar = this.b;
            qba qbaVar = hraVar.L;
            qba qbaVar2 = hraVar.L;
            x95 x95Var = ((xba) qbaVar).a.u;
            ni5[] ni5VarArr = zia.A;
            x95Var.e(ni5VarArr[22], Integer.valueOf(this.c));
            ((xba) qbaVar2).a.s.e(ni5VarArr[20], Integer.valueOf(this.d));
            ((xba) qbaVar2).a.t.e(ni5VarArr[21], Integer.valueOf(this.e));
            ((xba) qbaVar2).a.v.e(ni5VarArr[23], Integer.valueOf(this.f));
            fr9 fr9Var = hraVar.j0;
            if (fr9Var != null) {
                do {
                    value = fr9Var.getValue();
                } while (!fr9Var.j(value, yba.a((yba) value, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, false, 0.0f, false, false, 0, 0, 0, 0, false, false, false, false, false, 0.0f, this.d, this.e, this.c, this.f, 536870911, 0)));
            }
            this.a = 1;
            Object objL = hra.L(hraVar, this);
            xx1 xx1Var = xx1.a;
            if (objL == xx1Var) {
                return xx1Var;
            }
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e11.e0(obj);
        }
        return heb.a;
    }
}

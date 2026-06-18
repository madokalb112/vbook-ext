package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o5a extends o1a implements yb4 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ p5a c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5a(p5a p5aVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, jt1 jt1Var) {
        super(2, jt1Var);
        this.c = p5aVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.s = z4;
        this.t = z5;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        o5a o5aVar = new o5a(this.c, this.d, this.e, this.f, this.s, this.t, jt1Var);
        o5aVar.b = obj;
        return o5aVar;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((o5a) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object pm8Var;
        Object value;
        Object value2;
        Object value3;
        p5a p5aVar = this.c;
        pp1 pp1Var = p5aVar.e;
        fr9 fr9Var = p5aVar.d;
        int i = this.a;
        heb hebVar = heb.a;
        int i2 = 1;
        try {
            if (i == 0) {
                e11.e0(obj);
                if (fr9Var != null) {
                    do {
                        value3 = fr9Var.getValue();
                    } while (!fr9Var.j(value3, q5a.a((q5a) value3, 0L, null, null, false, false, null, null, false, null, this.d, this.e, this.f, this.s, this.t, 1279)));
                }
                boolean z = this.d;
                boolean z2 = this.e;
                boolean z3 = this.f;
                boolean z4 = this.s;
                boolean z5 = this.t;
                z4a z4aVar = p5aVar.c;
                j5a j5aVar = new j5a(p5aVar, i2);
                this.b = null;
                this.a = 1;
                Object objA = ((f5a) z4aVar).a(z, z2, z3, z4, z5, j5aVar, this);
                xx1 xx1Var = xx1.a;
                if (objA == xx1Var) {
                    return xx1Var;
                }
            } else {
                if (i != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
            }
            pm8Var = hebVar;
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        if (!(pm8Var instanceof pm8)) {
            p5aVar.i(pp1Var, i3a.a);
        }
        Throwable thA = qm8.a(pm8Var);
        if (thA != null) {
            jf0.A(thA);
            p5aVar.i(pp1Var, h3a.a);
            if (fr9Var != null) {
                do {
                    value2 = fr9Var.getValue();
                } while (!fr9Var.j(value2, q5a.a((q5a) value2, 0L, null, null, false, false, null, null, true, null, false, false, false, false, false, 65023)));
            }
        }
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, q5a.a((q5a) value, 0L, null, null, false, false, null, null, false, null, false, false, false, false, false, 65279)));
        }
        return hebVar;
    }
}

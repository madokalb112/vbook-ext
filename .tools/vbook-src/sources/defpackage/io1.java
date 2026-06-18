package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class io1 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jo1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ io1(jo1 jo1Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.b = jo1Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        jo1 jo1Var = this.b;
        switch (i) {
            case 0:
                return new io1(jo1Var, jt1Var, 0);
            default:
                return new io1(jo1Var, jt1Var, 1);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                ((io1) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
            default:
                ((io1) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                break;
        }
        return hebVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        jt1 jt1Var = null;
        jo1 jo1Var = this.b;
        switch (i) {
            case 0:
                e11.e0(obj);
                fr9 fr9Var = jo1Var.b;
                qt qtVar = jo1Var.a;
                x95 x95Var = qtVar.u;
                ni5[] ni5VarArr = qt.T;
                Integer num = new Integer(((Number) x95Var.c(ni5VarArr[19], qtVar)).intValue());
                fr9Var.getClass();
                fr9Var.l(null, num);
                fr9 fr9Var2 = jo1Var.c;
                Integer num2 = new Integer(((Number) qtVar.v.c(ni5VarArr[20], qtVar)).intValue());
                fr9Var2.getClass();
                fr9Var2.l(null, num2);
                fr9 fr9Var3 = jo1Var.d;
                Integer num3 = new Integer(((Number) qtVar.w.c(ni5VarArr[21], qtVar)).intValue());
                fr9Var3.getClass();
                fr9Var3.l(null, num3);
                fr9 fr9Var4 = jo1Var.e;
                Integer num4 = new Integer(((Number) qtVar.s.c(ni5VarArr[17], qtVar)).intValue());
                fr9Var4.getClass();
                fr9Var4.l(null, num4);
                fr9 fr9Var5 = jo1Var.f;
                Boolean bool = (Boolean) qtVar.t.c(ni5VarArr[18], qtVar);
                bool.getClass();
                fr9Var5.getClass();
                fr9Var5.l(null, bool);
                break;
            default:
                e11.e0(obj);
                ah1.J(jo1Var.g, null, null, new io1(jo1Var, jt1Var, 0), 3);
                break;
        }
        return hebVar;
    }
}

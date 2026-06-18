package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class b97 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ c97 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b97(c97 c97Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = c97Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        c97 c97Var = this.c;
        switch (i) {
            case 0:
                return new b97(c97Var, jt1Var, 0);
            case 1:
                return new b97(c97Var, jt1Var, 1);
            default:
                return new b97(c97Var, jt1Var, 2);
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
        return ((b97) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        c97 c97Var = this.c;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    b92 b92Var = ((o87) c97Var.c).a.B;
                    b92Var.getClass();
                    wb2 wb2Var = wb2.a;
                    qj qjVar = (qj) ((yf1) b92Var).a;
                    rb2 rb2Var = new rb2(b92Var);
                    qjVar.getClass();
                    pp1 pp1VarR = qx1.R(new af9(-866601853, new String[]{"DbNotification"}, qjVar, "DbNotification.sq", "getAll", "SELECT DbNotification.id, DbNotification.type, DbNotification.content, DbNotification.createAt, DbNotification.read FROM DbNotification\nORDER BY read ASC, createAt DESC", rb2Var));
                    aj2 aj2Var = rw2.a;
                    y34 y34VarE = qx1.E(pp1VarR, nh2.c);
                    sg sgVar = new sg(c97Var, 26);
                    this.b = 1;
                    Object objA = y34VarE.a(new pw5(sgVar, 5), this);
                    if (objA != xx1Var) {
                        objA = hebVar;
                    }
                    if (objA == xx1Var) {
                    }
                }
                break;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    m87 m87Var = c97Var.c;
                    this.b = 1;
                    b92 b92Var2 = ((o87) m87Var).a.B;
                    ((qj) ((yf1) b92Var2).a).q(-527157538, "DELETE FROM DbNotification", (kb4) null);
                    b92Var2.w(-527157538, new pb2(4));
                    if (hebVar == xx1Var) {
                    }
                }
                break;
            default:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    m87 m87Var2 = c97Var.c;
                    this.b = 1;
                    b92 b92Var3 = ((o87) m87Var2).a.B;
                    ((qj) ((yf1) b92Var3).a).q(-570018684, "UPDATE DbNotification\nSET read = 1\nWHERE read = 0", (kb4) null);
                    b92Var3.w(-570018684, new pb2(5));
                    if (hebVar == xx1Var) {
                    }
                }
                break;
        }
        return hebVar;
    }
}

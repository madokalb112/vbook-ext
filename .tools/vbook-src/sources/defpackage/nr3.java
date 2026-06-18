package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class nr3 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ sr3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nr3(sr3 sr3Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = sr3Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        sr3 sr3Var = this.c;
        switch (i) {
            case 0:
                return new nr3(sr3Var, jt1Var, 0);
            case 1:
                return new nr3(sr3Var, jt1Var, 1);
            case 2:
                return new nr3(sr3Var, jt1Var, 2);
            default:
                return new nr3(sr3Var, jt1Var, 3);
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
        return ((nr3) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        Object tg3Var;
        int i = this.a;
        int i2 = 0;
        heb hebVar = heb.a;
        sr3 sr3Var = this.c;
        xx1 xx1Var = xx1.a;
        jt1 jt1Var = null;
        int i3 = 2;
        int i4 = 1;
        switch (i) {
            case 0:
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    gr3 gr3Var = sr3Var.d;
                    this.b = 1;
                    jr3 jr3Var = (jr3) gr3Var;
                    pp1 pp1VarR = qx1.R(jr3Var.a.z.P());
                    aj2 aj2Var = rw2.a;
                    tg3Var = new tg3(i4, qx1.E(pp1VarR, nh2.c), jr3Var);
                    if (tg3Var != xx1Var) {
                    }
                } else if (i5 == 1) {
                    e11.e0(obj);
                    tg3Var = obj;
                } else if (i5 != 2) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                mr3 mr3Var = new mr3(sr3Var, i2);
                this.b = 2;
                if (((b24) tg3Var).a(mr3Var, this) != xx1Var) {
                }
                break;
            case 1:
                int i6 = this.b;
                if (i6 == 0) {
                    e11.e0(obj);
                    b92 b92Var = ((cq3) sr3Var.c).a.x;
                    b92Var.getClass();
                    gb2 gb2Var = gb2.a;
                    qj qjVar = (qj) ((yf1) b92Var).a;
                    bb2 bb2Var = new bb2(b92Var, 3);
                    qjVar.getClass();
                    pp1 pp1VarR2 = qx1.R(new af9(762073805, new String[]{"DbExtension"}, qjVar, "DbExtension.sq", "getInstalledExtension", "SELECT id, name, author, version, source, path, description, language, type, nsfw, development, draft, pinedAt, updateAt\nFROM DbExtension\nWHERE draft = 0\nORDER BY pinedAt DESC, lastUse DESC, updateAt DESC", bb2Var));
                    aj2 aj2Var2 = rw2.a;
                    y34 y34VarE = qx1.E(pp1VarR2, nh2.c);
                    mr3 mr3Var2 = new mr3(sr3Var, i4);
                    this.b = 1;
                    Object objA = y34VarE.a(new gm0(mr3Var2, 8), this);
                    if (objA != xx1Var) {
                        objA = hebVar;
                    }
                    if (objA == xx1Var) {
                    }
                } else if (i6 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 2:
                int i7 = this.b;
                if (i7 == 0) {
                    e11.e0(obj);
                    io3 io3Var = sr3Var.e;
                    tg3 tg3VarH = cx1.H(new u31(((jo3) io3Var).c, 2), new u31(((jo3) io3Var).d, 2), new u31(((jo3) io3Var).b, 2), new u31(((jo3) io3Var).e, 2), new or3(5, i2, jt1Var));
                    mr3 mr3Var3 = new mr3(sr3Var, i3);
                    this.b = 1;
                    if (tg3VarH.a(mr3Var3, this) == xx1Var) {
                    }
                } else if (i7 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i8 = this.b;
                if (i8 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    if (sr3.k(sr3Var, this) == xx1Var) {
                    }
                } else if (i8 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }
}

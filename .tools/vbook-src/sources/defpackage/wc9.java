package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wc9 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ xc9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wc9(xc9 xc9Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = xc9Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        xc9 xc9Var = this.c;
        switch (i) {
            case 0:
                return new wc9(xc9Var, jt1Var, 0);
            case 1:
                return new wc9(xc9Var, jt1Var, 1);
            case 2:
                return new wc9(xc9Var, jt1Var, 2);
            case 3:
                return new wc9(xc9Var, jt1Var, 3);
            default:
                return new wc9(xc9Var, jt1Var, 4);
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
        return ((wc9) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        int i2 = 5;
        int i3 = 12;
        int i4 = 4;
        int i5 = 13;
        int i6 = 0;
        xx1 xx1Var = xx1.a;
        xc9 xc9Var = this.c;
        heb hebVar = heb.a;
        int i7 = 3;
        jt1 jt1Var = null;
        int i8 = 1;
        int i9 = 2;
        switch (i) {
            case 0:
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    fe8 fe8VarB = ((xw5) xc9Var.d).b();
                    u31 u31Var = new u31(xc9Var.s, 2);
                    u31 u31Var2 = new u31(xc9Var.t, 2);
                    u31 u31Var3 = new u31(xc9Var.u, 2);
                    u31 u31Var4 = new u31(xc9Var.v, 2);
                    uc9 uc9Var = new uc9(null);
                    b24[] b24VarArr = {fe8VarB, u31Var, u31Var2, u31Var3, u31Var4};
                    vc9 vc9Var = new vc9(xc9Var, i6);
                    this.b = 1;
                    Object objM0 = h67.m0(this, vc9Var, r90.d, new xa(jt1Var, (Object) uc9Var, i3), b24VarArr);
                    if (objM0 != xx1Var) {
                        objM0 = hebVar;
                    }
                    if (objM0 == xx1Var) {
                    }
                }
                break;
            case 1:
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    q11 q11VarI = ((j4b) xc9Var.e).i();
                    vc9 vc9Var2 = new vc9(xc9Var, i8);
                    this.b = 1;
                    if (q11VarI.a(vc9Var2, this) == xx1Var) {
                    }
                }
                break;
            case 2:
                int i12 = this.b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    b92 b92Var = ((uw5) xc9Var.c).a.b;
                    b92Var.getClass();
                    u82 u82Var = u82.a;
                    pp1 pp1VarR = qx1.R(new k82(b92Var, 20L, new b82(b92Var, i2), 0));
                    aj2 aj2Var = rw2.a;
                    kb3 kb3Var = new kb3(qx1.E(pp1VarR, nh2.c), 11);
                    u31 u31Var5 = new u31(xc9Var.w, 2);
                    f45 f45Var = new f45(i7, i8, jt1Var);
                    vc9 vc9Var3 = new vc9(xc9Var, i9);
                    this.b = 1;
                    Object objM02 = h67.m0(this, vc9Var3, r90.d, new xa((Object) f45Var, jt1Var, i5), new b24[]{kb3Var, u31Var5});
                    if (objM02 != xx1Var) {
                        objM02 = hebVar;
                    }
                    if (objM02 == xx1Var) {
                    }
                }
                break;
            case 3:
                int i13 = this.b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    b92 b92Var2 = ((uw5) xc9Var.c).a.b;
                    b92Var2.getClass();
                    v82 v82Var = v82.a;
                    pp1 pp1VarR2 = qx1.R(new k82(b92Var2, 20L, new b82(b92Var2, i7), 1));
                    aj2 aj2Var2 = rw2.a;
                    kb3 kb3Var2 = new kb3(qx1.E(pp1VarR2, nh2.c), 12);
                    u31 u31Var6 = new u31(xc9Var.w, 2);
                    f45 f45Var2 = new f45(i7, i9, jt1Var);
                    vc9 vc9Var4 = new vc9(xc9Var, i7);
                    this.b = 1;
                    Object objM03 = h67.m0(this, vc9Var4, r90.d, new xa((Object) f45Var2, jt1Var, i5), new b24[]{kb3Var2, u31Var6});
                    if (objM03 != xx1Var) {
                        objM03 = hebVar;
                    }
                    if (objM03 == xx1Var) {
                    }
                }
                break;
            default:
                int i14 = this.b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    b92 b92Var3 = ((uw5) xc9Var.c).a.b;
                    b92Var3.getClass();
                    t82 t82Var = t82.a;
                    qj qjVar = (qj) ((yf1) b92Var3).a;
                    b82 b82Var = new b82(b92Var3, 7);
                    qjVar.getClass();
                    pp1 pp1VarR3 = qx1.R(new af9(1401148740, new String[]{"DbBook"}, qjVar, "DbBook.sq", "getByLastAddNotView", "SELECT DbBook.id, DbBook.name, DbBook.author, DbBook.cover, DbBook.type, DbBook.format, DbBook.category, DbBook.language, DbBook.pathId, DbBook.path, DbBook.source, DbBook.extensionId, DbBook.status, DbBook.location, DbBook.description, DbBook.isNsfw, DbBook.lastReadChapterName, DbBook.lastReadChapterId, DbBook.lastReadChapterIndex, DbBook.lastReadChapterPercent, DbBook.totalChapter, DbBook.totalReadTime, DbBook.totalListenedTime, DbBook.follow, DbBook.favorite, DbBook.hidden, DbBook.pined, DbBook.newUpdateCount, DbBook.translate, DbBook.extras, DbBook.readScore, DbBook.lastUpdate, DbBook.lastRead, DbBook.createAt, DbBook.updateAt\nFROM DbBook\nWHERE location = 1 AND lastRead = 0\nORDER BY createAt DESC", b82Var));
                    aj2 aj2Var3 = rw2.a;
                    kb3 kb3Var3 = new kb3(qx1.E(pp1VarR3, nh2.c), 10);
                    u31 u31Var7 = new u31(xc9Var.w, 2);
                    f45 f45Var3 = new f45(i7, i7, jt1Var);
                    vc9 vc9Var5 = new vc9(xc9Var, i4);
                    this.b = 1;
                    Object objM04 = h67.m0(this, vc9Var5, r90.d, new xa((Object) f45Var3, jt1Var, i5), new b24[]{kb3Var3, u31Var7});
                    if (objM04 != xx1Var) {
                        objM04 = hebVar;
                    }
                    if (objM04 == xx1Var) {
                    }
                }
                break;
        }
        return hebVar;
    }
}

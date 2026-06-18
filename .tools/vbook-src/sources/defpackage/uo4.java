package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uo4 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ vo4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uo4(vo4 vo4Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = vo4Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        vo4 vo4Var = this.c;
        switch (i) {
            case 0:
                return new uo4(vo4Var, jt1Var, 0);
            case 1:
                return new uo4(vo4Var, jt1Var, 1);
            case 2:
                return new uo4(vo4Var, jt1Var, 2);
            default:
                return new uo4(vo4Var, jt1Var, 3);
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
        return ((uo4) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        xx1 xx1Var = xx1.a;
        vo4 vo4Var = this.c;
        heb hebVar = heb.a;
        int i2 = 0;
        int i3 = 1;
        switch (i) {
            case 0:
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
                    qj qjVar = (qj) ((yf1) ((p13) vo4Var.e).a.u).a;
                    q92 q92Var = new q92(24);
                    qjVar.getClass();
                    pp1 pp1VarR = qx1.R(new af9(-1325179802, new String[]{"DbDownload"}, qjVar, "DbDownload.sq", "getDownloadCount", "SELECT COUNT(*)\nFROM DbDownload\nWHERE status = 0 OR status = 1 OR status = 2", q92Var));
                    aj2 aj2Var = rw2.a;
                    y34 y34VarF = qx1.F(pp1VarR, nh2.c);
                    to4 to4Var = new to4(vo4Var, 0);
                    this.b = 1;
                    if (y34VarF.a(to4Var, this) == xx1Var) {
                    }
                }
                break;
            case 1:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    i13 i13Var = vo4Var.e;
                    this.b = 1;
                    if (((p13) i13Var).d(this) == xx1Var) {
                    }
                }
                break;
            case 2:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    fe8 fe8VarB = ((xw5) vo4Var.c).b();
                    to4 to4Var2 = new to4(vo4Var, i3);
                    this.b = 1;
                    if (fe8VarB.a.a(to4Var2, this) == xx1Var) {
                    }
                }
                break;
            default:
                aw5 aw5Var = vo4Var.d;
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                    }
                    break;
                } else {
                    e11.e0(obj);
                    qj qjVar2 = (qj) ((yf1) ((uw5) aw5Var).a.b).a;
                    hu1 hu1Var = new hu1(7);
                    qjVar2.getClass();
                    pp1 pp1VarR2 = qx1.R(new af9(647714544, new String[]{"DbBook"}, qjVar2, "DbBook.sq", "countShelfAll", "SELECT COUNT(*)\nFROM DbBook\nWHERE location = 1", hu1Var));
                    aj2 aj2Var2 = rw2.a;
                    nh2 nh2Var = nh2.c;
                    y34 y34VarF2 = qx1.F(pp1VarR2, nh2Var);
                    b92 b92Var = ((uw5) aw5Var).a.b;
                    b92Var.getClass();
                    int i8 = 8;
                    y34 y34Var = new y34(qx1.R(new h82(b92Var, i3, new hu1(i8), i2)), nh2Var, 1);
                    b92 b92Var2 = ((uw5) aw5Var).a.b;
                    b92Var2.getClass();
                    y34 y34Var2 = new y34(qx1.R(new h82(b92Var2, 2, new hu1(i8), i2)), nh2Var, 1);
                    b92 b92Var3 = ((uw5) aw5Var).a.b;
                    List listZ = gc1.Z(21, 11, 13, 14, 12, 16, 17, 18, 22);
                    b92Var3.getClass();
                    y34 y34Var3 = new y34(qx1.R(new g82(b92Var3, listZ, new hu1(9))), nh2Var, 1);
                    b92 b92Var4 = ((uw5) aw5Var).a.b;
                    b92Var4.getClass();
                    y34 y34Var4 = new y34(qx1.R(new h82(b92Var4, 4, new hu1(i8), 0)), nh2Var, 1);
                    b92 b92Var5 = ((uw5) aw5Var).a.b;
                    b92Var5.getClass();
                    b24[] b24VarArr = {y34VarF2, y34Var, y34Var2, y34Var3, y34Var4, new y34(qx1.R(new h82(b92Var5, 3, new hu1(8), 0)), nh2Var, 1)};
                    this.b = 1;
                    Object objM0 = h67.m0(this, s77.a, new r90(b24VarArr, 8), new xa((jt1) null, vo4Var, 16), b24VarArr);
                    if (objM0 != xx1Var) {
                        objM0 = hebVar;
                    }
                    if (objM0 != xx1Var) {
                        objM0 = hebVar;
                    }
                    if (objM0 == xx1Var) {
                    }
                }
                break;
        }
        return hebVar;
    }
}

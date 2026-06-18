package defpackage;

import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lib extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ mib c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lib(mib mibVar, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = mibVar;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        mib mibVar = this.c;
        switch (i) {
            case 0:
                return new lib(mibVar, jt1Var, 0);
            case 1:
                return new lib(mibVar, jt1Var, 1);
            default:
                return new lib(mibVar, jt1Var, 2);
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
        return ((lib) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        mib mibVar = this.c;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    fr9 fr9Var = ((hib) mibVar.c).d;
                    kib kibVar = new kib(mibVar, 0);
                    this.b = 1;
                    fr9Var.a(kibVar, this);
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 1:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    qj qjVar = (qj) ((yf1) ((o87) mibVar.e).a.B).a;
                    pb2 pb2Var = new pb2(7);
                    qjVar.getClass();
                    pp1 pp1VarR = qx1.R(new af9(-1424942206, new String[]{"DbNotification"}, qjVar, "DbNotification.sq", "getUnreadCount", "SELECT COUNT(*) FROM DbNotification\nWHERE read = 0", pb2Var));
                    aj2 aj2Var = rw2.a;
                    y34 y34VarF = qx1.F(pp1VarR, nh2.c);
                    kib kibVar2 = new kib(mibVar, i2);
                    this.b = 1;
                    if (y34VarF.a(kibVar2, this) == xx1Var) {
                    }
                } else if (i4 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    aib aibVar = mibVar.c;
                    this.b = 1;
                    ((hib) aibVar).getClass();
                    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
                    firebaseAuth.getClass();
                    firebaseAuth.a();
                    if (hebVar == xx1Var) {
                    }
                } else if (i5 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return hebVar;
    }
}

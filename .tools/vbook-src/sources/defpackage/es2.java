package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class es2 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ rs2 c;
    public final /* synthetic */ List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ es2(rs2 rs2Var, List list, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = rs2Var;
        this.d = list;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        List list = this.d;
        rs2 rs2Var = this.c;
        switch (i) {
            case 0:
                return new es2(rs2Var, list, jt1Var, 0);
            case 1:
                return new es2(rs2Var, list, jt1Var, 1);
            case 2:
                return new es2(rs2Var, list, jt1Var, 2);
            default:
                return new es2(rs2Var, list, jt1Var, 3);
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
        return ((es2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        rs2 rs2Var = this.c;
        List list = this.d;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    t6b t6bVarA = rs2.a(rs2Var, list);
                    if (t6bVarA == xx1Var) {
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 1:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    t6b t6bVarA2 = rs2.a(rs2Var, list);
                    if (t6bVarA2 == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 2:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    t6b t6bVarK = rs2.k(list);
                    if (t6bVarK == xx1Var) {
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
                    this.b = 1;
                    t6b t6bVarK2 = rs2.k(list);
                    if (t6bVarK2 == xx1Var) {
                    }
                } else if (i5 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }
}

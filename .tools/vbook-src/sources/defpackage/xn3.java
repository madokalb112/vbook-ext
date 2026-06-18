package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xn3 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ yn3 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xn3(yn3 yn3Var, String str, String str2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = yn3Var;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        switch (this.a) {
            case 0:
                return new xn3(this.c, this.d, this.e, jt1Var, 0);
            default:
                return new xn3(this.c, this.d, this.e, jt1Var, 1);
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
        return ((xn3) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        String str = this.e;
        String str2 = this.d;
        yn3 yn3Var = this.c;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    qp3 qp3Var = yn3Var.d;
                    String str3 = yn3Var.c;
                    this.b = 1;
                    ((cq3) qp3Var).a.y.Z(new xa2(dx1.h(str3, "-", str2), str3, str2, str));
                    if (hebVar == xx1Var) {
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    qp3 qp3Var2 = yn3Var.d;
                    String str4 = yn3Var.c;
                    this.b = 1;
                    b92 b92Var = ((cq3) qp3Var2).a.x;
                    wa2 wa2Var = (wa2) b92Var.T(str4).e();
                    if (wa2Var != null) {
                        LinkedHashMap linkedHashMapJ0 = y86.j0(wa2Var.s);
                        linkedHashMapJ0.put(str2, str);
                        b92Var.getClass();
                        ((qj) ((yf1) b92Var).a).q(-2075492989, "UPDATE DbExtension\nSET settingData = ?\nWHERE id = ?", new v6(22, b92Var, linkedHashMapJ0, str4));
                        b92Var.w(-2075492989, new sa2(20));
                    }
                    if (hebVar == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }
}

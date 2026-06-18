package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ze2 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ cf2 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ze2(cf2 cf2Var, String str, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = cf2Var;
        this.d = str;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        String str = this.d;
        cf2 cf2Var = this.c;
        switch (i) {
            case 0:
                return new ze2(cf2Var, str, jt1Var, 0);
            default:
                return new ze2(cf2Var, str, jt1Var, 1);
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
        return ((ze2) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        cf2 cf2Var = this.c;
        String str = this.d;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    qp3 qp3Var = cf2Var.d;
                    this.b = 1;
                    obj = ((cq3) qp3Var).c(str, this);
                    if (obj == xx1Var) {
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                if (((vm3) obj) == null) {
                    cf2Var.i(cf2Var.f, new ue2(str));
                } else {
                    cf2Var.i(cf2Var.f, new ne2(str));
                }
                break;
            default:
                pp1 pp1Var = cf2Var.f;
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    wp3 wp3VarH = ((uw5) cf2Var.c).h(str);
                    this.b = 1;
                    obj = cx1.P(wp3VarH, this);
                    if (obj == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                zv5 zv5Var = (zv5) obj;
                if (zv5Var == null) {
                    Context context = kl8.D;
                    context.getClass();
                    cf2Var.i(pp1Var, new pe2(new sl(context, str)));
                } else {
                    cf2Var.i(pp1Var, new oe2(zv5Var.a));
                }
                break;
        }
        return hebVar;
    }
}

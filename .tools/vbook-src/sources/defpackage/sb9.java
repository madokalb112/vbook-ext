package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sb9 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ tb9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sb9(tb9 tb9Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = tb9Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        tb9 tb9Var = this.c;
        switch (i) {
            case 0:
                return new sb9(tb9Var, jt1Var, 0);
            default:
                return new sb9(tb9Var, jt1Var, 1);
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
        return ((sb9) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        xx1 xx1Var = xx1.a;
        tb9 tb9Var = this.c;
        heb hebVar = heb.a;
        jt1 jt1Var = null;
        switch (i) {
            case 0:
                aw5 aw5Var = tb9Var.e;
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
                    int i3 = 4;
                    tg3 tg3VarI = cx1.I(new fe8(((hib) tb9Var.d).d), new u31(((uw5) aw5Var).g(tb9Var.c), 2), ((uw5) aw5Var).f(), new a01(i3, i3, jt1Var));
                    rb9 rb9Var = new rb9(tb9Var, 0);
                    this.b = 1;
                    if (tg3VarI.a(rb9Var, this) == xx1Var) {
                    }
                }
                break;
            default:
                String str = tb9Var.c;
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        e11.e0(obj);
                    } else if (i4 != 2) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        e11.e0(obj);
                        zd9 zd9Var = zd9.a;
                        str.getClass();
                        ((kj) zd9.b.getValue()).getClass();
                        Context context = kl8.D;
                        context.getClass();
                        ae9.d(context, gc1.Y(str));
                    }
                    break;
                } else {
                    e11.e0(obj);
                    aw5 aw5Var2 = tb9Var.e;
                    this.b = 1;
                    ((uw5) aw5Var2).c(str);
                    if (hebVar == xx1Var) {
                    }
                }
                i13 i13Var = tb9Var.f;
                this.b = 2;
                if (((p13) i13Var).c(str, this) == xx1Var) {
                }
                zd9 zd9Var2 = zd9.a;
                str.getClass();
                ((kj) zd9.b.getValue()).getClass();
                Context context2 = kl8.D;
                context2.getClass();
                ae9.d(context2, gc1.Y(str));
                break;
        }
        return hebVar;
    }
}

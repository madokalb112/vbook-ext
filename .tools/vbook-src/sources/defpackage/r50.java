package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class r50 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ a07 c;
    public final /* synthetic */ a07 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r50(a07 a07Var, a07 a07Var2, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = a07Var;
        this.d = a07Var2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        a07 a07Var = this.d;
        a07 a07Var2 = this.c;
        switch (i) {
            case 0:
                return new r50(a07Var2, a07Var, jt1Var, 0);
            case 1:
                return new r50(a07Var2, a07Var, jt1Var, 1);
            default:
                return new r50(a07Var2, a07Var, jt1Var, 2);
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
        return ((r50) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.d;
        a07 a07Var2 = this.c;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    List list = y50.a;
                    if (((Number) a07Var2.getValue()).intValue() > 1) {
                        return hebVar;
                    }
                    a07Var2.setValue(Integer.valueOf(((Number) a07Var2.getValue()).intValue() + 1));
                    this.b = 1;
                    if (tw1.H(3000L, this) == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i2 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                List list2 = y50.a;
                if (((Number) a07Var2.getValue()).intValue() != 1) {
                    return hebVar;
                }
                a07Var.setValue(Boolean.FALSE);
                return hebVar;
            case 1:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    if (((Number) a07Var2.getValue()).intValue() > 1) {
                        return hebVar;
                    }
                    a07Var2.setValue(Integer.valueOf(((Number) a07Var2.getValue()).intValue() + 1));
                    this.b = 1;
                    if (tw1.H(3000L, this) == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                if (((Number) a07Var2.getValue()).intValue() != 1) {
                    return hebVar;
                }
                a07Var.setValue(Boolean.FALSE);
                return hebVar;
            default:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                pp1 pp1VarC = dk9.C(new lz4(a07Var2, 1));
                mz4 mz4Var = new mz4(a07Var, 0);
                this.b = 1;
                return pp1VarC.a(mz4Var, this) == xx1Var ? xx1Var : hebVar;
        }
    }
}

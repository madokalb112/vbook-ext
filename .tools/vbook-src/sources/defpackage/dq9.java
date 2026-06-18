package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dq9 extends o1a implements yb4 {
    public cq9 a;
    public wp9 b;
    public int c;
    public long d;
    public int e;
    public final /* synthetic */ cq9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq9(cq9 cq9Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.f = cq9Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        return new dq9(this.f, jt1Var);
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((dq9) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        cq9 cq9Var;
        wp9 wp9Var;
        long jC;
        int i;
        cq9 cq9Var2;
        int i2 = this.e;
        xx1 xx1Var = xx1.a;
        if (i2 == 0) {
            e11.e0(obj);
            cq9Var = this.f;
            wp9Var = (wp9) fc1.z0(cq9Var.a());
            if (wp9Var != null) {
                jC = wp9Var.a - r95.a.k().c();
                long j = jC >= 0 ? jC : 0L;
                this.a = cq9Var;
                this.b = wp9Var;
                i = 0;
                this.c = 0;
                this.d = jC;
                this.e = 1;
                if (tw1.H(j, this) != xx1Var) {
                }
                return xx1Var;
            }
            return heb.a;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wp9Var = this.b;
            cq9Var2 = this.a;
            e11.e0(obj);
            ArrayList arrayListB1 = fc1.b1(cq9Var2.a());
            arrayListB1.remove(wp9Var);
            cq9Var2.c.setValue(arrayListB1);
            fr9 fr9Var = cq9Var2.d;
            Boolean bool = Boolean.TRUE;
            fr9Var.getClass();
            fr9Var.l(null, bool);
            return heb.a;
        }
        jC = this.d;
        int i3 = this.c;
        wp9 wp9Var2 = this.b;
        cq9 cq9Var3 = this.a;
        e11.e0(obj);
        i = i3;
        wp9Var = wp9Var2;
        cq9Var = cq9Var3;
        fr9 fr9Var2 = cq9Var.d;
        Boolean bool2 = Boolean.FALSE;
        fr9Var2.getClass();
        fr9Var2.l(null, bool2);
        this.a = cq9Var;
        this.b = wp9Var;
        this.c = i;
        this.d = jC;
        this.e = 2;
        if (tw1.H(200L, this) != xx1Var) {
            cq9Var2 = cq9Var;
            ArrayList arrayListB12 = fc1.b1(cq9Var2.a());
            arrayListB12.remove(wp9Var);
            cq9Var2.c.setValue(arrayListB12);
            fr9 fr9Var3 = cq9Var2.d;
            Boolean bool3 = Boolean.TRUE;
            fr9Var3.getClass();
            fr9Var3.l(null, bool3);
            return heb.a;
        }
        return xx1Var;
    }
}

package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dc9 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ec9 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dc9(ec9 ec9Var, boolean z, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = ec9Var;
        this.d = z;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        boolean z = this.d;
        ec9 ec9Var = this.c;
        switch (i) {
            case 0:
                return new dc9(ec9Var, z, jt1Var, 0);
            case 1:
                return new dc9(ec9Var, z, jt1Var, 1);
            default:
                return new dc9(ec9Var, z, jt1Var, 2);
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
        return ((dc9) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        fr9 fr9Var;
        Object value;
        fr9 fr9Var2;
        Object value2;
        int i = this.a;
        ec9 ec9Var = this.c;
        xx1 xx1Var = xx1.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    ww5 ww5Var = ec9Var.c;
                    this.b = 1;
                    xw5 xw5Var = (xw5) ww5Var;
                    km0 km0Var = xw5Var.a.H;
                    ni5 ni5Var = qt.T[32];
                    boolean z = this.d;
                    km0Var.e(ni5Var, Boolean.valueOf(z));
                    b07 b07VarC = xw5Var.c();
                    while (true) {
                        fr9 fr9Var3 = (fr9) b07VarC;
                        Object value3 = fr9Var3.getValue();
                        boolean z2 = z;
                        if (!fr9Var3.j(value3, ac9.a((ac9) value3, 0, 0, 0, 0, 0, false, false, z2, Token.SWITCH))) {
                            z = z2;
                        } else if (hebVar == xx1Var) {
                        }
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
                    ww5 ww5Var2 = ec9Var.c;
                    this.b = 1;
                    xw5 xw5Var2 = (xw5) ww5Var2;
                    km0 km0Var2 = xw5Var2.a.F;
                    ni5 ni5Var2 = qt.T[30];
                    boolean z3 = this.d;
                    km0Var2.e(ni5Var2, Boolean.valueOf(z3));
                    b07 b07VarC2 = xw5Var2.c();
                    do {
                        fr9Var = (fr9) b07VarC2;
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, ac9.a((ac9) value, 0, 0, 0, 0, 0, z3, false, false, 223)));
                    if (hebVar == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    ww5 ww5Var3 = ec9Var.c;
                    this.b = 1;
                    xw5 xw5Var3 = (xw5) ww5Var3;
                    km0 km0Var3 = xw5Var3.a.G;
                    ni5 ni5Var3 = qt.T[31];
                    boolean z4 = this.d;
                    km0Var3.e(ni5Var3, Boolean.valueOf(z4));
                    b07 b07VarC3 = xw5Var3.c();
                    do {
                        fr9Var2 = (fr9) b07VarC3;
                        value2 = fr9Var2.getValue();
                    } while (!fr9Var2.j(value2, ac9.a((ac9) value2, 0, 0, 0, 0, 0, false, z4, false, 191)));
                    if (hebVar == xx1Var) {
                    }
                } else if (i4 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }
}

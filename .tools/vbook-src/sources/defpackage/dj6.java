package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dj6 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ga1 c;
    public final /* synthetic */ a07 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dj6(ga1 ga1Var, a07 a07Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = ga1Var;
        this.d = a07Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        a07 a07Var = this.d;
        ga1 ga1Var = this.c;
        switch (i) {
            case 0:
                return new dj6(ga1Var, a07Var, jt1Var, 0);
            default:
                return new dj6(ga1Var, a07Var, jt1Var, 1);
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
        return ((dj6) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        a07 a07Var = this.d;
        ga1 ga1Var = this.c;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    String upperCase = kf0.X(((lc1) a07Var.getValue()).a, true, false).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    this.b = 1;
                    if (vm7.e0(ga1Var, upperCase, this) == xx1Var) {
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
                    String upperCase2 = kf0.X(((lc1) a07Var.getValue()).a, true, false).toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                    this.b = 1;
                    if (vm7.e0(ga1Var, upperCase2, this) == xx1Var) {
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

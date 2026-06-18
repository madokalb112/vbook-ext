package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ha0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(ha0.class, "notCompletedCount$volatile");
    public final ml2[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public ha0(ml2[] ml2VarArr) {
        this.a = ml2VarArr;
        this.notCompletedCount$volatile = ml2VarArr.length;
    }

    public final Object a(jt1 jt1Var) {
        ay0 ay0Var = new ay0(1, bx1.J(jt1Var));
        ay0Var.u();
        ml2[] ml2VarArr = this.a;
        int length = ml2VarArr.length;
        fa0[] fa0VarArr = new fa0[length];
        for (int i = 0; i < length; i++) {
            ml2 ml2Var = ml2VarArr[i];
            ml2Var.start();
            fa0 fa0Var = new fa0(this, ay0Var);
            fa0Var.u = qx1.B(ml2Var, true, fa0Var);
            fa0VarArr[i] = fa0Var;
        }
        ga0 ga0Var = new ga0(fa0VarArr);
        for (int i2 = 0; i2 < length; i2++) {
            fa0VarArr[i2].t(ga0Var);
        }
        if (ay0Var.t() instanceof t77) {
            ay0Var.x(ga0Var);
        } else {
            ga0Var.b();
        }
        return ay0Var.s();
    }
}

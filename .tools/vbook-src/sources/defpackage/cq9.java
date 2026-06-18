package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cq9 {
    public final vx1 a;
    public final vp9 b;
    public final cn7 c;
    public final fr9 d;

    public cq9(vx1 vx1Var, vp9 vp9Var) {
        vx1Var.getClass();
        vp9Var.getClass();
        this.a = vx1Var;
        this.b = vp9Var;
        this.c = dk9.x(lc3.a);
        this.d = gr9.a(Boolean.FALSE);
    }

    public final List a() {
        return (List) this.c.getValue();
    }

    public final void b(wp9 wp9Var) {
        Boolean bool = Boolean.FALSE;
        fr9 fr9Var = this.d;
        fr9Var.getClass();
        fr9Var.l(null, bool);
        ArrayList arrayListB1 = fc1.b1(a());
        arrayListB1.add(wp9Var);
        this.c.setValue(arrayListB1);
        ah1.J(this.a, null, null, new bq9(this, null, 0), 3);
    }
}

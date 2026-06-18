package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class c1b extends qtb {
    public final int c;
    public final pg1 d;
    public final qp3 e;
    public boolean t;
    public boolean v;
    public boolean w;
    public oq9 x;
    public final fr9 f = gr9.a(new b1b(false, false, false, false, false, null, lc3.a));
    public final pp1 s = new pp1();
    public int u = 1;

    public c1b(int i, pg1 pg1Var, qp3 qp3Var) {
        this.c = i;
        this.d = pg1Var;
        this.e = qp3Var;
    }

    public final void j() {
        Object value;
        fr9 fr9Var = this.f;
        if (((b1b) fr9Var.getValue()).a) {
            return;
        }
        this.t = true;
        this.u = 1;
        this.v = false;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, b1b.a((b1b) value, true, false, false, false, false, null, lc3.a, 56)));
        }
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        ah1.J(za1VarA, nh2.c, null, new oc(this, (jt1) null, 7), 2);
    }
}

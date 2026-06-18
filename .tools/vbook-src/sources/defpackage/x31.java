package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x31 {
    public final int a;
    public final vx1 b;
    public final uk9 c;
    public final cn7 d;
    public final cn7 e;
    public final cn7 f;
    public final cn7 g;
    public final fr9 h;
    public boolean i;
    public int j;
    public oq9 k;

    public x31(int i, vx1 vx1Var, uk9 uk9Var) {
        vx1Var.getClass();
        this.a = i;
        this.b = vx1Var;
        this.c = uk9Var;
        Boolean bool = Boolean.FALSE;
        this.d = dk9.x(bool);
        this.e = dk9.x(bool);
        this.f = dk9.x(0);
        this.g = dk9.x(0);
        this.h = gr9.a(0);
        this.i = true;
        this.j = i;
    }

    public final void a() {
        ah1.J(this.b, null, null, new w31(this, null, 0), 3);
    }

    public final boolean b() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    public final void d(int i) {
        if (this.i) {
            this.f.setValue(Integer.valueOf(i));
        }
        cn7 cn7Var = this.d;
        jt1 jt1Var = null;
        if (i == 0) {
            cn7Var.setValue(Boolean.FALSE);
        } else if (this.i && !b()) {
            cn7Var.setValue(Boolean.TRUE);
            if (c()) {
                oq9 oq9Var = this.k;
                if (oq9Var != null) {
                    oq9Var.cancel(null);
                }
                this.k = ah1.J(this.b, null, null, new w31(this, jt1Var, 2), 3);
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        fr9 fr9Var = this.h;
        fr9Var.getClass();
        fr9Var.l(null, numValueOf);
    }
}

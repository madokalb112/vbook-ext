package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zob {
    public final cn7 a = dk9.x(Boolean.TRUE);
    public final an7 b = new an7(0);
    public final an7 c = new an7(0);
    public final cn7 d;
    public final cn7 e;
    public final cn7 f;
    public final cn7 g;
    public oq9 h;
    public vx1 i;
    public int j;

    public zob() {
        Boolean bool = Boolean.FALSE;
        this.d = dk9.x(bool);
        this.e = dk9.x(bool);
        this.f = dk9.x(bool);
        this.g = dk9.x(bool);
    }

    public final void a() {
        this.j++;
        oq9 oq9Var = this.h;
        if (oq9Var != null) {
            oq9Var.cancel(null);
        }
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void d() {
        int i = this.j;
        if (i <= 0) {
            return;
        }
        int i2 = i - 1;
        this.j = i2;
        if (i2 == 0 && c()) {
            e(3000L);
        }
    }

    public final void e(long j) {
        oq9 oq9Var = this.h;
        jt1 jt1Var = null;
        if (oq9Var != null) {
            oq9Var.cancel(null);
        }
        if (this.j > 0) {
            return;
        }
        vx1 vx1Var = this.i;
        if (vx1Var != null) {
            this.h = ah1.J(vx1Var, null, null, new em(j, this, jt1Var, 7), 3);
        } else {
            lc5.i0("scope");
            throw null;
        }
    }
}

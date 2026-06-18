package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xf9 extends yf1 {
    public Object b;
    public Object c;
    public uz6 d;
    public uz6 e;
    public w29 f;
    public final hy7 s;
    public final a09 t;

    public xf9() {
        super(4);
        this.s = new hy7(this, 24);
        w27 w27Var = new w27(this, 11);
        vj9.e(vj9.a);
        synchronized (vj9.c) {
            vj9.h = fc1.J0(vj9.h, w27Var);
        }
        this.t = new a09(w27Var, 2);
    }

    public final void l(w29 w29Var) {
        this.c = null;
        this.e = null;
    }

    public final void m() {
        synchronized (((yf1) this).a) {
            try {
                this.b = this.c;
                if (this.e == null) {
                    this.d = null;
                } else {
                    if (this.d == null) {
                        uz6 uz6Var = ku8.a;
                        this.d = new uz6();
                    }
                    uz6 uz6Var2 = this.d;
                    this.d = this.e;
                    this.e = uz6Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        this.t.a();
        this.c = null;
        this.e = null;
        synchronized (((yf1) this).a) {
            this.f = null;
            this.b = null;
            this.d = null;
        }
    }

    public final kb4 z(w29 w29Var) {
        w29 w29Var2 = this.f;
        if (w29Var2 != null && !w29Var2.equals(w29Var)) {
            d08.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f = w29Var;
        return this.s;
    }
}

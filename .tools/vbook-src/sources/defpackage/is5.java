package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class is5 {
    public final Object a;
    public final js5 b;
    public int d;
    public is5 e;
    public boolean f;
    public int c = -1;
    public final cn7 g = dk9.x((Object) null);

    public is5(Object obj, js5 js5Var) {
        this.a = obj;
        this.b = js5Var;
    }

    public final is5 a() {
        if (this.f) {
            t75.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.a.add(this);
            is5 is5Var = (is5) this.g.getValue();
            if (is5Var != null) {
                is5Var.a();
            } else {
                is5Var = null;
            }
            this.e = is5Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            t75.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.a.remove(this);
            is5 is5Var = this.e;
            if (is5Var != null) {
                is5Var.b();
            }
            this.e = null;
        }
    }
}

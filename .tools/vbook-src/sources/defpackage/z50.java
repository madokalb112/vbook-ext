package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class z50 {
    public final /* synthetic */ int a;
    public st5 b;
    public vx1 c;
    public pn2 d;
    public final cn7 e;
    public final cn7 f;
    public final cn7 g;
    public final cn7 h;

    public z50(st5 st5Var, vx1 vx1Var, pn2 pn2Var, int i) {
        this.a = i;
        st5Var.getClass();
        switch (i) {
            case 1:
                this.b = st5Var;
                this.c = vx1Var;
                this.d = pn2Var;
                Boolean bool = Boolean.FALSE;
                this.e = dk9.x(bool);
                this.f = dk9.x(bool);
                this.g = dk9.x(Float.valueOf(0.0f));
                this.h = dk9.x(Float.valueOf(1.0f));
                break;
            default:
                this.b = st5Var;
                this.c = vx1Var;
                this.d = pn2Var;
                Boolean bool2 = Boolean.FALSE;
                this.e = dk9.x(bool2);
                this.f = dk9.x(bool2);
                this.g = dk9.x(Float.valueOf(0.0f));
                this.h = dk9.x(Float.valueOf(1.0f));
                break;
        }
    }

    public abstract void a();

    public abstract boolean b();

    public final boolean c() {
        switch (this.a) {
        }
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public abstract boolean d();

    public abstract void e();

    public abstract void f();

    public abstract void g(float f);

    public void h(float f) {
        this.g.setValue(Float.valueOf(f));
    }

    public abstract void i(float f);

    public abstract void j();

    public abstract void k();
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bn1 extends uh7 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public bn1(wh7 wh7Var, ut0 ut0Var) {
        wh7Var.getClass();
        ut0Var.getClass();
        this.b = ut0Var;
        this.c = wh7Var.b();
        this.d = wh7Var.a();
        this.e = wh7Var.d();
        this.f = wh7Var.c();
    }

    @Override // defpackage.wh7
    public final Long a() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                Long lA = ((wh7) this.b).a();
                if (lA != null) {
                    Long lP = ((wq1) obj).p(lA.longValue());
                    if (lP != null && lP.longValue() >= 0) {
                        return lP;
                    }
                }
                return null;
            default:
                return (Long) obj;
        }
    }

    @Override // defpackage.wh7
    public final as1 b() {
        switch (this.a) {
            case 0:
                return ((wh7) this.b).b();
            default:
                return (as1) this.c;
        }
    }

    @Override // defpackage.wh7
    public final ek4 c() {
        switch (this.a) {
            case 0:
                return (ek4) ((dp5) this.f).getValue();
            default:
                return (ek4) this.f;
        }
    }

    @Override // defpackage.wh7
    public final yv4 d() {
        switch (this.a) {
            case 0:
                return ((wh7) this.b).d();
            default:
                return (yv4) this.e;
        }
    }

    @Override // defpackage.uh7
    public final ut0 e() {
        switch (this.a) {
            case 0:
                return ((wq1) this.d).u((ut0) ((ib4) this.c).invoke(), (jx1) this.e);
            default:
                return (ut0) this.b;
        }
    }

    public bn1(wh7 wh7Var, ib4 ib4Var, wq1 wq1Var, jx1 jx1Var) {
        wh7Var.getClass();
        wq1Var.getClass();
        jx1Var.getClass();
        this.b = wh7Var;
        this.c = ib4Var;
        this.d = wq1Var;
        this.e = jx1Var;
        this.f = ex1.Z(xu5.c, new ub(this, 24));
    }
}

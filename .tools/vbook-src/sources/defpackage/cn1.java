package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cn1 extends vh7 {
    public final vh7 a;
    public final wq1 b;
    public final jx1 c;
    public final dp5 d;

    public cn1(vh7 vh7Var, wq1 wq1Var, jx1 jx1Var) {
        vh7Var.getClass();
        wq1Var.getClass();
        jx1Var.getClass();
        this.a = vh7Var;
        this.b = wq1Var;
        this.c = jx1Var;
        this.d = ex1.Z(xu5.c, new ub(this, 25));
    }

    @Override // defpackage.wh7
    public final Long a() {
        Long lA = this.a.a();
        if (lA == null) {
            return null;
        }
        Long lP = this.b.p(lA.longValue());
        if (lP == null || lP.longValue() < 0) {
            return null;
        }
        return lP;
    }

    @Override // defpackage.wh7
    public final as1 b() {
        return this.a.b();
    }

    @Override // defpackage.wh7
    public final ek4 c() {
        return (ek4) this.d.getValue();
    }

    @Override // defpackage.wh7
    public final yv4 d() {
        return this.a.d();
    }

    @Override // defpackage.vh7
    public final Object e(bv0 bv0Var, o1a o1aVar) throws Throwable {
        Object objB0 = ah1.b0(this.c, new vg(this, bv0Var, null, 8), o1aVar);
        return objB0 == xx1.a ? objB0 : heb.a;
    }
}

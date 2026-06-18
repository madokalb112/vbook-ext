package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ta7 extends uh7 {
    public final wh7 a;
    public final jx1 b;
    public final h88 c;

    public ta7(wh7 wh7Var, o0a o0aVar, h88 h88Var) {
        wh7Var.getClass();
        o0aVar.getClass();
        this.a = wh7Var;
        this.b = o0aVar;
        this.c = h88Var;
    }

    @Override // defpackage.wh7
    public final Long a() {
        return this.a.a();
    }

    @Override // defpackage.wh7
    public final as1 b() {
        return this.a.b();
    }

    @Override // defpackage.wh7
    public final ek4 c() {
        return this.a.c();
    }

    @Override // defpackage.wh7
    public final yv4 d() {
        return this.a.d();
    }

    @Override // defpackage.uh7
    public final ut0 e() {
        ut0 ut0VarE;
        wh7 wh7Var = this.a;
        boolean z = wh7Var instanceof sh7;
        jx1 jx1Var = this.b;
        yf4 yf4Var = yf4.a;
        jt1 jt1Var = null;
        if (z) {
            ut0VarE = t96.e(((sh7) wh7Var).e());
        } else if (wh7Var instanceof th7) {
            ut0.a.getClass();
            ut0VarE = tt0.b;
        } else if (wh7Var instanceof uh7) {
            ut0VarE = ((uh7) wh7Var).e();
        } else if (wh7Var instanceof vh7) {
            ut0VarE = (jt0) md2.x0(yf4Var, jx1Var, new sa7(wh7Var, jt1Var, 0)).b;
        } else {
            mn5.g();
            ut0VarE = null;
        }
        Long lA = wh7Var.a();
        ut0VarE.getClass();
        jx1Var.getClass();
        return (jt0) md2.x0(yf4Var, jx1Var, new pt0(ut0VarE, this.c, lA, null)).b;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class z5c implements zb4 {
    public final /* synthetic */ e6c a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kb4 c;
    public final /* synthetic */ kb4 d;
    public final /* synthetic */ ul7 e;
    public final /* synthetic */ f9 f;
    public final /* synthetic */ sr1 s;
    public final /* synthetic */ float t;
    public final /* synthetic */ cw8 u;

    public /* synthetic */ z5c(e6c e6cVar, boolean z, kb4 kb4Var, kb4 kb4Var2, ul7 ul7Var, f9 f9Var, sr1 sr1Var, float f, cw8 cw8Var) {
        this.a = e6cVar;
        this.b = z;
        this.c = kb4Var;
        this.d = kb4Var2;
        this.e = ul7Var;
        this.f = f9Var;
        this.s = sr1Var;
        this.t = f;
        this.u = cw8Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        co0 co0Var = (co0) obj;
        dd4 dd4Var = (dd4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        co0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= dd4Var.f(co0Var) ? 4 : 2;
        }
        if (dd4Var.V(iIntValue & 1, (iIntValue & 19) != 18)) {
            pn2 pn2Var = (pn2) dd4Var.j(xm1.h);
            x13 x13Var = new x13(co0Var.d());
            x13 x13Var2 = new x13(co0Var.c());
            boolean zF = dd4Var.f(pn2Var);
            boolean z = (iIntValue & 14) == 4;
            e6c e6cVar = this.a;
            boolean zF2 = z | zF | dd4Var.f(e6cVar);
            Object objQ = dd4Var.Q();
            if (zF2 || objQ == vl1.a) {
                ti tiVar = new ti(pn2Var, e6cVar, co0Var, (jt1) null, 22);
                dd4Var.p0(tiVar);
                objQ = tiVar;
            }
            lc5.w(pn2Var, x13Var, x13Var2, (yb4) objQ, dd4Var);
            zn0 zn0Var = zn0.a;
            ou6 ou6VarE = zn0Var.b().e(this.b ? new r6c(e6cVar.a, true, this.c, this.d) : lu6.a);
            o7c o7cVar = e6cVar.a;
            ou6VarE.getClass();
            p7c.a(this.e, xg9.q(ou6VarE, o7cVar, false), this.f, this.s, this.t, false, true, dd4Var, 113246264);
            ou6 ou6VarQ = xg9.q(zn0Var.b(), o7cVar, true);
            bz9 bz9Var = e6cVar.b;
            ou6VarQ.getClass();
            bz9Var.getClass();
            pn0.a(ou6VarQ.e(new py9(o7cVar, bz9Var)), dd4Var, 0);
            cw8 cw8Var = this.u;
            if (cw8Var != null) {
                dd4Var.f0(317045046);
                pn0.a(zn0Var.b().e(new c6c(o7cVar, cw8Var)), dd4Var, 0);
                dd4Var.q(false);
            } else {
                dd4Var.f0(317221870);
                dd4Var.q(false);
            }
        } else {
            dd4Var.Y();
        }
        return heb.a;
    }
}

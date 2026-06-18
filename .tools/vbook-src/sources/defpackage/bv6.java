package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class bv6 implements oi5 {
    public static final bv6 a = new bv6();
    public static final dp5 b = ex1.Z(xu5.b, new av6(0));

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        p72 p72Var = (p72) obj;
        p72Var.getClass();
        m39 m39VarE = e();
        md2 md2VarV = md2Var.v(m39VarE);
        md2VarV.Q(0, p72Var.d, a.e());
        md2VarV.a0(m39VarE);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39VarE = e();
        am1 am1VarT = yd2Var.t(m39VarE);
        boolean z = false;
        int iR = 0;
        while (true) {
            bv6 bv6Var = a;
            int iF = am1VarT.f(bv6Var.e());
            if (iF == -1) {
                am1VarT.n(m39VarE);
                if (z) {
                    return new p72(iR);
                }
                throw new kh6("months", e().a());
            }
            if (iF != 0) {
                wx1.r0(iF);
                throw null;
            }
            iR = am1VarT.r(bv6Var.e(), 0);
            z = true;
        }
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return (m39) b.getValue();
    }
}

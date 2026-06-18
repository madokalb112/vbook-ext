package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wta implements oi5 {
    public static final wta a = new wta();
    public static final dp5 b = ex1.Z(xu5.b, new nda(17));

    @Override // defpackage.oi5
    public final void b(md2 md2Var, Object obj) {
        r72 r72Var = (r72) obj;
        r72Var.getClass();
        m39 m39VarE = e();
        md2 md2VarV = md2Var.v(m39VarE);
        md2VarV.S(a.e(), 0, r72Var.d);
        md2VarV.a0(m39VarE);
    }

    @Override // defpackage.oi5
    public final Object c(yd2 yd2Var) {
        m39 m39VarE = e();
        am1 am1VarT = yd2Var.t(m39VarE);
        long jD = 0;
        boolean z = false;
        while (true) {
            wta wtaVar = a;
            int iF = am1VarT.f(wtaVar.e());
            if (iF == -1) {
                am1VarT.n(m39VarE);
                if (z) {
                    return new r72(jD);
                }
                throw new kh6("nanoseconds", e().a());
            }
            if (iF != 0) {
                wx1.r0(iF);
                throw null;
            }
            jD = am1VarT.D(wtaVar.e(), 0);
            z = true;
        }
    }

    @Override // defpackage.oi5
    public final m39 e() {
        return (m39) b.getValue();
    }
}

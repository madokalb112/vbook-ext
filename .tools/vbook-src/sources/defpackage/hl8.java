package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hl8 {
    public static gl8 a(dd4 dd4Var) {
        dd4Var.f0(1808039825);
        g36 g36Var = (g36) au7.a.A().a.get(0);
        boolean zR = ww1.R(dd4Var);
        pn2 pn2Var = (pn2) dd4Var.j(xm1.h);
        boolean zF = dd4Var.f(g36Var) | dd4Var.g(zR) | dd4Var.f(pn2Var);
        Object objQ = dd4Var.Q();
        if (zF || objQ == vl1.a) {
            fm5 fm5Var = new fm5(g36Var.a.getLanguage());
            ch8 ch8Var = new ch8(g36Var.a.getCountry());
            mra.a.getClass();
            mra mraVar = zR ? mra.c : mra.b;
            float fB = pn2Var.b();
            tn2.b.getClass();
            double d = fB;
            objQ = new gl8(fm5Var, ch8Var, mraVar, d <= 0.75d ? tn2.c : d <= 1.0d ? tn2.d : d <= 1.5d ? tn2.e : d <= 2.0d ? tn2.f : d <= 3.0d ? tn2.s : tn2.t);
            dd4Var.p0(objQ);
        }
        gl8 gl8Var = (gl8) objQ;
        dd4Var.q(false);
        return gl8Var;
    }
}

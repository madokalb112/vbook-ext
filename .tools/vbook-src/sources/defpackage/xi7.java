package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class xi7 {
    public static final fn1 a = new fn1(new ss6(21));

    public static final ag a(dd4 dd4Var) {
        dd4Var.f0(282942128);
        bg bgVar = (bg) dd4Var.j(a);
        if (bgVar == null) {
            dd4Var.q(false);
            return null;
        }
        boolean zF = dd4Var.f(bgVar);
        Object objQ = dd4Var.Q();
        if (zF || objQ == vl1.a) {
            ag agVar = new ag(bgVar.a, bgVar.b, bgVar.c, bgVar.d);
            dd4Var.p0(agVar);
            objQ = agVar;
        }
        ag agVar2 = (ag) objQ;
        dd4Var.q(false);
        return agVar2;
    }
}

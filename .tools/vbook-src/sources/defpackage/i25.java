package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class i25 {
    public static final d6a a = new d6a(new un4(22));
    public static final d6a b = new d6a(new un4(23));
    public static final d6a c = new d6a(new un4(24));
    public static final c85 d = new c85(7);

    public static final ky4 a(m53 m53Var, dd4 dd4Var) {
        lf2 lf2Var;
        m53 m53Var2;
        m53Var.getClass();
        lf2 lf2VarH0 = wx1.h0(tl8.a, dd4Var);
        ((hl8) dd4Var.j(jl8.b)).getClass();
        gl8 gl8VarA = hl8.a(dd4Var);
        Object objQ = dd4Var.Q();
        Object obj = vl1.a;
        if (objQ == obj) {
            objQ = new un4(26);
            dd4Var.p0(objQ);
        }
        ib4 ib4Var = (ib4) objQ;
        boolean zF = dd4Var.f(m53Var) | dd4Var.f(gl8VarA) | dd4Var.h(lf2VarH0);
        Object objQ2 = dd4Var.Q();
        if (zF || objQ2 == obj) {
            lf2Var = lf2VarH0;
            m53Var2 = m53Var;
            vg vgVar = new vg(m53Var2, gl8VarA, lf2Var, (jt1) null, 24);
            dd4Var.p0(vgVar);
            objQ2 = vgVar;
        } else {
            lf2Var = lf2VarH0;
            m53Var2 = m53Var;
        }
        return (ky4) ny1.i0(m53Var2, lf2Var, gl8VarA, ib4Var, (yb4) objQ2, dd4Var).getValue();
    }

    public static final ul7 b(m53 m53Var, dd4 dd4Var) {
        pn2 pn2Var;
        lf2 lf2Var;
        m53 m53Var2;
        m53Var.getClass();
        dd4Var.f0(-1508925367);
        ((hl8) dd4Var.j(jl8.b)).getClass();
        gl8 gl8VarA = hl8.a(dd4Var);
        boolean zF = dd4Var.f(m53Var) | dd4Var.f(gl8VarA);
        Object objQ = dd4Var.Q();
        Object obj = vl1.a;
        if (zF || objQ == obj) {
            objQ = jl8.a(m53Var, gl8VarA).b;
            dd4Var.p0(objQ);
        }
        String str = (String) objQ;
        if (iw9.C(str, ".xml", true)) {
            dd4Var.f0(-1267601485);
            jlb jlbVarJ = pg9.j(c(m53Var, dd4Var, 0), dd4Var);
            dd4Var.q(false);
            dd4Var.q(false);
            return jlbVarJ;
        }
        if (!iw9.C(str, ".svg", true)) {
            dd4Var.f0(-1267441060);
            ch0 ch0Var = new ch0(a(m53Var, dd4Var));
            dd4Var.q(false);
            dd4Var.q(false);
            return ch0Var;
        }
        dd4Var.f0(-1267490226);
        lf2 lf2VarH0 = wx1.h0(tl8.a, dd4Var);
        pn2 pn2Var2 = (pn2) dd4Var.j(xm1.h);
        Object objQ2 = dd4Var.Q();
        if (objQ2 == obj) {
            objQ2 = new un4(27);
            dd4Var.p0(objQ2);
        }
        ib4 ib4Var = (ib4) objQ2;
        boolean zF2 = dd4Var.f(m53Var) | dd4Var.h(lf2VarH0) | dd4Var.f(pn2Var2);
        Object objQ3 = dd4Var.Q();
        if (zF2 || objQ3 == obj) {
            pn2Var = pn2Var2;
            lf2Var = lf2VarH0;
            m53Var2 = m53Var;
            h25 h25Var = new h25(m53Var2, lf2Var, pn2Var, null, 0);
            dd4Var.p0(h25Var);
            objQ3 = h25Var;
        } else {
            pn2Var = pn2Var2;
            lf2Var = lf2VarH0;
            m53Var2 = m53Var;
        }
        ul7 ul7Var = (ul7) ny1.i0(m53Var2, lf2Var, pn2Var, ib4Var, (yb4) objQ3, dd4Var).getValue();
        dd4Var.q(false);
        dd4Var.q(false);
        return ul7Var;
    }

    public static final p35 c(m53 m53Var, dd4 dd4Var, int i) {
        Object h25Var;
        pn2 pn2Var;
        lf2 lf2Var;
        m53 m53Var2;
        m53Var.getClass();
        lf2 lf2VarH0 = wx1.h0(tl8.a, dd4Var);
        pn2 pn2Var2 = (pn2) dd4Var.j(xm1.h);
        Object objQ = dd4Var.Q();
        Object obj = vl1.a;
        if (objQ == obj) {
            objQ = new un4(25);
            dd4Var.p0(objQ);
        }
        ib4 ib4Var = (ib4) objQ;
        boolean zH = ((((i & 14) ^ 6) > 4 && dd4Var.f(m53Var)) || (i & 6) == 4) | dd4Var.h(lf2VarH0) | dd4Var.f(pn2Var2);
        Object objQ2 = dd4Var.Q();
        if (zH || objQ2 == obj) {
            pn2Var = pn2Var2;
            lf2Var = lf2VarH0;
            m53Var2 = m53Var;
            h25Var = new h25(m53Var2, lf2Var, pn2Var, null, 1);
            dd4Var.p0(h25Var);
        } else {
            h25Var = objQ2;
            pn2Var = pn2Var2;
            lf2Var = lf2VarH0;
            m53Var2 = m53Var;
        }
        return (p35) ny1.i0(m53Var2, lf2Var, pn2Var, ib4Var, (yb4) h25Var, dd4Var).getValue();
    }
}

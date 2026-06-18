package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class joa extends qtb {
    public final pp1 A;
    public final h8b c;
    public final q8b d;
    public final aw5 e;
    public final sja f;
    public final tna s;
    public final f4b t;
    public final qp3 u;
    public final fr9 v = gr9.a(new gna("", "", "", "", "", "", false, false));
    public final fr9 w = gr9.a(new ana(false, false, false));
    public final fr9 x;
    public final fr9 y;
    public final fr9 z;

    public joa(h8b h8bVar, q8b q8bVar, aw5 aw5Var, sja sjaVar, tna tnaVar, f4b f4bVar, qp3 qp3Var) {
        this.c = h8bVar;
        this.d = q8bVar;
        this.e = aw5Var;
        this.f = sjaVar;
        this.s = tnaVar;
        this.t = f4bVar;
        this.u = qp3Var;
        int i = 0;
        lc3 lc3Var = lc3.a;
        this.x = gr9.a(new tla(1.0f, 1.0f, 0L, false, false, 0.5f, lc3Var));
        this.y = gr9.a(new sna(0, 0L));
        this.z = gr9.a(new boa("", lc3Var));
        this.A = new pp1();
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        nh2 nh2Var = nh2.c;
        jt1 jt1Var = null;
        g(za1VarA, nh2Var, new doa(this, jt1Var, 2));
        g(vtb.a(this), nh2Var, new doa(this, jt1Var, 3));
        g(vtb.a(this), nh2Var, new doa(this, jt1Var, i));
        g(vtb.a(this), nh2Var, new eoa(this, jt1Var, i));
        g(vtb.a(this), nh2Var, new doa(this, jt1Var, 1));
    }

    public static final String j(joa joaVar, Map map, String str) {
        String str2 = (String) map.get(str);
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            str2 = (String) map.get("raw");
        }
        return str2 == null ? "" : str2;
    }

    public final void k() {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new eoa(this, null, 1));
    }

    public final void l() {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new eoa(this, null, 2));
    }

    public final void m() {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new eoa(this, null, 4));
    }

    public final void n() {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new eoa(this, null, 6));
    }

    public final void o() {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new eoa(this, null, 9));
    }
}

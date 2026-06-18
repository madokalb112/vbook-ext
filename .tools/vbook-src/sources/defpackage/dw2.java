package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dw2 extends qtb {
    public final xv2 c;
    public boolean s;
    public boolean t;
    public boolean v;
    public oq9 w;
    public final fr9 d = gr9.a(new bw2(true, false, false, false, lc3.a));
    public final HashMap e = new HashMap();
    public int f = 1;
    public String u = "";

    public dw2(aib aibVar, xv2 xv2Var) {
        this.c = xv2Var;
    }

    public final void j(int i) {
        oq9 oq9Var = this.w;
        jt1 jt1Var = null;
        if (oq9Var != null) {
            oq9Var.cancel(null);
        }
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        this.w = ah1.J(za1VarA, nh2.c, null, new pc(this, i, jt1Var, 4), 2);
    }

    public final void k() {
        Object value;
        if (this.s) {
            return;
        }
        this.v = true;
        this.u = "";
        this.f = 1;
        this.t = false;
        this.e.clear();
        fr9 fr9Var = this.d;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, bw2.a((bw2) value, true, false, false, null, 26)));
        }
        j(this.f);
    }

    public final void l(String str) {
        Object value;
        str.getClass();
        if (this.s) {
            return;
        }
        this.v = true;
        this.u = str;
        this.f = 1;
        this.t = false;
        this.e.clear();
        fr9 fr9Var = this.d;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, bw2.a((bw2) value, true, false, !bw9.a0(this.u), null, 26)));
        }
        j(this.f);
    }
}

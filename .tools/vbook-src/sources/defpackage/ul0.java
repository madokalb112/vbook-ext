package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ul0 extends qtb {
    public final ml0 c;
    public final qp3 d;
    public final fr9 e = gr9.a(new sl0(true, false, false, false, lc3.a));
    public final pp1 f = new pp1();
    public final HashMap s = new HashMap();
    public int t = 1;
    public boolean u;
    public boolean v;
    public String w;
    public boolean x;
    public oq9 y;

    public ul0(aib aibVar, ml0 ml0Var, qp3 qp3Var) {
        this.c = ml0Var;
        this.d = qp3Var;
    }

    public final void j(int i) {
        oq9 oq9Var = this.y;
        jt1 jt1Var = null;
        if (oq9Var != null) {
            oq9Var.cancel(null);
        }
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        this.y = ah1.J(za1VarA, nh2.c, null, new pc(this, i, jt1Var, 2), 2);
    }

    public final void k() {
        Object value;
        if (this.u) {
            return;
        }
        this.x = true;
        this.w = null;
        this.t = 1;
        this.v = false;
        this.s.clear();
        fr9 fr9Var = this.e;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, sl0.a((sl0) value, true, false, false, null, 26)));
        }
        j(this.t);
    }

    public final void l(String str) {
        Object value;
        str.getClass();
        if (this.u) {
            return;
        }
        this.x = true;
        if (bw9.a0(str)) {
            str = null;
        }
        this.w = str;
        this.t = 1;
        this.v = false;
        this.s.clear();
        fr9 fr9Var = this.e;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, sl0.a((sl0) value, true, false, this.w != null, null, 26)));
        }
        j(this.t);
    }
}

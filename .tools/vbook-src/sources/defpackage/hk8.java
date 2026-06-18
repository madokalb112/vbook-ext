package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hk8 extends qtb {
    public final dk8 c;
    public final fr9 d;
    public final HashMap e;
    public final int f;
    public int s;
    public boolean t;
    public final oq9 u;

    public hk8(aib aibVar, dk8 dk8Var) {
        Object value;
        this.c = dk8Var;
        fr9 fr9VarA = gr9.a(new gk8(lc3.a, true, false, false));
        this.d = fr9VarA;
        HashMap map = new HashMap();
        this.e = map;
        this.f = 4;
        this.s = 1;
        if (this.t) {
            return;
        }
        this.s = 1;
        map.clear();
        do {
            value = fr9VarA.getValue();
        } while (!fr9VarA.j(value, gk8.a((gk8) value, true, false, 14)));
        int i = this.s;
        oq9 oq9Var = this.u;
        jt1 jt1Var = null;
        if (oq9Var != null) {
            oq9Var.cancel(null);
        }
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        this.u = ah1.J(za1VarA, nh2.c, null, new pc(this, i, jt1Var, 10), 2);
    }
}

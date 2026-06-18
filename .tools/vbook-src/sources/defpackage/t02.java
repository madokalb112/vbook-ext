package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class t02 extends qtb {
    public final aib c;
    public final z51 d;
    public boolean v;
    public final fr9 e = gr9.a(new s02(false, false, false, false, false, "", "private", sc3.a, lc3.a));
    public final pp1 f = new pp1();
    public String s = "";
    public int t = 1;
    public boolean u = true;
    public final LinkedHashMap w = new LinkedHashMap();

    public t02(z51 z51Var, aib aibVar) {
        this.c = aibVar;
        this.d = z51Var;
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new rf(this, null, 13));
        k();
    }

    public final void j() {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new et1(this, null, 3));
    }

    public final void k() {
        Object value;
        this.s = "";
        this.t = 1;
        this.u = true;
        this.w.clear();
        fr9 fr9Var = this.e;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, s02.a((s02) value, true, false, false, false, false, null, null, null, lc3.a, 244)));
        }
        j();
    }
}

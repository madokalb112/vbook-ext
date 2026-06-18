package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j7 extends qtb {
    public final aib c;
    public final z51 d;
    public boolean v;
    public final fr9 e = gr9.a(new i7(31));
    public final pp1 f = new pp1();
    public String s = "";
    public int t = 1;
    public boolean u = true;
    public final LinkedHashMap w = new LinkedHashMap();

    public j7(z51 z51Var, aib aibVar) {
        this.c = aibVar;
        this.d = z51Var;
        k();
    }

    public final void j() {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new w(this, null, 3));
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
            } while (!fr9Var.j(value, new i7(30)));
        }
        j();
    }
}

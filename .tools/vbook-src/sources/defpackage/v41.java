package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class v41 extends qtb {
    public final z51 c;
    public final aib d;
    public boolean u;
    public final fr9 e = gr9.a(new t41(true, false, false, false, "", "", lc3.a));
    public int f = 1;
    public String s = "";
    public boolean t = true;
    public final LinkedHashMap v = new LinkedHashMap();

    public v41(z51 z51Var, aib aibVar) {
        this.c = z51Var;
        this.d = aibVar;
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new rf(this, null, 9));
        j();
    }

    public final void j() {
        Object value;
        this.f = 1;
        this.t = true;
        this.u = false;
        this.v.clear();
        fr9 fr9Var = this.e;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, t41.a((t41) value, true, false, false, false, null, this.s, lc3.a, 16)));
        }
        String str = this.s;
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new u41(false, this, true, str, null));
    }

    public final void k(String str) {
        String str2;
        str.getClass();
        String string = bw9.B0(str).toString();
        boolean zQ = lc5.Q(string, this.s);
        fr9 fr9Var = this.e;
        if (!zQ || ((t41) fr9Var.getValue()).g.isEmpty()) {
            this.s = string;
            this.f = 1;
            this.t = true;
            this.u = false;
            this.v.clear();
            if (fr9Var != null) {
                while (true) {
                    Object value = fr9Var.getValue();
                    str2 = string;
                    if (fr9Var.j(value, t41.a((t41) value, true, false, false, false, null, str2, lc3.a, 16))) {
                        break;
                    } else {
                        string = str2;
                    }
                }
            } else {
                str2 = string;
            }
            za1 za1VarA = vtb.a(this);
            aj2 aj2Var = rw2.a;
            g(za1VarA, nh2.c, new u41(false, this, true, str2, null));
        }
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mib extends qtb {
    public final aib c;
    public final z51 d;
    public final m87 e;
    public final fr9 f = gr9.a(new iib(false, "", "", "", lc3.a, false, 0, "", false, 0, 0));

    public mib(aib aibVar, z51 z51Var, m87 m87Var) {
        this.c = aibVar;
        this.d = z51Var;
        this.e = m87Var;
        jt1 jt1Var = null;
        qtb.h(this, vtb.a(this), new lib(this, jt1Var, 0));
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new lib(this, jt1Var, 1));
    }

    public final void j() {
        Object value;
        fr9 fr9Var = this.f;
        if (((iib) fr9Var.getValue()).a) {
            za1 za1VarA = vtb.a(this);
            aj2 aj2Var = rw2.a;
            g(za1VarA, nh2.c, new qoa(this, (jt1) null, 18));
        } else if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, iib.a((iib) value, false, null, null, null, null, false, 0, null, false, 0, 0, 1535)));
        }
    }
}

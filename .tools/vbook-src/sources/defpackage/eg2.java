package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class eg2 extends nu6 implements p43 {
    public final ta5 A;
    public boolean B;
    public boolean C;
    public boolean D;

    public eg2(ta5 ta5Var) {
        this.A = ta5Var;
    }

    public final void W0() {
        ah1.J(S0(), null, null, new rf(this, null, 15), 3);
    }

    public final void u0(un5 un5Var) {
        un5Var.a();
        hy0 hy0Var = un5Var.a;
        if (this.B) {
            r43.J(un5Var, lc1.c(0.3f, lc1.b), 0L, hy0Var.f(), 0.0f, (jw9) null, Token.FUNCTION);
        } else if (this.C || this.D) {
            r43.J(un5Var, lc1.c(0.1f, lc1.b), 0L, hy0Var.f(), 0.0f, (jw9) null, Token.FUNCTION);
        }
    }
}

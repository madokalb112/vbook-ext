package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class a9 {
    public static final ur9 a = new ur9(new s5(4));

    public static final void a(cq9 cq9Var, ou6 ou6Var, dd4 dd4Var, int i) {
        cq9Var.getClass();
        dd4Var.h0(-1819522859);
        int i2 = (dd4Var.f(cq9Var) ? 4 : 2) | i | (dd4Var.f(ou6Var) ? 32 : 16);
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            mi9.a(cq9Var, ou6Var, dd4Var, i2 & Token.ELSE);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new il6(cq9Var, ou6Var, i, 3);
        }
    }
}

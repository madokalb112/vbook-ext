package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class l16 {
    static {
        new a22(0.42f, 0.0f, 0.58f, 1.0f);
    }

    public static final void a(float f, int i, int i2, long j, dd4 dd4Var, ou6 ou6Var) {
        int i3;
        dd4 dd4Var2;
        ou6 ou6Var2;
        long j2;
        dd4Var.h0(1062926078);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && dd4Var.e(j)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 384) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if (dd4Var.V(i3 & 1, (i3 & Token.DO) != 130)) {
            dd4Var.a0();
            if ((i & 1) == 0 || dd4Var.C()) {
                if ((i2 & 1) != 0) {
                    j = ((q96) dd4Var.j(s96.a)).a.q;
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    f = 2.0f;
                }
            } else {
                dd4Var.Y();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
            }
            j2 = j;
            dd4Var.r();
            int i4 = ((i3 >> 6) & 14) | ((i3 << 3) & Token.ASSIGN_MOD);
            dd4Var2 = dd4Var;
            ou6Var2 = ou6Var;
            sdc.y(ou6Var2, j2, null, dd4Var2, i4, 4);
        } else {
            dd4Var2 = dd4Var;
            ou6Var2 = ou6Var;
            dd4Var2.Y();
            j2 = j;
        }
        float f2 = f;
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new lx2(j2, f2, ou6Var2, i, i2);
        }
    }
}

package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ef9 {
    public static final List a = gc1.Z(new lc1(ah1.j(855638016)), new lc1(ah1.j(0)));
    public static final float b = 15.0f;

    public static final void a(sw8 sw8Var, ou6 ou6Var, dd4 dd4Var, int i) {
        int i2;
        dd4Var.h0(1573419969);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(sw8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            dk7 dk7VarF = sw8Var.f();
            boolean z = dk7VarF == dk7.b;
            boolean zD = dd4Var.d(dk7VarF.ordinal()) | dd4Var.g(z) | ((i2 & 14) == 4);
            Object objQ = dd4Var.Q();
            if (zD || objQ == vl1.a) {
                objQ = new gb0(dk7VarF, z, sw8Var);
                dd4Var.p0(objQ);
            }
            s32.F(ou6Var, (kb4) objQ, dd4Var, (i2 >> 3) & 14);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new jy1(sw8Var, ou6Var, i, 5);
        }
    }
}

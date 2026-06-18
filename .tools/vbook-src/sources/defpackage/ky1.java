package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ky1 {
    public static final List a = gc1.Z(new lc1(ah1.j(855638016)), new lc1(ah1.j(0)));
    public static final float b = 15.0f;

    public static final void a(sw8 sw8Var, ou6 ou6Var, dd4 dd4Var, int i) {
        int i2;
        dd4Var.h0(-165495639);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(sw8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new iy1(sw8Var, 0);
                dd4Var.p0(objQ);
            }
            s32.F(ou6Var, (kb4) objQ, dd4Var, (i2 >> 3) & 14);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new jy1(sw8Var, ou6Var, i, 0);
        }
    }

    public static final void b(r43 r43Var, float f) {
        y91 y91VarP0 = r43Var.p0();
        long jG = y91VarP0.G();
        y91VarP0.x().i();
        try {
            lp8.E((lp8) y91VarP0.b, f, 0.0f, 2);
            List list = a;
            float f2 = b;
            ly5 ly5VarP = js8.p(list, r43Var.k0(f2), 8);
            float fK0 = r43Var.k0(f2);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (r43Var.f() & 4294967295L));
            r43.G0(r43Var, ly5VarP, 0L, (((long) Float.floatToRawIntBits(fK0)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0.0f, (s43) null, (qc1) null, 0, Token.FUNCTION);
        } finally {
            j39.s(y91VarP0, jG);
        }
    }
}

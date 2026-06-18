package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class xe {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    public static final void a(qb7 qb7Var, ou6 ou6Var, long j, dd4 dd4Var, int i) {
        int i2;
        dd4Var.h0(1776202187);
        int i3 = (dd4Var.f(qb7Var) ? 4 : 2) | i | (dd4Var.f(ou6Var) ? 32 : 16) | Token.CASE;
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            dd4Var.a0();
            if ((i & 1) == 0 || dd4Var.C()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                dd4Var.Y();
                i2 = i3 & (-897);
            }
            dd4Var.r();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new f0(qb7Var, 3);
                dd4Var.p0(objQ);
            }
            t1c.x(qb7Var, bv4.c, jf0.G(-1653527038, new se(j, a29.c(ou6Var, false, (kb4) objQ)), dd4Var), dd4Var, i4 | 432);
        } else {
            dd4Var.Y();
        }
        long j2 = j;
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new te(qb7Var, ou6Var, j2, i, 0);
        }
    }

    public static final void b(int i, int i2, dd4 dd4Var, ou6 ou6Var) {
        int i3;
        dd4Var.h0(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (dd4Var.f(ou6Var) ? 4 : 2) | i;
        }
        int i5 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                ou6Var = lu6.a;
            }
            un9.a(dd4Var, md2.B(tg9.o(ou6Var, a, 25.0f), new ve(((cka) dd4Var.j(dka.a)).a, i5)));
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ue(ou6Var, i, i2);
        }
    }
}

package defpackage;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class s96 {
    public static final ur9 a;

    static {
        ex1.a0(new z16(19));
        a = new ur9(new z16(20));
    }

    public static final void a(ad1 ad1Var, sv6 sv6Var, i99 i99Var, xbb xbbVar, rj1 rj1Var, dd4 dd4Var, int i) {
        int i2;
        dd4Var.h0(904511636);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(ad1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(sv6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.f(i99Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.f(xbbVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var.h(rj1Var) ? 16384 : 8192;
        }
        int i3 = 0;
        if (dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            dd4Var.a0();
            if ((i & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            q96 q96Var = new q96(ad1Var, xbbVar, i99Var, sv6Var);
            to8 to8VarA = ro8.a(0.0f, 7, 0L, false);
            long j = ad1Var.a;
            boolean zE = dd4Var.e(j);
            Object objQ = dd4Var.Q();
            if (zE || objQ == vl1.a) {
                objQ = new cka(j, lc1.c(0.4f, j));
                dd4Var.p0(objQ);
            }
            jv3.f(new p58[]{a.a(q96Var), k65.a.a(to8VarA), dka.a.a((cka) objQ)}, jf0.G(-1750539308, new r96(xbbVar, rj1Var, i3), dd4Var), dd4Var, 56);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new l41(ad1Var, sv6Var, i99Var, xbbVar, rj1Var, i, 7);
        }
    }

    public static final void b(ad1 ad1Var, i99 i99Var, xbb xbbVar, rj1 rj1Var, dd4 dd4Var, int i, int i2) {
        i99 i99Var2;
        xbb xbbVar2;
        i99 i99Var3;
        xbb xbbVar3;
        dd4Var.h0(-449719819);
        int i3 = (dd4Var.f(ad1Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && dd4Var.f(i99Var)) ? 32 : 16;
        }
        int i4 = i3 | (((i2 & 4) == 0 && dd4Var.f(xbbVar)) ? 256 : Token.CASE);
        if (dd4Var.V(i4 & 1, (i4 & 1171) != 1170)) {
            dd4Var.a0();
            int i5 = i & 1;
            ur9 ur9Var = a;
            if (i5 == 0 || dd4Var.C()) {
                if ((i2 & 2) != 0) {
                    i99Var3 = ((q96) dd4Var.j(ur9Var)).c;
                    i4 &= -113;
                } else {
                    i99Var3 = i99Var;
                }
                if ((i2 & 4) != 0) {
                    xbbVar3 = ((q96) dd4Var.j(ur9Var)).b;
                    i4 &= -897;
                }
                dd4Var.r();
                sv6 sv6Var = ((q96) dd4Var.j(ur9Var)).d;
                int i6 = i4 & 14;
                int i7 = i4 << 3;
                a(ad1Var, sv6Var, i99Var3, xbbVar3, rj1Var, dd4Var, (i7 & 7168) | i6 | (i7 & 896) | 24576);
                xbbVar2 = xbbVar3;
                i99Var2 = i99Var3;
            } else {
                dd4Var.Y();
                if ((i2 & 2) != 0) {
                    i4 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i4 &= -897;
                }
                i99Var3 = i99Var;
            }
            xbbVar3 = xbbVar;
            dd4Var.r();
            sv6 sv6Var2 = ((q96) dd4Var.j(ur9Var)).d;
            int i62 = i4 & 14;
            int i72 = i4 << 3;
            a(ad1Var, sv6Var2, i99Var3, xbbVar3, rj1Var, dd4Var, (i72 & 7168) | i62 | (i72 & 896) | 24576);
            xbbVar2 = xbbVar3;
            i99Var2 = i99Var3;
        } else {
            dd4Var.Y();
            i99Var2 = i99Var;
            xbbVar2 = xbbVar;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tv2(ad1Var, i99Var2, xbbVar2, rj1Var, i, i2, 3);
        }
    }
}

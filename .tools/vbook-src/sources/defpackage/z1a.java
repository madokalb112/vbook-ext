package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class z1a {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final nj9 f;

    static {
        float f2 = m79.T;
        a = f2;
        b = m79.d0;
        c = m79.a0;
        float f3 = m79.X;
        d = f3;
        e = (f3 - f2) / 2.0f;
        f = new nj9(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r51, defpackage.kb4 r52, ou6 r53, defpackage.yb4 r54, boolean r55, defpackage.y1a r56, dd4 r57, int r58, int r59) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1a.a(boolean, kb4, ou6, yb4, boolean, y1a, dd4, int, int):void");
    }

    public static final void b(ou6 ou6Var, boolean z, boolean z2, y1a y1aVar, yb4 yb4Var, ta5 ta5Var, t89 t89Var, dd4 dd4Var, int i) {
        int i2;
        int i3;
        long j;
        long j2;
        y1a y1aVar2 = y1aVar;
        yb4 yb4Var2 = yb4Var;
        dd4Var.h0(-670917213);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(ou6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.g(z2) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.f(y1aVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var.h(yb4Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dd4Var.f(ta5Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i2 |= dd4Var.f(t89Var) ? 1048576 : 524288;
        }
        if (dd4Var.V(i2 & 1, (599187 & i2) != 599186)) {
            long j3 = z2 ? z ? y1aVar2.b : y1aVar2.f : z ? y1aVar2.j : y1aVar2.n;
            long j4 = z2 ? z ? y1aVar2.a : y1aVar2.e : z ? y1aVar2.i : y1aVar2.m;
            t89 t89VarA = n99.a(m79.Z, dd4Var);
            float f2 = m79.Y;
            if (z2) {
                i3 = i2;
                j = z ? y1aVar2.c : y1aVar2.g;
            } else {
                i3 = i2;
                j = z ? y1aVar2.k : y1aVar2.o;
            }
            ou6 ou6VarL = fe.L(fw.G(ou6Var, f2, j, t89VarA), j3, t89VarA);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarL);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var, ha6VarD);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var, ou6VarL0);
            ou6 ou6VarL2 = fe.L(k65.a(zn0.a.a(lu6.a, bv4.e).e(new ssa(ta5Var, z, i12.g0(tv6.b, dd4Var))), ta5Var, ro8.a(m79.W / 2.0f, 4, 0L, false)), j4, t89Var);
            ha6 ha6VarD2 = pn0.d(bv4.f, false);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarL2);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ha6VarD2);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL02);
            if (yb4Var != null) {
                dd4Var.f0(1235836927);
                if (z2) {
                    y1aVar2 = y1aVar;
                    j2 = z ? y1aVar2.d : y1aVar2.h;
                } else {
                    y1aVar2 = y1aVar;
                    j2 = z ? y1aVar2.l : y1aVar2.p;
                }
                yb4Var2 = yb4Var;
                jv3.e(oq1.a.a(new lc1(j2)), yb4Var2, dd4Var, ((i3 >> 9) & Token.ASSIGN_MOD) | 8);
                dd4Var.q(false);
            } else {
                y1aVar2 = y1aVar;
                yb4Var2 = yb4Var;
                dd4Var.f0(1236071411);
                dd4Var.q(false);
            }
            dd4Var.q(true);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new dn0(ou6Var, z, z2, y1aVar2, yb4Var2, ta5Var, t89Var, i);
        }
    }
}

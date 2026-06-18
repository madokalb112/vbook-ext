package defpackage;

import java.util.List;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class qx8 {
    public static final p9b a = ah1.a0(Context.VERSION_ECMASCRIPT, 0, b83.a, 2);

    public static final void a(zk7 zk7Var, List list, ou6 ou6Var, dd4 dd4Var, int i) {
        int i2;
        ou6 ou6Var2;
        zk7Var.getClass();
        list.getClass();
        dd4Var.h0(2080349538);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(zk7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.h(list) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            rj1 rj1Var = ah1.v;
            rj1 rj1Var2 = ah1.w;
            int i4 = (i3 & 14) | 27648 | (i3 & Token.ASSIGN_MOD) | (i3 & 896);
            ou6 ou6Var3 = lu6.a;
            b(zk7Var, list, ou6Var3, rj1Var, rj1Var2, dd4Var, i4, 0);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new mx8(zk7Var, list, ou6Var2, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(zk7 r18, java.util.List r19, ou6 r20, defpackage.rj1 r21, defpackage.rj1 r22, dd4 r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx8.b(zk7, java.util.List, ou6, rj1, rj1, dd4, int, int):void");
    }

    public static final void c(final int i, final List list, ou6 ou6Var, final long j, final long j2, final rj1 rj1Var, uka ukaVar, ou6 ou6Var2, final kb4 kb4Var, dd4 dd4Var, final int i2) {
        final ou6 ou6Var3;
        final uka ukaVar2;
        final ou6 ou6Var4;
        ou6 ou6Var5;
        int i3;
        uka ukaVar3;
        ou6 ou6VarW;
        kb4Var.getClass();
        dd4Var.h0(-1308268243);
        int i4 = 2;
        int i5 = i2 | (dd4Var.d(i) ? 4 : 2) | (dd4Var.h(list) ? 32 : 16) | 37945728 | (dd4Var.h(kb4Var) ? 536870912 : 268435456);
        if (dd4Var.V(i5 & 1, (306783379 & i5) != 306783378)) {
            dd4Var.a0();
            if ((i2 & 1) == 0 || dd4Var.C()) {
                uka ukaVar4 = ((q96) dd4Var.j(s96.a)).b.j;
                ou6Var5 = lu6.a;
                ou6 ou6VarH = tg9.h(ou6Var5, 3.0f);
                rp8 rp8Var = tp8.a;
                i3 = i5 & (-264241153);
                ukaVar3 = ukaVar4;
                ou6VarW = t96.w(ou6VarH, new rp8(bx1.c(100), bx1.c(100), bx1.c(0), bx1.c(0)));
            } else {
                dd4Var.Y();
                i3 = i5 & (-264241153);
                ou6Var5 = ou6Var;
                ukaVar3 = ukaVar;
                ou6VarW = ou6Var2;
            }
            int i6 = i3;
            dd4Var.r();
            pn2 pn2Var = (pn2) dd4Var.j(xm1.h);
            Object objQ = dd4Var.Q();
            Object obj = objQ;
            if (objQ == vl1.a) {
                hk9 hk9Var = new hk9();
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    hk9Var.add(new x13(0.0f));
                }
                dd4Var.p0(hk9Var);
                obj = hk9Var;
            }
            hk9 hk9Var2 = (hk9) obj;
            ou6 ou6Var6 = ou6Var5;
            d(i, ou6Var6, j, j2, 0.0f, jf0.G(48614925, new ll6(i, hk9Var2, ou6VarW, i4), dd4Var), rj1Var, jf0.G(1925677069, new l41(list, i, kb4Var, pn2Var, ukaVar3, hk9Var2), dd4Var), dd4Var, (i6 & 14) | 14380464, 0);
            ou6Var3 = ou6Var6;
            ou6Var4 = ou6VarW;
            ukaVar2 = ukaVar3;
        } else {
            dd4Var.Y();
            ou6Var3 = ou6Var;
            ukaVar2 = ukaVar;
            ou6Var4 = ou6Var2;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(i, list, ou6Var3, j, j2, rj1Var, ukaVar2, ou6Var4, kb4Var, i2) { // from class: nx8
                public final /* synthetic */ int a;
                public final /* synthetic */ List b;
                public final /* synthetic */ ou6 c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ rj1 f;
                public final /* synthetic */ uka s;
                public final /* synthetic */ ou6 t;
                public final /* synthetic */ kb4 u;

                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(1600513);
                    qx8.c(this.a, this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, (dd4) obj2, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final void d(final int i, final ou6 ou6Var, final long j, long j2, final float f, final rj1 rj1Var, final yb4 yb4Var, final rj1 rj1Var2, dd4 dd4Var, final int i2, final int i3) {
        int i4;
        long jE;
        float f2;
        yb4 yb4Var2;
        rj1 rj1Var3;
        final long j3;
        dd4Var.h0(-1116422832);
        if ((i2 & 6) == 0) {
            i4 = (dd4Var.d(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= dd4Var.e(j) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                jE = j2;
                int i5 = dd4Var.e(jE) ? 2048 : 1024;
                i4 |= i5;
            } else {
                jE = j2;
            }
            i4 |= i5;
        } else {
            jE = j2;
        }
        if ((i2 & 24576) == 0) {
            f2 = f;
            i4 |= dd4Var.c(f2) ? 16384 : 8192;
        } else {
            f2 = f;
        }
        if ((196608 & i2) == 0) {
            i4 |= dd4Var.h(rj1Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            yb4Var2 = yb4Var;
            i4 |= dd4Var.h(yb4Var2) ? 1048576 : 524288;
        } else {
            yb4Var2 = yb4Var;
        }
        if ((i2 & 12582912) == 0) {
            rj1Var3 = rj1Var2;
            i4 |= dd4Var.h(rj1Var3) ? 8388608 : 4194304;
        } else {
            rj1Var3 = rj1Var2;
        }
        if (dd4Var.V(i4 & 1, (4793491 & i4) != 4793490)) {
            dd4Var.a0();
            if ((i2 & 1) == 0 || dd4Var.C()) {
                if ((i3 & 8) != 0) {
                    jE = dd1.e(i28.d, dd4Var);
                    i4 &= -7169;
                }
                long j4 = jE;
                dd4Var.r();
                j1a.a(ou6Var, (t89) null, j, j4, 0.0f, 0.0f, (wm0) null, jf0.G(1732289323, new fq6(f2, rj1Var3, yb4Var2, rj1Var, i), dd4Var), dd4Var, ((i4 >> 3) & 14) | 12582912 | (i4 & 896) | (i4 & 7168), 114);
                j3 = j4;
            } else {
                dd4Var.Y();
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                }
                long j42 = jE;
                dd4Var.r();
                j1a.a(ou6Var, (t89) null, j, j42, 0.0f, 0.0f, (wm0) null, jf0.G(1732289323, new fq6(f2, rj1Var3, yb4Var2, rj1Var, i), dd4Var), dd4Var, ((i4 >> 3) & 14) | 12582912 | (i4 & 896) | (i4 & 7168), 114);
                j3 = j42;
            }
        } else {
            dd4Var.Y();
            j3 = jE;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: ox8
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qx8.d(i, ou6Var, j, j3, f, rj1Var, yb4Var, rj1Var2, (dd4) obj, qu1.x0(i2 | 1), i3);
                    return heb.a;
                }
            };
        }
    }
}

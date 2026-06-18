package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zib {
    public static final float b = 0.38f;
    public static final int c = 9;
    public static final int d = 6;
    public static final int e = 10;
    public static final int f = 5;
    public static final int g = 15;
    public final /* synthetic */ int a;

    public static o0a a() {
        return new o0a(null);
    }

    public static final void b(int i, int i2, int i3, int i4, xf0 xf0Var, ou6 ou6Var, dd4 dd4Var, int i5) {
        dd4 dd4Var2;
        ou6 ou6Var2;
        boolean z;
        int i6 = i;
        int i7 = i3;
        dd4Var.h0(-1503238343);
        int i8 = i5 | (dd4Var.d(i6) ? 4 : 2) | (dd4Var.d(i2) ? 32 : 16) | (dd4Var.d(i7) ? 256 : Token.CASE) | (dd4Var.d(i4) ? 2048 : 1024) | (dd4Var.f(xf0Var) ? 16384 : 8192) | (dd4Var.f(ou6Var) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var.V(i8 & 1, (74899 & i8) != 74898)) {
            xf0 xf0Var2 = bv4.b;
            ha6 ha6VarD = pn0.d(xf0Var2, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
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
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarJ = tg9.j(tg9.f(ou6Var3, 1.0f), 20.0f, 0.0f, 2);
            zn0 zn0Var = zn0.a;
            ou6 ou6VarA = zn0Var.a(ou6VarJ, xf0Var);
            ha6 ha6VarD2 = pn0.d(xf0Var2, false);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarA);
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
            int i9 = i8 & 14;
            boolean z2 = i9 == 4;
            int i10 = i8 & Token.ASSIGN_MOD;
            boolean z3 = z2 | (i10 == 32);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z3 || objQ == obj) {
                objQ = (i6 + 1) + "/" + i2;
                dd4Var.p0(objQ);
            }
            nha.c((String) objQ, zn0Var.a(ou6Var3, bv4.e), s00.o(dd4Var).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).n, dd4Var, 0, 0, 131064);
            dd4Var2 = dd4Var;
            int i11 = i8 & 896;
            int i12 = i8 & 7168;
            boolean z4 = (i12 == 2048) | (i11 == 256);
            Object objQ2 = dd4Var2.Q();
            Object objI = "";
            if (z4 || objQ2 == obj) {
                if (i3 < 0 || i4 <= 0) {
                    objQ2 = "";
                } else {
                    objQ2 = (i3 + 1) + "/" + i4;
                }
                dd4Var2.p0(objQ2);
            }
            String str = (String) objQ2;
            boolean z5 = (i10 == 32) | (i9 == 4) | (i11 == 256) | (i12 == 2048);
            Object objQ3 = dd4Var2.Q();
            if (z5 || objQ3 == obj) {
                if (i4 > 0) {
                    i6 = i;
                    i7 = i3;
                    objI = tn9.i("%.1f", new Object[]{Float.valueOf(((int) (((((i7 + 1.0f) / i4) + i6) * 1000.0f) / i2)) / 10.0f)});
                } else {
                    i6 = i;
                    i7 = i3;
                }
                dd4Var2.p0(objI);
            } else {
                i7 = i3;
                objI = objQ3;
                i6 = i;
            }
            String str2 = (String) objI;
            ou6 ou6VarA2 = zn0Var.a(ou6Var3, bv4.s);
            eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var2, 0);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarA2);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            if (str2.length() > 0) {
                dd4Var2.f0(-1496974586);
                z = false;
                ou6Var2 = ou6Var3;
                nha.c(str, (ou6) null, s00.o(dd4Var2).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).n, dd4Var, 0, 0, 131066);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                ou6Var2 = ou6Var3;
                z = false;
                dd4Var2.f0(-1496753959);
                dd4Var2.q(false);
            }
            un9.a(dd4Var2, tg9.r(ou6Var2, 8.0f));
            if (str2.length() > 0) {
                dd4Var2.f0(-1496620349);
                dd4 dd4Var3 = dd4Var2;
                nha.c(wn9.L((pv9) mu9.C.getValue(), new Object[]{str2}, dd4Var2), (ou6) null, s00.o(dd4Var2).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).n, dd4Var3, 0, 0, 131066);
                dd4Var2 = dd4Var3;
                dd4Var2.q(z);
            } else {
                dd4Var2.f0(-1496366087);
                dd4Var2.q(z);
            }
            tw2.x(dd4Var2, true, true, true);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new dq6(i6, i2, i7, i4, xf0Var, ou6Var, i5);
        }
    }

    public static final void c(gqb gqbVar, ou6 ou6Var, dd4 dd4Var, int i) {
        gqbVar.getClass();
        dd4Var.h0(219059943);
        int i2 = (dd4Var.f(gqbVar) ? 4 : 2) | i;
        if (!dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            dd4Var.Y();
        } else if (gqbVar instanceof o27) {
            dd4Var.f0(1959587347);
            vw1.n(((o27) gqbVar).a, ou6Var, dd4Var, 48);
            dd4Var.q(false);
        } else {
            if (!(gqbVar instanceof jxb)) {
                throw j39.e(63211007, dd4Var, false);
            }
            dd4Var.f0(1959763985);
            fxb fxbVar = ((jxb) gqbVar).a;
            rt8 rt8Var = fxb.m;
            yn9.c(fxbVar, ou6Var, dd4Var, 56);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new b18(gqbVar, ou6Var, i, 24);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e A[PHI: r6
  0x005e: PHI (r6v29 int) = (r6v5 int), (r6v18 int), (r6v18 int), (r6v21 int), (r6v28 int), (r6v37 int), (r6v38 int) binds: [B:90:0x0149, B:65:0x00da, B:67:0x00e0, B:54:0x00b8, B:40:0x0083, B:28:0x0058, B:27:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String d(byte[] r16, int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zib.d(byte[], int, int):java.lang.String");
    }

    public static oj9 g() {
        return (oj9) vj9.b.get();
    }

    public static boolean h(StringBuilder sb) {
        sb.getClass();
        return sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ';
    }

    public static oj9 i(oj9 oj9Var) {
        if (oj9Var instanceof y5b) {
            y5b y5bVar = (y5b) oj9Var;
            if (y5bVar.t == sg9.i()) {
                y5bVar.r = null;
                return oj9Var;
            }
        }
        if (oj9Var instanceof z5b) {
            z5b z5bVar = (z5b) oj9Var;
            if (z5bVar.i == sg9.i()) {
                z5bVar.h = null;
                return oj9Var;
            }
        }
        oj9 oj9VarG = vj9.g(oj9Var, (kb4) null, false);
        oj9VarG.j();
        return oj9VarG;
    }

    public static Object j(do2 do2Var, ib4 ib4Var) {
        oj9 y5bVar;
        y5b y5bVar2 = (oj9) vj9.b.get();
        if (y5bVar2 instanceof y5b) {
            y5b y5bVar3 = y5bVar2;
            if (y5bVar3.t == sg9.i()) {
                kb4 kb4Var = y5bVar3.r;
                kb4 kb4Var2 = y5bVar3.s;
                try {
                    y5bVar2.r = vj9.k(do2Var, kb4Var, true);
                    y5bVar2.s = kb4Var2;
                    return ib4Var.invoke();
                } finally {
                    y5bVar3.r = kb4Var;
                    y5bVar3.s = kb4Var2;
                }
            }
        }
        if (y5bVar2 == null || (y5bVar2 instanceof yz6)) {
            y5bVar = new y5b(y5bVar2 instanceof yz6 ? (yz6) y5bVar2 : null, do2Var, (kb4) null, true, false);
        } else {
            y5bVar = y5bVar2.u(do2Var);
        }
        try {
            oj9 oj9VarJ = y5bVar.j();
            try {
                Object objInvoke = ib4Var.invoke();
                oj9.q(oj9VarJ);
                y5bVar.c();
                return objInvoke;
            } catch (Throwable th) {
                oj9.q(oj9VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            y5bVar.c();
            throw th2;
        }
    }

    public static void k(oj9 oj9Var, oj9 oj9Var2, kb4 kb4Var) {
        if (oj9Var != oj9Var2) {
            oj9Var2.getClass();
            oj9.q(oj9Var);
            oj9Var2.c();
        } else if (oj9Var instanceof y5b) {
            ((y5b) oj9Var).r = kb4Var;
        } else if (oj9Var instanceof z5b) {
            ((z5b) oj9Var).h = kb4Var;
        } else {
            mn5.n(oj9Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static final Object l(xua xuaVar, yb4 yb4Var) {
        qx1.B(xuaVar, true, new dx2(tw1.Q(xuaVar.f.getContext()).p(xuaVar.s, xuaVar, xuaVar.e)));
        return hn9.u(xuaVar, false, xuaVar, yb4Var);
    }

    public static final Class m(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m(((ParameterizedType) type).getRawType());
        }
        throw new abb("Cannot cast type " + type + " to java.lang.Class object.");
    }

    public static final void n(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static final Object o(long j, yb4 yb4Var, kt1 kt1Var) {
        if (j > 0) {
            return l(new xua(j, kt1Var), yb4Var);
        }
        throw new vua("Timed out immediately", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(long r6, defpackage.yb4 r8, defpackage.kt1 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.yua
            if (r0 == 0) goto L13
            r0 = r9
            yua r0 = (defpackage.yua) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            yua r0 = new yua
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            rg8 r6 = r0.a
            defpackage.e11.e0(r9)     // Catch: defpackage.vua -> L28
            return r9
        L28:
            r7 = move-exception
            goto L56
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r2
        L30:
            defpackage.e11.e0(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3a
            goto L5c
        L3a:
            rg8 r9 = new rg8
            r9.<init>()
            r0.a = r9     // Catch: defpackage.vua -> L54
            r0.c = r3     // Catch: defpackage.vua -> L54
            xua r1 = new xua     // Catch: defpackage.vua -> L54
            r1.<init>(r6, r0)     // Catch: defpackage.vua -> L54
            r9.a = r1     // Catch: defpackage.vua -> L54
            java.lang.Object r6 = l(r1, r8)     // Catch: defpackage.vua -> L54
            xx1 r7 = defpackage.xx1.a
            if (r6 != r7) goto L53
            return r7
        L53:
            return r6
        L54:
            r7 = move-exception
            r6 = r9
        L56:
            yd5 r8 = r7.a
            java.lang.Object r6 = r6.a
            if (r8 != r6) goto L5d
        L5c:
            return r2
        L5d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zib.p(long, yb4, kt1):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wc5 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e(byte[] r10, int r11, int r12) throws wc5 {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zib.e(byte[], int, int):java.lang.String");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: bjb */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.lang.String r25, byte[] r26, int r27, int r28) throws bjb {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zib.f(java.lang.String, byte[], int, int):int");
    }
}

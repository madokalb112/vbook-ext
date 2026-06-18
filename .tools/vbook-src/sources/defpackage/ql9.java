package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import com.google.android.gms.internal.measurement.zzby;
import com.google.android.gms.internal.measurement.zzcd;
import java.io.File;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ql9 {
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00ae -> B:42:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(defpackage.yy r9, int r10, defpackage.kt1 r11) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql9.A(yy, int, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v3, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v1, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable B(defpackage.vx r4, byte[] r5, defpackage.kt1 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.at9
            if (r0 == 0) goto L13
            r0 = r6
            at9 r0 = (defpackage.at9) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            at9 r0 = new at9
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            byte[] r5 = r0.a
            defpackage.e11.e0(r6)
            goto L3f
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r6)
            int r6 = r5.length
            r0.a = r5
            r0.c = r2
            java.lang.Object r6 = z(r4, r5, r6, r0)
            xx1 r4 = defpackage.xx1.a
            if (r6 != r4) goto L3f
            return r4
        L3f:
            java.lang.Number r6 = (java.lang.Number) r6
            int r4 = r6.intValue()
            int r6 = r5.length
            if (r6 != r4) goto L49
            return r5
        L49:
            byte[] r4 = java.util.Arrays.copyOf(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql9.B(vx, byte[], kt1):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0056 -> B:12:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C(defpackage.vx r6, byte[] r7, int r8, defpackage.kt1 r9) throws java.io.EOFException {
        /*
            boolean r0 = r9 instanceof defpackage.bt9
            if (r0 == 0) goto L13
            r0 = r9
            bt9 r0 = (defpackage.bt9) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            bt9 r0 = new bt9
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f
            int r1 = r0.s
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L32
            int r6 = r0.e
            int r7 = r0.d
            int r8 = r0.c
            vx r1 = r0.b
            byte[] r3 = r0.a
            defpackage.e11.e0(r9)
            r5 = r0
            r0 = r8
        L30:
            r8 = r5
            goto L5d
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            r6 = 0
            return r6
        L39:
            defpackage.e11.e0(r9)
            r9 = 0
            r1 = r0
            r0 = r8
        L3f:
            if (r8 <= 0) goto L8d
            r1.a = r7
            r1.b = r6
            r1.c = r0
            r1.d = r8
            r1.e = r9
            r1.s = r2
            java.lang.Object r3 = r6.g(r7, r9, r8, r1)
            xx1 r4 = defpackage.xx1.a
            if (r3 != r4) goto L56
            return r4
        L56:
            r5 = r1
            r1 = r6
            r6 = r9
            r9 = r3
            r3 = r7
            r7 = r8
            goto L30
        L5d:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 < 0) goto L8d
            if (r9 == 0) goto L6f
            int r6 = r6 + r9
            int r7 = r7 - r9
            r9 = r6
            r6 = r1
            r1 = r8
            r8 = r7
            r7 = r3
            goto L3f
        L6f:
            java.io.EOFException r6 = new java.io.EOFException
            java.lang.String r8 = "Not enough data. Expected="
            java.lang.String r9 = ", Read="
            java.lang.StringBuilder r8 = defpackage.xv5.u(r0, r8, r9)
            int r0 = r0 - r7
            r8.append(r0)
            java.lang.String r9 = ", Remaining="
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L8d:
            heb r6 = defpackage.heb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql9.C(vx, byte[], int, kt1):java.lang.Object");
    }

    public static final void D(aq5 aq5Var, String str, List list, ib4 ib4Var, yb4 yb4Var) {
        aq5Var.getClass();
        str.getClass();
        yb4Var.getClass();
        aq5Var.c0(list.size(), new kt6(23, new qc9(18), list), new bq0(4, new vw8(5, (byte) 0), list), new js6(13, list), new rj1(new l90(list, str, ib4Var, yb4Var, 8), true, -1117249557));
    }

    public static final void E(rcb rcbVar, rcb rcbVar2) {
        rcbVar.getClass();
        rcbVar2.getClass();
        rcbVar.d = rcbVar2.d;
        String str = rcbVar2.a;
        str.getClass();
        rcbVar.a = str;
        rcbVar.e(rcbVar2.c);
        List list = rcbVar2.h;
        list.getClass();
        rcbVar.h = list;
        rcbVar.e = rcbVar2.e;
        rcbVar.f = rcbVar2.f;
        qm7 qm7Var = new qm7(5);
        yn9.f(qm7Var, rcbVar2.i);
        rcbVar.i = qm7Var;
        rcbVar.j = new pq7(qm7Var);
        String str2 = rcbVar2.g;
        str2.getClass();
        rcbVar.g = str2;
        rcbVar.b = rcbVar2.b;
    }

    public static final void F(r5a r5aVar, int i) {
        H(r5aVar, i & 255);
        H(r5aVar, (i >>> 8) & 255);
    }

    public static final void G(r5a r5aVar, int i) {
        H(r5aVar, i & 255);
        H(r5aVar, (i >>> 8) & 255);
        H(r5aVar, (i >>> 16) & 255);
        H(r5aVar, (i >>> 24) & 255);
    }

    public static final void H(r5a r5aVar, int i) {
        byte[] bArr = r5aVar.b;
        bArr[0] = (byte) i;
        r5aVar.write(bArr, 0, 1);
    }

    public static void I(r5a r5aVar, String str) {
        zcb zcbVar = k31.a;
        zcbVar.getClass();
        byte[] bArrA = k31.a(str, zcbVar);
        r5aVar.write(bArrA, 0, bArrA.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc A[Catch: SQLiteException -> 0x00b7, LOOP:1: B:38:0x00bc->B:43:0x00ce, LOOP_START, PHI: r1
  0x00bc: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:37:0x00ba, B:43:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void J(jgc r10, android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql9.J(jgc, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static void K(jgc jgcVar, SQLiteDatabase sQLiteDatabase) {
        if (jgcVar == null) {
            gp.l("Monitor must not be null");
            return;
        }
        tg5 tg5Var = jgcVar.u;
        zzby.zza();
        String path = sQLiteDatabase.getPath();
        int i = zzcd.zza;
        File file = new File(path);
        if (!file.setReadable(false, false)) {
            tg5Var.e("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            tg5Var.e("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            tg5Var.e("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        tg5Var.e("Failed to turn on database write permission for owner");
    }

    public static final void a(String str, List list, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i) {
        int i2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(825517233);
        int i3 = (i & 6) == 0 ? (dd4Var2.f(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= dd4Var2.h(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 2048 : 1024;
        }
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = list.size() > 3;
            vf0 vf0Var = bv4.z;
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, ie1VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            lu6 lu6Var = lu6.a;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            boolean z2 = (i3 & 7168) == 2048;
            Object objQ = dd4Var2.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new or6(16, ib4Var);
                dd4Var2.p0(objQ);
            }
            ou6 ou6VarV = yn2.V(0, (ib4) objQ, dd4Var2, ou6VarF, z);
            eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var2, 0);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarV);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            dd4Var2.f0(1995636229);
            String strK = str.length() == 0 ? wn9.K((pv9) vt9.y0.getValue(), dd4Var2) : str;
            dd4Var2.q(false);
            boolean z3 = z;
            bp5 bp5Var = new bp5(1.0f, true);
            ur9 ur9Var = s96.a;
            nha.c(strK, bp5Var, ((q96) dd4Var2.j(ur9Var)).a.a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.g, dd4Var, 0, 0, 131064);
            dd4Var2 = dd4Var;
            if (z3) {
                dd4Var2.f0(1735457570);
                i2 = 0;
                mx4.a(i25.c((m53) a53.f.getValue(), dd4Var2, 0), (String) null, tg9.n(lu6Var, 24.0f), 0L, dd4Var2, 432, 8);
                dd4Var2.q(false);
            } else {
                i2 = 0;
                dd4Var2.f0(1735664619);
                dd4Var2.q(false);
            }
            xv5.z(dd4Var2, true, lu6Var, 12.0f, dd4Var2);
            ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
            ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var2, i2);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarF2);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA2);
            un9.s(jmVar2, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            dd4Var2.f0(2032716160);
            int iMin = Math.min(list.size(), 3);
            for (int i4 = 0; i4 < iMin; i4++) {
                if (i4 > 0) {
                    dd4Var2.f0(-1008193276);
                    y86.c(0.0f, 0, 3, dd1.g(((q96) dd4Var2.j(s96.a)).a, 8.0f), dd4Var2, null);
                    dd4Var2.q(false);
                } else {
                    dd4Var2.f0(-1008030867);
                    dd4Var2.q(false);
                }
                c((zf1) list.get(i4), gjb.n0(tg9.f(lu6Var, 1.0f), 0.0f, 12.0f, 1), dd4Var2, 56);
            }
            tw2.x(dd4Var2, false, true, true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new o50(str, list, ou6Var, ib4Var, i, 17);
        }
    }

    public static final void b(int i, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var) {
        dd4Var.h0(-209928237);
        int i2 = i & 1;
        if (!dd4Var.V(i2, i2 != 0)) {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xj7(ou6Var, ib4Var, i, 2);
        }
    }

    public static final void c(zf1 zf1Var, ou6 ou6Var, dd4 dd4Var, int i) {
        dd4 dd4Var2 = dd4Var;
        zf1Var.getClass();
        String str = zf1Var.d;
        dd4Var2.h0(1569820287);
        int i2 = i | (dd4Var2.h(zf1Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= dd4Var2.f(ou6Var) ? 32 : 16;
        }
        if (dd4Var2.V(i2 & 1, (i2 & 19) != 18)) {
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, ie1VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            lu6 lu6Var = lu6.a;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var2, 0);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarF);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            w05.a(zf1Var.b, null, false, jf0.G(424771648, new nl9(zf1Var, 0), dd4Var2), null, t96.w(tg9.n(lu6Var, 24.0f), tp8.a), null, dd4Var, 24576, 430);
            un9.a(dd4Var, tg9.r(lu6Var, 8.0f));
            nha.c(zf1Var.a, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var, 0, 0, 262142);
            dd4Var2 = dd4Var;
            xv5.z(dd4Var2, true, lu6Var, 6.0f, dd4Var2);
            Object[] objArr = new Object[0];
            Object objQ = dd4Var2.Q();
            if (objQ == vl1.a) {
                objQ = new aa9(27);
                dd4Var2.p0(objQ);
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var2, 48);
            String str2 = zf1Var.c;
            ur9 ur9Var = s96.a;
            uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.j;
            int i3 = (510 & 1) != 0 ? 0 : 5;
            long j = (510 & 4) != 0 ? spa.c : 0L;
            if (!spa.a(j, spa.c) && spa.c(j) < 0.0f) {
                r75.c("lineHeight can't be negative (" + spa.c(j) + ')');
            }
            vn9 vn9Var = ukaVar.a;
            km7 km7Var = ukaVar.b;
            km7Var.getClass();
            vv1.b(str2, (ou6) null, new uka(vn9Var, lm7.a(km7Var, i3, 0, j, (dha) null, (iu7) null, (iy5) null, 0, 0, (lia) null)), lc1.c(0.6f, ((q96) dd4Var2.j(ur9Var)).a.q), ((Boolean) a07Var.getValue()).booleanValue(), 5, jf0.G(637553550, new kq2(a07Var, 14), dd4Var2), (yb4) null, dd4Var2, 1769472, 130);
            if (str.length() > 0) {
                ky0.z(dd4Var2, 732628597, lu6Var, 8.0f, dd4Var2);
                nha.c(str, (ou6) null, lc1.c(0.6f, ((q96) dd4Var2.j(ur9Var)).a.q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.l, dd4Var, 0, 0, 131066);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(732897677);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new bo6((Object) zf1Var, false, (Object) ou6Var, i, 22);
        }
    }

    public static final void d(ou6 ou6Var, dd4 dd4Var, int i) {
        dd4Var.h0(1811245907);
        int i2 = (dd4Var.f(ou6Var) ? 4 : 2) | i;
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
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
            un9.s(ll1.f, dd4Var, ie1VarA);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            lu6 lu6Var = lu6.a;
            ah1.r(tg9.o(lu6Var, 100.0f, 30.0f), null, dd4Var, 6, 2);
            un9.a(dd4Var, tg9.h(lu6Var, 8.0f));
            dd4Var.f0(-191036509);
            for (int i3 = 0; i3 < 3; i3++) {
                e(gjb.n0(tg9.f(lu6Var, 1.0f), 0.0f, 12.0f, 1), dd4Var, 6);
            }
            dd4Var.q(false);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var, i, 20);
        }
    }

    public static final void e(ou6 ou6Var, dd4 dd4Var, int i) {
        int i2;
        dd4Var.h0(-1692893434);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(ou6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
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
            un9.s(jmVar, dd4Var, ie1VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var, ou6VarL0);
            lu6 lu6Var = lu6.a;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var, 0);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarF);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, eq8VarA);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL02);
            ah1.q(null, t96.w(tg9.n(lu6Var, 24.0f), tp8.a), dd4Var, 0, 1);
            un9.a(dd4Var, tg9.r(lu6Var, 8.0f));
            ah1.r(tg9.o(lu6Var, 100.0f, 24.0f), null, dd4Var, 6, 2);
            xv5.z(dd4Var, true, lu6Var, 6.0f, dd4Var);
            ah1.r(tg9.h(tg9.f(lu6Var, 1.0f), 20.0f), null, dd4Var, 6, 2);
            un9.a(dd4Var, tg9.h(lu6Var, 2.0f));
            ah1.r(tg9.o(lu6Var, 100.0f, 20.0f), null, dd4Var, 6, 2);
            un9.a(dd4Var, tg9.h(lu6Var, 2.0f));
            ah1.r(tg9.o(lu6Var, 50.0f, 16.0f), null, dd4Var, 6, 2);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ue(ou6Var, i, 5, (byte) 0);
        }
    }

    public static final void f(String str, String str2, String str3, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i) {
        str.getClass();
        ib4Var2.getClass();
        dd4Var.h0(1538794895);
        int i2 = i | (dd4Var.f(str) ? 4 : 2) | (dd4Var.f(str2) ? 32 : 16) | (dd4Var.f(str3) ? 256 : Token.CASE) | (dd4Var.f(ou6Var) ? 2048 : 1024) | (dd4Var.h(ib4Var) ? 16384 : 8192) | (dd4Var.h(ib4Var2) ? 131072 : Parser.ARGC_LIMIT);
        int i3 = 0;
        if (dd4Var.V(i2 & 1, (74899 & i2) != 74898)) {
            String strH = dx1.h(str, "-", str3);
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z || objQ == obj) {
                objQ = new lq2(str, str3, 3);
                dd4Var.p0(objQ);
            }
            ib4 ib4Var3 = (ib4) objQ;
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ry6 ry6VarD = pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b;
            ev8 ev8VarA = ek5.a(dd4Var);
            a91 a91VarA = ug8.a(yl9.class);
            yl9 yl9Var = (yl9) ((qtb) qx1.N(a91VarA, pj4VarA.f(), dx1.h(a91VarA.f(), "-", strH), ry6VarD, ev8VarA, ib4Var3));
            boolean zF = dd4Var.f(yl9Var);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new ol9(yl9Var, i3);
                dd4Var.p0(objQ2);
            }
            lx1.g(yl9Var, null, (kb4) objQ2, dd4Var, 0);
            a07 a07VarB = bx1.B(yl9Var.M, dd4Var);
            if (((ul9) a07VarB.getValue()).a) {
                dd4Var.f0(2053360265);
                d(tg9.f(ou6Var, 1.0f), dd4Var, 0);
                dd4Var.q(false);
            } else if (((ul9) a07VarB.getValue()).d) {
                dd4Var.f0(2053469509);
                b((i2 >> 9) & Token.ASSIGN_MOD, ib4Var, dd4Var, tg9.f(ou6Var, 1.0f));
                dd4Var.q(false);
            } else if (((ul9) a07VarB.getValue()).c.isEmpty()) {
                dd4Var.f0(2053882739);
                dd4Var.q(false);
            } else {
                dd4Var.f0(2053660562);
                a(str2, ((ul9) a07VarB.getValue()).c, tg9.f(ou6Var, 1.0f), ib4Var2, dd4Var, ((i2 >> 3) & 14) | ((i2 >> 6) & 7168));
                dd4Var.q(false);
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uq6(str, str2, str3, ou6Var, ib4Var, ib4Var2, i);
        }
    }

    public static final void g(int i, int i2, kb4 kb4Var, dd4 dd4Var, ou6 ou6Var) {
        int i3;
        kb4Var.getClass();
        dd4Var.h0(1752200449);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.c(0.75f) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 2048 : 1024;
        }
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = ((i3 & 14) == 4) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new gi(i, kb4Var, 7);
                dd4Var.p0(objQ);
            }
            mt5.a(ou6Var, i, null, null, null, null, null, false, (kb4) objQ, dd4Var, ((i3 >> 3) & 14) | ((i3 << 3) & Token.ASSIGN_MOD), 508);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ura(i, ou6Var, kb4Var, i2);
        }
    }

    public static final void h(long j, ou6 ou6Var, dd4 dd4Var, int i) {
        dd4Var.h0(1600995213);
        int i2 = (dd4Var.e(j) ? 4 : 2) | i;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new ve(j, 9);
                dd4Var.p0(objQ);
            }
            s32.F(ou6Var, (kb4) objQ, dd4Var, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new se(j, ou6Var, i, 4);
        }
    }

    public static final void i(long j, ou6 ou6Var, dd4 dd4Var, int i) {
        dd4Var.h0(-1893436530);
        int i2 = (dd4Var.e(j) ? 4 : 2) | i;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            int i3 = 14;
            boolean z = (i2 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new ve(j, i3);
                dd4Var.p0(objQ);
            }
            s32.F(ou6Var, (kb4) objQ, dd4Var, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new se(j, ou6Var, i, 9);
        }
    }

    public static final void j(long j, ou6 ou6Var, dd4 dd4Var, int i) {
        dd4Var.h0(-1092900977);
        int i2 = (dd4Var.e(j) ? 4 : 2) | i;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new ve(j, 11);
                dd4Var.p0(objQ);
            }
            s32.F(ou6Var, (kb4) objQ, dd4Var, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new se(j, ou6Var, i, 6);
        }
    }

    public static final void k(long j, ou6 ou6Var, dd4 dd4Var, int i) {
        dd4Var.h0(-292365424);
        int i2 = (dd4Var.e(j) ? 4 : 2) | i;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new ve(j, 8);
                dd4Var.p0(objQ);
            }
            s32.F(ou6Var, (kb4) objQ, dd4Var, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new se(j, ou6Var, i, 3);
        }
    }

    public static final void l(long j, ou6 ou6Var, dd4 dd4Var, int i) {
        dd4Var.h0(508170129);
        int i2 = (dd4Var.e(j) ? 4 : 2) | i;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new ve(j, 10);
                dd4Var.p0(objQ);
            }
            s32.F(ou6Var, (kb4) objQ, dd4Var, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new se(j, ou6Var, i, 5);
        }
    }

    public static final void m(long j, ou6 ou6Var, dd4 dd4Var, int i) {
        dd4Var.h0(1308705682);
        int i2 = (dd4Var.e(j) ? 4 : 2) | i;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new ve(j, 7);
                dd4Var.p0(objQ);
            }
            s32.F(ou6Var, (kb4) objQ, dd4Var, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new se(j, ou6Var, i, 2);
        }
    }

    public static final void n(long j, ou6 ou6Var, dd4 dd4Var, int i) {
        dd4Var.h0(2109241235);
        int i2 = (dd4Var.e(j) ? 4 : 2) | i;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new ve(j, 13);
                dd4Var.p0(objQ);
            }
            s32.F(ou6Var, (kb4) objQ, dd4Var, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new se(j, ou6Var, i, 8);
        }
    }

    public static final void o(long j, ou6 ou6Var, dd4 dd4Var, int i) {
        dd4Var.h0(-1385190508);
        int i2 = (dd4Var.e(j) ? 4 : 2) | i;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new ve(j, 12);
                dd4Var.p0(objQ);
            }
            s32.F(ou6Var, (kb4) objQ, dd4Var, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new se(j, ou6Var, i, 7);
        }
    }

    public static final ngb p(String str) {
        str.getClass();
        rcb rcbVar = new rcb();
        scb.b(rcbVar, str);
        return rcbVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.xu4 q(o57 r4, defpackage.kt1 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.ojb
            if (r0 == 0) goto L13
            r0 = r5
            ojb r0 = (defpackage.ojb) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ojb r0 = new ojb
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            int r0 = r0.b
            if (r0 == 0) goto L36
            r4 = 1
            r1 = 0
            if (r0 != r4) goto L30
            defpackage.e11.e0(r5)
            byte[] r5 = (byte[]) r5
            if (r5 == 0) goto L2f
            boolean r4 = r5 instanceof defpackage.wh7
            if (r4 == 0) goto L2e
            throw r1
        L2e:
            throw r1
        L2f:
            return r1
        L30:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r1
        L36:
            defpackage.e11.e0(r5)
            xu4 r5 = new xu4
            r5.<init>()
            rcb r0 = r5.a
            java.lang.String r1 = r4.a
            defpackage.scb.b(r0, r1)
            gu4 r0 = defpackage.gu4.b
            java.lang.String r0 = r4.b
            gu4 r0 = defpackage.y86.U(r0)
            r5.b = r0
            l57 r4 = r4.c
            java.util.Map r4 = r4.a
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L5b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            fk4 r2 = r5.c
            r2.g(r1, r0)
            goto L5b
        L79:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql9.q(o57, kt1):xu4");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.gv4 r18, defpackage.kt1 r19) {
        /*
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof defpackage.pjb
            if (r2 == 0) goto L17
            r2 = r1
            pjb r2 = (defpackage.pjb) r2
            int r3 = r2.s
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.s = r3
            goto L1c
        L17:
            pjb r2 = new pjb
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f
            int r3 = r2.s
            r4 = 1
            if (r3 == 0) goto L41
            if (r3 != r4) goto L3a
            long r3 = r2.e
            long r5 = r2.d
            int r0 = r2.c
            l57 r7 = r2.b
            gv4 r2 = r2.a
            defpackage.e11.e0(r1)
            r10 = r0
            r17 = r2
            r13 = r3
            r15 = r7
        L37:
            r11 = r5
            goto Lb5
        L3a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r0)
            r0 = 0
            return r0
        L41:
            defpackage.e11.e0(r1)
            yv4 r1 = r0.e()
            int r1 = r1.a
            wc4 r3 = r0.c()
            long r5 = r3.u
            wc4 r3 = r0.d()
            long r7 = r3.u
            ek4 r3 = r0.a()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.util.Set r3 = r3.b()
            java.util.Iterator r3 = r3.iterator()
        L67:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L90
            java.lang.Object r10 = r3.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getKey()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r10.getValue()
            java.util.List r10 = (java.util.List) r10
            java.util.Locale r12 = java.util.Locale.ROOT
            java.lang.String r11 = r11.toLowerCase(r12)
            r11.getClass()
            java.util.ArrayList r10 = defpackage.fc1.b1(r10)
            r9.put(r11, r10)
            goto L67
        L90:
            l57 r3 = new l57
            java.util.Map r9 = defpackage.y86.i0(r9)
            r3.<init>(r9)
            r2.a = r0
            r2.b = r3
            r2.c = r1
            r2.d = r5
            r2.e = r7
            r2.s = r4
            java.lang.Object r2 = vv1.n(r0, r2)
            xx1 r4 = defpackage.xx1.a
            if (r2 != r4) goto Lae
            return r4
        Lae:
            r17 = r0
            r10 = r1
            r1 = r2
            r15 = r3
            r13 = r7
            goto L37
        Lb5:
            ut0 r1 = (defpackage.ut0) r1
            gl5 r0 = new gl5
            r0.<init>(r1)
            s57 r9 = new s57
            r16 = r0
            r9.<init>(r10, r11, r13, r15, r16, r17)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql9.r(gv4, kt1):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:24|(3:26|(1:28)|63)|33|(1:35)|39|67|40|(3:43|44|(2:46|(1:48)(6:49|50|51|67|40|(0)))(3:(1:53)|56|57))|63) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        if (r13.f(r1, r15, r14, r0) == r4) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cd, code lost:
    
        if (r15 == r4) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013b, code lost:
    
        if (r1.a(r0) == r4) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0146, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0147, code lost:
    
        r13 = r12;
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014a, code lost:
    
        if (r13 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014c, code lost:
    
        r0.a = r12;
        r0.b = null;
        r0.c = null;
        r0.d = null;
        r0.t = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015b, code lost:
    
        if (r1.a(r0) == r4) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        throw r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:26:0x0089, B:33:0x00b9], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:15:0x004b, B:50:0x0121, B:44:0x0100, B:46:0x0108, B:20:0x0062), top: B:65:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v21, types: [int] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r13v0, types: [iy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11, types: [int] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [vx] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [ax] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [ax, vx] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [iy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x011e -> B:50:0x0121). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(defpackage.vx r12, defpackage.iy r13, int r14, defpackage.kt1 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql9.s(vx, iy, int, kt1):java.lang.Object");
    }

    public static final n1c t(d2c d2cVar) {
        d2cVar.getClass();
        return new n1c(d2cVar.a, d2cVar.t);
    }

    public static final eub u(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(2131362480);
            eub eubVar = tag instanceof eub ? (eub) tag : null;
            if (eubVar != null) {
                return eubVar;
            }
            Object objS = dk9.s(view);
            view = objS instanceof View ? (View) objS : null;
        }
        return null;
    }

    public static final long v(qha qhaVar, int i, boolean z, boolean z2) {
        gx6 gx6Var = qhaVar.b;
        long j = qhaVar.c;
        int iD = gx6Var.d(i);
        if (iD >= gx6Var.f) {
            return 9205357640488583168L;
        }
        return (((long) Float.floatToRawIntBits(wx1.P(qhaVar.f(i, qhaVar.a(((!z || z2) && (z || !z2)) ? Math.max(i + (-1), 0) : i) == gx6Var.i(i)), 0.0f, (int) (j >> 32)))) << 32) | (((long) Float.floatToRawIntBits(wx1.P(gx6Var.b(iD), 0.0f, (int) (j & 4294967295L)))) & 4294967295L);
    }

    public static void w(wga wgaVar, lda ldaVar, qha qhaVar, ym5 ym5Var, iha ihaVar, boolean z, ob7 ob7Var) {
        if (z) {
            int iW = ob7Var.w(pja.f(wgaVar.b));
            String str = kfa.a;
            kf8 kf8VarB = iW < qhaVar.a.a.b.length() ? qhaVar.b(iW) : iW != 0 ? qhaVar.b(iW - 1) : new kf8(0.0f, 0.0f, 1.0f, (int) (kfa.b(ldaVar.b, ldaVar.g, ldaVar.h) & 4294967295L));
            float f = kf8VarB.b;
            float f2 = kf8VarB.a;
            long jP = ym5Var.P((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            kf8 kf8VarW = rw1.w((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jP & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jP >> 32)))) << 32), (((long) Float.floatToRawIntBits(kf8VarB.c - f2)) << 32) | (((long) Float.floatToRawIntBits(kf8VarB.d - f)) & 4294967295L));
            if (lc5.Q((iha) ihaVar.a.b.get(), ihaVar)) {
                ihaVar.b.h(kf8VarW);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:21:0x0050, B:76:0x0139, B:26:0x005f, B:73:0x0125, B:29:0x0068, B:68:0x010a, B:70:0x0112, B:77:0x013c, B:32:0x0071, B:62:0x00f0, B:35:0x007c, B:59:0x00db, B:38:0x0084, B:56:0x00c3, B:41:0x008c, B:51:0x00ab, B:53:0x00b3, B:63:0x00f4, B:65:0x00f8, B:44:0x0093, B:46:0x0097, B:48:0x009b), top: B:97:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00db A[Catch: all -> 0x0055, PHI: r4 r9 r10
  0x00db: PHI (r4v1 long) = (r4v0 long), (r4v3 long) binds: [B:57:0x00d7, B:35:0x007c] A[DONT_GENERATE, DONT_INLINE]
  0x00db: PHI (r9v10 vx) = (r9v7 vx), (r9v12 vx) binds: [B:57:0x00d7, B:35:0x007c] A[DONT_GENERATE, DONT_INLINE]
  0x00db: PHI (r10v27 java.lang.Object) = (r10v26 java.lang.Object), (r10v1 java.lang.Object) binds: [B:57:0x00d7, B:35:0x007c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0055, blocks: (B:21:0x0050, B:76:0x0139, B:26:0x005f, B:73:0x0125, B:29:0x0068, B:68:0x010a, B:70:0x0112, B:77:0x013c, B:32:0x0071, B:62:0x00f0, B:35:0x007c, B:59:0x00db, B:38:0x0084, B:56:0x00c3, B:41:0x008c, B:51:0x00ab, B:53:0x00b3, B:63:0x00f4, B:65:0x00f8, B:44:0x0093, B:46:0x0097, B:48:0x009b), top: B:97:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f4 A[Catch: all -> 0x0055, PHI: r9
  0x00f4: PHI (r9v3 vx) = (r9v0 vx), (r9v0 vx), (r9v4 vx) binds: [B:45:0x0095, B:47:0x0099, B:52:0x00b1] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0055, blocks: (B:21:0x0050, B:76:0x0139, B:26:0x005f, B:73:0x0125, B:29:0x0068, B:68:0x010a, B:70:0x0112, B:77:0x013c, B:32:0x0071, B:62:0x00f0, B:35:0x007c, B:59:0x00db, B:38:0x0084, B:56:0x00c3, B:41:0x008c, B:51:0x00ab, B:53:0x00b3, B:63:0x00f4, B:65:0x00f8, B:44:0x0093, B:46:0x0097, B:48:0x009b), top: B:97:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0112 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:21:0x0050, B:76:0x0139, B:26:0x005f, B:73:0x0125, B:29:0x0068, B:68:0x010a, B:70:0x0112, B:77:0x013c, B:32:0x0071, B:62:0x00f0, B:35:0x007c, B:59:0x00db, B:38:0x0084, B:56:0x00c3, B:41:0x008c, B:51:0x00ab, B:53:0x00b3, B:63:0x00f4, B:65:0x00f8, B:44:0x0093, B:46:0x0097, B:48:0x009b), top: B:97:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0169 A[Catch: all -> 0x0048, TryCatch #2 {all -> 0x0048, blocks: (B:16:0x0043, B:83:0x0161, B:85:0x0169, B:86:0x016e), top: B:100:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016e A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #2 {all -> 0x0048, blocks: (B:16:0x0043, B:83:0x0161, B:85:0x0169, B:86:0x016e), top: B:100:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a A[RETURN] */
    /* JADX WARN: Type inference failed for: r10v48, types: [java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r9v36, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x015e -> B:83:0x0161). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable x(defpackage.vx r9, defpackage.kt1 r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql9.x(vx, kt1):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v4, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v2, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable y(defpackage.vx r4, int r5, defpackage.kt1 r6) throws java.io.EOFException {
        /*
            boolean r0 = r6 instanceof defpackage.xs9
            if (r0 == 0) goto L13
            r0 = r6
            xs9 r0 = (defpackage.xs9) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xs9 r0 = new xs9
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            byte[] r4 = r0.a
            defpackage.e11.e0(r6)
            return r4
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r6)
            byte[] r6 = new byte[r5]
            r0.a = r6
            r0.c = r2
            java.lang.Object r4 = C(r4, r6, r5, r0)
            xx1 r5 = defpackage.xx1.a
            if (r4 != r5) goto L40
            return r5
        L40:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql9.y(vx, int, kt1):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:19:0x005a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(defpackage.vx r6, byte[] r7, int r8, defpackage.kt1 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.ys9
            if (r0 == 0) goto L13
            r0 = r9
            ys9 r0 = (defpackage.ys9) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            ys9 r0 = new ys9
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f
            int r1 = r0.s
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            int r6 = r0.e
            int r7 = r0.d
            int r8 = r0.c
            byte[] r1 = r0.b
            vx r3 = r0.a
            defpackage.e11.e0(r9)
            goto L5a
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            r6 = 0
            return r6
        L36:
            defpackage.e11.e0(r9)
            r9 = 0
            r1 = r0
            r0 = r9
        L3c:
            r1.a = r6
            r1.b = r7
            r1.c = r0
            r1.d = r8
            r1.e = r9
            r1.s = r2
            java.lang.Object r3 = r6.g(r7, r9, r8, r1)
            xx1 r4 = defpackage.xx1.a
            if (r3 != r4) goto L51
            return r4
        L51:
            r5 = r3
            r3 = r6
            r6 = r9
            r9 = r5
            r5 = r1
            r1 = r7
            r7 = r8
            r8 = r0
            r0 = r5
        L5a:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 <= 0) goto L6d
            int r6 = r6 + r9
            int r7 = r7 - r9
            int r8 = r8 + r9
            r9 = r8
            r8 = r7
            r7 = r1
            r1 = r0
            r0 = r9
            r9 = r6
            r6 = r3
            goto L3c
        L6d:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql9.z(vx, byte[], int, kt1):java.lang.Object");
    }
}

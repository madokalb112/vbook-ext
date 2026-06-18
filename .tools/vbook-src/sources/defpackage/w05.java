package defpackage;

import android.content.Context;
import java.util.Locale;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class w05 {
    public static final fn1 a = new fn1(new un4(17));

    /* JADX WARN: Removed duplicated region for block: B:115:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.Object r20, sr1 r21, boolean r22, defpackage.zb4 r23, defpackage.zb4 r24, ou6 r25, defpackage.kb4 r26, dd4 r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w05.a(java.lang.Object, sr1, boolean, zb4, zb4, ou6, kb4, dd4, int, int):void");
    }

    public static final void b(Object obj, sr1 sr1Var, boolean z, rj1 rj1Var, rj1 rj1Var2, ou6 ou6Var, dd4 dd4Var, int i) {
        int i2;
        dd4 dd4Var2 = dd4Var;
        obj.getClass();
        dd4Var2.h0(1282336367);
        if ((i & 6) == 0) {
            i2 = (dd4Var2.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var2.f(sr1Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= dd4Var2.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= dd4Var2.h(rj1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= dd4Var2.h(rj1Var2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i) == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 1048576 : 524288;
        }
        int i4 = i3 | 12582912;
        if (dd4Var2.V(i4 & 1, (4793491 & i4) != 4793490)) {
            Context context = (Context) dd4Var2.j(he.b);
            boolean zF = ((i4 & 7168) == 2048) | dd4Var2.f(obj) | dd4Var2.f(context);
            Object objQ = dd4Var2.Q();
            fu6 fu6Var = vl1.a;
            if (zF || objQ == fu6Var) {
                w15 w15Var = new w15(context);
                w15Var.c = obj;
                f25.a(w15Var, z);
                w15Var.j = uw0.c;
                objQ = w15Var.a();
                dd4Var2.p0(objQ);
            }
            int i5 = (i4 << 9) & 57344;
            px pxVarG0 = fe.g0((a25) objQ, (b15) dd4Var2.j(a), null, null, sr1Var, dd4Var2, 44);
            int i6 = i4 >> 18;
            ha6 ha6VarD = pn0.d(bv4.b, false);
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
            un9.s(ll1.f, dd4Var2, ha6VarD);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            i12.g(pxVarG0, (String) null, tg9.c, (f9) null, sr1Var, 0.0f, (qc1) null, dd4Var, (i6 & Token.ASSIGN_MOD) | 384 | i5 | ((i4 << 12) & 3670016), 40);
            dd4Var2 = dd4Var;
            a07 a07VarB = bx1.B(pxVarG0.G, dd4Var2);
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == fu6Var) {
                objQ2 = dk9.n(new op0(a07VarB, 3));
                dd4Var2.p0(objQ2);
            }
            boolean zBooleanValue = ((Boolean) ((br9) objQ2).getValue()).booleanValue();
            Object obj2 = zn0.a;
            if (zBooleanValue) {
                dd4Var2.f0(1296422664);
                rj1Var2.c(obj2, dd4Var2, Integer.valueOf(((i4 >> 12) & Token.ASSIGN_MOD) | 6));
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(1296458221);
                dd4Var2.q(false);
            }
            Object objQ3 = dd4Var2.Q();
            if (objQ3 == fu6Var) {
                objQ3 = dk9.n(new op0(a07VarB, 4));
                dd4Var2.p0(objQ3);
            }
            if (((Boolean) ((br9) objQ3).getValue()).booleanValue()) {
                dd4Var2.f0(1296609191);
                rj1Var.g(obj2, pxVarG0, dd4Var2, Integer.valueOf(((i4 >> 6) & 896) | 6));
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(1296645709);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new k71(obj, sr1Var, z, rj1Var, rj1Var2, ou6Var, i);
        }
    }

    public static final void c(String str, String str2, String str3, String str4, sr1 sr1Var, ou6 ou6Var, dd4 dd4Var, int i) {
        int i2;
        tw2.A(str, str2, str3, str4);
        dd4Var.h0(1826106065);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.f(str3) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.f(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var.f(sr1Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        int i3 = i2 | 1572864;
        int i4 = 1;
        if (!dd4Var.V(i3 & 1, (599187 & i3) != 599186)) {
            dd4Var.Y();
        } else if (str.length() == 0) {
            dd4Var.f0(1470263745);
            ah1.q(null, ou6Var, dd4Var, (i3 >> 12) & Token.ASSIGN_MOD, 1);
            dd4Var.q(false);
        } else {
            dd4Var.f0(1470354947);
            boolean z = ((i3 & 14) == 4) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new ki0(str, str3, str4);
                dd4Var.p0(objQ);
            }
            a((ki0) objQ, sr1Var, false, jf0.G(946747558, new sq4(str2, i4), dd4Var), jf0.o, ou6Var, null, dd4Var, ((i3 >> 9) & Token.ASSIGN_MOD) | 221184 | ((i3 << 3) & 3670016) | ((i3 << 6) & 234881024), 140);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tz0(str, str2, str3, str4, sr1Var, ou6Var, i);
        }
    }

    public static final void d(String str, String str2, String str3, sr1 sr1Var, ou6 ou6Var, dd4 dd4Var, int i) {
        int i2;
        String str4;
        String str5;
        String str6;
        dd4 dd4Var2 = dd4Var;
        j39.v(str, str2, str3);
        dd4Var2.h0(83274841);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (dd4Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var2.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var2.f(str3) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var2.f(sr1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var2.f(ou6Var) ? 16384 : 8192;
        }
        int i4 = i2 | 196608;
        if (!dd4Var2.V(i4 & 1, (74899 & i4) != 74898)) {
            str4 = str;
            str5 = str2;
            str6 = str3;
            dd4Var2.Y();
        } else if (str2.length() == 0) {
            dd4Var2.f0(-1650066125);
            ha6 ha6VarD = pn0.d(bv4.b, false);
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
            un9.s(ll1.f, dd4Var2, ha6VarD);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            i12.g(i25.b((m53) a53.D.getValue(), dd4Var2), (String) null, tg9.c, (f9) null, ra1.d, 0.0f, (qc1) null, dd4Var2, 25016, Token.ASSIGN_LOGICAL_AND);
            nha.c(str, zn0.a.a(gjb.l0(lu6.a, 12.0f), bv4.f), lc1.b, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.i, dd4Var, (i4 & 14) | 384, 0, 131064);
            str4 = str;
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            dd4Var2.q(false);
            str5 = str2;
            str6 = str3;
        } else {
            boolean z = true;
            str4 = str;
            dd4Var2.f0(-1649505211);
            boolean z2 = (i4 & Token.ASSIGN_MOD) == 32;
            if ((i4 & 896) != 256) {
                z = false;
            }
            boolean z3 = z | z2;
            Object objQ = dd4Var2.Q();
            if (z3 || objQ == vl1.a) {
                str5 = str2;
                str6 = str3;
                objQ = new uk0(str5, str6);
                dd4Var2.p0(objQ);
            } else {
                str5 = str2;
                str6 = str3;
            }
            a((uk0) objQ, sr1Var, false, jf0.G(1191113124, new sq4(str4, i3), dd4Var2), jf0.p, ou6Var, null, dd4Var2, ((i4 >> 6) & Token.ASSIGN_MOD) | 221184 | (3670016 & (i4 << 6)) | ((i4 << 9) & 234881024), 140);
            dd4Var2.q(false);
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new l41(str4, (Object) str5, (Object) str6, (Object) sr1Var, ou6Var, i, 6);
        }
    }

    public static final void e(String str, ou6 ou6Var, dd4 dd4Var, int i) {
        ou6 ou6Var2;
        dd4 dd4Var2;
        dd4Var.h0(2065722846);
        int i2 = (dd4Var.f(str) ? 4 : 2) | i;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                objQ = "https://flagsapi.com/" + upperCase + "/flat/64.png";
                dd4Var.p0(objQ);
            }
            ou6Var2 = ou6Var;
            dd4Var2 = dd4Var;
            a((String) objQ, null, false, null, null, ou6Var2, null, dd4Var2, 1572864, 446);
        } else {
            ou6Var2 = ou6Var;
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new b7(str, ou6Var2, i, 6);
        }
    }

    public static final void f(b15 b15Var, rj1 rj1Var, dd4 dd4Var, int i) {
        b15Var.getClass();
        dd4Var.h0(972749801);
        int i2 = (dd4Var.h(b15Var) ? 4 : 2) | i;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            jv3.e(a.a(b15Var), rj1Var, dd4Var, 56);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new il6(b15Var, rj1Var, i, 28);
        }
    }
}

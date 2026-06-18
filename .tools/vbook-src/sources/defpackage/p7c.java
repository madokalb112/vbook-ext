package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class p7c {
    public static final cu3 A;
    public static final cu3[] B;
    public static final iv a = new iv(0);
    public static final iv b = new iv(1);
    public static final pd1 c = new pd1();
    public static final wd1 d = new wd1();
    public static final rj1 e = new rj1(new ak1(2), false, 620422077);
    public static final rj1 f = new rj1(new bk1(6), false, 853022986);
    public static final rj1 g = new rj1(new ck1(5), false, -614669105);
    public static final rj1 h = new rj1(new ck1(6), false, -2064167214);
    public static final rj1 i = new rj1(new dk1(4), false, 297857878);
    public static final rj1 j = new rj1(new dk1(5), false, 382569386);
    public static final rj1 k = new rj1(new hk1(10), false, -1708210559);
    public static final rj1 l = new rj1(new hk1(11), false, -999701090);
    public static final rj1 m = new rj1(new ik1(5), false, 1807135386);
    public static final rj1 n = new rj1(new jk1(15), false, -728700413);
    public static final rj1 o = new rj1(new bk1(16), false, -1529568772);
    public static final rj1 p = new rj1(new kk1(12), false, -97910661);
    public static final rj1 q = new rj1(new kk1(13), false, -1389980070);
    public static final rj1 r = new rj1(new kk1(14), false, 1847477820);
    public static final rj1 s = new rj1(new jk1(16), false, 1352052534);
    public static final rj1 t = new rj1(new jk1(17), false, 719654614);
    public static final rj1 u = new rj1(new lk1(19), false, -724336464);
    public static final rj1 v = new rj1(new qk1(4), false, -1110684003);
    public static final rj1 w = new rj1(new qk1(5), false, -1547859470);
    public static final rj1 x = new rj1(new qk1(6), false, -810783255);
    public static final rj1 y = new rj1(new qk1(7), false, 352797930);
    public static final uha z = new uha(26);

    static {
        cu3 cu3Var = new cu3("app_set_id", 1L);
        A = cu3Var;
        B = new cu3[]{cu3Var};
    }

    public static final void A(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var) {
        ou6 ou6Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1388806659);
        int i3 = (dd4Var.f(ou6Var) ? 4 : 2) | i2 | (dd4Var2.h(ib4Var) ? 32 : 16);
        if (dd4Var2.V(i3 & 1, (i3 & 19) != 18)) {
            ou6 ou6VarL0 = gjb.l0(ou6Var, 24.0f);
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarL0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL02);
            nha.c(wn9.K((pv9) mu9.c.getValue(), dd4Var2), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.f, dd4Var2, 0, 0, 130046);
            dd4Var2 = dd4Var2;
            un9.a(dd4Var2, tg9.h(lu6.a, 24.0f));
            ou6Var2 = ou6Var;
            kc5.n(i25.c((m53) a53.a.getValue(), dd4Var2, 0), wn9.K((pv9) vt9.f.getValue(), dd4Var2), false, null, null, null, null, null, ib4Var, dd4Var2, (i3 << 21) & 234881024, 252);
            dd4Var2.q(true);
        } else {
            ou6Var2 = ou6Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new rz0(ou6Var2, ib4Var, i2, 5);
        }
    }

    public static final void B(t27 t27Var, dd4 dd4Var, int i2) {
        t27Var.getClass();
        dd4Var.h0(-738837923);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            t78 t78Var = (t78) ((qtb) qx1.N(ug8.a(t78.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(t78Var.d, dd4Var);
            p83 p83VarA0 = i12.a0(dd4Var);
            gx1.p(wn9.K((pv9) zu9.A0.getValue(), dd4Var), tg9.c, false, jf0.G(1314498913, new n74(t27Var, 22), dd4Var), null, jf0.G(729801299, new ak0(10, p83VarA0, t78Var, a07VarB), dd4Var), dd4Var, 199728, 20);
            boolean zF = dd4Var.f(t78Var);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                objQ = new rt6(t78Var, 3);
                dd4Var.p0(objQ);
            }
            i12.k(p83VarA0, (zb4) objQ, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new n74(i2, 21, t27Var);
        }
    }

    public static final void C(co0 co0Var, mb9 mb9Var, pj7 pj7Var, szb szbVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        int i3;
        pj7 pj7Var2;
        szb szbVar2;
        ou6 ou6Var2;
        kb4 kb4Var3;
        kb4 kb4Var4;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1603587550);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.f(co0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.h(mb9Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            pj7Var2 = pj7Var;
            i3 |= dd4Var2.f(pj7Var2) ? 256 : Token.CASE;
        } else {
            pj7Var2 = pj7Var;
        }
        if ((i2 & 3072) == 0) {
            szbVar2 = szbVar;
            i3 |= dd4Var2.f(szbVar2) ? 2048 : 1024;
        } else {
            szbVar2 = szbVar;
        }
        if ((i2 & 24576) == 0) {
            ou6Var2 = ou6Var;
            i3 |= dd4Var2.f(ou6Var2) ? 16384 : 8192;
        } else {
            ou6Var2 = ou6Var;
        }
        if ((196608 & i2) == 0) {
            kb4Var3 = kb4Var;
            i3 |= dd4Var2.h(kb4Var3) ? 131072 : Parser.ARGC_LIMIT;
        } else {
            kb4Var3 = kb4Var;
        }
        if ((1572864 & i2) == 0) {
            kb4Var4 = kb4Var2;
            i3 |= dd4Var2.h(kb4Var4) ? 1048576 : 524288;
        } else {
            kb4Var4 = kb4Var2;
        }
        if (dd4Var2.V(i3 & 1, (599187 & i3) != 599186)) {
            int i4 = mb9Var.b;
            if (i4 == 0) {
                dd4Var2.f0(-444202756);
                wq5 wq5VarA = yq5.a(dd4Var2);
                int i5 = i3 & Token.ELSE;
                int i6 = i3 << 3;
                D(co0Var, mb9Var, wq5VarA, pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, dd4Var2, i5 | (i6 & 7168) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128));
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
            } else if (i4 == 1) {
                dd4Var2.f0(-443801988);
                wq5 wq5VarA2 = yq5.a(dd4Var2);
                int i7 = i3 & Token.ELSE;
                int i8 = i3 << 3;
                E(co0Var, mb9Var, wq5VarA2, pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, dd4Var2, i7 | (i8 & 7168) | (i8 & 57344) | (i8 & 458752) | (i8 & 3670016) | (i8 & 29360128));
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
            } else if (i4 == 2) {
                dd4Var2.f0(-443401220);
                H(mb9Var, yq5.a(dd4Var2), pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, dd4Var2, ((i3 >> 3) & 14) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016));
                dd4Var2.q(false);
            } else if (i4 != 3) {
                dd4Var2.f0(-442648540);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-443000452);
                pj7 pj7Var3 = pj7Var2;
                szb szbVar3 = szbVar2;
                ou6 ou6Var3 = ou6Var2;
                kb4 kb4Var5 = kb4Var3;
                I(mb9Var, yq5.a(dd4Var2), pj7Var3, szbVar3, ou6Var3, kb4Var5, kb4Var4, dd4Var2, (i3 & 3670016) | ((i3 >> 3) & 14) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                dd4Var2.q(false);
            }
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new pj1(co0Var, mb9Var, pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, i2, 7);
        }
    }

    public static final void D(co0 co0Var, mb9 mb9Var, wq5 wq5Var, pj7 pj7Var, szb szbVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        int i3;
        kb4 kb4Var3;
        kb4 kb4Var4;
        dd4Var.h0(-1004804133);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(co0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.h(mb9Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(wq5Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.f(szbVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            kb4Var3 = kb4Var;
            i3 |= dd4Var.h(kb4Var3) ? 1048576 : 524288;
        } else {
            kb4Var3 = kb4Var;
        }
        if ((12582912 & i2) == 0) {
            kb4Var4 = kb4Var2;
            i3 |= dd4Var.h(kb4Var4) ? 8388608 : 4194304;
        } else {
            kb4Var4 = kb4Var2;
        }
        int i4 = i3;
        if (dd4Var.V(i4 & 1, (4793491 & i4) != 4793490)) {
            float fQ = wx1.Q(mb9Var.c, 80, Context.VERSION_ES6);
            int iD = ((int) (co0Var.d() / fQ)) * 3;
            yh4 yh4Var = new yh4(fQ);
            boolean zH = dd4Var.h(mb9Var) | ((i4 & 3670016) == 1048576) | ((29360128 & i4) == 8388608) | dd4Var.d(iD);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                jc9 jc9Var = new jc9(mb9Var, iD, kb4Var3, kb4Var4, 1);
                dd4Var.p0(jc9Var);
                objQ = jc9Var;
            }
            gx1.i(yh4Var, ou6Var, wq5Var, pj7Var, null, null, null, false, 0L, 0L, szbVar, 0.0f, (kb4) objQ, dd4Var, ((i4 >> 12) & Token.ASSIGN_MOD) | (i4 & 896) | (i4 & 7168), (i4 >> 9) & Token.ASSIGN_MOD, 6128);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new kc9(co0Var, mb9Var, wq5Var, pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, i2, 1);
        }
    }

    public static final void E(co0 co0Var, mb9 mb9Var, wq5 wq5Var, pj7 pj7Var, szb szbVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        int i3;
        kb4 kb4Var3;
        kb4 kb4Var4;
        dd4Var.h0(-302869540);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(co0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.h(mb9Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(wq5Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.f(szbVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            kb4Var3 = kb4Var;
            i3 |= dd4Var.h(kb4Var3) ? 1048576 : 524288;
        } else {
            kb4Var3 = kb4Var;
        }
        if ((12582912 & i2) == 0) {
            kb4Var4 = kb4Var2;
            i3 |= dd4Var.h(kb4Var4) ? 8388608 : 4194304;
        } else {
            kb4Var4 = kb4Var2;
        }
        int i4 = i3;
        if (dd4Var.V(i4 & 1, (4793491 & i4) != 4793490)) {
            float fQ = wx1.Q(mb9Var.c, 80, Context.VERSION_ES6);
            int iD = ((int) (co0Var.d() / fQ)) * 3;
            yh4 yh4Var = new yh4(fQ);
            boolean zH = dd4Var.h(mb9Var) | ((i4 & 3670016) == 1048576) | ((29360128 & i4) == 8388608) | dd4Var.d(iD);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                jc9 jc9Var = new jc9(mb9Var, iD, kb4Var3, kb4Var4, 0);
                dd4Var.p0(jc9Var);
                objQ = jc9Var;
            }
            gx1.i(yh4Var, ou6Var, wq5Var, pj7Var, null, null, null, false, 0L, 0L, szbVar, 0.0f, (kb4) objQ, dd4Var, ((i4 >> 12) & Token.ASSIGN_MOD) | (i4 & 896) | (i4 & 7168), (i4 >> 9) & Token.ASSIGN_MOD, 6128);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new kc9(co0Var, mb9Var, wq5Var, pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F(int r22, defpackage.ib4 r23, dd4 r24, ou6 r25, defpackage.t27 r26, pj7 r27, szb r28) {
        /*
            Method dump skipped, instruction units count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p7c.F(int, ib4, dd4, ou6, t27, pj7, szb):void");
    }

    public static final void G(a07 a07Var, boolean z2) {
        a07Var.setValue(Boolean.valueOf(z2));
    }

    public static final void H(mb9 mb9Var, wq5 wq5Var, pj7 pj7Var, szb szbVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        int i3;
        szb szbVar2;
        dd4Var.h0(683620644);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.h(mb9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(wq5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            szbVar2 = szbVar;
            i3 |= dd4Var.f(szbVar2) ? 2048 : 1024;
        } else {
            szbVar2 = szbVar;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 1048576 : 524288;
        }
        if (dd4Var.V(i3 & 1, (599187 & i3) != 599186)) {
            yh4 yh4Var = new yh4(wx1.Q(mb9Var.c, 180, 400));
            boolean zH = ((458752 & i3) == 131072) | dd4Var.h(mb9Var) | ((3670016 & i3) == 1048576);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                objQ = new hc9(mb9Var, kb4Var, kb4Var2, 0);
                dd4Var.p0(objQ);
            }
            kb4 kb4Var3 = (kb4) objQ;
            int i4 = i3 << 3;
            gx1.i(yh4Var, ou6Var, wq5Var, pj7Var, null, null, null, false, 0L, 0L, szbVar2, 0.0f, kb4Var3, dd4Var, ((i3 >> 9) & Token.ASSIGN_MOD) | (i4 & 896) | (i4 & 7168), (i3 >> 6) & Token.ASSIGN_MOD, 6128);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ic9(mb9Var, wq5Var, pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, i2, 0);
        }
    }

    public static final void I(mb9 mb9Var, wq5 wq5Var, pj7 pj7Var, szb szbVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        int i3;
        szb szbVar2;
        dd4Var.h0(1385555237);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.h(mb9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(wq5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            szbVar2 = szbVar;
            i3 |= dd4Var.f(szbVar2) ? 2048 : 1024;
        } else {
            szbVar2 = szbVar;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 1048576 : 524288;
        }
        if (dd4Var.V(i3 & 1, (599187 & i3) != 599186)) {
            yh4 yh4Var = new yh4(wx1.Q(mb9Var.c, 150, 400));
            boolean zH = ((458752 & i3) == 131072) | dd4Var.h(mb9Var) | ((3670016 & i3) == 1048576);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                objQ = new hc9(mb9Var, kb4Var, kb4Var2, 1);
                dd4Var.p0(objQ);
            }
            kb4 kb4Var3 = (kb4) objQ;
            int i4 = i3 << 3;
            gx1.i(yh4Var, ou6Var, wq5Var, pj7Var, null, null, null, false, 0L, 0L, szbVar2, 0.0f, kb4Var3, dd4Var, ((i3 >> 9) & Token.ASSIGN_MOD) | (i4 & 896) | (i4 & 7168), (i3 >> 6) & Token.ASSIGN_MOD, 6128);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ic9(mb9Var, wq5Var, pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, i2, 1);
        }
    }

    public static final void J(e8a e8aVar, szb szbVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        dd4Var.h0(525448402);
        int i3 = i2 | (dd4Var.h(e8aVar) ? 4 : 2) | (dd4Var.f(szbVar) ? 32 : 16) | (dd4Var.h(kb4Var) ? 2048 : 1024) | (dd4Var.h(kb4Var2) ? 16384 : 8192);
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            boolean zF = dd4Var.f(e8aVar.g);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (zF || objQ == obj) {
                objQ = dk9.x(e8aVar.g);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            wq5 wq5VarA = yq5.a(dd4Var);
            boolean zF2 = dd4Var.f(a07Var);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == obj) {
                objQ2 = new sb3(a07Var, null, i4);
                dd4Var.p0(objQ2);
            }
            kj8 kj8VarU = gx1.U(wq5VarA, szbVar, (ac4) objQ2, dd4Var, i3 & Token.ASSIGN_MOD);
            yh4 yh4Var = new yh4(320.0f);
            mv mvVar = new mv(8.0f, true, new gp(5));
            mv mvVar2 = new mv(8.0f, true, new gp(5));
            boolean zF3 = dd4Var.f(a07Var) | dd4Var.f(kj8VarU) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384);
            Object objQ3 = dd4Var.Q();
            if (zF3 || objQ3 == obj) {
                pb3 pb3Var = new pb3(a07Var, kj8VarU, kb4Var, kb4Var2, 1);
                dd4Var.p0(pb3Var);
                objQ3 = pb3Var;
            }
            sw1.h(yh4Var, ou6Var, wq5VarA, szbVar, mvVar, mvVar2, (s04) null, false, (ag) null, (kb4) objQ3, dd4Var, ((i3 << 6) & 7168) | 1769520, 0, 912);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uj0(e8aVar, szbVar, ou6Var, kb4Var, kb4Var2, i2, 23);
        }
    }

    public static final void K(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var) {
        ou6 ou6Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1672050687);
        int i3 = (dd4Var.f(ou6Var) ? 4 : 2) | i2 | (dd4Var2.h(ib4Var) ? 32 : 16);
        if (dd4Var2.V(i3 & 1, (i3 & 19) != 18)) {
            ou6 ou6VarL0 = gjb.l0(ou6Var, 24.0f);
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarL0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL02);
            nha.c(wn9.K((pv9) ev9.q.getValue(), dd4Var2), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.f, dd4Var2, 0, 0, 130046);
            dd4Var2 = dd4Var2;
            un9.a(dd4Var2, tg9.h(lu6.a, 24.0f));
            ou6Var2 = ou6Var;
            kc5.n(i25.c((m53) a53.a.getValue(), dd4Var2, 0), wn9.K((pv9) vt9.f.getValue(), dd4Var2), false, null, null, null, null, null, ib4Var, dd4Var2, (i3 << 21) & 234881024, 252);
            dd4Var2.q(true);
        } else {
            ou6Var2 = ou6Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new rz0(ou6Var2, ib4Var, i2, 9);
        }
    }

    public static final void L(t27 t27Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        t27Var.getClass();
        dd4Var.h0(759178935);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        int i4 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            h8a h8aVar = (h8a) ((qtb) qx1.N(ug8.a(h8a.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(h8aVar.f, dd4Var);
            boolean zF = dd4Var.f(h8aVar);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (zF || objQ == obj) {
                objQ = new q7a(h8aVar, null, i4);
                dd4Var.p0(objQ);
            }
            lc5.u((yb4) objQ, dd4Var, heb.a);
            boolean zF2 = dd4Var.f(h8aVar);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == obj) {
                objQ2 = new p7a(h8aVar, i4);
                dd4Var.p0(objQ2);
            }
            dd4Var2 = dd4Var;
            gx1.p(wn9.K((pv9) ev9.o.getValue(), dd4Var), tg9.c, false, jf0.G(-1938297549, new oe9(t27Var, 6), dd4Var), jf0.G(-1832164516, new qz0(29, h8aVar, a07VarB), dd4Var), jf0.G(1034750209, new ak0(13, e11.a0(ls7.a, (kb4) objQ2, dd4Var, 0), h8aVar, a07VarB), dd4Var), dd4Var2, 224304, 4);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new oe9(i2, 7, t27Var);
        }
    }

    public static final void M(String str, List list, Set set, rj7 rj7Var, ou6 ou6Var, yb4 yb4Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        br9 br9Var;
        Object obj;
        boolean z2;
        boolean z3;
        char c2;
        List list2;
        br9 br9Var2;
        br9 br9Var3;
        int i3;
        boolean z4;
        Object obj2;
        int i4;
        st5 st5Var;
        br9 br9Var4;
        a07 a07Var;
        int i5;
        int i6;
        Object obj3;
        boolean z5;
        float f2;
        int i7;
        Object em6Var;
        br9 br9Var5;
        dd4 dd4Var3 = dd4Var;
        dd4Var3.h0(-1467825073);
        int i8 = i2 | (dd4Var3.f(str) ? 4 : 2) | (dd4Var3.h(list) ? 32 : 16) | (dd4Var3.h(set) ? 256 : Token.CASE) | (dd4Var3.f(rj7Var) ? 2048 : 1024) | (dd4Var3.h(yb4Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var3.h(kb4Var) ? 1048576 : 524288);
        int i9 = 1;
        if (dd4Var3.V(i8 & 1, (i8 & 599187) != 599186)) {
            Object objQ = dd4Var3.Q();
            Object obj4 = vl1.a;
            if (objQ == obj4) {
                objQ = lc5.Z(dd4Var3);
                dd4Var3.p0(objQ);
            }
            vx1 vx1Var = (vx1) objQ;
            st5 st5VarA = ut5.a(0, dd4Var3, 0, 3);
            Object objQ2 = dd4Var3.Q();
            if (objQ2 == obj4) {
                objQ2 = dk9.x(-1);
                dd4Var3.p0(objQ2);
            }
            a07 a07Var2 = (a07) objQ2;
            Object[] objArr = new Object[0];
            Object objQ3 = dd4Var3.Q();
            if (objQ3 == obj4) {
                objQ3 = new uj6(26);
                dd4Var3.p0(objQ3);
            }
            br9 br9VarA0 = ww1.a0(objArr, (ib4) objQ3, dd4Var3, 384);
            Object objQ4 = dd4Var3.Q();
            if (objQ4 == obj4) {
                objQ4 = dk9.x(Boolean.FALSE);
                dd4Var3.p0(objQ4);
            }
            br9 br9Var6 = (a07) objQ4;
            Object objQ5 = dd4Var3.Q();
            if (objQ5 == obj4) {
                objQ5 = dk9.x(list);
                dd4Var3.p0(objQ5);
            }
            br9 br9Var7 = (a07) objQ5;
            Object objQ6 = dd4Var3.Q();
            if (objQ6 == obj4) {
                objQ6 = dk9.n(new e51(st5VarA, 9));
                dd4Var3.p0(objQ6);
            }
            br9 br9Var8 = (br9) objQ6;
            Object objQ7 = dd4Var3.Q();
            if (objQ7 == obj4) {
                objQ7 = dk9.n(new e51(st5VarA, 10));
                dd4Var3.p0(objQ7);
            }
            br9 br9Var9 = (br9) objQ7;
            Object objQ8 = dd4Var3.Q();
            if (objQ8 == obj4) {
                objQ8 = dk9.n(new am6(br9VarA0, a07Var2, br9Var9, br9Var8, 1));
                dd4Var3.p0(objQ8);
            }
            br9 br9Var10 = (br9) objQ8;
            Object objQ9 = dd4Var3.Q();
            if (objQ9 == obj4) {
                objQ9 = dk9.n(new bm6(1, br9VarA0, br9Var8));
                dd4Var3.p0(objQ9);
            }
            br9 br9Var11 = (br9) objQ9;
            Object objQ10 = dd4Var3.Q();
            if (objQ10 == obj4) {
                objQ10 = dk9.n(new cm6(br9VarA0, br9Var7, br9Var9, i9));
                dd4Var3.p0(objQ10);
            }
            br9 br9Var12 = (br9) objQ10;
            Object objQ11 = dd4Var3.Q();
            if (objQ11 == obj4) {
                objQ11 = dk9.n(new x41(br9Var7, a07Var2, 15));
                dd4Var3.p0(objQ11);
            }
            br9 br9Var13 = (br9) objQ11;
            Boolean bool = (Boolean) br9Var6.getValue();
            bool.booleanValue();
            boolean zF = dd4Var3.f(br9VarA0) | dd4Var3.h(list);
            Object objQ12 = dd4Var3.Q();
            if (zF || objQ12 == obj4) {
                br9Var = br9Var7;
                obj = obj4;
                z2 = true;
                z3 = false;
                c2 = '\n';
                rm6 rm6Var = new rm6(br9VarA0, list, br9Var6, br9Var, null, 2);
                list2 = list;
                br9Var2 = br9Var6;
                br9Var3 = br9VarA0;
                dd4Var3.p0(rm6Var);
                objQ12 = rm6Var;
            } else {
                br9Var2 = br9Var6;
                z2 = true;
                br9Var = br9Var7;
                br9Var3 = br9VarA0;
                z3 = false;
                c2 = '\n';
                list2 = list;
                obj = obj4;
            }
            lc5.v(bool, list2, (yb4) objQ12, dd4Var3);
            Integer numValueOf = Integer.valueOf(((List) br9Var.getValue()).size());
            koa koaVar = (koa) fc1.z0((List) br9Var.getValue());
            String str2 = koaVar != null ? koaVar.a : null;
            Boolean bool2 = (Boolean) br9Var2.getValue();
            bool2.getClass();
            Object[] objArr2 = {str, numValueOf, str2, bool2};
            int i10 = i8 & 14;
            boolean zF2 = (i10 == 4 ? z2 : z3) | dd4Var3.f(st5VarA);
            Object objQ13 = dd4Var3.Q();
            if (zF2 || objQ13 == obj) {
                boolean z6 = z3;
                i3 = i10;
                z4 = z6;
                obj2 = obj;
                br9 br9Var14 = br9Var;
                i4 = 4;
                objQ13 = new xm6(st5VarA, br9Var14, str, a07Var2, null, 1);
                st5Var = st5VarA;
                br9Var4 = br9Var14;
                a07Var = a07Var2;
                dd4Var3.p0(objQ13);
            } else {
                st5Var = st5VarA;
                obj2 = obj;
                i4 = 4;
                a07Var = a07Var2;
                z4 = z3;
                br9Var4 = br9Var;
                i3 = i10;
            }
            lc5.x(objArr2, (yb4) objQ13, dd4Var3);
            ha6 ha6VarD = pn0.d(bv4.b, z4);
            int iHashCode = Long.hashCode(dd4Var3.T);
            lr7 lr7VarL = dd4Var3.l();
            ou6 ou6VarL0 = s32.L0(dd4Var3, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var3.j0();
            if (dd4Var3.S) {
                dd4Var3.k(um1Var);
            } else {
                dd4Var3.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var3, ha6VarD);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var3, lr7VarL);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var3, numValueOf2);
            kd kdVar = ll1.h;
            un9.r(dd4Var3, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var3, ou6VarL0);
            lu6 lu6Var = lu6.a;
            br9 br9Var15 = br9Var4;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var3, 0);
            int iHashCode2 = Long.hashCode(dd4Var3.T);
            lr7 lr7VarL2 = dd4Var3.l();
            ou6 ou6VarL02 = s32.L0(dd4Var3, ou6VarF);
            dd4Var3.j0();
            if (dd4Var3.S) {
                dd4Var3.k(um1Var);
            } else {
                dd4Var3.s0();
            }
            un9.s(jmVar, dd4Var3, ie1VarA);
            un9.s(jmVar2, dd4Var3, lr7VarL2);
            ky0.v(iHashCode2, dd4Var3, jmVar3, dd4Var3, kdVar);
            un9.s(jmVar4, dd4Var3, ou6VarL02);
            br9 br9VarB = an.b(((Boolean) br9Var2.getValue()).booleanValue() ? 180.0f : 0.0f, (ko) null, (String) null, dd4Var3, 0, 30);
            if (list.size() > 10) {
                dd4Var3.f0(204978398);
                wga wgaVar = (wga) br9Var3.getValue();
                String strL = wn9.L((pv9) mu9.Y.getValue(), new Object[]{Integer.valueOf(list.size())}, dd4Var3);
                long jG = dd1.g(((q96) dd4Var3.j(s96.a)).a, 6.0f);
                rj1 rj1VarG = jf0.G(-1139411332, new lt(3, br9Var2, br9VarB), dd4Var3);
                f2 = 1.0f;
                ou6 ou6VarP0 = gjb.p0(gjb.n0(tg9.f(lu6Var, 1.0f), 24.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                boolean zF3 = dd4Var3.f(br9Var3);
                Object objQ14 = dd4Var3.Q();
                if (zF3) {
                    obj3 = obj2;
                } else {
                    obj3 = obj2;
                    if (objQ14 == obj3) {
                    }
                    kb4 kb4Var2 = (kb4) objQ14;
                    z5 = false;
                    i7 = 3;
                    i6 = i4;
                    i5 = i3;
                    e11.A(wgaVar, strL, 0L, jG, rj1VarG, null, ou6VarP0, kb4Var2, null, dd4Var3, 1597440, 292);
                    dd4Var3 = dd4Var3;
                    dd4Var3.q(false);
                }
                objQ14 = new wo6(br9Var3, 13);
                dd4Var3.p0(objQ14);
                kb4 kb4Var22 = (kb4) objQ14;
                z5 = false;
                i7 = 3;
                i6 = i4;
                i5 = i3;
                e11.A(wgaVar, strL, 0L, jG, rj1VarG, null, ou6VarP0, kb4Var22, null, dd4Var3, 1597440, 292);
                dd4Var3 = dd4Var3;
                dd4Var3.q(false);
            } else {
                i5 = i3;
                i6 = i4;
                obj3 = obj2;
                z5 = false;
                f2 = 1.0f;
                i7 = 3;
                dd4Var3.f0(206009551);
                dd4Var3.q(false);
            }
            ou6 ou6VarF2 = xv5.f(f2, tg9.f(lu6Var, f2), true);
            szb szbVarW = yib.w(rj7Var, gjb.q(0.0f, 0.0f, 10.0f, 96.0f, i7));
            szb szbVarW2 = yib.w(rj7Var, gjb.q(0.0f, 0.0f, 0.0f, 96.0f, 7));
            boolean zF4 = (i5 == i6 ? true : z5) | dd4Var3.f(br9Var3) | dd4Var3.h(set) | ((i8 & 458752) == 131072 ? true : z5) | ((i8 & 3670016) == 1048576 ? true : z5);
            Object objQ15 = dd4Var3.Q();
            if (zF4 || objQ15 == obj3) {
                br9Var5 = br9Var15;
                em6Var = new em6(br9Var3, br9Var5, str, set, yb4Var, kb4Var, 1);
                dd4Var3.p0(em6Var);
            } else {
                em6Var = objQ15;
                br9Var5 = br9Var15;
            }
            st5 st5Var2 = st5Var;
            gx1.h(ou6VarF2, st5Var2, szbVarW2, null, null, null, false, szbVarW, 0L, 0L, 6.0f, (kb4) em6Var, dd4Var, 0, 48, 1784);
            dd4Var.q(true);
            boolean zBooleanValue = ((Boolean) br9Var10.getValue()).booleanValue();
            xf0 xf0Var = bv4.t;
            zn0 zn0Var = zn0.a;
            br9 br9Var16 = br9Var5;
            dd4Var2 = dd4Var;
            kf0.d(zBooleanValue, gjb.p0(gjb.k0(zn0Var.a(lu6Var, xf0Var), rj7Var), 16.0f, 0.0f, 72.0f, 8.0f, 2), wd3.c((by3) null, i7).a(wd3.f((p9b) null, 0.96f, 0L, 5)), wd3.d((by3) null, i7).a(wd3.h(0.96f, 0L, 5)), (String) null, jf0.G(1447643953, new yl6(vx1Var, st5Var2, a07Var, br9Var16, br9Var13, 1), dd4Var), dd4Var2, 200064, 16);
            kf0.d(((Boolean) br9Var11.getValue()).booleanValue() || ((Boolean) br9Var12.getValue()).booleanValue(), gjb.p0(gjb.k0(zn0Var.a(lu6Var, bv4.v), rj7Var), 0.0f, 0.0f, 16.0f, 8.0f, 3), wd3.c((by3) null, i7).a(wd3.f((p9b) null, 0.96f, 0L, 5)), wd3.d((by3) null, i7).a(wd3.h(0.96f, 0L, 5)), (String) null, jf0.G(1868689690, new zl6(vx1Var, st5Var2, br9Var11, br9Var16, br9Var12, 1), dd4Var2), dd4Var2, 200064, 16);
            dd4Var2.q(true);
        } else {
            dd4Var2 = dd4Var3;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new nt(str, list, set, rj7Var, ou6Var, yb4Var, kb4Var, i2, 8);
        }
    }

    public static final void N(vx1 vx1Var, a07 a07Var, st5 st5Var, int i2) {
        if (i2 < 0 || i2 >= ((List) a07Var.getValue()).size()) {
            return;
        }
        ah1.J(vx1Var, null, null, new qz4(st5Var, i2, (jt1) null, 3), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v54 */
    /* JADX WARN: Type inference failed for: r10v55 */
    /* JADX WARN: Type inference failed for: r10v62 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    public static final void O(fba fbaVar, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, kb4 kb4Var, dd4 dd4Var, int i2) {
        fba fbaVar2;
        ib4 ib4Var5;
        kd kdVar;
        jm jmVar;
        float f2;
        lp4 lp4Var;
        Object obj;
        ?? r2;
        Object obj2;
        Object obj3;
        boolean z2;
        Object obj4;
        Object obj5;
        dd4 dd4Var2 = dd4Var;
        lp4 lp4Var2 = jf0.G;
        dd4Var2.h0(-126655026);
        int i3 = i2 | (dd4Var2.f(fbaVar) ? 4 : 2) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE) | (dd4Var2.h(ib4Var2) ? 2048 : 1024) | (dd4Var2.h(ib4Var3) ? 16384 : 8192) | (dd4Var2.h(ib4Var4) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.h(kb4Var) ? 1048576 : 524288);
        if (dd4Var2.V(i3 & 1, (599187 & i3) != 599186)) {
            ou6 ou6VarP0 = gjb.p0(ou6Var, 24.0f, 0.0f, 24.0f, 0.0f, 10);
            wf0 wf0Var = bv4.w;
            iv ivVar = pv.a;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarP0);
            ml1.k.getClass();
            ib4 ib4Var6 = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var6);
            } else {
                dd4Var2.s0();
            }
            jm jmVar2 = ll1.f;
            un9.s(jmVar2, dd4Var2, eq8VarA);
            jm jmVar3 = ll1.e;
            un9.s(jmVar3, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar4 = ll1.g;
            un9.s(jmVar4, dd4Var2, numValueOf);
            kd kdVar2 = ll1.h;
            un9.r(dd4Var2, kdVar2);
            jm jmVar5 = ll1.d;
            un9.s(jmVar5, dd4Var2, ou6VarL0);
            String str = fbaVar.a;
            String str2 = fbaVar.b;
            boolean z3 = fbaVar.q;
            String str3 = fbaVar.d;
            String str4 = fbaVar.e;
            qr1 qr1Var = ra1.d;
            lu6 lu6Var = lu6.a;
            ou6 ou6VarH = tg9.h(tg9.r(lu6Var, 50.0f), 75.0f);
            boolean z4 = !fbaVar.o;
            boolean z5 = (i3 & 896) == 256;
            Object objQ = dd4Var2.Q();
            Object obj6 = vl1.a;
            if (z5 || objQ == obj6) {
                objQ = new or6(3, ib4Var);
                dd4Var2.p0(objQ);
            }
            w05.c(str, str2, str3, str4, qr1Var, t96.w(yn2.s(ou6VarH, z4, 0.0f, (ib4) objQ, 2), s00.p(dd4Var2).a), dd4Var2, 24576);
            un9.a(dd4Var2, tg9.r(lu6Var, 12.0f));
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            bp5 bp5Var = new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            ie1 ie1VarA = ge1.a(pv.e, bv4.z, dd4Var2, 6);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, bp5Var);
            dd4Var2.j0();
            if (dd4Var2.S) {
                ib4Var5 = ib4Var6;
                dd4Var2.k(ib4Var5);
            } else {
                ib4Var5 = ib4Var6;
                dd4Var2.s0();
            }
            ib4 ib4Var7 = ib4Var5;
            un9.s(jmVar2, dd4Var2, ie1VarA);
            un9.s(jmVar3, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar4, dd4Var2, kdVar2);
            un9.s(jmVar5, dd4Var2, ou6VarL02);
            float f3 = 1.0f;
            int i4 = i3;
            nha.c(str2, tg9.f(lu6Var, 1.0f), s00.o(dd4Var2).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 2, 0, (kb4) null, s00.q(dd4Var2).j, dd4Var, 48, 24960, 109560);
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            eq8 eq8VarA2 = dq8.a(ivVar, bv4.x, dd4Var, 48);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarF);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var7);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar2, dd4Var, eq8VarA2);
            un9.s(jmVar3, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar4, dd4Var, kdVar2);
            un9.s(jmVar5, dd4Var, ou6VarL03);
            String str5 = fbaVar.c;
            long j2 = s00.o(dd4Var).q;
            uka ukaVar = s00.q(dd4Var).l;
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            }
            fbaVar2 = fbaVar;
            nha.c(str5, yb0.I(new bp5(f3, true), 0.8f), j2, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 1, 0, (kb4) null, ukaVar, dd4Var, 0, 24960, 109560);
            dd4Var2 = dd4Var;
            if (fbaVar2.s) {
                dd4Var2.f0(-901289855);
                p35 p35VarC = i25.c((m53) f53.a0.getValue(), dd4Var2, 0);
                ou6 ou6VarW = t96.w(gjb.l0(tg9.n(lu6Var, 36.0f), 4.0f), tp8.a);
                boolean z6 = (i4 & 7168) == 2048;
                Object objQ2 = dd4Var2.Q();
                if (z6) {
                    obj5 = obj6;
                } else {
                    obj5 = obj6;
                    if (objQ2 != obj5) {
                        i4 = i4;
                    }
                    Object obj7 = obj5;
                    ou6 ou6VarL04 = gjb.l0(fe.L(fw.J(null, (ib4) objQ2, ou6VarW, false, 15), lc1.c(0.1f, s00.o(dd4Var2).q), lp4Var2), 4.0f);
                    kdVar = kdVar2;
                    jmVar = jmVar4;
                    lp4Var = lp4Var2;
                    obj = obj7;
                    r2 = 0;
                    f2 = 36.0f;
                    mx4.a(p35VarC, "", ou6VarL04, 0L, dd4Var2, 48, 8);
                    dd4Var2.q(false);
                }
                i4 = i4;
                objQ2 = new or6(4, ib4Var2);
                dd4Var2.p0(objQ2);
                Object obj72 = obj5;
                ou6 ou6VarL042 = gjb.l0(fe.L(fw.J(null, (ib4) objQ2, ou6VarW, false, 15), lc1.c(0.1f, s00.o(dd4Var2).q), lp4Var2), 4.0f);
                kdVar = kdVar2;
                jmVar = jmVar4;
                lp4Var = lp4Var2;
                obj = obj72;
                r2 = 0;
                f2 = 36.0f;
                mx4.a(p35VarC, "", ou6VarL042, 0L, dd4Var2, 48, 8);
                dd4Var2.q(false);
            } else {
                kdVar = kdVar2;
                jmVar = jmVar4;
                f2 = 36.0f;
                lp4Var = lp4Var2;
                obj = obj6;
                r2 = 0;
                dd4Var2.f0(-900794382);
                dd4Var2.q(false);
            }
            if (fbaVar2.n) {
                obj2 = obj;
                dd4Var2.f0(-900176366);
                dd4Var2.q((boolean) r2);
            } else {
                dd4Var2.f0(-900707396);
                p35 p35VarC2 = i25.c((m53) f53.Z.getValue(), dd4Var2, r2);
                ou6 ou6VarW2 = t96.w(gjb.l0(tg9.n(lu6Var, f2), 4.0f), tp8.a);
                ?? r15 = (i4 & 458752) == 131072 ? 1 : r2;
                Object objQ3 = dd4Var2.Q();
                Object obj8 = obj;
                if (r15 != 0 || objQ3 == obj8) {
                    objQ3 = new or6(5, ib4Var4);
                    dd4Var2.p0(objQ3);
                }
                obj2 = obj8;
                mx4.a(p35VarC2, wn9.K((pv9) vt9.u.getValue(), dd4Var2), gjb.l0(fe.L(fw.J(null, (ib4) objQ3, ou6VarW2, r2, 15), lc1.c(0.1f, s00.o(dd4Var2).q), lp4Var), 4.0f), 0L, dd4Var2, 0, 8);
                dd4Var2.q((boolean) r2);
            }
            if (fbaVar2.m) {
                dd4Var2.f0(-900093658);
                p35 p35VarC3 = i25.c(fbaVar2.p ? (m53) f53.P.getValue() : (m53) f53.Q.getValue(), dd4Var2, r2);
                ou6 ou6VarW3 = t96.w(gjb.l0(tg9.n(lu6Var, f2), 4.0f), tp8.a);
                int i5 = ((i4 & 14) == 4 ? 1 : r2) | ((i4 & 3670016) == 1048576 ? 1 : r2);
                Object objQ4 = dd4Var2.Q();
                if (i5 == 0) {
                    obj4 = obj2;
                    if (objQ4 == obj4) {
                    }
                    obj3 = obj4;
                    mx4.a(p35VarC3, wn9.K((pv9) eu9.I0.getValue(), dd4Var2), gjb.l0(fe.L(fw.J(null, (ib4) objQ4, ou6VarW3, r2, 15), lc1.c(0.1f, s00.o(dd4Var2).q), lp4Var), 4.0f), 0L, dd4Var2, 0, 8);
                    dd4Var2.q((boolean) r2);
                } else {
                    obj4 = obj2;
                }
                objQ4 = new vf6(23, kb4Var, fbaVar2);
                dd4Var2.p0(objQ4);
                obj3 = obj4;
                mx4.a(p35VarC3, wn9.K((pv9) eu9.I0.getValue(), dd4Var2), gjb.l0(fe.L(fw.J(null, (ib4) objQ4, ou6VarW3, r2, 15), lc1.c(0.1f, s00.o(dd4Var2).q), lp4Var), 4.0f), 0L, dd4Var2, 0, 8);
                dd4Var2.q((boolean) r2);
            } else {
                obj3 = obj2;
                dd4Var2.f0(-899479982);
                dd4Var2.q((boolean) r2);
            }
            if (fbaVar2.r) {
                dd4Var2.f0(-899397894);
                ha6 ha6VarD = pn0.d(bv4.b, (boolean) r2);
                int iHashCode4 = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL4 = dd4Var2.l();
                ou6 ou6VarL05 = s32.L0(dd4Var2, lu6Var);
                dd4Var2.j0();
                if (dd4Var2.S) {
                    dd4Var2.k(ib4Var7);
                } else {
                    dd4Var2.s0();
                }
                un9.s(jmVar2, dd4Var2, ha6VarD);
                un9.s(jmVar3, dd4Var2, lr7VarL4);
                ky0.v(iHashCode4, dd4Var2, jmVar, dd4Var2, kdVar);
                un9.s(jmVar5, dd4Var2, ou6VarL05);
                p35 p35VarC4 = i25.c((m53) a53.x.getValue(), dd4Var2, r2);
                ou6 ou6VarW4 = t96.w(gjb.l0(tg9.n(lu6Var, f2), 4.0f), tp8.a);
                boolean z7 = !z3;
                ?? r152 = (i4 & 57344) == 16384 ? 1 : r2;
                Object objQ5 = dd4Var2.Q();
                if (r152 != 0 || objQ5 == obj3) {
                    objQ5 = new or6(1, ib4Var3);
                    dd4Var2.p0(objQ5);
                }
                mx4.a(p35VarC4, wn9.K((pv9) zt9.x0.getValue(), dd4Var2), gjb.l0(fe.L(fw.J(null, (ib4) objQ5, ou6VarW4, z7, 14), lc1.c(0.1f, s00.o(dd4Var2).q), lp4Var), 4.0f), 0L, dd4Var2, 0, 8);
                if (z3) {
                    dd4Var2.f0(-1514119140);
                    l16.a(0.0f, 384, 2, s00.o(dd4Var2).q, dd4Var2, gjb.l0(tg9.n(lu6Var, f2), 4.0f));
                    dd4Var2.q((boolean) r2);
                } else {
                    dd4Var2.f0(-1513862708);
                    dd4Var2.q((boolean) r2);
                }
                z2 = true;
                dd4Var2.q(true);
                dd4Var2.q((boolean) r2);
            } else {
                z2 = true;
                dd4Var2.f0(-898390766);
                dd4Var2.q((boolean) r2);
            }
            tw2.x(dd4Var2, z2, z2, z2);
        } else {
            fbaVar2 = fbaVar;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new nt(fbaVar2, ou6Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, kb4Var, i2, 7);
        }
    }

    public static final void P(koa koaVar, boolean z2, boolean z3, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        yb4 yb4Var;
        long jC;
        yb4 yb4Var2;
        yb4 yb4Var3;
        kd kdVar;
        jm jmVar;
        long j2;
        fu6 fu6Var;
        yb4 yb4Var4;
        boolean z4;
        boolean z5;
        boolean z6;
        Object obj;
        boolean z7;
        fu6 fu6Var2;
        Object obj2;
        koa koaVar2 = koaVar;
        dd4 dd4Var2 = dd4Var;
        long j3 = koaVar2.j;
        dd4Var2.h0(-1027884260);
        int i3 = i2 | (dd4Var2.f(koaVar2) ? 4 : 2) | (dd4Var2.g(z2) ? 32 : 16) | (dd4Var2.g(z3) ? 256 : Token.CASE) | (dd4Var2.f(ou6Var) ? 2048 : 1024) | (dd4Var2.h(ib4Var) ? 16384 : 8192);
        if (dd4Var2.V(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = koaVar2.e;
            int i5 = koaVar2.i;
            ou6 ou6VarP0 = gjb.p0(ou6Var, 12.0f * i4, 0.0f, 0.0f, 0.0f, 14);
            wf0 wf0Var = bv4.x;
            iv ivVar = pv.a;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarP0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            yb4 yb4Var5 = ll1.f;
            un9.s(yb4Var5, dd4Var2, eq8VarA);
            yb4 yb4Var6 = ll1.e;
            un9.s(yb4Var6, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar2 = ll1.g;
            un9.s(jmVar2, dd4Var2, numValueOf);
            kd kdVar2 = ll1.h;
            un9.r(dd4Var2, kdVar2);
            yb4 yb4Var7 = ll1.d;
            un9.s(yb4Var7, dd4Var2, ou6VarL0);
            if (z2) {
                dd4Var2.f0(1745119209);
                yb4Var = yb4Var7;
                jC = ((q96) dd4Var2.j(s96.a)).a.a;
                dd4Var2.q(false);
            } else {
                yb4Var = yb4Var7;
                dd4Var2.f0(1745183162);
                jC = lc1.c(j3 > 0 ? 0.7f : 1.0f, ((q96) dd4Var2.j(s96.a)).a.q);
                dd4Var2.q(false);
            }
            p35 p35VarC = i25.c((m53) f53.K.getValue(), dd4Var2, 0);
            long j4 = jC;
            lu6 lu6Var = lu6.a;
            yb4 yb4Var8 = yb4Var;
            mx4.a(p35VarC, (String) null, tg9.n(lu6Var, 14.0f), j4, dd4Var2, 432, 0);
            ou6 ou6VarN0 = gjb.n0(j39.f(lu6Var, 8.0f, dd4Var2, 1.0f, true), 0.0f, 6.0f, 1);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarN0);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(yb4Var5, dd4Var2, ie1VarA);
            un9.s(yb4Var6, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar2, dd4Var2, kdVar2);
            un9.s(yb4Var8, dd4Var2, ou6VarL02);
            String str = koaVar2.b;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            ur9 ur9Var = s96.a;
            nha.c(str, ou6VarF, j4, (g60) null, 0L, new t74(z2 ? 1 : 0), z2 ? a84.w : a84.t, (c64) null, 0L, (jda) null, new vaa(5), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, 48, 0, 129944);
            dd4Var2 = dd4Var;
            fu6 fu6Var3 = vl1.a;
            if (i5 > 0) {
                dd4Var2.f0(2056730393);
                ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                eq8 eq8VarA2 = dq8.a(ivVar, wf0Var, dd4Var2, 48);
                int iHashCode3 = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL3 = dd4Var2.l();
                ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarF2);
                dd4Var2.j0();
                if (dd4Var2.S) {
                    dd4Var2.k(um1Var);
                } else {
                    dd4Var2.s0();
                }
                un9.s(yb4Var5, dd4Var2, eq8VarA2);
                un9.s(yb4Var6, dd4Var2, lr7VarL3);
                ky0.v(iHashCode3, dd4Var2, jmVar2, dd4Var2, kdVar2);
                un9.s(yb4Var8, dd4Var2, ou6VarL03);
                yb4Var2 = yb4Var5;
                yb4Var4 = yb4Var8;
                kdVar = kdVar2;
                jmVar = jmVar2;
                j2 = j4;
                yb4Var3 = yb4Var6;
                nha.c(wn9.L((pv9) fv9.b.getValue(), new Object[]{Integer.valueOf(i5)}, dd4Var2), (ou6) null, lc1.c(0.5f, j4), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.l, dd4Var, 0, 0, 130042);
                dd4Var2 = dd4Var;
                if (j3 > 0) {
                    xv5.y(dd4Var2, -1081646809, lu6Var, 8.0f, dd4Var2);
                    mx4.a(i25.c((m53) f53.i.getValue(), dd4Var2, 0), (String) null, tg9.n(lu6Var, 14.0f), lc1.c(0.5f, j2), dd4Var2, 432, 0);
                    un9.a(dd4Var2, tg9.r(lu6Var, 2.0f));
                    boolean zE = dd4Var2.e(j3);
                    Object objQ = dd4Var2.Q();
                    if (zE) {
                        fu6Var2 = fu6Var3;
                    } else {
                        fu6Var2 = fu6Var3;
                        obj2 = objQ;
                        if (objQ == fu6Var2) {
                        }
                        fu6Var = fu6Var2;
                        nha.c((String) obj2, (ou6) null, lc1.c(0.5f, j2), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 0, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.l, dd4Var, 0, 24576, 113658);
                        dd4Var2 = dd4Var;
                        z5 = false;
                        dd4Var2.q(false);
                    }
                    String strI = zk4.i(j3, "HH:mm dd/MM/yyyy");
                    dd4Var2.p0(strI);
                    obj2 = strI;
                    fu6Var = fu6Var2;
                    nha.c((String) obj2, (ou6) null, lc1.c(0.5f, j2), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 0, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.l, dd4Var, 0, 24576, 113658);
                    dd4Var2 = dd4Var;
                    z5 = false;
                    dd4Var2.q(false);
                } else {
                    fu6Var = fu6Var3;
                    z5 = false;
                    dd4Var2.f0(-1080718483);
                    dd4Var2.q(false);
                }
                z4 = true;
                dd4Var2.q(true);
                dd4Var2.q(z5);
            } else {
                yb4Var2 = yb4Var5;
                yb4Var3 = yb4Var6;
                kdVar = kdVar2;
                jmVar = jmVar2;
                j2 = j4;
                fu6Var = fu6Var3;
                yb4Var4 = yb4Var8;
                z4 = true;
                z5 = false;
                dd4Var2.f0(2058193996);
                dd4Var2.q(false);
            }
            dd4Var2.q(z4);
            koaVar2 = koaVar;
            if (koaVar2.f) {
                z6 = true;
                dd4Var2.f0(1748564642);
                dd4Var2.q(z5);
            } else {
                xv5.y(dd4Var2, 1747690132, lu6Var, 6.0f, dd4Var2);
                ha6 ha6VarD = pn0.d(bv4.b, z5);
                int iHashCode4 = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL4 = dd4Var2.l();
                ou6 ou6VarL04 = s32.L0(dd4Var2, lu6Var);
                dd4Var2.j0();
                if (dd4Var2.S) {
                    dd4Var2.k(um1Var);
                } else {
                    dd4Var2.s0();
                }
                un9.s(yb4Var2, dd4Var2, ha6VarD);
                un9.s(yb4Var3, dd4Var2, lr7VarL4);
                ky0.v(iHashCode4, dd4Var2, jmVar, dd4Var2, kdVar);
                un9.s(yb4Var4, dd4Var2, ou6VarL04);
                p35 p35VarC2 = i25.c((m53) a53.x.getValue(), dd4Var2, 0);
                ou6 ou6VarW = t96.w(gjb.l0(tg9.n(lu6Var, 36.0f), 4.0f), tp8.a);
                boolean z8 = (i3 & 57344) == 16384;
                Object objQ2 = dd4Var2.Q();
                if (z8 || objQ2 == fu6Var) {
                    or6 or6Var = new or6(2, ib4Var);
                    dd4Var2.p0(or6Var);
                    obj = or6Var;
                } else {
                    obj = objQ2;
                }
                long j5 = j2;
                mx4.a(p35VarC2, wn9.K((pv9) zt9.x0.getValue(), dd4Var2), gjb.l0(fe.L(fw.J(null, (ib4) obj, ou6VarW, false, 15), lc1.c(0.1f, j2), jf0.G), 4.0f), j5, dd4Var2, 0, 0);
                if (z3) {
                    dd4Var2.f0(1773378147);
                    l16.a(2.0f, 432, 0, j5, dd4Var2, gjb.l0(tg9.n(lu6Var, 36.0f), 4.0f));
                    z7 = false;
                    dd4Var2.q(false);
                } else {
                    z7 = false;
                    dd4Var2.f0(1773609345);
                    dd4Var2.q(false);
                }
                z6 = true;
                dd4Var2.q(true);
                dd4Var2.q(z7);
            }
            dd4Var2.q(z6);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new mm6(koaVar2, z2, z3, ou6Var, ib4Var, i2, 1);
        }
    }

    public static final void Q(p3b p3bVar, o3b o3bVar, Object obj, Object obj2, by3 by3Var, dd4 dd4Var, int i2) {
        int i3;
        dd4Var.h0(867041821);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(p3bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(o3bVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? dd4Var.f(obj) : dd4Var.h(obj) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? dd4Var.f(obj2) : dd4Var.h(obj2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? dd4Var.f(by3Var) : dd4Var.h(by3Var) ? 16384 : 8192;
        }
        if (!dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            dd4Var.Y();
        } else if (p3bVar.g()) {
            o3bVar.g(obj, obj2, by3Var);
        } else {
            o3bVar.h(obj2, by3Var);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new l41(p3bVar, o3bVar, obj, obj2, by3Var, i2, 15);
        }
    }

    public static wfc R(List list, kb4 kb4Var, yb4 yb4Var) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) kb4Var.invoke(next);
                do {
                    Object next2 = it.next();
                    Comparable comparable2 = (Comparable) kb4Var.invoke(next2);
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        if (next == null) {
            so9.n("Unable to build char tree from an empty list");
            return null;
        }
        ((Number) kb4Var.invoke(next)).intValue();
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((Number) kb4Var.invoke(it2.next())).intValue() == 0) {
                    gp.l("There should be no empty entries");
                    return null;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        S(arrayList, list, 0, kb4Var, yb4Var);
        arrayList.trimToSize();
        new gw((char) 0, lc3.a, arrayList);
        return new wfc(15);
    }

    public static void S(ArrayList arrayList, List list, int i2, kb4 kb4Var, yb4 yb4Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Character ch = (Character) yb4Var.invoke(obj, Integer.valueOf(i2));
            ch.getClass();
            Object arrayList2 = linkedHashMap.get(ch);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(ch, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            char cCharValue = ((Character) entry.getKey()).charValue();
            List list2 = (List) entry.getValue();
            int i3 = i2 + 1;
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list2) {
                if (((Number) kb4Var.invoke(obj2)).intValue() > i3) {
                    arrayList4.add(obj2);
                }
            }
            S(arrayList3, arrayList4, i3, kb4Var, yb4Var);
            arrayList3.trimToSize();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : list2) {
                if (((Number) kb4Var.invoke(obj3)).intValue() == i3) {
                    arrayList5.add(obj3);
                }
            }
            arrayList.add(new gw(cCharValue, arrayList5, arrayList3));
        }
    }

    public static final boolean T(ArrayList arrayList) {
        List list;
        long j2;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = lc3.a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i2 = 0;
                while (i2 < size) {
                    i2++;
                    Object obj2 = arrayList.get(i2);
                    d29 d29Var = (d29) obj2;
                    d29 d29Var2 = (d29) obj;
                    arrayList2.add(new eb7((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (d29Var2.g().d() >> 32)) - Float.intBitsToFloat((int) (d29Var.g().d() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (d29Var2.g().d() & 4294967295L)) - Float.intBitsToFloat((int) (d29Var.g().d() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j2 = ((eb7) fc1.x0(list)).a;
            } else {
                if (list.isEmpty()) {
                    sz5.c("Empty collection can't be reduced.");
                }
                Object objX0 = fc1.x0(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i3 = 1;
                    while (true) {
                        objX0 = new eb7(eb7.h(((eb7) objX0).a, ((eb7) list.get(i3)).a));
                        if (i3 == size2) {
                            break;
                        }
                        i3++;
                    }
                }
                j2 = ((eb7) objX0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j2)) >= Float.intBitsToFloat((int) (j2 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static void U(InputStream inputStream, OutputStream outputStream) throws IOException {
        inputStream.getClass();
        byte[] bArr = new byte[8192];
        int i2 = inputStream.read(bArr);
        while (i2 >= 0) {
            outputStream.write(bArr, 0, i2);
            i2 = inputStream.read(bArr);
        }
    }

    public static final int V(List list) {
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int iS = gc1.S(list);
        for (int i3 = 1; i3 < iS; i3++) {
            if (lc1.e(((lc1) list.get(i3)).a) == 0.0f) {
                i2++;
            }
        }
        return i2;
    }

    public static final p3b W(p3b p3bVar, Object obj, Object obj2, String str, dd4 dd4Var, int i2) {
        int i3 = (i2 & 14) ^ 6;
        boolean z2 = true;
        boolean z3 = (i3 > 4 && dd4Var.f(p3bVar)) || (i2 & 6) == 4;
        Object objQ = dd4Var.Q();
        Object obj3 = vl1.a;
        if (z3 || objQ == obj3) {
            objQ = new p3b(new f07(obj), p3bVar, j39.n(new StringBuilder(), p3bVar.c, " > ", str));
            dd4Var.p0(objQ);
        }
        p3b p3bVar2 = (p3b) objQ;
        if ((i3 <= 4 || !dd4Var.f(p3bVar)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean zF = dd4Var.f(p3bVar2) | z2;
        Object objQ2 = dd4Var.Q();
        if (zF || objQ2 == obj3) {
            objQ2 = new k49(28, p3bVar, p3bVar2);
            dd4Var.p0(objQ2);
        }
        lc5.j(p3bVar2, (kb4) objQ2, dd4Var);
        if (p3bVar.g()) {
            p3bVar2.k(obj, obj2);
            return p3bVar2;
        }
        p3bVar2.p(obj2);
        p3bVar2.k.setValue(Boolean.FALSE);
        return p3bVar2;
    }

    public static final l3b X(p3b p3bVar, s9b s9bVar, String str, dd4 dd4Var, int i2, int i3) {
        k3b k3bVar;
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zF = dd4Var.f(p3bVar);
        Object objQ = dd4Var.Q();
        Object obj = vl1.a;
        if (zF || objQ == obj) {
            objQ = new l3b(p3bVar, s9bVar, str);
            dd4Var.p0(objQ);
        }
        l3b l3bVar = (l3b) objQ;
        boolean zF2 = dd4Var.f(p3bVar) | dd4Var.h(l3bVar);
        Object objQ2 = dd4Var.Q();
        if (zF2 || objQ2 == obj) {
            objQ2 = new k49(29, p3bVar, l3bVar);
            dd4Var.p0(objQ2);
        }
        lc5.j(l3bVar, (kb4) objQ2, dd4Var);
        if (p3bVar.g() && (k3bVar = (k3b) l3bVar.b.getValue()) != null) {
            p3b p3bVar2 = l3bVar.c;
            k3bVar.a.g(k3bVar.c.invoke(p3bVar2.f().a()), k3bVar.c.invoke(p3bVar2.f().c()), (by3) k3bVar.b.invoke(p3bVar2.f()));
        }
        return l3bVar;
    }

    public static final o3b Y(p3b p3bVar, Object obj, Object obj2, by3 by3Var, s9b s9bVar, dd4 dd4Var, int i2) {
        Object obj3;
        Object obj4;
        int i3 = i2 & 14;
        int i4 = i3 ^ 6;
        boolean z2 = true;
        boolean z3 = (i4 > 4 && dd4Var.f(p3bVar)) || (i2 & 6) == 4;
        Object objQ = dd4Var.Q();
        fu6 fu6Var = vl1.a;
        if (z3 || objQ == fu6Var) {
            oj9 oj9VarG = zib.g();
            kb4 kb4VarE = oj9VarG != null ? oj9VarG.e() : null;
            oj9 oj9VarI = zib.i(oj9VarG);
            try {
                obj3 = obj2;
                vo voVar = (vo) s9bVar.a.invoke(obj3);
                voVar.d();
                obj4 = obj;
                o3b o3bVar = new o3b(p3bVar, obj4, voVar, s9bVar);
                zib.k(oj9VarG, oj9VarI, kb4VarE);
                dd4Var.p0(o3bVar);
                objQ = o3bVar;
            } catch (Throwable th) {
                zib.k(oj9VarG, oj9VarI, kb4VarE);
                throw th;
            }
        } else {
            obj4 = obj;
            obj3 = obj2;
        }
        o3b o3bVar2 = (o3b) objQ;
        int i5 = (i2 >> 3) & 8;
        int i6 = i2 << 3;
        Q(p3bVar, o3bVar2, obj4, obj3, by3Var, dd4Var, i3 | (i5 << 6) | (i6 & 896) | (i5 << 9) | (i6 & 7168) | (57344 & i6));
        if ((i4 <= 4 || !dd4Var.f(p3bVar)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean zF = dd4Var.f(o3bVar2) | z2;
        Object objQ2 = dd4Var.Q();
        if (zF || objQ2 == fu6Var) {
            objQ2 = new k49(27, p3bVar, o3bVar2);
            dd4Var.p0(objQ2);
        }
        lc5.j(o3bVar2, (kb4) objQ2, dd4Var);
        return o3bVar2;
    }

    public static final byte[] Z(CharsetEncoder charsetEncoder, CharSequence charSequence, int i2, int i3) {
        charsetEncoder.getClass();
        charSequence.getClass();
        if (charSequence instanceof String) {
            if (i2 == 0) {
                String str = (String) charSequence;
                if (i3 == str.length()) {
                    byte[] bytes = str.getBytes(charsetEncoder.charset());
                    bytes.getClass();
                    return bytes;
                }
            }
            byte[] bytes2 = ((String) charSequence).substring(i2, i3).getBytes(charsetEncoder.charset());
            bytes2.getClass();
            return bytes2;
        }
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i2, i3));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0123 A[PHI: r4
  0x0123: PHI (r4v14 f9) = (r4v8 f9), (r4v10 f9), (r4v12 f9) binds: [B:89:0x0121, B:105:0x014d, B:111:0x0160] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final ul7 r17, final ou6 r18, final f9 r19, final sr1 r20, final float r21, final boolean r22, final boolean r23, dd4 r24, final int r25) {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p7c.a(ul7, ou6, f9, sr1, float, boolean, boolean, dd4, int):void");
    }

    public static final ou6 a0(ou6 ou6Var, wg wgVar, qv5 qv5Var, kga kgaVar) {
        return ou6Var.e(new fv5(wgVar, qv5Var, kgaVar));
    }

    public static final void b(final List list, ou6 ou6Var, final kb4 kb4Var, final kb4 kb4Var2, dd4 dd4Var, int i2) {
        dd4Var.h0(-1190070089);
        int i3 = i2 | (dd4Var.h(list) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(kb4Var2) ? 2048 : 1024);
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zH = dd4Var.h(list);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (zH || objQ == obj) {
                objQ = new fz0(10, list);
                dd4Var.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            Object[] objArr = new Object[0];
            rt8 rt8Var = hz0.b;
            boolean zF = dd4Var.f(ib4Var);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new m50(18, ib4Var);
                dd4Var.p0(objQ2);
            }
            hz0 hz0Var = (hz0) ww1.d0(objArr, rt8Var, (ib4) objQ2, dd4Var, 0);
            hz0Var.a.F.setValue(ib4Var);
            final long jA = ((k0c) dd4Var.j(xzb.a)) == k0c.a ? vw1.a(250.0f, 200.0f) : vw1.a(300.0f, 200.0f);
            kp9 kp9VarW = ah1.W(0.0f, 1500.0f, 5, null);
            lc5.s(hz0Var, ou6Var, 300.0f, 12.0f, wx1.d0(hz0Var.a, new fu6(17), fp9.a(dd4Var), kp9VarW, dd4Var, 3072, 16), false, 0.0f, 0.0f, null, jf0.G(491388979, new ac4() { // from class: rc9
                @Override // defpackage.ac4
                public final Object g(Object obj2, Object obj3, Object obj4, Object obj5) {
                    ob9 ob9Var;
                    String str;
                    ib4 ib4Var2;
                    ty0 ty0Var = (ty0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    dd4 dd4Var2 = (dd4) obj4;
                    ((Integer) obj5).getClass();
                    ty0Var.getClass();
                    ob9 ob9Var2 = (ob9) list.get(iIntValue);
                    ur9 ur9Var = s96.a;
                    uw1 uw1Var = ((q96) dd4Var2.j(ur9Var)).c.d;
                    dd4Var2.f0(152582312);
                    pn2 pn2Var = (pn2) dd4Var2.j(xm1.h);
                    boolean zF2 = dd4Var2.f(ty0Var.a) | dd4Var2.f(pn2Var);
                    Object objQ3 = dd4Var2.Q();
                    Object obj6 = vl1.a;
                    if (zF2 || objQ3 == obj6) {
                        objQ3 = new be4(new c41(7, ty0Var, uw1Var, pn2Var));
                        dd4Var2.p0(objQ3);
                    }
                    be4 be4Var = (be4) objQ3;
                    dd4Var2.q(false);
                    lu6 lu6Var = lu6.a;
                    ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                    long j2 = jA;
                    ou6 ou6VarO = tg9.o(ou6VarF, a23.b(j2), a23.a(j2));
                    kb4 kb4Var3 = kb4Var;
                    boolean zF3 = dd4Var2.f(kb4Var3) | dd4Var2.f(ob9Var2);
                    Object objQ4 = dd4Var2.Q();
                    if (zF3 || objQ4 == obj6) {
                        objQ4 = new tc9(kb4Var3, ob9Var2, 0);
                        dd4Var2.p0(objQ4);
                    }
                    ib4 ib4Var3 = (ib4) objQ4;
                    kb4 kb4Var4 = kb4Var2;
                    boolean zF4 = dd4Var2.f(kb4Var4) | dd4Var2.f(ob9Var2);
                    Object objQ5 = dd4Var2.Q();
                    if (zF4 || objQ5 == obj6) {
                        objQ5 = new tc9(kb4Var4, ob9Var2, 1);
                        dd4Var2.p0(objQ5);
                    }
                    ou6 ou6VarW = t96.w(yn2.t(ou6VarO, ib4Var3, (ib4) objQ5, dd4Var2, 0), be4Var);
                    ha6 ha6VarD = pn0.d(bv4.b, false);
                    int iHashCode = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL = dd4Var2.l();
                    ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarW);
                    ml1.k.getClass();
                    ib4 ib4Var4 = ll1.b;
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(ib4Var4);
                    } else {
                        dd4Var2.s0();
                    }
                    jm jmVar = ll1.f;
                    un9.s(jmVar, dd4Var2, ha6VarD);
                    jm jmVar2 = ll1.e;
                    un9.s(jmVar2, dd4Var2, lr7VarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    jm jmVar3 = ll1.g;
                    un9.s(jmVar3, dd4Var2, numValueOf);
                    kd kdVar = ll1.h;
                    un9.r(dd4Var2, kdVar);
                    jm jmVar4 = ll1.d;
                    un9.s(jmVar4, dd4Var2, ou6VarL0);
                    String str2 = ob9Var2.a;
                    String str3 = ob9Var2.b;
                    w05.c(str2, str3, ob9Var2.c, ob9Var2.d, ra1.d, tg9.c, dd4Var2, 221184);
                    Object objQ6 = dd4Var2.Q();
                    if (objQ6 == obj6) {
                        Float fValueOf = Float.valueOf(0.0f);
                        long j3 = lc1.b;
                        ob9Var = ob9Var2;
                        str = str3;
                        objQ6 = js8.y(new xl7[]{new xl7(fValueOf, new lc1(lc1.c(0.0f, j3))), new xl7(Float.valueOf(0.4f), new lc1(lc1.c(0.6f, j3))), new xl7(Float.valueOf(1.0f), new lc1(lc1.c(1.0f, j3)))});
                        dd4Var2.p0(objQ6);
                    } else {
                        ob9Var = ob9Var2;
                        str = str3;
                    }
                    ou6 ou6VarA = zn0.a.a(fe.K(tg9.f(lu6Var, 1.0f), (sq0) objQ6), bv4.u);
                    wf0 wf0Var = bv4.w;
                    iv ivVar = pv.a;
                    eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var2, 0);
                    int iHashCode2 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL2 = dd4Var2.l();
                    ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarA);
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(ib4Var4);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(jmVar, dd4Var2, eq8VarA);
                    un9.s(jmVar2, dd4Var2, lr7VarL2);
                    ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
                    ou6 ou6VarL03 = gjb.l0(ky0.g(dd4Var2, ou6VarL02, jmVar4, 1.0f, true), 4.0f);
                    ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
                    int iHashCode3 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL3 = dd4Var2.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var2, ou6VarL03);
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(ib4Var4);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(jmVar, dd4Var2, ie1VarA);
                    un9.s(jmVar2, dd4Var2, lr7VarL3);
                    ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
                    un9.s(jmVar4, dd4Var2, ou6VarL04);
                    uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.k;
                    long j4 = lc1.e;
                    nha.c(str, gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2), j4, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, ukaVar, dd4Var2, 432, 24576, 114680);
                    ob9 ob9Var3 = ob9Var;
                    nha.c(ob9Var3.j, gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2), j4, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.l, dd4Var2, 432, 24576, 114680);
                    dd4Var2.q(true);
                    xf0 xf0Var = bv4.f;
                    ou6 ou6VarL05 = gjb.l0(new hmb(bv4.y), 4.0f);
                    ha6 ha6VarD2 = pn0.d(xf0Var, false);
                    int iHashCode4 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL4 = dd4Var2.l();
                    ou6 ou6VarL06 = s32.L0(dd4Var2, ou6VarL05);
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        ib4Var2 = ib4Var4;
                        dd4Var2.k(ib4Var2);
                    } else {
                        ib4Var2 = ib4Var4;
                        dd4Var2.s0();
                    }
                    un9.s(jmVar, dd4Var2, ha6VarD2);
                    un9.s(jmVar2, dd4Var2, lr7VarL4);
                    ky0.v(iHashCode4, dd4Var2, jmVar3, dd4Var2, kdVar);
                    un9.s(jmVar4, dd4Var2, ou6VarL06);
                    long jC = lc1.c(0.2f, j4);
                    ou6 ou6VarN = tg9.n(lu6Var, 20.0f);
                    boolean zF5 = dd4Var2.f(ob9Var3);
                    Object objQ7 = dd4Var2.Q();
                    if (zF5 || objQ7 == obj6) {
                        objQ7 = new o39(ob9Var3, 5);
                        dd4Var2.p0(objQ7);
                    }
                    ib4 ib4Var5 = ib4Var2;
                    h48.b((ib4) objQ7, ou6VarN, j4, 1.5f, jC, 0, 1.0f, dd4Var2, 1600944, 32);
                    eq8 eq8VarA2 = dq8.a(ivVar, bv4.x, dd4Var2, 48);
                    int iHashCode5 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL5 = dd4Var2.l();
                    ou6 ou6VarL07 = s32.L0(dd4Var2, lu6Var);
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(ib4Var5);
                    } else {
                        dd4Var2.s0();
                    }
                    un9.s(jmVar, dd4Var2, eq8VarA2);
                    un9.s(jmVar2, dd4Var2, lr7VarL5);
                    ky0.v(iHashCode5, dd4Var2, jmVar3, dd4Var2, kdVar);
                    un9.s(jmVar4, dd4Var2, ou6VarL07);
                    nha.c(String.valueOf(ob9Var3.h), (ou6) null, j4, (g60) null, wn9.x(9), (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.l, dd4Var2, 24960, 0, 131050);
                    nha.c("%", (ou6) null, j4, (g60) null, wn9.x(6), (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.l, dd4Var2, 24966, 0, 131050);
                    dd4Var2.q(true);
                    dd4Var2.q(true);
                    dd4Var2.q(true);
                    dd4Var2.q(true);
                    return heb.a;
                }
            }, dd4Var), dd4Var, 805309832 | (i3 & Token.ASSIGN_MOD));
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yn6((Object) list, ou6Var, kb4Var, kb4Var2, i2, 2);
        }
    }

    public static final int[] b0(int i2, List list) {
        int i3;
        int i4 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i4 < size) {
                iArr[i4] = ah1.X(((lc1) list.get(i4)).a);
                i4++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i2];
        int size2 = list.size() - 1;
        int size3 = list.size();
        int i5 = 0;
        while (i4 < size3) {
            long j2 = ((lc1) list.get(i4)).a;
            if (lc1.e(j2) == 0.0f) {
                if (i4 == 0) {
                    i3 = i5 + 1;
                    iArr2[i5] = ah1.X(lc1.c(0.0f, ((lc1) list.get(1)).a));
                } else if (i4 == size2) {
                    i3 = i5 + 1;
                    iArr2[i5] = ah1.X(lc1.c(0.0f, ((lc1) list.get(i4 - 1)).a));
                } else {
                    int i6 = i5 + 1;
                    iArr2[i5] = ah1.X(lc1.c(0.0f, ((lc1) list.get(i4 - 1)).a));
                    i5 += 2;
                    iArr2[i6] = ah1.X(lc1.c(0.0f, ((lc1) list.get(i4 + 1)).a));
                }
                i5 = i3;
            } else {
                iArr2[i5] = ah1.X(j2);
                i5++;
            }
            i4++;
        }
        return iArr2;
    }

    public static final void c(mf4 mf4Var, e9 e9Var, rj1 rj1Var, dd4 dd4Var, int i2) {
        dd4Var.h0(1959221577);
        if ((((dd4Var.f(mf4Var) ? 4 : 2) | i2 | (dd4Var.f(e9Var) ? 32 : 16)) & Token.EXPR_VOID) == 146 && dd4Var.F()) {
            dd4Var.Y();
        } else {
            on0 on0Var = on0.a;
            dd4Var.g0(578571862);
            dd4Var.g0(-548224868);
            if (!(dd4Var.a instanceof su)) {
                fe.Y();
                throw null;
            }
            dd4Var.d0();
            if (dd4Var.S) {
                dd4Var.k(on0Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jm.y, dd4Var, mf4Var);
            un9.s(jm.z, dd4Var, e9Var);
            rj1Var.invoke(dd4Var, 6);
            dd4Var.q(true);
            dd4Var.q(false);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new cf(mf4Var, e9Var, rj1Var, i2, 1);
        }
    }

    public static final float[] c0(int i2, List list, List list2) {
        if (i2 == 0) {
            if (list != null) {
                return fc1.W0(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i2];
        fArr[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
        int size = list2.size() - 1;
        int i3 = 1;
        for (int i4 = 1; i4 < size; i4++) {
            long j2 = ((lc1) list2.get(i4)).a;
            float fFloatValue = list != null ? ((Number) list.get(i4)).floatValue() : i4 / (list2.size() - 1);
            int i5 = i3 + 1;
            fArr[i3] = fFloatValue;
            if (lc1.e(j2) == 0.0f) {
                i3 += 2;
                fArr[i5] = fFloatValue;
            } else {
                i3 = i5;
            }
        }
        fArr[i3] = list != null ? ((Number) list.get(list2.size() - 1)).floatValue() : 1.0f;
        return fArr;
    }

    public static bi1 d() {
        bi1 bi1Var = new bi1(true);
        bi1Var.K(null);
        return bi1Var;
    }

    public static final byte[] d0(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        U(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public static final void e(o19 o19Var, rj1 rj1Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-954926513);
        int i3 = (dd4Var.h(o19Var) ? 4 : 2) | i2;
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            vm7.e(o19Var, rj1Var, dd4Var, i3 & Token.ELSE);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new jg1(o19Var, rj1Var, i2, i4);
        }
    }

    public static final y76 e0(t1c t1cVar, kb4 kb4Var, dd4 dd4Var) {
        t1c t1cVar2;
        a07 a07VarA = dk9.A(t1cVar, dd4Var);
        a07 a07VarA2 = dk9.A(kb4Var, dd4Var);
        Object[] objArr = new Object[0];
        Object objQ = dd4Var.Q();
        Object obj = vl1.a;
        if (objQ == obj) {
            objQ = new s5(1);
            dd4Var.p0(objQ);
        }
        String str = (String) ww1.b0(objArr, (ib4) objQ, dd4Var, 48);
        a6 a6VarA = p16.a(dd4Var);
        if (a6VarA == null) {
            gp.j("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        xi1 xi1VarE = a6VarA.e();
        Object objQ2 = dd4Var.Q();
        if (objQ2 == obj) {
            objQ2 = new r5();
            dd4Var.p0(objQ2);
        }
        r5 r5Var = (r5) objQ2;
        Object objQ3 = dd4Var.Q();
        if (objQ3 == obj) {
            objQ3 = new y76(r5Var, a07VarA);
            dd4Var.p0(objQ3);
        }
        y76 y76Var = (y76) objQ3;
        boolean zH = dd4Var.h(r5Var) | dd4Var.h(xi1VarE) | dd4Var.f(str) | dd4Var.h(t1cVar) | dd4Var.f(a07VarA2);
        Object objQ4 = dd4Var.Q();
        if (zH || objQ4 == obj) {
            t1cVar2 = t1cVar;
            objQ4 = new x5(r5Var, xi1VarE, str, t1cVar2, a07VarA2, 0);
            dd4Var.p0(objQ4);
        } else {
            t1cVar2 = t1cVar;
        }
        kb4 kb4Var2 = (kb4) objQ4;
        boolean zF = dd4Var.f(xi1VarE) | dd4Var.f(str) | dd4Var.f(t1cVar2);
        Object objQ5 = dd4Var.Q();
        if (zF || objQ5 == obj) {
            objQ5 = new ww2(kb4Var2);
            dd4Var.p0(objQ5);
        }
        return y76Var;
    }

    public static final void f(kga kgaVar, rj1 rj1Var, dd4 dd4Var, int i2) {
        int i3;
        dd4Var.h0(2080741862);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.h(kgaVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.h(rj1Var) ? 32 : 16;
        }
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            vm7.f(kgaVar, rj1Var, dd4Var, i3 & Token.ELSE);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ig1(kgaVar, rj1Var, i2, i4);
        }
    }

    public static final p3b f0(yf1 yf1Var, String str, dd4 dd4Var, int i2, int i3) {
        jt1 jt1Var = null;
        if ((i3 & 2) != 0) {
            str = null;
        }
        int i4 = (i2 & 14) ^ 6;
        boolean z2 = true;
        int i5 = 4;
        boolean z3 = (i4 > 4 && dd4Var.f(yf1Var)) || (i2 & 6) == 4;
        Object objQ = dd4Var.Q();
        fu6 fu6Var = vl1.a;
        if (z3 || objQ == fu6Var) {
            oj9 oj9VarG = zib.g();
            kb4 kb4VarE = oj9VarG != null ? oj9VarG.e() : null;
            oj9 oj9VarI = zib.i(oj9VarG);
            try {
                p3b p3bVar = new p3b(yf1Var, (p3b) null, str);
                zib.k(oj9VarG, oj9VarI, kb4VarE);
                dd4Var.p0(p3bVar);
                objQ = p3bVar;
            } catch (Throwable th) {
                zib.k(oj9VarG, oj9VarI, kb4VarE);
                throw th;
            }
        }
        p3b p3bVar2 = (p3b) objQ;
        if (yf1Var instanceof iz8) {
            dd4Var.f0(-1357590553);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == fu6Var) {
                objQ2 = lc5.Z(dd4Var);
                dd4Var.p0(objQ2);
            }
            vx1 vx1Var = (vx1) objQ2;
            boolean zH = dd4Var.h(vx1Var) | ((i4 > 4 && dd4Var.f(yf1Var)) || (i2 & 6) == 4);
            Object objQ3 = dd4Var.Q();
            if (zH || objQ3 == fu6Var) {
                objQ3 = new k49(25, yf1Var, vx1Var);
                dd4Var.p0(objQ3);
            }
            lc5.j(vx1Var, (kb4) objQ3, dd4Var);
            iz8 iz8Var = (iz8) yf1Var;
            Object value = iz8Var.c.getValue();
            Object value2 = iz8Var.b.getValue();
            if ((i4 <= 4 || !dd4Var.f(yf1Var)) && (i2 & 6) != 4) {
                z2 = false;
            }
            Object objQ4 = dd4Var.Q();
            if (z2 || objQ4 == fu6Var) {
                objQ4 = new bva(yf1Var, jt1Var, i5);
                dd4Var.p0(objQ4);
            }
            lc5.v(value, value2, (yb4) objQ4, dd4Var);
            dd4Var.q(false);
        } else {
            dd4Var.f0(-1356604288);
            p3bVar2.a(yf1Var.v(), dd4Var, 0);
            dd4Var.q(false);
        }
        boolean zF = dd4Var.f(p3bVar2);
        Object objQ5 = dd4Var.Q();
        if (zF || objQ5 == fu6Var) {
            objQ5 = new r3b(p3bVar2, 0);
            dd4Var.p0(objQ5);
        }
        lc5.j(p3bVar2, (kb4) objQ5, dd4Var);
        return p3bVar2;
    }

    public static final void g(String str, t27 t27Var, pj7 pj7Var, pj7 pj7Var2, ou6 ou6Var, dd4 dd4Var, int i2) {
        int i3;
        pj7 pj7Var3;
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(-1701204684);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(t27Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            pj7Var3 = pj7Var2;
            i3 |= dd4Var.f(pj7Var3) ? 2048 : 1024;
        } else {
            pj7Var3 = pj7Var2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 16384 : 8192;
        }
        final int i4 = 1;
        final int i5 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            dd4Var.a0();
            if ((i2 & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final nu2 nu2Var = (nu2) ((qtb) qx1.N(ug8.a(nu2.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(nu2Var.K, dd4Var);
            boolean zF = dd4Var.f(nu2Var);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (zF || objQ == obj) {
                objQ = new rb2(nu2Var, 24);
                dd4Var.p0(objQ);
            }
            lx1.g(nu2Var, null, (kb4) objQ, dd4Var, 0);
            if (((iu2) a07VarB.getValue()).b) {
                dd4Var.f0(25880184);
                String str2 = ((iu2) a07VarB.getValue()).c;
                px3 px3Var = tg9.c;
                boolean zF2 = dd4Var.f(nu2Var);
                Object objQ2 = dd4Var.Q();
                if (zF2 || objQ2 == obj) {
                    objQ2 = new ib4() { // from class: eu2
                        @Override // defpackage.ib4
                        public final Object invoke() {
                            int i6 = i5;
                            heb hebVar = heb.a;
                            nu2 nu2Var2 = nu2Var;
                            switch (i6) {
                                case 0:
                                    nu2Var2.F();
                                    break;
                                case 1:
                                    nu2Var2.F();
                                    break;
                                default:
                                    nu2Var2.F();
                                    break;
                            }
                            return hebVar;
                        }
                    };
                    dd4Var.p0(objQ2);
                }
                h(48, (ib4) objQ2, dd4Var, px3Var, str2);
                dd4Var.q(false);
            } else if (((iu2) a07VarB.getValue()).a && ((iu2) a07VarB.getValue()).d.isEmpty()) {
                dd4Var.f0(26148892);
                j(((i3 >> 3) & Token.ASSIGN_MOD) | ((i3 >> 12) & 14), dd4Var, ou6Var, pj7Var);
                dd4Var.q(false);
            } else if (((iu2) a07VarB.getValue()).d.isEmpty()) {
                dd4Var.f0(26334334);
                String strK = wn9.K((pv9) eu9.y.getValue(), dd4Var);
                px3 px3Var2 = tg9.c;
                boolean zF3 = dd4Var.f(nu2Var);
                Object objQ3 = dd4Var.Q();
                if (zF3 || objQ3 == obj) {
                    objQ3 = new ib4() { // from class: eu2
                        @Override // defpackage.ib4
                        public final Object invoke() {
                            int i6 = i4;
                            heb hebVar = heb.a;
                            nu2 nu2Var2 = nu2Var;
                            switch (i6) {
                                case 0:
                                    nu2Var2.F();
                                    break;
                                case 1:
                                    nu2Var2.F();
                                    break;
                                default:
                                    nu2Var2.F();
                                    break;
                            }
                            return hebVar;
                        }
                    };
                    dd4Var.p0(objQ3);
                }
                h(48, (ib4) objQ3, dd4Var, px3Var2, strK);
                dd4Var.q(false);
            } else {
                dd4Var.f0(26615287);
                boolean z2 = ((iu2) a07VarB.getValue()).a;
                List list = ((iu2) a07VarB.getValue()).d;
                boolean z3 = ((i3 & Token.ASSIGN_MOD) == 32) | ((i3 & 14) == 4);
                Object objQ4 = dd4Var.Q();
                if (z3 || objQ4 == obj) {
                    objQ4 = new fu2(t27Var, str, i5);
                    dd4Var.p0(objQ4);
                }
                kb4 kb4Var = (kb4) objQ4;
                boolean zF4 = dd4Var.f(nu2Var);
                Object objQ5 = dd4Var.Q();
                if (zF4 || objQ5 == obj) {
                    final int i6 = 2;
                    objQ5 = new ib4() { // from class: eu2
                        @Override // defpackage.ib4
                        public final Object invoke() {
                            int i62 = i6;
                            heb hebVar = heb.a;
                            nu2 nu2Var2 = nu2Var;
                            switch (i62) {
                                case 0:
                                    nu2Var2.F();
                                    break;
                                case 1:
                                    nu2Var2.F();
                                    break;
                                default:
                                    nu2Var2.F();
                                    break;
                            }
                            return hebVar;
                        }
                    };
                    dd4Var.p0(objQ5);
                }
                int i7 = (i3 >> 6) & 896;
                int i8 = i3 << 3;
                i(z2, list, ou6Var, pj7Var, pj7Var3, kb4Var, (ib4) objQ5, dd4Var, i7 | (i8 & 7168) | (i8 & 57344));
                dd4Var.q(false);
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new l41(str, (Object) t27Var, (Object) pj7Var, (Object) pj7Var2, ou6Var, i2, 3);
        }
    }

    public static final void g0(b4 b4Var, d29 d29Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = b4Var.a;
        Object objG = d29Var.k().a.g(j29.f);
        if (objG == null) {
            objG = null;
        }
        cc1 cc1Var = (cc1) objG;
        if (cc1Var != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(cc1Var.a, cc1Var.b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objG2 = d29Var.k().a.g(j29.e);
        if ((objG2 != null ? objG2 : null) != null) {
            List listJ = d29.j(4, d29Var);
            int size = listJ.size();
            for (int i2 = 0; i2 < size; i2++) {
                d29 d29Var2 = (d29) listJ.get(i2);
                if (d29Var2.k().a.c(j29.J)) {
                    arrayList.add(d29Var2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zT = T(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zT ? 1 : arrayList.size(), zT ? arrayList.size() : 1, false, 0));
    }

    public static final void h(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, String str) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1164031173);
        int i3 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            dd4Var2.f0(1927476148);
            String strK = str.length() == 0 ? wn9.K((pv9) eu9.E.getValue(), dd4Var2) : str;
            dd4Var2.q(false);
            nha.c(strK, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.f, dd4Var, 0, 0, 130046);
            dd4Var2 = dd4Var;
            un9.a(dd4Var2, tg9.h(lu6.a, 12.0f));
            kc5.n(i25.c((m53) f53.d0.getValue(), dd4Var2, 0), wn9.K((pv9) mu9.Q.getValue(), dd4Var2), false, null, null, null, null, null, ib4Var, dd4Var2, (i3 << 18) & 234881024, 252);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new gv0(str, ou6Var, ib4Var, i2, 3);
        }
    }

    public static final p3b h0(Object obj, String str, dd4 dd4Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        Object objQ = dd4Var.Q();
        fu6 fu6Var = vl1.a;
        if (objQ == fu6Var) {
            objQ = new p3b(new f07(obj), (p3b) null, str);
            dd4Var.p0(objQ);
        }
        p3b p3bVar = (p3b) objQ;
        p3bVar.a(obj, dd4Var, (i2 & 8) | 48 | (i2 & 14));
        Object objQ2 = dd4Var.Q();
        if (objQ2 == fu6Var) {
            objQ2 = new r3b(p3bVar, 1);
            dd4Var.p0(objQ2);
        }
        lc5.j(p3bVar, (kb4) objQ2, dd4Var);
        return p3bVar;
    }

    public static final void i(boolean z2, List list, ou6 ou6Var, pj7 pj7Var, pj7 pj7Var2, kb4 kb4Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        int i3;
        pj7 pj7Var3;
        dd4Var.h0(1150758471);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.h(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            pj7Var3 = pj7Var2;
            i3 |= dd4Var.f(pj7Var3) ? 16384 : 8192;
        } else {
            pj7Var3 = pj7Var2;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 1048576 : 524288;
        }
        int i4 = i3;
        int i5 = 0;
        if (dd4Var.V(i4 & 1, (599187 & i4) != 599186)) {
            dd4Var.a0();
            if ((i2 & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            g78 g78VarB = z68.b(dd4Var);
            z68.a(z2, ib4Var, ou6Var, g78VarB, (f9) null, jf0.G(455358030, new gu2(g78VarB, z2, pj7Var, i5), dd4Var), false, 0.0f, jf0.G(-390112405, new hu2(pj7Var, pj7Var3, list, kb4Var, 0), dd4Var), dd4Var, (i4 & 14) | 100859904 | ((i4 >> 15) & Token.ASSIGN_MOD) | (i4 & 896));
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new i71(z2, list, ou6Var, pj7Var, pj7Var2, kb4Var, ib4Var, i2);
        }
    }

    public static final void i0(List list, List list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            gp.l("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            gp.l("colors and colorStops arguments must have equal length.");
        }
    }

    public static final void j(int i2, dd4 dd4Var, ou6 ou6Var, pj7 pj7Var) {
        int i3;
        dd4 dd4Var2;
        ou6 ou6Var2;
        dd4Var.h0(-688748525);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(ou6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            dd4Var2 = dd4Var;
            ou6Var2 = ou6Var;
            sdc.e(ou6Var2, null, jf0.G(-105102339, new nl9(pj7Var, 10), dd4Var), dd4Var2, (i3 & 14) | 3072, 6);
        } else {
            dd4Var2 = dd4Var;
            ou6Var2 = ou6Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ap2(ou6Var2, pj7Var, i2);
        }
    }

    public static final void k(t27 t27Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        t27Var.getClass();
        dd4Var.h0(-1743944617);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            dd4Var2 = dd4Var;
            gx1.p(wn9.K((pv9) ru9.O.getValue(), dd4Var), tg9.c, false, jf0.G(2051270867, new q41(t27Var, 24), dd4Var), h67.b, jf0.G(453712801, new eh(bx1.B(((do3) ((qtb) qx1.N(ug8.a(do3.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null))).c, dd4Var), 1), dd4Var), dd4Var2, 224304, 4);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new q41(i2, 25, t27Var);
        }
    }

    public static final void l(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, String str) {
        ib4 ib4Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-2127158768);
        int i3 = i2 | (dd4Var2.f(str) ? 4 : 2) | 48 | (dd4Var.f(ou6Var) ? 256 : Token.CASE) | 3072;
        int i4 = 1;
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
            Object objQ = dd4Var2.Q();
            if (objQ == vl1.a) {
                objQ = new dh1(i4);
                dd4Var2.p0(objQ);
            }
            ib4 ib4Var3 = (ib4) objQ;
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, eq8VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            nha.c(str, new bp5(1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.g, dd4Var2, i3 & 14, 0, 131068);
            dd4Var2 = dd4Var2;
            dd4Var2.f0(-1784333042);
            dd4Var2.q(false);
            dd4Var2.q(true);
            ib4Var2 = ib4Var3;
        } else {
            dd4Var2.Y();
            ib4Var2 = ib4Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new gv0(str, ou6Var, ib4Var2, i2, 13);
        }
    }

    public static final void m(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, t27 t27Var, pj7 pj7Var, szb szbVar) {
        br9 br9Var;
        int i3;
        Object qd2Var;
        cm4 cm4Var;
        cm4 cm4Var2;
        int i4;
        Object obj;
        boolean z2;
        dd4 dd4Var2 = dd4Var;
        t27Var.getClass();
        ib4Var.getClass();
        dd4Var2.h0(-310070039);
        int i5 = i2 | (dd4Var2.f(t27Var) ? 4 : 2) | (dd4Var2.f(pj7Var) ? 32 : 16) | (dd4Var2.f(szbVar) ? 256 : Token.CASE) | (dd4Var2.h(ib4Var) ? 16384 : 8192);
        if (dd4Var2.V(i5 & 1, (i5 & 9363) != 9362)) {
            pj4 pj4VarA = e36.a(dd4Var2);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            cm4 cm4Var3 = (cm4) ((qtb) qx1.N(ug8.a(cm4.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var2), null));
            a07 a07VarB = bx1.B(cm4Var3.s, dd4Var2);
            Object[] objArr = new Object[0];
            Object objQ = dd4Var2.Q();
            Object obj2 = vl1.a;
            if (objQ == obj2) {
                objQ = new tl3(24);
                dd4Var2.p0(objQ);
            }
            br9 br9Var2 = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var2, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == obj2) {
                objQ2 = new tl3(25);
                dd4Var2.p0(objQ2);
            }
            a07 a07Var = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var2, 48);
            Object[] objArr3 = new Object[0];
            Object objQ3 = dd4Var2.Q();
            if (objQ3 == obj2) {
                objQ3 = new tl3(26);
                dd4Var2.p0(objQ3);
            }
            a07 a07Var2 = (a07) ww1.b0(objArr3, (ib4) objQ3, dd4Var2, 48);
            if (((zl4) a07VarB.getValue()).a) {
                dd4Var2.f0(1178692311);
                dd4Var2.q(false);
                cm4Var2 = cm4Var3;
                br9Var = br9Var2;
                i4 = i5;
                obj = obj2;
            } else if (((zl4) a07VarB.getValue()).h.isEmpty()) {
                dd4Var2.f0(1178765967);
                cm4Var2 = cm4Var3;
                br9Var = br9Var2;
                bx1.d(lx1.n0(dd4Var2), wn9.K((pv9) eu9.e.getValue(), dd4Var2), wn9.K((pv9) eu9.f.getValue(), dd4Var2), gjb.k0(tg9.c, pj7Var), wn9.K((pv9) zt9.v0.getValue(), dd4Var2), ib4Var, dd4Var, (i5 << 3) & 458752, 0);
                dd4Var.q(false);
                dd4Var2 = dd4Var;
                i4 = i5;
                obj = obj2;
            } else {
                br9Var = br9Var2;
                dd4Var2.f0(1179223279);
                zl4 zl4Var = (zl4) a07VarB.getValue();
                boolean z3 = (i5 & 14) == 4;
                Object objQ4 = dd4Var2.Q();
                if (z3 || objQ4 == obj2) {
                    i3 = 8;
                    objQ4 = new cl0(t27Var, i3);
                    dd4Var2.p0(objQ4);
                } else {
                    i3 = 8;
                }
                kb4 kb4Var = (kb4) objQ4;
                boolean zF = dd4Var2.f(a07Var) | dd4Var2.f(br9Var);
                Object objQ5 = dd4Var2.Q();
                if (zF || objQ5 == obj2) {
                    objQ5 = new rl0(a07Var, br9Var, 11);
                    dd4Var2.p0(objQ5);
                }
                kb4 kb4Var2 = (kb4) objQ5;
                boolean zF2 = dd4Var2.f(cm4Var3);
                Object objQ6 = dd4Var2.Q();
                if (zF2 || objQ6 == obj2) {
                    cm4Var = cm4Var3;
                    qd2Var = new qd2(1, cm4Var, cm4.class, "changeSaveReadHistory", "changeSaveReadHistory(Z)V", 0, 15);
                    dd4Var2.p0(qd2Var);
                } else {
                    qd2Var = objQ6;
                    cm4Var = cm4Var3;
                }
                kb4 kb4Var3 = (kb4) ((ei5) qd2Var);
                boolean zF3 = dd4Var2.f(a07Var2);
                Object objQ7 = dd4Var2.Q();
                if (zF3 || objQ7 == obj2) {
                    objQ7 = new zl3(a07Var2, 13);
                    dd4Var2.p0(objQ7);
                }
                int i6 = i5 & 8176;
                dd4Var2 = dd4Var2;
                cm4Var2 = cm4Var;
                i4 = i5;
                obj = obj2;
                o(zl4Var, pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, kb4Var3, (ib4) objQ7, dd4Var2, i6);
                dd4Var2.q(false);
            }
            String str = (String) a07Var.getValue();
            boolean zBooleanValue = ((Boolean) br9Var.getValue()).booleanValue();
            boolean zF4 = dd4Var2.f(br9Var);
            Object objQ8 = dd4Var2.Q();
            if (zF4 || objQ8 == obj) {
                objQ8 = new wf3(br9Var, 27);
                dd4Var2.p0(objQ8);
            }
            kb4 kb4Var4 = (kb4) objQ8;
            int i7 = i4 & 14;
            boolean zF5 = dd4Var2.f(br9Var) | (i7 == 4);
            Object objQ9 = dd4Var2.Q();
            if (zF5 || objQ9 == obj) {
                z2 = true;
                objQ9 = new v03(t27Var, br9Var, 1);
                dd4Var2.p0(objQ9);
            } else {
                z2 = true;
            }
            yb4 yb4Var = (yb4) objQ9;
            boolean zF6 = dd4Var2.f(br9Var) | (i7 == 4 ? z2 : false);
            Object objQ10 = dd4Var2.Q();
            if (zF6 || objQ10 == obj) {
                objQ10 = new wt2(t27Var, br9Var, 5);
                dd4Var2.p0(objQ10);
            }
            kb4 kb4Var5 = (kb4) objQ10;
            boolean zF7 = dd4Var2.f(br9Var) | (i7 == 4 ? z2 : false);
            Object objQ11 = dd4Var2.Q();
            if (zF7 || objQ11 == obj) {
                objQ11 = new wt2(t27Var, br9Var, 6);
                dd4Var2.p0(objQ11);
            }
            kb4 kb4Var6 = (kb4) objQ11;
            boolean zF8 = dd4Var2.f(br9Var) | (i7 == 4 ? z2 : false);
            Object objQ12 = dd4Var2.Q();
            if (zF8 || objQ12 == obj) {
                objQ12 = new wt2(t27Var, br9Var, 7);
                dd4Var2.p0(objQ12);
            }
            kb4 kb4Var7 = (kb4) objQ12;
            boolean zF9 = dd4Var2.f(br9Var) | (i7 == 4);
            Object objQ13 = dd4Var2.Q();
            if (zF9 || objQ13 == obj) {
                objQ13 = new wt2(t27Var, br9Var, 8);
                dd4Var2.p0(objQ13);
            }
            qu1.g(zBooleanValue, str, kb4Var4, yb4Var, kb4Var5, kb4Var6, kb4Var7, (kb4) objQ13, dd4Var2, 0);
            boolean zBooleanValue2 = ((Boolean) a07Var2.getValue()).booleanValue();
            boolean zF10 = dd4Var2.f(a07Var2);
            Object objQ14 = dd4Var2.Q();
            if (zF10 || objQ14 == obj) {
                objQ14 = new wf3(a07Var2, 28);
                dd4Var2.p0(objQ14);
            }
            kb4 kb4Var8 = (kb4) objQ14;
            boolean zF11 = dd4Var2.f(cm4Var2) | dd4Var2.f(a07Var2);
            Object objQ15 = dd4Var2.Q();
            if (zF11 || objQ15 == obj) {
                objQ15 = new al3(13, cm4Var2, a07Var2);
                dd4Var2.p0(objQ15);
            }
            p(zBooleanValue2, kb4Var8, (ib4) objQ15, dd4Var2, 0);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new y03(t27Var, pj7Var, szbVar, ou6Var, ib4Var, i2, 2);
        }
    }

    public static final void n(a07 a07Var, boolean z2) {
        a07Var.setValue(Boolean.valueOf(z2));
    }

    public static final void o(zl4 zl4Var, pj7 pj7Var, szb szbVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, ib4 ib4Var, dd4 dd4Var, int i2) {
        int i3;
        kb4 kb4Var4;
        ib4 ib4Var2;
        nv nvVar;
        dd4Var.h0(2028649986);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.h(zl4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(szbVar) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            kb4Var4 = kb4Var3;
            i3 |= dd4Var.h(kb4Var4) ? 1048576 : 524288;
        } else {
            kb4Var4 = kb4Var3;
        }
        if ((12582912 & i2) == 0) {
            ib4Var2 = ib4Var;
            i3 |= dd4Var.h(ib4Var2) ? 8388608 : 4194304;
        } else {
            ib4Var2 = ib4Var;
        }
        int i4 = i3;
        if (dd4Var.V(i4 & 1, (4793491 & i4) != 4793490)) {
            yh4 yh4Var = new yh4(200.0f);
            mv mvVar = new mv(8.0f, true, new gp(5));
            nv mvVar2 = new mv(8.0f, true, new gp(5));
            boolean zH = dd4Var.h(zl4Var) | ((57344 & i4) == 16384) | ((458752 & i4) == 131072) | ((29360128 & i4) == 8388608) | ((3670016 & i4) == 1048576);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                kb4 kb4Var5 = kb4Var4;
                ib4 ib4Var3 = ib4Var2;
                nvVar = mvVar2;
                x5 x5Var = new x5(zl4Var, kb4Var, kb4Var2, ib4Var3, kb4Var5, 6);
                dd4Var.p0(x5Var);
                objQ = x5Var;
            } else {
                nvVar = mvVar2;
            }
            gx1.i(yh4Var, ou6Var, null, pj7Var, nvVar, mvVar, null, false, 0L, 0L, szbVar, 0.0f, (kb4) objQ, dd4Var, ((i4 >> 6) & Token.ASSIGN_MOD) | 1769472 | ((i4 << 6) & 7168), (i4 >> 3) & Token.ASSIGN_MOD, 6036);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xb1(zl4Var, pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, kb4Var3, ib4Var, i2, 3);
        }
    }

    public static final void p(boolean z2, kb4 kb4Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-217439746);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.h(kb4Var) ? 32 : 16) | (dd4Var.h(ib4Var) ? 256 : Token.CASE);
        byte b2 = 0;
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            z8.d(z2, kb4Var, jf0.G(798866258, new ul4(b2, ib4Var, kb4Var), dd4Var), null, null, jf0.G(-650631851, new gs6(kb4Var, 6, b2), dd4Var), i, null, 0L, 0L, 0.0f, false, false, j, dd4Var, (i3 & 14) | 1769856 | (i3 & Token.ASSIGN_MOD), 8088);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new vl4(z2, kb4Var, ib4Var, i2);
        }
    }

    public static final void q(int i2, rj1 rj1Var, rj1 rj1Var2, kb4 kb4Var, dd4 dd4Var, boolean z2) {
        dd4Var.h0(1770091892);
        int i3 = (dd4Var.g(z2) ? 4 : 2) | i2;
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 2048 : 1024;
        }
        if (!dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            dd4Var.Y();
        } else if (xzb.a(dd4Var)) {
            dd4Var.f0(-800687009);
            t(i3 & 8190, rj1Var, rj1Var2, kb4Var, dd4Var, z2);
            dd4Var.q(false);
        } else {
            dd4Var.f0(-800475682);
            s(i3 & 8190, rj1Var, rj1Var2, kb4Var, dd4Var, z2);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tl6(z2, rj1Var, rj1Var2, kb4Var, i2, 5);
        }
    }

    public static final void r(boolean z2, fba fbaVar, String str, Set set, List list, List list2, kb4 kb4Var, ib4 ib4Var, yb4 yb4Var, kb4 kb4Var2, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, kb4 kb4Var3, kb4 kb4Var4, kb4 kb4Var5, kb4 kb4Var6, dd4 dd4Var, int i2) {
        fbaVar.getClass();
        str.getClass();
        set.getClass();
        list.getClass();
        list2.getClass();
        kb4Var.getClass();
        ib4Var.getClass();
        yb4Var.getClass();
        kb4Var2.getClass();
        ib4Var2.getClass();
        ib4Var3.getClass();
        ib4Var4.getClass();
        kb4Var3.getClass();
        kb4Var4.getClass();
        kb4Var5.getClass();
        kb4Var6.getClass();
        dd4Var.h0(1568615471);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.f(fbaVar) ? 32 : 16) | (dd4Var.f(str) ? 256 : 128) | (dd4Var.h(set) ? 2048 : 1024) | (dd4Var.h(list) ? 16384 : 8192) | (dd4Var.h(list2) ? 131072 : 65536) | (dd4Var.h(kb4Var) ? 1048576 : 524288) | (dd4Var.h(ib4Var) ? 8388608 : 4194304) | (dd4Var.h(yb4Var) ? 67108864 : 33554432) | (dd4Var.h(kb4Var2) ? 536870912 : 268435456);
        char c2 = 128;
        int i4 = (dd4Var.h(ib4Var2) ? (char) 4 : (char) 2) | (dd4Var.h(ib4Var3) ? ' ' : (char) 16);
        if (dd4Var.h(ib4Var4)) {
            c2 = 256;
        }
        if (dd4Var.V(i3 & 1, ((i3 & 306783379) == 306783378 && (599187 & (((((i4 | c2) | (dd4Var.h(kb4Var3) ? (char) 2048 : (char) 1024)) | (dd4Var.h(kb4Var4) ? (char) 16384 : (char) 8192)) | (dd4Var.h(kb4Var5) ? (char) 0 : (char) 0)) | (dd4Var.h(kb4Var6) ? (char) 0 : (char) 0))) == 599186) ? false : true)) {
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = new tl3(16);
                dd4Var.p0(objQ);
            }
            q((i3 & 14) | 432 | ((i3 >> 9) & 7168), jf0.G(1385565873, new uq6(fbaVar, ib4Var, ib4Var2, ib4Var3, ib4Var4, kb4Var6, 9), dd4Var), jf0.G(-68759408, new xl6(list, list2, cl7.b(0, (ib4) objQ, dd4Var, 384, 3), str, set, yb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, 1), dd4Var), kb4Var, dd4Var, z2);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new dm6(z2, fbaVar, str, set, list, list2, kb4Var, ib4Var, yb4Var, kb4Var2, ib4Var2, ib4Var3, ib4Var4, kb4Var3, kb4Var4, kb4Var5, kb4Var6, i2);
        }
    }

    public static final void s(int i2, rj1 rj1Var, rj1 rj1Var2, kb4 kb4Var, dd4 dd4Var, boolean z2) {
        rj1 rj1Var3;
        dd4Var.h0(140711235);
        int i3 = (dd4Var.g(z2) ? 4 : 2) | i2;
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 2048 : 1024;
        }
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            rj1Var3 = rj1Var;
            fw.r(z2, kb4Var, null, false, 0L, 0L, 0.0f, 0L, 0.0f, jf0.G(2075276338, new sl6(rj1Var3, rj1Var2, i4), dd4Var), dd4Var, (i3 & 14) | 805309440 | ((i3 >> 6) & Token.ASSIGN_MOD), 500);
        } else {
            rj1Var3 = rj1Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tl6(z2, rj1Var3, rj1Var2, kb4Var, i2, 3);
        }
    }

    public static final void t(int i2, rj1 rj1Var, rj1 rj1Var2, kb4 kb4Var, dd4 dd4Var, boolean z2) {
        dd4Var.h0(738123157);
        int i3 = (dd4Var.g(z2) ? 4 : 2) | i2;
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 2048 : 1024;
        }
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            sdc.e(tg9.c, null, jf0.G(-1522105749, new wl6(z2, kb4Var, rj1Var, rj1Var2, 1), dd4Var), dd4Var, 3078, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tl6(z2, rj1Var, rj1Var2, kb4Var, i2, 4);
        }
    }

    public static final void u(int i2, sw8 sw8Var, ou6 ou6Var, dd4 dd4Var, int i3) {
        dd4Var.h0(-2017195452);
        int i4 = (dd4Var.d(i2) ? 4 : 2) | i3 | (dd4Var.f(sw8Var) ? 32 : 16);
        if (!dd4Var.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
            dd4Var.Y();
        } else if (i2 == 0) {
            dd4Var.f0(913772476);
            dd4Var.q(false);
        } else if (i2 == 1) {
            dd4Var.f0(912870066);
            oh9.c(sw8Var, ou6Var, dd4Var, (i4 >> 3) & Token.ELSE);
            dd4Var.q(false);
        } else if (i2 == 2) {
            dd4Var.f0(913046642);
            ky1.a(sw8Var, ou6Var, dd4Var, (i4 >> 3) & Token.ELSE);
            dd4Var.q(false);
        } else if (i2 == 3) {
            dd4Var.f0(913229356);
            e11.B(sw8Var, ou6Var, dd4Var, (i4 >> 3) & Token.ELSE);
            dd4Var.q(false);
        } else if (i2 == 4) {
            dd4Var.f0(913417836);
            ef9.a(sw8Var, ou6Var, dd4Var, (i4 >> 3) & Token.ELSE);
            dd4Var.q(false);
        } else if (i2 != 5) {
            dd4Var.f0(913811102);
            dd4Var.q(false);
        } else {
            dd4Var.f0(913599093);
            cx1.o(sw8Var, ou6Var, dd4Var, (i4 >> 3) & Token.ELSE);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new jy1(i2, sw8Var, ou6Var, i3);
        }
    }

    public static final void v(co0 co0Var, int i2, tj7 tj7Var, sw8 sw8Var, lra lraVar, jka jkaVar, aoa aoaVar, zja zjaVar, kba kbaVar, nba nbaVar, z85 z85Var, pj7 pj7Var, ou6 ou6Var, ib4 ib4Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i3, int i4) {
        co0 co0Var2;
        int i5;
        nba nbaVar2;
        pj7 pj7Var2;
        tj7 tj7Var2;
        z85 z85Var2;
        ou6 ou6Var2;
        ou6 ou6VarH;
        xf0 xf0Var = bv4.u;
        xf0 xf0Var2 = bv4.c;
        xf0 xf0Var3 = bv4.f;
        dd4Var.h0(2042130417);
        if ((i3 & 6) == 0) {
            co0Var2 = co0Var;
            i5 = i3 | (dd4Var.f(co0Var2) ? 4 : 2);
        } else {
            co0Var2 = co0Var;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= dd4Var.d(i2) ? 32 : 16;
        }
        int i6 = i3 & 384;
        int i7 = Token.CASE;
        if (i6 == 0) {
            i5 |= dd4Var.f(tj7Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= dd4Var.f(sw8Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= dd4Var.f(lraVar) ? 16384 : 8192;
        }
        int i8 = 196608 & i3;
        int i9 = Parser.ARGC_LIMIT;
        if (i8 == 0) {
            i5 |= dd4Var.f(jkaVar) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= dd4Var.f(aoaVar) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= dd4Var.f(zjaVar) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= dd4Var.f(kbaVar) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= dd4Var.f(nbaVar) ? 536870912 : 268435456;
        }
        int i10 = i5;
        int i11 = i4 | (dd4Var.f(z85Var) ? 4 : 2) | (dd4Var.f(pj7Var) ? 32 : 16);
        if ((i4 & 384) == 0) {
            if (dd4Var.f(ou6Var)) {
                i7 = 256;
            }
            i11 |= i7;
        }
        int i12 = i11 | (dd4Var.h(ib4Var) ? 2048 : 1024) | (dd4Var.h(kb4Var) ? 16384 : 8192);
        if (dd4Var.h(kb4Var2)) {
            i9 = 131072;
        }
        int i13 = i12 | i9;
        if (dd4Var.V(i10 & 1, ((i10 & 306783379) == 306783378 && (i13 & 74899) == 74898) ? false : true)) {
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new oy0();
                dd4Var.p0(objQ);
            }
            oy0 oy0Var = (oy0) objQ;
            Integer numValueOf = Integer.valueOf(i2);
            Long l2 = (Long) sw8Var.l.getValue();
            boolean zF = ((i10 & 7168) == 2048) | ((i10 & Token.ASSIGN_MOD) == 32) | dd4Var.f(oy0Var);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new pl7(sw8Var, i2, oy0Var, null);
                dd4Var.p0(objQ2);
            }
            lc5.w(numValueOf, tj7Var, l2, (yb4) objQ2, dd4Var);
            ou6 ou6VarO = tg9.o(ou6Var, co0Var2.d(), co0Var2.c());
            ou6VarO.getClass();
            oy0Var.getClass();
            ou6 ou6VarX = s32.X(ou6VarO, new nl9(oy0Var, 5));
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarX);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(ll1.f, dd4Var, ha6VarD);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            long j2 = lraVar.d;
            String str = lraVar.e;
            px3 px3Var = tg9.c;
            ym9.a(384, j2, dd4Var, px3Var, str);
            int i14 = i13 & Token.ASSIGN_MOD;
            boolean z2 = i14 == 32;
            Object objQ3 = dd4Var.Q();
            if (z2 || objQ3 == obj) {
                objQ3 = gjb.q(0.0f, pj7Var.d(), 0.0f, pj7Var.a(), 5);
                dd4Var.p0(objQ3);
            }
            long j3 = lraVar.c;
            ou6 ou6VarK0 = gjb.k0(px3Var, yib.w(yib.w((pj7) objQ3, z85Var), gjb.o(1, 0.0f)));
            int i15 = i10 >> 9;
            int i16 = ((i10 >> 6) & 14) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (i15 & 458752);
            int i17 = i13 << 12;
            pj7Var2 = pj7Var;
            w(tj7Var, j3, jkaVar, aoaVar, zjaVar, kbaVar, ou6VarK0, ib4Var, kb4Var, kb4Var2, dd4Var, i16 | (29360128 & i17) | (234881024 & i17) | (i17 & 1879048192));
            tj7Var2 = tj7Var;
            zm5 zm5Var = (zm5) dd4Var.j(xm1.n);
            boolean zD = dd4Var.d(zm5Var.ordinal()) | (i14 == 32);
            Object objQ4 = dd4Var.Q();
            if (zD || objQ4 == obj) {
                objQ4 = gjb.q(gjb.W(pj7Var2, zm5Var), 0.0f, gjb.V(pj7Var2, zm5Var), 0.0f, 10);
                dd4Var.p0(objQ4);
            }
            pj7 pj7Var3 = (pj7) objQ4;
            boolean z3 = i14 == 32;
            Object objQ5 = dd4Var.Q();
            if (z3 || objQ5 == obj) {
                x13 x13Var = new x13(pj7Var2.d());
                dd4Var.p0(x13Var);
                objQ5 = x13Var;
            }
            float f2 = ((x13) objQ5).a;
            boolean z4 = i14 == 32;
            Object objQ6 = dd4Var.Q();
            if (z4 || objQ6 == obj) {
                x13 x13Var2 = new x13(pj7Var2.a());
                dd4Var.p0(x13Var2);
                objQ6 = x13Var2;
            }
            float f3 = ((x13) objQ6).a;
            String str2 = tj7Var2.c;
            xf0 xf0Var4 = x13.b(f2, 20.0f) <= 0 ? xf0Var3 : xf0Var2;
            ou6 ou6Var3 = lu6.a;
            z85Var2 = z85Var;
            ou6 ou6VarK02 = gjb.k0(gjb.k0(tg9.f(ou6Var3, 1.0f), z85Var2), pj7Var3);
            zn0 zn0Var = zn0.a;
            ou6 ou6VarA = zn0Var.a(ou6VarK02, xf0Var2);
            if (x13.b(f2, 20.0f) <= 0) {
                ou6Var2 = ou6Var3;
                ou6VarH = tg9.h(ou6Var3, 20.0f + f2);
            } else {
                ou6Var2 = ou6Var3;
                ou6VarH = tg9.h(gjb.p0(ou6Var3, 0.0f, 10.0f, 0.0f, 0.0f, 13), 10.0f + f2);
            }
            tn9.b(str2, xf0Var4, ou6VarA.e(ou6VarH), dd4Var, 0);
            int i18 = tj7Var2.b;
            nbaVar2 = nbaVar;
            int i19 = nbaVar2.c;
            boolean z5 = tj7Var2 instanceof pia;
            int i20 = z5 ? ((pia) tj7Var2).g.a : -1;
            int i21 = z5 ? ((pia) tj7Var2).f : 0;
            if (x13.b(f2, 20.0f) > 0) {
                xf0Var3 = xf0Var;
            }
            zib.b(i18, i19, i20, i21, xf0Var3, zn0Var.a(gjb.k0(gjb.k0(tg9.f(ou6Var2, 1.0f), z85Var2), pj7Var3), xf0Var).e(x13.b(f3, 20.0f) <= 0 ? tg9.h(ou6Var2, 20.0f + f3) : tg9.h(gjb.p0(ou6Var2, 0.0f, 0.0f, 0.0f, 10.0f, 7), 10.0f + f3)), dd4Var, 0);
            dd4Var.q(true);
        } else {
            nbaVar2 = nbaVar;
            pj7Var2 = pj7Var;
            tj7Var2 = tj7Var;
            z85Var2 = z85Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new il7(co0Var, i2, tj7Var2, sw8Var, lraVar, jkaVar, aoaVar, zjaVar, kbaVar, nbaVar2, z85Var2, pj7Var2, ou6Var, ib4Var, kb4Var, kb4Var2, i3, i4);
        }
    }

    public static final void w(tj7 tj7Var, final long j2, final jka jkaVar, final aoa aoaVar, final zja zjaVar, final kba kbaVar, final ou6 ou6Var, final ib4 ib4Var, final kb4 kb4Var, final kb4 kb4Var2, dd4 dd4Var, final int i2) {
        int i3;
        final tj7 tj7Var2 = tj7Var;
        dd4Var.h0(-1512015948);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(tj7Var2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.e(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(jkaVar) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.f(aoaVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.f(zjaVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.f(kbaVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 536870912 : 268435456;
        }
        if (dd4Var.V(i3 & 1, (306783379 & i3) != 306783378)) {
            int i4 = i3 >> 18;
            ha6 ha6VarD = pn0.d(bv4.b, false);
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
            un9.s(ll1.f, dd4Var, ha6VarD);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            tj7Var2 = tj7Var;
            if (tj7Var2 instanceof pia) {
                dd4Var.f0(-1730198334);
                x((pia) tj7Var2, j2, jkaVar, aoaVar, zjaVar, kbaVar, tg9.f(lu6.a, 1.0f), dd4Var, (i3 & 14) | 1572864 | (i3 & Token.ASSIGN_MOD) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752));
                dd4Var.q(false);
            } else if (tj7Var2 instanceof ks9) {
                dd4Var.f0(-1729753701);
                t1c.D((ks9) tj7Var2, tg9.c, kb4Var, kb4Var2, dd4Var, (i3 & 14) | 48 | (i4 & 896) | (i4 & 7168));
                dd4Var.q(false);
            } else if (tj7Var2 instanceof dd3) {
                dd4Var.f0(-1729462084);
                t1c.C((i4 & Token.ASSIGN_MOD) | 6, ib4Var, dd4Var, tg9.c);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1729286872);
                dd4Var.q(false);
            }
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: kl7
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p7c.w(tj7Var2, j2, jkaVar, aoaVar, zjaVar, kbaVar, ou6Var, ib4Var, kb4Var, kb4Var2, (dd4) obj, qu1.x0(i2 | 1));
                    return heb.a;
                }
            };
        }
    }

    public static final void x(final pia piaVar, final long j2, final jka jkaVar, final aoa aoaVar, final zja zjaVar, final kba kbaVar, final ou6 ou6Var, dd4 dd4Var, final int i2) {
        int i3;
        dd4 dd4Var2;
        int i4;
        dd4 dd4Var3;
        dd4 dd4Var4 = dd4Var;
        dd4Var4.h0(-421870284);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var4.f(piaVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var4.e(j2) ? 32 : 16;
        }
        jka jkaVar2 = jkaVar;
        if ((i2 & 384) == 0) {
            i3 |= dd4Var4.f(jkaVar2) ? 256 : Token.CASE;
        }
        aoa aoaVar2 = aoaVar;
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var4.f(aoaVar2) ? 2048 : 1024;
        }
        zja zjaVar2 = zjaVar;
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var4.f(zjaVar2) ? 16384 : 8192;
        }
        kba kbaVar2 = kbaVar;
        if ((196608 & i2) == 0) {
            i3 |= dd4Var4.f(kbaVar2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var4.f(ou6Var) ? 1048576 : 524288;
        }
        if (dd4Var4.V(i3 & 1, (599187 & i3) != 599186)) {
            ria riaVar = piaVar.g;
            eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var4, 0);
            int iHashCode = Long.hashCode(dd4Var4.T);
            lr7 lr7VarL = dd4Var4.l();
            ou6 ou6VarL0 = s32.L0(dd4Var4, ou6Var);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var4.j0();
            if (dd4Var4.S) {
                dd4Var4.k(um1Var);
            } else {
                dd4Var4.s0();
            }
            un9.s(ll1.f, dd4Var4, eq8VarA);
            un9.s(ll1.e, dd4Var4, lr7VarL);
            un9.s(ll1.g, dd4Var4, Integer.valueOf(iHashCode));
            un9.r(dd4Var4, ll1.h);
            un9.s(ll1.d, dd4Var4, ou6VarL0);
            dd4Var4.f0(1383291956);
            int i5 = riaVar.d;
            int i6 = 0;
            while (i6 < i5) {
                sia siaVar = (sia) fc1.A0(i6, riaVar.f);
                if (siaVar == null) {
                    dd4Var4.f0(795827530);
                    dd4Var4.q(false);
                    int i7 = i6;
                    dd4Var3 = dd4Var4;
                    i4 = i7;
                } else {
                    dd4Var4.f0(795827531);
                    int i8 = i6;
                    int i9 = i3 << 3;
                    i4 = i8;
                    t1c.B(piaVar.d, j2, siaVar, jkaVar2, aoaVar2, zjaVar2, kbaVar2, new bp5(1.0f, true), dd4Var, (i9 & 7168) | (i3 & Token.ASSIGN_MOD) | (57344 & i9) | (458752 & i9) | (i9 & 3670016));
                    dd4Var3 = dd4Var;
                    dd4Var3.q(false);
                }
                dd4 dd4Var5 = dd4Var3;
                i6 = i4 + 1;
                dd4Var4 = dd4Var5;
                jkaVar2 = jkaVar;
                aoaVar2 = aoaVar;
                zjaVar2 = zjaVar;
                kbaVar2 = kbaVar;
            }
            dd4Var2 = dd4Var4;
            dd4Var2.q(false);
            dd4Var2.q(true);
        } else {
            dd4Var2 = dd4Var4;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: ll7
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p7c.x(piaVar, j2, jkaVar, aoaVar, zjaVar, kbaVar, ou6Var, (dd4) obj, qu1.x0(i2 | 1));
                    return heb.a;
                }
            };
        }
    }

    public static final void y(final int i2, final nba nbaVar, final nca ncaVar, final xja xjaVar, final sw8 sw8Var, final lra lraVar, final jka jkaVar, final aoa aoaVar, final zja zjaVar, final kba kbaVar, final pj7 pj7Var, final ou6 ou6Var, final ib4 ib4Var, final kb4 kb4Var, final kb4 kb4Var2, dd4 dd4Var, final int i3, final int i4) {
        int i5;
        nba nbaVar2;
        nca ncaVar2;
        sw8 sw8Var2;
        int i6;
        int i7;
        ib4 ib4Var2;
        kb4 kb4Var3;
        nbaVar.getClass();
        ncaVar.getClass();
        xjaVar.getClass();
        lraVar.getClass();
        aoaVar.getClass();
        zjaVar.getClass();
        kbaVar.getClass();
        pj7Var.getClass();
        ib4Var.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var.h0(111700579);
        if ((i3 & 6) == 0) {
            i5 = (dd4Var.d(i2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            nbaVar2 = nbaVar;
            i5 |= dd4Var.f(nbaVar2) ? 32 : 16;
        } else {
            nbaVar2 = nbaVar;
        }
        if ((i3 & 384) == 0) {
            ncaVar2 = ncaVar;
            i5 |= dd4Var.f(ncaVar2) ? 256 : Token.CASE;
        } else {
            ncaVar2 = ncaVar;
        }
        if ((i3 & 24576) == 0) {
            sw8Var2 = sw8Var;
            i5 |= dd4Var.f(sw8Var2) ? 16384 : 8192;
        } else {
            sw8Var2 = sw8Var;
        }
        if ((i3 & 196608) == 0) {
            i5 |= dd4Var.f(lraVar) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= dd4Var.f(jkaVar) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= dd4Var.f(aoaVar) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= dd4Var.f(zjaVar) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= dd4Var.f(kbaVar) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (dd4Var.f(pj7Var) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 = i5;
            i6 |= dd4Var.f(ou6Var) ? 32 : 16;
        } else {
            i7 = i5;
        }
        if ((i4 & 384) == 0) {
            ib4Var2 = ib4Var;
            i6 |= dd4Var.h(ib4Var2) ? 256 : Token.CASE;
        } else {
            ib4Var2 = ib4Var;
        }
        if ((i4 & 3072) == 0) {
            kb4Var3 = kb4Var;
            i6 |= dd4Var.h(kb4Var3) ? 2048 : 1024;
        } else {
            kb4Var3 = kb4Var;
        }
        if ((i4 & 24576) == 0) {
            i6 |= dd4Var.h(kb4Var2) ? 16384 : 8192;
        }
        int i8 = i6;
        if (dd4Var.V(i7 & 1, ((i7 & 306782355) == 306782354 && (i8 & 9363) == 9362) ? false : true)) {
            WeakHashMap weakHashMap = pzb.w;
            final z85 z85VarR = jv3.r(ju7.i(dd4Var).b, dd4Var);
            final nba nbaVar3 = nbaVar2;
            final ib4 ib4Var3 = ib4Var2;
            final kb4 kb4Var4 = kb4Var3;
            final nca ncaVar3 = ncaVar2;
            final sw8 sw8Var3 = sw8Var2;
            sdc.e(ou6Var, null, jf0.G(-1018384583, new zb4() { // from class: dl7
                /* JADX WARN: Removed duplicated region for block: B:66:0x01e1  */
                @Override // defpackage.zb4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object c(java.lang.Object r28, java.lang.Object r29, java.lang.Object r30) {
                    /*
                        Method dump skipped, instruction units count: 534
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dl7.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, dd4Var), dd4Var, ((i8 >> 3) & 14) | 3072, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: el7
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(i3 | 1);
                    int iX02 = qu1.x0(i4);
                    p7c.y(i2, nbaVar, ncaVar, xjaVar, sw8Var, lraVar, jkaVar, aoaVar, zjaVar, kbaVar, pj7Var, ou6Var, ib4Var, kb4Var, kb4Var2, (dd4) obj, iX0, iX02);
                    return heb.a;
                }
            };
        }
    }

    public static final void z(List list, pj7 pj7Var, ou6 ou6Var, zb4 zb4Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        int i3;
        ou6 ou6Var2;
        dd4Var.h0(-1882412180);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.h(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            ou6Var2 = ou6Var;
            i3 |= dd4Var.f(ou6Var2) ? 256 : Token.CASE;
        } else {
            ou6Var2 = ou6Var;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(zb4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 16384 : 8192;
        }
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            boolean zF = dd4Var.f(list);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (zF || objQ == obj) {
                objQ = dk9.x(list);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            szb szbVarW = yib.w(yib.w(pj7Var, yib.e(dd4Var, 14)), gjb.q(0.0f, 0.0f, 0.0f, 80.0f, 7));
            int i4 = 3;
            st5 st5VarA = ut5.a(0, dd4Var, 0, 3);
            boolean zF2 = dd4Var.f(a07Var);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == obj) {
                objQ2 = new xs1(a07Var, null, i4);
                dd4Var.p0(objQ2);
            }
            pj8 pj8VarU0 = lx1.u0(st5VarA, szbVarW, (ac4) objQ2, dd4Var);
            szb szbVarW2 = yib.w(szbVarW, gjb.q(16.0f, 0.0f, 16.0f, 0.0f, 10));
            szb szbVarW3 = yib.w(szbVarW, gjb.q(0.0f, 0.0f, 4.0f, 0.0f, 11));
            mv mvVar = new mv(4.0f, true, new gp(5));
            boolean zF3 = ((i3 & 7168) == 2048) | dd4Var.f(a07Var) | dd4Var.f(pj8VarU0) | ((57344 & i3) == 16384);
            Object objQ3 = dd4Var.Q();
            if (zF3 || objQ3 == obj) {
                objQ3 = new w66(a07Var, pj8VarU0, zb4Var, kb4Var, 1);
                dd4Var.p0(objQ3);
            }
            gx1.h(ou6Var2, st5VarA, szbVarW2, mvVar, null, null, false, szbVarW3, 0L, 0L, 0.0f, (kb4) objQ3, dd4Var, ((i3 >> 6) & 14) | 24576, 0, 3816);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new x66(list, pj7Var, ou6Var, zb4Var, kb4Var, i2, 1);
        }
    }
}

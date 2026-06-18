package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class kl8 {
    public static p35 C;
    public static Context D;
    public static final rj1 f;
    public static final rj1 h;
    public static final rj1 k;
    public static final rj1 p;
    public static bn8 x;
    public static final ybb a = ybb.e;
    public static final rj1 b = new rj1(new wj1(), false, -1571120048);
    public static final rj1 c = new rj1(new uj1(8), false, -1455401925);
    public static final rj1 d = new rj1(new ak1(25), false, -816668539);
    public static final rj1 e = new rj1(new ak1(26), false, -373907730);
    public static final rj1 g = new rj1(new bk1(9), false, 1993895274);
    public static final rj1 i = new rj1(new hk1(1), false, -760157526);
    public static final rj1 j = new rj1(new hk1(2), false, -1577466387);
    public static final rj1 l = new rj1(new dk1(28), false, 110872357);
    public static final rj1 m = new rj1(new kk1(5), false, 459326741);
    public static final rj1 n = new rj1(new kk1(6), false, 1038120344);
    public static final rj1 o = new rj1(new jk1(9), false, 1283209244);
    public static final rj1 q = new rj1(new jk1(11), false, 747836242);
    public static final rj1 r = new rj1(new lk1(16), false, -744304928);
    public static final rj1 s = new rj1(new nk1(21), false, 1256945930);
    public static final rj1 t = new rj1(new nk1(22), false, -1557815517);
    public static final rj1 u = new rj1(new nk1(23), false, -1736522022);
    public static final rj1 v = new rj1(new nk1(24), false, 410044443);
    public static final yu7 w = new yu7((tu7) null, new iu7());
    public static final byte[] y = {112, 114, 111, 0};
    public static final byte[] z = {112, 114, 109, 0};
    public static final StackTraceElement[] A = new StackTraceElement[0];
    public static final char[] B = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        int i2 = 27;
        f = new rj1(new ak1(i2), false, -801177459);
        int i3 = 10;
        h = new rj1(new vj1(i3), false, -1637936104);
        k = new rj1(new dk1(i2), false, -991174287);
        p = new rj1(new jk1(i3), false, 631871696);
    }

    public static final void A(boolean z2, List list, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        kb4 kb4Var3;
        dd4Var.h0(-2131805929);
        int i3 = (dd4Var.g(z2) ? 4 : 2) | i2 | (dd4Var.h(list) ? 32 : 16);
        if ((i2 & 384) == 0) {
            kb4Var3 = kb4Var;
            i3 |= dd4Var.h(kb4Var3) ? 256 : Token.CASE;
        } else {
            kb4Var3 = kb4Var;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 2048 : 1024;
        }
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            z8.d(z2, kb4Var3, null, null, null, null, null, null, 0L, 0L, 0.0f, false, false, jf0.G(-1967003925, new xp5(14, list, kb4Var2), dd4Var), dd4Var, (i3 & 14) | ((i3 >> 3) & Token.ASSIGN_MOD), 8188);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new hn6(z2, list, kb4Var, kb4Var2, i2, 0);
        }
    }

    public static final void B(gl3 gl3Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-1747084704);
        int i3 = (dd4Var.h(gl3Var) ? 4 : 2) | i2 | (dd4Var.h(kb4Var) ? 32 : 16);
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            lu6 lu6Var = lu6.a;
            ou6 ou6VarL0 = s32.L0(dd4Var, lu6Var);
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
            int i4 = i3 & 14;
            int i5 = i3 & Token.ASSIGN_MOD;
            D(gl3Var, kb4Var, dd4Var, 8 | i4 | i5);
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            rj7 rj7VarO = gjb.o(2, 12.0f);
            mv mvVar = new mv(12.0f, true, new gp(5));
            boolean z2 = (i4 == 4 || dd4Var.h(gl3Var)) | (i5 == 32);
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new yk3(gl3Var, kb4Var, 3);
                dd4Var.p0(objQ);
            }
            rw1.k(ou6VarF, null, rj7VarO, false, mvVar, null, null, false, null, (kb4) objQ, dd4Var, 24966, 490);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xk3(gl3Var, kb4Var, i2, 5);
        }
    }

    public static final void C(ib4 ib4Var, dd4 dd4Var, int i2) {
        int i3;
        dd4Var.h0(-474664386);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.h(ib4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            kc5.n(i25.c((m53) f53.d0.getValue(), dd4Var, 0), wn9.K((pv9) mu9.Q.getValue(), dd4Var), false, null, null, null, null, null, ib4Var, dd4Var, (i3 << 24) & 234881024, 252);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new sz4(ib4Var, i2, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v29 */
    public static final void D(gl3 gl3Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        wk3 wk3Var;
        ou6 ou6Var;
        String str;
        ?? r0;
        Object obj;
        kb4 kb4Var2 = kb4Var;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-2068935481);
        int i3 = (dd4Var2.h(gl3Var) ? 4 : 2) | i2 | (dd4Var2.h(kb4Var2) ? 32 : 16);
        if (dd4Var2.V(i3 & 1, (i3 & 19) != 18)) {
            String str2 = gl3Var.b;
            String str3 = gl3Var.b;
            String str4 = gl3Var.c;
            wk3 wk3Var2 = gl3Var.e;
            if (str2.length() == 0 && str4.length() == 0 && wk3Var2 == null) {
                ye8 ye8VarU = dd4Var2.u();
                if (ye8VarU != null) {
                    ye8VarU.d = new xk3(gl3Var, kb4Var2, i2, 6);
                    return;
                }
                return;
            }
            ou6 ou6Var2 = lu6.a;
            ou6 ou6VarM0 = gjb.m0(tg9.f(ou6Var2, 1.0f), 16.0f, 4.0f);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarM0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, eq8VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            bp5 bp5VarG = ky0.g(dd4Var2, ou6VarL0, jmVar4, 1.0f, true);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, bp5VarG);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            if (str3.length() > 0) {
                dd4Var2.f0(1682711632);
                str = str4;
                r0 = 0;
                ou6Var = ou6Var2;
                wk3Var = wk3Var2;
                nha.c(str3, (ou6) null, 0L, (g60) null, 0L, (t74) null, a84.v, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.h, dd4Var, 1572864, 24960, 110526);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                wk3Var = wk3Var2;
                ou6Var = ou6Var2;
                str = str4;
                r0 = 0;
                dd4Var2.f0(1682987873);
                dd4Var2.q(false);
            }
            if (str.length() > 0) {
                dd4Var2.f0(1683062769);
                ur9 ur9Var = s96.a;
                dd4 dd4Var3 = dd4Var2;
                nha.c(str, (ou6) null, lc1.c(0.6f, ((q96) dd4Var2.j(ur9Var)).a.q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.l, dd4Var3, 0, 24960, 110586);
                dd4Var2 = dd4Var3;
                dd4Var2.q((boolean) r0);
            } else {
                dd4Var2.f0(1683368801);
                dd4Var2.q((boolean) r0);
            }
            dd4Var2.q(true);
            wk3 wk3Var3 = null;
            wk3 wk3Var4 = wk3Var;
            if (wk3Var4 != null && wk3Var4.a.equals("list")) {
                wk3Var3 = wk3Var4;
            }
            if (wk3Var3 != null) {
                dd4Var2.f0(517771592);
                String strK = wn9.K((pv9) mu9.k0.getValue(), dd4Var2);
                ur9 ur9Var2 = s96.a;
                uka ukaVar = ((q96) dd4Var2.j(ur9Var2)).b.m;
                long j2 = ((q96) dd4Var2.j(ur9Var2)).a.a;
                ou6 ou6VarW = t96.w(ou6Var, tp8.a);
                int i4 = ((i3 & Token.ASSIGN_MOD) == 32 ? 1 : r0) | (dd4Var2.h(wk3Var3) ? 1 : 0);
                Object objQ = dd4Var2.Q();
                if (i4 != 0 || objQ == vl1.a) {
                    al3 al3Var = new al3(r0, kb4Var, wk3Var3);
                    dd4Var2.p0(al3Var);
                    obj = al3Var;
                } else {
                    obj = objQ;
                }
                ou6 ou6VarM02 = gjb.m0(yn2.s(ou6VarW, (boolean) r0, 0.0f, (ib4) obj, 3), 12.0f, 6.0f);
                dd4 dd4Var4 = dd4Var2;
                kb4Var2 = kb4Var;
                nha.c(strK, ou6VarM02, j2, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var4, 0, 0, 131064);
                dd4Var2 = dd4Var4;
                dd4Var2.q((boolean) r0);
            } else {
                kb4Var2 = kb4Var;
                dd4Var2.f0(518164951);
                dd4Var2.q((boolean) r0);
            }
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU2 = dd4Var2.u();
        if (ye8VarU2 != null) {
            ye8VarU2.d = new xk3(gl3Var, kb4Var2, i2, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void E(defpackage.qsb r37, final defpackage.w1b r38, final defpackage.onb r39, java.lang.String r40, final double r41, final long r43, java.lang.Long r45, final boolean r46, final boolean r47, final defpackage.kb4 r48, final defpackage.kb4 r49, final defpackage.kb4 r50, defpackage.yb4 r51, defpackage.ib4 r52, final defpackage.kb4 r53, dd4 r54, final int r55) {
        /*
            Method dump skipped, instruction units count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl8.E(qsb, w1b, onb, java.lang.String, double, long, java.lang.Long, boolean, boolean, kb4, kb4, kb4, yb4, ib4, kb4, dd4, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F(final boolean r44, final defpackage.qsb r45, final defpackage.onb r46, final java.lang.String r47, final java.lang.String r48, final defpackage.urb r49, final defpackage.w1b r50, final boolean r51, final boolean r52, final boolean r53, final boolean r54, final boolean r55, final java.lang.Long r56, final boolean r57, final defpackage.kb4 r58, final defpackage.ib4 r59, final defpackage.ib4 r60, final defpackage.ib4 r61, final defpackage.ib4 r62, final defpackage.kb4 r63, final defpackage.kb4 r64, final defpackage.ib4 r65, final defpackage.ib4 r66, final defpackage.kb4 r67, final defpackage.kb4 r68, final defpackage.kb4 r69, final defpackage.kb4 r70, final defpackage.ib4 r71, final defpackage.yb4 r72, final defpackage.kb4 r73, final defpackage.kb4 r74, dd4 r75, final int r76) {
        /*
            Method dump skipped, instruction units count: 1075
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl8.F(boolean, qsb, onb, java.lang.String, java.lang.String, urb, w1b, boolean, boolean, boolean, boolean, boolean, java.lang.Long, boolean, kb4, ib4, ib4, ib4, ib4, kb4, kb4, ib4, ib4, kb4, kb4, kb4, kb4, ib4, yb4, kb4, kb4, dd4, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.List] */
    public static final void G(qsb qsbVar, w1b w1bVar, urb urbVar, onb onbVar, boolean z2, boolean z3, yb4 yb4Var, dd4 dd4Var, int i2) {
        jt1 jt1Var;
        boolean z4;
        long j2;
        a84 a84Var;
        gqb gqbVar;
        urb urbVar2 = urbVar;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-2087210126);
        int i3 = i2 | (dd4Var2.f(qsbVar) ? 4 : 2) | (dd4Var2.h(w1bVar) ? 32 : 16) | (dd4Var2.f(urbVar2) ? 256 : Token.CASE) | (dd4Var2.f(onbVar) ? 2048 : 1024) | (dd4Var2.g(z2) ? 16384 : 8192) | (dd4Var2.g(z3) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.h(yb4Var) ? 1048576 : 524288);
        if (dd4Var2.V(i3 & 1, (599187 & i3) != 599186)) {
            px3 px3Var = tg9.c;
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, px3Var);
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
            if (w1bVar != null) {
                dd4Var2.f0(-2044651301);
                int iOrdinal = w1bVar.a.ordinal();
                Object obj = vl1.a;
                if (iOrdinal == 0) {
                    dd4Var2.f0(-1893591488);
                    Context applicationContext = ((Context) dd4Var2.j(he.b)).getApplicationContext();
                    nk3 nk3VarN0 = wx1.n0(dd4Var2);
                    Object objQ = dd4Var2.Q();
                    if (objQ == obj) {
                        objQ = gr9.a(new na5(0L));
                        dd4Var2.p0(objQ);
                    }
                    b07 b07Var = (b07) objQ;
                    boolean zH = dd4Var2.h(nk3VarN0) | dd4Var2.h(b07Var);
                    Object objQ2 = dd4Var2.Q();
                    if (zH || objQ2 == obj) {
                        objQ2 = new sbb(3, nk3VarN0, b07Var);
                        dd4Var2.p0(objQ2);
                    }
                    lc5.j(nk3VarN0, (kb4) objQ2, dd4Var2);
                    boolean zF = dd4Var2.f(nk3VarN0);
                    Object objQ3 = dd4Var2.Q();
                    if (zF || objQ3 == obj) {
                        objQ3 = new kqb(nk3VarN0, b07Var, applicationContext);
                        dd4Var2.p0(objQ3);
                    }
                    kqb kqbVar = (kqb) objQ3;
                    nk3 nk3VarN02 = wx1.n0(dd4Var2);
                    boolean zF2 = dd4Var2.f(nk3VarN02);
                    Object objQ4 = dd4Var2.Q();
                    if (zF2 || objQ4 == obj) {
                        objQ4 = new t10(nk3VarN02);
                        dd4Var2.p0(objQ4);
                    }
                    t10 t10Var = (t10) objQ4;
                    boolean zF3 = dd4Var2.f(kqbVar) | dd4Var2.f(t10Var);
                    Object objQ5 = dd4Var2.Q();
                    if (zF3 || objQ5 == obj) {
                        objQ5 = new o27(kqbVar, t10Var);
                        dd4Var2.p0(objQ5);
                    }
                    gqbVar = (o27) objQ5;
                    dd4Var2.q(false);
                } else {
                    if (iOrdinal != 1) {
                        throw j39.e(-1893592719, dd4Var2, false);
                    }
                    dd4Var2.f0(-1893589439);
                    fxb fxbVarJ = wn9.J(null, dd4Var2, 1);
                    boolean zF4 = dd4Var2.f(fxbVarJ);
                    Object objQ6 = dd4Var2.Q();
                    if (zF4 || objQ6 == obj) {
                        objQ6 = new jxb(fxbVarJ);
                        dd4Var2.p0(objQ6);
                    }
                    gqbVar = (jxb) objQ6;
                    dd4Var2.q(false);
                }
                int i4 = i3 & 14;
                boolean zF5 = dd4Var2.f(gqbVar) | (i4 == 4);
                Object objQ7 = dd4Var2.Q();
                if (zF5 || objQ7 == obj) {
                    objQ7 = new pg(qsbVar, gqbVar, null, 29);
                    dd4Var2.p0(objQ7);
                }
                lc5.u((yb4) objQ7, dd4Var2, gqbVar);
                boolean z5 = ((i3 & Token.ASSIGN_MOD) == 32 || dd4Var2.h(w1bVar)) | (i4 == 4);
                Object objQ8 = dd4Var2.Q();
                if (z5 || objQ8 == obj) {
                    objQ8 = new y46(qsbVar, w1bVar, null, 27);
                    dd4Var2.p0(objQ8);
                }
                lc5.v(w1bVar, gqbVar, (yb4) objQ8, dd4Var2);
                Integer numValueOf = Integer.valueOf(urbVar2.h);
                List list = urbVar2.g;
                boolean z6 = (i4 == 4) | ((i3 & 896) == 256);
                Object objQ9 = dd4Var2.Q();
                if (z6 || objQ9 == obj) {
                    jt1Var = null;
                    objQ9 = new y46(urbVar2, qsbVar, jt1Var, 28);
                    dd4Var2.p0(objQ9);
                } else {
                    jt1Var = null;
                }
                lc5.w(gqbVar, numValueOf, list, (yb4) objQ9, dd4Var2);
                boolean zF6 = ((i3 & 3670016) == 1048576) | (i4 == 4) | dd4Var2.f(gqbVar);
                Object objQ10 = dd4Var2.Q();
                if (zF6 || objQ10 == obj) {
                    objQ10 = new fb3(24, qsbVar, yb4Var, gqbVar);
                    dd4Var2.p0(objQ10);
                }
                lc5.j(gqbVar, (kb4) objQ10, dd4Var2);
                zib.c(gqbVar, px3Var, dd4Var2, 48);
                z4 = false;
                dd4Var2.q(false);
            } else {
                jt1Var = null;
                z4 = false;
                dd4Var2.f0(-2043160790);
                dd4Var2.q(false);
            }
            a07 a07VarB = bx1.B(qsbVar.g, dd4Var2);
            a07 a07VarB2 = bx1.B(qsbVar.i, dd4Var2);
            wrb wrbVar = (wrb) fc1.A0(urbVar2.j, urbVar2.i);
            Object obj2 = wrbVar != null ? wrbVar.d : jt1Var;
            if (obj2 == null) {
                obj2 = lc3.a;
            }
            long j3 = onbVar.c == 0 ? ((na5) a07VarB2.getValue()).a : 0L;
            long jLongValue = ((Number) a07VarB.getValue()).longValue();
            long j4 = j3;
            ?? r8 = obj2;
            boolean z7 = onbVar.g;
            boolean z8 = z4;
            float f2 = onbVar.h;
            float f3 = onbVar.i;
            long j5 = onbVar.j;
            long j6 = onbVar.k;
            int i5 = onbVar.l;
            if (i5 != 0) {
                j2 = j5;
                a84Var = i5 != 2 ? a84.u : a84.w;
            } else {
                j2 = j5;
                a84Var = a84.t;
            }
            float f4 = onbVar.m;
            zn0 zn0Var = zn0.a;
            ri9.b((List) r8, jLongValue, z7, f2, f3, zn0Var.b(), j4, j2, j6, a84Var, f4, dd4Var, 0);
            dd4Var2 = dd4Var;
            if (z2 || z3) {
                urbVar2 = urbVar;
                if (!urbVar2.b) {
                    dd4Var2.f0(-2041478048);
                    l16.a(0.0f, 0, 3, 0L, dd4Var2, zn0Var.a(tg9.n(lu6.a, 54.0f), bv4.f));
                    dd4Var2.q(z8);
                }
                dd4Var2.q(true);
            } else {
                urbVar2 = urbVar;
            }
            dd4Var2.f0(-2041314678);
            dd4Var2.q(z8);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new jn6(qsbVar, w1bVar, urbVar2, onbVar, z2, z3, yb4Var, i2);
        }
    }

    public static final void H(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, String str, boolean z2) {
        dd4 dd4Var2;
        String strK;
        dd4Var.h0(406196027);
        int i3 = i2 | (dd4Var.f(str) ? 4 : 2) | (dd4Var.h(ib4Var) ? 32 : 16) | (dd4Var.f(ou6Var) ? 256 : Token.CASE);
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var, 54);
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
            if (str == null) {
                dd4Var.f0(1598460023);
                dd4Var.q(false);
                strK = null;
            } else {
                dd4Var.f0(1598460024);
                strK = bw9.a0(str) ? wn9.K((pv9) eu9.G.getValue(), dd4Var) : str;
                dd4Var.q(false);
            }
            if (strK == null) {
                dd4Var.f0(-502623650);
                strK = wn9.K((pv9) eu9.G.getValue(), dd4Var);
            } else {
                dd4Var.f0(-502626471);
            }
            dd4Var.q(false);
            nha.c(strK, (ou6) null, 0L, (g60) null, wn9.x(20), (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(s96.a)).b.j, dd4Var, 24576, 0, 130030);
            dd4Var2 = dd4Var;
            if (z2) {
                dd4Var2.f0(1598745410);
                un9.a(dd4Var2, tg9.h(lu6.a, 16.0f));
                C(ib4Var, dd4Var2, (i3 >> 3) & 14);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(1598852081);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new o02(str, ib4Var, ou6Var, z2, i2);
        }
    }

    public static final void I(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var) {
        dd4Var.h0(-1491458567);
        int i3 = (dd4Var.h(ib4Var) ? 4 : 2) | i2;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var, 54);
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
            un9.a(dd4Var, tg9.h(lu6Var, 96.0f));
            un9.a(dd4Var, tg9.h(lu6Var, 28.0f));
            un9.a(dd4Var, tg9.h(lu6Var, 16.0f));
            C(ib4Var, dd4Var, i3 & 14);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new rz0(ib4Var, ou6Var, i2);
        }
    }

    public static final void J(String str, t27 t27Var, ou6 ou6Var, dd4 dd4Var, int i2) {
        int i3;
        dd4 dd4Var2;
        a07 a07Var;
        a07 a07Var2;
        br9 br9Var;
        cx5 cx5Var;
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(1151300524);
        int i4 = 2;
        int i5 = 4;
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(t27Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        int i6 = 1;
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            boolean z2 = (i3 & 14) == 4;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = new ho4(str, 14);
                dd4Var.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ry6 ry6VarD = pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b;
            ev8 ev8VarA = ek5.a(dd4Var);
            a91 a91VarA = ug8.a(h49.class);
            h49 h49Var = (h49) ((qtb) qx1.N(a91VarA, pj4VarA.f(), dx1.h(a91VarA.f(), "-", str), ry6VarD, ev8VarA, ib4Var));
            boolean zF = dd4Var.f(h49Var);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new j49(h49Var, i6);
                dd4Var.p0(objQ2);
            }
            lx1.g(h49Var, null, (kb4) objQ2, dd4Var, 0);
            a07 a07VarB = bx1.B(h49Var.H, dd4Var);
            br9 br9VarB = bx1.B(h49Var.I, dd4Var);
            a07 a07VarB2 = bx1.B(h49Var.J, dd4Var);
            a07 a07VarB3 = bx1.B(h49Var.K, dd4Var);
            a07 a07VarB4 = bx1.B(h49Var.L, dd4Var);
            Object[] objArr = new Object[0];
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj) {
                objQ3 = new wo8(29);
                dd4Var.p0(objQ3);
            }
            a07 a07Var3 = (a07) ww1.b0(objArr, (ib4) objQ3, dd4Var, 48);
            Object[] objArr2 = new Object[0];
            Object objQ4 = dd4Var.Q();
            if (objQ4 == obj) {
                objQ4 = new l49(i6);
                dd4Var.p0(objQ4);
            }
            a07 a07Var4 = (a07) ww1.b0(objArr2, (ib4) objQ4, dd4Var, 48);
            Object[] objArr3 = new Object[0];
            Object objQ5 = dd4Var.Q();
            if (objQ5 == obj) {
                objQ5 = new l49(i4);
                dd4Var.p0(objQ5);
            }
            a07 a07Var5 = (a07) ww1.b0(objArr3, (ib4) objQ5, dd4Var, 48);
            Object[] objArr4 = new Object[0];
            Object objQ6 = dd4Var.Q();
            if (objQ6 == obj) {
                objQ6 = new l49(3);
                dd4Var.p0(objQ6);
            }
            a07 a07Var6 = (a07) ww1.b0(objArr4, (ib4) objQ6, dd4Var, 48);
            Object[] objArr5 = new Object[0];
            Object objQ7 = dd4Var.Q();
            if (objQ7 == obj) {
                objQ7 = new l49(i5);
                dd4Var.p0(objQ7);
            }
            a07 a07Var7 = (a07) ww1.b0(objArr5, (ib4) objQ7, dd4Var, 48);
            eyb eybVarH = oh9.h(dd4Var);
            boolean zF2 = dd4Var.f(eybVarH);
            Object objQ8 = dd4Var.Q();
            if (zF2 || objQ8 == obj) {
                objQ8 = dk9.n(new o39(eybVarH, 2));
                dd4Var.p0(objQ8);
            }
            br9 br9Var2 = (br9) objQ8;
            m6a m6aVar = (m6a) dd4Var.j(b73.b);
            Boolean bool = (Boolean) a07Var5.getValue();
            bool.getClass();
            Boolean bool2 = (Boolean) a07Var6.getValue();
            bool2.getClass();
            Boolean bool3 = (Boolean) a07Var7.getValue();
            bool3.getClass();
            boolean zF3 = dd4Var.f(a07Var5) | dd4Var.f(a07Var6) | dd4Var.f(a07Var7) | dd4Var.f(m6aVar);
            Object objQ9 = dd4Var.Q();
            if (zF3 || objQ9 == obj) {
                a07Var = a07Var5;
                a07Var2 = a07Var6;
                objQ9 = new hl(m6aVar, a07Var, a07Var2, a07Var7, null, 6);
                dd4Var.p0(objQ9);
            } else {
                a07Var = a07Var5;
                a07Var2 = a07Var6;
            }
            lc5.w(bool, bool2, bool3, (yb4) objQ9, dd4Var);
            fx1.p(((onb) a07VarB.getValue()).b, ((onb) a07VarB.getValue()).s, ((onb) a07VarB.getValue()).t, ((onb) a07VarB.getValue()).u, dd4Var, 0);
            dd4Var2 = dd4Var;
            m8 m8Var = (m8) dd4Var2.j(a9.a);
            lva lvaVar = (lva) dd4Var2.j(nva.a);
            pp1 pp1Var = h49Var.G;
            boolean zF4 = dd4Var2.f(lvaVar) | dd4Var2.f(m8Var) | dd4Var2.f(br9VarB);
            Object objQ10 = dd4Var2.Q();
            if (zF4 || objQ10 == obj) {
                br9Var = br9VarB;
                dk0 dk0Var = new dk0(lvaVar, m8Var, br9Var, (jt1) null, 4);
                cx5Var = null;
                dd4Var2.p0(dk0Var);
                objQ10 = dk0Var;
            } else {
                br9Var = br9VarB;
                cx5Var = null;
            }
            wx1.e(pp1Var, cx5Var, (zb4) objQ10, dd4Var2, 0);
            yib.i((onb) a07VarB.getValue(), jf0.G(960594576, new yl3(ou6Var, h49Var, a07Var3, a07Var4, a07Var, a07Var2, a07Var7, t27Var, a07VarB4, a07VarB2, a07VarB, br9Var2, br9Var, a07VarB3), dd4Var2), dd4Var2, 48);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fv0(str, t27Var, ou6Var, i2, 9);
        }
    }

    public static final void K(List list, pj7 pj7Var, ou6 ou6Var, ac4 ac4Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        int i3;
        dd4Var.h0(-986341378);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.h(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(ac4Var) ? 2048 : 1024;
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
            boolean zF3 = dd4Var.f(a07Var) | dd4Var.f(pj8VarU0) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384);
            Object objQ3 = dd4Var.Q();
            if (zF3 || objQ3 == obj) {
                um umVar = new um(a07Var, pj8VarU0, (ub4) ac4Var, kb4Var, 29);
                dd4Var.p0(umVar);
                objQ3 = umVar;
            }
            gx1.h(ou6Var, st5VarA, szbVarW2, mvVar, null, null, false, szbVarW3, 0L, 0L, 0.0f, (kb4) objQ3, dd4Var, ((i3 >> 6) & 14) | 24576, 0, 3816);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new l41((Object) list, (Object) pj7Var, ou6Var, (ub4) ac4Var, kb4Var, i2, 14);
        }
    }

    public static final void L(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var) {
        ou6 ou6Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-58720256);
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
            nha.c(wn9.K((pv9) zu9.L.getValue(), dd4Var2), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.f, dd4Var2, 0, 0, 130046);
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
            ye8VarU.d = new rz0(ou6Var2, ib4Var, i2, 14);
        }
    }

    public static final void M(t27 t27Var, dd4 dd4Var, int i2) {
        t27Var.getClass();
        dd4Var.h0(1383915280);
        int i3 = 4;
        int i4 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        if (dd4Var.V(i4 & 1, (i4 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            yva yvaVar = (yva) ((qtb) qx1.N(ug8.a(yva.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(yvaVar.d, dd4Var);
            Object[] objArr = new Object[0];
            rt8 rt8Var = t83.g;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new uj6(i3);
                dd4Var.p0(objQ);
            }
            t83 t83Var = (t83) ww1.d0(objArr, rt8Var, (ib4) objQ, dd4Var, 384);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new nda(19);
                dd4Var.p0(objQ2);
            }
            a07 a07Var = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var, 48);
            Object objQ3 = dd4Var.Q();
            jt1 jt1Var = null;
            if (objQ3 == obj) {
                objQ3 = dk9.x((Object) null);
                dd4Var.p0(objQ3);
            }
            a07 a07Var2 = (a07) objQ3;
            ms7 ms7Var = new ms7(gc1.Y("json"));
            Object objQ4 = dd4Var.Q();
            int i5 = 26;
            if (objQ4 == obj) {
                objQ4 = new qda(a07Var2, i5);
                dd4Var.p0(objQ4);
            }
            aw3 aw3VarC0 = e11.c0(ms7Var, (kb4) objQ4, dd4Var, 56);
            lva lvaVar = (lva) dd4Var.j(nva.a);
            pp1 pp1Var = yvaVar.e;
            boolean zF = dd4Var.f(lvaVar);
            Object objQ5 = dd4Var.Q();
            if (zF || objQ5 == obj) {
                objQ5 = new xa(lvaVar, jt1Var, i5);
                dd4Var.p0(objQ5);
            }
            wx1.e(pp1Var, null, (zb4) objQ5, dd4Var, 0);
            gx1.p(wn9.K((pv9) ru9.k0.getValue(), dd4Var), tg9.c, false, jf0.G(-1083659636, new oe9(t27Var, 21), dd4Var), jf0.G(1007625589, new pda(3, (Object) a07Var, (Object) yvaVar, (Object) aw3VarC0), dd4Var), jf0.G(1672254682, new ak0(20, t83Var, yvaVar, a07VarB), dd4Var), dd4Var, 224304, 4);
            boolean zF2 = dd4Var.f(yvaVar);
            Object objQ6 = dd4Var.Q();
            if (zF2 || objQ6 == obj) {
                objQ6 = new eh(yvaVar, 8);
                dd4Var.p0(objQ6);
            }
            tu1.g(t83Var, (ac4) objQ6, dd4Var, 0);
            boolean z2 = ((bi5) a07Var2.getValue()) != null;
            bi5 bi5Var = (bi5) a07Var2.getValue();
            String name = bi5Var != null ? bi5Var.getName() : null;
            if (name == null) {
                name = "";
            }
            String str = name;
            Object objQ7 = dd4Var.Q();
            if (objQ7 == obj) {
                objQ7 = new qda(a07Var2, 27);
                dd4Var.p0(objQ7);
            }
            kb4 kb4Var = (kb4) objQ7;
            boolean zF3 = dd4Var.f(yvaVar);
            Object objQ8 = dd4Var.Q();
            if (zF3 || objQ8 == obj) {
                objQ8 = new k49(a07Var2, yvaVar, 23);
                dd4Var.p0(objQ8);
            }
            ex1.f(z2, str, null, kb4Var, (kb4) objQ8, dd4Var, 3072);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new oe9(i2, 22, t27Var);
        }
    }

    public static final float N(long j2, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final void O(ut0 ut0Var) {
        ut0Var.getClass();
        ut0Var.a(new IOException("Channel was cancelled"));
    }

    public static final void P(h11 h11Var, Throwable th) {
        CancellationException cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationExceptionA == null) {
            cancellationExceptionA = e11.a("Channel was consumed, consumer had failed", th);
        }
        h11Var.cancel(cancellationExceptionA);
    }

    public static final void Q(long j2, long j3, long j4) {
        if (j3 < 0 || j4 > j2) {
            StringBuilder sbO = j39.o(j3, "startIndex (", ") and endIndex (");
            sbO.append(j4);
            k27.m(dx1.l(sbO, ") are not within the range [0..size(", j2, "))"));
        } else {
            if (j3 <= j4) {
                return;
            }
            gp.l(dx1.j(j39.o(j3, "startIndex (", ") > endIndex ("), j4, ')'));
        }
    }

    public static final void R(long j2, long j3) {
        if (0 > j2 || j2 < j3 || j3 < 0) {
            gp.l(xv5.n(j2, "))", j39.o(j3, "offset (0) and byteCount (", ") are not within the range [0..size(")));
        }
    }

    public static final void S(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                i12.r(th, th2);
            }
        }
    }

    public static byte[] T(or2[] or2VarArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int length = 0;
        for (or2 or2Var : or2VarArr) {
            length += ((((or2Var.g * 2) + 7) & (-8)) / 8) + (or2Var.e * 2) + V(or2Var.a, or2Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + or2Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, m79.z)) {
            int length2 = or2VarArr.length;
            while (i2 < length2) {
                or2 or2Var2 = or2VarArr[i2];
                m0(byteArrayOutputStream, or2Var2, V(or2Var2.a, or2Var2.b, bArr));
                l0(byteArrayOutputStream, or2Var2);
                i2++;
            }
        } else {
            for (or2 or2Var3 : or2VarArr) {
                m0(byteArrayOutputStream, or2Var3, V(or2Var3.a, or2Var3.b, bArr));
            }
            int length3 = or2VarArr.length;
            while (i2 < length3) {
                l0(byteArrayOutputStream, or2VarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static final void U(aq5 aq5Var, gl3 gl3Var, rj1 rj1Var) {
        aq5.b0(aq5Var, gl3Var.a, new se3(7), new rj1(new lv8(rj1Var, 2), true, 1440031063), 4);
        h0(aq5Var, gl3Var);
    }

    public static String V(String str, String str2, byte[] bArr) {
        byte[] bArr2 = m79.A;
        byte[] bArr3 = m79.B;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return ky0.s((Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2, sb);
            }
        }
        return str2;
    }

    public static final ou6 W(ou6 ou6Var, kb4 kb4Var) {
        return ou6Var.e(new hh0(kb4Var));
    }

    public static ou6 X(ou6 ou6Var, float f2, float f3, float f4, float f5, float f6, t89 t89Var, boolean z2, int i2) {
        float f7 = (i2 & 1) != 0 ? 1.0f : f2;
        float f8 = (i2 & 2) != 0 ? 1.0f : f3;
        float f9 = (i2 & 4) != 0 ? 1.0f : f4;
        float f10 = (i2 & 32) != 0 ? 0.0f : f5;
        float f11 = (i2 & 256) != 0 ? 0.0f : f6;
        long j2 = b3b.b;
        t89 t89Var2 = (i2 & 2048) != 0 ? jf0.G : t89Var;
        boolean z3 = (i2 & 4096) != 0 ? false : z2;
        long j3 = nh4.a;
        return ou6Var.e(new kh4(f7, f8, f9, f10, f11, j2, t89Var2, z3, j3, j3));
    }

    public static final int Y(ew ewVar, Object obj, int i2) {
        int i3 = ewVar.c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iS = jv3.s(ewVar.a, i3, i2);
            if (iS < 0 || lc5.Q(obj, ewVar.b[iS])) {
                return iS;
            }
            int i4 = iS + 1;
            while (i4 < i3 && ewVar.a[i4] == i2) {
                if (lc5.Q(obj, ewVar.b[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iS - 1; i5 >= 0 && ewVar.a[i5] == i2; i5--) {
                if (lc5.Q(obj, ewVar.b[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            gp.d();
            return 0;
        }
    }

    public static final ou6 Z(ou6 ou6Var, zb4 zb4Var) {
        return ou6Var.e(new an5(zb4Var));
    }

    public static final void a(boolean z2, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, dd4 dd4Var, int i2) {
        dd4Var.h0(268484140);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.h(ib4Var) ? 32 : 16) | (dd4Var.h(ib4Var2) ? 256 : Token.CASE) | (dd4Var.h(ib4Var3) ? 2048 : 1024) | (dd4Var.h(ib4Var4) ? 16384 : 8192);
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            gx1.a(z2, null, 0L, null, 0.0f, new rj7(12.0f, 12.0f, 12.0f, 12.0f), ib4Var, jf0.G(-213936736, new sp2(ib4Var3, ib4Var2, ib4Var4, 8), dd4Var), dd4Var, (i3 & 14) | 12779520 | ((i3 << 15) & 3670016), 30);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tp2(z2, ib4Var, ib4Var2, ib4Var3, ib4Var4, i2, 5);
        }
    }

    public static final ou6 a0(ou6 ou6Var, kb4 kb4Var) {
        return ou6Var.e(new xe7(kb4Var));
    }

    public static ra0 b(int i2, ib4 ib4Var, boolean z2) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return new ra0((i2 & 2) != 0 ? 0 : Integer.MIN_VALUE, ib4Var, z2);
    }

    public static int[] b0(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iF0 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iF0 += (int) ex1.f0(byteArrayInputStream, 2);
            iArr[i3] = iF0;
        }
        return iArr;
    }

    public static final void c(gl3 gl3Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        ye8 ye8VarU;
        xk3 xk3Var;
        dd4Var.h0(-86762098);
        int i3 = (dd4Var.h(gl3Var) ? 4 : 2) | i2 | (dd4Var.h(kb4Var) ? 32 : 16);
        int i4 = 0;
        if (!dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            dd4Var.Y();
        } else {
            if (gl3Var.f.isEmpty()) {
                ye8VarU = dd4Var.u();
                if (ye8VarU != null) {
                    xk3Var = new xk3(gl3Var, kb4Var, i2, i);
                    ye8VarU.d = xk3Var;
                }
                return;
            }
            ou6 ou6VarF = tg9.f(lu6.a, 1.0f);
            rj7 rj7VarO = gjb.o(2, 12.0f);
            mv mvVar = new mv(8.0f, true, new gp(5));
            int i5 = (((i3 & 14) == 4 || dd4Var.h(gl3Var)) ? 1 : 0) | ((i3 & Token.ASSIGN_MOD) != 32 ? 0 : 1);
            Object objQ = dd4Var.Q();
            if (i5 != 0 || objQ == vl1.a) {
                objQ = new yk3(gl3Var, kb4Var, i4);
                dd4Var.p0(objQ);
            }
            rw1.k(ou6VarF, null, rj7VarO, false, mvVar, null, null, false, null, (kb4) objQ, dd4Var, 24966, 490);
        }
        ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            xk3Var = new xk3(gl3Var, kb4Var, i2, 2);
            ye8VarU.d = xk3Var;
        }
    }

    public static or2[] c0(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, or2[] or2VarArr) throws IOException {
        byte[] bArr3 = m79.C;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, m79.D)) {
                gp.j("Unsupported meta version");
                return null;
            }
            int iF0 = (int) ex1.f0(fileInputStream, 2);
            byte[] bArrE0 = ex1.e0(fileInputStream, (int) ex1.f0(fileInputStream, 4), (int) ex1.f0(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                gp.j("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE0);
            try {
                or2[] or2VarArrE0 = e0(byteArrayInputStream, bArr2, iF0, or2VarArr);
                byteArrayInputStream.close();
                return or2VarArrE0;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(m79.x, bArr2)) {
            gp.j("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            gp.j("Unsupported meta version");
            return null;
        }
        int iF02 = (int) ex1.f0(fileInputStream, 1);
        byte[] bArrE02 = ex1.e0(fileInputStream, (int) ex1.f0(fileInputStream, 4), (int) ex1.f0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            gp.j("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrE02);
        try {
            or2[] or2VarArrD0 = d0(byteArrayInputStream2, iF02, or2VarArr);
            byteArrayInputStream2.close();
            return or2VarArrD0;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static final void d(String str, t27 t27Var, dd4 dd4Var, int i2) {
        int i3;
        br9 br9Var;
        cx5 cx5Var;
        dd4 dd4Var2 = dd4Var;
        str.getClass();
        t27Var.getClass();
        dd4Var2.h0(288042038);
        int i4 = 2;
        int i5 = 4;
        int i6 = (dd4Var2.f(str) ? 4 : 2) | i2 | (dd4Var2.f(t27Var) ? 32 : 16);
        int i7 = 1;
        int i8 = 0;
        if (dd4Var2.V(i6 & 1, (i6 & 19) != 18)) {
            boolean z2 = (i6 & 14) == 4;
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = new wj0(str, i8);
                dd4Var2.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            pj4 pj4VarA = e36.a(dd4Var2);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            rk0 rk0Var = (rk0) ((qtb) qx1.N(ug8.a(rk0.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var2), ib4Var));
            a07 a07VarB = bx1.B(rk0Var.v, dd4Var2);
            Object[] objArr = new Object[0];
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == obj) {
                objQ2 = new ag0(i7);
                dd4Var2.p0(objQ2);
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ2, dd4Var2, 48);
            Object[] objArr2 = new Object[0];
            Object objQ3 = dd4Var2.Q();
            if (objQ3 == obj) {
                objQ3 = new ag0(i4);
                dd4Var2.p0(objQ3);
            }
            a07 a07Var2 = (a07) ww1.b0(objArr2, (ib4) objQ3, dd4Var2, 48);
            Object[] objArr3 = new Object[0];
            Object objQ4 = dd4Var2.Q();
            int i9 = 3;
            if (objQ4 == obj) {
                objQ4 = new ag0(i9);
                dd4Var2.p0(objQ4);
            }
            br9 br9Var2 = (a07) ww1.b0(objArr3, (ib4) objQ4, dd4Var2, 48);
            Object[] objArr4 = new Object[0];
            Object objQ5 = dd4Var2.Q();
            if (objQ5 == obj) {
                objQ5 = new ag0(i5);
                dd4Var2.p0(objQ5);
            }
            m8 m8Var = (m8) dd4Var2.j(a9.a);
            lva lvaVar = (lva) dd4Var2.j(nva.a);
            pp1 pp1Var = rk0Var.x;
            boolean zF = dd4Var2.f(m8Var) | dd4Var2.f(lvaVar) | dd4Var2.f(br9Var2);
            Object objQ6 = dd4Var2.Q();
            jt1 jt1Var = null;
            if (zF || objQ6 == obj) {
                objQ6 = new dk0(m8Var, lvaVar, br9Var2, jt1Var, 0);
                br9Var = br9Var2;
                cx5Var = null;
                dd4Var2.p0(objQ6);
            } else {
                br9Var = br9Var2;
                cx5Var = null;
            }
            int i10 = 0;
            wx1.e(pp1Var, cx5Var, (zb4) objQ6, dd4Var2, 0);
            gx1.p(((jk0) a07VarB.getValue()).b, null, false, jf0.G(-1931047878, new q41(t27Var, 3), dd4Var2), jf0.G(1103185777, new zj0(a07Var, a07Var2, i10), dd4Var2), jf0.G(-1815455316, new ak0(i10, rk0Var, br9Var, a07VarB), dd4Var2), dd4Var, 224256, 6);
            dd4Var2 = dd4Var;
            a07 a07VarB2 = bx1.B(rk0Var.w, dd4Var2);
            boolean zBooleanValue = ((Boolean) br9Var.getValue()).booleanValue();
            kk0 kk0Var = (kk0) a07VarB2.getValue();
            boolean zF2 = dd4Var2.f(br9Var);
            Object objQ7 = dd4Var2.Q();
            if (zF2 || objQ7 == obj) {
                objQ7 = new x6(br9Var, 9);
                dd4Var2.p0(objQ7);
            }
            kb4 kb4Var = (kb4) objQ7;
            boolean zF3 = dd4Var2.f(rk0Var);
            Object objQ8 = dd4Var2.Q();
            if (zF3 || objQ8 == obj) {
                objQ8 = new sj0(rk0Var, 3);
                dd4Var2.p0(objQ8);
            }
            kb4 kb4Var2 = (kb4) objQ8;
            boolean zF4 = dd4Var2.f(br9Var) | ((i6 & Token.ASSIGN_MOD) == 32);
            Object objQ9 = dd4Var2.Q();
            if (zF4 || objQ9 == obj) {
                objQ9 = new xj0(t27Var, br9Var, 0);
                dd4Var2.p0(objQ9);
            }
            yn2.g(zBooleanValue, kk0Var, kb4Var, kb4Var2, (ib4) objQ9, dd4Var2, 64);
            boolean zBooleanValue2 = ((Boolean) a07Var.getValue()).booleanValue();
            String str2 = ((jk0) a07VarB.getValue()).b;
            String strK = wn9.K((pv9) mu9.c0.getValue(), dd4Var2);
            boolean zF5 = dd4Var2.f(a07Var);
            Object objQ10 = dd4Var2.Q();
            if (zF5 || objQ10 == obj) {
                objQ10 = new x6(a07Var, 7);
                dd4Var2.p0(objQ10);
            }
            kb4 kb4Var3 = (kb4) objQ10;
            boolean zF6 = dd4Var2.f(a07Var) | dd4Var2.f(rk0Var);
            Object objQ11 = dd4Var2.Q();
            if (zF6 || objQ11 == obj) {
                objQ11 = new v(10, rk0Var, a07Var);
                dd4Var2.p0(objQ11);
            }
            wx1.p(zBooleanValue2, str2, strK, kb4Var3, (kb4) objQ11, dd4Var2, 0);
            boolean zBooleanValue3 = ((Boolean) a07Var2.getValue()).booleanValue();
            boolean zF7 = dd4Var2.f(a07Var2);
            Object objQ12 = dd4Var2.Q();
            if (zF7 || objQ12 == obj) {
                objQ12 = new x6(a07Var2, 8);
                dd4Var2.p0(objQ12);
            }
            kb4 kb4Var4 = (kb4) objQ12;
            boolean zF8 = dd4Var2.f(rk0Var);
            Object objQ13 = dd4Var2.Q();
            if (zF8 || objQ13 == obj) {
                objQ13 = new sj0(rk0Var, 1);
                dd4Var2.p0(objQ13);
            }
            i3 = 0;
            bx1.f(zBooleanValue3, kb4Var4, (kb4) objQ13, dd4Var2, 0);
        } else {
            i3 = 0;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yj0(str, t27Var, i2, i3);
        }
    }

    public static or2[] d0(ByteArrayInputStream byteArrayInputStream, int i2, or2[] or2VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new or2[0];
        }
        if (i2 != or2VarArr.length) {
            gp.j("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iF0 = (int) ex1.f0(byteArrayInputStream, 2);
            iArr[i3] = (int) ex1.f0(byteArrayInputStream, 2);
            strArr[i3] = new String(ex1.d0(byteArrayInputStream, iF0), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            or2 or2Var = or2VarArr[i4];
            if (!or2Var.b.equals(strArr[i4])) {
                gp.j("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            or2Var.e = i5;
            or2Var.h = b0(byteArrayInputStream, i5);
        }
        return or2VarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x038c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0832  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.t61 r52, st5 r53, final boolean r54, final java.lang.String r55, final java.lang.String r56, final boolean r57, pj7 r58, final ou6 r59, final defpackage.ib4 r60, final defpackage.kb4 r61, final defpackage.ib4 r62, final defpackage.ib4 r63, final defpackage.yb4 r64, final defpackage.kb4 r65, defpackage.ib4 r66, defpackage.ib4 r67, defpackage.ib4 r68, final defpackage.ib4 r69, final defpackage.kb4 r70, dd4 r71, final int r72, final int r73) {
        /*
            Method dump skipped, instruction units count: 2236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl8.e(t61, st5, boolean, java.lang.String, java.lang.String, boolean, pj7, ou6, ib4, kb4, ib4, ib4, yb4, kb4, ib4, ib4, ib4, ib4, kb4, dd4, int, int):void");
    }

    public static or2[] e0(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, or2[] or2VarArr) throws IOException {
        or2 or2Var;
        if (byteArrayInputStream.available() == 0) {
            return new or2[0];
        }
        if (i2 != or2VarArr.length) {
            gp.j("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            ex1.f0(byteArrayInputStream, 2);
            String str = new String(ex1.d0(byteArrayInputStream, (int) ex1.f0(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jF0 = ex1.f0(byteArrayInputStream, 4);
            int iF0 = (int) ex1.f0(byteArrayInputStream, 2);
            if (or2VarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i4 = 0; i4 < or2VarArr.length; i4++) {
                    if (or2VarArr[i4].b.equals(strSubstring)) {
                        or2Var = or2VarArr[i4];
                        break;
                    }
                }
                or2Var = null;
            } else {
                or2Var = null;
            }
            if (or2Var == null) {
                gp.j("Missing profile key: ".concat(str));
                return null;
            }
            or2Var.d = jF0;
            int[] iArrB0 = b0(byteArrayInputStream, iF0);
            if (Arrays.equals(bArr, m79.B)) {
                or2Var.e = iF0;
                or2Var.h = iArrB0;
            }
        }
        return or2VarArr;
    }

    public static final void f(String str, final t27 t27Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        a07 a07Var;
        Object hlVar;
        a07 a07Var2;
        a07 a07Var3;
        a07 a07Var4;
        a07 a07Var5;
        final a07 a07Var6;
        cx5 cx5Var;
        cx5 cx5Var2;
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(7097242);
        int i3 = 4;
        int i4 = i2 | (dd4Var.f(str) ? 4 : 2) | (dd4Var.f(t27Var) ? 32 : 16);
        if (dd4Var.V(i4 & 1, (i4 & 19) != 18)) {
            eub eubVarA = (eub) dd4Var.j(utb.b);
            if (eubVarA == null) {
                dd4Var.f0(1368428688);
                eubVarA = e36.a(dd4Var);
            } else {
                dd4Var.f0(1368426673);
            }
            dd4Var.q(false);
            if (eubVarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalRootViewModelStoreOwner or LocalViewModelStoreOwner");
                return;
            }
            mib mibVar = (mib) ((qtb) qx1.N(ug8.a(mib.class), eubVarA.f(), null, eubVarA instanceof pj4 ? ((pj4) eubVarA).d() : v02.b, ek5.a(dd4Var), null));
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final phb phbVar = (phb) ((qtb) qx1.N(ug8.a(phb.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            boolean z2 = (i4 & 14) == 4;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = new wj0(str, i3);
                dd4Var.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            pj4 pj4VarA2 = e36.a(dd4Var);
            if (pj4VarA2 == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ry6 ry6VarD = pj4VarA2 instanceof pj4 ? pj4VarA2.d() : v02.b;
            ev8 ev8VarA = ek5.a(dd4Var);
            a91 a91VarA = ug8.a(e71.class);
            final e71 e71Var = (e71) ((qtb) qx1.N(a91VarA, pj4VarA2.f(), dx1.h(a91VarA.f(), "-", str), ry6VarD, ev8VarA, ib4Var));
            final a07 a07VarB = bx1.B(mibVar.f, dd4Var);
            final a07 a07VarB2 = bx1.B(phbVar.d, dd4Var);
            final a07 a07VarB3 = bx1.B(e71Var.s, dd4Var);
            final boolean zEquals = str.equals("chat");
            dd4Var.f0(-1769464469);
            String strK = ((t61) a07VarB3.getValue()).h;
            if (bw9.a0(strK)) {
                strK = wn9.K((pv9) ru9.U.getValue(), dd4Var);
            }
            final String str2 = strK;
            dd4Var.q(false);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = dk9.x(Boolean.FALSE);
                dd4Var.p0(objQ2);
            }
            final a07 a07Var7 = (a07) objQ2;
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj) {
                objQ3 = dk9.x(Boolean.FALSE);
                dd4Var.p0(objQ3);
            }
            a07 a07Var8 = (a07) objQ3;
            Object objQ4 = dd4Var.Q();
            if (objQ4 == obj) {
                objQ4 = dk9.x(Boolean.FALSE);
                dd4Var.p0(objQ4);
            }
            a07 a07Var9 = (a07) objQ4;
            Object objQ5 = dd4Var.Q();
            if (objQ5 == obj) {
                objQ5 = dk9.x(Boolean.FALSE);
                dd4Var.p0(objQ5);
            }
            a07 a07Var10 = (a07) objQ5;
            Object objQ6 = dd4Var.Q();
            if (objQ6 == obj) {
                objQ6 = dk9.x(Boolean.FALSE);
                dd4Var.p0(objQ6);
            }
            final a07 a07Var11 = (a07) objQ6;
            Object objQ7 = dd4Var.Q();
            jt1 jt1Var = null;
            if (objQ7 == obj) {
                objQ7 = dk9.x((Object) null);
                dd4Var.p0(objQ7);
            }
            final a07 a07Var12 = (a07) objQ7;
            Object objQ8 = dd4Var.Q();
            if (objQ8 == obj) {
                objQ8 = dk9.x("");
                dd4Var.p0(objQ8);
            }
            a07 a07Var13 = (a07) objQ8;
            Object objQ9 = dd4Var.Q();
            if (objQ9 == obj) {
                objQ9 = dk9.x((Object) null);
                dd4Var.p0(objQ9);
            }
            a07 a07Var14 = (a07) objQ9;
            Object[] objArr = new Object[0];
            Object objQ10 = dd4Var.Q();
            if (objQ10 == obj) {
                a07Var = a07Var10;
                objQ10 = new ag0(20);
                dd4Var.p0(objQ10);
            } else {
                a07Var = a07Var10;
            }
            a07 a07VarA0 = ww1.a0(objArr, (ib4) objQ10, dd4Var, 384);
            Object objQ11 = dd4Var.Q();
            if (objQ11 == obj) {
                objQ11 = new x6(a07Var14, 24);
                dd4Var.p0(objQ11);
            }
            final aw3 aw3VarC0 = e11.c0(ns7.a, (kb4) objQ11, dd4Var, 48);
            Boolean bool = (Boolean) a07Var8.getValue();
            bool.getClass();
            String str3 = ((t61) a07VarB3.getValue()).h;
            boolean zF = dd4Var.f(a07VarB3);
            Object objQ12 = dd4Var.Q();
            if (zF || objQ12 == obj) {
                hlVar = new hl(a07Var8, a07VarB3, a07Var13, a07Var14, null, 1);
                a07Var2 = a07Var8;
                a07Var3 = a07Var13;
                a07Var4 = a07Var14;
                dd4Var.p0(hlVar);
            } else {
                hlVar = objQ12;
                a07Var2 = a07Var8;
                a07Var3 = a07Var13;
                a07Var4 = a07Var14;
            }
            lc5.v(bool, str3, (yb4) hlVar, dd4Var);
            Boolean bool2 = (Boolean) a07Var9.getValue();
            bool2.getClass();
            boolean zF2 = dd4Var.f(a07VarA0) | dd4Var.f(e71Var);
            Object objQ13 = dd4Var.Q();
            if (zF2 || objQ13 == obj) {
                a07Var5 = a07VarA0;
                objQ13 = new ti(e71Var, a07Var9, a07Var5, jt1Var, 4);
                a07Var6 = a07Var9;
                cx5Var = null;
                dd4Var.p0(objQ13);
            } else {
                a07Var5 = a07VarA0;
                a07Var6 = a07Var9;
                cx5Var = null;
            }
            lc5.u((yb4) objQ13, dd4Var, bool2);
            pp1 pp1Var = phbVar.e;
            int i5 = i4 & Token.ASSIGN_MOD;
            boolean z3 = i5 == 32;
            Object objQ14 = dd4Var.Q();
            if (z3 || objQ14 == obj) {
                objQ14 = new p51(t27Var, a07Var12, cx5Var);
                dd4Var.p0(objQ14);
            }
            wx1.e(pp1Var, cx5Var, (zb4) objQ14, dd4Var, 0);
            final a07 a07Var15 = a07Var2;
            final st5 st5VarA = ut5.a(0, dd4Var, 0, 3);
            final ig4 ig4VarE0 = tw1.e0(dd4Var);
            pp1 pp1Var2 = e71Var.t;
            boolean zF3 = dd4Var.f(st5VarA) | (i5 == 32) | dd4Var.f(ig4VarE0);
            Object objQ15 = dd4Var.Q();
            if (zF3 || objQ15 == obj) {
                cx5Var2 = null;
                objQ15 = new q51(st5VarA, t27Var, ig4VarE0, (jt1) null);
                dd4Var.p0(objQ15);
            } else {
                cx5Var2 = null;
            }
            wx1.e(pp1Var2, cx5Var2, (zb4) objQ15, dd4Var, 0);
            dd4Var2 = dd4Var;
            final a07 a07Var16 = a07Var5;
            final a07 a07Var17 = a07Var3;
            final a07 a07Var18 = a07Var;
            final a07 a07Var19 = a07Var4;
            gx1.q(null, jf0.G(-1617111496, new zb4() { // from class: j51
                @Override // defpackage.zb4
                public final Object c(Object obj2, Object obj3, Object obj4) {
                    e71 e71Var2;
                    pj7 pj7Var;
                    String strK2;
                    e71 e71Var3;
                    boolean z4;
                    br9 br9Var;
                    a07 a07Var20;
                    a07 a07Var21;
                    a07 a07Var22;
                    final e71 e71Var4;
                    final a07 a07Var23;
                    final e71 e71Var5;
                    final a07 a07Var24;
                    final br9 br9Var2;
                    dd4 dd4Var3 = (dd4) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((yn0) obj2).getClass();
                    if (dd4Var3.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                        px3 px3Var = tg9.c;
                        ou6 ou6VarC = tg9.c(px3Var, 1.0f);
                        ha6 ha6VarD = pn0.d(bv4.b, false);
                        int iHashCode = Long.hashCode(dd4Var3.T);
                        lr7 lr7VarL = dd4Var3.l();
                        ou6 ou6VarL0 = s32.L0(dd4Var3, ou6VarC);
                        ml1.k.getClass();
                        um1 um1Var = ll1.b;
                        dd4Var3.j0();
                        if (dd4Var3.S) {
                            dd4Var3.k(um1Var);
                        } else {
                            dd4Var3.s0();
                        }
                        un9.s(ll1.f, dd4Var3, ha6VarD);
                        un9.s(ll1.e, dd4Var3, lr7VarL);
                        un9.s(ll1.g, dd4Var3, Integer.valueOf(iHashCode));
                        un9.r(dd4Var3, ll1.h);
                        un9.s(ll1.d, dd4Var3, ou6VarL0);
                        a07 a07Var25 = a07VarB3;
                        t61 t61Var = (t61) a07Var25.getValue();
                        br9 br9Var3 = a07VarB;
                        boolean z5 = ((iib) br9Var3.getValue()).a;
                        String str4 = ((iib) br9Var3.getValue()).c;
                        String str5 = ((iib) br9Var3.getValue()).h;
                        pj7 pj7VarM = yib.m(yib.d(3, dd4Var3, false), 0.0f, 58.0f, 0.0f, 0.0f, dd4Var3, 384, 13);
                        t27 t27Var2 = t27Var;
                        boolean zF4 = dd4Var3.f(t27Var2);
                        Object objQ16 = dd4Var3.Q();
                        Object obj5 = vl1.a;
                        if (zF4 || objQ16 == obj5) {
                            objQ16 = new z6(t27Var2, 7);
                            dd4Var3.p0(objQ16);
                        }
                        ib4 ib4Var2 = (ib4) objQ16;
                        boolean zF5 = dd4Var3.f(t27Var2);
                        Object objQ17 = dd4Var3.Q();
                        if (zF5 || objQ17 == obj5) {
                            objQ17 = new z6(t27Var2, 8);
                            dd4Var3.p0(objQ17);
                        }
                        ib4 ib4Var3 = (ib4) objQ17;
                        boolean zF6 = dd4Var3.f(t27Var2);
                        Object objQ18 = dd4Var3.Q();
                        if (zF6 || objQ18 == obj5) {
                            objQ18 = new z6(t27Var2, 9);
                            dd4Var3.p0(objQ18);
                        }
                        ib4 ib4Var4 = (ib4) objQ18;
                        e71 e71Var6 = e71Var;
                        boolean zF7 = dd4Var3.f(e71Var6);
                        Object objQ19 = dd4Var3.Q();
                        if (zF7 || objQ19 == obj5) {
                            objQ19 = new d7(0, e71Var6, e71.class, "loadNewMessages", "loadNewMessages()V", 0, 8);
                            dd4Var3.p0(objQ19);
                        }
                        ib4 ib4Var5 = (ib4) ((ei5) objQ19);
                        boolean zF8 = dd4Var3.f(e71Var6);
                        Object objQ20 = dd4Var3.Q();
                        if (zF8 || objQ20 == obj5) {
                            objQ20 = new d7(0, e71Var6, e71.class, "reloadMessages", "reloadMessages()V", 0, 9);
                            dd4Var3.p0(objQ20);
                        }
                        ib4 ib4Var6 = (ib4) ((ei5) objQ20);
                        boolean zF9 = dd4Var3.f(e71Var6);
                        Object objQ21 = dd4Var3.Q();
                        if (zF9 || objQ21 == obj5) {
                            objQ21 = new d7(0, e71Var6, e71.class, "loadMoreMessages", "loadMoreMessages()V", 0, 10);
                            dd4Var3.p0(objQ21);
                        }
                        ib4 ib4Var7 = (ib4) ((ei5) objQ21);
                        boolean zF10 = dd4Var3.f(e71Var6);
                        Object objQ22 = dd4Var3.Q();
                        if (zF10 || objQ22 == obj5) {
                            objQ22 = new x(1, e71Var6, e71.class, "addQuote", "addQuote(J)V", 0, 6);
                            dd4Var3.p0(objQ22);
                        }
                        kb4 kb4Var = (kb4) ((ei5) objQ22);
                        boolean zF11 = dd4Var3.f(e71Var6);
                        Object objQ23 = dd4Var3.Q();
                        if (zF11 || objQ23 == obj5) {
                            objQ23 = new d7(0, e71Var6, e71.class, "removeQuote", "removeQuote()V", 0, 11);
                            dd4Var3.p0(objQ23);
                        }
                        ib4 ib4Var8 = (ib4) ((ei5) objQ23);
                        boolean zF12 = dd4Var3.f(e71Var6);
                        Object objQ24 = dd4Var3.Q();
                        if (zF12 || objQ24 == obj5) {
                            objQ24 = new d7(0, e71Var6, e71.class, "resetUnreadNewMessage", "resetUnreadNewMessage()V", 0, 12);
                            dd4Var3.p0(objQ24);
                        }
                        ib4 ib4Var9 = (ib4) ((ei5) objQ24);
                        boolean zF13 = dd4Var3.f(e71Var6);
                        Object objQ25 = dd4Var3.Q();
                        if (zF13 || objQ25 == obj5) {
                            objQ25 = new r51(2, e71Var6, e71.class, "sendChat", "sendChat(Ljava/lang/String;Ljava/util/List;)V", 0, 0);
                            dd4Var3.p0(objQ25);
                        }
                        yb4 yb4Var = (yb4) ((ei5) objQ25);
                        boolean zF14 = dd4Var3.f(e71Var6);
                        Object objQ26 = dd4Var3.Q();
                        if (zF14 || objQ26 == obj5) {
                            objQ26 = new x(1, e71Var6, e71.class, "handleLink", "handleLink(Ljava/lang/String;)V", 0, 3);
                            dd4Var3.p0(objQ26);
                        }
                        kb4 kb4Var2 = (kb4) ((ei5) objQ26);
                        boolean zF15 = dd4Var3.f(e71Var6);
                        Object objQ27 = dd4Var3.Q();
                        if (zF15 || objQ27 == obj5) {
                            e71Var2 = e71Var6;
                            objQ27 = new d7(0, e71Var2, e71.class, "joinConversation", "joinConversation()V", 0, 6);
                            dd4Var3.p0(objQ27);
                        } else {
                            e71Var2 = e71Var6;
                        }
                        ib4 ib4Var10 = (ib4) ((ei5) objQ27);
                        Object objQ28 = dd4Var3.Q();
                        a07 a07Var26 = a07Var12;
                        if (objQ28 == obj5) {
                            pj7Var = pj7VarM;
                            objQ28 = new x6(a07Var26, 17);
                            dd4Var3.p0(objQ28);
                        } else {
                            pj7Var = pj7VarM;
                        }
                        e71 e71Var7 = e71Var2;
                        kl8.i(t61Var, st5VarA, z5, str4, str5, pj7Var, px3Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, ib4Var6, ib4Var7, kb4Var, ib4Var8, ib4Var9, yb4Var, kb4Var2, ib4Var10, (kb4) objQ28, dd4Var3, 1572864);
                        tw1.i(ig4VarE0, dd4Var3, 0);
                        boolean z6 = zEquals;
                        String str6 = str2;
                        if (z6) {
                            dd4Var3.f0(-1373107380);
                            strK2 = wn9.K((pv9) vt9.L0.getValue(), dd4Var3);
                            dd4Var3.q(false);
                        } else {
                            dd4Var3.f0(-1373015124);
                            dd4Var3.q(false);
                            strK2 = str6;
                        }
                        boolean z7 = (z6 || ((t61) a07Var25.getValue()).e == null) ? false : true;
                        lu6 lu6Var = lu6.a;
                        ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                        boolean zF16 = dd4Var3.f(t27Var2);
                        Object objQ29 = dd4Var3.Q();
                        if (zF16 || objQ29 == obj5) {
                            objQ29 = new z6(t27Var2, 10);
                            dd4Var3.p0(objQ29);
                        }
                        ib4 ib4Var11 = (ib4) objQ29;
                        Object objQ30 = dd4Var3.Q();
                        a07 a07Var27 = a07Var7;
                        if (objQ30 == obj5) {
                            objQ30 = new ik(a07Var27, 21);
                            dd4Var3.p0(objQ30);
                        }
                        kl8.k(strK2, z7, ou6VarF, ib4Var11, (ib4) objQ30, dd4Var3, 199728);
                        boolean zBooleanValue = ((Boolean) a07Var27.getValue()).booleanValue();
                        t61 t61Var2 = (t61) a07Var25.getValue();
                        Object objQ31 = dd4Var3.Q();
                        if (objQ31 == obj5) {
                            objQ31 = new x6(a07Var27, 18);
                            dd4Var3.p0(objQ31);
                        }
                        kb4 kb4Var3 = (kb4) objQ31;
                        Object objQ32 = dd4Var3.Q();
                        a07 a07Var28 = a07Var15;
                        if (objQ32 == obj5) {
                            objQ32 = new x41(a07Var27, a07Var28, 1);
                            dd4Var3.p0(objQ32);
                        }
                        ib4 ib4Var12 = (ib4) objQ32;
                        Object objQ33 = dd4Var3.Q();
                        a07 a07Var29 = a07Var6;
                        if (objQ33 == obj5) {
                            objQ33 = new x41(a07Var27, a07Var29, 2);
                            dd4Var3.p0(objQ33);
                        }
                        ib4 ib4Var13 = (ib4) objQ33;
                        Object objQ34 = dd4Var3.Q();
                        a07 a07Var30 = a07Var18;
                        if (objQ34 == obj5) {
                            objQ34 = new x41(a07Var27, a07Var30, 3);
                            dd4Var3.p0(objQ34);
                        }
                        ib4 ib4Var14 = (ib4) objQ34;
                        Object objQ35 = dd4Var3.Q();
                        br9 br9Var4 = a07Var11;
                        if (objQ35 == obj5) {
                            objQ35 = new x41(a07Var27, br9Var4, 0);
                            dd4Var3.p0(objQ35);
                        }
                        ib4 ib4Var15 = (ib4) objQ35;
                        boolean zF17 = dd4Var3.f(e71Var7);
                        Object objQ36 = dd4Var3.Q();
                        if (zF17 || objQ36 == obj5) {
                            objQ36 = new x(1, e71Var7, e71.class, "kickConversationMember", "kickConversationMember(Ljava/lang/String;)V", 0, 4);
                            e71Var3 = e71Var7;
                            dd4Var3.p0(objQ36);
                        } else {
                            e71Var3 = e71Var7;
                        }
                        kb4 kb4Var4 = (kb4) ((ei5) objQ36);
                        Object objQ37 = dd4Var3.Q();
                        if (objQ37 == obj5) {
                            z4 = zBooleanValue;
                            br9Var = br9Var4;
                            a07Var20 = a07Var26;
                            objQ37 = new rl0(a07Var27, a07Var20, 1);
                            dd4Var3.p0(objQ37);
                        } else {
                            z4 = zBooleanValue;
                            br9Var = br9Var4;
                            a07Var20 = a07Var26;
                        }
                        a07 a07Var31 = a07Var20;
                        fe.a(z4, t61Var2, null, kb4Var3, ib4Var12, ib4Var13, ib4Var14, ib4Var15, kb4Var4, (kb4) objQ37, dd4Var3, 819686400);
                        sgb sgbVar = (sgb) a07Var31.getValue();
                        String str7 = ((iib) br9Var3.getValue()).b;
                        boolean z8 = ((sgb) a07Var31.getValue()) != null;
                        boolean z9 = ((ohb) a07VarB2.getValue()).a;
                        Object objQ38 = dd4Var3.Q();
                        if (objQ38 == obj5) {
                            objQ38 = new x6(a07Var31, 20);
                            dd4Var3.p0(objQ38);
                        }
                        kb4 kb4Var5 = (kb4) objQ38;
                        phb phbVar2 = phbVar;
                        boolean zF18 = dd4Var3.f(phbVar2);
                        Object objQ39 = dd4Var3.Q();
                        if (zF18 || objQ39 == obj5) {
                            objQ39 = new f0(phbVar2, 13);
                            dd4Var3.p0(objQ39);
                        }
                        gx1.n(sgbVar, str7, z8, z9, kb4Var5, (kb4) objQ39, dd4Var3, 24584);
                        boolean zBooleanValue2 = ((Boolean) a07Var28.getValue()).booleanValue();
                        a07 a07Var32 = a07Var17;
                        String str8 = (String) a07Var32.getValue();
                        String str9 = ((t61) a07Var25.getValue()).i;
                        a07 a07Var33 = a07Var19;
                        bi5 bi5Var = (bi5) a07Var33.getValue();
                        boolean z10 = ((t61) a07Var25.getValue()).v;
                        Object objQ40 = dd4Var3.Q();
                        if (objQ40 == obj5) {
                            a07Var21 = a07Var28;
                            objQ40 = new x6(a07Var21, 23);
                            dd4Var3.p0(objQ40);
                        } else {
                            a07Var21 = a07Var28;
                        }
                        kb4 kb4Var6 = (kb4) objQ40;
                        Object objQ41 = dd4Var3.Q();
                        if (objQ41 == obj5) {
                            objQ41 = new x6(a07Var32, 25);
                            dd4Var3.p0(objQ41);
                        }
                        kb4 kb4Var7 = (kb4) objQ41;
                        aw3 aw3Var = aw3VarC0;
                        boolean zF19 = dd4Var3.f(aw3Var);
                        Object objQ42 = dd4Var3.Q();
                        if (zF19 || objQ42 == obj5) {
                            a07Var22 = a07Var32;
                            objQ42 = new k51(aw3Var, 0);
                            dd4Var3.p0(objQ42);
                        } else {
                            a07Var22 = a07Var32;
                        }
                        ib4 ib4Var16 = (ib4) objQ42;
                        e71 e71Var8 = e71Var3;
                        boolean zF20 = dd4Var3.f(e71Var8);
                        Object objQ43 = dd4Var3.Q();
                        if (zF20 || objQ43 == obj5) {
                            objQ43 = new wp0((Object) e71Var8, (Object) a07Var21, (Object) a07Var22, (Object) a07Var33, 1);
                            e71Var4 = e71Var8;
                            dd4Var3.p0(objQ43);
                        } else {
                            e71Var4 = e71Var8;
                        }
                        fe.q(zBooleanValue2, str8, str9, bi5Var, z10, kb4Var6, kb4Var7, ib4Var16, (ib4) objQ43, dd4Var3, 1769472);
                        boolean zBooleanValue3 = ((Boolean) a07Var29.getValue()).booleanValue();
                        t61 t61Var3 = (t61) a07Var25.getValue();
                        final a07 a07Var34 = a07Var16;
                        wga wgaVar = (wga) a07Var34.getValue();
                        ou6 ou6VarA = zn0.a.a(lu6Var, bv4.c);
                        Object objQ44 = dd4Var3.Q();
                        if (objQ44 == obj5) {
                            a07Var23 = a07Var29;
                            objQ44 = new x6(a07Var23, 26);
                            dd4Var3.p0(objQ44);
                        } else {
                            a07Var23 = a07Var29;
                        }
                        kb4 kb4Var8 = (kb4) objQ44;
                        boolean zF21 = dd4Var3.f(a07Var34);
                        Object objQ45 = dd4Var3.Q();
                        if (zF21 || objQ45 == obj5) {
                            objQ45 = new x6(a07Var34, 14);
                            dd4Var3.p0(objQ45);
                        }
                        kb4 kb4Var9 = (kb4) objQ45;
                        boolean zF22 = dd4Var3.f(e71Var4) | dd4Var3.f(a07Var34);
                        Object objQ46 = dd4Var3.Q();
                        if (zF22 || objQ46 == obj5) {
                            final int i6 = 0;
                            objQ46 = new ib4() { // from class: w41
                                @Override // defpackage.ib4
                                public final Object invoke() {
                                    int i7 = i6;
                                    heb hebVar = heb.a;
                                    a07 a07Var35 = a07Var34;
                                    switch (i7) {
                                        case 0:
                                            e71Var4.m(((wga) a07Var35.getValue()).a.b);
                                            break;
                                        case 1:
                                            a07Var35.setValue(Boolean.FALSE);
                                            e71 e71Var9 = e71Var4;
                                            fr9 fr9Var = e71Var9.s;
                                            Long lN = iw9.N(e71Var9.c);
                                            if (lN != null) {
                                                long jLongValue = lN.longValue();
                                                List listZ0 = fc1.Z0(((t61) fr9Var.getValue()).z);
                                                if (!listZ0.isEmpty() && !((t61) fr9Var.getValue()).v) {
                                                    za1 za1VarA = vtb.a(e71Var9);
                                                    aj2 aj2Var = rw2.a;
                                                    e71Var9.g(za1VarA, nh2.c, new x61(e71Var9, jLongValue, listZ0, (jt1) null));
                                                }
                                            }
                                            break;
                                        case 2:
                                            a07Var35.setValue(Boolean.FALSE);
                                            e71 e71Var10 = e71Var4;
                                            Long lN2 = iw9.N(e71Var10.c);
                                            if (lN2 != null) {
                                                long jLongValue2 = lN2.longValue();
                                                if (!((t61) e71Var10.s.getValue()).v) {
                                                    za1 za1VarA2 = vtb.a(e71Var10);
                                                    aj2 aj2Var2 = rw2.a;
                                                    e71Var10.g(za1VarA2, nh2.c, new w61(e71Var10, jLongValue2, null, 1));
                                                }
                                            }
                                            break;
                                        default:
                                            a07Var35.setValue(Boolean.FALSE);
                                            e71 e71Var11 = e71Var4;
                                            Long lN3 = iw9.N(e71Var11.c);
                                            if (lN3 != null) {
                                                long jLongValue3 = lN3.longValue();
                                                if (!((t61) e71Var11.s.getValue()).v) {
                                                    za1 za1VarA3 = vtb.a(e71Var11);
                                                    aj2 aj2Var3 = rw2.a;
                                                    e71Var11.g(za1VarA3, nh2.c, new w61(e71Var11, jLongValue3, null, 0));
                                                }
                                            }
                                            break;
                                    }
                                    return hebVar;
                                }
                            };
                            dd4Var3.p0(objQ46);
                        }
                        ib4 ib4Var17 = (ib4) objQ46;
                        boolean zF23 = dd4Var3.f(e71Var4);
                        Object objQ47 = dd4Var3.Q();
                        if (zF23 || objQ47 == obj5) {
                            objQ47 = new d7(0, e71Var4, e71.class, "loadMoreInviteUsers", "loadMoreInviteUsers()V", 0, 7);
                            dd4Var3.p0(objQ47);
                        }
                        ib4 ib4Var18 = (ib4) ((ei5) objQ47);
                        boolean zF24 = dd4Var3.f(e71Var4);
                        Object objQ48 = dd4Var3.Q();
                        if (zF24 || objQ48 == obj5) {
                            e71 e71Var9 = e71Var4;
                            objQ48 = new x(1, e71Var9, e71.class, "toggleInviteUser", "toggleInviteUser(Ljava/lang/String;)V", 0, 5);
                            e71Var5 = e71Var9;
                            dd4Var3.p0(objQ48);
                        } else {
                            e71Var5 = e71Var4;
                        }
                        kb4 kb4Var10 = (kb4) ((ei5) objQ48);
                        boolean zF25 = dd4Var3.f(e71Var5);
                        Object objQ49 = dd4Var3.Q();
                        if (zF25 || objQ49 == obj5) {
                            final int i7 = 1;
                            objQ49 = new ib4() { // from class: w41
                                @Override // defpackage.ib4
                                public final Object invoke() {
                                    int i72 = i7;
                                    heb hebVar = heb.a;
                                    a07 a07Var35 = a07Var23;
                                    switch (i72) {
                                        case 0:
                                            e71Var5.m(((wga) a07Var35.getValue()).a.b);
                                            break;
                                        case 1:
                                            a07Var35.setValue(Boolean.FALSE);
                                            e71 e71Var92 = e71Var5;
                                            fr9 fr9Var = e71Var92.s;
                                            Long lN = iw9.N(e71Var92.c);
                                            if (lN != null) {
                                                long jLongValue = lN.longValue();
                                                List listZ0 = fc1.Z0(((t61) fr9Var.getValue()).z);
                                                if (!listZ0.isEmpty() && !((t61) fr9Var.getValue()).v) {
                                                    za1 za1VarA = vtb.a(e71Var92);
                                                    aj2 aj2Var = rw2.a;
                                                    e71Var92.g(za1VarA, nh2.c, new x61(e71Var92, jLongValue, listZ0, (jt1) null));
                                                }
                                            }
                                            break;
                                        case 2:
                                            a07Var35.setValue(Boolean.FALSE);
                                            e71 e71Var10 = e71Var5;
                                            Long lN2 = iw9.N(e71Var10.c);
                                            if (lN2 != null) {
                                                long jLongValue2 = lN2.longValue();
                                                if (!((t61) e71Var10.s.getValue()).v) {
                                                    za1 za1VarA2 = vtb.a(e71Var10);
                                                    aj2 aj2Var2 = rw2.a;
                                                    e71Var10.g(za1VarA2, nh2.c, new w61(e71Var10, jLongValue2, null, 1));
                                                }
                                            }
                                            break;
                                        default:
                                            a07Var35.setValue(Boolean.FALSE);
                                            e71 e71Var11 = e71Var5;
                                            Long lN3 = iw9.N(e71Var11.c);
                                            if (lN3 != null) {
                                                long jLongValue3 = lN3.longValue();
                                                if (!((t61) e71Var11.s.getValue()).v) {
                                                    za1 za1VarA3 = vtb.a(e71Var11);
                                                    aj2 aj2Var3 = rw2.a;
                                                    e71Var11.g(za1VarA3, nh2.c, new w61(e71Var11, jLongValue3, null, 0));
                                                }
                                            }
                                            break;
                                    }
                                    return hebVar;
                                }
                            };
                            dd4Var3.p0(objQ49);
                        }
                        fe.v(zBooleanValue3, t61Var3, wgaVar, ou6VarA, kb4Var8, kb4Var9, ib4Var17, ib4Var18, kb4Var10, (ib4) objQ49, dd4Var3, 24576);
                        boolean zBooleanValue4 = ((Boolean) a07Var30.getValue()).booleanValue();
                        String strK3 = wn9.K((pv9) zt9.j.getValue(), dd4Var3);
                        String strL = wn9.L((pv9) zt9.k.getValue(), new Object[]{str6}, dd4Var3);
                        boolean z11 = ((t61) a07Var25.getValue()).v;
                        Object objQ50 = dd4Var3.Q();
                        if (objQ50 == obj5) {
                            a07Var24 = a07Var30;
                            objQ50 = new x6(a07Var24, 15);
                            dd4Var3.p0(objQ50);
                        } else {
                            a07Var24 = a07Var30;
                        }
                        kb4 kb4Var11 = (kb4) objQ50;
                        boolean zF26 = dd4Var3.f(e71Var5);
                        Object objQ51 = dd4Var3.Q();
                        if (zF26 || objQ51 == obj5) {
                            final int i8 = 2;
                            objQ51 = new ib4() { // from class: w41
                                @Override // defpackage.ib4
                                public final Object invoke() {
                                    int i72 = i8;
                                    heb hebVar = heb.a;
                                    a07 a07Var35 = a07Var24;
                                    switch (i72) {
                                        case 0:
                                            e71Var5.m(((wga) a07Var35.getValue()).a.b);
                                            break;
                                        case 1:
                                            a07Var35.setValue(Boolean.FALSE);
                                            e71 e71Var92 = e71Var5;
                                            fr9 fr9Var = e71Var92.s;
                                            Long lN = iw9.N(e71Var92.c);
                                            if (lN != null) {
                                                long jLongValue = lN.longValue();
                                                List listZ0 = fc1.Z0(((t61) fr9Var.getValue()).z);
                                                if (!listZ0.isEmpty() && !((t61) fr9Var.getValue()).v) {
                                                    za1 za1VarA = vtb.a(e71Var92);
                                                    aj2 aj2Var = rw2.a;
                                                    e71Var92.g(za1VarA, nh2.c, new x61(e71Var92, jLongValue, listZ0, (jt1) null));
                                                }
                                            }
                                            break;
                                        case 2:
                                            a07Var35.setValue(Boolean.FALSE);
                                            e71 e71Var10 = e71Var5;
                                            Long lN2 = iw9.N(e71Var10.c);
                                            if (lN2 != null) {
                                                long jLongValue2 = lN2.longValue();
                                                if (!((t61) e71Var10.s.getValue()).v) {
                                                    za1 za1VarA2 = vtb.a(e71Var10);
                                                    aj2 aj2Var2 = rw2.a;
                                                    e71Var10.g(za1VarA2, nh2.c, new w61(e71Var10, jLongValue2, null, 1));
                                                }
                                            }
                                            break;
                                        default:
                                            a07Var35.setValue(Boolean.FALSE);
                                            e71 e71Var11 = e71Var5;
                                            Long lN3 = iw9.N(e71Var11.c);
                                            if (lN3 != null) {
                                                long jLongValue3 = lN3.longValue();
                                                if (!((t61) e71Var11.s.getValue()).v) {
                                                    za1 za1VarA3 = vtb.a(e71Var11);
                                                    aj2 aj2Var3 = rw2.a;
                                                    e71Var11.g(za1VarA3, nh2.c, new w61(e71Var11, jLongValue3, null, 0));
                                                }
                                            }
                                            break;
                                    }
                                    return hebVar;
                                }
                            };
                            dd4Var3.p0(objQ51);
                        }
                        fe.e(zBooleanValue4, strK3, strL, z11, kb4Var11, (ib4) objQ51, dd4Var3, 24576);
                        boolean zBooleanValue5 = ((Boolean) br9Var.getValue()).booleanValue();
                        String strK4 = wn9.K((pv9) zt9.a0.getValue(), dd4Var3);
                        String strL2 = wn9.L((pv9) zt9.e.getValue(), new Object[]{str6}, dd4Var3);
                        boolean z12 = ((t61) a07Var25.getValue()).v;
                        Object objQ52 = dd4Var3.Q();
                        if (objQ52 == obj5) {
                            br9Var2 = br9Var;
                            objQ52 = new x6(br9Var2, 16);
                            dd4Var3.p0(objQ52);
                        } else {
                            br9Var2 = br9Var;
                        }
                        kb4 kb4Var12 = (kb4) objQ52;
                        boolean zF27 = dd4Var3.f(e71Var5);
                        Object objQ53 = dd4Var3.Q();
                        if (zF27 || objQ53 == obj5) {
                            final int i9 = 3;
                            objQ53 = new ib4() { // from class: w41
                                @Override // defpackage.ib4
                                public final Object invoke() {
                                    int i72 = i9;
                                    heb hebVar = heb.a;
                                    a07 a07Var35 = br9Var2;
                                    switch (i72) {
                                        case 0:
                                            e71Var5.m(((wga) a07Var35.getValue()).a.b);
                                            break;
                                        case 1:
                                            a07Var35.setValue(Boolean.FALSE);
                                            e71 e71Var92 = e71Var5;
                                            fr9 fr9Var = e71Var92.s;
                                            Long lN = iw9.N(e71Var92.c);
                                            if (lN != null) {
                                                long jLongValue = lN.longValue();
                                                List listZ0 = fc1.Z0(((t61) fr9Var.getValue()).z);
                                                if (!listZ0.isEmpty() && !((t61) fr9Var.getValue()).v) {
                                                    za1 za1VarA = vtb.a(e71Var92);
                                                    aj2 aj2Var = rw2.a;
                                                    e71Var92.g(za1VarA, nh2.c, new x61(e71Var92, jLongValue, listZ0, (jt1) null));
                                                }
                                            }
                                            break;
                                        case 2:
                                            a07Var35.setValue(Boolean.FALSE);
                                            e71 e71Var10 = e71Var5;
                                            Long lN2 = iw9.N(e71Var10.c);
                                            if (lN2 != null) {
                                                long jLongValue2 = lN2.longValue();
                                                if (!((t61) e71Var10.s.getValue()).v) {
                                                    za1 za1VarA2 = vtb.a(e71Var10);
                                                    aj2 aj2Var2 = rw2.a;
                                                    e71Var10.g(za1VarA2, nh2.c, new w61(e71Var10, jLongValue2, null, 1));
                                                }
                                            }
                                            break;
                                        default:
                                            a07Var35.setValue(Boolean.FALSE);
                                            e71 e71Var11 = e71Var5;
                                            Long lN3 = iw9.N(e71Var11.c);
                                            if (lN3 != null) {
                                                long jLongValue3 = lN3.longValue();
                                                if (!((t61) e71Var11.s.getValue()).v) {
                                                    za1 za1VarA3 = vtb.a(e71Var11);
                                                    aj2 aj2Var3 = rw2.a;
                                                    e71Var11.g(za1VarA3, nh2.c, new w61(e71Var11, jLongValue3, null, 0));
                                                }
                                            }
                                            break;
                                    }
                                    return hebVar;
                                }
                            };
                            dd4Var3.p0(objQ53);
                        }
                        fe.e(zBooleanValue5, strK4, strL2, z12, kb4Var12, (ib4) objQ53, dd4Var3, 24576);
                        dd4Var3.q(true);
                    } else {
                        dd4Var3.Y();
                    }
                    return heb.a;
                }
            }, dd4Var2), dd4Var2, 48, 1);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yj0(str, t27Var, i2, 3);
        }
    }

    public static or2[] f0(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, m79.y)) {
            gp.j("Unsupported version");
            return null;
        }
        int iF0 = (int) ex1.f0(fileInputStream, 1);
        byte[] bArrE0 = ex1.e0(fileInputStream, (int) ex1.f0(fileInputStream, 4), (int) ex1.f0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            gp.j("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE0);
        try {
            or2[] or2VarArrG0 = g0(byteArrayInputStream, str, iF0);
            byteArrayInputStream.close();
            return or2VarArrG0;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final void g(a07 a07Var, boolean z2) {
        a07Var.setValue(Boolean.valueOf(z2));
    }

    public static or2[] g0(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new or2[0];
        }
        or2[] or2VarArr = new or2[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int iF0 = (int) ex1.f0(byteArrayInputStream, 2);
            int iF02 = (int) ex1.f0(byteArrayInputStream, 2);
            or2VarArr[i4] = new or2(str, new String(ex1.d0(byteArrayInputStream, iF0), StandardCharsets.UTF_8), ex1.f0(byteArrayInputStream, 4), iF02, (int) ex1.f0(byteArrayInputStream, 4), (int) ex1.f0(byteArrayInputStream, 4), new int[iF02], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            or2 or2Var = or2VarArr[i5];
            int iAvailable = byteArrayInputStream.available();
            int i6 = or2Var.f;
            int i7 = or2Var.g;
            TreeMap treeMap = or2Var.i;
            int i8 = iAvailable - i6;
            int iF03 = i3;
            while (byteArrayInputStream.available() > i8) {
                iF03 += (int) ex1.f0(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iF03), 1);
                int iF04 = (int) ex1.f0(byteArrayInputStream, 2);
                while (iF04 > 0) {
                    ex1.f0(byteArrayInputStream, 2);
                    int iF05 = (int) ex1.f0(byteArrayInputStream, 1);
                    if (iF05 != 6 && iF05 != 7) {
                        while (iF05 > 0) {
                            ex1.f0(byteArrayInputStream, 1);
                            int i9 = i3;
                            int i10 = i5;
                            for (int iF06 = (int) ex1.f0(byteArrayInputStream, 1); iF06 > 0; iF06--) {
                                ex1.f0(byteArrayInputStream, 2);
                            }
                            iF05--;
                            i3 = i9;
                            i5 = i10;
                        }
                    }
                    iF04--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i11 = i3;
            int i12 = i5;
            if (byteArrayInputStream.available() != i8) {
                gp.j("Read too much data during profile line parse");
                return null;
            }
            or2Var.h = b0(byteArrayInputStream, or2Var.e);
            BitSet bitSetValueOf = BitSet.valueOf(ex1.d0(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i7; i13++) {
                int i14 = bitSetValueOf.get(i13) ? 2 : i11;
                if (bitSetValueOf.get(i13 + i7)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | numValueOf.intValue()));
                }
            }
            i5 = i12 + 1;
            i3 = i11;
        }
        return or2VarArr;
    }

    public static final void h(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, boolean z2) {
        int i3;
        ib4 ib4Var2;
        dd4Var.h0(1705229455);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            ib4Var2 = ib4Var;
            i3 |= dd4Var.h(ib4Var2) ? 256 : Token.CASE;
        } else {
            ib4Var2 = ib4Var;
        }
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ou6 ou6VarF = tg9.f(ou6Var, 1.0f);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarF);
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
            lc5.d(ib4Var2, gjb.m0(tg9.f(lu6.a, 1.0f), 12.0f, 10.0f), !z2, null, null, null, null, null, jf0.G(1968340185, new a41(i4, z2), dd4Var), dd4Var, ((i3 >> 6) & 14) | 805306416, 504);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fj(z2, ou6Var, ib4Var, i2, 2);
        }
    }

    public static final void h0(aq5 aq5Var, gl3 gl3Var) {
        aq5.b0(aq5Var, gl3Var.a.concat("-spacer"), new se3(10), kc5.f, 4);
    }

    public static final void i(final t61 t61Var, final st5 st5Var, final boolean z2, final String str, final String str2, final pj7 pj7Var, final ou6 ou6Var, final ib4 ib4Var, final ib4 ib4Var2, final ib4 ib4Var3, final ib4 ib4Var4, final ib4 ib4Var5, final ib4 ib4Var6, final kb4 kb4Var, final ib4 ib4Var7, final ib4 ib4Var8, final yb4 yb4Var, final kb4 kb4Var2, final ib4 ib4Var9, final kb4 kb4Var3, dd4 dd4Var, final int i2) {
        boolean z3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(2086251125);
        int i3 = i2 | (dd4Var2.f(t61Var) ? 4 : 2) | (dd4Var2.f(st5Var) ? 32 : 16);
        boolean zG = dd4Var2.g(z2);
        int i4 = Token.CASE;
        int i5 = i3 | (zG ? 256 : 128) | (dd4Var2.f(str) ? 2048 : 1024) | (dd4Var2.f(str2) ? 16384 : 8192);
        boolean zF = dd4Var2.f(pj7Var);
        int i6 = Parser.ARGC_LIMIT;
        int i7 = i5 | (zF ? 131072 : 65536) | (dd4Var2.h(ib4Var) ? 8388608 : 4194304) | (dd4Var2.h(ib4Var2) ? 67108864 : 33554432) | (dd4Var2.h(ib4Var3) ? 536870912 : 268435456);
        int i8 = 805306368 | (dd4Var2.h(ib4Var4) ? 4 : 2) | (dd4Var2.h(ib4Var5) ? 32 : 16);
        if (dd4Var2.h(ib4Var6)) {
            i4 = 256;
        }
        int i9 = i8 | i4 | (dd4Var2.h(kb4Var) ? 2048 : 1024) | (dd4Var2.h(ib4Var7) ? 16384 : 8192);
        if (dd4Var2.h(ib4Var8)) {
            i6 = 131072;
        }
        int i10 = i9 | i6 | (dd4Var2.h(yb4Var) ? 1048576 : 524288) | (dd4Var2.h(kb4Var2) ? 8388608 : 4194304) | (dd4Var2.h(ib4Var9) ? 67108864 : 33554432);
        if (dd4Var2.V(i7 & 1, ((i7 & 306783379) == 306783378 && (i10 & 306783379) == 306783378) ? false : true)) {
            mx5 mx5Var = (mx5) dd4Var2.j(r26.a);
            px5 px5VarI = mx5Var.i();
            boolean zH = dd4Var2.h(mx5Var) | ((i10 & 14) == 4);
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (zH || objQ == obj) {
                objQ = new w(mx5Var, ib4Var4, null, 24);
                dd4Var2.p0(objQ);
            }
            lc5.u((yb4) objQ, dd4Var2, px5VarI);
            boolean z4 = t61Var.a;
            List list = t61Var.D;
            if (z4) {
                dd4Var2.f0(-963465373);
                md2.f(gjb.p0(lu6.a, 0.0f, pj7Var.d(), 0.0f, 0.0f, 13).e(tg9.c), dd4Var2, 0);
                dd4Var2.q(false);
            } else if (t61Var.c && list.isEmpty()) {
                dd4Var2.f0(-963175895);
                p35 p35VarK0 = lx1.k0(dd4Var2);
                String strK = wn9.K((pv9) eu9.E.getValue(), dd4Var2);
                String strK2 = wn9.K((pv9) eu9.F.getValue(), dd4Var2);
                String strK3 = wn9.K((pv9) mu9.Q.getValue(), dd4Var2);
                ou6 ou6VarK0 = gjb.k0(gjb.n0(tg9.c, 12.0f, 0.0f, 2), pj7Var);
                boolean z5 = (i10 & Token.ASSIGN_MOD) == 32;
                Object objQ2 = dd4Var2.Q();
                if (z5 || objQ2 == obj) {
                    objQ2 = new m50(22, ib4Var5);
                    dd4Var2.p0(objQ2);
                }
                bx1.d(p35VarK0, strK, strK2, ou6VarK0, strK3, (ib4) objQ2, dd4Var2, 0, 0);
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-962614268);
                boolean zIsEmpty = list.isEmpty();
                boolean z6 = (i10 & 896) == 256;
                Object objQ3 = dd4Var2.Q();
                if (z6 || objQ3 == obj) {
                    objQ3 = new m50(23, ib4Var6);
                    dd4Var2.p0(objQ3);
                }
                ib4 ib4Var10 = (ib4) objQ3;
                boolean z7 = (i10 & 7168) == 2048;
                Object objQ4 = dd4Var2.Q();
                if (z7 || objQ4 == obj) {
                    objQ4 = new mj(1, kb4Var);
                    dd4Var2.p0(objQ4);
                }
                kb4 kb4Var4 = (kb4) objQ4;
                boolean z8 = (57344 & i10) == 16384;
                Object objQ5 = dd4Var2.Q();
                if (z8 || objQ5 == obj) {
                    objQ5 = new m50(24, ib4Var7);
                    dd4Var2.p0(objQ5);
                }
                ib4 ib4Var11 = (ib4) objQ5;
                boolean z9 = (458752 & i10) == 131072;
                Object objQ6 = dd4Var2.Q();
                if (z9 || objQ6 == obj) {
                    objQ6 = new m50(25, ib4Var8);
                    dd4Var2.p0(objQ6);
                }
                ib4 ib4Var12 = (ib4) objQ6;
                boolean z10 = (i10 & 3670016) == 1048576;
                Object objQ7 = dd4Var2.Q();
                if (z10 || objQ7 == obj) {
                    z3 = zIsEmpty;
                    objQ7 = new v8(yb4Var, 1, (byte) 0);
                    dd4Var2.p0(objQ7);
                } else {
                    z3 = zIsEmpty;
                }
                yb4 yb4Var2 = (yb4) objQ7;
                boolean z11 = (i10 & 29360128) == 8388608;
                Object objQ8 = dd4Var2.Q();
                if (z11 || objQ8 == obj) {
                    objQ8 = new mj(2, kb4Var2);
                    dd4Var2.p0(objQ8);
                }
                e(t61Var, st5Var, z2, str, str2, z3, pj7Var, ou6Var, ib4Var10, kb4Var4, ib4Var11, ib4Var12, yb4Var2, (kb4) objQ8, ib4Var, ib4Var2, ib4Var9, ib4Var3, kb4Var3, dd4Var2, (i7 & 65534) | ((i7 << 3) & 3670016) | 12582912, ((i7 >> 9) & 516096) | ((i10 >> 6) & 3670016) | ((i7 >> 6) & 29360128) | 100663296);
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
            }
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(st5Var, z2, str, str2, pj7Var, ou6Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, ib4Var6, kb4Var, ib4Var7, ib4Var8, yb4Var, kb4Var2, ib4Var9, kb4Var3, i2) { // from class: y41
                public final /* synthetic */ ib4 A;
                public final /* synthetic */ ib4 B;
                public final /* synthetic */ yb4 C;
                public final /* synthetic */ kb4 D;
                public final /* synthetic */ ib4 E;
                public final /* synthetic */ kb4 F;
                public final /* synthetic */ st5 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ pj7 f;
                public final /* synthetic */ ou6 s;
                public final /* synthetic */ ib4 t;
                public final /* synthetic */ ib4 u;
                public final /* synthetic */ ib4 v;
                public final /* synthetic */ ib4 w;
                public final /* synthetic */ ib4 x;
                public final /* synthetic */ ib4 y;
                public final /* synthetic */ kb4 z;

                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(1572865);
                    kl8.i(this.a, this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, (dd4) obj2, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final void i0(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void j(ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        Object obj;
        dd4Var.h0(-1061779366);
        int i3 = (i2 & 6) == 0 ? (dd4Var.f(ou6Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(ib4Var2) ? 256 : Token.CASE;
        }
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            String strK = wn9.K((pv9) iu9.n0.getValue(), dd4Var);
            long j2 = ((q96) dd4Var.j(s96.a)).a.a;
            Object objQ = dd4Var.Q();
            Object obj2 = vl1.a;
            if (objQ == obj2) {
                aq4 aq4Var = aq4.a;
                bp bpVarD = aq4.d(strK);
                zo zoVar = new zo();
                zoVar.d(bpVarD);
                for (ap apVar : bpVarD.d(0, bpVarD.b.length())) {
                    zoVar.c(new vn9(j2, 0L, (a84) null, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, (jda) null, (o89) null, 65534), apVar.b, apVar.c);
                    obj2 = obj2;
                }
                obj = obj2;
                objQ = zoVar.l();
                dd4Var.p0(objQ);
            } else {
                obj = obj2;
            }
            bp bpVar = (bp) objQ;
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
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = dk9.x((Object) null);
                dd4Var.p0(objQ2);
            }
            a07 a07Var = (a07) objQ2;
            boolean z2 = ((i3 & Token.ASSIGN_MOD) == 32) | ((i3 & 896) == 256);
            Object objQ3 = dd4Var.Q();
            if (z2 || objQ3 == obj) {
                objQ3 = new s51(a07Var, bpVar, ib4Var, ib4Var2);
                dd4Var.p0(objQ3);
            }
            lu6 lu6Var = lu6.a;
            ou6 ou6VarE = gjb.l0(zn0.a.a(lu6Var, bv4.f), 24.0f).e(r1a.b(lu6Var, heb.a, (PointerInputEventHandler) objQ3));
            ur9 ur9Var = s96.a;
            uka ukaVarA = uka.a(((q96) dd4Var.j(ur9Var)).b.j, ((q96) dd4Var.j(ur9Var)).a.q, 0L, (a84) null, (c64) null, 0L, 0L, (iy5) null, 16744446);
            Object objQ4 = dd4Var.Q();
            if (objQ4 == obj) {
                objQ4 = new x6(a07Var, 22);
                dd4Var.p0(objQ4);
            }
            nha.d(bpVar, ou6VarE, 0L, 0L, 0L, (vaa) null, 0L, 0, false, 0, 0, (Map) null, (kb4) objQ4, ukaVarA, dd4Var, 6, 12582912, 131068);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yi(ou6Var, ib4Var, ib4Var2, i2, 3);
        }
    }

    public static final void j0(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static final void k(String str, boolean z2, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1796121145);
        int i3 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.g(z2) ? 256 : Token.CASE) | (dd4Var2.h(ib4Var) ? 16384 : 8192);
        if (dd4Var2.V(i3 & 1, (74883 & i3) != 74882)) {
            ou6 ou6VarY = yn2.y(dd4Var2, tg9.f(ou6Var, 1.0f));
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarY);
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
            ou6 ou6VarP0 = gjb.p0(gjb.n0(yib.B(tg9.f(lu6Var, 1.0f), 3), 12.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 6.0f, 5);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarP0);
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
            sw1.a((i3 >> 9) & Token.ASSIGN_MOD, ib4Var, dd4Var2, (ou6) null);
            nha.c(str, new bp5(1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.g, dd4Var, i3 & 14, 24576, 114684);
            dd4Var2 = dd4Var;
            if (z2) {
                xv5.y(dd4Var2, -535303519, lu6Var, 4.0f, dd4Var2);
                kf0.n(ib4Var2, tg9.n(lu6Var, 40.0f), false, (kx4) null, (t89) null, t96.f, dd4Var2, 1572918, 60);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-534903743);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new z41(str, z2, ou6Var, ib4Var, ib4Var2, i2, 0);
        }
    }

    /* JADX WARN: Finally extract failed */
    public static boolean k0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, or2[] or2VarArr) throws IOException {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = m79.B;
        byte[] bArr3 = m79.A;
        byte[] bArr4 = m79.x;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = m79.y;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrT = T(or2VarArr, bArr5);
                ex1.l0(byteArrayOutputStream, or2VarArr.length, 1);
                ex1.l0(byteArrayOutputStream, bArrT.length, 4);
                byte[] bArrG = ex1.G(bArrT);
                ex1.l0(byteArrayOutputStream, bArrG.length, 4);
                byteArrayOutputStream.write(bArrG);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                ex1.l0(byteArrayOutputStream, or2VarArr.length, 1);
                for (or2 or2Var : or2VarArr) {
                    int size = or2Var.i.size() * 4;
                    String strV = V(or2Var.a, or2Var.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    ex1.m0(byteArrayOutputStream, strV.getBytes(charset).length);
                    ex1.m0(byteArrayOutputStream, or2Var.h.length);
                    ex1.l0(byteArrayOutputStream, size, 4);
                    ex1.l0(byteArrayOutputStream, or2Var.c, 4);
                    byteArrayOutputStream.write(strV.getBytes(charset));
                    Iterator it = or2Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        ex1.m0(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        ex1.m0(byteArrayOutputStream, 0);
                    }
                    for (int i4 : or2Var.h) {
                        ex1.m0(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = m79.z;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrT2 = T(or2VarArr, bArr6);
                ex1.l0(byteArrayOutputStream, or2VarArr.length, 1);
                ex1.l0(byteArrayOutputStream, bArrT2.length, 4);
                byte[] bArrG2 = ex1.G(bArrT2);
                ex1.l0(byteArrayOutputStream, bArrG2.length, 4);
                byteArrayOutputStream.write(bArrG2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            ex1.m0(byteArrayOutputStream, or2VarArr.length);
            for (or2 or2Var2 : or2VarArr) {
                String str = or2Var2.a;
                TreeMap treeMap = or2Var2.i;
                String strV2 = V(str, or2Var2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                ex1.m0(byteArrayOutputStream, strV2.getBytes(charset2).length);
                ex1.m0(byteArrayOutputStream, treeMap.size());
                ex1.m0(byteArrayOutputStream, or2Var2.h.length);
                ex1.l0(byteArrayOutputStream, or2Var2.c, 4);
                byteArrayOutputStream.write(strV2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    ex1.m0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : or2Var2.h) {
                    ex1.m0(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            ex1.m0(byteArrayOutputStream2, or2VarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (or2 or2Var3 : or2VarArr) {
                ex1.l0(byteArrayOutputStream2, or2Var3.c, 4);
                ex1.l0(byteArrayOutputStream2, or2Var3.d, 4);
                ex1.l0(byteArrayOutputStream2, or2Var3.g, 4);
                String strV3 = V(or2Var3.a, or2Var3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strV3.getBytes(charset3).length;
                ex1.m0(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(strV3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            f3c f3cVar = new f3c(byteArray, 1, false);
            byteArrayOutputStream2.close();
            arrayList.add(f3cVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < or2VarArr.length) {
                try {
                    or2 or2Var4 = or2VarArr[i8];
                    ex1.m0(byteArrayOutputStream3, i8);
                    ex1.m0(byteArrayOutputStream3, or2Var4.e);
                    i9 = i9 + 4 + (or2Var4.e * i6);
                    int[] iArr = or2Var4.h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        ex1.m0(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i6 = i6;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                }
            }
            int i12 = i6;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            f3c f3cVar2 = new f3c(byteArray2, 3, true);
            byteArrayOutputStream3.close();
            arrayList.add(f3cVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < or2VarArr.length; i14++) {
                try {
                    or2 or2Var5 = or2VarArr[i14];
                    Iterator it3 = or2Var5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        n0(byteArrayOutputStream4, iIntValue, or2Var5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            o0(byteArrayOutputStream4, or2Var5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            ex1.m0(byteArrayOutputStream3, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i13 + 6;
                            ex1.l0(byteArrayOutputStream3, length4, 4);
                            ex1.m0(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i13 = i15 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            f3c f3cVar3 = new f3c(byteArray5, 4, true);
            byteArrayOutputStream3.close();
            arrayList.add(f3cVar3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            ex1.l0(byteArrayOutputStream, arrayList.size(), 4);
            int i16 = 0;
            while (i16 < arrayList.size()) {
                f3c f3cVar4 = (f3c) arrayList.get(i16);
                int i17 = f3cVar4.a;
                byte[] bArr7 = f3cVar4.b;
                if (i17 != 1) {
                    i2 = i12;
                    if (i17 == i2) {
                        j2 = 1;
                    } else if (i17 == 3) {
                        j2 = 2;
                    } else if (i17 == 4) {
                        j2 = 3;
                    } else {
                        if (i17 != 5) {
                            throw null;
                        }
                        j2 = 4;
                    }
                } else {
                    i2 = i12;
                    j2 = 0;
                }
                ex1.l0(byteArrayOutputStream, j2, 4);
                ex1.l0(byteArrayOutputStream, size2, 4);
                if (f3cVar4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrG3 = ex1.G(bArr7);
                    arrayList2.add(bArrG3);
                    ex1.l0(byteArrayOutputStream, bArrG3.length, 4);
                    ex1.l0(byteArrayOutputStream, length5, 4);
                    length = bArrG3.length;
                } else {
                    arrayList2.add(bArr7);
                    ex1.l0(byteArrayOutputStream, bArr7.length, 4);
                    ex1.l0(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i16++;
                i12 = i2;
            }
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i18));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static final void l(gl3 gl3Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        dd4Var.h0(626766062);
        int i3 = (dd4Var.h(gl3Var) ? 4 : 2) | i2 | (dd4Var.h(kb4Var) ? 32 : 16);
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            lu6 lu6Var = lu6.a;
            ou6 ou6VarL0 = s32.L0(dd4Var, lu6Var);
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
            int i5 = i3 & 14;
            int i6 = i3 & Token.ASSIGN_MOD;
            D(gl3Var, kb4Var, dd4Var, 8 | i5 | i6);
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            rj7 rj7VarO = gjb.o(2, 12.0f);
            mv mvVar = new mv(8.0f, true, new gp(5));
            boolean z2 = (i5 == 4 || dd4Var.h(gl3Var)) | (i6 == 32);
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new yk3(gl3Var, kb4Var, i4);
                dd4Var.p0(objQ);
            }
            rw1.k(ou6VarF, null, rj7VarO, false, mvVar, null, null, false, null, (kb4) objQ, dd4Var, 24966, 490);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xk3(gl3Var, kb4Var, i2, 3);
        }
    }

    public static void l0(ByteArrayOutputStream byteArrayOutputStream, or2 or2Var) throws IOException {
        o0(byteArrayOutputStream, or2Var);
        int i2 = or2Var.g;
        int[] iArr = or2Var.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            ex1.m0(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : or2Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i6 = iIntValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i7 = iIntValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(defpackage.el3 r33, ou6 r34, defpackage.x13 r35, defpackage.ib4 r36, dd4 r37, int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl8.m(el3, ou6, x13, ib4, dd4, int, int):void");
    }

    public static void m0(ByteArrayOutputStream byteArrayOutputStream, or2 or2Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        ex1.m0(byteArrayOutputStream, str.getBytes(charset).length);
        ex1.m0(byteArrayOutputStream, or2Var.e);
        ex1.l0(byteArrayOutputStream, or2Var.f, 4);
        ex1.l0(byteArrayOutputStream, or2Var.c, 4);
        ex1.l0(byteArrayOutputStream, or2Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static final void n(String str, t27 t27Var, pj7 pj7Var, ou6 ou6Var, dd4 dd4Var, int i2) {
        int i3;
        str.getClass();
        t27Var.getClass();
        pj7Var.getClass();
        dd4Var.h0(-1424760941);
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
            i3 |= dd4Var.f(ou6Var) ? 2048 : 1024;
        }
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            String strConcat = "explore-".concat(str);
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = new wj0(str, 21);
                dd4Var.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ry6 ry6VarD = pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b;
            ev8 ev8VarA = ek5.a(dd4Var);
            a91 a91VarA = ug8.a(il3.class);
            il3 il3Var = (il3) ((qtb) qx1.N(a91VarA, pj4VarA.f(), dx1.h(a91VarA.f(), "-", strConcat), ry6VarD, ev8VarA, ib4Var));
            a07 a07VarB = bx1.B(il3Var.e, dd4Var);
            if (((hl3) a07VarB.getValue()).a) {
                dd4Var.f0(2108997806);
                r(gjb.k0(ou6Var.e(tg9.c), pj7Var), dd4Var, 0);
                dd4Var.q(false);
            } else if (((hl3) a07VarB.getValue()).b) {
                dd4Var.f0(2109124782);
                String str2 = ((hl3) a07VarB.getValue()).c;
                ou6 ou6VarK0 = gjb.k0(ou6Var.e(tg9.c), pj7Var);
                boolean zF = dd4Var.f(il3Var);
                Object objQ2 = dd4Var.Q();
                if (zF || objQ2 == obj) {
                    objQ2 = new d7(0, il3Var, il3.class, "refresh", "refresh()V", 0, 19);
                    dd4Var.p0(objQ2);
                }
                o(0, (ib4) ((ei5) objQ2), dd4Var, ou6VarK0, str2);
                dd4Var.q(false);
            } else {
                dd4Var.f0(2109368504);
                fl3 fl3Var = ((hl3) a07VarB.getValue()).d;
                ou6 ou6VarE = ou6Var.e(tg9.c);
                boolean z3 = (i4 == 4) | ((i3 & Token.ASSIGN_MOD) == 32);
                Object objQ3 = dd4Var.Q();
                if (z3 || objQ3 == obj) {
                    objQ3 = new fu2(t27Var, str);
                    dd4Var.p0(objQ3);
                }
                p(fl3Var, pj7Var, ou6VarE, (kb4) objQ3, dd4Var, ((i3 >> 3) & Token.ASSIGN_MOD) | 8);
                dd4Var.q(false);
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new o50((Object) str, (Object) t27Var, (Object) pj7Var, ou6Var, i2, 4);
        }
    }

    public static void n0(ByteArrayOutputStream byteArrayOutputStream, int i2, or2 or2Var) throws IOException {
        int i3 = or2Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : or2Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i6 = (i4 * i3) + iIntValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final void o(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, String str) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1795500879);
        int i3 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE);
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
            dd4Var2.f0(-1573090912);
            String strK = str.length() == 0 ? wn9.K((pv9) eu9.E.getValue(), dd4Var2) : str;
            dd4Var2.q(false);
            nha.c(strK, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.j, dd4Var, 0, 0, 131070);
            dd4Var2 = dd4Var;
            un9.a(dd4Var2, tg9.h(lu6.a, 12.0f));
            kc5.n(i25.c((m53) f53.d0.getValue(), dd4Var2, 0), wn9.K((pv9) mu9.Q.getValue(), dd4Var2), false, null, null, null, null, null, ib4Var, dd4Var2, (i3 << 18) & 234881024, 252);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new gv0(str, ou6Var, ib4Var, i2, 6);
        }
    }

    public static void o0(ByteArrayOutputStream byteArrayOutputStream, or2 or2Var) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : or2Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                ex1.m0(byteArrayOutputStream, iIntValue - i2);
                ex1.m0(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    public static final void p(fl3 fl3Var, pj7 pj7Var, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        int i3;
        dd4Var.h0(1814539998);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? dd4Var.f(fl3Var) : dd4Var.h(fl3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 2048 : 1024;
        }
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            yh4 yh4Var = new yh4(150.0f);
            szb szbVarW = yib.w(pj7Var, gjb.o(2, 12.0f));
            mv mvVar = new mv(8.0f, true, new gp(5));
            mv mvVar2 = new mv(8.0f, true, new gp(5));
            boolean z2 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && dd4Var.h(fl3Var))) | ((i3 & 7168) == 2048);
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new n82(24, fl3Var, kb4Var);
                dd4Var.p0(objQ);
            }
            gx1.i(yh4Var, ou6Var, null, szbVarW, mvVar, mvVar2, null, false, 0L, 0L, pj7Var, 0.0f, (kb4) objQ, dd4Var, ((i3 >> 3) & Token.ASSIGN_MOD) | 1769472, i3 & Token.ASSIGN_MOD, 6036);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new o50(fl3Var, pj7Var, ou6Var, kb4Var, i2, 5);
        }
    }

    public static final void q(el3 el3Var, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        ou6 ou6Var2;
        dd4 dd4Var2 = dd4Var;
        String str = el3Var.d;
        String str2 = el3Var.c;
        String str3 = el3Var.a;
        dd4Var2.h0(1752740399);
        int i3 = i2 | (dd4Var2.f(el3Var) ? 4 : 2) | 48 | (dd4Var2.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarW = t96.w(tg9.f(ou6Var3, 1.0f), s00.p(dd4Var2).b);
            boolean z2 = (i3 & 896) == 256;
            Object objQ = dd4Var2.Q();
            int i4 = 3;
            if (z2 || objQ == vl1.a) {
                objQ = new xf3(i4, ib4Var);
                dd4Var2.p0(objQ);
            }
            ou6 ou6VarN0 = gjb.n0(yn2.s(ou6VarW, false, 0.0f, (ib4) objQ, 3), 0.0f, 4.0f, 1);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarN0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var2, eq8VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            ou6 ou6VarW2 = t96.w(sdc.e0(0.6666667f, tg9.r(ou6Var3, 56.0f), false), s00.p(dd4Var2).b);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarW2);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ha6VarD);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            w05.d(str3, el3Var.b, el3Var.e, ra1.d, tg9.c, dd4Var2, 27648);
            dd4Var2.q(true);
            un9.a(dd4Var2, tg9.r(ou6Var3, 12.0f));
            bp5 bp5Var = new bp5(1.0f, true);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, bp5Var);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            nha.c(str3, (ou6) null, 0L, (g60) null, 0L, (t74) null, a84.u, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 2, 0, (kb4) null, s00.q(dd4Var2).j, dd4Var, 1572864, 24960, 110526);
            dd4Var2 = dd4Var;
            if (str2.length() > 0) {
                dd4Var2.f0(1213876105);
                nha.c(str2, (ou6) null, lc1.c(0.6f, s00.o(dd4Var2).q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 2, 0, (kb4) null, s00.q(dd4Var2).l, dd4Var, 0, 24960, 110586);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(1214182137);
                dd4Var2.q(false);
            }
            if (str.length() > 0) {
                dd4Var2.f0(1214248229);
                nha.c(str, (ou6) null, s00.o(dd4Var2).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, s00.q(dd4Var2).o, dd4Var, 0, 24960, 110586);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(1214527353);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
            dd4Var2.q(true);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var2.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new mt(el3Var, ou6Var2, ib4Var, i2, 14);
        }
    }

    public static final void r(ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(233755074);
        int i3 = i2 | (dd4Var2.f(ou6Var) ? 4 : 2);
        if (dd4Var2.V(i3 & 1, (i3 & 3) != 2)) {
            ha6 ha6VarD = pn0.d(bv4.f, false);
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
            nha.c("...", (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var, 6, 0, 262142);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var, i2, 4);
        }
    }

    public static final void s(boolean z2, boolean z3, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        Object obj;
        boolean z4;
        kb4 kb4Var3;
        boolean z5;
        boolean z6 = z2;
        dd4 dd4Var2 = dd4Var;
        wf0 wf0Var = bv4.x;
        dd4Var2.h0(735388439);
        int i3 = i2 | (dd4Var2.g(z6) ? 4 : 2) | (dd4Var2.g(z3) ? 32 : 16) | (dd4Var2.f(ou6Var) ? 256 : Token.CASE) | (dd4Var2.h(kb4Var) ? 2048 : 1024) | (dd4Var2.h(kb4Var2) ? 16384 : 8192);
        if (dd4Var2.V(i3 & 1, (i3 & 9363) != 9362)) {
            iv ivVar = pv.a;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var2, 48);
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
            un9.s(jmVar, dd4Var2, eq8VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            rp8 rp8Var = tp8.a;
            lu6 lu6Var = lu6.a;
            ou6 ou6VarG = fw.G(t96.w(lu6Var, rp8Var), 1.0f, dd1.g(((q96) dd4Var2.j(s96.a)).a, 4.0f), rp8Var);
            eq8 eq8VarA2 = dq8.a(ivVar, bv4.w, dd4Var2, 0);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarG);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA2);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            dd4Var2.f0(1709559795);
            List listR = wm9.r((hv9) rv.d.getValue(), dd4Var2);
            int size = listR.size();
            int i4 = 0;
            while (true) {
                obj = vl1.a;
                if (i4 >= size) {
                    break;
                }
                String str = (String) listR.get(i4);
                boolean z7 = z6 == (i4 == 1);
                ur9 ur9Var = s96.a;
                ou6 ou6VarZ = qx1.z(fe.L(lu6Var, dd1.g(((q96) dd4Var2.j(ur9Var)).a, 1.0f), jf0.G), z7, new vj1(26), dd4Var2, 0);
                boolean zD = ((i3 & 7168) == 2048) | dd4Var2.d(i4);
                Object objQ = dd4Var2.Q();
                if (zD || objQ == obj) {
                    z5 = false;
                    objQ = new bk0(kb4Var, i4, 0);
                    dd4Var2.p0(objQ);
                } else {
                    z5 = false;
                }
                ou6 ou6VarJ = fw.J(null, (ib4) objQ, ou6VarZ, z5, 15);
                ha6 ha6VarD = pn0.d(bv4.b, z5);
                int iHashCode3 = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL3 = dd4Var2.l();
                ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarJ);
                ml1.k.getClass();
                um1 um1Var2 = ll1.b;
                dd4Var2.j0();
                if (dd4Var2.S) {
                    dd4Var2.k(um1Var2);
                } else {
                    dd4Var2.s0();
                }
                un9.s(ll1.f, dd4Var2, ha6VarD);
                un9.s(ll1.e, dd4Var2, lr7VarL3);
                un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode3));
                un9.r(dd4Var2, ll1.h);
                un9.s(ll1.d, dd4Var2, ou6VarL03);
                dd4 dd4Var3 = dd4Var2;
                nha.c(str, gjb.m0(zn0.a.a(lu6Var, bv4.f), 12.0f, 8.0f), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.k, dd4Var3, 0, 24576, 114680);
                dd4Var3.q(true);
                z6 = z2;
                dd4Var2 = dd4Var3;
                i4++;
            }
            dd4 dd4Var4 = dd4Var2;
            dd4Var4.q(false);
            dd4Var4.q(true);
            un9.a(dd4Var4, new bp5(1.0f, true));
            boolean z8 = ((i3 & Token.ASSIGN_MOD) == 32) | ((57344 & i3) == 16384);
            Object objQ2 = dd4Var4.Q();
            if (z8 || objQ2 == obj) {
                z4 = z3;
                kb4Var3 = kb4Var2;
                objQ2 = new ck0(0, kb4Var3, z4);
                dd4Var4.p0(objQ2);
            } else {
                z4 = z3;
                kb4Var3 = kb4Var2;
            }
            ou6 ou6VarV = yn2.V(1, (ib4) objQ2, dd4Var4, lu6Var, false);
            eq8 eq8VarA3 = dq8.a(ivVar, wf0Var, dd4Var4, 48);
            int iHashCode4 = Long.hashCode(dd4Var4.T);
            lr7 lr7VarL4 = dd4Var4.l();
            ou6 ou6VarL04 = s32.L0(dd4Var4, ou6VarV);
            ml1.k.getClass();
            um1 um1Var3 = ll1.b;
            dd4Var4.j0();
            if (dd4Var4.S) {
                dd4Var4.k(um1Var3);
            } else {
                dd4Var4.s0();
            }
            un9.s(ll1.f, dd4Var4, eq8VarA3);
            un9.s(ll1.e, dd4Var4, lr7VarL4);
            un9.s(ll1.g, dd4Var4, Integer.valueOf(iHashCode4));
            un9.r(dd4Var4, ll1.h);
            un9.s(ll1.d, dd4Var4, ou6VarL04);
            nha.c(wn9.K((pv9) iu9.p.getValue(), dd4Var4), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var4.j(s96.a)).b.j, dd4Var4, 0, 0, 131070);
            dd4Var2 = dd4Var;
            vo1.e(z4, kb4Var3, null, false, null, dd4Var2, ((i3 >> 3) & 14) | ((i3 >> 9) & Token.ASSIGN_MOD));
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tj0(z2, z3, ou6Var, kb4Var, kb4Var2, i2, 0);
        }
    }

    public static final void t(xm3 xm3Var, ou6 ou6Var, ib4 ib4Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        vf0 vf0Var = bv4.A;
        dd4Var2.h0(1502029719);
        int i3 = i2 | (dd4Var2.h(xm3Var) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE) | (dd4Var2.h(kb4Var) ? 2048 : 1024);
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
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
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
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
            to3 to3Var = xm3Var.d;
            po3 po3Var = new po3(to3Var.r, to3Var.a, to3Var.c);
            qr1 qr1Var = ra1.d;
            ou6 ou6VarN = tg9.n(lu6Var, 32.0f);
            ur9 ur9Var = s96.a;
            w05.a(po3Var, qr1Var, false, null, s32.d, t96.w(ou6VarN, ((q96) dd4Var2.j(ur9Var)).c.b), null, dd4Var, 196656, 412);
            un9.a(dd4Var, tg9.r(lu6Var, 8.0f));
            nha.c(xm3Var.d.b, new bp5(1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.h, dd4Var, 0, 0, 131068);
            dd4Var2 = dd4Var;
            xv5.z(dd4Var2, true, lu6Var, 9.0f, dd4Var2);
            boolean z2 = xm3Var.a;
            Object obj = vl1.a;
            if (z2) {
                dd4Var2.f0(-372734009);
                ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                mv mvVar = new mv(8.0f, true, new gp(5));
                Object objQ = dd4Var2.Q();
                if (objQ == obj) {
                    objQ = new vi0(4);
                    dd4Var2.p0(objQ);
                }
                pu1.m(ou6VarF2, null, null, mvVar, null, null, false, (kb4) objQ, dd4Var2, 113270790, 110);
                dd4Var2.q(false);
            } else {
                int i4 = 0;
                boolean z3 = xm3Var.b;
                fu6 fu6Var = pv.e;
                if (z3) {
                    dd4Var2.f0(-372231437);
                    ou6 ou6VarH = tg9.h(tg9.f(lu6Var, 1.0f), 200.0f);
                    ie1 ie1VarA2 = ge1.a(fu6Var, vf0Var, dd4Var2, 54);
                    int iHashCode3 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL3 = dd4Var2.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarH);
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
                    dd4Var2.f0(1662306301);
                    String strK = xm3Var.c;
                    if (strK.length() == 0) {
                        strK = wn9.K((pv9) eu9.E.getValue(), dd4Var2);
                    }
                    dd4Var2.q(false);
                    nha.c(strK, (ou6) null, 0L, (g60) null, wn9.x(20), (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, 24576, 0, 130030);
                    un9.a(dd4Var, tg9.h(lu6Var, 24.0f));
                    kc5.n(i25.c((m53) f53.a0.getValue(), dd4Var, 0), wn9.K((pv9) mu9.S.getValue(), dd4Var), false, null, null, null, null, null, ib4Var, dd4Var, (i3 << 18) & 234881024, 252);
                    dd4Var2 = dd4Var;
                    dd4Var2.q(true);
                    dd4Var2.q(false);
                } else {
                    List list = xm3Var.f;
                    if (list == null || list.isEmpty()) {
                        dd4Var2.f0(-371266128);
                        ou6 ou6VarH2 = tg9.h(tg9.f(lu6Var, 1.0f), 200.0f);
                        ie1 ie1VarA3 = ge1.a(fu6Var, vf0Var, dd4Var2, 54);
                        int iHashCode4 = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL4 = dd4Var2.l();
                        ou6 ou6VarL04 = s32.L0(dd4Var2, ou6VarH2);
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var);
                        } else {
                            dd4Var2.s0();
                        }
                        un9.s(jmVar, dd4Var2, ie1VarA3);
                        un9.s(jmVar2, dd4Var2, lr7VarL4);
                        ky0.v(iHashCode4, dd4Var2, jmVar3, dd4Var2, kdVar);
                        un9.s(jmVar4, dd4Var2, ou6VarL04);
                        nha.c(wn9.K((pv9) eu9.y.getValue(), dd4Var2), (ou6) null, 0L, (g60) null, wn9.x(20), (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, 24576, 0, 130030);
                        un9.a(dd4Var, tg9.h(lu6Var, 24.0f));
                        kc5.n(i25.c((m53) f53.a0.getValue(), dd4Var, 0), wn9.K((pv9) mu9.S.getValue(), dd4Var), false, null, null, null, null, null, ib4Var, dd4Var, (i3 << 18) & 234881024, 252);
                        dd4Var2 = dd4Var;
                        dd4Var2.q(true);
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(-370370693);
                        ou6 ou6VarF3 = tg9.f(lu6Var, 1.0f);
                        mv mvVar2 = new mv(8.0f, true, new gp(5));
                        boolean zH = dd4Var2.h(xm3Var) | ((i3 & 7168) == 2048);
                        Object objQ2 = dd4Var2.Q();
                        if (zH || objQ2 == obj) {
                            objQ2 = new vj0(i4, xm3Var, kb4Var);
                            dd4Var2.p0(objQ2);
                        }
                        pu1.m(ou6VarF3, null, null, mvVar2, null, null, false, (kb4) objQ2, dd4Var2, 24582, 238);
                        dd4Var2.q(false);
                    }
                }
            }
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ev0(xm3Var, ou6Var, ib4Var, kb4Var, i2, 10);
        }
    }

    public static final void u(List list, szb szbVar, ou6 ou6Var, kb4 kb4Var, yb4 yb4Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-1079384769);
        int i3 = i2 | (dd4Var.h(list) ? 4 : 2) | (dd4Var.f(szbVar) ? 32 : 16) | (dd4Var.h(kb4Var) ? 2048 : 1024) | (dd4Var.h(yb4Var) ? 16384 : 8192);
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            boolean zH = dd4Var.h(list) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                objQ = new v6(5, list, kb4Var, yb4Var);
                dd4Var.p0(objQ);
            }
            gx1.h(ou6Var, null, szbVar, null, null, null, false, null, 0L, 0L, 0.0f, (kb4) objQ, dd4Var, 6 | ((i3 << 3) & 896), 0, 4090);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uj0(list, szbVar, ou6Var, kb4Var, yb4Var, i2, 0);
        }
    }

    public static final void v(int i2, int i3, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, boolean z2) {
        dd4Var.h0(-123586997);
        int i4 = (dd4Var.g(z2) ? 4 : 2) | i3 | (dd4Var.d(i2) ? 32 : 16) | (dd4Var.f(ou6Var) ? 256 : Token.CASE) | (dd4Var.h(ib4Var) ? 2048 : 1024);
        int i5 = 0;
        if (dd4Var.V(i4 & 1, (i4 & 1171) != 1170)) {
            kf0.d(z2, ou6Var, wd3.c((by3) null, 3), wd3.d((by3) null, 3), (String) null, jf0.G(-1882930573, new h51(i2, ib4Var, i5), dd4Var), dd4Var, (i4 & 14) | 200064 | ((i4 >> 3) & Token.ASSIGN_MOD), 16);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fj(z2, i2, ou6Var, ib4Var, i3);
        }
    }

    public static final void w(gl3 gl3Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        dd4Var.h0(1857529368);
        int i3 = 2;
        int i4 = (dd4Var.h(gl3Var) ? 4 : 2) | i2 | (dd4Var.h(kb4Var) ? 32 : 16);
        if (dd4Var.V(i4 & 1, (i4 & 19) != 18)) {
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            lu6 lu6Var = lu6.a;
            ou6 ou6VarL0 = s32.L0(dd4Var, lu6Var);
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
            int i5 = i4 & 14;
            int i6 = i4 & Token.ASSIGN_MOD;
            D(gl3Var, kb4Var, dd4Var, 8 | i5 | i6);
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            rj7 rj7VarO = gjb.o(2, 12.0f);
            mv mvVar = new mv(8.0f, true, new gp(5));
            boolean z2 = (i5 == 4 || dd4Var.h(gl3Var)) | (i6 == 32);
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new yk3(gl3Var, kb4Var, i3);
                dd4Var.p0(objQ);
            }
            rw1.k(ou6VarF, null, rj7VarO, false, mvVar, null, null, false, null, (kb4) objQ, dd4Var, 24966, 490);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xk3(gl3Var, kb4Var, i2, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(int r44, defpackage.kb4 r45, dd4 r46, ou6 r47, java.util.List r48) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl8.x(int, kb4, dd4, ou6, java.util.List):void");
    }

    public static final void y(boolean z2, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var.h0(-851506065);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.h(kb4Var) ? 32 : 16) | (dd4Var.h(kb4Var2) ? 256 : Token.CASE);
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            a07 a07VarB = bx1.B(((em5) ((qtb) qx1.N(ug8.a(em5.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null))).c, dd4Var);
            if (xzb.a(dd4Var)) {
                dd4Var.f0(-1140010302);
                int i4 = i3 & 14;
                int i5 = i3 << 3;
                z(z2, ((dm5) a07VarB.getValue()).a, kb4Var, kb4Var2, dd4Var, i4 | (i5 & 896) | (i5 & 7168));
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1139765433);
                int i6 = i3 & 14;
                int i7 = i3 << 3;
                A(z2, ((dm5) a07VarB.getValue()).a, kb4Var, kb4Var2, dd4Var, i6 | (i7 & 896) | (i7 & 7168));
                dd4Var.q(false);
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ob3(z2, kb4Var, kb4Var2, i2, 4);
        }
    }

    public static final void z(boolean z2, List list, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        kb4 kb4Var3;
        dd4Var.h0(-161986343);
        int i3 = (dd4Var.g(z2) ? 4 : 2) | i2 | (dd4Var.h(list) ? 32 : 16);
        if ((i2 & 384) == 0) {
            kb4Var3 = kb4Var;
            i3 |= dd4Var.h(kb4Var3) ? 256 : Token.CASE;
        } else {
            kb4Var3 = kb4Var;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 2048 : 1024;
        }
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            fw.q(z2, kb4Var3, null, true, null, null, 0L, 0L, 0.0f, 0L, null, jf0.G(-1131559427, new c41(list, yib.e(dd4Var, 14), kb4Var2, 21), dd4Var), dd4Var, (i3 & 14) | 3072 | ((i3 >> 3) & Token.ASSIGN_MOD), 48, 2036);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new hn6(z2, list, kb4Var, kb4Var2, i2, 1);
        }
    }
}

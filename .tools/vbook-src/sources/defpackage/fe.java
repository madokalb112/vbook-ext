package defpackage;

import android.graphics.Shader;
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class fe {
    public static final rj1 f;
    public static be5 g0;
    public static final rj1 h;
    public static final h1a i0;
    public static final rj1 k;
    public static final rj1 l;
    public static final rj1 o;
    public static final rj1 p;
    public static final rj1 r;
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final rj1 c = new rj1(new bk1(8), false, 1693025014);
    public static final rj1 d = new rj1(new vj1(4), false, -1218034582);
    public static final rj1 e = new rj1(new vj1(5), false, 492616265);
    public static final rj1 g = new rj1(new vj1(13), false, -1870705579);
    public static final rj1 i = new rj1(new hk1(15), false, -1621457085);
    public static final rj1 j = new rj1(new hk1(16), false, 1224012102);
    public static final rj1 m = new rj1(new jk1(21), false, 2136575966);
    public static final rj1 n = new rj1(new lk1(22), false, 1578441477);
    public static final rj1 q = new rj1(new qk1(11), false, 1277240924);
    public static final String[] s = {"base", "basefont", "bgsound", "command", "link"};
    public static final String[] t = {"noframes", "style"};
    public static final String[] u = {"body", "br", "html"};
    public static final String[] v = {"body", "br", "html"};
    public static final String[] w = {"body", "br", "head", "html"};
    public static final String[] x = {"basefont", "bgsound", "link", "meta", "noframes", "style"};
    public static final String[] y = {"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "template", "title"};
    public static final String[] z = {"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
    public static final String[] A = {"h1", "h2", "h3", "h4", "h5", "h6"};
    public static final String[] B = {"address", "div", "p"};
    public static final String[] C = {"dd", "dt"};
    public static final String[] D = {"applet", "marquee", "object"};
    public static final String[] E = {"param", "source", "track"};
    public static final String[] F = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] G = {"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
    public static final String[] H = {"body", "dd", "dt", "html", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] I = {"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
    public static final String[] J = {"tbody", "tfoot", "thead"};
    public static final String[] K = {"td", "th", "tr"};
    public static final String[] L = {"script", "style", "template"};
    public static final String[] M = {"td", "th"};
    public static final String[] N = {"body", "caption", "col", "colgroup", "html"};
    public static final String[] O = {"table", "tbody", "tfoot", "thead", "tr"};
    public static final String[] P = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] Q = {"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] R = {"table", "tbody", "tfoot", "thead", "tr"};
    public static final String[] S = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
    public static final String[] T = {"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
    public static final String[] U = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
    public static final String[] V = {"body", "caption", "col", "colgroup", "html", "td", "th"};
    public static final String[] W = {"input", "keygen", "textarea"};
    public static final String[] X = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] Y = {"tbody", "tfoot", "thead"};
    public static final String[] Z = {"head", "noscript"};
    public static final String[] a0 = {"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] b0 = {"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", "title"};
    public static final String[] c0 = {"caption", "colgroup", "tbody", "tfoot", "thead"};
    public static final String[] d0 = {"b", "big", "blockquote", "body", "br", "center", "code", "dd", "div", "dl", "dt", "em", "embed", "h1", "h2", "h3", "h4", "h5", "h6", "head", "hr", "i", "img", "li", "listing", "menu", "meta", "nobr", "ol", "p", "pre", "ruby", "s", "small", "span", "strike", "strong", "sub", "sup", "table", "tt", "u", "ul", "var"};
    public static final Object e0 = new Object();
    public static final be5 f0 = new be5(4, (Object) null, (Object) null, (Object) null);
    public static final long[] h0 = new long[0];
    public static final String[] j0 = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] k0 = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    static {
        int i2 = 12;
        f = new rj1(new vj1(i2), false, -602035500);
        int i3 = 14;
        h = new rj1(new vj1(i3), false, -1889568253);
        int i4 = 9;
        k = new rj1(new ik1(i4), false, -708930102);
        int i5 = 10;
        l = new rj1(new ik1(i5), false, -624218594);
        o = new rj1(new qk1(i4), false, 1427693212);
        p = new rj1(new qk1(i5), false, -666730981);
        r = new rj1(new qk1(i2), false, -1073754467);
        i0 = new h1a(i3);
    }

    public static final void A(String str, t27 t27Var, dd4 dd4Var, int i2) {
        t27 t27Var2;
        String str2;
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(-331728223);
        int i3 = (dd4Var.f(str) ? 4 : 2) | i2 | (dd4Var.f(t27Var) ? 32 : 16);
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            m6a m6aVar = (m6a) dd4Var.j(b73.b);
            long j2 = ((q96) dd4Var.j(s96.a)).a.n;
            boolean zF = dd4Var.f(m6aVar) | dd4Var.e(j2);
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            if (zF || objQ == fu6Var) {
                objQ = new rr5(m6aVar, j2, 3);
                dd4Var.p0(objQ);
            }
            int i4 = i3 & 14;
            lc5.j(str, (kb4) objQ, dd4Var);
            boolean z2 = i4 == 4;
            Object objQ2 = dd4Var.Q();
            if (z2 || objQ2 == fu6Var) {
                objQ2 = new ho4(str, 13);
                dd4Var.p0(objQ2);
            }
            ib4 ib4Var = (ib4) objQ2;
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ry6 ry6VarD = pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b;
            ev8 ev8VarA = ek5.a(dd4Var);
            a91 a91VarA = ug8.a(ce8.class);
            t27Var2 = t27Var;
            str2 = str;
            j1a.a(tg9.c, (t89) null, 0L, 0L, 0.0f, 0.0f, (wm0) null, jf0.G(680755174, new mt(5, (Object) t27Var, (Object) str, (Object) bx1.B(((ce8) ((qtb) qx1.N(a91VarA, pj4VarA.f(), dx1.h(a91VarA.f(), "-", str), ry6VarD, ev8VarA, ib4Var))).s, dd4Var), false), dd4Var), dd4Var, 12582918, Token.ELSE);
        } else {
            t27Var2 = t27Var;
            str2 = str;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yj0(str2, t27Var2, i2, 11);
        }
    }

    public static final void B(String str, int i2, int i3, t27 t27Var, ou6 ou6Var, dd4 dd4Var, int i4) {
        dd4Var.h0(-2128367096);
        int i5 = (dd4Var.f(str) ? 4 : 2) | i4 | (dd4Var.d(i2) ? 32 : 16) | (dd4Var.d(i3) ? 256 : Token.CASE) | (dd4Var.f(t27Var) ? 2048 : 1024);
        if (!dd4Var.V(i5 & 1, (i5 & 9363) != 9362)) {
            dd4Var.Y();
        } else if (i2 == 1) {
            dd4Var.f0(418302591);
            switch (i3) {
                case 10:
                    dd4Var.f0(418303397);
                    h67.L(str, t27Var, ou6Var, dd4Var, ((i5 >> 6) & Token.ASSIGN_MOD) | (i5 & 14) | 384);
                    dd4Var.q(false);
                    break;
                case 11:
                    dd4Var.f0(418558310);
                    vm7.q(str, t27Var, ou6Var, dd4Var, ((i5 >> 6) & Token.ASSIGN_MOD) | (i5 & 14) | 384);
                    dd4Var.q(false);
                    break;
                case 12:
                    dd4Var.f0(418812262);
                    jv3.k(str, t27Var, ou6Var, dd4Var, ((i5 >> 6) & Token.ASSIGN_MOD) | (i5 & 14) | 384);
                    dd4Var.q(false);
                    break;
                case 13:
                    dd4Var.f0(419065191);
                    yb0.E(str, t27Var, ou6Var, dd4Var, ((i5 >> 6) & Token.ASSIGN_MOD) | (i5 & 14) | 384);
                    dd4Var.q(false);
                    break;
                case 14:
                    dd4Var.f0(419570150);
                    yb0.q(str, t27Var, ou6Var, dd4Var, ((i5 >> 6) & Token.ASSIGN_MOD) | (i5 & 14) | 384);
                    dd4Var.q(false);
                    break;
                case 15:
                    dd4Var.f0(419824071);
                    kf0.l(str, t27Var, ou6Var, dd4Var, ((i5 >> 6) & Token.ASSIGN_MOD) | (i5 & 14) | 384);
                    dd4Var.q(false);
                    break;
                case 16:
                    dd4Var.f0(419317159);
                    u(str, t27Var, ou6Var, dd4Var, ((i5 >> 6) & Token.ASSIGN_MOD) | (i5 & 14) | 384);
                    dd4Var.q(false);
                    break;
                case 17:
                    dd4Var.f0(420076163);
                    h67.d0(str, t27Var, ou6Var, dd4Var, ((i5 >> 6) & Token.ASSIGN_MOD) | (i5 & 14) | 384);
                    dd4Var.q(false);
                    break;
                default:
                    dd4Var.f0(420296666);
                    dd4Var.q(false);
                    break;
            }
            dd4Var.q(false);
        } else if (i2 == 2) {
            dd4Var.f0(420387682);
            if (i3 != 17) {
                switch (i3) {
                    case 20:
                        dd4Var.f0(420420325);
                        gc1.i(str, t27Var, ou6Var, dd4Var, ((i5 >> 6) & Token.ASSIGN_MOD) | (i5 & 14) | 384);
                        dd4Var.q(false);
                        break;
                    case 21:
                        dd4Var.f0(420674215);
                        jv3.d(str, t27Var, ou6Var, dd4Var, ((i5 >> 6) & Token.ASSIGN_MOD) | (i5 & 14) | 384);
                        dd4Var.q(false);
                        break;
                    case 22:
                        dd4Var.f0(420926183);
                        kf0.p(str, t27Var, ou6Var, dd4Var, ((i5 >> 6) & Token.ASSIGN_MOD) | (i5 & 14) | 384);
                        dd4Var.q(false);
                        break;
                    default:
                        dd4Var.f0(421394810);
                        dd4Var.q(false);
                        break;
                }
            } else {
                dd4Var.f0(421178151);
                vm7.I(str, t27Var, ou6Var, dd4Var, ((i5 >> 6) & Token.ASSIGN_MOD) | (i5 & 14) | 384);
                dd4Var.q(false);
            }
            dd4Var.q(false);
        } else if (i2 == 3) {
            dd4Var.f0(421460964);
            if (i3 == 30) {
                dd4Var.f0(421513850);
                lw1.m(str, null, dd4Var, i5 & 14);
                dd4Var.q(false);
            } else if (i3 != 31) {
                dd4Var.f0(421697370);
                dd4Var.q(false);
            } else {
                dd4Var.f0(421621978);
                gc1.a(str, null, dd4Var, i5 & 14);
                dd4Var.q(false);
            }
            dd4Var.q(false);
        } else if (i2 != 4) {
            dd4Var.f0(422163610);
            dd4Var.q(false);
        } else {
            dd4Var.f0(421768143);
            if (i3 == 41) {
                dd4Var.f0(421817433);
                tl9.f(str, null, dd4Var, i5 & 14);
                dd4Var.q(false);
            } else if (i3 != 42) {
                dd4Var.f0(422147738);
                dd4Var.q(false);
            } else {
                dd4Var.f0(421932040);
                kl8.J(str, t27Var, ou6Var, dd4Var, ((i5 >> 6) & Token.ASSIGN_MOD) | (i5 & 14) | 384);
                dd4Var.q(false);
            }
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ao0(str, i2, i3, t27Var, ou6Var, i4);
        }
    }

    public static final void C(String str, dd4 dd4Var, int i2) {
        dd4Var.h0(-974612000);
        int i3 = i2 | (dd4Var.f(str) ? 4 : 2);
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            ur9 ur9Var = s96.a;
            nha.c(str, (ou6) null, ((q96) dd4Var.j(ur9Var)).a.s, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.o, dd4Var, i3 & 14, 0, 131066);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new z31(str, i2, 2);
        }
    }

    public static final void D(String str, ou6 ou6Var, dd4 dd4Var, int i2) {
        ou6 ou6Var2;
        dd4Var.h0(934613237);
        int i3 = i2 | (dd4Var.f(str) ? 4 : 2) | 48;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarM0 = gjb.m0(ou6Var3, 16.0f, 12.0f);
            ur9 ur9Var = s96.a;
            nha.c(str, ou6VarM0, ((q96) dd4Var.j(ur9Var)).a.a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.h, dd4Var, i3 & 14, 0, 131064);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new b7(str, ou6Var2, i2, 14);
        }
    }

    public static final void E(rj1 rj1Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-507844975);
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            ou6 ou6VarF = tg9.f(lu6.a, 1.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarL0 = gjb.l0(L(t96.w(ou6VarF, ((q96) dd4Var.j(ur9Var)).c.d), dd1.g(((q96) dd4Var.j(ur9Var)).a, 2.0f), jf0.G), 12.0f);
            ie1 ie1VarA = ge1.a(new mv(8.0f, true, new gp(5)), bv4.z, dd4Var, 6);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarL0);
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
            un9.s(ll1.d, dd4Var, ou6VarL02);
            rj1Var.c(ke1.a, dd4Var, 54);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tb0(i2, 3, rj1Var);
        }
    }

    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v23 */
    public static final void F(l9b l9bVar, pj7 pj7Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, kb4 kb4Var5, kb4 kb4Var6, dd4 dd4Var, int i2) {
        int i3;
        ?? r7;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1579949926);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.f(l9bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.f(pj7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var2.h(kb4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var2.h(kb4Var2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var2.h(kb4Var3) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var2.h(kb4Var4) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= dd4Var2.h(kb4Var5) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= dd4Var2.h(kb4Var6) ? 67108864 : 33554432;
        }
        if (dd4Var2.V(i3 & 1, (38347923 & i3) != 38347922)) {
            ou6 ou6VarQ = kc5.Q(h67.f0(ou6Var.e(tg9.c), null, 3), kc5.J(dd4Var2), 14);
            vf0 vf0Var = bv4.z;
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var2, 0);
            int i4 = i3;
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarQ);
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
            un9.a(dd4Var2, gjb.k0(lu6Var, pj7Var));
            D(wn9.K((pv9) vu9.a.getValue(), dd4Var2), null, dd4Var2, 0);
            ou6 ou6VarN0 = gjb.n0(tg9.f(lu6Var, 1.0f), 16.0f, 0.0f, 2);
            ur9 ur9Var = s96.a;
            ou6 ou6VarW = t96.w(ou6VarN0, ((q96) dd4Var2.j(ur9Var)).c.d);
            ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var2, 0);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarW);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA2);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            int i5 = i4 << 3;
            e11.t(wn9.K((pv9) ru9.F0.getValue(), dd4Var2), wm9.r((hv9) rv.r.getValue(), dd4Var2), l9bVar.a, j0(dd4Var2, tg9.f(lu6Var, 1.0f)), kb4Var, dd4Var2, i5 & 57344);
            if (l9bVar.a != 0) {
                ky0.z(dd4Var2, -2082216620, lu6Var, 4.0f, dd4Var2);
                ql9.g(l9bVar.b, ((i4 >> 3) & 7168) | 384, kb4Var2, dd4Var2, tg9.h(j0(dd4Var2, tg9.f(lu6Var, 1.0f)), 116.0f));
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-2081789936);
                dd4Var2.q(false);
            }
            un9.a(dd4Var2, tg9.h(lu6Var, 4.0f));
            dd4Var2 = dd4Var;
            e11.x(null, wn9.K((pv9) vu9.b.getValue(), dd4Var2), null, j0(dd4Var2, tg9.f(lu6Var, 1.0f)), false, l9bVar.e, kb4Var3, dd4Var2, i5 & 3670016, 21);
            kr2.d();
            dd4Var2.f0(-2081309963);
            un9.a(dd4Var2, tg9.h(lu6Var, 4.0f));
            e11.x(null, wn9.K((pv9) vu9.c.getValue(), dd4Var2), null, j0(dd4Var2, tg9.f(lu6Var, 1.0f)), false, l9bVar.c, kb4Var4, dd4Var2, i4 & 3670016, 21);
            if (l9bVar.c) {
                ky0.z(dd4Var2, -2080839507, lu6Var, 4.0f, dd4Var2);
                e11.x(null, wn9.K((pv9) ru9.u0.getValue(), dd4Var2), null, j0(dd4Var2, tg9.f(lu6Var, 1.0f)), false, l9bVar.d, kb4Var5, dd4Var2, (i4 >> 3) & 3670016, 21);
                r7 = 0;
                dd4Var2.q(false);
            } else {
                r7 = 0;
                dd4Var2.f0(-2080344592);
                dd4Var2.q(false);
            }
            un9.a(dd4Var2, xv5.g(dd4Var2, r7, true, lu6Var, 12.0f));
            D(wn9.K((pv9) ru9.P0.getValue(), dd4Var2), null, dd4Var2, r7);
            ou6 ou6VarW2 = t96.w(gjb.n0(tg9.f(lu6Var, 1.0f), 16.0f, 0.0f, 2), ((q96) dd4Var2.j(ur9Var)).c.d);
            ie1 ie1VarA3 = ge1.a(jvVar, vf0Var, dd4Var2, (int) r7);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarW2);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA3);
            un9.s(jmVar2, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            e11.x(null, wn9.K((pv9) ru9.N0.getValue(), dd4Var2), null, j0(dd4Var2, tg9.f(lu6Var, 1.0f)), false, l9bVar.f, kb4Var6, dd4Var2, (i4 >> 6) & 3670016, 21);
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fl0(l9bVar, pj7Var, ou6Var, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, kb4Var6, i2, 12);
        }
    }

    public static final void G(t27 t27Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        t27Var.getClass();
        dd4Var.h0(-123800108);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            o9b o9bVar = (o9b) ((qtb) qx1.N(ug8.a(o9b.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            dd4Var2 = dd4Var;
            gx1.p(wn9.K((pv9) ru9.M0.getValue(), dd4Var), tg9.c, false, jf0.G(486180568, new oe9(t27Var, 26), dd4Var), null, jf0.G(821496010, new qs1(8, o9bVar, bx1.B(o9bVar.d, dd4Var)), dd4Var), dd4Var2, 199728, 20);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new oe9(i2, 27, t27Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void H(defpackage.sgb r20, ou6 r21, int r22, dd4 r23, int r24) {
        /*
            r0 = r20
            r2 = r21
            r1 = r23
            java.util.List r3 = r0.f
            r4 = -404794491(0xffffffffe7df5385, float:-2.1092568E24)
            r1.h0(r4)
            boolean r4 = r1.h(r0)
            if (r4 == 0) goto L16
            r4 = 4
            goto L17
        L16:
            r4 = 2
        L17:
            r4 = r24 | r4
            boolean r5 = r1.f(r2)
            if (r5 == 0) goto L22
            r5 = 32
            goto L24
        L22:
            r5 = 16
        L24:
            r4 = r4 | r5
            r5 = r4 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 == r6) goto L2d
            r5 = 1
            goto L2e
        L2d:
            r5 = 0
        L2e:
            r6 = r4 & 1
            boolean r5 = r1.V(r6, r5)
            if (r5 == 0) goto L9f
            boolean r5 = r1.f(r3)
            java.lang.Object r6 = r1.Q()
            if (r5 != 0) goto L44
            fu6 r5 = vl1.a
            if (r6 != r5) goto L6f
        L44:
            java.util.ArrayList r6 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.gc1.M(r3, r5)
            r6.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L53:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L6c
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            long r7 = kf0.H(r5)
            lc1 r5 = new lc1
            r5.<init>(r7)
            r6.add(r5)
            goto L53
        L6c:
            r1.p0(r6)
        L6f:
            r3 = r6
            java.util.List r3 = (java.util.List) r3
            java.lang.String r5 = r0.b
            ur9 r6 = defpackage.s96.a
            java.lang.Object r6 = r1.j(r6)
            q96 r6 = (q96) r6
            xbb r6 = r6.b
            uka r15 = r6.i
            vaa r8 = new vaa
            r6 = 5
            r8.<init>(r6)
            r17 = r4 & 112(0x70, float:1.57E-43)
            r18 = 3072(0xc00, float:4.305E-42)
            r19 = 56824(0xddf8, float:7.9627E-41)
            r1 = r5
            r4 = 0
            r6 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r13 = r22
            r16 = r23
            i12.c(r1, r2, r3, r4, r6, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto La2
        L9f:
            r23.Y()
        La2:
            ye8 r1 = r23.u()
            if (r1 == 0) goto Lb3
            bo6 r3 = new bo6
            r13 = r22
            r4 = r24
            r3.<init>(r0, r2, r13, r4)
            r1.d = r3
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe.H(sgb, ou6, int, dd4, int):void");
    }

    public static final boolean I(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static String J(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (e0) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbV = xv5.v(str, "\n  ");
        sbV.append(strReplace.replace("\n", "\n  "));
        sbV.append('\n');
        return sbV.toString();
    }

    public static ou6 K(ou6 ou6Var, sq0 sq0Var) {
        return ou6Var.e(new xb0(0L, sq0Var, jf0.G, 1));
    }

    public static final ou6 L(ou6 ou6Var, long j2, t89 t89Var) {
        return ou6Var.e(new xb0(j2, (sq0) null, t89Var, 2));
    }

    public static final re0 N(rj1 rj1Var, dd4 dd4Var, int i2) {
        boolean z2 = (((i2 & 14) ^ 6) > 4 && dd4Var.f(rj1Var)) || (i2 & 6) == 4;
        Object objQ = dd4Var.Q();
        Object obj = vl1.a;
        if (z2 || objQ == obj) {
            objQ = new re0(rj1Var);
            dd4Var.p0(objQ);
        }
        re0 re0Var = (re0) objQ;
        boolean zF = dd4Var.f(re0Var);
        Object objQ2 = dd4Var.Q();
        if (zF || objQ2 == obj) {
            objQ2 = new f0(re0Var, 7);
            dd4Var.p0(objQ2);
        }
        lc5.j(re0Var, (kb4) objQ2, dd4Var);
        return re0Var;
    }

    public static final Object O(lm2 lm2Var, ib4 ib4Var, kt1 kt1Var) {
        nu6 nu6Var;
        x67 x67VarR;
        Object objL;
        z70 z70Var;
        if (((nu6) lm2Var).a.z) {
            nu6 nu6Var2 = (nu6) lm2Var;
            if (!nu6Var2.a.z) {
                q75.c("visitAncestors called on an unattached node");
            }
            nu6 nu6Var3 = nu6Var2.a.e;
            sn5 sn5VarS = vw1.S(lm2Var);
            loop0: while (true) {
                nu6Var = null;
                if (sn5VarS == null) {
                    break;
                }
                if ((((nu6) sn5VarS.S.g).d & 524288) != 0) {
                    while (nu6Var3 != null) {
                        if ((nu6Var3.c & 524288) != 0) {
                            nu6 nu6VarT = nu6Var3;
                            g07 g07Var = null;
                            while (nu6VarT != null) {
                                if (nu6VarT instanceof fo0) {
                                    nu6Var = nu6VarT;
                                    break loop0;
                                }
                                if ((nu6VarT.c & 524288) != 0 && (nu6VarT instanceof qm2)) {
                                    int i2 = 0;
                                    for (nu6 nu6Var4 = ((qm2) nu6VarT).B; nu6Var4 != null; nu6Var4 = nu6Var4.f) {
                                        if ((nu6Var4.c & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                nu6VarT = nu6Var4;
                                            } else {
                                                if (g07Var == null) {
                                                    g07Var = new g07(new nu6[16]);
                                                }
                                                if (nu6VarT != null) {
                                                    g07Var.b(nu6VarT);
                                                    nu6VarT = null;
                                                }
                                                g07Var.b(nu6Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                nu6VarT = vw1.t(g07Var);
                            }
                        }
                        nu6Var3 = nu6Var3.e;
                    }
                }
                sn5VarS = sn5VarS.v();
                nu6Var3 = (sn5VarS == null || (z70Var = sn5VarS.S) == null) ? null : (n9a) z70Var.f;
            }
            fo0 fo0Var = (fo0) nu6Var;
            if (fo0Var != null && (objL = fo0Var.L((x67VarR = vw1.R(lm2Var)), new hd(3, ib4Var, x67VarR), kt1Var)) == xx1.a) {
                return objL;
            }
        }
        return heb.a;
    }

    public static void P(String str, String str2) {
        synchronized (e0) {
            Log.d(str, J(str2, null));
        }
    }

    public static final float Q(int i2, int i3, float[] fArr, float[] fArr2) {
        int i4 = i2 * 4;
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
    }

    public static void R(String str, String str2) {
        synchronized (e0) {
            Log.e(str, J(str2, null));
        }
    }

    public static void S(String str, String str2, Throwable th) {
        synchronized (e0) {
            Log.e(str, J(str2, th));
        }
    }

    public static final int T(dd4 dd4Var) {
        dd4Var.getClass();
        return Long.hashCode(dd4Var.T);
    }

    public static final long U(dd4 dd4Var) {
        return dd4Var.T;
    }

    public static final String V(yf0 yf0Var) {
        yf0Var.getClass();
        if (yf0Var.equals(fu6.b)) {
            return "TopStart";
        }
        if (yf0Var.equals(fu6.c)) {
            return "TopCenter";
        }
        if (yf0Var.equals(fu6.d)) {
            return "TopEnd";
        }
        if (yf0Var.equals(fu6.e)) {
            return "CenterStart";
        }
        if (yf0Var.equals(fu6.f)) {
            return "Center";
        }
        if (yf0Var.equals(fu6.s)) {
            return "CenterEnd";
        }
        if (yf0Var.equals(fu6.t)) {
            return "BottomStart";
        }
        if (yf0Var.equals(fu6.u)) {
            return "BottomCenter";
        }
        if (yf0Var.equals(fu6.v)) {
            return "BottomEnd";
        }
        return "Unknown AlignmentCompat: " + yf0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: qn7 */
    public static int W(y01 y01Var) throws qn7 {
        int iG = y01Var.g(4);
        if (iG == 15) {
            if (y01Var.b() >= 24) {
                return y01Var.g(24);
            }
            throw qn7.a((RuntimeException) null, "AAC header insufficient data");
        }
        if (iG < 13) {
            return a[iG];
        }
        throw qn7.a((RuntimeException) null, "AAC header wrong Sampling Frequency Index");
    }

    public static void X(String str, String str2) {
        synchronized (e0) {
            Log.i(str, J(str2, null));
        }
    }

    public static final void Y() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final boolean Z(yf0 yf0Var) {
        return yf0Var.equals(fu6.t) || yf0Var.equals(fu6.u) || yf0Var.equals(fu6.v);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r21, defpackage.t61 r22, ou6 r23, defpackage.kb4 r24, defpackage.ib4 r25, defpackage.ib4 r26, defpackage.ib4 r27, defpackage.ib4 r28, defpackage.kb4 r29, defpackage.kb4 r30, dd4 r31, int r32) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe.a(boolean, t61, ou6, kb4, ib4, ib4, ib4, ib4, kb4, kb4, dd4, int):void");
    }

    public static final boolean a0(yf0 yf0Var) {
        return yf0Var.equals(fu6.d) || yf0Var.equals(fu6.s) || yf0Var.equals(fu6.v);
    }

    public static final void b(boolean z2, zk7 zk7Var, t27 t27Var, pj7 pj7Var, szb szbVar, ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-1144571014);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.f(zk7Var) ? 32 : 16) | (dd4Var.f(t27Var) ? 256 : Token.CASE) | (dd4Var.f(pj7Var) ? 2048 : 1024) | (dd4Var.f(szbVar) ? 16384 : 8192) | (dd4Var.f(ou6Var) ? 131072 : Parser.ARGC_LIMIT);
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (74899 & i3) != 74898)) {
            e11.e(zk7Var, ou6Var, null, null, 0, 0.0f, null, null, z2, null, null, null, jf0.G(-2043252293, new ak0(i4, t27Var, pj7Var, szbVar), dd4Var), dd4Var, ((i3 >> 3) & 14) | ((i3 >> 12) & Token.ASSIGN_MOD) | ((i3 << 24) & 234881024), 16124);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ch1(z2, zk7Var, t27Var, pj7Var, szbVar, ou6Var, i2, 0);
        }
    }

    public static final boolean b0(yf0 yf0Var) {
        return yf0Var.equals(fu6.b) || yf0Var.equals(fu6.e) || yf0Var.equals(fu6.t);
    }

    public static final void c(t27 t27Var, dd4 dd4Var, int i2) {
        t27 t27Var2;
        int i3;
        Object obj;
        t27Var.getClass();
        dd4Var.h0(612940124);
        int i4 = i2 | (dd4Var.f(t27Var) ? 4 : 2);
        if (dd4Var.V(i4 & 1, (i4 & 3) != 2)) {
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            Object obj2 = objQ;
            if (objQ == fu6Var) {
                vx1 vx1VarZ = lc5.Z(dd4Var);
                dd4Var.p0(vx1VarZ);
                obj2 = vx1VarZ;
            }
            vx1 vx1Var = (vx1) obj2;
            al7 al7VarH0 = ny1.h0(0, 2, dd4Var, 384, 3);
            boolean zA = xzb.a(dd4Var);
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
            a07 a07VarB = bx1.B(mibVar.f, dd4Var);
            Object[] objArr = new Object[0];
            Object objQ2 = dd4Var.Q();
            Object obj3 = objQ2;
            if (objQ2 == fu6Var) {
                ag0 ag0Var = new ag0(29);
                dd4Var.p0(ag0Var);
                obj3 = ag0Var;
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) obj3, dd4Var, 48);
            Object[] objArr2 = new Object[0];
            Object objQ3 = dd4Var.Q();
            Object obj4 = objQ3;
            if (objQ3 == fu6Var) {
                dh1 dh1Var = new dh1(i);
                dd4Var.p0(dh1Var);
                obj4 = dh1Var;
            }
            a07 a07Var2 = (a07) ww1.b0(objArr2, (ib4) obj4, dd4Var, 48);
            boolean zF = dd4Var.f(mibVar);
            Object objQ4 = dd4Var.Q();
            Object obj5 = objQ4;
            if (zF || objQ4 == fu6Var) {
                eh1 eh1Var = new eh1(mibVar, i);
                dd4Var.p0(eh1Var);
                obj5 = eh1Var;
            }
            lx1.g(mibVar, null, (kb4) obj5, dd4Var, 0);
            int i5 = 3;
            gx1.q(qn9.n(tg9.c), jf0.G(2085947390, new fh1(zA, al7VarH0, t27Var, a07Var2, vx1Var, a07Var, a07VarB), dd4Var), dd4Var, 48, 0);
            boolean zBooleanValue = ((Boolean) a07Var2.getValue()).booleanValue();
            String strK = wn9.K((pv9) mu9.W.getValue(), dd4Var);
            boolean zF2 = dd4Var.f(a07Var2);
            Object objQ5 = dd4Var.Q();
            Object obj6 = objQ5;
            if (zF2 || objQ5 == fu6Var) {
                x6 x6Var = new x6(a07Var2, 28);
                dd4Var.p0(x6Var);
                obj6 = x6Var;
            }
            kb4 kb4Var = (kb4) obj6;
            int i6 = i4 & 14;
            boolean zF3 = dd4Var.f(a07Var2) | dd4Var.f(al7VarH0) | (i6 == 4);
            Object objQ6 = dd4Var.Q();
            Object obj7 = objQ6;
            if (zF3 || objQ6 == fu6Var) {
                v6 v6Var = new v6(al7VarH0, t27Var, a07Var2);
                dd4Var.p0(v6Var);
                obj7 = v6Var;
            }
            wx1.p(zBooleanValue, "", strK, kb4Var, (kb4) obj7, dd4Var, 48);
            boolean zBooleanValue2 = ((Boolean) a07Var.getValue()).booleanValue();
            boolean zF4 = dd4Var.f(a07Var);
            Object objQ7 = dd4Var.Q();
            Object obj8 = objQ7;
            if (zF4 || objQ7 == fu6Var) {
                x6 x6Var2 = new x6(a07Var, 27);
                dd4Var.p0(x6Var2);
                obj8 = x6Var2;
            }
            kb4 kb4Var2 = (kb4) obj8;
            boolean zF5 = dd4Var.f(a07Var) | (i6 == 4);
            Object objQ8 = dd4Var.Q();
            if (zF5 || objQ8 == fu6Var) {
                i3 = 1;
                xj0 xj0Var = new xj0(t27Var, a07Var, i3);
                dd4Var.p0(xj0Var);
                obj = xj0Var;
            } else {
                i3 = 1;
                obj = objQ8;
            }
            ib4 ib4Var = (ib4) obj;
            int i7 = (dd4Var.f(a07Var) ? 1 : 0) | (i6 == 4 ? i3 : 0);
            Object objQ9 = dd4Var.Q();
            Object obj9 = objQ9;
            if (i7 != 0 || objQ9 == fu6Var) {
                xj0 xj0Var2 = new xj0(t27Var, a07Var, 2);
                dd4Var.p0(xj0Var2);
                obj9 = xj0Var2;
            }
            ib4 ib4Var2 = (ib4) obj9;
            int i8 = (dd4Var.f(a07Var) ? 1 : 0) | (i6 == 4 ? i3 : 0);
            Object objQ10 = dd4Var.Q();
            Object obj10 = objQ10;
            if (i8 != 0 || objQ10 == fu6Var) {
                xj0 xj0Var3 = new xj0(t27Var, a07Var, i5);
                dd4Var.p0(xj0Var3);
                obj10 = xj0Var3;
            }
            ib4 ib4Var3 = (ib4) obj10;
            int i9 = 4;
            int i10 = (dd4Var.f(a07Var) ? 1 : 0) | (i6 == 4 ? i3 : 0);
            Object objQ11 = dd4Var.Q();
            Object obj11 = objQ11;
            if (i10 != 0 || objQ11 == fu6Var) {
                xj0 xj0Var4 = new xj0(t27Var, a07Var, i9);
                dd4Var.p0(xj0Var4);
                obj11 = xj0Var4;
            }
            ib4 ib4Var4 = (ib4) obj11;
            int i11 = (dd4Var.f(a07Var) ? 1 : 0) | (i6 == 4 ? i3 : 0);
            Object objQ12 = dd4Var.Q();
            Object obj12 = objQ12;
            if (i11 != 0 || objQ12 == fu6Var) {
                xj0 xj0Var5 = new xj0(t27Var, a07Var, 5);
                dd4Var.p0(xj0Var5);
                obj12 = xj0Var5;
            }
            ib4 ib4Var5 = (ib4) obj12;
            int i12 = (dd4Var.f(a07Var) ? 1 : 0) | (i6 == 4 ? 1 : 0);
            Object objQ13 = dd4Var.Q();
            Object obj13 = objQ13;
            if (i12 != 0 || objQ13 == fu6Var) {
                xj0 xj0Var6 = new xj0(t27Var, a07Var, 6);
                dd4Var.p0(xj0Var6);
                obj13 = xj0Var6;
            }
            t27Var2 = t27Var;
            m79.p(zBooleanValue2, kb4Var2, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, (ib4) obj13, dd4Var, 0);
        } else {
            t27Var2 = t27Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new q41(i2, 6, t27Var2);
        }
    }

    public static final boolean c0(yf0 yf0Var) {
        return yf0Var.equals(fu6.b) || yf0Var.equals(fu6.c) || yf0Var.equals(fu6.d);
    }

    public static final void d(a07 a07Var, boolean z2) {
        a07Var.setValue(Boolean.valueOf(z2));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: qn7 */
    public static i d0(y01 y01Var, boolean z2) throws qn7 {
        int iG = y01Var.g(5);
        if (iG == 31) {
            iG = y01Var.g(6) + 32;
        }
        int iW = W(y01Var);
        int iG2 = y01Var.g(4);
        String strF = dx1.f(iG, "mp4a.40.");
        if (iG == 5 || iG == 29) {
            iW = W(y01Var);
            int iG3 = y01Var.g(5);
            if (iG3 == 31) {
                iG3 = y01Var.g(6) + 32;
            }
            iG = iG3;
            if (iG == 22) {
                iG2 = y01Var.g(4);
            }
        }
        if (z2) {
            if (iG != 1 && iG != 2 && iG != 3 && iG != 4 && iG != 6 && iG != 7 && iG != 17) {
                switch (iG) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw qn7.c("Unsupported audio object type: " + iG);
                }
            }
            if (y01Var.f()) {
                n0("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (y01Var.f()) {
                y01Var.o(14);
            }
            boolean zF = y01Var.f();
            if (iG2 == 0) {
                xr0.h();
                return null;
            }
            if (iG == 6 || iG == 20) {
                y01Var.o(3);
            }
            if (zF) {
                if (iG == 22) {
                    y01Var.o(16);
                }
                if (iG == 17 || iG == 19 || iG == 20 || iG == 23) {
                    y01Var.o(3);
                }
                y01Var.o(1);
            }
            switch (iG) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iG4 = y01Var.g(2);
                    if (iG4 == 2 || iG4 == 3) {
                        throw qn7.c("Unsupported epConfig: " + iG4);
                    }
                    break;
            }
        }
        int i2 = b[iG2];
        if (i2 != -1) {
            return new i(iW, i2, strF);
        }
        throw qn7.a((RuntimeException) null, (String) null);
    }

    public static final void e(boolean z2, String str, String str2, boolean z3, kb4 kb4Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        str.getClass();
        str2.getClass();
        kb4Var.getClass();
        ib4Var.getClass();
        dd4Var.h0(1285464869);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.f(str) ? 32 : 16) | (dd4Var.f(str2) ? 256 : Token.CASE) | (dd4Var.g(z3) ? 2048 : 1024) | (dd4Var.h(ib4Var) ? 131072 : Parser.ARGC_LIMIT);
        byte b2 = 0;
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (74899 & i3) != 74898)) {
            z8.a(z2, kb4Var, jf0.G(1899578172, new y31(ib4Var, z3), dd4Var), null, null, jf0.G(-1211771559, new gs6(kb4Var, i4, b2), dd4Var), jf0.G(2046079160, new z31(str, b2), dd4Var), null, 0L, 0L, 0.0f, null, null, null, false, false, jf0.G(-535282175, new z31(str2, i4), dd4Var), dd4Var, (i3 & 14) | 1769904, 1572864, 65432);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new sp0(z2, str, str2, z3, kb4Var, ib4Var, i2);
        }
    }

    public static final void e0(float[] fArr, float[] fArr2) {
        float fQ = Q(0, 0, fArr2, fArr);
        float fQ2 = Q(0, 1, fArr2, fArr);
        float fQ3 = Q(0, 2, fArr2, fArr);
        float fQ4 = Q(0, 3, fArr2, fArr);
        float fQ5 = Q(1, 0, fArr2, fArr);
        float fQ6 = Q(1, 1, fArr2, fArr);
        float fQ7 = Q(1, 2, fArr2, fArr);
        float fQ8 = Q(1, 3, fArr2, fArr);
        float fQ9 = Q(2, 0, fArr2, fArr);
        float fQ10 = Q(2, 1, fArr2, fArr);
        float fQ11 = Q(2, 2, fArr2, fArr);
        float fQ12 = Q(2, 3, fArr2, fArr);
        float fQ13 = Q(3, 0, fArr2, fArr);
        float fQ14 = Q(3, 1, fArr2, fArr);
        float fQ15 = Q(3, 2, fArr2, fArr);
        float fQ16 = Q(3, 3, fArr2, fArr);
        fArr[0] = fQ;
        fArr[1] = fQ2;
        fArr[2] = fQ3;
        fArr[3] = fQ4;
        fArr[4] = fQ5;
        fArr[5] = fQ6;
        fArr[6] = fQ7;
        fArr[7] = fQ8;
        fArr[8] = fQ9;
        fArr[9] = fQ10;
        fArr[10] = fQ11;
        fArr[11] = fQ12;
        fArr[12] = fQ13;
        fArr[13] = fQ14;
        fArr[14] = fQ15;
        fArr[15] = fQ16;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final java.lang.String r31, final defpackage.m53 r32, final boolean r33, boolean r34, final defpackage.ib4 r35, dd4 r36, final int r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe.f(java.lang.String, m53, boolean, boolean, ib4, dd4, int, int):void");
    }

    public static s57 f0(ie8 ie8Var) {
        int i2 = Integer.parseInt(ie8Var.W(Long.MAX_VALUE));
        long j2 = Long.parseLong(ie8Var.W(Long.MAX_VALUE));
        long j3 = Long.parseLong(ie8Var.W(Long.MAX_VALUE));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i3 = Integer.parseInt(ie8Var.W(Long.MAX_VALUE));
        for (int i4 = 0; i4 < i3; i4++) {
            String strW = ie8Var.W(Long.MAX_VALUE);
            int iW = bw9.W(strW, ':', 0, 6);
            if (iW == -1) {
                gp.k("Unexpected header: ".concat(strW));
                return null;
            }
            String string = bw9.B0(strW.substring(0, iW)).toString();
            String strSubstring = strW.substring(iW + 1);
            String lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(strSubstring);
        }
        return new s57(i2, j2, j3, new l57(y86.i0(linkedHashMap)), (gl5) null, (Object) null);
    }

    public static final void g(final kv1 kv1Var, String str, boolean z2, String str2, boolean z3, boolean z4, ib4 ib4Var, final kb4 kb4Var, dd4 dd4Var, int i2) {
        String str3;
        String strK;
        boolean z5 = z4;
        dd4 dd4Var2 = dd4Var;
        String str4 = kv1Var.b;
        sgb sgbVar = kv1Var.a;
        dd4Var2.h0(1812850829);
        int i3 = i2 | (dd4Var2.h(kv1Var) ? 4 : 2) | (dd4Var2.f(str) ? 32 : 16) | (dd4Var2.g(z2) ? 256 : Token.CASE) | (dd4Var2.f(str2) ? 2048 : 1024) | (dd4Var2.g(z3) ? 16384 : 8192) | (dd4Var2.g(z5) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.h(ib4Var) ? 1048576 : 524288) | (dd4Var2.h(kb4Var) ? 8388608 : 4194304);
        if (dd4Var2.V(i3 & 1, (i3 & 4793491) != 4793490)) {
            boolean z6 = z3 && !lc5.Q(sgbVar.a, str) && (z2 || (!str2.equals("owner") ? !str2.equals("admin") || lc5.Q(str4, "owner") || lc5.Q(str4, "admin") : lc5.Q(str4, "owner")));
            lu6 lu6Var = lu6.a;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarM0 = gjb.m0(L(t96.w(ou6VarF, ((q96) dd4Var2.j(ur9Var)).c.c), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 3.0f), jf0.G), 6.0f, 10.0f);
            eq8 eq8VarA = dq8.a(new mv(12.0f, true, new gp(5)), bv4.x, dd4Var2, 54);
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
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            String str5 = sgbVar.c;
            String str6 = sgbVar.b;
            ou6 ou6VarN = tg9.n(lu6Var, 40.0f);
            int i4 = i3 & 29360128;
            int i5 = i3 & 14;
            boolean z7 = (i4 == 8388608) | (i5 == 4 || dd4Var2.h(kv1Var));
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z7 || objQ == obj) {
                str3 = str5;
                final int i6 = 0;
                objQ = new ib4() { // from class: h41
                    @Override // defpackage.ib4
                    public final Object invoke() {
                        int i7 = i6;
                        heb hebVar = heb.a;
                        kv1 kv1Var2 = kv1Var;
                        kb4 kb4Var2 = kb4Var;
                        switch (i7) {
                            case 0:
                                kb4Var2.invoke(kv1Var2.a);
                                break;
                            default:
                                kb4Var2.invoke(kv1Var2.a);
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var2.p0(objQ);
            } else {
                str3 = str5;
            }
            ib4 ib4Var2 = (ib4) objQ;
            final int i7 = 1;
            sg9.a(str3, str6, ou6VarN, ib4Var2, dd4Var2, 384, 0);
            bp5 bp5Var = new bp5(1.0f, true);
            byte b2 = 0;
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, bp5Var);
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
            ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
            boolean z8 = (i5 == 4 || dd4Var2.h(kv1Var)) | (i4 == 8388608);
            Object objQ2 = dd4Var2.Q();
            if (z8 || objQ2 == obj) {
                objQ2 = new ib4() { // from class: h41
                    @Override // defpackage.ib4
                    public final Object invoke() {
                        int i72 = i7;
                        heb hebVar = heb.a;
                        kv1 kv1Var2 = kv1Var;
                        kb4 kb4Var2 = kb4Var;
                        switch (i72) {
                            case 0:
                                kb4Var2.invoke(kv1Var2.a);
                                break;
                            default:
                                kb4Var2.invoke(kv1Var2.a);
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var2.p0(objQ2);
            }
            H(sgbVar, fw.J(null, (ib4) objQ2, ou6VarF2, false, 15), 2, dd4Var2, 392);
            if (lc5.Q(str4, "owner")) {
                dd4Var2.f0(-806342646);
                strK = wn9.K((pv9) zt9.w.getValue(), dd4Var2);
                dd4Var2.q(false);
            } else if (lc5.Q(str4, "admin")) {
                dd4Var2.f0(-806188886);
                strK = wn9.K((pv9) zt9.u.getValue(), dd4Var2);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(1220924041);
                strK = wn9.K((pv9) zt9.v.getValue(), dd4Var2);
                dd4Var2.q(false);
            }
            C(strK, dd4Var2, 0);
            dd4Var2.q(true);
            if (z6) {
                dd4Var2.f0(1099839492);
                z5 = z4;
                kf0.n(ib4Var, (ou6) null, !z4, (kx4) null, (t89) null, jf0.G(-1245122800, new e41(z5, i7, b2), dd4Var2), dd4Var, ((i3 >> 18) & 14) | 1572864, 58);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                z5 = z4;
                dd4Var2.f0(1100484633);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new zp0(kv1Var, str, z2, str2, z3, z5, ib4Var, kb4Var, i2);
        }
    }

    public static final px g0(a25 a25Var, b15 b15Var, kb4 kb4Var, kb4 kb4Var2, sr1 sr1Var, dd4 dd4Var, int i2) {
        if ((i2 & 4) != 0) {
            kb4Var = px.H;
        }
        if ((i2 & 8) != 0) {
            kb4Var2 = null;
        }
        ix ixVar = (ix) dd4Var.j(q16.a);
        dd4Var.f0(-1242991349);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            a25 a25VarB = qjb.b(a25Var, dd4Var);
            qjb.e(a25VarB);
            jx jxVar = new jx(ixVar, b15Var, a25VarB);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new px(jxVar);
                dd4Var.p0(objQ);
            }
            px pxVar = (px) objQ;
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = lc5.Z(dd4Var);
                dd4Var.p0(objQ2);
            }
            pxVar.x = (vx1) objQ2;
            pxVar.y = kb4Var;
            pxVar.z = kb4Var2;
            pxVar.A = sr1Var;
            pxVar.B = 1;
            pxVar.C = qjb.a(dd4Var);
            pxVar.o(jxVar);
            dd4Var.q(false);
            return pxVar;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [int] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(defpackage.t27 r27, pj7 r28, szb r29, java.lang.String r30, boolean r31, ou6 r32, dd4 r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe.h(t27, pj7, szb, java.lang.String, boolean, ou6, dd4, int, int):void");
    }

    public static final bd4 h0(dd4 dd4Var) {
        dd4 dd4Var2;
        dd4Var.b0(206, zl1.e);
        if (dd4Var.S) {
            si9.z(dd4Var.I);
        }
        Object objI = dd4Var.I();
        hd4 an8Var = objI instanceof hd4 ? (hd4) objI : null;
        if (an8Var == null) {
            dd4Var2 = dd4Var;
            an8Var = new an8(new ad4(new bd4(dd4Var2, dd4Var.T, dd4Var.q, dd4Var.C, dd4Var.h.F)), -1);
            dd4Var2.q0(an8Var);
        } else {
            dd4Var2 = dd4Var;
        }
        wh8 wh8Var = an8Var.a;
        wh8Var.getClass();
        bd4 bd4Var = ((ad4) wh8Var).a;
        bd4Var.f.setValue(dd4Var2.l());
        dd4Var2.q(false);
        return bd4Var;
    }

    public static final void i(int i2, dd4 dd4Var, ou6 ou6Var, boolean z2) {
        String strK;
        String strK2;
        dd4Var.h0(1464105485);
        int i3 = (dd4Var.g(z2) ? 4 : 2) | i2 | (dd4Var.f(ou6Var) ? 32 : 16);
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            p35 p35VarN0 = lx1.n0(dd4Var);
            if (z2) {
                dd4Var.f0(1773792464);
                strK = wn9.K((pv9) eu9.A.getValue(), dd4Var);
                dd4Var.q(false);
            } else {
                dd4Var.f0(1773866895);
                strK = wn9.K((pv9) eu9.y.getValue(), dd4Var);
                dd4Var.q(false);
            }
            if (z2) {
                dd4Var.f0(1773978340);
                strK2 = wn9.K((pv9) eu9.B.getValue(), dd4Var);
                dd4Var.q(false);
            } else {
                dd4Var.f0(1774064675);
                strK2 = wn9.K((pv9) eu9.z.getValue(), dd4Var);
                dd4Var.q(false);
            }
            bx1.d(p35VarN0, strK, strK2, ou6Var.e(tg9.c), (String) null, (ib4) null, dd4Var, 0, 48);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xk0(z2, ou6Var, i2, i4);
        }
    }

    public static final yf0 i0(yf0 yf0Var, Boolean bool) {
        yf0 yf0Var2 = fu6.v;
        yf0 yf0Var3 = fu6.s;
        yf0 yf0Var4 = fu6.d;
        yf0Var.getClass();
        if (bool.booleanValue()) {
            yf0 yf0Var5 = fu6.b;
            if (yf0Var.equals(yf0Var5)) {
                return yf0Var4;
            }
            yf0 yf0Var6 = fu6.c;
            if (yf0Var.equals(yf0Var6)) {
                return yf0Var6;
            }
            if (yf0Var.equals(yf0Var4)) {
                return yf0Var5;
            }
            yf0 yf0Var7 = fu6.e;
            if (yf0Var.equals(yf0Var7)) {
                return yf0Var3;
            }
            yf0 yf0Var8 = fu6.f;
            if (yf0Var.equals(yf0Var8)) {
                return yf0Var8;
            }
            if (yf0Var.equals(yf0Var3)) {
                return yf0Var7;
            }
            yf0 yf0Var9 = fu6.t;
            if (yf0Var.equals(yf0Var9)) {
                return yf0Var2;
            }
            yf0 yf0Var10 = fu6.u;
            if (yf0Var.equals(yf0Var10)) {
                return yf0Var10;
            }
            if (yf0Var.equals(yf0Var2)) {
                return yf0Var9;
            }
        }
        return yf0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0348  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(java.util.List r29, ou6 r30, final defpackage.yb4 r31, dd4 r32, int r33) {
        /*
            Method dump skipped, instruction units count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe.j(java.util.List, ou6, yb4, dd4, int):void");
    }

    public static final ou6 j0(dd4 dd4Var, ou6 ou6Var) {
        ur9 ur9Var = s96.a;
        return gjb.l0(L(t96.w(ou6Var, ((q96) dd4Var.j(ur9Var)).c.a), dd1.g(((q96) dd4Var.j(ur9Var)).a, 1.0f), jf0.G), 16.0f);
    }

    public static final void k(ov2 ov2Var, ou6 ou6Var, String str, ib4 ib4Var, dd4 dd4Var, int i2, int i3) {
        String str2;
        int i4;
        boolean z2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1103537463);
        int i5 = i2 | (dd4Var2.f(ov2Var) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i5 |= dd4Var2.f(ou6Var) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 = i5 | 384;
            str2 = str;
        } else {
            str2 = str;
            i4 = i5 | (dd4Var2.f(str2) ? 256 : Token.CASE);
        }
        int i7 = i4 | (dd4Var2.h(ib4Var) ? 2048 : 1024);
        if (dd4Var2.V(i7 & 1, (i7 & 1171) != 1170)) {
            String str3 = i6 != 0 ? null : str2;
            ur9 ur9Var = s96.a;
            ou6 ou6VarW = t96.w(ou6Var, ((q96) dd4Var2.j(ur9Var)).c.a);
            long jG = dd1.g(((q96) dd4Var2.j(ur9Var)).a, 6.0f);
            lp4 lp4Var = jf0.G;
            ou6 ou6VarL = L(ou6VarW, jG, lp4Var);
            boolean z3 = (i7 & 7168) == 2048;
            Object objQ = dd4Var2.Q();
            if (z3 || objQ == vl1.a) {
                objQ = new mh1(17, ib4Var);
                dd4Var2.p0(objQ);
            }
            ou6 ou6VarF = tg9.f(fw.J(null, (ib4) objQ, ou6VarL, false, 15), 1.0f);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarF);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
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
            String str4 = ov2Var.a;
            qr1 qr1Var = ra1.d;
            px3 px3Var = tg9.c;
            String str5 = str3;
            w05.a(str4, qr1Var, false, d, e, px3Var, null, dd4Var2, 1794096, 396);
            if (str5 != null) {
                dd4Var2.f0(364213992);
                ou6 ou6VarL2 = L(px3Var, lc1.c(0.45f, ((q96) dd4Var2.j(ur9Var)).a.C), lp4Var);
                ha6 ha6VarD2 = pn0.d(bv4.f, false);
                int iHashCode2 = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL2 = dd4Var2.l();
                ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarL2);
                dd4Var2.j0();
                if (dd4Var2.S) {
                    dd4Var2.k(um1Var);
                } else {
                    dd4Var2.s0();
                }
                un9.s(jmVar, dd4Var2, ha6VarD2);
                un9.s(jmVar2, dd4Var2, lr7VarL2);
                ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
                un9.s(jmVar4, dd4Var2, ou6VarL02);
                uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.g;
                long j2 = ((q96) dd4Var2.j(ur9Var)).a.b;
                int i8 = (i7 >> 6) & 14;
                z2 = true;
                str2 = str5;
                nha.c(str2, (ou6) null, j2, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, i8, 0, 131066);
                dd4Var2 = dd4Var;
                dd4Var2.q(true);
                dd4Var2.q(false);
            } else {
                str2 = str5;
                z2 = true;
                dd4Var2.f0(364653169);
                dd4Var2.q(false);
            }
            dd4Var2.q(z2);
        } else {
            dd4Var2.Y();
        }
        String str6 = str2;
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tv2(ov2Var, ou6Var, str6, ib4Var, i2, i3, 0);
        }
    }

    public static final Shader.TileMode k0(int i2) {
        return i2 == 0 ? Shader.TileMode.CLAMP : i2 == 1 ? Shader.TileMode.REPEAT : i2 == 2 ? Shader.TileMode.MIRROR : i2 == 3 ? Build.VERSION.SDK_INT >= 31 ? je.l() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    public static final void l(pv2 pv2Var, ou6 ou6Var, ib4 ib4Var, yb4 yb4Var, dd4 dd4Var, int i2) {
        boolean z2;
        float f2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(467325296);
        int i3 = i2 | (dd4Var2.h(pv2Var) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE) | (dd4Var2.h(yb4Var) ? 2048 : 1024);
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
            sgb sgbVar = pv2Var.f;
            List list = pv2Var.d;
            boolean zF = dd4Var2.f(sgbVar.f);
            Object objQ = dd4Var2.Q();
            fu6 fu6Var = vl1.a;
            Object obj = objQ;
            if (zF || objQ == fu6Var) {
                List list2 = sgbVar.f;
                ArrayList arrayList = new ArrayList(gc1.M(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new lc1(kf0.H((String) it.next())));
                }
                dd4Var2.p0(arrayList);
                obj = arrayList;
            }
            List list3 = (List) obj;
            int i4 = i3 >> 3;
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
            wf0 wf0Var = bv4.x;
            iv ivVar = pv.a;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var2, 48);
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
            w05.a(sgbVar.c, ra1.d, false, null, null, L(t96.w(tg9.n(lu6Var, 30.0f), tp8.a), s00.o(dd4Var2).a, jf0.G), null, dd4Var, 48, 444);
            un9.a(dd4Var, tg9.r(lu6Var, 10.0f));
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            bp5 bp5Var = new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, bp5Var);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA2);
            un9.s(jmVar2, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL03);
            i12.c(sgbVar.b, (ou6) null, list3, wn9.x(16), 0L, new vaa(5), 0L, 0, false, 1, 0, s00.q(dd4Var).h, dd4Var, 3072, 3072, 56818);
            un9.a(dd4Var, tg9.h(lu6Var, 2.0f));
            ri9.f(pv2Var.m, (ou6) null, false, s00.o(dd4Var).s, 0L, 0L, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).n, dd4Var, 0, 0, 131062);
            dd4 dd4Var3 = dd4Var;
            dd4Var3.q(true);
            if (pv2Var.k) {
                xv5.y(dd4Var3, 2132402805, lu6Var, 10.0f, dd4Var3);
                z2 = false;
                mx4.a(i25.c((m53) f53.q.getValue(), dd4Var3, 0), (String) null, tg9.n(lu6Var, 20.0f), s00.o(dd4Var3).a, dd4Var, 432, 0);
                dd4Var3 = dd4Var;
                dd4Var3.q(false);
            } else {
                z2 = false;
                dd4Var3.f0(2132732428);
                dd4Var3.q(false);
            }
            dd4Var3.q(true);
            if (pv2Var.b.length() > 0) {
                ky0.z(dd4Var3, -1540557324, lu6Var, 14.0f, dd4Var3);
                nha.c(pv2Var.b, tg9.f(lu6Var, 1.0f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 2, 0, (kb4) null, s00.q(dd4Var3).h, dd4Var, 48, 24960, 109564);
                dd4Var3 = dd4Var;
                dd4Var3.q(z2);
            } else {
                dd4Var3.f0(-1540199832);
                dd4Var3.q(z2);
            }
            un9.a(dd4Var3, tg9.h(lu6Var, 12.0f));
            nha.c(pv2Var.c, tg9.f(lu6Var, 1.0f), lc1.c(0.88f, s00.o(dd4Var3).q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 4, 0, (kb4) null, s00.q(dd4Var3).j, dd4Var, 48, 24960, 109560);
            if (list.isEmpty()) {
                f2 = 1.0f;
                dd4Var.f0(-1539432024);
                dd4Var.q(false);
            } else {
                ky0.z(dd4Var, -1539750115, lu6Var, 12.0f, dd4Var);
                ou6 ou6VarW = t96.w(lu6Var, s00.p(dd4Var).c);
                f2 = 1.0f;
                j(list, tg9.f(ou6VarW, 1.0f), yb4Var, dd4Var, i4 & 896);
                dd4Var.q(false);
            }
            ou6 ou6VarH = xv5.h(lu6Var, 14.0f, dd4Var, lu6Var, f2);
            eq8 eq8VarA2 = dq8.a(ivVar, wf0Var, dd4Var, 48);
            int iHashCode4 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL4 = dd4Var.l();
            ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarH);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, eq8VarA2);
            un9.s(jmVar2, dd4Var, lr7VarL4);
            ky0.v(iHashCode4, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL04);
            p(String.valueOf(pv2Var.i), pv2Var.j ? (m53) h53.l.getValue() : (m53) h53.k.getValue(), pv2Var.j, ib4Var, dd4Var, (i3 << 3) & 7168);
            un9.a(dd4Var, tg9.r(lu6Var, 8.0f));
            String strValueOf = String.valueOf(pv2Var.l);
            m53 m53Var = (m53) a53.u.getValue();
            Object objQ2 = dd4Var.Q();
            if (objQ2 == fu6Var) {
                objQ2 = new dh1(1);
                dd4Var.p0(objQ2);
            }
            p(strValueOf, m53Var, false, (ib4) objQ2, dd4Var, 3456);
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            un9.a(dd4Var, new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            ri9.f(pv2Var.m, (ou6) null, false, lc1.c(0.6f, s00.o(dd4Var).q), 0L, 0L, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).k, dd4Var, 0, 0, 131062);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ev0(pv2Var, ou6Var, ib4Var, yb4Var, i2, 15);
        }
    }

    public static final List l0(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(fc1.x0(list)) : lc3.a;
    }

    public static final void m(bw2 bw2Var, pj7 pj7Var, szb szbVar, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, kb4 kb4Var, yb4 yb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        int i3;
        szb szbVar2;
        dd4Var.h0(2014399738);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(bw2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            szbVar2 = szbVar;
            i3 |= dd4Var.f(szbVar2) ? 256 : Token.CASE;
        } else {
            szbVar2 = szbVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(ib4Var2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= dd4Var.h(yb4Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if (dd4Var.V(i4 & 1, (38347923 & i4) != 38347922)) {
            g78 g78VarB = z68.b(dd4Var);
            uu5 uu5VarF0 = tw1.f0(dd4Var);
            int i5 = i4 >> 9;
            mt5.d(uu5VarF0, ib4Var2, dd4Var, i5 & 896);
            z68.a(bw2Var.a, ib4Var, ou6Var, g78VarB, (f9) null, jf0.G(287547859, new c41(10, g78VarB, bw2Var, pj7Var), dd4Var), false, 0.0f, jf0.G(651842646, new el0(uu5VarF0, pj7Var, szbVar2, bw2Var, kb4Var2, kb4Var, yb4Var, 1), dd4Var), dd4Var, (i5 & Token.ASSIGN_MOD) | 100859904 | ((i4 >> 3) & 896));
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fl0(bw2Var, pj7Var, szbVar, ou6Var, ib4Var, ib4Var2, kb4Var, yb4Var, kb4Var2, i2);
        }
    }

    public static final Map m0(Map map) {
        int size = map.size();
        if (size == 0) {
            return mc3.a;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) fc1.w0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final void n(pj7 pj7Var, szb szbVar, ou6 ou6Var, dd4 dd4Var, int i2) {
        pj7 pj7Var2;
        int i3;
        ou6 ou6Var2;
        dd4Var.h0(-1431329908);
        if ((i2 & 6) == 0) {
            pj7Var2 = pj7Var;
            i3 = (dd4Var.f(pj7Var2) ? 4 : 2) | i2;
        } else {
            pj7Var2 = pj7Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(szbVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            ou6Var2 = ou6Var;
            i3 |= dd4Var.f(ou6Var2) ? 256 : Token.CASE;
        } else {
            ou6Var2 = ou6Var;
        }
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            iq9 iq9Var = new iq9(320.0f);
            int i4 = i3;
            uu5 uu5VarF0 = tw1.f0(dd4Var);
            mv mvVar = new mv(6.0f, true, new gp(5));
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = new gq2(7);
                dd4Var.p0(objQ);
            }
            gx1.j(iq9Var, ou6Var2, uu5VarF0, pj7Var2, 6.0f, mvVar, null, false, 0L, 0L, szbVar, (kb4) objQ, dd4Var, ((i4 >> 3) & Token.ASSIGN_MOD) | 102432768 | ((i4 << 9) & 7168), (i4 & Token.ASSIGN_MOD) | 384, 1680);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yk0(pj7Var, szbVar, ou6Var, i2, 1);
        }
    }

    public static void n0(String str, String str2) {
        synchronized (e0) {
            Log.w(str, J(str2, null));
        }
    }

    public static final void o(int i2, int i3, dd4 dd4Var, ou6 ou6Var) {
        lu6 lu6Var;
        int i4;
        boolean z2;
        wf0 wf0Var = bv4.x;
        dd4Var.h0(829217924);
        int i5 = i3 | (dd4Var.d(i2) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16);
        if (dd4Var.V(i5 & 1, (i5 & 19) != 18)) {
            float f2 = 0.68f;
            float f3 = i2 != 1 ? i2 != 2 ? 0.76f : 0.84f : 0.68f;
            float f4 = i2 != 1 ? i2 != 2 ? 0.8f : 0.58f : 0.72f;
            if (i2 == 1) {
                f2 = 0.44f;
            } else if (i2 != 2) {
                f2 = 0.56f;
            }
            float f5 = i2 != 1 ? i2 != 2 ? 0.4f : 0.46f : 0.32f;
            boolean z3 = i2 != 2;
            vf0 vf0Var = bv4.z;
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var, 0);
            float f6 = f3;
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
            boolean z4 = z3;
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var, ou6VarL0);
            lu6 lu6Var2 = lu6.a;
            float f7 = f5;
            ou6 ou6VarF = tg9.f(lu6Var2, 1.0f);
            iv ivVar = pv.a;
            float f8 = f2;
            float f9 = f4;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var, 48);
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
            ou6 ou6VarN = tg9.n(lu6Var2, 30.0f);
            rp8 rp8Var = tp8.a;
            ah1.q(null, t96.w(ou6VarN, rp8Var), dd4Var, 0, 1);
            un9.a(dd4Var, tg9.r(lu6Var2, 10.0f));
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            bp5 bp5Var = new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, bp5Var);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA2);
            un9.s(jmVar2, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL03);
            ah1.r(tg9.h(tg9.r(lu6Var2, 110.0f), 18.0f), null, dd4Var, 6, 2);
            un9.a(dd4Var, tg9.h(lu6Var2, 4.0f));
            ah1.r(tg9.h(tg9.r(lu6Var2, 72.0f), 12.0f), null, dd4Var, 6, 2);
            dd4Var.q(true);
            if (i2 != 2) {
                lu6Var = lu6Var2;
                xv5.y(dd4Var, 313897534, lu6Var, 10.0f, dd4Var);
                i4 = 0;
                ah1.r(tg9.n(lu6Var, 20.0f), rp8Var, dd4Var, 6, 0);
                dd4Var.q(false);
            } else {
                lu6Var = lu6Var2;
                i4 = 0;
                dd4Var.f0(314107032);
                dd4Var.q(false);
            }
            xv5.z(dd4Var, true, lu6Var, 12.0f, dd4Var);
            ah1.r(tg9.h(tg9.f(lu6Var, f6), 18.0f), null, dd4Var, i4, 2);
            ah1.r(tg9.h(xv5.h(lu6Var, 10.0f, dd4Var, lu6Var, 1.0f), 12.0f), null, dd4Var, 6, 2);
            ah1.r(tg9.h(xv5.h(lu6Var, 4.0f, dd4Var, lu6Var, f9), 12.0f), null, dd4Var, 0, 2);
            ah1.r(tg9.h(xv5.h(lu6Var, 4.0f, dd4Var, lu6Var, f8), 12.0f), null, dd4Var, 0, 2);
            ah1.r(tg9.h(xv5.h(lu6Var, 4.0f, dd4Var, lu6Var, f7), 12.0f), null, dd4Var, 0, 2);
            if (z4) {
                ky0.z(dd4Var, 1570925778, lu6Var, 12.0f, dd4Var);
                if (i2 == 0) {
                    dd4Var.f0(1570978757);
                    ah1.q(null, t96.w(tg9.h(tg9.f(lu6Var, 1.0f), 180.0f), ((q96) dd4Var.j(s96.a)).c.c), dd4Var, 0, 1);
                    dd4Var.q(false);
                    z2 = false;
                } else {
                    dd4Var.f0(1571243559);
                    ie1 ie1VarA3 = ge1.a(new mv(6.0f, true, new gp(5)), vf0Var, dd4Var, 6);
                    int iHashCode4 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL4 = dd4Var.l();
                    ou6 ou6VarL04 = s32.L0(dd4Var, lu6Var);
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(jmVar, dd4Var, ie1VarA3);
                    un9.s(jmVar2, dd4Var, lr7VarL4);
                    ky0.v(iHashCode4, dd4Var, jmVar3, dd4Var, kdVar);
                    un9.s(jmVar4, dd4Var, ou6VarL04);
                    ah1.q(null, t96.w(tg9.h(tg9.f(lu6Var, 1.0f), 102.0f), ((q96) dd4Var.j(s96.a)).c.c), dd4Var, 0, 1);
                    ou6 ou6VarH = tg9.h(lu6Var, 72.0f);
                    eq8 eq8VarA2 = dq8.a(new mv(6.0f, true, new gp(5)), bv4.w, dd4Var, 6);
                    int iHashCode5 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL5 = dd4Var.l();
                    ou6 ou6VarL05 = s32.L0(dd4Var, ou6VarH);
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(jmVar, dd4Var, eq8VarA2);
                    un9.s(jmVar2, dd4Var, lr7VarL5);
                    ky0.v(iHashCode5, dd4Var, jmVar3, dd4Var, kdVar);
                    un9.s(jmVar4, dd4Var, ou6VarL05);
                    dd4Var.f0(40223997);
                    for (int i6 = 0; i6 < 2; i6++) {
                        if (1.0f <= 0.0d) {
                            o75.a("invalid weight; must be greater than zero");
                        }
                        ah1.q(null, t96.w(tg9.c(new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f), ((q96) dd4Var.j(s96.a)).c.c), dd4Var, 0, 1);
                    }
                    z2 = false;
                    dd4Var.q(false);
                    dd4Var.q(true);
                    dd4Var.q(true);
                    dd4Var.q(false);
                }
                dd4Var.q(z2);
            } else {
                dd4Var.f0(1572157780);
                dd4Var.q(false);
            }
            ou6 ou6VarH2 = xv5.h(lu6Var, 14.0f, dd4Var, lu6Var, 1.0f);
            eq8 eq8VarA3 = dq8.a(ivVar, wf0Var, dd4Var, 48);
            int iHashCode6 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL6 = dd4Var.l();
            ou6 ou6VarL06 = s32.L0(dd4Var, ou6VarH2);
            ml1.k.getClass();
            um1 um1Var2 = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var2);
            } else {
                dd4Var.s0();
            }
            un9.s(ll1.f, dd4Var, eq8VarA3);
            un9.s(ll1.e, dd4Var, lr7VarL6);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode6));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL06);
            rp8 rp8Var2 = tp8.a;
            ah1.r(tg9.h(tg9.r(lu6Var, 62.0f), 30.0f), rp8Var2, dd4Var, 6, 0);
            un9.a(dd4Var, tg9.r(lu6Var, 8.0f));
            ah1.r(tg9.h(tg9.r(lu6Var, 62.0f), 30.0f), rp8Var2, dd4Var, 6, 0);
            un9.a(dd4Var, new bp5(1.0f, true));
            ah1.r(tg9.h(tg9.r(lu6Var, 64.0f), 14.0f), null, dd4Var, 6, 2);
            dd4Var.q(true);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ue(i2, i3, 3, ou6Var);
        }
    }

    public static void o0(String str, String str2, Throwable th) {
        synchronized (e0) {
            Log.w(str, J(str2, th));
        }
    }

    public static final void p(String str, m53 m53Var, boolean z2, ib4 ib4Var, dd4 dd4Var, int i2) {
        String str2;
        int i3;
        long jG;
        ou6 ou6VarG;
        long j2;
        long j3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1482373954);
        if ((i2 & 6) == 0) {
            str2 = str;
            i3 = (dd4Var2.f(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.f(m53Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var2.g(z2) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 2048 : 1024;
        }
        int i4 = i3;
        if (dd4Var2.V(i4 & 1, (i4 & 1171) != 1170)) {
            rp8 rp8Var = tp8.a;
            ou6 ou6Var = lu6.a;
            ou6 ou6VarW = t96.w(ou6Var, rp8Var);
            if (z2) {
                dd4Var2.f0(-548491129);
                jG = lc1.c(0.14f, ((q96) dd4Var2.j(s96.a)).a.a);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-548392859);
                jG = dd1.g(((q96) dd4Var2.j(s96.a)).a, 8.0f);
                dd4Var2.q(false);
            }
            ou6 ou6VarL = L(ou6VarW, jG, jf0.G);
            if (z2) {
                dd4Var2.f0(-548229396);
                ou6VarG = fw.G(ou6Var, 1.0f, lc1.c(0.18f, ((q96) dd4Var2.j(s96.a)).a.a), rp8Var);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-547983628);
                dd4Var2.q(false);
                ou6VarG = ou6Var;
            }
            ou6 ou6VarE = ou6VarL.e(ou6VarG);
            boolean z3 = (i4 & 7168) == 2048;
            Object objQ = dd4Var2.Q();
            if (z3 || objQ == vl1.a) {
                objQ = new mh1(16, ib4Var);
                dd4Var2.p0(objQ);
            }
            ou6 ou6VarM0 = gjb.m0(yn2.s(ou6VarE, false, 0.94f, (ib4) objQ, 1), 10.0f, 7.0f);
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
            un9.s(ll1.f, dd4Var2, eq8VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            p35 p35VarC = i25.c(m53Var, dd4Var2, (i4 >> 3) & 14);
            if (z2) {
                dd4Var2.f0(1774389921);
                j2 = ((q96) dd4Var2.j(s96.a)).a.a;
            } else {
                dd4Var2.f0(1774391178);
                j2 = ((q96) dd4Var2.j(s96.a)).a.s;
            }
            dd4Var2.q(false);
            mx4.a(p35VarC, (String) null, tg9.n(ou6Var, 16.0f), j2, dd4Var2, 432, 0);
            un9.a(dd4Var2, tg9.r(ou6Var, 6.0f));
            ur9 ur9Var = s96.a;
            uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.m;
            if (z2) {
                dd4Var2.f0(1774400033);
                j3 = ((q96) dd4Var2.j(ur9Var)).a.a;
            } else {
                dd4Var2.f0(1774401290);
                j3 = ((q96) dd4Var2.j(ur9Var)).a.s;
            }
            dd4Var2.q(false);
            nha.c(str2, (ou6) null, j3, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, i4 & 14, 0, 131066);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new al0(str, m53Var, z2, ib4Var, i2, 1);
        }
    }

    public static void p0(s57 s57Var, he8 he8Var) {
        he8Var.A(s57Var.a);
        he8Var.writeByte(10);
        he8Var.A(s57Var.b);
        he8Var.writeByte(10);
        he8Var.A(s57Var.c);
        he8Var.writeByte(10);
        Set<Map.Entry> setEntrySet = s57Var.d.a.entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        he8Var.A(size);
        he8Var.writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            for (String str : (List) entry.getValue()) {
                he8Var.d0((String) entry.getKey());
                he8Var.d0(":");
                he8Var.d0(str);
                he8Var.writeByte(10);
            }
        }
    }

    public static final void q(boolean z2, String str, String str2, bi5 bi5Var, boolean z3, kb4 kb4Var, kb4 kb4Var2, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i2) {
        str.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        ib4Var.getClass();
        ib4Var2.getClass();
        dd4Var.h0(1433686300);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.f(str) ? 32 : 16) | (dd4Var.f(str2) ? 256 : Token.CASE) | (dd4Var.f(bi5Var) ? 2048 : 1024) | (dd4Var.g(z3) ? 16384 : 8192) | (dd4Var.h(ib4Var) ? 8388608 : 4194304) | (dd4Var.h(ib4Var2) ? 67108864 : 33554432);
        if (dd4Var.V(i3 & 1, (38347923 & i3) != 38347922)) {
            fw.q(z2, kb4Var, null, false, null, null, 0L, 0L, 0.0f, 0L, null, jf0.G(1063652160, new fh1(1, str, ib4Var2, kb4Var2, ib4Var, bi5Var, str2, z3), dd4Var), dd4Var, (i3 & 14) | 48, 48, 2044);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new j41(z2, str, str2, bi5Var, z3, kb4Var, kb4Var2, ib4Var, ib4Var2, i2);
        }
    }

    public static final void r(int i2, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, ou6 ou6Var, String str) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(515541602);
        int i3 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.h(ib4Var2) ? 2048 : 1024);
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
            ha6 ha6VarD = pn0.d(bv4.b, false);
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
            px3 px3Var = tg9.c;
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, px3Var);
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
            dd4Var2.f0(371202836);
            String strK = bw9.a0(str) ? wn9.K((pv9) eu9.D.getValue(), dd4Var2) : str;
            dd4Var2.q(false);
            boolean z2 = false;
            nha.c(strK, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var, 0, 0, 261118);
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var, tg9.h(lu6Var, 24.0f));
            kc5.n(i25.c((m53) f53.d0.getValue(), dd4Var, 0), wn9.K((pv9) mu9.Q.getValue(), dd4Var), false, null, null, null, null, null, ib4Var, dd4Var, 100663296, 252);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            p35 p35VarC = i25.c((m53) a53.d.getValue(), dd4Var2, 0);
            ou6 ou6VarH0 = lc5.h0(lu6Var);
            if ((i3 & 7168) == 2048) {
                z2 = true;
            }
            Object objQ = dd4Var2.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new xf3(7, ib4Var2);
                dd4Var2.p0(objQ);
            }
            sw1.r(p35VarC, ou6VarH0, 0L, (ib4) objQ, dd4Var2, 0, 4);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xf1(str, ou6Var, ib4Var, ib4Var2, i2, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v27, types: [int] */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v61 */
    public static final void s(String str, String str2, String str3, String str4, ou6 ou6Var, boolean z2, ac4 ac4Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        ib4 ib4Var2;
        lu6 lu6Var;
        kd kdVar;
        br9 br9Var;
        int i3;
        Object obj;
        yb4 yb4Var;
        boolean z3;
        aw3 aw3Var;
        br9 br9Var2;
        ib4 ib4Var3;
        a07 a07Var;
        boolean z4;
        yb4 yb4Var2;
        a07 a07Var2;
        dd4 dd4Var3;
        ?? r4;
        String str5;
        Object sx2Var;
        br9 br9Var3;
        qr1 qr1Var = ra1.d;
        dd4Var.h0(-1039200470);
        int i4 = i2 | (dd4Var.f(str) ? 4 : 2) | (dd4Var.f(str2) ? 32 : 16) | (dd4Var.f(str3) ? 256 : Token.CASE) | (dd4Var.f(str4) ? 2048 : 1024) | (dd4Var.f(ou6Var) ? 16384 : 8192) | (dd4Var.g(z2) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(ac4Var) ? 1048576 : 524288) | (dd4Var.h(ib4Var) ? 8388608 : 4194304);
        if (dd4Var.V(i4 & 1, (4793491 & i4) != 4793490)) {
            Object[] objArr = new Object[0];
            int i5 = i4 & Token.ASSIGN_MOD;
            boolean z5 = i5 == 32;
            Object objQ = dd4Var.Q();
            Object obj2 = vl1.a;
            if (z5 || objQ == obj2) {
                objQ = new wj0(str2, 27);
                dd4Var.p0(objQ);
            }
            a07 a07Var3 = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 0);
            Object[] objArr2 = new Object[0];
            boolean z6 = (i4 & 896) == 256;
            Object objQ2 = dd4Var.Q();
            if (z6 || objQ2 == obj2) {
                objQ2 = new wj0(str3, 28);
                dd4Var.p0(objQ2);
            }
            a07 a07Var4 = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var, 0);
            Object[] objArr3 = new Object[0];
            boolean z7 = (i4 & 7168) == 2048;
            Object objQ3 = dd4Var.Q();
            if (z7 || objQ3 == obj2) {
                objQ3 = new wj0(str4, 29);
                dd4Var.p0(objQ3);
            }
            br9 br9Var4 = (a07) ww1.b0(objArr3, (ib4) objQ3, dd4Var, 0);
            Object objQ4 = dd4Var.Q();
            if (objQ4 == obj2) {
                objQ4 = dk9.x((Object) null);
                dd4Var.p0(objQ4);
            }
            br9 br9Var5 = (a07) objQ4;
            Object objQ5 = dd4Var.Q();
            if (objQ5 == obj2) {
                objQ5 = new wf3(br9Var5, 19);
                dd4Var.p0(objQ5);
            }
            aw3 aw3VarC0 = e11.c0(ns7.a, (kb4) objQ5, dd4Var, 48);
            Object[] objArr4 = new Object[0];
            Object objQ6 = dd4Var.Q();
            int i6 = 10;
            if (objQ6 == obj2) {
                objQ6 = new tl3(i6);
                dd4Var.p0(objQ6);
            }
            a07 a07Var5 = (a07) ww1.b0(objArr4, (ib4) objQ6, dd4Var, 48);
            xf0 xf0Var = bv4.b;
            ha6 ha6VarD = pn0.d(xf0Var, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var);
            ml1.k.getClass();
            ib4 ib4Var4 = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var4);
            } else {
                dd4Var.s0();
            }
            yb4 yb4Var3 = ll1.f;
            un9.s(yb4Var3, dd4Var, ha6VarD);
            yb4 yb4Var4 = ll1.e;
            un9.s(yb4Var4, dd4Var, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar = ll1.g;
            un9.s(jmVar, dd4Var, numValueOf);
            kd kdVar2 = ll1.h;
            un9.r(dd4Var, kdVar2);
            jm jmVar2 = ll1.d;
            un9.s(jmVar2, dd4Var, ou6VarL0);
            lu6 lu6Var2 = lu6.a;
            ou6 ou6VarQ = kc5.Q(yn2.E(zn0.a.a(tg9.c(lu6Var2, 1.0f), bv4.c), dd4Var, 0), kc5.J(dd4Var), 14);
            ie1 ie1VarA = ge1.a(pv.c, bv4.A, dd4Var, 48);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarQ);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var4);
            } else {
                dd4Var.s0();
            }
            un9.s(yb4Var3, dd4Var, ie1VarA);
            un9.s(yb4Var4, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar, dd4Var, kdVar2);
            un9.s(jmVar2, dd4Var, ou6VarL02);
            un9.a(dd4Var, tg9.h(lu6Var2, 44.0f));
            ou6 ou6VarW = t96.w(tg9.o(lu6Var2, 120.0f, 180.0f), s00.p(dd4Var).b);
            ha6 ha6VarD2 = pn0.d(xf0Var, false);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarW);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var4);
            } else {
                dd4Var.s0();
            }
            un9.s(yb4Var3, dd4Var, ha6VarD2);
            un9.s(yb4Var4, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar, dd4Var, kdVar2);
            un9.s(jmVar2, dd4Var, ou6VarL03);
            if (((bi5) br9Var5.getValue()) == null) {
                dd4Var.f0(-1993783559);
                lu6Var = lu6Var2;
                kdVar = kdVar2;
                br9Var = br9Var5;
                i3 = i4;
                obj = obj2;
                w05.c(str, str2, "", "", qr1Var, tg9.c, dd4Var, (i4 & 14) | 224640 | i5);
                dd4Var.q(false);
                r4 = 0;
                yb4Var2 = yb4Var3;
                yb4Var = yb4Var4;
                a07Var = a07Var4;
                aw3Var = aw3VarC0;
                br9Var2 = br9Var4;
                a07Var2 = a07Var3;
                z3 = true;
                dd4Var3 = dd4Var;
                ib4Var3 = ib4Var4;
            } else {
                lu6Var = lu6Var2;
                kdVar = kdVar2;
                br9Var = br9Var5;
                i3 = i4;
                obj = obj2;
                dd4Var.f0(-1993401639);
                bi5 bi5Var = (bi5) br9Var.getValue();
                if (bi5Var == null) {
                    dd4Var.f0(-1993401640);
                    dd4Var.q(false);
                    z4 = false;
                    yb4Var2 = yb4Var3;
                    yb4Var = yb4Var4;
                    a07Var = a07Var4;
                    aw3Var = aw3VarC0;
                    br9Var2 = br9Var4;
                    a07Var2 = a07Var3;
                    z3 = true;
                    dd4Var3 = dd4Var;
                    ib4Var3 = ib4Var4;
                } else {
                    dd4Var.f0(-1993401639);
                    yb4Var = yb4Var4;
                    z3 = true;
                    aw3Var = aw3VarC0;
                    br9Var2 = br9Var4;
                    ib4Var3 = ib4Var4;
                    a07Var = a07Var4;
                    z4 = false;
                    yb4Var2 = yb4Var3;
                    a07Var2 = a07Var3;
                    w05.a(bi5Var, qr1Var, false, null, null, tg9.c, null, dd4Var, 1572912, 444);
                    dd4Var3 = dd4Var;
                    dd4Var3.q(false);
                }
                dd4Var3.q(z4);
                r4 = z4;
            }
            lu6 lu6Var3 = lu6Var;
            xv5.z(dd4Var3, z3, lu6Var3, 8.0f, dd4Var3);
            p35 p35VarC = i25.c((m53) a53.P.getValue(), dd4Var3, r4);
            String strK = wn9.K((pv9) vt9.d0.getValue(), dd4Var3);
            boolean zF = dd4Var3.f(aw3Var);
            Object objQ7 = dd4Var3.Q();
            if (zF || objQ7 == obj) {
                objQ7 = new k51(aw3Var, 6);
                dd4Var3.p0(objQ7);
            }
            kc5.n(p35VarC, strK, false, null, null, null, null, null, (ib4) objQ7, dd4Var, 0, 252);
            String str6 = (String) tw2.l(lu6Var3, 12.0f, dd4Var, a07Var2);
            uw1 uw1Var = s00.p(dd4Var).b;
            ou6 ou6VarN0 = gjb.n0(tg9.f(tg9.t(lu6Var3, 0.0f, 420.0f, 1), 1.0f), 24.0f, 0.0f, 2);
            boolean zF2 = dd4Var.f(a07Var2);
            Object objQ8 = dd4Var.Q();
            if (zF2 || objQ8 == obj) {
                objQ8 = new wf3(a07Var2, 20);
                dd4Var.p0(objQ8);
            }
            lx1.m(str6, (kb4) objQ8, ou6VarN0, false, false, null, m79.l, null, null, null, false, null, null, null, false, 0, 0, uw1Var, null, dd4Var, 1573248, 0, 6291384);
            String str7 = (String) tw2.l(lu6Var3, 12.0f, dd4Var, a07Var);
            uw1 uw1Var2 = s00.p(dd4Var).b;
            a07 a07Var6 = a07Var2;
            ou6 ou6VarN02 = gjb.n0(tg9.f(tg9.t(lu6Var3, 0.0f, 420.0f, 1), 1.0f), 24.0f, 0.0f, 2);
            boolean zF3 = dd4Var.f(a07Var);
            Object objQ9 = dd4Var.Q();
            if (zF3 || objQ9 == obj) {
                objQ9 = new wf3(a07Var, 21);
                dd4Var.p0(objQ9);
            }
            lx1.m(str7, (kb4) objQ9, ou6VarN02, false, false, null, m79.m, null, null, null, false, null, null, null, false, 0, 0, uw1Var2, null, dd4Var, 1573248, 0, 6291384);
            un9.a(dd4Var, tg9.h(lu6Var3, 12.0f));
            nha.c(wn9.K((pv9) iu9.g0.getValue(), dd4Var), lu6Var3, s00.o(dd4Var).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).i, dd4Var, 48, 0, 131064);
            un9.a(dd4Var, tg9.h(lu6Var3, 6.0f));
            ou6 ou6VarW2 = t96.w(gjb.n0(tg9.f(tg9.t(tg9.h(lu6Var3, 56.0f), 0.0f, 420.0f, 1), 1.0f), 24.0f, 0.0f, 2), s00.p(dd4Var).b);
            boolean zF4 = dd4Var.f(a07Var5);
            Object objQ10 = dd4Var.Q();
            if (zF4 || objQ10 == obj) {
                objQ10 = new zl3(a07Var5, 11);
                dd4Var.p0(objQ10);
            }
            ou6 ou6VarN03 = gjb.n0(fw.G(fw.J(null, (ib4) objQ10, ou6VarW2, false, 15), 1.5f, s00.o(dd4Var).A, s00.p(dd4Var).b), 12.0f, 0.0f, 2);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var, 48);
            int iHashCode4 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL4 = dd4Var.l();
            ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarN03);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var3);
            } else {
                dd4Var.s0();
            }
            un9.s(yb4Var2, dd4Var, eq8VarA);
            un9.s(yb4Var, dd4Var, lr7VarL4);
            ky0.v(iHashCode4, dd4Var, jmVar, dd4Var, kdVar);
            un9.s(jmVar2, dd4Var, ou6VarL04);
            boolean zF5 = dd4Var.f((String) br9Var2.getValue());
            Object objQ11 = dd4Var.Q();
            Object obj3 = objQ11;
            if (zF5 || objQ11 == obj) {
                str5 = "";
                String strA = str5;
                if (((String) br9Var2.getValue()).length() != 0) {
                    f36 f36VarL = sw1.L((String) br9Var2.getValue());
                    String strB = f36VarL != null ? f36VarL.b(sw1.N()) : null;
                    strA = j39.A(strB != null ? strB : "", " (", (String) br9Var2.getValue(), ")");
                }
                dd4Var.p0(strA);
                obj3 = strA;
            }
            String strK2 = (String) obj3;
            dd4Var.f0(527731042);
            if (strK2.length() == 0) {
                strK2 = wn9.K((pv9) eu9.n.getValue(), dd4Var);
            }
            dd4Var.q(false);
            nha.c(strK2, new bp5(1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var, 0, 0, 262140);
            p35 p35VarC2 = i25.c((m53) f53.s.getValue(), dd4Var, 0);
            ou6 ou6VarP0 = gjb.p0(lu6Var3, 0.0f, 0.0f, 12.0f, 0.0f, 11);
            a07 a07Var7 = a07Var;
            br9 br9Var6 = br9Var2;
            mx4.a(p35VarC2, (String) null, ou6VarP0, 0L, dd4Var, 432, 8);
            xv5.z(dd4Var, true, lu6Var3, 12.0f, dd4Var);
            if (z2) {
                dd4Var.f0(80002251);
                sdc.y(tg9.n(lu6Var3, 28.0f), 0L, null, dd4Var, 6, 6);
                dd4Var.q(false);
                dd4Var2 = dd4Var;
                br9Var3 = br9Var6;
            } else {
                dd4Var.f0(80170860);
                p35 p35VarC3 = i25.c((m53) f53.g0.getValue(), dd4Var, 0);
                String strK3 = wn9.K((pv9) iu9.v.getValue(), dd4Var);
                boolean z8 = ((String) a07Var6.getValue()).length() > 0 && ((String) br9Var6.getValue()).length() > 0;
                ou6 ou6VarN04 = gjb.n0(tg9.f(tg9.t(lu6Var3, 0.0f, 420.0f, 1), 1.0f), 24.0f, 0.0f, 2);
                boolean zF6 = ((i3 & 3670016) == 1048576) | dd4Var.f(a07Var6) | dd4Var.f(a07Var7) | dd4Var.f(br9Var6);
                Object objQ12 = dd4Var.Q();
                if (zF6 || objQ12 == obj) {
                    sx2Var = new sx2(ac4Var, a07Var6, a07Var7, br9Var6, br9Var, 3);
                    br9Var3 = br9Var6;
                    dd4Var.p0(sx2Var);
                } else {
                    sx2Var = objQ12;
                    br9Var3 = br9Var6;
                }
                kc5.n(p35VarC3, strK3, z8, null, ou6VarN04, null, null, null, (ib4) sx2Var, dd4Var, 24576, 232);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
            boolean zBooleanValue = ((Boolean) a07Var5.getValue()).booleanValue();
            boolean zF7 = dd4Var2.f(a07Var5);
            Object objQ13 = dd4Var2.Q();
            if (zF7 || objQ13 == obj) {
                objQ13 = new wf3(a07Var5, 18);
                dd4Var2.p0(objQ13);
            }
            kb4 kb4Var = (kb4) objQ13;
            boolean zF8 = dd4Var2.f(br9Var3) | dd4Var2.f(a07Var5);
            Object objQ14 = dd4Var2.Q();
            if (zF8 || objQ14 == obj) {
                objQ14 = new rl0(br9Var3, a07Var5, 10);
                dd4Var2.p0(objQ14);
            }
            kl8.y(zBooleanValue, kb4Var, (kb4) objQ14, dd4Var2, 0);
            p35 p35VarC4 = i25.c((m53) a53.d.getValue(), dd4Var2, 0);
            boolean z9 = (i3 & 29360128) == 8388608;
            Object objQ15 = dd4Var2.Q();
            if (z9 || objQ15 == obj) {
                ib4Var2 = ib4Var;
                objQ15 = new xf3(6, ib4Var2);
                dd4Var2.p0(objQ15);
            } else {
                ib4Var2 = ib4Var;
            }
            sw1.r(p35VarC4, lu6Var3, 0L, (ib4) objQ15, dd4Var2, 48, 4);
            dd4Var2.q(true);
        } else {
            dd4Var2 = dd4Var;
            ib4Var2 = ib4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new qx2(str, str2, str3, str4, ou6Var, z2, ac4Var, ib4Var2, i2, 2);
        }
    }

    public static final void t(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, String str) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1019619958);
        int i3 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ha6 ha6VarD = pn0.d(bv4.b, false);
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
            px3 px3Var = tg9.c;
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, px3Var);
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
            ur9 ur9Var = s96.a;
            uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.g;
            long j2 = ((q96) dd4Var2.j(ur9Var)).a.q;
            lu6 lu6Var = lu6.a;
            nha.c(str, gjb.l0(lu6Var, 24.0f), j2, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, (i3 & 14) | 48, 0, 130040);
            sdc.y(tg9.n(lu6Var, 48.0f), ((q96) dd4Var.j(ur9Var)).a.q, null, dd4Var, 6, 4);
            dd4Var.q(true);
            p35 p35VarC = i25.c((m53) a53.d.getValue(), dd4Var, 0);
            ou6 ou6VarH0 = lc5.h0(lu6Var);
            boolean z2 = (i3 & 896) == 256;
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new xf3(8, ib4Var);
                dd4Var.p0(objQ);
            }
            sw1.r(p35VarC, ou6VarH0, 0L, (ib4) objQ, dd4Var, 0, 4);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new gv0(str, ou6Var, ib4Var, i2, 7);
        }
    }

    public static final void u(String str, t27 t27Var, ou6 ou6Var, dd4 dd4Var, int i2) {
        int i3;
        dd4 dd4Var2;
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(-372228874);
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
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            boolean z2 = (i3 & 14) == 4;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = new wj0(str, 26);
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
            a91 a91VarA = ug8.a(ys3.class);
            ys3 ys3Var = (ys3) ((qtb) qx1.N(a91VarA, pj4VarA.f(), dx1.h(a91VarA.f(), "-", str), ry6VarD, ev8VarA, ib4Var));
            boolean zF = dd4Var.f(ys3Var);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new rx2(ys3Var, 9);
                dd4Var.p0(objQ2);
            }
            lx1.g(ys3Var, null, (kb4) objQ2, dd4Var, 0);
            a07 a07VarB = bx1.B(ys3Var.j0, dd4Var);
            a07 a07VarB2 = bx1.B(ys3Var.U0, dd4Var);
            ad1 ad1Var = ((q96) dd4Var.j(s96.a)).a;
            boolean zF2 = dd4Var.f((yba) a07VarB.getValue()) | dd4Var.f(ad1Var);
            Object objQ3 = dd4Var.Q();
            if (zF2 || objQ3 == obj) {
                boolean z3 = ((yba) a07VarB.getValue()).a.length() == 0;
                objQ3 = dk9.x(new lra(z3, ((yba) a07VarB.getValue()).g, z3 ? ad1Var.q : kf0.H(((yba) a07VarB.getValue()).d), z3 ? ad1Var.p : kf0.H(((yba) a07VarB.getValue()).e), ((yba) a07VarB.getValue()).f, qu1.X(((yba) a07VarB.getValue()).h)));
                dd4Var.p0(objQ3);
            }
            a07 a07Var = (a07) objQ3;
            a07 a07VarB3 = bx1.B(ys3Var.p0, dd4Var);
            WeakHashMap weakHashMap = pzb.w;
            z85 z85VarR = jv3.r(ju7.i(dd4Var).b, dd4Var);
            boolean zF3 = dd4Var.f((yba) a07VarB.getValue());
            Object objQ4 = dd4Var.Q();
            if (zF3 || objQ4 == obj) {
                rj7 rj7Var = new rj7(((yba) a07VarB.getValue()).D, ((yba) a07VarB.getValue()).F, ((yba) a07VarB.getValue()).E, ((yba) a07VarB.getValue()).G);
                dd4Var.p0(rj7Var);
                objQ4 = rj7Var;
            }
            a07 a07VarB4 = bx1.B(ys3Var.q0, dd4Var);
            fx1.p(((yba) a07VarB.getValue()).o, ((yba) a07VarB.getValue()).r, ((yba) a07VarB.getValue()).p, ((yba) a07VarB.getValue()).q, dd4Var, 0);
            lra lraVar = (lra) a07Var.getValue();
            dd4Var2 = dd4Var;
            hn9.h(lraVar, jf0.G(1059817638, new zs3(ys3Var, ou6Var, z85VarR, t27Var, str, (pj7) objQ4, a07Var, a07VarB2, a07VarB3, a07VarB, a07VarB4), dd4Var2), dd4Var2, 48);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fv0(str, t27Var, ou6Var, i2, 4);
        }
    }

    public static final void v(boolean z2, t61 t61Var, wga wgaVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, ib4 ib4Var, ib4 ib4Var2, kb4 kb4Var3, ib4 ib4Var3, dd4 dd4Var, int i2) {
        t61Var.getClass();
        wgaVar.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        ib4Var.getClass();
        ib4Var2.getClass();
        kb4Var3.getClass();
        ib4Var3.getClass();
        dd4Var.h0(311733825);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.f(t61Var) ? 32 : 16) | (dd4Var.f(wgaVar) ? 256 : Token.CASE) | (dd4Var.f(ou6Var) ? 2048 : 1024) | (dd4Var.h(kb4Var2) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(ib4Var) ? 1048576 : 524288) | (dd4Var.h(ib4Var2) ? 8388608 : 4194304) | (dd4Var.h(kb4Var3) ? 67108864 : 33554432) | (dd4Var.h(ib4Var3) ? 536870912 : 268435456);
        if (dd4Var.V(i3 & 1, (i3 & 306783379) != 306783378)) {
            st5 st5VarA = ut5.a(0, dd4Var, 0, 3);
            boolean z3 = ((i3 & Token.ASSIGN_MOD) == 32) | ((i3 & 29360128) == 8388608);
            Object objQ = dd4Var.Q();
            if (z3 || objQ == vl1.a) {
                objQ = new y6(15, t61Var, ib4Var2);
                dd4Var.p0(objQ);
            }
            mt5.c(st5VarA, 0, (ib4) objQ, dd4Var, 0, 2);
            fw.q(z2, kb4Var, ou6Var, false, null, null, 0L, 0L, 0.0f, 0L, null, jf0.G(462015389, new el0(t61Var, ib4Var3, wgaVar, kb4Var2, ib4Var, st5VarA, kb4Var3), dd4Var), dd4Var, (i3 & 14) | 48 | ((i3 >> 3) & 896), 48, 2040);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new f41(z2, t61Var, wgaVar, ou6Var, kb4Var, kb4Var2, ib4Var, ib4Var2, kb4Var3, ib4Var3, i2);
        }
    }

    public static final void w(sgb sgbVar, boolean z2, ib4 ib4Var, dd4 dd4Var, int i2) {
        long jG;
        dd4Var.h0(-1705281085);
        int i3 = i2 | (dd4Var.h(sgbVar) ? 4 : 2) | (dd4Var.g(z2) ? 32 : 16) | (dd4Var.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            lu6 lu6Var = lu6.a;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarW = t96.w(ou6VarF, ((q96) dd4Var.j(ur9Var)).c.c);
            if (z2) {
                dd4Var.f0(-1155369000);
                jG = lc1.c(0.6f, ((q96) dd4Var.j(ur9Var)).a.h);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1155261120);
                jG = dd1.g(((q96) dd4Var.j(ur9Var)).a, 3.0f);
                dd4Var.q(false);
            }
            ou6 ou6VarM0 = gjb.m0(fw.J(null, ib4Var, L(ou6VarW, jG, jf0.G), false, 15), 12.0f, 8.0f);
            eq8 eq8VarA = dq8.a(new mv(12.0f, true, new gp(5)), bv4.x, dd4Var, 54);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarM0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(ll1.f, dd4Var, eq8VarA);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            sg9.a(sgbVar.c, sgbVar.b, tg9.n(lu6Var, 40.0f), (ib4) null, dd4Var, 384, 8);
            H(sgbVar, new bp5(1.0f, true), 1, dd4Var, (i3 & 14) | 392);
            boolean z3 = (i3 & 896) == 256;
            Object objQ = dd4Var.Q();
            if (z3 || objQ == vl1.a) {
                objQ = new zr(5, ib4Var);
                dd4Var.p0(objQ);
            }
            vo1.e(z2, (kb4) objQ, null, false, null, dd4Var, (i3 >> 3) & 14);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new i41(sgbVar, z2, ib4Var, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(ou6 r31, boolean r32, float r33, dd4 r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe.x(ou6, boolean, float, dd4, int, int):void");
    }

    public static final void y(ou6 ou6Var, n58 n58Var, rj1 rj1Var, dd4 dd4Var, int i2) {
        int i3;
        rj1 rj1Var2 = fw.a;
        dd4Var.h0(-714464401);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(ou6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(n58Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(rj1Var2) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(rj1Var) ? 2048 : 1024;
        }
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                cn7 cn7Var = new cn7((Object) null, s00.t);
                dd4Var.p0(cn7Var);
                objQ = cn7Var;
            }
            re0 re0VarN = N(rj1Var2, dd4Var, (i3 >> 6) & 14);
            jv3.e(n58Var.a(re0VarN), jf0.G(274270255, new ev0(ou6Var, (a07) objQ, rj1Var, re0VarN, 9), dd4Var), dd4Var, 56);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yi(ou6Var, n58Var, rj1Var, i2, 2);
        }
    }

    public static final void z(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var) {
        dd4 dd4Var2;
        ou6 ou6Var2;
        dd4Var.h0(-1194141881);
        int i3 = (dd4Var.h(ib4Var) ? 32 : 16) | i2;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            dd4Var2 = dd4Var;
            ou6Var2 = ou6Var;
            gx1.p(null, ou6Var2, true, jf0.G(-807866293, new lo(5, ib4Var), dd4Var), null, gc1.m, dd4Var2, 200112, 17);
        } else {
            dd4Var2 = dd4Var;
            ou6Var2 = ou6Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new rz0(ou6Var2, ib4Var, i2, 6);
        }
    }
}

package defpackage;

import android.view.View;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class sdc {
    public static ClassLoader a = null;
    public static Thread b = null;
    public static final rj1 f;
    public static final rj1 j;
    public static final float y = 24.0f;
    public static final float z = 24.0f;
    public static final double[][] c = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[] d = {95.047d, 100.0d, 108.883d};
    public static final rj1 e = new rj1(new bk1(0), false, -500328360);
    public static final rj1 g = new rj1(new dk1(7), false, 937242461);
    public static final rj1 h = new rj1(new hk1(12), false, -1360104727);
    public static final rj1 i = new rj1(new hk1(13), false, 827075052);
    public static final rj1 k = new rj1(new kk1(15), false, 2057384248);
    public static final rj1 l = new rj1(new kk1(16), false, -501284613);
    public static final rj1 m = new rj1(new lk1(20), false, 51029520);
    public static final rj1 n = new rj1(new lk1(21), false, 1072266887);
    public static final rj1 o = new rj1(new pk1(9), false, -504722218);
    public static final rj1 p = new rj1(new pk1(10), false, -556742451);
    public static final rj1 q = new rj1(new bk1(18), false, -65925025);
    public static final String[] r = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};
    public static final String[] s = {"ad_impression"};
    public static final String[] t = {"ad_impression", "in_app_purchase"};
    public static final String[] u = {"ad_impression"};
    public static final String[] v = {"ad_impression", "in_app_purchase"};
    public static final String[] w = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};
    public static final String[] x = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    static {
        int i2 = 6;
        f = new rj1(new dk1(i2), false, 2003466348);
        j = new rj1(new ik1(i2), false, 796592752);
    }

    public static final void A(final ib4 ib4Var, final ou6 ou6Var, final long j2, final long j3, final t89 t89Var, final List list, dd4 dd4Var, final int i2) {
        int i3;
        dd4Var.h0(-227757249);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.h(ib4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.e(j2) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.e(j3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.f(t89Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(list) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (!dd4Var.V(i3 & 1, (74899 & i3) != 74898)) {
            dd4Var.Y();
        } else {
            if (list.size() <= 1) {
                gp.l("indicatorPolygons should have, at least, two RoundedPolygons");
                return;
            }
            boolean z2 = (i3 & 14) == 4;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = new i35(11, ib4Var);
                dd4Var.p0(objQ);
            }
            final ib4 ib4Var2 = (ib4) objQ;
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = mh.a();
                dd4Var.p0(objQ2);
            }
            final hh hhVar = (hh) objQ2;
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj) {
                u96 u96Var = new u96(u96.a());
                dd4Var.p0(u96Var);
                objQ3 = u96Var;
            }
            final float[] fArr = ((u96) objQ3).a;
            boolean zF = dd4Var.f(list);
            Object objQ4 = dd4Var.Q();
            if (zF || objQ4 == obj) {
                zy5 zy5VarS0 = s0(list, false);
                dd4Var.p0(zy5VarS0);
                objQ4 = zy5VarS0;
            }
            final List list2 = (List) objQ4;
            boolean zF2 = dd4Var.f(list2);
            Object objQ5 = dd4Var.Q();
            if (zF2 || objQ5 == obj) {
                objQ5 = Float.valueOf(f0(list) * d16.e);
                dd4Var.p0(objQ5);
            }
            final float fFloatValue = ((Number) objQ5).floatValue();
            boolean zF3 = dd4Var.f(ib4Var2);
            Object objQ6 = dd4Var.Q();
            if (zF3 || objQ6 == obj) {
                objQ6 = new zr(9, ib4Var2);
                dd4Var.p0(objQ6);
            }
            ou6 ou6VarL = fe.L(t96.w(tg9.o(a29.c(ou6Var, true, (kb4) objQ6), d16.a, d16.b).e(tg9.c), t89Var), j2, jf0.G);
            ha6 ha6VarD = pn0.d(bv4.f, false);
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
            un9.s(ll1.f, dd4Var, ha6VarD);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            ou6 ou6VarE0 = e0(1.0f, lu6.a, true);
            boolean zF4 = dd4Var.f(ib4Var2) | dd4Var.h(list2) | dd4Var.h(hhVar) | dd4Var.c(fFloatValue) | dd4Var.h(fArr) | ((i3 & 7168) == 2048);
            Object objQ7 = dd4Var.Q();
            if (zF4 || objQ7 == obj) {
                kb4 kb4Var = new kb4() { // from class: i16
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj2) throws Throwable {
                        long j4;
                        hh hhVar2 = hhVar;
                        float f2 = fFloatValue;
                        float[] fArr2 = fArr;
                        long j5 = j3;
                        un5 un5Var = (un5) obj2;
                        float fFloatValue2 = ((Number) ib4Var2.invoke()).floatValue();
                        List list3 = list2;
                        int size = (int) (list3.size() * fFloatValue2);
                        int size2 = list3.size() - 1;
                        if (size > size2) {
                            size = size2;
                        }
                        float size3 = (fFloatValue2 == 1.0f && size == list3.size() + (-1)) ? 1.0f : (list3.size() * fFloatValue2) % 1.0f;
                        float f3 = (-fFloatValue2) * 180.0f;
                        hy0 hy0Var = un5Var.a;
                        hy0 hy0Var2 = un5Var.a;
                        long jA0 = hy0Var.A0();
                        y91 y91Var = hy0Var2.b;
                        long jG = y91Var.G();
                        y91Var.x().i();
                        try {
                            ((lp8) y91Var.b).x(f3, jA0);
                            lw1.V((hv6) list3.get(size), size3, hhVar2);
                            hh hhVarU0 = sdc.u0(hhVar2, hy0Var2.f(), f2, fArr2);
                            j4 = jG;
                            try {
                                r43.Q0(un5Var, hhVarU0, j5, 0.0f, ox3.a, 52);
                                j39.s(y91Var, j4);
                                return heb.a;
                            } catch (Throwable th) {
                                th = th;
                                j39.s(y91Var, j4);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j4 = jG;
                        }
                    }
                };
                dd4Var.p0(kb4Var);
                objQ7 = kb4Var;
            }
            un9.a(dd4Var, md2.C(ou6VarE0, (kb4) objQ7));
            dd4Var.q(true);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: j16
                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    sdc.A(ib4Var, ou6Var, j2, j3, t89Var, list, (dd4) obj2, qu1.x0(i2 | 1));
                    return heb.a;
                }
            };
        }
    }

    public static final void B(boolean z2, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        dd4Var.h0(367620054);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.h(kb4Var) ? 32 : 16) | (dd4Var.h(kb4Var2) ? 256 : Token.CASE);
        byte b2 = 0;
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            Object[] objArr = new Object[0];
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = new tl3(7);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 48);
            z8.d(z2, kb4Var, jf0.G(1915315714, new ul3(kb4Var, kb4Var2, a07Var), dd4Var), null, yib.E(lu6.a, 14), jf0.G(1518344479, new gs6(kb4Var, 5, b2), dd4Var), vm7.f, null, 0L, 0L, 0.0f, false, false, jf0.G(-414214486, new kq2(a07Var, 3), dd4Var), dd4Var, (i3 & 14) | 1769856 | (i3 & Token.ASSIGN_MOD), 8072);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ob3(z2, kb4Var, kb4Var2, i2, 1);
        }
    }

    public static final void C(s83 s83Var, zb4 zb4Var, dd4 dd4Var, int i2) {
        s83Var.getClass();
        zb4Var.getClass();
        dd4Var.h0(-2094402475);
        int i3 = 2;
        int i4 = i2 | (dd4Var.f(s83Var) ? 4 : 2) | (dd4Var.h(zb4Var) ? 32 : 16);
        int i5 = 1;
        if (dd4Var.V(i4 & 1, (i4 & 19) != 18)) {
            boolean zBooleanValue = ((Boolean) s83Var.a.getValue()).booleanValue();
            ou6 ou6VarE = yib.E(lu6.a, 14);
            boolean z2 = (i4 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new r7a(s83Var, 3);
                dd4Var.p0(objQ);
            }
            z8.d(zBooleanValue, (kb4) objQ, jf0.G(-928278143, new w7a(s83Var, zb4Var), dd4Var), null, ou6VarE, jf0.G(-1845181730, new u7a(s83Var, i5), dd4Var), h67.s, null, 0L, 0L, 0.0f, false, false, jf0.G(730115113, new u7a(s83Var, i3), dd4Var), dd4Var, 1769856, 8072);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new w7a(s83Var, zb4Var, i2);
        }
    }

    public static final void D(boolean z2, boolean z3, String str, List list, kb4 kb4Var, yb4 yb4Var, dd4 dd4Var, int i2) {
        list.getClass();
        kb4Var.getClass();
        yb4Var.getClass();
        dd4Var.h0(1647345783);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.g(z3) ? 32 : 16) | (dd4Var.f(str) ? 256 : Token.CASE) | (dd4Var.h(list) ? 2048 : 1024) | (dd4Var.h(yb4Var) ? 131072 : Parser.ARGC_LIMIT);
        if (!dd4Var.V(i3 & 1, (74899 & i3) != 74898)) {
            dd4Var.Y();
        } else if (z3) {
            dd4Var.f0(1782394251);
            dd4Var.q(false);
        } else {
            dd4Var.f0(1782146313);
            int i4 = i3 & 14;
            int i5 = i3 >> 3;
            E(z2, str, list, kb4Var, yb4Var, dd4Var, i4 | (i5 & Token.ASSIGN_MOD) | (i5 & 896) | 3072 | (i5 & 57344));
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new sp0(z2, z3, str, list, kb4Var, yb4Var, i2);
        }
    }

    public static final void E(boolean z2, String str, List list, kb4 kb4Var, yb4 yb4Var, dd4 dd4Var, int i2) {
        boolean z3;
        String str2;
        List list2;
        kb4 kb4Var2;
        yb4 yb4Var2;
        dd4 dd4Var2;
        dd4Var.h0(3260377);
        int i3 = (dd4Var.g(z2) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(list) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(yb4Var) ? 16384 : 8192;
        }
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            z3 = z2;
            px3 px3Var = tg9.c;
            yb4Var2 = yb4Var;
            kb4Var2 = kb4Var;
            str2 = str;
            list2 = list;
            rj1 rj1VarG = jf0.G(2074649135, new si6(z3, kb4Var, str, list, yb4Var2), dd4Var);
            dd4Var2 = dd4Var;
            e(px3Var, null, rj1VarG, dd4Var2, 3078, 6);
        } else {
            z3 = z2;
            str2 = str;
            list2 = list;
            kb4Var2 = kb4Var;
            yb4Var2 = yb4Var;
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new bu2(z3, str2, list2, kb4Var2, yb4Var2, i2);
        }
    }

    public static final void F(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-434439478);
        int i3 = i2 | (dd4Var2.h(ib4Var) ? 32 : 16);
        if (dd4Var2.V(i3 & 1, (i3 & 19) != 18)) {
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
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var2, tg9.h(lu6Var, 56.0f));
            p35 p35VarC = i25.c((m53) a53.K.getValue(), dd4Var2, 0);
            ur9 ur9Var = s96.a;
            mx4.a(p35VarC, (String) null, tg9.n(lu6Var, 40.0f), ((q96) dd4Var2.j(ur9Var)).a.q, dd4Var2, 432, 0);
            un9.a(dd4Var2, tg9.h(lu6Var, 24.0f));
            nha.c(wn9.K((pv9) eu9.s.getValue(), dd4Var2), gjb.n0(lu6Var, 24.0f, 0.0f, 2), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.g, dd4Var2, 48, 0, 130040);
            un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
            kc5.n(i25.c((m53) f53.d0.getValue(), dd4Var2, 0), wn9.K((pv9) vt9.r0.getValue(), dd4Var2), false, null, null, null, null, null, ib4Var, dd4Var, (i3 << 21) & 234881024, 252);
            dd4Var2 = dd4Var;
            xv5.A(lu6Var, 56.0f, dd4Var2, true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new rz0(ou6Var, ib4Var, i2, 4);
        }
    }

    public static final void G(py8 py8Var, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        boolean z2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-973627364);
        int i3 = i2 | (dd4Var2.f(py8Var) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
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
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            p35 p35VarC = i25.c((m53) a53.K.getValue(), dd4Var2, 0);
            long j2 = s00.o(dd4Var2).q;
            lu6 lu6Var = lu6.a;
            mx4.a(p35VarC, (String) null, tg9.n(lu6Var, 40.0f), j2, dd4Var2, 432, 0);
            un9.a(dd4Var2, tg9.h(lu6Var, 24.0f));
            if (py8Var.d != null) {
                dd4Var2.f0(-778170678);
                nha.c(wn9.K((pv9) eu9.r.getValue(), dd4Var2), gjb.n0(lu6Var, 24.0f, 0.0f, 2), s00.o(dd4Var2).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).h, dd4Var, 48, 0, 130040);
                un9.a(dd4Var, tg9.h(lu6Var, 8.0f));
                nha.c(py8Var.c, gjb.n0(lu6Var, 24.0f, 0.0f, 2), s00.o(dd4Var).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).k, dd4Var, 48, 0, 130040);
                un9.a(dd4Var, tg9.h(lu6Var, 24.0f));
                nha.c(wn9.K((pv9) iu9.L0.getValue(), dd4Var), gjb.n0(lu6Var, 24.0f, 0.0f, 2), s00.o(dd4Var).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).h, dd4Var, 48, 0, 130040);
                un9.a(dd4Var, tg9.h(lu6Var, 8.0f));
                nha.c(py8Var.d, gjb.n0(lu6Var, 24.0f, 0.0f, 2), s00.o(dd4Var).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).k, dd4Var, 48, 0, 130040);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
                z2 = true;
            } else {
                dd4Var2.f0(-776755931);
                nha.c(wn9.K((pv9) eu9.s.getValue(), dd4Var2), gjb.n0(lu6Var, 24.0f, 0.0f, 2), s00.o(dd4Var2).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).h, dd4Var, 48, 0, 130040);
                dd4Var2 = dd4Var;
                un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
                kc5.n(i25.c((m53) f53.d0.getValue(), dd4Var2, 0), wn9.K((pv9) vt9.r0.getValue(), dd4Var2), false, null, null, null, null, null, ib4Var, dd4Var2, (i3 << 18) & 234881024, 252);
                dd4Var2.q(false);
                z2 = true;
            }
            dd4Var2.q(z2);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new cu1(py8Var, ou6Var, ib4Var, i2, 1);
        }
    }

    public static final void H(ls9 ls9Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(2029407252);
        int i3 = i2 | (dd4Var2.f(ls9Var) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(kb4Var) ? 256 : Token.CASE) | (dd4Var2.h(kb4Var2) ? 2048 : 1024);
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
            ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
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
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            String str = ls9Var.c;
            ur9 ur9Var = s96.a;
            uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.j;
            long j2 = ((q96) dd4Var2.j(ur9Var)).a.q;
            long jX = wn9.x(20);
            lu6 lu6Var = lu6.a;
            boolean z2 = true;
            nha.c(str, gjb.l0(lu6Var, 24.0f), j2, (g60) null, jX, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, 24624, 0, 130024);
            dd4Var2 = dd4Var;
            if (ls9Var.f) {
                dd4Var2.f0(1734229868);
                y(tg9.n(gjb.n0(lu6Var, 0.0f, 12.0f, 1), 32.0f), 0L, null, dd4Var2, 6, 6);
                dd4Var2.q(false);
            } else {
                if (ls9Var.g) {
                    dd4Var2.f0(1734448356);
                    dd4Var2.f0(-913879325);
                    String strK = ls9Var.h;
                    if (strK == null) {
                        strK = "";
                    }
                    if (strK.length() == 0) {
                        strK = wn9.K((pv9) eu9.E.getValue(), dd4Var2);
                    }
                    dd4Var2.q(false);
                    nha.c(strK, gjb.l0(lu6Var, 24.0f), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, wn9.x(20), (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, 24624, 0, 130024);
                    dd4Var2 = dd4Var;
                    p35 p35VarC = i25.c((m53) f53.d0.getValue(), dd4Var2, 0);
                    String strK2 = wn9.K((pv9) mu9.Q.getValue(), dd4Var2);
                    int i4 = i3 & 14;
                    boolean z3 = (i4 == 4) | ((i3 & 896) == 256);
                    Object objQ = dd4Var2.Q();
                    Object obj = vl1.a;
                    if (z3 || objQ == obj) {
                        objQ = new zt1(kb4Var, ls9Var, 2);
                        dd4Var2.p0(objQ);
                    }
                    kc5.n(p35VarC, strK2, false, null, null, null, null, null, (ib4) objQ, dd4Var2, 0, 252);
                    un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
                    p35 p35VarC2 = i25.c((m53) f53.C.getValue(), dd4Var2, 0);
                    String strK3 = wn9.K((pv9) mu9.z.getValue(), dd4Var2);
                    boolean z4 = (i4 == 4) | ((i3 & 7168) == 2048);
                    Object objQ2 = dd4Var2.Q();
                    if (z4 || objQ2 == obj) {
                        objQ2 = new zt1(kb4Var2, ls9Var, 3);
                        dd4Var2.p0(objQ2);
                    }
                    kc5.n(p35VarC2, strK3, false, null, null, null, null, null, (ib4) objQ2, dd4Var2, 0, 252);
                    dd4Var2.q(false);
                } else {
                    dd4Var2.f0(1735359384);
                    dd4Var2.q(false);
                }
                z2 = true;
            }
            dd4Var2.q(z2);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new au1(ls9Var, ou6Var, kb4Var, kb4Var2, i2, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0530  */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void I(defpackage.j15 r47, final float r48, final defpackage.ek7 r49, final ou6 r50, defpackage.kb4 r51, final defpackage.kb4 r52, final defpackage.zb4 r53, final defpackage.kb4 r54, dd4 r55, final int r56) {
        /*
            Method dump skipped, instruction units count: 1418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sdc.I(j15, float, ek7, ou6, kb4, kb4, zb4, kb4, dd4, int):void");
    }

    public static final void J(int i2, List list, st5 st5Var, ou6 ou6Var, yb4 yb4Var, yb4 yb4Var2, zb4 zb4Var, ib4 ib4Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i3) {
        int i4;
        st5 st5Var2;
        ou6 ou6Var2;
        yb4 yb4Var3;
        yb4 yb4Var4;
        zb4 zb4Var2;
        ib4 ib4Var2;
        kb4 kb4Var3;
        kb4 kb4Var4;
        dd4 dd4Var2 = dd4Var;
        list.getClass();
        st5Var.getClass();
        yb4Var.getClass();
        yb4Var2.getClass();
        zb4Var.getClass();
        ib4Var.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var2.h0(-2029279950);
        if ((i3 & 6) == 0) {
            i4 = (dd4Var2.d(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= dd4Var2.h(list) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            st5Var2 = st5Var;
            i4 |= dd4Var2.f(st5Var2) ? 256 : Token.CASE;
        } else {
            st5Var2 = st5Var;
        }
        if ((i3 & 3072) == 0) {
            ou6Var2 = ou6Var;
            i4 |= dd4Var2.f(ou6Var2) ? 2048 : 1024;
        } else {
            ou6Var2 = ou6Var;
        }
        if ((i3 & 24576) == 0) {
            yb4Var3 = yb4Var;
            i4 |= dd4Var2.h(yb4Var3) ? 16384 : 8192;
        } else {
            yb4Var3 = yb4Var;
        }
        if ((196608 & i3) == 0) {
            yb4Var4 = yb4Var2;
            i4 |= dd4Var2.h(yb4Var4) ? 131072 : Parser.ARGC_LIMIT;
        } else {
            yb4Var4 = yb4Var2;
        }
        if ((1572864 & i3) == 0) {
            zb4Var2 = zb4Var;
            i4 |= dd4Var2.h(zb4Var2) ? 1048576 : 524288;
        } else {
            zb4Var2 = zb4Var;
        }
        if ((12582912 & i3) == 0) {
            ib4Var2 = ib4Var;
            i4 |= dd4Var2.h(ib4Var2) ? 8388608 : 4194304;
        } else {
            ib4Var2 = ib4Var;
        }
        if ((100663296 & i3) == 0) {
            kb4Var3 = kb4Var;
            i4 |= dd4Var2.h(kb4Var3) ? 67108864 : 33554432;
        } else {
            kb4Var3 = kb4Var;
        }
        if ((805306368 & i3) == 0) {
            kb4Var4 = kb4Var2;
            i4 |= dd4Var2.h(kb4Var4) ? 536870912 : 268435456;
        } else {
            kb4Var4 = kb4Var2;
        }
        if (!dd4Var2.V(i4 & 1, (306783379 & i4) != 306783378)) {
            dd4Var2.Y();
        } else if (i2 == 0) {
            dd4Var2.f0(1682150003);
            d0(list, st5Var, ou6Var, yb4Var, yb4Var2, zb4Var, ib4Var, kb4Var, kb4Var2, dd4Var2, (i4 >> 3) & 268435454);
            dd4Var2 = dd4Var2;
            dd4Var2.q(false);
        } else if (i2 == 1) {
            dd4Var2.f0(1681103722);
            int i5 = i4 >> 3;
            x(list, st5Var, false, ou6Var, yb4Var, yb4Var2, zb4Var, ib4Var, kb4Var, kb4Var2, dd4Var2, (i5 & Token.ASSIGN_MOD) | (i5 & 14) | 384 | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | (i4 & 1879048192));
            dd4Var2.q(false);
        } else if (i2 != 2) {
            dd4Var2.f0(1682583600);
            dd4Var2.q(false);
        } else {
            dd4Var2.f0(1681625483);
            int i6 = i4 >> 3;
            x(list, st5Var2, true, ou6Var2, yb4Var3, yb4Var4, zb4Var2, ib4Var2, kb4Var3, kb4Var4, dd4Var2, (i4 & 1879048192) | (i6 & Token.ASSIGN_MOD) | (i6 & 14) | 384 | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024));
            dd4Var2.q(false);
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new un6(i2, list, st5Var, ou6Var, yb4Var, yb4Var2, zb4Var, ib4Var, kb4Var, kb4Var2, i3);
        }
    }

    public static final void K(ou6 ou6Var, rj1 rj1Var, dd4 dd4Var, int i2) {
        int i3;
        dd4Var.h0(2064964257);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(ou6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.h(rj1Var) ? 32 : 16;
        }
        int i4 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            L(ou6Var, rj1Var, dd4Var, ((i3 << 3) & 896) | (i3 & 14) | 48);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new hk(ou6Var, rj1Var, i2, i4);
        }
    }

    public static final void L(ou6 ou6Var, rj1 rj1Var, dd4 dd4Var, int i2) {
        int i3;
        ou6 ou6Var2;
        rj1 rj1Var2;
        dd4Var.h0(771959668);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(ou6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.h((Object) null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(rj1Var) ? 256 : Token.CASE;
        }
        int i4 = 0;
        int i5 = 1;
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            if (objQ == fu6Var) {
                cn7 cn7Var = new cn7((Object) null, s00.t);
                dd4Var.p0(cn7Var);
                objQ = cn7Var;
            }
            a07 a07Var = (a07) objQ;
            Object objQ2 = dd4Var.Q();
            if (objQ2 == fu6Var) {
                objQ2 = new ik(a07Var, i4);
                dd4Var.p0(objQ2);
            }
            ou6Var2 = ou6Var;
            rj1Var2 = rj1Var;
            jv3.e(bda.b.a(t0((ib4) objQ2, dd4Var, 0)), jf0.G(-291176396, new mt(6, (Object) ou6Var2, (Object) a07Var, (Object) rj1Var2, false), dd4Var), dd4Var, 56);
        } else {
            ou6Var2 = ou6Var;
            rj1Var2 = rj1Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new hk(ou6Var2, rj1Var2, i2, i5);
        }
    }

    public static final void M(final t27 t27Var, dd4 dd4Var, int i2) {
        t27 t27Var2;
        aw3 aw3Var;
        cx5 cx5Var;
        t27Var.getClass();
        dd4Var.h0(594312091);
        final int i3 = 4;
        final int i4 = 2;
        int i5 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        final int i6 = 1;
        final int i7 = 0;
        if (dd4Var.V(i5 & 1, (i5 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final u98 u98Var = (u98) ((qtb) qx1.N(ug8.a(u98.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            final a07 a07VarB = bx1.B(u98Var.d, dd4Var);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = dk9.x((Object) null);
                dd4Var.p0(objQ);
            }
            final a07 a07Var = (a07) objQ;
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new ms7(gc1.Y("txt"));
                dd4Var.p0(objQ2);
            }
            ms7 ms7Var = (ms7) objQ2;
            boolean zF = dd4Var.f(a07VarB) | dd4Var.f(u98Var);
            Object objQ3 = dd4Var.Q();
            if (zF || objQ3 == obj) {
                objQ3 = new kb4() { // from class: j98
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj2) {
                        int i8 = i7;
                        heb hebVar = heb.a;
                        a07 a07Var2 = a07Var;
                        br9 br9Var = a07VarB;
                        switch (i8) {
                            case 0:
                                bi5 bi5Var = (bi5) obj2;
                                if (bi5Var != null) {
                                    n78 n78Var = ((o98) br9Var.getValue()).a;
                                    String str = n78Var != null ? n78Var.a : null;
                                    if (str == null || str.length() == 0) {
                                        u98 u98Var2 = u98Var;
                                        u98Var2.g(vtb.a(u98Var2), rw2.a, new t98(u98Var2, bi5Var, lm8.a, null, 4));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var, uq7.a));
                                    }
                                }
                                break;
                            case 1:
                                bi5 bi5Var2 = (bi5) obj2;
                                if (bi5Var2 != null) {
                                    n78 n78Var2 = ((o98) br9Var.getValue()).b;
                                    String str2 = n78Var2 != null ? n78Var2.a : null;
                                    if (str2 == null || str2.length() == 0) {
                                        u98 u98Var3 = u98Var;
                                        u98Var3.g(vtb.a(u98Var3), rw2.a, new t98(u98Var3, bi5Var2, lm8.a, null, 1));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var2, uq7.b));
                                    }
                                }
                                break;
                            case 2:
                                bi5 bi5Var3 = (bi5) obj2;
                                if (bi5Var3 != null) {
                                    n78 n78Var3 = ((o98) br9Var.getValue()).c;
                                    String str3 = n78Var3 != null ? n78Var3.a : null;
                                    if (str3 == null || str3.length() == 0) {
                                        u98 u98Var4 = u98Var;
                                        u98Var4.g(vtb.a(u98Var4), rw2.a, new t98(u98Var4, bi5Var3, lm8.a, null, 2));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var3, uq7.c));
                                    }
                                }
                                break;
                            case 3:
                                bi5 bi5Var4 = (bi5) obj2;
                                if (bi5Var4 != null) {
                                    n78 n78Var4 = ((o98) br9Var.getValue()).d;
                                    String str4 = n78Var4 != null ? n78Var4.a : null;
                                    if (str4 == null || str4.length() == 0) {
                                        u98 u98Var5 = u98Var;
                                        u98Var5.g(vtb.a(u98Var5), rw2.a, new t98(u98Var5, bi5Var4, lm8.a, null, 3));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var4, uq7.d));
                                    }
                                }
                                break;
                            default:
                                bi5 bi5Var5 = (bi5) obj2;
                                if (bi5Var5 != null) {
                                    n78 n78Var5 = ((o98) br9Var.getValue()).e;
                                    String str5 = n78Var5 != null ? n78Var5.a : null;
                                    if (str5 == null || str5.length() == 0) {
                                        u98 u98Var6 = u98Var;
                                        u98Var6.g(vtb.a(u98Var6), rw2.a, new t98(u98Var6, bi5Var5, lm8.a, null, 0));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var5, uq7.e));
                                    }
                                }
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ3);
            }
            final aw3 aw3VarC0 = e11.c0(ms7Var, (kb4) objQ3, dd4Var, 8);
            boolean zF2 = dd4Var.f(a07VarB) | dd4Var.f(u98Var);
            Object objQ4 = dd4Var.Q();
            if (zF2 || objQ4 == obj) {
                objQ4 = new kb4() { // from class: j98
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj2) {
                        int i8 = i6;
                        heb hebVar = heb.a;
                        a07 a07Var2 = a07Var;
                        br9 br9Var = a07VarB;
                        switch (i8) {
                            case 0:
                                bi5 bi5Var = (bi5) obj2;
                                if (bi5Var != null) {
                                    n78 n78Var = ((o98) br9Var.getValue()).a;
                                    String str = n78Var != null ? n78Var.a : null;
                                    if (str == null || str.length() == 0) {
                                        u98 u98Var2 = u98Var;
                                        u98Var2.g(vtb.a(u98Var2), rw2.a, new t98(u98Var2, bi5Var, lm8.a, null, 4));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var, uq7.a));
                                    }
                                }
                                break;
                            case 1:
                                bi5 bi5Var2 = (bi5) obj2;
                                if (bi5Var2 != null) {
                                    n78 n78Var2 = ((o98) br9Var.getValue()).b;
                                    String str2 = n78Var2 != null ? n78Var2.a : null;
                                    if (str2 == null || str2.length() == 0) {
                                        u98 u98Var3 = u98Var;
                                        u98Var3.g(vtb.a(u98Var3), rw2.a, new t98(u98Var3, bi5Var2, lm8.a, null, 1));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var2, uq7.b));
                                    }
                                }
                                break;
                            case 2:
                                bi5 bi5Var3 = (bi5) obj2;
                                if (bi5Var3 != null) {
                                    n78 n78Var3 = ((o98) br9Var.getValue()).c;
                                    String str3 = n78Var3 != null ? n78Var3.a : null;
                                    if (str3 == null || str3.length() == 0) {
                                        u98 u98Var4 = u98Var;
                                        u98Var4.g(vtb.a(u98Var4), rw2.a, new t98(u98Var4, bi5Var3, lm8.a, null, 2));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var3, uq7.c));
                                    }
                                }
                                break;
                            case 3:
                                bi5 bi5Var4 = (bi5) obj2;
                                if (bi5Var4 != null) {
                                    n78 n78Var4 = ((o98) br9Var.getValue()).d;
                                    String str4 = n78Var4 != null ? n78Var4.a : null;
                                    if (str4 == null || str4.length() == 0) {
                                        u98 u98Var5 = u98Var;
                                        u98Var5.g(vtb.a(u98Var5), rw2.a, new t98(u98Var5, bi5Var4, lm8.a, null, 3));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var4, uq7.d));
                                    }
                                }
                                break;
                            default:
                                bi5 bi5Var5 = (bi5) obj2;
                                if (bi5Var5 != null) {
                                    n78 n78Var5 = ((o98) br9Var.getValue()).e;
                                    String str5 = n78Var5 != null ? n78Var5.a : null;
                                    if (str5 == null || str5.length() == 0) {
                                        u98 u98Var6 = u98Var;
                                        u98Var6.g(vtb.a(u98Var6), rw2.a, new t98(u98Var6, bi5Var5, lm8.a, null, 0));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var5, uq7.e));
                                    }
                                }
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ4);
            }
            final aw3 aw3VarC02 = e11.c0(ms7Var, (kb4) objQ4, dd4Var, 8);
            boolean zF3 = dd4Var.f(a07VarB) | dd4Var.f(u98Var);
            Object objQ5 = dd4Var.Q();
            if (zF3 || objQ5 == obj) {
                objQ5 = new kb4() { // from class: j98
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj2) {
                        int i8 = i4;
                        heb hebVar = heb.a;
                        a07 a07Var2 = a07Var;
                        br9 br9Var = a07VarB;
                        switch (i8) {
                            case 0:
                                bi5 bi5Var = (bi5) obj2;
                                if (bi5Var != null) {
                                    n78 n78Var = ((o98) br9Var.getValue()).a;
                                    String str = n78Var != null ? n78Var.a : null;
                                    if (str == null || str.length() == 0) {
                                        u98 u98Var2 = u98Var;
                                        u98Var2.g(vtb.a(u98Var2), rw2.a, new t98(u98Var2, bi5Var, lm8.a, null, 4));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var, uq7.a));
                                    }
                                }
                                break;
                            case 1:
                                bi5 bi5Var2 = (bi5) obj2;
                                if (bi5Var2 != null) {
                                    n78 n78Var2 = ((o98) br9Var.getValue()).b;
                                    String str2 = n78Var2 != null ? n78Var2.a : null;
                                    if (str2 == null || str2.length() == 0) {
                                        u98 u98Var3 = u98Var;
                                        u98Var3.g(vtb.a(u98Var3), rw2.a, new t98(u98Var3, bi5Var2, lm8.a, null, 1));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var2, uq7.b));
                                    }
                                }
                                break;
                            case 2:
                                bi5 bi5Var3 = (bi5) obj2;
                                if (bi5Var3 != null) {
                                    n78 n78Var3 = ((o98) br9Var.getValue()).c;
                                    String str3 = n78Var3 != null ? n78Var3.a : null;
                                    if (str3 == null || str3.length() == 0) {
                                        u98 u98Var4 = u98Var;
                                        u98Var4.g(vtb.a(u98Var4), rw2.a, new t98(u98Var4, bi5Var3, lm8.a, null, 2));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var3, uq7.c));
                                    }
                                }
                                break;
                            case 3:
                                bi5 bi5Var4 = (bi5) obj2;
                                if (bi5Var4 != null) {
                                    n78 n78Var4 = ((o98) br9Var.getValue()).d;
                                    String str4 = n78Var4 != null ? n78Var4.a : null;
                                    if (str4 == null || str4.length() == 0) {
                                        u98 u98Var5 = u98Var;
                                        u98Var5.g(vtb.a(u98Var5), rw2.a, new t98(u98Var5, bi5Var4, lm8.a, null, 3));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var4, uq7.d));
                                    }
                                }
                                break;
                            default:
                                bi5 bi5Var5 = (bi5) obj2;
                                if (bi5Var5 != null) {
                                    n78 n78Var5 = ((o98) br9Var.getValue()).e;
                                    String str5 = n78Var5 != null ? n78Var5.a : null;
                                    if (str5 == null || str5.length() == 0) {
                                        u98 u98Var6 = u98Var;
                                        u98Var6.g(vtb.a(u98Var6), rw2.a, new t98(u98Var6, bi5Var5, lm8.a, null, 0));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var5, uq7.e));
                                    }
                                }
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ5);
            }
            aw3 aw3VarC03 = e11.c0(ms7Var, (kb4) objQ5, dd4Var, 8);
            boolean zF4 = dd4Var.f(a07VarB) | dd4Var.f(u98Var);
            Object objQ6 = dd4Var.Q();
            if (zF4 || objQ6 == obj) {
                final int i8 = 3;
                objQ6 = new kb4() { // from class: j98
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj2) {
                        int i82 = i8;
                        heb hebVar = heb.a;
                        a07 a07Var2 = a07Var;
                        br9 br9Var = a07VarB;
                        switch (i82) {
                            case 0:
                                bi5 bi5Var = (bi5) obj2;
                                if (bi5Var != null) {
                                    n78 n78Var = ((o98) br9Var.getValue()).a;
                                    String str = n78Var != null ? n78Var.a : null;
                                    if (str == null || str.length() == 0) {
                                        u98 u98Var2 = u98Var;
                                        u98Var2.g(vtb.a(u98Var2), rw2.a, new t98(u98Var2, bi5Var, lm8.a, null, 4));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var, uq7.a));
                                    }
                                }
                                break;
                            case 1:
                                bi5 bi5Var2 = (bi5) obj2;
                                if (bi5Var2 != null) {
                                    n78 n78Var2 = ((o98) br9Var.getValue()).b;
                                    String str2 = n78Var2 != null ? n78Var2.a : null;
                                    if (str2 == null || str2.length() == 0) {
                                        u98 u98Var3 = u98Var;
                                        u98Var3.g(vtb.a(u98Var3), rw2.a, new t98(u98Var3, bi5Var2, lm8.a, null, 1));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var2, uq7.b));
                                    }
                                }
                                break;
                            case 2:
                                bi5 bi5Var3 = (bi5) obj2;
                                if (bi5Var3 != null) {
                                    n78 n78Var3 = ((o98) br9Var.getValue()).c;
                                    String str3 = n78Var3 != null ? n78Var3.a : null;
                                    if (str3 == null || str3.length() == 0) {
                                        u98 u98Var4 = u98Var;
                                        u98Var4.g(vtb.a(u98Var4), rw2.a, new t98(u98Var4, bi5Var3, lm8.a, null, 2));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var3, uq7.c));
                                    }
                                }
                                break;
                            case 3:
                                bi5 bi5Var4 = (bi5) obj2;
                                if (bi5Var4 != null) {
                                    n78 n78Var4 = ((o98) br9Var.getValue()).d;
                                    String str4 = n78Var4 != null ? n78Var4.a : null;
                                    if (str4 == null || str4.length() == 0) {
                                        u98 u98Var5 = u98Var;
                                        u98Var5.g(vtb.a(u98Var5), rw2.a, new t98(u98Var5, bi5Var4, lm8.a, null, 3));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var4, uq7.d));
                                    }
                                }
                                break;
                            default:
                                bi5 bi5Var5 = (bi5) obj2;
                                if (bi5Var5 != null) {
                                    n78 n78Var5 = ((o98) br9Var.getValue()).e;
                                    String str5 = n78Var5 != null ? n78Var5.a : null;
                                    if (str5 == null || str5.length() == 0) {
                                        u98 u98Var6 = u98Var;
                                        u98Var6.g(vtb.a(u98Var6), rw2.a, new t98(u98Var6, bi5Var5, lm8.a, null, 0));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var5, uq7.e));
                                    }
                                }
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ6);
            }
            final aw3 aw3VarC04 = e11.c0(ms7Var, (kb4) objQ6, dd4Var, 8);
            boolean zF5 = dd4Var.f(a07VarB) | dd4Var.f(u98Var);
            Object objQ7 = dd4Var.Q();
            if (zF5 || objQ7 == obj) {
                objQ7 = new kb4() { // from class: j98
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj2) {
                        int i82 = i3;
                        heb hebVar = heb.a;
                        a07 a07Var2 = a07Var;
                        br9 br9Var = a07VarB;
                        switch (i82) {
                            case 0:
                                bi5 bi5Var = (bi5) obj2;
                                if (bi5Var != null) {
                                    n78 n78Var = ((o98) br9Var.getValue()).a;
                                    String str = n78Var != null ? n78Var.a : null;
                                    if (str == null || str.length() == 0) {
                                        u98 u98Var2 = u98Var;
                                        u98Var2.g(vtb.a(u98Var2), rw2.a, new t98(u98Var2, bi5Var, lm8.a, null, 4));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var, uq7.a));
                                    }
                                }
                                break;
                            case 1:
                                bi5 bi5Var2 = (bi5) obj2;
                                if (bi5Var2 != null) {
                                    n78 n78Var2 = ((o98) br9Var.getValue()).b;
                                    String str2 = n78Var2 != null ? n78Var2.a : null;
                                    if (str2 == null || str2.length() == 0) {
                                        u98 u98Var3 = u98Var;
                                        u98Var3.g(vtb.a(u98Var3), rw2.a, new t98(u98Var3, bi5Var2, lm8.a, null, 1));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var2, uq7.b));
                                    }
                                }
                                break;
                            case 2:
                                bi5 bi5Var3 = (bi5) obj2;
                                if (bi5Var3 != null) {
                                    n78 n78Var3 = ((o98) br9Var.getValue()).c;
                                    String str3 = n78Var3 != null ? n78Var3.a : null;
                                    if (str3 == null || str3.length() == 0) {
                                        u98 u98Var4 = u98Var;
                                        u98Var4.g(vtb.a(u98Var4), rw2.a, new t98(u98Var4, bi5Var3, lm8.a, null, 2));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var3, uq7.c));
                                    }
                                }
                                break;
                            case 3:
                                bi5 bi5Var4 = (bi5) obj2;
                                if (bi5Var4 != null) {
                                    n78 n78Var4 = ((o98) br9Var.getValue()).d;
                                    String str4 = n78Var4 != null ? n78Var4.a : null;
                                    if (str4 == null || str4.length() == 0) {
                                        u98 u98Var5 = u98Var;
                                        u98Var5.g(vtb.a(u98Var5), rw2.a, new t98(u98Var5, bi5Var4, lm8.a, null, 3));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var4, uq7.d));
                                    }
                                }
                                break;
                            default:
                                bi5 bi5Var5 = (bi5) obj2;
                                if (bi5Var5 != null) {
                                    n78 n78Var5 = ((o98) br9Var.getValue()).e;
                                    String str5 = n78Var5 != null ? n78Var5.a : null;
                                    if (str5 == null || str5.length() == 0) {
                                        u98 u98Var6 = u98Var;
                                        u98Var6.g(vtb.a(u98Var6), rw2.a, new t98(u98Var6, bi5Var5, lm8.a, null, 0));
                                    } else {
                                        a07Var2.setValue(new vq7(bi5Var5, uq7.e));
                                    }
                                }
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ7);
            }
            final aw3 aw3VarC05 = e11.c0(ms7Var, (kb4) objQ7, dd4Var, 8);
            vq7 vq7Var = (vq7) a07Var.getValue();
            if (vq7Var == null) {
                dd4Var.f0(1298731768);
                dd4Var.q(false);
                aw3Var = aw3VarC03;
            } else {
                dd4Var.f0(1298731769);
                String name = vq7Var.a.getName();
                Object objQ8 = dd4Var.Q();
                if (objQ8 == obj) {
                    objQ8 = new wo6(a07Var, 27);
                    dd4Var.p0(objQ8);
                }
                kb4 kb4Var = (kb4) objQ8;
                boolean zF6 = dd4Var.f(vq7Var) | dd4Var.f(u98Var);
                aw3Var = aw3VarC03;
                Object objQ9 = dd4Var.Q();
                if (zF6 || objQ9 == obj) {
                    objQ9 = new fb3(20, vq7Var, u98Var, a07Var);
                    dd4Var.p0(objQ9);
                }
                bx1.h(name, kb4Var, (kb4) objQ9, dd4Var, 390);
                dd4Var.q(false);
            }
            m8 m8Var = (m8) dd4Var.j(a9.a);
            pp1 pp1Var = u98Var.e;
            boolean zF7 = dd4Var.f(m8Var);
            Object objQ10 = dd4Var.Q();
            if (zF7 || objQ10 == obj) {
                cx5Var = null;
                objQ10 = new xa((Object) m8Var, (jt1) cx5Var, 19);
                dd4Var.p0(objQ10);
            } else {
                cx5Var = null;
            }
            wx1.e(pp1Var, cx5Var, (zb4) objQ10, dd4Var, 0);
            px3 px3Var = tg9.c;
            String strK = wn9.K((pv9) ru9.K0.getValue(), dd4Var);
            rj1 rj1VarG = jf0.G(-1833944673, new n74(t27Var, 23), dd4Var);
            final aw3 aw3Var2 = aw3Var;
            ac4 ac4Var = new ac4() { // from class: k98
                @Override // defpackage.ac4
                public final Object g(Object obj2, Object obj3, Object obj4, Object obj5) {
                    pj7 pj7Var = (pj7) obj3;
                    dd4 dd4Var2 = (dd4) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    ((yn0) obj2).getClass();
                    pj7Var.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= dd4Var2.f(pj7Var) ? 32 : 16;
                    }
                    if (dd4Var2.V(iIntValue & 1, (iIntValue & Token.TARGET) != 144)) {
                        o98 o98Var = (o98) a07VarB.getValue();
                        ou6 ou6VarB = yib.B(tg9.c, 6);
                        aw3 aw3Var3 = aw3VarC0;
                        boolean zF8 = dd4Var2.f(aw3Var3);
                        Object objQ11 = dd4Var2.Q();
                        fu6 fu6Var = vl1.a;
                        if (zF8 || objQ11 == fu6Var) {
                            m98 m98Var = new m98(0, aw3Var3, aw3.class, "launch", "launch()V", 0, 0);
                            dd4Var2.p0(m98Var);
                            objQ11 = m98Var;
                        }
                        ib4 ib4Var = (ib4) ((ei5) objQ11);
                        aw3 aw3Var4 = aw3VarC02;
                        boolean zF9 = dd4Var2.f(aw3Var4);
                        Object objQ12 = dd4Var2.Q();
                        if (zF9 || objQ12 == fu6Var) {
                            m98 m98Var2 = new m98(0, aw3Var4, aw3.class, "launch", "launch()V", 0, 8);
                            dd4Var2.p0(m98Var2);
                            objQ12 = m98Var2;
                        }
                        ib4 ib4Var2 = (ib4) ((ei5) objQ12);
                        aw3 aw3Var5 = aw3Var2;
                        boolean zF10 = dd4Var2.f(aw3Var5);
                        Object objQ13 = dd4Var2.Q();
                        if (zF10 || objQ13 == fu6Var) {
                            m98 m98Var3 = new m98(0, aw3Var5, aw3.class, "launch", "launch()V", 0, 9);
                            dd4Var2.p0(m98Var3);
                            objQ13 = m98Var3;
                        }
                        ib4 ib4Var3 = (ib4) ((ei5) objQ13);
                        aw3 aw3Var6 = aw3VarC04;
                        boolean zF11 = dd4Var2.f(aw3Var6);
                        Object objQ14 = dd4Var2.Q();
                        if (zF11 || objQ14 == fu6Var) {
                            m98 m98Var4 = new m98(0, aw3Var6, aw3.class, "launch", "launch()V", 0, 10);
                            dd4Var2.p0(m98Var4);
                            objQ14 = m98Var4;
                        }
                        ib4 ib4Var4 = (ib4) ((ei5) objQ14);
                        aw3 aw3Var7 = aw3VarC05;
                        boolean zF12 = dd4Var2.f(aw3Var7);
                        Object objQ15 = dd4Var2.Q();
                        if (zF12 || objQ15 == fu6Var) {
                            m98 m98Var5 = new m98(0, aw3Var7, aw3.class, "launch", "launch()V", 0, 11);
                            dd4Var2.p0(m98Var5);
                            objQ15 = m98Var5;
                        }
                        ib4 ib4Var5 = (ib4) ((ei5) objQ15);
                        u98 u98Var2 = u98Var;
                        boolean zF13 = dd4Var2.f(u98Var2);
                        Object objQ16 = dd4Var2.Q();
                        if (zF13 || objQ16 == fu6Var) {
                            m98 m98Var6 = new m98(0, u98Var2, u98.class, "deleteVietPhrase", "deleteVietPhrase()V", 0, 12);
                            dd4Var2.p0(m98Var6);
                            objQ16 = m98Var6;
                        }
                        ib4 ib4Var6 = (ib4) ((ei5) objQ16);
                        boolean zF14 = dd4Var2.f(u98Var2);
                        Object objQ17 = dd4Var2.Q();
                        if (zF14 || objQ17 == fu6Var) {
                            objQ17 = new m98(0, u98Var2, u98.class, "deleteName", "deleteName()V", 0, 13);
                            dd4Var2.p0(objQ17);
                        }
                        ib4 ib4Var7 = (ib4) ((ei5) objQ17);
                        boolean zF15 = dd4Var2.f(u98Var2);
                        Object objQ18 = dd4Var2.Q();
                        if (zF15 || objQ18 == fu6Var) {
                            m98 m98Var7 = new m98(0, u98Var2, u98.class, "deletePhienAm", "deletePhienAm()V", 0, 14);
                            dd4Var2.p0(m98Var7);
                            objQ18 = m98Var7;
                        }
                        ib4 ib4Var8 = (ib4) ((ei5) objQ18);
                        boolean zF16 = dd4Var2.f(u98Var2);
                        Object objQ19 = dd4Var2.Q();
                        if (zF16 || objQ19 == fu6Var) {
                            m98 m98Var8 = new m98(0, u98Var2, u98.class, "deletePronouns", "deletePronouns()V", 0, 15);
                            dd4Var2.p0(m98Var8);
                            objQ19 = m98Var8;
                        }
                        ib4 ib4Var9 = (ib4) ((ei5) objQ19);
                        boolean zF17 = dd4Var2.f(u98Var2);
                        Object objQ20 = dd4Var2.Q();
                        if (zF17 || objQ20 == fu6Var) {
                            m98 m98Var9 = new m98(0, u98Var2, u98.class, "deleteLuatNhan", "deleteLuatNhan()V", 0, 1);
                            dd4Var2.p0(m98Var9);
                            objQ20 = m98Var9;
                        }
                        ib4 ib4Var10 = (ib4) ((ei5) objQ20);
                        boolean zF18 = dd4Var2.f(u98Var2);
                        Object objQ21 = dd4Var2.Q();
                        if (zF18 || objQ21 == fu6Var) {
                            m98 m98Var10 = new m98(0, u98Var2, u98.class, "exportVietPhrase", "exportVietPhrase()V", 0, 2);
                            dd4Var2.p0(m98Var10);
                            objQ21 = m98Var10;
                        }
                        ib4 ib4Var11 = (ib4) ((ei5) objQ21);
                        boolean zF19 = dd4Var2.f(u98Var2);
                        Object objQ22 = dd4Var2.Q();
                        if (zF19 || objQ22 == fu6Var) {
                            m98 m98Var11 = new m98(0, u98Var2, u98.class, "exportName", "exportName()V", 0, 3);
                            dd4Var2.p0(m98Var11);
                            objQ22 = m98Var11;
                        }
                        ib4 ib4Var12 = (ib4) ((ei5) objQ22);
                        boolean zF20 = dd4Var2.f(u98Var2);
                        Object objQ23 = dd4Var2.Q();
                        if (zF20 || objQ23 == fu6Var) {
                            m98 m98Var12 = new m98(0, u98Var2, u98.class, "exportPhienAm", "exportPhienAm()V", 0, 4);
                            dd4Var2.p0(m98Var12);
                            objQ23 = m98Var12;
                        }
                        ib4 ib4Var13 = (ib4) ((ei5) objQ23);
                        boolean zF21 = dd4Var2.f(u98Var2);
                        Object objQ24 = dd4Var2.Q();
                        if (zF21 || objQ24 == fu6Var) {
                            m98 m98Var13 = new m98(0, u98Var2, u98.class, "exportPronouns", "exportPronouns()V", 0, 5);
                            dd4Var2.p0(m98Var13);
                            objQ24 = m98Var13;
                        }
                        ib4 ib4Var14 = (ib4) ((ei5) objQ24);
                        boolean zF22 = dd4Var2.f(u98Var2);
                        Object objQ25 = dd4Var2.Q();
                        if (zF22 || objQ25 == fu6Var) {
                            m98 m98Var14 = new m98(0, u98Var2, u98.class, "exportLuatNhan", "exportLuatNhan()V", 0, 6);
                            dd4Var2.p0(m98Var14);
                            objQ25 = m98Var14;
                        }
                        ib4 ib4Var15 = (ib4) ((ei5) objQ25);
                        boolean zF23 = dd4Var2.f(u98Var2);
                        Object objQ26 = dd4Var2.Q();
                        if (zF23 || objQ26 == fu6Var) {
                            m98 m98Var15 = new m98(0, u98Var2, u98.class, "downloadDefaultDictionary", "downloadDefaultDictionary()V", 0, 7);
                            dd4Var2.p0(m98Var15);
                            objQ26 = m98Var15;
                        }
                        ib4 ib4Var16 = (ib4) ((ei5) objQ26);
                        boolean zF24 = dd4Var2.f(u98Var2);
                        Object objQ27 = dd4Var2.Q();
                        if (zF24 || objQ27 == fu6Var) {
                            qd2 qd2Var = new qd2(1, u98Var2, u98.class, "changeNameVpPriority", "changeNameVpPriority(I)V", 0, 24);
                            dd4Var2.p0(qd2Var);
                            objQ27 = qd2Var;
                        }
                        kb4 kb4Var2 = (kb4) ((ei5) objQ27);
                        boolean zF25 = dd4Var2.f(u98Var2);
                        Object objQ28 = dd4Var2.Q();
                        if (zF25 || objQ28 == fu6Var) {
                            qd2 qd2Var2 = new qd2(1, u98Var2, u98.class, "changePersonalGeneralPriority", "changePersonalGeneralPriority(I)V", 0, 25);
                            dd4Var2.p0(qd2Var2);
                            objQ28 = qd2Var2;
                        }
                        kb4 kb4Var3 = (kb4) ((ei5) objQ28);
                        boolean zF26 = dd4Var2.f(u98Var2);
                        Object objQ29 = dd4Var2.Q();
                        if (zF26 || objQ29 == fu6Var) {
                            qd2 qd2Var3 = new qd2(1, u98Var2, u98.class, "changeVpPriority", "changeVpPriority(I)V", 0, 26);
                            dd4Var2.p0(qd2Var3);
                            objQ29 = qd2Var3;
                        }
                        kb4 kb4Var4 = (kb4) ((ei5) objQ29);
                        boolean zF27 = dd4Var2.f(u98Var2);
                        Object objQ30 = dd4Var2.Q();
                        if (zF27 || objQ30 == fu6Var) {
                            qd2 qd2Var4 = new qd2(1, u98Var2, u98.class, "changeLuatNhan", "changeLuatNhan(I)V", 0, 27);
                            dd4Var2.p0(qd2Var4);
                            objQ30 = qd2Var4;
                        }
                        kb4 kb4Var5 = (kb4) ((ei5) objQ30);
                        boolean zF28 = dd4Var2.f(u98Var2);
                        Object objQ31 = dd4Var2.Q();
                        if (zF28 || objQ31 == fu6Var) {
                            qd2 qd2Var5 = new qd2(1, u98Var2, u98.class, "changeLongestWord", "changeLongestWord(I)V", 0, 28);
                            dd4Var2.p0(qd2Var5);
                            objQ31 = qd2Var5;
                        }
                        kb4 kb4Var6 = (kb4) ((ei5) objQ31);
                        boolean zF29 = dd4Var2.f(u98Var2);
                        Object objQ32 = dd4Var2.Q();
                        if (zF29 || objQ32 == fu6Var) {
                            qd2 qd2Var6 = new qd2(1, u98Var2, u98.class, "changeWordBreakMode", "changeWordBreakMode(I)V", 0, 29);
                            dd4Var2.p0(qd2Var6);
                            objQ32 = qd2Var6;
                        }
                        kb4 kb4Var7 = (kb4) ((ei5) objQ32);
                        boolean zF30 = dd4Var2.f(u98Var2);
                        Object objQ33 = dd4Var2.Q();
                        if (zF30 || objQ33 == fu6Var) {
                            n98 n98Var = new n98(1, u98Var2, u98.class, "changeAutoConvertSimplified", "changeAutoConvertSimplified(Z)V", 0, 0);
                            dd4Var2.p0(n98Var);
                            objQ33 = n98Var;
                        }
                        kb4 kb4Var8 = (kb4) ((ei5) objQ33);
                        boolean zF31 = dd4Var2.f(u98Var2);
                        Object objQ34 = dd4Var2.Q();
                        if (zF31 || objQ34 == fu6Var) {
                            n98 n98Var2 = new n98(1, u98Var2, u98.class, "changeDialogueItalicized", "changeDialogueItalicized(Z)V", 0, 1);
                            dd4Var2.p0(n98Var2);
                            objQ34 = n98Var2;
                        }
                        kb4 kb4Var9 = (kb4) ((ei5) objQ34);
                        t27 t27Var3 = t27Var;
                        boolean zF32 = dd4Var2.f(t27Var3);
                        Object objQ35 = dd4Var2.Q();
                        if (zF32 || objQ35 == fu6Var) {
                            objQ35 = new y07(t27Var3, 9);
                            dd4Var2.p0(objQ35);
                        }
                        sdc.N(o98Var, pj7Var, ou6VarB, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, ib4Var6, ib4Var7, ib4Var8, ib4Var9, ib4Var10, ib4Var11, ib4Var12, ib4Var13, ib4Var14, ib4Var15, ib4Var16, kb4Var2, kb4Var3, kb4Var4, kb4Var5, kb4Var6, kb4Var7, kb4Var8, kb4Var9, (ib4) objQ35, dd4Var2, iIntValue & Token.ASSIGN_MOD);
                    } else {
                        dd4Var2.Y();
                    }
                    return heb.a;
                }
            };
            t27Var2 = t27Var;
            gx1.p(strK, px3Var, false, rj1VarG, null, jf0.G(-1087635951, ac4Var, dd4Var), dd4Var, 199728, 20);
        } else {
            t27Var2 = t27Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new n74(i2, 24, t27Var2);
        }
    }

    public static final void N(final o98 o98Var, final pj7 pj7Var, final ou6 ou6Var, final ib4 ib4Var, final ib4 ib4Var2, final ib4 ib4Var3, final ib4 ib4Var4, final ib4 ib4Var5, final ib4 ib4Var6, final ib4 ib4Var7, final ib4 ib4Var8, final ib4 ib4Var9, final ib4 ib4Var10, final ib4 ib4Var11, final ib4 ib4Var12, final ib4 ib4Var13, final ib4 ib4Var14, final ib4 ib4Var15, final ib4 ib4Var16, final kb4 kb4Var, final kb4 kb4Var2, final kb4 kb4Var3, final kb4 kb4Var4, kb4 kb4Var5, final kb4 kb4Var6, final kb4 kb4Var7, final kb4 kb4Var8, final ib4 ib4Var17, dd4 dd4Var, final int i2) {
        int i3;
        kb4 kb4Var9;
        float f2;
        ou6 ou6Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-628785174);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.f(o98Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.f(pj7Var) ? 32 : 16;
        }
        int i4 = i2 & 384;
        int i5 = Token.CASE;
        if (i4 == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var2.h(ib4Var2) ? 16384 : 8192;
        }
        int i6 = i2 & 196608;
        int i7 = Parser.ARGC_LIMIT;
        if (i6 == 0) {
            i3 |= dd4Var2.h(ib4Var3) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= dd4Var2.h(ib4Var4) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= dd4Var2.h(ib4Var5) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= dd4Var2.h(ib4Var6) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= dd4Var2.h(ib4Var7) ? 536870912 : 268435456;
        }
        int i8 = (dd4Var2.h(ib4Var8) ? 4 : 2) | (dd4Var2.h(ib4Var9) ? 32 : 16) | (dd4Var2.h(ib4Var10) ? 256 : 128) | (dd4Var2.h(ib4Var11) ? 2048 : 1024) | (dd4Var2.h(ib4Var12) ? 16384 : 8192) | (dd4Var2.h(ib4Var13) ? 131072 : 65536) | (dd4Var2.h(ib4Var14) ? 1048576 : 524288) | (dd4Var2.h(ib4Var15) ? 8388608 : 4194304) | (dd4Var2.h(ib4Var16) ? 67108864 : 33554432) | (dd4Var2.h(kb4Var) ? 536870912 : 268435456);
        int i9 = (dd4Var2.h(kb4Var2) ? 4 : 2) | (dd4Var2.h(kb4Var3) ? 32 : 16);
        if (dd4Var2.h(kb4Var4)) {
            i5 = 256;
        }
        int i10 = i9 | i5 | (dd4Var2.h(kb4Var5) ? 2048 : 1024) | (dd4Var2.h(kb4Var6) ? 16384 : 8192);
        if (dd4Var2.h(kb4Var7)) {
            i7 = 131072;
        }
        int i11 = i10 | i7 | (dd4Var2.h(kb4Var8) ? 1048576 : 524288) | (dd4Var2.h(ib4Var17) ? 8388608 : 4194304);
        if (dd4Var2.V(i3 & 1, ((i3 & 306783379) == 306783378 && (i8 & 306783379) == 306783378 && (i11 & 4793491) == 4793490) ? false : true)) {
            ou6 ou6VarQ = kc5.Q(h67.f0(tg9.e(ou6Var), null, 3), kc5.J(dd4Var2), 14);
            vf0 vf0Var = bv4.z;
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var2, 0);
            int iHashCode = Long.hashCode(fe.U(dd4Var2));
            lr7 lr7VarA = dd4Var2.A();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarQ);
            ml1.k.getClass();
            um1 um1VarB = ll1.b();
            dd4Var2.j0();
            if (dd4Var2.E()) {
                dd4Var2.k(um1VarB);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.d(), dd4Var2, ie1VarA);
            un9.s(ll1.f(), dd4Var2, lr7VarA);
            un9.s(ll1.c(), dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.a());
            un9.s(ll1.e(), dd4Var2, ou6VarL0);
            ou6 ou6Var3 = lu6.a;
            un9.a(dd4Var2, gjb.k0(ou6Var3, pj7Var));
            wf0 wf0Var = bv4.x;
            iv ivVar = pv.a;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var2, 48);
            int iHashCode2 = Long.hashCode(fe.U(dd4Var2));
            lr7 lr7VarA2 = dd4Var2.A();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6Var3);
            int i12 = i3;
            um1 um1VarB2 = ll1.b();
            dd4Var2.j0();
            if (dd4Var2.E()) {
                dd4Var2.k(um1VarB2);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.d(), dd4Var2, eq8VarA);
            un9.s(ll1.f(), dd4Var2, lr7VarA2);
            un9.s(ll1.c(), dd4Var2, Integer.valueOf(iHashCode2));
            un9.r(dd4Var2, ll1.a());
            un9.s(ll1.e(), dd4Var2, ou6VarL02);
            nha.c(wn9.K(zu9.a(), dd4Var2), xv5.f(1.0f, gjb.l0(ou6Var3, 16.0f), true), s00.o(dd4Var2).c(), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).d(), dd4Var, 0, 0, 131064);
            dd4 dd4Var3 = dd4Var;
            if (o98Var.a == null) {
                dd4Var3.f0(2031208140);
                if (o98Var.f) {
                    dd4Var3.f0(2031259104);
                    ou6 ou6VarN0 = gjb.n0(ou6Var3, 16.0f, 0.0f, 2);
                    eq8 eq8VarA2 = dq8.a(ivVar, wf0Var, dd4Var3, 48);
                    int iHashCode3 = Long.hashCode(fe.U(dd4Var3));
                    lr7 lr7VarA3 = dd4Var3.A();
                    ou6 ou6VarL03 = s32.L0(dd4Var3, ou6VarN0);
                    um1 um1VarB3 = ll1.b();
                    dd4Var3.j0();
                    if (dd4Var3.E()) {
                        dd4Var3.k(um1VarB3);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(ll1.d(), dd4Var3, eq8VarA2);
                    un9.s(ll1.f(), dd4Var3, lr7VarA3);
                    un9.s(ll1.c(), dd4Var3, Integer.valueOf(iHashCode3));
                    un9.r(dd4Var3, ll1.a());
                    un9.s(ll1.e(), dd4Var3, ou6VarL03);
                    y(tg9.n(ou6Var3, 28.0f), 0L, null, dd4Var, 6, 6);
                    un9.a(dd4Var, tg9.r(ou6Var3, 8.0f));
                    ou6Var2 = ou6Var3;
                    nha.c(wn9.K((pv9) zu9.u.getValue(), dd4Var), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).a(), dd4Var, 0, 0, 131070);
                    dd4Var3 = dd4Var;
                    if (o98Var.h > 0) {
                        dd4Var3.f0(-350997860);
                        un9.a(dd4Var3, tg9.r(ou6Var2, 6.0f));
                        nha.c(xv5.p("(", wn9.L(mu9.a(), new Object[]{tn9.i("%.1f", new Object[]{Float.valueOf((o98Var.g / o98Var.h) * 100.0f)})}, dd4Var3), ")"), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var3).a(), dd4Var, 0, 0, 131070);
                        dd4Var3 = dd4Var;
                        dd4Var3.t();
                    } else {
                        dd4Var3.f0(-350433753);
                        dd4Var3.t();
                    }
                    dd4Var3.s();
                    dd4Var3.t();
                    f2 = 0.0f;
                } else {
                    ou6Var2 = ou6Var3;
                    dd4Var3.f0(2032590988);
                    f2 = 0.0f;
                    kc5.n(i25.c((m53) a53.x.getValue(), dd4Var3, 0), wn9.K((pv9) zu9.t0.getValue(), dd4Var3), false, null, gjb.n0(ou6Var2, 16.0f, 0.0f, 2), null, null, null, ib4Var16, dd4Var, (i8 & 234881024) | 24576, 236);
                    dd4Var3 = dd4Var;
                    dd4Var3.t();
                }
                dd4Var3.t();
            } else {
                f2 = 0.0f;
                ou6Var2 = ou6Var3;
                dd4Var3.f0(2033009054);
                dd4Var3.t();
            }
            dd4Var3.s();
            vh4 vh4Var = new vh4();
            if (x13.b(150.0f, f2) <= 0) {
                gp.l("Adaptive minSize must be a positive value, but ".concat(x13.d(150.0f)));
                throw null;
            }
            ou6 ou6VarW = t96.w(gjb.n0(ou6Var2, 16.0f, f2, 2), s00.p(dd4Var3).b());
            mv mvVar = new mv(4.0f, true, new gp(5));
            mv mvVar2 = new mv(4.0f, true, new gp(5));
            yb4 yb4VarE0 = tu1.e0(vh4Var, mvVar, dd4Var3);
            boolean zF = dd4Var3.f(vh4Var);
            Object objQ = dd4Var3.Q();
            Object obj = vl1.a;
            if (zF || objQ == obj) {
                objQ = Boolean.TRUE;
                dd4Var3.p0(objQ);
            }
            ha6 ha6VarG0 = tu1.g0(yb4VarE0, ((Boolean) objQ).booleanValue(), mvVar, mvVar2, dd4Var, 3456);
            int iHashCode4 = Long.hashCode(fe.U(dd4Var));
            lr7 lr7VarA4 = dd4Var.A();
            ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarW);
            um1 um1VarB4 = ll1.b();
            dd4Var.j0();
            if (dd4Var.E()) {
                dd4Var.k(um1VarB4);
            } else {
                dd4Var.s0();
            }
            un9.s(ll1.d(), dd4Var, ha6VarG0);
            un9.s(ll1.f(), dd4Var, lr7VarA4);
            un9.s(ll1.c(), dd4Var, Integer.valueOf(iHashCode4));
            un9.r(dd4Var, ll1.a());
            un9.s(ll1.e(), dd4Var, ou6VarL04);
            int i13 = i12 >> 9;
            i("VietPhrase.txt", o98Var.a, null, ib4Var, ib4Var11, ib4Var6, dd4Var, 6 | (i12 & 7168) | ((i8 << 3) & 57344) | (i13 & 458752));
            int i14 = i12 >> 12;
            i("Name.txt", o98Var.b, null, ib4Var2, ib4Var12, ib4Var7, dd4Var, 6 | ((i12 >> 3) & 7168) | (i8 & 57344) | (i14 & 458752));
            i("PhienAm.txt", o98Var.c, null, ib4Var3, ib4Var13, ib4Var8, dd4Var, 6 | ((i12 >> 6) & 7168) | ((i8 >> 3) & 57344) | ((i8 << 15) & 458752));
            i("Pronouns.txt", o98Var.d, null, ib4Var4, ib4Var14, ib4Var9, dd4Var, 6 | (i13 & 7168) | ((i8 >> 6) & 57344) | ((i8 << 12) & 458752));
            i("LuatNhan.txt", o98Var.e, null, ib4Var5, ib4Var15, ib4Var10, dd4Var, 6 | (i14 & 7168) | ((i8 >> 9) & 57344) | ((i8 << 9) & 458752));
            dd4Var.s();
            un9.a(dd4Var, tg9.h(ou6Var2, 12.0f));
            ou6 ou6Var4 = ou6Var2;
            nha.c(wn9.K((pv9) zu9.E0.getValue(), dd4Var), gjb.l0(ou6Var2, 16.0f), s00.o(dd4Var).c(), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).d(), dd4Var, 48, 0, 131064);
            ou6 ou6VarW2 = t96.w(gjb.n0(tg9.g(ou6Var4), 16.0f, f2, 2), s00.p(dd4Var).b());
            ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode5 = Long.hashCode(fe.U(dd4Var));
            lr7 lr7VarA5 = dd4Var.A();
            ou6 ou6VarL05 = s32.L0(dd4Var, ou6VarW2);
            um1 um1VarB5 = ll1.b();
            dd4Var.j0();
            if (dd4Var.E()) {
                dd4Var.k(um1VarB5);
            } else {
                dd4Var.s0();
            }
            un9.s(ll1.d(), dd4Var, ie1VarA2);
            un9.s(ll1.f(), dd4Var, lr7VarA5);
            un9.s(ll1.c(), dd4Var, Integer.valueOf(iHashCode5));
            un9.r(dd4Var, ll1.a());
            un9.s(ll1.e(), dd4Var, ou6VarL05);
            e11.t(wn9.K((pv9) zu9.D0.getValue(), dd4Var), wm9.r((hv9) rv.C.getValue(), dd4Var), o98Var.i, gjb.l0(fe.L(t96.w(ou6Var4, s00.p(dd4Var).a()), dd1.g(s00.o(dd4Var), 1.0f), jf0.G), 16.0f), kb4Var, dd4Var, (i8 >> 15) & 57344);
            un9.a(dd4Var, tg9.h(ou6Var4, 4.0f));
            e11.t(wn9.K((pv9) zu9.F0.getValue(), dd4Var), wm9.r((hv9) rv.D.getValue(), dd4Var), o98Var.j, gjb.l0(fe.L(t96.w(ou6Var4, s00.p(dd4Var).a()), dd1.g(s00.o(dd4Var), 1.0f), jf0.G), 16.0f), kb4Var2, dd4Var, (i11 << 12) & 57344);
            un9.a(dd4Var, tg9.h(ou6Var4, 4.0f));
            String strK = wn9.K((pv9) zu9.z0.getValue(), dd4Var);
            String strValueOf = String.valueOf(o98Var.l);
            qj5 qj5Var = new qj5(3, 0, Token.EXPORT);
            ou6 ou6VarL06 = gjb.l0(fe.L(t96.w(ou6Var4, s00.p(dd4Var).a()), dd1.g(s00.o(dd4Var), 1.0f), jf0.G), 16.0f);
            boolean z2 = (i11 & 7168) == 2048;
            Object objQ2 = dd4Var.Q();
            if (z2 || objQ2 == obj) {
                kb4Var9 = kb4Var5;
                objQ2 = new mj(23, kb4Var9);
                dd4Var.p0(objQ2);
            } else {
                kb4Var9 = kb4Var5;
            }
            e11.u(strK, strValueOf, null, qj5Var, null, ou6VarL06, (kb4) objQ2, dd4Var, 3072);
            un9.a(dd4Var, tg9.h(ou6Var4, 4.0f));
            e11.t(wn9.K(ev9.a(), dd4Var), wm9.r((hv9) rv.E.getValue(), dd4Var), o98Var.k, gjb.l0(fe.L(t96.w(ou6Var4, s00.p(dd4Var).a()), dd1.g(s00.o(dd4Var), 1.0f), jf0.G), 16.0f), kb4Var3, dd4Var, (i11 << 9) & 57344);
            un9.a(dd4Var, tg9.h(ou6Var4, 4.0f));
            e11.t(wn9.K((pv9) zu9.C0.getValue(), dd4Var), wm9.r((hv9) rv.B.getValue(), dd4Var), o98Var.m, gjb.l0(fe.L(t96.w(ou6Var4, s00.p(dd4Var).a()), dd1.g(s00.o(dd4Var), 1.0f), jf0.G), 16.0f), kb4Var4, dd4Var, (i11 << 6) & 57344);
            un9.a(dd4Var, tg9.h(ou6Var4, 4.0f));
            e11.t(wn9.K((pv9) zu9.d0.getValue(), dd4Var), wm9.r((hv9) rv.A.getValue(), dd4Var), o98Var.n, gjb.l0(fe.L(t96.w(ou6Var4, s00.p(dd4Var).a()), dd1.g(s00.o(dd4Var), 1.0f), jf0.G), 16.0f), kb4Var6, dd4Var, i11 & 57344);
            un9.a(dd4Var, tg9.h(ou6Var4, 4.0f));
            e11.v(null, wn9.K((pv9) zu9.A0.getValue(), dd4Var), wn9.K((pv9) zu9.B0.getValue(), dd4Var), gjb.l0(fe.L(t96.w(ou6Var4, s00.p(dd4Var).a()), dd1.g(s00.o(dd4Var), 1.0f), jf0.G), 16.0f), ib4Var17, dd4Var, (i11 >> 9) & 57344, 1);
            un9.a(dd4Var, tg9.h(ou6Var4, 4.0f));
            e11.x(null, wn9.K((pv9) zu9.e0.getValue(), dd4Var), wn9.K((pv9) zu9.f0.getValue(), dd4Var), gjb.l0(fe.L(t96.w(ou6Var4, s00.p(dd4Var).a()), dd1.g(s00.o(dd4Var), 1.0f), jf0.G), 16.0f), false, o98Var.o, kb4Var7, dd4Var, (i11 << 3) & 3670016, 17);
            un9.a(dd4Var, tg9.h(ou6Var4, 4.0f));
            e11.x(null, wn9.K((pv9) zu9.g0.getValue(), dd4Var), wn9.K((pv9) zu9.h0.getValue(), dd4Var), gjb.l0(fe.L(t96.w(ou6Var4, s00.p(dd4Var).a()), dd1.g(s00.o(dd4Var), 1.0f), jf0.G), 16.0f), false, o98Var.p, kb4Var8, dd4Var, i11 & 3670016, 17);
            dd4Var2 = dd4Var;
            dd4Var2.s();
            un9.a(dd4Var2, yib.B(gjb.p0(ou6Var4, 0.0f, 0.0f, 0.0f, 12.0f, 7), 14));
            dd4Var2.s();
        } else {
            kb4Var9 = kb4Var5;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            final kb4 kb4Var10 = kb4Var9;
            ye8VarU.e(new yb4() { // from class: l98
                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(i2 | 1);
                    sdc.N(o98Var, pj7Var, ou6Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, ib4Var5, ib4Var6, ib4Var7, ib4Var8, ib4Var9, ib4Var10, ib4Var11, ib4Var12, ib4Var13, ib4Var14, ib4Var15, ib4Var16, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var10, kb4Var6, kb4Var7, kb4Var8, ib4Var17, (dd4) obj2, iX0);
                    return heb.a;
                }
            });
        }
    }

    public static final void O(fr3 fr3Var, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        dd4Var.h0(1717998731);
        int i3 = i2 | (dd4Var.f(fr3Var) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16) | (dd4Var.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
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
            String str = fr3Var.b;
            uka ukaVar = s00.q(dd4Var).i;
            lu6 lu6Var = lu6.a;
            nha.c(str, tg9.f(lu6Var, 1.0f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, 48, 0, 130044);
            ou6 ou6VarH = xv5.h(lu6Var, 8.0f, dd4Var, lu6Var, 1.0f);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var, 48);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarH);
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
            nha.c(fr3Var.a, (ou6) null, s00.o(dd4Var).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).h, dd4Var, 0, 0, 131066);
            un9.a(dd4Var, new bp5(1.0f, true));
            ou6 ou6VarL = fe.L(t96.w(tg9.j(tg9.t(lu6Var, 50.0f, 0.0f, 2), 32.0f, 0.0f, 2), s00.p(dd4Var).d), dd1.g(s00.o(dd4Var), 3.0f), jf0.G);
            boolean z2 = (i3 & 896) == 256;
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new xf3(4, ib4Var);
                dd4Var.p0(objQ);
            }
            ou6 ou6VarM0 = gjb.m0(fw.J(null, (ib4) objQ, ou6VarL, false, 15), 10.0f, 6.0f);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarM0);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ha6VarD);
            un9.s(jmVar2, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL03);
            ou6 ou6VarA = zn0.a.a(lu6Var, bv4.f);
            String upperCase = wn9.K((pv9) zt9.a0.getValue(), dd4Var).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            nha.c(upperCase, ou6VarA, lc1.f, (g60) null, 0L, (t74) null, a84.w, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).n, dd4Var, 1573248, 0, 131000);
            dd4Var2 = dd4Var;
            tw2.x(dd4Var2, true, true, true);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new mt(fr3Var, ou6Var, ib4Var, i2, 16);
        }
    }

    public static final void P(boolean z2, List list, ib4 ib4Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        dd4Var.h0(1808725873);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.h(list) ? 32 : 16) | (dd4Var.h(ib4Var) ? 256 : Token.CASE) | (dd4Var.h(kb4Var) ? 2048 : 1024);
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            gx1.a(z2, null, 0L, null, 0.0f, new rj7(12.0f, 12.0f, 12.0f, 12.0f), ib4Var, jf0.G(618125437, new pp0(list, kb4Var, i4), dd4Var), dd4Var, (i3 & 14) | 12779520 | ((i3 << 12) & 3670016), 30);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new i90(z2, list, ib4Var, kb4Var, i2);
        }
    }

    public static final void Q(gd9 gd9Var, wq5 wq5Var, pj7 pj7Var, szb szbVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        int i3;
        ou6 ou6Var2;
        dd4Var.h0(-3948995);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(gd9Var) ? 4 : 2) | i2;
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
            i3 |= dd4Var.f(szbVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            ou6Var2 = ou6Var;
            i3 |= dd4Var.f(ou6Var2) ? 16384 : 8192;
        } else {
            ou6Var2 = ou6Var;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 1048576 : 524288;
        }
        if (dd4Var.V(i3 & 1, (599187 & i3) != 599186)) {
            yh4 yh4Var = new yh4(wx1.Q(gd9Var.d, 80, Context.VERSION_ES6));
            mv mvVar = new mv(8.0f, true, new gp(5));
            mv mvVar2 = new mv(8.0f, true, new gp(5));
            boolean z2 = ((i3 & 14) == 4) | ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576);
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new zc9(gd9Var, kb4Var, kb4Var2, 2);
                dd4Var.p0(objQ);
            }
            kb4 kb4Var3 = (kb4) objQ;
            int i4 = i3 << 3;
            gx1.i(yh4Var, ou6Var2, wq5Var, pj7Var, mvVar2, mvVar, null, false, 0L, 0L, szbVar, 0.0f, kb4Var3, dd4Var, ((i3 >> 9) & Token.ASSIGN_MOD) | 1769472 | (i4 & 896) | (i4 & 7168), (i3 >> 6) & Token.ASSIGN_MOD, 6032);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ad9(gd9Var, wq5Var, pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, i2, 2);
        }
    }

    public static final void R(gd9 gd9Var, wq5 wq5Var, pj7 pj7Var, szb szbVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        int i3;
        szb szbVar2;
        dd4Var.h0(-706544834);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(gd9Var) ? 4 : 2) | i2;
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
            yh4 yh4Var = new yh4(wx1.Q(gd9Var.d, 80, Context.VERSION_ES6));
            mv mvVar = new mv(8.0f, true, new gp(5));
            mv mvVar2 = new mv(8.0f, true, new gp(5));
            boolean z2 = ((i3 & 14) == 4) | ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576);
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new zc9(gd9Var, kb4Var, kb4Var2, 0);
                dd4Var.p0(objQ);
            }
            kb4 kb4Var3 = (kb4) objQ;
            int i4 = i3 << 3;
            gx1.i(yh4Var, ou6Var, wq5Var, pj7Var, mvVar2, mvVar, null, false, 0L, 0L, szbVar2, 0.0f, kb4Var3, dd4Var, ((i3 >> 9) & Token.ASSIGN_MOD) | 1769472 | (i4 & 896) | (i4 & 7168), (i3 >> 6) & Token.ASSIGN_MOD, 6032);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ad9(gd9Var, wq5Var, pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, i2, 0);
        }
    }

    public static final void S(gd9 gd9Var, pj7 pj7Var, szb szbVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        int i3;
        pj7 pj7Var2;
        szb szbVar2;
        ou6 ou6Var2;
        kb4 kb4Var3;
        kb4 kb4Var4;
        gd9Var.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var.h0(-1549262573);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(gd9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            pj7Var2 = pj7Var;
            i3 |= dd4Var.f(pj7Var2) ? 32 : 16;
        } else {
            pj7Var2 = pj7Var;
        }
        if ((i2 & 384) == 0) {
            szbVar2 = szbVar;
            i3 |= dd4Var.f(szbVar2) ? 256 : Token.CASE;
        } else {
            szbVar2 = szbVar;
        }
        if ((i2 & 3072) == 0) {
            ou6Var2 = ou6Var;
            i3 |= dd4Var.f(ou6Var2) ? 2048 : 1024;
        } else {
            ou6Var2 = ou6Var;
        }
        if ((i2 & 24576) == 0) {
            kb4Var3 = kb4Var;
            i3 |= dd4Var.h(kb4Var3) ? 16384 : 8192;
        } else {
            kb4Var3 = kb4Var;
        }
        if ((196608 & i2) == 0) {
            kb4Var4 = kb4Var2;
            i3 |= dd4Var.h(kb4Var4) ? 131072 : Parser.ARGC_LIMIT;
        } else {
            kb4Var4 = kb4Var2;
        }
        if (dd4Var.V(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = gd9Var.c;
            if (i4 == 0) {
                int i5 = i3;
                dd4Var.f0(-362450585);
                int i6 = i5 & 14;
                int i7 = i5 << 3;
                Q(gd9Var, yq5.a(dd4Var), pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, dd4Var, i6 | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752) | (i7 & 3670016));
                dd4Var.q(false);
            } else if (i4 == 1) {
                int i8 = i3;
                dd4Var.f0(-362049817);
                int i9 = i8 & 14;
                int i10 = i8 << 3;
                R(gd9Var, yq5.a(dd4Var), pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, dd4Var, i9 | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016));
                dd4Var.q(false);
            } else if (i4 == 2) {
                int i11 = i3;
                dd4Var.f0(-361649049);
                int i12 = i11 & 14;
                int i13 = i11 << 3;
                T(gd9Var, yq5.a(dd4Var), pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, dd4Var, i12 | (i13 & 896) | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i13 & 3670016));
                dd4Var.q(false);
            } else if (i4 != 3) {
                dd4Var.f0(-360896369);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-361248281);
                int i14 = i3;
                int i15 = i14 & 14;
                int i16 = i14 << 3;
                U(gd9Var, yq5.a(dd4Var), pj7Var2, szbVar2, ou6Var2, kb4Var3, kb4Var4, dd4Var, (i16 & 3670016) | i15 | (i16 & 896) | (i16 & 7168) | (i16 & 57344) | (i16 & 458752));
                dd4Var.q(false);
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tz0(gd9Var, pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, i2, 9);
        }
    }

    public static final void T(gd9 gd9Var, wq5 wq5Var, pj7 pj7Var, szb szbVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        int i3;
        szb szbVar2;
        dd4Var.h0(2033667045);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(gd9Var) ? 4 : 2) | i2;
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
            yh4 yh4Var = new yh4(wx1.Q(gd9Var.d, 180, 400));
            mv mvVar = new mv(8.0f, true, new gp(5));
            mv mvVar2 = new mv(8.0f, true, new gp(5));
            boolean z2 = ((i3 & 14) == 4) | ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576);
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new zc9(gd9Var, kb4Var, kb4Var2, 3);
                dd4Var.p0(objQ);
            }
            kb4 kb4Var3 = (kb4) objQ;
            int i4 = i3 << 3;
            gx1.i(yh4Var, ou6Var, wq5Var, pj7Var, mvVar2, mvVar, null, false, 0L, 0L, szbVar2, 0.0f, kb4Var3, dd4Var, ((i3 >> 9) & Token.ASSIGN_MOD) | 1769472 | (i4 & 896) | (i4 & 7168), (i3 >> 6) & Token.ASSIGN_MOD, 6032);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ad9(gd9Var, wq5Var, pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, i2, 3);
        }
    }

    public static final void U(gd9 gd9Var, wq5 wq5Var, pj7 pj7Var, szb szbVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        int i3;
        szb szbVar2;
        dd4Var.h0(1331071206);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(gd9Var) ? 4 : 2) | i2;
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
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (599187 & i3) != 599186)) {
            yh4 yh4Var = new yh4(wx1.Q(gd9Var.d, 150, 400));
            mv mvVar = new mv(8.0f, true, new gp(5));
            mv mvVar2 = new mv(8.0f, true, new gp(5));
            boolean z2 = ((i3 & 14) == 4) | ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576);
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new zc9(gd9Var, kb4Var, kb4Var2, i4);
                dd4Var.p0(objQ);
            }
            kb4 kb4Var3 = (kb4) objQ;
            int i5 = i3 << 3;
            gx1.i(yh4Var, ou6Var, wq5Var, pj7Var, mvVar2, mvVar, null, false, 0L, 0L, szbVar2, 0.0f, kb4Var3, dd4Var, ((i3 >> 9) & Token.ASSIGN_MOD) | 1769472 | (i5 & 896) | (i5 & 7168), (i3 >> 6) & Token.ASSIGN_MOD, 6032);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ad9(gd9Var, wq5Var, pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, i2, 1);
        }
    }

    public static final void V(gd9 gd9Var, boolean z2, pj7 pj7Var, szb szbVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, ib4 ib4Var, dd4 dd4Var, int i2) {
        int i3;
        dd4 dd4Var2 = dd4Var;
        gd9Var.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        ib4Var.getClass();
        dd4Var2.h0(-464518680);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.f(gd9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var2.f(pj7Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var2.f(szbVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var2.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var2.h(kb4Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 8388608 : 4194304;
        }
        if (!dd4Var2.V(i3 & 1, (4793475 & i3) != 4793474)) {
            dd4Var2.Y();
        } else if (gd9Var.a) {
            dd4Var2.f0(-91055345);
            dd4Var2.q(false);
        } else if (gd9Var.b.isEmpty()) {
            dd4Var2.f0(-90983394);
            bx1.d(lx1.m0(dd4Var2), wn9.K((pv9) eu9.o.getValue(), dd4Var2), wn9.K((pv9) eu9.p.getValue(), dd4Var2), gjb.k0(tg9.c, pj7Var), wn9.K((pv9) zt9.v0.getValue(), dd4Var2), ib4Var, dd4Var, (i3 >> 6) & 458752, 0);
            dd4Var2 = dd4Var;
            dd4Var2.q(false);
        } else {
            int i4 = i3;
            dd4Var2.f0(-90550200);
            int i5 = i4 & 14;
            int i6 = i4 >> 3;
            S(gd9Var, pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, dd4Var2, i5 | (i6 & Token.ASSIGN_MOD) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (i6 & 458752));
            dd4Var2.q(false);
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new is0(gd9Var, z2, pj7Var, szbVar, ou6Var, kb4Var, kb4Var2, ib4Var, i2);
        }
    }

    public static final void W(List list, pj7 pj7Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        int i3;
        ou6 ou6Var2;
        dd4Var.h0(1860484536);
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
            i3 |= dd4Var.h(kb4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 16384 : 8192;
        }
        int i4 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            szb szbVarW = yib.w(yib.w(pj7Var, yib.e(dd4Var, 14)), gjb.q(0.0f, 0.0f, 0.0f, 80.0f, 7));
            yh4 yh4Var = new yh4(320.0f);
            szb szbVarW2 = yib.w(szbVarW, gjb.q(16.0f, 0.0f, 16.0f, 0.0f, 10));
            szb szbVarW3 = yib.w(szbVarW, gjb.q(0.0f, 0.0f, 4.0f, 0.0f, 11));
            mv mvVar = new mv(4.0f, true, new gp(5));
            boolean zH = dd4Var.h(list) | ((57344 & i3) == 16384) | ((i3 & 7168) == 2048);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                objQ = new q54(list, kb4Var2, kb4Var, i4);
                dd4Var.p0(objQ);
            }
            gx1.i(yh4Var, ou6Var2, null, szbVarW2, mvVar, null, null, false, 0L, 0L, szbVarW3, 0.0f, (kb4) objQ, dd4Var, ((i3 >> 3) & Token.ASSIGN_MOD) | 196608, 0, 6100);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new t7a(list, pj7Var, ou6Var, kb4Var, kb4Var2, i2, 0);
        }
    }

    public static final void X(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var) {
        ou6 ou6Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(981096991);
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
            nha.c(wn9.K((pv9) ev9.I.getValue(), dd4Var2), (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.f, dd4Var2, 0, 0, 130046);
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
            ye8VarU.d = new rz0(ou6Var2, ib4Var, i2, 10);
        }
    }

    public static final void Y(t27 t27Var, dd4 dd4Var, int i2) {
        a07 a07Var;
        t27Var.getClass();
        dd4Var.h0(1131099753);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        int i4 = 1;
        int i5 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            h8a h8aVar = (h8a) ((qtb) qx1.N(ug8.a(h8a.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(h8aVar.f, dd4Var);
            Object[] objArr = new Object[0];
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new i5a(11);
                dd4Var.p0(objQ);
            }
            a07 a07Var2 = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 48);
            Object objQ2 = dd4Var.Q();
            jt1 jt1Var = null;
            if (objQ2 == obj) {
                objQ2 = dk9.x((Object) null);
                dd4Var.p0(objQ2);
            }
            a07 a07Var3 = (a07) objQ2;
            ms7 ms7Var = new ms7(gc1.Y("json"));
            Object objQ3 = dd4Var.Q();
            int i6 = 8;
            if (objQ3 == obj) {
                objQ3 = new aq9(a07Var3, i6);
                dd4Var.p0(objQ3);
            }
            aw3 aw3VarC0 = e11.c0(ms7Var, (kb4) objQ3, dd4Var, 56);
            boolean zF = dd4Var.f(h8aVar);
            Object objQ4 = dd4Var.Q();
            if (zF || objQ4 == obj) {
                objQ4 = new q7a(h8aVar, jt1Var, i4);
                dd4Var.p0(objQ4);
            }
            lc5.u((yb4) objQ4, dd4Var, heb.a);
            Object[] objArr2 = new Object[0];
            rt8 rt8Var = s83.e;
            Object objQ5 = dd4Var.Q();
            if (objQ5 == obj) {
                objQ5 = new i5a(10);
                dd4Var.p0(objQ5);
            }
            s83 s83Var = (s83) ww1.d0(objArr2, rt8Var, (ib4) objQ5, dd4Var, 384);
            lva lvaVar = (lva) dd4Var.j(nva.a);
            pp1 pp1Var = h8aVar.s;
            boolean zF2 = dd4Var.f(lvaVar);
            Object objQ6 = dd4Var.Q();
            if (zF2 || objQ6 == obj) {
                objQ6 = new xa(lvaVar, jt1Var, 21);
                dd4Var.p0(objQ6);
            }
            wx1.e(pp1Var, null, (zb4) objQ6, dd4Var, 0);
            gx1.p(wn9.K((pv9) ev9.G.getValue(), dd4Var), tg9.c, false, jf0.G(-1130415899, new oe9(t27Var, 8), dd4Var), jf0.G(2015094798, new v7a(a07Var2, aw3VarC0, h8aVar, i5), dd4Var), jf0.G(530318003, new ak0(14, s83Var, h8aVar, a07VarB), dd4Var), dd4Var, 224304, 4);
            boolean zF3 = dd4Var.f(h8aVar);
            Object objQ7 = dd4Var.Q();
            if (zF3 || objQ7 == obj) {
                objQ7 = new rt6(h8aVar, 12);
                dd4Var.p0(objQ7);
            }
            C(s83Var, (zb4) objQ7, dd4Var, 0);
            boolean z2 = ((bi5) a07Var3.getValue()) != null;
            bi5 bi5Var = (bi5) a07Var3.getValue();
            String name = bi5Var != null ? bi5Var.getName() : null;
            if (name == null) {
                name = "";
            }
            String str = name;
            Object objQ8 = dd4Var.Q();
            if (objQ8 == obj) {
                a07Var = a07Var3;
                objQ8 = new aq9(a07Var, 9);
                dd4Var.p0(objQ8);
            } else {
                a07Var = a07Var3;
            }
            kb4 kb4Var = (kb4) objQ8;
            boolean zF4 = dd4Var.f(h8aVar);
            Object objQ9 = dd4Var.Q();
            if (zF4 || objQ9 == obj) {
                objQ9 = new k49(a07Var, h8aVar, 7);
                dd4Var.p0(objQ9);
            }
            ex1.f(z2, str, null, kb4Var, (kb4) objQ9, dd4Var, 3072);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new oe9(i2, 9, t27Var);
        }
    }

    public static final void Z(String str, final boolean z2, boolean z3, final ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i2, int i3) {
        int i4;
        final ib4 ib4Var3;
        int i5;
        boolean z4;
        ib4 ib4Var4;
        boolean z5;
        long j2;
        long j3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1841740031);
        int i6 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.g(z2) ? 32 : 16);
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 = i6 | 384;
        } else {
            i4 = i6 | (dd4Var2.g(z3) ? 256 : Token.CASE);
        }
        int i8 = i4 | (dd4Var2.h(ib4Var) ? 16384 : 8192);
        int i9 = i3 & 32;
        if (i9 != 0) {
            i5 = i8 | 196608;
            ib4Var3 = ib4Var2;
        } else {
            ib4Var3 = ib4Var2;
            i5 = i8 | (dd4Var2.h(ib4Var3) ? 131072 : Parser.ARGC_LIMIT);
        }
        int i10 = 1;
        if (dd4Var2.V(i5 & 1, (74899 & i5) != 74898)) {
            final boolean z6 = i7 != 0 ? false : z3;
            fu6 fu6Var = vl1.a;
            if (i9 != 0) {
                Object objQ = dd4Var2.Q();
                Object obj = objQ;
                if (objQ == fu6Var) {
                    dh1 dh1Var = new dh1(i10);
                    dd4Var2.p0(dh1Var);
                    obj = dh1Var;
                }
                ib4Var3 = (ib4) obj;
            }
            lu6 lu6Var = lu6.a;
            ou6 ou6VarW = t96.w(tg9.j(lu6Var, 40.0f, 0.0f, 2), tp8.a);
            uo8 uo8Var = new uo8(4);
            boolean z7 = ((i5 & Token.ASSIGN_MOD) == 32) | ((i5 & 896) == 256) | ((458752 & i5) == 131072) | ((57344 & i5) == 16384);
            Object objQ2 = dd4Var2.Q();
            Object obj2 = objQ2;
            if (z7 || objQ2 == fu6Var) {
                ib4 ib4Var5 = new ib4() { // from class: bo4
                    @Override // defpackage.ib4
                    public final Object invoke() {
                        if (z2 && z6) {
                            ib4Var3.invoke();
                        } else {
                            ib4Var.invoke();
                        }
                        return heb.a;
                    }
                };
                dd4Var2.p0(ib4Var5);
                obj2 = ib4Var5;
            }
            ou6 ou6VarN0 = gjb.n0(t96.P(ou6VarW, z2, uo8Var, (ib4) obj2), 16.0f, 0.0f, 2);
            eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var2, 0);
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
            un9.s(ll1.f, dd4Var2, eq8VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            if (z2) {
                dd4Var2.f0(847212906);
                j2 = ((q96) dd4Var2.j(s96.a)).a.a;
                z5 = false;
            } else {
                z5 = false;
                dd4Var2.f0(847214156);
                j2 = ((q96) dd4Var2.j(s96.a)).a.q;
            }
            dd4Var2.q(z5);
            ur9 ur9Var = s96.a;
            uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.i;
            a84 a84Var = a84.u;
            wf0 wf0Var = bv4.x;
            boolean z8 = z6;
            boolean z9 = z5;
            ib4 ib4Var6 = ib4Var3;
            nha.c(str, new hmb(wf0Var), j2, (g60) null, 0L, (t74) null, a84Var, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, ukaVar, dd4Var, (i5 & 14) | 1572864, 24576, 114616);
            dd4Var2 = dd4Var;
            if (z8) {
                xv5.y(dd4Var2, 494087402, lu6Var, 6.0f, dd4Var2);
                p35 p35VarC = i25.c((m53) f53.s.getValue(), dd4Var2, z9 ? 1 : 0);
                ou6 ou6VarE = tg9.n(lu6Var, 16.0f).e(new hmb(wf0Var));
                if (z2) {
                    dd4Var2.f0(847232138);
                    j3 = ((q96) dd4Var2.j(ur9Var)).a.a;
                } else {
                    dd4Var2.f0(847233388);
                    j3 = ((q96) dd4Var2.j(ur9Var)).a.q;
                }
                dd4Var2.q(z9);
                mx4.a(p35VarC, (String) null, ou6VarE, j3, dd4Var2, 48, 0);
                dd4Var2.q(z9);
            } else {
                dd4Var2.f0(494507359);
                dd4Var2.q(z9);
            }
            dd4Var2.q(true);
            z4 = z8;
            ib4Var4 = ib4Var6;
        } else {
            dd4Var2.Y();
            z4 = z3;
            ib4Var4 = ib4Var3;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new h71(str, z2, z4, ib4Var, ib4Var4, i2, i3);
        }
    }

    public static final void a(ob9 ob9Var, boolean z2, boolean z3, boolean z4, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        float f2;
        zn0 zn0Var;
        float f3;
        dd4 dd4Var2 = dd4Var;
        lp4 lp4Var = jf0.G;
        ob9Var.getClass();
        String str = ob9Var.b;
        int i3 = ob9Var.f;
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var2.h0(2069607715);
        int i4 = i2 | (dd4Var2.f(ob9Var) ? 4 : 2) | (dd4Var2.g(z2) ? 32 : 16) | (dd4Var2.g(z3) ? 256 : Token.CASE) | (dd4Var2.g(z4) ? 2048 : 1024) | (dd4Var2.f(ou6Var) ? 16384 : 8192) | (dd4Var2.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.h(kb4Var2) ? 1048576 : 524288);
        if (dd4Var2.V(i4 & 1, (599187 & i4) != 599186)) {
            int i5 = i4 & 14;
            boolean z5 = (i5 == 4) | ((458752 & i4) == 131072);
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z5 || objQ == obj) {
                objQ = new tc9(kb4Var, ob9Var, 6);
                dd4Var2.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            boolean z6 = ((3670016 & i4) == 1048576) | (i5 == 4);
            Object objQ2 = dd4Var2.Q();
            if (z6 || objQ2 == obj) {
                objQ2 = new tc9(kb4Var2, ob9Var, 7);
                dd4Var2.p0(objQ2);
            }
            ou6 ou6VarT = yn2.t(ou6Var, ib4Var, (ib4) objQ2, dd4Var2, (i4 >> 12) & 14);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarT);
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
            ou6 ou6VarE0 = e0(0.6666667f, tg9.f(lu6Var, 1.0f), false);
            ur9 ur9Var = s96.a;
            ou6 ou6VarW = t96.w(ou6VarE0, ((q96) dd4Var2.j(ur9Var)).c.b);
            xf0 xf0Var = bv4.b;
            ha6 ha6VarD = pn0.d(xf0Var, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarW);
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
            w05.c(ob9Var.a, str, ob9Var.c, ob9Var.d, ra1.d, tg9.c, dd4Var2, 221184);
            zn0 zn0Var2 = zn0.a;
            if (z2) {
                dd4Var2.f0(-659921607);
                zn0Var = zn0Var2;
                f2 = 0.9f;
                nha.c(wn9.L((pv9) mu9.C.getValue(), new Object[]{Integer.valueOf(ob9Var.h)}, dd4Var2), gjb.m0(fe.L(t96.w(zn0Var2.a(lu6Var, bv4.d), ww1.w(7, 8.0f)), lc1.c(0.9f, lc1.b), lp4Var), 6.0f, 2.0f), lc1.e, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.o, dd4Var, 384, 0, 131064);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                f2 = 0.9f;
                zn0Var = zn0Var2;
                dd4Var2.f0(-659444517);
                dd4Var2.q(false);
            }
            if (!z3 || i3 <= 0) {
                f3 = 2.0f;
                dd4Var2.f0(-658895941);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-659349967);
                String strValueOf = String.valueOf(i3);
                long j2 = lc1.e;
                uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.o;
                ou6 ou6VarM0 = gjb.m0(fe.L(t96.w(zn0Var.a(lu6Var, bv4.v), ww1.w(14, 0.0f)), lc1.c(f2, lc1.b), lp4Var), 6.0f, 2.0f);
                f3 = 2.0f;
                nha.c(strValueOf, ou6VarM0, j2, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, 384, 0, 131064);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
            if (!z4 || ob9Var.g <= 0) {
                dd4Var2.f0(-658587429);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-658824796);
                dd4 dd4Var3 = dd4Var2;
                yb0.a(3072, 6, 0L, 0L, jf0.G(179236967, new rt6(ob9Var, 8), dd4Var2), dd4Var3, gjb.l0(zn0Var.a(lu6Var, xf0Var), 4.0f));
                dd4Var2 = dd4Var3;
                dd4Var2.q(false);
            }
            xv5.z(dd4Var2, true, lu6Var, f3, dd4Var2);
            nha.c(str, tg9.f(lu6Var, 1.0f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 2, false, 2, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.k, dd4Var, 48, 24960, 109564);
            nha.c(ob9Var.j, tg9.f(lu6Var, 1.0f), lc1.c(0.6f, ((lc1) dd4Var.j(oq1.a)).a), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.l, dd4Var, 48, 24960, 109560);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yc9(ob9Var, z2, z3, z4, ou6Var, kb4Var, kb4Var2, i2, 1);
        }
    }

    public static final void a0(String str, List list, pj7 pj7Var, ou6 ou6Var, yb4 yb4Var, dd4 dd4Var, int i2, int i3) {
        pj7 pj7Var2;
        int i4;
        pj7 pj7Var3;
        dd4 dd4Var2 = dd4Var;
        list.getClass();
        yb4Var.getClass();
        dd4Var2.h0(-659204981);
        int i5 = i2 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.h(list) ? 32 : 16);
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 = i5 | 384;
            pj7Var2 = pj7Var;
        } else {
            pj7Var2 = pj7Var;
            i4 = i5 | (dd4Var2.f(pj7Var2) ? 256 : Token.CASE);
        }
        int i7 = i4 | (dd4Var2.f(ou6Var) ? 2048 : 1024) | (dd4Var2.h(yb4Var) ? 16384 : 8192);
        int i8 = 1;
        if (dd4Var2.V(i7 & 1, (i7 & 9363) != 9362)) {
            pj7 rj7Var = i6 != 0 ? new rj7(0.0f, 0.0f, 0.0f, 0.0f) : pj7Var2;
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = lc5.Z(dd4Var2);
                dd4Var2.p0(objQ);
            }
            vx1 vx1Var = (vx1) objQ;
            int i9 = i7 & 14;
            boolean z2 = i9 == 4;
            Object objQ2 = dd4Var2.Q();
            if (z2 || objQ2 == obj) {
                Iterator it = list.iterator();
                int i10 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i10 = -1;
                        break;
                    } else if (lc5.Q(((koa) it.next()).a, str)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                Integer numValueOf = Integer.valueOf(i10);
                if (i10 < 0) {
                    numValueOf = null;
                }
                objQ2 = Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0);
                dd4Var2.p0(objQ2);
            }
            int iIntValue = ((Number) objQ2).intValue();
            Object objQ3 = dd4Var2.Q();
            if (objQ3 == obj) {
                objQ3 = Integer.valueOf((iIntValue <= list.size() - 3 && iIntValue > 3) ? iIntValue - 3 : iIntValue);
                dd4Var2.p0(objQ3);
            }
            st5 st5VarA = ut5.a(((Number) objQ3).intValue(), dd4Var2, 6, 2);
            Object objQ4 = dd4Var2.Q();
            if (objQ4 == obj) {
                objQ4 = dk9.n(new ct5(st5VarA, iIntValue, i8));
                dd4Var2.p0(objQ4);
            }
            br9 br9Var = (br9) objQ4;
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
            px3 px3Var = tg9.c;
            szb szbVarW = yib.w(rj7Var, gjb.q(0.0f, 0.0f, 4.0f, 44.0f, 3));
            szb szbVarW2 = yib.w(rj7Var, gjb.q(0.0f, 0.0f, 0.0f, 44.0f, 7));
            boolean zH = (i9 == 4) | dd4Var2.h(list) | ((i7 & 57344) == 16384);
            Object objQ5 = dd4Var2.Q();
            if (zH || objQ5 == obj) {
                objQ5 = new fb3(list, str, yb4Var);
                dd4Var2.p0(objQ5);
            }
            pj7 pj7Var4 = rj7Var;
            gx1.h(px3Var, st5VarA, szbVarW2, null, null, null, false, szbVarW, 0L, 0L, 0.0f, (kb4) objQ5, dd4Var, 6, 0, 3832);
            dd4Var2 = dd4Var;
            kf0.d(((Number) br9Var.getValue()).intValue() != 0, gjb.p0(gjb.k0(zn0.a.a(lu6.a, bv4.u), pj7Var4), 0.0f, 0.0f, 0.0f, 8.0f, 7), wd3.f((p9b) null, 0.0f, 0L, 7), wd3.h(0.0f, 0L, 7), (String) null, jf0.G(-1576625043, new mp6(vx1Var, st5VarA, iIntValue, br9Var), dd4Var2), dd4Var2, 200064, 16);
            dd4Var2.q(true);
            pj7Var3 = pj7Var4;
        } else {
            dd4Var2.Y();
            pj7Var3 = pj7Var2;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new l41(str, list, pj7Var3, ou6Var, yb4Var, i2, i3);
        }
    }

    public static final void b(ob9 ob9Var, boolean z2, boolean z3, boolean z4, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        int i3;
        zn0 zn0Var;
        float f2;
        float f3;
        dd4 dd4Var2 = dd4Var;
        lp4 lp4Var = jf0.G;
        ob9Var.getClass();
        String str = ob9Var.b;
        int i4 = ob9Var.f;
        int i5 = ob9Var.g;
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var2.h0(-886596158);
        int i6 = i2 | (dd4Var2.f(ob9Var) ? 4 : 2) | (dd4Var2.g(z2) ? 32 : 16) | (dd4Var2.g(z3) ? 256 : Token.CASE) | (dd4Var2.g(z4) ? 2048 : 1024) | (dd4Var2.f(ou6Var) ? 16384 : 8192) | (dd4Var2.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.h(kb4Var2) ? 1048576 : 524288);
        if (dd4Var2.V(i6 & 1, (599187 & i6) != 599186)) {
            int i7 = i6 & 14;
            boolean z5 = ((458752 & i6) == 131072) | (i7 == 4);
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z5 || objQ == obj) {
                objQ = new tc9(kb4Var, ob9Var, 8);
                dd4Var2.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            boolean z6 = ((3670016 & i6) == 1048576) | (i7 == 4);
            Object objQ2 = dd4Var2.Q();
            if (z6 || objQ2 == obj) {
                objQ2 = new tc9(kb4Var2, ob9Var, 9);
                dd4Var2.p0(objQ2);
            }
            ou6 ou6VarT = yn2.t(ou6Var, ib4Var, (ib4) objQ2, dd4Var2, (i6 >> 12) & 14);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarT);
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
            ou6 ou6VarE0 = e0(0.6666667f, tg9.f(lu6Var, 1.0f), false);
            ur9 ur9Var = s96.a;
            ou6 ou6VarW = t96.w(ou6VarE0, ((q96) dd4Var2.j(ur9Var)).c.b);
            xf0 xf0Var = bv4.b;
            ha6 ha6VarD = pn0.d(xf0Var, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarW);
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
            w05.c(ob9Var.a, str, ob9Var.c, ob9Var.d, ra1.d, tg9.c, dd4Var2, 221184);
            zn0 zn0Var2 = zn0.a;
            if (z2) {
                dd4Var2.f0(-625097670);
                zn0Var = zn0Var2;
                nha.c(wn9.L((pv9) mu9.C.getValue(), new Object[]{Integer.valueOf(ob9Var.h)}, dd4Var2), gjb.m0(fe.L(t96.w(zn0Var2.a(lu6Var, bv4.d), ww1.w(7, 8.0f)), lc1.c(0.9f, lc1.b), lp4Var), 6.0f, 2.0f), lc1.e, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.o, dd4Var, 384, 0, 131064);
                dd4Var2 = dd4Var;
                i3 = 0;
                dd4Var2.q(false);
            } else {
                i3 = 0;
                zn0Var = zn0Var2;
                dd4Var2.f0(-624620580);
                dd4Var2.q(false);
            }
            ou6 ou6VarW2 = t96.w(zn0Var.a(lu6Var, xf0Var), ww1.w(11, 0.0f));
            eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var2, i3);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarW2);
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
            if (!z4 || i5 <= 0) {
                f2 = 0.0f;
                f3 = 2.0f;
                dd4Var2.f0(-1018169536);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-1018565065);
                f2 = 0.0f;
                f3 = 2.0f;
                nha.c(String.valueOf(i5), gjb.m0(fe.L(lu6Var, lc1.c(0.9f, lc1.f), lp4Var), 4.0f, 2.0f), lc1.e, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.o, dd4Var, 384, 0, 131064);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
            if (!z3 || i4 <= 0) {
                dd4Var2.f0(-1017675520);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-1018070088);
                nha.c(String.valueOf(i4), gjb.m0(fe.L(lu6Var, lc1.c(0.9f, lc1.b), lp4Var), 6.0f, f3), lc1.e, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.o, dd4Var, 384, 0, 131064);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
            Object objQ3 = dd4Var2.Q();
            if (objQ3 == obj) {
                Float fValueOf = Float.valueOf(f2);
                long j2 = lc1.b;
                objQ3 = js8.y(new xl7[]{new xl7(fValueOf, new lc1(lc1.c(f2, j2))), new xl7(Float.valueOf(0.4f), new lc1(lc1.c(0.6f, j2))), new xl7(Float.valueOf(1.0f), new lc1(lc1.c(1.0f, j2)))});
                dd4Var2.p0(objQ3);
            }
            nha.c(str, gjb.l0(fe.K(zn0Var.a(tg9.f(lu6Var, 1.0f), bv4.u), (sq0) objQ3), 4.0f), lc1.e, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 2, false, 2, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.l, dd4Var, 384, 24960, 109560);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yc9(ob9Var, z2, z3, z4, ou6Var, kb4Var, kb4Var2, i2, 2);
        }
    }

    public static final void b0(l4b l4bVar, boolean z2, pj7 pj7Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, ib4 ib4Var, kb4 kb4Var3, ib4 ib4Var2, dd4 dd4Var, int i2) {
        int i3;
        boolean z3;
        int i4;
        dd4 dd4Var2 = dd4Var;
        lp4 lp4Var = jf0.G;
        vf0 vf0Var = bv4.z;
        dd4Var2.h0(1761650853);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.f(l4bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.g(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var2.f(pj7Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var2.f(ou6Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var2.h(kb4Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var2.h(kb4Var2) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var2.h(ib4Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= dd4Var2.h(kb4Var3) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= dd4Var2.h(ib4Var2) ? 67108864 : 33554432;
        }
        if (dd4Var2.V(i3 & 1, (i3 & 38347923) != 38347922)) {
            ou6 ou6VarQ = kc5.Q(h67.f0(ou6Var.e(tg9.c), null, 3), kc5.J(dd4Var2), 14);
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var2, 0);
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
            int i5 = i3;
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var2, ou6VarL0);
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var2, gjb.k0(lu6Var, pj7Var));
            ou6 ou6VarW = t96.w(gjb.n0(tg9.f(lu6Var, 1.0f), 16.0f, 0.0f, 2), s00.p(dd4Var2).d);
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
            boolean z4 = l4bVar.a;
            float f2 = 1.0f;
            e11.x(null, wn9.K((pv9) ru9.G0.getValue(), dd4Var2), wn9.K((pv9) ru9.H0.getValue(), dd4Var2), tw2.g(dd4Var2, 1.0f, t96.w(lu6Var, s00.p(dd4Var2).a), lp4Var, 16.0f), false, z4, kb4Var, dd4Var2, (i5 << 6) & 3670016, 17);
            dd4Var2 = dd4Var2;
            if (z4) {
                ky0.z(dd4Var2, -1784269791, lu6Var, 4.0f, dd4Var2);
                e11.t(wn9.K((pv9) ru9.J0.getValue(), dd4Var2), wm9.r((hv9) rv.s.getValue(), dd4Var2), l4bVar.b, tw2.g(dd4Var2, 1.0f, t96.w(lu6Var, s00.p(dd4Var2).a), lp4Var, 16.0f), kb4Var2, dd4Var2, (i5 >> 3) & 57344);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-1783616311);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
            if (z4) {
                ky0.z(dd4Var2, 482282638, lu6Var, 12.0f, dd4Var2);
                nha.c(wn9.K((pv9) ru9.I0.getValue(), dd4Var2), gjb.l0(lu6Var, 16.0f), s00.o(dd4Var2).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).h, dd4Var, 48, 0, 131064);
                dd4Var2 = dd4Var;
                ou6 ou6VarW2 = t96.w(gjb.n0(tg9.f(lu6Var, 1.0f), 16.0f, 0.0f, 2), s00.p(dd4Var2).d);
                ie1 ie1VarA3 = ge1.a(jvVar, vf0Var, dd4Var2, 0);
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
                e11.v(null, wn9.K((pv9) ru9.K0.getValue(), dd4Var2), wn9.K((pv9) ru9.L0.getValue(), dd4Var2), tw2.g(dd4Var2, 1.0f, t96.w(lu6Var, s00.p(dd4Var2).a), lp4Var, 16.0f), ib4Var, dd4Var2, (i5 >> 6) & 57344, 1);
                dd4Var2.f0(791628423);
                List list = l4bVar.c;
                int size = list.size();
                int i6 = 0;
                while (i6 < size) {
                    p5b p5bVar = (p5b) list.get(i6);
                    un9.a(dd4Var2, tg9.h(lu6Var, 4.0f));
                    ur9 ur9Var = s96.a;
                    int i7 = i6;
                    ou6 ou6VarL = fe.L(t96.w(lu6Var, ((q96) dd4Var2.j(ur9Var)).c.a), dd1.g(((q96) dd4Var2.j(ur9Var)).a, f2), lp4Var);
                    boolean zH = ((i5 & 29360128) == 8388608) | dd4Var2.h(p5bVar);
                    Object objQ = dd4Var2.Q();
                    if (zH || objQ == vl1.a) {
                        objQ = new nga(8, kb4Var3, p5bVar);
                        dd4Var2.p0(objQ);
                    }
                    ou6 ou6VarL04 = gjb.l0(fw.J(null, (ib4) objQ, ou6VarL, false, 15), 16.0f);
                    eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
                    int iHashCode4 = Long.hashCode(dd4Var2.T);
                    lr7 lr7VarL4 = dd4Var2.l();
                    ou6 ou6VarL05 = s32.L0(dd4Var2, ou6VarL04);
                    ml1.k.getClass();
                    um1 um1Var2 = ll1.b;
                    dd4Var2.j0();
                    if (dd4Var2.S) {
                        dd4Var2.k(um1Var2);
                    } else {
                        dd4Var2.s0();
                    }
                    jm jmVar5 = ll1.f;
                    un9.s(jmVar5, dd4Var2, eq8VarA);
                    jm jmVar6 = ll1.e;
                    un9.s(jmVar6, dd4Var2, lr7VarL4);
                    Integer numValueOf2 = Integer.valueOf(iHashCode4);
                    jm jmVar7 = ll1.g;
                    un9.s(jmVar7, dd4Var2, numValueOf2);
                    kd kdVar2 = ll1.h;
                    un9.r(dd4Var2, kdVar2);
                    jm jmVar8 = ll1.d;
                    un9.s(jmVar8, dd4Var2, ou6VarL05);
                    List list2 = list;
                    String str = p5bVar.a;
                    String str2 = p5bVar.c;
                    int i8 = size;
                    lp4 lp4Var2 = lp4Var;
                    dd4 dd4Var3 = dd4Var2;
                    w05.a(new po3(0L, str, ""), null, false, null, null, t96.w(tg9.n(lu6Var, 24.0f), tp8.a), null, dd4Var3, 100663296, 190);
                    bp5 bp5VarF = j39.f(lu6Var, 8.0f, dd4Var3, 1.0f, true);
                    ie1 ie1VarA4 = ge1.a(jvVar, vf0Var, dd4Var3, 0);
                    int iHashCode5 = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL5 = dd4Var3.l();
                    ou6 ou6VarL06 = s32.L0(dd4Var3, bp5VarF);
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var2);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(jmVar5, dd4Var3, ie1VarA4);
                    un9.s(jmVar6, dd4Var3, lr7VarL5);
                    ky0.v(iHashCode5, dd4Var3, jmVar7, dd4Var3, kdVar2);
                    un9.s(jmVar8, dd4Var3, ou6VarL06);
                    f2 = 1.0f;
                    nha.c(p5bVar.b, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var3.j(ur9Var)).b.h, dd4Var, 0, 24960, 110590);
                    dd4Var2 = dd4Var;
                    if (str2.length() > 0) {
                        dd4Var2.f0(-2075245203);
                        nha.c(str2, (ou6) null, lc1.c(0.5f, ((lc1) dd4Var2.j(oq1.a)).a), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 2, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.l, dd4Var, 0, 24576, 114682);
                        dd4Var2 = dd4Var;
                        i4 = 0;
                        dd4Var2.q(false);
                    } else {
                        i4 = 0;
                        dd4Var2.f0(-2074906001);
                        dd4Var2.q(false);
                    }
                    ky0.A(dd4Var2, true, lu6Var, 8.0f, dd4Var2);
                    mx4.a(i25.c((m53) f53.t.getValue(), dd4Var2, i4), (String) null, tg9.n(lu6Var, 24.0f), 0L, dd4Var2, 432, 8);
                    dd4Var2.q(true);
                    i6 = i7 + 1;
                    list = list2;
                    size = i8;
                    lp4Var = lp4Var2;
                }
                un9.a(dd4Var2, xv5.g(dd4Var2, false, true, lu6Var, 12.0f));
                if (z2) {
                    dd4Var2.f0(485487790);
                    kc5.n(i25.c((m53) f53.i0.getValue(), dd4Var2, 0), wn9.K((pv9) ev9.f.getValue(), dd4Var2), false, null, gjb.m0(new xo4(bv4.B), 24.0f, 12.0f), null, null, null, ib4Var2, dd4Var, i5 & 234881024, 236);
                    dd4Var2 = dd4Var;
                    z3 = false;
                    dd4Var2.q(false);
                } else {
                    z3 = false;
                    dd4Var2.f0(485875507);
                    dd4Var2.q(false);
                }
                dd4Var2.q(z3);
            } else {
                dd4Var2.f0(485885427);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ao8(l4bVar, z2, pj7Var, ou6Var, kb4Var, kb4Var2, ib4Var, kb4Var3, ib4Var2, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(ob9 ob9Var, boolean z2, boolean z3, boolean z4, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        ob9 ob9Var2;
        zn0 zn0Var;
        int i3;
        wf0 wf0Var;
        iv ivVar;
        jm jmVar;
        yb4 yb4Var;
        kd kdVar;
        boolean z5;
        yb4 yb4Var2;
        int i4;
        dd4 dd4Var2 = dd4Var;
        ob9Var.getClass();
        String str = ob9Var.b;
        int i5 = ob9Var.f;
        int i6 = ob9Var.g;
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var2.h0(-1039861637);
        int i7 = i2 | (dd4Var2.f(ob9Var) ? 4 : 2) | (dd4Var2.g(z2) ? 32 : 16) | (dd4Var2.g(z3) ? 256 : Token.CASE) | (dd4Var2.g(z4) ? 2048 : 1024) | (dd4Var2.f(ou6Var) ? 16384 : 8192) | (dd4Var2.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.h(kb4Var2) ? 1048576 : 524288);
        if (dd4Var2.V(i7 & 1, (599187 & i7) != 599186)) {
            ou6 ou6VarW = t96.w(ou6Var, s00.p(dd4Var2).d);
            long jG = dd1.g(s00.o(dd4Var2), 1.0f);
            lp4 lp4Var = jf0.G;
            ou6 ou6VarL = fe.L(ou6VarW, jG, lp4Var);
            int i8 = i7 & 14;
            boolean z6 = (i8 == 4) | ((458752 & i7) == 131072);
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z6 || objQ == obj) {
                objQ = new tc9(kb4Var, ob9Var, 2);
                dd4Var2.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            boolean z7 = ((3670016 & i7) == 1048576) | (i8 == 4);
            Object objQ2 = dd4Var2.Q();
            if (z7 || objQ2 == obj) {
                objQ2 = new tc9(kb4Var2, ob9Var, 3);
                dd4Var2.p0(objQ2);
            }
            ou6 ou6VarM0 = gjb.m0(yn2.t(ou6VarL, ib4Var, (ib4) objQ2, dd4Var2, 0), 12.0f, 12.0f);
            wf0 wf0Var2 = bv4.x;
            iv ivVar2 = pv.a;
            eq8 eq8VarA = dq8.a(ivVar2, wf0Var2, dd4Var2, 48);
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
            jm jmVar2 = ll1.f;
            un9.s(jmVar2, dd4Var2, eq8VarA);
            yb4 yb4Var3 = ll1.e;
            un9.s(yb4Var3, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar2 = ll1.h;
            un9.r(dd4Var2, kdVar2);
            yb4 yb4Var4 = ll1.d;
            un9.s(yb4Var4, dd4Var2, ou6VarL0);
            lu6 lu6Var = lu6.a;
            ou6 ou6VarE0 = e0(0.6666667f, t96.w(tg9.r(lu6Var, 56.0f), s00.p(dd4Var2).b), false);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarE0);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar2, dd4Var2, ha6VarD);
            un9.s(yb4Var3, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar2);
            un9.s(yb4Var4, dd4Var2, ou6VarL02);
            w05.c(ob9Var.a, str, ob9Var.c, ob9Var.d, ra1.d, tg9.c, dd4Var2, 221184);
            zn0 zn0Var2 = zn0.a;
            if (z2) {
                dd4Var2.f0(-1336821302);
                zn0Var = zn0Var2;
                nha.c(wn9.L((pv9) mu9.C.getValue(), new Object[]{Integer.valueOf(ob9Var.h)}, dd4Var2), gjb.m0(fe.L(t96.w(zn0Var2.a(lu6Var, bv4.d), ww1.w(7, 4.0f)), lc1.c(0.9f, lc1.b), lp4Var), 6.0f, 1.0f), lc1.e, (g60) null, wn9.x(9), (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).o, dd4Var, 24960, 0, 131048);
                dd4Var2 = dd4Var;
                i3 = 0;
                dd4Var2.q(false);
            } else {
                zn0Var = zn0Var2;
                i3 = 0;
                dd4Var2.f0(-1336308655);
                dd4Var2.q(false);
            }
            ou6 ou6VarW2 = t96.w(zn0Var.a(lu6Var, bv4.t), ww1.w(13, 0.0f));
            wf0 wf0Var3 = bv4.w;
            eq8 eq8VarA2 = dq8.a(ivVar2, wf0Var3, dd4Var2, i3);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarW2);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar2, dd4Var2, eq8VarA2);
            un9.s(yb4Var3, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar2);
            un9.s(yb4Var4, dd4Var2, ou6VarL03);
            if (!z4 || i6 <= 0) {
                boolean z8 = i3;
                wf0Var = wf0Var3;
                ivVar = ivVar2;
                jmVar = jmVar3;
                yb4Var = yb4Var4;
                kdVar = kdVar2;
                dd4Var2.f0(1070228021);
                dd4Var2.q(z8);
                z5 = z8;
            } else {
                dd4Var2.f0(1069793091);
                yb4Var = yb4Var4;
                wf0Var = wf0Var3;
                kdVar = kdVar2;
                z5 = false;
                ivVar = ivVar2;
                jmVar = jmVar3;
                nha.c(String.valueOf(i6), gjb.m0(fe.L(lu6Var, lc1.c(0.9f, lc1.f), lp4Var), 4.0f, 1.0f), lc1.e, (g60) null, wn9.x(9), (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).o, dd4Var, 24960, 0, 131048);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
            if (!z3 || i5 <= 0) {
                yb4Var2 = yb4Var3;
                dd4Var2.f0(1070762709);
                dd4Var2.q(z5);
            } else {
                dd4Var2.f0(1070328740);
                yb4Var2 = yb4Var3;
                nha.c(String.valueOf(i5), gjb.m0(fe.L(lu6Var, lc1.c(0.9f, lc1.b), lp4Var), 4.0f, 1.0f), lc1.e, (g60) null, wn9.x(9), (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).o, dd4Var, 24960, 0, 131048);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
            dd4Var2.q(true);
            un9.a(dd4Var2, tg9.r(lu6Var, 14.0f));
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            bp5 bp5Var = new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode4 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL4 = dd4Var2.l();
            ou6 ou6VarL04 = s32.L0(dd4Var2, bp5Var);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar2, dd4Var2, ie1VarA);
            yb4 yb4Var5 = yb4Var2;
            un9.s(yb4Var5, dd4Var2, lr7VarL4);
            ky0.v(iHashCode4, dd4Var2, jmVar, dd4Var2, kdVar);
            un9.s(yb4Var, dd4Var2, ou6VarL04);
            yb4 yb4Var6 = yb4Var;
            nha.c(str, tg9.f(lu6Var, 1.0f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 2, 0, (kb4) null, s00.q(dd4Var2).i, dd4Var, 48, 24960, 109564);
            dd4 dd4Var3 = dd4Var;
            un9.a(dd4Var3, tg9.h(lu6Var, 6.0f));
            if (ob9Var.j.length() > 0) {
                dd4Var3.f0(532172865);
                ob9Var2 = ob9Var;
                nha.c(ob9Var.j, tg9.f(lu6Var, 1.0f), lc1.c(0.5f, s00.o(dd4Var3).o), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 1, 0, (kb4) null, s00.q(dd4Var3).l, dd4Var, 48, 24960, 109560);
                dd4Var3 = dd4Var;
                i4 = 0;
                dd4Var3.q(false);
            } else {
                ob9Var2 = ob9Var;
                i4 = 0;
                dd4Var3.f0(532586529);
                dd4Var3.q(false);
            }
            ou6 ou6VarH = xv5.h(lu6Var, 4.0f, dd4Var3, lu6Var, 1.0f);
            eq8 eq8VarA3 = dq8.a(ivVar, wf0Var, dd4Var3, i4);
            int iHashCode5 = Long.hashCode(dd4Var3.T);
            lr7 lr7VarL5 = dd4Var3.l();
            ou6 ou6VarL05 = s32.L0(dd4Var3, ou6VarH);
            dd4Var3.j0();
            if (dd4Var3.S) {
                dd4Var3.k(um1Var);
            } else {
                dd4Var3.s0();
            }
            un9.s(jmVar2, dd4Var3, eq8VarA3);
            un9.s(yb4Var5, dd4Var3, lr7VarL5);
            ky0.v(iHashCode5, dd4Var3, jmVar, dd4Var3, kdVar);
            un9.s(yb4Var6, dd4Var3, ou6VarL05);
            String str2 = ob9Var2.d;
            uka ukaVar = s00.q(dd4Var3).l;
            long jC = lc1.c(0.5f, s00.o(dd4Var3).o);
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            nha.c(str2, new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), jC, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 1, 0, (kb4) null, ukaVar, dd4Var, 0, 24960, 109560);
            ri9.f(ob9Var2.i, (ou6) null, false, lc1.c(0.5f, s00.o(dd4Var).o), 0L, 0L, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).l, dd4Var, 0, 0, 131062);
            dd4Var2 = dd4Var;
            tw2.x(dd4Var2, true, true, true);
        } else {
            ob9Var2 = ob9Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yc9(ob9Var2, z2, z3, z4, ou6Var, kb4Var, kb4Var2, i2, 0);
        }
    }

    public static final void c0(t27 t27Var, dd4 dd4Var, int i2) {
        t27 t27Var2;
        t27Var.getClass();
        dd4Var.h0(-1800641728);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            t4b t4bVar = (t4b) ((qtb) qx1.N(ug8.a(t4b.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
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
            t27Var2 = t27Var;
            gx1.p(wn9.K((pv9) zu9.O.getValue(), dd4Var), tg9.c, false, jf0.G(84703932, new oe9(t27Var, 24), dd4Var), null, jf0.G(1030347530, new w6(t4bVar, t27Var, bx1.B(t4bVar.d, dd4Var), bx1.B(mibVar.f, dd4Var), 3), dd4Var), dd4Var, 199728, 20);
        } else {
            t27Var2 = t27Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new oe9(i2, 25, t27Var2);
        }
    }

    public static final void d(ob9 ob9Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        ob9Var.getClass();
        String str = ob9Var.j;
        int i3 = ob9Var.h;
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var2.h0(-188015442);
        int i4 = i2 | (dd4Var2.f(ob9Var) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(kb4Var) ? 256 : Token.CASE) | (dd4Var2.h(kb4Var2) ? 2048 : 1024);
        if (dd4Var2.V(i4 & 1, (i4 & 1171) != 1170)) {
            ur9 ur9Var = s96.a;
            ou6 ou6VarL = fe.L(t96.w(ou6Var, ((q96) dd4Var2.j(ur9Var)).c.d), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 1.0f), jf0.G);
            int i5 = i4 & 14;
            boolean z2 = ((i4 & 896) == 256) | (i5 == 4);
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = new tc9(kb4Var, ob9Var, 4);
                dd4Var2.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            boolean z3 = ((i4 & 7168) == 2048) | (i5 == 4);
            Object objQ2 = dd4Var2.Q();
            if (z3 || objQ2 == obj) {
                objQ2 = new tc9(kb4Var2, ob9Var, 5);
                dd4Var2.p0(objQ2);
            }
            ou6 ou6VarM0 = gjb.m0(yn2.t(ou6VarL, ib4Var, (ib4) objQ2, dd4Var2, 0), 12.0f, 12.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
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
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            String str2 = ob9Var.b;
            uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.i;
            lu6 lu6Var = lu6.a;
            nha.c(str2, tg9.f(lu6Var, 1.0f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 2, false, 2, 0, (kb4) null, ukaVar, dd4Var2, 48, 24960, 109564);
            un9.a(dd4Var2, tg9.h(lu6Var, 6.0f));
            boolean zD = dd4Var2.d(i3) | dd4Var2.f(str) | (i5 == 4);
            Object objQ3 = dd4Var2.Q();
            if (zD || objQ3 == obj) {
                zo zoVar = new zo();
                int iK = zoVar.k(new vn9(0L, 0L, a84.w, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, (jda) null, (o89) null, 65531));
                try {
                    zoVar.f(i3 + "% ");
                    zoVar.h(iK);
                    zoVar.f(str);
                    objQ3 = zoVar.l();
                    dd4Var2.p0(objQ3);
                } catch (Throwable th) {
                    zoVar.h(iK);
                    throw th;
                }
            }
            nha.d((bp) objQ3, tg9.f(lu6Var, 1.0f), lc1.c(0.5f, ((lc1) dd4Var2.j(oq1.a)).a), 0L, 0L, new vaa(5), 0L, 2, false, 2, 0, (Map) null, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.l, dd4Var2, 48, 24960, 240632);
            dd4Var2 = dd4Var2;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yn6((Object) ob9Var, ou6Var, kb4Var, kb4Var2, i2, 3);
        }
    }

    public static final void d0(List list, st5 st5Var, ou6 ou6Var, yb4 yb4Var, yb4 yb4Var2, zb4 zb4Var, ib4 ib4Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        int i3;
        a07 a07Var;
        Object mt4Var;
        fu6 fu6Var;
        int i4;
        dd4Var.h0(-157989557);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.h(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(st5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(yb4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(yb4Var2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(zb4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 67108864 : 33554432;
        }
        int i5 = i3;
        if (dd4Var.V(i5 & 1, (i5 & 38347923) != 38347922)) {
            Object objQ = dd4Var.Q();
            fu6 fu6Var2 = vl1.a;
            if (objQ == fu6Var2) {
                objQ = dk9.x(dk7.a);
                dd4Var.p0(objQ);
            }
            a07 a07Var2 = (a07) objQ;
            int i6 = i5 & Token.ASSIGN_MOD;
            boolean zH = (i6 == 32) | dd4Var.h(list);
            Object objQ2 = dd4Var.Q();
            if (zH || objQ2 == fu6Var2) {
                a07Var = a07Var2;
                fu6Var = fu6Var2;
                i4 = i6;
                mt4Var = new mt4(st5Var, list, a07Var, null, 19);
                dd4Var.p0(mt4Var);
            } else {
                fu6Var = fu6Var2;
                a07Var = a07Var2;
                mt4Var = objQ2;
                i4 = i6;
            }
            lc5.v(st5Var, list, (yb4) mt4Var, dd4Var);
            boolean z2 = i4 == 32;
            Object objQ3 = dd4Var.Q();
            if (z2 || objQ3 == fu6Var) {
                objQ3 = dk9.n(new e51(st5Var, 12));
                dd4Var.p0(objQ3);
            }
            e(ou6Var, null, jf0.G(-429349963, new st1(st5Var, list, (br9) objQ3, yb4Var, yb4Var2, zb4Var, ib4Var, kb4Var, kb4Var2, a07Var), dd4Var), dd4Var, ((i5 >> 6) & 14) | 3072, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fl0(list, st5Var, ou6Var, yb4Var, yb4Var2, zb4Var, ib4Var, kb4Var, kb4Var2, i2);
        }
    }

    public static final void e(ou6 ou6Var, f9 f9Var, rj1 rj1Var, dd4 dd4Var, int i2, int i3) {
        int i4;
        dd4Var.h0(380139498);
        if ((i2 & 6) == 0) {
            i4 = (dd4Var.f(ou6Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= dd4Var.f(f9Var) ? 32 : 16;
        }
        int i6 = i4 | 384;
        if ((i2 & 3072) == 0) {
            i6 |= dd4Var.h(rj1Var) ? 2048 : 1024;
        }
        if (dd4Var.V(i6 & 1, (i6 & 1171) != 1170)) {
            if (i5 != 0) {
                f9Var = bv4.b;
            }
            ha6 ha6VarD = pn0.d(f9Var, false);
            boolean zF = dd4Var.f(ha6VarD) | ((i6 & 7168) == 2048);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                objQ = new il6(7, ha6VarD, rj1Var);
                dd4Var.p0(objQ);
            }
            yx9.a(ou6Var, (yb4) objQ, dd4Var, i6 & 14, 0);
        } else {
            dd4Var.Y();
        }
        f9 f9Var2 = f9Var;
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ao0(ou6Var, f9Var2, rj1Var, i2, i3, 0);
        }
    }

    public static final ou6 e0(float f2, ou6 ou6Var, boolean z2) {
        return ou6Var.e(new iw(f2, z2));
    }

    public static final void f(boolean z2, koa koaVar, ou6 ou6Var, dd4 dd4Var, int i2) {
        long j2;
        kd kdVar;
        jm jmVar;
        lu6 lu6Var;
        yb4 yb4Var;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(1906047792);
        int i3 = i2 | (dd4Var2.g(z2) ? 4 : 2) | (dd4Var2.f(koaVar) ? 32 : 16) | (dd4Var2.f(ou6Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
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
            jm jmVar2 = ll1.f;
            un9.s(jmVar2, dd4Var2, eq8VarA);
            jm jmVar3 = ll1.e;
            un9.s(jmVar3, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar4 = ll1.g;
            un9.s(jmVar4, dd4Var2, numValueOf);
            kd kdVar2 = ll1.h;
            un9.r(dd4Var2, kdVar2);
            yb4 yb4Var2 = ll1.d;
            un9.s(yb4Var2, dd4Var2, ou6VarL0);
            if (z2) {
                dd4Var2.f0(1246559029);
                j2 = ((q96) dd4Var2.j(s96.a)).a.a;
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(1246621587);
                j2 = ((q96) dd4Var2.j(s96.a)).a.q;
                dd4Var2.q(false);
            }
            long j3 = j2;
            lu6 lu6Var2 = lu6.a;
            if (z2) {
                dd4Var2.f0(1246706217);
                jmVar = jmVar4;
                kdVar = kdVar2;
                lu6Var = lu6Var2;
                yb4Var = yb4Var2;
                ym9.b(0L, 2.0f, 0, tg9.h(lu6Var2, 14.0f), dd4Var2, 3120, 5);
                dd4Var2.q(false);
            } else {
                kdVar = kdVar2;
                jmVar = jmVar4;
                lu6Var = lu6Var2;
                yb4Var = yb4Var2;
                dd4Var2.f0(1246848259);
                mx4.a(i25.c((m53) f53.K.getValue(), dd4Var2, 0), (String) null, tg9.n(lu6Var, 12.0f), ((q96) dd4Var2.j(s96.a)).a.q, dd4Var2, 432, 0);
                dd4Var2.q(false);
            }
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
            un9.s(jmVar2, dd4Var2, ie1VarA);
            un9.s(jmVar3, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar, dd4Var2, kdVar);
            un9.s(yb4Var, dd4Var2, ou6VarL02);
            nha.c(koaVar.b, tg9.f(lu6Var, 1.0f), j3, (g60) null, 0L, new t74(z2 ? 1 : 0), z2 ? a84.w : a84.t, (c64) null, 0L, (jda) null, new vaa(5), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.j, dd4Var, 48, 0, 129944);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new i41(z2, koaVar, ou6Var, i2, 5);
        }
    }

    public static final float f0(List list) {
        float[] fArr = new float[4];
        int size = list.size();
        float fMin = 1.0f;
        for (int i2 = 0; i2 < size; i2++) {
            wp8 wp8Var = (wp8) list.get(i2);
            char c2 = 2;
            wp8.a(wp8Var, fArr, 2);
            zy5 zy5Var = wp8Var.c;
            long j2 = wp8Var.b;
            int iA = zy5Var.a();
            float fMax = 0.0f;
            int i3 = 0;
            while (i3 < iA) {
                z12 z12Var = (z12) zy5Var.get(i3);
                float fH = z12Var.a[0] - y86.H(j2);
                char c3 = c2;
                float fI = z12Var.a[1] - y86.I(j2);
                float f2 = kjb.b;
                float f3 = (fI * fI) + (fH * fH);
                long jC = z12Var.c(0.5f);
                float fH2 = y86.H(jC) - y86.H(j2);
                float fI2 = y86.I(jC) - y86.I(j2);
                fMax = Math.max(fMax, Math.max(f3, (fI2 * fI2) + (fH2 * fH2)));
                i3++;
                c2 = c3;
            }
            char c4 = c2;
            float fSqrt = (float) Math.sqrt(fMax);
            float fH3 = y86.H(j2) - fSqrt;
            float fI3 = y86.I(j2) - fSqrt;
            float fH4 = y86.H(j2) + fSqrt;
            float fI4 = y86.I(j2) + fSqrt;
            float[] fArr2 = new float[4];
            fArr2[0] = fH3;
            fArr2[1] = fI3;
            fArr2[c4] = fH4;
            fArr2[3] = fI4;
            fMin = Math.min(fMin, Math.max((fArr[c4] - fArr[0]) / (fArr2[c4] - fArr2[0]), (fArr[3] - fArr[1]) / (fArr2[3] - fArr2[1])));
        }
        return fMin;
    }

    public static final void g(ou6 ou6Var, long j2, long j3, t89 t89Var, List list, dd4 dd4Var, int i2) {
        t89 t89Var2;
        List list2;
        t89 t89VarA;
        int i3;
        List list3;
        dd4Var.h0(663218740);
        int i4 = i2 | (dd4Var.e(j2) ? 32 : 16) | (dd4Var.e(j3) ? 256 : Token.CASE) | 9216;
        if (dd4Var.V(i4 & 1, (i4 & 9363) != 9362)) {
            dd4Var.a0();
            if ((i2 & 1) == 0 || dd4Var.C()) {
                float f2 = d16.a;
                t89VarA = n99.a(gc1.v, dd4Var);
                i3 = i4 & (-64513);
                list3 = d16.c;
            } else {
                dd4Var.Y();
                i3 = i4 & (-64513);
                t89VarA = t89Var;
                list3 = list;
            }
            dd4Var.r();
            z(ou6Var, j2, j3, t89VarA, list3, dd4Var, 65534 & i3);
            t89Var2 = t89VarA;
            list2 = list3;
        } else {
            dd4Var.Y();
            t89Var2 = t89Var;
            list2 = list;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new t8(ou6Var, j2, j3, t89Var2, list2, i2);
        }
    }

    public static final void h(final ib4 ib4Var, final ou6 ou6Var, final long j2, final long j3, t89 t89Var, List list, dd4 dd4Var, final int i2) {
        final t89 t89Var2;
        final List list2;
        t89 t89VarA;
        int i3;
        List list3;
        dd4Var.h0(1484812328);
        int i4 = i2 | (dd4Var.h(ib4Var) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16) | (dd4Var.e(j2) ? 256 : Token.CASE) | (dd4Var.e(j3) ? 2048 : 1024) | 73728;
        if (dd4Var.V(i4 & 1, (74899 & i4) != 74898)) {
            dd4Var.a0();
            if ((i2 & 1) == 0 || dd4Var.C()) {
                float f2 = d16.a;
                t89VarA = n99.a(gc1.v, dd4Var);
                i3 = i4 & (-516097);
                list3 = d16.d;
            } else {
                dd4Var.Y();
                i3 = i4 & (-516097);
                t89VarA = t89Var;
                list3 = list;
            }
            dd4Var.r();
            t89 t89Var3 = t89VarA;
            A(ib4Var, ou6Var, j2, j3, t89Var3, list3, dd4Var, i3 & 524286);
            t89Var2 = t89Var3;
            list2 = list3;
        } else {
            dd4Var.Y();
            t89Var2 = t89Var;
            list2 = list;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(ou6Var, j2, j3, t89Var2, list2, i2) { // from class: h16
                public final /* synthetic */ ou6 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ t89 e;
                public final /* synthetic */ List f;

                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(1);
                    sdc.h(this.a, this.b, this.c, this.d, this.e, this.f, (dd4) obj, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final void i(String str, n78 n78Var, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, dd4 dd4Var, int i2) {
        int i3;
        ou6 ou6Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-174383164);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? dd4Var2.f(n78Var) : dd4Var2.h(n78Var) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i4 |= dd4Var2.h(ib4Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= dd4Var2.h(ib4Var2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= dd4Var2.h(ib4Var3) ? 131072 : Parser.ARGC_LIMIT;
        }
        if (dd4Var2.V(i4 & 1, (74899 & i4) != 74898)) {
            boolean z2 = n78Var != null && n78Var.a.length() > 0;
            boolean z3 = n78Var != null && n78Var.a.length() == 0;
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = dk9.x(Boolean.FALSE);
                dd4Var2.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            uw1 uw1Var = s00.p(dd4Var2).a;
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarW = t96.w(ou6Var3, uw1Var);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarW);
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
            ou6 ou6VarL = fe.L(tg9.f(ou6Var3, 1.0f), dd1.g(s00.o(dd4Var2), 1.0f), jf0.G);
            boolean z4 = !z3;
            boolean zG = dd4Var2.g(z2) | ((i4 & 7168) == 2048);
            Object objQ2 = dd4Var2.Q();
            if (zG || objQ2 == obj) {
                objQ2 = new no(z2, ib4Var, a07Var, 3);
                dd4Var2.p0(objQ2);
            }
            ou6 ou6VarL02 = gjb.l0(fw.J(null, (ib4) objQ2, ou6VarL, z4, 14), 12.0f);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarL02);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ie1VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            nha.c(str, (ou6) null, 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).h, dd4Var, i4 & 14, 0, 131070);
            dd4Var2 = dd4Var;
            un9.a(dd4Var2, tg9.h(ou6Var3, 12.0f));
            if (n78Var == null) {
                dd4Var2.f0(-381979166);
                nha.c(wn9.K((pv9) zt9.Y.getValue(), dd4Var2), (ou6) null, lc1.c(0.6f, s00.o(dd4Var2).q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).k, dd4Var, 0, 0, 131066);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else if (z3) {
                dd4Var2.f0(-381678342);
                h48.d(gjb.n0(tg9.f(ou6Var3, 1.0f), 0.0f, 8.0f, 1), 0L, 0L, 0, 0.0f, dd4Var2, 6);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-381430714);
                nha.c(wn9.L((pv9) fv9.b.getValue(), new Object[]{Integer.valueOf(n78Var.b)}, dd4Var2), (ou6) null, s00.o(dd4Var2).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).k, dd4Var, 0, 0, 131066);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
            boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
            Object objQ3 = dd4Var2.Q();
            if (objQ3 == obj) {
                objQ3 = new bq6(a07Var, 24);
                dd4Var2.p0(objQ3);
            }
            gx1.a(zBooleanValue, null, 0L, null, 0.0f, null, (ib4) objQ3, jf0.G(942062270, new hu2(ib4Var, ib4Var2, ib4Var3, a07Var, 15), dd4Var2), dd4Var2, 14155776, 62);
            dd4Var2.q(true);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var2.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tz0(str, n78Var, ou6Var2, ib4Var, ib4Var2, ib4Var3, i2, 6);
        }
    }

    public static int i0(double d2) {
        double d3 = d2 / 100.0d;
        return (int) wx1.O(Math.rint((d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d), 0.0d, 255.0d);
    }

    public static final void j(ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-284611459);
        if (dd4Var2.V(i2 & 1, (i2 & 3) != 2)) {
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
            ou6 ou6VarM0 = gjb.m0(tg9.f(lu6Var, 1.0f), 12.0f, 12.0f);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarM0);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            ou6 ou6VarH = tg9.h(ky0.g(dd4Var2, ou6VarL02, jmVar4, 1.0f, true), 40.0f);
            ur9 ur9Var = s96.a;
            ah1.r(t96.w(ou6VarH, ((q96) dd4Var2.j(ur9Var)).c.e), null, dd4Var2, 0, 2);
            un9.a(dd4Var2, tg9.n(lu6Var, 12.0f));
            ah1.r(tg9.n(lu6Var, 40.0f), ((q96) dd4Var2.j(ur9Var)).c.e, dd4Var2, 6, 0);
            un9.a(dd4Var2, tg9.n(lu6Var, 8.0f));
            ah1.r(tg9.n(lu6Var, 40.0f), ((q96) dd4Var2.j(ur9Var)).c.e, dd4Var2, 6, 0);
            dd4Var2.q(true);
            int i3 = 5;
            yn2.b(gjb.n0(tg9.f(lu6Var, 1.0f), 12.0f, 0.0f, 2), new mv(8.0f, true, new gp(5)), new mv(8.0f, true, new gp(5)), (wf0) null, 0, 0, gc1.c, dd4Var2, 1573302);
            un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
            zh4 zh4Var = xzb.a(dd4Var2) ? new zh4() : new yh4(160.0f);
            px3 px3Var = tg9.c;
            rj7 rj7Var = new rj7(12.0f, 8.0f, 12.0f, 8.0f);
            Object objQ = dd4Var2.Q();
            if (objQ == vl1.a) {
                objQ = new gq2(i3);
                dd4Var2.p0(objQ);
            }
            sw1.h(zh4Var, px3Var, (wq5) null, rj7Var, (nv) null, (kv) null, (s04) null, false, (ag) null, (kb4) objQ, dd4Var, 3120, 6, 1012);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var, i2, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j0(defpackage.bv0 r2, defpackage.kt1 r3) {
        /*
            r2.getClass()
            java.lang.Throwable r0 = r2.b()
            if (r0 != 0) goto L2d
            boolean r0 = r2.j()
            if (r0 != 0) goto L21
            bg9 r0 = r2.f()
            r0.getClass()
            wq0 r0 = r0.b()
            long r0 = r0.c
            int r0 = (int) r0
            r1 = 1048576(0x100000, float:1.469368E-39)
            if (r0 < r1) goto L2a
        L21:
            java.lang.Object r2 = r2.c(r3)
            xx1 r3 = defpackage.xx1.a
            if (r2 != r3) goto L2a
            return r2
        L2a:
            heb r2 = defpackage.heb.a
            return r2
        L2d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sdc.j0(bv0, kt1):java.lang.Object");
    }

    public static final void k(t27 t27Var, dd4 dd4Var, int i2) {
        t27Var.getClass();
        dd4Var.h0(1857156757);
        int i3 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            nv2 nv2Var = (nv2) ((qtb) qx1.N(ug8.a(nv2.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
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
            } else {
                gx1.q(qn9.n(tg9.c), jf0.G(-964803273, new hu2(t27Var, nv2Var, bx1.B(nv2Var.d, dd4Var), bx1.B(((mib) ((qtb) qx1.N(ug8.a(mib.class), eubVarA.f(), null, eubVarA instanceof pj4 ? ((pj4) eubVarA).d() : v02.b, ek5.a(dd4Var), null))).f, dd4Var), 1), dd4Var), dd4Var, 48, 0);
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new q41(i2, 14, t27Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static hx1 k0(lt1 lt1Var, ix1 ix1Var) {
        ix1Var.getClass();
        if (ix1Var instanceof mx1) {
            mx1 mx1Var = (mx1) ix1Var;
            ix1 key = lt1Var.getKey();
            key.getClass();
            if (key != mx1Var && mx1Var.b != key) {
                return null;
            }
            hx1 hx1Var = (hx1) mx1Var.a.invoke((n0) lt1Var);
            if (hx1Var != null) {
                return hx1Var;
            }
        } else if (g83.d == ix1Var) {
            return lt1Var;
        }
        return null;
    }

    public static final void l(op3 op3Var, szb szbVar, ou6 ou6Var, ib4 ib4Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2;
        float f2;
        List list;
        boolean z2;
        dd4Var.h0(989528650);
        int i3 = i2 | (dd4Var.h(op3Var) ? 4 : 2) | (dd4Var.f(szbVar) ? 32 : 16) | (dd4Var.h(ib4Var) ? 2048 : 1024) | (dd4Var.h(kb4Var) ? 16384 : 8192);
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
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
            boolean z3 = op3Var.a;
            List list2 = op3Var.b;
            if (z3) {
                dd4Var.f0(1098148371);
                dd4Var.q(false);
                f2 = 12.0f;
                dd4Var2 = dd4Var;
                list = list2;
            } else {
                dd4Var.f0(1098209627);
                if (list2.isEmpty()) {
                    dd4Var.f0(1098260095);
                    f2 = 12.0f;
                    list = list2;
                    bx1.d(lx1.j0(dd4Var), wn9.K((pv9) eu9.k.getValue(), dd4Var), wn9.K((pv9) eu9.l.getValue(), dd4Var), gjb.n0(tg9.c, 12.0f, 0.0f, 2), wn9.K((pv9) vt9.o.getValue(), dd4Var), ib4Var, dd4Var, (458752 & (i3 << 6)) | 3072, 0);
                    dd4Var2 = dd4Var;
                    z2 = false;
                    dd4Var2.q(false);
                } else {
                    f2 = 12.0f;
                    dd4Var2 = dd4Var;
                    list = list2;
                    dd4Var2.f0(1098736906);
                    m(op3Var.b, szbVar, tg9.c, kb4Var, dd4Var2, (i3 & Token.ASSIGN_MOD) | 384 | ((i3 >> 3) & 7168));
                    z2 = false;
                    dd4Var2.q(false);
                }
                dd4Var2.q(z2);
            }
            if (list.isEmpty()) {
                dd4Var2.f0(1099623506);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(1099073504);
                ww1.g(ib4Var, gjb.l0(yib.B(zn0.a.a(lu6.a, bv4.v), 15), f2), null, ((q96) dd4Var2.j(s96.a)).a.h, 0L, null, vm7.c, dd4Var, ((i3 >> 9) & 14) | 12582912, Token.COLON);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uj0(op3Var, szbVar, ou6Var, ib4Var, kb4Var, i2);
        }
    }

    public static final p35 l0(hi1 hi1Var) {
        hi1Var.getClass();
        int iOrdinal = hi1Var.ordinal();
        if (iOrdinal == 9) {
            p35 p35Var = i12.b;
            if (p35Var != null) {
                return p35Var;
            }
            o35 o35Var = new o35("settings", 24.0f, 24.0f, 960.0f, 960.0f, 0L, 0, false, 224);
            xk9 xk9Var = new xk9(ah1.l(4293125091L));
            int i2 = hlb.a;
            qr0 qr0VarE = ky0.e(435.69f, 860.0f);
            qr0VarE.l(-20.46f, 0.0f, -35.34f, -13.58f);
            qr0VarE.l(-14.89f, -13.57f, -18.12f, -33.42f);
            qr0VarE.h(-9.77f, -74.85f);
            qr0VarE.l(-16.07f, -5.38f, -32.96f, -15.07f);
            qr0VarE.l(-16.88f, -9.7f, -30.19f, -20.77f);
            qr0VarE.g(240.0f, 731.77f);
            qr0VarE.l(-18.85f, 8.31f, -37.88f, 1.61f);
            qr0VarE.l(-19.04f, -6.69f, -29.58f, -24.3f);
            qr0VarE.h(-45.08f, -78.16f);
            qr0VarE.l(-10.54f, -17.61f, -6.07f, -37.27f);
            qr0VarE.l(4.46f, -19.65f, 20.46f, -32.42f);
            qr0VarE.h(59.92f, -45.0f);
            qr0VarE.l(-1.38f, -8.92f, -1.96f, -17.92f);
            qr0VarE.l(-0.58f, -9.0f, -0.58f, -17.93f);
            qr0VarE.l(0.0f, -8.53f, 0.58f, -17.34f);
            qr0VarE.m(1.96f, -19.27f);
            qr0VarE.h(-59.92f, -45.0f);
            qr0VarE.l(-16.0f, -12.77f, -20.27f, -32.62f);
            qr0VarE.l(-4.27f, -19.84f, 6.27f, -37.46f);
            qr0VarE.h(44.69f, -77.0f);
            qr0VarE.l(10.54f, -17.23f, 29.58f, -24.11f);
            qr0VarE.l(19.03f, -6.89f, 37.88f, 1.42f);
            qr0VarE.h(68.92f, 29.08f);
            qr0VarE.l(14.47f, -11.46f, 30.89f, -20.96f);
            qr0VarE.m(32.27f, -15.27f);
            qr0VarE.g(382.23f, 147.0f);
            qr0VarE.l(3.23f, -19.85f, 18.12f, -33.42f);
            qr0VarE.k(415.23f, 100.0f, 435.69f, 100.0f);
            qr0VarE.f(88.62f);
            qr0VarE.l(20.46f, 0.0f, 35.34f, 13.58f);
            qr0VarE.l(14.89f, 13.57f, 18.12f, 33.42f);
            qr0VarE.h(9.77f, 75.23f);
            qr0VarE.l(18.0f, 6.54f, 32.57f, 15.27f);
            qr0VarE.l(14.58f, 8.73f, 29.43f, 20.58f);
            qr0VarE.g(720.39f, 229.0f);
            qr0VarE.l(18.84f, -8.31f, 37.88f, -1.42f);
            qr0VarE.l(19.04f, 6.88f, 29.57f, 24.11f);
            qr0VarE.h(44.7f, 77.39f);
            qr0VarE.l(10.54f, 17.61f, 6.07f, 37.27f);
            qr0VarE.l(-4.46f, 19.65f, -20.46f, 32.42f);
            qr0VarE.h(-61.46f, 46.15f);
            qr0VarE.l(2.15f, 9.69f, 2.35f, 18.12f);
            qr0VarE.l(0.19f, 8.42f, 0.19f, 16.96f);
            qr0VarE.l(0.0f, 8.15f, -0.39f, 16.58f);
            qr0VarE.l(-0.38f, 8.42f, -2.76f, 19.27f);
            qr0VarE.h(60.3f, 45.38f);
            qr0VarE.l(16.0f, 12.77f, 20.66f, 32.42f);
            qr0VarE.l(4.65f, 19.66f, -5.89f, 37.27f);
            qr0VarE.h(-45.31f, 77.77f);
            qr0VarE.l(-10.53f, 17.62f, -29.76f, 24.31f);
            qr0VarE.l(-19.23f, 6.69f, -38.08f, -1.62f);
            qr0VarE.h(-68.46f, -29.46f);
            qr0VarE.l(-14.85f, 11.85f, -30.31f, 20.96f);
            qr0VarE.l(-15.46f, 9.12f, -31.69f, 14.89f);
            qr0VarE.g(577.77f, 813.0f);
            qr0VarE.l(-3.23f, 19.85f, -18.12f, 33.42f);
            qr0VarE.k(544.77f, 860.0f, 524.31f, 860.0f);
            qr0VarE.f(-88.62f);
            qr0VarE.b();
            qr0VarE.j(4.31f, -60.0f);
            qr0VarE.f(78.62f);
            qr0VarE.g(533.0f, 692.85f);
            qr0VarE.l(30.62f, -8.0f, 55.96f, -22.73f);
            qr0VarE.l(25.35f, -14.74f, 48.89f, -37.89f);
            qr0VarE.g(737.23f, 674.0f);
            qr0VarE.h(39.39f, -68.0f);
            qr0VarE.h(-86.77f, -65.38f);
            qr0VarE.l(5.0f, -15.54f, 6.8f, -30.47f);
            qr0VarE.l(1.81f, -14.92f, 1.81f, -30.15f);
            qr0VarE.l(0.0f, -15.62f, -1.81f, -30.15f);
            qr0VarE.l(-1.8f, -14.54f, -6.8f, -29.7f);
            qr0VarE.g(777.38f, 354.0f);
            qr0VarE.g(738.0f, 286.0f);
            qr0VarE.h(-100.54f, 42.38f);
            qr0VarE.l(-20.08f, -21.46f, -48.11f, -37.92f);
            qr0VarE.l(-28.04f, -16.46f, -56.73f, -23.31f);
            qr0VarE.g(520.0f, 160.0f);
            qr0VarE.f(-79.38f);
            qr0VarE.h(-13.24f, 106.77f);
            qr0VarE.l(-30.61f, 7.23f, -56.53f, 22.15f);
            qr0VarE.l(-25.93f, 14.93f, -49.47f, 38.46f);
            qr0VarE.g(222.0f, 286.0f);
            qr0VarE.h(-39.38f, 68.0f);
            qr0VarE.g(269.0f, 418.38f);
            qr0VarE.l(-5.0f, 14.24f, -7.0f, 29.62f);
            qr0VarE.m(-2.0f, 32.38f);
            qr0VarE.l(0.0f, 15.62f, 2.0f, 30.62f);
            qr0VarE.l(2.0f, 15.0f, 6.62f, 29.62f);
            qr0VarE.h(-86.0f, 65.38f);
            qr0VarE.g(222.0f, 674.0f);
            qr0VarE.h(99.0f, -42.0f);
            qr0VarE.l(22.77f, 23.38f, 48.69f, 38.31f);
            qr0VarE.l(25.93f, 14.92f, 57.31f, 22.92f);
            qr0VarE.g(440.0f, 800.0f);
            qr0VarE.b();
            qr0VarE.j(40.46f, -200.0f);
            qr0VarE.l(49.92f, 0.0f, 84.96f, -35.04f);
            qr0VarE.l(35.04f, -35.04f, 35.04f, -84.96f);
            qr0VarE.l(0.0f, -49.92f, -35.04f, -84.96f);
            qr0VarE.k(530.38f, 360.0f, 480.46f, 360.0f);
            qr0VarE.l(-50.54f, 0.0f, -85.27f, 35.04f);
            qr0VarE.a.add(new mo7(360.46f, 480.0f));
            qr0VarE.l(0.0f, 49.92f, 34.73f, 84.96f);
            qr0VarE.k(429.92f, 600.0f, 480.46f, 600.0f);
            qr0VarE.b();
            qr0VarE.i(480.0f, 480.0f);
            qr0VarE.b();
            o35.d(o35Var, qr0VarE.a, 0, xk9Var, (xk9) null, 0.0f, 0, 0, 4.0f);
            p35 p35VarE = o35Var.e();
            i12.b = p35VarE;
            return p35VarE;
        }
        if (iOrdinal == 13) {
            p35 p35Var2 = rj9.a;
            if (p35Var2 != null) {
                return p35Var2;
            }
            o35 o35Var2 = new o35("star", 24.0f, 24.0f, 960.0f, 960.0f, 0L, 0, false, 224);
            xk9 xk9Var2 = new xk9(ah1.l(4293125091L));
            int i3 = hlb.a;
            qr0 qr0Var = new qr0(2);
            qr0Var.j(354.0f, -287.0f);
            qr0Var.h(126.0f, -76.0f);
            qr0Var.h(126.0f, 77.0f);
            qr0Var.h(-33.0f, -144.0f);
            qr0Var.h(111.0f, -96.0f);
            qr0Var.h(-146.0f, -13.0f);
            qr0Var.h(-58.0f, -136.0f);
            qr0Var.h(-58.0f, 135.0f);
            qr0Var.h(-146.0f, 13.0f);
            qr0Var.h(111.0f, 97.0f);
            qr0Var.h(-33.0f, 143.0f);
            qr0Var.b();
            qr0Var.j(126.0f, -5.46f);
            qr0Var.h(-155.61f, 93.84f);
            qr0Var.l(-8.7f, 5.08f, -17.43f, 4.27f);
            qr0Var.l(-8.73f, -0.81f, -15.8f, -5.88f);
            qr0Var.l(-7.08f, -5.08f, -10.93f, -13.27f);
            qr0Var.l(-3.84f, -8.19f, -1.23f, -18.12f);
            qr0Var.h(41.31f, -176.69f);
            qr0Var.h(-137.38f, -118.92f);
            qr0Var.l(-7.7f, -6.69f, -9.81f, -15.5f);
            qr0Var.l(-2.12f, -8.81f, 1.11f, -17.12f);
            qr0Var.l(3.23f, -8.3f, 9.31f, -13.57f);
            qr0Var.m(16.62f, -6.89f);
            qr0Var.h(181.3f, -15.84f);
            qr0Var.g(451.85f, 197.0f);
            qr0Var.l(3.84f, -9.31f, 11.65f, -13.77f);
            qr0Var.l(7.81f, -4.46f, 16.5f, -4.46f);
            qr0Var.l(8.69f, 0.0f, 16.5f, 4.46f);
            qr0Var.l(7.81f, 4.46f, 11.65f, 13.77f);
            qr0Var.h(70.39f, 166.85f);
            qr0Var.h(181.3f, 15.84f);
            qr0Var.l(10.54f, 1.62f, 16.62f, 6.89f);
            qr0Var.l(6.08f, 5.27f, 9.31f, 13.57f);
            qr0Var.l(3.23f, 8.31f, 1.11f, 17.12f);
            qr0Var.l(-2.11f, 8.81f, -9.81f, 15.5f);
            qr0Var.g(639.69f, 551.69f);
            qr0Var.g(681.0f, 728.38f);
            qr0Var.l(2.61f, 9.93f, -1.23f, 18.12f);
            qr0Var.l(-3.85f, 8.19f, -10.93f, 13.27f);
            qr0Var.l(-7.07f, 5.07f, -15.8f, 5.88f);
            qr0Var.l(-8.73f, 0.81f, -17.43f, -4.27f);
            qr0Var.g(480.0f, 667.54f);
            qr0Var.b();
            qr0Var.i(480.0f, 490.0f);
            qr0Var.b();
            o35.d(o35Var2, qr0Var.a, 0, xk9Var2, (xk9) null, 0.0f, 0, 0, 4.0f);
            p35 p35VarE2 = o35Var2.e();
            rj9.a = p35VarE2;
            return p35VarE2;
        }
        switch (iOrdinal) {
            case 1:
            case 2:
                p35 p35Var3 = kl8.C;
                if (p35Var3 != null) {
                    return p35Var3;
                }
                o35 o35Var3 = new o35("accountBox", 24.0f, 24.0f, 960.0f, 960.0f, 0L, 0, false, 224);
                xk9 xk9Var3 = new xk9(ah1.l(4293125091L));
                int i4 = hlb.a;
                qr0 qr0VarE2 = ky0.e(200.0f, 721.69f);
                qr0VarE2.l(54.0f, -53.0f, 125.5f, -83.5f);
                qr0VarE2.m(154.5f, -30.5f);
                qr0VarE2.l(83.0f, 0.0f, 154.5f, 30.5f);
                qr0VarE2.m(125.5f, 83.5f);
                qr0VarE2.o(-509.38f);
                qr0VarE2.l(0.0f, -4.62f, -3.85f, -8.46f);
                qr0VarE2.l(-3.84f, -3.85f, -8.46f, -3.85f);
                qr0VarE2.e(212.31f);
                qr0VarE2.l(-4.62f, 0.0f, -8.46f, 3.85f);
                qr0VarE2.l(-3.85f, 3.84f, -3.85f, 8.46f);
                qr0VarE2.o(509.38f);
                qr0VarE2.b();
                qr0VarE2.j(280.0f, -200.15f);
                qr0VarE2.l(54.15f, 0.0f, 92.08f, -37.92f);
                qr0VarE2.k(610.0f, 445.69f, 610.0f, 391.54f);
                qr0VarE2.m(-37.92f, -92.08f);
                qr0VarE2.l(-37.93f, -37.92f, -92.08f, -37.92f);
                qr0VarE2.m(-92.08f, 37.92f);
                qr0VarE2.k(350.0f, 337.39f, 350.0f, 391.54f);
                qr0VarE2.m(37.92f, 92.08f);
                qr0VarE2.l(37.93f, 37.92f, 92.08f, 37.92f);
                qr0VarE2.b();
                qr0VarE2.i(212.31f, 820.0f);
                qr0VarE2.k(182.0f, 820.0f, 161.0f, 799.0f);
                qr0VarE2.l(-21.0f, -21.0f, -21.0f, -51.31f);
                qr0VarE2.o(-535.38f);
                qr0VarE2.k(140.0f, 182.0f, 161.0f, 161.0f);
                qr0VarE2.l(21.0f, -21.0f, 51.31f, -21.0f);
                qr0VarE2.f(535.38f);
                qr0VarE2.k(778.0f, 140.0f, 799.0f, 161.0f);
                qr0VarE2.l(21.0f, 21.0f, 21.0f, 51.31f);
                qr0VarE2.o(535.38f);
                qr0VarE2.k(820.0f, 778.0f, 799.0f, 799.0f);
                qr0VarE2.l(-21.0f, 21.0f, -51.31f, 21.0f);
                qr0VarE2.e(212.31f);
                qr0VarE2.b();
                qr0VarE2.j(34.77f, -60.0f);
                qr0VarE2.f(465.84f);
                qr0VarE2.k(662.0f, 713.31f, 601.89f, 690.5f);
                qr0VarE2.k(541.77f, 667.69f, 480.0f, 667.69f);
                qr0VarE2.l(-61.0f, 0.0f, -122.12f, 22.81f);
                qr0VarE2.l(-61.11f, 22.81f, -110.8f, 69.5f);
                qr0VarE2.b();
                qr0VarE2.i(480.0f, 461.54f);
                qr0VarE2.l(-28.85f, 0.0f, -49.42f, -20.58f);
                qr0VarE2.k(410.0f, 420.39f, 410.0f, 391.54f);
                qr0VarE2.m(20.58f, -49.42f);
                qr0VarE2.l(20.57f, -20.58f, 49.42f, -20.58f);
                qr0VarE2.m(49.42f, 20.58f);
                qr0VarE2.k(550.0f, 362.69f, 550.0f, 391.54f);
                qr0VarE2.m(-20.58f, 49.42f);
                qr0VarE2.l(-20.57f, 20.58f, -49.42f, 20.58f);
                qr0VarE2.b();
                qr0VarE2.j(0.0f, -0.69f);
                qr0VarE2.b();
                o35.d(o35Var3, qr0VarE2.a, 0, xk9Var3, (xk9) null, 0.0f, 0, 0, 4.0f);
                p35 p35VarE3 = o35Var3.e();
                kl8.C = p35VarE3;
                return p35VarE3;
            case 3:
                p35 p35Var4 = kf0.J;
                if (p35Var4 != null) {
                    return p35Var4;
                }
                o35 o35Var4 = new o35("build", 24.0f, 24.0f, 960.0f, 960.0f, 0L, 0, false, 224);
                xk9 xk9Var4 = new xk9(ah1.l(4293125091L));
                int i5 = hlb.a;
                qr0 qr0VarE3 = ky0.e(357.69f, 590.0f);
                qr0VarE3.l(-95.83f, 0.0f, -162.91f, -67.08f);
                qr0VarE3.l(-67.09f, -67.09f, -67.09f, -162.92f);
                qr0VarE3.l(0.0f, -16.67f, 2.43f, -33.33f);
                qr0VarE3.l(2.42f, -16.67f, 8.11f, -31.98f);
                qr0VarE3.l(3.85f, -9.23f, 10.39f, -13.65f);
                qr0VarE3.l(6.53f, -4.42f, 14.76f, -6.42f);
                qr0VarE3.l(8.24f, -2.0f, 16.58f, 0.3f);
                qr0VarE3.l(8.35f, 2.31f, 15.19f, 9.16f);
                qr0VarE3.h(106.54f, 105.77f);
                qr0VarE3.g(387.54f, 304.0f);
                qr0VarE3.g(282.15f, 198.23f);
                qr0VarE3.l(-6.84f, -6.85f, -9.15f, -15.46f);
                qr0VarE3.l(-2.31f, -8.61f, -0.31f, -16.77f);
                qr0VarE3.l(2.0f, -8.15f, 6.62f, -14.69f);
                qr0VarE3.l(4.61f, -6.54f, 13.46f, -10.39f);
                qr0VarE3.l(15.31f, -6.07f, 31.85f, -8.5f);
                qr0VarE3.l(16.53f, -2.42f, 33.07f, -2.42f);
                qr0VarE3.l(95.84f, 0.0f, 162.92f, 67.08f);
                qr0VarE3.l(67.08f, 67.09f, 67.08f, 162.92f);
                qr0VarE3.l(0.0f, 25.31f, -4.77f, 47.15f);
                qr0VarE3.l(-4.77f, 21.85f, -14.31f, 42.24f);
                qr0VarE3.g(786.0f, 665.54f);
                qr0VarE3.l(25.15f, 25.05f, 25.15f, 61.33f);
                qr0VarE3.m(-25.07f, 61.44f);
                qr0VarE3.l(-25.07f, 25.15f, -61.38f, 25.15f);
                qr0VarE3.m(-61.47f, -25.77f);
                qr0VarE3.g(447.08f, 570.92f);
                qr0VarE3.l(-21.16f, 9.16f, -43.01f, 14.12f);
                qr0VarE3.l(-21.86f, 4.96f, -46.38f, 4.96f);
                qr0VarE3.b();
                qr0VarE3.j(0.0f, -60.0f);
                qr0VarE3.l(26.26f, 0.0f, 52.52f, -7.81f);
                qr0VarE3.l(26.25f, -7.8f, 48.02f, -24.42f);
                qr0VarE3.h(248.39f, 248.39f);
                qr0VarE3.l(7.3f, 7.3f, 18.3f, 7.0f);
                qr0VarE3.l(11.0f, -0.31f, 18.31f, -7.62f);
                qr0VarE3.l(7.31f, -7.31f, 7.31f, -18.31f);
                qr0VarE3.m(-7.31f, -18.31f);
                qr0VarE3.g(494.85f, 461.15f);
                qr0VarE3.l(16.84f, -20.77f, 24.84f, -47.27f);
                qr0VarE3.l(8.0f, -26.5f, 8.0f, -53.88f);
                qr0VarE3.l(0.0f, -66.54f, -47.54f, -117.77f);
                qr0VarE3.k(432.61f, 191.0f, 359.84f, 192.0f);
                qr0VarE3.h(86.7f, 86.69f);
                qr0VarE3.l(10.84f, 10.85f, 10.84f, 25.31f);
                qr0VarE3.l(0.0f, 14.46f, -10.84f, 25.31f);
                qr0VarE3.g(327.0f, 448.85f);
                qr0VarE3.l(-10.85f, 10.84f, -25.31f, 10.84f);
                qr0VarE3.l(-14.46f, 0.0f, -25.31f, -10.84f);
                qr0VarE3.h(-86.69f, -86.7f);
                qr0VarE3.l(0.15f, 77.0f, 51.77f, 122.43f);
                qr0VarE3.k(293.08f, 530.0f, 357.69f, 530.0f);
                qr0VarE3.b();
                qr0VarE3.j(110.16f, -60.62f);
                qr0VarE3.b();
                o35.d(o35Var4, qr0VarE3.a, 0, xk9Var4, (xk9) null, 0.0f, 0, 0, 4.0f);
                p35 p35VarE4 = o35Var4.e();
                kf0.J = p35VarE4;
                return p35VarE4;
            case 4:
            case 5:
                p35 p35Var5 = gx1.b;
                if (p35Var5 != null) {
                    return p35Var5;
                }
                o35 o35Var5 = new o35("info", 24.0f, 24.0f, 960.0f, 960.0f, 0L, 0, false, 224);
                xk9 xk9Var5 = new xk9(ah1.l(4293125091L));
                int i6 = hlb.a;
                qr0 qr0VarE4 = ky0.e(480.01f, 670.0f);
                qr0VarE4.l(12.76f, 0.0f, 21.37f, -8.63f);
                qr0VarE4.k(510.0f, 652.75f, 510.0f, 640.0f);
                qr0VarE4.o(-170.0f);
                qr0VarE4.l(0.0f, -12.75f, -8.63f, -21.38f);
                qr0VarE4.l(-8.63f, -8.62f, -21.38f, -8.62f);
                qr0VarE4.l(-12.76f, 0.0f, -21.37f, 8.62f);
                qr0VarE4.k(450.0f, 457.25f, 450.0f, 470.0f);
                qr0VarE4.o(170.0f);
                qr0VarE4.l(0.0f, 12.75f, 8.63f, 21.37f);
                qr0VarE4.l(8.63f, 8.63f, 21.38f, 8.63f);
                qr0VarE4.b();
                qr0VarE4.i(480.0f, 371.54f);
                qr0VarE4.l(13.73f, 0.0f, 23.02f, -9.29f);
                qr0VarE4.m(9.29f, -23.02f);
                qr0VarE4.l(0.0f, -13.73f, -9.29f, -23.02f);
                qr0VarE4.l(-9.29f, -9.28f, -23.02f, -9.28f);
                qr0VarE4.m(-23.02f, 9.28f);
                qr0VarE4.l(-9.29f, 9.29f, -9.29f, 23.02f);
                qr0VarE4.m(9.29f, 23.02f);
                qr0VarE4.l(9.29f, 9.29f, 23.02f, 9.29f);
                qr0VarE4.b();
                qr0VarE4.j(0.07f, 488.46f);
                qr0VarE4.l(-78.84f, 0.0f, -148.21f, -29.92f);
                qr0VarE4.m(-120.68f, -81.21f);
                qr0VarE4.l(-51.31f, -51.29f, -81.25f, -120.63f);
                qr0VarE4.k(100.0f, 558.9f, 100.0f, 480.07f);
                qr0VarE4.l(0.0f, -78.84f, 29.92f, -148.21f);
                qr0VarE4.m(81.21f, -120.68f);
                qr0VarE4.l(51.29f, -51.31f, 120.63f, -81.25f);
                qr0VarE4.k(401.1f, 100.0f, 479.93f, 100.0f);
                qr0VarE4.l(78.84f, 0.0f, 148.21f, 29.92f);
                qr0VarE4.m(120.68f, 81.21f);
                qr0VarE4.l(51.31f, 51.29f, 81.25f, 120.63f);
                qr0VarE4.k(860.0f, 401.1f, 860.0f, 479.93f);
                qr0VarE4.l(0.0f, 78.84f, -29.92f, 148.21f);
                qr0VarE4.m(-81.21f, 120.68f);
                qr0VarE4.l(-51.29f, 51.31f, -120.63f, 81.25f);
                qr0VarE4.k(558.9f, 860.0f, 480.07f, 860.0f);
                qr0VarE4.b();
                qr0VarE4.j(-0.07f, -60.0f);
                qr0VarE4.l(134.0f, 0.0f, 227.0f, -93.0f);
                qr0VarE4.m(93.0f, -227.0f);
                qr0VarE4.l(0.0f, -134.0f, -93.0f, -227.0f);
                qr0VarE4.m(-227.0f, -93.0f);
                qr0VarE4.l(-134.0f, 0.0f, -227.0f, 93.0f);
                qr0VarE4.m(-93.0f, 227.0f);
                qr0VarE4.l(0.0f, 134.0f, 93.0f, 227.0f);
                qr0VarE4.m(227.0f, 93.0f);
                qr0VarE4.b();
                qr0VarE4.j(0.0f, -320.0f);
                qr0VarE4.b();
                o35.d(o35Var5, qr0VarE4.a, 0, xk9Var5, (xk9) null, 0.0f, 0, 0, 4.0f);
                p35 p35VarE5 = o35Var5.e();
                gx1.b = p35VarE5;
                return p35VarE5;
            case 6:
            case 7:
                p35 p35Var6 = vv1.a;
                if (p35Var6 != null) {
                    return p35Var6;
                }
                o35 o35Var6 = new o35("edit", 24.0f, 24.0f, 960.0f, 960.0f, 0L, 0, false, 224);
                xk9 xk9Var6 = new xk9(ah1.l(4293125091L));
                int i7 = hlb.a;
                qr0 qr0Var2 = new qr0(2);
                qr0Var2.i(200.0f, 760.0f);
                qr0Var2.f(50.46f);
                qr0Var2.h(409.46f, -409.46f);
                qr0Var2.h(-50.46f, -50.46f);
                qr0Var2.g(200.0f, 709.54f);
                qr0Var2.n(760.0f);
                qr0Var2.b();
                qr0Var2.j(-23.84f, 60.0f);
                qr0Var2.l(-15.37f, 0.0f, -25.76f, -10.4f);
                qr0Var2.l(-10.4f, -10.39f, -10.4f, -25.76f);
                qr0Var2.o(-69.3f);
                qr0Var2.l(0.0f, -14.63f, 5.62f, -27.89f);
                qr0Var2.l(5.61f, -13.26f, 15.46f, -23.11f);
                qr0Var2.h(506.54f, -506.31f);
                qr0Var2.l(9.07f, -8.24f, 20.03f, -12.73f);
                qr0Var2.l(10.97f, -4.5f, 23.0f, -4.5f);
                qr0Var2.m(23.3f, 4.27f);
                qr0Var2.l(11.28f, 4.27f, 19.97f, 13.58f);
                qr0Var2.h(48.85f, 49.46f);
                qr0Var2.l(9.31f, 8.69f, 13.27f, 20.0f);
                qr0Var2.l(3.96f, 11.31f, 3.96f, 22.62f);
                qr0Var2.l(0.0f, 12.07f, -4.12f, 23.03f);
                qr0Var2.l(-4.12f, 10.97f, -13.11f, 20.04f);
                qr0Var2.g(296.46f, 798.92f);
                qr0Var2.l(-9.85f, 9.85f, -23.11f, 15.46f);
                qr0Var2.l(-13.26f, 5.62f, -27.89f, 5.62f);
                qr0Var2.f(-69.3f);
                qr0Var2.b();
                qr0Var2.j(584.22f, -570.15f);
                qr0Var2.h(-50.23f, -50.23f);
                qr0Var2.h(50.23f, 50.23f);
                qr0Var2.b();
                qr0Var2.j(-126.13f, 75.9f);
                qr0Var2.h(-24.79f, -25.67f);
                qr0Var2.h(50.46f, 50.46f);
                qr0Var2.h(-25.67f, -24.79f);
                qr0Var2.b();
                o35.d(o35Var6, qr0Var2.a, 0, xk9Var6, (xk9) null, 0.0f, 0, 0, 4.0f);
                p35 p35VarE6 = o35Var6.e();
                vv1.a = p35VarE6;
                return p35VarE6;
            default:
                p35 p35Var7 = ex1.b;
                if (p35Var7 != null) {
                    return p35Var7;
                }
                o35 o35Var7 = new o35("keyboardArrowRight", 24.0f, 24.0f, 960.0f, 960.0f, 0L, 0, false, 224);
                xk9 xk9Var7 = new xk9(ah1.l(4293125091L));
                int i8 = hlb.a;
                qr0 qr0Var3 = new qr0(2);
                qr0Var3.i(517.85f, 480.0f);
                qr0Var3.g(354.92f, 317.08f);
                qr0Var3.l(-8.3f, -8.31f, -8.5f, -20.89f);
                qr0Var3.l(-0.19f, -12.57f, 8.5f, -21.27f);
                qr0Var3.l(8.7f, -8.69f, 21.08f, -8.69f);
                qr0Var3.l(12.38f, 0.0f, 21.08f, 8.69f);
                qr0Var3.h(179.77f, 179.77f);
                qr0Var3.l(5.61f, 5.62f, 7.92f, 11.85f);
                qr0Var3.l(2.31f, 6.23f, 2.31f, 13.46f);
                qr0Var3.m(-2.31f, 13.46f);
                qr0Var3.l(-2.31f, 6.23f, -7.92f, 11.85f);
                qr0Var3.g(397.08f, 685.08f);
                qr0Var3.l(-8.31f, 8.3f, -20.89f, 8.5f);
                qr0Var3.l(-12.57f, 0.19f, -21.27f, -8.5f);
                qr0Var3.l(-8.69f, -8.7f, -8.69f, -21.08f);
                qr0Var3.l(0.0f, -12.38f, 8.69f, -21.08f);
                qr0Var3.g(517.85f, 480.0f);
                qr0Var3.b();
                o35.d(o35Var7, qr0Var3.a, 0, xk9Var7, (xk9) null, 0.0f, 0, 0, 4.0f);
                p35 p35VarE7 = o35Var7.e();
                ex1.b = p35VarE7;
                return p35VarE7;
        }
    }

    public static final void m(List list, szb szbVar, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        int i3;
        dd4Var.h0(1051269577);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.h(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(szbVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 2048 : 1024;
        }
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            szb szbVarW = yib.w(szbVar, gjb.o(2, 16.0f));
            szb szbVarW2 = yib.w(szbVar, gjb.q(0.0f, 0.0f, 4.0f, 0.0f, 11));
            mv mvVar = new mv(4.0f, true, new gp(5));
            boolean zH = dd4Var.h(list) | ((i3 & 7168) == 2048);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                objQ = new qp0(list, kb4Var, i4);
                dd4Var.p0(objQ);
            }
            gx1.h(ou6Var, null, szbVarW, mvVar, null, null, false, szbVarW2, 0L, 0L, 0.0f, (kb4) objQ, dd4Var, ((i3 >> 6) & 14) | 24576, 0, 3818);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new o50(list, szbVar, ou6Var, kb4Var, i2, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object m0(defpackage.fx r4, defpackage.kt1 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.ex
            if (r0 == 0) goto L13
            r0 = r5
            ex r0 = (defpackage.ex) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ex r0 = new ex
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2d
            if (r1 != r3) goto L26
            defpackage.e11.e0(r5)     // Catch: java.lang.UnsupportedOperationException -> L48
            goto L3b
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2d:
            defpackage.e11.e0(r5)
            r0.b = r3     // Catch: java.lang.UnsupportedOperationException -> L48
            java.lang.Object r5 = r4.e(r0)     // Catch: java.lang.UnsupportedOperationException -> L48
            xx1 r4 = defpackage.xx1.a
            if (r5 != r4) goto L3b
            return r4
        L3b:
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.UnsupportedOperationException -> L48
            long r4 = r5.longValue()     // Catch: java.lang.UnsupportedOperationException -> L48
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 < 0) goto L48
            r2 = r3
        L48:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sdc.m0(fx, kt1):java.lang.Object");
    }

    public static final void n(boolean z2, t27 t27Var, dd4 dd4Var, int i2) {
        t27Var.getClass();
        dd4Var.h0(1584079506);
        int i3 = (dd4Var.g(z2) ? 4 : 2) | i2 | (dd4Var.f(t27Var) ? 32 : 16);
        int i4 = 0;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            pp3 pp3Var = (pp3) ((qtb) qx1.N(ug8.a(pp3.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(pp3Var.e, dd4Var);
            Object[] objArr = new Object[0];
            int i5 = 14;
            boolean z3 = (i3 & 14) == 4;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z3 || objQ == obj) {
                objQ = new lp3(0, z2);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 0);
            m8 m8Var = (m8) dd4Var.j(a9.a);
            boolean zF = dd4Var.f(pp3Var) | dd4Var.f(m8Var);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new ti(pp3Var, m8Var, (jt1) null, 7);
                dd4Var.p0(objQ2);
            }
            lc5.u((yb4) objQ2, dd4Var, pp3Var);
            gx1.p(wn9.K((pv9) iu9.s0.getValue(), dd4Var), null, false, jf0.G(1520989710, new q41(t27Var, 26), dd4Var), null, jf0.G(-241564580, new ak0(a07Var, pp3Var, a07VarB), dd4Var), dd4Var, 199680, 22);
            boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
            boolean zF2 = dd4Var.f(a07Var);
            Object objQ3 = dd4Var.Q();
            if (zF2 || objQ3 == obj) {
                objQ3 = new wf3(a07Var, i5);
                dd4Var.p0(objQ3);
            }
            kb4 kb4Var = (kb4) objQ3;
            boolean zF3 = dd4Var.f(pp3Var);
            Object objQ4 = dd4Var.Q();
            if (zF3 || objQ4 == obj) {
                objQ4 = new mp3(pp3Var, i4);
                dd4Var.p0(objQ4);
            }
            B(zBooleanValue, kb4Var, (kb4) objQ4, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new y31(z2, t27Var, i2);
        }
    }

    public static final boolean n0(int i2, int i3, long j2) {
        int iK = up1.k(j2);
        if (i2 > up1.i(j2) || iK > i2) {
            return false;
        }
        return i3 <= up1.h(j2) && up1.j(j2) <= i3;
    }

    public static final void o(int i2, List list, int i3, zk7 zk7Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i4) {
        int i5;
        ou6 ou6Var2;
        dd4Var.h0(-87536292);
        if ((i4 & 6) == 0) {
            i5 = (dd4Var.d(i2) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= dd4Var.h(list) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= dd4Var.d(i3) ? 256 : Token.CASE;
        }
        if ((i4 & 3072) == 0) {
            i5 |= dd4Var.f(zk7Var) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            ou6Var2 = ou6Var;
            i5 |= dd4Var.f(ou6Var2) ? 16384 : 8192;
        } else {
            ou6Var2 = ou6Var;
        }
        if ((196608 & i4) == 0) {
            i5 |= dd4Var.h(kb4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i4) == 0) {
            i5 |= dd4Var.h(kb4Var2) ? 1048576 : 524288;
        }
        if (dd4Var.V(i5 & 1, (599187 & i5) != 599186)) {
            int iK = zk7Var.k();
            long j2 = lc1.i;
            qx8.d(iK, ou6Var2, j2, j2, 0.0f, jf0.G(328795260, new oh1(zk7Var, 3), dd4Var), g, jf0.G(631607932, new cn0(iK, kb4Var, list, i3, i2, kb4Var2), dd4Var), dd4Var, ((i5 >> 9) & Token.ASSIGN_MOD) | 14380416, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new p34(i2, list, i3, zk7Var, ou6Var, kb4Var, kb4Var2, i4);
        }
    }

    public static double o0(double d2) {
        return d2 > 0.008856451679035631d ? Math.pow(d2, 0.3333333333333333d) : ((d2 * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static final void p(final t27 t27Var, final int i2, zk7 zk7Var, boolean z2, final pj7 pj7Var, final szb szbVar, ou6 ou6Var, final ib4 ib4Var, dd4 dd4Var, int i3) {
        boolean z3;
        dd4Var.h0(1163933817);
        int i4 = i3 | (dd4Var.f(t27Var) ? 4 : 2) | (dd4Var.d(i2) ? 32 : 16) | (dd4Var.f(zk7Var) ? 256 : Token.CASE) | 3072 | (dd4Var.f(pj7Var) ? 16384 : 8192) | (dd4Var.f(szbVar) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.f(ou6Var) ? 1048576 : 524288) | (dd4Var.h(ib4Var) ? 8388608 : 4194304);
        if (dd4Var.V(i4 & 1, (4793491 & i4) != 4793490)) {
            e11.e(zk7Var, ou6Var, null, null, 1, 0.0f, null, null, true, null, null, null, jf0.G(-1358907880, new ac4() { // from class: yn4
                @Override // defpackage.ac4
                public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj2).intValue();
                    dd4 dd4Var2 = (dd4) obj3;
                    ((Integer) obj4).getClass();
                    ((rk7) obj).getClass();
                    t27 t27Var2 = t27Var;
                    pj7 pj7Var2 = pj7Var;
                    szb szbVar2 = szbVar;
                    ib4 ib4Var2 = ib4Var;
                    if (iIntValue == 0) {
                        dd4Var2.f0(1137127905);
                        vo1.o(3072, ib4Var2, dd4Var2, tg9.c, t27Var2, pj7Var2, szbVar2);
                        dd4Var2.q(false);
                    } else if (iIntValue == 1) {
                        dd4Var2.f0(1137471416);
                        h67.i(t27Var2, pj7Var2, szbVar2, tg9.c, dd4Var2, 3072);
                        dd4Var2.q(false);
                    } else if (iIntValue == 2) {
                        dd4Var2.f0(1137763808);
                        p7c.F(3072, ib4Var2, dd4Var2, tg9.c, t27Var2, pj7Var2, szbVar2);
                        dd4Var2.q(false);
                    } else if (iIntValue == 3) {
                        dd4Var2.f0(1138184075);
                        int i5 = i2;
                        if (i5 == 0) {
                            dd4Var2.f0(1138173473);
                            ww1.z(48, ib4Var2, dd4Var2, tg9.c, t27Var2, pj7Var2, szbVar2);
                            dd4Var2.q(false);
                        } else if (i5 == 1) {
                            dd4Var2.f0(1138590175);
                            gx1.s(48, ib4Var2, dd4Var2, tg9.c, t27Var2, pj7Var2, szbVar2);
                            dd4Var2.q(false);
                        } else if (i5 == 2) {
                            dd4Var2.f0(1139008799);
                            cx1.s(48, ib4Var2, dd4Var2, tg9.c, t27Var2, pj7Var2, szbVar2);
                            dd4Var2.q(false);
                        } else if (i5 == 3) {
                            dd4Var2.f0(1139427423);
                            ex1.k(48, ib4Var2, dd4Var2, tg9.c, t27Var2, pj7Var2, szbVar2);
                            dd4Var2.q(false);
                        } else if (i5 != 4) {
                            dd4Var2.f0(1140243498);
                            dd4Var2.q(false);
                        } else {
                            dd4Var2.f0(1139846047);
                            lx1.q(48, ib4Var2, dd4Var2, tg9.c, t27Var2, pj7Var2, szbVar2);
                            dd4Var2.q(false);
                        }
                        dd4Var2.q(false);
                    } else if (iIntValue == 4) {
                        dd4Var2.f0(1140286402);
                        p7c.m(3072, ib4Var2, dd4Var2, tg9.c, t27Var2, pj7Var2, szbVar2);
                        dd4Var2.q(false);
                    } else if (iIntValue != 5) {
                        dd4Var2.f0(1140954762);
                        dd4Var2.q(false);
                    } else {
                        dd4Var2.f0(1140630595);
                        lc5.p(3072, ib4Var2, dd4Var2, tg9.c, t27Var2, pj7Var2, szbVar2);
                        dd4Var2.q(false);
                    }
                    return heb.a;
                }
            }, dd4Var), dd4Var, ((i4 >> 15) & Token.ASSIGN_MOD) | ((i4 >> 6) & 14) | 24576 | 100663296, 16108);
            z3 = true;
        } else {
            dd4Var.Y();
            z3 = z2;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new i71(t27Var, i2, zk7Var, z3, pj7Var, szbVar, ou6Var, ib4Var, i3);
        }
    }

    public static double p0(int i2) {
        double d2 = ((double) i2) / 255.0d;
        return (d2 <= 0.040449936d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public static final void q(defpackage.t27 r34, defpackage.ib4 r35, dd4 r36, int r37) {
        /*
            Method dump skipped, instruction units count: 1578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sdc.q(t27, ib4, dd4, int):void");
    }

    public static List q0(Object... objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]) : Collections.EMPTY_LIST;
    }

    public static final void r(a07 a07Var, boolean z2) {
        a07Var.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static jx1 r0(lt1 lt1Var, ix1 ix1Var) {
        ix1Var.getClass();
        if (ix1Var instanceof mx1) {
            mx1 mx1Var = (mx1) ix1Var;
            ix1 key = lt1Var.getKey();
            key.getClass();
            if (key != mx1Var && mx1Var.b != key) {
                return lt1Var;
            }
            if (((hx1) mx1Var.a.invoke((n0) lt1Var)) == null) {
                return lt1Var;
            }
        } else if (g83.d != ix1Var) {
            return lt1Var;
        }
        return hc3.a;
    }

    public static final void s(String str, int i2, boolean z2, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, dd4 dd4Var, int i3) {
        int i4;
        int i5;
        int i6;
        boolean z3;
        ib4 ib4Var5;
        boolean z4;
        dd4 dd4Var2 = dd4Var;
        xf0 xf0Var = bv4.d;
        dd4Var2.h0(77863633);
        if ((i3 & 6) == 0) {
            i4 = (dd4Var2.f(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= dd4Var2.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= dd4Var2.d(0) ? 256 : Token.CASE;
        }
        if ((i3 & 3072) == 0) {
            i4 |= dd4Var2.g(z2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= dd4Var2.f(ou6Var) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= dd4Var2.h(ib4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        int i7 = i4;
        if ((1572864 & i3) == 0) {
            i5 = i7 | (dd4Var2.h(ib4Var2) ? 1048576 : 524288);
        } else {
            i5 = i7;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= dd4Var2.h(ib4Var3) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= dd4Var2.h(ib4Var4) ? 67108864 : 33554432;
        }
        int i8 = i5;
        if (dd4Var2.V(i8 & 1, (i8 & 38347923) != 38347922)) {
            ou6 ou6VarH = tg9.h(ou6Var, 40.0f);
            wf0 wf0Var = bv4.x;
            eq8 eq8VarA = dq8.a(pv.e, wf0Var, dd4Var2, 54);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarH);
            ml1.k.getClass();
            ib4 ib4Var6 = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var6);
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
            lu6 lu6Var = lu6.a;
            ou6 ou6VarF0 = h67.f0(lu6Var, null, 3);
            eq8 eq8VarA2 = dq8.a(pv.a, wf0Var, dd4Var2, 48);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarF0);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var6);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA2);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            un9.a(dd4Var2, tg9.r(lu6Var, 4.0f));
            ou6 ou6VarN = tg9.n(lu6Var, 40.0f);
            rp8 rp8Var = tp8.a;
            ou6 ou6VarW = t96.w(ou6VarN, rp8Var);
            boolean z5 = (i8 & 458752) == 131072;
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z5 || objQ == obj) {
                objQ = new xf3(16, ib4Var);
                dd4Var2.p0(objQ);
            }
            mx4.a(i25.c((m53) f53.i0.getValue(), dd4Var2, 0), (String) null, gjb.l0(fw.J(null, (ib4) objQ, ou6VarW, false, 15), 10.0f), 0L, dd4Var2, 48, 8);
            if (z2) {
                xv5.y(dd4Var2, -1555220230, lu6Var, 4.0f, dd4Var2);
                ou6 ou6VarW2 = t96.w(tg9.n(lu6Var, 40.0f), rp8Var);
                boolean z6 = (i8 & 3670016) == 1048576;
                Object objQ2 = dd4Var2.Q();
                if (z6 || objQ2 == obj) {
                    objQ2 = new xf3(17, ib4Var2);
                    dd4Var2.p0(objQ2);
                }
                ou6 ou6VarL03 = gjb.l0(fw.J(null, (ib4) objQ2, ou6VarW2, false, 15), 10.0f);
                z3 = false;
                mx4.a(i25.c((m53) a53.a0.getValue(), dd4Var2, 0), (String) null, ou6VarL03, 0L, dd4Var2, 48, 8);
                dd4Var2.q(false);
            } else {
                z3 = false;
                dd4Var2.f0(-1554775287);
                dd4Var2.q(false);
            }
            ky0.A(dd4Var2, true, lu6Var, 4.0f, dd4Var2);
            xf0 xf0Var2 = bv4.b;
            ha6 ha6VarD = pn0.d(xf0Var2, z3);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL04 = s32.L0(dd4Var2, lu6Var);
            dd4Var2.j0();
            if (dd4Var2.S) {
                ib4Var5 = ib4Var6;
                dd4Var2.k(ib4Var5);
            } else {
                ib4Var5 = ib4Var6;
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ha6VarD);
            un9.s(jmVar2, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL04);
            ou6 ou6VarW3 = t96.w(tg9.n(lu6Var, 40.0f), rp8Var);
            boolean z7 = (i8 & 234881024) == 67108864;
            Object objQ3 = dd4Var2.Q();
            if (z7 || objQ3 == obj) {
                objQ3 = new xf3(18, ib4Var4);
                dd4Var2.p0(objQ3);
            }
            ib4 ib4Var7 = ib4Var5;
            mx4.a(i25.c((m53) f53.a.getValue(), dd4Var2, 0), (String) null, gjb.l0(fw.J(null, (ib4) objQ3, ou6VarW3, false, 15), 10.0f), 0L, dd4Var2, 48, 8);
            dd4Var2.f0(-1597729721);
            dd4Var2.q(false);
            dd4Var2.q(true);
            un9.a(dd4Var2, tg9.r(lu6Var, 4.0f));
            ou6 ou6VarN2 = tg9.n(lu6Var, 40.0f);
            ha6 ha6VarD2 = pn0.d(xf0Var2, false);
            int iHashCode4 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL4 = dd4Var2.l();
            ou6 ou6VarL05 = s32.L0(dd4Var2, ou6VarN2);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var7);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ha6VarD2);
            un9.s(jmVar2, dd4Var2, lr7VarL4);
            ky0.v(iHashCode4, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL05);
            px3 px3Var = tg9.c;
            ou6 ou6VarL = fe.L(t96.w(gjb.l0(px3Var, 6.0f), rp8Var), ((q96) dd4Var2.j(s96.a)).a.a, jf0.G);
            boolean z8 = (i8 & 29360128) == 8388608;
            Object objQ4 = dd4Var2.Q();
            if (z8 || objQ4 == obj) {
                objQ4 = new xf3(19, ib4Var3);
                dd4Var2.p0(objQ4);
            }
            ou6 ou6VarJ = fw.J(null, (ib4) objQ4, ou6VarL, false, 15);
            ha6 ha6VarD3 = pn0.d(xf0Var2, false);
            int iHashCode5 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL5 = dd4Var2.l();
            ou6 ou6VarL06 = s32.L0(dd4Var2, ou6VarJ);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var7);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ha6VarD3);
            un9.s(jmVar2, dd4Var2, lr7VarL5);
            ky0.v(iHashCode5, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL06);
            if (str.length() > 0) {
                dd4Var2.f0(-28308763);
                z4 = true;
                w05.a(str, ra1.d, false, null, null, px3Var, null, dd4Var2, (i8 & 14) | 1572912, 444);
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
            } else {
                z4 = true;
                dd4Var2.f0(-28088694);
                dd4Var2.q(false);
            }
            dd4Var2.q(z4);
            if (i2 > 0) {
                dd4Var2.f0(1956970028);
                i6 = i2;
                yb0.a(3072, 6, 0L, 0L, jf0.G(1458096826, new i51(i6, 5), dd4Var2), dd4Var, zn0.a.a(lu6Var, xf0Var));
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                i6 = i2;
                dd4Var2.f0(1957127632);
                dd4Var2.q(false);
            }
            dd4Var2.q(z4);
            dd4Var2.q(z4);
        } else {
            i6 = i2;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ao4(str, i6, z2, ou6Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, i3, 1);
        }
    }

    public static final zy5 s0(List list, boolean z2) {
        zy5 zy5VarN = gc1.N();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (i3 < list.size()) {
                zy5VarN.add(new hv6(((wp8) list.get(i2)).b(), ((wp8) list.get(i3)).b()));
            } else if (z2) {
                zy5VarN.add(new hv6(((wp8) list.get(i2)).b(), ((wp8) list.get(0)).b()));
            }
            i2 = i3;
        }
        return gc1.J(zy5VarN);
    }

    public static final void t(int i2, ib4 ib4Var, dd4 dd4Var, p35 p35Var, ou6 ou6Var, boolean z2) {
        ou6 ou6Var2;
        long j2;
        dd4Var.h0(1633554807);
        int i3 = (dd4Var.f(p35Var) ? 4 : 2) | i2 | (dd4Var.g(z2) ? 32 : 16) | 384 | (dd4Var.h(ib4Var) ? 2048 : 1024);
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            ou6 ou6Var3 = lu6.a;
            ou6 ou6VarP = t96.P(t96.w(tg9.h(ou6Var3, 40.0f), tp8.a), z2, new uo8(4), ib4Var);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarP);
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
            ou6 ou6VarA = zn0.a.a(gjb.l0(tg9.h(ou6Var3, 40.0f), 10.0f), bv4.f);
            if (z2) {
                dd4Var.f0(667434576);
                j2 = ((q96) dd4Var.j(s96.a)).a.a;
                dd4Var.q(false);
            } else {
                dd4Var.f0(667505070);
                j2 = ((q96) dd4Var.j(s96.a)).a.q;
                dd4Var.q(false);
            }
            mx4.a(p35Var, (String) null, ou6VarA, j2, dd4Var, (i3 & 14) | 48, 0);
            dd4Var.q(true);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new co4(p35Var, z2, ou6Var2, ib4Var, i2);
        }
    }

    public static final gk t0(ib4 ib4Var, dd4 dd4Var, int i2) {
        View view = (View) dd4Var.j(he.f);
        boolean zF = dd4Var.f(view);
        Object objQ = dd4Var.Q();
        Object obj = vl1.a;
        if (zF || objQ == obj) {
            objQ = new gk(view, null, ib4Var);
            dd4Var.p0(objQ);
        }
        gk gkVar = (gk) objQ;
        boolean zH = dd4Var.h(gkVar);
        Object objQ2 = dd4Var.Q();
        if (zH || objQ2 == obj) {
            objQ2 = new ak(gkVar, 3);
            dd4Var.p0(objQ2);
        }
        lc5.j(gkVar, (kb4) objQ2, dd4Var);
        return gkVar;
    }

    public static final void u(String str, int i2, boolean z2, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, dd4 dd4Var, int i3) {
        int i4;
        int i5;
        boolean z3;
        ib4 ib4Var5;
        int i6;
        boolean z4;
        dd4 dd4Var2 = dd4Var;
        xf0 xf0Var = bv4.d;
        dd4Var2.h0(-757787061);
        if ((i3 & 6) == 0) {
            i4 = (dd4Var2.f(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= dd4Var2.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= dd4Var2.d(0) ? 256 : Token.CASE;
        }
        if ((i3 & 3072) == 0) {
            i4 |= dd4Var2.g(z2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= dd4Var2.f(ou6Var) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= dd4Var2.h(ib4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i3) == 0) {
            i4 |= dd4Var2.h(ib4Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= dd4Var2.h(ib4Var3) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= dd4Var2.h(ib4Var4) ? 67108864 : 33554432;
        }
        int i7 = i4;
        if (dd4Var2.V(i7 & 1, (i7 & 38347923) != 38347922)) {
            ou6 ou6VarH = tg9.h(ou6Var, 40.0f);
            wf0 wf0Var = bv4.x;
            iv ivVar = pv.a;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarH);
            ml1.k.getClass();
            ib4 ib4Var6 = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var6);
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
            lu6 lu6Var = lu6.a;
            ou6 ou6VarF0 = h67.f0(lu6Var, null, 3);
            eq8 eq8VarA2 = dq8.a(ivVar, wf0Var, dd4Var2, 48);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarF0);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var6);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA2);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            ou6 ou6VarN = tg9.n(lu6Var, 40.0f);
            rp8 rp8Var = tp8.a;
            ou6 ou6VarW = t96.w(ou6VarN, rp8Var);
            boolean z5 = (i7 & 458752) == 131072;
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z5 || objQ == obj) {
                objQ = new xf3(12, ib4Var);
                dd4Var2.p0(objQ);
            }
            mx4.a(i25.c((m53) f53.i0.getValue(), dd4Var2, 0), (String) null, gjb.l0(fw.J(null, (ib4) objQ, ou6VarW, false, 15), 8.0f), 0L, dd4Var2, 48, 8);
            if (z2) {
                xv5.y(dd4Var2, 1608476506, lu6Var, 8.0f, dd4Var2);
                ou6 ou6VarW2 = t96.w(tg9.n(lu6Var, 40.0f), rp8Var);
                boolean z6 = (i7 & 3670016) == 1048576;
                Object objQ2 = dd4Var2.Q();
                if (z6 || objQ2 == obj) {
                    objQ2 = new xf3(13, ib4Var2);
                    dd4Var2.p0(objQ2);
                }
                z3 = false;
                mx4.a(i25.c((m53) a53.a0.getValue(), dd4Var2, 0), (String) null, gjb.l0(fw.J(null, (ib4) objQ2, ou6VarW2, false, 15), 8.0f), 0L, dd4Var2, 48, 8);
                dd4Var2.q(false);
            } else {
                z3 = false;
                dd4Var2.f0(1608896463);
                dd4Var2.q(false);
            }
            ky0.A(dd4Var2, true, lu6Var, 8.0f, dd4Var2);
            xf0 xf0Var2 = bv4.b;
            ha6 ha6VarD = pn0.d(xf0Var2, z3);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, lu6Var);
            dd4Var2.j0();
            if (dd4Var2.S) {
                ib4Var5 = ib4Var6;
                dd4Var2.k(ib4Var5);
            } else {
                ib4Var5 = ib4Var6;
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ha6VarD);
            un9.s(jmVar2, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            ou6 ou6VarW3 = t96.w(tg9.n(lu6Var, 40.0f), rp8Var);
            boolean z7 = (i7 & 29360128) == 8388608;
            Object objQ3 = dd4Var2.Q();
            if (z7 || objQ3 == obj) {
                objQ3 = new xf3(14, ib4Var3);
                dd4Var2.p0(objQ3);
            }
            ib4 ib4Var7 = ib4Var5;
            mx4.a(i25.c((m53) f53.a.getValue(), dd4Var2, 0), (String) null, gjb.l0(fw.J(null, (ib4) objQ3, ou6VarW3, false, 15), 8.0f), 0L, dd4Var2, 48, 8);
            dd4Var2.f0(-1890385715);
            dd4Var2.q(false);
            dd4Var2.q(true);
            un9.a(dd4Var2, tg9.r(lu6Var, 8.0f));
            ou6 ou6VarN2 = tg9.n(lu6Var, 40.0f);
            ha6 ha6VarD2 = pn0.d(xf0Var2, false);
            int iHashCode4 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL4 = dd4Var2.l();
            ou6 ou6VarL04 = s32.L0(dd4Var2, ou6VarN2);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var7);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ha6VarD2);
            un9.s(jmVar2, dd4Var2, lr7VarL4);
            ky0.v(iHashCode4, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL04);
            px3 px3Var = tg9.c;
            ou6 ou6VarL = fe.L(t96.w(gjb.l0(px3Var, 6.0f), rp8Var), ((q96) dd4Var2.j(s96.a)).a.a, jf0.G);
            boolean z8 = (i7 & 234881024) == 67108864;
            Object objQ4 = dd4Var2.Q();
            if (z8 || objQ4 == obj) {
                i6 = 15;
                objQ4 = new xf3(15, ib4Var4);
                dd4Var2.p0(objQ4);
            } else {
                i6 = 15;
            }
            ou6 ou6VarJ = fw.J(null, (ib4) objQ4, ou6VarL, false, i6);
            ha6 ha6VarD3 = pn0.d(xf0Var2, false);
            int iHashCode5 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL5 = dd4Var2.l();
            ou6 ou6VarL05 = s32.L0(dd4Var2, ou6VarJ);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var7);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, ha6VarD3);
            un9.s(jmVar2, dd4Var2, lr7VarL5);
            ky0.v(iHashCode5, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL05);
            if (str.length() > 0) {
                dd4Var2.f0(-1813494165);
                z4 = true;
                w05.a(str, ra1.d, false, null, null, px3Var, null, dd4Var2, (i7 & 14) | 1572912, 444);
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
            } else {
                z4 = true;
                dd4Var2.f0(-1813274096);
                dd4Var2.q(false);
            }
            dd4Var2.q(z4);
            if (i2 > 0) {
                dd4Var2.f0(1862470962);
                i5 = i2;
                yb0.a(3072, 6, 0L, 0L, jf0.G(-366578828, new i51(i5, 4), dd4Var2), dd4Var, zn0.a.a(lu6Var, xf0Var));
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                i5 = i2;
                dd4Var2.f0(1862628566);
                dd4Var2.q(false);
            }
            ky0.A(dd4Var2, z4, lu6Var, 8.0f, dd4Var2);
            dd4Var2.q(z4);
        } else {
            i5 = i2;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ao4(str, i5, z2, ou6Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, i3, 0);
        }
    }

    public static final hh u0(hh hhVar, long j2, float f2, float[] fArr) {
        u96.f(fArr);
        u96.h(fArr, Float.intBitsToFloat((int) (j2 >> 32)) * f2, Float.intBitsToFloat((int) (4294967295L & j2)) * f2);
        hhVar.o(fArr);
        hhVar.p(eb7.g(sg9.j(j2), hhVar.g().d()));
        return hhVar;
    }

    public static final void v(String str, int i2, int i3, List list, int i4, zk7 zk7Var, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, kb4 kb4Var, kb4 kb4Var2, ib4 ib4Var3, ib4 ib4Var4, dd4 dd4Var, int i5) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(264670988);
        int i6 = i5 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.d(i2) ? 32 : 16) | (dd4Var2.d(i3) ? 256 : 128) | (dd4Var2.h(list) ? 2048 : 1024) | (dd4Var2.d(i4) ? 16384 : 8192) | (dd4Var2.d(0) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.f(zk7Var) ? 1048576 : 524288) | (dd4Var2.h(ib4Var) ? 67108864 : 33554432) | (dd4Var2.h(ib4Var2) ? 536870912 : 268435456);
        int i7 = (dd4Var2.h(kb4Var) ? 4 : 2) | (dd4Var2.h(kb4Var2) ? 32 : 16) | (dd4Var2.h(ib4Var3) ? 256 : 128) | (dd4Var2.h(ib4Var4) ? 2048 : 1024);
        if (dd4Var2.V(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 1171) == 1170) ? false : true)) {
            ou6 ou6VarY = yn2.y(dd4Var2, ou6Var);
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
            ou6 ou6VarP0 = gjb.p0(gjb.n0(yib.B(tg9.f(lu6Var, 1.0f), 1), 12.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 6.0f, 5);
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
            String strK = wn9.K((pv9) iu9.o.getValue(), dd4Var2);
            uka ukaVar = ((q96) dd4Var2.j(s96.a)).b.g;
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            ou6 ou6VarP02 = gjb.p0(new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 12.0f, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            nha.c(strK, ou6VarP02.e(new bp5(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true)), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, ukaVar, dd4Var, 0, 24576, 114684);
            int iK = zk7Var.k();
            int i8 = i6 >> 9;
            int i9 = i7 << 15;
            s(str, i2, 2 <= iK && iK < 5, lu6Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, dd4Var, (i6 & 14) | 24576 | (i6 & Token.ASSIGN_MOD) | (i8 & 896) | (i8 & 458752) | (i8 & 3670016) | (i9 & 29360128) | (i9 & 234881024));
            dd4Var.q(true);
            dd4Var2 = dd4Var;
            o(i3, list, i4, zk7Var, gjb.p0(tg9.f(lu6Var, 1.0f), 12.0f, 0.0f, 12.0f, 6.0f, 2), kb4Var, kb4Var2, dd4Var2, ((i6 >> 6) & 1022) | (i8 & 7168) | (i9 & 458752) | (i9 & 3670016));
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new zn4(str, i2, i3, list, i4, zk7Var, ou6Var, ib4Var, ib4Var2, kb4Var, kb4Var2, ib4Var3, ib4Var4, i5, 1);
        }
    }

    public static final char[] v0(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = str.charAt(i2);
        }
        return cArr;
    }

    public static final void w(String str, int i2, int i3, List list, int i4, zk7 zk7Var, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, kb4 kb4Var, kb4 kb4Var2, ib4 ib4Var3, ib4 ib4Var4, dd4 dd4Var, int i5) {
        ou6 ou6Var2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1336002838);
        int i6 = i5 | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.d(i2) ? 32 : 16) | (dd4Var2.d(0) ? 256 : 128) | (dd4Var2.d(i3) ? 2048 : 1024) | (dd4Var2.h(list) ? 16384 : 8192) | (dd4Var2.d(i4) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.f(zk7Var) ? 1048576 : 524288) | (dd4Var2.h(ib4Var) ? 67108864 : 33554432) | (dd4Var2.h(ib4Var2) ? 536870912 : 268435456);
        int i7 = (dd4Var2.h(kb4Var) ? 4 : 2) | (dd4Var2.h(kb4Var2) ? 32 : 16) | (dd4Var2.h(ib4Var3) ? 256 : 128) | (dd4Var2.h(ib4Var4) ? 2048 : 1024);
        if (dd4Var2.V(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 1171) == 1170) ? false : true)) {
            ou6Var2 = ou6Var;
            ou6 ou6VarN0 = gjb.n0(yib.B(yn2.y(dd4Var2, ou6Var2), 1), 0.0f, 8.0f, 1);
            eq8 eq8VarA = dq8.a(pv.e, bv4.x, dd4Var2, 54);
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
            un9.s(ll1.f, dd4Var2, eq8VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            int i8 = i6 >> 9;
            int i9 = i7 << 15;
            o(i3, list, i4, zk7Var, new bp5(1.0f, true), kb4Var, kb4Var2, dd4Var2, (i9 & 458752) | (i8 & 8190) | (i9 & 3670016));
            int iK = zk7Var.k();
            u(str, i2, 2 <= iK && iK < 5, gjb.n0(lu6.a, 12.0f, 0.0f, 2), ib4Var, ib4Var2, ib4Var3, ib4Var4, dd4Var, (i6 & 14) | 24576 | (i6 & Token.ASSIGN_MOD) | (i6 & 896) | (i8 & 458752) | (i8 & 3670016) | (29360128 & i9) | (234881024 & i9));
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            ou6Var2 = ou6Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new zn4(str, i2, i3, list, i4, zk7Var, ou6Var2, ib4Var, ib4Var2, kb4Var, kb4Var2, ib4Var3, ib4Var4, i5, 0);
        }
    }

    public static double w0(double d2) {
        double d3 = (d2 + 16.0d) / 116.0d;
        double d4 = d3 * d3 * d3;
        if (d4 <= 0.008856451679035631d) {
            d4 = ((116.0d * d3) - 16.0d) / 903.2962962962963d;
        }
        return d4 * 100.0d;
    }

    public static final void x(List list, st5 st5Var, boolean z2, ou6 ou6Var, yb4 yb4Var, yb4 yb4Var2, zb4 zb4Var, ib4 ib4Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i2) {
        int i3;
        yb4 yb4Var3;
        yb4 yb4Var4;
        zb4 zb4Var2;
        ib4 ib4Var2;
        kb4 kb4Var3;
        kb4 kb4Var4;
        dd4Var.h0(1743768917);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.h(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(st5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.g(z2) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            yb4Var3 = yb4Var;
            i3 |= dd4Var.h(yb4Var3) ? 16384 : 8192;
        } else {
            yb4Var3 = yb4Var;
        }
        if ((196608 & i2) == 0) {
            yb4Var4 = yb4Var2;
            i3 |= dd4Var.h(yb4Var4) ? 131072 : Parser.ARGC_LIMIT;
        } else {
            yb4Var4 = yb4Var2;
        }
        if ((1572864 & i2) == 0) {
            zb4Var2 = zb4Var;
            i3 |= dd4Var.h(zb4Var2) ? 1048576 : 524288;
        } else {
            zb4Var2 = zb4Var;
        }
        if ((12582912 & i2) == 0) {
            ib4Var2 = ib4Var;
            i3 |= dd4Var.h(ib4Var2) ? 8388608 : 4194304;
        } else {
            ib4Var2 = ib4Var;
        }
        if ((100663296 & i2) == 0) {
            kb4Var3 = kb4Var;
            i3 |= dd4Var.h(kb4Var3) ? 67108864 : 33554432;
        } else {
            kb4Var3 = kb4Var;
        }
        if ((805306368 & i2) == 0) {
            kb4Var4 = kb4Var2;
            i3 |= dd4Var.h(kb4Var4) ? 536870912 : 268435456;
        } else {
            kb4Var4 = kb4Var2;
        }
        int i4 = i3;
        if (dd4Var.V(i4 & 1, (306783379 & i4) != 306783378)) {
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = dk9.x(Boolean.FALSE);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = dk9.n(new e51(st5Var, 11));
                dd4Var.p0(objQ2);
            }
            br9 br9Var = (br9) objQ2;
            Integer numValueOf = Integer.valueOf(((Number) br9Var.getValue()).intValue());
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj) {
                objQ3 = new l12(a07Var, null, 3);
                dd4Var.p0(objQ3);
            }
            lc5.u((yb4) objQ3, dd4Var, numValueOf);
            e(ou6Var, null, jf0.G(-1940410561, new gl7(st5Var, z2, list, yb4Var3, yb4Var4, zb4Var2, ib4Var2, kb4Var3, kb4Var4, a07Var, br9Var), dd4Var), dd4Var, ((i4 >> 9) & 14) | 3072, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new zt2(list, st5Var, z2, ou6Var, yb4Var, yb4Var2, zb4Var, ib4Var, kb4Var, kb4Var2, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
  0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.ClassLoader x0() {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sdc.x0():java.lang.ClassLoader");
    }

    public static final void y(final ou6 ou6Var, long j2, List list, dd4 dd4Var, final int i2, final int i3) {
        int i4;
        final long j3;
        final List list2;
        long jE;
        int i5;
        List list3;
        long j4;
        dd4Var.h0(387862047);
        if ((i2 & 6) == 0) {
            i4 = (dd4Var.f(ou6Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= ((i3 & 2) == 0 && dd4Var.e(j2)) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= Token.CASE;
        }
        if (dd4Var.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
            dd4Var.a0();
            if ((i2 & 1) == 0 || dd4Var.C()) {
                if ((i3 & 2) != 0) {
                    float f2 = d16.a;
                    jE = dd1.e(gc1.q, dd4Var);
                    i4 &= -113;
                } else {
                    jE = j2;
                }
                i5 = i4 & (-897);
                list3 = d16.c;
                j4 = jE;
            } else {
                dd4Var.Y();
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                }
                i5 = i4 & (-897);
                j4 = j2;
                list3 = list;
            }
            dd4Var.r();
            int i6 = i5;
            long j5 = lc1.j;
            float f3 = d16.a;
            z(ou6Var, j5, j4, n99.a(gc1.v, dd4Var), list3, dd4Var, ((i6 << 3) & 896) | (i6 & 14) | 48);
            j3 = j4;
            list2 = list3;
        } else {
            dd4Var.Y();
            j3 = j2;
            list2 = list;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: e16
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sdc.y(ou6Var, j3, list2, (dd4) obj, qu1.x0(i2 | 1), i3);
                    return heb.a;
                }
            };
        }
    }

    public static final void z(ou6 ou6Var, long j2, final long j3, t89 t89Var, List list, dd4 dd4Var, int i2) {
        int i3;
        List list2;
        final ym ymVar;
        boolean z2;
        dd4Var.h0(-1776169461);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(ou6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.e(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.e(j3) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.f(t89Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(list) ? 16384 : 8192;
        }
        if (!dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            dd4Var.Y();
        } else {
            if (list.size() <= 1) {
                gp.l("indicatorPolygons should have, at least, two RoundedPolygons");
                return;
            }
            boolean zF = dd4Var.f(list);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (zF || objQ == obj) {
                objQ = s0(list, true);
                dd4Var.p0(objQ);
            }
            List list3 = (List) objQ;
            boolean zF2 = dd4Var.f(list);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == obj) {
                objQ2 = Float.valueOf(f0(list) * d16.e);
                dd4Var.p0(objQ2);
            }
            final float fFloatValue = ((Number) objQ2).floatValue();
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj) {
                objQ3 = lc5.a(0.0f, 0.01f);
                dd4Var.p0(objQ3);
            }
            final ym ymVar2 = (ym) objQ3;
            Object objQ4 = dd4Var.Q();
            if (objQ4 == obj) {
                objQ4 = new ym7(90.0f);
                dd4Var.p0(objQ4);
            }
            final ym7 ym7Var = (ym7) objQ4;
            Object objQ5 = dd4Var.Q();
            if (objQ5 == obj) {
                objQ5 = lc5.a(0.0f, 0.01f);
                dd4Var.p0(objQ5);
            }
            ym ymVar3 = (ym) objQ5;
            boolean zF3 = dd4Var.f(list);
            Object objQ6 = dd4Var.Q();
            if (zF3 || objQ6 == obj) {
                objQ6 = new zm7(0);
                dd4Var.p0(objQ6);
            }
            final zm7 zm7Var = (zm7) objQ6;
            boolean zH = dd4Var.h(ymVar2) | dd4Var.f(zm7Var) | dd4Var.h(list3) | dd4Var.h(ymVar3);
            Object objQ7 = dd4Var.Q();
            if (zH || objQ7 == obj) {
                objQ7 = new k16(ymVar2, list3, zm7Var, ym7Var, ymVar3, null);
                list2 = list3;
                ymVar = ymVar3;
                dd4Var.p0(objQ7);
            } else {
                list2 = list3;
                ymVar = ymVar3;
            }
            lc5.u((yb4) objQ7, dd4Var, list);
            Object objQ8 = dd4Var.Q();
            if (objQ8 == obj) {
                objQ8 = mh.a();
                dd4Var.p0(objQ8);
            }
            final hh hhVar = (hh) objQ8;
            Object objQ9 = dd4Var.Q();
            if (objQ9 == obj) {
                u96 u96Var = new u96(u96.a());
                dd4Var.p0(u96Var);
                objQ9 = u96Var;
            }
            final float[] fArr = ((u96) objQ9).a;
            ou6 ou6VarL = fe.L(t96.w(tg9.o(a29.c(ou6Var, true, new f48(1)), d16.a, d16.b).e(tg9.c), t89Var), j2, jf0.G);
            ha6 ha6VarD = pn0.d(bv4.f, false);
            final List list4 = list2;
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
            un9.s(ll1.f, dd4Var, ha6VarD);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            ou6 ou6VarE0 = e0(1.0f, lu6.a, true);
            boolean zH2 = dd4Var.h(ymVar2) | dd4Var.h(ymVar) | dd4Var.h(list4) | dd4Var.f(zm7Var) | dd4Var.h(hhVar) | dd4Var.c(fFloatValue) | dd4Var.h(fArr) | ((i3 & 896) == 256);
            Object objQ10 = dd4Var.Q();
            if (zH2 || objQ10 == obj) {
                z2 = true;
                kb4 kb4Var = new kb4() { // from class: f16
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj2) {
                        List list5 = list4;
                        hh hhVar2 = hhVar;
                        float f2 = fFloatValue;
                        float[] fArr2 = fArr;
                        long j4 = j3;
                        zm7 zm7Var2 = zm7Var;
                        un5 un5Var = (un5) obj2;
                        float fFloatValue2 = ((Number) ymVar2.d()).floatValue();
                        float fH = ym7Var.h();
                        float fFloatValue3 = ((Number) ymVar.d()).floatValue() + fH + (90.0f * fFloatValue2);
                        long jA0 = un5Var.a.A0();
                        hy0 hy0Var = un5Var.a;
                        y91 y91Var = hy0Var.b;
                        long jG = y91Var.G();
                        y91Var.x().i();
                        try {
                            ((lp8) y91Var.b).x(fFloatValue3, jA0);
                            lw1.V((hv6) list5.get(zm7Var2.h()), fFloatValue2, hhVar2);
                            r43.Q0(un5Var, sdc.u0(hhVar2, hy0Var.f(), f2, fArr2), j4, 0.0f, ox3.a, 52);
                            j39.s(y91Var, jG);
                            return heb.a;
                        } catch (Throwable th) {
                            j39.s(y91Var, jG);
                            throw th;
                        }
                    }
                };
                dd4Var.p0(kb4Var);
                objQ10 = kb4Var;
            } else {
                z2 = true;
            }
            un9.a(dd4Var, md2.C(ou6VarE0, (kb4) objQ10));
            dd4Var.q(z2);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new g16(ou6Var, j2, j3, t89Var, list, i2);
        }
    }

    public abstract void g0(ue1 ue1Var, Set set);

    public abstract int h0(ue1 ue1Var);
}

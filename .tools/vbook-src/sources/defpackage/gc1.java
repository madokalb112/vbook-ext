package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Debug;
import android.text.TextPaint;
import android.util.Log;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class gc1 {
    public static final cd1 A;
    public static final cd1 B;
    public static final Object C;
    public static final String[] D;
    public static final String[] E;
    public static final String[] F;
    public static final String[] G;
    public static final rj1 e;
    public static final rj1 i;
    public static final rj1 n;
    public static final rj1 p;
    public static final cd1 q;
    public static final float r;
    public static final cd1 s;
    public static final cd1 t;
    public static final float u;
    public static final y89 v;
    public static final float w;
    public static final cd1 x;
    public static final cd1 y;
    public static final float z;
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final rj1 c = new rj1(new uj1(21), false, 1195690754);
    public static final rj1 d = new rj1(new bk1(7), false, -591632030);
    public static final rj1 f = new rj1(new bk1(10), false, -45746142);
    public static final rj1 g = new rj1(new hk1(14), false, 1356237545);
    public static final rj1 h = new rj1(new ik1(7), false, 2127518317);
    public static final rj1 j = new rj1(new jk1(18), false, 957826603);
    public static final rj1 k = new rj1(new jk1(19), false, 931185600);
    public static final rj1 l = new rj1(new jk1(20), false, 58775038);
    public static final rj1 m = new rj1(new bk1(2), false, 187405885);
    public static final rj1 o = new rj1(new pk1(12), false, 2033858726);

    static {
        int i2 = 11;
        e = new rj1(new vj1(i2), false, 725039233);
        int i3 = 8;
        i = new rj1(new ik1(i3), false, -1974049759);
        n = new rj1(new pk1(i2), false, 656566227);
        p = new rj1(new qk1(i3), false, -2133734189);
        cd1 cd1Var = cd1.u;
        q = cd1Var;
        r = 38.0f;
        s = cd1.c;
        t = cd1.v;
        u = 48.0f;
        v = y89.c;
        w = 48.0f;
        cd1 cd1Var2 = cd1.e;
        x = cd1Var2;
        y = cd1Var2;
        z = 20.0f;
        A = cd1Var;
        B = cd1.f;
        C = new Object();
        D = new String[]{"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_type", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};
        E = new String[]{"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_ct", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
        F = new String[]{"items"};
        G = new String[]{"affiliation", "coupon", "creative_name", "creative_slot", "currency", "_ct", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", ES6Iterator.VALUE_PROPERTY, "item_list", "checkout_step", "checkout_option", "item_location_id"};
    }

    public static final void A(int i2, int i3, kb4 kb4Var, dd4 dd4Var, ou6 ou6Var) {
        kb4Var.getClass();
        dd4Var.h0(1610131543);
        int i4 = i3 | (dd4Var.d(i2) ? 4 : 2) | (dd4Var.h(kb4Var) ? 256 : Token.CASE);
        if (dd4Var.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
            eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var, 0);
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
            un9.s(ll1.f, dd4Var, eq8VarA);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            hq8 hq8Var = hq8.a;
            lu6 lu6Var = lu6.a;
            ou6 ou6VarL02 = gjb.l0(hq8Var.b(1.0f, lu6Var, true), 4.0f);
            int i5 = i4 & 896;
            boolean z2 = i5 == 256;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = new ir6(20, kb4Var);
                dd4Var.p0(objQ);
            }
            w(0, dd4Var, yn2.s(ou6VarL02, false, 0.0f, (ib4) objQ, 3), i2 == 0);
            ou6 ou6VarL03 = gjb.l0(hq8Var.b(1.0f, lu6Var, true), 4.0f);
            boolean z3 = i5 == 256;
            Object objQ2 = dd4Var.Q();
            if (z3 || objQ2 == obj) {
                objQ2 = new ir6(21, kb4Var);
                dd4Var.p0(objQ2);
            }
            x(0, dd4Var, yn2.s(ou6VarL03, false, 0.0f, (ib4) objQ2, 3), i2 == 1);
            ou6 ou6VarL04 = gjb.l0(hq8Var.b(1.0f, lu6Var, true), 4.0f);
            boolean z4 = i5 == 256;
            Object objQ3 = dd4Var.Q();
            if (z4 || objQ3 == obj) {
                objQ3 = new ir6(22, kb4Var);
                dd4Var.p0(objQ3);
            }
            y(0, dd4Var, yn2.s(ou6VarL04, false, 0.0f, (ib4) objQ3, 3), i2 == 2);
            ou6 ou6VarL05 = gjb.l0(hq8Var.b(1.0f, lu6Var, true), 4.0f);
            boolean z5 = i5 == 256;
            Object objQ4 = dd4Var.Q();
            if (z5 || objQ4 == obj) {
                objQ4 = new ir6(23, kb4Var);
                dd4Var.p0(objQ4);
            }
            z(0, dd4Var, yn2.s(ou6VarL05, false, 0.0f, (ib4) objQ4, 3), i2 == 3);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new jy0(i2, ou6Var, kb4Var, i3, 6);
        }
    }

    public static final void B(e8a e8aVar, pj7 pj7Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i2) {
        int i3;
        e8a e8aVar2;
        ib4 ib4Var3;
        String strK;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-370592156);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.h(e8aVar) ? 4 : 2) | i2;
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
            i3 |= dd4Var2.h(ib4Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= dd4Var2.h(ib4Var2) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if (dd4Var2.V(i4 & 1, (i4 & 38347923) != 38347922)) {
            ou6 ou6VarQ = kc5.Q(ou6Var.e(tg9.c), kc5.J(dd4Var2), 14);
            vf0 vf0Var = bv4.z;
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var2, 0);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarQ);
            ml1.k.getClass();
            ib4 ib4Var4 = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var4);
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
            nha.c(wn9.K((pv9) vu9.h0.getValue(), dd4Var2), gjb.l0(lu6Var, 16.0f), s00.o(dd4Var2).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).h, dd4Var, 48, 0, 131064);
            ou6 ou6VarW = t96.w(gjb.n0(tg9.f(lu6Var, 1.0f), 16.0f, 0.0f, 2), s00.p(dd4Var).d);
            ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarW);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var4);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA2);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL02);
            boolean z2 = e8aVar.a;
            String strK2 = wn9.K((pv9) ev9.k.getValue(), dd4Var);
            String strK3 = wn9.K((pv9) ev9.l.getValue(), dd4Var);
            ou6 ou6VarW2 = t96.w(lu6Var, s00.p(dd4Var).a);
            long jG = dd1.g(s00.o(dd4Var), 1.0f);
            lp4 lp4Var = jf0.G;
            e11.x(null, strK2, strK3, gjb.m0(fe.L(ou6VarW2, jG, lp4Var), 16.0f, 12.0f), false, z2, kb4Var, dd4Var, (i4 << 9) & 3670016, 17);
            un9.a(dd4Var, tg9.h(lu6Var, 4.0f));
            e11.x(null, wn9.K((pv9) ev9.E.getValue(), dd4Var), wn9.K((pv9) ev9.F.getValue(), dd4Var), gjb.m0(ky0.h(dd4Var, 1.0f, t96.w(lu6Var, s00.p(dd4Var).a), lp4Var), 16.0f, 12.0f), false, !e8aVar.d, kb4Var4, dd4Var, i4 & 3670016, 17);
            xv5.z(dd4Var, true, lu6Var, 12.0f, dd4Var);
            nha.c(wn9.K((pv9) ev9.A.getValue(), dd4Var), gjb.l0(lu6Var, 16.0f), s00.o(dd4Var).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).h, dd4Var, 48, 0, 131064);
            ou6 ou6VarW3 = t96.w(gjb.n0(tg9.f(lu6Var, 1.0f), 16.0f, 0.0f, 2), s00.p(dd4Var).d);
            ie1 ie1VarA3 = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarW3);
            dd4Var.j0();
            if (dd4Var.S) {
                ib4Var3 = ib4Var4;
                dd4Var.k(ib4Var3);
            } else {
                ib4Var3 = ib4Var4;
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA3);
            un9.s(jmVar2, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL03);
            e11.x(null, wn9.K((pv9) ev9.m.getValue(), dd4Var), wn9.K((pv9) ev9.n.getValue(), dd4Var), gjb.m0(ky0.h(dd4Var, 1.0f, t96.w(lu6Var, s00.p(dd4Var).a), lp4Var), 16.0f, 12.0f), false, !e8aVar.b, kb4Var2, dd4Var, (i4 << 6) & 3670016, 17);
            xv5.z(dd4Var, true, lu6Var, 12.0f, dd4Var);
            ib4 ib4Var5 = ib4Var3;
            nha.c(wn9.K((pv9) ev9.z.getValue(), dd4Var), gjb.l0(lu6Var, 16.0f), s00.o(dd4Var).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).h, dd4Var, 48, 0, 131064);
            ou6 ou6VarW4 = t96.w(gjb.n0(tg9.f(lu6Var, 1.0f), 16.0f, 0.0f, 2), s00.p(dd4Var).d);
            ie1 ie1VarA4 = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode4 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL4 = dd4Var.l();
            ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarW4);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var5);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA4);
            un9.s(jmVar2, dd4Var, lr7VarL4);
            ky0.v(iHashCode4, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL04);
            e11.x(null, wn9.K((pv9) ev9.h.getValue(), dd4Var), wn9.K((pv9) ev9.i.getValue(), dd4Var), gjb.m0(ky0.h(dd4Var, 1.0f, t96.w(lu6Var, s00.p(dd4Var).a), lp4Var), 16.0f, 12.0f), false, e8aVar.c, kb4Var3, dd4Var, (i4 << 3) & 3670016, 17);
            xv5.z(dd4Var, true, lu6Var, 12.0f, dd4Var);
            nha.c(wn9.K((pv9) ev9.y.getValue(), dd4Var), gjb.l0(lu6Var, 16.0f), s00.o(dd4Var).a, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).h, dd4Var, 48, 0, 131064);
            ou6 ou6VarW5 = t96.w(gjb.n0(tg9.f(lu6Var, 1.0f), 16.0f, 0.0f, 2), s00.p(dd4Var).d);
            ie1 ie1VarA5 = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode5 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL5 = dd4Var.l();
            ou6 ou6VarL05 = s32.L0(dd4Var, ou6VarW5);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var5);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA5);
            un9.s(jmVar2, dd4Var, lr7VarL5);
            ky0.v(iHashCode5, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL05);
            e8aVar2 = e8aVar;
            e11.v(null, wn9.K((pv9) ev9.G.getValue(), dd4Var), wn9.L((pv9) ev9.H.getValue(), new Object[]{Integer.valueOf(e8aVar2.h.size())}, dd4Var), gjb.m0(ky0.h(dd4Var, 1.0f, t96.w(lu6Var, s00.p(dd4Var).a), lp4Var), 16.0f, 12.0f), ib4Var, dd4Var, (i4 >> 9) & 57344, 1);
            un9.a(dd4Var, tg9.h(lu6Var, 4.0f));
            String strK4 = wn9.K((pv9) ev9.o.getValue(), dd4Var);
            if (e8aVar2.e) {
                dd4Var.f0(1467926974);
                strK = wn9.K((pv9) mu9.v.getValue(), dd4Var);
                dd4Var.q(false);
            } else {
                dd4Var.f0(1468001405);
                strK = wn9.K((pv9) mu9.s.getValue(), dd4Var);
                dd4Var.q(false);
            }
            e11.v(null, strK4, dx1.h(strK, " - ", wn9.L((pv9) ev9.p.getValue(), new Object[]{Integer.valueOf(e8aVar2.g.size())}, dd4Var)), gjb.m0(ky0.h(dd4Var, 1.0f, t96.w(lu6Var, s00.p(dd4Var).a), lp4Var), 16.0f, 12.0f), ib4Var2, dd4Var, (i4 >> 12) & 57344, 1);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
            un9.a(dd4Var2, yib.B(gjb.p0(lu6Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), 8));
            dd4Var2.q(true);
        } else {
            e8aVar2 = e8aVar;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fl0(e8aVar2, pj7Var, ou6Var, kb4Var, kb4Var2, kb4Var3, kb4Var4, ib4Var, ib4Var2, i2, 11);
        }
    }

    public static final void C(t27 t27Var, dd4 dd4Var, int i2) {
        t27Var.getClass();
        dd4Var.h0(-883703675);
        int i3 = 2;
        int i4 = (dd4Var.f(t27Var) ? 4 : 2) | i2;
        if (dd4Var.V(i4 & 1, (i4 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            h8a h8aVar = (h8a) ((qtb) qx1.N(ug8.a(h8a.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(h8aVar.f, dd4Var);
            boolean zF = dd4Var.f(h8aVar);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                objQ = new q7a(h8aVar, null, i3);
                dd4Var.p0(objQ);
            }
            lc5.u((yb4) objQ, dd4Var, heb.a);
            gx1.p(wn9.K((pv9) ru9.D0.getValue(), dd4Var), tg9.c, false, jf0.G(-864026879, new oe9(t27Var, 11), dd4Var), null, jf0.G(-2100136241, new ak0(15, h8aVar, t27Var, a07VarB), dd4Var), dd4Var, 199728, 20);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new oe9(i2, 10, t27Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02c7 A[EDGE_INSN: B:188:0x02c7->B:98:0x02c7 BREAK  A[LOOP:1: B:92:0x02ad->B:97:0x02c4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void D(java.lang.String r49, java.util.List r50, java.util.List r51, ou6 r52, defpackage.kb4 r53, defpackage.zb4 r54, defpackage.ac4 r55, defpackage.kb4 r56, dd4 r57, int r58) {
        /*
            Method dump skipped, instruction units count: 1318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc1.D(java.lang.String, java.util.List, java.util.List, ou6, kb4, zb4, ac4, kb4, dd4, int):void");
    }

    public static ArrayList E(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList((Collection) new sv(objArr, true));
    }

    public static int F(kb4 kb4Var, List list, int i2) {
        list.getClass();
        d0(list.size(), i2);
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int iIntValue = ((Number) kb4Var.invoke(list.get(i5))).intValue();
            if (iIntValue < 0) {
                i4 = i5 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static int G(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        d0(arrayList.size(), size);
        int i2 = size - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int iO = t1c.O((Comparable) arrayList.get(i4), comparable);
            if (iO < 0) {
                i3 = i4 + 1;
            } else {
                if (iO <= 0) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final Integer I(int i2) {
        return new Integer(i2);
    }

    public static zy5 J(List list) {
        list.getClass();
        zy5 zy5Var = (zy5) list;
        zy5Var.g();
        zy5Var.c = true;
        return zy5Var.b > 0 ? zy5Var : zy5.d;
    }

    public static synchronized long K(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static void L(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                Log.e("FirebaseCrashlytics", str, e2);
            }
        }
    }

    public static int M(Iterable iterable, int i2) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }

    public static zy5 N() {
        return new zy5(10);
    }

    public static ArrayList O(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            fc1.p0(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    public static final xg5 P(r31 r31Var, String str) {
        str.getClass();
        Charset charsetForName = Charset.forName(str);
        charsetForName.getClass();
        return new xg5(charsetForName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int Q() {
        boolean zW = W();
        ?? r0 = zW;
        if (X()) {
            r0 = (zW ? 1 : 0) | 2;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? r0 | 4 : r0;
    }

    public static ha5 R(Collection collection) {
        collection.getClass();
        return new ha5(0, collection.size() - 1, 1);
    }

    public static int S(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static int T(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        if (i2 > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i2);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    public static String U(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            int i3 = i2 * 2;
            char[] cArr2 = a;
            cArr[i3] = cArr2[(b2 & 255) >>> 4];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static ou6 V(ou6 ou6Var, yy6 yy6Var) {
        return ou6Var.e(new sp4(yy6Var));
    }

    public static boolean W() {
        if (Build.PRODUCT.contains("sdk")) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains("goldfish") || str.contains("ranchu");
    }

    public static boolean X() {
        boolean zW = W();
        String str = Build.TAGS;
        if ((zW || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zW && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static List Y(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static List Z(Object... objArr) {
        if (objArr.length <= 0) {
            return lc3.a;
        }
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static final void a(String str, ou6 ou6Var, dd4 dd4Var, int i2) {
        str.getClass();
        dd4Var.h0(-1737118665);
        int i3 = i2 & 1;
        int i4 = 0;
        if (dd4Var.V(i3, i3 != 0)) {
            ou6Var = lu6.a;
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new l8(str, ou6Var, i2, i4);
        }
    }

    public static ArrayList a0(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList((Collection) new sv(objArr, true));
    }

    public static final void b(ux uxVar, ou6 ou6Var, dd4 dd4Var, int i2, int i3) {
        int i4;
        xf0 xf0Var = bv4.f;
        qr1 qr1Var = ra1.v;
        dd4Var.h0(1236588022);
        int i5 = (dd4Var.f(uxVar) ? 4 : 2) | i2;
        if ((i2 & 384) == 0) {
            i5 |= dd4Var.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i5 |= dd4Var.h(px.H) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= dd4Var.h((Object) null) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= dd4Var.f(xf0Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i5 |= dd4Var.f(qr1Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= dd4Var.c(1.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i5 |= dd4Var.f((Object) null) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i5 |= dd4Var.d(1) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i4 = i3 | (dd4Var.g(true) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if (dd4Var.V(i5 & 1, ((306783379 & i5) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            a25 a25Var = uxVar.a;
            int i6 = qjb.b;
            dd4Var.f0(-329318062);
            dd4Var.f0(-1008942344);
            if (a25Var.s.i != null) {
                dd4Var.f0(-1008902292);
                dd4Var.q(false);
                dd4Var.q(false);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1008854118);
                boolean z2 = ra1.v == ra1.u;
                boolean zG = dd4Var.g(z2);
                Object objQ = dd4Var.Q();
                fu6 fu6Var = vl1.a;
                if (zG || objQ == fu6Var) {
                    objQ = z2 ? zg9.p : new xp1();
                    dd4Var.p0(objQ);
                }
                zg9 zg9Var = (zg9) objQ;
                boolean zF = dd4Var.f(a25Var) | dd4Var.f(zg9Var);
                Object objQ2 = dd4Var.Q();
                if (zF || objQ2 == fu6Var) {
                    w15 w15VarA = a25.a(a25Var);
                    w15VarA.n = zg9Var;
                    objQ2 = w15VarA.a();
                    dd4Var.p0(objQ2);
                }
                a25Var = (a25) objQ2;
                tw2.x(dd4Var, false, false, false);
            }
            qjb.e(a25Var);
            ou6 ou6VarE = ou6Var.e(new or1(a25Var, uxVar.c, uxVar.b, qjb.a(dd4Var)));
            ef efVar = ef.m;
            int iHashCode = Long.hashCode(dd4Var.T);
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarE);
            lr7 lr7VarL = dd4Var.l();
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(ll1.f, dd4Var, efVar);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            jm jmVar = ll1.g;
            if (dd4Var.S || !lc5.Q(dd4Var.Q(), Integer.valueOf(iHashCode))) {
                dd4Var.p0(Integer.valueOf(iHashCode));
                dd4Var.b(Integer.valueOf(iHashCode), jmVar);
            }
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new hx(uxVar, ou6Var, i2, i3, 0);
        }
    }

    public static final List b0(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : Y(list.get(0)) : lc3.a;
    }

    public static final void c(a25 a25Var, b15 b15Var, ou6 ou6Var, dd4 dd4Var, int i2) {
        b(new ux((ix) dd4Var.j(q16.a), b15Var, a25Var), ou6Var, dd4Var, ((i2 >> 3) & 896) | 1572912, 0);
    }

    public static ou6 c0(ou6 ou6Var, ul7 ul7Var, f9 f9Var, sr1 sr1Var, float f2, qc1 qc1Var, int i2) {
        if ((i2 & 4) != 0) {
            f9Var = bv4.f;
        }
        f9 f9Var2 = f9Var;
        if ((i2 & 16) != 0) {
            f2 = 1.0f;
        }
        return ou6Var.e(new vl7(ul7Var, f9Var2, sr1Var, f2, qc1Var));
    }

    public static final void d(z50 z50Var, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i2) {
        ou6Var.getClass();
        dd4Var.h0(279020156);
        int i3 = 2;
        int i4 = 4;
        int i5 = i2 | (dd4Var.f(z50Var) ? 4 : 2) | (dd4Var.h(kb4Var) ? 256 : Token.CASE);
        int i6 = 1;
        if (!dd4Var.V(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
            dd4Var.Y();
        } else if (((Boolean) z50Var.e.getValue()).booleanValue()) {
            dd4Var.f0(1527966080);
            Object[] objArr = new Object[0];
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new qv(22);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new qv(24);
                dd4Var.p0(objQ2);
            }
            a07 a07Var2 = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var, 48);
            Boolean bool = (Boolean) a07Var.getValue();
            bool.booleanValue();
            boolean zF = dd4Var.f(a07Var2) | dd4Var.f(a07Var);
            Object objQ3 = dd4Var.Q();
            if (zF || objQ3 == obj) {
                objQ3 = new r50(a07Var2, a07Var, null, i6);
                dd4Var.p0(objQ3);
            }
            lc5.u((yb4) objQ3, dd4Var, bool);
            px3 px3Var = tg9.c;
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, px3Var);
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
            if (z50Var.b()) {
                dd4Var.f0(1549926677);
                boolean zF2 = dd4Var.f(a07Var);
                Object objQ4 = dd4Var.Q();
                if (zF2 || objQ4 == obj) {
                    objQ4 = new ik(a07Var, i3);
                    dd4Var.p0(objQ4);
                }
                j(z50Var, ou6Var, (ib4) objQ4, dd4Var, i5 & Token.ELSE);
                dd4Var.q(false);
            } else {
                dd4Var.f0(1550204282);
                boolean zF3 = dd4Var.f(a07Var);
                Object objQ5 = dd4Var.Q();
                if (zF3 || objQ5 == obj) {
                    objQ5 = new ik(a07Var, i4);
                    dd4Var.p0(objQ5);
                }
                v(z50Var, ou6Var, (ib4) objQ5, dd4Var, i5 & Token.ELSE);
                dd4Var.q(false);
            }
            boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
            boolean zC = z50Var.c();
            float fFloatValue = ((Number) z50Var.h.getValue()).floatValue();
            ou6 ou6VarM0 = gjb.m0(tg9.t(yib.B(zn0.a.a(lu6.a, bv4.u), 15), 0.0f, 460.0f, 1), 24.0f, 12.0f);
            int i7 = i5 & 14;
            boolean z2 = ((i5 & 896) == 256) | (i7 == 4);
            Object objQ6 = dd4Var.Q();
            if (z2 || objQ6 == obj) {
                objQ6 = new v(5, z50Var, kb4Var);
                dd4Var.p0(objQ6);
            }
            kb4 kb4Var2 = (kb4) objQ6;
            boolean z3 = i7 == 4;
            Object objQ7 = dd4Var.Q();
            if (z3 || objQ7 == obj) {
                objQ7 = new q50(z50Var, 0);
                dd4Var.p0(objQ7);
            }
            ib4 ib4Var = (ib4) objQ7;
            boolean z4 = i7 == 4;
            Object objQ8 = dd4Var.Q();
            if (z4 || objQ8 == obj) {
                objQ8 = new q50(z50Var, 1);
                dd4Var.p0(objQ8);
            }
            ib4 ib4Var2 = (ib4) objQ8;
            boolean z5 = i7 == 4;
            Object objQ9 = dd4Var.Q();
            if (z5 || objQ9 == obj) {
                objQ9 = new q50(z50Var, i3);
                dd4Var.p0(objQ9);
            }
            t96.c(zBooleanValue, zC, fFloatValue, ou6VarM0, kb4Var2, ib4Var, ib4Var2, (ib4) objQ9, dd4Var, 0);
            dd4Var.q(true);
            dd4Var.q(false);
        } else {
            dd4Var.f0(1529755462);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new mt(z50Var, ou6Var, kb4Var, i2, 7);
        }
    }

    public static final void d0(int i2, int i3) {
        if (i3 < 0) {
            gp.l(xv5.k(i3, "fromIndex (0) is greater than toIndex (", ")."));
        } else {
            if (i3 <= i2) {
                return;
            }
            k27.m(xv5.j(i3, i2, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static final void e(final fo8 fo8Var, final ou6 ou6Var, final boolean z2, final uka ukaVar, final qj5 qj5Var, final nj5 nj5Var, final int i2, final int i3, final int i4, kb4 kb4Var, final yy6 yy6Var, final xk9 xk9Var, final rj1 rj1Var, final rj7 rj7Var, dd4 dd4Var, final int i5) {
        final kb4 kb4Var2;
        kb4 kb4Var3;
        ur9 ur9Var;
        pn2 pn2Var;
        zm5 zm5Var;
        yy6 yy6Var2;
        ur9 ur9Var2;
        xn8 xn8Var;
        dd4 dd4Var2 = dd4Var;
        fo8Var.getClass();
        dd4Var2.h0(-1073681541);
        int i6 = 0;
        int i7 = i5 | (dd4Var2.h(fo8Var) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.g(z2) ? 256 : Token.CASE) | (dd4Var2.g(false) ? 2048 : 1024) | (dd4Var2.f(ukaVar) ? 16384 : 8192) | (dd4Var2.f(qj5Var) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var2.f(nj5Var) ? 1048576 : 524288) | (dd4Var2.g(false) ? 8388608 : 4194304) | 100663296 | (dd4Var2.d(i2) ? 536870912 : 268435456);
        int i8 = 0 | (dd4Var2.d(i3) ? (char) 4 : (char) 2) | (dd4Var2.d(i4) ? ' ' : (char) 16) | 384 | (dd4Var2.f(yy6Var) ? (char) 2048 : (char) 1024) | (dd4Var2.f(xk9Var) ? (char) 16384 : (char) 8192) | (dd4Var2.f(rj7Var) ? (char) 0 : (char) 0);
        if (dd4Var2.V(i7 & 1, ((i7 & 306783379) == 306783378 && (599187 & i8) == 599186) ? false : true)) {
            dd4Var2.a0();
            int i9 = i5 & 1;
            Object obj = vl1.a;
            if (i9 == 0 || dd4Var2.C()) {
                Object objQ = dd4Var2.Q();
                if (objQ == obj) {
                    objQ = new e4(23);
                    dd4Var2.p0(objQ);
                }
                kb4Var3 = (kb4) objQ;
            } else {
                dd4Var2.Y();
                kb4Var3 = kb4Var;
            }
            dd4Var2.r();
            pn2 pn2Var2 = (pn2) dd4Var2.j(xm1.h);
            final uka ukaVar2 = (uka) dd4Var2.j(nha.a);
            zm5 zm5Var2 = (zm5) dd4Var2.j(xm1.n);
            ur9 ur9Var3 = xm1.f;
            ga1 ga1Var = (ga1) dd4Var2.j(ur9Var3);
            boolean zF = dd4Var2.f(fo8Var);
            Object objQ2 = dd4Var2.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new xn8(fo8Var, ga1Var);
                dd4Var2.p0(objQ2);
            }
            xn8 xn8Var2 = (xn8) objQ2;
            boolean zH = dd4Var2.h(fo8Var);
            Object objQ3 = dd4Var2.Q();
            if (zH || objQ3 == obj) {
                ur9Var = ur9Var3;
                objQ3 = new ne0(fo8Var, null, i6);
                dd4Var2.p0(objQ3);
            } else {
                ur9Var = ur9Var3;
            }
            lc5.u((yb4) objQ3, dd4Var2, false);
            dd4Var2.f0(-1423971485);
            boolean zF2 = dd4Var2.f(pn2Var2) | ((i8 & 7168) == 2048) | ((i8 & 3670016) == 1048576) | dd4Var2.d(zm5Var2.ordinal()) | dd4Var2.h(fo8Var);
            Object objQ4 = dd4Var2.Q();
            if (zF2 || objQ4 == obj) {
                pn2Var = pn2Var2;
                zm5Var = zm5Var2;
                yy6Var2 = yy6Var;
                ur9Var2 = ur9Var;
                xn8Var = xn8Var2;
                ug ugVar = new ug(yy6Var2, pn2Var, fo8Var, rj7Var, zm5Var, null, 1);
                dd4Var2.p0(ugVar);
                objQ4 = ugVar;
            } else {
                zm5Var = zm5Var2;
                pn2Var = pn2Var2;
                yy6Var2 = yy6Var;
                ur9Var2 = ur9Var;
                xn8Var = xn8Var2;
            }
            lc5.u((yb4) objQ4, dd4Var2, yy6Var2);
            dd4Var2.q(false);
            final pn2 pn2Var3 = pn2Var;
            final zm5 zm5Var3 = zm5Var;
            final yy6 yy6Var3 = yy6Var2;
            final kb4 kb4Var4 = kb4Var3;
            dd4Var2 = dd4Var;
            jv3.e(ur9Var2.a(xn8Var), jf0.G(82407483, new yb4() { // from class: le0
                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    dd4 dd4Var3 = (dd4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    int i10 = 1;
                    if (dd4Var3.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                        fo8 fo8Var2 = fo8Var;
                        wga wgaVarK = fo8Var2.k();
                        boolean zG = dd4Var3.g(false);
                        int i11 = i4;
                        boolean zD = zG | dd4Var3.d(i11) | dd4Var3.h(fo8Var2);
                        Object objQ5 = dd4Var3.Q();
                        Object obj4 = vl1.a;
                        int i12 = 3;
                        if (zD || objQ5 == obj4) {
                            objQ5 = new gi(i11, fo8Var2, 3);
                            dd4Var3.p0(objQ5);
                        }
                        kb4 kb4Var5 = (kb4) objQ5;
                        rj7 rj7Var2 = rj7Var;
                        float f2 = rj7Var2.b;
                        pn2 pn2Var4 = pn2Var3;
                        float fK0 = pn2Var4.k0(f2);
                        zm5 zm5Var4 = zm5Var3;
                        float fK02 = pn2Var4.k0(gjb.W(rj7Var2, zm5Var4));
                        ou6 ou6Var2 = ou6Var;
                        ou6Var2.getClass();
                        ou6 ou6VarA = md2.A(ou6Var2, new h90(fK0, fK02, i10, fo8Var2));
                        dd4Var3.f0(-1719287985);
                        dd4Var3.q(false);
                        lu6 lu6Var = lu6.a;
                        ou6 ou6VarE = ou6VarA.e(lu6Var);
                        dd4Var3.f0(-1718969460);
                        Object objQ6 = dd4Var3.Q();
                        if (objQ6 == obj4) {
                            objQ6 = lc5.Z(dd4Var3);
                            dd4Var3.p0(objQ6);
                        }
                        ukaVar2.getClass();
                        zm5Var4.getClass();
                        ((vx1) objQ6).getClass();
                        dd4Var3.q(false);
                        ou6 ou6VarE2 = ou6VarE.e(lu6Var);
                        yub yubVar = (yub) fo8Var2.b.getValue();
                        boolean zH2 = dd4Var3.h(fo8Var2) | dd4Var3.f(pn2Var4);
                        kb4 kb4Var6 = kb4Var4;
                        boolean zF3 = zH2 | dd4Var3.f(kb4Var6);
                        Object objQ7 = dd4Var3.Q();
                        if (zF3 || objQ7 == obj4) {
                            objQ7 = new v6(i12, fo8Var2, pn2Var4, kb4Var6);
                            dd4Var3.p0(objQ7);
                        }
                        te0.a(wgaVarK, kb4Var5, ou6VarE2, z2, false, ukaVar, qj5Var, nj5Var, false, i2, i3, yubVar, (kb4) objQ7, yy6Var3, xk9Var, rj1Var, dd4Var3, 0, 0, 0);
                    } else {
                        dd4Var3.Y();
                    }
                    return heb.a;
                }
            }, dd4Var2), dd4Var2, 56);
            kb4Var2 = kb4Var4;
        } else {
            dd4Var2.Y();
            kb4Var2 = kb4Var;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(ou6Var, z2, ukaVar, qj5Var, nj5Var, i2, i3, i4, kb4Var2, yy6Var, xk9Var, rj1Var, rj7Var, i5) { // from class: me0
                public final /* synthetic */ ou6 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ uka d;
                public final /* synthetic */ qj5 e;
                public final /* synthetic */ nj5 f;
                public final /* synthetic */ int s;
                public final /* synthetic */ int t;
                public final /* synthetic */ int u;
                public final /* synthetic */ kb4 v;
                public final /* synthetic */ yy6 w;
                public final /* synthetic */ xk9 x;
                public final /* synthetic */ rj1 y;
                public final /* synthetic */ rj7 z;

                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(9);
                    gc1.e(this.a, this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, (dd4) obj2, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final Object e0(Object obj) {
        return obj instanceof ei1 ? e11.I(((ei1) obj).a) : obj;
    }

    public static final void f(boolean z2, zd1 zd1Var, ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        String str = zd1Var.b;
        dd4Var2.h0(2142623335);
        int i3 = i2 | (dd4Var2.g(z2) ? 4 : 2) | (dd4Var2.f(zd1Var) ? 32 : 16) | (dd4Var2.f(ou6Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            String str2 = zd1Var.c;
            boolean zF = dd4Var2.f(str);
            Object objQ = dd4Var2.Q();
            fu6 fu6Var = vl1.a;
            if (zF || objQ == fu6Var) {
                lc1 lc1Var = new lc1(kf0.H(str));
                dd4Var2.p0(lc1Var);
                objQ = lc1Var;
            }
            long j2 = ((lc1) objQ).a;
            boolean zF2 = dd4Var2.f(str2);
            Object objQ2 = dd4Var2.Q();
            if (zF2 || objQ2 == fu6Var) {
                lc1 lc1Var2 = new lc1(kf0.H(str2));
                dd4Var2.p0(lc1Var2);
                objQ2 = lc1Var2;
            }
            long j3 = ((lc1) objQ2).a;
            ur9 ur9Var = s96.a;
            ou6 ou6VarG = fw.G(t96.w(ou6Var, ((q96) dd4Var2.j(ur9Var)).c.a), z2 ? 2.0f : 1.5f, z2 ? j2 : j3, ((q96) dd4Var2.j(ur9Var)).c.a);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarG);
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
            ym9.a(384, j3, dd4Var2, tg9.c, zd1Var.d);
            nha.c("Aa", zn0.a.a(lu6.a, bv4.f), j2, (g60) null, wn9.x(20), (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, (uka) null, dd4Var, 24582, 0, 262120);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new i41(z2, zd1Var, ou6Var, i2, 6);
        }
    }

    public static final void f0(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255.0f));
    }

    public static final void g(int i2, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, ou6 ou6Var, String str) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-895135892);
        int i3 = i2 | (dd4Var2.f(str) ? 4 : 2);
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
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
            dd4Var2.f0(-1433947880);
            String strK = bw9.a0(str) ? wn9.K((pv9) eu9.D.getValue(), dd4Var2) : str;
            dd4Var2.q(false);
            nha.c(strK, (ou6) null, 0L, (g60) null, wn9.x(20), (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.j, dd4Var, 24576, 0, 130030);
            dd4Var2 = dd4Var;
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var2, tg9.h(lu6Var, 24.0f));
            kc5.n(i25.c((m53) f53.d0.getValue(), dd4Var2, 0), wn9.K((pv9) mu9.Q.getValue(), dd4Var2), false, null, null, null, null, null, ib4Var, dd4Var2, 100663296, 252);
            un9.a(dd4Var2, tg9.h(lu6Var, 12.0f));
            kc5.n(i25.c((m53) f53.C.getValue(), dd4Var2, 0), wn9.K((pv9) mu9.z.getValue(), dd4Var2), false, null, null, null, null, null, ib4Var2, dd4Var2, 100663296, 252);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xf1(str, ib4Var, ib4Var2, ou6Var, i2);
        }
    }

    public static String g0(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return U(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e2);
            return "";
        }
    }

    public static final void h(int i2, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, String str) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(332055188);
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
            uka ukaVar = ((q96) dd4Var2.j(s96.a)).b.g;
            lu6 lu6Var = lu6.a;
            nha.c(str, gjb.l0(lu6Var, 24.0f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, (i3 & 14) | 48, 0, 130044);
            sdc.y(tg9.n(lu6Var, 48.0f), ((lc1) dd4Var.j(oq1.a)).a, null, dd4Var, 6, 4);
            dd4Var.q(true);
            p35 p35VarC = i25.c((m53) a53.d.getValue(), dd4Var, 0);
            ou6 ou6VarH0 = lc5.h0(lu6Var);
            boolean z2 = (i3 & 896) == 256;
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new m50(28, ib4Var);
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
            ye8VarU.d = new gv0(str, ou6Var, ib4Var, i2, 2);
        }
    }

    public static String h0(FileInputStream fileInputStream) {
        Scanner scannerUseDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        try {
            String next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
            scannerUseDelimiter.close();
            return next;
        } catch (Throwable th) {
            if (scannerUseDelimiter != null) {
                try {
                    scannerUseDelimiter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static final void i(String str, t27 t27Var, ou6 ou6Var, dd4 dd4Var, int i2) {
        int i3;
        dd4 dd4Var2;
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(-2057058970);
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
                objQ = new wj0(str, 5);
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
            a91 a91VarA = ug8.a(wf1.class);
            wf1 wf1Var = (wf1) ((qtb) qx1.N(a91VarA, pj4VarA.f(), dx1.h(a91VarA.f(), "-", str), ry6VarD, ev8VarA, ib4Var));
            boolean zF = dd4Var.f(wf1Var);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new f0(wf1Var, 15);
                dd4Var.p0(objQ2);
            }
            lx1.g(wf1Var, null, (kb4) objQ2, dd4Var, 0);
            a07 a07VarB = bx1.B(wf1Var.X, dd4Var);
            a07 a07VarB2 = bx1.B(wf1Var.M, dd4Var);
            fx1.p(((zy4) a07VarB2.getValue()).e, ((zy4) a07VarB2.getValue()).q, ((zy4) a07VarB2.getValue()).i, ((zy4) a07VarB2.getValue()).j, dd4Var, 0);
            dd4Var2 = dd4Var;
            lw1.e((zy4) a07VarB2.getValue(), jf0.G(-1959485406, new ev0(ou6Var, t27Var, wf1Var, a07VarB, 1), dd4Var2), dd4Var2, 48);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fv0(str, t27Var, ou6Var, i2, 1);
        }
    }

    public static void i0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final void j(z50 z50Var, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        int i3;
        dd4Var.h0(-332203879);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(z50Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 256 : Token.CASE;
        }
        int i4 = 0;
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            boolean z2 = (i3 & 896) == 256;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = new s50(i4, ib4Var);
                dd4Var.p0(objQ);
            }
            ou6 ou6VarB = r1a.b(ou6Var, heb.a, (PointerInputEventHandler) objQ);
            boolean z3 = (i3 & 14) == 4;
            Object objQ2 = dd4Var.Q();
            if (z3 || objQ2 == obj) {
                objQ2 = new zf(z50Var, 1);
                dd4Var.p0(objQ2);
            }
            pn0.a(r1a.b(ou6VarB, z50Var, (PointerInputEventHandler) objQ2), dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new n50(z50Var, ou6Var, ib4Var, i2, 1);
        }
    }

    public static Object j0(bv0 bv0Var, um umVar, fc7 fc7Var) {
        wq0 wq0VarB = bv0Var.f().b();
        nz8 nz8VarA0 = wq0VarB.a0(1);
        byte[] bArr = nz8VarA0.a;
        int i2 = nz8VarA0.c;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i2, bArr.length - i2);
        byteBufferWrap.getClass();
        umVar.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i2;
        if (iPosition == 1) {
            nz8VarA0.c += iPosition;
            wq0VarB.c += (long) iPosition;
        } else {
            if (iPosition < 0 || iPosition > nz8VarA0.a()) {
                StringBuilder sbU = xv5.u(iPosition, "Invalid number of bytes written: ", ". Should be in 0..");
                sbU.append(nz8VarA0.a());
                throw new IllegalStateException(sbU.toString().toString());
            }
            if (iPosition != 0) {
                nz8VarA0.c += iPosition;
                wq0VarB.c += (long) iPosition;
            } else if (i12.T(nz8VarA0)) {
                wq0VarB.N();
            }
        }
        Object objC = bv0Var.c(fc7Var);
        return objC == xx1.a ? objC : heb.a;
    }

    public static final void k(String str, String str2, t27 t27Var, pj7 pj7Var, szb szbVar, ou6 ou6Var, dd4 dd4Var, int i2) {
        ou6 ou6Var2;
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(906637377);
        int i3 = i2 | (dd4Var.f(str) ? 4 : 2) | (dd4Var.f(str2) ? 32 : 16) | (dd4Var.f(t27Var) ? 256 : Token.CASE) | (dd4Var.f(pj7Var) ? 2048 : 1024) | (dd4Var.f(szbVar) ? 16384 : 8192);
        int i4 = 0;
        int i5 = 1;
        if (dd4Var.V(i3 & 1, (74899 & i3) != 74898)) {
            String strH = dx1.h(str, "-", str2);
            int i6 = i3 & 14;
            boolean z2 = (i6 == 4) | ((i3 & Token.ASSIGN_MOD) == 32);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = new lq2(str, str2, i5);
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
            a91 a91VarA = ug8.a(pz5.class);
            pz5 pz5Var = (pz5) ((qtb) qx1.N(a91VarA, pj4VarA.f(), dx1.h(a91VarA.f(), "-", strH), ry6VarD, ev8VarA, ib4Var));
            a07 a07VarB = bx1.B(pz5Var.N, dd4Var);
            Object[] objArr = {str + "-" + str2 + "-" + ((lz5) a07VarB.getValue()).a};
            rt8 rt8Var = wq5.w;
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new bs2(8);
                dd4Var.p0(objQ2);
            }
            wq5 wq5Var = (wq5) ww1.d0(objArr, rt8Var, (ib4) objQ2, dd4Var, 384);
            boolean zF = dd4Var.f(pz5Var);
            Object objQ3 = dd4Var.Q();
            if (zF || objQ3 == obj) {
                objQ3 = new rb2(pz5Var, 27);
                dd4Var.p0(objQ3);
            }
            jt1 jt1Var = null;
            lx1.g(pz5Var, null, (kb4) objQ3, dd4Var, 0);
            boolean zF2 = dd4Var.f(pz5Var);
            Object objQ4 = dd4Var.Q();
            if (zF2 || objQ4 == obj) {
                objQ4 = new mv2(pz5Var, jt1Var, i4);
                dd4Var.p0(objQ4);
            }
            lc5.u((yb4) objQ4, dd4Var, heb.a);
            lz5 lz5Var = (lz5) a07VarB.getValue();
            ou6Var2 = ou6Var;
            ou6 ou6VarE = ou6Var2.e(tg9.c);
            int i7 = i3 & 896;
            boolean z3 = (i7 == 256) | (i6 == 4);
            Object objQ5 = dd4Var.Q();
            if (z3 || objQ5 == obj) {
                objQ5 = new fu2(t27Var, str, 2);
                dd4Var.p0(objQ5);
            }
            kb4 kb4Var = (kb4) objQ5;
            boolean zF3 = (i7 == 256) | dd4Var.f(a07VarB);
            Object objQ6 = dd4Var.Q();
            if (zF3 || objQ6 == obj) {
                objQ6 = new xj0(t27Var, a07VarB, 10);
                dd4Var.p0(objQ6);
            }
            ib4 ib4Var2 = (ib4) objQ6;
            boolean zF4 = dd4Var.f(pz5Var);
            Object objQ7 = dd4Var.Q();
            if (zF4 || objQ7 == obj) {
                objQ7 = new lv2(pz5Var, 0);
                dd4Var.p0(objQ7);
            }
            ib4 ib4Var3 = (ib4) objQ7;
            boolean zF5 = dd4Var.f(pz5Var);
            Object objQ8 = dd4Var.Q();
            if (zF5 || objQ8 == obj) {
                objQ8 = new lv2(pz5Var, 1);
                dd4Var.p0(objQ8);
            }
            e11.l(lz5Var, wq5Var, ou6VarE, pj7Var, szbVar, kb4Var, ib4Var2, ib4Var3, (ib4) objQ8, dd4Var, i3 & 64512);
        } else {
            ou6Var2 = ou6Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uq6(str, str2, t27Var, pj7Var, szbVar, ou6Var2, i2, 1);
        }
    }

    public static final Object k0(bv0 bv0Var, ByteBuffer byteBuffer, kt1 kt1Var) {
        bg9 bg9VarF = bv0Var.f();
        bg9VarF.getClass();
        byteBuffer.getClass();
        long j2 = bg9VarF.b().c;
        wq0 wq0VarB = bg9VarF.b();
        wq0VarB.getClass();
        int iRemaining = byteBuffer.remaining();
        while (iRemaining > 0) {
            nz8 nz8VarA0 = wq0VarB.a0(1);
            byte[] bArr = nz8VarA0.a;
            int i2 = nz8VarA0.c;
            int iMin = Math.min(iRemaining, bArr.length - i2);
            byteBuffer.get(bArr, i2, iMin);
            if (iMin == 1) {
                nz8VarA0.c += iMin;
                wq0VarB.c += (long) iMin;
            } else {
                if (iMin < 0 || iMin > nz8VarA0.a()) {
                    StringBuilder sbU = xv5.u(iMin, "Invalid number of bytes written: ", ". Should be in 0..");
                    sbU.append(nz8VarA0.a());
                    throw new IllegalStateException(sbU.toString().toString());
                }
                if (iMin != 0) {
                    nz8VarA0.c += iMin;
                    wq0VarB.c += (long) iMin;
                } else if (i12.T(nz8VarA0)) {
                    wq0VarB.N();
                }
            }
            iRemaining -= iMin;
        }
        long j3 = bg9VarF.b().c;
        bg9VarF.t0();
        Object objC = bv0Var.c(kt1Var);
        return objC == xx1.a ? objC : heb.a;
    }

    public static final void l(to3 to3Var, wm3 wm3Var, boolean z2, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i2, int i3) {
        boolean z3;
        int i4;
        ib4 ib4Var2;
        boolean z4;
        m53 m53Var;
        long jC;
        long j2;
        ib4 ib4Var3;
        boolean z5;
        yb4 yb4Var;
        kd kdVar;
        boolean z6;
        float f2;
        jm jmVar;
        String upperCase;
        to3 to3Var2 = to3Var;
        dd4 dd4Var2 = dd4Var;
        xf0 xf0Var = bv4.f;
        dd4Var2.h0(1442359588);
        int i5 = i2 | (dd4Var2.f(to3Var2) ? 4 : 2);
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 = i5 | 384;
            z3 = z2;
        } else {
            z3 = z2;
            i4 = i5 | (dd4Var2.g(z3) ? 256 : Token.CASE);
        }
        int i7 = i4 | (dd4Var2.f(ou6Var) ? 2048 : 1024) | (dd4Var2.h(ib4Var) ? 16384 : 8192);
        if (dd4Var2.V(i7 & 1, (i7 & 9363) != 9362)) {
            boolean z7 = i6 != 0 ? false : z3;
            int iOrdinal = wm3Var.ordinal();
            if (iOrdinal == 0) {
                m53Var = (m53) a53.L.getValue();
            } else if (iOrdinal == 1) {
                m53Var = (m53) a53.H.getValue();
            } else {
                if (iOrdinal != 2) {
                    mn5.g();
                    return;
                }
                m53Var = (m53) h53.q.getValue();
            }
            int[] iArr = zq3.a;
            if (iArr[wm3Var.ordinal()] == 2) {
                dd4Var2.f0(-1166855401);
                jC = lc1.c(0.35f, ((q96) dd4Var2.j(s96.a)).a.y);
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-1166853420);
                jC = ((q96) dd4Var2.j(s96.a)).a.c;
                dd4Var2.q(false);
            }
            if (iArr[wm3Var.ordinal()] == 2) {
                dd4Var2.f0(-1166849367);
                j2 = ((q96) dd4Var2.j(s96.a)).a.w;
                dd4Var2.q(false);
            } else {
                dd4Var2.f0(-1166847818);
                j2 = ((q96) dd4Var2.j(s96.a)).a.d;
                dd4Var2.q(false);
            }
            long j3 = j2;
            wf0 wf0Var = bv4.x;
            iv ivVar = pv.a;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var);
            ml1.k.getClass();
            ib4 ib4Var4 = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var4);
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
            m53 m53Var2 = m53Var;
            String str = to3Var2.a;
            String str2 = to3Var2.k;
            po3 po3Var = new po3(to3Var2.r, str, to3Var2.c);
            qr1 qr1Var = ra1.d;
            lu6 lu6Var = lu6.a;
            long j4 = jC;
            w05.a(po3Var, qr1Var, false, null, kl8.h, t96.w(tg9.n(lu6Var, 60.0f), s00.p(dd4Var2).d), null, dd4Var, 196656, 412);
            bp5 bp5VarF = j39.f(lu6Var, 14.0f, dd4Var, 1.0f, true);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, bp5VarF);
            dd4Var.j0();
            if (dd4Var.S) {
                ib4Var3 = ib4Var4;
                dd4Var.k(ib4Var3);
            } else {
                ib4Var3 = ib4Var4;
                dd4Var.s0();
            }
            un9.s(jmVar2, dd4Var, ie1VarA);
            un9.s(jmVar3, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar4, dd4Var, kdVar2);
            un9.s(yb4Var2, dd4Var, ou6VarL02);
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            eq8 eq8VarA2 = dq8.a(ivVar, wf0Var, dd4Var, 48);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarF);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var3);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar2, dd4Var, eq8VarA2);
            un9.s(jmVar3, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar4, dd4Var, kdVar2);
            un9.s(yb4Var2, dd4Var, ou6VarL03);
            if (str2.length() > 0) {
                dd4Var.f0(1539138699);
                w05.e(str2, tg9.n(lu6Var, 24.0f), dd4Var, 48);
                un9.a(dd4Var, tg9.r(lu6Var, 8.0f));
                z5 = false;
                dd4Var.q(false);
            } else {
                z5 = false;
                dd4Var.f0(1539370300);
                dd4Var.q(false);
            }
            ib4 ib4Var5 = ib4Var3;
            nha.c(to3Var2.b, kf0.v(tg9.f(lu6Var, 1.0f)), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, uka.a(s00.q(dd4Var).j, 0L, 0L, a84.u, (c64) null, 0L, 0L, (iy5) null, 16777211), dd4Var, 48, 24576, 114684);
            xv5.z(dd4Var, true, lu6Var, 6.0f, dd4Var);
            ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
            eq8 eq8VarA3 = dq8.a(ivVar, wf0Var, dd4Var, 48);
            int iHashCode4 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL4 = dd4Var.l();
            ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarF2);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var5);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar2, dd4Var, eq8VarA3);
            un9.s(jmVar3, dd4Var, lr7VarL4);
            ky0.v(iHashCode4, dd4Var, jmVar4, dd4Var, kdVar2);
            un9.s(yb4Var2, dd4Var, ou6VarL04);
            to3Var2 = to3Var;
            if (to3Var2.n) {
                dd4Var.f0(-768355307);
                kdVar = kdVar2;
                f2 = 4.0f;
                yb4Var = yb4Var2;
                o("DEV", null, s00.o(dd4Var).l, s00.o(dd4Var).m, dd4Var, 6, 2);
                un9.a(dd4Var, tg9.r(lu6Var, 4.0f));
                z6 = false;
                dd4Var.q(false);
            } else {
                yb4Var = yb4Var2;
                kdVar = kdVar2;
                z6 = false;
                f2 = 4.0f;
                dd4Var.f0(-768018957);
                dd4Var.q(false);
            }
            if (to3Var2.h) {
                dd4Var.f0(-767970535);
                jmVar = jmVar4;
                o("18+", null, lc1.f, lc1.e, dd4Var, 3462, 2);
                un9.a(dd4Var, tg9.r(lu6Var, f2));
                dd4Var.q(z6);
            } else {
                jmVar = jmVar4;
                dd4Var.f0(-767699533);
                dd4Var.q(z6);
            }
            String str3 = (String) fc1.A0(to3Var2.i - 1, wm9.r((hv9) rv.c.getValue(), dd4Var));
            if (str3 != null) {
                upperCase = str3.toUpperCase(Locale.ROOT);
                upperCase.getClass();
            } else {
                upperCase = null;
            }
            if (upperCase == null) {
                upperCase = "";
            }
            o(upperCase, null, 0L, 0L, dd4Var, 0, 14);
            un9.a(dd4Var, tg9.r(lu6Var, f2));
            o(to3Var2.f, null, 0L, 0L, dd4Var, 0, 14);
            xv5.z(dd4Var, true, lu6Var, f2, dd4Var);
            kd kdVar3 = kdVar;
            nha.c(to3Var2.d, (ou6) null, lc1.c(0.5f, ((lc1) dd4Var.j(oq1.a)).a), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, s00.q(dd4Var).l, dd4Var, 0, 24960, 110586);
            dd4Var.q(true);
            ou6 ou6VarL = fe.L(t96.w(h67.f0(tg9.n(lu6Var, 32.0f), null, 3), s00.p(dd4Var).d), j4, jf0.G);
            boolean z8 = (i7 & 57344) == 16384;
            Object objQ = dd4Var.Q();
            if (z8 || objQ == vl1.a) {
                ib4Var2 = ib4Var;
                objQ = new xf3(5, ib4Var2);
                dd4Var.p0(objQ);
            } else {
                ib4Var2 = ib4Var;
            }
            ou6 ou6VarJ = fw.J(null, (ib4) objQ, ou6VarL, false, 15);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode5 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL5 = dd4Var.l();
            ou6 ou6VarL05 = s32.L0(dd4Var, ou6VarJ);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(ib4Var5);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar2, dd4Var, ha6VarD);
            un9.s(jmVar3, dd4Var, lr7VarL5);
            ky0.v(iHashCode5, dd4Var, jmVar, dd4Var, kdVar3);
            un9.s(yb4Var, dd4Var, ou6VarL05);
            zn0 zn0Var = zn0.a;
            if (z7) {
                dd4Var.f0(63444124);
                sdc.y(zn0Var.a(tg9.n(lu6Var, 28.0f), xf0Var), s00.o(dd4Var).d, null, dd4Var, 0, 4);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            } else {
                dd4Var.f0(63734687);
                mx4.a(i25.c(m53Var2, dd4Var, 0), (String) null, zn0Var.a(tg9.n(lu6Var, 26.0f), xf0Var), j3, dd4Var, 48, 0);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
            dd4Var2.q(true);
            z4 = z7;
        } else {
            ib4Var2 = ib4Var;
            dd4Var2.Y();
            z4 = z3;
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new bu2(to3Var2, wm3Var, z4, ou6Var, ib4Var2, i2, i3);
        }
    }

    public static final void m(String str, kr3 kr3Var, pj7 pj7Var, ou6 ou6Var, kb4 kb4Var, ib4 ib4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, dd4 dd4Var, int i2) {
        int i3;
        ib4 ib4Var2;
        pj7 pj7Var2;
        kr3 kr3Var2;
        br9 br9Var;
        yb4 yb4Var;
        yb4 yb4Var2;
        yb4 yb4Var3;
        kd kdVar;
        ib4 ib4Var3;
        ou6 ou6Var2;
        kv kvVar;
        nv nvVar;
        jm jmVar;
        ou6 ou6Var3;
        boolean z2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(363295813);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var2.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var2.f(kr3Var) ? 32 : 16;
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
            ib4Var2 = ib4Var;
            i3 |= dd4Var2.h(ib4Var2) ? 131072 : Parser.ARGC_LIMIT;
        } else {
            ib4Var2 = ib4Var;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var2.h(kb4Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= dd4Var2.h(kb4Var3) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= dd4Var2.h(kb4Var4) ? 67108864 : 33554432;
        }
        if (dd4Var2.V(i3 & 1, (i3 & 38347923) != 38347922)) {
            Object[] objArr = new Object[0];
            boolean z3 = (i3 & 14) == 4;
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z3 || objQ == obj) {
                objQ = new wj0(str, 25);
                dd4Var2.p0(objQ);
            }
            br9 br9VarA0 = ww1.a0(objArr, (ib4) objQ, dd4Var2, 0);
            wq5 wq5VarA = yq5.a(dd4Var2);
            a07 a07VarA = dk9.A(kb4Var, dd4Var2);
            String str2 = ((wga) br9VarA0.getValue()).a.b;
            boolean zF = dd4Var2.f(a07VarA) | dd4Var2.f(br9VarA0);
            Object objQ2 = dd4Var2.Q();
            jt1 jt1Var = null;
            if (zF || objQ2 == obj) {
                objQ2 = new pg(a07VarA, br9VarA0, jt1Var, 12);
                dd4Var2.p0(objQ2);
            }
            lc5.u((yb4) objQ2, dd4Var2, str2);
            Integer numValueOf = Integer.valueOf(kr3Var.j.size());
            int i4 = i3 & Token.ASSIGN_MOD;
            boolean zF2 = (i4 == 32) | dd4Var2.f(wq5VarA);
            Object objQ3 = dd4Var2.Q();
            if (zF2 || objQ3 == obj) {
                objQ3 = new et1(kr3Var, wq5VarA, jt1Var, 27);
                dd4Var2.p0(objQ3);
            }
            lc5.u((yb4) objQ3, dd4Var2, numValueOf);
            Set set = kr3Var.i;
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6Var);
            ml1.k.getClass();
            ib4 ib4Var4 = ll1.b;
            dd4Var2.j0();
            int i5 = i3;
            if (dd4Var2.S) {
                dd4Var2.k(ib4Var4);
            } else {
                dd4Var2.s0();
            }
            yb4 yb4Var4 = ll1.f;
            un9.s(yb4Var4, dd4Var2, ha6VarD);
            yb4 yb4Var5 = ll1.e;
            un9.s(yb4Var5, dd4Var2, lr7VarL);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            jm jmVar2 = ll1.g;
            un9.s(jmVar2, dd4Var2, numValueOf2);
            kd kdVar2 = ll1.h;
            un9.r(dd4Var2, kdVar2);
            yb4 yb4Var6 = ll1.d;
            un9.s(yb4Var6, dd4Var2, ou6VarL0);
            szb szbVarW = yib.w(pj7Var, yib.e(dd4Var2, 14));
            ou6 ou6Var4 = tg9.c;
            ou6 ou6VarE = yn2.E(ou6Var4, dd4Var2, 6);
            pj7 pj7VarM = yib.m(szbVarW, 16.0f, 76.0f, 16.0f, 12.0f, dd4Var2, 28080, 0);
            pj7 pj7VarM2 = yib.m(szbVarW, 0.0f, 68.0f, 4.0f, 8.0f, dd4Var, 28032, 1);
            yh4 yh4Var = new yh4(320.0f);
            kv mvVar = new mv(8.0f, true, new gp(5));
            nv mvVar2 = new mv(8.0f, true, new gp(5));
            boolean zH = (i4 == 32) | ((i5 & 458752) == 131072) | dd4Var.h(set) | ((i5 & 234881024) == 67108864) | ((i5 & 3670016) == 1048576) | ((i5 & 29360128) == 8388608);
            Object objQ4 = dd4Var.Q();
            if (zH || objQ4 == obj) {
                kr3Var2 = kr3Var;
                br9Var = br9VarA0;
                yb4Var = yb4Var5;
                yb4Var2 = yb4Var4;
                yb4Var3 = yb4Var6;
                kdVar = kdVar2;
                ib4Var3 = ib4Var4;
                ou6Var2 = ou6Var4;
                kvVar = mvVar;
                nvVar = mvVar2;
                jmVar = jmVar2;
                pm0 pm0Var = new pm0(kr3Var2, ib4Var2, set, kb4Var4, kb4Var2, kb4Var3, 5);
                dd4Var.p0(pm0Var);
                objQ4 = pm0Var;
            } else {
                kr3Var2 = kr3Var;
                br9Var = br9VarA0;
                yb4Var = yb4Var5;
                yb4Var2 = yb4Var4;
                yb4Var3 = yb4Var6;
                kdVar = kdVar2;
                ib4Var3 = ib4Var4;
                ou6Var2 = ou6Var4;
                kvVar = mvVar;
                nvVar = mvVar2;
                jmVar = jmVar2;
            }
            Object obj2 = obj;
            gx1.i(yh4Var, ou6VarE, wq5VarA, pj7VarM, nvVar, kvVar, null, false, 0L, 0L, pj7VarM2, 0.0f, (kb4) objQ4, dd4Var, 1769472, 0, 6032);
            dd4Var2 = dd4Var;
            int length = ((wga) br9Var.getValue()).a.b.length();
            ou6 ou6Var5 = lu6.a;
            if (length > 0 && kr3Var2.j.isEmpty() && kr3Var2.k.isEmpty() && kr3Var2.l.isEmpty()) {
                dd4Var2.f0(320229148);
                dd4Var2 = dd4Var;
                ou6 ou6VarK0 = gjb.k0(ou6Var2, yib.m(szbVarW, 0.0f, 68.0f, 0.0f, 0.0f, dd4Var, 384, 13));
                ie1 ie1VarA = ge1.a(pv.e, bv4.A, dd4Var2, 54);
                int iHashCode2 = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL2 = dd4Var2.l();
                ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarK0);
                dd4Var2.j0();
                if (dd4Var2.S) {
                    dd4Var2.k(ib4Var3);
                } else {
                    dd4Var2.s0();
                }
                un9.s(yb4Var2, dd4Var2, ie1VarA);
                un9.s(yb4Var, dd4Var2, lr7VarL2);
                ky0.v(iHashCode2, dd4Var2, jmVar, dd4Var2, kdVar);
                un9.s(yb4Var3, dd4Var2, ou6VarL02);
                i12.f(lx1.n0(dd4Var2), tg9.o(ou6Var5, 250.0f, 200.0f), (gh0) null, dd4Var2, 432, 120);
                ou6Var3 = ou6Var5;
                obj2 = obj2;
                nha.c(wn9.K((pv9) mu9.Z.getValue(), dd4Var2), gjb.n0(ou6Var5, 24.0f, 0.0f, 2), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(s96.a)).b.f, dd4Var2, 48, 0, 130044);
                z2 = true;
                dd4Var2.q(true);
                dd4Var2.q(false);
            } else {
                ou6Var3 = ou6Var5;
                z2 = true;
                dd4Var2.f0(321004675);
                dd4Var2.q(false);
            }
            wga wgaVar = (wga) br9Var.getValue();
            String strK = wn9.K((pv9) mu9.b0.getValue(), dd4Var2);
            long jG = dd1.g(((q96) dd4Var2.j(s96.a)).a, 6.0f);
            pj7Var2 = pj7Var;
            ou6 ou6VarB = yib.B(gjb.m0(gjb.k0(tg9.f(ou6Var3, 1.0f), pj7Var2), 16.0f, 10.0f), 6);
            br9 br9Var2 = br9Var;
            boolean zF3 = dd4Var2.f(br9Var2);
            Object objQ5 = dd4Var2.Q();
            if (zF3 || objQ5 == obj2) {
                objQ5 = new wf3(br9Var2, 17);
                dd4Var2.p0(objQ5);
            }
            e11.A(wgaVar, strK, 0L, jG, null, null, ou6VarB, (kb4) objQ5, null, dd4Var2, 0, 308);
            dd4Var2.q(z2);
        } else {
            pj7Var2 = pj7Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fl0(str, kr3Var, pj7Var2, ou6Var, kb4Var, ib4Var, kb4Var2, kb4Var3, kb4Var4, i2);
        }
    }

    public static final void n(ou6 ou6Var, dd4 dd4Var, int i2) {
        dd4Var.h0(-91880431);
        int i3 = i2 | (dd4Var.f(ou6Var) ? 4 : 2);
        if (dd4Var.V(i3 & 1, (i3 & 3) != 2)) {
            ou6 ou6VarN0 = gjb.n0(ou6Var, 0.0f, 8.0f, 1);
            wf0 wf0Var = bv4.x;
            iv ivVar = pv.a;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var, 48);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarN0);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            jm jmVar = ll1.f;
            un9.s(jmVar, dd4Var, eq8VarA);
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
            ou6 ou6VarN = tg9.n(lu6Var, 56.0f);
            ur9 ur9Var = s96.a;
            ah1.q(null, t96.w(ou6VarN, ((q96) dd4Var.j(ur9Var)).c.c), dd4Var, 0, 1);
            bp5 bp5VarF = j39.f(lu6Var, 12.0f, dd4Var, 1.0f, true);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, bp5VarF);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL02);
            ah1.q(null, t96.w(tg9.h(tg9.r(lu6Var, 150.0f), 16.0f), ((q96) dd4Var.j(ur9Var)).c.b), dd4Var, 0, 1);
            ou6 ou6VarH = xv5.h(lu6Var, 4.0f, dd4Var, lu6Var, 1.0f);
            eq8 eq8VarA2 = dq8.a(ivVar, wf0Var, dd4Var, 48);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarH);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, eq8VarA2);
            un9.s(jmVar2, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL03);
            ah1.q(null, t96.w(tg9.h(tg9.r(lu6Var, 50.0f), 12.0f), ((q96) dd4Var.j(ur9Var)).c.b), dd4Var, 0, 1);
            un9.a(dd4Var, tg9.r(lu6Var, 4.0f));
            ah1.q(null, t96.w(tg9.h(tg9.r(lu6Var, 40.0f), 12.0f), ((q96) dd4Var.j(ur9Var)).c.b), dd4Var, 0, 1);
            xv5.z(dd4Var, true, lu6Var, 4.0f, dd4Var);
            ah1.q(null, t96.w(tg9.h(tg9.r(lu6Var, 200.0f), 10.0f), ((q96) dd4Var.j(ur9Var)).c.b), dd4Var, 0, 1);
            dd4Var.q(true);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var, i2, 5);
        }
    }

    public static final void o(String str, ou6 ou6Var, long j2, long j3, dd4 dd4Var, int i2, int i3) {
        int i4;
        long jG;
        long jB;
        ou6 ou6Var2;
        long j4;
        long j5;
        int i5;
        ou6 ou6Var3;
        int i6;
        dd4Var.h0(119084919);
        if ((i2 & 6) == 0) {
            i4 = (dd4Var.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i4 | 48;
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                jG = j2;
                if (dd4Var.e(jG)) {
                    i6 = 256;
                }
                i7 |= i6;
            } else {
                jG = j2;
            }
            i6 = Token.CASE;
            i7 |= i6;
        } else {
            jG = j2;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                jB = j3;
                int i8 = dd4Var.e(jB) ? 2048 : 1024;
                i7 |= i8;
            } else {
                jB = j3;
            }
            i7 |= i8;
        } else {
            jB = j3;
        }
        if (dd4Var.V(i7 & 1, (i7 & 1171) != 1170)) {
            dd4Var.a0();
            if ((i2 & 1) == 0 || dd4Var.C()) {
                if ((i3 & 4) != 0) {
                    jG = dd1.g(((q96) dd4Var.j(s96.a)).a, 6.0f);
                    i7 &= -897;
                }
                int i9 = i3 & 8;
                ou6 ou6Var4 = lu6.a;
                if (i9 != 0) {
                    jB = dd1.b(((q96) dd4Var.j(s96.a)).a.h, dd4Var);
                    i7 &= -7169;
                }
                i5 = i7;
                ou6Var3 = ou6Var4;
            } else {
                dd4Var.Y();
                if ((i3 & 4) != 0) {
                    i7 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i7 &= -7169;
                }
                i5 = i7;
                ou6Var3 = ou6Var;
            }
            dd4Var.r();
            long jX = wn9.x(10);
            ur9 ur9Var = s96.a;
            long j6 = jB;
            nha.c(str, gjb.m0(fe.L(t96.w(ou6Var3, ((q96) dd4Var.j(ur9Var)).c.a), jG, jf0.G), 7.0f, 2.0f), j6, (g60) null, jX, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.l, dd4Var, (i5 & 14) | 24576 | ((i5 >> 3) & 896), 24576, 114664);
            j5 = j6;
            ou6Var2 = ou6Var3;
            j4 = jG;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
            j4 = jG;
            j5 = jB;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new kn3(str, ou6Var2, j4, j5, i2, i3, 1);
        }
    }

    public static final void p(boolean z2, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, ib4 ib4Var3, ib4 ib4Var4, dd4 dd4Var, int i2) {
        ou6 ou6Var2;
        dd4Var.h0(-1276575605);
        int i3 = 2;
        int i4 = i2 | (dd4Var.g(z2) ? 4 : 2) | 48 | (dd4Var.h(ib4Var) ? 256 : Token.CASE) | (dd4Var.h(ib4Var2) ? 2048 : 1024) | (dd4Var.h(ib4Var3) ? 16384 : 8192) | (dd4Var.h(ib4Var4) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var.V(i4 & 1, (74899 & i4) != 74898)) {
            ou6 ou6Var3 = lu6.a;
            gx1.a(z2, null, 0L, ou6Var3, 0.0f, new rj7(12.0f, 12.0f, 12.0f, 12.0f), ib4Var4, jf0.G(-817188457, new sp2(ib4Var, ib4Var2, ib4Var3, i3), dd4Var), dd4Var, (i4 & 14) | 12782592 | ((i4 << 3) & 3670016), 22);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ch1(z2, ou6Var2, ib4Var, ib4Var2, ib4Var3, ib4Var4, i2);
        }
    }

    public static final void q(String str, t27 t27Var, dd4 dd4Var, int i2) {
        t27 t27Var2;
        String str2;
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(1142816619);
        int i3 = 2;
        int i4 = (dd4Var.f(str) ? 4 : 2) | i2 | (dd4Var.f(t27Var) ? 32 : 16);
        int i5 = 9;
        if (dd4Var.V(i4 & 1, (i4 & 19) != 18)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            sr3 sr3Var = (sr3) ((qtb) qx1.N(ug8.a(sr3.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(sr3Var.f, dd4Var);
            Object[] objArr = new Object[0];
            Object objQ = dd4Var.Q();
            int i6 = 8;
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new tl3(i6);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new tl3(i5);
                dd4Var.p0(objQ2);
            }
            a07 a07Var2 = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var, 48);
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj) {
                objQ3 = dk9.n(new op0(a07VarB, i3));
                dd4Var.p0(objQ3);
            }
            br9 br9Var = (br9) objQ3;
            ms7 ms7Var = new ms7(Y("zip"));
            boolean zF = dd4Var.f(sr3Var);
            Object objQ4 = dd4Var.Q();
            if (zF || objQ4 == obj) {
                objQ4 = new tq3(sr3Var, 6);
                dd4Var.p0(objQ4);
            }
            aw3 aw3VarC0 = e11.c0(ms7Var, (kb4) objQ4, dd4Var, 8);
            m8 m8Var = (m8) dd4Var.j(a9.a);
            pp1 pp1Var = sr3Var.s;
            boolean zF2 = dd4Var.f(m8Var);
            Object objQ5 = dd4Var.Q();
            jt1 jt1Var = null;
            if (zF2 || objQ5 == obj) {
                objQ5 = new xa(m8Var, jt1Var, i6);
                dd4Var.p0(objQ5);
            }
            wx1.e(pp1Var, null, (zb4) objQ5, dd4Var, 0);
            px3 px3Var = tg9.c;
            String strK = wn9.K((pv9) ru9.O.getValue(), dd4Var);
            rj1 rj1VarG = jf0.G(625269735, new q41(t27Var, 27), dd4Var);
            rj1 rj1VarG2 = jf0.G(305676432, new sz0(br9Var, a07Var2, a07Var, aw3VarC0, t27Var), dd4Var);
            p02 p02Var = new p02(t27Var, str, sr3Var, a07Var2, a07VarB);
            t27Var2 = t27Var;
            str2 = str;
            gx1.p(strK, px3Var, false, rj1VarG, rj1VarG2, jf0.G(-935892299, p02Var, dd4Var), dd4Var, 224304, 4);
        } else {
            t27Var2 = t27Var;
            str2 = str;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yj0(str2, t27Var2, i2, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(int r38, int r39, int r40, defpackage.yb4 r41, dd4 r42, ou6 r43, java.lang.String r44) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc1.r(int, int, int, yb4, dd4, ou6, java.lang.String):void");
    }

    public static final void s(boolean z2, yba ybaVar, kb4 kb4Var, kb4 kb4Var2, zb4 zb4Var, ac4 ac4Var, kb4 kb4Var3, dd4 dd4Var, int i2) {
        int i3;
        ybaVar.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        zb4Var.getClass();
        ac4Var.getClass();
        kb4Var3.getClass();
        dd4Var.h0(-1985120739);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(ybaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(zb4Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(ac4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var3) ? 1048576 : 524288;
        }
        if (!dd4Var.V(i3 & 1, (599187 & i3) != 599186)) {
            dd4Var.Y();
        } else if (xzb.a(dd4Var)) {
            dd4Var.f0(-1326880361);
            t(z2, ybaVar, kb4Var, kb4Var2, zb4Var, ac4Var, kb4Var3, dd4Var, i3 & 4194302);
            dd4Var.q(false);
        } else {
            dd4Var.f0(-1326543236);
            u(z2, ybaVar, kb4Var, kb4Var2, zb4Var, ac4Var, kb4Var3, dd4Var, i3 & 4194302);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new it6(z2, ybaVar, kb4Var, kb4Var2, zb4Var, ac4Var, kb4Var3, i2, 0);
        }
    }

    public static final void t(boolean z2, yba ybaVar, kb4 kb4Var, kb4 kb4Var2, zb4 zb4Var, ac4 ac4Var, kb4 kb4Var3, dd4 dd4Var, int i2) {
        int i3;
        dd4Var.h0(1743607279);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(ybaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(zb4Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(ac4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var3) ? 1048576 : 524288;
        }
        if (dd4Var.V(i3 & 1, (599187 & i3) != 599186)) {
            sdc.e(tg9.c, null, jf0.G(774203205, new fh1(z2, kb4Var, ybaVar, kb4Var2, zb4Var, ac4Var, kb4Var3, 5), dd4Var), dd4Var, 3078, 6);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new it6(z2, ybaVar, kb4Var, kb4Var2, zb4Var, ac4Var, kb4Var3, i2, 1);
        }
    }

    public static final void u(boolean z2, yba ybaVar, kb4 kb4Var, kb4 kb4Var2, zb4 zb4Var, ac4 ac4Var, kb4 kb4Var3, dd4 dd4Var, int i2) {
        boolean z3;
        int i3;
        dd4Var.h0(35376492);
        if ((i2 & 6) == 0) {
            z3 = z2;
            i3 = (dd4Var.g(z3) ? 4 : 2) | i2;
        } else {
            z3 = z2;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(ybaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(kb4Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dd4Var.h(zb4Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= dd4Var.h(ac4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((1572864 & i2) == 0) {
            i3 |= dd4Var.h(kb4Var3) ? 1048576 : 524288;
        }
        if (dd4Var.V(i3 & 1, (599187 & i3) != 599186)) {
            fw.r(z3, kb4Var, null, true, 0L, 0L, 0.0f, 0L, 0.0f, jf0.G(-371991333, new uq6(ybaVar, kb4Var2, zb4Var, ac4Var, kb4Var3, kb4Var), dd4Var), dd4Var, (i3 & 14) | 805309440 | ((i3 >> 3) & Token.ASSIGN_MOD), 500);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new it6(z2, ybaVar, kb4Var, kb4Var2, zb4Var, ac4Var, kb4Var3, i2, 2);
        }
    }

    public static final void v(z50 z50Var, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i2) {
        int i3;
        dd4Var.h0(1508880385);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.f(z50Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(ib4Var) ? 256 : Token.CASE;
        }
        if (dd4Var.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            boolean z2 = (i3 & 896) == 256;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z2 || objQ == obj) {
                objQ = new s50(i4, ib4Var);
                dd4Var.p0(objQ);
            }
            ou6 ou6VarB = r1a.b(ou6Var, heb.a, (PointerInputEventHandler) objQ);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarB);
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
            ur9 ur9Var = s96.a;
            long j2 = ((q96) dd4Var.j(ur9Var)).a.a;
            long jC = lc1.c(0.5f, ((q96) dd4Var.j(ur9Var)).a.h);
            ou6 ou6VarN = tg9.n(gjb.l0(yib.B(lu6.a, 15), 24.0f), 24.0f);
            boolean z3 = (i3 & 14) == 4;
            Object objQ2 = dd4Var.Q();
            if (z3 || objQ2 == obj) {
                objQ2 = new q50(z50Var, 3);
                dd4Var.p0(objQ2);
            }
            h48.b((ib4) objQ2, ou6VarN, j2, 2.0f, jC, 0, 0.0f, dd4Var, 3072, 96);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new n50(z50Var, ou6Var, ib4Var, i2, 0);
        }
    }

    public static final void w(int i2, dd4 dd4Var, ou6 ou6Var, boolean z2) {
        long jG;
        long jC;
        vf0 vf0Var = bv4.z;
        dd4Var.h0(425816388);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16);
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            ou6 ou6VarE0 = sdc.e0(0.6666667f, ou6Var, false);
            if (z2) {
                dd4Var.f0(-1837135147);
                jG = ((q96) dd4Var.j(s96.a)).a.a;
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1837056066);
                jG = dd1.g(((q96) dd4Var.j(s96.a)).a, 10.0f);
                dd4Var.q(false);
            }
            ur9 ur9Var = s96.a;
            ou6 ou6VarW = t96.w(gjb.l0(fw.G(ou6VarE0, 2.0f, jG, ((q96) dd4Var.j(ur9Var)).c.b), 4.0f), ((q96) dd4Var.j(ur9Var)).c.b);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarW);
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
            if (z2) {
                dd4Var.f0(643870520);
                jC = lc1.c(0.5f, ((q96) dd4Var.j(ur9Var)).a.a);
                dd4Var.q(false);
            } else {
                dd4Var.f0(643952143);
                jC = lc1.c(0.5f, ((q96) dd4Var.j(ur9Var)).a.c);
                dd4Var.q(false);
            }
            ou6 ou6VarQ = kc5.Q(tg9.c, kc5.J(dd4Var), 12);
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarQ);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL02);
            dd4Var.f0(1650076082);
            for (int i4 = 0; i4 < 4; i4++) {
                lu6 lu6Var = lu6.a;
                float f2 = 1.0f;
                ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var, 0);
                int iHashCode3 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL3 = dd4Var.l();
                ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarF);
                ml1.k.getClass();
                um1 um1Var2 = ll1.b;
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var2);
                } else {
                    dd4Var.s0();
                }
                un9.s(ll1.f, dd4Var, eq8VarA);
                un9.s(ll1.e, dd4Var, lr7VarL3);
                un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode3));
                un9.r(dd4Var, ll1.h);
                un9.s(ll1.d, dd4Var, ou6VarL03);
                dd4Var.f0(-939450900);
                int i5 = 0;
                while (i5 < 3) {
                    ou6 ou6VarL04 = gjb.l0(new bp5(f2, true), 4.0f);
                    ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var, 0);
                    int iHashCode4 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL4 = dd4Var.l();
                    ou6 ou6VarL05 = s32.L0(dd4Var, ou6VarL04);
                    ml1.k.getClass();
                    um1 um1Var3 = ll1.b;
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var3);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(ll1.f, dd4Var, ie1VarA2);
                    un9.s(ll1.e, dd4Var, lr7VarL4);
                    un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode4));
                    un9.r(dd4Var, ll1.h);
                    un9.s(ll1.d, dd4Var, ou6VarL05);
                    ou6 ou6VarF2 = tg9.f(lu6Var, f2);
                    ur9 ur9Var2 = s96.a;
                    ou6 ou6VarW2 = t96.w(ou6VarF2, ((q96) dd4Var.j(ur9Var2)).c.a);
                    lp4 lp4Var = jf0.G;
                    pn0.a(sdc.e0(0.6666667f, fe.L(ou6VarW2, jC, lp4Var), false), dd4Var, 0);
                    pn0.a(fe.L(t96.w(tg9.h(xv5.h(lu6Var, 2.0f, dd4Var, lu6Var, f2), 2.0f), ((q96) dd4Var.j(ur9Var2)).c.a), jC, lp4Var), dd4Var, 0);
                    pn0.a(fe.L(t96.w(tg9.h(gjb.n0(xv5.h(lu6Var, f2, dd4Var, lu6Var, f2), 4.0f, 0.0f, 2), 2.0f), ((q96) dd4Var.j(ur9Var2)).c.b), jC, lp4Var), dd4Var, 0);
                    dd4Var.q(true);
                    i5++;
                    f2 = 1.0f;
                }
                dd4Var.q(false);
                dd4Var.q(true);
            }
            tw2.x(dd4Var, false, true, true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xk0(z2, ou6Var, i2, 4);
        }
    }

    public static final void x(int i2, dd4 dd4Var, ou6 ou6Var, boolean z2) {
        long jG;
        long jC;
        vf0 vf0Var = bv4.z;
        dd4Var.h0(-2014805371);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16);
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            ou6 ou6VarE0 = sdc.e0(0.6666667f, ou6Var, false);
            if (z2) {
                dd4Var.f0(-898603532);
                jG = ((q96) dd4Var.j(s96.a)).a.a;
                dd4Var.q(false);
            } else {
                dd4Var.f0(-898524451);
                jG = dd1.g(((q96) dd4Var.j(s96.a)).a, 10.0f);
                dd4Var.q(false);
            }
            ur9 ur9Var = s96.a;
            ou6 ou6VarW = t96.w(gjb.l0(fw.G(ou6VarE0, 2.0f, jG, ((q96) dd4Var.j(ur9Var)).c.b), 4.0f), ((q96) dd4Var.j(ur9Var)).c.b);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarW);
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
            if (z2) {
                dd4Var.f0(1582402135);
                jC = lc1.c(0.5f, ((q96) dd4Var.j(ur9Var)).a.a);
                dd4Var.q(false);
            } else {
                dd4Var.f0(1582483758);
                jC = lc1.c(0.5f, ((q96) dd4Var.j(ur9Var)).a.c);
                dd4Var.q(false);
            }
            ou6 ou6VarQ = kc5.Q(tg9.c, kc5.J(dd4Var), 12);
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarQ);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL02);
            dd4Var.f0(1264708442);
            for (int i4 = 0; i4 < 4; i4++) {
                lu6 lu6Var = lu6.a;
                ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var, 0);
                int iHashCode3 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL3 = dd4Var.l();
                ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarF);
                ml1.k.getClass();
                um1 um1Var2 = ll1.b;
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var2);
                } else {
                    dd4Var.s0();
                }
                un9.s(ll1.f, dd4Var, eq8VarA);
                un9.s(ll1.e, dd4Var, lr7VarL3);
                un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode3));
                un9.r(dd4Var, ll1.h);
                un9.s(ll1.d, dd4Var, ou6VarL03);
                dd4Var.f0(-1324818540);
                for (int i5 = 0; i5 < 3; i5++) {
                    ou6 ou6VarL04 = gjb.l0(new bp5(1.0f, true), 4.0f);
                    ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var, 0);
                    int iHashCode4 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL4 = dd4Var.l();
                    ou6 ou6VarL05 = s32.L0(dd4Var, ou6VarL04);
                    ml1.k.getClass();
                    um1 um1Var3 = ll1.b;
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var3);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(ll1.f, dd4Var, ie1VarA2);
                    un9.s(ll1.e, dd4Var, lr7VarL4);
                    un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode4));
                    un9.r(dd4Var, ll1.h);
                    un9.s(ll1.d, dd4Var, ou6VarL05);
                    pn0.a(sdc.e0(0.6666667f, fe.L(t96.w(tg9.f(lu6Var, 1.0f), ((q96) dd4Var.j(s96.a)).c.a), jC, jf0.G), false), dd4Var, 0);
                    dd4Var.q(true);
                }
                dd4Var.q(false);
                dd4Var.q(true);
            }
            tw2.x(dd4Var, false, true, true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xk0(z2, ou6Var, i2, 3);
        }
    }

    public static final void y(int i2, dd4 dd4Var, ou6 ou6Var, boolean z2) {
        long jG;
        jm jmVar;
        long jC;
        vf0 vf0Var = bv4.z;
        dd4Var.h0(1086163180);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16);
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            ou6 ou6VarE0 = sdc.e0(0.6666667f, ou6Var, false);
            if (z2) {
                dd4Var.f0(-396070355);
                jG = ((q96) dd4Var.j(s96.a)).a.a;
                dd4Var.q(false);
            } else {
                dd4Var.f0(-395991274);
                jG = dd1.g(((q96) dd4Var.j(s96.a)).a, 10.0f);
                dd4Var.q(false);
            }
            ur9 ur9Var = s96.a;
            ou6 ou6VarW = t96.w(gjb.l0(fw.G(ou6VarE0, 2.0f, jG, ((q96) dd4Var.j(ur9Var)).c.b), 4.0f), ((q96) dd4Var.j(ur9Var)).c.b);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarW);
            ml1.k.getClass();
            um1 um1Var = ll1.b;
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            jm jmVar2 = ll1.f;
            un9.s(jmVar2, dd4Var, ha6VarD);
            jm jmVar3 = ll1.e;
            un9.s(jmVar3, dd4Var, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar4 = ll1.g;
            un9.s(jmVar4, dd4Var, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var, kdVar);
            jm jmVar5 = ll1.d;
            un9.s(jmVar5, dd4Var, ou6VarL0);
            if (z2) {
                dd4Var.f0(2084935312);
                jmVar = jmVar4;
                jC = lc1.c(0.5f, ((q96) dd4Var.j(ur9Var)).a.a);
                dd4Var.q(false);
            } else {
                jmVar = jmVar4;
                dd4Var.f0(2085016935);
                jC = lc1.c(0.5f, ((q96) dd4Var.j(ur9Var)).a.c);
                dd4Var.q(false);
            }
            ou6 ou6VarQ = kc5.Q(tg9.c, kc5.J(dd4Var), 12);
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarQ);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar2, dd4Var, ie1VarA);
            un9.s(jmVar3, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar, dd4Var, kdVar);
            un9.s(jmVar5, dd4Var, ou6VarL02);
            dd4Var.f0(588182970);
            int i4 = 0;
            while (i4 < 10) {
                lu6 lu6Var = lu6.a;
                ou6 ou6VarL03 = gjb.l0(tg9.f(lu6Var, 1.0f), 2.0f);
                eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var, 0);
                int iHashCode3 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL3 = dd4Var.l();
                ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarL03);
                ml1.k.getClass();
                um1 um1Var2 = ll1.b;
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var2);
                } else {
                    dd4Var.s0();
                }
                jm jmVar6 = ll1.f;
                un9.s(jmVar6, dd4Var, eq8VarA);
                jm jmVar7 = ll1.e;
                un9.s(jmVar7, dd4Var, lr7VarL3);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                jm jmVar8 = ll1.g;
                un9.s(jmVar8, dd4Var, numValueOf2);
                kd kdVar2 = ll1.h;
                un9.r(dd4Var, kdVar2);
                jm jmVar9 = ll1.d;
                un9.s(jmVar9, dd4Var, ou6VarL04);
                int i5 = i4;
                ou6 ou6VarO = tg9.o(lu6Var, 14.0f, 21.0f);
                lp4 lp4Var = jf0.G;
                pn0.a(fe.L(ou6VarO, jC, lp4Var), dd4Var, 0);
                ou6 ou6VarL05 = gjb.l0(new bp5(1.0f, true), 4.0f);
                ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var, 0);
                vf0 vf0Var2 = vf0Var;
                int iHashCode4 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL4 = dd4Var.l();
                ou6 ou6VarL06 = s32.L0(dd4Var, ou6VarL05);
                dd4Var.j0();
                jv jvVar2 = jvVar;
                if (dd4Var.S) {
                    dd4Var.k(um1Var2);
                } else {
                    dd4Var.s0();
                }
                un9.s(jmVar6, dd4Var, ie1VarA2);
                un9.s(jmVar7, dd4Var, lr7VarL4);
                ky0.v(iHashCode4, dd4Var, jmVar8, dd4Var, kdVar2);
                un9.s(jmVar9, dd4Var, ou6VarL06);
                ou6 ou6VarH = tg9.h(tg9.f(lu6Var, 1.0f), 5.0f);
                ur9 ur9Var2 = s96.a;
                pn0.a(fe.L(t96.w(ou6VarH, ((q96) dd4Var.j(ur9Var2)).c.a), jC, lp4Var), dd4Var, 0);
                pn0.a(fe.L(t96.w(tg9.h(gjb.p0(xv5.h(lu6Var, 3.0f, dd4Var, lu6Var, 1.0f), 0.0f, 0.0f, 10.0f, 0.0f, 11), 5.0f), ((q96) dd4Var.j(ur9Var2)).c.b), jC, lp4Var), dd4Var, 0);
                dd4Var.q(true);
                dd4Var.q(true);
                i4 = i5 + 1;
                vf0Var = vf0Var2;
                jvVar = jvVar2;
            }
            tw2.x(dd4Var, false, true, true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xk0(z2, ou6Var, i2, 5);
        }
    }

    public static final void z(int i2, dd4 dd4Var, ou6 ou6Var, boolean z2) {
        long jC;
        long jG;
        vf0 vf0Var = bv4.z;
        dd4Var.h0(-1354458579);
        int i3 = i2 | (dd4Var.g(z2) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16);
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            if (z2) {
                dd4Var.f0(542335121);
                jC = lc1.c(0.5f, ((q96) dd4Var.j(s96.a)).a.a);
                dd4Var.q(false);
            } else {
                dd4Var.f0(542408808);
                jC = lc1.c(0.5f, ((q96) dd4Var.j(s96.a)).a.c);
                dd4Var.q(false);
            }
            ou6 ou6VarE0 = sdc.e0(0.6666667f, ou6Var, false);
            if (z2) {
                dd4Var.f0(542643788);
                jG = ((q96) dd4Var.j(s96.a)).a.a;
                dd4Var.q(false);
            } else {
                dd4Var.f0(542722869);
                jG = dd1.g(((q96) dd4Var.j(s96.a)).a, 10.0f);
                dd4Var.q(false);
            }
            ur9 ur9Var = s96.a;
            ou6 ou6VarW = t96.w(gjb.l0(fw.G(ou6VarE0, 2.0f, jG, ((q96) dd4Var.j(ur9Var)).c.b), 4.0f), ((q96) dd4Var.j(ur9Var)).c.b);
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6VarW);
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
            ou6 ou6VarQ = kc5.Q(tg9.c, kc5.J(dd4Var), 12);
            jv jvVar = pv.c;
            ie1 ie1VarA = ge1.a(jvVar, vf0Var, dd4Var, 0);
            int iHashCode2 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL2 = dd4Var.l();
            ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarQ);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ie1VarA);
            un9.s(jmVar2, dd4Var, lr7VarL2);
            ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL02);
            dd4Var.f0(202816067);
            for (int i4 = 0; i4 < 10; i4++) {
                lu6 lu6Var = lu6.a;
                ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
                eq8 eq8VarA = dq8.a(pv.a, bv4.w, dd4Var, 0);
                int iHashCode3 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL3 = dd4Var.l();
                ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarF);
                ml1.k.getClass();
                um1 um1Var2 = ll1.b;
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var2);
                } else {
                    dd4Var.s0();
                }
                un9.s(ll1.f, dd4Var, eq8VarA);
                un9.s(ll1.e, dd4Var, lr7VarL3);
                un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode3));
                un9.r(dd4Var, ll1.h);
                un9.s(ll1.d, dd4Var, ou6VarL03);
                dd4Var.f0(1908256380);
                for (int i5 = 0; i5 < 2; i5++) {
                    ou6 ou6VarL04 = gjb.l0(new bp5(1.0f, true), 4.0f);
                    ie1 ie1VarA2 = ge1.a(jvVar, vf0Var, dd4Var, 0);
                    int iHashCode4 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL4 = dd4Var.l();
                    ou6 ou6VarL05 = s32.L0(dd4Var, ou6VarL04);
                    ml1.k.getClass();
                    um1 um1Var3 = ll1.b;
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var3);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(ll1.f, dd4Var, ie1VarA2);
                    un9.s(ll1.e, dd4Var, lr7VarL4);
                    un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode4));
                    un9.r(dd4Var, ll1.h);
                    un9.s(ll1.d, dd4Var, ou6VarL05);
                    ou6 ou6VarH = tg9.h(tg9.f(lu6Var, 1.0f), 5.0f);
                    ur9 ur9Var2 = s96.a;
                    ou6 ou6VarW2 = t96.w(ou6VarH, ((q96) dd4Var.j(ur9Var2)).c.a);
                    lp4 lp4Var = jf0.G;
                    pn0.a(fe.L(ou6VarW2, jC, lp4Var), dd4Var, 0);
                    pn0.a(fe.L(t96.w(tg9.h(gjb.p0(xv5.h(lu6Var, 3.0f, dd4Var, lu6Var, 1.0f), 0.0f, 0.0f, 10.0f, 0.0f, 11), 5.0f), ((q96) dd4Var.j(ur9Var2)).c.b), jC, lp4Var), dd4Var, 0);
                    dd4Var.q(true);
                }
                dd4Var.q(false);
                dd4Var.q(true);
            }
            tw2.x(dd4Var, false, true, true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xk0(z2, ou6Var, i2, 6);
        }
    }
}

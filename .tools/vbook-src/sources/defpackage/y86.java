package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.widget.EdgeEffect;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class y86 {
    public static final long A(float f, long j) {
        return d14.a(H(j) / f, I(j) / f);
    }

    public static final float B(long j, long j2) {
        return (I(j2) * I(j)) + (H(j2) * H(j));
    }

    public static final long C(float f, int i, long j, boolean z) {
        int i2 = ((z || i == 2 || i == 4 || i == 5) && up1.e(j)) ? up1.i(j) : Integer.MAX_VALUE;
        if (up1.k(j) != i2) {
            i2 = wx1.Q(zk9.l(f), up1.k(j), i2);
        }
        return t96.C(0, i2, 0, up1.h(j));
    }

    public static final Rect D(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        gc.s(textPaint2, charSequence, i3, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            gc.s(textPaint, charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static final float E(long j) {
        return (float) Math.sqrt((I(j) * I(j)) + (H(j) * H(j)));
    }

    public static final int F(long j, qha qhaVar) {
        int i = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i) <= 0.0f) {
            return 0;
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        gx6 gx6Var = qhaVar.b;
        return fIntBitsToFloat >= gx6Var.e ? qhaVar.a.a.b.length() : gx6Var.h(j);
    }

    public static Object G(Object obj, Map map) {
        map.getClass();
        if (map instanceof s86) {
            return ((s86) map).b();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static final float H(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float I(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static void J(Object[] objArr, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        if (i4 >= i2) {
            return;
        }
        int i5 = i3 + 2;
        if (i5 < i2) {
            if (((mc1) objArr[i5]).b() - ((mc1) objArr[i4]).b() >= 0) {
                i4 = i5;
            }
        }
        if (((mc1) objArr[i]).b() - ((mc1) objArr[i4]).b() < 0) {
            Object obj = objArr[i];
            objArr[i] = objArr[i4];
            objArr[i4] = obj;
            J(objArr, i4, i2);
        }
    }

    public static void K(int i, Object[] objArr) {
        int i2 = i % 2 == 0 ? (i / 2) - 1 : i / 2;
        if (i2 < 0) {
            return;
        }
        if (((mc1) objArr[i]).b() - ((mc1) objArr[i2]).b() > 0) {
            Object obj = objArr[i];
            objArr[i] = objArr[i2];
            objArr[i2] = obj;
            K(i2, objArr);
        }
    }

    public static int L(String str) {
        if (str == null) {
            return -1;
        }
        String strP = dh6.p(str);
        strP.getClass();
        switch (strP) {
        }
        return -1;
    }

    public static int M(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static final lf8 N(lf8 lf8Var, long j) {
        lf8Var.getClass();
        float fB = og9.b(j);
        float fA = og9.a(j);
        float f = lf8Var.d;
        float f2 = lf8Var.c;
        float f3 = lf8Var.b;
        float f4 = lf8Var.a;
        return (f4 < 0.0f || f4 > fB || f3 < 0.0f || f3 > fA || f2 < 0.0f || f2 > fB || f < 0.0f || f > fA) ? new lf8(wx1.P(f4, 0.0f, fB), wx1.P(f3, 0.0f, fA), wx1.P(f2, 0.0f, fB), wx1.P(f, 0.0f, fA)) : lf8Var;
    }

    public static int O(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map P(xl7... xl7VarArr) {
        xl7VarArr.getClass();
        if (xl7VarArr.length <= 0) {
            return mc3.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(O(xl7VarArr.length));
        Y(linkedHashMap, xl7VarArr);
        return linkedHashMap;
    }

    public static final long Q(long j, long j2) {
        return d14.a(H(j) - H(j2), I(j) - I(j2));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[Catch: all -> 0x0044, TryCatch #1 {all -> 0x0044, blocks: (B:20:0x0040, B:31:0x0079, B:33:0x0081, B:35:0x008d, B:37:0x0099, B:28:0x0060), top: B:69:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fc A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:13:0x002d, B:54:0x00e4, B:56:0x00ec, B:58:0x00f0, B:60:0x00fc, B:62:0x0108, B:50:0x00bd), top: B:69:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object R(u1a r9, defpackage.vv6 r10, og r11, mx7 r12, defpackage.vc0 r13) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y86.R(u1a, vv6, og, mx7, vc0):java.lang.Object");
    }

    public static LinkedHashMap S(xl7... xl7VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(O(xl7VarArr.length));
        Y(linkedHashMap, xl7VarArr);
        return linkedHashMap;
    }

    public static final void T(t27 t27Var, String str) {
        t27Var.getClass();
        str.getClass();
        t27Var.a.d(new rj0(str));
    }

    public static gu4 U(String str) {
        str.getClass();
        gu4 gu4Var = gu4.b;
        if (str.equals(gu4Var.a)) {
            return gu4Var;
        }
        gu4 gu4Var2 = gu4.c;
        if (str.equals(gu4Var2.a)) {
            return gu4Var2;
        }
        gu4 gu4Var3 = gu4.d;
        if (str.equals(gu4Var3.a)) {
            return gu4Var3;
        }
        gu4 gu4Var4 = gu4.e;
        if (str.equals(gu4Var4.a)) {
            return gu4Var4;
        }
        gu4 gu4Var5 = gu4.i;
        if (str.equals(gu4Var5.a)) {
            return gu4Var5;
        }
        gu4 gu4Var6 = gu4.f;
        if (str.equals(gu4Var6.a)) {
            return gu4Var6;
        }
        gu4 gu4Var7 = gu4.g;
        if (str.equals(gu4Var7.a)) {
            return gu4Var7;
        }
        gu4 gu4Var8 = gu4.j;
        if (str.equals(gu4Var8.a)) {
            return gu4Var8;
        }
        gu4 gu4Var9 = gu4.h;
        return str.equals(gu4Var9.a) ? gu4Var9 : new gu4(str);
    }

    public static LinkedHashMap V(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final long W(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static final long X(long j, long j2) {
        return d14.a(H(j2) + H(j), I(j2) + I(j));
    }

    public static final void Y(HashMap map, xl7[] xl7VarArr) {
        xl7VarArr.getClass();
        for (xl7 xl7Var : xl7VarArr) {
            map.put(xl7Var.a, xl7Var.b);
        }
    }

    public static final ArrayList Z(List list, List list2, dd4 dd4Var, int i) {
        List list3;
        dd4 dd4Var2;
        ArrayList arrayList;
        Object objQ = dd4Var.Q();
        Object obj = vl1.a;
        if (objQ == obj) {
            objQ = new LinkedHashSet();
            dd4Var.p0(objQ);
        }
        Set set = (Set) objQ;
        Object objQ2 = dd4Var.Q();
        if (objQ2 == obj) {
            objQ2 = new LinkedHashSet();
            dd4Var.p0(objQ2);
        }
        Set set2 = (Set) objQ2;
        dd4Var.f0(110758886);
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                List list4 = list2;
                arrayList.add(z((c37) list.get(i2), list4, set, set2, dd4Var, i & Token.ASSIGN_MOD));
                i2++;
                list2 = list4;
            }
            list3 = list2;
            dd4Var2 = dd4Var;
        } else {
            list3 = list2;
            dd4Var2 = dd4Var;
            arrayList = new ArrayList(gc1.M(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(z((c37) it.next(), list3, set, set2, dd4Var2, i & Token.ASSIGN_MOD));
            }
        }
        ArrayList arrayList2 = arrayList;
        dd4Var2.q(false);
        k(arrayList2, list3, set, set2, dd4Var2, i & Token.ASSIGN_MOD);
        return arrayList2;
    }

    public static final void a(String str, int i, ib4 ib4Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(505962160);
        int i3 = i2 | (dd4Var2.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ur9 ur9Var = s96.a;
            uw1 uw1Var = ((q96) dd4Var2.j(ur9Var)).c.b;
            lu6 lu6Var = lu6.a;
            ou6 ou6VarW = t96.w(lu6Var, uw1Var);
            boolean z = (i3 & 896) == 256;
            Object objQ = dd4Var2.Q();
            if (z || objQ == vl1.a) {
                objQ = new i35(19, ib4Var);
                dd4Var2.p0(objQ);
            }
            ou6 ou6VarN0 = gjb.n0(fw.J(null, (ib4) objQ, ou6VarW, false, 15), 4.0f, 0.0f, 2);
            ha6 ha6VarD = pn0.d(bv4.b, false);
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
            un9.s(ll1.f, dd4Var2, ha6VarD);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.k;
            long j = ((q96) dd4Var2.j(ur9Var)).a.q;
            xf0 xf0Var = bv4.f;
            zn0 zn0Var = zn0.a;
            nha.c(str, gjb.l0(zn0Var.a(lu6Var, xf0Var), 4.0f), j, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var2, 6, 0, 131064);
            if (i > 0) {
                dd4Var2.f0(-964300540);
                nha.c(String.valueOf(i), zn0Var.a(lu6Var, bv4.d), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.o, dd4Var2, 0, 0, 131064);
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
            } else {
                dd4Var2 = dd4Var2;
                dd4Var2.f0(-964056136);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new nk6(str, i, ib4Var, i2, 0);
        }
    }

    public static final u83 a0(dd4 dd4Var) {
        Object[] objArr = new Object[0];
        rt8 rt8Var = u83.h;
        Object objQ = dd4Var.Q();
        if (objQ == vl1.a) {
            objQ = new uj6(5);
            dd4Var.p0(objQ);
        }
        u83 u83Var = (u83) ww1.d0(objArr, rt8Var, (ib4) objQ, dd4Var, 384);
        u83Var.f.setValue(true);
        return u83Var;
    }

    public static final void b(final nk3 nk3Var, final ou6 ou6Var, final kb4 kb4Var, dd4 dd4Var, final int i) {
        int i2;
        ye8 ye8VarU;
        yb4 yb4Var;
        nk3Var.getClass();
        dd4Var.h0(1964243990);
        if ((i & 6) == 0) {
            i2 = (dd4Var.h(nk3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.h(kb4Var) ? 256 : Token.CASE;
        }
        if (dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            qk3 qk3Var = (qk3) ((du3) ((Map) nk3Var.B.b).get(fu6.L));
            a07 a07VarI = null;
            fr9 fr9Var = qk3Var != null ? qk3Var.a : null;
            if (fr9Var == null) {
                dd4Var.f0(-2136460357);
            } else {
                dd4Var.f0(-2147128058);
                a07VarI = dk9.i(fr9Var, dd4Var);
            }
            dd4Var.q(false);
            if (a07VarI == null) {
                ye8VarU = dd4Var.u();
                if (ye8VarU != null) {
                    final int i3 = 0;
                    yb4Var = new yb4() { // from class: pk3
                        @Override // defpackage.yb4
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            heb hebVar = heb.a;
                            int i5 = i;
                            kb4 kb4Var2 = kb4Var;
                            ou6 ou6Var2 = ou6Var;
                            nk3 nk3Var2 = nk3Var;
                            dd4 dd4Var2 = (dd4) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    y86.b(nk3Var2, ou6Var2, kb4Var2, dd4Var2, qu1.x0(i5 | 1));
                                    break;
                                default:
                                    y86.b(nk3Var2, ou6Var2, kb4Var2, dd4Var2, qu1.x0(i5 | 1));
                                    break;
                            }
                            return hebVar;
                        }
                    };
                    ye8VarU.d = yb4Var;
                }
                return;
            }
            boolean zH = dd4Var.h(nk3Var) | ((i2 & 896) == 256);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (zH || objQ == obj) {
                objQ = new n82(22, nk3Var, kb4Var);
                dd4Var.p0(objQ);
            }
            kb4 kb4Var2 = (kb4) objQ;
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new se3(3);
                dd4Var.p0(objQ2);
            }
            kb4 kb4Var3 = (kb4) objQ2;
            boolean zH2 = dd4Var.h(nk3Var) | dd4Var.f(a07VarI);
            Object objQ3 = dd4Var.Q();
            if (zH2 || objQ3 == obj) {
                objQ3 = new n82(23, nk3Var, a07VarI);
                dd4Var.p0(objQ3);
            }
            kc5.b(kb4Var2, ou6Var, null, kb4Var3, (kb4) objQ3, dd4Var, (i2 & Token.ASSIGN_MOD) | 3072, 4);
        } else {
            dd4Var.Y();
        }
        ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            final int i4 = 1;
            yb4Var = new yb4() { // from class: pk3
                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj22) {
                    int i42 = i4;
                    heb hebVar = heb.a;
                    int i5 = i;
                    kb4 kb4Var22 = kb4Var;
                    ou6 ou6Var2 = ou6Var;
                    nk3 nk3Var2 = nk3Var;
                    dd4 dd4Var2 = (dd4) obj2;
                    ((Integer) obj22).getClass();
                    switch (i42) {
                        case 0:
                            y86.b(nk3Var2, ou6Var2, kb4Var22, dd4Var2, qu1.x0(i5 | 1));
                            break;
                        default:
                            y86.b(nk3Var2, ou6Var2, kb4Var22, dd4Var2, qu1.x0(i5 | 1));
                            break;
                    }
                    return hebVar;
                }
            };
            ye8VarU.d = yb4Var;
        }
    }

    public static final hj9 b0(int i, dd4 dd4Var, st5 st5Var) {
        boolean z = (((i & 14) ^ 6) > 4 && dd4Var.f(st5Var)) || (i & 6) == 4;
        Object objQ = dd4Var.Q();
        Object obj = vl1.a;
        if (z || objQ == obj) {
            objQ = new xt5(st5Var, ra1.E);
            dd4Var.p0(objQ);
        }
        xt5 xt5Var = (xt5) objQ;
        pn2 pn2Var = (pn2) dd4Var.j(xm1.h);
        od2 od2VarA = fp9.a(dd4Var);
        boolean zF = dd4Var.f(pn2Var) | dd4Var.f(xt5Var) | dd4Var.f(od2VarA);
        Object objQ2 = dd4Var.Q();
        if (zF || objQ2 == obj) {
            objQ2 = new hj9(xt5Var, od2VarA, ah1.W(0.0f, 400.0f, 5, null));
            dd4Var.p0(objQ2);
        }
        return (hj9) objQ2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(float r20, int r21, int r22, long r23, dd4 r25, ou6 r26) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y86.c(float, int, int, long, dd4, ou6):void");
    }

    public static final long c0(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static nv3 d(zn7 zn7Var, gx3 gx3Var, String str, je8 je8Var, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            je8Var = null;
        }
        return new nv3(zn7Var, gx3Var, str, je8Var);
    }

    public static ou6 d0(ou6 ou6Var, float f, t89 t89Var, int i) {
        if ((i & 2) != 0) {
            t89Var = jf0.G;
        }
        t89 t89Var2 = t89Var;
        boolean z = x13.b(f, 0.0f) > 0;
        long j = nh4.a;
        return (x13.b(f, 0.0f) > 0 || z) ? ou6Var.e(new p89(f, t89Var2, z, j, j)) : ou6Var;
    }

    public static vm9 e(mr0 mr0Var, gx3 gx3Var) {
        return new vm9(mr0Var, gx3Var, (tu1) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e0(int r6, java.lang.Object r7, qc r8, defpackage.a84 r9, int r10) {
        /*
            boolean r0 = r7 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            return r7
        L5:
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L29
            a84 r0 = r8.a
            boolean r0 = defpackage.lc5.Q(r0, r9)
            if (r0 != 0) goto L29
            a84 r0 = defpackage.a84.d
            int r3 = r9.compareTo(r0)
            if (r3 < 0) goto L29
            a84 r3 = r8.a
            int r3 = r3.a
            int r0 = r0.a
            int r0 = defpackage.lc5.V(r3, r0)
            if (r0 >= 0) goto L29
            r0 = r2
            goto L2a
        L29:
            r0 = r1
        L2a:
            r3 = 2
            r6 = r6 & r3
            if (r6 == 0) goto L36
            r8.getClass()
            if (r10 != 0) goto L34
            goto L36
        L34:
            r6 = r2
            goto L37
        L36:
            r6 = r1
        L37:
            if (r6 != 0) goto L3c
            if (r0 != 0) goto L3c
            return r7
        L3c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L5d
            if (r6 == 0) goto L48
            if (r10 != r2) goto L48
            r6 = r2
            goto L49
        L48:
            r6 = r1
        L49:
            if (r6 == 0) goto L4f
            if (r0 == 0) goto L4f
            r1 = 3
            goto L56
        L4f:
            if (r0 == 0) goto L53
            r1 = r2
            goto L56
        L53:
            if (r6 == 0) goto L56
            r1 = r3
        L56:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r7, r1)
            return r6
        L5d:
            if (r0 == 0) goto L62
            int r9 = r9.a
            goto L66
        L62:
            a84 r9 = r8.a
            int r9 = r9.a
        L66:
            if (r6 == 0) goto L6c
            if (r10 != r2) goto L6f
            r1 = r2
            goto L6f
        L6c:
            r8.getClass()
        L6f:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = cr.f(r7, r9, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y86.e0(int, java.lang.Object, qc, a84, int):java.lang.Object");
    }

    public static final long f(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final long f0(float f, long j) {
        return d14.a(H(j) * f, I(j) * f);
    }

    public static final void g(ou6 ou6Var, st5 st5Var, pj7 pj7Var, nv nvVar, vf0 vf0Var, s04 s04Var, boolean z, kb4 kb4Var, dd4 dd4Var, int i) {
        pj7 pj7Var2;
        nv nvVar2;
        vf0 vf0Var2;
        s04 s04Var2;
        boolean z2;
        int i2;
        s04 s04Var3;
        boolean z3;
        vf0 vf0Var3;
        nv nvVar3;
        kb4Var.getClass();
        dd4Var.h0(1520780510);
        int i3 = i | (dd4Var.f(st5Var) ? 32 : 16) | 13315456 | (dd4Var.h(kb4Var) ? 67108864 : 33554432);
        if (dd4Var.V(i3 & 1, (38347923 & i3) != 38347922)) {
            dd4Var.a0();
            if ((i & 1) == 0 || dd4Var.C()) {
                pj7Var = new rj7(0.0f, 0.0f, 0.0f, 0.0f);
                vf0 vf0Var4 = bv4.z;
                s04 s04VarB0 = b0((((-57345) & i3) >> 3) & 14, dd4Var, st5Var);
                i2 = i3 & (-3727361);
                s04Var3 = s04VarB0;
                z3 = true;
                vf0Var3 = vf0Var4;
                nvVar3 = pv.c;
            } else {
                dd4Var.Y();
                i2 = i3 & (-3727361);
                nvVar3 = nvVar;
                vf0Var3 = vf0Var;
                s04Var3 = s04Var;
                z3 = z;
            }
            pj7 pj7Var3 = pj7Var;
            dd4Var.r();
            rw1.j(ou6Var, st5Var, pj7Var3, false, nvVar3, vf0Var3, s04Var3, z3, null, kb4Var, dd4Var, (33554430 & i2) | ((i2 << 3) & 1879048192), 256);
            z2 = z3;
            s04Var2 = s04Var3;
            vf0Var2 = vf0Var3;
            nvVar2 = nvVar3;
            pj7Var2 = pj7Var3;
        } else {
            dd4Var.Y();
            pj7Var2 = pj7Var;
            nvVar2 = nvVar;
            vf0Var2 = vf0Var;
            s04Var2 = s04Var;
            z2 = z;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new st3(ou6Var, st5Var, pj7Var2, nvVar2, vf0Var2, s04Var2, z2, kb4Var, i);
        }
    }

    public static final fv1 g0(iv1 iv1Var) {
        iv1Var.getClass();
        long j = iv1Var.a;
        String str = iv1Var.b;
        String str2 = iv1Var.c;
        String str3 = iv1Var.d;
        String str4 = iv1Var.e;
        jf6 jf6Var = iv1Var.f;
        gf6 gf6VarX = jf6Var != null ? yb0.X(jf6Var) : null;
        int i = iv1Var.g;
        sgb sgbVarM = null;
        int i2 = iv1Var.h;
        gf6 gf6Var = gf6VarX;
        boolean z = iv1Var.i;
        hhb hhbVar = iv1Var.j;
        if (hhbVar != null) {
            sgbVarM = oh9.m(hhbVar);
        }
        return new fv1(j, str, str2, str3, str4, gf6Var, i, i2, z, sgbVarM, iv1Var.k, iv1Var.l);
    }

    public static final void h(final ou6 ou6Var, final st5 st5Var, pj7 pj7Var, boolean z, kv kvVar, wf0 wf0Var, s04 s04Var, final boolean z2, final kb4 kb4Var, dd4 dd4Var, final int i, final int i2) {
        boolean z3;
        int i3;
        final pj7 pj7Var2;
        final kv kvVar2;
        final wf0 wf0Var2;
        final s04 s04Var2;
        final boolean z4;
        kv kvVar3;
        int i4;
        pj7 pj7Var3;
        s04 s04Var3;
        boolean z5;
        wf0 wf0Var3;
        kb4Var.getClass();
        dd4Var.h0(-357087652);
        int i5 = i | (dd4Var.f(st5Var) ? 32 : 16);
        int i6 = i5 | 384;
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 = i5 | 3456;
            z3 = z;
        } else {
            z3 = z;
            i3 = i6 | (dd4Var.g(z3) ? 2048 : 1024);
        }
        int i8 = i3 | 729088;
        if ((i & 12582912) == 0) {
            i8 |= dd4Var.g(z2) ? 8388608 : 4194304;
        }
        int i9 = i8 | (dd4Var.h(kb4Var) ? 67108864 : 33554432);
        if (dd4Var.V(i9 & 1, (38347923 & i9) != 38347922)) {
            dd4Var.a0();
            if ((i & 1) == 0 || dd4Var.C()) {
                pj7 rj7Var = new rj7(0.0f, 0.0f, 0.0f, 0.0f);
                boolean z6 = i7 == 0 ? z3 : false;
                iv ivVar = !z6 ? pv.a : pv.b;
                wf0 wf0Var4 = bv4.w;
                s04 s04VarB0 = b0((((-57345) & i9) >> 3) & 14, dd4Var, st5Var);
                kvVar3 = ivVar;
                i4 = i9 & (-3727361);
                pj7Var3 = rj7Var;
                boolean z7 = z6;
                s04Var3 = s04VarB0;
                z5 = z7;
                wf0Var3 = wf0Var4;
            } else {
                dd4Var.Y();
                kvVar3 = kvVar;
                wf0Var3 = wf0Var;
                s04Var3 = s04Var;
                z5 = z3;
                i4 = i9 & (-3727361);
                pj7Var3 = pj7Var;
            }
            dd4Var.r();
            rw1.k(ou6Var, st5Var, pj7Var3, z5, kvVar3, wf0Var3, s04Var3, z2, null, kb4Var, dd4Var, (33554430 & i4) | ((i4 << 3) & 1879048192), 256);
            s04Var2 = s04Var3;
            wf0Var2 = wf0Var3;
            kvVar2 = kvVar3;
            z4 = z5;
            pj7Var2 = pj7Var3;
        } else {
            dd4Var.Y();
            pj7Var2 = pj7Var;
            kvVar2 = kvVar;
            wf0Var2 = wf0Var;
            s04Var2 = s04Var;
            z4 = z3;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: wt5
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    y86.h(ou6Var, st5Var, pj7Var2, z4, kvVar2, wf0Var2, s04Var2, z2, kb4Var, (dd4) obj, qu1.x0(i | 1), i2);
                    return heb.a;
                }
            };
        }
    }

    public static Map h0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return mc3.a;
        }
        int i = 0;
        if (size == 1) {
            xl7 xl7Var = (xl7) arrayList.get(0);
            xl7Var.getClass();
            Map mapSingletonMap = Collections.singletonMap(xl7Var.a, xl7Var.b);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(O(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            xl7 xl7Var2 = (xl7) obj;
            linkedHashMap.put(xl7Var2.a, xl7Var2.b);
        }
        return linkedHashMap;
    }

    public static final void i(u83 u83Var, ac4 ac4Var, dd4 dd4Var, int i) {
        u83Var.getClass();
        ac4Var.getClass();
        dd4Var.h0(984946548);
        int i2 = 2;
        int i3 = i | (dd4Var.f(u83Var) ? 4 : 2) | (dd4Var.h(ac4Var) ? 32 : 16);
        int i4 = 0;
        int i5 = 1;
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            boolean zBooleanValue = ((Boolean) u83Var.a.getValue()).booleanValue();
            ou6 ou6VarE = yib.E(lu6.a, 14);
            boolean z = (i3 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new ik6(u83Var, i4);
                dd4Var.p0(objQ);
            }
            z8.d(zBooleanValue, (kb4) objQ, jf0.G(1718871752, new lk6(u83Var, ac4Var), dd4Var), null, ou6VarE, jf0.G(-1997301941, new jk6(u83Var, i5), dd4Var), s32.o, null, 0L, 0L, 0.0f, false, false, jf0.G(-1777087712, new jk6(u83Var, i2), dd4Var), dd4Var, 1769856, 8072);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new lk6(u83Var, ac4Var, i);
        }
    }

    public static Map i0(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return mc3.a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static final void j(boolean z, int i, int i2, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i3) {
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var.h0(476098755);
        int i4 = i3 | (dd4Var.g(z) ? 4 : 2) | (dd4Var.d(i) ? 32 : 16) | (dd4Var.d(i2) ? 256 : Token.CASE) | (dd4Var.h(kb4Var) ? 2048 : 1024) | (dd4Var.h(kb4Var2) ? 16384 : 8192);
        if (dd4Var.V(i4 & 1, (i4 & 9363) != 9362)) {
            int i5 = i4 & 14;
            boolean z2 = i5 == 4;
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                int i6 = i + 1;
                String strValueOf = String.valueOf(i6);
                int length = String.valueOf(i6).length();
                objQ = dk9.x(new wga(strValueOf, zk9.h(length, length), 4));
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            z8.d(z, kb4Var, jf0.G(-841839081, new ao0(kb4Var, kb4Var2, a07Var, i2, i, 4), dd4Var), null, yib.E(lu6.a, 14), jf0.G(1440735002, new bo6(i, kb4Var, a07Var), dd4Var), ah1.t, null, 0L, 0L, 0.0f, false, false, jf0.G(-2027104657, new sz4(a07Var, i2, 4), dd4Var), dd4Var, 1769856 | i5 | ((i4 >> 6) & Token.ASSIGN_MOD), 8072);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new vq6(z, i, i2, kb4Var, kb4Var2, i3);
        }
    }

    public static LinkedHashMap j0(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }

    public static final void k(ArrayList arrayList, List list, Set set, Set set2, dd4 dd4Var, int i) {
        dd4Var.h0(-720826424);
        int i2 = (i & 6) == 0 ? (dd4Var.h(arrayList) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= dd4Var.h(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.h(set) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.h(set2) ? 2048 : 1024;
        }
        if (dd4Var.V(i2 & 1, (i2 & 1171) != 1170)) {
            a07 a07VarA = dk9.A(arrayList, dd4Var);
            a07 a07VarA2 = dk9.A(list, dd4Var);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = ((c37) arrayList.get(i3)).b;
                set.add(obj);
                List listZ0 = fc1.Z0(arrayList);
                boolean zF = dd4Var.f(a07VarA) | dd4Var.h(obj) | dd4Var.h(set) | dd4Var.h(set2) | dd4Var.f(a07VarA2);
                Object objQ = dd4Var.Q();
                if (zF || objQ == vl1.a) {
                    x5 x5Var = new x5(obj, (Object) set, (Object) set2, a07VarA, a07VarA2, 4);
                    dd4Var.p0(x5Var);
                    objQ = x5Var;
                }
                lc5.k(obj, listZ0, (kb4) objQ, dd4Var);
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new o50(arrayList, list, set, set2, i, 2);
        }
    }

    public static final String k0(lf8 lf8Var) {
        lf8Var.getClass();
        return "[" + tw1.P(2, lf8Var.a) + 'x' + tw1.P(2, lf8Var.b) + ',' + tw1.P(2, lf8Var.c) + 'x' + tw1.P(2, lf8Var.d) + ']';
    }

    public static final void l(String str, boolean z, ib4 ib4Var, dd4 dd4Var, int i) {
        dd4 dd4Var2;
        long jG;
        dd4Var.h0(1947045250);
        int i2 = i | (dd4Var.f(str) ? 4 : 2) | (dd4Var.g(z) ? 32 : 16) | (dd4Var.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            if (z) {
                dd4Var.f0(891892676);
                jG = lc1.c(0.2f, ((q96) dd4Var.j(s96.a)).a.a);
                dd4Var.q(false);
            } else {
                dd4Var.f0(891989985);
                jG = dd1.g(((q96) dd4Var.j(s96.a)).a, 1.0f);
                dd4Var.q(false);
            }
            lp4 lp4Var = jf0.G;
            lu6 lu6Var = lu6.a;
            ou6 ou6VarL = fe.L(lu6Var, jG, lp4Var);
            boolean z2 = (i2 & 896) == 256;
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = new i35(18, ib4Var);
                dd4Var.p0(objQ);
            }
            ou6 ou6VarM0 = gjb.m0(fw.J(null, (ib4) objQ, ou6VarL, false, 15), 8.0f, 4.0f);
            ha6 ha6VarD = pn0.d(bv4.b, false);
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
            un9.s(ll1.f, dd4Var, ha6VarD);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            ur9 ur9Var = s96.a;
            nha.c(str, zn0.a.a(lu6Var, bv4.f), ((q96) dd4Var.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.k, dd4Var, i2 & 14, 0, 131064);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new mk6(str, z, ib4Var, i, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r15 == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l0(u1a r12, defpackage.tda r13, mx7 r14, defpackage.vc0 r15) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y86.l0(u1a, tda, mx7, vc0):java.lang.Object");
    }

    public static final void m(ou6 ou6Var, yb4 yb4Var, yb4 yb4Var2, zb4 zb4Var, yb4 yb4Var3, yb4 yb4Var4, float f, rj1 rj1Var, yb4 yb4Var5, pj7 pj7Var, dd4 dd4Var, int i) {
        int i2;
        int i3;
        yb4 yb4Var6;
        zb4 zb4Var2;
        zm5 zm5Var;
        f9 f9Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        yb4 yb4Var7 = yb4Var5;
        f9 f9Var2 = bv4.b;
        xf0 xf0Var = bv4.f;
        ou6Var.getClass();
        yb4Var.getClass();
        dd4Var.h0(-1102817440);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(ou6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.h(yb4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.h(yb4Var2) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.h(zb4Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var.h(yb4Var3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dd4Var.h(yb4Var4) ? 131072 : Parser.ARGC_LIMIT;
        }
        int i4 = i2;
        if ((1572864 & i) == 0) {
            i3 = i4 | (dd4Var.g(false) ? 1048576 : 524288);
        } else {
            i3 = i4;
        }
        if ((i & 12582912) == 0) {
            i3 |= dd4Var.c(f) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= dd4Var.h(rj1Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= dd4Var.h(yb4Var7) ? 536870912 : 268435456;
        }
        char c = dd4Var.f(pj7Var) ? (char) 4 : (char) 2;
        int i5 = i3;
        if (dd4Var.V(i5 & 1, ((i3 & 306783379) == 306783378 && (c & 3) == 2) ? false : true)) {
            boolean z5 = ((i5 & 3670016) == 1048576) | ((i5 & 29360128) == 8388608) | ((c & 14) == 4);
            Object objQ = dd4Var.Q();
            if (z5 || objQ == vl1.a) {
                objQ = new yfa(f, pj7Var);
                dd4Var.p0(objQ);
            }
            yfa yfaVar = (yfa) objQ;
            zm5 zm5Var2 = (zm5) dd4Var.j(xm1.n);
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
            un9.s(jmVar, dd4Var, yfaVar);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var, ou6VarL0);
            rj1Var.invoke(dd4Var, Integer.valueOf((i5 >> 24) & 14));
            lu6 lu6Var = lu6.a;
            if (yb4Var3 != null) {
                dd4Var.f0(296892829);
                f9Var = f9Var2;
                ou6 ou6VarE = h67.x0(lu6Var, "Leading").e(do8.e);
                ha6 ha6VarD = pn0.d(xf0Var, false);
                int iHashCode2 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL2 = dd4Var.l();
                ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarE);
                dd4Var.j0();
                zm5Var = zm5Var2;
                if (dd4Var.S) {
                    dd4Var.k(um1Var);
                } else {
                    dd4Var.s0();
                }
                un9.s(jmVar, dd4Var, ha6VarD);
                un9.s(jmVar2, dd4Var, lr7VarL2);
                ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
                un9.s(jmVar4, dd4Var, ou6VarL02);
                z = false;
                xv5.w((i5 >> 12) & 14, yb4Var3, dd4Var, true, false);
            } else {
                zm5Var = zm5Var2;
                f9Var = f9Var2;
                z = false;
                dd4Var.f0(297183051);
                dd4Var.q(false);
            }
            if (yb4Var4 != null) {
                dd4Var.f0(297227195);
                ou6 ou6VarE2 = h67.x0(lu6Var, "Trailing").e(do8.e);
                ha6 ha6VarD2 = pn0.d(xf0Var, z);
                int iHashCode3 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL3 = dd4Var.l();
                ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarE2);
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var);
                } else {
                    dd4Var.s0();
                }
                un9.s(jmVar, dd4Var, ha6VarD2);
                un9.s(jmVar2, dd4Var, lr7VarL3);
                ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
                un9.s(jmVar4, dd4Var, ou6VarL03);
                xv5.w((i5 >> 15) & 14, yb4Var4, dd4Var, true, false);
            } else {
                dd4Var.f0(297519339);
                dd4Var.q(z);
            }
            zm5 zm5Var3 = zm5Var;
            float fW = gjb.W(pj7Var, zm5Var3);
            float fV = gjb.V(pj7Var, zm5Var3);
            if (yb4Var3 != null) {
                fW -= do8.c;
                if (fW < 0.0f) {
                    fW = 0.0f;
                }
            }
            float f2 = fW;
            if (yb4Var4 != null) {
                fV -= do8.c;
                if (fV < 0.0f) {
                    fV = 0.0f;
                }
            }
            ou6 ou6VarP0 = gjb.p0(lu6Var, f2, 0.0f, fV, 0.0f, 10);
            if (zb4Var != null) {
                dd4Var.f0(298281815);
                zb4Var2 = zb4Var;
                zb4Var2.c(h67.x0(lu6Var, "Hint").e(ou6VarP0), dd4Var, Integer.valueOf((i5 >> 6) & Token.ASSIGN_MOD));
                z2 = false;
                dd4Var.q(false);
            } else {
                zb4Var2 = zb4Var;
                z2 = false;
                dd4Var.f0(298454795);
                dd4Var.q(false);
            }
            if (yb4Var2 != null) {
                dd4Var.f0(298492057);
                ou6 ou6VarE3 = h67.x0(lu6Var, "Label").e(ou6VarP0);
                ha6 ha6VarD3 = pn0.d(f9Var, z2);
                int iHashCode4 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL4 = dd4Var.l();
                ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarE3);
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var);
                } else {
                    dd4Var.s0();
                }
                un9.s(jmVar, dd4Var, ha6VarD3);
                un9.s(jmVar2, dd4Var, lr7VarL4);
                ky0.v(iHashCode4, dd4Var, jmVar3, dd4Var, kdVar);
                un9.s(jmVar4, dd4Var, ou6VarL04);
                z3 = true;
                xv5.w((i5 >> 6) & 14, yb4Var2, dd4Var, true, false);
            } else {
                z3 = true;
                dd4Var.f0(298663115);
                dd4Var.q(z2);
            }
            ou6 ou6VarE4 = h67.x0(lu6Var, "TextField").e(ou6VarP0);
            f9 f9Var3 = f9Var;
            ha6 ha6VarD4 = pn0.d(f9Var3, z3);
            int iHashCode5 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL5 = dd4Var.l();
            ou6 ou6VarL05 = s32.L0(dd4Var, ou6VarE4);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, ha6VarD4);
            un9.s(jmVar2, dd4Var, lr7VarL5);
            ky0.v(iHashCode5, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL05);
            yb4Var6 = yb4Var;
            yb4Var6.invoke(dd4Var, Integer.valueOf((i5 >> 3) & 14));
            dd4Var.q(true);
            if (yb4Var5 != null) {
                dd4Var.f0(298944037);
                ou6 ou6VarX0 = h67.x0(lu6Var, "Supporting");
                float f3 = do8.b;
                ou6 ou6VarK0 = gjb.k0(ou6VarX0, new rj7(f3, do8.d, f3, 0.0f));
                ha6 ha6VarD5 = pn0.d(f9Var3, false);
                int iHashCode6 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL6 = dd4Var.l();
                ou6 ou6VarL06 = s32.L0(dd4Var, ou6VarK0);
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var);
                } else {
                    dd4Var.s0();
                }
                un9.s(jmVar, dd4Var, ha6VarD5);
                un9.s(jmVar2, dd4Var, lr7VarL6);
                ky0.v(iHashCode6, dd4Var, jmVar3, dd4Var, kdVar);
                un9.s(jmVar4, dd4Var, ou6VarL06);
                yb4Var7 = yb4Var5;
                z4 = true;
                xv5.w((i5 >> 27) & 14, yb4Var7, dd4Var, true, false);
            } else {
                yb4Var7 = yb4Var5;
                z4 = true;
                dd4Var.f0(299165067);
                dd4Var.q(false);
            }
            dd4Var.q(z4);
        } else {
            yb4Var6 = yb4Var;
            zb4Var2 = zb4Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xt1(ou6Var, yb4Var6, yb4Var2, zb4Var2, yb4Var3, yb4Var4, f, rj1Var, yb4Var7, pj7Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(float r20, int r21, int r22, long r23, dd4 r25, ou6 r26) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y86.n(float, int, int, long, dd4, ou6):void");
    }

    public static float o(EdgeEffect edgeEffect, float f, float f2, pn2 pn2Var) {
        float f3 = e83.a;
        double dB = pn2Var.b() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) e83.a) * dB;
        float fExp = (float) (Math.exp((e83.b / e83.c) * Math.log(dAbs / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? je.k(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iM = t96.M(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iM);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iM);
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(u1a r6, defpackage.vc0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.b19
            if (r0 == 0) goto L13
            r0 = r7
            b19 r0 = (defpackage.b19) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            b19 r0 = new b19
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            u1a r6 = r0.a
            defpackage.e11.e0(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.e11.e0(r7)
        L31:
            r0.a = r6
            r0.c = r2
            nx7 r7 = nx7.b
            java.lang.Object r7 = r6.c(r7, r0)
            xx1 r1 = defpackage.xx1.a
            if (r7 != r1) goto L40
            return r1
        L40:
            mx7 r7 = (mx7) r7
            java.util.List r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            ux7 r5 = (ux7) r5
            boolean r5 = vv1.p(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y86.p(u1a, vc0):java.lang.Object");
    }

    public static final int q(int i, boolean z, int i2, int i3, int i4, int i5, int i6, long j, float f, pj7 pj7Var) {
        float f2 = 4.0f * f;
        float fD = pj7Var.d() * f;
        float fA = pj7Var.a() * f;
        int iMax = Math.max(i, i5);
        return Math.max(up1.j(j), Math.max(i3, Math.max(i4, t96.M(z ? i2 + f2 + iMax + fA : fD + iMax + fA))) + i6);
    }

    public static final Object r(kb4 kb4Var, kt1 kt1Var) {
        ay0 ay0Var = new ay0(1, bx1.J(kt1Var));
        ay0Var.u();
        ng8 ng8Var = new ng8();
        ay0Var.w(new jh5(ng8Var, 0));
        kb4Var.invoke(new kh5(ng8Var, ay0Var, 0));
        return ay0Var.s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r15 == r6) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(u1a r11, defpackage.tda r12, mx7 r13, int r14, defpackage.vc0 r15) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y86.s(u1a, tda, mx7, int, vc0):java.lang.Object");
    }

    public static final it2 t(it2 it2Var, it2 it2Var2, l19 l19Var, long j, p09 p09Var) {
        if (p09Var == null) {
            return lw1.P(it2Var, it2Var2);
        }
        int iCompare = l19Var.f.compare(Long.valueOf(p09Var.c), Long.valueOf(j));
        return iCompare < 0 ? it2.a : iCompare > 0 ? it2.c : it2.b;
    }

    public static final Object u(ListenableFuture listenableFuture, kt1 kt1Var) throws Throwable {
        try {
            if (listenableFuture.isDone()) {
                return x2.f(listenableFuture);
            }
            ay0 ay0Var = new ay0(1, bx1.J(kt1Var));
            listenableFuture.addListener(new iva(listenableFuture, ay0Var, 1), gt2.a);
            ay0Var.w(new k9(listenableFuture, 25));
            return ay0Var.s();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            kk5 kk5Var = new kk5();
            lc5.f0(kk5Var, lc5.class.getName());
            throw kk5Var;
        }
    }

    public static final Object v(zx7 zx7Var, vv6 vv6Var, tda tdaVar, jt1 jt1Var) {
        v1a v1aVar = (v1a) zx7Var;
        v1aVar.getClass();
        ftb ftbVar = vw1.S(v1aVar).N;
        og ogVar = new og();
        ogVar.b = ftbVar;
        Object objK = vv1.k(zx7Var, new le5(ogVar, vv6Var, tdaVar, null, 3), jt1Var);
        return objK == xx1.a ? objK : heb.a;
    }

    public static final void w(kb4 kb4Var, Object obj, jx1 jx1Var) {
        fi1 fi1VarX = x(kb4Var, obj, null);
        if (fi1VarX != null) {
            qx1.y(jx1Var, fi1VarX);
        }
    }

    public static final fi1 x(kb4 kb4Var, Object obj, fi1 fi1Var) {
        try {
            kb4Var.invoke(obj);
            return fi1Var;
        } catch (Throwable th) {
            if (fi1Var == null || fi1Var.getCause() == th) {
                return new fi1(ky0.p(obj, "Exception in undelivered element handler for "), th);
            }
            i12.r(fi1Var, th);
            return fi1Var;
        }
    }

    public static dt8 y(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            dt8 dt8Var = new dt8();
            new LinkedHashMap();
            dt8Var.a = new nc1(mc3.a);
            return dt8Var;
        }
        ClassLoader classLoader = dt8.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        f86 f86Var = new f86(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            f86Var.put(str, bundle.get(str));
        }
        f86 f86VarC = f86Var.c();
        dt8 dt8Var2 = new dt8();
        new LinkedHashMap();
        dt8Var2.a = new nc1(f86VarC);
        return dt8Var2;
    }

    public static final c37 z(c37 c37Var, List list, Set set, Set set2, dd4 dd4Var, int i) {
        dd4Var.f0(-1239021605);
        a07 a07VarA = dk9.A(list, dd4Var);
        Object obj = c37Var.b;
        dd4Var.c0(-993800456, obj);
        c37 c37Var2 = new c37(c37Var, jf0.G(-1349345695, new m85(set2, obj, set, a07VarA, list, c37Var, 3), dd4Var));
        dd4Var.q(false);
        dd4Var.q(false);
        return c37Var2;
    }
}

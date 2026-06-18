package defpackage;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class tw1 {
    public static final float b = 1.0f;
    public final /* synthetic */ int a = 7;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A(defpackage.kt1 r4) {
        /*
            boolean r0 = r4 instanceof jm2
            if (r0 == 0) goto L13
            r0 = r4
            jm2 r0 = (jm2) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            jm2 r0 = new jm2
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.a
            int r1 = r0.b
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return
        L27:
            defpackage.e11.e0(r4)
            goto L45
        L2b:
            defpackage.e11.e0(r4)
            r0.b = r2
            ay0 r4 = new ay0
            jt1 r0 = bx1.J(r0)
            r4.<init>(r2, r0)
            r4.u()
            java.lang.Object r4 = r4.s()
            xx1 r0 = defpackage.xx1.a
            if (r4 != r0) goto L45
            return
        L45:
            defpackage.if2.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw1.A(kt1):void");
    }

    public static void B(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void C(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static Object D(mw4 mw4Var, i02 i02Var, iy iyVar, cp4 cp4Var, l5c l5cVar) {
        lp8 lp8Var = new lp8(new qg0(i02Var), 15);
        iyVar.getClass();
        Object objC = mw4Var.c(lp8Var, new uf4(iyVar, 17), cp4Var.b / 10.0f, l5cVar);
        return objC == xx1.a ? objC : heb.a;
    }

    public static final sn7 E(List list) {
        lc3 lc3Var = lc3.a;
        sn7 sn7Var = new sn7(lc3Var, lc3Var);
        if (!list.isEmpty()) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                sn7Var = F((sn7) listIterator.previous(), sn7Var);
            }
        }
        return G(sn7Var, lc3Var);
    }

    public static final sn7 F(sn7 sn7Var, sn7 sn7Var2) {
        boolean zIsEmpty = sn7Var.b.isEmpty();
        List list = sn7Var.a;
        if (zIsEmpty) {
            return new sn7(fc1.I0(list, sn7Var2.a), sn7Var2.b);
        }
        List list2 = sn7Var.b;
        ArrayList arrayList = new ArrayList(gc1.M(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(F((sn7) it.next(), sn7Var2));
        }
        return new sn7(list, arrayList);
    }

    public static final sn7 G(sn7 sn7Var, List list) {
        List listY;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        ArrayList arrayList3 = null;
        for (rn7 rn7Var : sn7Var.a) {
            if (rn7Var instanceof ha7) {
                if (arrayList3 != null) {
                    arrayList3.addAll(((ha7) rn7Var).a);
                } else {
                    arrayList3 = new ArrayList(((ha7) rn7Var).a);
                }
            } else if (rn7Var instanceof wdb) {
                arrayList2.add(rn7Var);
            } else {
                if (arrayList3 != null) {
                    arrayList.add(new ha7(arrayList3));
                    arrayList3 = null;
                }
                arrayList.add(rn7Var);
            }
        }
        List list2 = sn7Var.b;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            sn7 sn7VarG = G((sn7) it.next(), arrayList2);
            if (sn7VarG.a.isEmpty()) {
                listY = sn7VarG.b;
                if (listY.isEmpty()) {
                    listY = gc1.Y(sn7VarG);
                }
            } else {
                listY = gc1.Y(sn7VarG);
            }
            fc1.p0(arrayList4, listY);
        }
        boolean zIsEmpty = arrayList4.isEmpty();
        List<sn7> listY2 = arrayList4;
        if (zIsEmpty) {
            listY2 = gc1.Y(new sn7(arrayList2, lc3.a));
        }
        if (arrayList3 == null) {
            return new sn7(arrayList, listY2);
        }
        if (!listY2.isEmpty()) {
            Iterator it2 = listY2.iterator();
            while (it2.hasNext()) {
                rn7 rn7Var2 = (rn7) fc1.z0(((sn7) it2.next()).a);
                if (rn7Var2 != null && (rn7Var2 instanceof ha7)) {
                    ArrayList arrayList5 = new ArrayList(gc1.M(listY2, 10));
                    for (sn7 sn7Var2 : listY2) {
                        List list3 = sn7Var2.a;
                        List list4 = sn7Var2.b;
                        rn7 rn7Var3 = (rn7) fc1.z0(list3);
                        arrayList5.add(rn7Var3 instanceof ha7 ? new sn7(fc1.I0(gc1.Y(new ha7(fc1.I0(arrayList3, ((ha7) rn7Var3).a))), fc1.t0(list3, 1)), list4) : rn7Var3 == null ? new sn7(gc1.Y(new ha7(arrayList3)), list4) : new sn7(fc1.I0(gc1.Y(new ha7(arrayList3)), list3), list4));
                    }
                    return new sn7(arrayList, arrayList5);
                }
            }
        }
        arrayList.add(new ha7(arrayList3));
        return new sn7(arrayList, listY2);
    }

    public static final Object H(long j, jt1 jt1Var) {
        if (j > 0) {
            ay0 ay0Var = new ay0(1, bx1.J(jt1Var));
            ay0Var.u();
            if (j < Long.MAX_VALUE) {
                Q(ay0Var.e).q(j, ay0Var);
            }
            Object objS = ay0Var.s();
            if (objS == xx1.a) {
                return objS;
            }
        }
        return heb.a;
    }

    public static final Object I(long j, kt1 kt1Var) {
        Object objH = H(k0(j), kt1Var);
        return objH == xx1.a ? objH : heb.a;
    }

    public static void K(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ni1 ni1Var = (ni1) obj;
            r22 r22Var = new r22(ni1Var);
            for (oa8 oa8Var : ni1Var.b) {
                boolean z = ni1Var.e == 0;
                s22 s22Var = new s22(oa8Var, !z);
                if (!map.containsKey(s22Var)) {
                    map.put(s22Var, new HashSet());
                }
                Set set = (Set) map.get(s22Var);
                if (!set.isEmpty() && z) {
                    so9.s(oa8Var, ".", "Multiple components provide ");
                    return;
                }
                set.add(r22Var);
            }
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            for (r22 r22Var2 : (Set) it.next()) {
                for (vn2 vn2Var : r22Var2.a.c) {
                    if (vn2Var.c == 0) {
                        Set<r22> set2 = (Set) map.get(new s22(vn2Var.a, vn2Var.b == 2));
                        if (set2 != null) {
                            for (r22 r22Var3 : set2) {
                                r22Var2.b.add(r22Var3);
                                r22Var3.c.add(r22Var2);
                            }
                        }
                    }
                }
            }
        }
        HashSet<r22> hashSet = new HashSet();
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        for (r22 r22Var4 : hashSet) {
            if (r22Var4.c.isEmpty()) {
                hashSet2.add(r22Var4);
            }
        }
        while (!hashSet2.isEmpty()) {
            r22 r22Var5 = (r22) hashSet2.iterator().next();
            hashSet2.remove(r22Var5);
            i++;
            for (r22 r22Var6 : r22Var5.b) {
                r22Var6.c.remove(r22Var5);
                if (r22Var6.c.isEmpty()) {
                    hashSet2.add(r22Var6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (r22 r22Var7 : hashSet) {
            if (!r22Var7.c.isEmpty() && !r22Var7.b.isEmpty()) {
                arrayList2.add(r22Var7.a);
            }
        }
        throw new xn2("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static final float L(float f) {
        if (f == -0.0f) {
            return 0.0f;
        }
        return f;
    }

    public static final oi5 M(q2 q2Var, am1 am1Var, String str) {
        q2Var.getClass();
        oi5 oi5VarF = q2Var.f(am1Var, str);
        if (oi5VarF != null) {
            return oi5VarF;
        }
        t96.R(q2Var.h(), str);
        throw null;
    }

    public static final oi5 N(q2 q2Var, md2 md2Var, Object obj) {
        q2Var.getClass();
        obj.getClass();
        oi5 oi5VarG = q2Var.g(md2Var, obj);
        if (oi5VarG != null) {
            return oi5VarG;
        }
        a91 a91VarA = ug8.a(obj.getClass());
        a91 a91VarH = q2Var.h();
        a91VarH.getClass();
        String strG = a91VarA.g();
        if (strG == null) {
            strG = String.valueOf(a91VarA);
        }
        t96.R(a91VarH, strG);
        throw null;
    }

    public static final pv9 O(int i) {
        return (i == 1 || i == 2) ? (pv9) iu9.a.getValue() : i != 4 ? (pv9) iu9.b.getValue() : (pv9) iu9.c.getValue();
    }

    public static final float P(int i, float f) {
        if (Float.isNaN(f)) {
            return f;
        }
        double dPow = Math.pow(10.0d, i);
        return (float) (Math.rint(((double) f) * dPow) / dPow);
    }

    public static final im2 Q(jx1 jx1Var) {
        hx1 hx1Var = jx1Var.get(g83.d);
        im2 im2Var = hx1Var instanceof im2 ? (im2) hx1Var : null;
        return im2Var == null ? pg2.a : im2Var;
    }

    public static Set R() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final int S(gx6 gx6Var, long j, ftb ftbVar) {
        float fG = ftbVar != null ? ftbVar.g() : 0.0f;
        int i = (int) (4294967295L & j);
        int iE = gx6Var.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < gx6Var.g(iE) - fG || Float.intBitsToFloat(i) > gx6Var.b(iE) + fG) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-fG) || Float.intBitsToFloat(i2) > gx6Var.d + fG) {
            return -1;
        }
        return iE;
    }

    public static final Object T(w19 w19Var, m29 m29Var) {
        Object objG = w19Var.a.g(m29Var);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final long U(qv5 qv5Var, kf8 kf8Var, int i) {
        so9 so9Var = fu6.K;
        rha rhaVarD = qv5Var.d();
        gx6 gx6Var = rhaVarD != null ? rhaVarD.a.b : null;
        ym5 ym5VarC = qv5Var.c();
        return (gx6Var == null || ym5VarC == null) ? pja.b : gx6Var.j(kf8Var.l(ym5VarC.N(0L)), i, so9Var);
    }

    public static final boolean V(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean W(np8 np8Var) {
        long j = np8Var.e;
        return (j >>> 32) == (4294967295L & j) && j == np8Var.f && j == np8Var.g && j == np8Var.h;
    }

    public static final boolean X(long j, long j2) {
        xl7 xl7Var;
        if (!rw1.O(j) && !rw1.O(j2)) {
            int i = oa5.c;
            int i2 = (int) (j >> 32);
            int i3 = (int) (j & 4294967295L);
            if ((i2 <= i3 || ((int) (j2 >> 32)) >= ((int) (j2 & 4294967295L))) && (i2 >= i3 || ((int) (j2 >> 32)) <= ((int) (j2 & 4294967295L)))) {
                int i4 = (int) (j2 >> 32);
                if (i2 > i4 && i3 > ((int) (j2 & 4294967295L))) {
                    xl7Var = new xl7(new oa5(j), new oa5(j2));
                } else if (i2 < i4 && i3 < ((int) (j2 & 4294967295L))) {
                    xl7Var = new xl7(new oa5(j2), new oa5(j));
                }
                long j3 = ((oa5) xl7Var.a).a;
                long j4 = ((oa5) xl7Var.b).a;
                float f = (int) (j3 >> 32);
                float f2 = (int) (j4 >> 32);
                float f3 = (int) (j3 & 4294967295L);
                float f4 = (int) (j4 & 4294967295L);
                boolean z = Math.abs((f3 / (f / f2)) - f4) <= 2.0f;
                boolean z2 = Math.abs((f / (f3 / f4)) - f2) <= 2.0f;
                if (z || z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean Y(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean Z(int i) {
        int type;
        return (!Y(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    public static final void a(String str, String str2, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1685744902);
        int i2 = i | (dd4Var2.f(str) ? 4 : 2) | (dd4Var2.f(str2) ? 32 : 16) | (dd4Var2.f(ou6Var) ? 256 : Token.CASE) | (dd4Var2.h(kb4Var) ? 2048 : 1024);
        if (dd4Var2.V(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 >> 6;
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
            un9.s(ll1.f, dd4Var2, ie1VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            ur9 ur9Var = s96.a;
            nha.c(str, (ou6) null, lc1.c(0.5f, ((q96) dd4Var2.j(ur9Var)).a.q), (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.l, dd4Var2, i2 & 14, 0, 131066);
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var2, tg9.h(lu6Var, 8.0f));
            lx1.m(str2, kb4Var, tg9.f(lu6Var, 1.0f), false, false, null, null, null, null, null, false, null, new qj5(3, 0, Token.EXPORT), null, true, 0, 0, ((q96) dd4Var2.j(ur9Var)).c.b, null, dd4Var2, ((i2 >> 3) & 14) | 384 | (i3 & Token.ASSIGN_MOD), 12779520, 6127608);
            dd4Var2 = dd4Var2;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new lm3(str, str2, ou6Var, kb4Var, i, 0);
        }
    }

    public static final float a0(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList b0(hn7 r30) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw1.b0(hn7):java.util.ArrayList");
    }

    public static final void c(boolean z, cm3 cm3Var, kb4 kb4Var, zb4 zb4Var, dd4 dd4Var, int i) {
        cm3Var.getClass();
        String str = cm3Var.u;
        String str2 = cm3Var.t;
        sl3 sl3Var = cm3Var.s;
        kb4Var.getClass();
        zb4Var.getClass();
        dd4Var.h0(1176072922);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(cm3Var) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(zb4Var) ? 2048 : 1024);
        if (dd4Var.V(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 14;
            boolean zD = dd4Var.d(sl3Var.ordinal()) | (i3 == 4);
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            if (zD || objQ == fu6Var) {
                objQ = dk9.x(sl3Var);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            boolean zF = dd4Var.f(str2) | (i3 == 4);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == fu6Var) {
                objQ2 = dk9.x(str2);
                dd4Var.p0(objQ2);
            }
            a07 a07Var2 = (a07) objQ2;
            boolean zF2 = dd4Var.f(str) | (i3 == 4);
            Object objQ3 = dd4Var.Q();
            if (zF2 || objQ3 == fu6Var) {
                objQ3 = dk9.x(str);
                dd4Var.p0(objQ3);
            }
            fw.q(z, kb4Var, null, true, null, null, 0L, 0L, 0.0f, 0L, null, jf0.G(-1539797962, new sz0(a07Var, a07Var2, (a07) objQ3, (Object) zb4Var, (Object) kb4Var, 6), dd4Var), dd4Var, i3 | 3072 | ((i2 >> 3) & Token.ASSIGN_MOD), 48, 2036);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new i90(z, cm3Var, kb4Var, zb4Var, i, 5);
        }
    }

    public static rg2 c0(hn7 hn7Var) {
        hn7Var.N(1);
        int iC = hn7Var.C();
        long j = ((long) hn7Var.b) + ((long) iC);
        int i = iC / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jT = hn7Var.t();
            if (jT == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jT;
            jArrCopyOf2[i2] = hn7Var.t();
            hn7Var.N(2);
            i2++;
        }
        hn7Var.N((int) (j - ((long) hn7Var.b)));
        return new rg2(15, jArrCopyOf, jArrCopyOf2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(java.lang.String r16, boolean r17, defpackage.ib4 r18, defpackage.yb4 r19, dd4 r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tw1.d(java.lang.String, boolean, ib4, yb4, dd4, int, int):void");
    }

    public static final void d0(cw cwVar, kb4 kb4Var) {
        cwVar.getClass();
        cw cwVar2 = new cw(999);
        int i = ((te9) cwVar).c;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            cwVar2.put(cwVar.f(i2), cwVar.i(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                kb4Var.invoke(cwVar2);
                cwVar2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            kb4Var.invoke(cwVar2);
        }
    }

    public static final void e(String str, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i) {
        int i2;
        dd4 dd4Var2;
        dd4Var.h0(857897958);
        if ((i & 6) == 0) {
            i2 = i | (dd4Var.f(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (dd4Var.V(i2 & 1, (i2 & Token.DO) != 130)) {
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
            String strK = wn9.K((pv9) iu9.k.getValue(), dd4Var);
            uka ukaVar = ((q96) dd4Var.j(s96.a)).b.j;
            lu6 lu6Var = lu6.a;
            nha.c(strK, tg9.f(lu6Var, 1.0f), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, 48, 0, 131068);
            dd4Var2 = dd4Var;
            un9.a(dd4Var2, tg9.h(lu6Var, 16.0f));
            tu1.l(null, jf0.G(-1090151443, new z31(str, 12), dd4Var2), dd4Var2, 48);
            xv5.A(lu6Var, 16.0f, dd4Var2, true);
        } else {
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new wi6(str, ou6Var, kb4Var, i, 1);
        }
    }

    public static final ig4 e0(dd4 dd4Var) {
        Object[] objArr = new Object[0];
        rt8 rt8Var = ig4.c;
        Object objQ = dd4Var.Q();
        if (objQ == vl1.a) {
            objQ = new uj6(7);
            dd4Var.p0(objQ);
        }
        return (ig4) ww1.d0(objArr, rt8Var, (ib4) objQ, dd4Var, 384);
    }

    public static final void f(boolean z, kb4 kb4Var, dd4 dd4Var, int i, int i2) {
        int i3;
        kb4Var.getClass();
        dd4Var.h0(-1937380448);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (dd4Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dd4Var.h(kb4Var) ? 32 : 16;
        }
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                z = true;
            }
            wh2 wh2Var = (wh2) dd4Var.j(dj5.a);
            a07 a07VarA = dk9.A(kb4Var, dd4Var);
            a07 a07VarA2 = dk9.A(Boolean.valueOf(z), dd4Var);
            boolean zF = dd4Var.f(a07VarA2) | dd4Var.f(a07VarA) | dd4Var.h(wh2Var);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                objQ = new fb3(3, wh2Var, a07VarA2, a07VarA);
                dd4Var.p0(objQ);
            }
            lc5.k(kb4Var, wh2Var, (kb4) objQ, dd4Var);
        } else {
            dd4Var.Y();
        }
        boolean z2 = z;
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ib0(z2, kb4Var, i, i2, 1);
        }
    }

    public static final uu5 f0(dd4 dd4Var) {
        Object[] objArr = new Object[0];
        rt8 rt8Var = uu5.x;
        boolean zD = dd4Var.d(0) | dd4Var.d(0);
        Object objQ = dd4Var.Q();
        if (zD || objQ == vl1.a) {
            objQ = new ua5(24);
            dd4Var.p0(objQ);
        }
        return (uu5) ww1.d0(objArr, rt8Var, (ib4) objQ, dd4Var, 0);
    }

    public static final void g(final ou6 ou6Var, wq5 wq5Var, final hi4 hi4Var, final pj7 pj7Var, final boolean z, final s04 s04Var, final boolean z2, final ag agVar, final nv nvVar, final kv kvVar, final kb4 kb4Var, dd4 dd4Var, final int i, final int i2) {
        int i3;
        int i4;
        wq5 wq5Var2;
        fu6 fu6Var;
        wq5 wq5Var3;
        boolean z3;
        ou6 ou6VarH;
        dd4Var.h0(708740370);
        if ((i & 6) == 0) {
            i3 = (dd4Var.f(ou6Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= dd4Var.f(wq5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? dd4Var.f(hi4Var) : dd4Var.h(hi4Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i3 |= dd4Var.f(pj7Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= dd4Var.g(false) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= dd4Var.g(z) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i & 1572864) == 0) {
            i3 |= dd4Var.f(s04Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= dd4Var.g(z2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= dd4Var.f(agVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= dd4Var.f(nvVar) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (dd4Var.f(kvVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dd4Var.h(kb4Var) ? 32 : 16;
        }
        boolean z4 = true;
        if (dd4Var.V(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            dd4Var.a0();
            if ((i & 1) != 0 && !dd4Var.C()) {
                dd4Var.Y();
            }
            dd4Var.r();
            int i5 = i3 >> 3;
            int i6 = i5 & 14;
            int i7 = i6 | (i4 & Token.ASSIGN_MOD);
            a07 a07VarA = dk9.A(kb4Var, dd4Var);
            int i8 = i3;
            boolean z5 = (((i7 & 14) ^ 6) > 4 && dd4Var.f(wq5Var)) || (i7 & 6) == 4;
            Object objQ = dd4Var.Q();
            fu6 fu6Var2 = vl1.a;
            if (z5 || objQ == fu6Var2) {
                ra1 ra1Var = ra1.C;
                objQ = new cq5(0, 0, br9.class, dk9.o(new al3(23, dk9.o(new lz4(a07VarA, 4), ra1Var), wq5Var), ra1Var), ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;");
                dd4Var.p0(objQ);
            }
            li5 li5Var = (li5) objQ;
            int i9 = i6 | ((i8 >> 9) & Token.ASSIGN_MOD);
            boolean z6 = ((((i9 & Token.ASSIGN_MOD) ^ 48) > 32 && dd4Var.g(false)) || (i9 & 48) == 32) | ((((i9 & 14) ^ 6) > 4 && dd4Var.f(wq5Var)) || (i9 & 6) == 4);
            Object objQ2 = dd4Var.Q();
            if (z6 || objQ2 == fu6Var2) {
                objQ2 = new zt5(wq5Var);
                dd4Var.p0(objQ2);
            }
            zt5 zt5Var = (zt5) objQ2;
            Object objQ3 = dd4Var.Q();
            if (objQ3 == fu6Var2) {
                objQ3 = lc5.Z(dd4Var);
                dd4Var.p0(objQ3);
            }
            vx1 vx1Var = (vx1) objQ3;
            gh4 gh4Var = (gh4) dd4Var.j(xm1.g);
            int i10 = (i8 & 524272) | ((i4 << 18) & 3670016) | ((i8 >> 6) & 29360128);
            bv7 bv7Var = !((Boolean) dd4Var.j(xm1.w)).booleanValue() ? ns9.a : null;
            boolean zF = ((((i10 & 29360128) ^ 12582912) > 8388608 && dd4Var.f(nvVar)) || (i10 & 12582912) == 8388608) | ((((i10 & 896) ^ 384) > 256 && dd4Var.f(hi4Var)) || (i10 & 384) == 256) | ((((i10 & Token.ASSIGN_MOD) ^ 48) > 32 && dd4Var.f(wq5Var)) || (i10 & 48) == 32) | ((((i10 & 7168) ^ 3072) > 2048 && dd4Var.f(pj7Var)) || (i10 & 3072) == 2048) | ((((57344 & i10) ^ 24576) > 16384 && dd4Var.g(false)) || (i10 & 24576) == 16384) | ((((458752 & i10) ^ 196608) > 131072 && dd4Var.g(z)) || (i10 & 196608) == 131072) | ((((i10 & 3670016) ^ 1572864) > 1048576 && dd4Var.f(kvVar)) || (i10 & 1572864) == 1048576) | dd4Var.f(gh4Var);
            Object objQ4 = dd4Var.Q();
            if (zF || objQ4 == fu6Var2) {
                fu6Var = fu6Var2;
                hq5 hq5Var = new hq5(wq5Var, z, pj7Var, li5Var, hi4Var, nvVar, kvVar, vx1Var, gh4Var, bv7Var);
                wq5Var3 = wq5Var;
                dd4Var.p0(hq5Var);
                objQ4 = hq5Var;
            } else {
                wq5Var3 = wq5Var;
                fu6Var = fu6Var2;
            }
            cs5 cs5Var = (cs5) objQ4;
            lh7 lh7Var = z ? lh7.a : lh7.b;
            if (z2) {
                dd4Var.f0(27281635);
                if (((i6 ^ 6) <= 4 || !dd4Var.f(wq5Var3)) && (i5 & 6) != 4) {
                    z4 = false;
                }
                Object objQ5 = dd4Var.Q();
                if (z4 || objQ5 == fu6Var) {
                    objQ5 = new wp5(wq5Var3);
                    dd4Var.p0(objQ5);
                }
                z3 = false;
                ou6VarH = m79.H((wp5) objQ5, wq5Var3.n, false, lh7Var);
                dd4Var.q(false);
            } else {
                z3 = false;
                dd4Var.f0(27577840);
                dd4Var.q(false);
                ou6VarH = lu6.a;
            }
            wq5 wq5Var4 = wq5Var3;
            wq5Var2 = wq5Var4;
            qx1.e(li5Var, lc5.g0(t1c.c0(ou6Var.e(wq5Var3.k).e(wq5Var3.l), li5Var, zt5Var, lh7Var, z2, z3).e(ou6VarH).e(wq5Var3.m.k), wq5Var4, lh7Var, agVar, z2, z3, s04Var, wq5Var3.f, null), wq5Var2.o, cs5Var, dd4Var, 0, 0);
        } else {
            wq5Var2 = wq5Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            final wq5 wq5Var5 = wq5Var2;
            ye8VarU.d = new yb4() { // from class: eq5
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iX0 = qu1.x0(i | 1);
                    int iX02 = qu1.x0(i2);
                    tw1.g(ou6Var, wq5Var5, hi4Var, pj7Var, z, s04Var, z2, agVar, nvVar, kvVar, kb4Var, (dd4) obj, iX0, iX02);
                    return heb.a;
                }
            };
        }
    }

    public static final void g0(ah7 ah7Var, int i, Object obj) {
        ah7Var.f[(ah7Var.g - ah7Var.b[ah7Var.c - 1].b) + i] = obj;
    }

    public static final void h(String str, boolean z, int i, boolean z2, kb4 kb4Var, yb4 yb4Var, dd4 dd4Var, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        str.getClass();
        kb4Var.getClass();
        yb4Var.getClass();
        dd4Var.h0(-731565353);
        int i7 = i2 | (dd4Var.f(str) ? 4 : 2) | (dd4Var.g(z) ? 32 : 16);
        int i8 = i3 & 4;
        if (i8 != 0) {
            i5 = i7 | 384;
            i4 = i;
        } else {
            i4 = i;
            i5 = i7 | (dd4Var.d(i4) ? 256 : Token.CASE);
        }
        int i9 = i5 | (dd4Var.g(z2) ? 2048 : 1024) | (dd4Var.h(kb4Var) ? 16384 : 8192) | (dd4Var.h(yb4Var) ? 131072 : Parser.ARGC_LIMIT);
        byte b2 = 0;
        if (dd4Var.V(i9 & 1, (74899 & i9) != 74898)) {
            int i10 = i8 != 0 ? 0 : i4;
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            if (objQ == fu6Var) {
                objQ = dk9.x(Boolean.valueOf(z));
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            Object objQ2 = dd4Var.Q();
            if (objQ2 == fu6Var) {
                objQ2 = dk9.x(lc3.a);
                dd4Var.p0(objQ2);
            }
            a07 a07Var2 = (a07) objQ2;
            ou6 ou6VarE = yib.E(lu6.a, 14);
            rj1 rj1VarG = jf0.G(1582919211, new ev0(yb4Var, kb4Var, a07Var, a07Var2, 23), dd4Var);
            int i11 = 9;
            rj1 rj1VarG2 = jf0.G(2100161454, new gs6(kb4Var, i11, b2), dd4Var);
            rj1 rj1VarG3 = jf0.G(-2022391761, new z31(str, i11), dd4Var);
            rj1 rj1VarG4 = jf0.G(1767602819, new bo6(a07Var2, a07Var, i10, 14), dd4Var);
            int i12 = i9 >> 9;
            z8.d(z2, kb4Var, rj1VarG, null, ou6VarE, rj1VarG2, rj1VarG3, null, 0L, 0L, 0.0f, false, false, rj1VarG4, dd4Var, (i12 & 14) | 1769856 | (i12 & Token.ASSIGN_MOD), 8072);
            i6 = i10;
        } else {
            dd4Var.Y();
            i6 = i4;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ki6(str, z, i6, z2, kb4Var, yb4Var, i2, i3);
        }
    }

    public static final void h0(ah7 ah7Var, int i, Object obj, int i2, Object obj2) {
        int i3 = ah7Var.g - ah7Var.b[ah7Var.c - 1].b;
        Object[] objArr = ah7Var.f;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final void i(ig4 ig4Var, dd4 dd4Var, int i) {
        ig4Var.getClass();
        dd4Var.h0(1226734059);
        int i2 = i | (dd4Var.f(ig4Var) ? 4 : 2);
        if (dd4Var.V(i2 & 1, (i2 & 3) != 2)) {
            tl tlVar = (tl) dd4Var.j(xm1.s);
            boolean zBooleanValue = ((Boolean) ig4Var.a.getValue()).booleanValue();
            boolean z = (i2 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new wk6(ig4Var, 0);
                dd4Var.p0(objQ);
            }
            z8.d(zBooleanValue, (kb4) objQ, jf0.G(-329113577, new xp5(10, tlVar, ig4Var), dd4Var), null, null, jf0.G(1319405364, new xk6(ig4Var, 0, (byte) 0), dd4Var), kc5.k, null, 0L, 0L, 0.0f, false, false, jf0.G(1261760703, new xk6(ig4Var, 1, (byte) 0), dd4Var), dd4Var, 1769856, 8088);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xk6(ig4Var, i);
        }
    }

    public static final void i0(ah7 ah7Var, Object obj, Object obj2, Object obj3) {
        int i = ah7Var.g - ah7Var.b[ah7Var.c - 1].b;
        Object[] objArr = ah7Var.f;
        objArr[i] = obj;
        objArr[i + 1] = obj2;
        objArr[i + 2] = obj3;
    }

    public static final void j(boolean z, bka bkaVar, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, dd4 dd4Var, int i) {
        bkaVar.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        kb4Var3.getClass();
        dd4Var.h0(1719456416);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(bkaVar) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(kb4Var2) ? 2048 : 1024) | (dd4Var.h(kb4Var3) ? 16384 : 8192);
        if (!dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            dd4Var.Y();
        } else if (xzb.a(dd4Var)) {
            dd4Var.f0(-1748597405);
            l(z, bkaVar, kb4Var, kb4Var2, kb4Var3, dd4Var, i2 & 65534);
            dd4Var.q(false);
        } else {
            dd4Var.f0(-1748338493);
            k(z, bkaVar, kb4Var, kb4Var2, kb4Var3, dd4Var, i2 & 65534);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new rr6(z, bkaVar, kb4Var, kb4Var2, kb4Var3, i, 0);
        }
    }

    public static final double j0(double d, double d2) {
        return Math.copySign(Math.pow(Math.abs(d), d2), d);
    }

    public static final void k(boolean z, bka bkaVar, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, dd4 dd4Var, int i) {
        dd4Var.h0(1177946095);
        int i2 = 4;
        int i3 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(bkaVar) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(kb4Var2) ? 2048 : 1024) | (dd4Var.h(kb4Var3) ? 16384 : 8192);
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            fw.r(z, kb4Var, null, true, 0L, 0L, 0.0f, 0L, 0.0f, jf0.G(1732293726, new mt(i2, bkaVar, kb4Var2, kb4Var3), dd4Var), dd4Var, (i3 & 14) | 805309440 | ((i3 >> 3) & Token.ASSIGN_MOD), 500);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new rr6(z, bkaVar, kb4Var, kb4Var2, kb4Var3, i, 1);
        }
    }

    public static final long k0(long j) {
        mc8 mc8Var = k63.b;
        boolean z = j > 0;
        if (z) {
            return k63.e(k63.h(j, lx1.A0(999999L, o63.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        mn5.g();
        return 0L;
    }

    public static final void l(boolean z, bka bkaVar, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, dd4 dd4Var, int i) {
        dd4Var.h0(1209140628);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(bkaVar) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(kb4Var2) ? 2048 : 1024) | (dd4Var.h(kb4Var3) ? 16384 : 8192);
        if (dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            bx1.a(z, kb4Var, (be3) null, (cj3) null, bv4.d, lc1.c(0.3f, lc1.b), false, false, (ou6) null, jf0.G(935483250, new hu2(bkaVar, kb4Var3, kb4Var, kb4Var2), dd4Var), dd4Var, (i2 & 14) | 805527552 | ((i2 >> 3) & Token.ASSIGN_MOD), 460);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new rr6(z, bkaVar, kb4Var, kb4Var2, kb4Var3, i, 2);
        }
    }

    public static final String l0(float f) {
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static final void m(long j, ou6 ou6Var, rj1 rj1Var, dd4 dd4Var, int i, int i2) {
        ou6 ou6Var2;
        int i3;
        rj1 rj1Var2;
        long j2;
        long j3;
        dd4Var.h0(-284686771);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 48;
            ou6Var2 = ou6Var;
        } else {
            ou6Var2 = ou6Var;
            i3 = i | (dd4Var.f(ou6Var2) ? 32 : 16);
        }
        if (dd4Var.V(i3 & 1, (i3 & Token.TARGET) != 144)) {
            dd4Var.a0();
            if ((i & 1) == 0 || dd4Var.C()) {
                j3 = ((q96) dd4Var.j(s96.a)).a.p;
                if (i4 != 0) {
                    ou6Var2 = lu6.a;
                }
            } else {
                dd4Var.Y();
                j3 = j;
            }
            dd4Var.r();
            ha6 ha6VarD = pn0.d(bv4.b, false);
            int iHashCode = Long.hashCode(dd4Var.T);
            lr7 lr7VarL = dd4Var.l();
            ou6 ou6VarL0 = s32.L0(dd4Var, ou6Var2);
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
            rj1Var2 = rj1Var;
            rj1Var2.c(zn0.a, dd4Var, 54);
            dd4Var.q(true);
            j2 = j3;
        } else {
            rj1Var2 = rj1Var;
            dd4Var.Y();
            j2 = j;
        }
        ou6 ou6Var3 = ou6Var2;
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new p8(j2, ou6Var3, rj1Var2, i, i2, 2);
        }
    }

    public static Object m0(mw4 mw4Var, vx vxVar, iy iyVar, o1a o1aVar) {
        lp8 lp8Var = new lp8(new qg0(vxVar), 15);
        iyVar.getClass();
        Object objA = mw4Var.a(lp8Var, new uf4(iyVar, 17), o1aVar);
        return objA == xx1.a ? objA : heb.a;
    }

    public static final bbc n(String str) {
        List listY;
        Pattern patternCompile = Pattern.compile("[-_]");
        patternCompile.getClass();
        bw9.m0(0);
        Matcher matcher = patternCompile.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(iEnd, str.length()).toString());
            listY = arrayList;
        } else {
            listY = gc1.Y(str.toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listY) {
            if (!bw9.a0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        return new bbc(size != 0 ? size != 1 ? size != 2 ? new Locale((String) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2)) : new Locale((String) arrayList2.get(0), (String) arrayList2.get(1)) : new Locale((String) arrayList2.get(0)) : new Locale(""), 3);
    }

    public static final np8 o(kf8 kf8Var, long j, long j2, long j3, long j4) {
        return new np8(kf8Var.a, kf8Var.b, kf8Var.c, kf8Var.d, j, j2, j3, j4);
    }

    public static final void p(final ou6 ou6Var, final rj1 rj1Var, yb4 yb4Var, yb4 yb4Var2, yb4 yb4Var3, int i, final long j, long j2, final hyb hybVar, final rj1 rj1Var2, dd4 dd4Var, final int i2) {
        final yb4 yb4Var4;
        final yb4 yb4Var5;
        final yb4 yb4Var6;
        final int i3;
        final long j3;
        long j4;
        long jB;
        int i4;
        int i5;
        yb4 yb4Var7;
        yb4 yb4Var8;
        yb4 yb4Var9;
        dd4Var.h0(-1211482744);
        int i6 = i2 | (dd4Var.f(ou6Var) ? 4 : 2) | 4418944 | (dd4Var.f(hybVar) ? 67108864 : 33554432);
        if (dd4Var.V(i6 & 1, (306783379 & i6) != 306783378)) {
            dd4Var.a0();
            if ((i2 & 1) == 0 || dd4Var.C()) {
                rj1 rj1Var3 = yb0.v;
                rj1 rj1Var4 = yb0.w;
                rj1 rj1Var5 = yb0.x;
                j4 = j;
                jB = dd1.b(j4, dd4Var);
                i4 = i6 & (-29360129);
                i5 = 2;
                yb4Var7 = rj1Var3;
                yb4Var8 = rj1Var4;
                yb4Var9 = rj1Var5;
            } else {
                dd4Var.Y();
                i4 = i6 & (-29360129);
                yb4Var7 = yb4Var;
                yb4Var8 = yb4Var2;
                yb4Var9 = yb4Var3;
                i5 = i;
                j4 = j;
                jB = j2;
            }
            dd4Var.r();
            int i7 = (234881024 & i4) ^ 100663296;
            boolean z = (i7 > 67108864 && dd4Var.f(hybVar)) || (i4 & 100663296) == 67108864;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z || objQ == obj) {
                objQ = new i07(hybVar);
                dd4Var.p0(objQ);
            }
            i07 i07Var = (i07) objQ;
            boolean zF = dd4Var.f(i07Var) | ((i7 > 67108864 && dd4Var.f(hybVar)) || (i4 & 100663296) == 67108864);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = new q57(23, i07Var, hybVar);
                dd4Var.p0(objQ2);
            }
            long j5 = jB;
            j1a.a(kc5.F(ou6Var, (kb4) objQ2), (t89) null, j4, j5, 0.0f, 0.0f, (wm0) null, jf0.G(848889571, new tz0(i5, rj1Var, rj1Var2, yb4Var8, yb4Var9, i07Var, yb4Var7), dd4Var), dd4Var, 12583296, 114);
            i3 = i5;
            yb4Var4 = yb4Var7;
            yb4Var5 = yb4Var8;
            yb4Var6 = yb4Var9;
            j3 = j5;
        } else {
            dd4Var.Y();
            yb4Var4 = yb4Var;
            yb4Var5 = yb4Var2;
            yb4Var6 = yb4Var3;
            i3 = i;
            j3 = j2;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(ou6Var, rj1Var, yb4Var4, yb4Var5, yb4Var6, i3, j, j3, hybVar, rj1Var2, i2) { // from class: xt8
                public final /* synthetic */ ou6 a;
                public final /* synthetic */ rj1 b;
                public final /* synthetic */ yb4 c;
                public final /* synthetic */ yb4 d;
                public final /* synthetic */ yb4 e;
                public final /* synthetic */ int f;
                public final /* synthetic */ long s;
                public final /* synthetic */ long t;
                public final /* synthetic */ hyb u;
                public final /* synthetic */ rj1 v;

                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(806879281);
                    tw1.p(this.a, this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, (dd4) obj2, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final void q(int i, rj1 rj1Var, rj1 rj1Var2, yb4 yb4Var, yb4 yb4Var2, hyb hybVar, yb4 yb4Var3, dd4 dd4Var, int i2) {
        int i3;
        boolean z;
        int i4;
        dd4Var.h0(-280287501);
        int i5 = i2 | (dd4Var.d(i) ? 4 : 2) | (dd4Var.h(rj1Var) ? 32 : 16) | (dd4Var.h(rj1Var2) ? 256 : Token.CASE) | (dd4Var.h(yb4Var) ? 2048 : 1024) | (dd4Var.h(yb4Var2) ? 16384 : 8192) | (dd4Var.f(hybVar) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.h(yb4Var3) ? 1048576 : 524288);
        if (dd4Var.V(i5 & 1, (599187 & i5) != 599186)) {
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new yt8();
                dd4Var.p0(objQ);
            }
            yt8 yt8Var = (yt8) objQ;
            boolean z2 = (i5 & Token.ASSIGN_MOD) == 32;
            Object objQ2 = dd4Var.Q();
            if (z2 || objQ2 == obj) {
                objQ2 = new rj1(new tb0(rj1Var, 11), true, 605195056);
                dd4Var.p0(objQ2);
            }
            yb4 yb4Var4 = (yb4) objQ2;
            boolean z3 = (i5 & 7168) == 2048;
            Object objQ3 = dd4Var.Q();
            if (z3 || objQ3 == obj) {
                objQ3 = new rj1(new v8(yb4Var, 6, (byte) 0), true, 418899191);
                dd4Var.p0(objQ3);
            }
            yb4 yb4Var5 = (yb4) objQ3;
            boolean z4 = (57344 & i5) == 16384;
            Object objQ4 = dd4Var.Q();
            if (z4 || objQ4 == obj) {
                objQ4 = new rj1(new v8(yb4Var2, 7, (byte) 0), true, 338600263);
                dd4Var.p0(objQ4);
            }
            yb4 yb4Var6 = (yb4) objQ4;
            boolean z5 = (i5 & 896) == 256;
            Object objQ5 = dd4Var.Q();
            if (z5 || objQ5 == obj) {
                i3 = i5;
                objQ5 = new rj1(new b18(2, rj1Var2, yt8Var), true, -1776388365);
                dd4Var.p0(objQ5);
            } else {
                i3 = i5;
            }
            yb4 yb4Var7 = (yb4) objQ5;
            boolean z6 = (i3 & 3670016) == 1048576;
            Object objQ6 = dd4Var.Q();
            if (z6 || objQ6 == obj) {
                z = true;
                objQ6 = new rj1(new v8(yb4Var3, 8, (byte) 0), true, -1731662488);
                dd4Var.p0(objQ6);
            } else {
                z = true;
            }
            yb4 yb4Var8 = (yb4) objQ6;
            boolean zF = ((i3 & 458752) == 131072 ? z : false) | dd4Var.f(yb4Var4) | dd4Var.f(yb4Var5) | dd4Var.f(yb4Var6) | ((i3 & 14) == 4) | dd4Var.f(yb4Var8) | dd4Var.f(yb4Var7);
            Object objQ7 = dd4Var.Q();
            if (zF || objQ7 == obj) {
                i4 = 1;
                pj1 pj1Var = new pj1(hybVar, yb4Var4, yb4Var5, yb4Var6, i, yb4Var8, yt8Var, yb4Var7);
                dd4Var.p0(pj1Var);
                objQ7 = pj1Var;
            } else {
                i4 = 1;
            }
            yx9.a((ou6) null, (yb4) objQ7, dd4Var, 0, i4);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tz0(i, rj1Var, rj1Var2, yb4Var, yb4Var2, hybVar, yb4Var3, i2);
        }
    }

    public static final void r(bka bkaVar, pj7 pj7Var, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i, int i2) {
        pj7 rj7Var;
        int i3;
        pj7 pj7Var2;
        dd4Var.h0(-1443760276);
        int i4 = i | (dd4Var.f(bkaVar) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            rj7Var = pj7Var;
        } else {
            rj7Var = pj7Var;
            i3 = i4 | (dd4Var.f(rj7Var) ? 32 : 16);
        }
        int i6 = i3 | (dd4Var.f(ou6Var) ? 256 : Token.CASE) | (dd4Var.h(kb4Var) ? 2048 : 1024);
        if (dd4Var.V(i6 & 1, (i6 & 1171) != 1170)) {
            if (i5 != 0) {
                rj7Var = new rj7(0.0f, 0.0f, 0.0f, 0.0f);
            }
            pj7 pj7Var3 = rj7Var;
            szb szbVarW = yib.w(pj7Var3, gjb.q(0.0f, 0.0f, 4.0f, 0.0f, 11));
            boolean z = ((i6 & 14) == 4) | ((i6 & 7168) == 2048);
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new ej4(22, bkaVar, kb4Var);
                dd4Var.p0(objQ);
            }
            gx1.h(ou6Var, null, pj7Var3, null, null, null, false, szbVarW, 0L, 0L, 0.0f, (kb4) objQ, dd4Var, ((i6 >> 6) & 14) | ((i6 << 3) & 896), 0, 3834);
            pj7Var2 = pj7Var3;
        } else {
            dd4Var.Y();
            pj7Var2 = rj7Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new o50(bkaVar, pj7Var2, ou6Var, kb4Var, i, i2);
        }
    }

    public static final void s(yja yjaVar, ou6 ou6Var, dd4 dd4Var, int i) {
        ou6 ou6Var2 = ou6Var;
        dd4Var.h0(504751738);
        int i2 = i | (dd4Var.f(yjaVar) ? 4 : 2) | (dd4Var.f(ou6Var2) ? 32 : 16);
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            long j = ((q96) dd4Var.j(s96.a)).a.c;
            boolean zF = dd4Var.f(yjaVar.d);
            Object objQ = dd4Var.Q();
            if (zF || objQ == vl1.a) {
                bp bpVar = yjaVar.d;
                String str = bpVar.b;
                List listC = bpVar.c();
                ArrayList arrayList = new ArrayList(gc1.M(listC, 10));
                Iterator it = listC.iterator();
                while (it.hasNext()) {
                    ArrayList arrayList2 = arrayList;
                    long j2 = j;
                    arrayList2.add(ap.a((ap) it.next(), new vn9(0L, 0L, (a84) null, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, j2, (jda) null, (o89) null, 63487), 0, 14));
                    str = str;
                    arrayList = arrayList2;
                    j = j2;
                }
                objQ = new bp(str, arrayList);
                dd4Var.p0(objQ);
            }
            ur9 ur9Var = s96.a;
            uka ukaVar = ((q96) dd4Var.j(ur9Var)).b.j;
            ou6Var2 = ou6Var;
            nha.d((bp) objQ, ou6Var2, ((q96) dd4Var.j(ur9Var)).a.q, 0L, 0L, (vaa) null, 0L, 0, false, 0, 0, (Map) null, (kb4) null, ukaVar, dd4Var, i2 & Token.ASSIGN_MOD, 0, 262136);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xp5(yjaVar, ou6Var2, i, 19);
        }
    }

    public static final boolean t(float f, float f2, float f3) {
        return P(2, Math.abs(f - f2)) <= f3;
    }

    public static final int u(qv5 qv5Var, long j, ftb ftbVar) {
        long jN;
        int iS;
        rha rhaVarD = qv5Var.d();
        if (rhaVarD != null) {
            gx6 gx6Var = rhaVarD.a.b;
            ym5 ym5VarC = qv5Var.c();
            if (ym5VarC != null && (iS = S(gx6Var, (jN = ym5VarC.N(j)), ftbVar)) != -1) {
                return gx6Var.h(eb7.a(jN, 0.0f, (gx6Var.b(iS) + gx6Var.g(iS)) / 2.0f, 1));
            }
        }
        return -1;
    }

    public static final long v(qv5 qv5Var, kf8 kf8Var, kf8 kf8Var2, int i) {
        long jU = U(qv5Var, kf8Var, i);
        if (pja.d(jU)) {
            return pja.b;
        }
        long jU2 = U(qv5Var, kf8Var2, i);
        if (pja.d(jU2)) {
            return pja.b;
        }
        int i2 = (int) (jU >> 32);
        int i3 = (int) (jU2 & 4294967295L);
        return zk9.h(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final boolean w(qha qhaVar, int i) {
        gx6 gx6Var = qhaVar.b;
        int iD = gx6Var.d(i);
        return i == qhaVar.h(iD) || i == gx6Var.c(iD, false) ? gx6Var.i(i) != qhaVar.a(i) : qhaVar.a(i) != qhaVar.a(i - 1);
    }

    public static final long x(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final Drawable y(jy4 jy4Var, Resources resources) {
        return jy4Var instanceof i53 ? ((i53) jy4Var).a : jy4Var instanceof ah0 ? new BitmapDrawable(resources, ((ah0) jy4Var).a) : new b05(jy4Var);
    }

    public static final jy4 z(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new ah0(((BitmapDrawable) drawable).getBitmap()) : new i53(drawable);
    }

    public abstract Object J();

    public String toString() {
        switch (this.a) {
            case 7:
                return J().toString();
            default:
                return super.toString();
        }
    }
}

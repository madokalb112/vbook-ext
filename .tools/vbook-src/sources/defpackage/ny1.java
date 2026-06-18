package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.Layout;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.CancellationException;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ny1 {
    public static sa9 a;

    /* JADX WARN: Removed duplicated region for block: B:289:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x057b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x065f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0887 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0acb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0ad0  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0eaa  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ad1 A(long r113, boolean r115, boolean r116, defpackage.cm7 r117, double r118, defpackage.id1 r120, defpackage.f73 r121, defpackage.kb4 r122) {
        /*
            Method dump skipped, instruction units count: 3810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny1.A(long, boolean, boolean, cm7, double, id1, f73, kb4):ad1");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pr8 */
    public static void B(int i, Parcel parcel) throws pr8 {
        if (parcel.dataPosition() != i) {
            throw new pr8(tw2.r(new StringBuilder(String.valueOf(i).length() + 26), "Overread allowed size end=", i), parcel);
        }
    }

    public static boolean C(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static p69 D(Set set, h08 h08Var) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof p69)) {
                return new q69(set2, h08Var);
            }
            p69 p69Var = (p69) set2;
            h08 h08Var2 = p69Var.b;
            h08Var2.getClass();
            return new q69((SortedSet) p69Var.a, new i08(Arrays.asList(h08Var2, h08Var)));
        }
        if (!(set instanceof p69)) {
            set.getClass();
            return new p69(set, h08Var);
        }
        p69 p69Var2 = (p69) set;
        h08 h08Var3 = p69Var2.b;
        h08Var3.getClass();
        return new p69(p69Var2.a, new i08(Arrays.asList(h08Var3, h08Var)));
    }

    public static final String E(String str, String str2, String str3, String str4, int i) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !bw9.a0(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !bw9.a0(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    public static xp4 F(long j) {
        kb8 kb8VarC = kb8.f.c(lc1.i(j), lc1.h(j), lc1.f(j), lc1.e(j));
        kb8 kb8VarC2 = kb8VarC.c(dr8.b);
        double d = kb8VarC2.a;
        double d2 = kb8VarC2.b;
        double d3 = kb8VarC2.c;
        double dMin = Math.min(d, Math.min(d2, d3));
        double dMax = Math.max(d, Math.max(d2, d3));
        double d4 = dMax - dMin;
        float f = (float) (((((d4 < 1.0E-7d ? Double.NaN : d == dMax ? (d2 - d3) / d4 : d2 == dMax ? 2.0d + ((d3 - d) / d4) : d3 == dMax ? ((d - d2) / d4) + 4.0d : 0.0d) * 60.0d) % 360.0d) + 360.0d) % 360.0d);
        float f2 = (float) (dMax != 0.0d ? d4 / dMax : 0.0d);
        float f3 = (float) dMax;
        float f4 = kb8VarC.d;
        if (Float.isNaN(f)) {
            f = 0.0f;
        }
        return new xp4(f, f2, f3, f4);
    }

    public static p95 G(long j) {
        long j2 = j / 1000;
        if ((j ^ 1000) < 0 && j2 * 1000 != j) {
            j2--;
        }
        long j3 = j % 1000;
        return j2 < -31557014167219200L ? p95.c : j2 > 31556889864403199L ? p95.d : H(j2, (int) ((j3 + (1000 & (((j3 ^ 1000) & ((-j3) | j3)) >> 63))) * 1000000));
    }

    public static p95 H(long j, long j2) {
        long j3 = j2 / 1000000000;
        if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
            j3--;
        }
        long j4 = j + j3;
        if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
            return j > 0 ? p95.d : p95.c;
        }
        if (j4 < -31557014167219200L) {
            return p95.c;
        }
        if (j4 > 31556889864403199L) {
            return p95.d;
        }
        long j5 = j2 % 1000000000;
        return new p95(j4, (int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)));
    }

    public static final int I(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final wu6 J(jx1 jx1Var) {
        wu6 wu6Var = jx1Var.get(lr3.u);
        if (wu6Var != null) {
            return wu6Var;
        }
        gp.j("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final void K(StringBuilder sb, int i, on8 on8Var, String str) {
        on8Var.getClass();
        List list = on8Var.b;
        sb.append(str + "Text " + i + " `" + on8Var + "`: " + list.size() + " children");
        sb.append('\n');
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            K(sb, i2, (on8) list.get(i2), str.concat("-"));
        }
    }

    public static final m66 L(m66 m66Var) {
        sn5 sn5VarV = m66Var.A.A;
        while (true) {
            sn5 sn5VarV2 = sn5VarV.v();
            if ((sn5VarV2 != null ? sn5VarV2.u : null) == null) {
                m66 m66VarD1 = ((x67) sn5VarV.S.e).d1();
                m66VarD1.getClass();
                return m66VarD1;
            }
            sn5 sn5VarV3 = sn5VarV.v();
            sn5 sn5Var = sn5VarV3 != null ? sn5VarV3.u : null;
            sn5Var.getClass();
            if (sn5Var.t) {
                sn5VarV = sn5VarV.v();
                sn5VarV.getClass();
            } else {
                sn5 sn5VarV4 = sn5VarV.v();
                sn5VarV4.getClass();
                sn5VarV = sn5VarV4.u;
                sn5VarV.getClass();
            }
        }
    }

    public static int M(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static o69 N(Set set, f55 f55Var) {
        fx1.N(set, "set1");
        fx1.N(f55Var, "set2");
        return new o69(set, f55Var);
    }

    public static final void O(l1 l1Var, String str) {
        l1Var.r(l1Var.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final boolean P(p93 p93Var) {
        String str = null;
        y19 y19Var = (y19) p93Var.a.a((Object) null, v05.b);
        v19 v19Var = y19Var != null ? y19Var.a : null;
        if (v19Var != null) {
            Object obj = v19Var.a.get(i29.a);
            if (obj == null) {
                obj = null;
            }
            List list = (List) obj;
            if (list != null) {
                str = (String) list.get(0);
            }
        }
        return str == null || str.length() == 0;
    }

    public static final CharSequence Q(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sb.append(charSequence.subSequence(i2, i3).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final String R(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return ky0.s(str != null ? xv5.p(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.", sb);
    }

    public static final void S() {
        try {
            if (a == null) {
                gy3 gy3VarC = gy3.c();
                gy3VarC.a();
                sa9 sa9Var = (sa9) ((y22) ((hz3) gy3VarC.d.a(hz3.class))).o.get();
                sa9Var.getClass();
                a = sa9Var;
            }
            sa9 sa9Var2 = a;
            if (sa9Var2 == null) {
                lc5.i0("sharedSessionRepository");
                throw null;
            }
            if (sa9Var2.i) {
                if (sa9Var2 != null) {
                    sa9Var2.b();
                } else {
                    lc5.i0("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static final void T(nu6 nu6Var, ib4 ib4Var) {
        ya7 ya7Var = nu6Var.s;
        if (ya7Var == null) {
            ya7Var = new ya7((xa7) nu6Var);
            nu6Var.s = ya7Var;
        }
        bj7 snapshotObserver = vw1.T(nu6Var).getSnapshotObserver();
        snapshotObserver.a.d(ya7Var, td3.C, ib4Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e20 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object U(java.lang.String r9, java.lang.String r10, defpackage.kt1 r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof defpackage.mw3
            if (r0 == 0) goto L13
            r0 = r11
            mw3 r0 = (defpackage.mw3) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            mw3 r0 = new mw3
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.b
            r2 = 1
            r7 = 0
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L26
            defpackage.e11.e0(r11)
            goto L81
        L26:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            r9 = 0
            return r9
        L2d:
            defpackage.e11.e0(r11)
            java.lang.ref.WeakReference r11 = defpackage.vv3.a
            java.lang.Object r11 = r11.get()
            r4 = r11
            xi1 r4 = (xi1) r4
            if (r4 == 0) goto L8b
            java.lang.String r10 = i12.V(r10)
            android.webkit.MimeTypeMap r11 = android.webkit.MimeTypeMap.getSingleton()
            if (r10 == 0) goto L4c
            java.lang.String r11 = r11.getMimeTypeFromExtension(r10)
            if (r11 == 0) goto L4c
            goto L4e
        L4c:
        */
        //  java.lang.String r11 = "*/*"
        /*
        L4e:
            k5 r5 = new k5
            r1 = 6
            r5.<init>(r1)
            r9.getClass()
            java.lang.String r10 = i12.V(r10)
            if (r10 != 0) goto L5e
            goto L64
        L5e:
            java.lang.String r1 = "."
            java.lang.String r9 = defpackage.dx1.h(r9, r1, r10)
        L64:
            l02 r6 = new l02
            r6.<init>(r11, r9, r7)
            r0.b = r2
            aj2 r9 = defpackage.rw2.a
            fj4 r9 = defpackage.r76.a
            fj4 r9 = r9.f
            hl2 r3 = new hl2
            r8 = 18
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = defpackage.ah1.b0(r9, r3, r0)
            xx1 r9 = defpackage.xx1.a
            if (r11 != r9) goto L81
            return r9
        L81:
            android.net.Uri r11 = (android.net.Uri) r11
            if (r11 == 0) goto L8a
            wt7 r9 = defpackage.vo1.A(r11)
            return r9
        L8a:
            return r7
        L8b:
            uv3 r9 = new uv3
            java.lang.String r10 = "FileKit not initialized on Android. Please call FileKit.init(activity) first."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny1.U(java.lang.String, java.lang.String, kt1):java.lang.Object");
    }

    public static final File V(Context context, String str) {
        context.getClass();
        str.getClass();
        return gx1.B(context, str.concat(".preferences_pb"));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void W(defpackage.rj1 r4, defpackage.kt1 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.gf4
            if (r0 == 0) goto L13
            r0 = r5
            gf4 r0 = (defpackage.gf4) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            gf4 r0 = new gf4
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.b
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return
        L27:
            defpackage.e11.e0(r5)
            defpackage.if2.c()
            return
        L2e:
            defpackage.e11.e0(r5)
            jx1 r5 = r0.getContext()
            s00 r1 = defpackage.s00.d
            hx1 r5 = r5.get(r1)
            lu r5 = (lu) r5
            if (r5 == 0) goto L45
            r0.b = r2
            r5.a(r4, r0)
            return
        L45:
            java.lang.String r4 = "provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance"
            gp.j(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny1.W(rj1, kt1):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pr8 */
    public static boolean X(int i, Parcel parcel) throws pr8 {
        q0(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pr8 */
    public static Boolean Y(int i, Parcel parcel) throws pr8 {
        int iF0 = f0(i, parcel);
        if (iF0 == 0) {
            return null;
        }
        r0(parcel, iF0, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pr8 */
    public static Double Z(int i, Parcel parcel) throws pr8 {
        int iF0 = f0(i, parcel);
        if (iF0 == 0) {
            return null;
        }
        r0(parcel, iF0, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static final void a(String str, int i, ib4 ib4Var, dd4 dd4Var, int i2) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1659166011);
        int i3 = i2 | (dd4Var2.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var2.V(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            ur9 ur9Var = s96.a;
            uw1 uw1Var = ((q96) dd4Var2.j(ur9Var)).c.b;
            lu6 lu6Var = lu6.a;
            ou6 ou6VarW = t96.w(lu6Var, uw1Var);
            boolean z = (i3 & 896) == 256;
            Object objQ = dd4Var2.Q();
            if (z || objQ == vl1.a) {
                objQ = new pm6(16, ib4Var);
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
                dd4Var2.f0(664993539);
                nha.c(String.valueOf(i), zn0Var.a(lu6Var, bv4.d), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.o, dd4Var2, 0, 0, 131064);
                dd4Var2 = dd4Var2;
                dd4Var2.q(false);
            } else {
                dd4Var2 = dd4Var2;
                dd4Var2.f0(665237943);
                dd4Var2.q(false);
            }
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new nk6(str, i, ib4Var, i2, 1);
        }
    }

    public static IBinder a0(int i, Parcel parcel) {
        int iF0 = f0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iF0);
        return strongBinder;
    }

    public static final void b(n15 n15Var, String str, mf4 mf4Var, int i, pc1 pc1Var, dd4 dd4Var, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        mf4 mf4VarD;
        pc1 pc1Var2 = pc1Var;
        dd4Var.h0(491792371);
        int i7 = i2 | (dd4Var.f(n15Var) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i7 |= dd4Var.f(str) ? 32 : 16;
        }
        int i8 = i7 | (dd4Var.f(mf4Var) ? 256 : Token.CASE);
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 = i8 | 3072;
        } else {
            i4 = i8 | (dd4Var.d(i) ? 2048 : 1024);
        }
        int i10 = i3 & 16;
        if (i10 != 0) {
            i5 = i4 | 24576;
        } else {
            int i11 = i2 & 32768;
            i5 = i4 | (dd4Var.f(pc1Var2) ? 16384 : 8192);
        }
        if ((i5 & 9363) == 9362 && dd4Var.F()) {
            dd4Var.Y();
            i6 = i;
        } else {
            i6 = i9 != 0 ? 1 : i;
            if (i10 != 0) {
                pc1Var2 = null;
            }
            dd4Var.g0(135631275);
            int i12 = 0;
            if (str != null) {
                dd4Var.g0(135633130);
                boolean zF = dd4Var.f(str);
                Object objQ = dd4Var.Q();
                if (zF || objQ == vl1.a) {
                    objQ = new u05(str, i12);
                    dd4Var.p0(objQ);
                }
                dd4Var.q(false);
                v19 v19Var = new v19();
                ((kb4) objQ).invoke(v19Var);
                mf4VarD = mf4Var.d(new y19(v19Var));
            } else {
                mf4VarD = mf4Var;
            }
            dd4Var.q(false);
            s05 s05Var = s05.a;
            dd4Var.g0(-1115894518);
            dd4Var.g0(1886828752);
            if (!(dd4Var.a instanceof su)) {
                fe.Y();
                throw null;
            }
            dd4Var.d0();
            if (dd4Var.S) {
                dd4Var.k(new rh(s05Var, 8));
            } else {
                dd4Var.s0();
            }
            un9.s(jm.N, dd4Var, n15Var);
            un9.s(jm.O, dd4Var, mf4VarD);
            un9.s(jm.P, dd4Var, new rr1(i6));
            un9.s(fy4.b, dd4Var, pc1Var2);
            dd4Var.q(true);
            dd4Var.q(false);
            dd4Var.q(false);
        }
        pc1 pc1Var3 = pc1Var2;
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new t05(n15Var, str, mf4Var, i6, pc1Var3, i2, i3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pr8 */
    public static int b0(int i, Parcel parcel) throws pr8 {
        q0(parcel, i, 4);
        return parcel.readInt();
    }

    public static final rf5 c(m39 m39Var) {
        String str = "Value of type '" + m39Var.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + m39Var.e() + '\'';
        m39Var.a();
        return new rf5(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pr8 */
    public static Integer c0(int i, Parcel parcel) throws pr8 {
        int iF0 = f0(i, parcel);
        if (iF0 == 0) {
            return null;
        }
        r0(parcel, iF0, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static final void d(Object obj, int i, js5 js5Var, rj1 rj1Var, dd4 dd4Var, int i2) {
        int i3;
        dd4Var.h0(872548579);
        if ((i2 & 6) == 0) {
            i3 = (dd4Var.h(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dd4Var.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dd4Var.h(js5Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dd4Var.h(rj1Var) ? 2048 : 1024;
        }
        if (dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zF = dd4Var.f(obj) | dd4Var.f(js5Var);
            Object objQ = dd4Var.Q();
            Object obj2 = vl1.a;
            if (zF || objQ == obj2) {
                objQ = new is5(obj, js5Var);
                dd4Var.p0(objQ);
            }
            is5 is5Var = (is5) objQ;
            is5Var.c = i;
            cn7 cn7Var = is5Var.g;
            fn1 fn1Var = ys7.a;
            is5 is5Var2 = (is5) dd4Var.j(fn1Var);
            oj9 oj9VarG = zib.g();
            kb4 kb4VarE = oj9VarG != null ? oj9VarG.e() : null;
            oj9 oj9VarI = zib.i(oj9VarG);
            try {
                if (is5Var2 != ((is5) cn7Var.getValue())) {
                    cn7Var.setValue(is5Var2);
                    if (is5Var.d > 0) {
                        is5 is5Var3 = is5Var.e;
                        if (is5Var3 != null) {
                            is5Var3.b();
                        }
                        if (is5Var2 != null) {
                            is5Var2.a();
                        } else {
                            is5Var2 = null;
                        }
                        is5Var.e = is5Var2;
                    }
                }
                zib.k(oj9VarG, oj9VarI, kb4VarE);
                boolean zF2 = dd4Var.f(is5Var);
                Object objQ2 = dd4Var.Q();
                if (zF2 || objQ2 == obj2) {
                    objQ2 = new rx2(is5Var, 29);
                    dd4Var.p0(objQ2);
                }
                lc5.j(is5Var, (kb4) objQ2, dd4Var);
                jv3.e(fn1Var.a(is5Var), rj1Var, dd4Var, ((i3 >> 6) & Token.ASSIGN_MOD) | 8);
            } catch (Throwable th) {
                zib.k(oj9VarG, oj9VarI, kb4VarE);
                throw th;
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ao0(obj, i, js5Var, rj1Var, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pr8 */
    public static long d0(int i, Parcel parcel) throws pr8 {
        q0(parcel, i, 8);
        return parcel.readLong();
    }

    public static final void e(int i, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, String str, boolean z) {
        str.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var.h0(974316844);
        int i2 = i | (dd4Var.f(str) ? 4 : 2) | (dd4Var.g(z) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(kb4Var2) ? 2048 : 1024);
        byte b = 0;
        if (dd4Var.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = (i2 & Token.ASSIGN_MOD) == 32;
            Object objQ = dd4Var.Q();
            if (z2 || objQ == vl1.a) {
                objQ = dk9.x(str);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            int i3 = i2 >> 3;
            z8.d(z, kb4Var, jf0.G(2140441176, new ul3(3, kb4Var2, kb4Var, a07Var), dd4Var), null, yib.E(lu6.a, 14), jf0.G(1223537589, new gs6(kb4Var, 14, b), dd4Var), yb0.l, null, 0L, 0L, 0.0f, false, false, jf0.G(-496132864, new kq2(a07Var, 8), dd4Var), dd4Var, (i3 & 14) | 1769856 | (i3 & Token.ASSIGN_MOD), 8072);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new vl3(str, z, kb4Var, kb4Var2, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pr8 */
    public static Long e0(int i, Parcel parcel) throws pr8 {
        int iF0 = f0(i, parcel);
        if (iF0 == 0) {
            return null;
        }
        r0(parcel, iF0, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static final void f(boolean z, v78 v78Var, List list, kb4 kb4Var, ac4 ac4Var, yb4 yb4Var, dd4 dd4Var, int i) {
        a07 a07Var;
        a07 a07Var2;
        list.getClass();
        kb4Var.getClass();
        ac4Var.getClass();
        yb4Var.getClass();
        dd4Var.h0(-1968827609);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.h(v78Var) ? 32 : 16) | (dd4Var.h(list) ? 256 : Token.CASE) | (dd4Var.h(ac4Var) ? 16384 : 8192) | (dd4Var.h(yb4Var) ? 131072 : Parser.ARGC_LIMIT);
        byte b = 0;
        if (dd4Var.V(i2 & 1, (74899 & i2) != 74898)) {
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = lc5.Z(dd4Var);
                dd4Var.p0(objQ);
            }
            vx1 vx1Var = (vx1) objQ;
            jt1 jt1Var = null;
            Object[] objArr = {v78Var != null ? v78Var.a : null};
            int i3 = i2 & Token.ASSIGN_MOD;
            boolean z2 = i3 == 32 || dd4Var.h(v78Var);
            Object objQ2 = dd4Var.Q();
            if (z2 || objQ2 == obj) {
                objQ2 = new wn6(v78Var, b);
                dd4Var.p0(objQ2);
            }
            a07 a07VarA0 = ww1.a0(objArr, (ib4) objQ2, dd4Var, 0);
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj) {
                objQ3 = dk9.x((Object) null);
                dd4Var.p0(objQ3);
            }
            a07 a07Var3 = (a07) objQ3;
            String str = v78Var != null ? v78Var.a : null;
            boolean zF = dd4Var.f(a07VarA0) | (i3 == 32 || dd4Var.h(v78Var));
            Object objQ4 = dd4Var.Q();
            if (zF || objQ4 == obj) {
                a07Var = a07VarA0;
                a07Var2 = a07Var3;
                ti tiVar = new ti(v78Var, a07Var, a07Var2, jt1Var, 12);
                dd4Var.p0(tiVar);
                objQ4 = tiVar;
            } else {
                a07Var = a07VarA0;
                a07Var2 = a07Var3;
            }
            lc5.u((yb4) objQ4, dd4Var, str);
            a07 a07Var4 = a07Var2;
            a07 a07Var5 = a07Var;
            z8.d(z, kb4Var, jf0.G(1225788795, new uj0(kb4Var, yb4Var, a07Var5, a07Var4, v78Var), dd4Var), null, null, jf0.G(-1332880066, new gs6(kb4Var, 18, b), dd4Var), jf0.G(-754113921, new ah(v78Var, 26), dd4Var), null, 0L, 0L, 0.0f, false, false, jf0.G(909695955, new uq6(a07Var5, list, v78Var, vx1Var, ac4Var, a07Var4), dd4Var), dd4Var, (i2 & 14) | 1769904, 8088);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ch1(z, v78Var, list, kb4Var, ac4Var, yb4Var, i, 5);
        }
    }

    public static int f0(int i, Parcel parcel) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static final wc8 g(ue5 ue5Var, pb5 pb5Var, char[] cArr) {
        ue5Var.getClass();
        return new wc8(pb5Var, cArr, ue5Var.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0198 A[PHI: r3
  0x0198: PHI (r3v38 kb4) = (r3v36 kb4), (r3v39 kb4) binds: [B:130:0x0196, B:126:0x018f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055 A[PHI: r10
  0x0055: PHI (r10v6 boolean) = (r10v3 boolean), (r10v7 boolean) binds: [B:26:0x0053, B:22:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070 A[PHI: r15
  0x0070: PHI (r15v9 boolean) = (r15v6 boolean), (r15v10 boolean) binds: [B:36:0x006e, B:32:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ad1 g0(long r18, boolean r20, boolean r21, defpackage.cm7 r22, double r23, defpackage.kb4 r25, dd4 r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny1.g0(long, boolean, boolean, cm7, double, kb4, dd4, int, int, int):ad1");
    }

    public static final void h(List list, String str, yb4 yb4Var, kb4 kb4Var, dd4 dd4Var, int i) {
        fu6 fu6Var;
        kb4 kb4Var2;
        Object obj;
        boolean z;
        Object obj2;
        iv ivVar;
        wf0 wf0Var;
        f9 f9Var;
        ou6 ou6Var;
        f9 f9Var2;
        int i2;
        boolean z2;
        String str2 = str;
        yb4 yb4Var2 = yb4Var;
        dd4 dd4Var2 = dd4Var;
        f9 f9Var3 = bv4.d;
        wf0 wf0Var2 = bv4.w;
        f9 f9Var4 = bv4.f;
        dd4Var2.h0(253220473);
        int i3 = i | (dd4Var2.h(list) ? 4 : 2) | (dd4Var2.f(str2) ? 32 : 16) | (dd4Var2.h(yb4Var2) ? 256 : Token.CASE) | (dd4Var2.h(kb4Var) ? 2048 : 1024);
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
            ou6 ou6Var2 = lu6.a;
            ou6 ou6VarF = tg9.f(ou6Var2, 1.0f);
            eq8 eq8VarA = dq8.a(new mv(8.0f, true, new gp(5)), bv4.x, dd4Var2, 54);
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
            un9.s(jmVar, dd4Var2, eq8VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var2, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var2, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var2, kdVar);
            jm jmVar4 = ll1.d;
            f9 f9Var5 = f9Var3;
            ou6 ou6VarA = kc5.A(m(dd4Var2, ky0.g(dd4Var2, ou6VarL0, jmVar4, 1.0f, true)), kc5.J(dd4Var2), 14);
            iv ivVar2 = pv.a;
            f9 f9Var6 = f9Var4;
            eq8 eq8VarA2 = dq8.a(ivVar2, wf0Var2, dd4Var2, 0);
            int i4 = i3;
            ou6 ou6Var3 = ou6Var2;
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarA);
            dd4Var2.j0();
            iv ivVar3 = ivVar2;
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA2);
            un9.s(jmVar2, dd4Var2, lr7VarL2);
            ky0.v(iHashCode2, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL02);
            dd4Var2.f0(1534638715);
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                fu6Var = vl1.a;
                if (!zHasNext) {
                    break;
                }
                bpa bpaVar = (bpa) it.next();
                String str3 = bpaVar.a;
                String str4 = bpaVar.c;
                boolean zQ = lc5.Q(str2, str3 + "-" + str4);
                ou6 ou6Var4 = ou6Var3;
                ou6 ou6VarH = tg9.h(t96.w(ou6Var4, s00.p(dd4Var2).b), 30.0f);
                boolean zF = ((i4 & 896) == 256) | dd4Var2.f(bpaVar);
                Object objQ = dd4Var2.Q();
                if (zF || objQ == fu6Var) {
                    z = false;
                    xn6 xn6Var = new xn6(yb4Var2, bpaVar, false ? 1 : 0);
                    dd4Var2.p0(xn6Var);
                    obj2 = xn6Var;
                } else {
                    z = false;
                    obj2 = objQ;
                }
                ou6 ou6VarJ = fw.J(null, (ib4) obj2, ou6VarH, z, 15);
                xf0 xf0Var = bv4.b;
                ha6 ha6VarD = pn0.d(xf0Var, z);
                int iHashCode3 = Long.hashCode(dd4Var2.T);
                lr7 lr7VarL3 = dd4Var2.l();
                ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarJ);
                ml1.k.getClass();
                Iterator it2 = it;
                um1 um1Var2 = ll1.b;
                dd4Var2.j0();
                if (dd4Var2.S) {
                    dd4Var2.k(um1Var2);
                } else {
                    dd4Var2.s0();
                }
                jm jmVar5 = ll1.f;
                un9.s(jmVar5, dd4Var2, ha6VarD);
                jm jmVar6 = ll1.e;
                un9.s(jmVar6, dd4Var2, lr7VarL3);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                jm jmVar7 = ll1.g;
                un9.s(jmVar7, dd4Var2, numValueOf2);
                kd kdVar2 = ll1.h;
                un9.r(dd4Var2, kdVar2);
                jm jmVar8 = ll1.d;
                un9.s(jmVar8, dd4Var2, ou6VarL03);
                zn0 zn0Var = zn0.a;
                if (zQ) {
                    dd4Var2.f0(445243315);
                    f9 f9Var7 = f9Var6;
                    l16.a(0.0f, 0, 2, ((lc1) dd4Var2.j(oq1.a)).a, dd4Var2, tg9.n(zn0Var.a(ou6Var4, f9Var7), 14.0f));
                    dd4Var2.q(false);
                    f9Var = f9Var7;
                    wf0Var = wf0Var2;
                    z2 = true;
                    ou6Var = ou6Var4;
                    ivVar = ivVar3;
                    f9Var2 = f9Var5;
                    i2 = i4;
                } else {
                    int i5 = i4;
                    f9 f9Var8 = f9Var6;
                    ivVar = ivVar3;
                    if (str3.length() <= 0 || str3.equals("qt")) {
                        wf0Var = wf0Var2;
                        zn0 zn0Var2 = zn0Var;
                        ou6 ou6Var5 = ou6Var4;
                        int i6 = i5;
                        boolean z3 = false;
                        if (bpaVar.b.length() > 0) {
                            dd4Var2.f0(446863127);
                            zn0 zn0Var3 = zn0Var2;
                            int i7 = i6;
                            ou6 ou6VarN0 = gjb.n0(tg9.h(ou6Var5, 30.0f), 4.0f, 0.0f, 2);
                            ha6 ha6VarD2 = pn0.d(xf0Var, z3);
                            int iHashCode4 = Long.hashCode(dd4Var2.T);
                            lr7 lr7VarL4 = dd4Var2.l();
                            ou6 ou6VarL04 = s32.L0(dd4Var2, ou6VarN0);
                            dd4Var2.j0();
                            if (dd4Var2.S) {
                                dd4Var2.k(um1Var2);
                            } else {
                                dd4Var2.s0();
                            }
                            un9.s(jmVar5, dd4Var2, ha6VarD2);
                            un9.s(jmVar6, dd4Var2, lr7VarL4);
                            ky0.v(iHashCode4, dd4Var2, jmVar7, dd4Var2, kdVar2);
                            un9.s(jmVar8, dd4Var2, ou6VarL04);
                            f9Var = f9Var8;
                            ou6Var = ou6Var5;
                            f9Var2 = f9Var5;
                            i2 = i7;
                            nha.c(bpaVar.b, gjb.n0(zn0Var3.a(ou6Var5, f9Var8), 4.0f, 0.0f, 2), s00.o(dd4Var2).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).k, dd4Var, 0, 0, 131064);
                            nha.c(bpaVar.c, zn0Var3.a(ou6Var, f9Var2), s00.o(dd4Var).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).o, dd4Var, 0, 0, 131064);
                            dd4Var2 = dd4Var;
                            dd4Var2.q(true);
                            dd4Var2.q(false);
                            z2 = true;
                        } else {
                            f9Var = f9Var8;
                            ou6Var = ou6Var5;
                            f9Var2 = f9Var5;
                            i2 = i6;
                            dd4Var2.f0(447967223);
                            String upperCase = str4.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            nha.c(upperCase, gjb.n0(zn0Var2.a(ou6Var, f9Var), 8.0f, 0.0f, 2), s00.o(dd4Var2).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).k, dd4Var, 0, 0, 130040);
                            dd4Var2 = dd4Var;
                            dd4Var2.q(z3);
                            z2 = true;
                        }
                    } else {
                        dd4Var2.f0(445621329);
                        ou6 ou6VarO = tg9.o(gjb.n0(ou6Var4, 4.0f, 0.0f, 2), 40.0f, 30.0f);
                        ha6 ha6VarD3 = pn0.d(xf0Var, false);
                        int iHashCode5 = Long.hashCode(dd4Var2.T);
                        lr7 lr7VarL5 = dd4Var2.l();
                        ou6 ou6VarL05 = s32.L0(dd4Var2, ou6VarO);
                        dd4Var2.j0();
                        if (dd4Var2.S) {
                            dd4Var2.k(um1Var2);
                        } else {
                            dd4Var2.s0();
                        }
                        un9.s(jmVar5, dd4Var2, ha6VarD3);
                        un9.s(jmVar6, dd4Var2, lr7VarL5);
                        ky0.v(iHashCode5, dd4Var2, jmVar7, dd4Var2, kdVar2);
                        un9.s(jmVar8, dd4Var2, ou6VarL05);
                        wf0Var = wf0Var2;
                        w05.a(new po3(bpaVar.a), ra1.d, false, null, null, t96.w(tg9.n(zn0Var.a(ou6Var4, f9Var8), 20.0f), tp8.a), null, dd4Var2, 100663344, 188);
                        f9 f9Var9 = f9Var5;
                        nha.c(bpaVar.c, zn0Var.a(ou6Var4, f9Var9), s00.o(dd4Var).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).o, dd4Var, 0, 0, 131064);
                        dd4Var2 = dd4Var;
                        dd4Var2.q(true);
                        dd4Var2.q(false);
                        f9Var = f9Var8;
                        f9Var2 = f9Var9;
                        z2 = true;
                        i2 = i5;
                        ou6Var = ou6Var4;
                    }
                }
                dd4Var2.q(z2);
                yb4Var2 = yb4Var;
                ou6Var3 = ou6Var;
                i4 = i2;
                ivVar3 = ivVar;
                wf0Var2 = wf0Var;
                f9Var6 = f9Var;
                str2 = str;
                f9Var5 = f9Var2;
                it = it2;
            }
            int i8 = i4;
            dd4Var2.q(false);
            dd4Var2.q(true);
            ou6 ou6VarA2 = kc5.A(m(dd4Var2, ou6Var3), kc5.J(dd4Var2), 14);
            eq8 eq8VarA3 = dq8.a(ivVar3, wf0Var2, dd4Var2, 0);
            int iHashCode6 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL6 = dd4Var2.l();
            ou6 ou6VarL06 = s32.L0(dd4Var2, ou6VarA2);
            ml1.k.getClass();
            um1 um1Var3 = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var3);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, eq8VarA3);
            un9.s(ll1.e, dd4Var2, lr7VarL6);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode6));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL06);
            int i9 = i8 & 7168;
            boolean z4 = i9 == 2048;
            Object objQ2 = dd4Var2.Q();
            if (z4 || objQ2 == fu6Var) {
                kb4Var2 = kb4Var;
                tk6 tk6Var = new tk6(10, kb4Var2);
                dd4Var2.p0(tk6Var);
                obj = tk6Var;
            } else {
                kb4Var2 = kb4Var;
                obj = objQ2;
            }
            a("aa", 0, (ib4) obj, dd4Var2, 54);
            boolean z5 = i9 == 2048;
            Object objQ3 = dd4Var2.Q();
            Object obj3 = objQ3;
            if (z5 || objQ3 == fu6Var) {
                tk6 tk6Var2 = new tk6(11, kb4Var2);
                dd4Var2.p0(tk6Var2);
                obj3 = tk6Var2;
            }
            a("Aa", 1, (ib4) obj3, dd4Var2, 54);
            boolean z6 = i9 == 2048;
            Object objQ4 = dd4Var2.Q();
            Object obj4 = objQ4;
            if (z6 || objQ4 == fu6Var) {
                tk6 tk6Var3 = new tk6(12, kb4Var2);
                dd4Var2.p0(tk6Var3);
                obj4 = tk6Var3;
            }
            a("Aa", 2, (ib4) obj4, dd4Var2, 54);
            boolean z7 = i9 == 2048;
            Object objQ5 = dd4Var2.Q();
            Object obj5 = objQ5;
            if (z7 || objQ5 == fu6Var) {
                tk6 tk6Var4 = new tk6(13, kb4Var2);
                dd4Var2.p0(tk6Var4);
                obj5 = tk6Var4;
            }
            a("Aa", 0, (ib4) obj5, dd4Var2, 54);
            boolean z8 = i9 == 2048;
            Object objQ6 = dd4Var2.Q();
            Object obj6 = objQ6;
            if (z8 || objQ6 == fu6Var) {
                tk6 tk6Var5 = new tk6(14, kb4Var2);
                dd4Var2.p0(tk6Var5);
                obj6 = tk6Var5;
            }
            a("AA", 0, (ib4) obj6, dd4Var2, 54);
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yn6(list, str, yb4Var, kb4Var, i, 0);
        }
    }

    public static final al7 h0(int i, int i2, dd4 dd4Var, int i3, int i4) {
        boolean z = true;
        if ((i4 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        rt8 rt8Var = al7.G;
        boolean zC = ((((i3 & 14) ^ 6) > 4 && dd4Var.d(i)) || (i3 & 6) == 4) | dd4Var.c(0.0f);
        if ((((i3 & 896) ^ 384) <= 256 || !dd4Var.d(i2)) && (i3 & 384) != 256) {
            z = false;
        }
        boolean z2 = zC | z;
        Object objQ = dd4Var.Q();
        if (z2 || objQ == vl1.a) {
            objQ = new tt5(i, i2, 2);
            dd4Var.p0(objQ);
        }
        al7 al7Var = (al7) ww1.d0(objArr, rt8Var, (ib4) objQ, dd4Var, 0);
        al7Var.F.setValue(Integer.valueOf(i2));
        return al7Var;
    }

    public static final void i(int i, int i2) {
        if (i < 0 || i >= i2) {
            k27.m(xv5.o("index: ", i, i2, ", size: "));
        }
    }

    public static final a07 i0(m53 m53Var, lf2 lf2Var, Object obj, ib4 ib4Var, yb4 yb4Var, dd4 dd4Var) {
        m53Var.getClass();
        lf2Var.getClass();
        obj.getClass();
        ib4Var.getClass();
        yb4Var.getClass();
        ((hl8) dd4Var.j(jl8.b)).getClass();
        gl8 gl8VarA = hl8.a(dd4Var);
        boolean zF = dd4Var.f(m53Var) | dd4Var.f(lf2Var) | dd4Var.f(obj) | dd4Var.f(gl8VarA);
        Object objQ = dd4Var.Q();
        if (zF || objQ == vl1.a) {
            objQ = dk9.x(ah1.S(hc3.a, new ul8(yb4Var, gl8VarA, null, 2)));
            dd4Var.p0(objQ);
        }
        return (a07) objQ;
    }

    public static final void j(int i, int i2) {
        if (i < 0 || i > i2) {
            k27.m(xv5.o("index: ", i, i2, ", size: "));
        }
    }

    public static final a07 j0(dl8 dl8Var, ib4 ib4Var, yb4 yb4Var, dd4 dd4Var) {
        dl8Var.getClass();
        ib4Var.getClass();
        yb4Var.getClass();
        ((hl8) dd4Var.j(jl8.b)).getClass();
        gl8 gl8VarA = hl8.a(dd4Var);
        boolean zF = dd4Var.f(dl8Var) | dd4Var.f(gl8VarA);
        Object objQ = dd4Var.Q();
        if (zF || objQ == vl1.a) {
            objQ = dk9.x(ah1.S(hc3.a, new ul8(yb4Var, gl8VarA, null, 0)));
            dd4Var.p0(objQ);
        }
        return (a07) objQ;
    }

    public static final void k(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            w58.g(i3, xv5.t(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            gp.l(xv5.o("fromIndex: ", i, i2, " > toIndex: "));
        }
    }

    public static final by8 k0(jx8 jx8Var, ib4 ib4Var, dd4 dd4Var, int i) {
        jx8Var.getClass();
        ib4Var.getClass();
        dd4Var.f0(996643712);
        Object objQ = dd4Var.Q();
        fu6 fu6Var = vl1.a;
        if (objQ == fu6Var) {
            ym1 ym1Var = new ym1(lc5.Z(dd4Var));
            dd4Var.p0(ym1Var);
            objQ = ym1Var;
        }
        vx1 vx1Var = ((ym1) objQ).a;
        a07 a07VarA = dk9.A(ib4Var, dd4Var);
        a07 a07VarA2 = dk9.A(100L, dd4Var);
        dd4Var.f0(1852585201);
        boolean zF = ((((i & 896) ^ 384) > 256 && dd4Var.e(100L)) || (i & 384) == 256) | dd4Var.f(jx8Var) | dd4Var.f(vx1Var);
        Object objQ2 = dd4Var.Q();
        if (zF || objQ2 == fu6Var) {
            objQ2 = new by8(jx8Var, vx1Var, new hd(13, a07VarA, a07VarA2));
            dd4Var.p0(objQ2);
        }
        by8 by8Var = (by8) objQ2;
        dd4Var.q(false);
        dd4Var.q(false);
        return by8Var;
    }

    public static final a07 l(ta5 ta5Var, dd4 dd4Var, int i) {
        Object objQ = dd4Var.Q();
        Object obj = vl1.a;
        if (objQ == obj) {
            objQ = dk9.x(Boolean.FALSE);
            dd4Var.p0(objQ);
        }
        a07 a07Var = (a07) objQ;
        boolean z = (((i & 14) ^ 6) > 4 && dd4Var.f(ta5Var)) || (i & 6) == 4;
        Object objQ2 = dd4Var.Q();
        if (z || objQ2 == obj) {
            objQ2 = new yw3(ta5Var, a07Var, (jt1) null, 8);
            dd4Var.p0(objQ2);
        }
        lc5.u((yb4) objQ2, dd4Var, ta5Var);
        return a07Var;
    }

    public static void l0(int i, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + f0(i, parcel));
    }

    public static final ou6 m(dd4 dd4Var, ou6 ou6Var) {
        ou6 ou6VarH = tg9.h(ou6Var, 34.0f);
        ur9 ur9Var = s96.a;
        return gjb.m0(fw.G(fe.L(t96.w(ou6VarH, ((q96) dd4Var.j(ur9Var)).c.b), lc1.c(0.32f, ((q96) dd4Var.j(ur9Var)).a.r), jf0.G), 1.0f, lc1.c(0.5f, ((q96) dd4Var.j(ur9Var)).a.B), ((q96) dd4Var.j(ur9Var)).c.b), 2.0f, 2.0f);
    }

    public static boolean m0(String str) {
        return str == null || str.isEmpty();
    }

    public static BigDecimal n(int i, Parcel parcel) {
        int iF0 = f0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i2 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iF0);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i2);
    }

    public static final Throwable n0(Throwable th) {
        th.getClass();
        Throwable cause = th;
        while (true) {
            if (!(cause instanceof CancellationException)) {
                if (cause == null) {
                    break;
                }
                return cause;
            }
            CancellationException cancellationException = (CancellationException) cause;
            if (cause.equals(cancellationException.getCause())) {
                break;
            }
            cause = cancellationException.getCause();
        }
        return th;
    }

    public static Bundle o(int i, Parcel parcel) {
        int iF0 = f0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iF0);
        return bundle;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pr8 */
    public static int o0(Parcel parcel) throws pr8 {
        int i = parcel.readInt();
        int iF0 = f0(i, parcel);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new pr8("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iF0 + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new pr8(sb.toString(), parcel);
    }

    public static byte[] p(int i, Parcel parcel) {
        int iF0 = f0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iF0);
        return bArrCreateByteArray;
    }

    public static final Exception p0(String str, FileNotFoundException fileNotFoundException) {
        int i;
        boolean zEquals = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.getClass();
                Process.myUserHandle().writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                i = parcelObtain.readInt();
            } catch (Throwable unused) {
                Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                i = 0;
            }
            Object objInvoke = method.invoke(null, "sys.user." + i + ".ce_available", "false");
            objInvoke.getClass();
            zEquals = ((String) objInvoke).equals("true");
        } catch (Throwable th) {
            i12.r(fileNotFoundException, th);
        }
        if (zEquals || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new ct2(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static byte[][] q(int i, Parcel parcel) {
        int iF0 = f0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iF0);
        return bArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pr8 */
    public static void q0(Parcel parcel, int i, int i2) throws pr8 {
        int iF0 = f0(i, parcel);
        if (iF0 == i2) {
            return;
        }
        String hexString = Integer.toHexString(iF0);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iF0).length() + 4 + 1);
        tw2.v(i2, iF0, "Expected size ", " got ", sb);
        throw new pr8(j39.n(sb, " (0x", hexString, ")"), parcel);
    }

    public static int[] r(int i, Parcel parcel) {
        int iF0 = f0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iF0);
        return iArrCreateIntArray;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pr8 */
    public static void r0(Parcel parcel, int i, int i2) throws pr8 {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        tw2.v(i2, i, "Expected size ", " got ", sb);
        throw new pr8(j39.n(sb, " (0x", hexString, ")"), parcel);
    }

    public static Parcelable s(Parcel parcel, int i, Parcelable.Creator creator) {
        int iF0 = f0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iF0);
        return parcelable;
    }

    public static String t(int i, Parcel parcel) {
        int iF0 = f0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iF0);
        return string;
    }

    public static String[] u(int i, Parcel parcel) {
        int iF0 = f0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iF0);
        return strArrCreateStringArray;
    }

    public static ArrayList v(int i, Parcel parcel) {
        int iF0 = f0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iF0);
        return arrayListCreateStringArrayList;
    }

    public static Object[] w(Parcel parcel, int i, Parcelable.Creator creator) {
        int iF0 = f0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iF0);
        return objArrCreateTypedArray;
    }

    public static ArrayList x(Parcel parcel, int i, Parcelable.Creator creator) {
        int iF0 = f0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iF0 == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iF0);
        return arrayListCreateTypedArrayList;
    }

    public mg6 y(og6 og6Var) {
        ByteBuffer byteBuffer = ((de2) og6Var).e;
        byteBuffer.getClass();
        fx1.G(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return z(og6Var, byteBuffer);
    }

    public abstract mg6 z(og6 og6Var, ByteBuffer byteBuffer);
}

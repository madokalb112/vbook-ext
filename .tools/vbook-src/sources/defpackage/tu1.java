package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.view.inputmethod.ExtractedText;
import android.widget.EdgeEffect;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class tu1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static long[] A(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static void B(gx3 gx3Var, zn7 zn7Var) {
        if (gx3Var.e0(zn7Var)) {
            return;
        }
        try {
            gx3Var.O0(zn7Var, false).close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void C(gx3 gx3Var, zn7 zn7Var) throws IOException {
        try {
            IOException iOException = null;
            for (zn7 zn7Var2 : gx3Var.g0(zn7Var)) {
                try {
                    if (gx3Var.p0(zn7Var2).b) {
                        C(gx3Var, zn7Var2);
                    }
                    gx3Var.R(zn7Var2, false);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final float D(zk7 zk7Var) {
        return zk7Var.n().e == lh7.b ? Float.intBitsToFloat((int) (zk7Var.r() >> 32)) : Float.intBitsToFloat((int) (zk7Var.r() & 4294967295L));
    }

    public static boolean E(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static final int F(int i, List list) {
        int i2;
        int i3 = ((gm7) fc1.E0(list)).c;
        if (i > ((gm7) fc1.E0(list)).c) {
            r75.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            gm7 gm7Var = (gm7) list.get(i2);
            byte b = gm7Var.b > i ? (byte) 1 : gm7Var.c <= i ? (byte) -1 : (byte) 0;
            if (b >= 0) {
                if (b <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder sbU = xv5.u(i2, "Found paragraph index ", " should be in range [0, ");
        sbU.append(list.size());
        sbU.append(").\nDebug info: index=");
        sbU.append(i);
        sbU.append(", paragraphs=[");
        sbU.append(sz5.a(31, new ss6(5), (String) null, list));
        sbU.append(']');
        r75.a(sbU.toString());
        return i2;
    }

    public static final int G(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            gm7 gm7Var = (gm7) list.get(i3);
            byte b = gm7Var.d > i ? (byte) 1 : gm7Var.e <= i ? (byte) -1 : (byte) 0;
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int H(ArrayList arrayList, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((gm7) fc1.E0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            gm7 gm7Var = (gm7) arrayList.get(i2);
            byte b = gm7Var.f > f ? (byte) 1 : gm7Var.g <= f ? (byte) -1 : (byte) 0;
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void I(ArrayList arrayList, long j, kb4 kb4Var) {
        int size = arrayList.size();
        for (int iF = F(pja.g(j), arrayList); iF < size; iF++) {
            gm7 gm7Var = (gm7) arrayList.get(iF);
            if (gm7Var.b >= pja.f(j)) {
                return;
            }
            if (gm7Var.b != gm7Var.c) {
                kb4Var.invoke(gm7Var);
            }
        }
    }

    public static final a91 J(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        clsAnnotationType.getClass();
        return ug8.a(clsAnnotationType);
    }

    public static float K(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return d83.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final float L(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final Class M(a91 a91Var) {
        a91Var.getClass();
        Class clsC = a91Var.c();
        clsC.getClass();
        return clsC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class N(a91 a91Var) {
        a91Var.getClass();
        Class clsC = a91Var.c();
        if (clsC.isPrimitive()) {
            String name = clsC.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsC;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class O(a91 a91Var) {
        Class clsC = a91Var.c();
        if (clsC.isPrimitive()) {
            return clsC;
        }
        String name = clsC.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final Object P(ca6 ca6Var) {
        Object objF = ca6Var.F();
        dn5 dn5Var = objF instanceof dn5 ? (dn5) objF : null;
        if (dn5Var != null) {
            return dn5Var.A;
        }
        return null;
    }

    public static final int Q(m39 m39Var, m39[] m39VarArr) {
        m39VarArr.getClass();
        int iHashCode = (m39Var.a().hashCode() * 31) + Arrays.hashCode(m39VarArr);
        int iF = m39Var.f();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iF > 0)) {
                break;
            }
            int i2 = iF - 1;
            int i3 = i * 31;
            String strA = m39Var.i(m39Var.f() - iF).a();
            if (strA != null) {
                iHashCode2 = strA.hashCode();
            }
            i = i3 + iHashCode2;
            iF = i2;
        }
        int iF2 = m39Var.f();
        int iHashCode3 = 1;
        while (true) {
            if (!(iF2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iF2 - 1;
            int i5 = iHashCode3 * 31;
            gx1 gx1VarE = m39Var.i(m39Var.f() - iF2).e();
            iHashCode3 = i5 + (gx1VarE != null ? gx1VarE.hashCode() : 0);
            iF2 = i4;
        }
    }

    public static final boolean R(long j) {
        return (j & 2) != 0;
    }

    public static final boolean S(long j) {
        return (j & 1) != 0;
    }

    public static final boolean T(zk7 zk7Var, float f) {
        zk7Var.n().getClass();
        return !(((zk7Var.s() ? -f : D(zk7Var)) > 0.0f ? 1 : ((zk7Var.s() ? -f : D(zk7Var)) == 0.0f ? 0 : -1)) > 0);
    }

    public static px0 U(jx1 jx1Var, yb4 yb4Var) {
        jx1Var.getClass();
        return yb0.Q(new d02(4, jx1Var, zx1.a, yb4Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final n89 V(n89 r13, n89 r14, float r15) {
        /*
            n89 r0 = new n89
            float r1 = r13.a
            float r2 = r14.a
            float r1 = sw1.V(r1, r2, r15)
            float r2 = r13.b
            float r3 = r14.b
            float r2 = sw1.V(r2, r3, r15)
            long r3 = r13.c
            long r5 = r14.c
            float r7 = z13.a(r3)
            float r8 = z13.a(r5)
            float r7 = sw1.V(r7, r8, r15)
            float r3 = z13.b(r3)
            float r4 = z13.b(r5)
            float r3 = sw1.V(r3, r4, r15)
            int r4 = java.lang.Float.floatToRawIntBits(r7)
            long r4 = (long) r4
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r3
            r3 = 32
            long r3 = r4 << r3
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r6 & r8
            long r3 = r3 | r5
            long r5 = r13.e
            long r7 = r14.e
            long r5 = defpackage.ah1.K(r5, r7, r15)
            sq0 r7 = r13.f
            sq0 r8 = r14.f
            boolean r9 = defpackage.lc5.Q(r7, r8)
            r10 = 0
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r9 == 0) goto L5e
            int r9 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r9 >= 0) goto L82
            goto L85
        L5e:
            boolean r9 = r7 instanceof vb5
            if (r9 == 0) goto L6a
            r9 = r7
            vb5 r9 = (vb5) r9
            java.lang.Object r9 = r9.b(r8, r15)
            goto L6b
        L6a:
            r9 = r10
        L6b:
            if (r9 != 0) goto L7b
            boolean r12 = r8 instanceof vb5
            if (r12 == 0) goto L7b
            r9 = r8
            vb5 r9 = (vb5) r9
            r12 = 1065353216(0x3f800000, float:1.0)
            float r12 = r12 - r15
            java.lang.Object r9 = r9.b(r7, r12)
        L7b:
            if (r9 != 0) goto L84
            int r9 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r9 >= 0) goto L82
            goto L85
        L82:
            r7 = r8
            goto L85
        L84:
            r7 = r9
        L85:
            boolean r8 = r7 instanceof sq0
            if (r8 == 0) goto L8c
            r10 = r7
            sq0 r10 = (sq0) r10
        L8c:
            r7 = r10
            float r8 = r13.g
            float r9 = r14.g
            float r8 = sw1.V(r8, r9, r15)
            int r15 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r15 >= 0) goto L9a
            goto L9b
        L9a:
            r13 = r14
        L9b:
            int r9 = r13.d
            r0.<init>(r1, r2, r3, r5, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu1.V(n89, n89, float):n89");
    }

    public static float W(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return d83.c(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static g74 X(android.content.res.XmlResourceParser r26, android.content.res.Resources r27) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu1.X(android.content.res.XmlResourceParser, android.content.res.Resources):g74");
    }

    public static wr Y(hn7 hn7Var) {
        int iM = hn7Var.m();
        if (hn7Var.m() != 1684108385) {
            fe.n0("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM2 = hn7Var.m();
        byte[] bArr = xn0.a;
        int i = iM2 & 16777215;
        String str = i == 13 ? "image/jpeg" : i == 14 ? "image/png" : null;
        if (str == null) {
            dx1.s(i, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        hn7Var.N(4);
        int i2 = iM - 16;
        byte[] bArr2 = new byte[i2];
        hn7Var.k(bArr2, 0, i2);
        return new wr(3, str, (String) null, bArr2);
    }

    public static eha Z(int i, hn7 hn7Var, String str) {
        int iM = hn7Var.m();
        if (hn7Var.m() == 1684108385 && iM >= 22) {
            hn7Var.N(10);
            int iG = hn7Var.G();
            if (iG > 0) {
                String strF = dx1.f(iG, "");
                int iG2 = hn7Var.G();
                if (iG2 > 0) {
                    strF = dx1.g(iG2, strF, "/");
                }
                return new eha(str, (String) null, a55.q(strF));
            }
        }
        fe.n0("MetadataUtil", "Failed to parse index/count attribute: ".concat(yq0.d(i)));
        return null;
    }

    public static final void a(p35 p35Var, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i, int i2) {
        ou6 ou6Var2;
        p35Var.getClass();
        ib4Var.getClass();
        dd4Var.h0(-850562787);
        int i3 = i | (dd4Var.f(p35Var) ? 4 : 2);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        int i5 = i3 | (dd4Var.h(ib4Var) ? 256 : Token.CASE);
        if (dd4Var.V(i5 & 1, (i5 & Token.EXPR_VOID) != 146)) {
            ou6Var2 = i4 != 0 ? lu6.a : ou6Var;
            ou6 ou6VarN = tg9.n(ou6Var2, 32.0f);
            rp8 rp8Var = tp8.a;
            ou6 ou6VarW = t96.w(ou6VarN, rp8Var);
            boolean z = (i5 & 896) == 256;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new mh1(5, ib4Var);
                dd4Var.p0(objQ);
            }
            ou6 ou6VarJ = fw.J(null, (ib4) objQ, ou6VarW, false, 15);
            ur9 ur9Var = s96.a;
            mx4.a(p35Var, (String) null, gjb.l0(fe.L(gjb.l0(fe.L(ou6VarJ, dd1.g(((q96) dd4Var.j(ur9Var)).a, 16.0f), jf0.G), 1.0f), dd1.g(((q96) dd4Var.j(ur9Var)).a, 8.0f), rp8Var), 6.0f), ((q96) dd4Var.j(ur9Var)).a.q, dd4Var, (i5 & 14) | 48, 0);
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new su1(p35Var, ou6Var2, ib4Var, i, i2, 0);
        }
    }

    public static int a0(hn7 hn7Var) {
        int iM = hn7Var.m();
        if (hn7Var.m() == 1684108385) {
            hn7Var.N(8);
            int i = iM - 16;
            if (i == 1) {
                return hn7Var.z();
            }
            if (i == 2) {
                return hn7Var.G();
            }
            if (i == 3) {
                return hn7Var.C();
            }
            if (i == 4 && (hn7Var.j() & Token.CASE) == 0) {
                return hn7Var.D();
            }
        }
        fe.n0("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static final void b(p3b p3bVar, ou6 ou6Var, by3 by3Var, kb4 kb4Var, rj1 rj1Var, dd4 dd4Var, int i) {
        kb4 kb4Var2;
        yf1 yf1Var = p3bVar.a;
        dd4Var.h0(-1877370462);
        int i2 = (i & 6) == 0 ? (dd4Var.f(p3bVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.h(by3Var) ? 256 : Token.CASE;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= dd4Var.h(rj1Var) ? 16384 : 8192;
        }
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            if (objQ == fu6Var) {
                objQ = kd.L;
                dd4Var.p0(objQ);
            }
            kb4 kb4Var3 = (kb4) objQ;
            Object objQ2 = dd4Var.Q();
            Object obj = objQ2;
            if (objQ2 == fu6Var) {
                hk9 hk9Var = new hk9();
                hk9Var.add(yf1Var.t());
                dd4Var.p0(hk9Var);
                obj = hk9Var;
            }
            hk9 hk9Var2 = (hk9) obj;
            Object objQ3 = dd4Var.Q();
            if (objQ3 == fu6Var) {
                long[] jArr = ju8.a;
                objQ3 = new tz6();
                dd4Var.p0(objQ3);
            }
            tz6 tz6Var = (tz6) objQ3;
            cn7 cn7Var = p3bVar.d;
            if (lc5.Q(yf1Var.t(), cn7Var.getValue())) {
                dd4Var.f0(321145192);
                if (hk9Var2.size() == 1 && lc5.Q(hk9Var2.get(0), cn7Var.getValue())) {
                    dd4Var.f0(321469824);
                    dd4Var.q(false);
                } else {
                    dd4Var.f0(321279546);
                    boolean z = (i3 & 14) == 4;
                    Object objQ4 = dd4Var.Q();
                    if (z || objQ4 == fu6Var) {
                        objQ4 = new k9(p3bVar, 15);
                        dd4Var.p0(objQ4);
                    }
                    fc1.K0(hk9Var2, (kb4) objQ4);
                    tz6Var.a();
                    dd4Var.q(false);
                }
                dd4Var.q(false);
            } else {
                dd4Var.f0(321475776);
                dd4Var.q(false);
            }
            if (tz6Var.b(cn7Var.getValue())) {
                dd4Var.f0(322279296);
                dd4Var.q(false);
            } else {
                dd4Var.f0(321536443);
                ListIterator listIterator = hk9Var2.listIterator();
                int i4 = 0;
                while (true) {
                    em4 em4Var = (em4) listIterator;
                    if (!em4Var.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (lc5.Q(kb4Var3.invoke(em4Var.next()), kb4Var3.invoke(cn7Var.getValue()))) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 == -1) {
                    hk9Var2.add(cn7Var.getValue());
                } else {
                    hk9Var2.set(i4, cn7Var.getValue());
                }
                tz6Var.a();
                int size = hk9Var2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Object obj2 = hk9Var2.get(i5);
                    tz6Var.n(obj2, jf0.G(-934471669, new u12(p3bVar, by3Var, obj2, rj1Var), dd4Var));
                }
                dd4Var.q(false);
            }
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
            un9.l(dd4Var, Integer.valueOf(iHashCode), ll1.g);
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            dd4Var.f0(-1312707512);
            int size2 = hk9Var2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                Object obj3 = hk9Var2.get(i6);
                dd4Var.c0(1171574969, kb4Var3.invoke(obj3));
                yb4 yb4Var = (yb4) tz6Var.g(obj3);
                if (yb4Var == null) {
                    dd4Var.f0(1959122128);
                } else {
                    dd4Var.f0(1171576145);
                    yb4Var.invoke(dd4Var, 0);
                }
                dd4Var.q(false);
                dd4Var.q(false);
            }
            dd4Var.q(false);
            dd4Var.q(true);
            kb4Var2 = kb4Var3;
        } else {
            dd4Var.Y();
            kb4Var2 = kb4Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new v12(p3bVar, ou6Var, by3Var, kb4Var2, rj1Var, i);
        }
    }

    public static vx4 b0(int i, String str, hn7 hn7Var, boolean z, boolean z2) {
        int iA0 = a0(hn7Var);
        if (z2) {
            iA0 = Math.min(1, iA0);
        }
        if (iA0 >= 0) {
            return z ? new eha(str, (String) null, a55.q(Integer.toString(iA0))) : new bg1("und", str, Integer.toString(iA0));
        }
        fe.n0("MetadataUtil", "Failed to parse uint8 attribute: ".concat(yq0.d(i)));
        return null;
    }

    public static final void c(Boolean bool, ou6 ou6Var, by3 by3Var, String str, rj1 rj1Var, dd4 dd4Var, int i) {
        ou6 ou6Var2;
        String str2;
        dd4Var.h0(-513216493);
        int i2 = i | (dd4Var.f(bool) ? 4 : 2) | 48 | (dd4Var.h(by3Var) ? 256 : Token.CASE) | 3072;
        if (dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            ou6 ou6Var3 = lu6.a;
            b(p7c.h0(bool, "Crossfade", dd4Var, (i2 & 14) | 48, 0), ou6Var3, by3Var, null, rj1Var, dd4Var, i2 & 58352);
            ou6Var2 = ou6Var3;
            str2 = "Crossfade";
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
            str2 = str;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new t12(bool, ou6Var2, by3Var, str2, rj1Var, i);
        }
    }

    public static eha c0(int i, hn7 hn7Var, String str) {
        int iM = hn7Var.m();
        if (hn7Var.m() == 1684108385) {
            hn7Var.N(8);
            return new eha(str, (String) null, a55.q(hn7Var.v(iM - 16)));
        }
        fe.n0("MetadataUtil", "Failed to parse text attribute: ".concat(yq0.d(i)));
        return null;
    }

    public static final void d(rj1 rj1Var, dd4 dd4Var, int i) {
        dd4Var.h0(-1162635549);
        if (dd4Var.V(i & 1, (i & 3) != 2)) {
            jv3.e(s19.a.a((Object) null), rj1Var, dd4Var, 56);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tb0(i, 12, rj1Var);
        }
    }

    public static List d0(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static final long e(int i, int i2) {
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = fa5.c;
        return j;
    }

    public static final yb4 e0(xh4 xh4Var, lv lvVar, dd4 dd4Var) {
        boolean zF = dd4Var.f(xh4Var);
        Object objQ = dd4Var.Q();
        if (zF || objQ == vl1.a) {
            objQ = new il6(25, xh4Var, lvVar);
            dd4Var.p0(objQ);
        }
        return (yb4) objQ;
    }

    public static final void f(st5 st5Var, List list, dd4 dd4Var, int i) {
        int i2;
        st5Var.getClass();
        list.getClass();
        dd4Var.h0(715701990);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(st5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.h(list) ? 32 : 16;
        }
        int i3 = 20;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            a15 a15Var = (a15) dd4Var.j(c15.a);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new se6(20);
                dd4Var.p0(objQ);
            }
            se6 se6Var = (se6) objQ;
            boolean zH = dd4Var.h(se6Var) | ((i2 & 14) == 4) | dd4Var.h(list) | dd4Var.f(a15Var);
            Object objQ2 = dd4Var.Q();
            if (zH || objQ2 == obj) {
                ck7 ck7Var = new ck7(st5Var, se6Var, list, a15Var, (jt1) null, 2);
                dd4Var.p0(ck7Var);
                objQ2 = ck7Var;
            }
            lc5.w(list, st5Var, a15Var, (yb4) objQ2, dd4Var);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new bo6(st5Var, list, i, i3);
        }
    }

    public static final mn8 f0(dd4 dd4Var) {
        gia giaVarN = xg9.n(dd4Var);
        Object[] objArr = new Object[0];
        rt8 rt8Var = fo8.x;
        Object objQ = dd4Var.Q();
        Object obj = vl1.a;
        if (objQ == obj) {
            objQ = new av6(27);
            dd4Var.p0(objQ);
        }
        fo8 fo8Var = (fo8) ww1.d0(objArr, rt8Var, (ib4) objQ, dd4Var, 384);
        fo8Var.f = giaVarN;
        boolean zF = dd4Var.f(fo8Var);
        Object objQ2 = dd4Var.Q();
        if (zF || objQ2 == obj) {
            objQ2 = new mn8(fo8Var);
            dd4Var.p0(objQ2);
        }
        return (mn8) objQ2;
    }

    public static final void g(final t83 t83Var, ac4 ac4Var, dd4 dd4Var, int i) {
        t83Var.getClass();
        ac4Var.getClass();
        dd4Var.h0(802164753);
        int i2 = i | (dd4Var.f(t83Var) ? 4 : 2) | (dd4Var.h(ac4Var) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            boolean zBooleanValue = ((Boolean) t83Var.a.getValue()).booleanValue();
            ou6 ou6VarE = yib.E(lu6.a, 14);
            boolean z = (i2 & 14) == 4;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                objQ = new ek6(t83Var, 0);
                dd4Var.p0(objQ);
            }
            z8.d(zBooleanValue, (kb4) objQ, jf0.G(2079009597, new fk6(t83Var, ac4Var), dd4Var), null, ou6VarE, jf0.G(-1453225190, new yb4() { // from class: gk6
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    heb hebVar = heb.a;
                    Object obj3 = vl1.a;
                    t83 t83Var2 = t83Var;
                    switch (i5) {
                        case 0:
                            dd4 dd4Var2 = (dd4) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (!dd4Var2.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                                dd4Var2.Y();
                            } else {
                                boolean zF = dd4Var2.f(t83Var2);
                                Object objQ2 = dd4Var2.Q();
                                if (zF || objQ2 == obj3) {
                                    objQ2 = new hk6(t83Var2, 0);
                                    dd4Var2.p0(objQ2);
                                }
                                lc5.J((ib4) objQ2, null, false, null, null, null, fz1.h, dd4Var2, 805306368, 510);
                            }
                            break;
                        default:
                            dd4 dd4Var3 = (dd4) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!dd4Var3.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                dd4Var3.Y();
                            } else {
                                Object objQ3 = dd4Var3.Q();
                                if (objQ3 == obj3) {
                                    objQ3 = ky0.f(dd4Var3);
                                }
                                z44 z44Var = (z44) objQ3;
                                Object objQ4 = dd4Var3.Q();
                                if (objQ4 == obj3) {
                                    objQ4 = new tb3(z44Var, null, 11);
                                    dd4Var3.p0(objQ4);
                                }
                                lc5.u((yb4) objQ4, dd4Var3, z44Var);
                                lu6 lu6Var = lu6.a;
                                ou6 ou6VarQ = kc5.Q(tg9.f(lu6Var, 1.0f), kc5.J(dd4Var3), 14);
                                ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var3, 0);
                                int iHashCode = Long.hashCode(dd4Var3.T);
                                lr7 lr7VarL = dd4Var3.l();
                                ou6 ou6VarL0 = s32.L0(dd4Var3, ou6VarQ);
                                ml1.k.getClass();
                                um1 um1Var = ll1.b;
                                dd4Var3.j0();
                                if (dd4Var3.S) {
                                    dd4Var3.k(um1Var);
                                } else {
                                    dd4Var3.s0();
                                }
                                un9.s(ll1.f, dd4Var3, ie1VarA);
                                un9.s(ll1.e, dd4Var3, lr7VarL);
                                un9.s(ll1.g, dd4Var3, Integer.valueOf(iHashCode));
                                un9.r(dd4Var3, ll1.h);
                                un9.s(ll1.d, dd4Var3, ou6VarL0);
                                String str = (String) t83Var2.c.getValue();
                                ur9 ur9Var = s96.a;
                                uw1 uw1Var = ((q96) dd4Var3.j(ur9Var)).c.b;
                                ou6 ou6VarB = jv3.B(gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2), z44Var);
                                boolean zF2 = dd4Var3.f(t83Var2);
                                Object objQ5 = dd4Var3.Q();
                                if (zF2 || objQ5 == obj3) {
                                    objQ5 = new ek6(t83Var2, 1);
                                    dd4Var3.p0(objQ5);
                                }
                                lx1.m(str, (kb4) objQ5, ou6VarB, false, false, null, fz1.j, null, null, null, false, null, null, null, true, 0, 0, uw1Var, null, dd4Var3, 1572864, 12582912, 6160312);
                                un9.a(dd4Var3, tg9.h(lu6Var, 12.0f));
                                String str2 = (String) t83Var2.d.getValue();
                                uw1 uw1Var2 = ((q96) dd4Var3.j(ur9Var)).c.b;
                                ou6 ou6VarN0 = gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2);
                                boolean zF3 = dd4Var3.f(t83Var2);
                                Object objQ6 = dd4Var3.Q();
                                if (zF3 || objQ6 == obj3) {
                                    objQ6 = new ek6(t83Var2, 2);
                                    dd4Var3.p0(objQ6);
                                }
                                lx1.m(str2, (kb4) objQ6, ou6VarN0, false, false, null, fz1.k, null, null, null, false, null, null, null, false, 0, 2, uw1Var2, null, dd4Var3, 1573248, 805306368, 5767096);
                                un9.a(dd4Var3, tg9.h(lu6Var, 12.0f));
                                String str3 = (String) t83Var2.e.getValue();
                                uw1 uw1Var3 = ((q96) dd4Var3.j(ur9Var)).c.b;
                                ou6 ou6VarN02 = gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2);
                                boolean zF4 = dd4Var3.f(t83Var2);
                                Object objQ7 = dd4Var3.Q();
                                if (zF4 || objQ7 == obj3) {
                                    objQ7 = new ek6(t83Var2, 3);
                                    dd4Var3.p0(objQ7);
                                }
                                lx1.m(str3, (kb4) objQ7, ou6VarN02, false, false, null, fz1.l, null, null, null, false, null, null, null, false, 0, 0, uw1Var3, null, dd4Var3, 1573248, 0, 6291384);
                                xv5.z(dd4Var3, true, lu6Var, 12.0f, dd4Var3);
                            }
                            break;
                    }
                    return hebVar;
                }
            }, dd4Var), fz1.i, null, 0L, 0L, 0.0f, false, false, jf0.G(1078448613, new yb4() { // from class: gk6
                @Override // defpackage.yb4
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    heb hebVar = heb.a;
                    Object obj3 = vl1.a;
                    t83 t83Var2 = t83Var;
                    switch (i5) {
                        case 0:
                            dd4 dd4Var2 = (dd4) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (!dd4Var2.V(iIntValue & 1, (iIntValue & 3) != 2)) {
                                dd4Var2.Y();
                            } else {
                                boolean zF = dd4Var2.f(t83Var2);
                                Object objQ2 = dd4Var2.Q();
                                if (zF || objQ2 == obj3) {
                                    objQ2 = new hk6(t83Var2, 0);
                                    dd4Var2.p0(objQ2);
                                }
                                lc5.J((ib4) objQ2, null, false, null, null, null, fz1.h, dd4Var2, 805306368, 510);
                            }
                            break;
                        default:
                            dd4 dd4Var3 = (dd4) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (!dd4Var3.V(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                dd4Var3.Y();
                            } else {
                                Object objQ3 = dd4Var3.Q();
                                if (objQ3 == obj3) {
                                    objQ3 = ky0.f(dd4Var3);
                                }
                                z44 z44Var = (z44) objQ3;
                                Object objQ4 = dd4Var3.Q();
                                if (objQ4 == obj3) {
                                    objQ4 = new tb3(z44Var, null, 11);
                                    dd4Var3.p0(objQ4);
                                }
                                lc5.u((yb4) objQ4, dd4Var3, z44Var);
                                lu6 lu6Var = lu6.a;
                                ou6 ou6VarQ = kc5.Q(tg9.f(lu6Var, 1.0f), kc5.J(dd4Var3), 14);
                                ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var3, 0);
                                int iHashCode = Long.hashCode(dd4Var3.T);
                                lr7 lr7VarL = dd4Var3.l();
                                ou6 ou6VarL0 = s32.L0(dd4Var3, ou6VarQ);
                                ml1.k.getClass();
                                um1 um1Var = ll1.b;
                                dd4Var3.j0();
                                if (dd4Var3.S) {
                                    dd4Var3.k(um1Var);
                                } else {
                                    dd4Var3.s0();
                                }
                                un9.s(ll1.f, dd4Var3, ie1VarA);
                                un9.s(ll1.e, dd4Var3, lr7VarL);
                                un9.s(ll1.g, dd4Var3, Integer.valueOf(iHashCode));
                                un9.r(dd4Var3, ll1.h);
                                un9.s(ll1.d, dd4Var3, ou6VarL0);
                                String str = (String) t83Var2.c.getValue();
                                ur9 ur9Var = s96.a;
                                uw1 uw1Var = ((q96) dd4Var3.j(ur9Var)).c.b;
                                ou6 ou6VarB = jv3.B(gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2), z44Var);
                                boolean zF2 = dd4Var3.f(t83Var2);
                                Object objQ5 = dd4Var3.Q();
                                if (zF2 || objQ5 == obj3) {
                                    objQ5 = new ek6(t83Var2, 1);
                                    dd4Var3.p0(objQ5);
                                }
                                lx1.m(str, (kb4) objQ5, ou6VarB, false, false, null, fz1.j, null, null, null, false, null, null, null, true, 0, 0, uw1Var, null, dd4Var3, 1572864, 12582912, 6160312);
                                un9.a(dd4Var3, tg9.h(lu6Var, 12.0f));
                                String str2 = (String) t83Var2.d.getValue();
                                uw1 uw1Var2 = ((q96) dd4Var3.j(ur9Var)).c.b;
                                ou6 ou6VarN0 = gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2);
                                boolean zF3 = dd4Var3.f(t83Var2);
                                Object objQ6 = dd4Var3.Q();
                                if (zF3 || objQ6 == obj3) {
                                    objQ6 = new ek6(t83Var2, 2);
                                    dd4Var3.p0(objQ6);
                                }
                                lx1.m(str2, (kb4) objQ6, ou6VarN0, false, false, null, fz1.k, null, null, null, false, null, null, null, false, 0, 2, uw1Var2, null, dd4Var3, 1573248, 805306368, 5767096);
                                un9.a(dd4Var3, tg9.h(lu6Var, 12.0f));
                                String str3 = (String) t83Var2.e.getValue();
                                uw1 uw1Var3 = ((q96) dd4Var3.j(ur9Var)).c.b;
                                ou6 ou6VarN02 = gjb.n0(tg9.f(lu6Var, 1.0f), 8.0f, 0.0f, 2);
                                boolean zF4 = dd4Var3.f(t83Var2);
                                Object objQ7 = dd4Var3.Q();
                                if (zF4 || objQ7 == obj3) {
                                    objQ7 = new ek6(t83Var2, 3);
                                    dd4Var3.p0(objQ7);
                                }
                                lx1.m(str3, (kb4) objQ7, ou6VarN02, false, false, null, fz1.l, null, null, null, false, null, null, null, false, 0, 0, uw1Var3, null, dd4Var3, 1573248, 0, 6291384);
                                xv5.z(dd4Var3, true, lu6Var, 12.0f, dd4Var3);
                            }
                            break;
                    }
                    return hebVar;
                }
            }, dd4Var), dd4Var, 1769856, 8072);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new fk6(t83Var, ac4Var, i);
        }
    }

    public static final ha6 g0(yb4 yb4Var, boolean z, lv lvVar, nv nvVar, dd4 dd4Var, int i) {
        yb4Var.getClass();
        int i2 = 0;
        int i3 = 1;
        boolean zF = ((((i & 7168) ^ 3072) > 2048 && dd4Var.f(nvVar)) || (i & 3072) == 2048) | dd4Var.f(yb4Var) | dd4Var.g(z);
        Object objQ = dd4Var.Q();
        if (zF || objQ == vl1.a) {
            gi4 gi4Var = new gi4(yb4Var, z, new ci4(nvVar, i2), nvVar.a(), new ci4(lvVar, i3), lvVar.a());
            dd4Var.p0(gi4Var);
            objQ = gi4Var;
        }
        return (ha6) objQ;
    }

    public static final void h(boolean z, kb4 kb4Var, dd4 dd4Var, int i) {
        kb4Var.getClass();
        dd4Var.h0(415981367);
        int i2 = 2;
        int i3 = (dd4Var.g(z) ? 4 : 2) | i | (dd4Var.h(kb4Var) ? 32 : 16);
        if (!dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            dd4Var.Y();
        } else if (xzb.a(dd4Var)) {
            dd4Var.f0(1520385415);
            i(z, kb4Var, dd4Var, i3 & Token.ELSE);
            dd4Var.q(false);
        } else {
            dd4Var.f0(1520522156);
            j(z, kb4Var, dd4Var, i3 & Token.ELSE);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new an6(i, i2, kb4Var, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h0(defpackage.ks4 r4, defpackage.kt1 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.vs8
            if (r0 == 0) goto L13
            r0 = r5
            vs8 r0 = (defpackage.vs8) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vs8 r0 = new vs8
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            ks4 r4 = r0.a
            defpackage.e11.e0(r5)
            goto L4b
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r5)
            boolean r5 = r4 instanceof defpackage.ws8
            if (r5 == 0) goto L36
            return r4
        L36:
            gv4 r5 = r4.d()
            ut0 r5 = r5.b()
            r0.a = r4
            r0.c = r2
            java.lang.Object r5 = defpackage.m79.Q(r5, r0)
            xx1 r0 = defpackage.xx1.a
            if (r5 != r0) goto L4b
            return r0
        L4b:
            jl9 r5 = (defpackage.jl9) r5
            r5.getClass()
            r0 = -1
            byte[] r5 = defpackage.qn9.t(r5, r0)
            ws8 r0 = new ws8
            is4 r1 = r4.a
            wu4 r2 = r4.c()
            gv4 r4 = r4.d()
            r0.<init>(r1, r2, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu1.h0(ks4, kt1):java.lang.Object");
    }

    public static final void i(boolean z, kb4 kb4Var, dd4 dd4Var, int i) {
        dd4Var.h0(294289373);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.h(kb4Var) ? 32 : 16);
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            fw.q(z, kb4Var, null, true, null, null, 0L, 0L, 0.0f, 0L, null, jf0.G(-547908863, new nl9(yib.e(dd4Var, 14), 28), dd4Var), dd4Var, (i2 & 14) | 3072 | (i2 & Token.ASSIGN_MOD), 48, 2036);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new an6(i, 4, kb4Var, z);
        }
    }

    public static void i0(int i, mg6 mg6Var, p84 p84Var, mg6 mg6Var2, mg6... mg6VarArr) {
        if (mg6Var2 == null) {
            mg6Var2 = new mg6(new kg6[0]);
        }
        if (mg6Var != null) {
            v45 v45VarI = a55.i();
            for (kg6 kg6Var : mg6Var.a) {
                if (ba6.class.isAssignableFrom(kg6Var.getClass())) {
                    v45VarI.b((kg6) ba6.class.cast(kg6Var));
                }
            }
            w45 w45VarListIterator = v45VarI.g().listIterator(0);
            while (w45VarListIterator.hasNext()) {
                ba6 ba6Var = (ba6) w45VarListIterator.next();
                if (!ba6Var.a.equals("com.android.capture.fps") || i == 2) {
                    mg6Var2 = mg6Var2.a(new kg6[]{ba6Var});
                }
            }
        }
        for (mg6 mg6Var3 : mg6VarArr) {
            mg6Var2 = mg6Var2.b(mg6Var3);
        }
        if (mg6Var2.a.length > 0) {
            p84Var.k = mg6Var2;
        }
    }

    public static final void j(boolean z, kb4 kb4Var, dd4 dd4Var, int i) {
        dd4Var.h0(-121592378);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.h(kb4Var) ? 32 : 16);
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            fw.r(z, kb4Var, null, true, 0L, 0L, 0.0f, 0L, 0.0f, jf0.G(-951751497, new ah(yib.e(dd4Var, 13), 28), dd4Var), dd4Var, (i2 & 14) | 805309440 | (i2 & Token.ASSIGN_MOD), 500);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new an6(i, 3, kb4Var, z);
        }
    }

    public static void j0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static final void k(String str, boolean z, boolean z2, uka ukaVar, ou6 ou6Var, ib4 ib4Var, dd4 dd4Var, int i) {
        uka ukaVar2;
        ou6 ou6Var2;
        int i2;
        uka ukaVar3;
        ou6 ou6Var3;
        long j;
        dd4Var.h0(-898784771);
        int i3 = i | (dd4Var.f(str) ? 4 : 2) | (dd4Var.g(z) ? 32 : 16) | (dd4Var.g(z2) ? 256 : Token.CASE) | 25600 | (dd4Var.h(ib4Var) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var.V(i3 & 1, (74899 & i3) != 74898)) {
            dd4Var.a0();
            if ((i & 1) == 0 || dd4Var.C()) {
                i2 = i3 & (-7169);
                ukaVar3 = ((q96) dd4Var.j(s96.a)).b.j;
                ou6Var3 = lu6.a;
            } else {
                dd4Var.Y();
                ou6Var3 = ou6Var;
                i2 = i3 & (-7169);
                ukaVar3 = ukaVar;
            }
            dd4Var.r();
            if (z2) {
                dd4Var.f0(-870736046);
                j = ((q96) dd4Var.j(s96.a)).a.b;
                dd4Var.q(false);
            } else {
                dd4Var.f0(-870679502);
                j = ((q96) dd4Var.j(s96.a)).a.q;
                dd4Var.q(false);
            }
            rj1 rj1VarG = jf0.G(-1811569332, new ap6(j, str, ukaVar3, an.b(z ? 180.0f : 0.0f, (ko) null, (String) null, dd4Var, 0, 30)), dd4Var);
            int i4 = i2 >> 3;
            ou6 ou6Var4 = ou6Var3;
            fz1.D(rj1VarG, z2, null, ou6Var4, ib4Var, dd4Var, (i4 & Token.ASSIGN_MOD) | 3078 | (i4 & 57344), 4);
            ukaVar2 = ukaVar3;
            ou6Var2 = ou6Var4;
        } else {
            dd4Var.Y();
            ukaVar2 = ukaVar;
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new sp0(str, z, z2, ukaVar2, ou6Var2, ib4Var, i);
        }
    }

    public static final j85 k0(File file) {
        file.getClass();
        return new j85(new FileInputStream(file), uua.d);
    }

    public static final void l(ou6 ou6Var, rj1 rj1Var, dd4 dd4Var, int i) {
        rj1 rj1Var2;
        dd4 dd4Var2;
        dd4Var.h0(1949207773);
        int i2 = i | 6;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = dk9.x((Object) null);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            q09 q09Var = (q09) a07Var.getValue();
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new hp8(a07Var, 3);
                dd4Var.p0(objQ2);
            }
            ou6 ou6Var2 = lu6.a;
            rj1Var2 = rj1Var;
            dd4Var2 = dd4Var;
            m(ou6Var2, q09Var, (kb4) objQ2, rj1Var2, dd4Var2, 3462);
            ou6Var = ou6Var2;
        } else {
            rj1Var2 = rj1Var;
            dd4Var2 = dd4Var;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new vu1(ou6Var, rj1Var2, i, 4);
        }
    }

    public static final j85 l0(InputStream inputStream) {
        inputStream.getClass();
        return new j85(inputStream, new uua());
    }

    public static final void m(ou6 ou6Var, q09 q09Var, kb4 kb4Var, rj1 rj1Var, dd4 dd4Var, int i) {
        int i2;
        dd4Var.h0(-917932944);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(ou6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(q09Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.h(kb4Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.h(rj1Var) ? 2048 : 1024;
        }
        if (dd4Var.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new wo8(27);
                dd4Var.p0(objQ);
            }
            r19 r19Var = (r19) ww1.d0(objArr, r19.l, (ib4) objQ, dd4Var, 384);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new o19(r19Var);
                dd4Var.p0(objQ2);
            }
            o19 o19Var = (o19) objQ2;
            ga1 ga1Var = (ga1) dd4Var.j(xm1.f);
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj) {
                objQ3 = lc5.Z(dd4Var);
                dd4Var.p0(objQ3);
            }
            vx1 vx1Var = (vx1) objQ3;
            o19Var.e = (jj4) dd4Var.j(xm1.l);
            boolean zF = dd4Var.f(vx1Var) | dd4Var.f(ga1Var);
            Object objQ4 = dd4Var.Q();
            if (zF || objQ4 == obj) {
                objQ4 = new q57(25, vx1Var, ga1Var);
                dd4Var.p0(objQ4);
            }
            o19Var.f = (kb4) objQ4;
            o19Var.d = new q57(26, o19Var, kb4Var);
            o19Var.l(q09Var);
            dd4Var.f0(-82280708);
            o19Var.w = su7.b(o09.b, (h36) null, dd4Var, 54);
            o19Var.v = vx1Var;
            dd4Var.q(false);
            o19Var.h();
            kw1 kw1Var = new kw1(2, o19Var, new t09(o19Var, 2));
            ou6 ou6VarX = lu6.a;
            int i3 = 6;
            ou6 ou6VarD0 = lc5.d0(r1a.b(kc5.y(md2.n0(jv3.B(kl8.a0(r1a.b(ou6VarX, heb.a, kw1Var), new v09(o19Var, 4)), o19Var.h), new v09(o19Var, 5)), true, null), 8675309, new t9(2, new v09(o19Var, 6))), new vo0(o19Var, 3));
            if (o19Var.e() != null && o19Var.g()) {
                q09 q09VarF = o19Var.f();
                if (!(q09VarF == null ? true : lc5.Q(q09VarF.a, q09VarF.b)) && q76.a()) {
                    ou6VarX = s32.X(ou6VarX, new rt6(o19Var, i3));
                }
            }
            wx1.B(ou6Var.e(fz1.O(ou6VarD0.e(ou6VarX), new w27(o19Var, i3))), jf0.G(-1799563674, new u09(o19Var, r19Var, rj1Var), dd4Var), dd4Var, 48);
            boolean zH = dd4Var.h(o19Var);
            Object objQ5 = dd4Var.Q();
            if (zH || objQ5 == obj) {
                objQ5 = new v09(o19Var, 0);
                dd4Var.p0(objQ5);
            }
            lc5.j(o19Var, (kb4) objQ5, dd4Var);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new o50(ou6Var, q09Var, kb4Var, rj1Var, i);
        }
    }

    public static boolean m0(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i = 0; i < bArr2.length; i++) {
                if (bArr[i] == bArr2[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public static final void n(bc9 bc9Var, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, kb4 kb4Var5, kb4 kb4Var6, dd4 dd4Var, int i) {
        int i2;
        kb4 kb4Var7;
        dd4Var.h0(1657658351);
        if ((i & 6) == 0) {
            i2 = (dd4Var.f(bc9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var.h(kb4Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var.h(kb4Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var.h(kb4Var3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            kb4Var7 = kb4Var4;
            i2 |= dd4Var.h(kb4Var7) ? 131072 : Parser.ARGC_LIMIT;
        } else {
            kb4Var7 = kb4Var4;
        }
        if ((1572864 & i) == 0) {
            i2 |= dd4Var.h(kb4Var5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= dd4Var.h(kb4Var6) ? 8388608 : 4194304;
        }
        if (dd4Var.V(i2 & 1, (4793491 & i2) != 4793490)) {
            ou6 ou6VarN0 = gjb.n0(h67.f0(kc5.Q(ou6Var, kc5.J(dd4Var), 14), null, 3), 16.0f, 0.0f, 2);
            ie1 ie1VarA = ge1.a(new mv(12.0f, true, new gp(5)), bv4.z, dd4Var, 6);
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
            un9.s(ll1.f, dd4Var, ie1VarA);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var, tg9.h(lu6Var, 4.0f));
            int i3 = 0;
            p(wn9.K((pv9) vu9.v0.getValue(), dd4Var), null, null, jf0.G(2018951462, new qz0(20, bc9Var, kb4Var), dd4Var), dd4Var, 3072, 6);
            boolean zD = dd4Var.d(bc9Var.b);
            Object objQ = dd4Var.Q();
            if (zD || objQ == vl1.a) {
                objQ = dk9.x(Float.valueOf(bc9Var.b));
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            p(wn9.K((pv9) vu9.m0.getValue(), dd4Var), null, jf0.G(31563672, new nb0(a07Var, 7), dd4Var), jf0.G(2109209231, new c41(bc9Var, a07Var, kb4Var2, 24), dd4Var), dd4Var, 3456, 2);
            p(wn9.K((pv9) vu9.u0.getValue(), dd4Var), null, null, jf0.G(452100974, new fp6(wm9.r((hv9) rv.v.getValue(), dd4Var), bc9Var, kb4Var3, i3), dd4Var), dd4Var, 3072, 6);
            p(wn9.K((pv9) vu9.q0.getValue(), dd4Var), null, null, jf0.G(-1205007283, new gp6(bc9Var, kb4Var7, kb4Var5, kb4Var6, 0), dd4Var), dd4Var, 3072, 6);
            xv5.A(lu6Var, 12.0f, dd4Var, true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xb1(bc9Var, ou6Var, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, kb4Var6, i);
        }
    }

    public static final int n0(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public static final void o(ou6 ou6Var, dd4 dd4Var, int i) {
        dd4Var.h0(522337261);
        final int i2 = 4;
        final int i3 = 2;
        int i4 = (dd4Var.f(ou6Var) ? 4 : 2) | i;
        final int i5 = 0;
        final int i6 = 1;
        if (dd4Var.V(i4 & 1, (i4 & 3) != 2)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final ec9 ec9Var = (ec9) ((qtb) qx1.N(ug8.a(ec9.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            bc9 bc9Var = (bc9) bx1.B(ec9Var.d, dd4Var).getValue();
            boolean zF = dd4Var.f(ec9Var);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (zF || objQ == obj) {
                objQ = new kb4() { // from class: ep6
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj2) {
                        int i7 = i6;
                        int i8 = 0;
                        int i9 = 1;
                        heb hebVar = heb.a;
                        jt1 jt1Var = null;
                        ec9 ec9Var2 = ec9Var;
                        switch (i7) {
                            case 0:
                                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                za1 za1VarA = vtb.a(ec9Var2);
                                aj2 aj2Var = rw2.a;
                                ec9Var2.g(za1VarA, nh2.c, new dc9(ec9Var2, zBooleanValue, jt1Var, i8));
                                break;
                            case 1:
                                int iIntValue = ((Integer) obj2).intValue();
                                za1 za1VarA2 = vtb.a(ec9Var2);
                                aj2 aj2Var2 = rw2.a;
                                ec9Var2.g(za1VarA2, nh2.c, new cc9(ec9Var2, iIntValue, jt1Var, i9));
                                break;
                            case 2:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                za1 za1VarA3 = vtb.a(ec9Var2);
                                aj2 aj2Var3 = rw2.a;
                                ec9Var2.g(za1VarA3, nh2.c, new cc9(ec9Var2, iIntValue2, jt1Var, i8));
                                break;
                            case 3:
                                int iIntValue3 = ((Integer) obj2).intValue();
                                za1 za1VarA4 = vtb.a(ec9Var2);
                                aj2 aj2Var4 = rw2.a;
                                ec9Var2.g(za1VarA4, nh2.c, new cc9(iIntValue3, ec9Var2, null));
                                break;
                            case 4:
                                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                                za1 za1VarA5 = vtb.a(ec9Var2);
                                aj2 aj2Var5 = rw2.a;
                                ec9Var2.g(za1VarA5, nh2.c, new dc9(ec9Var2, zBooleanValue2, jt1Var, i9));
                                break;
                            default:
                                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                                za1 za1VarA6 = vtb.a(ec9Var2);
                                aj2 aj2Var6 = rw2.a;
                                ec9Var2.g(za1VarA6, nh2.c, new dc9(ec9Var2, zBooleanValue3, jt1Var, 2));
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ);
            }
            kb4 kb4Var = (kb4) objQ;
            boolean zF2 = dd4Var.f(ec9Var);
            Object objQ2 = dd4Var.Q();
            if (zF2 || objQ2 == obj) {
                objQ2 = new kb4() { // from class: ep6
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj2) {
                        int i7 = i3;
                        int i8 = 0;
                        int i9 = 1;
                        heb hebVar = heb.a;
                        jt1 jt1Var = null;
                        ec9 ec9Var2 = ec9Var;
                        switch (i7) {
                            case 0:
                                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                za1 za1VarA = vtb.a(ec9Var2);
                                aj2 aj2Var = rw2.a;
                                ec9Var2.g(za1VarA, nh2.c, new dc9(ec9Var2, zBooleanValue, jt1Var, i8));
                                break;
                            case 1:
                                int iIntValue = ((Integer) obj2).intValue();
                                za1 za1VarA2 = vtb.a(ec9Var2);
                                aj2 aj2Var2 = rw2.a;
                                ec9Var2.g(za1VarA2, nh2.c, new cc9(ec9Var2, iIntValue, jt1Var, i9));
                                break;
                            case 2:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                za1 za1VarA3 = vtb.a(ec9Var2);
                                aj2 aj2Var3 = rw2.a;
                                ec9Var2.g(za1VarA3, nh2.c, new cc9(ec9Var2, iIntValue2, jt1Var, i8));
                                break;
                            case 3:
                                int iIntValue3 = ((Integer) obj2).intValue();
                                za1 za1VarA4 = vtb.a(ec9Var2);
                                aj2 aj2Var4 = rw2.a;
                                ec9Var2.g(za1VarA4, nh2.c, new cc9(iIntValue3, ec9Var2, null));
                                break;
                            case 4:
                                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                                za1 za1VarA5 = vtb.a(ec9Var2);
                                aj2 aj2Var5 = rw2.a;
                                ec9Var2.g(za1VarA5, nh2.c, new dc9(ec9Var2, zBooleanValue2, jt1Var, i9));
                                break;
                            default:
                                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                                za1 za1VarA6 = vtb.a(ec9Var2);
                                aj2 aj2Var6 = rw2.a;
                                ec9Var2.g(za1VarA6, nh2.c, new dc9(ec9Var2, zBooleanValue3, jt1Var, 2));
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ2);
            }
            kb4 kb4Var2 = (kb4) objQ2;
            boolean zF3 = dd4Var.f(ec9Var);
            Object objQ3 = dd4Var.Q();
            final int i7 = 3;
            if (zF3 || objQ3 == obj) {
                objQ3 = new kb4() { // from class: ep6
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj2) {
                        int i72 = i7;
                        int i8 = 0;
                        int i9 = 1;
                        heb hebVar = heb.a;
                        jt1 jt1Var = null;
                        ec9 ec9Var2 = ec9Var;
                        switch (i72) {
                            case 0:
                                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                za1 za1VarA = vtb.a(ec9Var2);
                                aj2 aj2Var = rw2.a;
                                ec9Var2.g(za1VarA, nh2.c, new dc9(ec9Var2, zBooleanValue, jt1Var, i8));
                                break;
                            case 1:
                                int iIntValue = ((Integer) obj2).intValue();
                                za1 za1VarA2 = vtb.a(ec9Var2);
                                aj2 aj2Var2 = rw2.a;
                                ec9Var2.g(za1VarA2, nh2.c, new cc9(ec9Var2, iIntValue, jt1Var, i9));
                                break;
                            case 2:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                za1 za1VarA3 = vtb.a(ec9Var2);
                                aj2 aj2Var3 = rw2.a;
                                ec9Var2.g(za1VarA3, nh2.c, new cc9(ec9Var2, iIntValue2, jt1Var, i8));
                                break;
                            case 3:
                                int iIntValue3 = ((Integer) obj2).intValue();
                                za1 za1VarA4 = vtb.a(ec9Var2);
                                aj2 aj2Var4 = rw2.a;
                                ec9Var2.g(za1VarA4, nh2.c, new cc9(iIntValue3, ec9Var2, null));
                                break;
                            case 4:
                                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                                za1 za1VarA5 = vtb.a(ec9Var2);
                                aj2 aj2Var5 = rw2.a;
                                ec9Var2.g(za1VarA5, nh2.c, new dc9(ec9Var2, zBooleanValue2, jt1Var, i9));
                                break;
                            default:
                                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                                za1 za1VarA6 = vtb.a(ec9Var2);
                                aj2 aj2Var6 = rw2.a;
                                ec9Var2.g(za1VarA6, nh2.c, new dc9(ec9Var2, zBooleanValue3, jt1Var, 2));
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ3);
            }
            kb4 kb4Var3 = (kb4) objQ3;
            boolean zF4 = dd4Var.f(ec9Var);
            Object objQ4 = dd4Var.Q();
            if (zF4 || objQ4 == obj) {
                objQ4 = new kb4() { // from class: ep6
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj2) {
                        int i72 = i2;
                        int i8 = 0;
                        int i9 = 1;
                        heb hebVar = heb.a;
                        jt1 jt1Var = null;
                        ec9 ec9Var2 = ec9Var;
                        switch (i72) {
                            case 0:
                                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                za1 za1VarA = vtb.a(ec9Var2);
                                aj2 aj2Var = rw2.a;
                                ec9Var2.g(za1VarA, nh2.c, new dc9(ec9Var2, zBooleanValue, jt1Var, i8));
                                break;
                            case 1:
                                int iIntValue = ((Integer) obj2).intValue();
                                za1 za1VarA2 = vtb.a(ec9Var2);
                                aj2 aj2Var2 = rw2.a;
                                ec9Var2.g(za1VarA2, nh2.c, new cc9(ec9Var2, iIntValue, jt1Var, i9));
                                break;
                            case 2:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                za1 za1VarA3 = vtb.a(ec9Var2);
                                aj2 aj2Var3 = rw2.a;
                                ec9Var2.g(za1VarA3, nh2.c, new cc9(ec9Var2, iIntValue2, jt1Var, i8));
                                break;
                            case 3:
                                int iIntValue3 = ((Integer) obj2).intValue();
                                za1 za1VarA4 = vtb.a(ec9Var2);
                                aj2 aj2Var4 = rw2.a;
                                ec9Var2.g(za1VarA4, nh2.c, new cc9(iIntValue3, ec9Var2, null));
                                break;
                            case 4:
                                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                                za1 za1VarA5 = vtb.a(ec9Var2);
                                aj2 aj2Var5 = rw2.a;
                                ec9Var2.g(za1VarA5, nh2.c, new dc9(ec9Var2, zBooleanValue2, jt1Var, i9));
                                break;
                            default:
                                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                                za1 za1VarA6 = vtb.a(ec9Var2);
                                aj2 aj2Var6 = rw2.a;
                                ec9Var2.g(za1VarA6, nh2.c, new dc9(ec9Var2, zBooleanValue3, jt1Var, 2));
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ4);
            }
            kb4 kb4Var4 = (kb4) objQ4;
            boolean zF5 = dd4Var.f(ec9Var);
            Object objQ5 = dd4Var.Q();
            if (zF5 || objQ5 == obj) {
                final int i8 = 5;
                objQ5 = new kb4() { // from class: ep6
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj2) {
                        int i72 = i8;
                        int i82 = 0;
                        int i9 = 1;
                        heb hebVar = heb.a;
                        jt1 jt1Var = null;
                        ec9 ec9Var2 = ec9Var;
                        switch (i72) {
                            case 0:
                                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                za1 za1VarA = vtb.a(ec9Var2);
                                aj2 aj2Var = rw2.a;
                                ec9Var2.g(za1VarA, nh2.c, new dc9(ec9Var2, zBooleanValue, jt1Var, i82));
                                break;
                            case 1:
                                int iIntValue = ((Integer) obj2).intValue();
                                za1 za1VarA2 = vtb.a(ec9Var2);
                                aj2 aj2Var2 = rw2.a;
                                ec9Var2.g(za1VarA2, nh2.c, new cc9(ec9Var2, iIntValue, jt1Var, i9));
                                break;
                            case 2:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                za1 za1VarA3 = vtb.a(ec9Var2);
                                aj2 aj2Var3 = rw2.a;
                                ec9Var2.g(za1VarA3, nh2.c, new cc9(ec9Var2, iIntValue2, jt1Var, i82));
                                break;
                            case 3:
                                int iIntValue3 = ((Integer) obj2).intValue();
                                za1 za1VarA4 = vtb.a(ec9Var2);
                                aj2 aj2Var4 = rw2.a;
                                ec9Var2.g(za1VarA4, nh2.c, new cc9(iIntValue3, ec9Var2, null));
                                break;
                            case 4:
                                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                                za1 za1VarA5 = vtb.a(ec9Var2);
                                aj2 aj2Var5 = rw2.a;
                                ec9Var2.g(za1VarA5, nh2.c, new dc9(ec9Var2, zBooleanValue2, jt1Var, i9));
                                break;
                            default:
                                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                                za1 za1VarA6 = vtb.a(ec9Var2);
                                aj2 aj2Var6 = rw2.a;
                                ec9Var2.g(za1VarA6, nh2.c, new dc9(ec9Var2, zBooleanValue3, jt1Var, 2));
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ5);
            }
            kb4 kb4Var5 = (kb4) objQ5;
            boolean zF6 = dd4Var.f(ec9Var);
            Object objQ6 = dd4Var.Q();
            if (zF6 || objQ6 == obj) {
                objQ6 = new kb4() { // from class: ep6
                    @Override // defpackage.kb4
                    public final Object invoke(Object obj2) {
                        int i72 = i5;
                        int i82 = 0;
                        int i9 = 1;
                        heb hebVar = heb.a;
                        jt1 jt1Var = null;
                        ec9 ec9Var2 = ec9Var;
                        switch (i72) {
                            case 0:
                                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                za1 za1VarA = vtb.a(ec9Var2);
                                aj2 aj2Var = rw2.a;
                                ec9Var2.g(za1VarA, nh2.c, new dc9(ec9Var2, zBooleanValue, jt1Var, i82));
                                break;
                            case 1:
                                int iIntValue = ((Integer) obj2).intValue();
                                za1 za1VarA2 = vtb.a(ec9Var2);
                                aj2 aj2Var2 = rw2.a;
                                ec9Var2.g(za1VarA2, nh2.c, new cc9(ec9Var2, iIntValue, jt1Var, i9));
                                break;
                            case 2:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                za1 za1VarA3 = vtb.a(ec9Var2);
                                aj2 aj2Var3 = rw2.a;
                                ec9Var2.g(za1VarA3, nh2.c, new cc9(ec9Var2, iIntValue2, jt1Var, i82));
                                break;
                            case 3:
                                int iIntValue3 = ((Integer) obj2).intValue();
                                za1 za1VarA4 = vtb.a(ec9Var2);
                                aj2 aj2Var4 = rw2.a;
                                ec9Var2.g(za1VarA4, nh2.c, new cc9(iIntValue3, ec9Var2, null));
                                break;
                            case 4:
                                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                                za1 za1VarA5 = vtb.a(ec9Var2);
                                aj2 aj2Var5 = rw2.a;
                                ec9Var2.g(za1VarA5, nh2.c, new dc9(ec9Var2, zBooleanValue2, jt1Var, i9));
                                break;
                            default:
                                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                                za1 za1VarA6 = vtb.a(ec9Var2);
                                aj2 aj2Var6 = rw2.a;
                                ec9Var2.g(za1VarA6, nh2.c, new dc9(ec9Var2, zBooleanValue3, jt1Var, 2));
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ6);
            }
            n(bc9Var, ou6Var, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, (kb4) objQ6, dd4Var, (i4 << 3) & Token.ASSIGN_MOD);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var, i, 18);
        }
    }

    public static int o0(zs2 zs2Var, au8 au8Var) {
        if (zs2Var instanceof ws2) {
            return ((ws2) zs2Var).a;
        }
        int iOrdinal = au8Var.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        mn5.g();
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(java.lang.String r33, ou6 r34, defpackage.zb4 r35, defpackage.rj1 r36, dd4 r37, int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu1.p(java.lang.String, ou6, zb4, rj1, dd4, int, int):void");
    }

    public static final String p0(long j) {
        StringBuilder sb = new StringBuilder();
        int i = fa5.c;
        sb.append((int) (j >> 32));
        sb.append('x');
        sb.append((int) (j & 4294967295L));
        return sb.toString();
    }

    public static final ExtractedText q(wga wgaVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = wgaVar.a.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = wgaVar.b;
        extractedText.selectionStart = pja.g(j);
        extractedText.selectionEnd = pja.f(j);
        extractedText.flags = !bw9.P(wgaVar.a.b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final String q0(m39 m39Var) {
        return fc1.D0(wx1.s0(0, m39Var.f()), ", ", m39Var.a() + '(', ")", new zs5(m39Var, 29), 24);
    }

    public static final he8 r(ag9 ag9Var) {
        ag9Var.getClass();
        return new he8(ag9Var);
    }

    public static final void r0(xu4 xu4Var, String str) {
        xu4Var.getClass();
        xu4Var.c.A("User-Agent", str);
    }

    public static final ie8 s(il9 il9Var) {
        il9Var.getClass();
        return new ie8(il9Var);
    }

    public static final int s0(nt5 nt5Var) {
        List list = nt5Var.k;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((ot5) list.get(i2)).q;
        }
        return (i / list.size()) + nt5Var.r;
    }

    public static int t(int i) {
        if (i < 3) {
            t1c.N(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(((double) i) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static final int u(long j, long j2) {
        boolean zS = S(j);
        if (zS != S(j2)) {
            return zS ? -1 : 1;
        }
        return (Math.min(L(j), L(j2)) >= 0.0f && R(j) != R(j2)) ? R(j) ? -1 : 1 : (int) Math.signum(L(j) - L(j2));
    }

    public static final long v(int i, int i2, eg9 eg9Var, au8 au8Var, eg9 eg9Var2) {
        int i3;
        int i4;
        if (!lc5.Q(eg9Var, eg9.c)) {
            i = o0(eg9Var.a, au8Var);
            i2 = o0(eg9Var.b, au8Var);
        }
        ws2 ws2Var = eg9Var2.a;
        ws2 ws2Var2 = eg9Var2.b;
        if ((ws2Var instanceof ws2) && i != Integer.MIN_VALUE && i != Integer.MAX_VALUE && i > (i4 = ws2Var.a)) {
            i = i4;
        }
        if ((ws2Var2 instanceof ws2) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i3 = ws2Var2.a)) {
            i2 = i3;
        }
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final double w(int i, int i2, int i3, int i4, au8 au8Var, eg9 eg9Var) {
        double dMax;
        double d = i;
        double d2 = ((double) i3) / d;
        double d3 = i2;
        double d4 = ((double) i4) / d3;
        int iOrdinal = au8Var.ordinal();
        if (iOrdinal == 0) {
            dMax = Math.max(d2, d4);
        } else {
            if (iOrdinal != 1) {
                mn5.g();
                return 0.0d;
            }
            dMax = Math.min(d2, d4);
        }
        ws2 ws2Var = eg9Var.a;
        if (ws2Var instanceof ws2) {
            double d5 = ((double) ws2Var.a) / d;
            if (dMax > d5) {
                dMax = d5;
            }
        }
        ws2 ws2Var2 = eg9Var.b;
        if (ws2Var2 instanceof ws2) {
            double d6 = ((double) ws2Var2.a) / d3;
            if (dMax > d6) {
                return d6;
            }
        }
        return dMax;
    }

    public static final Long x(fu4 fu4Var) {
        fu4Var.getClass();
        String strC = fu4Var.a().c("Content-Length");
        if (strC != null) {
            return iw9.N(strC);
        }
        return null;
    }

    public static final as1 y(fu4 fu4Var) {
        fu4Var.getClass();
        String strC = fu4Var.a().c("Content-Type");
        if (strC == null) {
            return null;
        }
        as1 as1Var = as1.e;
        return m79.K(strC);
    }

    public static final as1 z(xu4 xu4Var) {
        xu4Var.getClass();
        String strP = xu4Var.c.p("Content-Type");
        if (strP == null) {
            return null;
        }
        as1 as1Var = as1.e;
        return m79.K(strP);
    }
}

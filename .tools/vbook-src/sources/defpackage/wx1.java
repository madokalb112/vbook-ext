package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class wx1 {
    public static final void A(String str, List list, List list2, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, kb4 kb4Var4, kb4 kb4Var5, dd4 dd4Var, int i) {
        dd4Var.h0(-1629771070);
        int i2 = i | (dd4Var.f(str) ? 4 : 2) | (dd4Var.h(list) ? 32 : 16) | (dd4Var.h(list2) ? 256 : Token.CASE) | (dd4Var.f(ou6Var) ? 2048 : 1024) | (dd4Var.h(kb4Var) ? 16384 : 8192) | (dd4Var.h(kb4Var2) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var.V(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean zH = ((i2 & 14) == 4) | dd4Var.h(list2) | ((458752 & i2) == 131072) | dd4Var.h(list) | ((57344 & i2) == 16384);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                bq2 bq2Var = new bq2(str, list2, list, kb4Var2, kb4Var3, kb4Var4, kb4Var);
                dd4Var.p0(bq2Var);
                objQ = bq2Var;
            }
            rw1.j(ou6Var, null, null, false, null, null, null, false, null, (kb4) objQ, dd4Var, (i2 >> 9) & 14, 510);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new l85(str, list, list2, ou6Var, kb4Var, kb4Var2, kb4Var3, kb4Var4, kb4Var5, i, 0);
        }
    }

    public static final void B(ou6 ou6Var, rj1 rj1Var, dd4 dd4Var, int i) {
        dd4Var.h0(-1854833411);
        int i2 = (dd4Var.f(ou6Var) ? 4 : 2) | i;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            Object objQ = dd4Var.Q();
            if (objQ == vl1.a) {
                objQ = ef.k;
                dd4Var.p0(objQ);
            }
            ha6 ha6Var = (ha6) objQ;
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
            un9.s(ll1.f, dd4Var, ha6Var);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL0);
            rj1Var.invoke(dd4Var, 6);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new vu1(ou6Var, rj1Var, i, 5);
        }
    }

    public static final void C(String str, ou6 ou6Var, dd4 dd4Var, int i) {
        ou6 ou6Var2;
        dd4Var.h0(1417842467);
        int i2 = i | (dd4Var.f(str) ? 4 : 2) | 48;
        if (dd4Var.V(i2 & 1, (i2 & 19) != 18)) {
            long jB = dd1.b(s00.o(dd4Var).h, dd4Var);
            uka ukaVar = s00.q(dd4Var).l;
            long jG = dd1.g(s00.o(dd4Var), 6.0f);
            uw1 uw1Var = s00.p(dd4Var).a;
            ou6 ou6Var3 = lu6.a;
            nha.c(str, gjb.m0(fw.G(fe.L(ou6Var3, jG, uw1Var), 1.0f, lc1.c(0.1f, s00.o(dd4Var).q), s00.p(dd4Var).a), 6.0f, 1.0f), jB, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, ukaVar, dd4Var, i2 & 14, 24576, 114680);
            ou6Var2 = ou6Var3;
        } else {
            dd4Var.Y();
            ou6Var2 = ou6Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new b7(str, ou6Var2, i, 10);
        }
    }

    public static final void D(v78 v78Var, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i) {
        int i2;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(501286755);
        int i3 = i | (dd4Var2.h(v78Var) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE) | (dd4Var2.h(ib4Var2) ? 2048 : 1024);
        if (dd4Var2.V(i3 & 1, (i3 & 1171) != 1170)) {
            ou6 ou6VarW = t96.w(ou6Var, s00.p(dd4Var2).b);
            long jG = dd1.g(s00.o(dd4Var2), 1.0f);
            lp4 lp4Var = jf0.G;
            ou6 ou6VarM0 = gjb.m0(fw.J(null, ib4Var, fw.G(fe.L(ou6VarW, jG, lp4Var), 1.0f, dd1.g(s00.o(dd4Var2), 4.0f), s00.p(dd4Var2).b), false, 15), 12.0f, 8.0f);
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
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            bp5 bp5Var = new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            eq8 eq8VarA2 = dq8.a(ivVar, wf0Var, dd4Var2, 48);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, bp5Var);
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var);
            } else {
                dd4Var2.s0();
            }
            un9.s(jmVar, dd4Var2, eq8VarA2);
            un9.s(jmVar2, dd4Var2, lr7VarL3);
            ky0.v(iHashCode3, dd4Var2, jmVar3, dd4Var2, kdVar);
            un9.s(jmVar4, dd4Var2, ou6VarL03);
            String str = v78Var.a;
            uka ukaVar = s00.q(dd4Var2).j;
            long j = s00.o(dd4Var2).q;
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            nha.c(str, kf0.v(new bp5(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, false)), j, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, ukaVar, dd4Var, 0, 24576, 114680);
            un9.a(dd4Var, tg9.r(lu6Var, 8.0f));
            int i4 = v78Var.b;
            C(i4 != 0 ? i4 != 1 ? i4 != 2 ? "" : "ORG" : "LOC" : "PER", null, dd4Var, 0);
            un9.a(dd4Var, tg9.r(lu6Var, 8.0f));
            C(String.valueOf(v78Var.c), null, dd4Var, 0);
            dd4Var.q(true);
            un9.a(dd4Var, tg9.r(lu6Var, 8.0f));
            p35 p35VarC = i25.c((m53) a53.H.getValue(), dd4Var, 0);
            long j2 = s00.o(dd4Var).w;
            ou6 ou6VarH = ky0.h(dd4Var, 2.0f, t96.w(tg9.n(lu6Var, 32.0f), tp8.a), lp4Var);
            boolean z = (i3 & 7168) == 2048;
            Object objQ = dd4Var.Q();
            if (z || objQ == vl1.a) {
                i2 = 15;
                objQ = new pm6(15, ib4Var2);
                dd4Var.p0(objQ);
            } else {
                i2 = 15;
            }
            mx4.a(p35VarC, (String) null, gjb.l0(fw.J(null, (ib4) objQ, ou6VarH, false, i2), 6.0f), j2, dd4Var, 48, 0);
            dd4Var.q(true);
            String str2 = v78Var.d;
            nha.c(str2 == null ? "" : str2, tg9.f(lu6Var, 1.0f), s00.o(dd4Var).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).j, dd4Var, 48, 0, 131064);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ev0(v78Var, ou6Var, ib4Var, ib4Var2, i, 29);
        }
    }

    public static final View E(nu6 nu6Var) {
        htb htbVar = vw1.S(nu6Var.a).B;
        View interopView = htbVar != null ? htbVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        gp.j("Could not fetch interop view");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [jm1] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [yd5] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v6, types: [za5] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(defpackage.ava r18, android.content.Context r19, ju r20, defpackage.zua r21, um1 r22, defpackage.kt1 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx1.F(ava, android.content.Context, ju, zua, um1, kt1):java.lang.Object");
    }

    public static final String G(Object[] objArr, int i, int i2, l2 l2Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == l2Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final Bitmap H(Image image) {
        Image.Plane[] planes = image.getPlanes();
        planes.getClass();
        Image.Plane plane = planes[0];
        int height = image.getHeight() * image.getWidth();
        int[] iArr = new int[height];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i = 0; i < height; i++) {
            int i2 = iArr[i];
            iArr[i] = ah1.X(ah1.k(i2 & 255, (i2 >> 8) & 255, (i2 >> 16) & 255, (i2 >> 24) & 255));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }

    public static final void I(md2 md2Var) {
        md2Var.getClass();
        if ((md2Var instanceof ot9 ? (ot9) md2Var : null) != null) {
            return;
        }
        mn5.j(ug8.a(md2Var.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    public static final if5 J(yd2 yd2Var) {
        yd2Var.getClass();
        if5 if5Var = yd2Var instanceof if5 ? (if5) yd2Var : null;
        if (if5Var != null) {
            return if5Var;
        }
        mn5.j(ug8.a(yd2Var.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static final void K(vx1 vx1Var, CancellationException cancellationException) {
        yd5 yd5Var = (yd5) vx1Var.q().get(s00.s);
        if (yd5Var != null) {
            yd5Var.cancel(cancellationException);
        } else {
            mn5.n(vx1Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static void L() throws ef4 {
        StringBuilder sb = new StringBuilder();
        t1c.N(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        boolean z = false;
        int i = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            Integer numValueOf = Integer.valueOf(iGlGetError);
            int i2 = i + 1;
            int iE = r45.e(objArrCopyOf.length, i2);
            if (iE > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iE);
            }
            objArrCopyOf[i] = numValueOf;
            z = true;
            i = i2;
        }
        if (z) {
            throw new ef4(sb.toString(), a55.h(i, objArrCopyOf));
        }
    }

    public static void M(String str, boolean z) throws ef4 {
        if (z) {
            return;
        }
        w45 w45Var = a55.b;
        throw new ef4(str, hh8.e);
    }

    public static int N(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static double O(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float P(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int Q(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long R(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        gp.l(dx1.j(j39.o(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j2, '.'));
        return 0L;
    }

    public static Comparable S(Float f, bb1 bb1Var) {
        bb1Var.getClass();
        float f2 = bb1Var.b;
        float f3 = bb1Var.a;
        if (f3 <= f2) {
            return (!bb1.a(f, Float.valueOf(f3)) || bb1.a(Float.valueOf(f3), f)) ? (!bb1.a(Float.valueOf(f2), f) || bb1.a(f, Float.valueOf(f2))) ? f : Float.valueOf(f2) : Float.valueOf(f3);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + bb1Var + '.');
    }

    public static final int T(cr8 cr8Var, String str) {
        cr8Var.getClass();
        int columnCount = cr8Var.getColumnCount();
        int i = 0;
        while (true) {
            if (i >= columnCount) {
                i = -1;
                break;
            }
            if (str.equals(cr8Var.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        String strI = j39.i('`', "`", str);
        int columnCount2 = cr8Var.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount2) {
                i2 = -1;
                break;
            }
            if (strI.equals(cr8Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = cr8Var.getColumnCount();
            String strConcat = ".".concat(str);
            String strI2 = j39.i('`', ".", str);
            for (int i3 = 0; i3 < columnCount3; i3++) {
                String columnName = cr8Var.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (iw9.C(columnName, strConcat, false) || (columnName.charAt(0) == '`' && iw9.C(columnName, strI2, false)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static int U(gg8 gg8Var, y93 y93Var, View view, View view2, xf8 xf8Var, boolean z) {
        if (xf8Var.u() == 0 || gg8Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(xf8.E(view) - xf8.E(view2)) + 1;
        }
        return Math.min(y93Var.n(), y93Var.d(view2) - y93Var.g(view));
    }

    public static int V(gg8 gg8Var, y93 y93Var, View view, View view2, xf8 xf8Var, boolean z, boolean z2) {
        if (xf8Var.u() == 0 || gg8Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (gg8Var.b() - Math.max(xf8.E(view), xf8.E(view2))) - 1) : Math.max(0, Math.min(xf8.E(view), xf8.E(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(y93Var.d(view2) - y93Var.g(view)) / (Math.abs(xf8.E(view) - xf8.E(view2)) + 1))) + (y93Var.m() - y93Var.g(view)));
        }
        return iMax;
    }

    public static int W(gg8 gg8Var, y93 y93Var, View view, View view2, xf8 xf8Var, boolean z) {
        if (xf8Var.u() == 0 || gg8Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return gg8Var.b();
        }
        return (int) (((y93Var.d(view2) - y93Var.g(view)) / (Math.abs(xf8.E(view) - xf8.E(view2)) + 1)) * gg8Var.b());
    }

    public static long[] X(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i = (int) length;
        fx1.E("the total number of elements (%s) in the arrays must fit in an int", length, length == ((long) i));
        long[] jArr3 = new long[i];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static a07 Y() {
        return new cn7(heb.a, s00.t);
    }

    public static final void a(bp0 bp0Var, ou6 ou6Var, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, int i) {
        ib4 ib4Var3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-856387036);
        int i2 = i | (dd4Var2.f(bp0Var) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE) | (dd4Var2.h(ib4Var2) ? 2048 : 1024);
        if (dd4Var2.V(i2 & 1, (i2 & 1171) != 1170)) {
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
            bp5 bp5Var = new bp5(1.0f, true);
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
            String str = bp0Var.a;
            ur9 ur9Var = s96.a;
            uka ukaVar = ((q96) dd4Var2.j(ur9Var)).b.k;
            long j = ((q96) dd4Var2.j(ur9Var)).a.q;
            lu6 lu6Var = lu6.a;
            nha.c(str, tg9.f(lu6Var, 1.0f), j, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 2, 0, (kb4) null, ukaVar, dd4Var, 48, 24960, 110584);
            un9.a(dd4Var, tg9.h(lu6Var, 8.0f));
            nha.c(bp0Var.b, tg9.f(lu6Var, 1.0f), ((q96) dd4Var.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 2, false, 1, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.l, dd4Var, 48, 24960, 110584);
            dd4Var2 = dd4Var;
            ky0.A(dd4Var2, true, lu6Var, 8.0f, dd4Var2);
            p35 p35VarC = i25.c((m53) a53.g.getValue(), dd4Var2, 0);
            d6a d6aVar = iu9.Q;
            String strK = wn9.K((pv9) d6aVar.getValue(), dd4Var2);
            ou6 ou6VarN = tg9.n(lu6Var, 24.0f);
            boolean z = (i2 & 896) == 256;
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z || objQ == obj) {
                objQ = new i35(5, ib4Var);
                dd4Var2.p0(objQ);
            }
            mx4.a(p35VarC, strK, fw.J(null, (ib4) objQ, ou6VarN, false, 15), 0L, dd4Var2, 0, 8);
            un9.a(dd4Var2, tg9.r(lu6Var, 12.0f));
            p35 p35VarC2 = i25.c((m53) a53.H.getValue(), dd4Var2, 0);
            String strK2 = wn9.K((pv9) d6aVar.getValue(), dd4Var2);
            ou6 ou6VarN2 = tg9.n(lu6Var, 24.0f);
            boolean z2 = (i2 & 7168) == 2048;
            Object objQ2 = dd4Var2.Q();
            if (z2 || objQ2 == obj) {
                ib4Var3 = ib4Var2;
                objQ2 = new i35(6, ib4Var3);
                dd4Var2.p0(objQ2);
            } else {
                ib4Var3 = ib4Var2;
            }
            mx4.a(p35VarC2, strK2, gjb.l0(fw.J(null, (ib4) objQ2, ou6VarN2, false, 15), 2.0f), 0L, dd4Var2, 0, 8);
            dd4Var2.q(true);
        } else {
            ib4Var3 = ib4Var2;
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ev0(bp0Var, ou6Var, ib4Var, ib4Var3, i, 20);
        }
    }

    public static final Object a0(yb4 yb4Var, jt1 jt1Var) {
        fv8 fv8Var = new fv8(jt1Var, jt1Var.getContext());
        return hn9.u(fv8Var, true, fv8Var, yb4Var);
    }

    public static final iw0 b(jx1 jx1Var) {
        if (jx1Var.get(s00.s) == null) {
            jx1Var = jx1Var.plus(qx1.d());
        }
        return new iw0(jx1Var);
    }

    public static x08 b0(q43 q43Var, List list, vx1 vx1Var, ib4 ib4Var) {
        list.getClass();
        zw3 zw3Var = new zw3(g83.v, new se3(18), new or6(13, ib4Var));
        if (q43Var == null) {
            q43Var = new bv4(29);
        }
        return new x08(new x08(new a52(zw3Var, gc1.Y(new et1(list, null, 5)), q43Var, vx1Var)));
    }

    public static final void c(int i) {
        if (i > 0) {
            return;
        }
        gp.l("px must be > 0.");
    }

    public static FloatBuffer c0(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static final void d(List list, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, dd4 dd4Var, int i) {
        dd4Var.h0(942917255);
        int i2 = i | (dd4Var.h(list) ? 4 : 2) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(kb4Var3) ? 16384 : 8192);
        if (dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            a07 a07VarA = dk9.A(kb4Var, dd4Var);
            a07 a07VarA2 = dk9.A(kb4Var2, dd4Var);
            a07 a07VarA3 = dk9.A(kb4Var3, dd4Var);
            boolean zH = dd4Var.h(list) | dd4Var.f(a07VarA) | dd4Var.f(a07VarA2) | dd4Var.f(a07VarA3);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                um umVar = new um(list, a07VarA, a07VarA2, a07VarA3, 17);
                dd4Var.p0(umVar);
                objQ = umVar;
            }
            rw1.j(ou6Var, null, null, false, null, null, null, false, null, (kb4) objQ, dd4Var, 6, 510);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uj0((Object) list, ou6Var, kb4Var, kb4Var2, (ub4) kb4Var3, i, 12);
        }
    }

    public static hj9 d0(zk7 zk7Var, sk7 sk7Var, od2 od2Var, kp9 kp9Var, dd4 dd4Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            sk7Var = new tk7();
        }
        if ((i2 & 4) != 0) {
            od2Var = fp9.a(dd4Var);
        }
        boolean z = true;
        if ((i2 & 8) != 0) {
            kf8 kf8Var = wub.a;
            kp9Var = ah1.W(0.0f, 400.0f, 1, Float.valueOf(1.0f));
        }
        pn2 pn2Var = (pn2) dd4Var.j(xm1.h);
        zm5 zm5Var = (zm5) dd4Var.j(xm1.n);
        boolean zF = ((((i & 14) ^ 6) > 4 && dd4Var.f(zk7Var)) || (i & 6) == 4) | dd4Var.f(od2Var) | dd4Var.f(kp9Var);
        if ((((i & Token.ASSIGN_MOD) ^ 48) <= 32 || !dd4Var.f(sk7Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean zF2 = zF | z | dd4Var.f(pn2Var) | dd4Var.d(zm5Var.ordinal());
        Object objQ = dd4Var.Q();
        if (zF2 || objQ == vl1.a) {
            hj9 hj9Var = new hj9(new be5(9, zk7Var, new qz0(25, zk7Var, zm5Var), sk7Var), od2Var, kp9Var);
            dd4Var.p0(hj9Var);
            objQ = hj9Var;
        }
        return (hj9) objQ;
    }

    public static final void e(b24 b24Var, cx5 cx5Var, zb4 zb4Var, dd4 dd4Var, int i) {
        b24 b24Var2;
        zb4 zb4Var2;
        Object hl2Var;
        b24Var.getClass();
        zb4Var.getClass();
        dd4Var.h0(1098310001);
        int i2 = (dd4Var.h(b24Var) ? 4 : 2) | i | 48 | (dd4Var.h(zb4Var) ? 256 : Token.CASE);
        if (dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            mx5 mx5Var = (mx5) dd4Var.j(r26.a);
            px5 px5VarI = mx5Var.i();
            boolean zH = dd4Var.h(mx5Var) | dd4Var.h(b24Var) | dd4Var.h(zb4Var);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                b24Var2 = b24Var;
                zb4Var2 = zb4Var;
                hl2Var = new hl2(mx5Var, b24Var2, zb4Var2, null, 11);
                dd4Var.p0(hl2Var);
            } else {
                zb4Var2 = zb4Var;
                hl2Var = objQ;
                b24Var2 = b24Var;
            }
            lc5.w(b24Var2, zb4Var2, px5VarI, (yb4) hl2Var, dd4Var);
            cx5Var = cx5.d;
        } else {
            b24Var2 = b24Var;
            zb4Var2 = zb4Var;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new mt(b24Var2, cx5Var, zb4Var2, i, 13);
        }
    }

    public static final void f(boolean z, boolean z2, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i) {
        Object obj;
        boolean z3;
        kb4 kb4Var3;
        boolean z4 = z;
        dd4 dd4Var2 = dd4Var;
        wf0 wf0Var = bv4.x;
        dd4Var2.h0(-1279265141);
        int i2 = i | (dd4Var2.g(z4) ? 4 : 2) | (dd4Var2.g(z2) ? 32 : 16) | (dd4Var2.f(ou6Var) ? 256 : Token.CASE) | (dd4Var2.h(kb4Var) ? 2048 : 1024) | (dd4Var2.h(kb4Var2) ? 16384 : 8192);
        if (dd4Var2.V(i2 & 1, (i2 & 9363) != 9362)) {
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
            dd4Var2.f0(1882286183);
            List listR = wm9.r((hv9) rv.d.getValue(), dd4Var2);
            int size = listR.size();
            int i3 = 0;
            while (true) {
                obj = vl1.a;
                if (i3 >= size) {
                    break;
                }
                String str = (String) listR.get(i3);
                boolean z5 = z4 == (i3 == 1);
                ur9 ur9Var = s96.a;
                ou6 ou6VarZ = qx1.z(fe.L(lu6Var, dd1.g(((q96) dd4Var2.j(ur9Var)).a, 1.0f), jf0.G), z5, new pk1(19), dd4Var2, 0);
                boolean zD = ((i2 & 7168) == 2048) | dd4Var2.d(i3);
                Object objQ = dd4Var2.Q();
                if (zD || objQ == obj) {
                    objQ = new bk0(kb4Var, i3, 3);
                    dd4Var2.p0(objQ);
                }
                ou6 ou6VarJ = fw.J(null, (ib4) objQ, ou6VarZ, false, 15);
                ha6 ha6VarD = pn0.d(bv4.b, false);
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
                i3++;
                z4 = z;
                dd4Var2 = dd4Var3;
            }
            dd4 dd4Var4 = dd4Var2;
            dd4Var4.q(false);
            dd4Var4.q(true);
            un9.a(dd4Var4, new bp5(1.0f, true));
            boolean z6 = ((i2 & Token.ASSIGN_MOD) == 32) | ((57344 & i2) == 16384);
            Object objQ2 = dd4Var4.Q();
            if (z6 || objQ2 == obj) {
                z3 = z2;
                kb4Var3 = kb4Var2;
                objQ2 = new ck0(5, kb4Var3, z3);
                dd4Var4.p0(objQ2);
            } else {
                z3 = z2;
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
            vo1.e(z3, kb4Var3, null, false, null, dd4Var2, ((i2 >> 3) & 14) | ((i2 >> 9) & Token.ASSIGN_MOD));
            dd4Var2.q(true);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tj0(z, z2, ou6Var, kb4Var, kb4Var2, i, 1);
        }
    }

    public static final long f0(z63 z63Var, g73 g73Var) {
        g73Var.getClass();
        kb4 kb4Var = z63Var.j;
        HashMap map = z63Var.k;
        zj4 zj4VarE = (zj4) map.get(g73Var);
        if (zj4VarE == null) {
            zj4VarE = (g73Var.l == id1.d ? p7c.d : p7c.c).e(z63Var, g73Var);
            if (map.size() > 4) {
                map.clear();
            }
            map.put(g73Var, zj4VarE);
        }
        int iQ = zj4VarE.a;
        Double d = kb4Var != null ? (Double) kb4Var.invoke(g73Var) : null;
        if (kb4Var != null && d != null) {
            iQ = (iQ & 16777215) | (Q((int) Math.rint(d.doubleValue() * 255.0d), 0, 255) << 24);
        }
        return ah1.j(iQ);
    }

    public static final void g(xm3 xm3Var, ou6 ou6Var, ib4 ib4Var, kb4 kb4Var, ib4 ib4Var2, dd4 dd4Var, int i) {
        kb4 kb4Var2;
        vf0 vf0Var;
        Object obj;
        dd4 dd4Var2;
        boolean z;
        boolean z2;
        Object obj2;
        dd4 dd4Var3 = dd4Var;
        vf0 vf0Var2 = bv4.A;
        dd4Var3.h0(1747847423);
        int i2 = i | (dd4Var3.h(xm3Var) ? 4 : 2) | (dd4Var3.f(ou6Var) ? 32 : 16) | (dd4Var3.h(ib4Var) ? 256 : Token.CASE) | (dd4Var3.h(kb4Var) ? 2048 : 1024) | (dd4Var3.h(ib4Var2) ? 16384 : 8192);
        if (dd4Var3.V(i2 & 1, (i2 & 9363) != 9362)) {
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var3, 0);
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
            un9.s(jmVar, dd4Var3, ie1VarA);
            jm jmVar2 = ll1.e;
            un9.s(jmVar2, dd4Var3, lr7VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            jm jmVar3 = ll1.g;
            un9.s(jmVar3, dd4Var3, numValueOf);
            kd kdVar = ll1.h;
            un9.r(dd4Var3, kdVar);
            jm jmVar4 = ll1.d;
            un9.s(jmVar4, dd4Var3, ou6VarL0);
            lu6 lu6Var = lu6.a;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            boolean z3 = xm3Var.e;
            to3 to3Var = xm3Var.d;
            boolean z4 = (i2 & 57344) == 16384;
            Object objQ = dd4Var3.Q();
            boolean z5 = z4;
            fu6 fu6Var = vl1.a;
            if (z5 || objQ == fu6Var) {
                vf0Var = vf0Var2;
                xf3 xf3Var = new xf3(20, ib4Var2);
                dd4Var3.p0(xf3Var);
                obj = xf3Var;
            } else {
                vf0Var = vf0Var2;
                obj = objQ;
            }
            ou6 ou6VarV = yn2.V(0, (ib4) obj, dd4Var3, ou6VarF, z3);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var3, 48);
            int iHashCode2 = Long.hashCode(dd4Var3.T);
            lr7 lr7VarL2 = dd4Var3.l();
            ou6 ou6VarL02 = s32.L0(dd4Var3, ou6VarV);
            dd4Var3.j0();
            if (dd4Var3.S) {
                dd4Var3.k(um1Var);
            } else {
                dd4Var3.s0();
            }
            un9.s(jmVar, dd4Var3, eq8VarA);
            un9.s(jmVar2, dd4Var3, lr7VarL2);
            ky0.v(iHashCode2, dd4Var3, jmVar3, dd4Var3, kdVar);
            un9.s(jmVar4, dd4Var3, ou6VarL02);
            po3 po3Var = new po3(to3Var.r, to3Var.a, to3Var.c);
            qr1 qr1Var = ra1.d;
            ou6 ou6VarN = tg9.n(lu6Var, 32.0f);
            ur9 ur9Var = s96.a;
            w05.a(po3Var, qr1Var, false, null, gc1.e, t96.w(ou6VarN, ((q96) dd4Var3.j(ur9Var)).c.b), null, dd4Var, 196656, 412);
            un9.a(dd4Var, tg9.r(lu6Var, 8.0f));
            nha.c(to3Var.b, new bp5(1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.h, dd4Var, 0, 0, 131068);
            if (xm3Var.e) {
                dd4Var.f0(1129782720);
                dd4Var2 = dd4Var;
                z = false;
                mx4.a(i25.c((m53) a53.f.getValue(), dd4Var, 0), (String) null, tg9.n(lu6Var, 24.0f), 0L, dd4Var2, 432, 8);
                dd4Var2.q(false);
            } else {
                dd4Var2 = dd4Var;
                z = false;
                dd4Var2.f0(1129989769);
                dd4Var2.q(false);
            }
            xv5.z(dd4Var2, true, lu6Var, 9.0f, dd4Var2);
            if (xm3Var.a) {
                dd4Var2.f0(334646975);
                ou6 ou6VarF2 = tg9.f(lu6Var, 1.0f);
                mv mvVar = new mv(8.0f, true, new gp(5));
                Object objQ2 = dd4Var2.Q();
                Object obj3 = objQ2;
                if (objQ2 == fu6Var) {
                    xl4 xl4Var = new xl4(6);
                    dd4Var2.p0(xl4Var);
                    obj3 = xl4Var;
                }
                kb4 kb4Var3 = (kb4) obj3;
                boolean z6 = z;
                dd4Var3 = dd4Var;
                pu1.m(ou6VarF2, null, null, mvVar, null, null, false, kb4Var3, dd4Var3, 113270790, 110);
                dd4Var3.q(z6);
            } else {
                boolean z7 = z;
                dd4Var3 = dd4Var2;
                boolean z8 = xm3Var.b;
                fu6 fu6Var2 = pv.e;
                if (z8) {
                    dd4Var3.f0(335149547);
                    ou6 ou6VarH = tg9.h(tg9.f(lu6Var, 1.0f), 200.0f);
                    ie1 ie1VarA2 = ge1.a(fu6Var2, vf0Var, dd4Var3, 54);
                    int iHashCode3 = Long.hashCode(dd4Var3.T);
                    lr7 lr7VarL3 = dd4Var3.l();
                    ou6 ou6VarL03 = s32.L0(dd4Var3, ou6VarH);
                    dd4Var3.j0();
                    if (dd4Var3.S) {
                        dd4Var3.k(um1Var);
                    } else {
                        dd4Var3.s0();
                    }
                    un9.s(jmVar, dd4Var3, ie1VarA2);
                    un9.s(jmVar2, dd4Var3, lr7VarL3);
                    ky0.v(iHashCode3, dd4Var3, jmVar3, dd4Var3, kdVar);
                    un9.s(jmVar4, dd4Var3, ou6VarL03);
                    dd4Var3.f0(-1057074587);
                    String strK = xm3Var.c;
                    if (strK.length() == 0) {
                        strK = wn9.K((pv9) eu9.E.getValue(), dd4Var3);
                    }
                    dd4Var3.q(z7);
                    nha.c(strK, (ou6) null, 0L, (g60) null, wn9.x(20), (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var3.j(ur9Var)).b.j, dd4Var, 24576, 0, 130030);
                    un9.a(dd4Var, tg9.h(lu6Var, 24.0f));
                    kc5.n(i25.c((m53) f53.a0.getValue(), dd4Var, z7 ? 1 : 0), wn9.K((pv9) mu9.S.getValue(), dd4Var), false, null, null, null, null, null, ib4Var, dd4Var, (i2 << 18) & 234881024, 252);
                    dd4Var3 = dd4Var;
                    dd4Var3.q(true);
                    dd4Var3.q(z7);
                } else {
                    vf0 vf0Var3 = vf0Var;
                    List list = xm3Var.f;
                    if (list == null || list.isEmpty()) {
                        kb4Var2 = kb4Var;
                        dd4Var3.f0(336114856);
                        ou6 ou6VarH2 = tg9.h(tg9.f(lu6Var, 1.0f), 200.0f);
                        ie1 ie1VarA3 = ge1.a(fu6Var2, vf0Var3, dd4Var3, 54);
                        int iHashCode4 = Long.hashCode(dd4Var3.T);
                        lr7 lr7VarL4 = dd4Var3.l();
                        ou6 ou6VarL04 = s32.L0(dd4Var3, ou6VarH2);
                        dd4Var3.j0();
                        if (dd4Var3.S) {
                            dd4Var3.k(um1Var);
                        } else {
                            dd4Var3.s0();
                        }
                        un9.s(jmVar, dd4Var3, ie1VarA3);
                        un9.s(jmVar2, dd4Var3, lr7VarL4);
                        ky0.v(iHashCode4, dd4Var3, jmVar3, dd4Var3, kdVar);
                        un9.s(jmVar4, dd4Var3, ou6VarL04);
                        nha.c(wn9.K((pv9) eu9.y.getValue(), dd4Var3), (ou6) null, 0L, (g60) null, wn9.x(20), (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var3.j(ur9Var)).b.j, dd4Var, 24576, 0, 130030);
                        un9.a(dd4Var, tg9.h(lu6Var, 24.0f));
                        kc5.n(i25.c((m53) f53.a0.getValue(), dd4Var, 0), wn9.K((pv9) mu9.S.getValue(), dd4Var), false, null, null, null, null, null, ib4Var, dd4Var, (i2 << 18) & 234881024, 252);
                        dd4Var3 = dd4Var;
                        z2 = true;
                        dd4Var3.q(true);
                        dd4Var3.q(false);
                        dd4Var3.q(z2);
                    } else {
                        dd4Var3.f0(337010539);
                        ou6 ou6VarF3 = tg9.f(lu6Var, 1.0f);
                        mv mvVar2 = new mv(8.0f, true, new gp(5));
                        boolean zH = dd4Var3.h(xm3Var) | ((i2 & 7168) == 2048);
                        Object objQ3 = dd4Var3.Q();
                        if (zH || objQ3 == fu6Var) {
                            kb4Var2 = kb4Var;
                            vj0 vj0Var = new vj0(1, xm3Var, kb4Var2);
                            dd4Var3.p0(vj0Var);
                            obj2 = vj0Var;
                        } else {
                            kb4Var2 = kb4Var;
                            obj2 = objQ3;
                        }
                        pu1.m(ou6VarF3, null, null, mvVar2, null, null, false, (kb4) obj2, dd4Var3, 24582, 238);
                        dd4Var3.q(false);
                        z2 = true;
                        dd4Var3.q(z2);
                    }
                }
            }
            kb4Var2 = kb4Var;
            z2 = true;
            dd4Var3.q(z2);
        } else {
            kb4Var2 = kb4Var;
            dd4Var3.Y();
        }
        ye8 ye8VarU = dd4Var3.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uj0(xm3Var, ou6Var, ib4Var, kb4Var2, ib4Var2, i, 10);
        }
    }

    public static final int g0(cr8 cr8Var, String str) {
        cr8Var.getClass();
        int iT = T(cr8Var, str);
        if (iT >= 0) {
            return iT;
        }
        int columnCount = cr8Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(cr8Var.getColumnName(i));
        }
        gp.g(93, "Column '", str, "' does not exist. Available columns: [", fc1.D0(arrayList, null, null, null, null, 63));
        return 0;
    }

    public static final void h(List list, szb szbVar, ou6 ou6Var, kb4 kb4Var, yb4 yb4Var, kb4 kb4Var2, dd4 dd4Var, int i) {
        dd4Var.h0(-512273530);
        int i2 = (dd4Var.h(kb4Var2) ? 131072 : Parser.ARGC_LIMIT) | i | (dd4Var.h(list) ? 4 : 2) | (dd4Var.f(szbVar) ? 32 : 16) | (dd4Var.h(kb4Var) ? 2048 : 1024) | (dd4Var.h(yb4Var) ? 16384 : 8192);
        if (dd4Var.V(i2 & 1, (74899 & i2) != 74898)) {
            boolean zH = dd4Var.h(list) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                um umVar = new um((Object) list, kb4Var, (ub4) yb4Var, (ub4) kb4Var2, 11);
                dd4Var.p0(umVar);
                objQ = umVar;
            }
            gx1.h(ou6Var, null, szbVar, null, null, null, false, null, 0L, 0L, 0.0f, (kb4) objQ, dd4Var, 6 | ((i2 << 3) & 896), 0, 4090);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uq6(list, szbVar, ou6Var, kb4Var, yb4Var, kb4Var2, i);
        }
    }

    public static final lf2 h0(n58 n58Var, dd4 dd4Var) {
        n58Var.getClass();
        pe.a(dd4Var, 0);
        return (lf2) dd4Var.j(n58Var);
    }

    public static final void i(String str, t27 t27Var, dd4 dd4Var, int i) {
        str.getClass();
        t27Var.getClass();
        dd4Var.h0(39909897);
        int i2 = 4;
        int i3 = (dd4Var.f(str) ? 4 : 2) | i | (dd4Var.f(t27Var) ? 32 : 16);
        if (dd4Var.V(i3 & 1, (i3 & 19) != 18)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            ro4 ro4Var = (ro4) ((qtb) qx1.N(ug8.a(ro4.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            a07 a07VarB = bx1.B(ro4Var.f, dd4Var);
            Object[] objArr = new Object[0];
            boolean z = (i3 & 14) == 4;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z || objQ == obj) {
                objQ = new ho4(str, 0);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 0);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new un4(i2);
                dd4Var.p0(objQ2);
            }
            a07 a07Var2 = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var, 48);
            String str2 = (String) a07Var.getValue();
            boolean zF = dd4Var.f(ro4Var) | dd4Var.f(a07Var);
            Object objQ3 = dd4Var.Q();
            if (zF || objQ3 == obj) {
                objQ3 = new pg(ro4Var, a07Var, null, 15);
                dd4Var.p0(objQ3);
            }
            lc5.u((yb4) objQ3, dd4Var, str2);
            gx1.p(wn9.L((pv9) mu9.e0.getValue(), new Object[]{(String) a07Var.getValue()}, dd4Var), null, false, jf0.G(59586693, new n74(t27Var, i2), dd4Var), jf0.G(-914612050, new nb0(a07Var2, 5), dd4Var), jf0.G(-1176522669, new w6(ro4Var, a07Var, t27Var, a07VarB), dd4Var), dd4Var, 224256, 6);
            boolean zBooleanValue = ((Boolean) a07Var2.getValue()).booleanValue();
            String str3 = (String) a07Var.getValue();
            String strK = wn9.K((pv9) mu9.c0.getValue(), dd4Var);
            boolean zF2 = dd4Var.f(a07Var2);
            Object objQ4 = dd4Var.Q();
            if (zF2 || objQ4 == obj) {
                objQ4 = new tn4(a07Var2, i2);
                dd4Var.p0(objQ4);
            }
            kb4 kb4Var = (kb4) objQ4;
            boolean zF3 = dd4Var.f(a07Var2) | dd4Var.f(a07Var);
            Object objQ5 = dd4Var.Q();
            if (zF3 || objQ5 == obj) {
                objQ5 = new rl0(a07Var2, a07Var, 12);
                dd4Var.p0(objQ5);
            }
            p(zBooleanValue, str3, strK, kb4Var, (kb4) objQ5, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yj0(str, t27Var, i, 10);
        }
    }

    public static int i0(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final void j(final boolean z, final int i, final int i2, final String str, final int i3, final int i4, final int i5, final int i6, final ou6 ou6Var, final ib4 ib4Var, final ib4 ib4Var2, final ib4 ib4Var3, final ib4 ib4Var4, final kb4 kb4Var, final ib4 ib4Var5, dd4 dd4Var, final int i7, final int i8) {
        int i9;
        int i10;
        final int i11;
        int i12;
        kb4 kb4Var2;
        ib4 ib4Var6;
        ib4Var.getClass();
        ib4Var2.getClass();
        ib4Var3.getClass();
        ib4Var4.getClass();
        kb4Var.getClass();
        ib4Var5.getClass();
        dd4Var.h0(-838888378);
        if ((i7 & 6) == 0) {
            i9 = (dd4Var.g(z) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            i9 |= dd4Var.d(i) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i10 = i2;
            i9 |= dd4Var.d(i10) ? 256 : Token.CASE;
        } else {
            i10 = i2;
        }
        if ((i7 & 24576) == 0) {
            i11 = i3;
            i9 |= dd4Var.d(i11) ? 16384 : 8192;
        } else {
            i11 = i3;
        }
        if ((i7 & 196608) == 0) {
            i9 |= dd4Var.d(i4) ? 131072 : Parser.ARGC_LIMIT;
        }
        if ((i7 & 100663296) == 0) {
            i9 |= dd4Var.f(ou6Var) ? 67108864 : 33554432;
        }
        if ((i7 & 805306368) == 0) {
            i9 |= dd4Var.h(ib4Var) ? 536870912 : 268435456;
        }
        if ((i8 & 6) == 0) {
            i12 = i8 | (dd4Var.h(ib4Var2) ? 4 : 2);
        } else {
            i12 = i8;
        }
        if ((i8 & 48) == 0) {
            i12 |= dd4Var.h(ib4Var3) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i12 |= dd4Var.h(ib4Var4) ? 256 : Token.CASE;
        }
        if ((i8 & 3072) == 0) {
            kb4Var2 = kb4Var;
            i12 |= dd4Var.h(kb4Var2) ? 2048 : 1024;
        } else {
            kb4Var2 = kb4Var;
        }
        if ((i8 & 24576) == 0) {
            ib4Var6 = ib4Var5;
            i12 |= dd4Var.h(ib4Var6) ? 16384 : 8192;
        } else {
            ib4Var6 = ib4Var5;
        }
        int i13 = i9;
        if (dd4Var.V(i13 & 1, ((i9 & 302063763) == 302063762 && (i12 & 9363) == 9362) ? false : true)) {
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
            ou6 ou6VarF = tg9.f(lu6.a, 1.0f);
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new xl4(25);
                dd4Var.p0(objQ);
            }
            be3 be3VarA = be3VarC.a(wd3.m((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new xl4(26);
                dd4Var.p0(objQ2);
            }
            final int i14 = i10;
            final kb4 kb4Var3 = kb4Var2;
            final ib4 ib4Var7 = ib4Var6;
            kf0.e(z, ou6VarF, be3VarA, cj3VarD.a(wd3.q((kb4) objQ2)), (String) null, jf0.G(1357831828, new zb4() { // from class: qy4
                /* JADX WARN: Removed duplicated region for block: B:39:0x034e  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x035a  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x038d  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x03bc  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x03c0  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x041a  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0428  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x045a  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x0489  */
                @Override // defpackage.zb4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object c(java.lang.Object r56, java.lang.Object r57, java.lang.Object r58) {
                    /*
                        Method dump skipped, instruction units count: 1184
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.qy4.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, dd4Var), dd4Var, 1600902 | ((i13 << 3) & Token.ASSIGN_MOD), 16);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: ry4
                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(i7 | 1);
                    int iX02 = qu1.x0(i8);
                    wx1.j(z, i, i2, str, i3, i4, i5, i6, ou6Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, kb4Var, ib4Var5, (dd4) obj2, iX0, iX02);
                    return heb.a;
                }
            };
        }
    }

    public static final void j0(a07 a07Var) {
        a07Var.setValue(heb.a);
    }

    public static final void k(final boolean z, final int i, final int i2, final int i3, final int i4, final int i5, final ou6 ou6Var, final ib4 ib4Var, final ib4 ib4Var2, final ib4 ib4Var3, final ib4 ib4Var4, dd4 dd4Var, final int i6, final int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        ou6 ou6Var2;
        ib4 ib4Var5;
        ib4 ib4Var6;
        int i14;
        int i15;
        ib4Var.getClass();
        ib4Var2.getClass();
        ib4Var3.getClass();
        ib4Var4.getClass();
        dd4Var.h0(1399341437);
        if ((i6 & 6) == 0) {
            i8 = (dd4Var.g(z) ? 4 : 2) | i6;
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i9 = i;
            i8 |= dd4Var.d(i9) ? 32 : 16;
        } else {
            i9 = i;
        }
        if ((i6 & 384) == 0) {
            i10 = i2;
            i8 |= dd4Var.d(i10) ? 256 : Token.CASE;
        } else {
            i10 = i2;
        }
        if ((i6 & 3072) == 0) {
            i11 = i3;
            i8 |= dd4Var.d(i11) ? 2048 : 1024;
        } else {
            i11 = i3;
        }
        if ((i6 & 24576) == 0) {
            i12 = i4;
            i8 |= dd4Var.d(i12) ? 16384 : 8192;
        } else {
            i12 = i4;
        }
        if ((196608 & i6) == 0) {
            i13 = i5;
            i8 |= dd4Var.d(i13) ? 131072 : Parser.ARGC_LIMIT;
        } else {
            i13 = i5;
        }
        if ((1572864 & i6) == 0) {
            ou6Var2 = ou6Var;
            i8 |= dd4Var.f(ou6Var2) ? 1048576 : 524288;
        } else {
            ou6Var2 = ou6Var;
        }
        if ((12582912 & i6) == 0) {
            ib4Var5 = ib4Var;
            i8 |= dd4Var.h(ib4Var5) ? 8388608 : 4194304;
        } else {
            ib4Var5 = ib4Var;
        }
        if ((100663296 & i6) == 0) {
            i8 |= dd4Var.h(ib4Var2) ? 67108864 : 33554432;
        }
        if ((805306368 & i6) == 0) {
            i8 |= dd4Var.h(ib4Var3) ? 536870912 : 268435456;
        }
        if ((i7 & 6) == 0) {
            ib4Var6 = ib4Var4;
            i14 = i7 | (dd4Var.h(ib4Var6) ? 4 : 2);
        } else {
            ib4Var6 = ib4Var4;
            i14 = i7;
        }
        if (dd4Var.V(i8 & 1, ((i8 & 306783379) == 306783378 && (i14 & 3) == 2) ? false : true)) {
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                i15 = i8;
                objQ = new xl4(27);
                dd4Var.p0(objQ);
            } else {
                i15 = i8;
            }
            be3 be3VarA = be3VarC.a(wd3.m((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new xl4(28);
                dd4Var.p0(objQ2);
            }
            kf0.d(z, ou6Var2, be3VarA, cj3VarD.a(wd3.q((kb4) objQ2)), (String) null, jf0.G(-1864949851, new sy4(ib4Var6, ib4Var2, i10, i11, i12, i13, i9, ib4Var5, ib4Var3, 0), dd4Var), dd4Var, (i15 & 14) | 200064 | ((i15 >> 15) & Token.ASSIGN_MOD), 16);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4() { // from class: ty4
                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(i6 | 1);
                    int iX02 = qu1.x0(i7);
                    wx1.k(z, i, i2, i3, i4, i5, ou6Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, (dd4) obj2, iX0, iX02);
                    return heb.a;
                }
            };
        }
    }

    public static final boolean k0(vx1 vx1Var) {
        yd5 yd5Var = (yd5) vx1Var.q().get(s00.s);
        if (yd5Var != null) {
            return yd5Var.isActive();
        }
        return true;
    }

    public static final void l(dd4 dd4Var, int i) {
        dd4Var.h0(-519025078);
        if (!dd4Var.V(i & 1, i != 0)) {
            dd4Var.Y();
        } else if (((Boolean) dd4Var.j(c95.a)).booleanValue()) {
            dd4Var.f0(-393256744);
            dd4Var.q(false);
        } else {
            dd4Var.f0(-393746854);
            a6 a6VarA = p16.a(dd4Var);
            jt1 jt1Var = null;
            xi1 xi1VarE = a6VarA != null ? a6VarA.e() : null;
            boolean zH = dd4Var.h(xi1VarE);
            Object objQ = dd4Var.Q();
            if (zH || objQ == vl1.a) {
                objQ = new ne0(xi1VarE, jt1Var, 9);
                dd4Var.p0(objQ);
            }
            lc5.u((yb4) objQ, dd4Var, xi1VarE);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new kx1(i);
        }
    }

    public static boolean l0(String str) throws ef4 {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        M("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        M("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
            return strEglQueryString != null && strEglQueryString.contains(str);
        }
        throw new ef4("Error in getDefaultEglDisplay, error code: 0x" + Integer.toHexString(iEglGetError), a55.q(Integer.valueOf(iEglGetError)));
    }

    public static final void m(String str, String str2, boolean z, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i) {
        boolean z2;
        dd4Var.h0(-1424544820);
        int i2 = i | (dd4Var.f(str) ? 4 : 2) | (dd4Var.f(str2) ? 32 : 16) | 384 | (dd4Var.f(ou6Var) ? 2048 : 1024) | (dd4Var.h(kb4Var) ? 16384 : 8192);
        if (dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            lx1.m(str, kb4Var, ou6Var, true, false, null, jf0.G(1538674662, new z31(str2, 17), dd4Var), null, null, null, false, null, new qj5(3, 0, Token.EXPORT), null, true, 0, 0, ((q96) dd4Var.j(s96.a)).c.b, null, dd4Var, ((i2 >> 3) & 896) | (i2 & 14) | 1572864 | ((i2 >> 9) & Token.ASSIGN_MOD) | 3072, 12779520, 6127536);
            z2 = true;
        } else {
            dd4Var.Y();
            z2 = z;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new z41(str, str2, z2, ou6Var, kb4Var, i, 8);
        }
    }

    public static int m0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return i | (i2 << 4) | (((i4 << 4) | i3) << 8) | (((((i8 << 4) | i7) << 8) | ((i6 << 4) | i5)) << 16);
    }

    public static final void n(boolean z, fxb fxbVar, ou6 ou6Var, kb4 kb4Var, kb4 kb4Var2, kb4 kb4Var3, dd4 dd4Var, int i) {
        fxbVar.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        kb4Var3.getClass();
        dd4Var.h0(1455102847);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.h(fxbVar) ? 32 : 16) | (dd4Var.h(kb4Var) ? 2048 : 1024) | (dd4Var.h(kb4Var3) ? 131072 : Parser.ARGC_LIMIT);
        if (dd4Var.V(i2 & 1, (66707 & i2) != 66706)) {
            kf0.d(z, ou6Var, wd3.c((by3) null, 3), wd3.d((by3) null, 3), (String) null, jf0.G(-125670825, new c41(19, fxbVar, kb4Var3, kb4Var), dd4Var), dd4Var, (i2 & 14) | 200112, 16);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ch1(z, (Object) fxbVar, ou6Var, (ub4) kb4Var, (ub4) kb4Var2, (ub4) kb4Var3, i, 2);
        }
    }

    public static final nk3 n0(dd4 dd4Var) {
        Object objQ = dd4Var.Q();
        Object obj = vl1.a;
        if (objQ == obj) {
            objQ = new z16(21);
            dd4Var.p0(objQ);
        }
        ib4 ib4Var = (ib4) objQ;
        Context context = (Context) dd4Var.j(he.b);
        boolean zF = dd4Var.f(context);
        Object objQ2 = dd4Var.Q();
        if (zF || objQ2 == obj) {
            jx1 jx1Var = (jx1) ib4Var.invoke();
            context.getClass();
            jx1Var.getClass();
            if (((ok3) fc1.z0(ge6.a)) == null) {
                gp.j("No MediampPlayerFactory implementation found on the classpath.");
                return null;
            }
            objQ2 = new zh8(new nk3(context, jx1Var));
            dd4Var.p0(objQ2);
        }
        return ((zh8) objQ2).a;
    }

    public static final iw0 o() {
        o0a o0aVarA = zib.a();
        aj2 aj2Var = rw2.a;
        return new iw0(gx1.T(o0aVarA, r76.a));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void o0(a07 a07Var, a07 a07Var2, a07 a07Var3, br9 br9Var, String str, List list) {
        List<gw3> listY;
        String str2 = (String) a07Var.getValue();
        String str3 = (String) a07Var2.getValue();
        Integer num = (Integer) a07Var3.getValue();
        fj2 fj2Var = new fj2(br9Var, 1);
        if (lc5.Q(str2, str) && str3 != null) {
            a07Var2.setValue((Object) null);
            a07Var3.setValue((Object) null);
            a07Var.setValue((Object) null);
            bw3 bw3Var = bw3.a;
            if (list == null || list.isEmpty()) {
                listY = gc1.Y(bw3Var);
            } else {
                zy5 zy5VarN = gc1.N();
                zy5VarN.add(new fw3(list.size()));
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        gc1.i0();
                        throw null;
                    }
                    zy5VarN.add(new ew3(list.subList(0, i2), list.size()));
                    i = i2;
                }
                zy5VarN.add(new cw3(list));
                listY = gc1.J(zy5VarN);
            }
            switch (str3.hashCode()) {
                case -1118928849:
                    if (str3.equals("single_with_state")) {
                        for (gw3 gw3Var : listY) {
                            if (gw3Var instanceof bw3) {
                                fj2Var.invoke(bw3Var);
                            } else {
                                if (gw3Var instanceof dw3) {
                                    throw null;
                                }
                                if (gw3Var instanceof fw3) {
                                    fj2Var.invoke(new fw3(((fw3) gw3Var).a));
                                } else if (gw3Var instanceof ew3) {
                                    ew3 ew3Var = (ew3) gw3Var;
                                    wt7 wt7Var = (wt7) fc1.z0((List) ew3Var.a);
                                    if (wt7Var != null) {
                                        fj2Var.invoke(new ew3(wt7Var, ew3Var.b));
                                    }
                                } else {
                                    if (!(gw3Var instanceof cw3)) {
                                        mn5.g();
                                        return;
                                    }
                                    wt7 wt7Var2 = (wt7) fc1.z0((List) ((cw3) gw3Var).a);
                                    if (wt7Var2 != null) {
                                        fj2Var.invoke(new cw3(wt7Var2));
                                    } else {
                                        fj2Var.invoke(bw3Var);
                                    }
                                }
                            }
                        }
                        return;
                    }
                    return;
                case -902265784:
                    if (str3.equals("single")) {
                        gw3 gw3Var2 = (gw3) fc1.E0(listY);
                        fj2Var.invoke(gw3Var2 instanceof cw3 ? (wt7) fc1.z0((List) ((cw3) gw3Var2).a) : null);
                        return;
                    }
                    return;
                case -777457305:
                    if (str3.equals("multiple_with_state")) {
                        for (gw3 gw3Var3 : listY) {
                            if (gw3Var3 instanceof bw3) {
                                fj2Var.invoke(bw3Var);
                            } else {
                                if (gw3Var3 instanceof dw3) {
                                    throw null;
                                }
                                if (gw3Var3 instanceof fw3) {
                                    fj2Var.invoke(new fw3(num != null ? Math.min(((fw3) gw3Var3).a, num.intValue()) : ((fw3) gw3Var3).a));
                                } else if (gw3Var3 instanceof ew3) {
                                    fj2Var.invoke(new ew3(num != null ? fc1.S0((Iterable) ((ew3) gw3Var3).a, num.intValue()) : (List) ((ew3) gw3Var3).a, num != null ? Math.min(((ew3) gw3Var3).b, num.intValue()) : ((ew3) gw3Var3).b));
                                } else {
                                    if (!(gw3Var3 instanceof cw3)) {
                                        mn5.g();
                                        return;
                                    }
                                    fj2Var.invoke(new cw3(num != null ? fc1.S0((Iterable) ((cw3) gw3Var3).a, num.intValue()) : (List) ((cw3) gw3Var3).a));
                                }
                            }
                        }
                        return;
                    }
                    return;
                case 653829648:
                    if (str3.equals("multiple")) {
                        gw3 gw3Var4 = (gw3) fc1.E0(listY);
                        fj2Var.invoke(gw3Var4 instanceof cw3 ? num != null ? fc1.S0((Iterable) ((cw3) gw3Var4).a, num.intValue()) : (List) ((cw3) gw3Var4).a : null);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public static final void p(boolean z, String str, String str2, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i) {
        str.getClass();
        str2.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var.h0(-1572387737);
        int i2 = i | (dd4Var.g(z) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(str) ? 32 : 16;
        }
        int i3 = i2 | (dd4Var.f(str2) ? 256 : Token.CASE) | (dd4Var.h(kb4Var) ? 2048 : 1024) | (dd4Var.h(kb4Var2) ? 16384 : 8192);
        if (!dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            dd4Var.Y();
        } else if (xzb.a(dd4Var)) {
            dd4Var.f0(-2089533632);
            r(z, str, str2, kb4Var, kb4Var2, dd4Var, i3 & 65534);
            dd4Var.q(false);
        } else {
            dd4Var.f0(-2089310463);
            q(z, str, str2, kb4Var, kb4Var2, dd4Var, i3 & 65534);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ni6(z, str, str2, kb4Var, kb4Var2, i, 1, (byte) 0);
        }
    }

    public static final void p0(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final void q(boolean z, String str, String str2, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i) {
        dd4Var.h0(1965912145);
        int i2 = i | (dd4Var.g(z) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(str) ? 32 : 16;
        }
        int i3 = i2 | (dd4Var.f(str2) ? 256 : Token.CASE) | (dd4Var.h(kb4Var) ? 2048 : 1024) | (dd4Var.h(kb4Var2) ? 16384 : 8192);
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            a07 a07VarA = dk9.A(kb4Var2, dd4Var);
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            cv2 cv2Var = (cv2) ((qtb) qx1.N(ug8.a(cv2.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
            bx1.a(z, kb4Var, (be3) null, (cj3) null, bv4.d, lc1.c(0.3f, lc1.b), false, false, (ou6) null, jf0.G(-582521421, new pj6(cv2Var, str, a07VarA, kb4Var, str2, bx1.B(cv2Var.d, dd4Var), 1), dd4Var), dd4Var, ((i3 >> 6) & Token.ASSIGN_MOD) | 805527552 | (i3 & 14), 460);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ni6(z, str, str2, kb4Var, kb4Var2, i, 3, (byte) 0);
        }
    }

    public static ga5 q0(ha5 ha5Var, int i) {
        ha5Var.getClass();
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i2 = ha5Var.a;
        int i3 = ha5Var.b;
        if (ha5Var.c <= 0) {
            i = -i;
        }
        return new ga5(i2, i3, i);
    }

    public static final void r(boolean z, String str, String str2, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i) {
        dd4Var.h0(1573669683);
        int i2 = i | (dd4Var.g(z) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= dd4Var.f(str) ? 32 : 16;
        }
        int i3 = i2 | (dd4Var.f(str2) ? 256 : Token.CASE) | (dd4Var.h(kb4Var) ? 2048 : 1024) | (dd4Var.h(kb4Var2) ? 16384 : 8192);
        if (dd4Var.V(i3 & 1, (i3 & 9363) != 9362)) {
            a07 a07VarA = dk9.A(kb4Var2, dd4Var);
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            } else {
                cv2 cv2Var = (cv2) ((qtb) qx1.N(ug8.a(cv2.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
                bx1.a(z, kb4Var, (be3) null, (cj3) null, (f9) null, 0L, false, false, (ou6) null, jf0.G(-118359535, new pj6(cv2Var, str, a07VarA, kb4Var, str2, bx1.B(cv2Var.d, dd4Var), 0), dd4Var), dd4Var, 805306368 | (i3 & 14) | ((i3 >> 6) & Token.ASSIGN_MOD), 508);
            }
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ni6(z, str, str2, kb4Var, kb4Var2, i, 2, (byte) 0);
        }
    }

    public static final void r0(int i) {
        throw new u39(dx1.f(i, "An unknown field for index "));
    }

    public static final void s(final boolean z, final int i, final int i2, final jja jjaVar, final kb4 kb4Var, final kb4 kb4Var2, final kb4 kb4Var3, final ac4 ac4Var, final ib4 ib4Var, final ib4 ib4Var2, final ib4 ib4Var3, final ib4 ib4Var4, dd4 dd4Var, final int i3) {
        int i4;
        jjaVar.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        kb4Var3.getClass();
        ac4Var.getClass();
        ib4Var.getClass();
        ib4Var2.getClass();
        ib4Var3.getClass();
        ib4Var4.getClass();
        dd4Var.h0(-2083298888);
        int i5 = i3 | (dd4Var.g(z) ? 4 : 2) | (dd4Var.d(i) ? 32 : 16) | (dd4Var.d(i2) ? 256 : Token.CASE) | (dd4Var.f(jjaVar) ? 2048 : 1024) | (dd4Var.h(kb4Var) ? 16384 : 8192) | (dd4Var.h(kb4Var3) ? 1048576 : 524288) | (dd4Var.h(ac4Var) ? 8388608 : 4194304) | (dd4Var.h(ib4Var) ? 67108864 : 33554432) | (dd4Var.h(ib4Var2) ? 536870912 : 268435456);
        if (dd4Var.V(i5 & 1, ((306783379 & i5) == 306783378 && (((dd4Var.h(ib4Var3) ? (char) 4 : (char) 2) | (dd4Var.h(ib4Var4) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                i4 = i5;
                objQ = new zm6(8);
                dd4Var.p0(objQ);
            } else {
                i4 = i5;
            }
            be3 be3VarA = be3VarC.a(wd3.m((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var.Q();
            int i6 = 9;
            if (objQ2 == obj) {
                objQ2 = new zm6(i6);
                dd4Var.p0(objQ2);
            }
            bx1.a(z, kb4Var, be3VarA, cj3VarD.a(wd3.q((kb4) objQ2)), (f9) null, 0L, false, false, (ou6) null, jf0.G(26836122, new zb4() { // from class: rn6
                @Override // defpackage.zb4
                public final Object c(Object obj2, Object obj3, Object obj4) {
                    dd4 dd4Var2 = (dd4) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((co0) obj2).getClass();
                    if (dd4Var2.V(iIntValue & 1, (iIntValue & 17) != 16)) {
                        j1a.a((ou6) null, (t89) null, 0L, 0L, 0.0f, 0.0f, (wm0) null, jf0.G(-1670598027, new un6(jjaVar, kb4Var2, kb4Var3, i, i2, ac4Var, ib4Var, ib4Var2, ib4Var3, kb4Var, ib4Var4), dd4Var2), dd4Var2, 12582912, Token.SWITCH);
                    } else {
                        dd4Var2.Y();
                    }
                    return heb.a;
                }
            }, dd4Var), dd4Var, (i4 & 14) | 805309824 | ((i4 >> 9) & Token.ASSIGN_MOD), 496);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new yb4(z, i, i2, jjaVar, kb4Var, kb4Var2, kb4Var3, ac4Var, ib4Var, ib4Var2, ib4Var3, ib4Var4, i3) { // from class: tn6
                public final /* synthetic */ boolean a;
                public final /* synthetic */ int b;
                public final /* synthetic */ int c;
                public final /* synthetic */ jja d;
                public final /* synthetic */ kb4 e;
                public final /* synthetic */ kb4 f;
                public final /* synthetic */ kb4 s;
                public final /* synthetic */ ac4 t;
                public final /* synthetic */ ib4 u;
                public final /* synthetic */ ib4 v;
                public final /* synthetic */ ib4 w;
                public final /* synthetic */ ib4 x;

                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(196609);
                    wx1.s(this.a, this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, this.x, (dd4) obj2, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static ha5 s0(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new ha5(i, i2 - 1, 1);
        }
        ha5 ha5Var = ha5.d;
        return ha5.d;
    }

    public static final void t(final int i, final int i2, final boolean z, final boolean z2, final int i3, boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, final String str, final List list, final ou6 ou6Var, final zb4 zb4Var, final kb4 kb4Var, final kb4 kb4Var2, final zb4 zb4Var2, final ib4 ib4Var, final ib4 ib4Var2, final ib4 ib4Var3, dd4 dd4Var, final int i4) {
        boolean z8;
        int i5;
        wf0 wf0Var;
        a07 a07Var;
        ou6 ou6Var2;
        int i6;
        boolean z9;
        wf0 wf0Var2 = bv4.w;
        dd4Var.h0(-1753040152);
        int i7 = i4 | (dd4Var.d(i) ? 4 : 2) | (dd4Var.d(i2) ? 32 : 16) | (dd4Var.g(z) ? 256 : 128) | (dd4Var.g(z2) ? 2048 : 1024) | (dd4Var.d(i3) ? 16384 : 8192) | (dd4Var.g(z3) ? 131072 : Parser.ARGC_LIMIT) | (dd4Var.g(z4) ? 1048576 : 524288) | (dd4Var.g(z5) ? 8388608 : 4194304) | (dd4Var.g(z6) ? 67108864 : 33554432);
        int i8 = (dd4Var.f(str) ? (char) 4 : (char) 2) | (dd4Var.h(list) ? ' ' : (char) 16) | (dd4Var.f(ou6Var) ? (char) 256 : (char) 128) | (dd4Var.h(zb4Var) ? (char) 2048 : (char) 1024) | (dd4Var.h(kb4Var) ? (char) 16384 : (char) 8192) | (dd4Var.h(zb4Var2) ? (char) 0 : (char) 0) | (dd4Var.h(ib4Var) ? (char) 0 : (char) 0) | (dd4Var.h(ib4Var2) ? (char) 0 : (char) 0) | (dd4Var.h(ib4Var3) ? 536870912 : 268435456);
        if (dd4Var.V(i7 & 1, ((i7 & 38347923) == 38347922 && (306717843 & i8) == 306717842) ? false : true)) {
            Object[] objArr = new Object[0];
            boolean z10 = ((i7 & 14) == 4) | ((i7 & Token.ASSIGN_MOD) == 32);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z10 || objQ == obj) {
                objQ = new tt5(i, i2, 1);
                dd4Var.p0(objQ);
            }
            a07 a07Var2 = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 0);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var.Q();
            int i9 = 17;
            if (objQ2 == obj) {
                objQ2 = new uj6(i9);
                dd4Var.p0(objQ2);
            }
            a07 a07Var3 = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var, 48);
            Object[] objArr3 = new Object[0];
            Object objQ3 = dd4Var.Q();
            int i10 = 18;
            if (objQ3 == obj) {
                objQ3 = new uj6(i10);
                dd4Var.p0(objQ3);
            }
            a07 a07Var4 = (a07) ww1.b0(objArr3, (ib4) objQ3, dd4Var, 48);
            ie1 ie1VarA = ge1.a(pv.d(), bv4.z, dd4Var, 6);
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
            hq8 hq8Var = hq8.a;
            ou6 ou6Var3 = lu6.a;
            if (z2 || z) {
                i5 = i8;
                wf0Var = wf0Var2;
                a07Var = a07Var4;
                dd4Var.f0(-1036495996);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1037484865);
                ou6 ou6VarF = tg9.f(ou6Var3, 1.0f);
                i5 = i8;
                eq8 eq8VarA = dq8.a(pv.d(), wf0Var2, dd4Var, 6);
                int iHashCode2 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL2 = dd4Var.l();
                ou6 ou6VarL02 = s32.L0(dd4Var, ou6VarF);
                dd4Var.j0();
                wf0Var = wf0Var2;
                if (dd4Var.S) {
                    dd4Var.k(um1Var);
                } else {
                    dd4Var.s0();
                }
                un9.s(jmVar, dd4Var, eq8VarA);
                un9.s(jmVar2, dd4Var, lr7VarL2);
                ky0.v(iHashCode2, dd4Var, jmVar3, dd4Var, kdVar);
                un9.s(jmVar4, dd4Var, ou6VarL02);
                String str2 = (String) a07Var2.getValue();
                String strK = wn9.K((pv9) zu9.P.getValue(), dd4Var);
                ou6 ou6VarB = hq8Var.b(2.0f, ou6Var3, true);
                boolean zF = dd4Var.f(a07Var2);
                Object objQ4 = dd4Var.Q();
                if (zF || objQ4 == obj) {
                    objQ4 = new cl6(a07Var2, 17);
                    dd4Var.p0(objQ4);
                }
                m(str2, strK, false, ou6VarB, (kb4) objQ4, dd4Var, 0);
                String str3 = (String) a07Var3.getValue();
                String strK2 = wn9.K((pv9) zu9.b0.getValue(), dd4Var);
                ou6 ou6VarB2 = hq8Var.b(1.0f, ou6Var3, true);
                a07Var3 = a07Var3;
                boolean zF2 = dd4Var.f(a07Var3);
                Object objQ5 = dd4Var.Q();
                if (zF2 || objQ5 == obj) {
                    objQ5 = new cl6(a07Var3, 18);
                    dd4Var.p0(objQ5);
                }
                m(str3, strK2, false, ou6VarB2, (kb4) objQ5, dd4Var, 0);
                String str4 = (String) a07Var4.getValue();
                String strK3 = wn9.K((pv9) zu9.a0.getValue(), dd4Var);
                ou6 ou6VarB3 = hq8Var.b(1.0f, ou6Var3, true);
                a07Var = a07Var4;
                boolean zF3 = dd4Var.f(a07Var);
                Object objQ6 = dd4Var.Q();
                if (zF3 || objQ6 == obj) {
                    objQ6 = new cl6(a07Var, 19);
                    dd4Var.p0(objQ6);
                }
                m(str4, strK3, false, ou6VarB3, (kb4) objQ6, dd4Var, 0);
                dd4Var.q(true);
                dd4Var.q(false);
            }
            ou6 ou6VarF2 = tg9.f(ou6Var3, 1.0f);
            mv mvVarD = pv.d();
            wf0 wf0Var3 = bv4.x;
            a07 a07Var5 = a07Var;
            eq8 eq8VarA2 = dq8.a(mvVarD, wf0Var3, dd4Var, 54);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarF2);
            dd4Var.j0();
            a07 a07Var6 = a07Var3;
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, eq8VarA2);
            un9.s(jmVar2, dd4Var, lr7VarL3);
            ky0.v(iHashCode3, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL03);
            String strK4 = wn9.K((pv9) zu9.W.getValue(), dd4Var);
            ur9 ur9Var = s96.a;
            nha.c(strK4, (ou6) null, ((q96) dd4Var.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.j, dd4Var, 0, 0, 131066);
            ou6 ou6VarA = kc5.A(ou6Var3, kc5.J(dd4Var), 14);
            wf0 wf0Var4 = wf0Var;
            eq8 eq8VarA3 = dq8.a(pv.d(), wf0Var4, dd4Var, 6);
            int iHashCode4 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL4 = dd4Var.l();
            ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarA);
            dd4Var.j0();
            if (dd4Var.S) {
                dd4Var.k(um1Var);
            } else {
                dd4Var.s0();
            }
            un9.s(jmVar, dd4Var, eq8VarA3);
            un9.s(jmVar2, dd4Var, lr7VarL4);
            ky0.v(iHashCode4, dd4Var, jmVar3, dd4Var, kdVar);
            un9.s(jmVar4, dd4Var, ou6VarL04);
            String strK5 = wn9.K((pv9) zu9.Z.getValue(), dd4Var);
            int i11 = i5;
            int i12 = i11 & 7168;
            int i13 = i7 & 3670016;
            int i14 = i7 & 29360128;
            int i15 = i7 & 234881024;
            boolean z11 = (i14 == 8388608) | (i12 == 2048) | (i13 == 1048576) | (i15 == 67108864);
            Object objQ7 = dd4Var.Q();
            if (z11 || objQ7 == obj) {
                final int i16 = 0;
                objQ7 = new ib4() { // from class: sn6
                    @Override // defpackage.ib4
                    public final Object invoke() {
                        int i17 = i16;
                        heb hebVar = heb.a;
                        boolean z12 = z6;
                        boolean z13 = z5;
                        boolean z14 = z4;
                        zb4 zb4Var3 = zb4Var;
                        switch (i17) {
                            case 0:
                                zb4Var3.c(Boolean.valueOf(!z14), Boolean.valueOf(z13), Boolean.valueOf(z12));
                                break;
                            case 1:
                                zb4Var3.c(Boolean.valueOf(z14), Boolean.valueOf(!z13), Boolean.valueOf(z12));
                                break;
                            default:
                                zb4Var3.c(Boolean.valueOf(z14), Boolean.valueOf(z13), Boolean.valueOf(!z12));
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ7);
            }
            fz1.C((i7 >> 15) & Token.ASSIGN_MOD, (ib4) objQ7, dd4Var, null, null, null, strK5, z4);
            String strK6 = wn9.K((pv9) zu9.X.getValue(), dd4Var);
            boolean z12 = (i12 == 2048) | (i13 == 1048576) | (i14 == 8388608) | (i15 == 67108864);
            Object objQ8 = dd4Var.Q();
            if (z12 || objQ8 == obj) {
                final int i17 = 1;
                objQ8 = new ib4() { // from class: sn6
                    @Override // defpackage.ib4
                    public final Object invoke() {
                        int i172 = i17;
                        heb hebVar = heb.a;
                        boolean z122 = z6;
                        boolean z13 = z5;
                        boolean z14 = z4;
                        zb4 zb4Var3 = zb4Var;
                        switch (i172) {
                            case 0:
                                zb4Var3.c(Boolean.valueOf(!z14), Boolean.valueOf(z13), Boolean.valueOf(z122));
                                break;
                            case 1:
                                zb4Var3.c(Boolean.valueOf(z14), Boolean.valueOf(!z13), Boolean.valueOf(z122));
                                break;
                            default:
                                zb4Var3.c(Boolean.valueOf(z14), Boolean.valueOf(z13), Boolean.valueOf(!z122));
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ8);
            }
            fz1.C((i7 >> 18) & Token.ASSIGN_MOD, (ib4) objQ8, dd4Var, null, null, null, strK6, z5);
            String strK7 = wn9.K((pv9) zu9.Y.getValue(), dd4Var);
            boolean z13 = (i12 == 2048) | (i13 == 1048576) | (i14 == 8388608) | (i15 == 67108864);
            Object objQ9 = dd4Var.Q();
            if (z13 || objQ9 == obj) {
                final int i18 = 2;
                objQ9 = new ib4() { // from class: sn6
                    @Override // defpackage.ib4
                    public final Object invoke() {
                        int i172 = i18;
                        heb hebVar = heb.a;
                        boolean z122 = z6;
                        boolean z132 = z5;
                        boolean z14 = z4;
                        zb4 zb4Var3 = zb4Var;
                        switch (i172) {
                            case 0:
                                zb4Var3.c(Boolean.valueOf(!z14), Boolean.valueOf(z132), Boolean.valueOf(z122));
                                break;
                            case 1:
                                zb4Var3.c(Boolean.valueOf(z14), Boolean.valueOf(!z132), Boolean.valueOf(z122));
                                break;
                            default:
                                zb4Var3.c(Boolean.valueOf(z14), Boolean.valueOf(z132), Boolean.valueOf(!z122));
                                break;
                        }
                        return hebVar;
                    }
                };
                dd4Var.p0(objQ9);
            }
            fz1.C((i7 >> 21) & Token.ASSIGN_MOD, (ib4) objQ9, dd4Var, null, null, null, strK7, z6);
            dd4Var.q(true);
            dd4Var.q(true);
            if (z2 || z) {
                ou6Var2 = ou6Var3;
                i6 = 0;
                dd4Var.f0(-1033865212);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-1034836783);
                ou6Var2 = ou6Var3;
                ou6 ou6VarF3 = tg9.f(ou6Var2, 1.0f);
                eq8 eq8VarA4 = dq8.a(pv.d(), wf0Var3, dd4Var, 54);
                int iHashCode5 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL5 = dd4Var.l();
                ou6 ou6VarL05 = s32.L0(dd4Var, ou6VarF3);
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var);
                } else {
                    dd4Var.s0();
                }
                un9.s(jmVar, dd4Var, eq8VarA4);
                un9.s(jmVar2, dd4Var, lr7VarL5);
                ky0.v(iHashCode5, dd4Var, jmVar3, dd4Var, kdVar);
                un9.s(jmVar4, dd4Var, ou6VarL05);
                nha.c(wn9.K((pv9) zu9.S.getValue(), dd4Var), (ou6) null, ((q96) dd4Var.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var.j(ur9Var)).b.j, dd4Var, 0, 0, 131066);
                mv mvVarD2 = pv.d();
                boolean zH = dd4Var.h(list) | ((i11 & 14) == 4) | ((i11 & 57344) == 16384);
                Object objQ10 = dd4Var.Q();
                if (zH || objQ10 == obj) {
                    objQ10 = new bn3(1, kb4Var, str, list);
                    dd4Var.p0(objQ10);
                }
                rw1.k(null, null, null, false, mvVarD2, null, null, false, null, (kb4) objQ10, dd4Var, 24576, 495);
                dd4Var.q(true);
                i6 = 0;
                dd4Var.q(false);
            }
            if (z) {
                dd4Var.f0(-1033099047);
                ou6 ou6VarG = jv3.G(tg9.f(ou6Var2, 1.0f), fc5.a);
                eq8 eq8VarA5 = dq8.a(pv.d(), wf0Var4, dd4Var, 6);
                int iHashCode6 = Long.hashCode(dd4Var.T);
                lr7 lr7VarL6 = dd4Var.l();
                ou6 ou6VarL06 = s32.L0(dd4Var, ou6VarG);
                dd4Var.j0();
                if (dd4Var.S) {
                    dd4Var.k(um1Var);
                } else {
                    dd4Var.s0();
                }
                un9.s(jmVar, dd4Var, eq8VarA5);
                un9.s(jmVar2, dd4Var, lr7VarL6);
                ky0.v(iHashCode6, dd4Var, jmVar3, dd4Var, kdVar);
                un9.s(jmVar4, dd4Var, ou6VarL06);
                ou6 ou6Var4 = ou6Var2;
                fw.t(i3, ((i7 >> 12) & 14) | 3072, 0L, 0L, jf0.G(778634327, new i51(i3, 8), dd4Var), dd4Var, hq8Var.b(1.0f, t96.w(gjb.n0(tg9.c(ou6Var2, 1.0f), 0.0f, 4.0f, 1), tp8.a), true));
                rj1 rj1VarG = jf0.G(-409164137, new e41(z, 3, (byte) 0), dd4Var);
                rj1 rj1Var = p7c.s;
                boolean z14 = (i11 & 29360128) == 8388608;
                Object objQ11 = dd4Var.Q();
                if (z14 || objQ11 == obj) {
                    objQ11 = new pm6(12, ib4Var);
                    dd4Var.p0(objQ11);
                }
                kc5.o(false, null, ou6Var4, null, null, rj1VarG, rj1Var, (ib4) objQ11, dd4Var, 1769856);
                dd4Var.q(true);
                dd4Var.q(false);
                z8 = z3;
                z9 = true;
            } else {
                ou6 ou6Var5 = ou6Var2;
                int i19 = i6;
                if (z2) {
                    dd4Var.f0(-1030721502);
                    ou6 ou6VarF4 = tg9.f(ou6Var5, 1.0f);
                    eq8 eq8VarA6 = dq8.a(pv.d(), wf0Var4, dd4Var, 6);
                    int iHashCode7 = Long.hashCode(dd4Var.T);
                    lr7 lr7VarL7 = dd4Var.l();
                    ou6 ou6VarL07 = s32.L0(dd4Var, ou6VarF4);
                    dd4Var.j0();
                    if (dd4Var.S) {
                        dd4Var.k(um1Var);
                    } else {
                        dd4Var.s0();
                    }
                    un9.s(jmVar, dd4Var, eq8VarA6);
                    un9.s(jmVar2, dd4Var, lr7VarL7);
                    ky0.v(iHashCode7, dd4Var, jmVar3, dd4Var, kdVar);
                    un9.s(jmVar4, dd4Var, ou6VarL07);
                    p35 p35VarC = i25.c((m53) f53.a0.getValue(), dd4Var, 0);
                    String strK8 = wn9.K((pv9) zu9.V.getValue(), dd4Var);
                    ou6 ou6VarB4 = hq8Var.b(1.0f, ou6Var5, true);
                    boolean z15 = (i11 & 234881024) == 67108864;
                    Object objQ12 = dd4Var.Q();
                    if (z15 || objQ12 == obj) {
                        objQ12 = new pm6(13, ib4Var2);
                        dd4Var.p0(objQ12);
                    }
                    kc5.n(p35VarC, strK8, false, null, ou6VarB4, null, null, null, (ib4) objQ12, dd4Var, 0, 236);
                    ou6 ou6VarB5 = hq8Var.b(1.0f, ou6Var5, true);
                    z8 = z3;
                    rj1 rj1VarG2 = jf0.G(1433300407, new e41(z8, 4, (byte) 0), dd4Var);
                    rj1 rj1Var2 = p7c.t;
                    boolean z16 = (i11 & 1879048192) == 536870912;
                    Object objQ13 = dd4Var.Q();
                    if (z16 || objQ13 == obj) {
                        objQ13 = new pm6(14, ib4Var3);
                        dd4Var.p0(objQ13);
                    }
                    kc5.o(false, null, ou6VarB5, null, null, rj1VarG2, rj1Var2, (ib4) objQ13, dd4Var, 1769472);
                    dd4Var.q(true);
                    dd4Var.q(false);
                } else {
                    z8 = z3;
                    dd4Var.f0(-1028994616);
                    p35 p35VarC2 = i25.c((m53) f53.i0.getValue(), dd4Var, i19);
                    String strK9 = wn9.K((pv9) mu9.W.getValue(), dd4Var);
                    ou6 ou6VarF5 = tg9.f(ou6Var5, 1.0f);
                    boolean zF4 = dd4Var.f(a07Var2) | ((i11 & 3670016) == 1048576) | dd4Var.f(a07Var6) | dd4Var.f(a07Var5);
                    Object objQ14 = dd4Var.Q();
                    if (zF4 || objQ14 == obj) {
                        ri6 ri6Var = new ri6(zb4Var2, a07Var2, a07Var6, a07Var5, 1);
                        dd4Var.p0(ri6Var);
                        objQ14 = ri6Var;
                    }
                    kc5.n(p35VarC2, strK9, false, null, ou6VarF5, null, null, null, (ib4) objQ14, dd4Var, 24576, 236);
                    dd4Var.q(false);
                }
                z9 = true;
            }
            dd4Var.q(z9);
        } else {
            z8 = z3;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            final boolean z17 = z8;
            ye8VarU.d = new yb4(i, i2, z, z2, i3, z17, z4, z5, z6, z7, str, list, ou6Var, zb4Var, kb4Var, kb4Var2, zb4Var2, ib4Var, ib4Var2, ib4Var3, i4) { // from class: qn6
                public final /* synthetic */ kb4 A;
                public final /* synthetic */ kb4 B;
                public final /* synthetic */ zb4 C;
                public final /* synthetic */ ib4 D;
                public final /* synthetic */ ib4 E;
                public final /* synthetic */ ib4 F;
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ int e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean s;
                public final /* synthetic */ boolean t;
                public final /* synthetic */ boolean u;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ String w;
                public final /* synthetic */ List x;
                public final /* synthetic */ ou6 y;
                public final /* synthetic */ zb4 z;

                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(1);
                    wx1.t(this.a, this.b, this.c, this.d, this.e, this.f, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, (dd4) obj2, iX0);
                    return heb.a;
                }
            };
        }
    }

    public static final void u(ou6 ou6Var, dd4 dd4Var, int i) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-530426190);
        if (dd4Var2.V(i & 1, (i & 3) != 2)) {
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
            p35 p35VarC = i25.c((m53) f53.i0.getValue(), dd4Var2, 0);
            long j = s00.o(dd4Var2).a;
            lu6 lu6Var = lu6.a;
            mx4.a(p35VarC, (String) null, gjb.l0(fe.L(t96.w(tg9.n(lu6Var, 72.0f), tp8.a), lc1.c(0.12f, s00.o(dd4Var2).a), jf0.G), 18.0f), j, dd4Var2, 48, 0);
            un9.a(dd4Var2, tg9.h(lu6Var, 16.0f));
            nha.c(wn9.K((pv9) zu9.T.getValue(), dd4Var2), (ou6) null, s00.o(dd4Var2).q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var2).h, dd4Var, 0, 0, 130042);
            un9.a(dd4Var, tg9.h(lu6Var, 8.0f));
            nha.c(wn9.K((pv9) zu9.U.getValue(), dd4Var), (ou6) null, s00.o(dd4Var).s, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 0, 0, (kb4) null, s00.q(dd4Var).k, dd4Var, 0, 0, 130042);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var, i, 15);
        }
    }

    public static final void v(ou6 ou6Var, dd4 dd4Var, int i) {
        dd4Var.h0(-1171117526);
        if (dd4Var.V(i & 1, (i & 3) != 2)) {
            ou6 ou6VarL0 = gjb.l0(fw.G(fe.L(t96.w(ou6Var, s00.p(dd4Var).b), dd1.g(s00.o(dd4Var), 1.0f), jf0.G), 1.0f, dd1.g(s00.o(dd4Var), 4.0f), s00.p(dd4Var).b), 12.0f);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var, 48);
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
            un9.s(ll1.f, dd4Var, eq8VarA);
            un9.s(ll1.e, dd4Var, lr7VarL);
            un9.s(ll1.g, dd4Var, Integer.valueOf(iHashCode));
            un9.r(dd4Var, ll1.h);
            un9.s(ll1.d, dd4Var, ou6VarL02);
            ah1.r(tg9.h(new bp5(1.0f, true), 18.0f), s00.p(dd4Var).a, dd4Var, 0, 0);
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var, tg9.r(lu6Var, 8.0f));
            ah1.r(tg9.o(lu6Var, 40.0f, 18.0f), s00.p(dd4Var).a, dd4Var, 6, 0);
            un9.a(dd4Var, tg9.r(lu6Var, 8.0f));
            ah1.r(tg9.o(lu6Var, 32.0f, 18.0f), s00.p(dd4Var).a, dd4Var, 6, 0);
            un9.a(dd4Var, tg9.r(lu6Var, 8.0f));
            ou6 ou6VarN = tg9.n(lu6Var, 32.0f);
            rp8 rp8Var = tp8.a;
            ah1.r(ou6VarN, rp8Var, dd4Var, 6, 0);
            un9.a(dd4Var, tg9.r(lu6Var, 8.0f));
            ah1.r(tg9.n(lu6Var, 32.0f), rp8Var, dd4Var, 6, 0);
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ot(ou6Var, i, 16);
        }
    }

    public static final void w(final ou6 ou6Var, zk7 zk7Var, final pj7 pj7Var, final lh7 lh7Var, hj9 hj9Var, final boolean z, final ag agVar, int i, final float f, final fk7 fk7Var, n47 n47Var, final vf0 vf0Var, final wf0 wf0Var, final mj9 mj9Var, final rj1 rj1Var, dd4 dd4Var, final int i2, final int i3) {
        int i4;
        int i5;
        n47 n47Var2;
        hj9 hj9Var2;
        zk7 zk7Var2;
        int i6;
        Object pk7Var;
        dd4 dd4Var2;
        lh7 lh7Var2;
        vx1 vx1Var;
        int i7;
        zk7 zk7Var3;
        li5 li5Var;
        jk7 jk7Var;
        boolean z2;
        ou6 ou6VarH;
        int i8;
        ou6 ou6VarE;
        dd4Var.h0(-572816025);
        if ((i2 & 6) == 0) {
            i4 = i2 | (dd4Var.f(ou6Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= dd4Var.f(zk7Var) ? 32 : 16;
        }
        int i9 = i2 & 384;
        int i10 = Token.CASE;
        if (i9 == 0) {
            i4 |= dd4Var.f(pj7Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= dd4Var.g(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= dd4Var.d(lh7Var.ordinal()) ? 16384 : 8192;
        }
        int i11 = i2 & 196608;
        int i12 = Parser.ARGC_LIMIT;
        if (i11 == 0) {
            i4 |= dd4Var.f(hj9Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= dd4Var.g(z) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= dd4Var.f(agVar) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= dd4Var.d(i) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= dd4Var.c(f) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (dd4Var.f(fk7Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= dd4Var.h(n47Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            if (dd4Var.h((Object) null)) {
                i10 = 256;
            }
            i5 |= i10;
        }
        if ((i3 & 3072) == 0) {
            i5 |= dd4Var.f(vf0Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= dd4Var.f(wf0Var) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            if (dd4Var.f(mj9Var)) {
                i12 = 131072;
            }
            i5 |= i12;
        }
        if ((i3 & 1572864) == 0) {
            i5 |= dd4Var.h(rj1Var) ? 1048576 : 524288;
        }
        int i13 = i5;
        if (dd4Var.V(i4 & 1, ((i4 & 306783379) == 306783378 && (599187 & i13) == 599186) ? false : true)) {
            if (i < 0) {
                t75.a("beyondViewportPageCount should be greater than or equal to 0, you selected " + i);
            }
            int i14 = i4 & Token.ASSIGN_MOD;
            boolean z3 = i14 == 32;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z3 || objQ == obj) {
                objQ = new gs5(zk7Var, 0);
                dd4Var.p0(objQ);
            }
            ib4 ib4Var = (ib4) objQ;
            int i15 = i4 >> 3;
            int i16 = i15 & 14;
            int i17 = i13 >> 15;
            int i18 = i16 | (i17 & Token.ASSIGN_MOD) | (i13 & 896);
            a07 a07VarA = dk9.A(rj1Var, dd4Var);
            a07 a07VarA2 = dk9.A((Object) null, dd4Var);
            boolean zF = ((((i18 & 14) ^ 6) > 4 && dd4Var.f(zk7Var)) || (i18 & 6) == 4) | dd4Var.f(a07VarA) | dd4Var.f(a07VarA2) | dd4Var.f(ib4Var);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                ra1 ra1Var = ra1.C;
                objQ2 = new cq5(0, 1, br9.class, dk9.o(new al3(25, dk9.o(new g51(a07VarA, a07VarA2, ib4Var), ra1Var), zk7Var), ra1Var), ES6Iterator.VALUE_PROPERTY, "getValue()Ljava/lang/Object;");
                dd4Var.p0(objQ2);
            }
            li5 li5Var2 = (li5) objQ2;
            Object objQ3 = dd4Var.Q();
            if (objQ3 == obj) {
                objQ3 = lc5.Z(dd4Var);
                dd4Var.p0(objQ3);
            }
            vx1 vx1Var2 = (vx1) objQ3;
            boolean z4 = i14 == 32;
            Object objQ4 = dd4Var.Q();
            if (z4 || objQ4 == obj) {
                objQ4 = new gs5(zk7Var, 1);
                dd4Var.p0(objQ4);
            }
            ib4 ib4Var2 = (ib4) objQ4;
            int i19 = i4 >> 9;
            int i20 = (i4 & 65520) | (i19 & 458752) | (i19 & 3670016) | ((i13 << 21) & 29360128);
            int i21 = i13 << 15;
            int i22 = i20 | (i21 & 234881024) | (i21 & 1879048192);
            boolean zF2 = ((((i22 & 896) ^ 384) > 256 && dd4Var.f(pj7Var)) || (i22 & 384) == 256) | ((((i22 & Token.ASSIGN_MOD) ^ 48) > 32 && dd4Var.f(zk7Var)) || (i22 & 48) == 32) | ((((i22 & 7168) ^ 3072) > 2048 && dd4Var.g(false)) || (i22 & 3072) == 2048) | ((((57344 & i22) ^ 24576) > 16384 && dd4Var.d(lh7Var.ordinal())) || (i22 & 24576) == 16384) | ((((i22 & 234881024) ^ 100663296) > 67108864 && dd4Var.f(vf0Var)) || (i22 & 100663296) == 67108864) | ((((i22 & 1879048192) ^ 805306368) > 536870912 && dd4Var.f(wf0Var)) || (i22 & 805306368) == 536870912) | ((((i22 & 3670016) ^ 1572864) > 1048576 && dd4Var.c(f)) || (i22 & 1572864) == 1048576) | ((((i22 & 29360128) ^ 12582912) > 8388608 && dd4Var.f(fk7Var)) || (i22 & 12582912) == 8388608) | ((((i17 & 14) ^ 6) > 4 && dd4Var.f(mj9Var)) || (i17 & 6) == 4) | dd4Var.f(ib4Var2) | ((((i22 & 458752) ^ 196608) > 131072 && dd4Var.d(i)) || (i22 & 196608) == 131072) | dd4Var.f(vx1Var2);
            Object objQ5 = dd4Var.Q();
            if (zF2 || objQ5 == obj) {
                dd4Var2 = dd4Var;
                i6 = i;
                lh7Var2 = lh7Var;
                vx1Var = vx1Var2;
                i7 = 4;
                pk7Var = new pk7(zk7Var, lh7Var2, pj7Var, f, fk7Var, li5Var2, ib4Var2, wf0Var, vf0Var, i6, mj9Var, vx1Var);
                zk7Var3 = zk7Var;
                li5Var = li5Var2;
                dd4Var2.p0(pk7Var);
            } else {
                vx1Var = vx1Var2;
                pk7Var = objQ5;
                dd4Var2 = dd4Var;
                i6 = i;
                li5Var = li5Var2;
                i7 = 4;
                zk7Var3 = zk7Var;
                lh7Var2 = lh7Var;
            }
            cs5 cs5Var = (cs5) pk7Var;
            lh7 lh7Var3 = lh7.a;
            boolean z5 = lh7Var2 == lh7Var3;
            boolean zG = (((i16 ^ 6) > i7 && dd4Var2.f(zk7Var3)) || (i15 & 6) == i7) | dd4Var2.g(z5);
            Object objQ6 = dd4Var2.Q();
            if (zG || objQ6 == obj) {
                objQ6 = new rs5(zk7Var3, z5);
                dd4Var2.p0(objQ6);
            }
            qs5 qs5Var = (qs5) objQ6;
            boolean z6 = (i14 == 32) | ((i4 & 458752) == 131072);
            Object objQ7 = dd4Var2.Q();
            if (z6 || objQ7 == obj) {
                hj9Var2 = hj9Var;
                objQ7 = new sl7(hj9Var2, zk7Var3);
                dd4Var2.p0(objQ7);
            } else {
                hj9Var2 = hj9Var;
            }
            sl7 sl7Var = (sl7) objQ7;
            ro0 ro0Var = (ro0) dd4Var2.j(to0.a);
            zm5 zm5Var = (zm5) dd4Var2.j(xm1.n);
            li5 li5Var3 = li5Var;
            dd4Var2.f0(-853904960);
            boolean zF3 = (i14 == 32) | dd4Var2.f(ro0Var) | dd4Var2.d(zm5Var.ordinal());
            Object objQ8 = dd4Var2.Q();
            if (zF3 || objQ8 == obj) {
                objQ8 = new jk7(zk7Var3, ro0Var, zm5Var);
                dd4Var2.p0(objQ8);
            }
            jk7 jk7Var2 = (jk7) objQ8;
            dd4Var2.q(false);
            ou6 ou6Var2 = lu6.a;
            if (z) {
                dd4Var2.f0(-853484445);
                int i23 = i16 | ((i4 >> 21) & Token.ASSIGN_MOD);
                jk7Var = jk7Var2;
                boolean z7 = ((((i23 & Token.ASSIGN_MOD) ^ 48) > 32 && dd4Var2.d(i6)) || (i23 & 48) == 32) | ((((i23 & 14) ^ 6) > 4 && dd4Var2.f(zk7Var3)) || (i23 & 6) == 4);
                Object objQ9 = dd4Var2.Q();
                if (z7 || objQ9 == obj) {
                    objQ9 = new ik7(zk7Var3, i6);
                    dd4Var2.p0(objQ9);
                }
                z2 = false;
                ou6VarH = m79.H((ik7) objQ9, zk7Var3.u, false, lh7Var2);
                dd4Var2.q(false);
            } else {
                jk7Var = jk7Var2;
                z2 = false;
                dd4Var2.f0(-853054661);
                dd4Var2.q(false);
                ou6VarH = ou6Var2;
            }
            lh7 lh7Var4 = lh7Var2;
            ou6 ou6VarC0 = t1c.c0(ou6Var.e(zk7Var3.x).e(zk7Var3.v), li5Var3, qs5Var, lh7Var4, z, z2);
            boolean z8 = lh7Var4 == lh7Var3;
            if (z) {
                i8 = 2;
                ou6VarE = ou6VarC0.e(a29.c(ou6Var2, false, new gb0(z8, zk7Var3, vx1Var, i8)));
            } else {
                i8 = 2;
                ou6VarE = ou6VarC0.e(ou6Var2);
            }
            zk7 zk7Var4 = zk7Var3;
            zk7Var2 = zk7Var4;
            n47Var2 = n47Var;
            qx1.e(li5Var3, jv3.L(lc5.g0(ou6VarE.e(ou6VarH), zk7Var4, lh7Var4, agVar, z, z2, sl7Var, zk7Var3.p, jk7Var).e(r1a.b(ou6Var2, zk7Var2, new zf(zk7Var2, i8))), n47Var2, (q47) null), zk7Var2.s, cs5Var, dd4Var2, 0, 0);
        } else {
            n47Var2 = n47Var;
            hj9Var2 = hj9Var;
            zk7Var2 = zk7Var;
            i6 = i;
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            final n47 n47Var3 = n47Var2;
            final zk7 zk7Var5 = zk7Var2;
            final int i24 = i6;
            final hj9 hj9Var3 = hj9Var2;
            ye8VarU.d = new yb4() { // from class: hs5
                @Override // defpackage.yb4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iX0 = qu1.x0(i2 | 1);
                    int iX02 = qu1.x0(i3);
                    wx1.w(ou6Var, zk7Var5, pj7Var, lh7Var, hj9Var3, z, agVar, i24, f, fk7Var, n47Var3, vf0Var, wf0Var, mj9Var, rj1Var, (dd4) obj2, iX0, iX02);
                    return heb.a;
                }
            };
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(java.lang.String r8, ou6 r9, dd4 r10, int r11) {
        /*
            r0 = -607136931(0xffffffffdbcfd35d, float:-1.1699543E17)
            r10.h0(r0)
            boolean r0 = r10.f(r8)
            if (r0 == 0) goto Le
            r0 = 4
            goto Lf
        Le:
            r0 = 2
        Lf:
            r0 = r0 | r11
            boolean r1 = r10.f(r9)
            if (r1 == 0) goto L19
            r1 = 32
            goto L1b
        L19:
            r1 = 16
        L1b:
            r0 = r0 | r1
            r1 = r0 & 19
            r2 = 18
            if (r1 == r2) goto L24
            r1 = 1
            goto L25
        L24:
            r1 = 0
        L25:
            r2 = r0 & 1
            boolean r1 = r10.V(r2, r1)
            if (r1 == 0) goto L97
            int r1 = r8.hashCode()
            switch(r1) {
                case -1240244679: goto L6b;
                case 3023936: goto L59;
                case 93498907: goto L47;
                case 696911194: goto L35;
                default: goto L34;
            }
        L34:
            goto L73
        L35:
            java.lang.String r1 = "duckduckgo"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L3e
            goto L73
        L3e:
            d6a r1 = defpackage.a53.O
            java.lang.Object r1 = r1.getValue()
            m53 r1 = (defpackage.m53) r1
            goto L84
        L47:
            java.lang.String r1 = "baidu"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L50
            goto L73
        L50:
            d6a r1 = defpackage.a53.j
            java.lang.Object r1 = r1.getValue()
            m53 r1 = (defpackage.m53) r1
            goto L84
        L59:
            java.lang.String r1 = "bing"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L62
            goto L73
        L62:
            d6a r1 = defpackage.a53.k
            java.lang.Object r1 = r1.getValue()
            m53 r1 = (defpackage.m53) r1
            goto L84
        L6b:
            java.lang.String r1 = "google"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L7c
        L73:
            d6a r1 = defpackage.h53.v
            java.lang.Object r1 = r1.getValue()
            m53 r1 = (defpackage.m53) r1
            goto L84
        L7c:
            d6a r1 = defpackage.f53.f
            java.lang.Object r1 = r1.getValue()
            m53 r1 = (defpackage.m53) r1
        L84:
            ky4 r2 = defpackage.i25.a(r1, r10)
            int r0 = r0 << 3
            r0 = r0 & 896(0x380, float:1.256E-42)
            r6 = r0 | 24624(0x6030, float:3.4506E-41)
            r7 = 232(0xe8, float:3.25E-43)
            r3 = 0
            r4 = r9
            r5 = r10
            i12.h(r2, r3, r4, r5, r6, r7)
            goto L9c
        L97:
            r4 = r9
            r5 = r10
            r5.Y()
        L9c:
            ye8 r9 = r5.u()
            if (r9 == 0) goto Laa
            b7 r10 = new b7
            r0 = 7
            r10.<init>(r8, r4, r11, r0)
            r9.d = r10
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx1.x(java.lang.String, ou6, dd4, int):void");
    }

    public static final void y(int i, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, ou6 ou6Var, String str) {
        dd4 dd4Var2 = dd4Var;
        str.getClass();
        ib4Var.getClass();
        ib4Var2.getClass();
        dd4Var2.h0(-2113981260);
        int i2 = i | (dd4Var2.f(str) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE) | (dd4Var2.h(ib4Var2) ? 2048 : 1024);
        if (dd4Var2.V(i2 & 1, (i2 & 1171) != 1170)) {
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
            p35 p35VarC = i25.c((m53) f53.i.getValue(), dd4Var2, 0);
            String strK = wn9.K((pv9) iu9.n.getValue(), dd4Var2);
            lu6 lu6Var = lu6.a;
            ou6 ou6VarW = t96.w(tg9.n(lu6Var, 28.0f), tp8.a);
            ur9 ur9Var = s96.a;
            mx4.a(p35VarC, strK, gjb.l0(fe.L(ou6VarW, dd1.g(((q96) dd4Var2.j(ur9Var)).a, 6.0f), jf0.G), 4.0f), 0L, dd4Var2, 0, 8);
            nha.c(str, j39.f(lu6Var, 12.0f, dd4Var2, 1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.k, dd4Var, i2 & 14, 0, 130044);
            dd4Var2 = dd4Var;
            un9.a(dd4Var2, tg9.r(lu6Var, 12.0f));
            p35 p35VarC2 = i25.c((m53) a53.g.getValue(), dd4Var2, 0);
            d6a d6aVar = iu9.Q;
            String strK2 = wn9.K((pv9) d6aVar.getValue(), dd4Var2);
            ou6 ou6VarN = tg9.n(lu6Var, 24.0f);
            boolean z = (i2 & 896) == 256;
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z || objQ == obj) {
                objQ = new i35(16, ib4Var);
                dd4Var2.p0(objQ);
            }
            mx4.a(p35VarC2, strK2, fw.J(null, (ib4) objQ, ou6VarN, false, 15), 0L, dd4Var2, 0, 8);
            un9.a(dd4Var2, tg9.r(lu6Var, 12.0f));
            p35 p35VarC3 = i25.c((m53) a53.H.getValue(), dd4Var2, 0);
            String strK3 = wn9.K((pv9) d6aVar.getValue(), dd4Var2);
            ou6 ou6VarN2 = tg9.n(lu6Var, 24.0f);
            boolean z2 = (i2 & 7168) == 2048;
            Object objQ2 = dd4Var2.Q();
            if (z2 || objQ2 == obj) {
                objQ2 = new i35(17, ib4Var2);
                dd4Var2.p0(objQ2);
            }
            mx4.a(p35VarC3, strK3, gjb.l0(fw.J(null, (ib4) objQ2, ou6VarN2, false, 15), 2.0f), 0L, dd4Var2, 0, 8);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xf1(str, ou6Var, ib4Var, ib4Var2, i, 8);
        }
    }

    public static final void z(int i, ib4 ib4Var, ib4 ib4Var2, dd4 dd4Var, ou6 ou6Var, String str) {
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-509916155);
        int i2 = i | (dd4Var2.f(str) ? 4 : 2) | (dd4Var.f(ou6Var) ? 32 : 16) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE) | (dd4Var2.h(ib4Var2) ? 2048 : 1024);
        if (dd4Var2.V(i2 & 1, (i2 & 1171) != 1170)) {
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
            p35 p35VarC = i25.c((m53) f53.i.getValue(), dd4Var2, 0);
            String strK = wn9.K((pv9) iu9.n.getValue(), dd4Var2);
            lu6 lu6Var = lu6.a;
            ou6 ou6VarW = t96.w(tg9.n(lu6Var, 28.0f), tp8.a);
            ur9 ur9Var = s96.a;
            mx4.a(p35VarC, strK, gjb.l0(fe.L(ou6VarW, dd1.g(((q96) dd4Var2.j(ur9Var)).a, 6.0f), jf0.G), 4.0f), 0L, dd4Var2, 0, 8);
            nha.c(str, j39.f(lu6Var, 12.0f, dd4Var2, 1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(5), 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.k, dd4Var, i2 & 14, 0, 130044);
            dd4Var2 = dd4Var;
            un9.a(dd4Var2, tg9.r(lu6Var, 12.0f));
            p35 p35VarC2 = i25.c((m53) a53.g.getValue(), dd4Var2, 0);
            d6a d6aVar = iu9.Q;
            String strK2 = wn9.K((pv9) d6aVar.getValue(), dd4Var2);
            ou6 ou6VarN = tg9.n(lu6Var, 24.0f);
            boolean z = (i2 & 896) == 256;
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z || objQ == obj) {
                objQ = new i35(7, ib4Var);
                dd4Var2.p0(objQ);
            }
            mx4.a(p35VarC2, strK2, fw.J(null, (ib4) objQ, ou6VarN, false, 15), 0L, dd4Var2, 0, 8);
            un9.a(dd4Var2, tg9.r(lu6Var, 12.0f));
            p35 p35VarC3 = i25.c((m53) a53.H.getValue(), dd4Var2, 0);
            String strK3 = wn9.K((pv9) d6aVar.getValue(), dd4Var2);
            ou6 ou6VarN2 = tg9.n(lu6Var, 24.0f);
            boolean z2 = (i2 & 7168) == 2048;
            Object objQ2 = dd4Var2.Q();
            if (z2 || objQ2 == obj) {
                objQ2 = new i35(8, ib4Var2);
                dd4Var2.p0(objQ2);
            }
            mx4.a(p35VarC3, strK3, gjb.l0(fw.J(null, (ib4) objQ2, ou6VarN2, false, 15), 2.0f), 0L, dd4Var2, 0, 8);
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xf1(str, ou6Var, ib4Var, ib4Var2, i, 6);
        }
    }

    public abstract boolean Z(gi8 gi8Var);

    public abstract Object e0(gi8 gi8Var);
}

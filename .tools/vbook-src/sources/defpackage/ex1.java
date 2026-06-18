package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ex1 {
    public static p35 a;
    public static p35 b;

    public static void A(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            gp.l(str2);
        }
    }

    public static void B(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        gp.j(str);
    }

    public static void C(Object obj) {
        if (obj != null) {
            return;
        }
        k27.n("null reference");
    }

    public static void D(Object obj, String str) {
        if (obj != null) {
            return;
        }
        k27.n(str);
    }

    public static void E(String str, boolean z) {
        if (z) {
            return;
        }
        gp.j(str);
    }

    public static void F(boolean z) {
        if (z) {
            return;
        }
        j31.d();
    }

    public static byte[] G(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static long H(long j, io5 io5Var) {
        io5 io5Var2 = io5.a;
        return vp1.a(io5Var == io5Var2 ? up1.k(j) : up1.j(j), io5Var == io5Var2 ? up1.i(j) : up1.h(j), io5Var == io5Var2 ? up1.j(j) : up1.k(j), io5Var == io5Var2 ? up1.h(j) : up1.i(j));
    }

    public static tz6 I() {
        long[] jArr = ju8.a;
        return new tz6();
    }

    public static long J(int i, long j) {
        return vp1.a(0, up1.i(j), (i & 4) != 0 ? up1.j(j) : 0, up1.h(j));
    }

    public static void K(Object obj, String str, String str2) {
        String strT = T(str);
        if (Log.isLoggable(strT, 3)) {
            Log.d(strT, String.format(str2, obj));
        }
    }

    public static ou6 L(xi8 xi8Var, ou6 ou6Var, ib4 ib4Var) {
        td3 td3Var = td3.N;
        zk4 zk4Var = zk4.d;
        xi8Var.getClass();
        ou6Var.getClass();
        ib4Var.getClass();
        return s32.X(ou6Var, new dn(xi8Var, zk4Var, td3Var, ib4Var, 1));
    }

    public static void M(Exception exc, String str, String str2) {
        String strT = T(str);
        if (Log.isLoggable(strT, 6)) {
            Log.e(strT, str2, exc);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r1.b(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0054, B:29:0x0069, B:31:0x0071, B:20:0x0045, B:24:0x0050), top: B:45:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N(defpackage.c24 r7, defpackage.h11 r8, boolean r9, defpackage.jt1 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.h24
            if (r0 == 0) goto L13
            r0 = r10
            h24 r0 = (defpackage.h24) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            h24 r0 = new h24
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.e
            int r1 = r0.f
            r2 = 0
            r3 = 2
            r4 = 1
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L49
            if (r1 == r4) goto L3d
            if (r1 != r3) goto L37
            boolean r9 = r0.d
            br0 r7 = r0.c
            h11 r8 = r0.b
            c24 r1 = r0.a
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L54
        L35:
            r7 = move-exception
            goto L8e
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            return r2
        L3d:
            boolean r9 = r0.d
            br0 r7 = r0.c
            h11 r8 = r0.b
            c24 r1 = r0.a
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L35
            goto L69
        L49:
            defpackage.e11.e0(r10)
            boolean r10 = r7 instanceof defpackage.rsa
            if (r10 != 0) goto L96
            br0 r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L54:
            r0.a = r7     // Catch: java.lang.Throwable -> L35
            r0.b = r8     // Catch: java.lang.Throwable -> L35
            r0.c = r10     // Catch: java.lang.Throwable -> L35
            r0.d = r9     // Catch: java.lang.Throwable -> L35
            r0.f = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L65
            goto L85
        L65:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L86
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.a = r1     // Catch: java.lang.Throwable -> L35
            r0.b = r8     // Catch: java.lang.Throwable -> L35
            r0.c = r7     // Catch: java.lang.Throwable -> L35
            r0.d = r9     // Catch: java.lang.Throwable -> L35
            r0.f = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.b(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L85:
            return r5
        L86:
            if (r9 == 0) goto L8b
            r8.cancel(r2)
        L8b:
            heb r7 = defpackage.heb.a
            return r7
        L8e:
            throw r7     // Catch: java.lang.Throwable -> L8f
        L8f:
            r10 = move-exception
            if (r9 == 0) goto L95
            defpackage.kl8.P(r8, r7)
        L95:
            throw r10
        L96:
            rsa r7 = (defpackage.rsa) r7
            java.lang.Throwable r7 = r7.a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex1.N(c24, h11, boolean, jt1):java.lang.Object");
    }

    public static final dc2 O(de7 de7Var, String str) {
        de7Var.getClass();
        String strP = wm9.p();
        String str2 = de7Var.a;
        String str3 = de7Var.b;
        int i = de7Var.c == 2 ? 1 : 0;
        long j = de7Var.d;
        return new dc2(strP, str, str2, str3, 1, i, j, j);
    }

    public static final dc2 P(ge7 ge7Var, String str) {
        ge7Var.getClass();
        String strP = wm9.p();
        String str2 = ge7Var.a;
        String str3 = ge7Var.b;
        Pattern patternCompile = Pattern.compile("[|/]");
        patternCompile.getClass();
        str3.getClass();
        String strReplaceAll = patternCompile.matcher(str3).replaceAll("¦");
        strReplaceAll.getClass();
        int i = ge7Var.c == 2 ? 1 : 0;
        long j = ge7Var.e;
        return new dc2(strP, str, str2, strReplaceAll, 0, i, j, j);
    }

    public static /* synthetic */ b24 Q(mc4 mc4Var, jx1 jx1Var, int i, ar0 ar0Var, int i2) {
        if ((i2 & 1) != 0) {
            jx1Var = hc3.a;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            ar0Var = ar0.a;
        }
        return mc4Var.c(jx1Var, i, ar0Var);
    }

    public static int R(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static final float S(zv5 zv5Var) {
        zv5Var.getClass();
        int i = zv5Var.u;
        if (i <= 0) {
            return 0.0f;
        }
        return (float) (((((double) wx1.Q(zv5Var.s, 0, i - 1)) + wx1.O(zv5Var.t, 0.0d, 1.0d)) * 100.0d) / ((double) i));
    }

    public static String T(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static final void U(p43 p43Var) {
        if (((nu6) p43Var).a.z) {
            vw1.P(p43Var, 1).m1();
        }
    }

    public static final boolean V(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = dx1.A(f8, f26, (f6 * f28) - (f7 * f27), f30);
            fArr2[1] = tw2.b(f4, f26, (f3 * f27) + ((-f2) * f28), f30);
            fArr2[2] = dx1.A(f16, f20, (f14 * f22) - (f15 * f21), f30);
            fArr2[3] = tw2.b(f12, f20, (f11 * f21) + ((-f10) * f22), f30);
            float f31 = -f5;
            fArr2[4] = tw2.b(f8, f24, (f7 * f25) + (f31 * f28), f30);
            fArr2[5] = dx1.A(f4, f24, (f28 * f) - (f3 * f25), f30);
            float f32 = -f13;
            fArr2[6] = tw2.b(f16, f18, (f15 * f19) + (f32 * f22), f30);
            fArr2[7] = dx1.A(f12, f18, (f9 * f22) - (f11 * f19), f30);
            fArr2[8] = dx1.A(f8, f23, (f5 * f27) - (f6 * f25), f30);
            fArr2[9] = tw2.b(f4, f23, (f25 * f2) + ((-f) * f27), f30);
            fArr2[10] = dx1.A(f16, f17, (f13 * f21) - (f14 * f19), f30);
            fArr2[11] = tw2.b(f12, f17, (f19 * f10) + ((-f9) * f21), f30);
            fArr2[12] = tw2.b(f7, f23, (f6 * f24) + (f31 * f26), f30);
            fArr2[13] = dx1.A(f3, f23, (f * f26) - (f2 * f24), f30);
            fArr2[14] = tw2.b(f15, f17, (f14 * f18) + (f32 * f20), f30);
            fArr2[15] = dx1.A(f11, f17, (f9 * f20) - (f10 * f18), f30);
        }
        return !(f29 == 0.0f);
    }

    public static final boolean W(zv5 zv5Var) {
        zv5Var.getClass();
        return lc5.Q(zv5Var.B.get("hide_chapter_name"), "true");
    }

    public static final boolean X(zv5 zv5Var) {
        int i;
        zv5Var.getClass();
        int i2 = zv5Var.f;
        return (i2 == 10 || i2 == 20 || (i = zv5Var.e) == 4 || i == 3) ? false : true;
    }

    public static b39 Y(yb4 yb4Var) {
        b39 b39Var = new b39();
        b39Var.d = bx1.C(b39Var, b39Var, yb4Var);
        return b39Var;
    }

    public static dp5 Z(xu5 xu5Var, ib4 ib4Var) {
        zk4 zk4Var = zk4.y;
        int iOrdinal = xu5Var.ordinal();
        if (iOrdinal == 0) {
            return new d6a(ib4Var);
        }
        if (iOrdinal == 1) {
            sr8 sr8Var = new sr8();
            sr8Var.a = ib4Var;
            sr8Var.b = zk4Var;
            return sr8Var;
        }
        if (iOrdinal != 2) {
            mn5.g();
            return null;
        }
        yeb yebVar = new yeb();
        yebVar.a = ib4Var;
        yebVar.b = zk4Var;
        return yebVar;
    }

    public static final void a(int i, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, String str, boolean z) {
        lc1 pm8Var;
        dd4Var.h0(1106478229);
        int i2 = (dd4Var.h(kb4Var2) ? 2048 : 1024) | i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(str) ? 32 : 16);
        byte b2 = 0;
        int i3 = 1;
        if (dd4Var.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                int length = str.length();
                objQ = dk9.x(new wga(upperCase, zk9.h(length, length), 4));
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            boolean zF = dd4Var.f(((wga) a07Var.getValue()).a.b);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                try {
                    pm8Var = new lc1(kf0.H(((wga) a07Var.getValue()).a.b));
                } catch (Throwable th) {
                    pm8Var = new pm8(th);
                }
                objQ2 = Boolean.valueOf(pm8Var instanceof pm8);
                dd4Var.p0(objQ2);
            }
            boolean zBooleanValue = ((Boolean) objQ2).booleanValue();
            z8.d(z, kb4Var, jf0.G(-1911644223, new xi6(zBooleanValue, kb4Var2, a07Var, i3), dd4Var), null, yib.E(lu6.a, 14), jf0.G(-1148911714, new gs6(kb4Var, 12, b2), dd4Var), gjb.o, null, 0L, 0L, 0.0f, false, false, jf0.G(1382762089, new yi6(zBooleanValue, a07Var, i3), dd4Var), dd4Var, (i2 & 14) | 1769904, 8072);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new vl3(z, str, kb4Var, kb4Var2, i, 2);
        }
    }

    public static d6a a0(ib4 ib4Var) {
        ib4Var.getClass();
        return new d6a(ib4Var);
    }

    public static final void b(String str, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i) {
        boolean z;
        Object obj;
        int i2;
        Object obj2;
        a07 a07Var;
        Object obj3;
        dd4Var.h0(-942028821);
        int i3 = i | (dd4Var.f(str) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= dd4Var.f(ou6Var) ? 32 : 16;
        }
        int i4 = i3 | (dd4Var.h(kb4Var) ? 256 : Token.CASE);
        if (dd4Var.V(i4 & 1, (i4 & Token.EXPR_VOID) != 146)) {
            a07 a07VarA = dk9.A(kb4Var, dd4Var);
            boolean z2 = (i4 & 14) == 4;
            Object objQ = dd4Var.Q();
            fu6 fu6Var = vl1.a;
            Object obj4 = objQ;
            if (z2 || objQ == fu6Var) {
                cn7 cn7VarX = dk9.x(ny1.F(kf0.H(str)));
                dd4Var.p0(cn7VarX);
                obj4 = cn7VarX;
            }
            a07 a07Var2 = (a07) obj4;
            boolean zF = dd4Var.f((xp4) a07Var2.getValue());
            Object objQ2 = dd4Var.Q();
            Object obj5 = objQ2;
            if (zF || objQ2 == fu6Var) {
                cn7 cn7VarX2 = dk9.x(new lc1(e11.f0((xp4) a07Var2.getValue())));
                dd4Var.p0(cn7VarX2);
                obj5 = cn7VarX2;
            }
            a07 a07Var3 = (a07) obj5;
            Object objQ3 = dd4Var.Q();
            Object obj6 = objQ3;
            if (objQ3 == fu6Var) {
                cn7 cn7VarX3 = dk9.x(Boolean.FALSE);
                dd4Var.p0(cn7VarX3);
                obj6 = cn7VarX3;
            }
            a07 a07Var4 = (a07) obj6;
            Object objQ4 = dd4Var.Q();
            Object obj7 = objQ4;
            if (objQ4 == fu6Var) {
                b4c b4cVarI = qx1.i();
                dd4Var.p0(b4cVarI);
                obj7 = b4cVarI;
            }
            vb8 vb8Var = (vb8) obj7;
            ou6 ou6VarN0 = gjb.n0(ou6Var, 24.0f, 0.0f, 2);
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var, 0);
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
            lu6 lu6Var = lu6.a;
            ou6 ou6VarF = tg9.f(lu6Var, 1.0f);
            wf0 wf0Var = bv4.w;
            iv ivVar = pv.a;
            eq8 eq8VarA = dq8.a(ivVar, wf0Var, dd4Var, 0);
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
            ou6 ou6VarN = tg9.n(lu6Var, 56.0f);
            ur9 ur9Var = s96.a;
            ou6 ou6VarW = t96.w(ou6VarN, ((q96) dd4Var.j(ur9Var)).c.c);
            long j = ((lc1) a07Var3.getValue()).a;
            lp4 lp4Var = jf0.G;
            ou6 ou6VarL = fe.L(ou6VarW, j, lp4Var);
            boolean zF2 = dd4Var.f(a07Var2) | dd4Var.h(vb8Var);
            Object objQ5 = dd4Var.Q();
            Object obj8 = objQ5;
            if (zF2 || objQ5 == fu6Var) {
                bj6 bj6Var = new bj6(vb8Var, a07Var2, 1);
                dd4Var.p0(bj6Var);
                obj8 = bj6Var;
            }
            ou6 ou6VarJ = fw.J(null, (ib4) obj8, ou6VarL, false, 15);
            ha6 ha6VarD = pn0.d(bv4.f, false);
            int iHashCode3 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL3 = dd4Var.l();
            ou6 ou6VarL03 = s32.L0(dd4Var, ou6VarJ);
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
            mx4.a(i25.c((m53) f53.n0.getValue(), dd4Var, 0), (String) null, (ou6) null, dd1.b(((lc1) a07Var3.getValue()).a, dd4Var), dd4Var, 48, 4);
            ky0.A(dd4Var, true, lu6Var, 16.0f, dd4Var);
            ga1 ga1Var = (ga1) dd4Var.j(xm1.f);
            Object objQ6 = dd4Var.Q();
            Object obj9 = objQ6;
            if (objQ6 == fu6Var) {
                vx1 vx1VarZ = lc5.Z(dd4Var);
                dd4Var.p0(vx1VarZ);
                obj9 = vx1VarZ;
            }
            vx1 vx1Var = (vx1) obj9;
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            ou6 ou6VarL2 = fe.L(t96.w(tg9.h(new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 56.0f), ((q96) dd4Var.j(ur9Var)).c.c), dd1.g(((q96) dd4Var.j(ur9Var)).a, 6.0f), lp4Var);
            Object objQ7 = dd4Var.Q();
            Object obj10 = objQ7;
            if (objQ7 == fu6Var) {
                lz4 lz4Var = new lz4(a07Var4, 18);
                dd4Var.p0(lz4Var);
                obj10 = lz4Var;
            }
            ou6 ou6VarN02 = gjb.n0(fw.J(null, (ib4) obj10, ou6VarL2, false, 15), 12.0f, 0.0f, 2);
            eq8 eq8VarA2 = dq8.a(ivVar, bv4.x, dd4Var, 48);
            int iHashCode4 = Long.hashCode(dd4Var.T);
            lr7 lr7VarL4 = dd4Var.l();
            ou6 ou6VarL04 = s32.L0(dd4Var, ou6VarN02);
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
            boolean zE = dd4Var.e(((lc1) a07Var3.getValue()).a);
            Object objQ8 = dd4Var.Q();
            if (zE || objQ8 == fu6Var) {
                z = false;
                String upperCase = kf0.X(((lc1) a07Var3.getValue()).a, true, false).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                dd4Var.p0(upperCase);
                obj = upperCase;
            } else {
                z = false;
                obj = objQ8;
            }
            String str2 = (String) obj;
            uka ukaVar = ((q96) dd4Var.j(ur9Var)).b.h;
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            boolean z3 = z;
            nha.c(str2, new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ukaVar, dd4Var, 0, 0, 131068);
            p35 p35VarC = i25.c((m53) a53.C.getValue(), dd4Var, z3 ? 1 : 0);
            ou6 ou6VarN2 = tg9.n(lu6Var, 44.0f);
            rp8 rp8Var = tp8.a;
            ou6 ou6VarW2 = t96.w(ou6VarN2, rp8Var);
            boolean zH = dd4Var.h(vx1Var) | dd4Var.h(ga1Var) | dd4Var.f(a07Var3);
            Object objQ9 = dd4Var.Q();
            if (zH || objQ9 == fu6Var) {
                i2 = 1;
                cj6 cj6Var = new cj6(vx1Var, ga1Var, a07Var3, i2);
                dd4Var.p0(cj6Var);
                obj2 = cj6Var;
            } else {
                i2 = 1;
                obj2 = objQ9;
            }
            mx4.a(p35VarC, (String) null, gjb.l0(fw.J(null, (ib4) obj2, ou6VarW2, z3, 15), 10.0f), 0L, dd4Var, 48, 8);
            p35 p35VarC2 = i25.c((m53) f53.g0.getValue(), dd4Var, z3 ? 1 : 0);
            ou6 ou6VarW3 = t96.w(tg9.n(lu6Var, 44.0f), rp8Var);
            boolean zF3 = dd4Var.f(a07VarA) | dd4Var.f(a07Var3);
            Object objQ10 = dd4Var.Q();
            Object obj11 = objQ10;
            if (zF3 || objQ10 == fu6Var) {
                x41 x41Var = new x41(a07VarA, a07Var3, 13);
                dd4Var.p0(x41Var);
                obj11 = x41Var;
            }
            mx4.a(p35VarC2, (String) null, gjb.l0(fw.J(null, (ib4) obj11, ou6VarW3, z3, 15), 10.0f), 0L, dd4Var, 48, 8);
            un9.a(dd4Var, xv5.g(dd4Var, true, true, lu6Var, 16.0f));
            xp4 xp4Var = (xp4) a07Var2.getValue();
            ou6 ou6VarE0 = sdc.e0(1.2f, tg9.f(lu6Var, 1.0f), z3);
            boolean zF4 = dd4Var.f(a07Var3);
            Object objQ11 = dd4Var.Q();
            Object obj12 = objQ11;
            if (zF4 || objQ11 == fu6Var) {
                ci6 ci6Var = new ci6(a07Var3, 10);
                dd4Var.p0(ci6Var);
                obj12 = ci6Var;
            }
            lc5.f(ou6VarE0, xp4Var, false, (kb4) obj12, dd4Var, 390);
            un9.a(dd4Var, tg9.h(lu6Var, 24.0f));
            dd4Var.q(true);
            boolean zBooleanValue = ((Boolean) a07Var4.getValue()).booleanValue();
            boolean zE2 = dd4Var.e(((lc1) a07Var3.getValue()).a);
            Object objQ12 = dd4Var.Q();
            Object obj13 = objQ12;
            if (zE2 || objQ12 == fu6Var) {
                String strX = kf0.X(((lc1) a07Var3.getValue()).a, true, z3);
                dd4Var.p0(strX);
                obj13 = strX;
            }
            String str3 = (String) obj13;
            Object objQ13 = dd4Var.Q();
            if (objQ13 == fu6Var) {
                a07Var = a07Var4;
                ci6 ci6Var2 = new ci6(a07Var, 12);
                dd4Var.p0(ci6Var2);
                obj3 = ci6Var2;
            } else {
                a07Var = a07Var4;
                obj3 = objQ13;
            }
            kb4 kb4Var2 = (kb4) obj3;
            boolean zF5 = dd4Var.f(a07Var2);
            Object objQ14 = dd4Var.Q();
            Object obj14 = objQ14;
            if (zF5 || objQ14 == fu6Var) {
                rl0 rl0Var = new rl0(a07Var2, a07Var, 16);
                dd4Var.p0(rl0Var);
                obj14 = rl0Var;
            }
            a(384, kb4Var2, (kb4) obj14, dd4Var, str3, zBooleanValue);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new wi6(str, ou6Var, kb4Var, i, 0);
        }
    }

    public static final ia6 b0(aq8 aq8Var, int i, int i2, int i3, int i4, int i5, ja6 ja6Var, List list, jt7[] jt7VarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        float f;
        long j;
        int i10;
        int i11;
        int i12;
        List list2 = list;
        long j2 = i5;
        int i13 = i7 - i6;
        int[] iArr2 = new int[i13];
        int i14 = i6;
        int iMax = 0;
        int i15 = 0;
        int i16 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i14 < i7) {
            ca6 ca6Var = (ca6) list2.get(i14);
            float fB0 = cx1.b0(cx1.Z(ca6Var));
            if (fB0 > 0.0f) {
                f2 += fB0;
                i15++;
                j = j2;
                i10 = i14;
            } else {
                int i17 = i3 - i16;
                jt7 jt7VarC = jt7VarArr[i14];
                j = j2;
                if (jt7VarC == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i10 = i14;
                        i11 = i15;
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i10 = i14;
                        i11 = i15;
                        i12 = i17 < 0 ? 0 : i17;
                    }
                    jt7VarC = ca6Var.C(aq8Var.c(0, i12, i4, false));
                } else {
                    i10 = i14;
                    i11 = i15;
                }
                jt7 jt7Var = jt7VarC;
                int iJ = aq8Var.j(jt7Var);
                int iH = aq8Var.h(jt7Var);
                iArr2[i10 - i6] = iJ;
                int i18 = i17 - iJ;
                if (i18 < 0) {
                    i18 = 0;
                }
                iMin = Math.min(i5, i18);
                i16 += iJ + iMin;
                iMax = Math.max(iMax, iH);
                jt7VarArr[i10] = jt7Var;
                i15 = i11;
            }
            i14 = i10 + 1;
            j2 = j;
        }
        long j3 = j2;
        int i19 = i15;
        if (i19 == 0) {
            i16 -= iMin;
            i9 = 0;
        } else {
            long j4 = ((long) (i19 - 1)) * j3;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i16)) - j4;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            for (int i20 = i6; i20 < i7; i20++) {
                jRound -= (long) Math.round(cx1.b0(cx1.Z((ca6) list2.get(i20))) * f3);
            }
            int i21 = i6;
            int i22 = iMax;
            int i23 = 0;
            while (i21 < i7) {
                if (jt7VarArr[i21] == null) {
                    ca6 ca6Var2 = (ca6) list2.get(i21);
                    f = f3;
                    bq8 bq8VarZ = cx1.Z(ca6Var2);
                    float fB02 = cx1.b0(bq8VarZ);
                    if (fB02 <= 0.0f) {
                        o75.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j5 = jRound - ((long) iSignum);
                    int iMax2 = Math.max(0, Math.round(fB02 * f) + iSignum);
                    jt7 jt7VarC2 = ca6Var2.C(aq8Var.c((!(bq8VarZ != null ? bq8VarZ.b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int iJ2 = aq8Var.j(jt7VarC2);
                    int iH2 = aq8Var.h(jt7VarC2);
                    iArr2[i21 - i6] = iJ2;
                    i23 += iJ2;
                    int iMax3 = Math.max(i22, iH2);
                    jt7VarArr[i21] = jt7VarC2;
                    i22 = iMax3;
                    jRound = j5;
                } else {
                    f = f3;
                }
                i21++;
                list2 = list;
                f3 = f;
            }
            i9 = (int) (((long) i23) + j4);
            int i24 = i3 - i16;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i24) {
                i9 = i24;
            }
            iMax = i22;
        }
        int i25 = i9 + i16;
        if (i25 < 0) {
            i25 = 0;
        }
        int iMax4 = Math.max(i25, i);
        int iMax5 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr3 = new int[i13];
        aq8Var.b(iMax4, iArr2, iArr3, ja6Var);
        return aq8Var.f(jt7VarArr, ja6Var, iArr3, iMax4, iMax5, iArr, i8, i6, i7);
    }

    public static sn2 c() {
        return new sn2(1.0f, 1.0f);
    }

    public static ma6 c0(zk4 zk4Var, wp8 wp8Var) {
        List listY;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list = wp8Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            eu3 eu3Var = (eu3) list.get(i);
            List list2 = eu3Var.a;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if ((eu3Var instanceof au3) && i2 == list2.size() / 2) {
                    arrayList2.add(new xl7(eu3Var, Integer.valueOf(arrayList.size())));
                }
                arrayList.add(list2.get(i2));
            }
        }
        Float fValueOf = Float.valueOf(0.0f);
        int iM = gc1.M(arrayList, 9);
        if (iM == 0) {
            listY = gc1.Y(fValueOf);
        } else {
            ArrayList arrayList3 = new ArrayList(iM + 1);
            arrayList3.add(fValueOf);
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj = arrayList.get(i3);
                i3++;
                z12 z12Var = (z12) obj;
                float fFloatValue = fValueOf.floatValue();
                z12Var.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (zk4.f(z12Var, Float.POSITIVE_INFINITY) & 4294967295L));
                if (fIntBitsToFloat < 0.0f) {
                    gp.l("Measured cubic is expected to be greater or equal to zero");
                    return null;
                }
                fValueOf = Float.valueOf(fFloatValue + fIntBitsToFloat);
                arrayList3.add(fValueOf);
            }
            listY = arrayList3;
        }
        float fFloatValue2 = ((Number) fc1.E0(listY)).floatValue();
        ty6 ty6Var = new ty6(listY.size());
        int size4 = listY.size();
        for (int i4 = 0; i4 < size4; i4++) {
            ty6Var.a(((Number) listY.get(i4)).floatValue() / fFloatValue2);
        }
        zy5 zy5VarN = gc1.N();
        int size5 = arrayList2.size();
        for (int i5 = 0; i5 < size5; i5++) {
            int iIntValue = ((Number) ((xl7) arrayList2.get(i5)).b).intValue();
            zy5VarN.add(new i48(kjb.c((ty6Var.b(iIntValue + 1) + ty6Var.b(iIntValue)) / 2.0f), (eu3) ((xl7) arrayList2.get(i5)).a));
        }
        return new ma6(zk4Var, gc1.J(zy5VarN), arrayList, ty6Var);
    }

    public static final void d(int i, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, String str, boolean z) {
        dd4Var.h0(420601488);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(str) ? 32 : 16) | (dd4Var.h(kb4Var2) ? 2048 : 1024);
        int i3 = 1;
        if (dd4Var.V(i2 & 1, (i2 & 1171) != 1170)) {
            fw.q(z, kb4Var, null, true, null, null, 0L, 0L, 0.0f, 0L, null, jf0.G(-580506388, new aj6(i3, kb4Var2, str), dd4Var), dd4Var, (i2 & 14) | 3120, 48, 2036);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new vl3(z, str, kb4Var, kb4Var2, i, 5);
        }
    }

    public static byte[] d0(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                gp.j(dx1.f(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    public static final void e(int i, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, String str, boolean z) {
        dd4Var.h0(1719696648);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(str) ? 32 : 16) | (dd4Var.h(kb4Var2) ? 2048 : 1024);
        int i3 = 1;
        if (dd4Var.V(i2 & 1, (i2 & 1171) != 1170)) {
            z8.d(z, kb4Var, null, null, null, null, null, null, 0L, 0L, 0.0f, false, false, jf0.G(-76102476, new vi6(i3, kb4Var2, str), dd4Var), dd4Var, (i2 & 14) | 48, 8188);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new vl3(z, str, kb4Var, kb4Var2, i, 4);
        }
    }

    public static byte[] e0(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static final void f(boolean z, String str, lm8 lm8Var, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, int i) {
        lm8 lm8Var2;
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var.h0(-160793606);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(str) ? 32 : 16) | 384 | (dd4Var.h(kb4Var2) ? 16384 : 8192);
        if (dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 & 14;
            boolean z2 = (i3 == 4) | ((i2 & Token.ASSIGN_MOD) == 32);
            Object objQ = dd4Var.Q();
            lm8 lm8Var3 = lm8.b;
            if (z2 || objQ == vl1.a) {
                objQ = dk9.x(lm8Var3);
                dd4Var.p0(objQ);
            }
            z8.a(z, kb4Var, null, null, null, null, jf0.G(655876429, new z31(str, 15), dd4Var), null, 0L, 0L, 0.0f, null, null, null, false, false, jf0.G(1297164758, new nb3((a07) objQ, kb4Var2), dd4Var), dd4Var, i3 | 1572912, 1572864, 65468);
            lm8Var2 = lm8Var3;
        } else {
            dd4Var.Y();
            lm8Var2 = lm8Var;
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new z41(z, str, lm8Var2, kb4Var, kb4Var2, i, 6);
        }
    }

    public static long f0(InputStream inputStream, int i) throws IOException {
        byte[] bArrD0 = d0(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrD0[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    public static final void g(int i, kb4 kb4Var, kb4 kb4Var2, dd4 dd4Var, String str, boolean z) {
        str.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        dd4Var.h0(749574948);
        int i2 = (dd4Var.g(z) ? 4 : 2) | i | (dd4Var.f(str) ? 32 : 16) | (dd4Var.h(kb4Var2) ? 2048 : 1024);
        if (!dd4Var.V(i2 & 1, (i2 & 1171) != 1170)) {
            dd4Var.Y();
        } else if (xzb.a(dd4Var)) {
            dd4Var.f0(1052506179);
            d(i2 & 8190, kb4Var, kb4Var2, dd4Var, str, z);
            dd4Var.q(false);
        } else {
            dd4Var.f0(1052665736);
            e(i2 & 8190, kb4Var, kb4Var2, dd4Var, str, z);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new vl3(z, str, kb4Var, kb4Var2, i, 3);
        }
    }

    public static final boolean g0(tz6 tz6Var, Object obj, Object obj2) {
        Object objG = tz6Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof uz6)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            tz6Var.l(obj);
            return true;
        }
        uz6 uz6Var = (uz6) objG;
        boolean zL = uz6Var.l(obj2);
        if (zL && uz6Var.g()) {
            tz6Var.l(obj);
        }
        return zL;
    }

    public static final void h(boolean z, epa epaVar, kb4 kb4Var, kb4 kb4Var2, yb4 yb4Var, dd4 dd4Var, int i) {
        epaVar.getClass();
        kb4Var.getClass();
        kb4Var2.getClass();
        yb4Var.getClass();
        dd4Var.h0(-1812139921);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(epaVar) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(kb4Var2) ? 2048 : 1024) | (dd4Var.h(yb4Var) ? 16384 : 8192);
        if (!dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            dd4Var.Y();
        } else if (xzb.a(dd4Var)) {
            dd4Var.f0(-2016191303);
            i(z, epaVar, kb4Var, kb4Var2, yb4Var, dd4Var, i2 & 65534);
            dd4Var.q(false);
        } else {
            dd4Var.f0(-2015937382);
            j(z, epaVar, kb4Var, kb4Var2, yb4Var, dd4Var, i2 & 65534);
            dd4Var.q(false);
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xs6(z, epaVar, kb4Var, kb4Var2, yb4Var, i, 0);
        }
    }

    public static final void h0(tz6 tz6Var, Object obj) {
        boolean zG;
        long[] jArr = tz6Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = tz6Var.b[i4];
                        Object obj3 = tz6Var.c[i4];
                        if (obj3 instanceof uz6) {
                            uz6 uz6Var = (uz6) obj3;
                            uz6Var.l(obj);
                            zG = uz6Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            tz6Var.m(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final void i(boolean z, epa epaVar, kb4 kb4Var, kb4 kb4Var2, yb4 yb4Var, dd4 dd4Var, int i) {
        dd4Var.h0(994052868);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(epaVar) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(kb4Var2) ? 2048 : 1024) | (dd4Var.h(yb4Var) ? 16384 : 8192);
        int i3 = 1;
        if (dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            xf0 xf0Var = bv4.u;
            ou6 ou6VarL0 = gjb.l0(yib.E(tg9.f(lu6.a, 1.0f), 15), 24.0f);
            long jC = lc1.c(0.1f, lc1.b);
            be3 be3VarC = wd3.c((by3) null, 3);
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new ss6(i3);
                dd4Var.p0(objQ);
            }
            be3 be3VarA = be3VarC.a(wd3.m((kb4) objQ));
            cj3 cj3VarD = wd3.d((by3) null, 3);
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new ss6(2);
                dd4Var.p0(objQ2);
            }
            bx1.a(z, kb4Var, be3VarA, cj3VarD.a(wd3.q((kb4) objQ2)), xf0Var, jC, false, false, ou6VarL0, jf0.G(101380838, new ft6(epaVar, kb4Var, kb4Var2, yb4Var, 0), dd4Var), dd4Var, ((i2 >> 3) & Token.ASSIGN_MOD) | (i2 & 14) | 805531008, 192);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xs6(z, epaVar, kb4Var, kb4Var2, yb4Var, i, 1);
        }
    }

    public static final long i0(long j) {
        return vp1.a(up1.k(j), up1.i(j), up1.j(j), up1.h(j));
    }

    public static final void j(boolean z, epa epaVar, kb4 kb4Var, kb4 kb4Var2, yb4 yb4Var, dd4 dd4Var, int i) {
        dd4Var.h0(-689527833);
        int i2 = i | (dd4Var.g(z) ? 4 : 2) | (dd4Var.f(epaVar) ? 32 : 16) | (dd4Var.h(kb4Var) ? 256 : Token.CASE) | (dd4Var.h(kb4Var2) ? 2048 : 1024) | (dd4Var.h(yb4Var) ? 16384 : 8192);
        if (dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            bx1.a(z, kb4Var, w3b.a, w3b.b, bv4.f, lc1.c(0.1f, lc1.b), false, false, gjb.l0(yib.E(tg9.t(lu6.a, 0.0f, 600.0f, 1), 15), 24.0f), jf0.G(1359886277, new ft6(epaVar, kb4Var, kb4Var2, yb4Var, 1), dd4Var), dd4Var, ((i2 >> 3) & Token.ASSIGN_MOD) | (i2 & 14) | 805527552, 192);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new xs6(z, epaVar, kb4Var, kb4Var2, yb4Var, i, 2);
        }
    }

    public static final void j0(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            t75.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        t75.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static final void k(int i, ib4 ib4Var, dd4 dd4Var, ou6 ou6Var, t27 t27Var, pj7 pj7Var, szb szbVar) {
        t27Var.getClass();
        ib4Var.getClass();
        dd4Var.h0(-784376911);
        int i2 = i | (dd4Var.f(t27Var) ? 4 : 2) | (dd4Var.f(pj7Var) ? 256 : Token.CASE) | (dd4Var.f(szbVar) ? 2048 : 1024) | (dd4Var.h(ib4Var) ? 16384 : 8192);
        if (dd4Var.V(i2 & 1, (i2 & 9363) != 9362)) {
            pj4 pj4VarA = e36.a(dd4Var);
            if (pj4VarA == null) {
                gp.j("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            fc9 fc9Var = (fc9) ((qtb) qx1.N(ug8.a(fc9.class), pj4VarA.f(), null, pj4VarA instanceof pj4 ? pj4VarA.d() : v02.b, ek5.a(dd4Var), null));
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
            a07 a07VarB = bx1.B(((mib) ((qtb) qx1.N(ug8.a(mib.class), eubVarA.f(), null, eubVarA instanceof pj4 ? ((pj4) eubVarA).d() : v02.b, ek5.a(dd4Var), null))).f, dd4Var);
            a07 a07VarB2 = bx1.B(fc9Var.e, dd4Var);
            Object[] objArr = new Object[0];
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (objQ == obj) {
                objQ = new aa9(11);
                dd4Var.p0(objQ);
            }
            a07 a07Var = (a07) ww1.b0(objArr, (ib4) objQ, dd4Var, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = dd4Var.Q();
            if (objQ2 == obj) {
                objQ2 = new aa9(12);
                dd4Var.p0(objQ2);
            }
            a07 a07Var2 = (a07) ww1.b0(objArr2, (ib4) objQ2, dd4Var, 48);
            gd9 gd9Var = (gd9) a07VarB2.getValue();
            boolean z = ((iib) a07VarB.getValue()).i;
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object objQ3 = dd4Var.Q();
            if (z2 || objQ3 == obj) {
                objQ3 = new cl0(t27Var, 15);
                dd4Var.p0(objQ3);
            }
            kb4 kb4Var = (kb4) objQ3;
            boolean zF = dd4Var.f(a07Var2) | dd4Var.f(a07Var);
            Object objQ4 = dd4Var.Q();
            int i4 = 24;
            if (zF || objQ4 == obj) {
                objQ4 = new rl0(a07Var2, a07Var, i4);
                dd4Var.p0(objQ4);
            }
            sdc.V(gd9Var, z, pj7Var, szbVar, ou6Var, kb4Var, (kb4) objQ4, ib4Var, dd4Var, ((i2 << 9) & 29360128) | (i2 & 8064) | 24576);
            String str = (String) a07Var2.getValue();
            boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
            boolean zF2 = dd4Var.f(a07Var);
            Object objQ5 = dd4Var.Q();
            if (zF2 || objQ5 == obj) {
                objQ5 = new hp8(a07Var, 20);
                dd4Var.p0(objQ5);
            }
            kb4 kb4Var2 = (kb4) objQ5;
            boolean zF3 = dd4Var.f(a07Var) | (i3 == 4);
            Object objQ6 = dd4Var.Q();
            if (zF3 || objQ6 == obj) {
                objQ6 = new v03(t27Var, a07Var, 5);
                dd4Var.p0(objQ6);
            }
            yb4 yb4Var = (yb4) objQ6;
            boolean zF4 = dd4Var.f(a07Var) | (i3 == 4);
            Object objQ7 = dd4Var.Q();
            if (zF4 || objQ7 == obj) {
                objQ7 = new wt2(t27Var, a07Var, 25);
                dd4Var.p0(objQ7);
            }
            kb4 kb4Var3 = (kb4) objQ7;
            boolean zF5 = dd4Var.f(a07Var) | (i3 == 4);
            Object objQ8 = dd4Var.Q();
            if (zF5 || objQ8 == obj) {
                objQ8 = new wt2(t27Var, a07Var, 26);
                dd4Var.p0(objQ8);
            }
            kb4 kb4Var4 = (kb4) objQ8;
            boolean zF6 = dd4Var.f(a07Var) | (i3 == 4);
            Object objQ9 = dd4Var.Q();
            if (zF6 || objQ9 == obj) {
                objQ9 = new wt2(t27Var, a07Var, 27);
                dd4Var.p0(objQ9);
            }
            kb4 kb4Var5 = (kb4) objQ9;
            boolean zF7 = dd4Var.f(a07Var) | (i3 == 4);
            Object objQ10 = dd4Var.Q();
            if (zF7 || objQ10 == obj) {
                objQ10 = new wt2(t27Var, a07Var, i4);
                dd4Var.p0(objQ10);
            }
            qu1.g(zBooleanValue, str, kb4Var2, yb4Var, kb4Var3, kb4Var4, kb4Var5, (kb4) objQ10, dd4Var, 0);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new y03(t27Var, ou6Var, pj7Var, szbVar, ib4Var, i, 5);
        }
    }

    public static final Object k0(kb4 kb4Var, kt1 kt1Var) {
        if (kt1Var.getContext().get(wfc.s) == null) {
            return ny1.J(kt1Var.getContext()).g0(kb4Var, kt1Var);
        }
        j31.j();
        return null;
    }

    public static final void l(epa epaVar, ou6 ou6Var, ib4 ib4Var, kb4 kb4Var, yb4 yb4Var, dd4 dd4Var, int i) {
        epa epaVar2 = epaVar;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(-1005692654);
        int i2 = i | (dd4Var2.f(epaVar2) ? 4 : 2) | (dd4Var2.f(ou6Var) ? 32 : 16) | (dd4Var2.h(ib4Var) ? 256 : Token.CASE) | (dd4Var2.h(kb4Var) ? 2048 : 1024) | (dd4Var2.h(yb4Var) ? 16384 : 8192);
        if (dd4Var2.V(i2 & 1, (i2 & 9363) != 9362)) {
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
            ou6 ou6VarP0 = gjb.p0(gjb.n0(tg9.f(lu6Var, 1.0f), 12.0f, 0.0f, 2), 0.0f, 8.0f, 0.0f, 0.0f, 13);
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
            String strK = wn9.K((pv9) zu9.O.getValue(), dd4Var2);
            ur9 ur9Var = s96.a;
            nha.c(strK, new bp5(1.0f, true), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 0, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.h, dd4Var, 0, 0, 131064);
            p35 p35VarC = i25.c((m53) a53.w.getValue(), dd4Var, 0);
            long j = ((q96) dd4Var.j(ur9Var)).a.q;
            ou6 ou6VarN = tg9.n(lu6Var, 32.0f);
            rp8 rp8Var = tp8.a;
            ou6 ou6VarW = t96.w(ou6VarN, rp8Var);
            boolean z = (i2 & 896) == 256;
            Object objQ = dd4Var.Q();
            Object obj = vl1.a;
            if (z || objQ == obj) {
                objQ = new or6(7, ib4Var);
                dd4Var.p0(objQ);
            }
            mx4.a(p35VarC, (String) null, gjb.l0(fw.J(null, (ib4) objQ, ou6VarW, false, 15), 6.0f), j, dd4Var, 48, 0);
            xv5.z(dd4Var, true, lu6Var, 8.0f, dd4Var);
            String str = epaVar.d;
            String str2 = epaVar.e;
            String str3 = epaVar.c;
            Map map = epaVar.b;
            epaVar2 = epaVar;
            o(str, str2, epaVar.f, epaVar.g, tg9.f(lu6Var, 1.0f), yb4Var, dd4Var, ((i2 << 3) & 458752) | 24576);
            String str4 = epaVar2.a;
            boolean zF = dd4Var.f(map) | dd4Var.f(str3) | dd4Var.f(str) | dd4Var.f(str2);
            Object objQ2 = dd4Var.Q();
            if (zF || objQ2 == obj) {
                objQ2 = (String) map.get(str3 + "-" + str + "-" + str2);
                dd4Var.p0(objQ2);
            }
            p(str4, (String) objQ2, gjb.l0(h67.f0(tg9.f(lu6Var, 1.0f), null, 3), 12.0f), dd4Var, 0);
            m(epaVar2.c, epaVar2.h, gjb.l0(fe.L(t96.w(gjb.l0(lu6Var, 12.0f), rp8Var), dd1.g(((q96) dd4Var.j(ur9Var)).a, 10.0f), jf0.G), 4.0f), kb4Var, dd4Var, i2 & 7168);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new uj0(epaVar2, ou6Var, ib4Var, kb4Var, yb4Var, i, 19);
        }
    }

    public static void l0(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public static final void m(String str, List list, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i) {
        int i2;
        Object next;
        br9 br9Var;
        Object obj;
        ?? r6;
        ou6 ou6Var2;
        dd4 dd4Var2 = dd4Var;
        qr1 qr1Var = ra1.d;
        dd4Var2.h0(597993371);
        if ((i & 6) == 0) {
            i2 = (dd4Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var2.h(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var2.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var2.h(kb4Var) ? 2048 : 1024;
        }
        if (dd4Var2.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object objQ = dd4Var2.Q();
            Object obj2 = vl1.a;
            if (objQ == obj2) {
                objQ = dk9.x(Boolean.FALSE);
                dd4Var2.p0(objQ);
            }
            br9 br9Var2 = (a07) objQ;
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == obj2) {
                objQ2 = new bq6(br9Var2, 12);
                dd4Var2.p0(objQ2);
            }
            ou6 ou6VarV = yn2.V(1, (ib4) objQ2, dd4Var2, ou6Var, false);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarV);
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
            boolean zF = ((i2 & 14) == 4) | dd4Var2.f(list);
            Object objQ3 = dd4Var2.Q();
            if (zF || objQ3 == obj2) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (lc5.Q(str, ((p5b) next).a)) {
                            break;
                        }
                    }
                }
                objQ3 = (p5b) next;
                dd4Var2.p0(objQ3);
            }
            p5b p5bVar = (p5b) objQ3;
            String str2 = p5bVar != null ? p5bVar.a : null;
            if (str2 == null) {
                str2 = "";
            }
            boolean zEquals = str2.equals("qt");
            ou6 ou6Var3 = lu6.a;
            if (zEquals) {
                dd4Var2.f0(-985301835);
                br9Var = br9Var2;
                i12.h(i25.a((m53) f53.z.getValue(), dd4Var2), (String) null, t96.w(tg9.n(ou6Var3, 24.0f), tp8.a), dd4Var2, 24624, 232);
                dd4Var2.q(false);
                r6 = 0;
                ou6Var2 = ou6Var3;
                obj = obj2;
            } else {
                br9Var = br9Var2;
                dd4Var2.f0(-985004731);
                obj = obj2;
                r6 = 0;
                ou6Var2 = ou6Var3;
                w05.a(new po3(str), qr1Var, false, null, null, t96.w(tg9.n(ou6Var3, 24.0f), tp8.a), null, dd4Var, 100663344, 188);
                dd4Var2 = dd4Var;
                dd4Var2.q(false);
            }
            un9.a(dd4Var2, tg9.r(ou6Var2, 8.0f));
            String str3 = p5bVar != null ? p5bVar.b : null;
            String str4 = str3 == null ? "" : str3;
            ur9 ur9Var = s96.a;
            nha.c(str4, kf0.v(new bp5(1.0f, (boolean) r6)), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, (vaa) null, 0L, 0, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.j, dd4Var, 0, 24576, 114680);
            un9.a(dd4Var, tg9.r(ou6Var2, 4.0f));
            mx4.a(i25.c((m53) f53.s.getValue(), dd4Var, r6), (String) null, tg9.n(ou6Var2, 16.0f), ((q96) dd4Var.j(ur9Var)).a.q, dd4Var, 432, 0);
            un9.a(dd4Var, tg9.r(ou6Var2, 4.0f));
            boolean zBooleanValue = ((Boolean) br9Var.getValue()).booleanValue();
            xf0 xf0Var = bv4.b;
            Object objQ4 = dd4Var.Q();
            if (objQ4 == obj) {
                objQ4 = new bq6(br9Var, 13);
                dd4Var.p0(objQ4);
            }
            gx1.a(zBooleanValue, xf0Var, 0L, ou6Var2, 0.0f, null, (ib4) objQ4, jf0.G(1118827123, new zs6(list, str, kb4Var, br9Var, 0), dd4Var), dd4Var, 14158896, 52);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new at6(i, 0, kb4Var, ou6Var, str, list);
        }
    }

    public static void m0(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        l0(byteArrayOutputStream, i, 2);
    }

    public static final void n(String str, List list, ou6 ou6Var, kb4 kb4Var, dd4 dd4Var, int i) {
        int i2;
        Object next;
        dd4 dd4Var2 = dd4Var;
        xf0 xf0Var = bv4.b;
        dd4Var2.h0(565651924);
        if ((i & 6) == 0) {
            i2 = (dd4Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var2.h(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= dd4Var2.f(ou6Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var2.h(kb4Var) ? 2048 : 1024;
        }
        if (dd4Var2.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object objQ = dd4Var2.Q();
            fu6 fu6Var = vl1.a;
            if (objQ == fu6Var) {
                objQ = dk9.x(Boolean.FALSE);
                dd4Var2.p0(objQ);
            }
            a07 a07Var = (a07) objQ;
            Object objQ2 = dd4Var2.Q();
            if (objQ2 == fu6Var) {
                objQ2 = new bq6(a07Var, 14);
                dd4Var2.p0(objQ2);
            }
            ou6 ou6VarV = yn2.V(1, (ib4) objQ2, dd4Var2, ou6Var, false);
            ha6 ha6VarD = pn0.d(xf0Var, false);
            int iHashCode = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL = dd4Var2.l();
            ou6 ou6VarL0 = s32.L0(dd4Var2, ou6VarV);
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
            zn0 zn0Var = zn0.a;
            xf0 xf0Var2 = bv4.f;
            lu6 lu6Var = lu6.a;
            ou6 ou6VarA = zn0Var.a(lu6Var, xf0Var2);
            int i3 = i2;
            ie1 ie1VarA = ge1.a(pv.c, bv4.z, dd4Var2, 0);
            int iHashCode2 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL2 = dd4Var2.l();
            ou6 ou6VarL02 = s32.L0(dd4Var2, ou6VarA);
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
            boolean zF = dd4Var2.f(list) | ((i3 & 14) == 4);
            Object objQ3 = dd4Var2.Q();
            if (zF || objQ3 == fu6Var) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (lc5.Q(str, ((r5b) next).a)) {
                            break;
                        }
                    }
                }
                r5b r5bVar = (r5b) next;
                String str2 = r5bVar != null ? r5bVar.b : null;
                objQ3 = str2 == null ? "" : str2;
                dd4Var2.p0(objQ3);
            }
            String strK = (String) objQ3;
            ou6 ou6VarO = jv3.O(lu6Var, fc5.b);
            eq8 eq8VarA = dq8.a(pv.a, bv4.x, dd4Var2, 48);
            int iHashCode3 = Long.hashCode(dd4Var2.T);
            lr7 lr7VarL3 = dd4Var2.l();
            ou6 ou6VarL03 = s32.L0(dd4Var2, ou6VarO);
            ml1.k.getClass();
            um1 um1Var2 = ll1.b;
            dd4Var2.j0();
            if (dd4Var2.S) {
                dd4Var2.k(um1Var2);
            } else {
                dd4Var2.s0();
            }
            un9.s(ll1.f, dd4Var2, eq8VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL3);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode3));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL03);
            dd4Var2.f0(706752799);
            if (strK.length() == 0) {
                strK = wn9.K((pv9) vt9.H.getValue(), dd4Var2);
            }
            String str3 = strK;
            dd4Var2.q(false);
            ur9 ur9Var = s96.a;
            nha.c(str3, kf0.v(new bp5(1.0f, true)), ((q96) dd4Var2.j(ur9Var)).a.q, (g60) null, 0L, (t74) null, (a84) null, (c64) null, 0L, (jda) null, new vaa(3), 0L, 0, false, 1, 0, (kb4) null, ((q96) dd4Var2.j(ur9Var)).b.k, dd4Var, 0, 24576, 113656);
            un9.a(dd4Var, tg9.r(lu6Var, 4.0f));
            mx4.a(i25.c((m53) f53.s.getValue(), dd4Var, 0), (String) null, tg9.n(lu6Var, 16.0f), ((q96) dd4Var.j(ur9Var)).a.q, dd4Var, 432, 0);
            un9.a(dd4Var, tg9.r(lu6Var, 4.0f));
            dd4Var.q(true);
            dd4Var.q(true);
            boolean zBooleanValue = ((Boolean) a07Var.getValue()).booleanValue();
            Object objQ4 = dd4Var.Q();
            if (objQ4 == fu6Var) {
                objQ4 = new bq6(a07Var, 15);
                dd4Var.p0(objQ4);
            }
            gx1.a(zBooleanValue, xf0Var, 0L, lu6Var, 0.0f, null, (ib4) objQ4, jf0.G(1353441306, new zs6(list, str, kb4Var, a07Var, 1), dd4Var), dd4Var, 14158896, 52);
            dd4Var2 = dd4Var;
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new at6(i, 1, kb4Var, ou6Var, str, list);
        }
    }

    public static final void o(String str, String str2, List list, List list2, ou6 ou6Var, yb4 yb4Var, dd4 dd4Var, int i) {
        int i2;
        List list3;
        dd4 dd4Var2 = dd4Var;
        dd4Var2.h0(479207647);
        if ((i & 6) == 0) {
            i2 = (dd4Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= dd4Var2.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            list3 = list;
            i2 |= dd4Var2.h(list3) ? 256 : Token.CASE;
        } else {
            list3 = list;
        }
        if ((i & 3072) == 0) {
            i2 |= dd4Var2.h(list2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= dd4Var2.f(ou6Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= dd4Var2.h(yb4Var) ? 131072 : Parser.ARGC_LIMIT;
        }
        int i3 = i2;
        if (dd4Var2.V(i3 & 1, (i3 & 74899) != 74898)) {
            ou6 ou6VarN0 = gjb.n0(ou6Var, 12.0f, 0.0f, 2);
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
            un9.s(ll1.f, dd4Var2, eq8VarA);
            un9.s(ll1.e, dd4Var2, lr7VarL);
            un9.s(ll1.g, dd4Var2, Integer.valueOf(iHashCode));
            un9.r(dd4Var2, ll1.h);
            un9.s(ll1.d, dd4Var2, ou6VarL0);
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            bp5 bp5Var = new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            rp8 rp8Var = tp8.a;
            ou6 ou6VarW = t96.w(bp5Var, rp8Var);
            ur9 ur9Var = s96.a;
            long jG = dd1.g(((q96) dd4Var2.j(ur9Var)).a, 10.0f);
            lp4 lp4Var = jf0.G;
            ou6 ou6VarN02 = gjb.n0(fe.L(ou6VarW, jG, lp4Var), 0.0f, 8.0f, 1);
            int i4 = i3 & 458752;
            boolean z = (i4 == 131072) | ((i3 & Token.ASSIGN_MOD) == 32);
            Object objQ = dd4Var2.Q();
            Object obj = vl1.a;
            if (z || objQ == obj) {
                objQ = new fi6(yb4Var, str2, 2);
                dd4Var2.p0(objQ);
            }
            int i5 = i3 & 14;
            int i6 = i3 >> 3;
            n(str, list3, ou6VarN02, (kb4) objQ, dd4Var2, i5 | (i6 & Token.ASSIGN_MOD));
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var2, tg9.r(lu6Var, 4.0f));
            mx4.a(i25.c((m53) a53.f.getValue(), dd4Var2, 0), (String) null, gjb.n0(lu6Var, 6.0f, 0.0f, 2), ((q96) dd4Var2.j(ur9Var)).a.q, dd4Var2, 432, 0);
            un9.a(dd4Var2, tg9.r(lu6Var, 4.0f));
            if (1.0f <= 0.0d) {
                o75.a("invalid weight; must be greater than zero");
            }
            ou6 ou6VarN03 = gjb.n0(fe.L(t96.w(new bp5(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), rp8Var), dd1.g(((q96) dd4Var2.j(ur9Var)).a, 10.0f), lp4Var), 0.0f, 8.0f, 1);
            boolean z2 = (i4 == 131072) | (i5 == 4);
            Object objQ2 = dd4Var2.Q();
            if (z2 || objQ2 == obj) {
                objQ2 = new fi6(yb4Var, str, 3);
                dd4Var2.p0(objQ2);
            }
            dd4Var2 = dd4Var2;
            n(str2, list2, ou6VarN03, (kb4) objQ2, dd4Var2, (i6 & 14) | ((i3 >> 6) & Token.ASSIGN_MOD));
            dd4Var2.q(true);
        } else {
            dd4Var2.Y();
        }
        ye8 ye8VarU = dd4Var2.u();
        if (ye8VarU != null) {
            ye8VarU.d = new tz0(str, str2, list, list2, ou6Var, yb4Var, i);
        }
    }

    public static final void p(String str, String str2, ou6 ou6Var, dd4 dd4Var, int i) {
        dd4Var.h0(-1915889488);
        int i2 = i | (dd4Var.f(str) ? 4 : 2) | (dd4Var.f(str2) ? 32 : 16) | (dd4Var.f(ou6Var) ? 256 : Token.CASE);
        if (dd4Var.V(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
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
            tu1.l(null, jf0.G(1752277193, new z31(str, 21), dd4Var), dd4Var, 48);
            lu6 lu6Var = lu6.a;
            un9.a(dd4Var, tg9.h(lu6Var, 12.0f));
            y86.c(0.0f, 0, 7, 0L, dd4Var, null);
            un9.a(dd4Var, tg9.h(lu6Var, 12.0f));
            if (str2 == null) {
                dd4Var.f0(-704542606);
                ah1.r(tg9.h(tg9.f(lu6Var, 1.0f), 20.0f), null, dd4Var, 6, 2);
                ah1.r(tg9.h(xv5.h(lu6Var, 4.0f, dd4Var, lu6Var, 0.4f), 20.0f), null, dd4Var, 6, 2);
                dd4Var.q(false);
            } else {
                dd4Var.f0(-704208271);
                tu1.l(null, jf0.G(-1479917971, new z31(str2, 22), dd4Var), dd4Var, 48);
                dd4Var.q(false);
            }
            dd4Var.q(true);
        } else {
            dd4Var.Y();
        }
        ye8 ye8VarU = dd4Var.u();
        if (ye8VarU != null) {
            ye8VarU.d = new ys6(str, str2, ou6Var, i, 0);
        }
    }

    public static void q(Parcel parcel, List list) {
        if (list == null) {
            parcel.writeInt(-1);
            return;
        }
        int size = list.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            parcel.writeTypedObject((Parcelable) list.get(i), 1);
        }
    }

    public static final nu6 r(lm2 lm2Var, int i) {
        nu6 nu6Var = ((nu6) lm2Var).a.f;
        if (nu6Var == null || (nu6Var.d & i) == 0) {
            return null;
        }
        while (nu6Var != null) {
            int i2 = nu6Var.c;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return nu6Var;
            }
            nu6Var = nu6Var.f;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0086 -> B:26:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0089 -> B:26:0x0069). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(java.util.List r11, l42 r12, defpackage.kt1 r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof defpackage.v32
            if (r0 == 0) goto L14
            r0 = r13
            v32 r0 = (defpackage.v32) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r13 = r0
            goto L1a
        L14:
            v32 r0 = new v32
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r0 = r13.c
            int r1 = r13.d
            r2 = 2
            r3 = 1
            xx1 r4 = defpackage.xx1.a
            if (r1 == 0) goto L43
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L34
            java.util.Iterator r11 = r13.b
            java.io.Serializable r12 = r13.a
            rg8 r12 = (defpackage.rg8) r12
            defpackage.e11.e0(r0)     // Catch: java.lang.Throwable -> L32
            goto L69
        L32:
            r0 = move-exception
            goto L82
        L34:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r11)
            r11 = 0
            return r11
        L3b:
            java.io.Serializable r11 = r13.a
            java.util.List r11 = (java.util.List) r11
            defpackage.e11.e0(r0)
            goto L60
        L43:
            defpackage.e11.e0(r0)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            tf r5 = new tf
            r6 = 3
            r10 = 0
            r7 = 0
            r8 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r13.a = r9
            r13.d = r3
            java.lang.Object r11 = r12.a(r5, r13)
            if (r11 != r4) goto L5f
            goto L97
        L5f:
            r11 = r9
        L60:
            rg8 r12 = new rg8
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L69:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r11.next()
            kb4 r0 = (defpackage.kb4) r0
            r13.a = r12     // Catch: java.lang.Throwable -> L32
            r13.b = r11     // Catch: java.lang.Throwable -> L32
            r13.d = r2     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r0.invoke(r13)     // Catch: java.lang.Throwable -> L32
            if (r0 != r4) goto L69
            goto L97
        L82:
            java.lang.Object r1 = r12.a
            if (r1 != 0) goto L89
            r12.a = r0
            goto L69
        L89:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            i12.r(r1, r0)
            goto L69
        L8f:
            java.lang.Object r11 = r12.a
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            if (r11 != 0) goto L98
            heb r4 = defpackage.heb.a
        L97:
            return r4
        L98:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex1.s(java.util.List, l42, kt1):java.lang.Object");
    }

    public static final void t(tz6 tz6Var, Object obj, Object obj2) {
        int iF = tz6Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : tz6Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof uz6) {
                ((uz6) obj3).a(obj2);
            } else if (obj3 != obj2) {
                uz6 uz6Var = new uz6();
                uz6Var.a(obj3);
                uz6Var.a(obj2);
                obj2 = uz6Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            tz6Var.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        tz6Var.b[i] = obj;
        tz6Var.c[i] = obj2;
    }

    public static px0 u(nl2 nl2Var) {
        mx0 mx0Var = new mx0();
        mx0Var.c = new zk8();
        px0 px0Var = new px0(mx0Var);
        mx0Var.b = px0Var;
        mx0Var.a = dx1.class;
        try {
            nl2Var.invokeOnCompletion(new sh(8, mx0Var, nl2Var));
            mx0Var.a = "Deferred.asListenableFuture";
            return px0Var;
        } catch (Exception e) {
            px0Var.b.j(e);
            return px0Var;
        }
    }

    public static void v(String str, boolean z) {
        if (z) {
            return;
        }
        gp.l(str);
    }

    public static void w(boolean z) {
        if (z) {
            return;
        }
        w58.p();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: qn7 */
    public static void x(String str, boolean z) throws qn7 {
        if (!z) {
            throw qn7.a((RuntimeException) null, str);
        }
    }

    public static void y(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            j39.y(sb, "Must be called on ", name2, " thread, but got ", name);
            w58.m(sb, ".");
        }
    }

    public static void z(String str) {
        if (TextUtils.isEmpty(str)) {
            gp.l("Given String is empty or null");
        }
    }
}

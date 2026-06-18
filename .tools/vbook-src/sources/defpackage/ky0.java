package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract /* synthetic */ class ky0 {
    public static void A(dd4 dd4Var, boolean z, lu6 lu6Var, float f, dd4 dd4Var2) {
        dd4Var.q(z);
        un9.a(dd4Var2, tg9.r(lu6Var, f));
    }

    public static /* synthetic */ void B(u25 u25Var) throws Exception {
        boolean zIsTerminated;
        if (u25Var instanceof AutoCloseable) {
            u25Var.close();
            return;
        }
        if (!(u25Var instanceof ExecutorService)) {
            if (u25Var instanceof TypedArray) {
                ((TypedArray) u25Var).recycle();
                return;
            }
            if (u25Var instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) u25Var).release();
                return;
            } else if (u25Var instanceof MediaDrm) {
                ((MediaDrm) u25Var).release();
                return;
            } else {
                w58.p();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) u25Var;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void C(String str, String str2, String str3) {
        fe.n0(str3, str + str2);
    }

    public static void D(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    public static /* synthetic */ int a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i2;
    }

    public static int b(int i, int i2, String str) {
        return str.length() + i + i2;
    }

    public static long c(re reVar, int i) {
        Long lC = reVar.c(i);
        lC.getClass();
        return lC.longValue();
    }

    public static long d(String str, re reVar, int i) {
        str.getClass();
        Long lC = reVar.c(i);
        lC.getClass();
        return lC.longValue();
    }

    public static qr0 e(float f, float f2) {
        qr0 qr0Var = new qr0(2);
        qr0Var.i(f, f2);
        return qr0Var;
    }

    public static z44 f(dd4 dd4Var) {
        z44 z44Var = new z44();
        dd4Var.p0(z44Var);
        return z44Var;
    }

    public static bp5 g(dd4 dd4Var, ou6 ou6Var, jm jmVar, float f, boolean z) {
        un9.s(jmVar, dd4Var, ou6Var);
        return new bp5(f, z);
    }

    public static ou6 h(dd4 dd4Var, float f, ou6 ou6Var, lp4 lp4Var) {
        return fe.L(ou6Var, dd1.g(s00.o(dd4Var), f), lp4Var);
    }

    public static yy6 i(dd4 dd4Var) {
        yy6 yy6Var = new yy6();
        dd4Var.p0(yy6Var);
        return yy6Var;
    }

    public static xl7 j(int i, String str, int i2, int i3) {
        return new xl7(str, new lc1(ah1.k(i, i2, i3, 255)));
    }

    public static kf9 k(if0 if0Var, vu6 vu6Var) {
        kf9 kf9Var = new kf9(if0Var);
        vu6Var.a(kf9Var);
        return kf9Var;
    }

    public static Boolean l(Boolean bool, re reVar, int i) {
        bool.getClass();
        Boolean boolA = reVar.a(i);
        boolA.getClass();
        return boolA;
    }

    public static Long m(Long l, re reVar, int i) {
        l.getClass();
        Long lC = reVar.c(i);
        lC.getClass();
        return lC;
    }

    public static Object n(re reVar, int i, wfc wfcVar) {
        String strD = reVar.d(i);
        strD.getClass();
        return wfcVar.m(strD);
    }

    public static String o(re reVar, int i) {
        reVar.getClass();
        String strD = reVar.d(i);
        strD.getClass();
        return strD;
    }

    public static String p(Object obj, String str) {
        return str + obj;
    }

    public static String q(String str, re reVar, int i) {
        str.getClass();
        String strD = reVar.d(i);
        strD.getClass();
        return strD;
    }

    public static String r(String str, String str2) {
        return str + str2;
    }

    public static String s(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String t(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    public static void u(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void v(int i, dd4 dd4Var, jm jmVar, dd4 dd4Var2, kd kdVar) {
        un9.s(jmVar, dd4Var, Integer.valueOf(i));
        un9.r(dd4Var2, kdVar);
    }

    public static void w(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void x(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void y(a91 a91Var, StringBuilder sb, char c, String str, char c2) {
        sb.append(rh5.a(a91Var));
        sb.append(c);
        sb.append(str);
        sb.append(c2);
    }

    public static void z(dd4 dd4Var, int i, lu6 lu6Var, float f, dd4 dd4Var2) {
        dd4Var.f0(i);
        un9.a(dd4Var2, tg9.h(lu6Var, f));
    }
}

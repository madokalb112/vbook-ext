package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract /* synthetic */ class dx1 implements nx0 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static float A(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) * f4;
    }

    public static fi1 B(String str) {
        sz5.b(str);
        return new fi1();
    }

    public static /* synthetic */ int C(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] D(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }

    public static /* synthetic */ boolean a(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static float b(float f, float f2, float f3, float f4) {
        return ((f - f2) / f3) + f4;
    }

    public static fi1 c(String str) {
        q75.d(str);
        return new fi1();
    }

    public static Object e(ev8 ev8Var, rm7 rm7Var, Class cls, rm7 rm7Var2) {
        ev8Var.getClass();
        rm7Var.getClass();
        return ev8Var.d(ug8.a(cls), rm7Var2);
    }

    public static String f(int i, String str) {
        return str + i;
    }

    public static String g(int i, String str, String str2) {
        return str + str2 + i;
    }

    public static String h(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String i(StringBuilder sb, float f, char c) {
        sb.append(f);
        sb.append(c);
        return sb.toString();
    }

    public static String j(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static String k(StringBuilder sb, Object obj, String str) {
        sb.append(obj);
        sb.append(str);
        return sb.toString();
    }

    public static String l(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder m(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder n(String str, String str2, String str3, String str4, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static Map o(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static Set p(String str) {
        return e11.d0(new fm5(str));
    }

    public static void q(int i, int i2, int i3, int i4, int i5) {
        hjb.K(i);
        hjb.K(i2);
        hjb.K(i3);
        hjb.K(i4);
        hjb.K(i5);
    }

    public static void r(int i, dd4 dd4Var, jm jmVar, dd4 dd4Var2, kd kdVar) {
        un9.s(jmVar, dd4Var, Integer.valueOf(i));
        un9.r(dd4Var2, kdVar);
    }

    public static void s(int i, String str, String str2) {
        fe.n0(str2, str + i);
    }

    public static void t(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
    }

    public static void u(int i, HashMap map, String str, int i2, String str2) {
        map.put(Integer.valueOf(i), str);
        map.put(Integer.valueOf(i2), str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void v(t25 t25Var) throws Exception {
        boolean zIsTerminated;
        if (t25Var instanceof AutoCloseable) {
            t25Var.close();
            return;
        }
        if (!(t25Var instanceof ExecutorService)) {
            if (t25Var instanceof TypedArray) {
                ((TypedArray) t25Var).recycle();
                return;
            }
            if (t25Var instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) t25Var).release();
                return;
            } else if (t25Var instanceof MediaDrm) {
                ((MediaDrm) t25Var).release();
                return;
            } else {
                w58.p();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) t25Var;
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

    public static /* synthetic */ void w(je8 je8Var) throws Exception {
        boolean zIsTerminated;
        if (je8Var instanceof AutoCloseable) {
            je8Var.close();
            return;
        }
        if (!(je8Var instanceof ExecutorService)) {
            w58.p();
            return;
        }
        ExecutorService executorService = (ExecutorService) je8Var;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void x(kka kkaVar) throws Exception {
        boolean zIsTerminated;
        if (kkaVar instanceof AutoCloseable) {
            kkaVar.close();
            return;
        }
        if (!(kkaVar instanceof ExecutorService)) {
            if (kkaVar instanceof TypedArray) {
                ((TypedArray) kkaVar).recycle();
                return;
            }
            if (kkaVar instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) kkaVar).release();
                return;
            } else if (kkaVar instanceof MediaDrm) {
                ((MediaDrm) kkaVar).release();
                return;
            } else {
                w58.p();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) kkaVar;
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

    public static /* synthetic */ void y(Object obj) {
        if (obj == null) {
            return;
        }
        j31.j();
    }

    public static void z(StringBuilder sb, String str, long j, String str2) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }
}

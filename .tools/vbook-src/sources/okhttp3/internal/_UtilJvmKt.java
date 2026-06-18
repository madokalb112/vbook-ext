package okhttp3.internal;

import defpackage.bw9;
import defpackage.il9;
import defpackage.j39;
import defpackage.k27;
import defpackage.lc3;
import defpackage.lc5;
import defpackage.xq0;
import j$.util.DesugarTimeZone;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http2.Header;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class _UtilJvmKt {
    public static final TimeZone a;
    public static final String b;

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        timeZone.getClass();
        a = timeZone;
        b = bw9.l0(bw9.k0(OkHttpClient.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(HttpUrl httpUrl, HttpUrl httpUrl2) {
        httpUrl.getClass();
        httpUrl2.getClass();
        return lc5.Q(httpUrl.d, httpUrl2.d) && httpUrl.e == httpUrl2.e && lc5.Q(httpUrl.a, httpUrl2.a);
    }

    public static final int b(long j) {
        TimeUnit.MILLISECONDS.getClass();
        if (j < 0) {
            k27.g("timeout".concat(" < 0"));
            return 0;
        }
        if (j > 2147483647L) {
            gp.k("timeout".concat(" too large"));
            return 0;
        }
        if (j != 0 || j <= 0) {
            return (int) j;
        }
        gp.k("timeout".concat(" too small"));
        return 0;
    }

    public static final void c(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!lc5.Q(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String d(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long e(Response response) {
        String strA = response.f.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        byte[] bArr = _UtilCommonKt.a;
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final boolean f(il9 il9Var, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jC = il9Var.l().e() ? il9Var.l().c() - jNanoTime : Long.MAX_VALUE;
        il9Var.l().d(Math.min(jC, timeUnit.toNanos(i)) + jNanoTime);
        try {
            xq0 xq0Var = new xq0();
            while (il9Var.D0(8192L, xq0Var) != -1) {
                xq0Var.p();
            }
            if (jC == Long.MAX_VALUE) {
                il9Var.l().a();
                return true;
            }
            il9Var.l().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                il9Var.l().a();
                return false;
            }
            il9Var.l().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                il9Var.l().a();
            } else {
                il9Var.l().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static final Headers g(List list) {
        Headers.Builder builder = new Headers.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            _HeadersCommonKt.a(builder, header.a.s(), header.b.s());
        }
        return builder.a();
    }

    public static final String h(HttpUrl httpUrl, boolean z) {
        httpUrl.getClass();
        int i = httpUrl.e;
        String strI = httpUrl.d;
        if (bw9.O(strI, ":", false)) {
            strI = j39.i(']', "[", strI);
        }
        if (!z && i == HttpUrl.Companion.a(httpUrl.a)) {
            return strI;
        }
        return strI + ':' + i;
    }

    public static final List i(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return lc3.a;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final List j(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return lc3.a;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        objArr2.getClass();
        List listAsList = Arrays.asList(objArr2);
        listAsList.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }
}

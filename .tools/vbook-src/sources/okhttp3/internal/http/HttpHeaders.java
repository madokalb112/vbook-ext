package okhttp3.internal.http;

import defpackage.av0;
import defpackage.lc5;
import defpackage.q31;
import defpackage.ra1;
import defpackage.xq0;
import java.io.EOFException;
import okhttp3.Response;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class HttpHeaders {
    public static final av0 a;
    public static final av0 b;

    static {
        av0 av0Var = av0.d;
        a = ra1.s("\"\\");
        b = ra1.s("\t ,=");
    }

    public static final boolean a(Response response) {
        if (lc5.Q(response.a.b, "HEAD")) {
            return false;
        }
        int i = response.d;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || _UtilJvmKt.e(response) != -1) {
            return true;
        }
        String strA = response.f.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        return "chunked".equalsIgnoreCase(strA);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0106, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0106, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.xq0 r17, java.util.ArrayList r18) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.b(xq0, java.util.ArrayList):void");
    }

    public static final String c(xq0 xq0Var) {
        long jP = xq0Var.P(b);
        if (jP == -1) {
            jP = xq0Var.b;
        }
        if (jP != 0) {
            return xq0Var.j0(jP, q31.a);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(okhttp3.CookieJar r36, okhttp3.HttpUrl r37, okhttp3.Headers r38) {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.d(okhttp3.CookieJar, okhttp3.HttpUrl, okhttp3.Headers):void");
    }

    public static final boolean e(xq0 xq0Var) throws EOFException {
        boolean z = false;
        while (!xq0Var.k()) {
            byte bE = xq0Var.E(0L);
            if (bE != 44) {
                if (bE != 32 && bE != 9) {
                    break;
                }
                xq0Var.readByte();
            } else {
                xq0Var.readByte();
                z = true;
            }
        }
        return z;
    }
}

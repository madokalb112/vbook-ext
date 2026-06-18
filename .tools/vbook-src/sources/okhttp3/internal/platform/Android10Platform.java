package okhttp3.internal.platform;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import defpackage.fw;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.platform.android.Android10SocketAdapter;
import okhttp3.internal.platform.android.AndroidCertificateChainCleaner;
import okhttp3.internal.platform.android.AndroidSocketAdapter;
import okhttp3.internal.platform.android.BouncyCastleSocketAdapter;
import okhttp3.internal.platform.android.ConscryptSocketAdapter;
import okhttp3.internal.platform.android.DeferredSocketAdapter;
import okhttp3.internal.platform.android.SocketAdapter;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class Android10Platform extends Platform implements ContextAwarePlatform {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    static {
        e = Build.VERSION.SDK_INT >= 29;
    }

    public Android10Platform() {
        int i = 0;
        ArrayList arrayListI0 = fw.i0(new SocketAdapter[]{Build.VERSION.SDK_INT >= 29 ? new Android10SocketAdapter() : null, new DeferredSocketAdapter(AndroidSocketAdapter.e), new DeferredSocketAdapter(ConscryptSocketAdapter.a), new DeferredSocketAdapter(BouncyCastleSocketAdapter.a)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListI0.size();
        while (i < size) {
            Object obj = arrayListI0.get(i);
            i++;
            if (((SocketAdapter) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    @Override // okhttp3.internal.platform.ContextAwarePlatform
    public final void a(Context context) {
        this.c = context;
    }

    @Override // okhttp3.internal.platform.ContextAwarePlatform
    public final Context b() {
        return this.c;
    }

    @Override // okhttp3.internal.platform.Platform
    public final CertificateChainCleaner c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        AndroidCertificateChainCleaner androidCertificateChainCleaner = x509TrustManagerExtensions != null ? new AndroidCertificateChainCleaner(x509TrustManager, x509TrustManagerExtensions) : null;
        return androidCertificateChainCleaner != null ? androidCertificateChainCleaner : new BasicCertificateChainCleaner(d(x509TrustManager));
    }

    @Override // okhttp3.internal.platform.Platform
    public final TrustRootIndex d(X509TrustManager x509TrustManager) {
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.d(x509TrustManager);
    }

    @Override // okhttp3.internal.platform.Platform
    public final void e(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((SocketAdapter) obj).a(sSLSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            socketAdapter.d(sSLSocket, str, list);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final String g(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((SocketAdapter) obj).a(sSLSocket)) {
                break;
            }
        }
        SocketAdapter socketAdapter = (SocketAdapter) obj;
        if (socketAdapter != null) {
            return socketAdapter.c(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.Platform
    public final Object h() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.h();
        }
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open("response.body().close()");
        return closeGuard;
    }

    @Override // okhttp3.internal.platform.Platform
    public final boolean i(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // okhttp3.internal.platform.Platform
    public final void j(int i, String str, Throwable th) {
        if (i == 5) {
            boolean z = AndroidPlatform.e;
            Log.w("OkHttp", str, th);
        } else {
            boolean z2 = AndroidPlatform.e;
            Log.i("OkHttp", str, th);
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final void k(Object obj, String str) {
        if (Build.VERSION.SDK_INT < 30) {
            super.k(obj, str);
        } else {
            obj.getClass();
            xr0.e(obj).warnIfOpen();
        }
    }

    @Override // okhttp3.internal.platform.Platform
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}

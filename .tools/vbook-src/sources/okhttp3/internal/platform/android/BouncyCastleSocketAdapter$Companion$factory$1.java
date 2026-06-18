package okhttp3.internal.platform.android;

import javax.net.ssl.SSLSocket;
import okhttp3.internal.platform.android.DeferredSocketAdapter;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class BouncyCastleSocketAdapter$Companion$factory$1 implements DeferredSocketAdapter.Factory {
    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
    public final boolean a(SSLSocket sSLSocket) {
        boolean z = BouncyCastleSocketAdapter.b;
        return false;
    }

    @Override // okhttp3.internal.platform.android.DeferredSocketAdapter.Factory
    public final SocketAdapter b(SSLSocket sSLSocket) {
        return new BouncyCastleSocketAdapter();
    }
}

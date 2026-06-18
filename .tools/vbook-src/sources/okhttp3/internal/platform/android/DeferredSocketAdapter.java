package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class DeferredSocketAdapter implements SocketAdapter {
    public final Factory a;
    public SocketAdapter b;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public interface Factory {
        boolean a(SSLSocket sSLSocket);

        SocketAdapter b(SSLSocket sSLSocket);
    }

    public DeferredSocketAdapter(Factory factory) {
        this.a = factory;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.a(sSLSocket);
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final boolean b() {
        return true;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final String c(SSLSocket sSLSocket) {
        SocketAdapter socketAdapterE = e(sSLSocket);
        if (socketAdapterE != null) {
            return socketAdapterE.c(sSLSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.android.SocketAdapter
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        SocketAdapter socketAdapterE = e(sSLSocket);
        if (socketAdapterE != null) {
            socketAdapterE.d(sSLSocket, str, list);
        }
    }

    public final synchronized SocketAdapter e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.a(sSLSocket)) {
                this.b = this.a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}

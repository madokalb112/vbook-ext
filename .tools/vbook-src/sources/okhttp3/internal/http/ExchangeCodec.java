package okhttp3.internal.http;

import defpackage.ag9;
import defpackage.il9;
import defpackage.pk9;
import java.io.IOException;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface ExchangeCodec {

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public interface Carrier {
        void c(RealCall realCall, IOException iOException);

        void cancel();

        void f();

        Route h();
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    void a();

    void b(Request request);

    boolean c();

    void cancel();

    il9 d(Response response);

    Response.Builder e(boolean z);

    void f();

    pk9 g();

    long h(Response response);

    Carrier i();

    ag9 j(Request request, long j);
}

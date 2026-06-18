package okhttp3;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface CookieJar {
    public static final CookieJar a = new Companion.NoCookies();

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
        public static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            public final void a(HttpUrl httpUrl, List list) {
                httpUrl.getClass();
            }

            @Override // okhttp3.CookieJar
            public final void b(HttpUrl httpUrl) {
                httpUrl.getClass();
            }
        }
    }

    void a(HttpUrl httpUrl, List list);

    void b(HttpUrl httpUrl);
}

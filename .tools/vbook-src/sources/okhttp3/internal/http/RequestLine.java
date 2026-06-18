package okhttp3.internal.http;

import okhttp3.HttpUrl;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class RequestLine {
    public static String a(HttpUrl httpUrl) {
        httpUrl.getClass();
        String strB = httpUrl.b();
        String strD = httpUrl.d();
        if (strD == null) {
            return strB;
        }
        return strB + '?' + strD;
    }
}

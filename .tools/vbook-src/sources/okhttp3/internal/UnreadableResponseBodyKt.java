package okhttp3.internal;

import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class UnreadableResponseBodyKt {
    public static final Response a(Response response) {
        response.getClass();
        Response.Builder builderP = response.p();
        ResponseBody responseBody = response.s;
        builderP.g = new UnreadableResponseBody(responseBody.q(), responseBody.p());
        return builderP.a();
    }
}

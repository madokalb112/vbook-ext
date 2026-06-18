package okhttp3;

import defpackage.gc1;
import defpackage.lc5;
import defpackage.n1;
import defpackage.xl7;
import defpackage.xv5;
import java.util.Iterator;
import okhttp3.Headers;
import okhttp3.internal.EmptyTags;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http.HttpMethod;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class Request {
    public final HttpUrl a;
    public final String b;
    public final Headers c;
    public final RequestBody d;
    public final EmptyTags e;
    public CacheControl f;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static class Builder {
        public HttpUrl a;
        public RequestBody d;
        public EmptyTags e = EmptyTags.a;
        public String b = "GET";
        public Headers.Builder c = new Headers.Builder();

        public final void a(String str, String str2) {
            str2.getClass();
            Headers.Builder builder = this.c;
            builder.getClass();
            _HeadersCommonKt.b(str);
            _HeadersCommonKt.c(str2, str);
            builder.b(str);
            _HeadersCommonKt.a(builder, str, str2);
        }

        public final void b(String str, RequestBody requestBody) {
            str.getClass();
            if (str.length() <= 0) {
                gp.l("method.isEmpty() == true");
                return;
            }
            if (requestBody == null) {
                if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                    gp.k(xv5.p("method ", str, " must have a request body."));
                    return;
                }
            } else if (!HttpMethod.a(str)) {
                gp.k(xv5.p("method ", str, " must not have a request body."));
                return;
            }
            this.b = str;
            this.d = requestBody;
        }
    }

    public Request(Builder builder) {
        HttpUrl httpUrl = builder.a;
        if (httpUrl == null) {
            gp.j("url == null");
            throw null;
        }
        this.a = httpUrl;
        this.b = builder.b;
        this.c = builder.c.a();
        this.d = builder.d;
        this.e = builder.e;
    }

    public final Builder a() {
        Builder builder = new Builder();
        builder.a = this.a;
        builder.b = this.b;
        builder.d = this.d;
        builder.e = this.e;
        builder.c = this.c.d();
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        Headers headers = this.c;
        if (headers.size() != 0) {
            sb.append(", headers=[");
            Iterator<xl7> it = headers.iterator();
            int i = 0;
            while (true) {
                n1 n1Var = (n1) it;
                if (!n1Var.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = n1Var.next();
                int i2 = i + 1;
                if (i < 0) {
                    gc1.i0();
                    throw null;
                }
                xl7 xl7Var = (xl7) next;
                String str = (String) xl7Var.a;
                String str2 = (String) xl7Var.b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (_UtilCommonKt.k(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
        }
        EmptyTags emptyTags = EmptyTags.a;
        EmptyTags emptyTags2 = this.e;
        if (!lc5.Q(emptyTags2, emptyTags)) {
            sb.append(", tags=");
            sb.append(emptyTags2);
        }
        sb.append('}');
        return sb.toString();
    }
}

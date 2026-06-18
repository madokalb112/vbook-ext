package okhttp3.internal.http;

import defpackage.ie8;
import defpackage.mr0;
import defpackage.yg8;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class RealResponseBody extends ResponseBody {
    public final String b;
    public final long c;
    public final ie8 d;

    public RealResponseBody(String str, long j, ie8 ie8Var) {
        this.b = str;
        this.c = j;
        this.d = ie8Var;
    }

    @Override // okhttp3.ResponseBody
    public final mr0 I0() {
        return this.d;
    }

    @Override // okhttp3.ResponseBody
    public final long p() {
        return this.c;
    }

    @Override // okhttp3.ResponseBody
    public final MediaType q() {
        String str = this.b;
        if (str != null) {
            yg8 yg8Var = MediaType.b;
            try {
                return MediaType.Companion.a(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}

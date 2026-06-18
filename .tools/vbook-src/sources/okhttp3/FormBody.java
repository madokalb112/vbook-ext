package okhttp3;

import defpackage.he8;
import defpackage.yg8;
import okhttp3.MediaType;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class FormBody extends RequestBody {
    public static final MediaType b;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Builder {
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    static {
        yg8 yg8Var = MediaType.b;
        b = MediaType.Companion.a("application/x-www-form-urlencoded");
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final MediaType b() {
        return b;
    }

    @Override // okhttp3.RequestBody
    public final void e(he8 he8Var) {
        throw null;
    }
}

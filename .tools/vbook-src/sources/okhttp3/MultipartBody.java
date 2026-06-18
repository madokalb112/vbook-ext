package okhttp3;

import defpackage.he8;
import defpackage.yg8;
import okhttp3.MediaType;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class MultipartBody extends RequestBody {

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Builder {
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Part {

        /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
        public static final class Companion {
        }
    }

    static {
        yg8 yg8Var = MediaType.b;
        MediaType.Companion.a("multipart/mixed");
        MediaType.Companion.a("multipart/alternative");
        MediaType.Companion.a("multipart/digest");
        MediaType.Companion.a("multipart/parallel");
        MediaType.Companion.a("multipart/form-data");
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final MediaType b() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public final boolean d() {
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final void e(he8 he8Var) {
        throw null;
    }
}

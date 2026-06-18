package okhttp3;

import defpackage.mr0;
import defpackage.w84;
import defpackage.x84;
import java.io.Closeable;
import java.io.Flushable;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.platform.Platform;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class Cache implements Closeable, Flushable {

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class CacheResponseBody extends ResponseBody {

        /* JADX INFO: renamed from: okhttp3.Cache$CacheResponseBody$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
        public final class AnonymousClass1 extends x84 {
            @Override // defpackage.x84, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                throw null;
            }
        }

        @Override // okhttp3.ResponseBody
        public final mr0 I0() {
            return null;
        }

        @Override // okhttp3.ResponseBody
        public final long p() {
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        public final MediaType q() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Entry {

        /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
        public static final class Companion {
        }

        static {
            Platform platform = Platform.a;
            Platform.a.getClass();
            Platform.a.getClass();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public final class RealCacheRequest implements CacheRequest {

        /* JADX INFO: renamed from: okhttp3.Cache$RealCacheRequest$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
        public final class AnonymousClass1 extends w84 {
            @Override // defpackage.w84, defpackage.ag9, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                throw null;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.io.Flushable
    public final void flush() {
        throw null;
    }
}

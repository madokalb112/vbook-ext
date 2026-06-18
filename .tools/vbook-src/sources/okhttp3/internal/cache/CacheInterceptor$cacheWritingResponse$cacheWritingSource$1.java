package okhttp3.internal.cache;

import defpackage.il9;
import defpackage.uua;
import defpackage.xq0;
import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements il9 {
    public boolean a;

    @Override // defpackage.il9
    public final long D0(long j, xq0 xq0Var) {
        xq0Var.getClass();
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zF;
        if (this.a) {
            throw null;
        }
        TimeZone timeZone = _UtilJvmKt.a;
        TimeUnit.MILLISECONDS.getClass();
        try {
            zF = _UtilJvmKt.f(this, 100);
        } catch (IOException unused) {
            zF = false;
        }
        if (zF) {
            throw null;
        }
        this.a = true;
        throw null;
    }

    @Override // defpackage.il9
    public final uua l() {
        throw null;
    }
}

package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ev4 extends IOException implements yv1 {
    public final String a;
    public final Long b;

    public ev4(String str, Long l, Throwable th) {
        str.getClass();
        StringBuilder sb = new StringBuilder("Request timeout has expired [url=");
        sb.append(str);
        sb.append(", request_timeout=");
        super(dx1.k(sb, l == null ? "unknown" : l, " ms]"), th);
        this.a = str;
        this.b = l;
    }

    @Override // defpackage.yv1
    public final Throwable a() {
        return new ev4(this.a, this.b, getCause());
    }
}

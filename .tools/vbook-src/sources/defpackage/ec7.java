package defpackage;

import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.internal._HeadersCommonKt;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ec7 implements yb4 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Request.Builder b;

    public ec7(boolean z, Request.Builder builder) {
        this.a = z;
        this.b = builder;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        str.getClass();
        str2.getClass();
        if (!this.a || !str.equals("Content-Length")) {
            Headers.Builder builder = this.b.c;
            builder.getClass();
            _HeadersCommonKt.b(str);
            _HeadersCommonKt.c(str2, str);
            _HeadersCommonKt.a(builder, str, str2);
        }
        return heb.a;
    }
}

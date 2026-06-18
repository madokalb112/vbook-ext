package okhttp3.internal.ws;

import defpackage.j39;
import defpackage.lc5;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class WebSocketExtensions {
    public final boolean a;
    public final Integer b;
    public final boolean c;
    public final Integer d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class Companion {
    }

    public WebSocketExtensions(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.a = z;
        this.b = num;
        this.c = z2;
        this.d = num2;
        this.e = z3;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.a == webSocketExtensions.a && lc5.Q(this.b, webSocketExtensions.b) && this.c == webSocketExtensions.c && lc5.Q(this.d, webSocketExtensions.d) && this.e == webSocketExtensions.e && this.f == webSocketExtensions.f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        int iC = j39.c((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
        Integer num2 = this.d;
        return Boolean.hashCode(this.f) + j39.c((iC + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.a + ", clientMaxWindowBits=" + this.b + ", clientNoContextTakeover=" + this.c + ", serverMaxWindowBits=" + this.d + ", serverNoContextTakeover=" + this.e + ", unknownValues=" + this.f + ')';
    }
}

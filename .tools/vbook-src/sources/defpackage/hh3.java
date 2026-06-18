package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hh3 {
    public final String a;
    public final long b;
    public final Map c;

    public hh3(String str, long j, Map map) {
        map.getClass();
        this.a = str;
        this.b = j;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh3)) {
            return false;
        }
        hh3 hh3Var = (hh3) obj;
        return this.a.equals(hh3Var.a) && this.b == hh3Var.b && lc5.Q(this.c, hh3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xv5.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.a + ", timestamp=" + this.b + ", additionalCustomKeys=" + this.c + ')';
    }
}

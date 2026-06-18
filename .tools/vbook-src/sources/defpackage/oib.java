package defpackage;

import j$.time.ZoneOffset;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39(with = wib.class)
public final class oib implements Serializable {
    public static final nib Companion = new nib();
    public static final oib b;
    public final ZoneOffset a;

    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        zoneOffset.getClass();
        b = new oib(zoneOffset);
    }

    public oib(ZoneOffset zoneOffset) {
        zoneOffset.getClass();
        this.a = zoneOffset;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oib) {
            return lc5.Q(this.a, ((oib) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String string = this.a.toString();
        string.getClass();
        return string;
    }
}

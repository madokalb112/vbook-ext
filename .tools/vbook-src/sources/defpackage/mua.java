package defpackage;

import j$.time.ZoneId;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39(with = nua.class)
public class mua {
    public static final lua Companion = new lua();
    public final ZoneId a;

    static {
        oib.Companion.getClass();
        oib oibVar = oib.b;
        ZoneId zoneIdOf = ZoneId.of("UTC");
        zoneIdOf.getClass();
        oibVar.getClass();
        new zz3(zoneIdOf);
    }

    public mua(ZoneId zoneId) {
        this.a = zoneId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mua) {
            return this.a.equals(((mua) obj).a);
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

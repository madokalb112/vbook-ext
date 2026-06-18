package defpackage;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lua {
    public static mua a() {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        return c(zoneIdSystemDefault);
    }

    public static mua b(String str) throws Exception {
        str.getClass();
        try {
            if (str.equals("z")) {
                str = "Z";
            }
            ZoneId zoneIdOf = ZoneId.of(str);
            zoneIdOf.getClass();
            return c(zoneIdOf);
        } catch (Exception e) {
            if (e instanceof DateTimeException) {
                throw new d72(e);
            }
            throw e;
        }
    }

    public static mua c(ZoneId zoneId) {
        boolean zIsFixedOffset;
        if (zoneId instanceof ZoneOffset) {
            ZoneOffset zoneOffset = (ZoneOffset) zoneId;
            new oib(zoneOffset);
            return new zz3(zoneOffset);
        }
        try {
            zIsFixedOffset = zoneId.getRules().isFixedOffset();
        } catch (ArrayIndexOutOfBoundsException unused) {
            zIsFixedOffset = false;
        }
        if (!zIsFixedOffset) {
            return new mua(zoneId);
        }
        ZoneOffset zoneOffsetNormalized = zoneId.normalized();
        zoneOffsetNormalized.getClass();
        new oib(zoneOffsetNormalized);
        return new zz3(zoneId);
    }

    public final oi5 serializer() {
        return nua.a;
    }
}

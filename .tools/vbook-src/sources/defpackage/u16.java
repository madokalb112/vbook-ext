package defpackage;

import j$.time.DateTimeException;
import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class u16 {
    public static w16 a(long j) {
        try {
            LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(j);
            localDateOfEpochDay.getClass();
            return new w16(localDateOfEpochDay);
        } catch (DateTimeException e) {
            mn5.k(e);
            return null;
        }
    }

    public final oi5 serializer() {
        return e26.a;
    }
}

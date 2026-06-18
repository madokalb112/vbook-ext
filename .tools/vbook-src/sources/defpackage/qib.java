package defpackage;

import j$.time.DateTimeException;
import j$.time.ZoneOffset;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qib extends o0 {
    public final ax0 a;

    public qib(ax0 ax0Var) {
        this.a = ax0Var;
    }

    @Override // defpackage.o0
    public final ax0 a() {
        return this.a;
    }

    @Override // defpackage.o0
    public final xv1 b() {
        return rib.d;
    }

    @Override // defpackage.o0
    public final Object d(xv1 xv1Var) {
        y55 y55Var = (y55) xv1Var;
        y55Var.getClass();
        int i = lc5.Q(y55Var.a, Boolean.TRUE) ? -1 : 1;
        Integer num = y55Var.b;
        Integer numValueOf = num != null ? Integer.valueOf(num.intValue() * i) : null;
        Integer num2 = y55Var.c;
        Integer numValueOf2 = num2 != null ? Integer.valueOf(num2.intValue() * i) : null;
        Integer num3 = y55Var.d;
        Integer numValueOf3 = num3 != null ? Integer.valueOf(num3.intValue() * i) : null;
        d6a d6aVar = tib.a;
        try {
            if (numValueOf != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds = ZoneOffset.ofHoursMinutesSeconds(numValueOf.intValue(), numValueOf2 != null ? numValueOf2.intValue() : 0, numValueOf3 != null ? numValueOf3.intValue() : 0);
                zoneOffsetOfHoursMinutesSeconds.getClass();
                return new oib(zoneOffsetOfHoursMinutesSeconds);
            }
            if (numValueOf2 != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds2 = ZoneOffset.ofHoursMinutesSeconds(numValueOf2.intValue() / 60, numValueOf2.intValue() % 60, numValueOf3 != null ? numValueOf3.intValue() : 0);
                zoneOffsetOfHoursMinutesSeconds2.getClass();
                return new oib(zoneOffsetOfHoursMinutesSeconds2);
            }
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(numValueOf3 != null ? numValueOf3.intValue() : 0);
            zoneOffsetOfTotalSeconds.getClass();
            return new oib(zoneOffsetOfTotalSeconds);
        } catch (DateTimeException e) {
            mn5.k(e);
            return null;
        }
    }
}

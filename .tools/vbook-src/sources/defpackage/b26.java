package defpackage;

import j$.time.DateTimeException;
import j$.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class b26 {
    public static final long a = LocalDate.MIN.toEpochDay();
    public static final long b = LocalDate.MAX.toEpochDay();

    public static final w16 a(w16 w16Var, long j, l72 l72Var) {
        LocalDate localDatePlusMonths;
        LocalDate localDate = w16Var.a;
        l72Var.getClass();
        try {
            if (l72Var instanceof n72) {
                long jAddExact = Math.addExact(localDate.toEpochDay(), Math.multiplyExact(j, ((n72) l72Var).d));
                long j2 = a;
                if (jAddExact > b || j2 > jAddExact) {
                    throw new DateTimeException("The resulting day " + jAddExact + " is out of supported LocalDate range.");
                }
                localDatePlusMonths = LocalDate.ofEpochDay(jAddExact);
                localDatePlusMonths.getClass();
            } else {
                if (!(l72Var instanceof p72)) {
                    throw new fi1();
                }
                localDatePlusMonths = localDate.plusMonths(Math.multiplyExact(j, ((p72) l72Var).d));
            }
            return new w16(localDatePlusMonths);
        } catch (Exception e) {
            if (!(e instanceof DateTimeException) && !(e instanceof ArithmeticException)) {
                throw e;
            }
            throw new fi1("The result of adding " + j + " of " + l72Var + " to " + w16Var + " is out of LocalDate range.", e);
        }
    }

    public static final w16 b(w16 w16Var, v62 v62Var) {
        LocalDate localDate = w16Var.a;
        try {
            long j = v62Var.a;
            LocalDate localDatePlusMonths = j != 0 ? localDate.plusMonths(j) : localDate;
            int i = v62Var.b;
            if (i != 0) {
                localDatePlusMonths = localDatePlusMonths.plusDays(i);
            }
            return new w16(localDatePlusMonths);
        } catch (DateTimeException unused) {
            throw new fi1("The result of adding " + localDate + " to " + w16Var + " is out of LocalDate range.");
        }
    }
}

package defpackage;

import j$.time.DateTimeException;
import j$.time.YearMonth;
import j$.time.format.DateTimeFormatter;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39(with = n4c.class)
public final class e4c implements Comparable<e4c>, Serializable {
    public static final d4c Companion = new d4c();
    public final YearMonth a;

    public e4c(int i, int i2) {
        try {
            YearMonth yearMonthOf = YearMonth.of(i, i2);
            yearMonthOf.getClass();
            this.a = yearMonthOf;
        } catch (DateTimeException e) {
            mn5.k(e);
            throw null;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(e4c e4cVar) {
        e4c e4cVar2 = e4cVar;
        e4cVar2.getClass();
        return this.a.compareTo(e4cVar2.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e4c) {
            return lc5.Q(this.a, ((e4c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = ((DateTimeFormatter) m4c.a.getValue()).format(this.a);
        str.getClass();
        return str;
    }

    public e4c(YearMonth yearMonth) {
        yearMonth.getClass();
        this.a = yearMonth;
    }
}

package defpackage;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39(with = e26.class)
public final class w16 implements Comparable<w16>, Serializable {
    public static final u16 Companion = new u16();
    public final LocalDate a;

    static {
        LocalDate localDate = LocalDate.MIN;
        localDate.getClass();
        new w16(localDate);
        LocalDate localDate2 = LocalDate.MAX;
        localDate2.getClass();
        new w16(localDate2);
    }

    public w16(int i, int i2, int i3) {
        try {
            LocalDate localDateOf = LocalDate.of(i, i2, i3);
            localDateOf.getClass();
            this.a = localDateOf;
        } catch (DateTimeException e) {
            mn5.k(e);
            throw null;
        }
    }

    public final z72 a() {
        this.a.getDayOfWeek().getClass();
        return (z72) z72.b.get(r1.getValue() - 1);
    }

    public final yu6 b() {
        this.a.getMonth().getClass();
        return (yu6) yu6.b.get(r1.getValue() - 1);
    }

    @Override // java.lang.Comparable
    public final int compareTo(w16 w16Var) {
        w16 w16Var2 = w16Var;
        w16Var2.getClass();
        return this.a.compareTo(w16Var2.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w16) {
            return lc5.Q(this.a, ((w16) obj).a);
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w16(int i, yu6 yu6Var, int i2) {
        this(i, yu6Var.ordinal() + 1, i2);
        yu6Var.getClass();
    }

    public w16(LocalDate localDate) {
        localDate.getClass();
        this.a = localDate;
    }
}

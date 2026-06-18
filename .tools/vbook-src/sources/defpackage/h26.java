package defpackage;

import j$.time.LocalDate;
import j$.time.LocalDateTime;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39(with = l26.class)
public final class h26 implements Comparable<h26>, Serializable {
    public static final f26 Companion = new f26();
    public final LocalDateTime a;

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        localDateTime.getClass();
        new h26(localDateTime);
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
        localDateTime2.getClass();
        new h26(localDateTime2);
    }

    public h26(w16 w16Var, z26 z26Var) {
        LocalDateTime localDateTimeOf = LocalDateTime.of(w16Var.a, z26Var.a);
        localDateTimeOf.getClass();
        this.a = localDateTimeOf;
    }

    public final w16 a() {
        LocalDate localDate = this.a.toLocalDate();
        localDate.getClass();
        return new w16(localDate);
    }

    public final yu6 b() {
        this.a.getMonth().getClass();
        return (yu6) yu6.b.get(r1.getValue() - 1);
    }

    @Override // java.lang.Comparable
    public final int compareTo(h26 h26Var) {
        h26 h26Var2 = h26Var;
        h26Var2.getClass();
        return this.a.compareTo(h26Var2.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h26) {
            return lc5.Q(this.a, ((h26) obj).a);
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

    public h26(LocalDateTime localDateTime) {
        localDateTime.getClass();
        this.a = localDateTime;
    }
}

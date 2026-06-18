package defpackage;

import j$.time.DateTimeException;
import j$.time.LocalTime;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
@t39(with = d36.class)
public final class z26 implements Comparable<z26>, Serializable {
    public static final y26 Companion = new y26();
    public final LocalTime a;

    static {
        LocalTime localTime = LocalTime.MIN;
        localTime.getClass();
        new z26(localTime);
        LocalTime localTime2 = LocalTime.MAX;
        localTime2.getClass();
        new z26(localTime2);
    }

    public z26(int i, int i2, int i3, int i4) {
        try {
            LocalTime localTimeOf = LocalTime.of(i, i2, i3, i4);
            localTimeOf.getClass();
            this.a = localTimeOf;
        } catch (DateTimeException e) {
            mn5.k(e);
            throw null;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(z26 z26Var) {
        z26 z26Var2 = z26Var;
        z26Var2.getClass();
        return this.a.compareTo(z26Var2.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z26) {
            return lc5.Q(this.a, ((z26) obj).a);
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

    public z26(LocalTime localTime) {
        localTime.getClass();
        this.a = localTime;
    }
}

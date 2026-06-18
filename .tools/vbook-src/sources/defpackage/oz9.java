package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oz9 {
    public final long a;
    public final long b;
    public final ArrayList c;

    public oz9(long j, long j2, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz9)) {
            return false;
        }
        oz9 oz9Var = (oz9) obj;
        return this.a == oz9Var.a && this.b == oz9Var.b && this.c.equals(oz9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xv5.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = j39.o(this.a, "SubtitleEntry(startMillis=", ", endMillis=");
        sbO.append(this.b);
        sbO.append(", lines=");
        sbO.append(this.c);
        sbO.append(")");
        return sbO.toString();
    }
}

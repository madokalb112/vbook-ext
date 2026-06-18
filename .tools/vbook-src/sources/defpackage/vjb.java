package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vjb implements Comparable, Serializable {
    public static final vjb c = new vjb(0, 0);
    public final long a;
    public final long b;

    public vjb(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        vjb vjbVar = (vjb) obj;
        vjbVar.getClass();
        long j = vjbVar.a;
        long j2 = this.a;
        if (j2 != j) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.b ^ Long.MIN_VALUE, vjbVar.b ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjb)) {
            return false;
        }
        vjb vjbVar = (vjb) obj;
        return this.a == vjbVar.a && this.b == vjbVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.a ^ this.b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        un9.h(this.a, bArr, 0, 0, 4);
        bArr[8] = 45;
        un9.h(this.a, bArr, 9, 4, 6);
        bArr[13] = 45;
        un9.h(this.a, bArr, 14, 6, 8);
        bArr[18] = 45;
        un9.h(this.b, bArr, 19, 0, 2);
        bArr[23] = 45;
        un9.h(this.b, bArr, 24, 2, 8);
        return iw9.z(bArr);
    }
}

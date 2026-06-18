package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class b66 implements Iterable, fi5 {
    public final long a;
    public final long b;
    public final long c;

    public b66(long j, long j2) {
        this.a = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.b = j2;
        this.c = 1L;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b66)) {
            return false;
        }
        if (isEmpty() && ((b66) obj).isEmpty()) {
            return true;
        }
        b66 b66Var = (b66) obj;
        return this.a == b66Var.a && this.b == b66Var.b && this.c == b66Var.c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.a;
        long j2 = this.b;
        long j3 = (((j ^ (j >>> 32)) * 31) + (j2 ^ (j2 >>> 32))) * 31;
        long j4 = this.c;
        return (int) (j3 + (j4 ^ (j4 >>> 32)));
    }

    public boolean isEmpty() {
        long j = this.c;
        long j2 = this.b;
        long j3 = this.a;
        return j > 0 ? j3 > j2 : j3 < j2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c66(this.a, this.b, this.c);
    }

    public String toString() {
        StringBuilder sb;
        long j = this.c;
        long j2 = this.b;
        long j3 = this.a;
        if (j > 0) {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append("..");
            sb.append(j2);
            sb.append(" step ");
            sb.append(j);
        } else {
            sb = new StringBuilder();
            sb.append(j3);
            sb.append(" downTo ");
            sb.append(j2);
            sb.append(" step ");
            sb.append(-j);
        }
        return sb.toString();
    }
}

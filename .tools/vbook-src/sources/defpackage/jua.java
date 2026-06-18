package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jua implements Comparable {
    public final long a;

    public static long a(long j) {
        return (1 | (j - 1)) == Long.MAX_VALUE ? k63.k(qx1.A(j)) : qx1.O(xu6.a(), j);
    }

    public static final long b(long j, long j2) {
        int i = xu6.b;
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? qx1.A(j) : qx1.O(j, j2);
        }
        if (j != j2) {
            return k63.k(qx1.A(j2));
        }
        mc8 mc8Var = k63.b;
        return 0L;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        jua juaVar = (jua) obj;
        juaVar.getClass();
        return k63.c(b(this.a, juaVar.a), 0L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jua) {
            return this.a == ((jua) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.a + ')';
    }
}

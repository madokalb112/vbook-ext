package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tk7 implements sk7 {
    public final int c(int i, int i2) {
        long j = i;
        long j2 = j - 1;
        if (j2 < 0) {
            j2 = 0;
        }
        int i3 = (int) j2;
        long j3 = j + 1;
        if (j3 > 2147483647L) {
            j3 = 2147483647L;
        }
        return wx1.Q(i2, i3, (int) j3);
    }

    public final boolean equals(Object obj) {
        return obj instanceof tk7;
    }

    public final int hashCode() {
        return Integer.hashCode(1);
    }
}

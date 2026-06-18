package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rg0 {
    public long[] a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof rg0)) {
            return false;
        }
        rg0 rg0Var = (rg0) obj;
        int iMin = Math.min(this.a.length, rg0Var.a.length);
        int i = 0;
        while (true) {
            long[] jArr = this.a;
            if (i >= iMin) {
                int length = jArr.length;
                for (int i2 = i; i2 < length; i2++) {
                    if (this.a[i2] != 0) {
                        return false;
                    }
                }
                int length2 = rg0Var.a.length;
                while (i < length2) {
                    if (rg0Var.a[i] != 0) {
                        return false;
                    }
                    i++;
                }
                return true;
            }
            if (jArr[i] != rg0Var.a[i]) {
                return false;
            }
            i++;
        }
    }

    public final int hashCode() {
        int length = this.a.length;
        long j = 1234;
        while (length > 0) {
            long j2 = length;
            length--;
            j ^= j2 * this.a[length];
        }
        return (int) ((j >> 32) ^ j);
    }
}

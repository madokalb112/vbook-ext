package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d66 extends b66 {
    @Override // defpackage.b66
    public final boolean equals(Object obj) {
        if (!(obj instanceof d66)) {
            return false;
        }
        if (isEmpty() && ((d66) obj).isEmpty()) {
            return true;
        }
        d66 d66Var = (d66) obj;
        return this.a == d66Var.a && this.b == d66Var.b;
    }

    @Override // defpackage.b66
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.a;
        long j2 = 31 * (j ^ (j >>> 32));
        long j3 = this.b;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    @Override // defpackage.b66
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // defpackage.b66
    public final String toString() {
        return this.a + ".." + this.b;
    }
}

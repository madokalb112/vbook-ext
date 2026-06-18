package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ha5 extends ga5 {
    public static final ha5 d = new ha5(1, 0, 1);

    @Override // defpackage.ga5
    public final boolean equals(Object obj) {
        if (!(obj instanceof ha5)) {
            return false;
        }
        if (isEmpty() && ((ha5) obj).isEmpty()) {
            return true;
        }
        ha5 ha5Var = (ha5) obj;
        return this.a == ha5Var.a && this.b == ha5Var.b;
    }

    @Override // defpackage.ga5
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.ga5
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // defpackage.ga5
    public final String toString() {
        return this.a + ".." + this.b;
    }
}

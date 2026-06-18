package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gl5 implements AutoCloseable {
    public final ut0 a;

    public /* synthetic */ gl5(ut0 ut0Var) {
        this.a = ut0Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        kl8.O(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gl5) {
            return lc5.Q(this.a, ((gl5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KtorNetworkResponseBody(channel=" + this.a + ")";
    }
}

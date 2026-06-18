package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jw2 extends Exception {
    public final Throwable a;

    public jw2(Throwable th, nx1 nx1Var, jx1 jx1Var) {
        super("Coroutine dispatcher " + nx1Var + " threw an exception, context = " + jx1Var, th);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}

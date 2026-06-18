package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qa4 extends Exception implements yv1 {
    public final long a;

    public qa4(long j) {
        this.a = j;
    }

    @Override // defpackage.yv1
    public final Throwable a() {
        qa4 qa4Var = new qa4(this.a);
        qa4Var.initCause(this);
        return qa4Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Frame is too big: " + this.a;
    }
}

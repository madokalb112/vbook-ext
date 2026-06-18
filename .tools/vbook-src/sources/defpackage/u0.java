package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class u0 {
    public static final u0 c;
    public static final u0 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (j1.GENERATE_CANCELLATION_CAUSES) {
            d = null;
            c = null;
        } else {
            d = new u0(false, null);
            c = new u0(true, null);
        }
    }

    public u0(boolean z, Throwable th) {
        this.a = z;
        this.b = th;
    }
}

package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x0 {
    public static final x0 d = new x0();
    public final Runnable a;
    public final Executor b;
    public x0 c;

    public x0() {
        this.a = null;
        this.b = null;
    }

    public x0(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}

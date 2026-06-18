package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xa1 {
    public final Throwable a;

    public xa1(Throwable th) {
        this.a = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Throwable a(kb4 kb4Var) {
        Throwable th = this.a;
        if (th == 0) {
            return null;
        }
        return th instanceof yv1 ? ((yv1) th).a() : th instanceof CancellationException ? e11.a(((CancellationException) th).getMessage(), th) : (Throwable) kb4Var.invoke(th);
    }
}

package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class u2c {
    public static final String a = cp4.o("WorkerWrapper");

    public static final Object a(ListenableFuture listenableFuture, zz5 zz5Var, o1a o1aVar) {
        Object obj;
        try {
            boolean z = false;
            if (!listenableFuture.isDone()) {
                ay0 ay0Var = new ay0(1, bx1.J(o1aVar));
                ay0Var.u();
                listenableFuture.addListener(new iva(listenableFuture, ay0Var, 0), dt2.a);
                ay0Var.w(new cea(8, zz5Var, listenableFuture));
                return ay0Var.s();
            }
            while (true) {
                try {
                    obj = listenableFuture.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}

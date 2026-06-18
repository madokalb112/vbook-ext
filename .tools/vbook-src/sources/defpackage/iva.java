package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class iva implements Runnable {
    public final /* synthetic */ int a;
    public final ListenableFuture b;
    public final ay0 c;

    public /* synthetic */ iva(ListenableFuture listenableFuture, ay0 ay0Var, int i) {
        this.a = i;
        this.b = listenableFuture;
        this.c = ay0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ay0 ay0Var = this.c;
        ListenableFuture listenableFuture = this.b;
        switch (i) {
            case 0:
                if (listenableFuture.isCancelled()) {
                    ay0Var.a(null);
                    return;
                }
                boolean z = false;
                while (true) {
                    try {
                        try {
                            Object obj = listenableFuture.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            ay0Var.resumeWith(obj);
                            return;
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            cause.getClass();
                            ay0Var.resumeWith(new pm8(cause));
                            return;
                        }
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (Throwable th) {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                break;
            default:
                if (listenableFuture.isCancelled()) {
                    ay0Var.a(null);
                    return;
                }
                try {
                    ay0Var.resumeWith(x2.f(listenableFuture));
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause2 = e2.getCause();
                    if (cause2 != null) {
                        ay0Var.resumeWith(new pm8(cause2));
                        return;
                    } else {
                        kk5 kk5Var = new kk5();
                        lc5.f0(kk5Var, lc5.class.getName());
                        throw kk5Var;
                    }
                }
        }
    }
}

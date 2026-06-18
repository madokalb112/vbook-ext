package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class e3 extends e44 implements Runnable {
    public static final /* synthetic */ int d = 0;
    public ListenableFuture b;
    public Object c;

    public e3(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.b = listenableFuture;
        obj.getClass();
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void afterDone() {
        maybePropagateCancellationTo(this.b);
        this.b = null;
        this.c = null;
    }

    public abstract Object h(Object obj, Object obj2);

    public abstract void i(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    public final String pendingToString() {
        String str;
        ListenableFuture listenableFuture = this.b;
        Object obj = this.c;
        String strPendingToString = super/*j1*/.pendingToString();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strPendingToString != null) {
                return str.concat(strPendingToString);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.b;
        Object obj = this.c;
        if ((isCancelled() | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.b = null;
        if (listenableFuture.isCancelled()) {
            setFuture(listenableFuture);
            return;
        }
        try {
            try {
                Object objH = h(obj, qc4.b(listenableFuture));
                this.c = null;
                i(objH);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    setException(th);
                } finally {
                    this.c = null;
                }
            }
        } catch (Error e) {
            setException(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            setException(e2.getCause());
        } catch (Exception e3) {
            setException(e3);
        }
    }
}

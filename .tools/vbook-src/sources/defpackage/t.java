package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class t extends e44 implements Runnable {
    public static final /* synthetic */ int e = 0;
    public ListenableFuture b;
    public Class c;
    public Object d;

    public t(ListenableFuture listenableFuture, Class cls, Object obj) {
        listenableFuture.getClass();
        this.b = listenableFuture;
        this.c = cls;
        obj.getClass();
        this.d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void afterDone() {
        maybePropagateCancellationTo(this.b);
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public abstract Object h(Throwable th, Object obj);

    public abstract void i(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    public final String pendingToString() {
        String str;
        ListenableFuture listenableFuture = this.b;
        Class cls = this.c;
        Object obj = this.d;
        String strPendingToString = super/*j1*/.pendingToString();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strPendingToString != null) {
                return str.concat(strPendingToString);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.b;
        Class cls = this.c;
        Object obj = this.d;
        if (((obj == null) || ((listenableFuture == null) | (cls == null))) || isCancelled()) {
            return;
        }
        this.b = null;
        try {
            th = listenableFuture instanceof j1 ? ((j1) listenableFuture).tryInternalFastPathGetFailure() : null;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + listenableFuture.getClass() + " threw " + e2.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objB = th == null ? qc4.b(listenableFuture) : null;
        if (th == null) {
            set(objB);
            return;
        }
        if (!cls.isInstance(th)) {
            setFuture(listenableFuture);
            return;
        }
        try {
            Object objH = h(th, obj);
            this.c = null;
            this.d = null;
            i(objH);
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                setException(th2);
            } finally {
                this.c = null;
                this.d = null;
            }
        }
    }
}

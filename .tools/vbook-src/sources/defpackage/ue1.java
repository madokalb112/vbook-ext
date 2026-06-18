package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ue1 extends j8 {
    public static final vt5 t = new vt5(ue1.class);
    public s45 e;
    public final boolean f;
    public te1 s;

    public ue1(s45 s45Var, boolean z) {
        int size = s45Var.size();
        this.a = null;
        this.b = size;
        this.e = s45Var;
        this.f = z;
    }

    @Override // defpackage.j1
    public final void afterDone() {
        super.afterDone();
        s45 s45Var = this.e;
        this.e = null;
        this.s = null;
        if (isCancelled() && (s45Var != null)) {
            boolean zWasInterrupted = wasInterrupted();
            reb it = s45Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zWasInterrupted);
            }
        }
    }

    public final void h(s45 s45Var) {
        int iH0 = j8.c.h0(this);
        fx1.Q("Less than 0 remaining futures", iH0 >= 0);
        if (iH0 == 0) {
            if (s45Var != null) {
                reb it = s45Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        boolean z = false;
                        while (true) {
                            try {
                                future.get();
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
                            try {
                                Thread.currentThread().interrupt();
                            } catch (ExecutionException e) {
                                i(e.getCause());
                            } catch (Throwable th2) {
                                i(th2);
                            }
                        }
                    }
                }
            }
            this.a = null;
            te1 te1Var = this.s;
            if (te1Var != null) {
                try {
                    te1Var.c.execute(te1Var);
                } catch (RejectedExecutionException e2) {
                    te1Var.d.setException(e2);
                }
            }
            this.e = null;
        }
    }

    public final void i(Throwable th) {
        th.getClass();
        if (this.f && !setException(th)) {
            Set set = this.a;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!isCancelled()) {
                    Throwable thTryInternalFastPathGetFailure = tryInternalFastPathGetFailure();
                    Objects.requireNonNull(thTryInternalFastPathGetFailure);
                    while (thTryInternalFastPathGetFailure != null && setNewSetFromMap.add(thTryInternalFastPathGetFailure)) {
                        thTryInternalFastPathGetFailure = thTryInternalFastPathGetFailure.getCause();
                    }
                }
                j8.c.g0(this, setNewSetFromMap);
                Set set2 = this.a;
                Objects.requireNonNull(set2);
                set = set2;
            }
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                if (set.add(cause)) {
                }
            }
            t.a().log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
            return;
        }
        if (th instanceof Error) {
            t.a().log(Level.SEVERE, "Input Future failed with Error", th);
        }
    }

    @Override // defpackage.j1
    public final void interruptTask() {
        te1 te1Var = this.s;
        if (te1Var != null) {
            te1Var.c();
        }
    }

    public final void j() {
        Objects.requireNonNull(this.e);
        if (this.e.isEmpty()) {
            te1 te1Var = this.s;
            if (te1Var != null) {
                try {
                    te1Var.c.execute(te1Var);
                    return;
                } catch (RejectedExecutionException e) {
                    te1Var.d.setException(e);
                    return;
                }
            }
            return;
        }
        boolean z = this.f;
        Executor executor = et2.a;
        if (!z) {
            Runnable g8Var = new g8(1, this, (Object) null);
            reb it = this.e.iterator();
            while (it.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) it.next();
                if (listenableFuture.isDone()) {
                    h(null);
                } else {
                    listenableFuture.addListener(g8Var, executor);
                }
            }
            return;
        }
        reb it2 = this.e.iterator();
        int i = 0;
        while (it2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            int i2 = i + 1;
            if (listenableFuture2.isDone()) {
                k(listenableFuture2);
            } else {
                listenableFuture2.addListener(new g8(this, i, listenableFuture2), executor);
            }
            i = i2;
        }
    }

    public final void k(ListenableFuture listenableFuture) {
        try {
            boolean z = false;
            if (listenableFuture.isCancelled()) {
                this.e = null;
                cancel(false);
            } else {
                while (true) {
                    try {
                        try {
                            listenableFuture.get();
                            break;
                        } catch (InterruptedException unused) {
                            z = true;
                        } catch (Throwable th) {
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (ExecutionException e) {
                        i(e.getCause());
                    } catch (Throwable th2) {
                        i(th2);
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        } finally {
            h(null);
        }
    }

    @Override // defpackage.j1
    public final String pendingToString() {
        s45 s45Var = this.e;
        if (s45Var == null) {
            return super.pendingToString();
        }
        return "futures=" + s45Var;
    }
}

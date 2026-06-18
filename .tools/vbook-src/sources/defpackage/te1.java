package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class te1 extends xb5 {
    public final Executor c;
    public final /* synthetic */ ue1 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ue1 f;
    public final Object s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public te1(ue1 ue1Var, zw zwVar, Executor executor) {
        this(ue1Var, executor);
        this.e = 0;
        this.f = ue1Var;
        zwVar.getClass();
        this.s = zwVar;
    }

    @Override // defpackage.xb5
    public final void a(Throwable th) {
        ue1 ue1Var = this.d;
        ue1Var.s = null;
        if (th instanceof ExecutionException) {
            ue1Var.setException(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            ue1Var.cancel(false);
        } else {
            ue1Var.setException(th);
        }
    }

    @Override // defpackage.xb5
    public final void b(Object obj) {
        this.d.s = null;
        int i = this.e;
        ue1 ue1Var = this.f;
        switch (i) {
            case 0:
                ue1Var.setFuture((ListenableFuture) obj);
                break;
            default:
                ue1Var.set(obj);
                break;
        }
    }

    @Override // defpackage.xb5
    public final boolean d() {
        return this.d.isDone();
    }

    @Override // defpackage.xb5
    public final Object e() {
        int i = this.e;
        Object obj = this.s;
        switch (i) {
            case 0:
                zw zwVar = (zw) obj;
                ListenableFuture listenableFutureCall = zwVar.call();
                fx1.M(listenableFutureCall, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zwVar);
                return listenableFutureCall;
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // defpackage.xb5
    public final String f() {
        switch (this.e) {
            case 0:
                return ((zw) this.s).toString();
            default:
                return ((Callable) this.s).toString();
        }
    }

    public te1(ue1 ue1Var, Executor executor) {
        this.d = ue1Var;
        executor.getClass();
        this.c = executor;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public te1(ue1 ue1Var, Callable callable) {
        this(ue1Var, (Executor) et2.a);
        this.e = 1;
        this.f = ue1Var;
        this.s = callable;
    }
}

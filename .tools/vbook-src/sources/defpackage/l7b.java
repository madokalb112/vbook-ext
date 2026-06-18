package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class l7b extends xb5 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ m7b d;
    public final Object e;

    public l7b(m7b m7bVar, Callable callable) {
        this.d = m7bVar;
        callable.getClass();
        this.e = callable;
    }

    @Override // defpackage.xb5
    public final void a(Throwable th) {
        int i = this.c;
        f44 f44Var = this.d;
        switch (i) {
            case 0:
                f44Var.setException(th);
                break;
            default:
                f44Var.setException(th);
                break;
        }
    }

    @Override // defpackage.xb5
    public final void b(Object obj) {
        int i = this.c;
        f44 f44Var = this.d;
        switch (i) {
            case 0:
                f44Var.setFuture((ListenableFuture) obj);
                break;
            default:
                f44Var.set(obj);
                break;
        }
    }

    @Override // defpackage.xb5
    public final boolean d() {
        int i = this.c;
        m7b m7bVar = this.d;
        switch (i) {
        }
        return m7bVar.isDone();
    }

    @Override // defpackage.xb5
    public final Object e() {
        int i = this.c;
        Object obj = this.e;
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
        switch (this.c) {
            case 0:
                return ((zw) this.e).toString();
            default:
                return ((Callable) this.e).toString();
        }
    }

    public l7b(m7b m7bVar, zw zwVar) {
        this.d = m7bVar;
        zwVar.getClass();
        this.e = zwVar;
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cd5 extends ee5 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater u = AtomicIntegerFieldUpdater.newUpdater(cd5.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final kb4 t;

    public cd5(kb4 kb4Var) {
        this.t = kb4Var;
    }

    @Override // defpackage.ee5
    public final boolean q() {
        return true;
    }

    @Override // defpackage.ee5
    public final void r(Throwable th) {
        if (u.compareAndSet(this, 0, 1)) {
            this.t.invoke(th);
        }
    }
}

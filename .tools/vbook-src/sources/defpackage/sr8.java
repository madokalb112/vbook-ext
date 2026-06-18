package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sr8 implements dp5, Serializable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(sr8.class, Object.class, "b");
    public volatile ib4 a;
    public volatile Object b;

    @Override // defpackage.dp5
    public final boolean d() {
        return this.b != zk4.y;
    }

    @Override // defpackage.dp5
    public final Object getValue() {
        Object obj = this.b;
        zk4 zk4Var = zk4.y;
        if (obj != zk4Var) {
            return obj;
        }
        ib4 ib4Var = this.a;
        if (ib4Var != null) {
            Object objInvoke = ib4Var.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, zk4Var, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != zk4Var) {
                }
            }
            this.a = null;
            return objInvoke;
        }
        return this.b;
    }

    public final String toString() {
        return d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

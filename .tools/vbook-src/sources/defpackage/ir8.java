package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ir8 implements jt1, yx1 {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(ir8.class, Object.class, "result");
    public final jt1 a;
    private volatile Object result;

    public ir8(jt1 jt1Var) {
        xx1 xx1Var = xx1.a;
        this.a = jt1Var;
        this.result = xx1Var;
    }

    @Override // defpackage.yx1
    public final yx1 getCallerFrame() {
        jt1 jt1Var = this.a;
        if (jt1Var instanceof yx1) {
            return (yx1) jt1Var;
        }
        return null;
    }

    @Override // defpackage.jt1
    public final jx1 getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.jt1
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            xx1 xx1Var = xx1.b;
            if (obj2 == xx1Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, xx1Var, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != xx1Var) {
                        break;
                    }
                }
                return;
            }
            xx1 xx1Var2 = xx1.a;
            if (obj2 != xx1Var2) {
                gp.j("Already resumed");
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
            xx1 xx1Var3 = xx1.c;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, xx1Var2, xx1Var3)) {
                if (atomicReferenceFieldUpdater2.get(this) != xx1Var2) {
                    break;
                }
            }
            this.a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.a;
    }
}

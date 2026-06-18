package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hr9 extends b3 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.b3
    public final boolean a(a3 a3Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(gr9.a);
        return true;
    }

    @Override // defpackage.b3
    public final jt1[] b(a3 a3Var) {
        this.a.set(null);
        return jf0.a;
    }
}

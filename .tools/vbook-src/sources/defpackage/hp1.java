package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hp1 implements a39 {
    public final AtomicReference a;

    public hp1(a39 a39Var) {
        this.a = new AtomicReference(a39Var);
    }

    @Override // defpackage.a39
    public final Iterator iterator() {
        a39 a39Var = (a39) this.a.getAndSet(null);
        if (a39Var != null) {
            return a39Var.iterator();
        }
        gp.j("This sequence can be consumed only once.");
        return null;
    }
}

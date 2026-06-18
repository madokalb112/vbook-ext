package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ix2 extends k1 {
    public final Iterator c;
    public final HashSet d;

    public ix2(Iterator it, f48 f48Var) {
        it.getClass();
        this.c = it;
        this.d = new HashSet();
    }

    @Override // defpackage.k1
    public final void a() {
        Object next;
        do {
            Iterator it = this.c;
            if (!it.hasNext()) {
                this.a = 2;
                return;
            }
            next = it.next();
        } while (!this.d.add(next));
        this.b = next;
        this.a = 1;
    }
}

package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vx3 implements a39 {
    public final a39 a;
    public final boolean b;
    public final kb4 c;

    public vx3(a39 a39Var, boolean z, kb4 kb4Var) {
        this.a = a39Var;
        this.b = z;
        this.c = kb4Var;
    }

    @Override // defpackage.a39
    public final Iterator iterator() {
        return new ux3(this);
    }
}

package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wf5 implements Iterator, fi5 {
    public final ue5 a;
    public final wc8 b;
    public final oi5 c;

    public wf5(ue5 ue5Var, wc8 wc8Var, oi5 oi5Var) {
        ue5Var.getClass();
        oi5Var.getClass();
        this.a = ue5Var;
        this.b = wc8Var;
        this.c = oi5Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.x() != 10;
    }

    @Override // java.util.Iterator
    public final Object next() {
        oi5 oi5Var = this.c;
        return new nt9(this.a, g3c.c, this.b, oi5Var.e(), null).d(oi5Var);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

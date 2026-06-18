package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vf5 implements Iterator, fi5 {
    public final ue5 a;
    public final wc8 b;
    public final oi5 c;
    public boolean d;
    public boolean e;

    public vf5(ue5 ue5Var, wc8 wc8Var, oi5 oi5Var) {
        ue5Var.getClass();
        oi5Var.getClass();
        this.a = ue5Var;
        this.b = wc8Var;
        this.c = oi5Var;
        this.d = true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e) {
            return false;
        }
        wc8 wc8Var = this.b;
        if (wc8Var.x() == 9) {
            this.e = true;
            wc8Var.i((byte) 9);
            if (wc8Var.x() == 10) {
                return false;
            }
            if (wc8Var.x() != 8) {
                wc8Var.q();
                return false;
            }
            l1.s(wc8Var, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6);
            throw null;
        }
        if (wc8Var.x() != 10 || this.e) {
            return true;
        }
        String strN = kc5.N((byte) 9);
        int i = wc8Var.b;
        int i2 = i > 0 ? i - 1 : i;
        tv tvVar = wc8Var.v;
        l1.s(wc8Var, tw2.o("Expected ", strN, ", but had '", (i == tvVar.b || i2 < 0) ? "EOF" : String.valueOf(tvVar.a[i2]), "' instead"), i2, null, 4);
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        boolean z = this.d;
        wc8 wc8Var = this.b;
        if (z) {
            this.d = false;
        } else {
            wc8Var.j(',');
        }
        oi5 oi5Var = this.c;
        return new nt9(this.a, g3c.c, wc8Var, oi5Var.e(), null).d(oi5Var);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

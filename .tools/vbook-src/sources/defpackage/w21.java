package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class w21 implements Iterator, fi5 {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final int c;
    public boolean d;
    public int e;

    public w21(char c, char c2, int i) {
        boolean z = false;
        this.b = i;
        this.c = c2;
        if (i <= 0 ? lc5.V(c, c2) >= 0 : lc5.V(c, c2) <= 0) {
            z = true;
        }
        this.d = z;
        this.e = z ? c : c2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                int i = this.e;
                if (i != this.c) {
                    this.e = this.b + i;
                } else {
                    if (!this.d) {
                        mn5.m();
                        return null;
                    }
                    this.d = false;
                }
                return Character.valueOf((char) i);
            default:
                return Integer.valueOf(nextInt());
        }
    }

    public int nextInt() {
        int i = this.e;
        if (i != this.c) {
            this.e = this.b + i;
            return i;
        }
        if (this.d) {
            this.d = false;
            return i;
        }
        mn5.m();
        return 0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public w21(int i, int i2, int i3) {
        this.b = i3;
        this.c = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.d = z;
        this.e = z ? i : i2;
    }
}

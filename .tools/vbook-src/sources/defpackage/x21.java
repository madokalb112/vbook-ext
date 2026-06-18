package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x21 implements Iterable, fi5 {
    public final char a;
    public final char b;
    public final int c = 1;

    static {
        new x21((char) 1, (char) 0);
    }

    public x21(char c, char c2) {
        this.a = c;
        this.b = (char) sw1.O(c, c2, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x21)) {
            return false;
        }
        char c = this.a;
        char c2 = this.b;
        if (lc5.V(c, c2) > 0) {
            x21 x21Var = (x21) obj;
            if (lc5.V(x21Var.a, x21Var.b) > 0) {
                return true;
            }
        }
        x21 x21Var2 = (x21) obj;
        return c == x21Var2.a && c2 == x21Var2.b;
    }

    public final int hashCode() {
        char c = this.a;
        char c2 = this.b;
        if (lc5.V(c, c2) > 0) {
            return -1;
        }
        return (c * 31) + c2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new w21(this.a, this.b, this.c);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}

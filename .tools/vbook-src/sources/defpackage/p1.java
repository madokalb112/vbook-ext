package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class p1 extends q1 implements RandomAccess {
    public final q1 a;
    public final int b;
    public final int c;

    public p1(q1 q1Var, int i, int i2) {
        this.a = q1Var;
        this.b = i;
        lc5.T(i, i2, q1Var.a());
        this.c = i2 - i;
    }

    @Override // defpackage.g0
    public final int a() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            k27.m(xv5.o("index: ", i, i2, ", size: "));
            return null;
        }
        return this.a.get(this.b + i);
    }

    @Override // defpackage.q1, java.util.List
    public final List subList(int i, int i2) {
        lc5.T(i, i2, this.c);
        int i3 = this.b;
        return new p1(this.a, i + i3, i3 + i2);
    }
}

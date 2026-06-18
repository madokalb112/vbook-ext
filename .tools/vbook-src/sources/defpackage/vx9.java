package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class vx9 implements a39, a63 {
    public final a39 a;
    public final int b;
    public final int c;

    public vx9(a39 a39Var, int i, int i2) {
        a39Var.getClass();
        this.a = a39Var;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            gp.k(dx1.f(i, "startIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 < 0) {
            gp.k(dx1.f(i2, "endIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        gp.k(xv5.o("endIndex should be not less than startIndex, but was ", i2, i, " < "));
        throw null;
    }

    @Override // defpackage.a63
    public final a39 a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? this : new vx9(this.a, i3, i + i3);
    }

    @Override // defpackage.a63
    public final a39 b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? rc3.a : new vx9(this.a, i3 + i, i2);
    }

    @Override // defpackage.a39
    public final Iterator iterator() {
        return new yd4(this);
    }
}

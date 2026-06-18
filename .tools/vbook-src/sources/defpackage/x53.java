package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x53 implements a39, a63 {
    public final /* synthetic */ int a;
    public final a39 b;
    public final int c;

    public x53(a39 a39Var, int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = a39Var;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                if2.d(i, 46, "count must be non-negative, but was ");
                throw null;
            default:
                a39Var.getClass();
                this.b = a39Var;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                if2.d(i, 46, "count must be non-negative, but was ");
                throw null;
        }
    }

    @Override // defpackage.a63
    public final a39 a(int i) {
        int i2 = this.a;
        a39 a39Var = this.b;
        int i3 = this.c;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new x53(this, i, 1) : new vx9(a39Var, i3, i4);
            default:
                return i >= i3 ? this : new x53(a39Var, i, 1);
        }
    }

    @Override // defpackage.a63
    public final a39 b(int i) {
        int i2 = this.a;
        a39 a39Var = this.b;
        int i3 = this.c;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new x53(this, i, 0) : new x53(a39Var, i4, 0);
            default:
                return i >= i3 ? rc3.a : new vx9(a39Var, i, i3);
        }
    }

    @Override // defpackage.a39
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new w53(this);
            default:
                return new w53(this, (byte) 0);
        }
    }
}

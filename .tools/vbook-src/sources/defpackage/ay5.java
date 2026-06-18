package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ay5 implements hyb {
    public final hyb a;
    public final int b;

    public ay5(hyb hybVar, int i) {
        this.a = hybVar;
        this.b = i;
    }

    public final int a(pn2 pn2Var) {
        if ((this.b & 16) != 0) {
            return this.a.a(pn2Var);
        }
        return 0;
    }

    public final int b(pn2 pn2Var, zm5 zm5Var) {
        if (((zm5Var == zm5.a ? 4 : 1) & this.b) != 0) {
            return this.a.b(pn2Var, zm5Var);
        }
        return 0;
    }

    public final int c(pn2 pn2Var) {
        if ((this.b & 32) != 0) {
            return this.a.c(pn2Var);
        }
        return 0;
    }

    public final int d(pn2 pn2Var, zm5 zm5Var) {
        if (((zm5Var == zm5.a ? 8 : 2) & this.b) != 0) {
            return this.a.d(pn2Var, zm5Var);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay5)) {
            return false;
        }
        ay5 ay5Var = (ay5) obj;
        return this.a.equals(ay5Var.a) && this.b == ay5Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.b;
        int i2 = zib.c;
        if ((i & i2) == i2) {
            zib.n("Start", sb3);
        }
        int i3 = zib.e;
        if ((i & i3) == i3) {
            zib.n("Left", sb3);
        }
        if ((i & 16) == 16) {
            zib.n("Top", sb3);
        }
        int i4 = zib.d;
        if ((i & i4) == i4) {
            zib.n("End", sb3);
        }
        int i5 = zib.f;
        if ((i & i5) == i5) {
            zib.n("Right", sb3);
        }
        if ((i & 32) == 32) {
            zib.n("Bottom", sb3);
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}

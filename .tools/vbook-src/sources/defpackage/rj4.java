package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rj4 implements m39 {
    public final String a;
    public final m39 b;
    public final m39 c;

    public rj4(String str, m39 m39Var, m39 m39Var2) {
        this.a = str;
        this.b = m39Var;
        this.c = m39Var2;
    }

    @Override // defpackage.m39
    public final String a() {
        return this.a;
    }

    @Override // defpackage.m39
    public final int d(String str) {
        str.getClass();
        Integer numL = iw9.L(10, str);
        if (numL != null) {
            return numL.intValue();
        }
        gp.l(str.concat(" is not a valid map index"));
        return 0;
    }

    @Override // defpackage.m39
    public final gx1 e() {
        return qw9.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj4)) {
            return false;
        }
        rj4 rj4Var = (rj4) obj;
        return this.a.equals(rj4Var.a) && this.b.equals(rj4Var.b) && this.c.equals(rj4Var.c);
    }

    @Override // defpackage.m39
    public final int f() {
        return 2;
    }

    @Override // defpackage.m39
    public final String g(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.m39
    public final List h(int i) {
        if (i >= 0) {
            return lc3.a;
        }
        gp.k(ky0.s(this.a, " expects only non-negative indices", xv5.u(i, "Illegal index ", ", ")));
        return null;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.m39
    public final m39 i(int i) {
        if (i < 0) {
            gp.k(ky0.s(this.a, " expects only non-negative indices", xv5.u(i, "Illegal index ", ", ")));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.b;
        }
        if (i2 == 1) {
            return this.c;
        }
        gp.j("Unreached");
        return null;
    }

    @Override // defpackage.m39
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        gp.k(ky0.s(this.a, " expects only non-negative indices", xv5.u(i, "Illegal index ", ", ")));
        return false;
    }

    public final String toString() {
        return this.a + '(' + this.b + ", " + this.c + ')';
    }
}

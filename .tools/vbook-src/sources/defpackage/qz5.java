package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class qz5 implements m39 {
    public final m39 a;

    public qz5(m39 m39Var) {
        this.a = m39Var;
    }

    @Override // defpackage.m39
    public final int d(String str) {
        str.getClass();
        Integer numL = iw9.L(10, str);
        if (numL != null) {
            return numL.intValue();
        }
        gp.l(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // defpackage.m39
    public final gx1 e() {
        return qw9.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz5)) {
            return false;
        }
        qz5 qz5Var = (qz5) obj;
        return lc5.Q(this.a, qz5Var.a) && lc5.Q(a(), qz5Var.a());
    }

    @Override // defpackage.m39
    public final int f() {
        return 1;
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
        w58.n(xv5.u(i, "Illegal index ", ", "), a(), " expects only non-negative indices");
        return null;
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.m39
    public final m39 i(int i) {
        if (i >= 0) {
            return this.a;
        }
        w58.n(xv5.u(i, "Illegal index ", ", "), a(), " expects only non-negative indices");
        return null;
    }

    @Override // defpackage.m39
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        w58.n(xv5.u(i, "Illegal index ", ", "), a(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}

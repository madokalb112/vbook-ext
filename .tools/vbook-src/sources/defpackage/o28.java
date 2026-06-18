package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class o28 implements m39 {
    public final String a;
    public final m28 b;

    public o28(String str, m28 m28Var) {
        m28Var.getClass();
        this.a = str;
        this.b = m28Var;
    }

    @Override // defpackage.m39
    public final String a() {
        return this.a;
    }

    public final void b() {
        throw new IllegalStateException(ky0.s(this.a, " does not have elements", new StringBuilder("Primitive descriptor ")));
    }

    @Override // defpackage.m39
    public final int d(String str) {
        str.getClass();
        b();
        throw null;
    }

    @Override // defpackage.m39
    public final gx1 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o28)) {
            return false;
        }
        o28 o28Var = (o28) obj;
        return this.a.equals(o28Var.a) && lc5.Q(this.b, o28Var.b);
    }

    @Override // defpackage.m39
    public final int f() {
        return 0;
    }

    @Override // defpackage.m39
    public final String g(int i) {
        b();
        throw null;
    }

    @Override // defpackage.m39
    public final List h(int i) {
        b();
        throw null;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.m39
    public final m39 i(int i) {
        b();
        throw null;
    }

    @Override // defpackage.m39
    public final boolean j(int i) {
        b();
        throw null;
    }

    public final String toString() {
        return xv5.s(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}

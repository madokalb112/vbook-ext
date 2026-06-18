package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a3c implements m39 {
    public final String a;
    public final m39 b;

    public a3c(String str, m39 m39Var) {
        m39Var.getClass();
        this.a = str;
        this.b = m39Var;
    }

    @Override // defpackage.m39
    public final String a() {
        return this.a;
    }

    @Override // defpackage.m39
    public final boolean c() {
        return this.b.c();
    }

    @Override // defpackage.m39
    public final int d(String str) {
        str.getClass();
        return this.b.d(str);
    }

    @Override // defpackage.m39
    public final gx1 e() {
        return this.b.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3c)) {
            return false;
        }
        a3c a3cVar = (a3c) obj;
        return this.a.equals(a3cVar.a) && lc5.Q(this.b, a3cVar.b);
    }

    @Override // defpackage.m39
    public final int f() {
        return this.b.f();
    }

    @Override // defpackage.m39
    public final String g(int i) {
        return this.b.g(i);
    }

    @Override // defpackage.m39
    public final List getAnnotations() {
        return this.b.getAnnotations();
    }

    @Override // defpackage.m39
    public final List h(int i) {
        return this.b.h(i);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.m39
    public final m39 i(int i) {
        return this.b.i(i);
    }

    @Override // defpackage.m39
    public final boolean isInline() {
        return this.b.isInline();
    }

    @Override // defpackage.m39
    public final boolean j(int i) {
        return this.b.j(i);
    }

    public final String toString() {
        return tu1.q0(this);
    }
}

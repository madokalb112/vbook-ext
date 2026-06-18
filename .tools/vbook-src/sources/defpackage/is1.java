package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class is1 implements m39 {
    public final p39 a;
    public final a91 b;
    public final String c;

    public is1(p39 p39Var, a91 a91Var) {
        a91Var.getClass();
        this.a = p39Var;
        this.b = a91Var;
        this.c = p39Var.a + '<' + a91Var.g() + '>';
    }

    @Override // defpackage.m39
    public final String a() {
        return this.c;
    }

    @Override // defpackage.m39
    public final boolean c() {
        return false;
    }

    @Override // defpackage.m39
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // defpackage.m39
    public final gx1 e() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        is1 is1Var = obj instanceof is1 ? (is1) obj : null;
        return is1Var != null && this.a.equals(is1Var.a) && lc5.Q(is1Var.b, this.b);
    }

    @Override // defpackage.m39
    public final int f() {
        return this.a.c;
    }

    @Override // defpackage.m39
    public final String g(int i) {
        return this.a.f[i];
    }

    @Override // defpackage.m39
    public final List getAnnotations() {
        return this.a.d;
    }

    @Override // defpackage.m39
    public final List h(int i) {
        return this.a.h[i];
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.m39
    public final m39 i(int i) {
        return this.a.g[i];
    }

    @Override // defpackage.m39
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.m39
    public final boolean j(int i) {
        return this.a.i[i];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}

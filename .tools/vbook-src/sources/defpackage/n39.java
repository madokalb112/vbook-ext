package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class n39 implements m39, cx0 {
    public final m39 a;
    public final String b;
    public final Set c;

    public n39(m39 m39Var) {
        m39Var.getClass();
        this.a = m39Var;
        this.b = m39Var.a() + '?';
        this.c = kc5.s(m39Var);
    }

    @Override // defpackage.m39
    public final String a() {
        return this.b;
    }

    @Override // defpackage.cx0
    public final Set b() {
        return this.c;
    }

    @Override // defpackage.m39
    public final boolean c() {
        return true;
    }

    @Override // defpackage.m39
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // defpackage.m39
    public final gx1 e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n39) {
            return lc5.Q(this.a, ((n39) obj).a);
        }
        return false;
    }

    @Override // defpackage.m39
    public final int f() {
        return this.a.f();
    }

    @Override // defpackage.m39
    public final String g(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.m39
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.m39
    public final List h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.m39
    public final m39 i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.m39
    public final boolean isInline() {
        return this.a.isInline();
    }

    @Override // defpackage.m39
    public final boolean j(int i) {
        return this.a.j(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}

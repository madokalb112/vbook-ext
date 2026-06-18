package defpackage;

import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class gz9 implements k46 {
    public final String a;
    public volatile k46 b;
    public Boolean c;
    public Method d;
    public ih3 e;
    public final Queue f;
    public final boolean s;

    public gz9(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.a = str;
        this.f = linkedBlockingQueue;
        this.s = z;
    }

    @Override // defpackage.k46
    public final boolean a() {
        return l().a();
    }

    @Override // defpackage.k46
    public final boolean b() {
        return l().b();
    }

    @Override // defpackage.k46
    public final boolean c() {
        return l().c();
    }

    @Override // defpackage.k46
    public final boolean d() {
        return l().d();
    }

    @Override // defpackage.k46
    public final boolean e() {
        return l().e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && gz9.class == obj.getClass() && this.a.equals(((gz9) obj).a);
    }

    @Override // defpackage.k46
    public final void f(String str, Throwable th) {
        l().f(str, th);
    }

    @Override // defpackage.k46
    public final void g(String str, Throwable th) {
        l().g(str, th);
    }

    @Override // defpackage.k46
    public final String getName() {
        return this.a;
    }

    @Override // defpackage.k46
    public final void h(String str) {
        l().h(str);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.k46
    public final void i(String str) {
        l().i(str);
    }

    @Override // defpackage.k46
    public final void j(String str) {
        l().j(str);
    }

    @Override // defpackage.k46
    public final boolean k(int i) {
        return l().k(i);
    }

    public final k46 l() {
        if (this.b != null) {
            return this.b;
        }
        if (this.s) {
            return e17.a;
        }
        if (this.e == null) {
            Queue queue = this.f;
            ih3 ih3Var = new ih3();
            ih3Var.b = this;
            ih3Var.a = this.a;
            ih3Var.c = queue;
            this.e = ih3Var;
        }
        return this.e;
    }

    public final boolean m() {
        Boolean bool = this.c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.d = this.b.getClass().getMethod("log", iz9.class);
            this.c = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.c = Boolean.FALSE;
        }
        return this.c.booleanValue();
    }
}

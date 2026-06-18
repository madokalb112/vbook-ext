package defpackage;

import java.io.Serializable;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ih3 implements k46, Serializable {
    public String a;
    public gz9 b;
    public Queue c;

    @Override // defpackage.k46
    public final boolean a() {
        return true;
    }

    @Override // defpackage.k46
    public final boolean b() {
        return true;
    }

    @Override // defpackage.k46
    public final boolean c() {
        return true;
    }

    @Override // defpackage.k46
    public final boolean d() {
        return true;
    }

    @Override // defpackage.k46
    public final boolean e() {
        return true;
    }

    @Override // defpackage.k46
    public final void f(String str, Throwable th) {
        l(2);
    }

    @Override // defpackage.k46
    public final void g(String str, Throwable th) {
        l(4);
    }

    @Override // defpackage.k46
    public final String getName() {
        return this.a;
    }

    @Override // defpackage.k46
    public final void h(String str) {
        l(3);
    }

    @Override // defpackage.k46
    public final void i(String str) {
        l(2);
    }

    @Override // defpackage.k46
    public final void j(String str) {
        l(5);
    }

    public final void l(int i) {
        iz9 iz9Var = new iz9();
        System.currentTimeMillis();
        iz9Var.a = i;
        iz9Var.b = this.b;
        Thread.currentThread().getName();
        this.c.add(iz9Var);
    }
}

package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z84 extends uua {
    public uua e;

    public z84(uua uuaVar) {
        uuaVar.getClass();
        this.e = uuaVar;
    }

    @Override // defpackage.uua
    public final uua a() {
        return this.e.a();
    }

    @Override // defpackage.uua
    public final uua b() {
        return this.e.b();
    }

    @Override // defpackage.uua
    public final long c() {
        return this.e.c();
    }

    @Override // defpackage.uua
    public final uua d(long j) {
        return this.e.d(j);
    }

    @Override // defpackage.uua
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.uua
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // defpackage.uua
    public final uua g(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.e.g(j, timeUnit);
    }

    @Override // defpackage.uua
    public final long h() {
        return this.e.h();
    }
}

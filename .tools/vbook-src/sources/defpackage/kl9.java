package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kl9 implements ut0 {
    public final wq0 b;
    private volatile xa1 closed;

    public kl9(wq0 wq0Var) {
        this.b = wq0Var;
    }

    @Override // defpackage.ut0
    public final void a(Throwable th) {
        if (this.closed != null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "Channel was cancelled";
        }
        this.closed = new xa1(new IOException(message, th));
    }

    @Override // defpackage.ut0
    public final Throwable b() {
        xa1 xa1Var = this.closed;
        if (xa1Var != null) {
            return xa1Var.a(wa1.a);
        }
        return null;
    }

    @Override // defpackage.ut0
    public final Object e(int i, kt1 kt1Var) throws Throwable {
        Throwable thB = b();
        if (thB == null) {
            return Boolean.valueOf(this.b.request(i));
        }
        throw thB;
    }

    @Override // defpackage.ut0
    public final wq0 h() throws Throwable {
        Throwable thB = b();
        if (thB == null) {
            return this.b;
        }
        throw thB;
    }

    @Override // defpackage.ut0
    public final boolean i() {
        return this.b.k();
    }
}

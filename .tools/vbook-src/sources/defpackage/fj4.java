package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fj4 extends nx1 implements im2 {
    public final Handler c;
    public final String d;
    public final boolean e;
    public final fj4 f;

    public fj4(Handler handler, String str, boolean z) {
        this.c = handler;
        this.d = str;
        this.e = z;
        this.f = z ? this : new fj4(handler, str, true);
    }

    @Override // defpackage.nx1
    public final void A(jx1 jx1Var, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        p0(jx1Var, runnable);
    }

    @Override // defpackage.nx1
    public final boolean R(jx1 jx1Var) {
        return (this.e && lc5.Q(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    @Override // defpackage.nx1
    public final nx1 e0(int i) {
        qx1.r(i);
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fj4)) {
            return false;
        }
        fj4 fj4Var = (fj4) obj;
        return fj4Var.c == this.c && fj4Var.e == this.e;
    }

    public final int hashCode() {
        return (this.e ? 1231 : 1237) ^ System.identityHashCode(this.c);
    }

    @Override // defpackage.im2
    public final ax2 p(long j, Runnable runnable, jx1 jx1Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(runnable, j)) {
            return new dj4(0, this, runnable);
        }
        p0(jx1Var, runnable);
        return l77.a;
    }

    public final void p0(jx1 jx1Var, Runnable runnable) {
        qx1.o(jx1Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        aj2 aj2Var = rw2.a;
        nh2.c.A(jx1Var, runnable);
    }

    @Override // defpackage.im2
    public final void q(long j, ay0 ay0Var) {
        Runnable g8Var = new g8(24, ay0Var, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(g8Var, j)) {
            ay0Var.w(new ej4(0, this, g8Var));
        } else {
            p0(ay0Var.e, g8Var);
        }
    }

    @Override // defpackage.nx1
    public final String toString() {
        fj4 fj4Var;
        String str;
        aj2 aj2Var = rw2.a;
        fj4 fj4Var2 = r76.a;
        if (this == fj4Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                fj4Var = fj4Var2.f;
            } catch (UnsupportedOperationException unused) {
                fj4Var = null;
            }
            str = this == fj4Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.d;
        if (string == null) {
            string = this.c.toString();
        }
        return this.e ? tw2.n(string, ".immediate") : string;
    }

    public fj4(Handler handler) {
        this(handler, null, false);
    }
}

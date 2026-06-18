package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ava implements vx1 {
    public final /* synthetic */ vx1 a;
    public final AtomicReference b = new AtomicReference(null);
    public final /* synthetic */ so9 c;
    public final /* synthetic */ vx1 d;
    public final /* synthetic */ yb4 e;
    public final /* synthetic */ AtomicReference f;

    public ava(vx1 vx1Var, so9 so9Var, vx1 vx1Var2, yb4 yb4Var, AtomicReference atomicReference) {
        this.c = so9Var;
        this.d = vx1Var2;
        this.e = yb4Var;
        this.f = atomicReference;
        this.a = vx1Var;
    }

    public final long a() {
        Long l = (Long) this.b.get();
        if (l == null) {
            mc8 mc8Var = k63.b;
            return k63.c;
        }
        long jLongValue = l.longValue();
        this.c.getClass();
        long jCurrentTimeMillis = jLongValue - System.currentTimeMillis();
        mc8 mc8Var2 = k63.b;
        return lx1.A0(jCurrentTimeMillis, o63.MILLISECONDS);
    }

    public final void b(long j) {
        if (k63.e(j) <= 0) {
            wx1.K(this.d, new wua("Timed out immediately", this.e.hashCode()));
            return;
        }
        if (k63.c(a(), j) < 0) {
            return;
        }
        this.c.getClass();
        this.b.set(Long.valueOf(k63.e(j) + System.currentTimeMillis()));
        so9 so9Var = this.c;
        vx1 vx1Var = this.d;
        yd5 yd5Var = (yd5) this.f.getAndSet(ah1.J(vx1Var, null, null, new ck7(this, so9Var, vx1Var, this.e, (jt1) null, 20), 3));
        if (yd5Var != null) {
            yd5Var.cancel(null);
        }
    }

    @Override // defpackage.vx1
    public final jx1 q() {
        return this.a.q();
    }
}

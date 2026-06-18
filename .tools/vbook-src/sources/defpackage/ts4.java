package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ts4 implements rs4 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(ts4.class, "closed");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(ts4.class, "clientRefCount$internal");
    public final d6a a;
    public final d6a b;
    private volatile /* synthetic */ int closed = 0;
    public volatile /* synthetic */ int clientRefCount$internal = 0;

    public ts4() {
        final int i = 0;
        this.a = new d6a(new ib4(this) { // from class: ss4
            public final /* synthetic */ ts4 b;

            {
                this.b = this;
            }

            @Override // defpackage.ib4
            public final Object invoke() {
                int i2 = i;
                ts4 ts4Var = this.b;
                switch (i2) {
                    case 0:
                        ((dc7) ts4Var).e.getClass();
                        aj2 aj2Var = rw2.a;
                        return nh2.c;
                    default:
                        return gx1.T(new o0a(null), new dy1(lr3.e, 0)).plus((nx1) ts4Var.a.getValue()).plus(new rx1("ktor-okhttp-context"));
                }
            }
        });
        final int i2 = 1;
        this.b = new d6a(new ib4(this) { // from class: ss4
            public final /* synthetic */ ts4 b;

            {
                this.b = this;
            }

            @Override // defpackage.ib4
            public final Object invoke() {
                int i22 = i2;
                ts4 ts4Var = this.b;
                switch (i22) {
                    case 0:
                        ((dc7) ts4Var).e.getClass();
                        aj2 aj2Var = rw2.a;
                        return nh2.c;
                    default:
                        return gx1.T(new o0a(null), new dy1(lr3.e, 0)).plus((nx1) ts4Var.a.getValue()).plus(new rx1("ktor-okhttp-context"));
                }
            }
        });
    }

    public void close() {
        if (c.compareAndSet(this, 0, 1)) {
            hx1 hx1Var = q().get(s00.s);
            ae5 ae5Var = hx1Var instanceof ae5 ? (ae5) hx1Var : null;
            if (ae5Var == null) {
                return;
            }
            ae5Var.o0();
        }
    }

    @Override // defpackage.vx1
    public jx1 q() {
        return (jx1) this.b.getValue();
    }
}

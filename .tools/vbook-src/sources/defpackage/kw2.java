package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kw2 extends nw2 implements yx1, jt1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(kw2.class, Object.class, "_reusableCancellableContinuation$volatile");
    public static final /* synthetic */ long u = kt0.a.objectFieldOffset(kw2.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final nx1 d;
    public final kt1 e;
    public Object f;
    public final Object s;

    public kw2(nx1 nx1Var, kt1 kt1Var) {
        super(-1);
        this.d = nx1Var;
        this.e = kt1Var;
        this.f = lw2.a;
        this.s = gsa.b(kt1Var.getContext());
    }

    @Override // defpackage.yx1
    public final yx1 getCallerFrame() {
        return this.e;
    }

    @Override // defpackage.jt1
    public final jx1 getContext() {
        return this.e.getContext();
    }

    @Override // defpackage.nw2
    public final Object j() {
        Object obj = this.f;
        this.f = lw2.a;
        return obj;
    }

    public final void k() {
        do {
            t.getClass();
        } while (kt0.a.getObjectVolatile(this, u) == lw2.b);
    }

    public final ay0 m() {
        kw2 kw2Var;
        while (true) {
            t.getClass();
            Unsafe unsafe = kt0.a;
            long j = u;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            zy2 zy2Var = lw2.b;
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, zy2Var);
                return null;
            }
            if (objectVolatile instanceof ay0) {
                while (true) {
                    Unsafe unsafe2 = kt0.a;
                    kw2Var = this;
                    if (unsafe2.compareAndSwapObject(kw2Var, u, objectVolatile, zy2Var)) {
                        return (ay0) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(kw2Var, j) != objectVolatile) {
                        break;
                    }
                    this = kw2Var;
                }
            } else {
                kw2Var = this;
                if (objectVolatile != zy2Var && !(objectVolatile instanceof Throwable)) {
                    mn5.n(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = kw2Var;
        }
    }

    public final ay0 n() {
        t.getClass();
        Object objectVolatile = kt0.a.getObjectVolatile(this, u);
        if (objectVolatile instanceof ay0) {
            return (ay0) objectVolatile;
        }
        return null;
    }

    public final boolean o() {
        t.getClass();
        return kt0.a.getObjectVolatile(this, u) != null;
    }

    public final boolean p(Throwable th) {
        kw2 kw2Var;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            t.getClass();
            Unsafe unsafe2 = kt0.a;
            long j = u;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            zy2 zy2Var = lw2.b;
            if (lc5.Q(objectVolatile, zy2Var)) {
                while (true) {
                    Unsafe unsafe3 = kt0.a;
                    kw2 kw2Var2 = this;
                    th2 = th;
                    kw2Var = kw2Var2;
                    if (unsafe3.compareAndSwapObject(kw2Var2, u, zy2Var, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(kw2Var, j) != zy2Var) {
                        break;
                    }
                    this = kw2Var;
                    th = th2;
                }
            } else {
                kw2Var = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = kt0.a;
                    if (unsafe.compareAndSwapObject(kw2Var, u, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(kw2Var, j) == objectVolatile);
            }
            this = kw2Var;
            th = th2;
        }
    }

    public final Throwable q(ay0 ay0Var) {
        Unsafe unsafe;
        kw2 kw2Var;
        ay0 ay0Var2;
        while (true) {
            t.getClass();
            Unsafe unsafe2 = kt0.a;
            long j = u;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            zy2 zy2Var = lw2.b;
            if (objectVolatile != zy2Var) {
                kw2 kw2Var2 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    mn5.n(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = kt0.a;
                    if (unsafe.compareAndSwapObject(kw2Var2, u, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(kw2Var2, j) == objectVolatile);
                gp.l("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = kt0.a;
                kw2Var = this;
                ay0Var2 = ay0Var;
                if (unsafe3.compareAndSwapObject(kw2Var, u, zy2Var, ay0Var2)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(kw2Var, j) != zy2Var) {
                    break;
                }
                this = kw2Var;
                ay0Var = ay0Var2;
            }
            this = kw2Var;
            ay0Var = ay0Var2;
        }
    }

    @Override // defpackage.jt1
    public final void resumeWith(Object obj) {
        Throwable thA = qm8.a(obj);
        Object ei1Var = thA == null ? obj : new ei1(false, thA);
        kt1 kt1Var = this.e;
        jx1 context = kt1Var.getContext();
        nx1 nx1Var = this.d;
        if (lw2.c(nx1Var, context)) {
            this.f = ei1Var;
            this.c = 0;
            lw2.b(nx1Var, kt1Var.getContext(), this);
            return;
        }
        zg3 zg3VarA = isa.a();
        if (zg3VarA.c >= 4294967296L) {
            this.f = ei1Var;
            this.c = 0;
            zg3VarA.x0(this);
            return;
        }
        zg3VarA.F0(true);
        try {
            jx1 context2 = kt1Var.getContext();
            Object objC = gsa.c(context2, this.s);
            try {
                kt1Var.resumeWith(obj);
                while (zg3VarA.T0()) {
                }
            } finally {
                gsa.a(context2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + md2.u0(this.e) + ']';
    }

    @Override // defpackage.nw2
    public final jt1 e() {
        return this;
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class eh3 extends zg3 implements im2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(eh3.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater t;
    public static final /* synthetic */ AtomicIntegerFieldUpdater u;
    public static final /* synthetic */ long v;
    public static final /* synthetic */ long w;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = kt0.a;
        w = unsafe.objectFieldOffset(eh3.class.getDeclaredField("_queue$volatile"));
        t = AtomicReferenceFieldUpdater.newUpdater(eh3.class, Object.class, "_delayed$volatile");
        v = unsafe.objectFieldOffset(eh3.class.getDeclaredField("_delayed$volatile"));
        u = AtomicIntegerFieldUpdater.newUpdater(eh3.class, "_isCompleted$volatile");
    }

    @Override // defpackage.nx1
    public final void A(jx1 jx1Var, Runnable runnable) {
        W0(runnable);
    }

    @Override // defpackage.zg3
    public final long O0() {
        if (T0()) {
            return 0L;
        }
        X0();
        Runnable runnableV0 = V0();
        if (runnableV0 == null) {
            return Z0();
        }
        runnableV0.run();
        return 0L;
    }

    public final void U0() {
        eh3 eh3Var;
        Unsafe unsafe;
        while (true) {
            s.getClass();
            Unsafe unsafe2 = kt0.a;
            long j = w;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            zy2 zy2Var = fh3.b;
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = kt0.a;
                    eh3 eh3Var2 = this;
                    eh3Var = eh3Var2;
                    if (unsafe3.compareAndSwapObject(eh3Var2, w, (Object) null, zy2Var)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(eh3Var, j) != null) {
                        break;
                    } else {
                        this = eh3Var;
                    }
                }
            } else {
                eh3Var = this;
                if (objectVolatile instanceof q36) {
                    ((q36) objectVolatile).c();
                    return;
                }
                if (objectVolatile == zy2Var) {
                    return;
                }
                q36 q36Var = new q36(8, true);
                q36Var.a((Runnable) objectVolatile);
                do {
                    unsafe = kt0.a;
                    if (unsafe.compareAndSwapObject(eh3Var, w, objectVolatile, q36Var)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(eh3Var, j) == objectVolatile);
            }
            this = eh3Var;
        }
    }

    public final Runnable V0() {
        eh3 eh3Var;
        Unsafe unsafe;
        while (true) {
            s.getClass();
            Unsafe unsafe2 = kt0.a;
            long j = w;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof q36) {
                q36 q36Var = (q36) objectVolatile;
                Object objE = q36Var.e();
                if (objE != q36.g) {
                    return (Runnable) objE;
                }
                q36 q36VarD = q36Var.d();
                while (true) {
                    Unsafe unsafe3 = kt0.a;
                    eh3Var = this;
                    if (!unsafe3.compareAndSwapObject(eh3Var, w, objectVolatile, q36VarD) && unsafe3.getObjectVolatile(eh3Var, j) == objectVolatile) {
                        this = eh3Var;
                    }
                }
            } else {
                eh3Var = this;
                if (objectVolatile == fh3.b) {
                    return null;
                }
                do {
                    unsafe = kt0.a;
                    if (unsafe.compareAndSwapObject(eh3Var, w, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(eh3Var, j) == objectVolatile);
            }
            this = eh3Var;
        }
    }

    public void W0(Runnable runnable) {
        X0();
        if (!Y0(runnable)) {
            og2.x.W0(runnable);
            return;
        }
        Thread threadA1 = a1();
        if (Thread.currentThread() != threadA1) {
            LockSupport.unpark(threadA1);
        }
    }

    public final void X0() {
        ch3 ch3VarB;
        t.getClass();
        dh3 dh3Var = (dh3) kt0.a.getObjectVolatile(this, v);
        if (dh3Var == null || lsa.b.get(dh3Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dh3Var) {
                try {
                    ch3[] ch3VarArr = dh3Var.a;
                    ch3 ch3Var = ch3VarArr != null ? ch3VarArr[0] : null;
                    if (ch3Var != null) {
                        ch3VarB = ((jNanoTime - ch3Var.a) > 0L ? 1 : ((jNanoTime - ch3Var.a) == 0L ? 0 : -1)) >= 0 ? Y0(ch3Var) : false ? dh3Var.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (ch3VarB != null);
    }

    public final boolean Y0(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        loop0: while (true) {
            s.getClass();
            Unsafe unsafe4 = kt0.a;
            long j = w;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (u.get(this) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = kt0.a;
                    if (unsafe.compareAndSwapObject(this, w, (Object) null, runnable)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == null);
            } else if (objectVolatile instanceof q36) {
                q36 q36Var = (q36) objectVolatile;
                int iA = q36Var.a(runnable);
                if (iA == 0) {
                    break;
                }
                if (iA == 1) {
                    q36 q36VarD = q36Var.d();
                    do {
                        unsafe2 = kt0.a;
                        if (unsafe2.compareAndSwapObject(this, w, objectVolatile, q36VarD)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == fh3.b) {
                    return false;
                }
                q36 q36Var2 = new q36(8, true);
                q36Var2.a((Runnable) objectVolatile);
                q36Var2.a(runnable);
                do {
                    unsafe3 = kt0.a;
                    if (unsafe3.compareAndSwapObject(this, w, objectVolatile, q36Var2)) {
                        break loop0;
                    }
                } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
            }
        }
        return true;
    }

    public final long Z0() {
        ch3 ch3Var;
        vv vvVar = this.e;
        if (((vvVar == null || vvVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            s.getClass();
            Unsafe unsafe = kt0.a;
            Object objectVolatile = unsafe.getObjectVolatile(this, w);
            if (objectVolatile != null) {
                if (objectVolatile instanceof q36) {
                    long j = q36.f.get((q36) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == fh3.b) {
                    return Long.MAX_VALUE;
                }
            }
            t.getClass();
            dh3 dh3Var = (dh3) unsafe.getObjectVolatile(this, v);
            if (dh3Var != null) {
                synchronized (dh3Var) {
                    ch3[] ch3VarArr = dh3Var.a;
                    ch3Var = ch3VarArr != null ? ch3VarArr[0] : null;
                }
                if (ch3Var != null) {
                    long jNanoTime = ch3Var.a - System.nanoTime();
                    if (jNanoTime >= 0) {
                        return jNanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public abstract Thread a1();

    public final boolean b1() {
        vv vvVar = this.e;
        if (vvVar != null ? vvVar.isEmpty() : true) {
            t.getClass();
            Unsafe unsafe = kt0.a;
            dh3 dh3Var = (dh3) unsafe.getObjectVolatile(this, v);
            if (dh3Var != null && lsa.b.get(dh3Var) != 0) {
                return false;
            }
            s.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, w);
            if (objectVolatile != null) {
                if (objectVolatile instanceof q36) {
                    long j = q36.f.get((q36) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == fh3.b) {
                }
            }
            return true;
        }
        return false;
    }

    public void c1(long j, ch3 ch3Var) {
        og2.x.f1(j, ch3Var);
    }

    public final void d1() {
        ch3 ch3VarB;
        long jNanoTime = System.nanoTime();
        while (true) {
            t.getClass();
            dh3 dh3Var = (dh3) kt0.a.getObjectVolatile(this, v);
            if (dh3Var == null) {
                return;
            }
            synchronized (dh3Var) {
                ch3VarB = lsa.b.get(dh3Var) > 0 ? dh3Var.b(0) : null;
            }
            if (ch3VarB == null) {
                return;
            } else {
                c1(jNanoTime, ch3VarB);
            }
        }
    }

    public final void e1() {
        s.getClass();
        Unsafe unsafe = kt0.a;
        unsafe.putObjectVolatile(this, w, (Object) null);
        t.getClass();
        unsafe.putObjectVolatile(this, v, (Object) null);
    }

    public final void f1(long j, ch3 ch3Var) {
        Thread threadA1;
        int iG1 = g1(j, ch3Var);
        if (iG1 == 0) {
            if (!h1(ch3Var) || Thread.currentThread() == (threadA1 = a1())) {
                return;
            }
            LockSupport.unpark(threadA1);
            return;
        }
        if (iG1 == 1) {
            c1(j, ch3Var);
        } else {
            if (iG1 == 2) {
                return;
            }
            gp.j("unexpected result");
        }
    }

    public final int g1(long j, ch3 ch3Var) {
        eh3 eh3Var;
        Unsafe unsafe;
        if (u.get(this) == 1) {
            return 1;
        }
        t.getClass();
        Unsafe unsafe2 = kt0.a;
        long j2 = v;
        dh3 dh3Var = (dh3) unsafe2.getObjectVolatile(this, j2);
        if (dh3Var == null) {
            dh3 dh3Var2 = new dh3();
            dh3Var2.c = j;
            while (true) {
                unsafe = kt0.a;
                eh3Var = this;
                if (unsafe.compareAndSwapObject(eh3Var, v, (Object) null, dh3Var2) || unsafe.getObjectVolatile(eh3Var, j2) != null) {
                    break;
                }
                this = eh3Var;
            }
            Object objectVolatile = unsafe.getObjectVolatile(eh3Var, j2);
            objectVolatile.getClass();
            dh3Var = (dh3) objectVolatile;
        } else {
            eh3Var = this;
        }
        return ch3Var.c(j, dh3Var, eh3Var);
    }

    public final boolean h1(ch3 ch3Var) {
        t.getClass();
        dh3 dh3Var = (dh3) kt0.a.getObjectVolatile(this, v);
        if (dh3Var != null) {
            synchronized (dh3Var) {
                ch3[] ch3VarArr = dh3Var.a;
                ch3Var = ch3VarArr != null ? ch3VarArr[0] : null;
            }
        }
        return ch3Var == ch3Var;
    }

    @Override // defpackage.im2
    public ax2 p(long j, Runnable runnable, jx1 jx1Var) {
        return pg2.a.p(j, runnable, jx1Var);
    }

    @Override // defpackage.im2
    public final void q(long j, ay0 ay0Var) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            ah3 ah3Var = new ah3(this, j2 + jNanoTime, ay0Var);
            f1(jNanoTime, ah3Var);
            ay0Var.x(new ux0(ah3Var, 2));
        }
    }

    @Override // defpackage.zg3
    public void shutdown() {
        isa.a.set(null);
        u.set(this, 1);
        U0();
        while (O0() <= 0) {
        }
        d1();
    }
}

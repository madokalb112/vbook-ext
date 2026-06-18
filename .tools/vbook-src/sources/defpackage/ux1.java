package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ux1 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater t = AtomicLongFieldUpdater.newUpdater(ux1.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater u = AtomicLongFieldUpdater.newUpdater(ux1.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater v = AtomicIntegerFieldUpdater.newUpdater(ux1.class, "_isTerminated$volatile");
    public static final zy2 w = new zy2("NOT_IN_STACK", 6);
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final xf4 e;
    public final xf4 f;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final xk8 s;

    public ux1(int i, int i2, long j, String str) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = str;
        if (i < 1) {
            gp.k(xv5.k(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            gp.k(xv5.o("Max pool size ", i2, i, " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            gp.k(xv5.k(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            gp.k(xv5.m(j, "Idle worker keep alive time ", " must be positive"));
            throw null;
        }
        this.e = new xf4();
        this.f = new xf4();
        this.s = new xk8((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    public static /* synthetic */ void A(ux1 ux1Var, Runnable runnable, int i) {
        ux1Var.q(runnable, false, (i & 4) == 0);
    }

    public final void E(sx1 sx1Var, int i, int i2) {
        while (true) {
            long j = t.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = sx1Var.c();
                    while (true) {
                        if (objC == w) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        sx1 sx1Var2 = (sx1) objC;
                        int iB = sx1Var2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = sx1Var2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                ux1 ux1Var = this;
                if (t.compareAndSet(ux1Var, j, ((long) i3) | j2)) {
                    return;
                } else {
                    this = ux1Var;
                }
            }
        }
    }

    public final boolean N(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.a;
        if (i < i2) {
            int iP = p();
            if (iP == 1 && i2 > 1) {
                p();
            }
            if (iP > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean P() {
        ux1 ux1Var;
        zy2 zy2Var;
        int iB;
        while (true) {
            long j = t.get(this);
            sx1 sx1Var = (sx1) this.s.b((int) (2097151 & j));
            if (sx1Var == null) {
                sx1Var = null;
                ux1Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = sx1Var.c();
                while (true) {
                    zy2Var = w;
                    if (objC == zy2Var) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    sx1 sx1Var2 = (sx1) objC;
                    iB = sx1Var2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = sx1Var2.c();
                    j = j;
                }
                if (iB >= 0) {
                    ux1 ux1Var2 = this;
                    boolean zCompareAndSet = t.compareAndSet(ux1Var2, j, ((long) iB) | j2);
                    ux1Var = ux1Var2;
                    if (zCompareAndSet) {
                        sx1Var.g(zy2Var);
                    }
                    this = ux1Var;
                } else {
                    continue;
                }
            }
            if (sx1Var == null) {
                return false;
            }
            if (sx1.u.compareAndSet(sx1Var, -1, 0)) {
                LockSupport.unpark(sx1Var);
                return true;
            }
            this = ux1Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.ux1.v
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.sx1
            r3 = 0
            if (r1 == 0) goto L17
            sx1 r0 = (defpackage.sx1) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L20
            ux1 r1 = r0.t
            if (r1 == r8) goto L1f
            goto L20
        L1f:
            r3 = r0
        L20:
            xk8 r0 = r8.s
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.ux1.u     // Catch: java.lang.Throwable -> La7
            long r4 = r1.get(r8)     // Catch: java.lang.Throwable -> La7
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r1 = (int) r4
            monitor-exit(r0)
            if (r2 > r1) goto L5c
            r0 = r2
        L32:
            xk8 r4 = r8.s
            java.lang.Object r4 = r4.b(r0)
            r4.getClass()
            sx1 r4 = (defpackage.sx1) r4
            if (r4 == r3) goto L57
        L3f:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L50
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r5 = 10000(0x2710, double:4.9407E-320)
            r4.join(r5)
            goto L3f
        L50:
            z1c r4 = r4.a
            xf4 r5 = r8.f
            r4.d(r5)
        L57:
            if (r0 == r1) goto L5c
            int r0 = r0 + 1
            goto L32
        L5c:
            xf4 r0 = r8.f
            r0.b()
            xf4 r0 = r8.e
            r0.b()
        L66:
            if (r3 == 0) goto L6e
            eaa r0 = r3.a(r2)
            if (r0 != 0) goto L96
        L6e:
            xf4 r0 = r8.e
            java.lang.Object r0 = r0.d()
            eaa r0 = (defpackage.eaa) r0
            if (r0 != 0) goto L96
            xf4 r0 = r8.f
            java.lang.Object r0 = r0.d()
            eaa r0 = (defpackage.eaa) r0
            if (r0 != 0) goto L96
            if (r3 == 0) goto L89
            tx1 r0 = defpackage.tx1.e
            r3.h(r0)
        L89:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ux1.t
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ux1.u
            r0.set(r8, r1)
            return
        L96:
            r0.run()     // Catch: java.lang.Throwable -> L9a
            goto L66
        L9a:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r1.getUncaughtExceptionHandler()
            r4.uncaughtException(r1, r0)
            goto L66
        La7:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux1.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        A(this, runnable, 6);
    }

    public final int p() {
        synchronized (this.s) {
            try {
                if (v.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = u;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.a) {
                    return 0;
                }
                if (i >= this.b) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.s.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                sx1 sx1Var = new sx1(this, i3);
                this.s.c(i3, sx1Var);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                sx1Var.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q(Runnable runnable, boolean z, boolean z2) {
        eaa gaaVar;
        tx1 tx1Var;
        haa.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof eaa) {
            gaaVar = (eaa) runnable;
            gaaVar.a = jNanoTime;
            gaaVar.b = z;
        } else {
            gaaVar = new gaa(runnable, jNanoTime, z);
        }
        boolean z3 = gaaVar.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = u;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        sx1 sx1Var = null;
        sx1 sx1Var2 = threadCurrentThread instanceof sx1 ? (sx1) threadCurrentThread : null;
        if (sx1Var2 != null && sx1Var2.t == this) {
            sx1Var = sx1Var2;
        }
        if (sx1Var != null && (tx1Var = sx1Var.c) != tx1.e && (gaaVar.b || tx1Var != tx1.b)) {
            sx1Var.s = true;
            gaaVar = sx1Var.a.a(gaaVar, z2);
        }
        if (gaaVar != null) {
            if (!(gaaVar.b ? this.f.a(gaaVar) : this.e.a(gaaVar))) {
                throw new RejectedExecutionException(ky0.s(this.d, " was terminated", new StringBuilder()));
            }
        }
        if (z3) {
            if (P() || N(jAddAndGet)) {
                return;
            }
            P();
            return;
        }
        if (P() || N(atomicLongFieldUpdater.get(this))) {
            return;
        }
        P();
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        xk8 xk8Var = this.s;
        int iA = xk8Var.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            sx1 sx1Var = (sx1) xk8Var.b(i6);
            if (sx1Var != null) {
                int iC = sx1Var.a.c();
                int iOrdinal = sx1Var.c.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iC);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iC);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (iC > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iC);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        mn5.g();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = u.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(md2.c0(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.a;
        sb4.append(i7);
        sb4.append(", max = ");
        ky0.u(this.b, i, "}, Worker States {CPU = ", ", blocking = ", sb4);
        ky0.u(i2, i3, ", parked = ", ", dormant = ", sb4);
        ky0.u(i4, i5, ", terminated = ", "}, running workers queues = ", sb4);
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class r29 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(r29.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicReferenceFieldUpdater e;
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final /* synthetic */ AtomicIntegerFieldUpdater s;
    public static final /* synthetic */ long t;
    public static final /* synthetic */ long u;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final rt6 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = kt0.a;
        t = unsafe.objectFieldOffset(r29.class.getDeclaredField("head$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(r29.class, "deqIdx$volatile");
        e = AtomicReferenceFieldUpdater.newUpdater(r29.class, Object.class, "tail$volatile");
        u = unsafe.objectFieldOffset(r29.class.getDeclaredField("tail$volatile"));
        f = AtomicLongFieldUpdater.newUpdater(r29.class, "enqIdx$volatile");
        s = AtomicIntegerFieldUpdater.newUpdater(r29.class, "_availablePermits$volatile");
    }

    public r29(int i, int i2) {
        this.a = i;
        if (i <= 0) {
            gp.k(dx1.f(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i2 < 0 || i2 > i) {
            gp.k(dx1.f(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        u29 u29Var = new u29(0L, null, 2);
        this.head$volatile = u29Var;
        this.tail$volatile = u29Var;
        this._availablePermits$volatile = i - i2;
        this.b = new rt6(this, 7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r5.i(r3, r4.b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.kt1 r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.r29.s
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.a
            if (r1 > r2) goto L0
            heb r3 = defpackage.heb.a
            if (r1 <= 0) goto Lf
            goto L3e
        Lf:
            jt1 r5 = bx1.J(r5)
            ay0 r5 = defpackage.ah1.E(r5)
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L31
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L3f
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            rt6 r4 = r4.b     // Catch: java.lang.Throwable -> L3f
            r5.i(r3, r4)     // Catch: java.lang.Throwable -> L3f
            goto L31
        L2b:
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
        L31:
            java.lang.Object r4 = r5.s()
            xx1 r5 = defpackage.xx1.a
            if (r4 != r5) goto L3a
            goto L3b
        L3a:
            r4 = r3
        L3b:
            if (r4 != r5) goto L3e
            return r4
        L3e:
            return r3
        L3f:
            r4 = move-exception
            r5.B()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r29.a(kt1):java.lang.Object");
    }

    public final boolean b(evb evbVar) {
        Object objA;
        Unsafe unsafe;
        r29 r29Var = this;
        e.getClass();
        Unsafe unsafe2 = kt0.a;
        long j = u;
        u29 u29Var = (u29) unsafe2.getObjectVolatile(r29Var, j);
        long andIncrement = f.getAndIncrement(r29Var);
        p29 p29Var = p29.a;
        long j2 = andIncrement / ((long) t29.f);
        loop0: while (true) {
            objA = mn1.a(u29Var, j2, p29Var);
            if (pu1.m0(objA)) {
                break;
            }
            pz8 pz8VarG0 = pu1.g0(objA);
            while (true) {
                pz8 pz8Var = (pz8) kt0.a.getObjectVolatile(r29Var, j);
                if (pz8Var.e >= pz8VarG0.e) {
                    r29Var = this;
                    break loop0;
                }
                if (!pz8VarG0.o()) {
                    break;
                }
                do {
                    unsafe = kt0.a;
                    r29Var = this;
                    if (unsafe.compareAndSwapObject(r29Var, u, pz8Var, pz8VarG0)) {
                        if (pz8Var.k()) {
                            pz8Var.i();
                        }
                    }
                } while (unsafe.getObjectVolatile(r29Var, j) == pz8Var);
                if (pz8VarG0.k()) {
                    pz8VarG0.i();
                }
            }
            r29Var = this;
        }
        u29 u29Var2 = (u29) pu1.g0(objA);
        AtomicReferenceArray atomicReferenceArray = u29Var2.s;
        int i = (int) (andIncrement % ((long) t29.f));
        while (!atomicReferenceArray.compareAndSet(i, null, evbVar)) {
            if (atomicReferenceArray.get(i) != null) {
                zy2 zy2Var = t29.b;
                zy2 zy2Var2 = t29.c;
                while (!atomicReferenceArray.compareAndSet(i, zy2Var, zy2Var2)) {
                    if (atomicReferenceArray.get(i) != zy2Var) {
                        return false;
                    }
                }
                ((zx0) evbVar).i(heb.a, r29Var.b);
                return true;
            }
        }
        evbVar.b(u29Var2, i);
        return true;
    }

    public final void c() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = s;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                w58.f(i2, "The number of released permits cannot be greater than ");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!d());
    }

    public final boolean d() {
        Object objA;
        Unsafe unsafe;
        c.getClass();
        Unsafe unsafe2 = kt0.a;
        long j = t;
        u29 u29Var = (u29) unsafe2.getObjectVolatile(this, j);
        long andIncrement = d.getAndIncrement(this);
        long j2 = andIncrement / ((long) t29.f);
        q29 q29Var = q29.a;
        loop0: while (true) {
            objA = mn1.a(u29Var, j2, q29Var);
            if (pu1.m0(objA)) {
                break;
            }
            pz8 pz8VarG0 = pu1.g0(objA);
            while (true) {
                pz8 pz8Var = (pz8) kt0.a.getObjectVolatile(this, j);
                if (pz8Var.e >= pz8VarG0.e) {
                    break loop0;
                }
                if (!pz8VarG0.o()) {
                    break;
                }
                do {
                    unsafe = kt0.a;
                    if (unsafe.compareAndSwapObject(this, t, pz8Var, pz8VarG0)) {
                        if (pz8Var.k()) {
                            pz8Var.i();
                        }
                    }
                } while (unsafe.getObjectVolatile(this, j) == pz8Var);
                if (pz8VarG0.k()) {
                    pz8VarG0.i();
                }
            }
        }
        u29 u29Var2 = (u29) pu1.g0(objA);
        AtomicReferenceArray atomicReferenceArray = u29Var2.s;
        u29Var2.b();
        boolean z = false;
        if (u29Var2.e <= j2) {
            int i = (int) (andIncrement % ((long) t29.f));
            Object andSet = atomicReferenceArray.getAndSet(i, t29.b);
            if (andSet == null) {
                int i2 = t29.a;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == t29.c) {
                        return true;
                    }
                }
                zy2 zy2Var = t29.b;
                zy2 zy2Var2 = t29.d;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, zy2Var, zy2Var2)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceArray.get(i) != zy2Var) {
                        break;
                    }
                }
                return !z;
            }
            if (andSet != t29.e) {
                boolean z2 = andSet instanceof zx0;
                heb hebVar = heb.a;
                if (!z2) {
                    if (andSet instanceof g09) {
                        return ((g09) andSet).j(this, hebVar);
                    }
                    mn5.n(andSet, "unexpected: ");
                    return false;
                }
                zx0 zx0Var = (zx0) andSet;
                zy2 zy2VarD = zx0Var.d(hebVar, this.b);
                if (zy2VarD != null) {
                    zx0Var.l(zy2VarD);
                    return true;
                }
            }
        }
        return false;
    }
}

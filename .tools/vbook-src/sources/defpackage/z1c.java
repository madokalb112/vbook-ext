package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.mozilla.javascript.Token;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z1c {
    public final AtomicReferenceArray a = new AtomicReferenceArray(Token.CASE);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(z1c.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long f = kt0.a.objectFieldOffset(z1c.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(z1c.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(z1c.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(z1c.class, "blockingTasksInBuffer$volatile");

    public final eaa a(eaa eaaVar, boolean z) {
        if (z) {
            return b(eaaVar);
        }
        b.getClass();
        eaa eaaVar2 = (eaa) kt0.a.getAndSetObject(this, f, eaaVar);
        if (eaaVar2 == null) {
            return null;
        }
        return b(eaaVar2);
    }

    public final eaa b(eaa eaaVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return eaaVar;
        }
        if (eaaVar.b) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & Token.SWITCH;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, eaaVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int c() {
        b.getClass();
        Object objectVolatile = kt0.a.getObjectVolatile(this, f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final void d(xf4 xf4Var) {
        b.getClass();
        eaa eaaVar = (eaa) kt0.a.getAndSetObject(this, f, (Object) null);
        if (eaaVar != null) {
            xf4Var.a(eaaVar);
        }
        while (true) {
            eaa eaaVarF = f();
            if (eaaVarF == null) {
                return;
            } else {
                xf4Var.a(eaaVarF);
            }
        }
    }

    public final eaa e() {
        b.getClass();
        eaa eaaVar = (eaa) kt0.a.getAndSetObject(this, f, (Object) null);
        return eaaVar == null ? f() : eaaVar;
    }

    public final eaa f() {
        eaa eaaVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & Token.SWITCH;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (eaaVar = (eaa) this.a.getAndSet(i2, null)) != null) {
                if (eaaVar.b) {
                    e.decrementAndGet(this);
                }
                return eaaVar;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r9 = defpackage.z1c.d.get(r4);
        r1 = defpackage.z1c.c.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (defpackage.z1c.e.get(r4) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        r1 = r1 - 1;
        r2 = r4.h(r1, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        r4 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eaa g() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.z1c.b
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.kt0.a
            long r1 = defpackage.z1c.f
            java.lang.Object r0 = r0.getObjectVolatile(r9, r1)
            r7 = r0
            eaa r7 = (defpackage.eaa) r7
            r0 = 1
            if (r7 != 0) goto L15
        L13:
            r4 = r9
            goto L30
        L15:
            boolean r3 = r7.b
            if (r3 != r0) goto L13
        L19:
            sun.misc.Unsafe r3 = defpackage.kt0.a
            long r5 = defpackage.z1c.f
            r8 = 0
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L26
            return r7
        L26:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r7) goto L2e
            r9 = r4
            goto L0
        L2e:
            r9 = r4
            goto L19
        L30:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r9 = defpackage.z1c.d
            int r9 = r9.get(r4)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.z1c.c
            int r1 = r1.get(r4)
        L3c:
            if (r9 == r1) goto L50
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.z1c.e
            int r2 = r2.get(r4)
            if (r2 != 0) goto L47
            goto L50
        L47:
            int r1 = r1 + (-1)
            eaa r2 = r4.h(r1, r0)
            if (r2 == 0) goto L3c
            return r2
        L50:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z1c.g():eaa");
    }

    public final eaa h(int i, boolean z) {
        int i2 = i & Token.SWITCH;
        AtomicReferenceArray atomicReferenceArray = this.a;
        eaa eaaVar = (eaa) atomicReferenceArray.get(i2);
        if (eaaVar != null && eaaVar.b == z) {
            while (!atomicReferenceArray.compareAndSet(i2, eaaVar, null)) {
                if (atomicReferenceArray.get(i2) != eaaVar) {
                }
            }
            if (z) {
                e.decrementAndGet(this);
            }
            return eaaVar;
        }
        return null;
    }

    public final long i(int i, rg8 rg8Var) {
        z1c z1cVar;
        while (true) {
            b.getClass();
            Unsafe unsafe = kt0.a;
            long j = f;
            eaa eaaVar = (eaa) unsafe.getObjectVolatile(this, j);
            if (eaaVar == null) {
                return -2L;
            }
            if (((eaaVar.b ? 1 : 2) & i) == 0) {
                return -2L;
            }
            haa.f.getClass();
            long jNanoTime = System.nanoTime() - eaaVar.a;
            long j2 = haa.b;
            if (jNanoTime < j2) {
                return j2 - jNanoTime;
            }
            while (true) {
                Unsafe unsafe2 = kt0.a;
                z1cVar = this;
                if (unsafe2.compareAndSwapObject(z1cVar, f, eaaVar, (Object) null)) {
                    rg8Var.a = eaaVar;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(z1cVar, j) != eaaVar) {
                    break;
                }
                this = z1cVar;
            }
            this = z1cVar;
        }
    }
}

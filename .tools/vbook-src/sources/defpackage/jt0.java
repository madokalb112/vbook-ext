package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jt0 implements ut0, bv0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(jt0.class, Object.class, "suspensionSlot");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long j;
    public final boolean b;
    private volatile int flushBufferSize;
    public final wq0 c = new wq0();
    public final Object d = new Object();
    volatile /* synthetic */ Object suspensionSlot = zs0.b;
    public final wq0 e = new wq0();
    public final wq0 f = new wq0();
    volatile /* synthetic */ Object _closedCause = null;

    static {
        Unsafe unsafe = kt0.a;
        j = unsafe.objectFieldOffset(jt0.class.getDeclaredField("suspensionSlot"));
        h = AtomicReferenceFieldUpdater.newUpdater(jt0.class, Object.class, "_closedCause");
        i = unsafe.objectFieldOffset(jt0.class.getDeclaredField("_closedCause"));
    }

    public jt0(boolean z) {
        this.b = z;
    }

    @Override // defpackage.ut0
    public final void a(Throwable th) {
        jt0 jt0Var;
        if (this._closedCause != null) {
            return;
        }
        xa1 xa1Var = new xa1(th);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = kt0.a;
            long j2 = i;
            jt0Var = this;
            if (unsafe.compareAndSwapObject(jt0Var, j2, (Object) null, xa1Var) || unsafe.getObjectVolatile(jt0Var, j2) != null) {
                break;
            } else {
                this = jt0Var;
            }
        }
        jt0Var.l(xa1Var.a(wa1.a));
    }

    @Override // defpackage.ut0
    public final Throwable b() {
        xa1 xa1Var = (xa1) this._closedCause;
        if (xa1Var != null) {
            return xa1Var.a(wa1.a);
        }
        return null;
    }

    /* JADX WARN: Path cross not found for [B:51:0x00f5, B:33:0x00a9], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0126 -> B:65:0x0128). Please report as a decompilation issue!!! */
    @Override // defpackage.bv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.kt1 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jt0.c(kt1):java.lang.Object");
    }

    @Override // defpackage.bv0
    public final boolean d() {
        return this._closedCause != null;
    }

    /* JADX WARN: Path cross not found for [B:52:0x0117, B:34:0x00bc], limit reached: 80 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0147 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0148 -> B:66:0x014a). Please report as a decompilation issue!!! */
    @Override // defpackage.ut0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(int r22, defpackage.kt1 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jt0.e(int, kt1):java.lang.Object");
    }

    @Override // defpackage.bv0
    public final bg9 f() throws Throwable {
        Throwable thA;
        if (!d()) {
            return this.f;
        }
        xa1 xa1Var = (xa1) this._closedCause;
        if (xa1Var == null || (thA = xa1Var.a(it0.a)) == null) {
            throw new fb1(null, null);
        }
        throw thA;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.jt1 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.gt0
            if (r0 == 0) goto L13
            r0 = r10
            gt0 r0 = (defpackage.gt0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gt0 r0 = new gt0
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L3a
            goto L3a
        L26:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            return r2
        L2c:
            defpackage.e11.e0(r10)
            r0.c = r3     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r10 = r9.c(r0)     // Catch: java.lang.Throwable -> L3a
            xx1 r0 = defpackage.xx1.a
            if (r10 != r0) goto L3a
            return r0
        L3a:
            xa1 r8 = defpackage.gjb.d
        L3c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = defpackage.jt0.h
            r10.getClass()
            sun.misc.Unsafe r3 = defpackage.kt0.a
            long r5 = defpackage.jt0.i
            r7 = 0
            r4 = r9
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            heb r10 = defpackage.heb.a
            if (r9 == 0) goto L53
            r4.l(r2)
            return r10
        L53:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r5)
            if (r9 == 0) goto L5a
            return r10
        L5a:
            r9 = r4
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jt0.g(jt1):java.lang.Object");
    }

    @Override // defpackage.ut0
    public final wq0 h() throws Throwable {
        Throwable thA;
        xa1 xa1Var = (xa1) this._closedCause;
        if (xa1Var != null && (thA = xa1Var.a(ht0.a)) != null) {
            throw thA;
        }
        if (this.e.k()) {
            n();
        }
        return this.e;
    }

    @Override // defpackage.ut0
    public final boolean i() {
        if (b() == null) {
            return d() && this.flushBufferSize == 0 && this.e.k();
        }
        return true;
    }

    @Override // defpackage.bv0
    public final boolean j() {
        return this.b;
    }

    public final void k() {
        m();
        xa1 xa1Var = gjb.d;
        while (true) {
            h.getClass();
            Unsafe unsafe = kt0.a;
            long j2 = i;
            jt0 jt0Var = this;
            if (unsafe.compareAndSwapObject(jt0Var, j2, (Object) null, xa1Var)) {
                jt0Var.l(null);
                return;
            } else if (unsafe.getObjectVolatile(jt0Var, j2) != null) {
                return;
            } else {
                this = jt0Var;
            }
        }
    }

    public final void l(Throwable th) {
        ys0 ys0Var;
        if (th != null) {
            ys0Var = new ys0(th);
        } else {
            dt0.a.getClass();
            ys0Var = fu6.x;
        }
        g.getClass();
        dt0 dt0Var = (dt0) kt0.a.getAndSetObject(this, j, ys0Var);
        if (dt0Var instanceof bt0) {
            ((bt0) dt0Var).a(th);
        }
    }

    public final void m() {
        if (this.f.k()) {
            return;
        }
        synchronized (this.d) {
            wq0 wq0Var = this.f;
            int i2 = (int) wq0Var.c;
            this.c.u0(wq0Var);
            this.flushBufferSize += i2;
        }
        dt0 dt0Var = (dt0) this.suspensionSlot;
        if (!(dt0Var instanceof at0)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        zs0 zs0Var = zs0.b;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = kt0.a;
            long j2 = j;
            jt0 jt0Var = this;
            if (unsafe.compareAndSwapObject(jt0Var, j2, dt0Var, zs0Var)) {
                ((bt0) dt0Var).b();
                return;
            } else if (unsafe.getObjectVolatile(jt0Var, j2) != dt0Var) {
                return;
            } else {
                this = jt0Var;
            }
        }
    }

    public final void n() {
        synchronized (this.d) {
            this.c.R(this.e);
            this.flushBufferSize = 0;
        }
        dt0 dt0Var = (dt0) this.suspensionSlot;
        if (!(dt0Var instanceof ct0)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        zs0 zs0Var = zs0.b;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = kt0.a;
            long j2 = j;
            jt0 jt0Var = this;
            if (unsafe.compareAndSwapObject(jt0Var, j2, dt0Var, zs0Var)) {
                ((bt0) dt0Var).b();
                return;
            } else if (unsafe.getObjectVolatile(jt0Var, j2) != dt0Var) {
                return;
            } else {
                this = jt0Var;
            }
        }
    }

    public final String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }
}

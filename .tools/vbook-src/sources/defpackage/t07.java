package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class t07 extends r29 implements r07 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater v = AtomicReferenceFieldUpdater.newUpdater(t07.class, Object.class, "owner$volatile");
    public static final /* synthetic */ long w = kt0.a.objectFieldOffset(t07.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile;

    public t07(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : u07.a;
    }

    public final boolean e() {
        return Math.max(r29.s.get(this), 0) == 0;
    }

    public final boolean f() {
        int iG = g();
        if (iG == 0) {
            return true;
        }
        if (iG == 1) {
            return false;
        }
        if (iG != 2) {
            gp.j("unexpected");
            return false;
        }
        k27.g("This mutex is already locked by the specified owner: null");
        return false;
    }

    public final int g() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = r29.s;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.a;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    v.getClass();
                    kt0.a.putObjectVolatile(this, w, (Object) null);
                    return 0;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        r5 = defpackage.t07.v;
        r2 = r0.b;
        r5.set(r2, null);
        r5 = r0.a;
        r5.D(r1, r5.c, new defpackage.nl9(new defpackage.zs5(17, r2, r0), 4));
     */
    @Override // defpackage.r07
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.jt1 r6) {
        /*
            r5 = this;
            boolean r0 = r5.f()
            heb r1 = defpackage.heb.a
            if (r0 == 0) goto L9
            goto L52
        L9:
            jt1 r6 = bx1.J(r6)
            ay0 r6 = defpackage.ah1.E(r6)
            s07 r0 = new s07     // Catch: java.lang.Throwable -> L53
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L53
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.r29.s     // Catch: java.lang.Throwable -> L53
            int r2 = r2.getAndDecrement(r5)     // Catch: java.lang.Throwable -> L53
            int r3 = r5.a     // Catch: java.lang.Throwable -> L53
            if (r2 > r3) goto L16
            if (r2 <= 0) goto L3f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.t07.v     // Catch: java.lang.Throwable -> L53
            t07 r2 = r0.b     // Catch: java.lang.Throwable -> L53
            r3 = 0
            r5.set(r2, r3)     // Catch: java.lang.Throwable -> L53
            ay0 r5 = r0.a     // Catch: java.lang.Throwable -> L53
            zs5 r3 = new zs5     // Catch: java.lang.Throwable -> L53
            r4 = 17
            r3.<init>(r4, r2, r0)     // Catch: java.lang.Throwable -> L53
            int r0 = r5.c     // Catch: java.lang.Throwable -> L53
            nl9 r2 = new nl9     // Catch: java.lang.Throwable -> L53
            r4 = 4
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L53
            r5.D(r1, r0, r2)     // Catch: java.lang.Throwable -> L53
            goto L45
        L3f:
            boolean r2 = r5.b(r0)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L16
        L45:
            java.lang.Object r5 = r6.s()
            xx1 r6 = defpackage.xx1.a
            if (r5 != r6) goto L4e
            goto L4f
        L4e:
            r5 = r1
        L4f:
            if (r5 != r6) goto L52
            return r5
        L52:
            return r1
        L53:
            r5 = move-exception
            r6.B()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t07.p(jt1):java.lang.Object");
    }

    @Override // defpackage.r07
    public final void q(Object obj) {
        while (this.e()) {
            v.getClass();
            Unsafe unsafe = kt0.a;
            long j = w;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            zy2 zy2Var = u07.a;
            if (objectVolatile != zy2Var) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    Unsafe unsafe2 = kt0.a;
                    t07 t07Var = this;
                    if (unsafe2.compareAndSwapObject(t07Var, w, objectVolatile, zy2Var)) {
                        t07Var.c();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(t07Var, j) != objectVolatile) {
                            this = t07Var;
                            break;
                        }
                        this = t07Var;
                    }
                }
            }
        }
        gp.j("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(md2.c0(this));
        sb.append("[isLocked=");
        sb.append(e());
        sb.append(",owner=");
        v.getClass();
        return xv5.r(sb, kt0.a.getObjectVolatile(this, w), ']');
    }
}

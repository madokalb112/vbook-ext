package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class n36 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(n36.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = kt0.a;
        d = unsafe.objectFieldOffset(n36.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(n36.class, Object.class, "_prev$volatile");
        e = unsafe.objectFieldOffset(n36.class.getDeclaredField("_prev$volatile"));
        c = AtomicReferenceFieldUpdater.newUpdater(n36.class, Object.class, "_removedRef$volatile");
        f = unsafe.objectFieldOffset(n36.class.getDeclaredField("_removedRef$volatile"));
    }

    public static n36 h(n36 n36Var) {
        while (n36Var.m()) {
            b.getClass();
            n36Var = (n36) kt0.a.getObjectVolatile(n36Var, e);
        }
        return n36Var;
    }

    public final boolean d(n36 n36Var, int i) {
        n36 n36VarL;
        do {
            n36VarL = l();
            if (n36VarL instanceof bz5) {
                return (((bz5) n36VarL).s & i) == 0 && n36VarL.d(n36Var, i);
            }
        } while (!n36VarL.e(n36Var, this));
        return true;
    }

    public final boolean e(n36 n36Var, n36 n36Var2) {
        b.getClass();
        Unsafe unsafe = kt0.a;
        unsafe.putObjectVolatile(n36Var, e, this);
        a.getClass();
        long j = d;
        unsafe.putObjectVolatile(n36Var, j, n36Var2);
        while (true) {
            Unsafe unsafe2 = kt0.a;
            n36 n36Var3 = this;
            n36 n36Var4 = n36Var;
            n36 n36Var5 = n36Var2;
            if (unsafe2.compareAndSwapObject(n36Var3, d, n36Var5, n36Var4)) {
                n36Var4.i(n36Var5);
                return true;
            }
            if (unsafe2.getObjectVolatile(n36Var3, j) != n36Var5) {
                return false;
            }
            this = n36Var3;
            n36Var2 = n36Var5;
            n36Var = n36Var4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        r9 = r4;
        r10 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.e77 r10) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.n36.b
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.kt0.a
            long r1 = defpackage.n36.e
            r0.putObjectVolatile(r10, r1, r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.n36.a
            r1.getClass()
            long r1 = defpackage.n36.d
            r0.putObjectVolatile(r10, r1, r9)
        L16:
            java.lang.Object r0 = r9.j()
            if (r0 == r9) goto L1d
            return
        L1d:
            sun.misc.Unsafe r3 = defpackage.kt0.a
            long r5 = defpackage.n36.d
            r7 = r9
            r4 = r9
            r8 = r10
            boolean r9 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r9 == 0) goto L2e
            r8.i(r4)
            return
        L2e:
            java.lang.Object r9 = r3.getObjectVolatile(r4, r1)
            if (r9 == r4) goto L37
            r9 = r4
            r10 = r8
            goto L16
        L37:
            r9 = r4
            r10 = r8
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n36.f(e77):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.n36 g() {
        /*
            r15 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.n36.b
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.kt0.a
            long r1 = defpackage.n36.e
            java.lang.Object r0 = r0.getObjectVolatile(r15, r1)
            r7 = r0
            n36 r7 = (defpackage.n36) r7
            r0 = 0
            r9 = r0
            r8 = r7
        L13:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.n36.a
            r3.getClass()
            if (r8 == 0) goto L85
            sun.misc.Unsafe r3 = defpackage.kt0.a
            long r4 = defpackage.n36.d
            java.lang.Object r6 = r3.getObjectVolatile(r8, r4)
            if (r6 != r15) goto L40
            if (r7 != r8) goto L27
            goto L34
        L27:
            sun.misc.Unsafe r3 = defpackage.kt0.a
            long r5 = defpackage.n36.e
            r4 = r15
            boolean r15 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r14 = r7
            r7 = r4
            if (r15 == 0) goto L35
        L34:
            return r8
        L35:
            java.lang.Object r15 = r3.getObjectVolatile(r7, r1)
            if (r15 == r14) goto L3d
        L3b:
            r15 = r7
            goto L0
        L3d:
            r15 = r7
            r7 = r14
            goto L27
        L40:
            r14 = r7
            r7 = r15
            boolean r15 = r7.m()
            if (r15 == 0) goto L49
            return r0
        L49:
            boolean r15 = r6 instanceof defpackage.ri8
            if (r15 == 0) goto L7c
            if (r9 == 0) goto L6c
            ri8 r6 = (defpackage.ri8) r6
            n36 r13 = r6.a
        L53:
            r12 = r8
            sun.misc.Unsafe r8 = defpackage.kt0.a
            long r10 = defpackage.n36.d
            boolean r15 = r8.compareAndSwapObject(r9, r10, r12, r13)
            r3 = r8
            r8 = r12
            if (r15 == 0) goto L65
            r15 = r7
            r8 = r9
            r7 = r14
            r9 = r0
            goto L13
        L65:
            java.lang.Object r15 = r3.getObjectVolatile(r9, r4)
            if (r15 == r8) goto L53
            goto L3b
        L6c:
            if (r8 == 0) goto L78
            java.lang.Object r15 = r3.getObjectVolatile(r8, r1)
            r8 = r15
            n36 r8 = (defpackage.n36) r8
        L75:
            r15 = r7
            r7 = r14
            goto L13
        L78:
            defpackage.j31.j()
            return r0
        L7c:
            r6.getClass()
            r15 = r6
            n36 r15 = (defpackage.n36) r15
            r9 = r8
            r8 = r15
            goto L75
        L85:
            defpackage.j31.j()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n36.g():n36");
    }

    public final void i(n36 n36Var) {
        n36 n36Var2;
        while (true) {
            b.getClass();
            if (n36Var == null) {
                j31.j();
                return;
            }
            Unsafe unsafe = kt0.a;
            long j = e;
            n36 n36Var3 = (n36) unsafe.getObjectVolatile(n36Var, j);
            if (this.j() != n36Var) {
                return;
            }
            while (n36Var != null) {
                Unsafe unsafe2 = kt0.a;
                n36Var2 = this;
                n36 n36Var4 = n36Var;
                if (unsafe2.compareAndSwapObject(n36Var4, e, n36Var3, n36Var2)) {
                    if (n36Var2.m()) {
                        n36Var4.g();
                        return;
                    }
                    return;
                } else {
                    if (n36Var4 == null) {
                        j31.j();
                        return;
                    }
                    n36Var = n36Var4;
                    if (unsafe2.getObjectVolatile(n36Var4, j) != n36Var3) {
                        break;
                    } else {
                        this = n36Var2;
                    }
                }
            }
            j31.j();
            return;
            this = n36Var2;
        }
    }

    public final Object j() {
        a.getClass();
        return kt0.a.getObjectVolatile(this, d);
    }

    public final n36 k() {
        Object objJ = j();
        ri8 ri8Var = objJ instanceof ri8 ? (ri8) objJ : null;
        if (ri8Var != null) {
            return ri8Var.a;
        }
        objJ.getClass();
        return (n36) objJ;
    }

    public final n36 l() {
        n36 n36VarG = g();
        if (n36VarG != null) {
            return n36VarG;
        }
        b.getClass();
        return h((n36) kt0.a.getObjectVolatile(this, e));
    }

    public boolean m() {
        return j() instanceof ri8;
    }

    public final n36 n() {
        n36 n36Var;
        while (true) {
            Object objJ = this.j();
            if (objJ instanceof ri8) {
                return ((ri8) objJ).a;
            }
            if (objJ == this) {
                return (n36) objJ;
            }
            objJ.getClass();
            n36 n36Var2 = (n36) objJ;
            ri8 ri8VarO = n36Var2.o();
            while (true) {
                a.getClass();
                Unsafe unsafe = kt0.a;
                long j = d;
                n36Var = this;
                if (unsafe.compareAndSwapObject(n36Var, j, objJ, ri8VarO)) {
                    n36Var2.g();
                    return null;
                }
                if (unsafe.getObjectVolatile(n36Var, j) != objJ) {
                    break;
                }
                this = n36Var;
            }
            this = n36Var;
        }
    }

    public final ri8 o() {
        c.getClass();
        Unsafe unsafe = kt0.a;
        long j = f;
        ri8 ri8Var = (ri8) unsafe.getObjectVolatile(this, j);
        if (ri8Var != null) {
            return ri8Var;
        }
        ri8 ri8Var2 = new ri8(this);
        unsafe.putObjectVolatile(this, j, ri8Var2);
        return ri8Var2;
    }

    public String toString() {
        return new cq5(1, 4, md2.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + md2.c0(this);
    }
}

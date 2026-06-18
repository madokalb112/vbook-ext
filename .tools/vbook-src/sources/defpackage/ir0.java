package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class ir0 implements h11 {
    public static final /* synthetic */ long A;
    public static final /* synthetic */ long B;
    public static final /* synthetic */ long C;
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(ir0.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(ir0.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(ir0.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater s = AtomicLongFieldUpdater.newUpdater(ir0.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(ir0.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater u;
    public static final /* synthetic */ AtomicReferenceFieldUpdater v;
    public static final /* synthetic */ AtomicReferenceFieldUpdater w;
    public static final /* synthetic */ AtomicReferenceFieldUpdater x;
    public static final /* synthetic */ long y;
    public static final /* synthetic */ long z;
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    public final kb4 b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    public final nl9 c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = kt0.a;
        C = unsafe.objectFieldOffset(ir0.class.getDeclaredField("sendSegment$volatile"));
        u = AtomicReferenceFieldUpdater.newUpdater(ir0.class, Object.class, "receiveSegment$volatile");
        B = unsafe.objectFieldOffset(ir0.class.getDeclaredField("receiveSegment$volatile"));
        v = AtomicReferenceFieldUpdater.newUpdater(ir0.class, Object.class, "bufferEndSegment$volatile");
        z = unsafe.objectFieldOffset(ir0.class.getDeclaredField("bufferEndSegment$volatile"));
        w = AtomicReferenceFieldUpdater.newUpdater(ir0.class, Object.class, "_closeCause$volatile");
        y = unsafe.objectFieldOffset(ir0.class.getDeclaredField("_closeCause$volatile"));
        x = AtomicReferenceFieldUpdater.newUpdater(ir0.class, Object.class, "closeHandler$volatile");
        A = unsafe.objectFieldOffset(ir0.class.getDeclaredField("closeHandler$volatile"));
    }

    public ir0(int i, kb4 kb4Var) {
        this.a = i;
        this.b = kb4Var;
        if (i < 0) {
            gp.k(xv5.k(i, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        z11 z11Var = kr0.a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f.get(this);
        z11 z11Var2 = new z11(0L, null, this, 3);
        this.sendSegment$volatile = z11Var2;
        this.receiveSegment$volatile = z11Var2;
        if (H()) {
            z11Var2 = kr0.a;
            z11Var2.getClass();
        }
        this.bufferEndSegment$volatile = z11Var2;
        this.c = kb4Var != null ? new nl9(this, 3) : null;
        this._closeCause$volatile = kr0.s;
    }

    public static void A(ir0 ir0Var) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = s;
        if ((atomicLongFieldUpdater.addAndGet(ir0Var, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(ir0Var) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static Object K(ir0 ir0Var, jt1 jt1Var) throws Throwable {
        z11 z11Var;
        Throwable th;
        z11 z11Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u;
        atomicReferenceFieldUpdater.getClass();
        id idVarI = null;
        if (ir0Var == null) {
            j31.j();
            return null;
        }
        z11 z11Var3 = (z11) kt0.a.getObjectVolatile(ir0Var, B);
        while (!ir0Var.E()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(ir0Var);
            long j = kr0.b;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (z11Var3.e != j2) {
                z11 z11VarT = ir0Var.t(j2, z11Var3);
                if (z11VarT == null) {
                    continue;
                } else {
                    z11Var = z11VarT;
                }
            } else {
                z11Var = z11Var3;
            }
            ir0 ir0Var2 = ir0Var;
            Object objT = ir0Var2.T(z11Var, i, andIncrement, null);
            zy2 zy2Var = kr0.m;
            if (objT == zy2Var) {
                gp.j("unexpected");
                return null;
            }
            zy2 zy2Var2 = kr0.o;
            if (objT == zy2Var2) {
                if (andIncrement < ir0Var2.y()) {
                    z11Var.b();
                }
                ir0Var = ir0Var2;
                z11Var3 = z11Var;
            } else {
                if (objT != kr0.n) {
                    z11Var.b();
                    return objT;
                }
                kb4 kb4Var = ir0Var2.b;
                ay0 ay0VarE = ah1.E(bx1.J(jt1Var));
                try {
                    Object objT2 = ir0Var2.T(z11Var, i, andIncrement, ay0VarE);
                    if (objT2 == zy2Var) {
                        ay0VarE.b(z11Var, i);
                    } else if (objT2 == zy2Var2) {
                        if (andIncrement < ir0Var2.y()) {
                            z11Var.b();
                        }
                        z11 z11Var4 = (z11) atomicReferenceFieldUpdater.get(ir0Var2);
                        while (true) {
                            if (ir0Var2.E()) {
                                ay0VarE.resumeWith(new pm8(ir0Var2.w()));
                                break;
                            }
                            ay0 ay0Var = ay0VarE;
                            try {
                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(ir0Var2);
                                long j3 = kr0.b;
                                long j4 = andIncrement2 / j3;
                                int i2 = (int) (andIncrement2 % j3);
                                if (z11Var4.e != j4) {
                                    try {
                                        z11 z11VarT2 = ir0Var2.t(j4, z11Var4);
                                        if (z11VarT2 == null) {
                                            ay0VarE = ay0Var;
                                        } else {
                                            z11Var2 = z11VarT2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        ay0VarE = ay0Var;
                                        ay0VarE.B();
                                        throw th;
                                    }
                                } else {
                                    z11Var2 = z11Var4;
                                }
                                ir0 ir0Var3 = ir0Var2;
                                objT2 = ir0Var3.T(z11Var2, i2, andIncrement2, ay0Var);
                                ir0Var2 = ir0Var3;
                                z11 z11Var5 = z11Var2;
                                ay0VarE = ay0Var;
                                if (objT2 == kr0.m) {
                                    ay0VarE.b(z11Var5, i2);
                                    break;
                                }
                                if (objT2 == kr0.o) {
                                    if (andIncrement2 < ir0Var2.y()) {
                                        z11Var5.b();
                                    }
                                    z11Var4 = z11Var5;
                                } else {
                                    if (objT2 == kr0.n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    z11Var5.b();
                                    if (kb4Var != null) {
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                ay0VarE = ay0Var;
                                th = th;
                                ay0VarE.B();
                                throw th;
                            }
                        }
                        ay0VarE.i(objT2, idVarI);
                    } else {
                        z11Var.b();
                        if (kb4Var != null) {
                            idVarI = ir0Var2.i();
                        }
                        ay0VarE.i(objT2, idVarI);
                    }
                    return ay0VarE.s();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable thW = ir0Var.w();
        int i3 = sp9.a;
        throw thW;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object L(defpackage.ir0 r13, defpackage.kt1 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.gr0
            if (r0 == 0) goto L14
            r0 = r14
            gr0 r0 = (defpackage.gr0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            gr0 r0 = new gr0
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.a
            int r0 = r6.c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2c
            defpackage.e11.e0(r14)
            y11 r14 = (defpackage.y11) r14
            java.lang.Object r13 = r14.a
            return r13
        L2c:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r13)
            return r1
        L32:
            defpackage.e11.e0(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = defpackage.ir0.u
            r14.getClass()
            sun.misc.Unsafe r14 = defpackage.kt0.a
            long r3 = defpackage.ir0.B
            java.lang.Object r14 = r14.getObjectVolatile(r13, r3)
            z11 r14 = (defpackage.z11) r14
        L44:
            boolean r0 = r13.E()
            if (r0 == 0) goto L54
            java.lang.Throwable r13 = r13.v()
            w11 r14 = new w11
            r14.<init>(r13)
            return r14
        L54:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ir0.e
            long r4 = r0.getAndIncrement(r13)
            int r0 = defpackage.kr0.b
            long r7 = (long) r0
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.e
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L71
            z11 r0 = r13.t(r9, r14)
            if (r0 != 0) goto L6f
            goto L44
        L6f:
            r8 = r0
            goto L72
        L71:
            r8 = r14
        L72:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.T(r8, r9, r10, r12)
            zy2 r14 = defpackage.kr0.m
            if (r13 == r14) goto La6
            zy2 r14 = defpackage.kr0.o
            if (r13 != r14) goto L90
            long r13 = r7.y()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L8d
            r8.b()
        L8d:
            r13 = r7
            r14 = r8
            goto L44
        L90:
            zy2 r14 = defpackage.kr0.n
            if (r13 != r14) goto La2
            r6.c = r2
            r1 = r7
            r2 = r8
            java.lang.Object r13 = r1.M(r2, r3, r4, r6)
            xx1 r14 = defpackage.xx1.a
            if (r13 != r14) goto La1
            return r14
        La1:
            return r13
        La2:
            r8.b()
            return r13
        La6:
            java.lang.String r13 = "unexpected"
            gp.j(r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir0.L(ir0, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0158 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object P(defpackage.ir0 r26, java.lang.Object r27, defpackage.jt1 r28) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir0.P(ir0, java.lang.Object, jt1):java.lang.Object");
    }

    public static final void a(ir0 ir0Var, Object obj, ay0 ay0Var) {
        kb4 kb4Var = ir0Var.b;
        if (kb4Var != null) {
            y86.w(kb4Var, obj, ay0Var.e);
        }
        ay0Var.resumeWith(new pm8(ir0Var.x()));
    }

    public static final int d(ir0 ir0Var, z11 z11Var, int i, Object obj, long j, Object obj2, boolean z2) {
        z11Var.s(i, obj);
        if (z2) {
            return ir0Var.U(z11Var, i, obj, j, obj2, z2);
        }
        Object objQ = z11Var.q(i);
        if (objQ == null) {
            if (ir0Var.m(j)) {
                if (z11Var.p(i, null, kr0.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (z11Var.p(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objQ instanceof evb) {
            z11Var.s(i, null);
            if (ir0Var.Q(objQ, obj)) {
                z11Var.t(i, kr0.i);
                return 0;
            }
            zy2 zy2Var = kr0.k;
            if (z11Var.t.getAndSet((i * 2) + 1, zy2Var) == zy2Var) {
                return 5;
            }
            z11Var.r(i, true);
            return 5;
        }
        return ir0Var.U(z11Var, i, obj, j, obj2, z2);
    }

    public final void B() {
        Object objectVolatile;
        ir0 ir0Var;
        loop0: while (true) {
            x.getClass();
            Unsafe unsafe = kt0.a;
            long j = A;
            objectVolatile = unsafe.getObjectVolatile(this, j);
            zy2 zy2Var = objectVolatile == null ? kr0.q : kr0.r;
            while (true) {
                Unsafe unsafe2 = kt0.a;
                ir0Var = this;
                if (unsafe2.compareAndSwapObject(ir0Var, A, objectVolatile, zy2Var)) {
                    break loop0;
                } else if (unsafe2.getObjectVolatile(ir0Var, j) != objectVolatile) {
                    break;
                } else {
                    this = ir0Var;
                }
            }
            this = ir0Var;
        }
        if (objectVolatile == null) {
            return;
        }
        fw.F(1, objectVolatile);
        ((kb4) objectVolatile).invoke(ir0Var.v());
    }

    public final void C(l76 l76Var) {
        Unsafe unsafe;
        while (true) {
            x.getClass();
            Unsafe unsafe2 = kt0.a;
            ir0 ir0Var = this;
            if (unsafe2.compareAndSwapObject(ir0Var, A, (Object) null, l76Var)) {
                return;
            }
            long j = A;
            if (unsafe2.getObjectVolatile(ir0Var, j) != null) {
                while (true) {
                    Object objectVolatile = kt0.a.getObjectVolatile(ir0Var, j);
                    zy2 zy2Var = kr0.q;
                    if (objectVolatile != zy2Var) {
                        if (objectVolatile == kr0.r) {
                            gp.j("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            mn5.n(objectVolatile, "Another handler is already registered: ");
                            return;
                        }
                    }
                    zy2 zy2Var2 = kr0.r;
                    do {
                        ir0 ir0Var2 = ir0Var;
                        unsafe = kt0.a;
                        boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(ir0Var2, A, zy2Var, zy2Var2);
                        ir0Var = ir0Var2;
                        if (zCompareAndSwapObject) {
                            l76Var.invoke(ir0Var.v());
                            return;
                        }
                    } while (unsafe.getObjectVolatile(ir0Var, j) == zy2Var);
                }
            } else {
                this = ir0Var;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c0, code lost:
    
        r13 = (defpackage.z11) r13.f();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean D(long r13, boolean r15) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir0.D(long, boolean):boolean");
    }

    public final boolean E() {
        return D(d.get(this), true);
    }

    public final boolean F() {
        return D(d.get(this), false);
    }

    public boolean G() {
        return false;
    }

    public final boolean H() {
        long j = f.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        if (r5.k() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        r5.i();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(long r7, defpackage.z11 r9) {
        /*
            r6 = this;
        L0:
            long r0 = r9.e
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L11
            nn1 r0 = r9.d()
            z11 r0 = (defpackage.z11) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r9 = r0
            goto L0
        L11:
            r5 = r9
        L12:
            boolean r7 = r5.g()
            if (r7 == 0) goto L23
            nn1 r7 = r5.d()
            z11 r7 = (defpackage.z11) r7
            if (r7 != 0) goto L21
            goto L23
        L21:
            r5 = r7
            goto L12
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.ir0.v
            r7.getClass()
            sun.misc.Unsafe r7 = defpackage.kt0.a
            long r8 = defpackage.ir0.z
            java.lang.Object r7 = r7.getObjectVolatile(r6, r8)
            r4 = r7
            pz8 r4 = (defpackage.pz8) r4
            long r0 = r4.e
            long r2 = r5.e
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L3c
            goto L58
        L3c:
            boolean r7 = r5.o()
            if (r7 != 0) goto L44
            r9 = r5
            goto L11
        L44:
            sun.misc.Unsafe r0 = defpackage.kt0.a
            long r2 = defpackage.ir0.z
            r1 = r6
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L59
            boolean r6 = r4.k()
            if (r6 == 0) goto L58
            r4.i()
        L58:
            return
        L59:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r8)
            if (r6 == r4) goto L6a
            boolean r6 = r5.k()
            if (r6 == 0) goto L68
            r5.i()
        L68:
            r6 = r1
            goto L23
        L6a:
            r6 = r1
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir0.I(long, z11):void");
    }

    public final Object J(jt1 jt1Var, Object obj) {
        fi1 fi1VarX;
        ay0 ay0Var = new ay0(1, bx1.J(jt1Var));
        ay0Var.u();
        kb4 kb4Var = this.b;
        if (kb4Var == null || (fi1VarX = y86.x(kb4Var, obj, null)) == null) {
            ay0Var.resumeWith(new pm8(x()));
        } else {
            i12.r(fi1VarX, x());
            ay0Var.resumeWith(new pm8(fi1VarX));
        }
        Object objS = ay0Var.s();
        return objS == xx1.a ? objS : heb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(defpackage.z11 r10, int r11, long r12, defpackage.kt1 r14) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir0.M(z11, int, long, kt1):java.lang.Object");
    }

    public final void N(g09 g09Var) {
        z11 z11Var;
        ir0 ir0Var;
        g09 g09Var2;
        int i;
        u.getClass();
        z11 z11Var2 = (z11) kt0.a.getObjectVolatile(this, B);
        while (!this.E()) {
            long andIncrement = e.getAndIncrement(this);
            long j = kr0.b;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (z11Var2.e != j2) {
                z11 z11VarT = this.t(j2, z11Var2);
                if (z11VarT == null) {
                    continue;
                } else {
                    z11Var = z11VarT;
                    g09Var2 = g09Var;
                    i = i2;
                    ir0Var = this;
                }
            } else {
                z11Var = z11Var2;
                ir0Var = this;
                g09Var2 = g09Var;
                i = i2;
            }
            Object objT = ir0Var.T(z11Var, i, andIncrement, g09Var2);
            z11Var2 = z11Var;
            if (objT == kr0.m) {
                g09 g09Var3 = g09Var2 != null ? g09Var2 : null;
                if (g09Var3 != null) {
                    g09Var3.c = z11Var2;
                    g09Var3.d = i;
                    return;
                }
                return;
            }
            if (objT != kr0.o) {
                if (objT == kr0.n) {
                    gp.j("unexpected");
                    return;
                } else {
                    z11Var2.b();
                    g09Var2.e = objT;
                    return;
                }
            }
            if (andIncrement < ir0Var.y()) {
                z11Var2.b();
            }
            this = ir0Var;
            g09Var = g09Var2;
        }
        g09Var.e = kr0.l;
    }

    public final void O(evb evbVar, boolean z2) {
        if (evbVar instanceof zx0) {
            ((jt1) evbVar).resumeWith(new pm8(z2 ? w() : x()));
            return;
        }
        if (evbVar instanceof we8) {
            ((we8) evbVar).a.resumeWith(new y11(new w11(v())));
            return;
        }
        if (!(evbVar instanceof br0)) {
            if (evbVar instanceof g09) {
                ((g09) evbVar).j(this, kr0.l);
                return;
            } else {
                mn5.n(evbVar, "Unexpected waiter: ");
                return;
            }
        }
        br0 br0Var = (br0) evbVar;
        ay0 ay0Var = br0Var.b;
        ay0Var.getClass();
        br0Var.b = null;
        br0Var.a = kr0.l;
        Throwable thV = br0Var.c.v();
        if (thV == null) {
            ay0Var.resumeWith(Boolean.FALSE);
        } else {
            ay0Var.resumeWith(new pm8(thV));
        }
    }

    public final boolean Q(Object obj, Object obj2) {
        if (obj instanceof g09) {
            return ((g09) obj).j(this, obj2);
        }
        boolean z2 = obj instanceof we8;
        kb4 kb4Var = this.b;
        if (z2) {
            return kr0.a(((we8) obj).a, new y11(obj2), kb4Var != null ? l() : null);
        }
        if (!(obj instanceof br0)) {
            if (obj instanceof zx0) {
                return kr0.a((zx0) obj, obj2, kb4Var != null ? i() : null);
            }
            mn5.n(obj, "Unexpected receiver type: ");
            return false;
        }
        br0 br0Var = (br0) obj;
        ay0 ay0Var = br0Var.b;
        ay0Var.getClass();
        br0Var.b = null;
        br0Var.a = obj2;
        Boolean bool = Boolean.TRUE;
        kb4 kb4Var2 = br0Var.c.b;
        return kr0.a(ay0Var, bool, kb4Var2 != null ? new qz0(4, kb4Var2, obj2) : null);
    }

    public final boolean R(Object obj, z11 z11Var, int i) {
        o7b o7bVar;
        boolean z2 = obj instanceof zx0;
        heb hebVar = heb.a;
        if (z2) {
            return kr0.a((zx0) obj, hebVar, null);
        }
        if (!(obj instanceof g09)) {
            mn5.n(obj, "Unexpected waiter: ");
            return false;
        }
        int iK = ((g09) obj).k(this, hebVar);
        o7b o7bVar2 = o7b.a;
        o7b o7bVar3 = o7b.b;
        if (iK == 0) {
            o7bVar = o7bVar2;
        } else if (iK == 1) {
            o7bVar = o7bVar3;
        } else if (iK == 2) {
            o7bVar = o7b.c;
        } else {
            if (iK != 3) {
                w58.f(iK, "Unexpected internal result: ");
                return false;
            }
            o7bVar = o7b.d;
        }
        if (o7bVar == o7bVar3) {
            z11Var.s(i, null);
        }
        return o7bVar == o7bVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S(java.lang.Object r14) {
        /*
            r13 = this;
            zy2 r6 = defpackage.kr0.d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ir0.t
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.kt0.a
            long r1 = defpackage.ir0.C
            java.lang.Object r0 = r0.getObjectVolatile(r13, r1)
            z11 r0 = (defpackage.z11) r0
        L11:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.ir0.d
            long r1 = r1.getAndIncrement(r13)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r1 & r3
            r3 = 0
            boolean r7 = r13.D(r1, r3)
            int r8 = defpackage.kr0.b
            long r9 = (long) r8
            long r1 = r4 / r9
            long r11 = r4 % r9
            int r3 = (int) r11
            long r11 = r0.e
            int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r11 == 0) goto L47
            z11 r1 = r13.u(r1, r0)
            if (r1 != 0) goto L43
            if (r7 == 0) goto L11
            java.lang.Throwable r13 = r13.x()
            w11 r14 = new w11
            r14.<init>(r13)
            return r14
        L43:
            r0 = r13
            r2 = r3
        L45:
            r3 = r14
            goto L4b
        L47:
            r1 = r0
            r2 = r3
            r0 = r13
            goto L45
        L4b:
            int r13 = d(r0, r1, r2, r3, r4, r6, r7)
            r14 = r0
            r0 = r1
            heb r1 = defpackage.heb.a
            if (r13 == 0) goto Laf
            r11 = 1
            if (r13 == r11) goto Lae
            r11 = 2
            r12 = 0
            if (r13 == r11) goto L89
            r1 = 3
            if (r13 == r1) goto L83
            r1 = 4
            if (r13 == r1) goto L6c
            r1 = 5
            if (r13 == r1) goto L66
            goto L69
        L66:
            r0.b()
        L69:
            r13 = r14
            r14 = r3
            goto L11
        L6c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r13 = defpackage.ir0.e
            long r1 = r13.get(r14)
            int r13 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r13 >= 0) goto L79
            r0.b()
        L79:
            java.lang.Throwable r13 = r14.x()
            w11 r14 = new w11
            r14.<init>(r13)
            return r14
        L83:
            java.lang.String r13 = "unexpected"
            gp.j(r13)
            return r12
        L89:
            if (r7 == 0) goto L98
            r0.n()
            java.lang.Throwable r13 = r14.x()
            w11 r14 = new w11
            r14.<init>(r13)
            return r14
        L98:
            boolean r13 = r6 instanceof defpackage.evb
            if (r13 == 0) goto L9f
            r12 = r6
            evb r12 = (defpackage.evb) r12
        L9f:
            if (r12 == 0) goto La6
            int r3 = r2 + r8
            r12.b(r0, r3)
        La6:
            long r3 = r0.e
            long r3 = r3 * r9
            long r5 = (long) r2
            long r3 = r3 + r5
            r14.q(r3)
        Lae:
            return r1
        Laf:
            r0.b()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir0.S(java.lang.Object):java.lang.Object");
    }

    public final Object T(z11 z11Var, int i, long j, Object obj) {
        Object objQ = z11Var.q(i);
        AtomicReferenceArray atomicReferenceArray = z11Var.t;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        if (objQ == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return kr0.n;
                }
                if (z11Var.p(i, objQ, obj)) {
                    r();
                    return kr0.m;
                }
            }
        } else if (objQ == kr0.d && z11Var.p(i, objQ, kr0.i)) {
            r();
            Object obj2 = atomicReferenceArray.get(i * 2);
            z11Var.s(i, null);
            return obj2;
        }
        while (true) {
            Object objQ2 = z11Var.q(i);
            if (objQ2 == null || objQ2 == kr0.e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (z11Var.p(i, objQ2, kr0.h)) {
                        r();
                        return kr0.o;
                    }
                } else {
                    if (obj == null) {
                        return kr0.n;
                    }
                    if (z11Var.p(i, objQ2, obj)) {
                        r();
                        return kr0.m;
                    }
                }
            } else if (objQ2 != kr0.d) {
                zy2 zy2Var = kr0.j;
                if (objQ2 == zy2Var) {
                    return kr0.o;
                }
                if (objQ2 == kr0.h) {
                    return kr0.o;
                }
                if (objQ2 == kr0.l) {
                    r();
                    return kr0.o;
                }
                if (objQ2 != kr0.g && z11Var.p(i, objQ2, kr0.f)) {
                    boolean z2 = objQ2 instanceof fvb;
                    if (z2) {
                        objQ2 = ((fvb) objQ2).a;
                    }
                    if (R(objQ2, z11Var, i)) {
                        z11Var.t(i, kr0.i);
                        r();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        z11Var.s(i, null);
                        return obj3;
                    }
                    z11Var.t(i, zy2Var);
                    z11Var.n();
                    if (z2) {
                        r();
                    }
                    return kr0.o;
                }
            } else if (z11Var.p(i, objQ2, kr0.i)) {
                r();
                Object obj4 = atomicReferenceArray.get(i * 2);
                z11Var.s(i, null);
                return obj4;
            }
        }
    }

    public final int U(z11 z11Var, int i, Object obj, long j, Object obj2, boolean z2) {
        while (true) {
            Object objQ = z11Var.q(i);
            if (objQ == null) {
                if (!m(j) || z2) {
                    if (z2) {
                        if (z11Var.p(i, null, kr0.j)) {
                            z11Var.n();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (z11Var.p(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (z11Var.p(i, null, kr0.d)) {
                    break;
                }
            } else {
                if (objQ != kr0.e) {
                    zy2 zy2Var = kr0.k;
                    if (objQ == zy2Var) {
                        z11Var.s(i, null);
                        return 5;
                    }
                    if (objQ == kr0.h) {
                        z11Var.s(i, null);
                        return 5;
                    }
                    if (objQ == kr0.l) {
                        z11Var.s(i, null);
                        F();
                        return 4;
                    }
                    z11Var.s(i, null);
                    if (objQ instanceof fvb) {
                        objQ = ((fvb) objQ).a;
                    }
                    if (Q(objQ, obj)) {
                        z11Var.t(i, kr0.i);
                        return 0;
                    }
                    if (z11Var.t.getAndSet((i * 2) + 1, zy2Var) != zy2Var) {
                        z11Var.r(i, true);
                    }
                    return 5;
                }
                if (z11Var.p(i, objQ, kr0.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void V(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        ir0 ir0Var = this;
        if (ir0Var.H()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f;
            if (atomicLongFieldUpdater.get(ir0Var) > j) {
                break;
            } else {
                ir0Var = this;
            }
        }
        int i = kr0.c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = s;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(ir0Var);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(ir0Var)) && j2 == atomicLongFieldUpdater.get(ir0Var)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(ir0Var);
                    if (atomicLongFieldUpdater2.compareAndSet(ir0Var, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        ir0Var = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(ir0Var);
                    long j5 = atomicLongFieldUpdater2.get(ir0Var);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z2 = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(ir0Var)) {
                        break;
                    }
                    if (z2) {
                        ir0Var = this;
                    } else {
                        ir0Var = this;
                        atomicLongFieldUpdater2.compareAndSet(ir0Var, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(ir0Var);
                    if (atomicLongFieldUpdater2.compareAndSet(ir0Var, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        ir0Var = this;
                    }
                }
            }
        }
    }

    @Override // defpackage.h11
    public final d09 b() {
        cr0 cr0Var = cr0.a;
        fw.F(3, cr0Var);
        dr0 dr0Var = dr0.a;
        fw.F(3, dr0Var);
        return new s16(this, cr0Var, dr0Var, this.c, 23);
    }

    @Override // defpackage.h11
    public final d09 c() {
        er0 er0Var = er0.a;
        fw.F(3, er0Var);
        fr0 fr0Var = fr0.a;
        fw.F(3, fr0Var);
        return new s16(this, er0Var, fr0Var, this.c, 23);
    }

    @Override // defpackage.h11
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        o(true, cancellationException);
    }

    @Override // defpackage.h11
    public final Object e() {
        z11 z11Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = d.get(this);
        if (D(j2, true)) {
            return new w11(v());
        }
        long j3 = j2 & 1152921504606846975L;
        x11 x11Var = y11.b;
        if (j >= j3) {
            return x11Var;
        }
        evb evbVar = kr0.k;
        u.getClass();
        z11 z11Var2 = (z11) kt0.a.getObjectVolatile(this, B);
        while (!this.E()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = kr0.b;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (z11Var2.e != j5) {
                z11 z11VarT = this.t(j5, z11Var2);
                if (z11VarT == null) {
                    continue;
                } else {
                    z11Var = z11VarT;
                }
            } else {
                z11Var = z11Var2;
            }
            ir0 ir0Var = this;
            Object objT = ir0Var.T(z11Var, i, andIncrement, evbVar);
            z11Var2 = z11Var;
            if (objT == kr0.m) {
                evb evbVar2 = evbVar instanceof evb ? evbVar : null;
                if (evbVar2 != null) {
                    evbVar2.b(z11Var2, i);
                }
                ir0Var.V(andIncrement);
                z11Var2.n();
                return x11Var;
            }
            if (objT != kr0.o) {
                if (objT != kr0.n) {
                    z11Var2.b();
                    return objT;
                }
                gp.j("unexpected");
                return null;
            }
            if (andIncrement < ir0Var.y()) {
                z11Var2.b();
            }
            this = ir0Var;
        }
        return new w11(this.v());
    }

    @Override // defpackage.h11
    public final Object f(qi qiVar) {
        return L(this, qiVar);
    }

    @Override // defpackage.w29
    public Object g(jt1 jt1Var, Object obj) {
        return P(this, obj, jt1Var);
    }

    @Override // defpackage.w29
    public final boolean h(Throwable th) {
        return o(false, th);
    }

    public final id i() {
        return new id(3, this, ir0.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 1);
    }

    @Override // defpackage.h11
    public final br0 iterator() {
        return new br0(this);
    }

    @Override // defpackage.h11
    public final Object j(o1a o1aVar) {
        return K(this, o1aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3 A[SYNTHETIC] */
    @Override // defpackage.w29
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = defpackage.ir0.d
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.D(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.m(r1)
            r1 = r1 ^ r10
        L1b:
            x11 r13 = defpackage.y11.b
            if (r1 == 0) goto L20
            return r13
        L20:
            zy2 r6 = defpackage.kr0.j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.ir0.t
            r1.getClass()
            sun.misc.Unsafe r1 = defpackage.kt0.a
            long r2 = defpackage.ir0.C
            java.lang.Object r1 = r1.getObjectVolatile(r15, r2)
            z11 r1 = (defpackage.z11) r1
        L31:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.D(r2, r9)
            int r14 = defpackage.kr0.b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.e
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L64
            z11 r3 = r15.u(r11, r1)
            if (r3 != 0) goto L63
            if (r7 == 0) goto L5b
            java.lang.Throwable r0 = r15.x()
            w11 r1 = new w11
            r1.<init>(r0)
            return r1
        L5b:
            r9 = 0
            r10 = 1
        L5d:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L31
        L63:
            r1 = r3
        L64:
            r0 = r15
            r3 = r16
            int r9 = d(r0, r1, r2, r3, r4, r6, r7)
            heb r3 = defpackage.heb.a
            if (r9 == 0) goto Lc3
            r10 = 1
            if (r9 == r10) goto Lc2
            r3 = 2
            r11 = 0
            if (r9 == r3) goto La2
            r2 = 3
            if (r9 == r2) goto L9c
            r2 = 4
            if (r9 == r2) goto L85
            r2 = 5
            if (r9 == r2) goto L80
            goto L83
        L80:
            r1.b()
        L83:
            r9 = 0
            goto L5d
        L85:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.ir0.e
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L92
            r1.b()
        L92:
            java.lang.Throwable r0 = r15.x()
            w11 r1 = new w11
            r1.<init>(r0)
            return r1
        L9c:
            java.lang.String r0 = "unexpected"
            gp.j(r0)
            return r11
        La2:
            if (r7 == 0) goto Lb1
            r1.n()
            java.lang.Throwable r0 = r15.x()
            w11 r1 = new w11
            r1.<init>(r0)
            return r1
        Lb1:
            boolean r0 = r6 instanceof defpackage.evb
            if (r0 == 0) goto Lb8
            r11 = r6
            evb r11 = (defpackage.evb) r11
        Lb8:
            if (r11 == 0) goto Lbe
            int r2 = r2 + r14
            r11.b(r1, r2)
        Lbe:
            r1.n()
            return r13
        Lc2:
            return r3
        Lc3:
            r1.b()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir0.k(java.lang.Object):java.lang.Object");
    }

    public final id l() {
        return new id(3, this, ir0.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 2);
    }

    public final boolean m(long j) {
        return j < f.get(this) || j < e.get(this) + ((long) this.a);
    }

    public final z11 n() {
        v.getClass();
        Unsafe unsafe = kt0.a;
        Object objectVolatile = unsafe.getObjectVolatile(this, z);
        t.getClass();
        z11 z11Var = (z11) unsafe.getObjectVolatile(this, C);
        if (z11Var.e > ((z11) objectVolatile).e) {
            objectVolatile = z11Var;
        }
        u.getClass();
        z11 z11Var2 = (z11) unsafe.getObjectVolatile(this, B);
        if (z11Var2.e > ((z11) objectVolatile).e) {
            objectVolatile = z11Var2;
        }
        nn1 nn1Var = (nn1) objectVolatile;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nn1.a;
            Object objE = nn1Var.e();
            if (objE == mn1.a) {
                break;
            }
            nn1 nn1Var2 = (nn1) objE;
            if (nn1Var2 != null) {
                nn1Var = nn1Var2;
            } else if (nn1Var.h()) {
                break;
            }
        }
        return (z11) nn1Var;
    }

    public final boolean o(boolean z2, Throwable th) {
        ir0 ir0Var;
        boolean z3;
        long j;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        if (z2) {
            while (true) {
                long j4 = atomicLongFieldUpdater.get(this);
                if (((int) (j4 >> 60)) != 0) {
                    break;
                }
                z11 z11Var = kr0.a;
                ir0Var = this;
                if (atomicLongFieldUpdater.compareAndSet(ir0Var, j4, (j4 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                this = ir0Var;
            }
        } else {
            ir0Var = this;
        }
        zy2 zy2Var = kr0.s;
        while (true) {
            w.getClass();
            ir0 ir0Var2 = ir0Var;
            Unsafe unsafe = kt0.a;
            long j5 = y;
            Throwable th2 = th;
            boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(ir0Var2, j5, zy2Var, th2);
            ir0Var = ir0Var2;
            if (zCompareAndSwapObject) {
                z3 = true;
                break;
            }
            if (unsafe.getObjectVolatile(ir0Var, j5) != zy2Var) {
                z3 = false;
                break;
            }
            th = th2;
        }
        if (z2) {
            do {
                j3 = atomicLongFieldUpdater.get(ir0Var);
            } while (!atomicLongFieldUpdater.compareAndSet(ir0Var, j3, 3458764513820540928L + (j3 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(ir0Var);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = (j & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = (j & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(ir0Var, j, j2));
        }
        ir0Var.F();
        if (z3) {
            ir0Var.B();
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r1 = (defpackage.z11) r1.f();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.z11 p(long r12) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir0.p(long):z11");
    }

    public final void q(long j) {
        fi1 fi1VarX;
        u.getClass();
        z11 z11Var = (z11) kt0.a.getObjectVolatile(this, B);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.a) + j2, f.get(this))) {
                return;
            }
            ir0 ir0Var = this;
            if (atomicLongFieldUpdater.compareAndSet(ir0Var, j2, 1 + j2)) {
                long j3 = kr0.b;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (z11Var.e != j4) {
                    z11 z11VarT = ir0Var.t(j4, z11Var);
                    if (z11VarT != null) {
                        z11Var = z11VarT;
                    }
                }
                z11 z11Var2 = z11Var;
                Object objT = ir0Var.T(z11Var2, i, j2, null);
                if (objT != kr0.o) {
                    z11Var2.b();
                    kb4 kb4Var = ir0Var.b;
                    if (kb4Var != null && (fi1VarX = y86.x(kb4Var, objT, null)) != null) {
                        throw fi1VarX;
                    }
                } else if (j2 < ir0Var.y()) {
                    z11Var2.b();
                }
                this = ir0Var;
                z11Var = z11Var2;
            }
            this = ir0Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f1, code lost:
    
        A(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f4, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir0.r():void");
    }

    public final z11 s(long j, z11 z11Var, long j2) {
        Object objA;
        Unsafe unsafe;
        z11 z11Var2 = kr0.a;
        jr0 jr0Var = jr0.a;
        loop0: while (true) {
            objA = mn1.a(z11Var, j, jr0Var);
            if (!pu1.m0(objA)) {
                pz8 pz8VarG0 = pu1.g0(objA);
                while (true) {
                    v.getClass();
                    Unsafe unsafe2 = kt0.a;
                    long j3 = z;
                    pz8 pz8Var = (pz8) unsafe2.getObjectVolatile(this, j3);
                    if (pz8Var.e >= pz8VarG0.e) {
                        break loop0;
                    }
                    if (!pz8VarG0.o()) {
                        break;
                    }
                    do {
                        unsafe = kt0.a;
                        if (unsafe.compareAndSwapObject(this, z, pz8Var, pz8VarG0)) {
                            if (pz8Var.k()) {
                                pz8Var.i();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j3) == pz8Var);
                    if (pz8VarG0.k()) {
                        pz8VarG0.i();
                    }
                }
            } else {
                break;
            }
        }
        if (pu1.m0(objA)) {
            F();
            I(j, z11Var);
            A(this);
            return null;
        }
        z11 z11Var3 = (z11) pu1.g0(objA);
        long j4 = z11Var3.e;
        if (j4 <= j) {
            return z11Var3;
        }
        long j5 = j4 * ((long) kr0.b);
        if (!f.compareAndSet(this, j2 + 1, j5)) {
            A(this);
            return null;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = s;
        if ((atomicLongFieldUpdater.addAndGet(this, j5 - j2) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (r8.k() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
    
        r8.i();
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.z11 t(long r16, defpackage.z11 r18) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir0.t(long, z11):z11");
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c1, code lost:
    
        r15 = r8;
        r3 = (defpackage.z11) r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c9, code lost:
    
        if (r3 != null) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir0.toString():java.lang.String");
    }

    public final z11 u(long j, z11 z11Var) {
        Object objA;
        long j2;
        long j3;
        Unsafe unsafe;
        z11 z11Var2 = kr0.a;
        jr0 jr0Var = jr0.a;
        loop0: while (true) {
            objA = mn1.a(z11Var, j, jr0Var);
            if (!pu1.m0(objA)) {
                pz8 pz8VarG0 = pu1.g0(objA);
                while (true) {
                    t.getClass();
                    Unsafe unsafe2 = kt0.a;
                    long j4 = C;
                    pz8 pz8Var = (pz8) unsafe2.getObjectVolatile(this, j4);
                    if (pz8Var.e >= pz8VarG0.e) {
                        break loop0;
                    }
                    if (!pz8VarG0.o()) {
                        break;
                    }
                    do {
                        unsafe = kt0.a;
                        if (unsafe.compareAndSwapObject(this, C, pz8Var, pz8VarG0)) {
                            if (pz8Var.k()) {
                                pz8Var.i();
                            }
                        }
                    } while (unsafe.getObjectVolatile(this, j4) == pz8Var);
                    if (pz8VarG0.k()) {
                        pz8VarG0.i();
                    }
                }
            } else {
                break;
            }
        }
        boolean zM0 = pu1.m0(objA);
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (zM0) {
            F();
            if (z11Var.e * ((long) kr0.b) < atomicLongFieldUpdater.get(this)) {
                z11Var.b();
                return null;
            }
        } else {
            z11 z11Var3 = (z11) pu1.g0(objA);
            long j5 = z11Var3.e;
            if (j5 <= j) {
                return z11Var3;
            }
            long j6 = j5 * ((long) kr0.b);
            do {
                j2 = d.get(this);
                j3 = 1152921504606846975L & j2;
                if (j3 >= j6) {
                    break;
                }
            } while (!d.compareAndSet(this, j2, j3 + (((long) ((int) (j2 >> 60))) << 60)));
            if (j5 * ((long) kr0.b) < atomicLongFieldUpdater.get(this)) {
                z11Var3.b();
            }
        }
        return null;
    }

    public final Throwable v() {
        w.getClass();
        return (Throwable) kt0.a.getObjectVolatile(this, y);
    }

    public final Throwable w() {
        Throwable thV = v();
        return thV == null ? new db1("Channel was closed") : thV;
    }

    public final Throwable x() {
        Throwable thV = v();
        return thV == null ? new eb1("Channel was closed") : thV;
    }

    public final long y() {
        return d.get(this) & 1152921504606846975L;
    }

    public final boolean z() {
        while (true) {
            u.getClass();
            Unsafe unsafe = kt0.a;
            long j = B;
            z11 z11VarT = (z11) unsafe.getObjectVolatile(this, j);
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long j2 = atomicLongFieldUpdater.get(this);
            if (y() <= j2) {
                return false;
            }
            long j3 = kr0.b;
            long j4 = j2 / j3;
            if (z11VarT.e == j4 || (z11VarT = t(j4, z11VarT)) != null) {
                z11VarT.b();
                int i = (int) (j2 % j3);
                while (true) {
                    Object objQ = z11VarT.q(i);
                    if (objQ == null || objQ == kr0.e) {
                        if (z11VarT.p(i, objQ, kr0.h)) {
                            r();
                            break;
                        }
                    } else {
                        if (objQ == kr0.d) {
                            return true;
                        }
                        if (objQ != kr0.j && objQ != kr0.l && objQ != kr0.i && objQ != kr0.h) {
                            if (objQ == kr0.g) {
                                return true;
                            }
                            if (objQ != kr0.f && j2 == atomicLongFieldUpdater.get(this)) {
                                return true;
                            }
                        }
                    }
                }
                e.compareAndSet(this, j2, j2 + 1);
            } else if (((z11) unsafe.getObjectVolatile(this, j)).e < j4) {
                return false;
            }
        }
    }
}

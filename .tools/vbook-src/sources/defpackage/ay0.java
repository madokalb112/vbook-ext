package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class ay0 extends nw2 implements zx0, yx1, evb {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(ay0.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(ay0.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater t;
    public static final /* synthetic */ long u;
    public static final /* synthetic */ long v;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final jt1 d;
    public final jx1 e;

    static {
        Unsafe unsafe = kt0.a;
        v = unsafe.objectFieldOffset(ay0.class.getDeclaredField("_state$volatile"));
        t = AtomicReferenceFieldUpdater.newUpdater(ay0.class, Object.class, "_parentHandle$volatile");
        u = unsafe.objectFieldOffset(ay0.class.getDeclaredField("_parentHandle$volatile"));
    }

    public ay0(int i, jt1 jt1Var) {
        super(i);
        this.d = jt1Var;
        this.e = jt1Var.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b5.a;
    }

    public static Object F(t77 t77Var, Object obj, int i, zb4 zb4Var) {
        if (obj instanceof ei1) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (zb4Var != null || (t77Var instanceof vx0)) {
            return new ci1(obj, t77Var instanceof vx0 ? (vx0) t77Var : null, zb4Var, (Throwable) null, 16);
        }
        return obj;
    }

    public static void z(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        Throwable thQ;
        jt1 jt1Var = this.d;
        kw2 kw2Var = jt1Var instanceof kw2 ? (kw2) jt1Var : null;
        if (kw2Var == null || (thQ = kw2Var.q(this)) == null) {
            return;
        }
        o();
        a(thQ);
    }

    public final boolean C() {
        s.getClass();
        Unsafe unsafe = kt0.a;
        long j = v;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof ci1) && ((ci1) objectVolatile).d != null) {
            o();
            return false;
        }
        f.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, b5.a);
        return true;
    }

    public final void D(Object obj, int i, zb4 zb4Var) {
        ay0 ay0Var;
        while (true) {
            s.getClass();
            Unsafe unsafe = kt0.a;
            long j = v;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof t77)) {
                ay0 ay0Var2 = this;
                if (objectVolatile instanceof dy0) {
                    dy0 dy0Var = (dy0) objectVolatile;
                    if (dy0.c.compareAndSet(dy0Var, 0, 1)) {
                        if (zb4Var != null) {
                            ay0Var2.m(zb4Var, dy0Var.a, obj);
                            return;
                        }
                        return;
                    }
                }
                mn5.n(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objF = F((t77) objectVolatile, obj, i, zb4Var);
            while (true) {
                Unsafe unsafe2 = kt0.a;
                ay0Var = this;
                if (unsafe2.compareAndSwapObject(ay0Var, v, objectVolatile, objF)) {
                    if (!ay0Var.y()) {
                        ay0Var.o();
                    }
                    ay0Var.p(i);
                    return;
                } else if (unsafe2.getObjectVolatile(ay0Var, j) != objectVolatile) {
                    break;
                } else {
                    this = ay0Var;
                }
            }
            this = ay0Var;
        }
    }

    public final void E(nx1 nx1Var) {
        jt1 jt1Var = this.d;
        kw2 kw2Var = jt1Var instanceof kw2 ? (kw2) jt1Var : null;
        D(heb.a, (kw2Var != null ? kw2Var.d : null) == nx1Var ? 4 : this.c, null);
    }

    public final zy2 G(Object obj, zb4 zb4Var) {
        ay0 ay0Var;
        while (true) {
            s.getClass();
            Unsafe unsafe = kt0.a;
            long j = v;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof t77)) {
                return null;
            }
            Object objF = F((t77) objectVolatile, obj, this.c, zb4Var);
            while (true) {
                Unsafe unsafe2 = kt0.a;
                ay0Var = this;
                if (unsafe2.compareAndSwapObject(ay0Var, v, objectVolatile, objF)) {
                    boolean zY = ay0Var.y();
                    zy2 zy2Var = by0.a;
                    if (!zY) {
                        ay0Var.o();
                    }
                    return zy2Var;
                }
                if (unsafe2.getObjectVolatile(ay0Var, j) != objectVolatile) {
                    break;
                }
                this = ay0Var;
            }
            this = ay0Var;
        }
    }

    @Override // defpackage.zx0
    public final boolean a(Throwable th) {
        Throwable cancellationException;
        ay0 ay0Var;
        while (true) {
            s.getClass();
            Unsafe unsafe = kt0.a;
            long j = v;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof t77)) {
                return false;
            }
            boolean z = (objectVolatile instanceof vx0) || (objectVolatile instanceof pz8);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            dy0 dy0Var = new dy0(z, cancellationException);
            while (true) {
                Unsafe unsafe2 = kt0.a;
                ay0Var = this;
                if (unsafe2.compareAndSwapObject(ay0Var, v, objectVolatile, dy0Var)) {
                    t77 t77Var = (t77) objectVolatile;
                    if (t77Var instanceof vx0) {
                        ay0Var.k((vx0) objectVolatile, th);
                    } else if (t77Var instanceof pz8) {
                        ay0Var.n((pz8) objectVolatile, th);
                    }
                    if (!ay0Var.y()) {
                        ay0Var.o();
                    }
                    ay0Var.p(ay0Var.c);
                    return true;
                }
                if (unsafe2.getObjectVolatile(ay0Var, j) != objectVolatile) {
                    break;
                }
                this = ay0Var;
            }
            this = ay0Var;
        }
    }

    @Override // defpackage.evb
    public final void b(pz8 pz8Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                gp.j("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        x(pz8Var);
    }

    @Override // defpackage.nw2
    public final void c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        ay0 ay0Var;
        while (true) {
            s.getClass();
            Unsafe unsafe = kt0.a;
            long j = v;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof t77) {
                gp.j("Not completed");
                return;
            }
            if (objectVolatile instanceof ei1) {
                return;
            }
            if (objectVolatile instanceof ci1) {
                ci1 ci1Var = (ci1) objectVolatile;
                if (ci1Var.e != null) {
                    gp.j("Must be called at most once");
                    return;
                }
                ci1 ci1VarA = ci1.a(ci1Var, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = kt0.a;
                    ay0 ay0Var2 = this;
                    if (unsafe2.compareAndSwapObject(ay0Var2, v, objectVolatile, ci1VarA)) {
                        vx0 vx0Var = ci1Var.b;
                        if (vx0Var != null) {
                            ay0Var2.k(vx0Var, cancellationException);
                        }
                        zb4 zb4Var = ci1Var.c;
                        if (zb4Var != null) {
                            ay0Var2.m(zb4Var, cancellationException, ci1Var.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(ay0Var2, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        ay0Var = ay0Var2;
                        break;
                    }
                    this = ay0Var2;
                }
            } else {
                ay0 ay0Var3 = this;
                CancellationException cancellationException3 = cancellationException;
                ci1 ci1Var2 = new ci1(objectVolatile, (vx0) null, (zb4) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    ci1 ci1Var3 = ci1Var2;
                    Unsafe unsafe3 = kt0.a;
                    ay0Var = ay0Var3;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(ay0Var, v, objectVolatile, ci1Var3);
                    ci1Var2 = ci1Var3;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(ay0Var, j) != objectVolatile) {
                        break;
                    } else {
                        ay0Var3 = ay0Var;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = ay0Var;
        }
    }

    @Override // defpackage.zx0
    public final zy2 d(Object obj, zb4 zb4Var) {
        return G(obj, zb4Var);
    }

    @Override // defpackage.nw2
    public final jt1 e() {
        return this.d;
    }

    @Override // defpackage.nw2
    public final Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // defpackage.nw2
    public final Object g(Object obj) {
        return obj instanceof ci1 ? ((ci1) obj).a : obj;
    }

    @Override // defpackage.yx1
    public final yx1 getCallerFrame() {
        jt1 jt1Var = this.d;
        if (jt1Var instanceof yx1) {
            return (yx1) jt1Var;
        }
        return null;
    }

    @Override // defpackage.jt1
    public final jx1 getContext() {
        return this.e;
    }

    @Override // defpackage.zx0
    public final void i(Object obj, zb4 zb4Var) {
        D(obj, this.c, zb4Var);
    }

    @Override // defpackage.nw2
    public final Object j() {
        return t();
    }

    public final void k(vx0 vx0Var, Throwable th) {
        try {
            vx0Var.a(th);
        } catch (Throwable th2) {
            qx1.y(this.e, new fi1("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.zx0
    public final void l(Object obj) {
        p(this.c);
    }

    public final void m(zb4 zb4Var, Throwable th, Object obj) {
        jx1 jx1Var = this.e;
        try {
            zb4Var.c(th, obj, jx1Var);
        } catch (Throwable th2) {
            qx1.y(jx1Var, new fi1("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void n(pz8 pz8Var, Throwable th) {
        jx1 jx1Var = this.e;
        int i = f.get(this) & 536870911;
        if (i == 536870911) {
            gp.j("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            pz8Var.m(i, jx1Var);
        } catch (Throwable th2) {
            qx1.y(jx1Var, new fi1("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o() {
        ax2 ax2VarR = r();
        if (ax2VarR == null) {
            return;
        }
        ax2VarR.a();
        t.getClass();
        kt0.a.putObjectVolatile(this, u, l77.a);
    }

    public final void p(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    gp.j("Already resumed");
                    return;
                }
                boolean z = i == 4;
                jt1 jt1Var = this.d;
                if (!z && (jt1Var instanceof kw2)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.c;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        kw2 kw2Var = (kw2) jt1Var;
                        nx1 nx1Var = kw2Var.d;
                        jx1 context = kw2Var.e.getContext();
                        if (lw2.c(nx1Var, context)) {
                            lw2.b(nx1Var, context, this);
                            return;
                        }
                        zg3 zg3VarA = isa.a();
                        if (zg3VarA.c >= 4294967296L) {
                            zg3VarA.x0(this);
                            return;
                        }
                        zg3VarA.F0(true);
                        try {
                            qu1.s0(this, jt1Var, true);
                            do {
                            } while (zg3VarA.T0());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                qu1.s0(this, jt1Var, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable q(pe5 pe5Var) {
        return pe5Var.getCancellationException();
    }

    public final ax2 r() {
        t.getClass();
        return (ax2) kt0.a.getObjectVolatile(this, u);
    }

    @Override // defpackage.jt1
    public final void resumeWith(Object obj) {
        Throwable thA = qm8.a(obj);
        if (thA != null) {
            obj = new ei1(false, thA);
        }
        D(obj, this.c, null);
    }

    public final Object s() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        yd5 yd5Var;
        boolean zY = y();
        do {
            atomicIntegerFieldUpdater = f;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    gp.j("Already suspended");
                    return null;
                }
                if (zY) {
                    B();
                }
                Object objT = t();
                if (objT instanceof ei1) {
                    throw ((ei1) objT).a;
                }
                int i3 = this.c;
                if ((i3 != 1 && i3 != 2) || (yd5Var = (yd5) this.e.get(s00.s)) == null || yd5Var.isActive()) {
                    return g(objT);
                }
                CancellationException cancellationException = yd5Var.getCancellationException();
                c(cancellationException);
                throw cancellationException;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (r() == null) {
            v();
        }
        if (zY) {
            B();
        }
        return xx1.a;
    }

    public final Object t() {
        s.getClass();
        return kt0.a.getObjectVolatile(this, v);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(md2.u0(this.d));
        sb.append("){");
        Object objT = t();
        sb.append(objT instanceof t77 ? "Active" : objT instanceof dy0 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(md2.c0(this));
        return sb.toString();
    }

    public final void u() {
        ax2 ax2VarV = v();
        if (ax2VarV == null || (t() instanceof t77)) {
            return;
        }
        ax2VarV.a();
        t.getClass();
        kt0.a.putObjectVolatile(this, u, l77.a);
    }

    public final ax2 v() {
        yd5 yd5Var = (yd5) this.e.get(s00.s);
        if (yd5Var == null) {
            return null;
        }
        ax2 ax2VarB = qx1.B(yd5Var, true, new o71(this));
        while (true) {
            t.getClass();
            Unsafe unsafe = kt0.a;
            long j = u;
            ay0 ay0Var = this;
            if (unsafe.compareAndSwapObject(ay0Var, j, (Object) null, ax2VarB) || unsafe.getObjectVolatile(ay0Var, j) != null) {
                break;
            }
            this = ay0Var;
        }
        return ax2VarB;
    }

    public final void w(kb4 kb4Var) {
        x(new ux0(kb4Var, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ce, code lost:
    
        z(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(defpackage.t77 r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay0.x(t77):void");
    }

    public final boolean y() {
        return this.c == 2 && ((kw2) this.d).o();
    }
}

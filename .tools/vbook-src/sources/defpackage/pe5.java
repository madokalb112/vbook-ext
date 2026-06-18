package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class pe5 implements yd5, s71 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(pe5.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = kt0.a;
        d = unsafe.objectFieldOffset(pe5.class.getDeclaredField("_state$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(pe5.class, Object.class, "_parentHandle$volatile");
        c = unsafe.objectFieldOffset(pe5.class.getDeclaredField("_parentHandle$volatile"));
    }

    public pe5(boolean z) {
        this._state$volatile = z ? qe5.g : qe5.f;
    }

    public static q71 U(n36 n36Var) {
        while (n36Var.m()) {
            n36Var = n36Var.l();
        }
        while (true) {
            n36Var = n36Var.k();
            if (!n36Var.m()) {
                if (n36Var instanceof q71) {
                    return (q71) n36Var;
                }
                if (n36Var instanceof e77) {
                    return null;
                }
            }
        }
    }

    public static String f0(Object obj) {
        if (!(obj instanceof ie5)) {
            return obj instanceof t55 ? ((t55) obj).isActive() ? "Active" : "New" : obj instanceof ei1 ? "Cancelled" : "Completed";
        }
        ie5 ie5Var = (ie5) obj;
        return ie5Var.e() ? "Cancelling" : ie5.b.get(ie5Var) == 1 ? "Completing" : "Active";
    }

    public static CancellationException h0(pe5 pe5Var, Throwable th) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new zd5(pe5Var, pe5Var.u(), th) : cancellationException;
    }

    public final Throwable B(ie5 ie5Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (ie5Var.e()) {
                return new zd5(this, u(), null);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof vua) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof vua)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean C() {
        return true;
    }

    public boolean D() {
        return this instanceof bi1;
    }

    public final e77 F(t55 t55Var) {
        e77 e77VarC = t55Var.c();
        if (e77VarC != null) {
            return e77VarC;
        }
        if (t55Var instanceof cc3) {
            return new e77();
        }
        if (t55Var instanceof ee5) {
            Z((ee5) t55Var);
            return null;
        }
        mn5.n(t55Var, "State should have list: ");
        return null;
    }

    public final p71 G() {
        b.getClass();
        return (p71) kt0.a.getObjectVolatile(this, c);
    }

    public final Object H() {
        a.getClass();
        return kt0.a.getObjectVolatile(this, d);
    }

    public boolean I(Throwable th) {
        return false;
    }

    public final void K(yd5 yd5Var) {
        l77 l77Var = l77.a;
        if (yd5Var == null) {
            c0(l77Var);
            return;
        }
        yd5Var.start();
        p71 p71VarAttachChild = yd5Var.attachChild(this);
        c0(p71VarAttachChild);
        if (M()) {
            p71VarAttachChild.a();
            c0(l77Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ax2 L(boolean r7, defpackage.ee5 r8) {
        /*
            r6 = this;
            r8.s = r6
        L2:
            java.lang.Object r4 = r6.H()
            boolean r0 = r4 instanceof defpackage.cc3
            if (r0 == 0) goto L33
            r0 = r4
            cc3 r0 = (defpackage.cc3) r0
            boolean r1 = r0.a
            if (r1 == 0) goto L2d
        L11:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.pe5.a
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.kt0.a
            long r2 = defpackage.pe5.d
            r1 = r6
            r5 = r8
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L23
            goto L74
        L23:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == r4) goto L2a
            goto L75
        L2a:
            r6 = r1
            r8 = r5
            goto L11
        L2d:
            r1 = r6
            r5 = r8
            r1.Y(r0)
            goto L75
        L33:
            r1 = r6
            r5 = r8
            boolean r6 = r4 instanceof defpackage.t55
            l77 r8 = defpackage.l77.a
            r0 = 0
            if (r6 == 0) goto L78
            r6 = r4
            t55 r6 = (defpackage.t55) r6
            e77 r2 = r6.c()
            if (r2 != 0) goto L4b
            ee5 r4 = (defpackage.ee5) r4
            r1.Z(r4)
            goto L75
        L4b:
            boolean r3 = r5.q()
            if (r3 == 0) goto L6d
            boolean r3 = r6 instanceof defpackage.ie5
            if (r3 == 0) goto L58
            ie5 r6 = (defpackage.ie5) r6
            goto L59
        L58:
            r6 = r0
        L59:
            if (r6 == 0) goto L5f
            java.lang.Throwable r0 = r6.d()
        L5f:
            if (r0 != 0) goto L67
            r6 = 5
            boolean r6 = r2.d(r5, r6)
            goto L72
        L67:
            if (r7 == 0) goto L8d
            r5.r(r0)
            return r8
        L6d:
            r6 = 1
            boolean r6 = r2.d(r5, r6)
        L72:
            if (r6 == 0) goto L75
        L74:
            return r5
        L75:
            r6 = r1
            r8 = r5
            goto L2
        L78:
            if (r7 == 0) goto L8d
            java.lang.Object r6 = r1.H()
            boolean r7 = r6 instanceof defpackage.ei1
            if (r7 == 0) goto L85
            ei1 r6 = (defpackage.ei1) r6
            goto L86
        L85:
            r6 = r0
        L86:
            if (r6 == 0) goto L8a
            java.lang.Throwable r0 = r6.a
        L8a:
            r5.r(r0)
        L8d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pe5.L(boolean, ee5):ax2");
    }

    public final boolean M() {
        return !(H() instanceof t55);
    }

    public boolean O() {
        return this instanceof kh0;
    }

    public final boolean Q(Object obj) {
        Object objM0;
        do {
            objM0 = m0(H(), obj);
            if (objM0 == qe5.a) {
                return false;
            }
            if (objM0 == qe5.b) {
                return true;
            }
        } while (objM0 == qe5.c);
        m(objM0);
        return true;
    }

    public final Object S(Object obj) {
        Object objM0;
        do {
            objM0 = m0(H(), obj);
            if (objM0 == qe5.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                ei1 ei1Var = obj instanceof ei1 ? (ei1) obj : null;
                throw new IllegalStateException(str, ei1Var != null ? ei1Var.a : null);
            }
        } while (objM0 == qe5.c);
        return objM0;
    }

    public String T() {
        return getClass().getSimpleName();
    }

    public final void V(e77 e77Var, Throwable th) {
        e77Var.d(new bz5(4), 4);
        Object objJ = e77Var.j();
        objJ.getClass();
        fi1 fi1Var = null;
        for (n36 n36VarK = (n36) objJ; !n36VarK.equals(e77Var); n36VarK = n36VarK.k()) {
            if ((n36VarK instanceof ee5) && ((ee5) n36VarK).q()) {
                try {
                    ((ee5) n36VarK).r(th);
                } catch (Throwable th2) {
                    if (fi1Var != null) {
                        i12.r(fi1Var, th2);
                    } else {
                        fi1Var = new fi1("Exception in completion handler " + n36VarK + " for " + this, th2);
                    }
                }
            }
        }
        if (fi1Var != null) {
            J(fi1Var);
        }
        t(th);
    }

    public final void Y(cc3 cc3Var) {
        e77 e77Var = new e77();
        Object s55Var = cc3Var.a ? e77Var : new s55(e77Var);
        while (true) {
            a.getClass();
            Unsafe unsafe = kt0.a;
            long j = d;
            pe5 pe5Var = this;
            cc3 cc3Var2 = cc3Var;
            if (unsafe.compareAndSwapObject(pe5Var, j, cc3Var2, s55Var) || unsafe.getObjectVolatile(pe5Var, j) != cc3Var2) {
                return;
            }
            this = pe5Var;
            cc3Var = cc3Var2;
        }
    }

    public final void Z(ee5 ee5Var) {
        ee5Var.f(new e77());
        n36 n36VarK = ee5Var.k();
        while (true) {
            a.getClass();
            Unsafe unsafe = kt0.a;
            long j = d;
            pe5 pe5Var = this;
            ee5 ee5Var2 = ee5Var;
            if (unsafe.compareAndSwapObject(pe5Var, j, ee5Var2, n36VarK) || unsafe.getObjectVolatile(pe5Var, j) != ee5Var2) {
                return;
            }
            this = pe5Var;
            ee5Var = ee5Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        return r5;
     */
    @Override // defpackage.yd5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.p71 attachChild(defpackage.s71 r7) {
        /*
            r6 = this;
            q71 r5 = new q71
            r5.<init>(r7)
            r5.s = r6
        L7:
            java.lang.Object r4 = r6.H()
            boolean r7 = r4 instanceof defpackage.cc3
            if (r7 == 0) goto L35
            r7 = r4
            cc3 r7 = (defpackage.cc3) r7
            boolean r0 = r7.a
            if (r0 == 0) goto L30
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.pe5.a
            r7.getClass()
            sun.misc.Unsafe r0 = defpackage.kt0.a
            long r2 = defpackage.pe5.d
            r1 = r6
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L27
            goto L7a
        L27:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == r4) goto L2e
            goto L4b
        L2e:
            r6 = r1
            goto L16
        L30:
            r1 = r6
            r1.Y(r7)
            goto L4b
        L35:
            r1 = r6
            boolean r6 = r4 instanceof defpackage.t55
            l77 r7 = defpackage.l77.a
            r0 = 0
            if (r6 == 0) goto L7c
            r6 = r4
            t55 r6 = (defpackage.t55) r6
            e77 r6 = r6.c()
            if (r6 != 0) goto L4d
            ee5 r4 = (defpackage.ee5) r4
            r1.Z(r4)
        L4b:
            r6 = r1
            goto L7
        L4d:
            r2 = 7
            boolean r2 = r6.d(r5, r2)
            if (r2 == 0) goto L55
            goto L7a
        L55:
            r2 = 3
            boolean r6 = r6.d(r5, r2)
            java.lang.Object r1 = r1.H()
            boolean r2 = r1 instanceof defpackage.ie5
            if (r2 == 0) goto L69
            ie5 r1 = (defpackage.ie5) r1
            java.lang.Throwable r0 = r1.d()
            goto L75
        L69:
            boolean r2 = r1 instanceof defpackage.ei1
            if (r2 == 0) goto L70
            ei1 r1 = (defpackage.ei1) r1
            goto L71
        L70:
            r1 = r0
        L71:
            if (r1 == 0) goto L75
            java.lang.Throwable r0 = r1.a
        L75:
            r5.r(r0)
            if (r6 == 0) goto L7b
        L7a:
            return r5
        L7b:
            return r7
        L7c:
            java.lang.Object r6 = r1.H()
            boolean r1 = r6 instanceof defpackage.ei1
            if (r1 == 0) goto L87
            ei1 r6 = (defpackage.ei1) r6
            goto L88
        L87:
            r6 = r0
        L88:
            if (r6 == 0) goto L8c
            java.lang.Throwable r0 = r6.a
        L8c:
            r5.r(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pe5.attachChild(s71):p71");
    }

    public Object await(jt1 jt1Var) {
        return o(jt1Var);
    }

    public final void b0(ee5 ee5Var) {
        pe5 pe5Var;
        while (true) {
            Object objH = this.H();
            if (!(objH instanceof ee5)) {
                if (!(objH instanceof t55) || ((t55) objH).c() == null) {
                    return;
                }
                ee5Var.n();
                return;
            }
            if (objH != ee5Var) {
                return;
            }
            while (true) {
                a.getClass();
                Unsafe unsafe = kt0.a;
                long j = d;
                pe5Var = this;
                if (unsafe.compareAndSwapObject(pe5Var, j, objH, qe5.g)) {
                    return;
                }
                if (unsafe.getObjectVolatile(pe5Var, j) != objH) {
                    break;
                } else {
                    this = pe5Var;
                }
            }
            this = pe5Var;
        }
    }

    public final void c0(p71 p71Var) {
        b.getClass();
        kt0.a.putObjectVolatile(this, c, p71Var);
    }

    @Override // defpackage.yd5
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new zd5(this, u(), null);
        }
        s(cancellationException);
    }

    public final int d0(Object obj) {
        Unsafe unsafe;
        boolean z = obj instanceof cc3;
        long j = d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (!z) {
            pe5 pe5Var = this;
            Object obj2 = obj;
            if (!(obj2 instanceof s55)) {
                return 0;
            }
            e77 e77Var = ((s55) obj2).a;
            do {
                atomicReferenceFieldUpdater.getClass();
                pe5 pe5Var2 = pe5Var;
                unsafe = kt0.a;
                Object obj3 = obj2;
                boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(pe5Var2, d, obj3, e77Var);
                pe5Var = pe5Var2;
                obj2 = obj3;
                if (zCompareAndSwapObject) {
                    pe5Var.X();
                    return 1;
                }
            } while (unsafe.getObjectVolatile(pe5Var, j) == obj2);
            return -1;
        }
        if (((cc3) obj).a) {
            return 0;
        }
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe2 = kt0.a;
            pe5 pe5Var3 = this;
            Object obj4 = obj;
            if (unsafe2.compareAndSwapObject(pe5Var3, d, obj4, qe5.g)) {
                pe5Var3.X();
                return 1;
            }
            if (unsafe2.getObjectVolatile(pe5Var3, j) != obj4) {
                return -1;
            }
            this = pe5Var3;
            obj = obj4;
        }
    }

    @Override // defpackage.jx1
    public final Object fold(Object obj, yb4 yb4Var) {
        return yb4Var.invoke(obj, this);
    }

    @Override // defpackage.jx1
    public final hx1 get(ix1 ix1Var) {
        return gx1.G(this, ix1Var);
    }

    @Override // defpackage.yd5
    public final CancellationException getCancellationException() {
        Object objH = H();
        if (!(objH instanceof ie5)) {
            if (!(objH instanceof t55)) {
                return objH instanceof ei1 ? h0(this, ((ei1) objH).a) : new zd5(this, getClass().getSimpleName().concat(" has completed normally"), null);
            }
            mn5.n(this, "Job is still new or active: ");
            return null;
        }
        Throwable thD = ((ie5) objH).d();
        if (thD == null) {
            mn5.n(this, "Job is still new or active: ");
            return null;
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = thD instanceof CancellationException ? (CancellationException) thD : null;
        return cancellationException == null ? new zd5(this, strConcat, thD) : cancellationException;
    }

    @Override // defpackage.yd5
    public final a39 getChildren() {
        return new jc1(new le5(this, null, 0), 1);
    }

    public Object getCompleted() {
        return z();
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object objH = H();
        if (objH instanceof t55) {
            gp.j("This job has not completed yet");
            return null;
        }
        ei1 ei1Var = objH instanceof ei1 ? (ei1) objH : null;
        if (ei1Var != null) {
            return ei1Var.a;
        }
        return null;
    }

    @Override // defpackage.hx1
    public final ix1 getKey() {
        return s00.s;
    }

    @Override // defpackage.yd5
    public final ax2 invokeOnCompletion(boolean z, boolean z2, kb4 kb4Var) {
        return L(z2, z ? new cd5(kb4Var) : new dd5(kb4Var));
    }

    @Override // defpackage.yd5
    public boolean isActive() {
        Object objH = H();
        return (objH instanceof t55) && ((t55) objH).isActive();
    }

    @Override // defpackage.yd5
    public final boolean isCancelled() {
        Object objH = H();
        if (objH instanceof ei1) {
            return true;
        }
        return (objH instanceof ie5) && ((ie5) objH).e();
    }

    @Override // defpackage.yd5
    public final Object join(jt1 jt1Var) {
        Object objH;
        heb hebVar;
        do {
            objH = H();
            boolean z = objH instanceof t55;
            hebVar = heb.a;
            if (!z) {
                qx1.s(jt1Var.getContext());
                return hebVar;
            }
        } while (d0(objH) < 0);
        ay0 ay0Var = new ay0(1, bx1.J(jt1Var));
        ay0Var.u();
        ay0Var.x(new ux0(qx1.B(this, true, new ym8(ay0Var)), 2));
        Object objS = ay0Var.s();
        xx1 xx1Var = xx1.a;
        if (objS != xx1Var) {
            objS = hebVar;
        }
        return objS == xx1Var ? objS : hebVar;
    }

    public final boolean k0(t55 t55Var, Object obj) {
        Object x55Var = obj instanceof t55 ? new x55((t55) obj) : obj;
        while (true) {
            a.getClass();
            Unsafe unsafe = kt0.a;
            long j = d;
            pe5 pe5Var = this;
            t55 t55Var2 = t55Var;
            if (unsafe.compareAndSwapObject(pe5Var, j, t55Var2, x55Var)) {
                pe5Var.W(obj);
                pe5Var.w(t55Var2, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(pe5Var, j) != t55Var2) {
                return false;
            }
            this = pe5Var;
            t55Var = t55Var2;
        }
    }

    public final boolean l0(t55 t55Var, Throwable th) {
        e77 e77VarF = F(t55Var);
        if (e77VarF == null) {
            return false;
        }
        ie5 ie5Var = new ie5(e77VarF, th);
        while (true) {
            a.getClass();
            Unsafe unsafe = kt0.a;
            long j = d;
            pe5 pe5Var = this;
            t55 t55Var2 = t55Var;
            if (unsafe.compareAndSwapObject(pe5Var, j, t55Var2, ie5Var)) {
                pe5Var.V(e77VarF, th);
                return true;
            }
            if (unsafe.getObjectVolatile(pe5Var, j) != t55Var2) {
                return false;
            }
            this = pe5Var;
            t55Var = t55Var2;
        }
    }

    public final Object m0(Object obj, Object obj2) {
        if (!(obj instanceof t55)) {
            return qe5.a;
        }
        if (((obj instanceof cc3) || (obj instanceof ee5)) && !(obj instanceof q71) && !(obj2 instanceof ei1)) {
            return k0((t55) obj, obj2) ? obj2 : qe5.c;
        }
        t55 t55Var = (t55) obj;
        e77 e77VarF = F(t55Var);
        if (e77VarF == null) {
            return qe5.c;
        }
        ie5 ie5Var = t55Var instanceof ie5 ? (ie5) t55Var : null;
        if (ie5Var == null) {
            ie5Var = new ie5(e77VarF, null);
        }
        synchronized (ie5Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ie5.b;
            if (atomicIntegerFieldUpdater.get(ie5Var) == 1) {
                return qe5.a;
            }
            atomicIntegerFieldUpdater.set(ie5Var, 1);
            if (ie5Var != t55Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, t55Var, ie5Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != t55Var) {
                        return qe5.c;
                    }
                }
            }
            boolean zE = ie5Var.e();
            ei1 ei1Var = obj2 instanceof ei1 ? (ei1) obj2 : null;
            if (ei1Var != null) {
                ie5Var.a(ei1Var.a);
            }
            Throwable thD = zE ? null : ie5Var.d();
            if (thD != null) {
                V(e77VarF, thD);
            }
            q71 q71VarU = U(e77VarF);
            if (q71VarU != null && n0(ie5Var, q71VarU, obj2)) {
                return qe5.b;
            }
            e77VarF.d(new bz5(2), 2);
            q71 q71VarU2 = U(e77VarF);
            return (q71VarU2 == null || !n0(ie5Var, q71VarU2, obj2)) ? y(ie5Var, obj2) : qe5.b;
        }
    }

    @Override // defpackage.jx1
    public final jx1 minusKey(ix1 ix1Var) {
        return gx1.Q(this, ix1Var);
    }

    public void n(Object obj) {
        m(obj);
    }

    public final boolean n0(ie5 ie5Var, q71 q71Var, Object obj) {
        while (qx1.B(q71Var.t, false, new he5(this, ie5Var, q71Var, obj)) == l77.a) {
            q71Var = U(q71Var);
            if (q71Var == null) {
                return false;
            }
        }
        return true;
    }

    public final Object o(jt1 jt1Var) throws Throwable {
        Object objH;
        do {
            objH = H();
            if (!(objH instanceof t55)) {
                if (objH instanceof ei1) {
                    throw ((ei1) objH).a;
                }
                return qe5.a(objH);
            }
        } while (d0(objH) < 0);
        ge5 ge5Var = new ge5(bx1.J(jt1Var), this);
        ge5Var.u();
        ge5Var.x(new ux0(qx1.B(this, true, new xm8(ge5Var)), 2));
        return ge5Var.s();
    }

    @Override // defpackage.jx1
    public final jx1 plus(jx1 jx1Var) {
        return gx1.T(this, jx1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[PHI: r0
  0x003c: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v9 java.lang.Object) binds: [B:3:0x0008, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pe5.r(java.lang.Object):boolean");
    }

    public void s(CancellationException cancellationException) {
        r(cancellationException);
    }

    @Override // defpackage.yd5
    public final boolean start() {
        int iD0;
        do {
            iD0 = d0(H());
            if (iD0 == 0) {
                return false;
            }
        } while (iD0 != 1);
        return true;
    }

    public final boolean t(Throwable th) {
        if (O()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        p71 p71VarG = G();
        return (p71VarG == null || p71VarG == l77.a) ? z : p71VarG.b(th) || z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(T() + '{' + f0(H()) + '}');
        sb.append('@');
        sb.append(md2.c0(this));
        return sb.toString();
    }

    public String u() {
        return "Job was cancelled";
    }

    public boolean v(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return r(th) && C();
    }

    public final void w(t55 t55Var, Object obj) {
        p71 p71VarG = G();
        if (p71VarG != null) {
            p71VarG.a();
            c0(l77.a);
        }
        fi1 fi1Var = null;
        ei1 ei1Var = obj instanceof ei1 ? (ei1) obj : null;
        Throwable th = ei1Var != null ? ei1Var.a : null;
        if (t55Var instanceof ee5) {
            try {
                ((ee5) t55Var).r(th);
                return;
            } catch (Throwable th2) {
                J(new fi1("Exception in completion handler " + t55Var + " for " + this, th2));
                return;
            }
        }
        e77 e77VarC = t55Var.c();
        if (e77VarC != null) {
            e77VarC.d(new bz5(1), 1);
            Object objJ = e77VarC.j();
            objJ.getClass();
            for (n36 n36VarK = (n36) objJ; !n36VarK.equals(e77VarC); n36VarK = n36VarK.k()) {
                if (n36VarK instanceof ee5) {
                    try {
                        ((ee5) n36VarK).r(th);
                    } catch (Throwable th3) {
                        if (fi1Var != null) {
                            i12.r(fi1Var, th3);
                        } else {
                            fi1Var = new fi1("Exception in completion handler " + n36VarK + " for " + this, th3);
                        }
                    }
                }
            }
            if (fi1Var != null) {
                J(fi1Var);
            }
        }
    }

    public final Throwable x(Object obj) {
        Throwable thD;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        pe5 pe5Var = (pe5) obj;
        Object objH = pe5Var.H();
        if (objH instanceof ie5) {
            thD = ((ie5) objH).d();
        } else if (objH instanceof ei1) {
            thD = ((ei1) objH).a;
        } else {
            if (objH instanceof t55) {
                mn5.n(objH, "Cannot be cancelling child in this state: ");
                return null;
            }
            thD = null;
        }
        CancellationException cancellationException = thD instanceof CancellationException ? (CancellationException) thD : null;
        return cancellationException == null ? new zd5(pe5Var, "Parent job is ".concat(f0(objH)), thD) : cancellationException;
    }

    public final Object y(ie5 ie5Var, Object obj) throws Throwable {
        ie5 ie5Var2;
        Throwable th;
        Throwable thB;
        pe5 pe5Var;
        ie5 ie5Var3;
        ei1 ei1Var = obj instanceof ei1 ? (ei1) obj : null;
        Throwable th2 = ei1Var != null ? ei1Var.a : null;
        synchronized (ie5Var) {
            try {
                ie5Var.e();
                ArrayList arrayListF = ie5Var.f(th2);
                thB = B(ie5Var, arrayListF);
                if (thB != null) {
                    try {
                        if (arrayListF.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                            int size = arrayListF.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = arrayListF.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != thB && th3 != thB && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    i12.r(thB, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        ie5Var2 = ie5Var;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                ie5Var2 = ie5Var;
                th = th5;
            }
        }
        if (thB != null && thB != th2) {
            obj = new ei1(false, thB);
        }
        if (thB != null && (t(thB) || I(thB))) {
            obj.getClass();
            ei1.b.compareAndSet((ei1) obj, 0, 1);
        }
        W(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object x55Var = obj instanceof t55 ? new x55((t55) obj) : obj;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = kt0.a;
            long j = d;
            pe5Var = this;
            ie5Var3 = ie5Var;
            if (unsafe.compareAndSwapObject(pe5Var, j, ie5Var3, x55Var) || unsafe.getObjectVolatile(pe5Var, j) != ie5Var3) {
                break;
            }
            this = pe5Var;
            ie5Var = ie5Var3;
        }
        pe5Var.w(ie5Var3, obj);
        return obj;
    }

    public final Object z() throws Throwable {
        Object objH = H();
        if (objH instanceof t55) {
            gp.j("This job has not completed yet");
            return null;
        }
        if (objH instanceof ei1) {
            throw ((ei1) objH).a;
        }
        return qe5.a(objH);
    }

    @Override // defpackage.yd5
    public final ax2 invokeOnCompletion(kb4 kb4Var) {
        return L(true, new dd5(kb4Var));
    }

    public void X() {
    }

    public void J(fi1 fi1Var) {
        throw fi1Var;
    }

    public void W(Object obj) {
    }

    public void m(Object obj) {
    }
}

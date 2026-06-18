package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g09 implements vx0, evb {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(g09.class, Object.class, "state$volatile");
    public static final /* synthetic */ long s = kt0.a.objectFieldOffset(g09.class.getDeclaredField("state$volatile"));
    public final jx1 a;
    public Object c;
    private volatile /* synthetic */ Object state$volatile = h09.a;
    public ArrayList b = new ArrayList(2);
    public int d = -1;
    public Object e = h09.d;

    public g09(jx1 jx1Var) {
        this.a = jx1Var;
    }

    @Override // defpackage.vx0
    public final void a(Throwable th) {
        g09 g09Var;
        while (true) {
            f.getClass();
            Unsafe unsafe = kt0.a;
            long j = s;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == h09.b) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = kt0.a;
                g09Var = this;
                if (unsafe2.compareAndSwapObject(g09Var, s, objectVolatile, h09.c)) {
                    ArrayList arrayList = g09Var.b;
                    if (arrayList == null) {
                        return;
                    }
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((e09) obj).a();
                    }
                    g09Var.e = h09.d;
                    g09Var.b = null;
                    return;
                }
                if (unsafe2.getObjectVolatile(g09Var, j) != objectVolatile) {
                    break;
                } else {
                    this = g09Var;
                }
            }
            this = g09Var;
        }
    }

    @Override // defpackage.evb
    public final void b(pz8 pz8Var, int i) {
        this.c = pz8Var;
        this.d = i;
    }

    public final void c(e09 e09Var) {
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            e09 e09Var2 = (e09) obj;
            if (e09Var2 != e09Var) {
                e09Var2.a();
            }
        }
        f.getClass();
        kt0.a.putObjectVolatile(this, s, h09.b);
        this.e = h09.d;
        this.b = null;
    }

    public final Object d(kt1 kt1Var) {
        f.getClass();
        Object objectVolatile = kt0.a.getObjectVolatile(this, s);
        objectVolatile.getClass();
        e09 e09Var = (e09) objectVolatile;
        Object obj = this.e;
        c(e09Var);
        zb4 zb4Var = e09Var.c;
        Object obj2 = e09Var.a;
        Object obj3 = e09Var.d;
        Object objC = zb4Var.c(obj2, obj3, obj);
        yx1 yx1Var = e09Var.e;
        return obj3 == h09.e ? ((kb4) yx1Var).invoke(kt1Var) : ((yb4) yx1Var).invoke(objC, kt1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.kt1 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.f09
            if (r0 == 0) goto L13
            r0 = r7
            f09 r0 = (defpackage.f09) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            f09 r0 = new f09
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.e11.e0(r7)
            return r7
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r2
        L31:
            g09 r6 = r0.a
            defpackage.e11.e0(r7)
            goto L45
        L37:
            defpackage.e11.e0(r7)
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r6.l(r0)
            if (r7 != r5) goto L45
            goto L4f
        L45:
            r0.a = r2
            r0.d = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r5) goto L50
        L4f:
            return r5
        L50:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g09.e(kt1):java.lang.Object");
    }

    public final e09 f(Object obj) {
        Object obj2;
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i);
            i++;
            if (((e09) obj2).a == obj) {
                break;
            }
        }
        e09 e09Var = (e09) obj2;
        if (e09Var != null) {
            return e09Var;
        }
        w58.i(obj, " is not found", "Clause with object ");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(d09 d09Var, yb4 yb4Var) {
        Object obj = ((s16) d09Var).b;
        s16 s16Var = (s16) d09Var;
        i(new e09(this, obj, (zb4) s16Var.c, (zb4) s16Var.d, null, (o1a) yb4Var, (zb4) s16Var.e), false);
    }

    public final boolean h() {
        f.getClass();
        return kt0.a.getObjectVolatile(this, s) instanceof e09;
    }

    public final void i(e09 e09Var, boolean z) {
        Object obj = e09Var.a;
        f.getClass();
        Unsafe unsafe = kt0.a;
        long j = s;
        if (unsafe.getObjectVolatile(this, j) instanceof e09) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.b;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (((e09) obj2).a == obj) {
                        k27.g(ky0.p(obj, "Cannot use select clauses on the same object: "));
                        return;
                    }
                }
            }
        }
        e09Var.b.c(obj, this, e09Var.d);
        if (this.e != h09.d) {
            kt0.a.putObjectVolatile(this, j, e09Var);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.b;
            arrayList2.getClass();
            arrayList2.add(e09Var);
        }
        e09Var.g = this.c;
        e09Var.h = this.d;
        this.c = null;
        this.d = -1;
    }

    public final boolean j(Object obj, Object obj2) {
        return k(obj, obj2) == 0;
    }

    public final int k(Object obj, Object obj2) {
        g09 g09Var;
        Unsafe unsafe;
        Unsafe unsafe2;
        while (true) {
            f.getClass();
            Unsafe unsafe3 = kt0.a;
            long j = s;
            Object objectVolatile = unsafe3.getObjectVolatile(this, j);
            if (objectVolatile instanceof zx0) {
                e09 e09VarF = this.f(obj);
                if (e09VarF != null) {
                    zb4 zb4Var = e09VarF.f;
                    zb4 zb4Var2 = zb4Var != null ? (zb4) zb4Var.c(this, e09VarF.d, obj2) : null;
                    while (true) {
                        Unsafe unsafe4 = kt0.a;
                        g09Var = this;
                        if (unsafe4.compareAndSwapObject(g09Var, s, objectVolatile, e09VarF)) {
                            zx0 zx0Var = (zx0) objectVolatile;
                            g09Var.e = obj2;
                            zy2 zy2VarD = zx0Var.d(heb.a, zb4Var2);
                            if (zy2VarD == null) {
                                g09Var.e = h09.d;
                                return 2;
                            }
                            zx0Var.l(zy2VarD);
                            return 0;
                        }
                        if (unsafe4.getObjectVolatile(g09Var, j) != objectVolatile) {
                            break;
                        }
                        this = g09Var;
                    }
                } else {
                    continue;
                }
            } else {
                g09Var = this;
                if (lc5.Q(objectVolatile, h09.b) || (objectVolatile instanceof e09)) {
                    return 3;
                }
                if (lc5.Q(objectVolatile, h09.c)) {
                    return 2;
                }
                if (lc5.Q(objectVolatile, h09.a)) {
                    List listY = gc1.Y(obj);
                    do {
                        unsafe2 = kt0.a;
                        if (unsafe2.compareAndSwapObject(g09Var, s, objectVolatile, listY)) {
                            return 1;
                        }
                    } while (unsafe2.getObjectVolatile(g09Var, j) == objectVolatile);
                } else {
                    if (!(objectVolatile instanceof List)) {
                        mn5.n(objectVolatile, "Unexpected state: ");
                        return 0;
                    }
                    ArrayList arrayListJ0 = fc1.J0((Collection) objectVolatile, obj);
                    do {
                        unsafe = kt0.a;
                        if (unsafe.compareAndSwapObject(g09Var, s, objectVolatile, arrayListJ0)) {
                            return 1;
                        }
                    } while (unsafe.getObjectVolatile(g09Var, j) == objectVolatile);
                }
            }
            this = g09Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        r0 = r10.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (r0 != defpackage.xx1.a) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.f09 r13) {
        /*
            r12 = this;
            ay0 r5 = new ay0
            jt1 r0 = bx1.J(r13)
            r6 = 1
            r5.<init>(r6, r0)
            r5.u()
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.g09.f
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.kt0.a
            long r7 = defpackage.g09.s
            java.lang.Object r4 = r0.getObjectVolatile(r12, r7)
            heb r9 = defpackage.heb.a
            r0 = r5
            zy2 r5 = defpackage.h09.a
            if (r4 != r5) goto L3b
            r5 = r0
        L22:
            sun.misc.Unsafe r0 = defpackage.kt0.a
            long r2 = defpackage.g09.s
            r1 = r12
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            r10 = r5
            if (r2 == 0) goto L32
            r10.x(r12)
            goto L8c
        L32:
            java.lang.Object r0 = r0.getObjectVolatile(r12, r7)
            if (r0 == r4) goto L39
            goto L72
        L39:
            r5 = r10
            goto L22
        L3b:
            r10 = r0
            boolean r0 = r4 instanceof java.util.List
            r11 = 0
            if (r0 == 0) goto L74
        L41:
            sun.misc.Unsafe r0 = defpackage.kt0.a
            long r2 = defpackage.g09.s
            r1 = r12
            boolean r2 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r2 == 0) goto L6c
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r0 = r4.iterator()
        L52:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r0.next()
            e09 r2 = r12.f(r2)
            r2.getClass()
            r2.g = r11
            r3 = -1
            r2.h = r3
            r12.i(r2, r6)
            goto L52
        L6c:
            java.lang.Object r0 = r0.getObjectVolatile(r12, r7)
            if (r0 == r4) goto L41
        L72:
            r5 = r10
            goto Ld
        L74:
            boolean r0 = r4 instanceof defpackage.e09
            if (r0 == 0) goto L96
            e09 r4 = (defpackage.e09) r4
            java.lang.Object r0 = r12.e
            zb4 r2 = r4.f
            if (r2 == 0) goto L89
            java.lang.Object r3 = r4.d
            java.lang.Object r0 = r2.c(r12, r3, r0)
            r11 = r0
            zb4 r11 = (defpackage.zb4) r11
        L89:
            r10.i(r9, r11)
        L8c:
            java.lang.Object r0 = r10.s()
            xx1 r1 = defpackage.xx1.a
            if (r0 != r1) goto L95
            return r0
        L95:
            return r9
        L96:
            java.lang.String r0 = "unexpected state: "
            defpackage.mn5.n(r4, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g09.l(f09):java.lang.Object");
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class nn1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(nn1.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    static {
        Unsafe unsafe = kt0.a;
        c = unsafe.objectFieldOffset(nn1.class.getDeclaredField("_next$volatile"));
        b = AtomicReferenceFieldUpdater.newUpdater(nn1.class, Object.class, "_prev$volatile");
        d = unsafe.objectFieldOffset(nn1.class.getDeclaredField("_prev$volatile"));
    }

    public nn1(pz8 pz8Var) {
        this._prev$volatile = pz8Var;
    }

    public final void b() {
        b.getClass();
        kt0.a.putObjectVolatile(this, d, (Object) null);
    }

    public final nn1 c() {
        nn1 nn1VarF = f();
        while (nn1VarF != null && nn1VarF.g()) {
            b.getClass();
            nn1VarF = (nn1) kt0.a.getObjectVolatile(nn1VarF, d);
        }
        return nn1VarF;
    }

    public final nn1 d() {
        Object objE = e();
        if (objE == mn1.a) {
            return null;
        }
        return (nn1) objE;
    }

    public final Object e() {
        a.getClass();
        return kt0.a.getObjectVolatile(this, c);
    }

    public final nn1 f() {
        b.getClass();
        return (nn1) kt0.a.getObjectVolatile(this, d);
    }

    public abstract boolean g();

    public final boolean h() {
        while (true) {
            a.getClass();
            Unsafe unsafe = kt0.a;
            long j = c;
            nn1 nn1Var = this;
            if (unsafe.compareAndSwapObject(nn1Var, j, (Object) null, mn1.a)) {
                return true;
            }
            if (unsafe.getObjectVolatile(nn1Var, j) != null) {
                return false;
            }
            this = nn1Var;
        }
    }

    public final void i() {
        nn1 nn1Var;
        Unsafe unsafe;
        if (d() == null) {
            return;
        }
        while (true) {
            nn1 nn1VarC = c();
            nn1 nn1VarD = d();
            nn1VarD.getClass();
            do {
                nn1Var = nn1VarD;
                if (!nn1Var.g()) {
                    break;
                } else {
                    nn1VarD = nn1Var.d();
                }
            } while (nn1VarD != null);
            while (true) {
                b.getClass();
                Unsafe unsafe2 = kt0.a;
                long j = d;
                Object objectVolatile = unsafe2.getObjectVolatile(nn1Var, j);
                nn1 nn1Var2 = ((nn1) objectVolatile) == null ? null : nn1VarC;
                do {
                    unsafe = kt0.a;
                    if (unsafe.compareAndSwapObject(nn1Var, d, objectVolatile, nn1Var2)) {
                        break;
                    }
                } while (unsafe.getObjectVolatile(nn1Var, j) == objectVolatile);
            }
            if (nn1VarC != null) {
                a.getClass();
                unsafe.putObjectVolatile(nn1VarC, c, nn1Var);
            }
            if (!nn1Var.g() || nn1Var.d() == null) {
                if (nn1VarC == null || !nn1VarC.g()) {
                    return;
                }
            }
        }
    }

    public final boolean j(pz8 pz8Var) {
        while (true) {
            a.getClass();
            Unsafe unsafe = kt0.a;
            long j = c;
            nn1 nn1Var = this;
            pz8 pz8Var2 = pz8Var;
            if (unsafe.compareAndSwapObject(nn1Var, j, (Object) null, pz8Var2)) {
                return true;
            }
            if (unsafe.getObjectVolatile(nn1Var, j) != null) {
                return false;
            }
            this = nn1Var;
            pz8Var = pz8Var2;
        }
    }
}

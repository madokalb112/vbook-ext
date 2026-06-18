package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class o36 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(o36.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long b = kt0.a.objectFieldOffset(o36.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new q36(8, false);

    public final boolean a(Runnable runnable) {
        o36 o36Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = kt0.a;
            long j = b;
            q36 q36Var = (q36) unsafe.getObjectVolatile(this, j);
            int iA = q36Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                q36 q36VarD = q36Var.d();
                while (true) {
                    Unsafe unsafe2 = kt0.a;
                    o36Var = this;
                    if (!unsafe2.compareAndSwapObject(o36Var, b, q36Var, q36VarD) && unsafe2.getObjectVolatile(o36Var, j) == q36Var) {
                        this = o36Var;
                    }
                }
            } else {
                if (iA == 2) {
                    return false;
                }
                o36Var = this;
            }
            this = o36Var;
        }
    }

    public final void b() {
        o36 o36Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = kt0.a;
            long j = b;
            q36 q36Var = (q36) unsafe.getObjectVolatile(this, j);
            if (q36Var.c()) {
                return;
            }
            q36 q36VarD = q36Var.d();
            while (true) {
                Unsafe unsafe2 = kt0.a;
                o36Var = this;
                if (!unsafe2.compareAndSwapObject(o36Var, b, q36Var, q36VarD) && unsafe2.getObjectVolatile(o36Var, j) == q36Var) {
                    this = o36Var;
                }
            }
            this = o36Var;
        }
    }

    public final int c() {
        a.getClass();
        q36 q36Var = (q36) kt0.a.getObjectVolatile(this, b);
        q36Var.getClass();
        long j = q36.f.get(q36Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        o36 o36Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = kt0.a;
            long j = b;
            q36 q36Var = (q36) unsafe.getObjectVolatile(this, j);
            Object objE = q36Var.e();
            if (objE != q36.g) {
                return objE;
            }
            q36 q36VarD = q36Var.d();
            while (true) {
                Unsafe unsafe2 = kt0.a;
                o36Var = this;
                if (!unsafe2.compareAndSwapObject(o36Var, b, q36Var, q36VarD) && unsafe2.getObjectVolatile(o36Var, j) == q36Var) {
                    this = o36Var;
                }
            }
            this = o36Var;
        }
    }
}

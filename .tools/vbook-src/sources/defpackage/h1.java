package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import org.mozilla.javascript.ES6Iterator;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h1 extends t0 {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new g1());
            }
            try {
                c = unsafe.objectFieldOffset(j1.class.getDeclaredField("waiters"));
                b = unsafe.objectFieldOffset(j1.class.getDeclaredField("listeners"));
                d = unsafe.objectFieldOffset(j1.class.getDeclaredField(ES6Iterator.VALUE_PROPERTY));
                e = unsafe.objectFieldOffset(i1.class.getDeclaredField("a"));
                f = unsafe.objectFieldOffset(i1.class.getDeclaredField("b"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                sy3.o(e2);
            }
        } catch (PrivilegedActionException e3) {
            w58.l("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override // defpackage.t0
    public final boolean a(j1 j1Var, x0 x0Var, x0 x0Var2) {
        return e1.a(a, j1Var, b, x0Var, x0Var2);
    }

    @Override // defpackage.t0
    public final boolean b(j1 j1Var, Object obj, Object obj2) {
        return f1.a(a, j1Var, d, obj, obj2);
    }

    @Override // defpackage.t0
    public final boolean c(j1 j1Var, i1 i1Var, i1 i1Var2) {
        return d1.a(a, j1Var, c, i1Var, i1Var2);
    }

    @Override // defpackage.t0
    public final x0 d(j1 j1Var) {
        x0 x0Var;
        x0 x0Var2;
        do {
            x0Var = j1Var.listeners;
            x0Var2 = x0.d;
            if (x0Var2 == x0Var) {
                break;
            }
        } while (!a(j1Var, x0Var, x0Var2));
        return x0Var;
    }

    @Override // defpackage.t0
    public final i1 e(j1 j1Var) {
        i1 i1Var;
        i1 i1Var2;
        do {
            i1Var = j1Var.waiters;
            i1Var2 = i1.c;
            if (i1Var2 == i1Var) {
                break;
            }
        } while (!c(j1Var, i1Var, i1Var2));
        return i1Var;
    }

    @Override // defpackage.t0
    public final void f(i1 i1Var, i1 i1Var2) {
        a.putObject(i1Var, f, i1Var2);
    }

    @Override // defpackage.t0
    public final void g(i1 i1Var, Thread thread) {
        a.putObject(i1Var, e, thread);
    }
}

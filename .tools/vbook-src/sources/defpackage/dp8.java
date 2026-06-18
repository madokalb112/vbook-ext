package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class dp8 {
    public iw0 a;
    public Executor b;
    public q39 c;
    public zo8 d;
    public bd5 e;
    public final c85 f;
    public boolean g;
    public final ThreadLocal h;
    public final LinkedHashMap i;
    public boolean j;

    public dp8() {
        new m98(0, this, dp8.class, "onClosed", "onClosed()V", 0, 16);
        c85 c85Var = new c85();
        c85Var.a = new AtomicInteger(0);
        c85Var.b = new AtomicBoolean(false);
        this.f = c85Var;
        this.h = new ThreadLocal();
        this.i = new LinkedHashMap();
        this.j = true;
    }

    public final void a() {
        if (this.g) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            gp.j("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        a();
        a();
        va4 va4VarF0 = g().f0();
        if (!va4VarF0.R()) {
            lx1.v0(new l64(f(), (jt1) null, 9));
        }
        if (va4VarF0.a.isWriteAheadLoggingEnabled()) {
            va4VarF0.q();
        } else {
            va4VarF0.p();
        }
    }

    public List c(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(y86.O(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(tu1.M((a91) entry.getKey()), entry.getValue());
        }
        return lc3.a;
    }

    public abstract bd5 d();

    public y93 e() {
        throw new u77(0);
    }

    public final bd5 f() {
        bd5 bd5Var = this.e;
        if (bd5Var != null) {
            return bd5Var;
        }
        lc5.i0("internalTracker");
        throw null;
    }

    public final y0a g() {
        zo8 zo8Var = this.d;
        if (zo8Var == null) {
            lc5.i0("connectionManager");
            throw null;
        }
        y0a y0aVarC = zo8Var.c();
        if (y0aVarC != null) {
            return y0aVarC;
        }
        gp.j("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public Set h() {
        return fc1.e1(new ArrayList(gc1.M(sc3.a, 10)));
    }

    public LinkedHashMap i() {
        int iO = y86.O(gc1.M(sc3.a, 10));
        if (iO < 16) {
            iO = 16;
        }
        return new LinkedHashMap(iO);
    }

    public final boolean j() {
        zo8 zo8Var = this.d;
        if (zo8Var != null) {
            return zo8Var.c() != null;
        }
        lc5.i0("connectionManager");
        throw null;
    }

    public final boolean k() {
        return m() && g().f0().R();
    }

    public final void l() {
        g().f0().E();
        if (k()) {
            return;
        }
        bd5 bd5VarF = f();
        bd5VarF.b.g(bd5VarF.e, bd5VarF.f);
    }

    public final boolean m() {
        zo8 zo8Var = this.d;
        if (zo8Var == null) {
            lc5.i0("connectionManager");
            throw null;
        }
        va4 va4Var = zo8Var.g;
        if (va4Var != null) {
            return va4Var.a.isOpen();
        }
        return false;
    }

    public final Object n(Callable callable) {
        b();
        try {
            Object objCall = callable.call();
            p();
            return objCall;
        } finally {
            l();
        }
    }

    public final void o(Runnable runnable) {
        b();
        try {
            runnable.run();
            p();
        } finally {
            l();
        }
    }

    public final void p() {
        g().f0().e0();
    }

    public final Object q(boolean z, yb4 yb4Var, kt1 kt1Var) {
        zo8 zo8Var = this.d;
        if (zo8Var != null) {
            return zo8Var.f.L(z, yb4Var, kt1Var);
        }
        lc5.i0("connectionManager");
        throw null;
    }
}

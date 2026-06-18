package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a1 extends t0 {
    @Override // defpackage.t0
    public final boolean a(j1 j1Var, x0 x0Var, x0 x0Var2) {
        synchronized (j1Var) {
            try {
                if (j1Var.listeners != x0Var) {
                    return false;
                }
                j1Var.listeners = x0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.t0
    public final boolean b(j1 j1Var, Object obj, Object obj2) {
        synchronized (j1Var) {
            try {
                if (j1Var.value != obj) {
                    return false;
                }
                j1Var.value = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.t0
    public final boolean c(j1 j1Var, i1 i1Var, i1 i1Var2) {
        synchronized (j1Var) {
            try {
                if (j1Var.waiters != i1Var) {
                    return false;
                }
                j1Var.waiters = i1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.t0
    public final x0 d(j1 j1Var) {
        x0 x0Var;
        x0 x0Var2 = x0.d;
        synchronized (j1Var) {
            try {
                x0Var = j1Var.listeners;
                if (x0Var != x0Var2) {
                    j1Var.listeners = x0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return x0Var;
    }

    @Override // defpackage.t0
    public final i1 e(j1 j1Var) {
        i1 i1Var;
        i1 i1Var2 = i1.c;
        synchronized (j1Var) {
            try {
                i1Var = j1Var.waiters;
                if (i1Var != i1Var2) {
                    j1Var.waiters = i1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i1Var;
    }

    @Override // defpackage.t0
    public final void f(i1 i1Var, i1 i1Var2) {
        i1Var.b = i1Var2;
    }

    @Override // defpackage.t0
    public final void g(i1 i1Var, Thread thread) {
        i1Var.a = thread;
    }
}

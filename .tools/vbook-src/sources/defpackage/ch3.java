package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ch3 implements Runnable, Comparable, ax2 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public ch3(long j) {
        this.a = j;
    }

    @Override // defpackage.ax2
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                zy2 zy2Var = fh3.a;
                if (obj == zy2Var) {
                    return;
                }
                dh3 dh3Var = obj instanceof dh3 ? (dh3) obj : null;
                if (dh3Var != null) {
                    synchronized (dh3Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof lsa ? (lsa) obj2 : null) != null) {
                            dh3Var.b(this.b);
                        }
                    }
                }
                this._heap = zy2Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int c(long j, dh3 dh3Var, eh3 eh3Var) {
        synchronized (this) {
            if (this._heap == fh3.a) {
                return 2;
            }
            synchronized (dh3Var) {
                try {
                    ch3[] ch3VarArr = dh3Var.a;
                    ch3 ch3Var = ch3VarArr != null ? ch3VarArr[0] : null;
                    if (eh3.u.get(eh3Var) == 1) {
                        return 1;
                    }
                    if (ch3Var == null) {
                        dh3Var.c = j;
                    } else {
                        long j2 = ch3Var.a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - dh3Var.c > 0) {
                            dh3Var.c = j;
                        }
                    }
                    long j3 = this.a;
                    long j4 = dh3Var.c;
                    if (j3 - j4 < 0) {
                        this.a = j4;
                    }
                    dh3Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a - ((ch3) obj).a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(dh3 dh3Var) {
        if (this._heap != fh3.a) {
            this._heap = dh3Var;
        } else {
            gp.l("Failed requirement.");
        }
    }

    public String toString() {
        return dx1.j(new StringBuilder("Delayed[nanos="), this.a, ']');
    }
}

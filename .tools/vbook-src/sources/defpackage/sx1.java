package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sx1 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater u = AtomicIntegerFieldUpdater.newUpdater(sx1.class, "workerCtl$volatile");
    public final z1c a;
    public final rg8 b;
    public tx1 c;
    public long d;
    public long e;
    public int f;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    public boolean s;
    public final /* synthetic */ ux1 t;
    private volatile /* synthetic */ int workerCtl$volatile;

    public sx1(ux1 ux1Var, int i) {
        this.t = ux1Var;
        setDaemon(true);
        setContextClassLoader(ux1.class.getClassLoader());
        this.a = new z1c();
        this.b = new rg8();
        this.c = tx1.d;
        this.nextParkedWorker = ux1.w;
        int iNanoTime = (int) System.nanoTime();
        this.f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    public final eaa a(boolean z) {
        eaa eaaVarE;
        eaa eaaVarE2;
        long j;
        tx1 tx1Var = this.c;
        ux1 ux1Var = this.t;
        z1c z1cVar = this.a;
        tx1 tx1Var2 = tx1.a;
        if (tx1Var != tx1Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ux1.u;
            do {
                j = atomicLongFieldUpdater.get(ux1Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    eaa eaaVarG = z1cVar.g();
                    return (eaaVarG == null && (eaaVarG = (eaa) ux1Var.f.d()) == null) ? i(1) : eaaVarG;
                }
            } while (!ux1.u.compareAndSet(ux1Var, j, j - 4398046511104L));
            this.c = tx1Var2;
        }
        if (z) {
            boolean z2 = d(ux1Var.a * 2) == 0;
            if (z2 && (eaaVarE2 = e()) != null) {
                return eaaVarE2;
            }
            eaa eaaVarE3 = z1cVar.e();
            if (eaaVarE3 != null) {
                return eaaVarE3;
            }
            if (!z2 && (eaaVarE = e()) != null) {
                return eaaVarE;
            }
        } else {
            eaa eaaVarE4 = e();
            if (eaaVarE4 != null) {
                return eaaVarE4;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.f;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final eaa e() {
        int iD = d(2);
        ux1 ux1Var = this.t;
        xf4 xf4Var = ux1Var.f;
        xf4 xf4Var2 = ux1Var.e;
        if (iD == 0) {
            eaa eaaVar = (eaa) xf4Var2.d();
            return eaaVar != null ? eaaVar : (eaa) xf4Var.d();
        }
        eaa eaaVar2 = (eaa) xf4Var.d();
        return eaaVar2 != null ? eaaVar2 : (eaa) xf4Var2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.t.d);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(tx1 tx1Var) {
        tx1 tx1Var2 = this.c;
        boolean z = tx1Var2 == tx1.a;
        if (z) {
            ux1.u.addAndGet(this.t, 4398046511104L);
        }
        if (tx1Var2 != tx1Var) {
            this.c = tx1Var;
        }
        return z;
    }

    public final eaa i(int i) {
        eaa eaaVarH;
        long jI;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ux1.u;
        ux1 ux1Var = this.t;
        int i2 = (int) (atomicLongFieldUpdater.get(ux1Var) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iD = d(i2);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iD++;
            if (iD > i2) {
                iD = 1;
            }
            sx1 sx1Var = (sx1) ux1Var.s.b(iD);
            if (sx1Var != null && sx1Var != this) {
                z1c z1cVar = sx1Var.a;
                if (i == 3) {
                    eaaVarH = z1cVar.f();
                } else {
                    z1cVar.getClass();
                    int i4 = z1c.d.get(z1cVar);
                    int i5 = z1c.c.get(z1cVar);
                    boolean z = i == 1;
                    while (i4 != i5 && (!z || z1c.e.get(z1cVar) != 0)) {
                        int i6 = i4 + 1;
                        eaaVarH = z1cVar.h(i4, z);
                        if (eaaVarH != null) {
                            break;
                        }
                        i4 = i6;
                    }
                    eaaVarH = null;
                }
                rg8 rg8Var = this.b;
                if (eaaVarH != null) {
                    rg8Var.a = eaaVarH;
                    jI = -1;
                } else {
                    jI = z1cVar.i(i, rg8Var);
                }
                if (jI == -1) {
                    eaa eaaVar = (eaa) rg8Var.a;
                    rg8Var.a = null;
                    return eaaVar;
                }
                if (jI > 0) {
                    jMin = Math.min(jMin, jI);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.e = jMin;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sx1.run():void");
    }
}

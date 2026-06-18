package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class wi2 implements pa7 {
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(wi2.class, "top");
    public final int a;
    public final int b;
    public final AtomicReferenceArray c;
    public final int[] d;
    private volatile /* synthetic */ long top;

    public wi2(int i) {
        if (i <= 0) {
            gp.k(dx1.f(i, "capacity should be positive but it is "));
            throw null;
        }
        if (i > 536870911) {
            gp.k(dx1.f(i, "capacity should be less or equal to 536870911 but it is "));
            throw null;
        }
        this.top = 0L;
        int iHighestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
        this.a = iHighestOneBit;
        this.b = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        int i2 = iHighestOneBit + 1;
        this.c = new AtomicReferenceArray(i2);
        this.d = new int[i2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        r6 = 0;
        r1 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A() {
        /*
            r10 = this;
        L0:
            long r2 = r10.top
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto Lc
        L9:
            r6 = r1
            r1 = r10
            goto L2e
        Lc:
            r0 = 32
            long r4 = r2 >> r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            r8 = 1
            long r4 = r4 + r8
            long r6 = r6 & r2
            int r6 = (int) r6
            if (r6 != 0) goto L1e
            goto L9
        L1e:
            int[] r1 = r10.d
            r1 = r1[r6]
            long r4 = r4 << r0
            long r0 = (long) r1
            long r4 = r4 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.wi2.e
            r1 = r10
            boolean r10 = r0.compareAndSet(r1, r2, r4)
            if (r10 == 0) goto L39
        L2e:
            r10 = 0
            if (r6 != 0) goto L32
            return r10
        L32:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.c
            java.lang.Object r10 = r0.getAndSet(r6, r10)
            return r10
        L39:
            r10 = r1
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi2.A():java.lang.Object");
    }

    @Override // defpackage.pa7
    public final void C0(Object obj) {
        obj.getClass();
        E(obj);
        int iIdentityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.b) + 1;
        int i = 0;
        while (i < 8) {
            AtomicReferenceArray atomicReferenceArray = this.c;
            while (!atomicReferenceArray.compareAndSet(iIdentityHashCode, null, obj)) {
                wi2 wi2Var = this;
                if (atomicReferenceArray.get(iIdentityHashCode) != null) {
                    iIdentityHashCode--;
                    if (iIdentityHashCode == 0) {
                        iIdentityHashCode = wi2Var.a;
                    }
                    i++;
                    this = wi2Var;
                } else {
                    this = wi2Var;
                }
            }
            if (iIdentityHashCode <= 0) {
                gp.l("index should be positive");
                return;
            }
            while (true) {
                long j = this.top;
                long j2 = ((((j >> 32) & 4294967295L) + 1) << 32) | ((long) iIdentityHashCode);
                this.d[iIdentityHashCode] = (int) (4294967295L & j);
                wi2 wi2Var2 = this;
                if (e.compareAndSet(wi2Var2, j, j2)) {
                    return;
                } else {
                    this = wi2Var2;
                }
            }
        }
    }

    public void E(Object obj) {
        obj.getClass();
    }

    @Override // defpackage.pa7
    public final Object G() {
        Object objA = A();
        return objA != null ? p(objA) : q();
    }

    @Override // defpackage.pa7
    public final void a() {
        while (A() != null) {
        }
    }

    public abstract Object q();

    public Object p(Object obj) {
        return obj;
    }
}

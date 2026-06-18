package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z11 extends pz8 {
    public final ir0 s;
    public final /* synthetic */ AtomicReferenceArray t;

    public z11(long j, z11 z11Var, ir0 ir0Var, int i) {
        super(j, z11Var, i);
        this.s = ir0Var;
        this.t = new AtomicReferenceArray(kr0.b * 2);
    }

    @Override // defpackage.pz8
    public final int l() {
        return kr0.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        s(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004b, code lost:
    
        if (r1 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004d, code lost:
    
        r4.getClass();
        r6 = r4.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0052, code lost:
    
        if (r6 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0054, code lost:
    
        defpackage.y86.w(r6, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0057, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    @Override // defpackage.pz8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r7, defpackage.jx1 r8) {
        /*
            r6 = this;
            int r0 = defpackage.kr0.b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            int r0 = r7 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r6.t
            java.lang.Object r0 = r2.get(r0)
        L12:
            java.lang.Object r2 = r6.q(r7)
            boolean r3 = r2 instanceof defpackage.evb
            ir0 r4 = r6.s
            r5 = 0
            if (r3 != 0) goto L58
            boolean r3 = r2 instanceof defpackage.fvb
            if (r3 == 0) goto L22
            goto L58
        L22:
            zy2 r3 = defpackage.kr0.j
            if (r2 == r3) goto L48
            zy2 r3 = defpackage.kr0.k
            if (r2 != r3) goto L2b
            goto L48
        L2b:
            zy2 r3 = defpackage.kr0.g
            if (r2 == r3) goto L12
            zy2 r3 = defpackage.kr0.f
            if (r2 != r3) goto L34
            goto L12
        L34:
            zy2 r6 = defpackage.kr0.i
            if (r2 == r6) goto L79
            zy2 r6 = defpackage.kr0.d
            if (r2 != r6) goto L3d
            goto L79
        L3d:
            zy2 r6 = defpackage.kr0.l
            if (r2 != r6) goto L42
            goto L79
        L42:
            java.lang.String r6 = "unexpected state: "
            defpackage.mn5.n(r2, r6)
            return
        L48:
            r6.s(r7, r5)
            if (r1 == 0) goto L79
            r4.getClass()
            kb4 r6 = r4.b
            if (r6 == 0) goto L79
            defpackage.y86.w(r6, r0, r8)
            return
        L58:
            if (r1 == 0) goto L5d
            zy2 r3 = defpackage.kr0.j
            goto L5f
        L5d:
            zy2 r3 = defpackage.kr0.k
        L5f:
            boolean r2 = r6.p(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.s(r7, r5)
            r2 = r1 ^ 1
            r6.r(r7, r2)
            if (r1 == 0) goto L79
            r4.getClass()
            kb4 r6 = r4.b
            if (r6 == 0) goto L79
            defpackage.y86.w(r6, r0, r8)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z11.m(int, jx1):void");
    }

    public final boolean p(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.t;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object q(int i) {
        return this.t.get((i * 2) + 1);
    }

    public final void r(int i, boolean z) {
        if (z) {
            ir0 ir0Var = this.s;
            ir0Var.getClass();
            ir0Var.V((this.e * ((long) kr0.b)) + ((long) i));
        }
        n();
    }

    public final void s(int i, Object obj) {
        this.t.set(i * 2, obj);
    }

    public final void t(int i, Object obj) {
        this.t.set((i * 2) + 1, obj);
    }
}

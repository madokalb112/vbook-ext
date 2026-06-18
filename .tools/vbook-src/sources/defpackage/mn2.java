package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mn2 implements Iterator, fi5 {
    public int a = -1;
    public int b;
    public int c;
    public ha5 d;
    public int e;
    public final /* synthetic */ nn2 f;

    public mn2(nn2 nn2Var) {
        this.f = nn2Var;
        int iQ = wx1.Q(0, 0, nn2Var.a.length());
        this.b = iQ;
        this.c = iQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r8 = this;
            nn2 r0 = r8.f
            java.lang.CharSequence r1 = r0.a
            int r2 = r8.c
            r3 = 0
            if (r2 >= 0) goto Lf
            r8.a = r3
            r0 = 0
            r8.d = r0
            return
        Lf:
            int r4 = r0.b
            r5 = -1
            r6 = 1
            if (r4 <= 0) goto L1c
            int r7 = r8.e
            int r7 = r7 + r6
            r8.e = r7
            if (r7 >= r4) goto L22
        L1c:
            int r4 = r1.length()
            if (r2 <= r4) goto L32
        L22:
            ha5 r0 = new ha5
            int r2 = r8.b
            int r1 = defpackage.bw9.T(r1)
            r0.<init>(r2, r1, r6)
            r8.d = r0
            r8.c = r5
            goto L73
        L32:
            yb4 r0 = r0.c
            int r2 = r8.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r1, r2)
            xl7 r0 = (defpackage.xl7) r0
            if (r0 != 0) goto L52
            ha5 r0 = new ha5
            int r2 = r8.b
            int r1 = defpackage.bw9.T(r1)
            r0.<init>(r2, r1, r6)
            r8.d = r0
            r8.c = r5
            goto L73
        L52:
            java.lang.Object r1 = r0.a
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r2 = r8.b
            ha5 r2 = defpackage.wx1.s0(r2, r1)
            r8.d = r2
            int r1 = r1 + r0
            r8.b = r1
            if (r0 != 0) goto L70
            r3 = r6
        L70:
            int r1 = r1 + r3
            r8.c = r1
        L73:
            r8.a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn2.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a == -1) {
            a();
        }
        return this.a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a == -1) {
            a();
        }
        if (this.a == 0) {
            mn5.m();
            return null;
        }
        ha5 ha5Var = this.d;
        ha5Var.getClass();
        this.d = null;
        this.a = -1;
        return ha5Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

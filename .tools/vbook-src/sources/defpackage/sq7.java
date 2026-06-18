package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sq7 implements il9 {
    public final mr0 a;
    public final xq0 b;
    public oz8 c;
    public int d;
    public boolean e;
    public long f;

    public sq7(mr0 mr0Var) {
        this.a = mr0Var;
        xq0 xq0VarB = mr0Var.b();
        this.b = xq0VarB;
        oz8 oz8Var = xq0VarB.a;
        this.c = oz8Var;
        this.d = oz8Var != null ? oz8Var.b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // defpackage.il9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long D0(long r9, defpackage.xq0 r11) {
        /*
            r8 = this;
            r11.getClass()
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 < 0) goto L65
            boolean r3 = r8.e
            if (r3 != 0) goto L5f
            oz8 r3 = r8.c
            xq0 r4 = r8.b
            if (r3 == 0) goto L27
            oz8 r5 = r4.a
            if (r3 != r5) goto L21
            int r3 = r8.d
            r5.getClass()
            int r5 = r5.b
            if (r3 != r5) goto L21
            goto L27
        L21:
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            gp.j(r8)
            return r0
        L27:
            if (r2 != 0) goto L2a
            return r0
        L2a:
            long r0 = r8.f
            r2 = 1
            long r0 = r0 + r2
            mr0 r2 = r8.a
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L3a
            r8 = -1
            return r8
        L3a:
            oz8 r0 = r8.c
            if (r0 != 0) goto L48
            oz8 r0 = r4.a
            if (r0 == 0) goto L48
            r8.c = r0
            int r0 = r0.b
            r8.d = r0
        L48:
            long r0 = r4.b
            long r2 = r8.f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r9, r0)
            xq0 r2 = r8.b
            long r4 = r8.f
            r3 = r11
            r2.A(r3, r4, r6)
            long r9 = r8.f
            long r9 = r9 + r6
            r8.f = r9
            return r6
        L5f:
            java.lang.String r8 = "closed"
            gp.j(r8)
            return r0
        L65:
            java.lang.String r8 = "byteCount < 0: "
            java.lang.String r8 = defpackage.xv5.l(r9, r8)
            gp.k(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sq7.D0(long, xq0):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    @Override // defpackage.il9
    public final uua l() {
        return this.a.l();
    }
}

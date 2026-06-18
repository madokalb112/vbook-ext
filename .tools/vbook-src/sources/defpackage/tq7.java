package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tq7 implements jc8 {
    public final jl9 a;
    public final wq0 b;
    public nz8 c;
    public int d;
    public boolean e;
    public long f;

    public tq7(jl9 jl9Var) {
        this.a = jl9Var;
        wq0 wq0VarB = jl9Var.b();
        this.b = wq0VarB;
        nz8 nz8Var = wq0VarB.a;
        this.c = nz8Var;
        this.d = nz8Var != null ? nz8Var.b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // defpackage.jc8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long K(defpackage.wq0 r12, long r13) {
        /*
            r11 = this;
            boolean r0 = r11.e
            r1 = 0
            if (r0 != 0) goto Lc0
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 < 0) goto Lb4
            nz8 r3 = r11.c
            wq0 r4 = r11.b
            if (r3 == 0) goto L24
            nz8 r5 = r4.a
            if (r3 != r5) goto L1e
            int r3 = r11.d
            r5.getClass()
            int r5 = r5.b
            if (r3 != r5) goto L1e
            goto L24
        L1e:
            java.lang.String r11 = "Peek source is invalid because upstream source was used"
            gp.j(r11)
            return r1
        L24:
            if (r0 != 0) goto L27
            return r1
        L27:
            long r5 = r11.f
            r7 = 1
            long r5 = r5 + r7
            jl9 r0 = r11.a
            boolean r0 = r0.request(r5)
            if (r0 != 0) goto L37
            r11 = -1
            return r11
        L37:
            nz8 r0 = r11.c
            if (r0 != 0) goto L45
            nz8 r0 = r4.a
            if (r0 == 0) goto L45
            r11.c = r0
            int r0 = r0.b
            r11.d = r0
        L45:
            long r5 = r4.c
            long r7 = r11.f
            long r5 = r5 - r7
            long r13 = java.lang.Math.min(r13, r5)
            long r7 = r11.f
            long r9 = r7 + r13
            long r5 = r4.c
            defpackage.kl8.Q(r5, r7, r9)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L5c
            goto Lae
        L5c:
            long r9 = r9 - r7
            long r5 = r12.c
            long r5 = r5 + r9
            r12.c = r5
            nz8 r0 = r4.a
        L64:
            r0.getClass()
            int r3 = r0.c
            int r4 = r0.b
            int r3 = r3 - r4
            long r3 = (long) r3
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 < 0) goto L75
            long r7 = r7 - r3
            nz8 r0 = r0.f
            goto L64
        L75:
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 <= 0) goto Lae
            r0.getClass()
            nz8 r3 = r0.f()
            int r4 = r3.b
            int r5 = (int) r7
            int r4 = r4 + r5
            r3.b = r4
            int r5 = (int) r9
            int r4 = r4 + r5
            int r5 = r3.c
            int r4 = java.lang.Math.min(r4, r5)
            r3.c = r4
            nz8 r4 = r12.a
            if (r4 != 0) goto L99
            r12.a = r3
            r12.b = r3
            goto La3
        L99:
            nz8 r4 = r12.b
            r4.getClass()
            r4.e(r3)
            r12.b = r3
        La3:
            int r4 = r3.c
            int r3 = r3.b
            int r4 = r4 - r3
            long r3 = (long) r4
            long r9 = r9 - r3
            nz8 r0 = r0.f
            r7 = r1
            goto L75
        Lae:
            long r0 = r11.f
            long r0 = r0 + r13
            r11.f = r0
            return r13
        Lb4:
            java.lang.String r11 = "byteCount ("
            java.lang.String r12 = ") < 0"
            java.lang.String r11 = defpackage.xv5.m(r13, r11, r12)
            gp.k(r11)
            return r1
        Lc0:
            java.lang.String r11 = "Source is closed."
            gp.j(r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq7.K(wq0, long):long");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }
}

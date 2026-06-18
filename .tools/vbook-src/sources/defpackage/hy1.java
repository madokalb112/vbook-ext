package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hy1 implements ut0 {
    public final ut0 b;
    public final wq0 c;
    public long d;
    public long e;

    public hy1(ut0 ut0Var) {
        ut0Var.getClass();
        this.b = ut0Var;
        this.c = new wq0();
    }

    @Override // defpackage.ut0
    public final void a(Throwable th) {
        this.b.a(th);
    }

    @Override // defpackage.ut0
    public final Throwable b() {
        return this.b.b();
    }

    public final void c() {
        d();
        this.d += this.c.u0(this.b.h());
    }

    public final void d() {
        long j = this.e;
        long j2 = this.d;
        long j3 = this.c.c;
        this.e = (j2 - j3) + j;
        this.d = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ut0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(int r8, defpackage.kt1 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.gy1
            if (r0 == 0) goto L13
            r0 = r9
            gy1 r0 = (defpackage.gy1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gy1 r0 = new gy1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r9)
            goto L4b
        L25:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            r7 = 0
            return r7
        L2c:
            defpackage.e11.e0(r9)
            r7.c()
            wq0 r9 = r7.c
            long r3 = r9.c
            long r5 = (long) r8
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 < 0) goto L3e
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L3e:
            r0.c = r2
            ut0 r9 = r7.b
            java.lang.Object r9 = r9.e(r8, r0)
            xx1 r8 = defpackage.xx1.a
            if (r9 != r8) goto L4b
            return r8
        L4b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            if (r8 == 0) goto L59
            r7.c()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        L59:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy1.e(int, kt1):java.lang.Object");
    }

    @Override // defpackage.ut0
    public final wq0 h() {
        c();
        return this.c;
    }

    @Override // defpackage.ut0
    public final boolean i() {
        return this.c.k() && this.b.i();
    }
}

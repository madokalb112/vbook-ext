package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ta1 implements bv0 {
    public final jt0 b;
    public final ju0 c;

    public ta1(jt0 jt0Var, ju0 ju0Var) {
        this.b = jt0Var;
        this.c = ju0Var;
    }

    @Override // defpackage.bv0
    public final void a(Throwable th) {
        this.b.a(th);
    }

    @Override // defpackage.bv0
    public final Throwable b() {
        return this.b.b();
    }

    @Override // defpackage.bv0
    public final Object c(kt1 kt1Var) {
        return this.b.c(kt1Var);
    }

    @Override // defpackage.bv0
    public final boolean d() {
        return this.b.d();
    }

    @Override // defpackage.bv0
    public final bg9 f() {
        return this.b.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r5.c.invoke(r0) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.bv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.jt1 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.sa1
            if (r0 == 0) goto L13
            r0 = r6
            sa1 r0 = (defpackage.sa1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            sa1 r0 = new sa1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            xx1 r4 = defpackage.xx1.a
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.e11.e0(r6)
            goto L4e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L31:
            defpackage.e11.e0(r6)
            goto L43
        L35:
            defpackage.e11.e0(r6)
            r0.c = r3
            jt0 r6 = r5.b
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r4) goto L43
            goto L4d
        L43:
            r0.c = r2
            ju0 r5 = r5.c
            java.lang.Object r5 = r5.invoke(r0)
            if (r5 != r4) goto L4e
        L4d:
            return r4
        L4e:
            heb r5 = defpackage.heb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta1.g(jt1):java.lang.Object");
    }

    @Override // defpackage.bv0
    public final boolean j() {
        return this.b.b;
    }
}

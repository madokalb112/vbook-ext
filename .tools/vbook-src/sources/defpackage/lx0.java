package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lx0 extends l11 {
    public final yb4 e;

    public lx0(yb4 yb4Var, jx1 jx1Var, int i, ar0 ar0Var) {
        super(yb4Var, jx1Var, i, ar0Var);
        this.e = yb4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.l11, defpackage.k11
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.o38 r5, defpackage.jt1 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.kx0
            if (r0 == 0) goto L13
            r0 = r6
            kx0 r0 = (defpackage.kx0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            kx0 r0 = new kx0
            kt1 r6 = (defpackage.kt1) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            o38 r5 = r0.a
            defpackage.e11.e0(r6)
            goto L40
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r2
        L30:
            defpackage.e11.e0(r6)
            r0.a = r5
            r0.d = r3
            java.lang.Object r4 = super.e(r5, r0)
            xx1 r6 = defpackage.xx1.a
            if (r4 != r6) goto L40
            return r6
        L40:
            ir0 r4 = r5.f
            boolean r4 = r4.F()
            if (r4 == 0) goto L4b
            heb r4 = defpackage.heb.a
            return r4
        L4b:
            java.lang.String r4 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            gp.j(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx0.e(o38, jt1):java.lang.Object");
    }

    @Override // defpackage.l11, defpackage.k11
    public final k11 g(jx1 jx1Var, int i, ar0 ar0Var) {
        return new lx0(this.e, jx1Var, i, ar0Var);
    }
}

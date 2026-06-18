package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ay implements vx, fx, gx {
    public final /* synthetic */ vx a;
    public final /* synthetic */ vx b;
    public final /* synthetic */ qg8 c;
    public final /* synthetic */ long d;

    public ay(vx vxVar, qg8 qg8Var, long j) {
        this.b = vxVar;
        this.c = qg8Var;
        this.d = j;
        this.a = vxVar;
    }

    @Override // defpackage.ax
    public final Object a(kt1 kt1Var) {
        return this.a.a(kt1Var);
    }

    @Override // defpackage.gx
    public final Object c(jt1 jt1Var) {
        return new Long(this.c.a);
    }

    @Override // defpackage.fx
    public final Object e(kt1 kt1Var) {
        return new Long(this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.vx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(byte[] r5, int r6, int r7, defpackage.kt1 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.zx
            if (r0 == 0) goto L13
            r0 = r8
            zx r0 = (defpackage.zx) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            zx r0 = new zx
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            ay r4 = r0.a
            defpackage.e11.e0(r8)
            goto L40
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r8)
            r0.a = r4
            r0.d = r2
            vx r8 = r4.b
            java.lang.Object r8 = r8.g(r5, r6, r7, r0)
            xx1 r5 = defpackage.xx1.a
            if (r8 != r5) goto L40
            return r5
        L40:
            java.lang.Number r8 = (java.lang.Number) r8
            int r5 = r8.intValue()
            if (r5 < 0) goto L50
            qg8 r4 = r4.c
            long r6 = r4.a
            long r0 = (long) r5
            long r6 = r6 + r0
            r4.a = r6
        L50:
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay.g(byte[], int, int, kt1):java.lang.Object");
    }

    @Override // defpackage.fx
    public final Object h(kt1 kt1Var) {
        return sdc.m0(this, kt1Var);
    }
}

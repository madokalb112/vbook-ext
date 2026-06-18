package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class i02 implements vx {
    public final vx a;
    public int b;

    public i02(vx vxVar) {
        int[] iArr = mw0.a;
        vxVar.getClass();
        this.a = vxVar;
        this.b = 0;
    }

    @Override // defpackage.ax
    public final Object a(kt1 kt1Var) {
        Object objA = this.a.a(kt1Var);
        return objA == xx1.a ? objA : heb.a;
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
            boolean r0 = r8 instanceof defpackage.h02
            if (r0 == 0) goto L13
            r0 = r8
            h02 r0 = (defpackage.h02) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            h02 r0 = new h02
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            int r6 = r0.b
            byte[] r5 = r0.a
            defpackage.e11.e0(r8)
            goto L44
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L30:
            defpackage.e11.e0(r8)
            r0.a = r5
            r0.b = r6
            r0.e = r2
            vx r8 = r4.a
            java.lang.Object r8 = r8.g(r5, r6, r7, r0)
            xx1 r7 = defpackage.xx1.a
            if (r8 != r7) goto L44
            return r7
        L44:
            java.lang.Number r8 = (java.lang.Number) r8
            int r7 = r8.intValue()
            if (r7 <= 0) goto L6c
            int[] r8 = defpackage.mw0.a
            int r8 = r4.b
            r5.getClass()
            int r8 = ~r8
            int[] r0 = defpackage.mw0.a
            int r1 = r6 + r7
        L58:
            if (r6 >= r1) goto L69
            r2 = r5[r6]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 ^ r8
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r0[r2]
            int r8 = r8 >>> 8
            r8 = r8 ^ r2
            int r6 = r6 + 1
            goto L58
        L69:
            int r5 = ~r8
            r4.b = r5
        L6c:
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i02.g(byte[], int, int, kt1):java.lang.Object");
    }
}

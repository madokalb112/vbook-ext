package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class oy implements iy, vx {
    public String a;
    public final ub7 b;
    public boolean c;

    public oy() {
        ub7 ub7Var = new ub7();
        ub7Var.c = new vv();
        this.b = ub7Var;
    }

    @Override // defpackage.ax
    public final Object a(kt1 kt1Var) {
        this.c = true;
        return heb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.iy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r5, defpackage.jt1 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ny
            if (r0 == 0) goto L13
            r0 = r6
            ny r0 = (defpackage.ny) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ny r0 = new ny
            kt1 r6 = (defpackage.kt1) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            int r5 = r0.b
            oy r4 = r0.a
            defpackage.e11.e0(r6)
            goto L44
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L32:
            defpackage.e11.e0(r6)
            r0.a = r4
            r0.b = r5
            r0.e = r2
            java.lang.Object r6 = r4.i(r0)
            xx1 r0 = defpackage.xx1.a
            if (r6 != r0) goto L44
            return r0
        L44:
            ub7 r4 = r4.b
            byte r5 = (byte) r5
            byte[] r6 = new byte[r2]
            r0 = 0
            r6[r0] = r5
            java.lang.Object r5 = r4.c
            vv r5 = (vv) r5
            r5.addLast(r6)
            int r5 = r4.b
            int r5 = r5 + r2
            r4.b = r5
            heb r4 = defpackage.heb.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oy.b(int, jt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.iy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(byte[] r6, int r7, int r8, defpackage.kt1 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.my
            if (r0 == 0) goto L13
            r0 = r9
            my r0 = (defpackage.my) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            my r0 = new my
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.e
            int r1 = r0.s
            r2 = 0
            heb r3 = defpackage.heb.a
            r4 = 1
            if (r1 == 0) goto L36
            if (r1 != r4) goto L30
            int r8 = r0.d
            int r7 = r0.c
            byte[] r6 = r0.b
            oy r5 = r0.a
            defpackage.e11.e0(r9)
            goto L53
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r2
        L36:
            defpackage.e11.e0(r9)
            if (r8 > 0) goto L3c
            return r3
        L3c:
            boolean r9 = r5.c
            if (r9 != 0) goto L6e
            r0.a = r5
            r0.b = r6
            r0.c = r7
            r0.d = r8
            r0.s = r4
            java.lang.Object r9 = r5.i(r0)
            xx1 r0 = defpackage.xx1.a
            if (r9 != r0) goto L53
            return r0
        L53:
            ub7 r5 = r5.b
            r5.getClass()
            r6.getClass()
            int r8 = r8 + r7
            byte[] r6 = defpackage.fw.Y(r6, r7, r8)
            java.lang.Object r7 = r5.c
            vv r7 = (vv) r7
            r7.addLast(r6)
            int r7 = r5.b
            int r6 = r6.length
            int r7 = r7 + r6
            r5.b = r7
            return r3
        L6e:
            java.lang.String r6 = "Trying to write to a completed "
            defpackage.mn5.n(r5, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oy.f(byte[], int, int, kt1):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e20 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00cb -> B:46:0x00ce). Please report as a decompilation issue!!! */
    @Override // defpackage.vx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(byte[] r17, int r18, int r19, defpackage.kt1 r20) throws e20 {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oy.g(byte[], int, int, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.kt1 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ly
            if (r0 == 0) goto L13
            r0 = r6
            ly r0 = (defpackage.ly) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ly r0 = new ly
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            oy r5 = r0.a
            defpackage.e11.e0(r6)
            goto L39
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L2e:
            defpackage.e11.e0(r6)
            ub7 r6 = r5.b
            int r6 = r6.b
            r1 = 8388608(0x800000, float:1.1754944E-38)
            if (r6 <= r1) goto L57
        L39:
            ub7 r6 = r5.b
            int r6 = r6.b
            r1 = 4194305(0x400001, float:5.877473E-39)
            if (r6 <= r1) goto L57
            mc8 r6 = defpackage.k63.b
            o63 r6 = defpackage.o63.MILLISECONDS
            long r3 = defpackage.lx1.z0(r2, r6)
            r0.a = r5
            r0.d = r2
            java.lang.Object r6 = defpackage.tw1.I(r3, r0)
            xx1 r1 = defpackage.xx1.a
            if (r6 != r1) goto L39
            return r1
        L57:
            heb r5 = defpackage.heb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oy.i(kt1):java.lang.Object");
    }

    public final String toString() {
        return xv5.s(new StringBuilder("AsyncByteArrayDequeV2("), this.a, ')');
    }
}

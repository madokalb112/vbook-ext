package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class by8 {
    public final jx8 a;
    public final vx1 b;
    public final hd c;
    public oq9 d;
    public final ir0 e;

    public by8(jx8 jx8Var, vx1 vx1Var, hd hdVar) {
        jx8Var.getClass();
        this.a = jx8Var;
        this.b = vx1Var;
        this.c = hdVar;
        this.e = vm7.c(-1, 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x011a, code lost:
    
        if (yn2.n(r2, r10, r3, r1) == r8) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0059, code lost:
    
        r2 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:41:0x00d0, B:45:0x00e6], limit reached: 52 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r3v1, types: [ib4] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.by8 r18, defpackage.kt1 r19) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by8.a(by8, kt1):java.lang.Object");
    }

    public final boolean b(vx8 vx8Var, float f, ib4 ib4Var, kb4 kb4Var) {
        boolean zB;
        int iOrdinal = vx8Var.ordinal();
        int i = 0;
        jx8 jx8Var = this.a;
        if (iOrdinal == 0) {
            zB = jx8Var.b();
        } else {
            if (iOrdinal != 1) {
                mn5.g();
                return false;
            }
            zB = jx8Var.c();
        }
        if (!zB) {
            return false;
        }
        if (this.d == null) {
            this.d = ah1.J(this.b, null, null, new zx8(this, null, i), 3);
        }
        this.e.k(new xx8(vx8Var, f, ib4Var, kb4Var));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (defpackage.qx1.q(r7, r0) == r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.kt1 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ay8
            if (r0 == 0) goto L13
            r0 = r7
            ay8 r0 = (defpackage.ay8) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ay8 r0 = new ay8
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            by8 r6 = r0.a
            defpackage.e11.e0(r7)
            goto L5a
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r2
        L33:
            by8 r6 = r0.a
            defpackage.e11.e0(r7)
            goto L4b
        L39:
            defpackage.e11.e0(r7)
            xx8 r7 = defpackage.xx8.e
            r0.a = r6
            r0.d = r4
            ir0 r1 = r6.e
            java.lang.Object r7 = r1.g(r0, r7)
            if (r7 != r5) goto L4b
            goto L59
        L4b:
            oq9 r7 = r6.d
            if (r7 == 0) goto L5a
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = defpackage.qx1.q(r7, r0)
            if (r7 != r5) goto L5a
        L59:
            return r5
        L5a:
            r6.d = r2
            heb r6 = defpackage.heb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by8.c(kt1):java.lang.Object");
    }
}

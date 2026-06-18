package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class hy6 {
    public static final zu0 a;
    public static final zu0 b;

    static {
        byte[] bArrP = sg9.p("\r\n", q31.a);
        a = new zu0(bArrP, 0, bArrP.length);
        b = new zu0(new byte[]{45, 45});
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a5, code lost:
    
        if (r5.c(r6) != r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.zu0 r29, defpackage.hy1 r30, defpackage.jt0 r31, defpackage.du4 r32, long r33, defpackage.kt1 r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy6.a(zu0, hy1, jt0, du4, long, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.hy1 r9, defpackage.kt1 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.fy6
            if (r0 == 0) goto L13
            r0 = r10
            fy6 r0 = (defpackage.fy6) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fy6 r0 = new fy6
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.c
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L31
            if (r1 != r4) goto L2b
            k21 r9 = r0.a
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L29
            goto L55
        L29:
            r10 = move-exception
            goto L68
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            return r3
        L31:
            defpackage.e11.e0(r10)
            k21 r10 = new k21
            r10.<init>()
            r0.a = r10     // Catch: java.lang.Throwable -> L66
            r0.c = r4     // Catch: java.lang.Throwable -> L66
            java.util.Set r1 = defpackage.ku4.a     // Catch: java.lang.Throwable -> L66
            xa8 r1 = new xa8     // Catch: java.lang.Throwable -> L66
            r5 = 5
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L66
            r1.b = r2     // Catch: java.lang.Throwable -> L66
            r1.c = r2     // Catch: java.lang.Throwable -> L66
            java.lang.Object r9 = defpackage.ku4.c(r9, r10, r1, r0)     // Catch: java.lang.Throwable -> L66
            xx1 r0 = defpackage.xx1.a
            if (r9 != r0) goto L52
            return r0
        L52:
            r8 = r10
            r10 = r9
            r9 = r8
        L55:
            du4 r10 = (defpackage.du4) r10     // Catch: java.lang.Throwable -> L29
            if (r10 == 0) goto L5a
            return r10
        L5a:
            java.io.EOFException r10 = new java.io.EOFException     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = "Failed to parse multipart headers: unexpected end of stream"
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L29
            throw r10     // Catch: java.lang.Throwable -> L29
        L62:
            r8 = r10
            r10 = r9
            r9 = r8
            goto L68
        L66:
            r9 = move-exception
            goto L62
        L68:
            pa7 r0 = r9.a
            java.util.ArrayList r1 = r9.b
            if (r1 == 0) goto L81
            r9.c = r3
            int r5 = r1.size()
            r6 = r2
        L75:
            if (r6 >= r5) goto L8a
            java.lang.Object r7 = r1.get(r6)
            r0.C0(r7)
            int r6 = r6 + 1
            goto L75
        L81:
            char[] r1 = r9.c
            if (r1 == 0) goto L88
            r0.C0(r1)
        L88:
            r9.c = r3
        L8a:
            r9.e = r4
            r9.b = r3
            r9.d = r3
            r9.s = r2
            r9.f = r2
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy6.b(hy1, kt1):java.lang.Object");
    }

    public static final void c(pg8 pg8Var, byte[] bArr, byte b2) {
        int i = pg8Var.a;
        if (i >= bArr.length) {
            sy3.m("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
        } else {
            pg8Var.a = i + 1;
            bArr[i] = b2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.ut0 r4, defpackage.zu0 r5, defpackage.kt1 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.gy6
            if (r0 == 0) goto L13
            r0 = r6
            gy6 r0 = (defpackage.gy6) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gy6 r0 = new gy6
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            zu0 r5 = r0.a
            defpackage.e11.e0(r6)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r6)
            r0.a = r5
            r0.c = r2
            java.lang.Object r6 = defpackage.m79.T(r4, r5, r0)
            xx1 r4 = defpackage.xx1.a
            if (r6 != r4) goto L3e
            return r4
        L3e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 == 0) goto L4b
            byte[] r4 = r5.a
            int r4 = r4.length
            long r4 = (long) r4
            goto L4d
        L4b:
            r4 = 0
        L4d:
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy6.d(ut0, zu0, kt1):java.lang.Object");
    }
}

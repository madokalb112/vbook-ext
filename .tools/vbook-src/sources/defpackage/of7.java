package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class of7 {
    public final HashMap a = new HashMap();
    public final t07 b = u07.a();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0204 A[EDGE_INSN: B:145:0x0204->B:78:0x0204 BREAK  A[LOOP:0: B:70:0x01d9->B:89:0x0268], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026c  */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.regex.Pattern] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r6v1, types: [he8] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01d0 -> B:12:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.yv0 r21, defpackage.kt1 r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of7.a(yv0, kt1):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2, types: [int] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r25v0, types: [of7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r26, defpackage.cw0 r27, defpackage.kt1 r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of7.b(java.lang.String, cw0, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.yv0 r8, defpackage.kt1 r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.nf7
            if (r0 == 0) goto L13
            r0 = r9
            nf7 r0 = (defpackage.nf7) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            nf7 r0 = new nf7
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f
            int r1 = r0.t
            r2 = 2
            r3 = 1
            r4 = 0
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L46
            if (r1 == r3) goto L39
            if (r1 != r2) goto L33
            yv0 r7 = r0.d
            java.util.HashMap r8 = r0.c
            r07 r0 = r0.b
            defpackage.e11.e0(r9)     // Catch: java.lang.Throwable -> L31
            goto L7a
        L31:
            r7 = move-exception
            goto L8b
        L33:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            return r4
        L39:
            int r8 = r0.e
            r07 r1 = r0.b
            yv0 r3 = r0.a
            defpackage.e11.e0(r9)
            r9 = r1
            r1 = r8
            r8 = r3
            goto L5b
        L46:
            defpackage.e11.e0(r9)
            r0.a = r8
            t07 r9 = r7.b
            r0.b = r9
            r1 = 0
            r0.e = r1
            r0.t = r3
            java.lang.Object r3 = r9.p(r0)
            if (r3 != r5) goto L5b
            goto L75
        L5b:
            java.util.HashMap r3 = r7.a     // Catch: java.lang.Throwable -> L81
            java.lang.Object r6 = r3.get(r8)     // Catch: java.lang.Throwable -> L81
            if (r6 != 0) goto L84
            r0.a = r4     // Catch: java.lang.Throwable -> L81
            r0.b = r9     // Catch: java.lang.Throwable -> L81
            r0.c = r3     // Catch: java.lang.Throwable -> L81
            r0.d = r8     // Catch: java.lang.Throwable -> L81
            r0.e = r1     // Catch: java.lang.Throwable -> L81
            r0.t = r2     // Catch: java.lang.Throwable -> L81
            java.lang.Object r7 = r7.a(r8, r0)     // Catch: java.lang.Throwable -> L81
            if (r7 != r5) goto L76
        L75:
            return r5
        L76:
            r0 = r9
            r9 = r7
            r7 = r8
            r8 = r3
        L7a:
            r6 = r9
            as2 r6 = (defpackage.as2) r6     // Catch: java.lang.Throwable -> L31
            r8.put(r7, r6)     // Catch: java.lang.Throwable -> L31
            goto L85
        L81:
            r7 = move-exception
            r0 = r9
            goto L8b
        L84:
            r0 = r9
        L85:
            as2 r6 = (defpackage.as2) r6     // Catch: java.lang.Throwable -> L31
            r0.q(r4)
            return r6
        L8b:
            r0.q(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of7.c(yv0, kt1):java.lang.Object");
    }
}

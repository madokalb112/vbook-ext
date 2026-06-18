package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fv3 {
    public final is4 a;
    public final ew2 b = new ew2(104857600, zn7.f(qu1.a0(gx3.a), "file_downloader"));
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();
    public final se6 e = new se6(Context.VERSION_ES6);
    public final Object f = new Object();
    public final iw0 g;

    public fv3(is4 is4Var) {
        this.a = is4Var;
        o0a o0aVarA = zib.a();
        aj2 aj2Var = rw2.a;
        this.g = wx1.b(gx1.T(o0aVarA, nh2.c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0224 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0140 A[Catch: all -> 0x00a9, TryCatch #4 {all -> 0x00a9, blocks: (B:78:0x0131, B:80:0x0140, B:82:0x0146, B:83:0x014c, B:85:0x0153, B:87:0x0158, B:88:0x015d, B:90:0x0163, B:91:0x0164, B:96:0x017e, B:97:0x017f, B:98:0x0180, B:75:0x011e, B:51:0x00ce, B:52:0x00d0, B:54:0x00d6, B:55:0x00d7, B:70:0x0109, B:71:0x010a, B:33:0x008b, B:35:0x0093, B:37:0x009b, B:39:0x00a1, B:43:0x00ac, B:45:0x00b2, B:47:0x00b7, B:72:0x010b, B:53:0x00d1, B:89:0x015e), top: B:155:0x008b, inners: #3, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0180 A[Catch: all -> 0x00a9, TRY_LEAVE, TryCatch #4 {all -> 0x00a9, blocks: (B:78:0x0131, B:80:0x0140, B:82:0x0146, B:83:0x014c, B:85:0x0153, B:87:0x0158, B:88:0x015d, B:90:0x0163, B:91:0x0164, B:96:0x017e, B:97:0x017f, B:98:0x0180, B:75:0x011e, B:51:0x00ce, B:52:0x00d0, B:54:0x00d6, B:55:0x00d7, B:70:0x0109, B:71:0x010a, B:33:0x008b, B:35:0x0093, B:37:0x009b, B:39:0x00a1, B:43:0x00ac, B:45:0x00b2, B:47:0x00b7, B:72:0x010b, B:53:0x00d1, B:89:0x015e), top: B:155:0x008b, inners: #3, #9 }] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0, types: [fv3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [g5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30, types: [g5] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [g5] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [g5] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.fv3 r17, java.lang.String r18, defpackage.sw3 r19, defpackage.g5 r20, defpackage.kt1 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv3.a(fv3, java.lang.String, sw3, g5, kt1):java.lang.Object");
    }

    public static mx3 c(byte[] bArr) {
        if (bArr.length >= 5 && bArr[0] == 37 && bArr[1] == 80 && bArr[2] == 68 && bArr[3] == 70 && bArr[4] == 45) {
            return mx3.PDF;
        }
        if (bArr.length >= 4 && bArr[0] == 80 && bArr[1] == 75 && bArr[2] == 3 && bArr[3] == 4) {
            return mx3.ZIP;
        }
        if (bArr.length >= 6 && bArr[0] == 82 && bArr[1] == 97 && bArr[2] == 114 && bArr[3] == 33 && bArr[4] == 26 && bArr[5] == 7) {
            return mx3.RAR;
        }
        if (bArr.length >= 6 && bArr[0] == 55 && bArr[1] == 122 && bArr[2] == -68 && bArr[3] == -81 && bArr[4] == 39 && bArr[5] == 28) {
            return mx3.SEVEN_Z;
        }
        if (bArr.length >= 2 && bArr[0] == 31 && bArr[1] == -117) {
            return mx3.GZIP;
        }
        return null;
    }

    public static mx3 e(String str) {
        String lowerCase = bw9.v0(bw9.v0(str, '?'), '#').toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (iw9.C(lowerCase, ".pdf", false)) {
            return mx3.PDF;
        }
        if (iw9.C(lowerCase, ".epub", false)) {
            return mx3.EPUB;
        }
        if (iw9.C(lowerCase, ".zip", false)) {
            return mx3.ZIP;
        }
        if (iw9.C(lowerCase, ".cbz", false)) {
            return mx3.CBZ;
        }
        if (iw9.C(lowerCase, ".rar", false)) {
            return mx3.RAR;
        }
        if (iw9.C(lowerCase, ".7z", false)) {
            return mx3.SEVEN_Z;
        }
        if (iw9.C(lowerCase, ".gz", false) || iw9.C(lowerCase, ".gzip", false)) {
            return mx3.GZIP;
        }
        if (iw9.C(lowerCase, ".txt", false)) {
            return mx3.TEXT;
        }
        if (iw9.C(lowerCase, ".json", false)) {
            return mx3.JSON;
        }
        if (iw9.C(lowerCase, ".xml", false)) {
            return mx3.XML;
        }
        if (iw9.C(lowerCase, ".html", false) || iw9.C(lowerCase, ".htm", false)) {
            return mx3.HTML;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.g5 r6, defpackage.ww3 r7, defpackage.kt1 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cv3
            if (r0 == 0) goto L13
            r0 = r8
            cv3 r0 = (defpackage.cv3) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            cv3 r0 = new cv3
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.d
            xx1 r1 = defpackage.xx1.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            int r5 = r0.c
            java.util.Iterator r6 = r0.b
            ww3 r7 = r0.a
            defpackage.e11.e0(r8)
            goto L4f
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L34:
            defpackage.e11.e0(r8)
            java.lang.Object r5 = r5.f
            monitor-enter(r5)
            java.util.LinkedHashMap r6 = r6.a     // Catch: java.lang.Throwable -> L6d
            java.util.Collection r6 = r6.values()     // Catch: java.lang.Throwable -> L6d
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L6d
            java.util.List r6 = defpackage.fc1.Z0(r6)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r5)
            java.util.Iterator r5 = r6.iterator()
            r6 = 0
            r4 = r6
            r6 = r5
            r5 = r4
        L4f:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L6a
            java.lang.Object r8 = r6.next()
            xz6 r8 = (defpackage.xz6) r8
            r0.a = r7
            r0.b = r6
            r0.c = r5
            r0.f = r3
            java.lang.Object r8 = r8.b(r7, r0)
            if (r8 != r1) goto L4f
            return r1
        L6a:
            heb r5 = defpackage.heb.a
            return r5
        L6d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv3.b(g5, ww3, kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (r8 == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v11, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(java.lang.String r7, defpackage.kt1 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dv3
            if (r0 == 0) goto L13
            r0 = r8
            dv3 r0 = (defpackage.dv3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dv3 r0 = new dv3
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.e11.e0(r8)
            goto L88
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r4
        L31:
            java.lang.String r7 = r0.a
            defpackage.e11.e0(r8)
            goto L5c
        L37:
            defpackage.e11.e0(r8)
            xu4 r8 = new xu4
            r8.<init>()
            j00 r1 = defpackage.yu4.a
            r7.getClass()
            rcb r1 = r8.a
            defpackage.scb.b(r1, r7)
            gu4 r1 = defpackage.gu4.b
            is4 r6 = r6.a
            rg2 r6 = defpackage.xv5.e(r8, r1, r8, r6)
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.H(r0)
            if (r8 != r5) goto L5c
            goto L87
        L5c:
            gv4 r8 = (defpackage.gv4) r8
            yv4 r6 = r8.e()
            boolean r6 = defpackage.rw1.Q(r6)
            if (r6 == 0) goto L93
            ks4 r6 = r8.p0()
            java.lang.Class<byte[]> r7 = byte[].class
            a91 r8 = defpackage.ug8.a(r7)
            fbb r7 = defpackage.ug8.d(r7)     // Catch: java.lang.Throwable -> L77
            goto L78
        L77:
            r7 = r4
        L78:
            bbb r1 = new bbb
            r1.<init>(r8, r7)
            r0.a = r4
            r0.d = r2
            java.lang.Object r8 = r6.a(r1, r0)
            if (r8 != r5) goto L88
        L87:
            return r5
        L88:
            if (r8 == 0) goto L8d
            byte[] r8 = (byte[]) r8
            return r8
        L8d:
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.ByteArray"
            defpackage.k27.n(r6)
            return r4
        L93:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            yv4 r8 = r8.e()
            int r8 = r8.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to download file: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = " (status="
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = ")"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv3.d(java.lang.String, kt1):java.io.Serializable");
    }
}

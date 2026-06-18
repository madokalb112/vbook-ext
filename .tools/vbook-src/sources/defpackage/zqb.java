package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class zqb {
    public static final Map a = y86.P(new xl7("m3u8", "application/x-mpegURL"), new xl7("m3u", "application/x-mpegURL"), new xl7("mpd", "application/dash+xml"), new xl7("mp4", "video/mp4"), new xl7("m4v", "video/mp4"), new xl7("webm", "video/webm"), new xl7("mkv", "video/x-matroska"), new xl7("mov", "video/quicktime"), new xl7("ts", "video/mp2t"));
    public static final Set b = fw.Q0(new String[]{"jpg", "jpeg", "png", "gif", "webp", "svg", "ico", "css", "woff", "woff2", "ttf", "otf", "eot"});

    public static final String a(List list) {
        Object obj;
        Object next;
        list.getClass();
        List listR0 = f39.r0(new vx3(new vx3(new r04((a39) new jc1(new i96(list), 0), (kb4) new elb(18)), true, new elb(19)), true, new elb(20)));
        Iterator it = listR0.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String lowerCase = bw9.v0(bw9.v0((String) next, '?'), '#').toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (iw9.C(lowerCase, ".m3u8", false)) {
                break;
            }
        }
        String str = (String) next;
        if (str != null) {
            return str;
        }
        Iterator it2 = listR0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            String lowerCase2 = bw9.v0(bw9.v0((String) next2, '?'), '#').toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            if (iw9.C(lowerCase2, ".mpd", false)) {
                obj = next2;
                break;
            }
        }
        String str2 = (String) obj;
        return str2 == null ? (String) fc1.z0(listR0) : str2;
    }

    public static final String b(String str) {
        str.getClass();
        return bw9.v0(bw9.v0(bw9.s0(str, "://", ""), '/'), '?');
    }

    public static final String c(String str) {
        String lowerCase = bw9.t0('.', bw9.v0(bw9.v0(str, '?'), '#'), "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.owb r5, defpackage.kt1 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.wqb
            if (r0 == 0) goto L13
            r0 = r6
            wqb r0 = (defpackage.wqb) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            wqb r0 = new wqb
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.b
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2d
            if (r1 != r3) goto L27
            defpackage.e11.e0(r6)
            goto L46
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r4
        L2d:
            defpackage.e11.e0(r6)
            aj2 r6 = defpackage.rw2.a
            fj4 r6 = defpackage.r76.a
            fj4 r6 = r6.f
            xqb r1 = new xqb
            r1.<init>(r5, r4, r2)
            r0.b = r3
            java.lang.Object r6 = defpackage.ah1.b0(r6, r1, r0)
            xx1 r5 = defpackage.xx1.a
            if (r6 != r5) goto L46
            return r5
        L46:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L87
            java.lang.CharSequence r5 = defpackage.bw9.B0(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "\""
            java.lang.String r5 = defpackage.bw9.k0(r5, r6)
            java.lang.String r5 = defpackage.bw9.l0(r5, r6)
            java.lang.String r6 = "\\/"
            java.lang.String r0 = "/"
            java.lang.String r5 = defpackage.iw9.H(r5, r2, r6, r0)
            java.lang.String r6 = "\\u0026"
            java.lang.String r0 = "&"
            java.lang.String r5 = defpackage.iw9.H(r5, r2, r6, r0)
            java.lang.CharSequence r6 = defpackage.bw9.B0(r5)
            java.lang.String r6 = r6.toString()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r0)
            r6.getClass()
            java.lang.String r0 = "blob:"
            boolean r6 = defpackage.iw9.K(r6, r0, r2)
            if (r6 == 0) goto L86
            goto L87
        L86:
            return r5
        L87:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zqb.d(owb, kt1):java.lang.Object");
    }

    public static final String e(String str) {
        String str2;
        return (f(str) && (str2 = (String) a.get(c(str))) != null) ? str2 : "";
    }

    public static final boolean f(String str) {
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return iw9.K(lowerCase, "http://", false) || iw9.K(lowerCase, "https://", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x007e: MOVE (r5 I:??[long, double]) = (r6 I:??[long, double]) (LINE:127), block:B:30:0x007e */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x00a9: MOVE (r16 I:??[long, double]) = (r6 I:??[long, double]) (LINE:170), block:B:38:0x00a9 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x007f: MOVE (r7 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:128), block:B:30:0x007e */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00ae: MOVE (r5 I:??[long, double]) = (r9 I:??[long, double]) (LINE:175), block:B:38:0x00a9 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079 A[PHI: r0 r2 r7 r10 r11 r13
  0x0079: PHI (r0v19 java.lang.Object) = (r0v16 java.lang.Object), (r0v1 java.lang.Object) binds: [B:60:0x01a1, B:27:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r2v21 ??) = (r2v39 ??), (r2v40 ??) binds: [B:60:0x01a1, B:27:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r7v10 owb) = (r7v26 owb), (r7v11 owb) binds: [B:60:0x01a1, B:27:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r10v12 java.lang.Object) = (r10v10 java.lang.Object), (r10v14 java.lang.Object) binds: [B:60:0x01a1, B:27:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r11v15 java.util.List) = (r11v13 java.util.List), (r11v16 java.util.List) binds: [B:60:0x01a1, B:27:0x0077] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r13v15 long) = (r13v11 long), (r13v16 long) binds: [B:60:0x01a1, B:27:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014d A[Catch: all -> 0x025f, PHI: r2 r6 r9 r10 r11 r13
  0x014d: PHI (r2v10 owb) = (r2v7 owb), (r2v11 owb) binds: [B:49:0x0149, B:41:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x014d: PHI (r6v10 long) = (r6v8 long), (r6v11 long) binds: [B:49:0x0149, B:41:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x014d: PHI (r9v10 java.util.List) = (r9v7 java.util.List), (r9v12 java.util.List) binds: [B:49:0x0149, B:41:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x014d: PHI (r10v4 ai1) = (r10v2 ai1), (r10v7 ai1) binds: [B:49:0x0149, B:41:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x014d: PHI (r11v7 java.lang.Object) = (r11v4 java.lang.Object), (r11v9 java.lang.Object) binds: [B:49:0x0149, B:41:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x014d: PHI (r13v4 long) = (r13v1 long), (r13v6 long) binds: [B:49:0x0149, B:41:0x00c0] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {all -> 0x025f, blocks: (B:55:0x016f, B:51:0x014d, B:48:0x0134), top: B:100:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01dc A[Catch: all -> 0x01d8, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01d8, blocks: (B:62:0x01a5, B:64:0x01a9, B:72:0x01dc, B:59:0x018c), top: B:96:0x018c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0230 A[PHI: r0 r2 r5 r7
  0x0230: PHI (r0v28 java.lang.Object) = (r0v27 java.lang.Object), (r0v1 java.lang.Object) binds: [B:80:0x022d, B:17:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x0230: PHI (r2v28 ??) = (r2v35 ??), (r2v36 ??) binds: [B:80:0x022d, B:17:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x0230: PHI (r5v12 ??) = (r5v16 ??), (r5v17 ??) binds: [B:80:0x022d, B:17:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x0230: PHI (r7v17 owb) = (r7v21 owb), (r7v22 owb) binds: [B:80:0x022d, B:17:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0258 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028d  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [yb4] */
    /* JADX WARN: Type inference failed for: r24v0, types: [yb4] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17, types: [long] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [long] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [long] */
    /* JADX WARN: Type inference failed for: r2v26, types: [long] */
    /* JADX WARN: Type inference failed for: r2v28, types: [long] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10, types: [long] */
    /* JADX WARN: Type inference failed for: r5v12, types: [long] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [long] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r8v0, types: [jt1] */
    /* JADX WARN: Type inference failed for: r8v1, types: [ai1, java.lang.Object, java.util.List, jt1, o1a, owb] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(long r20, long r22, defpackage.yb4 r24, defpackage.kt1 r25) {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zqb.g(long, long, yb4, kt1):java.lang.Object");
    }
}

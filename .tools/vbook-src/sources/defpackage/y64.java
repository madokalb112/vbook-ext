package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class y64 implements u64 {
    public final is4 a;
    public final dt b;

    public y64(is4 is4Var, dt dtVar) {
        this.a = is4Var;
        this.b = dtVar;
    }

    public final void a(String str) {
        try {
            oh5 oh5Var = gx3.a;
            oh5Var.R(zn7.f(zn7.f(zn7.f(qu1.d0(oh5Var), "resources"), "fonts"), str), false);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:7))(0)|8|59|(1:(1:(5:12|13|(6:34|64|35|62|36|(1:46)(1:47))(2:48|49)|52|(1:66)(2:55|56))(2:15|16))(3:17|18|19))(3:20|21|(2:23|31)(1:24))|25|60|26|29|(4:32|(0)(0)|52|(0)(0))|31|(1:(1:58))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[Catch: all -> 0x00e6, TRY_LEAVE, TryCatch #1 {all -> 0x00e6, blocks: (B:13:0x002e, B:34:0x00b2, B:46:0x00da, B:47:0x00dd, B:44:0x00d5, B:48:0x00de, B:49:0x00e5, B:18:0x003f, B:25:0x008b, B:29:0x009b, B:21:0x0049, B:41:0x00d0, B:35:0x00c6), top: B:59:0x0024, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00de A[Catch: all -> 0x00e6, TryCatch #1 {all -> 0x00e6, blocks: (B:13:0x002e, B:34:0x00b2, B:46:0x00da, B:47:0x00dd, B:44:0x00d5, B:48:0x00de, B:49:0x00e5, B:18:0x003f, B:25:0x008b, B:29:0x009b, B:21:0x0049, B:41:0x00d0, B:35:0x00c6), top: B:59:0x0024, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(java.lang.String r11, java.lang.String r12, defpackage.kt1 r13) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y64.b(java.lang.String, java.lang.String, kt1):java.io.Serializable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v6, types: [lc3] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    public final ArrayList c() {
        ?? arrayList;
        zn7 zn7VarF = zn7.f(zn7.f(qu1.d0(gx3.a), "resources"), "fonts");
        List listZ = gc1.Z(new q26("Inter", "font/Inter.ttf"), new q26("Nunito", "font/Nunito.ttf"), new q26("Literata", "font/Literata.otf"));
        ArrayList arrayListU0 = oh5.U0(zn7VarF, false);
        if (arrayListU0 != null) {
            List listR0 = fc1.R0(new k54(27), arrayListU0);
            arrayList = new ArrayList(gc1.M(listR0, 10));
            Iterator it = listR0.iterator();
            while (it.hasNext()) {
                String strB = ((zn7) it.next()).b();
                arrayList.add(new q26(j39.l("\\.(ttf|otf)", strB, ""), "resources/fonts/".concat(strB)));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = lc3.a;
        }
        return fc1.I0(listZ, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (r11 == r5) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v2, types: [pm8] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.kt1 r11) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y64.d(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(defpackage.bi5 r6, defpackage.kt1 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.x64
            if (r0 == 0) goto L13
            r0 = r7
            x64 r0 = (defpackage.x64) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            x64 r0 = new x64
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.c
            int r7 = r0.e
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L30
            if (r7 != r1) goto L2a
            zn7 r6 = r0.b
            bi5 r7 = r0.a
            defpackage.e11.e0(r5)     // Catch: java.lang.Throwable -> L8b
            goto L5a
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r2
        L30:
            defpackage.e11.e0(r5)
            oh5 r5 = defpackage.gx3.a     // Catch: java.lang.Throwable -> L8b
            zn7 r7 = defpackage.qu1.d0(r5)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = "resources"
            zn7 r7 = defpackage.zn7.f(r7, r3)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = "fonts"
            zn7 r7 = defpackage.zn7.f(r7, r3)     // Catch: java.lang.Throwable -> L8b
            r5.A(r7)     // Catch: java.lang.Throwable -> L8b
            r0.a = r6     // Catch: java.lang.Throwable -> L8b
            r0.b = r7     // Catch: java.lang.Throwable -> L8b
            r0.e = r1     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r5 = r6.a(r0)     // Catch: java.lang.Throwable -> L8b
            xx1 r0 = defpackage.xx1.a
            if (r5 != r0) goto L57
            return r0
        L57:
            r4 = r7
            r7 = r6
            r6 = r4
        L5a:
            byte[] r5 = (byte[]) r5     // Catch: java.lang.Throwable -> L8b
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L8b
            zn7 r6 = defpackage.zn7.f(r6, r7)     // Catch: java.lang.Throwable -> L8b
            oh5 r7 = defpackage.gx3.a     // Catch: java.lang.Throwable -> L8b
            r7.getClass()     // Catch: java.lang.Throwable -> L8b
            r0 = 0
            ag9 r6 = r7.O0(r6, r0)     // Catch: java.lang.Throwable -> L8b
            he8 r7 = new he8     // Catch: java.lang.Throwable -> L8b
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L8b
            r7.write(r5)     // Catch: java.lang.Throwable -> L7c
            r7.close()     // Catch: java.lang.Throwable -> L7a
            goto L85
        L7a:
            r2 = move-exception
            goto L85
        L7c:
            r2 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L81
            goto L85
        L81:
            r5 = move-exception
            i12.r(r2, r5)     // Catch: java.lang.Throwable -> L8b
        L85:
            if (r2 != 0) goto L8a
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8b
            goto L92
        L8a:
            throw r2     // Catch: java.lang.Throwable -> L8b
        L8b:
            r5 = move-exception
            pm8 r6 = new pm8
            r6.<init>(r5)
            r5 = r6
        L92:
            java.lang.Throwable r6 = defpackage.qm8.a(r5)
            if (r6 != 0) goto L99
            goto L9b
        L99:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L9b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y64.e(bi5, kt1):java.io.Serializable");
    }
}

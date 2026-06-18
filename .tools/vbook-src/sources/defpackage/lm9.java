package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lm9 {
    public final wa2 a;
    public final k80 b;
    public final d6a c;

    public lm9(wa2 wa2Var, sv8 sv8Var) {
        sv8Var.getClass();
        this.a = wa2Var;
        this.b = sv8Var.a(wa2Var);
        this.c = new d6a(new o39(this, 9));
    }

    public static boolean m(fg5 fg5Var) {
        mf5 mf5Var = (mf5) fg5Var.get("code");
        if (mf5Var == null) {
            return false;
        }
        jg5 jg5VarL = i12.L(mf5Var);
        Integer numD = jg5VarL != null ? nf5.d(jg5VarL) : null;
        return numD != null && numD.intValue() == 0;
    }

    public static String n(String str, String str2) {
        return (str.length() == 0 || iw9.K(str, "https", false) || iw9.K(str, "http", false)) ? str : dx1.h(bw9.E0(str2, '/'), "/", bw9.G0(str, '/'));
    }

    public static String o(String str) {
        return (iw9.K(str, "https://", false) || iw9.K(str, "http://", false)) ? bw9.E0(str, '/') : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.em8 p(defpackage.fg5 r5) {
        /*
            java.lang.String r0 = "code"
            java.lang.Object r0 = r5.get(r0)
            mf5 r0 = (defpackage.mf5) r0
            r1 = 0
            if (r0 == 0) goto L1e
            jg5 r0 = i12.L(r0)
            if (r0 == 0) goto L16
            java.lang.Integer r0 = defpackage.nf5.d(r0)
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 == 0) goto L1e
            int r0 = r0.intValue()
            goto L1f
        L1e:
            r0 = 1
        L1f:
            java.lang.String r2 = "data"
            java.lang.Object r2 = r5.get(r2)
            mf5 r2 = (defpackage.mf5) r2
            if (r2 == 0) goto L2e
            java.lang.String r2 = i12.G(r2)
            goto L2f
        L2e:
            r2 = r1
        L2f:
            java.lang.String r3 = ""
            if (r2 != 0) goto L34
            r2 = r3
        L34:
            java.lang.String r4 = "data2"
            java.lang.Object r5 = r5.get(r4)
            mf5 r5 = (defpackage.mf5) r5
            if (r5 == 0) goto L42
            java.lang.String r1 = i12.G(r5)
        L42:
            if (r1 != 0) goto L45
            goto L46
        L45:
            r3 = r1
        L46:
            em8 r5 = new em8
            r5.<init>(r0, r3, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm9.p(fg5):em8");
    }

    public static qm9 q(fg5 fg5Var) {
        mf5 mf5Var = (mf5) fg5Var.get("type");
        String strG = mf5Var != null ? i12.G(mf5Var) : null;
        if (strG == null) {
            strG = "";
        }
        String lowerCase = strG.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (lowerCase.length() == 0) {
            return null;
        }
        mf5 mf5Var2 = (mf5) fg5Var.get("script");
        String strG2 = mf5Var2 != null ? i12.G(mf5Var2) : null;
        if (strG2 == null) {
            strG2 = "";
        }
        mf5 mf5Var3 = (mf5) fg5Var.get("input");
        String strG3 = mf5Var3 != null ? i12.G(mf5Var3) : null;
        if (strG3 == null) {
            strG3 = "";
        }
        mf5 mf5Var4 = (mf5) fg5Var.get("data");
        String strG4 = mf5Var4 != null ? i12.G(mf5Var4) : null;
        return new qm9(lowerCase, strG2, strG3, strG4 != null ? strG4 : "");
    }

    public static fn9 t(fg5 fg5Var) {
        mf5 mf5Var = (mf5) fg5Var.get("title");
        String strG = mf5Var != null ? i12.G(mf5Var) : null;
        if (strG == null) {
            strG = "";
        }
        mf5 mf5Var2 = (mf5) fg5Var.get("input");
        String strG2 = mf5Var2 != null ? i12.G(mf5Var2) : null;
        if (strG2 == null) {
            strG2 = "";
        }
        mf5 mf5Var3 = (mf5) fg5Var.get("script");
        String strG3 = mf5Var3 != null ? i12.G(mf5Var3) : null;
        return new fn9(strG, strG2, strG3 != null ? strG3 : "");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, defpackage.kt1 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.am9
            if (r0 == 0) goto L13
            r0 = r8
            am9 r0 = (defpackage.am9) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            am9 r0 = new am9
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            xx1 r1 = defpackage.xx1.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L28
            defpackage.e11.e0(r8)     // Catch: java.lang.Throwable -> L49
            goto L40
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r4
        L2e:
            defpackage.e11.e0(r8)
            k80 r5 = r5.b     // Catch: java.lang.Throwable -> L49
            java.lang.String[] r7 = new java.lang.String[]{r7}     // Catch: java.lang.Throwable -> L49
            r0.c = r3     // Catch: java.lang.Throwable -> L49
            java.lang.Object r8 = r5.a(r6, r4, r7, r0)     // Catch: java.lang.Throwable -> L49
            if (r8 != r1) goto L40
            return r1
        L40:
            if (r8 == 0) goto L43
            return r8
        L43:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L49
            r5.<init>()     // Catch: java.lang.Throwable -> L49
            throw r5     // Catch: java.lang.Throwable -> L49
        L49:
            r5 = move-exception
            java.lang.String r6 = r5.getMessage()
            if (r6 != 0) goto L52
            java.lang.String r6 = ""
        L52:
            boolean r7 = defpackage.pu.a()
            if (r7 == 0) goto L6b
            e46 r7 = e46.b
            k89 r8 = k89.c
            bh5 r0 = r7.a
            k89 r0 = r0.a
            int r0 = r0.compareTo(r8)
            if (r0 > 0) goto L6b
            java.lang.String r0 = "Log"
            r7.a(r8, r0, r6, r5)
        L6b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm9.a(java.lang.String, java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(java.lang.String r14, defpackage.kt1 r15) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm9.b(java.lang.String, kt1):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, java.lang.String r9, java.lang.String r10, defpackage.kt1 r11) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm9.c(java.lang.String, java.lang.String, java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r7, defpackage.kt1 r8) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm9.d(java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:148:0x02c6. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r28, defpackage.kt1 r29) {
        /*
            Method dump skipped, instruction units count: 1238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm9.e(java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8, types: [lc3] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.kt1 r15) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm9.f(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(defpackage.kt1 r9) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm9.g(kt1):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(defpackage.kt1 r9) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm9.h(kt1):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r6, java.lang.String r7, java.lang.String r8, defpackage.kt1 r9) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm9.i(java.lang.String, java.lang.String, java.lang.String, kt1):java.lang.Object");
    }

    public final ar3 j() {
        return (ar3) this.c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r7, defpackage.kt1 r8) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm9.k(java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04d7 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:16:0x0047, B:245:0x042c, B:276:0x04cf, B:278:0x04d7, B:279:0x04d9, B:285:0x04ed, B:286:0x0504, B:288:0x050a, B:289:0x051d, B:23:0x0061, B:275:0x04cb, B:26:0x0072, B:257:0x0468, B:27:0x0077, B:34:0x009b, B:36:0x00af, B:38:0x00b7, B:43:0x00c1, B:45:0x00c9, B:48:0x00d1, B:50:0x00d9, B:53:0x00e4, B:55:0x00ee, B:58:0x00f7, B:60:0x0101, B:67:0x0110, B:69:0x0118, B:70:0x0137, B:72:0x013d, B:75:0x0158, B:82:0x0168, B:84:0x0172, B:86:0x0178, B:87:0x0185, B:89:0x018b, B:138:0x0270, B:92:0x01a3, B:94:0x01ab, B:99:0x01b9, B:102:0x01c0, B:104:0x01c8, B:105:0x01ed, B:107:0x01f3, B:110:0x0210, B:115:0x0225, B:117:0x022d, B:122:0x023b, B:124:0x0243, B:129:0x0251, B:131:0x0259, B:136:0x0267, B:145:0x0298, B:147:0x02a2, B:151:0x02ac, B:159:0x02f4, B:161:0x02fe, B:163:0x0304, B:164:0x030f, B:166:0x0315, B:202:0x0389, B:169:0x0329, B:171:0x0331, B:175:0x033b, B:178:0x0342, B:180:0x034c, B:186:0x035b, B:188:0x0363, B:194:0x0372, B:196:0x037a, B:200:0x0384, B:208:0x039a, B:210:0x03a4, B:215:0x03b0, B:217:0x03ba, B:221:0x03c4, B:229:0x03e0, B:235:0x03f7, B:237:0x03ff, B:241:0x0410, B:247:0x0434, B:249:0x0440, B:253:0x0451, B:258:0x046b, B:262:0x047b, B:264:0x0496, B:266:0x049f, B:269:0x04a8, B:270:0x04af, B:271:0x04b0, B:291:0x0529, B:292:0x0530, B:293:0x0531, B:294:0x0536, B:224:0x03cc, B:226:0x03d2, B:154:0x02bf, B:156:0x02c5, B:297:0x053a, B:298:0x053f, B:30:0x007e), top: B:312:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x050a A[Catch: all -> 0x004c, LOOP:0: B:286:0x0504->B:288:0x050a, LOOP_END, TryCatch #0 {all -> 0x004c, blocks: (B:16:0x0047, B:245:0x042c, B:276:0x04cf, B:278:0x04d7, B:279:0x04d9, B:285:0x04ed, B:286:0x0504, B:288:0x050a, B:289:0x051d, B:23:0x0061, B:275:0x04cb, B:26:0x0072, B:257:0x0468, B:27:0x0077, B:34:0x009b, B:36:0x00af, B:38:0x00b7, B:43:0x00c1, B:45:0x00c9, B:48:0x00d1, B:50:0x00d9, B:53:0x00e4, B:55:0x00ee, B:58:0x00f7, B:60:0x0101, B:67:0x0110, B:69:0x0118, B:70:0x0137, B:72:0x013d, B:75:0x0158, B:82:0x0168, B:84:0x0172, B:86:0x0178, B:87:0x0185, B:89:0x018b, B:138:0x0270, B:92:0x01a3, B:94:0x01ab, B:99:0x01b9, B:102:0x01c0, B:104:0x01c8, B:105:0x01ed, B:107:0x01f3, B:110:0x0210, B:115:0x0225, B:117:0x022d, B:122:0x023b, B:124:0x0243, B:129:0x0251, B:131:0x0259, B:136:0x0267, B:145:0x0298, B:147:0x02a2, B:151:0x02ac, B:159:0x02f4, B:161:0x02fe, B:163:0x0304, B:164:0x030f, B:166:0x0315, B:202:0x0389, B:169:0x0329, B:171:0x0331, B:175:0x033b, B:178:0x0342, B:180:0x034c, B:186:0x035b, B:188:0x0363, B:194:0x0372, B:196:0x037a, B:200:0x0384, B:208:0x039a, B:210:0x03a4, B:215:0x03b0, B:217:0x03ba, B:221:0x03c4, B:229:0x03e0, B:235:0x03f7, B:237:0x03ff, B:241:0x0410, B:247:0x0434, B:249:0x0440, B:253:0x0451, B:258:0x046b, B:262:0x047b, B:264:0x0496, B:266:0x049f, B:269:0x04a8, B:270:0x04af, B:271:0x04b0, B:291:0x0529, B:292:0x0530, B:293:0x0531, B:294:0x0536, B:224:0x03cc, B:226:0x03d2, B:154:0x02bf, B:156:0x02c5, B:297:0x053a, B:298:0x053f, B:30:0x007e), top: B:312:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r26v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r30, defpackage.kt1 r31) {
        /*
            Method dump skipped, instruction units count: 1388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm9.l(java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rm9 r(defpackage.fg5 r11) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm9.r(fg5):rm9");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.an9 s(defpackage.fg5 r10) {
        /*
            r9 = this;
            java.lang.String r0 = "host"
            java.lang.Object r0 = r10.get(r0)
            mf5 r0 = (defpackage.mf5) r0
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.String r0 = i12.G(r0)
            goto L11
        L10:
            r0 = r1
        L11:
            java.lang.String r2 = ""
            if (r0 != 0) goto L16
            r0 = r2
        L16:
            int r3 = r0.length()
            if (r3 != 0) goto L20
            wa2 r9 = r9.a
            java.lang.String r0 = r9.e
        L20:
            java.lang.String r9 = "name"
            java.lang.Object r9 = r10.get(r9)
            mf5 r9 = (defpackage.mf5) r9
            if (r9 == 0) goto L2f
            java.lang.String r9 = i12.G(r9)
            goto L30
        L2f:
            r9 = r1
        L30:
            if (r9 != 0) goto L34
            r4 = r2
            goto L35
        L34:
            r4 = r9
        L35:
            java.lang.String r9 = "cover"
            java.lang.Object r9 = r10.get(r9)
            mf5 r9 = (defpackage.mf5) r9
            if (r9 == 0) goto L54
            java.lang.String r9 = i12.G(r9)
            if (r9 == 0) goto L54
            boolean r3 = defpackage.bw9.a0(r9)
            if (r3 != 0) goto L4c
            goto L4d
        L4c:
            r9 = r1
        L4d:
            if (r9 == 0) goto L54
            java.lang.String r9 = n(r9, r0)
            goto L55
        L54:
            r9 = r1
        L55:
            if (r9 != 0) goto L59
            r5 = r2
            goto L5a
        L59:
            r5 = r9
        L5a:
            java.lang.String r9 = "link"
            java.lang.Object r9 = r10.get(r9)
            mf5 r9 = (defpackage.mf5) r9
            if (r9 == 0) goto L69
            java.lang.String r9 = i12.G(r9)
            goto L6a
        L69:
            r9 = r1
        L6a:
            if (r9 != 0) goto L6d
            r9 = r2
        L6d:
            java.lang.CharSequence r9 = defpackage.bw9.B0(r9)
            java.lang.String r9 = r9.toString()
            java.lang.String r6 = n(r9, r0)
            java.lang.String r9 = "description"
            java.lang.Object r9 = r10.get(r9)
            mf5 r9 = (defpackage.mf5) r9
            if (r9 == 0) goto L88
            java.lang.String r9 = i12.G(r9)
            goto L89
        L88:
            r9 = r1
        L89:
            if (r9 != 0) goto L8d
            r7 = r2
            goto L8e
        L8d:
            r7 = r9
        L8e:
            java.lang.String r9 = "tag"
            java.lang.Object r9 = r10.get(r9)
            mf5 r9 = (defpackage.mf5) r9
            if (r9 == 0) goto L9c
            java.lang.String r1 = i12.G(r9)
        L9c:
            if (r1 != 0) goto La0
            r8 = r2
            goto La1
        La0:
            r8 = r1
        La1:
            an9 r3 = new an9
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm9.s(fg5):an9");
    }
}

package defpackage;

import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cq3 implements qp3 {
    public final m62 a;
    public final qt b;
    public final is4 c;
    public final ym3 d;
    public final fr9 e = gr9.a(null);

    public cq3(m62 m62Var, qt qtVar, is4 is4Var, ym3 ym3Var) {
        this.a = m62Var;
        this.b = qtVar;
        this.c = is4Var;
        this.d = ym3Var;
    }

    public final void a(String str) {
        m62 m62Var = this.a;
        b92 b92Var = m62Var.x;
        b92Var.getClass();
        str.getClass();
        ((qj) ((yf1) b92Var).a).q(-1605821191, "DELETE FROM DbExtension\nWHERE id = ?", new e82(str, 11));
        b92Var.w(-1605821191, new sa2(16));
        m62Var.y.M(str);
        this.d.b(str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:(1:(1:(3:14|33|34)(2:15|16))(2:17|(1:30)(2:35|36)))(1:18))(3:19|(0)|32)|22|37|23|26|(1:(0)(0))|32) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        if (defpackage.oo3.a.b(r9.a, r3, r10, false, r6, r7) == r8) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r10, defpackage.kt1 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.rp3
            if (r0 == 0) goto L14
            r0 = r11
            rp3 r0 = (defpackage.rp3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            rp3 r0 = new rp3
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r7.b
            int r0 = r7.d
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            xx1 r8 = defpackage.xx1.a
            if (r0 == 0) goto L43
            if (r0 == r3) goto L3d
            if (r0 == r2) goto L37
            if (r0 != r1) goto L31
            defpackage.e11.e0(r11)
            goto La8
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            return r4
        L37:
            java.lang.String r10 = r7.a
            defpackage.e11.e0(r11)
            goto L8a
        L3d:
            java.lang.String r10 = r7.a
            defpackage.e11.e0(r11)
            goto L68
        L43:
            defpackage.e11.e0(r11)
            xu4 r11 = new xu4
            r11.<init>()
            j00 r0 = defpackage.yu4.a
            r10.getClass()
            rcb r0 = r11.a
            defpackage.scb.b(r0, r10)
            gu4 r0 = defpackage.gu4.b
            is4 r5 = r9.c
            rg2 r11 = defpackage.xv5.e(r11, r0, r11, r5)
            r7.a = r10
            r7.d = r3
            java.lang.Object r11 = r11.H(r7)
            if (r11 != r8) goto L68
            goto La7
        L68:
            gv4 r11 = (defpackage.gv4) r11
            ks4 r11 = r11.p0()
            java.lang.Class<byte[]> r0 = byte[].class
            a91 r3 = defpackage.ug8.a(r0)
            fbb r0 = defpackage.ug8.d(r0)     // Catch: java.lang.Throwable -> L79
            goto L7a
        L79:
            r0 = r4
        L7a:
            bbb r5 = new bbb
            r5.<init>(r3, r0)
            r7.a = r10
            r7.d = r2
            java.lang.Object r11 = r11.a(r5, r7)
            if (r11 != r8) goto L8a
            goto La7
        L8a:
            if (r11 == 0) goto Lab
            r6 = r11
            byte[] r6 = (byte[]) r6
            byte[] r11 = defpackage.iw9.B(r10)
            java.lang.String r3 = defpackage.cx1.i0(r11)
            r7.a = r4
            r7.d = r1
            oo3 r1 = defpackage.oo3.a
            m62 r2 = r9.a
            r5 = 0
            r4 = r10
            java.lang.Object r9 = r1.b(r2, r3, r4, r5, r6, r7)
            if (r9 != r8) goto La8
        La7:
            return r8
        La8:
            heb r9 = defpackage.heb.a
            return r9
        Lab:
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.ByteArray"
            defpackage.k27.n(r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq3.b(java.lang.String, kt1):java.lang.Object");
    }

    public final Object c(String str, o1a o1aVar) {
        Object next;
        Object pm8Var;
        Iterator it = this.a.x.c0().c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            boolean zBooleanValue = false;
            try {
                String str2 = ((re4) next).b;
                str2.getClass();
                Pattern patternCompile = Pattern.compile(str2);
                patternCompile.getClass();
                str.getClass();
                boolean z = true;
                if (!patternCompile.matcher(str).matches()) {
                    String strE0 = iw9.K(str, "https://", false) ? bw9.E0(bw9.k0(str, "https://"), '/') : iw9.K(str, "http://", false) ? bw9.E0(bw9.k0(str, "http://"), '/') : bw9.E0(str, '/');
                    strE0.getClass();
                    if (!patternCompile.matcher(strE0).matches()) {
                        z = false;
                    }
                }
                pm8Var = Boolean.valueOf(z);
            } catch (Throwable th) {
                pm8Var = new pm8(th);
            }
            if (pm8Var instanceof pm8) {
                pm8Var = null;
            }
            Boolean bool = (Boolean) pm8Var;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            if (zBooleanValue) {
                break;
            }
        }
        re4 re4Var = (re4) next;
        String str3 = re4Var != null ? re4Var.a : null;
        if (str3 != null) {
            return cx1.P(e(str3), o1aVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0034, B:31:0x009b, B:33:0x00af, B:34:0x00b9, B:36:0x00bf, B:38:0x00d3, B:41:0x00dc, B:48:0x00eb, B:50:0x00f5, B:52:0x00fb, B:55:0x0100, B:57:0x0106, B:59:0x0114, B:62:0x011d, B:66:0x0126, B:82:0x0161, B:84:0x0173, B:87:0x017c, B:91:0x0185, B:93:0x018f, B:96:0x0198, B:100:0x01a1, B:102:0x01ab, B:104:0x01b5, B:106:0x01be, B:108:0x01c6, B:111:0x01cf, B:115:0x01d8, B:117:0x01e4, B:123:0x020e, B:125:0x0216, B:128:0x021f, B:133:0x022a, B:135:0x0234, B:138:0x023d, B:143:0x024a, B:145:0x0252, B:147:0x0260, B:148:0x0264, B:150:0x0270, B:153:0x0279, B:155:0x027f, B:157:0x0285, B:160:0x0290, B:166:0x029f, B:170:0x02b1, B:172:0x02c4, B:175:0x02cd, B:180:0x02da, B:119:0x01f2, B:121:0x01f8, B:122:0x0205, B:78:0x015a, B:81:0x015f, B:77:0x0155, B:69:0x013d, B:20:0x004b, B:27:0x007f, B:23:0x0052, B:74:0x014a), top: B:194:0x002a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r11v12, types: [f36] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3, types: [pm8] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(java.lang.String r31, defpackage.kt1 r32) {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq3.d(java.lang.String, kt1):java.io.Serializable");
    }

    public final wp3 e(String str) {
        str.getClass();
        pp1 pp1VarR = qx1.R(this.a.x.T(str));
        aj2 aj2Var = rw2.a;
        return new wp3(qx1.G(pp1VarR, nh2.c), 0);
    }

    public final kb3 f() {
        b92 b92Var = this.a.x;
        b92Var.getClass();
        ib2 ib2Var = ib2.a;
        qj qjVar = (qj) ((yf1) b92Var).a;
        int i = 2;
        bb2 bb2Var = new bb2(b92Var, i);
        qjVar.getClass();
        pp1 pp1VarR = qx1.R(new af9(1737905505, new String[]{"DbExtension"}, qjVar, "DbExtension.sq", "getReadExtension", "SELECT id, name, author, version, source, path, description, language, type, nsfw, development, draft, pinedAt, updateAt\nFROM DbExtension\nWHERE draft = 0 AND (type = 1 OR type = 2 OR type = 3 OR type = 4)\nORDER BY pinedAt DESC, lastUse DESC, updateAt DESC", bb2Var));
        aj2 aj2Var = rw2.a;
        return new kb3(qx1.E(pp1VarR, nh2.c), i);
    }

    public final kb3 g() {
        b92 b92Var = this.a.x;
        b92Var.getClass();
        kb2 kb2Var = kb2.a;
        qj qjVar = (qj) ((yf1) b92Var).a;
        bb2 bb2Var = new bb2(b92Var, 1);
        qjVar.getClass();
        pp1 pp1VarR = qx1.R(new af9(-843918732, new String[]{"DbExtension"}, qjVar, "DbExtension.sq", "getTTSExtension", "SELECT id, name, author, version, source, path, description, language, type, nsfw, development, draft, pinedAt, updateAt\nFROM DbExtension\nWHERE draft = 0 AND type = 5\nORDER BY pinedAt DESC, lastUse DESC, updateAt DESC", bb2Var));
        aj2 aj2Var = rw2.a;
        return new kb3(qx1.E(pp1VarR, nh2.c), 3);
    }

    public final to3 h() {
        wa2 wa2Var;
        qt qtVar = this.b;
        da7 da7Var = qtVar.O;
        ni5[] ni5VarArr = qt.T;
        String str = (String) da7Var.c(ni5VarArr[41], qtVar);
        int length = str.length();
        fr9 fr9Var = this.e;
        m62 m62Var = this.a;
        if (length > 0 && (wa2Var = (wa2) m62Var.x.T(str).e()) != null) {
            fr9Var.k(wa2Var.a);
            return ww1.l0(wa2Var);
        }
        b92 b92Var = m62Var.x;
        b92Var.getClass();
        db2 db2Var = db2.a;
        qj qjVar = (qj) ((yf1) b92Var).a;
        bb2 bb2Var = new bb2(b92Var, 4);
        qjVar.getClass();
        wa2 wa2Var2 = (wa2) new af9(222553226, new String[]{"DbExtension"}, qjVar, "DbExtension.sq", "findLastUse", "SELECT DbExtension.id, DbExtension.name, DbExtension.author, DbExtension.version, DbExtension.source, DbExtension.path, DbExtension.regex, DbExtension.icon, DbExtension.description, DbExtension.language, DbExtension.type, DbExtension.nsfw, DbExtension.development, DbExtension.draft, DbExtension.encrypt, DbExtension.scriptMetadata, DbExtension.settingMetadata, DbExtension.scriptData, DbExtension.settingData, DbExtension.translateData, DbExtension.pinedAt, DbExtension.lastUse, DbExtension.createAt, DbExtension.updateAt\nFROM DbExtension\nWHERE draft = 0 AND (type = 1 OR type = 2 OR type = 3 OR type = 4)\nORDER BY lastUse DESC\nLIMIT 1", bb2Var).e();
        if (wa2Var2 == null) {
            return null;
        }
        String str2 = wa2Var2.a;
        str2.getClass();
        da7Var.e(ni5VarArr[41], str2);
        fr9Var.getClass();
        fr9Var.l(null, str2);
        return ww1.l0(wa2Var2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e20 */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r11 == r8) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.bi5 r10, defpackage.kt1 r11) throws e20 {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.aq3
            if (r0 == 0) goto L14
            r0 = r11
            aq3 r0 = (defpackage.aq3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            aq3 r0 = new aq3
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r7.b
            int r0 = r7.d
            r1 = 2
            r2 = 1
            r3 = 0
            xx1 r8 = defpackage.xx1.a
            if (r0 == 0) goto L39
            if (r0 == r2) goto L33
            if (r0 != r1) goto L2d
            defpackage.e11.e0(r11)
            goto L6b
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            return r3
        L33:
            bi5 r10 = r7.a
            defpackage.e11.e0(r11)
            goto L47
        L39:
            defpackage.e11.e0(r11)
            r7.a = r10
            r7.d = r2
            java.lang.Object r11 = r10.a(r7)
            if (r11 != r8) goto L47
            goto L6a
        L47:
            r6 = r11
            byte[] r6 = (byte[]) r6
            java.lang.String r11 = r10.b()
            byte[] r11 = defpackage.iw9.B(r11)
            java.lang.String r11 = defpackage.cx1.i0(r11)
            java.lang.String r4 = r10.b()
            r7.a = r3
            r7.d = r1
            oo3 r1 = defpackage.oo3.a
            m62 r2 = r9.a
            r5 = 1
            r3 = r11
            java.lang.Object r11 = r1.b(r2, r3, r4, r5, r6, r7)
            if (r11 != r8) goto L6b
        L6a:
            return r8
        L6b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r9 = r11.booleanValue()
            if (r9 == 0) goto L76
            heb r9 = defpackage.heb.a
            return r9
        L76:
            e20 r9 = new e20
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq3.i(bi5, kt1):java.lang.Object");
    }

    public final void j(String str, boolean z) {
        b92 b92Var = this.a.x;
        long jC = z ? r95.a.k().c() : 0L;
        b92Var.getClass();
        str.getClass();
        ((qj) ((yf1) b92Var).a).q(1129385223, "UPDATE DbExtension\nSET pinedAt = ?\nWHERE id = ?", new d82(6, str, jC));
        b92Var.w(1129385223, new sa2(21));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|49|(1:(1:(1:(4:13|40|44|(1:52)(2:47|48))(2:17|18))(3:19|20|(1:37)(2:41|42)))(2:22|23))(4:25|26|(1:28)|39)|29|50|30|33|(1:35)(1:(0)(0))|39) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
    
        if (r10 == r7) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:40:0x00ab, B:20:0x003e, B:37:0x009a, B:41:0x00ae, B:42:0x00b5, B:23:0x0046, B:29:0x0076, B:33:0x0086, B:26:0x004d), top: B:49:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:40:0x00ab, B:20:0x003e, B:37:0x009a, B:41:0x00ae, B:42:0x00b5, B:23:0x0046, B:29:0x0076, B:33:0x0086, B:26:0x004d), top: B:49:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r9, defpackage.kt1 r10) {
        /*
            r8 = this;
            java.lang.Class<byte[]> r0 = byte[].class
            boolean r1 = r10 instanceof defpackage.bq3
            if (r1 == 0) goto L15
            r1 = r10
            bq3 r1 = (defpackage.bq3) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.e = r2
            goto L1a
        L15:
            bq3 r1 = new bq3
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.c
            int r2 = r1.e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            xx1 r7 = defpackage.xx1.a
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L34
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L31
            goto Lab
        L31:
            r8 = move-exception
            goto Lb6
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r6
        L3a:
            int r8 = r1.b
            java.lang.String r9 = r1.a
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L31
            goto L98
        L42:
            int r8 = r1.b
            java.lang.String r9 = r1.a
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L31
            goto L76
        L4a:
            defpackage.e11.e0(r10)
            is4 r8 = r8.c     // Catch: java.lang.Throwable -> L31
            xu4 r10 = new xu4     // Catch: java.lang.Throwable -> L31
            r10.<init>()     // Catch: java.lang.Throwable -> L31
            j00 r2 = defpackage.yu4.a     // Catch: java.lang.Throwable -> L31
            r9.getClass()     // Catch: java.lang.Throwable -> L31
            rcb r2 = r10.a     // Catch: java.lang.Throwable -> L31
            defpackage.scb.b(r2, r9)     // Catch: java.lang.Throwable -> L31
            gu4 r2 = defpackage.gu4.b     // Catch: java.lang.Throwable -> L31
            r10.d(r2)     // Catch: java.lang.Throwable -> L31
            rg2 r2 = new rg2     // Catch: java.lang.Throwable -> L31
            r2.<init>(r10, r8)     // Catch: java.lang.Throwable -> L31
            r1.a = r9     // Catch: java.lang.Throwable -> L31
            r8 = 0
            r1.b = r8     // Catch: java.lang.Throwable -> L31
            r1.e = r5     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = r2.H(r1)     // Catch: java.lang.Throwable -> L31
            if (r10 != r7) goto L76
            goto Laa
        L76:
            gv4 r10 = (defpackage.gv4) r10     // Catch: java.lang.Throwable -> L31
            ks4 r10 = r10.p0()     // Catch: java.lang.Throwable -> L31
            a91 r2 = defpackage.ug8.a(r0)     // Catch: java.lang.Throwable -> L31
            fbb r0 = defpackage.ug8.d(r0)     // Catch: java.lang.Throwable -> L85
            goto L86
        L85:
            r0 = r6
        L86:
            bbb r5 = new bbb     // Catch: java.lang.Throwable -> L31
            r5.<init>(r2, r0)     // Catch: java.lang.Throwable -> L31
            r1.a = r9     // Catch: java.lang.Throwable -> L31
            r1.b = r8     // Catch: java.lang.Throwable -> L31
            r1.e = r4     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = r10.a(r5, r1)     // Catch: java.lang.Throwable -> L31
            if (r10 != r7) goto L98
            goto Laa
        L98:
            if (r10 == 0) goto Lae
            byte[] r10 = (byte[]) r10     // Catch: java.lang.Throwable -> L31
            oo3 r0 = defpackage.oo3.a     // Catch: java.lang.Throwable -> L31
            r1.a = r6     // Catch: java.lang.Throwable -> L31
            r1.b = r8     // Catch: java.lang.Throwable -> L31
            r1.e = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = r0.c(r9, r10, r1)     // Catch: java.lang.Throwable -> L31
            if (r10 != r7) goto Lab
        Laa:
            return r7
        Lab:
            to3 r10 = (defpackage.to3) r10     // Catch: java.lang.Throwable -> L31
            goto Lbb
        Lae:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L31
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.ByteArray"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L31
            throw r8     // Catch: java.lang.Throwable -> L31
        Lb6:
            pm8 r10 = new pm8
            r10.<init>(r8)
        Lbb:
            boolean r8 = r10 instanceof defpackage.pm8
            if (r8 == 0) goto Lc0
            goto Lc1
        Lc0:
            r6 = r10
        Lc1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq3.k(java.lang.String, kt1):java.lang.Object");
    }
}

package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class q97 implements kka {
    public final String a;
    public final m62 b;
    public final is4 c;
    public final e21 d;
    public final sv8 e;
    public final t07 f;
    public wa2 s;
    public a82 t;

    public q97(String str, m62 m62Var, is4 is4Var, e21 e21Var, sv8 sv8Var) {
        str.getClass();
        this.a = str;
        this.b = m62Var;
        this.c = is4Var;
        this.d = e21Var;
        this.e = sv8Var;
        this.f = u07.a();
    }

    public final wa2 A() throws ap3 {
        if (this.s == null) {
            m62 m62Var = this.b;
            b92 b92Var = m62Var.b;
            String str = this.a;
            a82 a82Var = (a82) b92Var.T(str).d();
            this.t = a82Var;
            wa2 wa2VarA = oo3.a(m62Var, a82Var.j, a82Var.l);
            this.s = wa2VarA;
            String str2 = wa2VarA.a;
            a82 a82Var2 = this.t;
            if (a82Var2 == null) {
                lc5.i0("book");
                throw null;
            }
            if (!lc5.Q(str2, a82Var2.l)) {
                wa2 wa2Var = this.s;
                String str3 = wa2Var != null ? wa2Var.a : null;
                String str4 = wa2Var != null ? wa2Var.b : null;
                if (str4 == null) {
                    str4 = "";
                }
                b92Var.p0(str3, str4, str);
            }
        }
        wa2 wa2Var2 = this.s;
        if (wa2Var2 != null) {
            return wa2Var2;
        }
        throw new ap3();
    }

    @Override // defpackage.kka
    public final oka f() {
        Object pm8Var;
        try {
            pm8Var = A();
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        if (pm8Var instanceof pm8) {
            pm8Var = null;
        }
        wa2 wa2Var = (wa2) pm8Var;
        String str = wa2Var != null ? wa2Var.b : null;
        if (str == null) {
            str = "";
        }
        String str2 = wa2Var != null ? wa2Var.a : null;
        if (str2 == null) {
            str2 = "";
        }
        Map map = wa2Var != null ? wa2Var.t : null;
        if (map == null) {
            map = mc3.a;
        }
        return new oka(str, str2, map, true, true);
    }

    @Override // defpackage.kka
    public final Object h0(int i, String str, o1a o1aVar) {
        Map map;
        String strA = this.d.a(str);
        if (strA != null) {
            fg5 fg5VarF = nf5.f(xf5.a.c(strA));
            mf5 mf5Var = (mf5) fg5VarF.get("title");
            String strG = mf5Var != null ? i12.G(mf5Var) : null;
            if (strG == null) {
                strG = "";
            }
            mf5 mf5Var2 = (mf5) fg5VarF.get("content");
            strG = mf5Var2 != null ? i12.G(mf5Var2) : null;
            return new lka(strG, strG != null ? strG : "");
        }
        m62 m62Var = this.b;
        b92 b92Var = m62Var.J;
        StringBuilder sb = new StringBuilder();
        String str2 = this.a;
        sb.append(str2);
        sb.append("_");
        sb.append(i);
        String string = sb.toString();
        b92Var.getClass();
        xc2 xc2Var = xc2.a;
        uc2 uc2Var = (uc2) new wc2(b92Var, string, new vc2(b92Var, 1), (byte) 0).e();
        z92 z92Var = (z92) m62Var.s.T(str2 + "_" + i).e();
        if (z92Var == null) {
            return null;
        }
        if (uc2Var != null && (map = uc2Var.c) != null) {
            strG = (String) map.get("raw");
        }
        if (strG == null) {
            strG = "";
        }
        String str3 = (String) z92Var.d.get("raw");
        return new lka(strG, str3 != null ? str3 : "");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:34|(1:128)|35|36|37|120|38|39|(4:42|126|43|(18:45|132|46|47|104|48|49|50|112|52|53|118|54|55|56|102|57|(7:60|(9:124|62|63|122|64|65|114|66|(10:69|106|70|71|136|72|97|98|29|(1:99)(0)))(4:80|110|81|82)|75|97|98|29|(0)(0)))(4:91|98|29|(0)(0)))|68) */
    /* JADX WARN: Can't wrap try/catch for region: R(11:13|(3:116|14|15)|106|70|71|136|72|97|98|29|(4:31|108|32|(10:34|128|35|36|37|120|38|39|(4:42|126|43|(18:45|132|46|47|104|48|49|50|112|52|53|118|54|55|56|102|57|(7:60|(9:124|62|63|122|64|65|114|66|(10:69|106|70|71|136|72|97|98|29|(1:99)(0)))(4:80|110|81|82)|75|97|98|29|(0)(0)))(4:91|98|29|(0)(0)))|68)(4:96|98|29|(0)(0)))(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:13|116|14|15|106|70|71|136|72|97|98|29|(4:31|108|32|(10:34|128|35|36|37|120|38|39|(4:42|126|43|(18:45|132|46|47|104|48|49|50|112|52|53|118|54|55|56|102|57|(7:60|(9:124|62|63|122|64|65|114|66|(10:69|106|70|71|136|72|97|98|29|(1:99)(0)))(4:80|110|81|82)|75|97|98|29|(0)(0)))(4:91|98|29|(0)(0)))|68)(4:96|98|29|(0)(0)))(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:45|(1:132)|46|47|104|48|49|50|112|52|53|118|54|55|56|102|57|(7:60|(9:124|62|63|122|64|65|114|66|(10:69|106|70|71|136|72|97|98|29|(1:99)(0)))(4:80|110|81|82)|75|97|98|29|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:124)|62|63|122|64|65|114|66|(10:69|106|70|71|136|72|97|98|29|(1:99)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0162, code lost:
    
        r17 = r2;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c2, code lost:
    
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c9, code lost:
    
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01cc, code lost:
    
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e0, code lost:
    
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e3, code lost:
    
        r15 = r7;
        r7 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01e7, code lost:
    
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01eb, code lost:
    
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0208, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x020b, code lost:
    
        r17 = r2;
        r9 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0191 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0139 A[Catch: all -> 0x01f0, TRY_LEAVE, TryCatch #12 {all -> 0x01f0, blocks: (B:43:0x012d, B:45:0x0139, B:47:0x0145), top: B:126:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0226 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01b6 -> B:106:0x01b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01c6 -> B:97:0x021e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x01e3 -> B:97:0x021e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x01fa -> B:98:0x021f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x0208 -> B:97:0x021e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x0217 -> B:98:0x021f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(zx2 r20, java.lang.String r21, defpackage.kt1 r22) {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q97.p(zx2, java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.m97
            if (r0 == 0) goto L13
            r0 = r5
            m97 r0 = (defpackage.m97) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            m97 r0 = new m97
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            t07 r0 = r0.a
            defpackage.e11.e0(r5)
            goto L41
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r3
        L2e:
            defpackage.e11.e0(r5)
            t07 r5 = r4.f
            r0.a = r5
            r0.d = r2
            java.lang.Object r0 = r5.p(r0)
            xx1 r1 = defpackage.xx1.a
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            wa2 r5 = r4.A()     // Catch: java.lang.Throwable -> L50
            lm9 r1 = new lm9     // Catch: java.lang.Throwable -> L50
            sv8 r4 = r4.e     // Catch: java.lang.Throwable -> L50
            r1.<init>(r5, r4)     // Catch: java.lang.Throwable -> L50
            r0.q(r3)
            return r1
        L50:
            r4 = move-exception
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q97.q(kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x010c, code lost:
    
        if (r12 == r5) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    @Override // defpackage.kka
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.String r10, java.util.Map r11, defpackage.kt1 r12) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q97.s(java.lang.String, java.util.Map, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.kka
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(int r20, defpackage.jt1 r21, java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q97.t(int, jt1, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // defpackage.kka
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(int r23, java.lang.String r24, boolean r25, defpackage.kt1 r26) {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q97.u(int, java.lang.String, boolean, kt1):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(1:174)|81|82|172|83|(10:86|87|88|89|95|(1:97)|98|(12:100|(0)(1:103)|104|109|(1:76)|78|174|81|82|172|83|(0))|105|(1:193)(11:108|104|109|(0)|78|174|81|82|172|83|(0)))|30|107) */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e4, code lost:
    
        r50 = r14;
        r14 = r2;
        r2 = r3;
        r3 = r15;
        r15 = r5;
        r5 = r6;
        r6 = r9;
        r9 = r11;
        r11 = r13;
        r13 = r10;
        r10 = r4;
        r4 = r50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:76:0x018b, B:78:0x0191], limit reached: 188 */
    /* JADX WARN: Path cross not found for [B:78:0x0191, B:76:0x018b], limit reached: 188 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0208  */
    /* JADX WARN: Type inference failed for: r0v12, types: [lm9] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v17, types: [lm9] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26, types: [lm9] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x0212 -> B:103:0x0215). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0262 -> B:104:0x021b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x017d -> B:75:0x0189). Please report as a decompilation issue!!! */
    @Override // defpackage.kka
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(boolean r52, defpackage.kt1 r53) {
        /*
            Method dump skipped, instruction units count: 1139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q97.w(boolean, kt1):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}

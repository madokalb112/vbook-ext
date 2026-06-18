package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zna implements tna {
    public final rna a;
    public final m62 b;
    public final sv8 c;

    public zna(rna rnaVar, m62 m62Var, sv8 sv8Var) {
        this.a = rnaVar;
        this.b = m62Var;
        this.c = sv8Var;
        aj2 aj2Var = rw2.a;
        ah1.J(wx1.b(nh2.c), null, null, new dd9(this, (jt1) null, 14), 3);
    }

    public final dla a() {
        rna rnaVar = this.a;
        if (lc5.Q(rnaVar.c(), "system")) {
            return new n7a();
        }
        m62 m62Var = this.b;
        return ((wa2) m62Var.x.T(rnaVar.c()).e()) == null ? new n7a() : new cs3(rnaVar.c(), m62Var, this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r13 != r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.kt1 r13) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.vna
            if (r0 == 0) goto L13
            r0 = r13
            vna r0 = (defpackage.vna) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vna r0 = new vna
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.a
            int r1 = r0.c
            r2 = 3
            r3 = 2
            r4 = 1
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2d
            defpackage.e11.e0(r13)
            goto L86
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r12)
            r12 = 0
            return r12
        L34:
            defpackage.e11.e0(r13)
            goto L59
        L38:
            defpackage.e11.e0(r13)
            goto L48
        L3c:
            defpackage.e11.e0(r13)
            r0.c = r4
            kb3 r13 = r12.n()
            if (r13 != r5) goto L48
            goto L85
        L48:
            b24 r13 = (defpackage.b24) r13
            u31 r12 = new u31
            r1 = 5
            r12.<init>(r13, r1)
            r0.c = r3
            java.lang.Object r13 = defpackage.cx1.N(r12, r0)
            if (r13 != r5) goto L59
            goto L85
        L59:
            java.util.List r13 = (java.util.List) r13
            long r6 = defpackage.zk4.j()
            java.lang.String r12 = "yyyyMMdd_HHmmss"
            java.lang.String r12 = defpackage.zk4.i(r6, r12)
            java.lang.String r1 = "tts_skip_words_"
            java.lang.String r7 = r1.concat(r12)
            xm r9 = new xm
            r10 = 0
            r9.<init>(r13, r10, r2)
            r0.c = r2
            aj2 r12 = defpackage.rw2.a
            fj4 r12 = defpackage.r76.a
            xw3 r6 = new xw3
            r11 = 0
            java.lang.String r8 = "json"
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r13 = defpackage.ah1.b0(r12, r6, r0)
            if (r13 != r5) goto L86
        L85:
            return r5
        L86:
            if (r13 == 0) goto L89
            goto L8a
        L89:
            r4 = 0
        L8a:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zna.b(kt1):java.lang.Object");
    }

    public final long c() {
        rna rnaVar = this.a;
        return ((Number) rnaVar.h.c(rna.m[7], rnaVar)).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [pm8] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final List d() {
        ?? pm8Var;
        try {
            uf5 uf5Var = xf5.a;
            rna rnaVar = this.a;
            String str = (String) rnaVar.f.c(rna.m[5], rnaVar);
            uf5Var.getClass();
            Iterable iterable = (Iterable) uf5Var.a(new wv(tv9.a, 0), str);
            pm8Var = new ArrayList();
            for (Object obj : iterable) {
                oh5 oh5Var = gx3.a;
                if (oh5Var.e0(zn7.f(zn7.f(qu1.d0(oh5Var), "music"), (String) obj))) {
                    pm8Var.add(obj);
                }
            }
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        boolean z = pm8Var instanceof pm8;
        ?? r0 = pm8Var;
        if (z) {
            r0 = 0;
        }
        List list = (List) r0;
        return list == null ? lc3.a : list;
    }

    public final float e() {
        rna rnaVar = this.a;
        return ((Number) rnaVar.g.c(rna.m[6], rnaVar)).floatValue();
    }

    public final int f() {
        Integer numD;
        rna rnaVar = this.a;
        String strC = rnaVar.c();
        String strH = h();
        strC.getClass();
        g18 g18VarB = rnaVar.b();
        String strM = j39.m("tts_break_length_", strC, "_", strH);
        a91 a91VarA = ug8.a(Integer.class);
        if (a91VarA.equals(ug8.a(Integer.TYPE))) {
            numD = g18VarB.d(strM);
        } else if (a91VarA.equals(ug8.a(Long.TYPE))) {
            numD = (Integer) g18VarB.e(strM);
        } else if (a91VarA.equals(ug8.a(String.class))) {
            numD = (Integer) g18VarB.h(strM);
        } else if (a91VarA.equals(ug8.a(Float.TYPE))) {
            numD = (Integer) g18VarB.c(strM);
        } else if (a91VarA.equals(ug8.a(Double.TYPE))) {
            numD = (Integer) g18VarB.b(strM);
        } else {
            if (!a91VarA.equals(ug8.a(Boolean.TYPE))) {
                gp.l("Invalid type!");
                return 0;
            }
            numD = (Integer) g18VarB.a(strM);
        }
        if (numD != null) {
            return numD.intValue();
        }
        return -1;
    }

    public final int g() {
        Integer numD;
        rna rnaVar = this.a;
        String strC = rnaVar.c();
        String strH = h();
        strC.getClass();
        g18 g18VarB = rnaVar.b();
        String strM = j39.m("tts_break_", strC, "_", strH);
        a91 a91VarA = ug8.a(Integer.class);
        if (a91VarA.equals(ug8.a(Integer.TYPE))) {
            numD = g18VarB.d(strM);
        } else if (a91VarA.equals(ug8.a(Long.TYPE))) {
            numD = (Integer) g18VarB.e(strM);
        } else if (a91VarA.equals(ug8.a(String.class))) {
            numD = (Integer) g18VarB.h(strM);
        } else if (a91VarA.equals(ug8.a(Float.TYPE))) {
            numD = (Integer) g18VarB.c(strM);
        } else if (a91VarA.equals(ug8.a(Double.TYPE))) {
            numD = (Integer) g18VarB.b(strM);
        } else {
            if (!a91VarA.equals(ug8.a(Boolean.TYPE))) {
                gp.l("Invalid type!");
                return 0;
            }
            numD = (Integer) g18VarB.a(strM);
        }
        if (numD != null) {
            return numD.intValue();
        }
        return 1;
    }

    public final String h() {
        String strH;
        rna rnaVar = this.a;
        String strC = rnaVar.c();
        strC.getClass();
        g18 g18VarB = rnaVar.b();
        String strConcat = "tts_engine_".concat(strC);
        a91 a91VarA = ug8.a(String.class);
        if (a91VarA.equals(ug8.a(Integer.TYPE))) {
            strH = (String) g18VarB.d(strConcat);
        } else if (a91VarA.equals(ug8.a(Long.TYPE))) {
            strH = (String) g18VarB.e(strConcat);
        } else if (a91VarA.equals(ug8.a(String.class))) {
            strH = g18VarB.h(strConcat);
        } else if (a91VarA.equals(ug8.a(Float.TYPE))) {
            strH = (String) g18VarB.c(strConcat);
        } else if (a91VarA.equals(ug8.a(Double.TYPE))) {
            strH = (String) g18VarB.b(strConcat);
        } else {
            if (!a91VarA.equals(ug8.a(Boolean.TYPE))) {
                gp.l("Invalid type!");
                return null;
            }
            strH = (String) g18VarB.a(strConcat);
        }
        return strH == null ? "" : strH;
    }

    public final String i() {
        String strH;
        rna rnaVar = this.a;
        String strC = rnaVar.c();
        String strH2 = h();
        strC.getClass();
        g18 g18VarB = rnaVar.b();
        String strM = j39.m("tts_language_", strC, "_", strH2);
        a91 a91VarA = ug8.a(String.class);
        if (a91VarA.equals(ug8.a(Integer.TYPE))) {
            strH = (String) g18VarB.d(strM);
        } else if (a91VarA.equals(ug8.a(Long.TYPE))) {
            strH = (String) g18VarB.e(strM);
        } else if (a91VarA.equals(ug8.a(String.class))) {
            strH = g18VarB.h(strM);
        } else if (a91VarA.equals(ug8.a(Float.TYPE))) {
            strH = (String) g18VarB.c(strM);
        } else if (a91VarA.equals(ug8.a(Double.TYPE))) {
            strH = (String) g18VarB.b(strM);
        } else {
            if (!a91VarA.equals(ug8.a(Boolean.TYPE))) {
                gp.l("Invalid type!");
                return null;
            }
            strH = (String) g18VarB.a(strM);
        }
        return strH == null ? "" : strH;
    }

    public final float j() {
        Float fC;
        rna rnaVar = this.a;
        String strC = rnaVar.c();
        String strH = h();
        strC.getClass();
        g18 g18VarB = rnaVar.b();
        String strM = j39.m("tts_pitch_", strC, "_", strH);
        a91 a91VarA = ug8.a(Float.class);
        if (a91VarA.equals(ug8.a(Integer.TYPE))) {
            fC = (Float) g18VarB.d(strM);
        } else if (a91VarA.equals(ug8.a(Long.TYPE))) {
            fC = (Float) g18VarB.e(strM);
        } else if (a91VarA.equals(ug8.a(String.class))) {
            fC = (Float) g18VarB.h(strM);
        } else if (a91VarA.equals(ug8.a(Float.TYPE))) {
            fC = g18VarB.c(strM);
        } else if (a91VarA.equals(ug8.a(Double.TYPE))) {
            fC = (Float) g18VarB.b(strM);
        } else {
            if (!a91VarA.equals(ug8.a(Boolean.TYPE))) {
                gp.l("Invalid type!");
                return 0.0f;
            }
            fC = (Float) g18VarB.a(strM);
        }
        if (fC != null) {
            return fC.floatValue();
        }
        return 1.0f;
    }

    public final float k() {
        Float fC;
        rna rnaVar = this.a;
        String strC = rnaVar.c();
        String strH = h();
        strC.getClass();
        g18 g18VarB = rnaVar.b();
        String strM = j39.m("tts_speed_", strC, "_", strH);
        a91 a91VarA = ug8.a(Float.class);
        if (a91VarA.equals(ug8.a(Integer.TYPE))) {
            fC = (Float) g18VarB.d(strM);
        } else if (a91VarA.equals(ug8.a(Long.TYPE))) {
            fC = (Float) g18VarB.e(strM);
        } else if (a91VarA.equals(ug8.a(String.class))) {
            fC = (Float) g18VarB.h(strM);
        } else if (a91VarA.equals(ug8.a(Float.TYPE))) {
            fC = g18VarB.c(strM);
        } else if (a91VarA.equals(ug8.a(Double.TYPE))) {
            fC = (Float) g18VarB.b(strM);
        } else {
            if (!a91VarA.equals(ug8.a(Boolean.TYPE))) {
                gp.l("Invalid type!");
                return 0.0f;
            }
            fC = (Float) g18VarB.a(strM);
        }
        if (fC != null) {
            return fC.floatValue();
        }
        return 1.0f;
    }

    public final List l() {
        Object pm8Var;
        try {
            uf5 uf5Var = xf5.a;
            rna rnaVar = this.a;
            String strA = rnaVar.a(rnaVar.c(), h());
            uf5Var.getClass();
            pm8Var = (List) uf5Var.a(new wv(tv9.a, 0), strA);
        } catch (Throwable th) {
            pm8Var = new pm8(th);
        }
        if (pm8Var instanceof pm8) {
            pm8Var = null;
        }
        List list = (List) pm8Var;
        return list == null ? lc3.a : list;
    }

    public final String m() {
        String strH;
        rna rnaVar = this.a;
        String strC = rnaVar.c();
        String strH2 = h();
        strC.getClass();
        g18 g18VarB = rnaVar.b();
        String strM = j39.m("tts_voice_", strC, "_", strH2);
        a91 a91VarA = ug8.a(String.class);
        if (a91VarA.equals(ug8.a(Integer.TYPE))) {
            strH = (String) g18VarB.d(strM);
        } else if (a91VarA.equals(ug8.a(Long.TYPE))) {
            strH = (String) g18VarB.e(strM);
        } else if (a91VarA.equals(ug8.a(String.class))) {
            strH = g18VarB.h(strM);
        } else if (a91VarA.equals(ug8.a(Float.TYPE))) {
            strH = (String) g18VarB.c(strM);
        } else if (a91VarA.equals(ug8.a(Double.TYPE))) {
            strH = (String) g18VarB.b(strM);
        } else {
            if (!a91VarA.equals(ug8.a(Boolean.TYPE))) {
                gp.l("Invalid type!");
                return null;
            }
            strH = (String) g18VarB.a(strM);
        }
        return strH == null ? "" : strH;
    }

    public final kb3 n() {
        n92 n92Var = this.b.I;
        n92Var.getClass();
        sc2 sc2Var = sc2.a;
        qj qjVar = (qj) ((yf1) n92Var).a;
        oc2 oc2Var = new oc2(4);
        qjVar.getClass();
        pp1 pp1VarR = qx1.R(new af9(1876706263, new String[]{"DbTTSWord"}, qjVar, "DbTTSWord.sq", "getAll", "SELECT DbTTSWord.id, DbTTSWord.word, DbTTSWord.replace, DbTTSWord.ignoreCase, DbTTSWord.createAt, DbTTSWord.updateAt\nFROM DbTTSWord\nORDER BY createAt ASC", oc2Var));
        aj2 aj2Var = rw2.a;
        return new kb3(qx1.E(pp1VarR, nh2.c), 26);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:21|63|22|65|23|24|(1:26)(5:27|28|(0)|34|(1:47)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Path cross not found for [B:34:0x00ba, B:61:0x00b4], limit reached: 62 */
    /* JADX WARN: Path cross not found for [B:61:0x00b4, B:34:0x00ba], limit reached: 62 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf A[Catch: all -> 0x00c9, TRY_LEAVE, TryCatch #3 {all -> 0x00c9, blocks: (B:22:0x0072, B:41:0x00c5, B:47:0x00cf, B:38:0x00c0), top: B:63:0x0072, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ac -> B:28:0x00ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00cb -> B:45:0x00cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d0 -> B:49:0x00d5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.util.List r11, defpackage.kt1 r12) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zna.o(java.util.List, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.bi5 r6, defpackage.lm8 r7, defpackage.kt1 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.yna
            if (r0 == 0) goto L13
            r0 = r8
            yna r0 = (defpackage.yna) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            yna r0 = new yna
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            xx1 r1 = defpackage.xx1.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L2a
            lm8 r7 = r0.a
            defpackage.e11.e0(r8)
            goto L3e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r4
        L30:
            defpackage.e11.e0(r8)
            r0.a = r7
            r0.d = r3
            java.lang.Object r8 = r6.a(r0)
            if (r8 != r1) goto L3e
            return r1
        L3e:
            byte[] r8 = (byte[]) r8
            java.lang.String r6 = defpackage.iw9.z(r8)
            uf5 r8 = defpackage.xf5.a     // Catch: java.lang.Exception -> L60
            r8.getClass()     // Catch: java.lang.Exception -> L60
            wv r0 = new wv     // Catch: java.lang.Exception -> L60
            kh9 r1 = defpackage.lh9.Companion     // Catch: java.lang.Exception -> L60
            oi5 r1 = r1.serializer()     // Catch: java.lang.Exception -> L60
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L60
            oi5 r0 = defpackage.s32.J0(r0)     // Catch: java.lang.Exception -> L60
            oi5 r0 = (defpackage.oi5) r0     // Catch: java.lang.Exception -> L60
            java.lang.Object r4 = r8.a(r0, r6)     // Catch: java.lang.Exception -> L60
            goto L82
        L60:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            if (r6 != 0) goto L69
            java.lang.String r6 = ""
        L69:
            boolean r8 = defpackage.pu.a()
            if (r8 == 0) goto L82
            e46 r8 = e46.b
            k89 r0 = k89.c
            bh5 r1 = r8.a
            k89 r1 = r1.a
            int r1 = r1.compareTo(r0)
            if (r1 > 0) goto L82
            java.lang.String r1 = "Log"
            r8.a(r0, r1, r6, r4)
        L82:
            java.util.List r4 = (java.util.List) r4
            m62 r6 = r5.b
            n92 r6 = r6.I
            cba r8 = new cba
            r0 = 7
            r8.<init>(r0, r7, r5, r4)
            ym9.l(r6, r8)
            heb r5 = defpackage.heb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zna.p(bi5, lm8, kt1):java.lang.Object");
    }

    public final boolean q() {
        rna rnaVar = this.a;
        return ((Boolean) rnaVar.e.c(rna.m[4], rnaVar)).booleanValue();
    }

    public final boolean r() {
        rna rnaVar = this.a;
        return ((Boolean) rnaVar.i.c(rna.m[8], rnaVar)).booleanValue();
    }

    public final void s(List list) {
        list.getClass();
        uf5 uf5Var = xf5.a;
        uf5Var.getClass();
        this.a.f.e(rna.m[5], uf5Var.b(new wv(tv9.a, 0), list));
    }

    public final void t(String str) {
        rna rnaVar = this.a;
        String strC = rnaVar.c();
        strC.getClass();
        ww1.f0(rnaVar.b(), "tts_engine_".concat(strC), str);
    }

    public final void u(String str) {
        rna rnaVar = this.a;
        String strC = rnaVar.c();
        String strH = h();
        strC.getClass();
        ww1.f0(rnaVar.b(), j39.m("tts_language_", strC, "_", strH), str);
    }

    public final void v(float f) {
        rna rnaVar = this.a;
        String strC = rnaVar.c();
        String strH = h();
        strC.getClass();
        g18 g18VarB = rnaVar.b();
        g18VarB.getClass();
        g18VarB.i("tts_pitch_" + strC + "_" + strH, f);
    }

    public final void w(float f) {
        rna rnaVar = this.a;
        String strC = rnaVar.c();
        String strH = h();
        strC.getClass();
        g18 g18VarB = rnaVar.b();
        g18VarB.getClass();
        g18VarB.i("tts_speed_" + strC + "_" + strH, f);
    }

    public final void x(String str) {
        str.getClass();
        this.a.k.e(rna.m[10], str);
    }

    public final void y(String str) {
        rna rnaVar = this.a;
        String strC = rnaVar.c();
        String strH = h();
        strC.getClass();
        ww1.f0(rnaVar.b(), j39.m("tts_voice_", strC, "_", strH), str);
    }
}

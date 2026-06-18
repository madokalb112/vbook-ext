package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class hra extends n5b {
    public final se6 A0;
    public final se6 B0;
    public final se6 C0;
    public final se6 D0;
    public final fr9 E0;
    public final LinkedHashMap F0;
    public final HashSet G0;
    public final String H;
    public boolean H0;
    public final aw5 I;
    public long I0;
    public final i13 J;
    public int J0;
    public final rd8 K;
    public final t07 K0;
    public final qba L;
    public yd5 L0;
    public final sja M;
    public yd5 M0;
    public final u64 N;
    public yd5 N0;
    public final cm0 O;
    public final t0c P;
    public final cia Q;
    public final f4b R;
    public final y78 S;
    public final tna T;
    public final h8b U;
    public final q8b V;
    public final gj7 W;
    public zv5 X;
    public kka Y;
    public final fr9 Z;
    public final fr9 a0;
    public final fr9 b0;
    public Map c0;
    public Map d0;
    public Map e0;
    public boolean f0;
    public final fr9 g0;
    public final fr9 h0;
    public final pp1 i0;
    public final fr9 j0;
    public final fr9 k0;
    public final fr9 l0;
    public final fr9 m0;
    public final fr9 n0;
    public final fr9 o0;
    public final fr9 p0;
    public final fr9 q0;
    public final fr9 r0;
    public final fr9 s0;
    public final fr9 t0;
    public final fr9 u0;
    public final fr9 v0;
    public final fr9 w0;
    public final fr9 x0;
    public final fr9 y0;
    public final fr9 z0;

    public hra(String str, aw5 aw5Var, i13 i13Var, rd8 rd8Var, qba qbaVar, sja sjaVar, u64 u64Var, cm0 cm0Var, t0c t0cVar, cia ciaVar, f4b f4bVar, y78 y78Var, tna tnaVar, h8b h8bVar, q8b q8bVar, gj7 gj7Var) {
        super(f4bVar);
        this.H = str;
        this.I = aw5Var;
        this.J = i13Var;
        this.K = rd8Var;
        this.L = qbaVar;
        this.M = sjaVar;
        this.N = u64Var;
        this.O = cm0Var;
        this.P = t0cVar;
        this.Q = ciaVar;
        this.R = f4bVar;
        this.S = y78Var;
        this.T = tnaVar;
        this.U = h8bVar;
        this.V = q8bVar;
        this.W = gj7Var;
        gr9.a(null);
        this.Z = gr9.a(null);
        this.a0 = gr9.a(null);
        this.b0 = gr9.a(null);
        mc3 mc3Var = mc3.a;
        this.c0 = mc3Var;
        this.d0 = mc3Var;
        this.e0 = mc3Var;
        this.g0 = gr9.a(null);
        this.h0 = gr9.a(null);
        this.i0 = new pp1();
        lc3 lc3Var = lc3.a;
        this.j0 = gr9.a(new yba("", lc3Var, lc3Var, "", "", "", false, "", 1.0f, 2.0f, 1.0f, 0.5f, 0.0f, 3, 0, false, -1.0f, false, false, 0, 0, 2, 0, false, false, false, true, false, 1.0f, 16, 16, 16, 16));
        this.k0 = gr9.a(new fba("", "", "", "", "", 0, true, "", false, "", "", false, false, false, false, false, false, false, true));
        this.l0 = gr9.a(new nba(0, "", 0));
        this.m0 = gr9.a(new vka("", lc3Var, sc3.a));
        this.n0 = gr9.a(new nca(new st5(0, 3, 0), lc3Var));
        this.o0 = gr9.a(new xja(-1, -1, -1));
        this.p0 = gr9.a(new xga("", lc3Var));
        this.q0 = gr9.a(new aoa());
        this.r0 = gr9.a(new bka());
        this.s0 = gr9.a(new zja());
        this.t0 = gr9.a(new kba(lc3Var));
        this.u0 = gr9.a(new oja("", null, 0, 0, "", mc3Var, lc3Var, lc3Var, lc3Var, true, true));
        this.v0 = gr9.a(new epa(null, null, null, null, null, 255));
        this.w0 = gr9.a(new eda(false, true, lc3Var));
        this.x0 = gr9.a(new bha(lc3Var));
        this.y0 = gr9.a(new jja());
        this.z0 = gr9.a(new fia("", lc3Var));
        this.A0 = new se6(5);
        this.B0 = new se6(5);
        this.C0 = new se6(5);
        this.D0 = new se6(5);
        this.E0 = gr9.a(null);
        this.F0 = new LinkedHashMap();
        this.G0 = new HashSet();
        this.J0 = -1;
        this.K0 = u07.a();
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new lq0(this, null));
    }

    public static bp A0(bp bpVar, s5b s5bVar, boolean z) {
        zo zoVar = new zo();
        zoVar.f(s5bVar.a);
        if (z) {
            String str = s5bVar.a;
            int i = 0;
            int i2 = 0;
            int i3 = -1;
            while (i < str.length()) {
                char cCharAt = str.charAt(i);
                int i4 = i2 + 1;
                if (cCharAt != 8220) {
                    i2 = i3;
                }
                if (cCharAt != 8221 || i2 == -1) {
                    i3 = i2;
                } else {
                    zoVar.c(new vn9(0L, 0L, (a84) null, new t74(1), (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, 0L, (jda) null, (o89) null, 65527), i2, i4);
                    i3 = -1;
                }
                i++;
                i2 = i4;
            }
        }
        for (ap apVar : bpVar.d(0, bpVar.b.length())) {
            xl7 xl7VarB0 = B0(s5bVar, apVar.b, apVar.c);
            if (xl7VarB0 != null) {
                zoVar.a(apVar.d, ((Number) xl7VarB0.a).intValue(), ((Number) xl7VarB0.b).intValue(), (String) apVar.a);
            }
        }
        for (ap apVar2 : bpVar.c()) {
            xl7 xl7VarB02 = B0(s5bVar, apVar2.b, apVar2.c);
            if (xl7VarB02 != null) {
                zoVar.c((vn9) apVar2.a, ((Number) xl7VarB02.a).intValue(), ((Number) xl7VarB02.b).intValue());
            }
        }
        for (ap apVar3 : bpVar.b()) {
            xl7 xl7VarB03 = B0(s5bVar, apVar3.b, apVar3.c);
            if (xl7VarB03 != null) {
                zoVar.b((km7) apVar3.a, ((Number) xl7VarB03.a).intValue(), ((Number) xl7VarB03.b).intValue());
            }
        }
        return zoVar.l();
    }

    public static final xl7 B0(s5b s5bVar, int i, int i2) {
        Object next;
        List list;
        Object next2;
        List list2 = s5bVar.b;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                t5b t5bVar = (t5b) next;
                int i3 = t5bVar.a;
                if (i3 <= i && i < i3 + t5bVar.b) {
                    break;
                }
            }
            t5b t5bVar2 = (t5b) next;
            if (t5bVar2 != null && (list = s5bVar.b) != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    t5b t5bVar3 = (t5b) next2;
                    int i4 = t5bVar3.a;
                    if (i4 < i2 && i2 <= i4 + t5bVar3.b) {
                        break;
                    }
                }
                t5b t5bVar4 = (t5b) next2;
                if (t5bVar4 != null) {
                    return new xl7(Integer.valueOf(t5bVar2.c), Integer.valueOf(t5bVar4.c + t5bVar4.d));
                }
            }
        }
        return null;
    }

    public static final void D(hra hraVar, zd1 zd1Var) {
        Object value;
        qba qbaVar = hraVar.L;
        String str = zd1Var.b;
        xba xbaVar = (xba) qbaVar;
        xbaVar.getClass();
        str.getClass();
        zia ziaVar = xbaVar.a;
        da7 da7Var = ziaVar.h;
        ni5[] ni5VarArr = zia.A;
        da7Var.e(ni5VarArr[9], str);
        String str2 = zd1Var.c;
        str2.getClass();
        ziaVar.i.e(ni5VarArr[10], str2);
        String str3 = zd1Var.d;
        str3.getClass();
        ziaVar.j.e(ni5VarArr[11], str3);
        fr9 fr9Var = hraVar.j0;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, yba.a((yba) value, zd1Var.a, null, null, zd1Var.b, zd1Var.c, zd1Var.d, xbaVar.d(), null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, false, 0.0f, false, false, 0, 0, 0, 0, false, false, false, false, false, 0.0f, 0, 0, 0, 0, -122, 1)));
        }
    }

    public static final Object E(hra hraVar, o1a o1aVar) {
        xba xbaVar = (xba) hraVar.L;
        if (xbaVar.d()) {
            return hraVar.c0("bg_dark", o1aVar);
        }
        zia ziaVar = xbaVar.a;
        return hraVar.c0((String) ziaVar.f.c(zia.A[7], ziaVar), o1aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c9, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x023a, code lost:
    
        r14.add(new defpackage.bpa(r7, r6, "en"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010d, code lost:
    
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015d, code lost:
    
        if (r15.isEmpty() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0161, code lost:
    
        r2 = r15.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0169, code lost:
    
        if (r2.hasNext() == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016b, code lost:
    
        r0 = (defpackage.r5b) r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0173, code lost:
    
        if (r0.d == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0175, code lost:
    
        r16 = r2;
        r0 = defpackage.j39.k(r0.a, '_', '-');
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0185, code lost:
    
        if (r0.length() != 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018c, code lost:
    
        if (r0.equalsIgnoreCase("und") == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018f, code lost:
    
        if (r0 != null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0191, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0193, code lost:
    
        r2 = new defpackage.f36(defpackage.tw1.n(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019e, code lost:
    
        r2 = new defpackage.pm8(r0);
     */
    /* JADX WARN: Path cross not found for [B:36:0x00e7, B:37:0x00ed], limit reached: 162 */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023a A[EDGE_INSN: B:163:0x023a->B:139:0x023a BREAK  A[LOOP:2: B:108:0x01da->B:168:0x01da], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x0254 -> B:145:0x0256). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00cd -> B:30:0x00d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d4 -> B:32:0x00d5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(defpackage.hra r20, defpackage.kt1 r21) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hra.F(hra, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.dpa G(defpackage.hra r11, defpackage.yia r12, defpackage.yia r13) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hra.G(hra, yia, yia):dpa");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(defpackage.hra r7, java.lang.String r8, defpackage.kt1 r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof defpackage.jqa
            if (r0 == 0) goto L16
            r0 = r9
            jqa r0 = (defpackage.jqa) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f = r1
            goto L1b
        L16:
            jqa r0 = new jqa
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.d
            int r1 = r0.f
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            xx1 r6 = defpackage.xx1.a
            if (r1 == 0) goto L4b
            if (r1 == r4) goto L43
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L37
            java.util.ArrayList r7 = r0.c
            hra r8 = r0.b
            v5b r8 = (defpackage.v5b) r8
            defpackage.e11.e0(r9)
            goto L84
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            return r5
        L3d:
            java.lang.String r7 = r0.a
            defpackage.e11.e0(r9)
            goto L6b
        L43:
            hra r7 = r0.b
            java.lang.String r8 = r0.a
            defpackage.e11.e0(r9)
            goto L5b
        L4b:
            defpackage.e11.e0(r9)
            r0.a = r8
            r0.b = r7
            r0.f = r4
            java.lang.Object r9 = r7.q(r0)
            if (r9 != r6) goto L5b
            goto L82
        L5b:
            java.lang.String r9 = (java.lang.String) r9
            r0.a = r8
            r0.b = r5
            r0.f = r3
            java.lang.Object r9 = r7.t(r9, r0)
            if (r9 != r6) goto L6a
            goto L82
        L6a:
            r7 = r8
        L6b:
            v5b r9 = (defpackage.v5b) r9
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r9 == 0) goto La8
            r0.a = r5
            r0.b = r5
            r0.c = r8
            r0.f = r2
            java.lang.Object r9 = r9.c(r7, r0)
            if (r9 != r6) goto L83
        L82:
            return r6
        L83:
            r7 = r8
        L84:
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto La7
            java.util.Iterator r8 = r9.iterator()
        L8c:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto La7
            java.lang.Object r9 = r8.next()
            u5b r9 = (defpackage.u5b) r9
            fpa r0 = new fpa
            java.lang.String r1 = r9.a
            int r2 = r9.b
            boolean r9 = r9.c
            r0.<init>(r1, r2, r9)
            r7.add(r0)
            goto L8c
        La7:
            return r7
        La8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hra.H(hra, java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(defpackage.hra r5, java.lang.String r6, defpackage.kt1 r7) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hra.I(hra, java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable J(defpackage.hra r50, bp r51, java.util.List r52, defpackage.kt1 r53) {
        /*
            Method dump skipped, instruction units count: 1525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hra.J(hra, bp, java.util.List, kt1):java.io.Serializable");
    }

    public static final void K(hra hraVar, int i) {
        hraVar.getClass();
        za1 za1VarA = vtb.a(hraVar);
        aj2 aj2Var = rw2.a;
        hraVar.g(za1VarA, nh2.c, new dqa(i, 2, null, hraVar));
    }

    public static final Object L(hra hraVar, o1a o1aVar) {
        hraVar.C0.b();
        Object objM0 = hraVar.M0(o1aVar);
        return objM0 == xx1.a ? objM0 : heb.a;
    }

    public static final void M(hra hraVar, boolean z) {
        Object value;
        fr9 fr9Var = hraVar.E;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
                ((Boolean) value).getClass();
            } while (!fr9Var.j(value, Boolean.valueOf(z)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013d A[LOOP:1: B:49:0x0137->B:51:0x013d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N(defpackage.hra r11, boolean r12, defpackage.kt1 r13) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hra.N(hra, boolean, kt1):java.lang.Object");
    }

    public static final void O(hra hraVar) {
        hraVar.getClass();
        za1 za1VarA = vtb.a(hraVar);
        aj2 aj2Var = rw2.a;
        hraVar.g(za1VarA, nh2.c, new dqa(hraVar, null));
    }

    public static final void P(hra hraVar) {
        hraVar.getClass();
        za1 za1VarA = vtb.a(hraVar);
        aj2 aj2Var = rw2.a;
        hraVar.g(za1VarA, nh2.c, new n55(hraVar, null));
    }

    public static final void Q(hra hraVar) {
        hraVar.getClass();
        za1 za1VarA = vtb.a(hraVar);
        aj2 aj2Var = rw2.a;
        hraVar.g(za1VarA, nh2.c, new fqa(hraVar, null, 3));
    }

    public static final void R(hra hraVar) {
        hraVar.getClass();
        hraVar.g(vtb.a(hraVar), rw2.a, new fqa(hraVar, null, 4));
    }

    public static ArrayList a0(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        ArrayList arrayList = new ArrayList();
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = str.toLowerCase(locale);
        lowerCase2.getClass();
        int length = 0;
        while (length >= 0) {
            int iX = bw9.X(lowerCase, lowerCase2, length, false, 4);
            if (iX != -1) {
                int length2 = str.length() + iX;
                int i2 = length2 - 1;
                zo zoVar = new zo();
                zoVar.f(iw9.H(str2.substring(Math.max(iX - 30, 0), iX), false, "\n", " "));
                int iK = zoVar.k(new vn9(0L, 0L, (a84) null, (t74) null, (u74) null, (c64) null, (String) null, 0L, (ge0) null, (aha) null, (h36) null, lc1.b, (jda) null, (o89) null, 63487));
                try {
                    zoVar.f(str2.substring(iX, length2));
                    zoVar.h(iK);
                    zoVar.f(iw9.H(str2.substring(length2, Math.min(length2 + 29, str2.length())), false, "\n", " "));
                    arrayList.add(new yja(i, iX, i2, zoVar.l()));
                    length = iX + str.length();
                } catch (Throwable th) {
                    zoVar.h(iK);
                    throw th;
                }
            } else {
                length = -1;
            }
        }
        return arrayList;
    }

    public static Object f0(hra hraVar, int i, kt1 kt1Var) {
        fr9 fr9Var = hraVar.n0;
        tj7 tj7Var = (tj7) fc1.A0(((nca) fr9Var.getValue()).a.h(), ((nca) fr9Var.getValue()).b);
        return hraVar.e0(i, kt1Var, tj7Var != null ? tj7Var.a : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00bd -> B:31:0x00c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C0(int r13, defpackage.kt1 r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hra.C0(int, kt1, java.lang.String):java.lang.Object");
    }

    public final void D0(int i, float f) {
        if (i < 0) {
            return;
        }
        if (i != this.J0) {
            N0();
            this.J0 = i;
        }
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new b45(this, i, f, null, 1));
    }

    public final void E0() {
        c21 c21Var;
        List list = (List) this.Z.getValue();
        if (list == null || (c21Var = (c21) fc1.A0(this.J0, list)) == null) {
            return;
        }
        fr9 fr9Var = this.o0;
        int i = ((xja) fr9Var.getValue()).b;
        int i2 = ((xja) fr9Var.getValue()).c;
        ah1.J(utb.a(this), null, null, new d45(this, c21Var, Z(this.J0), i2 > 0 ? ((double) i) / ((double) i2) : 0.0d, null, 3), 3);
    }

    public final void F0() {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        nh2 nh2Var = nh2.c;
        jt1 jt1Var = null;
        g(za1VarA, nh2Var, new qoa(this, jt1Var, 5));
        g(vtb.a(this), nh2Var, new vpa(this, jt1Var, 14));
        g(vtb.a(this), nh2Var, new vpa(this, jt1Var, 15));
        g(vtb.a(this), nh2Var, new vpa(this, jt1Var, 9));
        g(vtb.a(this), nh2Var, new qoa(this, jt1Var, 6));
        g(vtb.a(this), nh2Var, new vpa(this, jt1Var, 13));
        g(vtb.a(this), nh2Var, new vpa(this, jt1Var, 11));
        g(vtb.a(this), nh2Var, new vpa(this, jt1Var, 12));
        g(vtb.a(this), nh2Var, new vpa(this, jt1Var, 10));
        g(vtb.a(this), nh2Var, new d45(this, jt1Var, 2));
        g(vtb.a(this), nh2Var, new pqa(null, this, "abc"));
        g(vtb.a(this), nh2Var, new ck7(this, jt1Var, 16));
    }

    public final void G0(String str) {
        str.getClass();
        yd5 yd5Var = this.M0;
        if (yd5Var != null) {
            yd5Var.cancel(null);
        }
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        this.M0 = g(za1VarA, nh2.c, new lu2((jt1) null, this, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0230 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H0(boolean r44, defpackage.kt1 r45) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hra.H0(boolean, kt1):java.lang.Object");
    }

    public final void I0(String str, String str2, String str3) {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new yw(this, str, str2, str3, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e5, code lost:
    
        if (r14 == r9) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084 A[Catch: all -> 0x0046, TRY_ENTER, TryCatch #0 {all -> 0x0046, blocks: (B:21:0x0041, B:41:0x00af, B:38:0x0084), top: B:64:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J0(java.lang.String r11, java.lang.String r12, java.lang.String r13, defpackage.kt1 r14) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hra.J0(java.lang.String, java.lang.String, java.lang.String, kt1):java.lang.Object");
    }

    public final String K0(Map map) {
        String str;
        if (!v() || (str = (String) this.z.getValue()) == null) {
            str = "raw";
        }
        String str2 = (String) map.get(str);
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            str2 = (String) map.get("raw");
        }
        return str2 == null ? "" : str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017a A[LOOP:0: B:73:0x0174->B:75:0x017a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L0(int r33, java.lang.String r34, java.lang.String r35, defpackage.kt1 r36) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hra.L0(int, java.lang.String, java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M0(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.gra
            if (r0 == 0) goto L13
            r0 = r5
            gra r0 = (defpackage.gra) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gra r0 = new gra
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r5)
            goto L3c
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r5)
            int r5 = r4.J0
            r0.c = r2
            java.lang.Object r5 = f0(r4, r5, r0)
            xx1 r0 = defpackage.xx1.a
            if (r5 != r0) goto L3c
            return r0
        L3c:
            java.util.List r5 = (java.util.List) r5
            fr9 r4 = r4.n0
            if (r4 == 0) goto L55
        L42:
            java.lang.Object r0 = r4.getValue()
            r1 = r0
            nca r1 = (defpackage.nca) r1
            st5 r1 = r1.a
            nca r1 = defpackage.nca.a(r1, r5)
            boolean r0 = r4.j(r0, r1)
            if (r0 == 0) goto L42
        L55:
            heb r4 = defpackage.heb.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hra.M0(kt1):java.lang.Object");
    }

    public final void N0() {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new vpa(this, (jt1) null, 17));
    }

    public abstract void O0(boolean z);

    public final void S() {
        Object value;
        yd5 yd5Var = this.L0;
        if (yd5Var != null) {
            yd5Var.cancel(null);
        }
        fr9 fr9Var = this.y0;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, jja.a((jja) value, false, true, null, null, 0, null, 92)));
        }
    }

    public final void T(float f) {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new ypa(f, this, (jt1) null));
    }

    public final void U(pn2 pn2Var, kk kkVar, float f, float f2) {
        Object value;
        pn2Var.getClass();
        kkVar.getClass();
        fr9 fr9Var = this.E0;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, new ra6(pn2Var, kkVar, f, f2)));
        }
    }

    public final void V() {
        Object value;
        fr9 fr9Var = this.s0;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, new zja()));
        }
    }

    public final bp W(bp bpVar) {
        Collection collection;
        fr9 fr9Var = this.g0;
        Collection collection2 = (Collection) fr9Var.getValue();
        fr9 fr9Var2 = this.h0;
        if ((collection2 == null || collection2.isEmpty()) && ((collection = (Collection) fr9Var2.getValue()) == null || collection.isEmpty())) {
            return bpVar;
        }
        String str = bpVar.b;
        str.getClass();
        ArrayList arrayList = new ArrayList(str.length());
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            arrayList.add(new mz7(str.charAt(i), i2));
            i++;
            i2++;
        }
        i21 i21Var = new i21(arrayList);
        List<i6b> list = (List) fr9Var.getValue();
        if (list != null) {
            for (i6b i6bVar : list) {
                i21Var = i21Var.d(i6bVar.c, "", i6bVar.d, false);
            }
        }
        List<p17> list2 = (List) fr9Var2.getValue();
        if (list2 != null) {
            for (p17 p17Var : list2) {
                i21Var = i21Var.d(p17Var.c, p17Var.d, false, p17Var.e);
            }
        }
        return i21Var.e(bpVar);
    }

    public final void X() {
        this.G = false;
        if (this.I0 > 0) {
            long jC = r95.a.k().c();
            long j = this.I0;
            long j2 = jC - j;
            this.I0 = 0L;
            vx1 vx1VarA = utb.a(this);
            aj2 aj2Var = rw2.a;
            ah1.J(vx1VarA, nh2.c, null, new w35(this, j, j2, null, 2), 2);
        }
    }

    public final void Y(String str) {
        str.getClass();
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new gqa(this, str, null, 0));
    }

    public final String Z(int i) {
        Map map;
        ova ovaVarD0 = d0(i);
        String strK0 = (ovaVarD0 == null || (map = ovaVarD0.c) == null) ? null : K0(map);
        return strK0 == null ? "" : strK0;
    }

    public final String b0(yia yiaVar, yia yiaVar2) {
        int i = yiaVar.a;
        int i2 = yiaVar.b;
        int i3 = yiaVar2.a;
        int i4 = yiaVar2.b;
        se6 se6Var = this.A0;
        if (i == i3) {
            Integer numValueOf = Integer.valueOf(i);
            se6Var.getClass();
            aca acaVar = (aca) se6Var.a.get(numValueOf);
            if (acaVar == null) {
                return null;
            }
            return acaVar.d.subSequence(i2, i4 + 1).toString();
        }
        Integer numValueOf2 = Integer.valueOf(i);
        se6Var.getClass();
        aca acaVar2 = (aca) se6Var.a.get(numValueOf2);
        if (acaVar2 == null) {
            return null;
        }
        Integer numValueOf3 = Integer.valueOf(yiaVar2.a);
        se6Var.getClass();
        aca acaVar3 = (aca) se6Var.a.get(numValueOf3);
        if (acaVar3 == null) {
            return null;
        }
        bp bpVar = acaVar2.d;
        return dx1.h(bpVar.subSequence(i2, bpVar.b.length()).toString(), "\n", acaVar3.d.subSequence(0, i4 + 1).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[EDGE_INSN: B:33:0x0086->B:28:0x0086 BREAK  A[LOOP:0: B:24:0x0072->B:35:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c0(java.lang.String r8, defpackage.kt1 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.hqa
            if (r0 == 0) goto L13
            r0 = r9
            hqa r0 = (defpackage.hqa) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            hqa r0 = new hqa
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 0
            qba r7 = r7.L
            r3 = 2
            r4 = 1
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L39
            if (r1 != r3) goto L33
            java.util.Collection r7 = r0.b
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.String r8 = r0.a
            defpackage.e11.e0(r9)
            goto L67
        L33:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            return r2
        L39:
            java.lang.String r8 = r0.a
            defpackage.e11.e0(r9)
            goto L50
        L3f:
            defpackage.e11.e0(r9)
            r0.a = r8
            r0.e = r4
            r9 = r7
            xba r9 = (defpackage.xba) r9
            java.io.Serializable r9 = r9.b(r0)
            if (r9 != r5) goto L50
            goto L63
        L50:
            java.util.Collection r9 = (java.util.Collection) r9
            r0.a = r8
            r1 = r9
            java.util.Collection r1 = (java.util.Collection) r1
            r0.b = r1
            r0.e = r3
            xba r7 = (defpackage.xba) r7
            java.io.Serializable r7 = r7.m(r0)
            if (r7 != r5) goto L64
        L63:
            return r5
        L64:
            r6 = r9
            r9 = r7
            r7 = r6
        L67:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r7 = defpackage.fc1.I0(r7, r9)
            int r9 = r7.size()
            r0 = 0
        L72:
            if (r0 >= r9) goto L86
            java.lang.Object r1 = r7.get(r0)
            int r0 = r0 + 1
            r3 = r1
            zd1 r3 = (defpackage.zd1) r3
            java.lang.String r3 = r3.a
            boolean r3 = defpackage.lc5.Q(r3, r8)
            if (r3 == 0) goto L72
            r2 = r1
        L86:
            zd1 r2 = (defpackage.zd1) r2
            if (r2 != 0) goto L92
            zd1 r7 = new zd1
            java.lang.String r8 = ""
            r7.<init>(r8, r8, r8, r8)
            return r7
        L92:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hra.c0(java.lang.String, kt1):java.lang.Object");
    }

    @Override // defpackage.n5b
    public final void d() {
        if (((e8b) this.U.a.getValue()).f) {
            rna rnaVar = ((zna) this.T).a;
            if (!((Boolean) rnaVar.b.c(rna.m[1], rnaVar)).booleanValue()) {
                this.V.getClass();
                d6a d6aVar = vg3.a;
                vg3.a(hla.a);
            }
        }
        o();
    }

    public final ova d0(int i) {
        String str = (String) this.e0.get(Integer.valueOf(i));
        if (str == null) {
            return null;
        }
        return (ova) this.d0.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e0(int r5, defpackage.kt1 r6, java.lang.String r7) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.lqa
            if (r0 == 0) goto L13
            r0 = r6
            lqa r0 = (defpackage.lqa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lqa r0 = new lqa
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r6)
            goto L40
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r6)
            hi r6 = new hi
            r1 = 3
            r6.<init>(r7, r5, r1)
            r0.c = r2
            java.io.Serializable r6 = r4.g0(r5, r6, r0)
            xx1 r4 = defpackage.xx1.a
            if (r6 != r4) goto L40
            return r4
        L40:
            xl7 r6 = (defpackage.xl7) r6
            java.lang.Object r4 = r6.b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hra.e0(int, kt1, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g0(int r5, defpackage.kb4 r6, defpackage.kt1 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.mqa
            if (r0 == 0) goto L13
            r0 = r7
            mqa r0 = (defpackage.mqa) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            mqa r0 = new mqa
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            kb4 r6 = r0.a
            defpackage.e11.e0(r7)
            goto L45
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r2
        L2e:
            defpackage.e11.e0(r7)
            r0.a = r6
            r0.d = r3
            pc r7 = new pc
            r1 = 14
            r7.<init>(r4, r5, r2, r1)
            java.lang.Object r7 = defpackage.wx1.a0(r7, r0)
            xx1 r4 = defpackage.xx1.a
            if (r7 != r4) goto L45
            return r4
        L45:
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r4 = r6.invoke(r7)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r5 = r4 + (-25)
            r6 = 0
            int r5 = java.lang.Math.max(r5, r6)
            int r6 = r4 + 25
            int r0 = r7.size()
            int r6 = java.lang.Math.min(r6, r0)
            java.util.List r6 = r7.subList(r5, r6)
            int r4 = r4 - r5
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            xl7 r4 = new xl7
            r4.<init>(r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hra.g0(int, kb4, kt1):java.io.Serializable");
    }

    public final fr9 h0() {
        return this.y0;
    }

    public final zv5 i0() {
        zv5 zv5Var = this.X;
        if (zv5Var != null) {
            return zv5Var;
        }
        lc5.i0("book");
        throw null;
    }

    public final dr9 j0() {
        return this.k0;
    }

    @Override // defpackage.n5b
    public final void k() {
        super.k();
        this.I0 = r95.a.k().c();
    }

    public final fr9 k0() {
        return this.t0;
    }

    public final fr9 l0() {
        return this.l0;
    }

    public final dr9 m0() {
        return this.n0;
    }

    public final dr9 n0() {
        return this.w0;
    }

    public final fr9 o0() {
        return this.x0;
    }

    public abstract ne8 p0();

    public final fr9 q0() {
        return this.u0;
    }

    public final fr9 r0() {
        return this.o0;
    }

    public final fr9 s0() {
        return this.s0;
    }

    public final dr9 t0() {
        return this.r0;
    }

    public final dr9 u0() {
        return this.m0;
    }

    public final pp1 v0() {
        return this.i0;
    }

    public final fr9 w0() {
        return this.z0;
    }

    public final kka x0() {
        kka kkaVar = this.Y;
        if (kkaVar != null) {
            return kkaVar;
        }
        lc5.i0("textSource");
        throw null;
    }

    @Override // defpackage.n5b
    public final void y() {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        jt1 jt1Var = null;
        g(za1VarA, aj2Var, new vpa(this, jt1Var, 4));
        g(vtb.a(this), aj2Var, new vpa(this, jt1Var, 5));
    }

    public final fr9 y0() {
        return this.v0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c7, code lost:
    
        if (r10.a.get(r3) == null) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0248, code lost:
    
        if (r3 == r12) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0117 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:76:0x01eb, B:78:0x01f3, B:80:0x020a, B:81:0x020f, B:54:0x015d, B:56:0x016d, B:60:0x0175, B:62:0x0179, B:63:0x0193, B:65:0x0199, B:70:0x01ba, B:72:0x01cd, B:82:0x0210, B:83:0x0215, B:50:0x0143, B:47:0x012e, B:41:0x010d, B:43:0x0117, B:84:0x0216, B:85:0x021b, B:34:0x00c9, B:37:0x00d4), top: B:101:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0143 A[Catch: all -> 0x0172, PHI: r0 r1 r2 r5 r13
  0x0143: PHI (r0v14 int) = (r0v12 int), (r0v15 int) binds: [B:48:0x013f, B:23:0x007e] A[DONT_GENERATE, DONT_INLINE]
  0x0143: PHI (r1v16 int) = (r1v13 int), (r1v18 int) binds: [B:48:0x013f, B:23:0x007e] A[DONT_GENERATE, DONT_INLINE]
  0x0143: PHI (r2v13 boolean) = (r2v10 boolean), (r2v15 boolean) binds: [B:48:0x013f, B:23:0x007e] A[DONT_GENERATE, DONT_INLINE]
  0x0143: PHI (r5v13 lka) = (r5v11 lka), (r5v16 lka) binds: [B:48:0x013f, B:23:0x007e] A[DONT_GENERATE, DONT_INLINE]
  0x0143: PHI (r13v11 hra) = (r13v8 hra), (r13v13 hra) binds: [B:48:0x013f, B:23:0x007e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0172, blocks: (B:76:0x01eb, B:78:0x01f3, B:80:0x020a, B:81:0x020f, B:54:0x015d, B:56:0x016d, B:60:0x0175, B:62:0x0179, B:63:0x0193, B:65:0x0199, B:70:0x01ba, B:72:0x01cd, B:82:0x0210, B:83:0x0215, B:50:0x0143, B:47:0x012e, B:41:0x010d, B:43:0x0117, B:84:0x0216, B:85:0x021b, B:34:0x00c9, B:37:0x00d4), top: B:101:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016d A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:76:0x01eb, B:78:0x01f3, B:80:0x020a, B:81:0x020f, B:54:0x015d, B:56:0x016d, B:60:0x0175, B:62:0x0179, B:63:0x0193, B:65:0x0199, B:70:0x01ba, B:72:0x01cd, B:82:0x0210, B:83:0x0215, B:50:0x0143, B:47:0x012e, B:41:0x010d, B:43:0x0117, B:84:0x0216, B:85:0x021b, B:34:0x00c9, B:37:0x00d4), top: B:101:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0179 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:76:0x01eb, B:78:0x01f3, B:80:0x020a, B:81:0x020f, B:54:0x015d, B:56:0x016d, B:60:0x0175, B:62:0x0179, B:63:0x0193, B:65:0x0199, B:70:0x01ba, B:72:0x01cd, B:82:0x0210, B:83:0x0215, B:50:0x0143, B:47:0x012e, B:41:0x010d, B:43:0x0117, B:84:0x0216, B:85:0x021b, B:34:0x00c9, B:37:0x00d4), top: B:101:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cd A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:76:0x01eb, B:78:0x01f3, B:80:0x020a, B:81:0x020f, B:54:0x015d, B:56:0x016d, B:60:0x0175, B:62:0x0179, B:63:0x0193, B:65:0x0199, B:70:0x01ba, B:72:0x01cd, B:82:0x0210, B:83:0x0215, B:50:0x0143, B:47:0x012e, B:41:0x010d, B:43:0x0117, B:84:0x0216, B:85:0x021b, B:34:0x00c9, B:37:0x00d4), top: B:101:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f3 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:76:0x01eb, B:78:0x01f3, B:80:0x020a, B:81:0x020f, B:54:0x015d, B:56:0x016d, B:60:0x0175, B:62:0x0179, B:63:0x0193, B:65:0x0199, B:70:0x01ba, B:72:0x01cd, B:82:0x0210, B:83:0x0215, B:50:0x0143, B:47:0x012e, B:41:0x010d, B:43:0x0117, B:84:0x0216, B:85:0x021b, B:34:0x00c9, B:37:0x00d4), top: B:101:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020a A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:76:0x01eb, B:78:0x01f3, B:80:0x020a, B:81:0x020f, B:54:0x015d, B:56:0x016d, B:60:0x0175, B:62:0x0179, B:63:0x0193, B:65:0x0199, B:70:0x01ba, B:72:0x01cd, B:82:0x0210, B:83:0x0215, B:50:0x0143, B:47:0x012e, B:41:0x010d, B:43:0x0117, B:84:0x0216, B:85:0x021b, B:34:0x00c9, B:37:0x00d4), top: B:101:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0210 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:76:0x01eb, B:78:0x01f3, B:80:0x020a, B:81:0x020f, B:54:0x015d, B:56:0x016d, B:60:0x0175, B:62:0x0179, B:63:0x0193, B:65:0x0199, B:70:0x01ba, B:72:0x01cd, B:82:0x0210, B:83:0x0215, B:50:0x0143, B:47:0x012e, B:41:0x010d, B:43:0x0117, B:84:0x0216, B:85:0x021b, B:34:0x00c9, B:37:0x00d4), top: B:101:0x00c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0216 A[Catch: all -> 0x0172, TryCatch #0 {all -> 0x0172, blocks: (B:76:0x01eb, B:78:0x01f3, B:80:0x020a, B:81:0x020f, B:54:0x015d, B:56:0x016d, B:60:0x0175, B:62:0x0179, B:63:0x0193, B:65:0x0199, B:70:0x01ba, B:72:0x01cd, B:82:0x0210, B:83:0x0215, B:50:0x0143, B:47:0x012e, B:41:0x010d, B:43:0x0117, B:84:0x0216, B:85:0x021b, B:34:0x00c9, B:37:0x00d4), top: B:101:0x00c9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z0(int r22, boolean r23, defpackage.kt1 r24) {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hra.z0(int, boolean, kt1):java.lang.Object");
    }
}

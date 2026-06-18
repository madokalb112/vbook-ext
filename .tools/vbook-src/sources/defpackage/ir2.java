package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ir2 extends n5b {
    public final String H;
    public final String I;
    public final qp3 J;
    public final aw5 K;
    public final dp2 L;
    public final i13 M;
    public final f4b N;
    public final fr9 O;
    public final pp1 P;
    public List Q;
    public final HashMap R;
    public final ArrayList S;
    public final HashMap T;
    public final fr9 U;
    public boolean V;
    public yd5 W;
    public boolean X;

    public ir2(String str, String str2, qp3 qp3Var, aw5 aw5Var, dp2 dp2Var, i13 i13Var, f4b f4bVar) {
        super(f4bVar);
        this.H = str;
        this.I = str2;
        this.J = qp3Var;
        this.K = aw5Var;
        this.L = dp2Var;
        this.M = i13Var;
        this.N = f4bVar;
        this.O = gr9.a(new wq2(true, null, null, null, 0, false, false, "", null, false, "", false, false));
        this.P = new pp1();
        this.Q = lc3.a;
        this.R = new HashMap();
        this.S = new ArrayList();
        this.T = new HashMap();
        this.U = gr9.a(null);
        I();
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        nh2 nh2Var = nh2.c;
        g(za1VarA, nh2Var, new rf(this, null, 16));
        g(vtb.a(this), nh2Var, new a71(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025b A[PHI: r5 r7
  0x025b: PHI (r5v48 java.lang.String) = (r5v30 java.lang.String), (r5v50 java.lang.String) binds: [B:108:0x0265, B:101:0x0258] A[DONT_GENERATE, DONT_INLINE]
  0x025b: PHI (r7v8 int) = (r7v5 int), (r7v9 int) binds: [B:108:0x0265, B:101:0x0258] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0288 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x041d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(defpackage.ir2 r76, java.lang.Integer r77, java.lang.Boolean r78, java.lang.Boolean r79, java.util.List r80, defpackage.kt1 r81) {
        /*
            Method dump skipped, instruction units count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir2.D(ir2, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.util.List, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E(defpackage.ir2 r18, defpackage.kt1 r19) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir2.E(ir2, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(defpackage.ir2 r36, defpackage.kt1 r37) {
        /*
            Method dump skipped, instruction units count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir2.F(ir2, kt1):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r39v0, types: [ir2, n5b] */
    /* JADX WARN: Type inference failed for: r40v2, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(defpackage.ir2 r39, defpackage.kt1 r40) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir2.G(ir2, kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        if (r1 == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0065 -> B:12:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(defpackage.ir2 r22, defpackage.kt1 r23) {
        /*
            r0 = r22
            r1 = r23
            boolean r2 = r1 instanceof defpackage.hr2
            if (r2 == 0) goto L17
            r2 = r1
            hr2 r2 = (defpackage.hr2) r2
            int r3 = r2.u
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.u = r3
            goto L1c
        L17:
            hr2 r2 = new hr2
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.s
            int r3 = r2.u
            r4 = 1
            if (r3 == 0) goto L3e
            if (r3 != r4) goto L37
            int r3 = r2.f
            int r5 = r2.e
            wq2 r6 = r2.d
            java.util.HashMap r7 = r2.c
            java.lang.Object r8 = r2.b
            b07 r9 = r2.a
            defpackage.e11.e0(r1)
        L34:
            r21 = r9
            goto L68
        L37:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r0)
            r0 = 0
            return r0
        L3e:
            defpackage.e11.e0(r1)
            fr9 r1 = r0.O
            if (r1 == 0) goto L90
            r3 = 0
            r9 = r1
            r5 = r3
        L48:
            java.lang.Object r8 = r9.getValue()
            r6 = r8
            wq2 r6 = (defpackage.wq2) r6
            java.util.HashMap r7 = r0.T
            r2.a = r9
            r2.b = r8
            r2.c = r7
            r2.d = r6
            r2.e = r5
            r2.f = r3
            r2.u = r4
            java.lang.Object r1 = r0.r(r2)
            xx1 r10 = defpackage.xx1.a
            if (r1 != r10) goto L34
            return r10
        L68:
            java.lang.Object r1 = r7.get(r1)
            r15 = r1
            ho2 r15 = (defpackage.ho2) r15
            r19 = 0
            r20 = 7935(0x1eff, float:1.112E-41)
            r7 = 0
            r1 = r8
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            wq2 r6 = defpackage.wq2.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r9 = r21
            fr9 r9 = (defpackage.fr9) r9
            boolean r1 = r9.j(r1, r6)
            if (r1 == 0) goto L48
        L90:
            heb r0 = defpackage.heb.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir2.H(ir2, kt1):java.lang.Object");
    }

    public final void I() {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new br2(this, null));
    }

    @Override // defpackage.n5b
    public final void y() {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new et1(this, null, 10));
    }
}

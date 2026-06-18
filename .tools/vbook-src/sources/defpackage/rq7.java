package defpackage;

import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class rq7 extends i45 {
    public final String T;
    public final aw5 U;
    public final j55 V;
    public final f4b W;
    public final w25 X;
    public final fr9 Y;
    public final a15 Z;

    public rq7(String str, aw5 aw5Var, i13 i13Var, q15 q15Var, cm0 cm0Var, t0c t0cVar, j55 j55Var, f4b f4bVar, xy4 xy4Var, rd8 rd8Var, w25 w25Var) {
        super(str, aw5Var, i13Var, q15Var, cm0Var, t0cVar, f4bVar, xy4Var, rd8Var);
        this.T = str;
        this.U = aw5Var;
        this.V = j55Var;
        this.W = f4bVar;
        this.X = w25Var;
        this.Y = gr9.a(new nq7("", "", true, false, false));
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new ug(this, null, 20));
        this.Z = new a15(new pq7(this), 104857600L, Context.VERSION_ES6);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object B(defpackage.rq7 r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, defpackage.kt1 r17) {
        /*
            r0 = r17
            boolean r1 = r0 instanceof defpackage.qq7
            if (r1 == 0) goto L15
            r1 = r0
            qq7 r1 = (defpackage.qq7) r1
            int r2 = r1.t
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.t = r2
            goto L1a
        L15:
            qq7 r1 = new qq7
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.f
            int r2 = r1.t
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L49
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            defpackage.e11.e0(r0)
            goto Lb9
        L2d:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r13)
            return r6
        L33:
            java.lang.String r13 = r1.e
            xl7[] r14 = r1.d
            java.lang.String r2 = r1.c
            j55 r5 = r1.b
            xl7[] r7 = r1.a
            defpackage.e11.e0(r0)
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L92
            java.lang.String r0 = defpackage.cx1.M(r0)
            goto L93
        L49:
            defpackage.e11.e0(r0)
            fr9 r0 = r13.Y
            if (r0 == 0) goto L67
        L50:
            java.lang.Object r2 = r0.getValue()
            r7 = r2
            nq7 r7 = (defpackage.nq7) r7
            r11 = 0
            r12 = 29
            r8 = 0
            r9 = 1
            r10 = 0
            nq7 r7 = defpackage.nq7.a(r7, r8, r9, r10, r11, r12)
            boolean r2 = r0.j(r2, r7)
            if (r2 == 0) goto L50
        L67:
            j55 r0 = r13.V
            java.lang.String r2 = r13.T
            r13 = 4
            xl7[] r13 = new defpackage.xl7[r13]
            xl7 r7 = new xl7
            java.lang.String r8 = "book_name"
            r7.<init>(r8, r14)
            r13[r3] = r7
            xl7 r14 = new xl7
            java.lang.String r3 = "book_language"
            r7 = r16
            r14.<init>(r3, r7)
            r13[r5] = r14
            xl7 r14 = new xl7
            java.lang.String r3 = "book_author"
            r14.<init>(r3, r15)
            r13[r4] = r14
            r3 = 3
            java.lang.String r14 = "cover"
            r7 = r13
            r5 = r0
            r13 = r14
            r14 = r7
        L92:
            r0 = r6
        L93:
            if (r0 != 0) goto L97
            java.lang.String r0 = ""
        L97:
            xl7 r8 = new xl7
            r8.<init>(r13, r0)
            r14[r3] = r8
            java.util.Map r13 = defpackage.y86.P(r7)
            r1.a = r6
            r1.b = r6
            r1.c = r6
            r1.d = r6
            r1.e = r6
            r1.t = r4
            l55 r5 = (defpackage.l55) r5
            java.lang.Object r13 = r5.b(r2, r13, r1)
            xx1 r14 = defpackage.xx1.a
            if (r13 != r14) goto Lb9
            return r14
        Lb9:
            heb r13 = defpackage.heb.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq7.B(rq7, java.lang.String, java.lang.String, java.lang.String, kt1):java.lang.Object");
    }

    @Override // defpackage.i45
    public final void A(boolean z) {
        fr9 fr9Var = this.Y;
        if (fr9Var == null) {
            return;
        }
        while (true) {
            Object value = fr9Var.getValue();
            boolean z2 = z;
            if (fr9Var.j(value, nq7.a((nq7) value, false, false, null, z2, 22))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    @Override // defpackage.i45
    public final a15 q() {
        return this.Z;
    }
}

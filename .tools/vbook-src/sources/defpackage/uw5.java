package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class uw5 implements aw5 {
    public final m62 a;

    public uw5(m62 m62Var) {
        this.a = m62Var;
    }

    public final void a(String str) {
        n92 n92Var = this.a.e;
        n92Var.getClass();
        str.getClass();
        u92 u92Var = u92.a;
        if (((o92) new r92(n92Var, str, new q92(1)).e()) != null) {
            throw new RuntimeException();
        }
        n92Var.R(new o92(r95.a.k().c(), wm9.p(), str));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.kt1 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.bw5
            if (r0 == 0) goto L13
            r0 = r7
            bw5 r0 = (defpackage.bw5) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            bw5 r0 = new bw5
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            int r1 = r0.b
            java.util.Iterator r3 = r0.a
            defpackage.e11.e0(r7)
            goto L50
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            r6 = 0
            return r6
        L30:
            defpackage.e11.e0(r7)
            m62 r7 = r6.a
            b92 r1 = r7.b
            r3 = 0
            h82 r1 = r1.b0(r3)
            java.util.List r1 = r1.c()
            ej4 r4 = new ej4
            r5 = 14
            r4.<init>(r5, r1, r6)
            ym9.l(r7, r4)
            java.util.Iterator r7 = r1.iterator()
            r1 = r3
            r3 = r7
        L50:
            boolean r7 = r3.hasNext()
            heb r4 = defpackage.heb.a
            if (r7 == 0) goto L6e
            java.lang.Object r7 = r3.next()
            a82 r7 = (defpackage.a82) r7
            java.lang.String r7 = r7.a
            r0.a = r3
            r0.b = r1
            r0.e = r2
            r6.c(r7)
            xx1 r7 = defpackage.xx1.a
            if (r4 != r7) goto L50
            return r7
        L6e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw5.b(kt1):java.lang.Object");
    }

    public final void c(String str) {
        ym9.l(this.a, new ej4(15, this, str));
        oh5 oh5Var = gx3.a;
        oh5Var.a0(zn7.f(qu1.Z(oh5Var), str));
    }

    public final void d(String str) {
        m62 m62Var = this.a;
        b92 b92Var = m62Var.b;
        b92Var.getClass();
        str.getClass();
        s82 s82Var = s82.a;
        ym9.l(b92Var, new fb3(5, new j82(b92Var, str, new b82(b92Var, 12)).c(), this, str));
        n92 n92Var = m62Var.e;
        n92Var.getClass();
        ((qj) ((yf1) n92Var).a).q(400211862, "DELETE FROM DbCategory\nWHERE id = ?", new e82(str, 3));
        n92Var.w(400211862, new hu1(28));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r10, defpackage.kt1 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.cw5
            if (r0 == 0) goto L13
            r0 = r12
            cw5 r0 = (defpackage.cw5) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            cw5 r0 = new cw5
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.d
            int r1 = r0.f
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            int r10 = r0.c
            long r3 = r0.a
            java.util.Iterator r11 = r0.b
            defpackage.e11.e0(r12)
            r1 = r10
            r12 = r11
            r10 = r3
            goto L6f
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            r9 = 0
            return r9
        L35:
            defpackage.e11.e0(r12)
            m62 r12 = r9.a
            b92 r12 = r12.b
            r1 = 0
            h82 r12 = r12.b0(r1)
            java.util.List r12 = r12.c()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r12 = r12.iterator()
        L4e:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L6b
            java.lang.Object r4 = r12.next()
            r5 = r4
            a82 r5 = (defpackage.a82) r5
            long r5 = r5.G
            r7 = 1
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 > 0) goto L4e
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 >= 0) goto L4e
            r3.add(r4)
            goto L4e
        L6b:
            java.util.Iterator r12 = r3.iterator()
        L6f:
            boolean r3 = r12.hasNext()
            heb r4 = defpackage.heb.a
            if (r3 == 0) goto L8f
            java.lang.Object r3 = r12.next()
            a82 r3 = (defpackage.a82) r3
            java.lang.String r3 = r3.a
            r0.b = r12
            r0.a = r10
            r0.c = r1
            r0.f = r2
            r9.c(r3)
            xx1 r3 = defpackage.xx1.a
            if (r4 != r3) goto L6f
            return r3
        L8f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw5.e(long, kt1):java.lang.Object");
    }

    public final kb3 f() {
        pp1 pp1VarR = qx1.R(this.a.e.P());
        aj2 aj2Var = rw2.a;
        return new kb3(qx1.E(pp1VarR, nh2.c), 7);
    }

    public final wp3 g(String str) {
        str.getClass();
        pp1 pp1VarR = qx1.R(this.a.b.T(str));
        aj2 aj2Var = rw2.a;
        return new wp3(qx1.G(pp1VarR, nh2.c), 1);
    }

    public final wp3 h(String str) {
        str.getClass();
        String strL = wfc.l(str, true);
        b92 b92Var = this.a.b;
        b92Var.getClass();
        strL.getClass();
        w82 w82Var = w82.a;
        pp1 pp1VarR = qx1.R(new j82(b92Var, strL, new b82(b92Var, 11), (byte) 0));
        aj2 aj2Var = rw2.a;
        return new wp3(qx1.G(pp1VarR, nh2.c), 2);
    }

    public final kb3 i(int i) {
        b92 b92Var = this.a.b;
        b92Var.getClass();
        a92 a92Var = a92.a;
        pp1 pp1VarR = qx1.R(new o82(b92Var, i, new b82(b92Var, 2)));
        aj2 aj2Var = rw2.a;
        return new kb3(qx1.E(pp1VarR, nh2.c), 15);
    }

    public final void j(zv5 zv5Var) {
        long jC = r95.a.k().c();
        b92 b92Var = this.a.b;
        a82 a82Var = (a82) b92Var.T(zv5Var.a).d();
        Map map = zv5Var.b;
        Map map2 = zv5Var.c;
        String str = zv5Var.d;
        int i = zv5Var.e;
        int i2 = zv5Var.f;
        int i3 = zv5Var.n;
        String str2 = zv5Var.l;
        String str3 = zv5Var.j;
        boolean z = zv5Var.p;
        b92Var.f0(a82.a(a82Var, map, map2, str, i, i2, zv5Var.g, null, str3, str2, null, i3, zv5Var.o, null, z, zv5Var.u, zv5Var.x, zv5Var.y, zv5Var.z, null, 0L, jC, -59815551, 3));
    }

    public final void k(String str, String str2) {
        n92 n92Var = this.a.e;
        n92Var.getClass();
        str2.getClass();
        str.getClass();
        ((qj) ((yf1) n92Var).a).q(-1409751201, "UPDATE DbCategory\nSET name = ?\nWHERE id = ?", new p92(str2, str, 0));
        n92Var.w(-1409751201, new hu1(27));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(4:11|68|12|13)(2:16|17))(2:18|(14:20|76|21|22|72|23|24|66|25|26|64|27|28|(1:30)(1:31))(5:59|57|(1:61)|62|63))|78|32|(2:74|34)|38|(1:58)|57|(0)|62|63|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bf, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, defpackage.bi5 r42, defpackage.kt1 r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw5.l(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, bi5, kt1):java.lang.Object");
    }

    public final void m(String str, boolean z) {
        b92 b92Var = this.a.b;
        b92Var.getClass();
        str.getClass();
        ((qj) ((yf1) b92Var).a).q(1760632157, "UPDATE DbBook\nSET follow = ?\nWHERE id = ?", new hb0(z, str, 2));
        b92Var.w(1760632157, new hu1(5));
    }

    public final void n(long j, long j2, String str) {
        m62 m62Var = this.a;
        b92 b92Var = m62Var.b;
        b92Var.getClass();
        str.getClass();
        ((qj) ((yf1) b92Var).a).q(-87582354, "UPDATE DbBook\nSET totalReadTime = totalReadTime + ?\nWHERE id = ?", new d82(2, str, j2));
        b92Var.w(-87582354, new hu1(17));
        m62Var.G.V(new lc2(wm9.p(), j2, 0L, j));
    }
}

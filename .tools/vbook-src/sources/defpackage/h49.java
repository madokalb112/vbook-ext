package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class h49 extends qtb {
    public boolean A;
    public List B;
    public yd5 C;
    public yd5 D;
    public int E;
    public long F;
    public final pp1 G;
    public final fr9 H;
    public final fr9 I;
    public final fr9 J;
    public final fr9 K;
    public final fr9 L;
    public final String M;
    public final aw5 N;
    public final mrb O;
    public final nc1 P;
    public final String c;
    public final aw5 d;
    public final i13 e;
    public final pqb f;
    public final mnb s;
    public final f4b t;
    public final sz9 u;
    public zv5 v;
    public f49 w;
    public final fr9 x;
    public Map y;
    public Map z;

    public h49(String str, aw5 aw5Var, i13 i13Var, pqb pqbVar, mnb mnbVar, f4b f4bVar, mrb mrbVar, sz9 sz9Var) {
        this.c = str;
        this.d = aw5Var;
        this.e = i13Var;
        this.f = pqbVar;
        this.s = mnbVar;
        this.t = f4bVar;
        this.u = sz9Var;
        gr9.a(null);
        this.x = gr9.a(null);
        mc3 mc3Var = mc3.a;
        this.y = mc3Var;
        this.z = mc3Var;
        this.A = true;
        lc3 lc3Var = lc3.a;
        this.B = lc3Var;
        this.E = -1;
        this.G = new pp1();
        this.H = gr9.a(new onb(2, 0, 0, true, true, false, true, 16.0f, 0.5f, 4294967295L, 4278190080L, 1, 0.0f, false, 1.0f, 1.0f, 10, 10, true, true, 1.0f, true, false));
        this.I = gr9.a(new lnb("", "", "", "", "", 0, "", false, false, false, false, false, false, false, false));
        this.J = gr9.a(new ipb(0, "", 0, 0.0d));
        this.K = gr9.a(new xrb("", lc3Var, sc3.a));
        this.L = gr9.a(new urb(true, false, null, lc3Var, 0, null, lc3Var, -1, lc3Var, -1));
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new hsb(this, null, 0));
        this.M = str;
        this.N = aw5Var;
        this.O = mrbVar;
        this.P = new nc1(new pq7(this), (byte) 0);
        za1 za1VarA2 = vtb.a(this);
        aj2 aj2Var2 = rw2.a;
        g(za1VarA2, nh2.c, new lq8(this, null));
    }

    public static String u(Map map) {
        String str = (String) map.get("raw");
        return str == null ? "" : str;
    }

    public final void d() {
        boolean zIsTerminated;
        yd5 yd5Var = this.C;
        if (yd5Var != null) {
            yd5Var.cancel(null);
        }
        Object objN = n();
        if (objN instanceof AutoCloseable) {
            return;
        }
        if (!(objN instanceof ExecutorService)) {
            w58.p();
            return;
        }
        ExecutorService executorService = (ExecutorService) objN;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final void j(float f) {
        Object value;
        fr9 fr9Var = this.H;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, onb.a((onb) value, 0, 0, 0, false, false, false, false, 0.0f, 0.0f, 0L, 0L, 0, 0.0f, false, 0.0f, 0.0f, 0, 0, false, false, wx1.P(f, 0.0f, 1.0f), false, false, 6815743)));
        }
    }

    public final void k(float f) {
        Object value;
        fr9 fr9Var = this.H;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, onb.a((onb) value, 0, 0, 0, false, false, false, false, 0.0f, 0.0f, 0L, 0L, 0, 0.0f, false, f, 0.0f, 0, 0, false, false, 0.0f, false, false, 8372223)));
        }
    }

    public final double l(int i) {
        List list = (List) this.x.getValue();
        if (list == null) {
            list = lc3.a;
        }
        ne3 ne3Var = (ne3) fc1.A0(i, list);
        if (ne3Var == null) {
            return 0.0d;
        }
        boolean z = true;
        boolean z2 = m().s == ne3Var.b;
        if (m().r.length() <= 0 || (!lc5.Q(m().r, ne3Var.a) && !lc5.Q(m().r, wfc.l(ne3Var.c, false)))) {
            z = false;
        }
        if (z2 || z) {
            return wx1.O(m().t, 0.0d, 1.0d);
        }
        return 0.0d;
    }

    public final zv5 m() {
        zv5 zv5Var = this.v;
        if (zv5Var != null) {
            return zv5Var;
        }
        lc5.i0("book");
        throw null;
    }

    public final f49 n() {
        f49 f49Var = this.w;
        if (f49Var != null) {
            return f49Var;
        }
        lc5.i0("videoSource");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(int r21, boolean r22, defpackage.kt1 r23) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h49.o(int, boolean, kt1):java.lang.Object");
    }

    public final void p(int i) {
        Object value;
        if (i < 0) {
            return;
        }
        if (i != this.E) {
            v();
            this.E = i;
        }
        fr9 fr9Var = this.J;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
            } while (!fr9Var.j(value, ipb.a((ipb) value, 0, null, 0, 0.0d, 7)));
        }
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new tl0(this, i, (jt1) null, 12));
    }

    public final void q() {
        List list = (List) this.x.getValue();
        if (list == null) {
            list = lc3.a;
        }
        if (this.E < list.size() - 1) {
            p(this.E + 1);
        }
    }

    public final void r() {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new dsb(this, null, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(long r29, long r31) {
        /*
            r28 = this;
            r1 = r28
            r2 = r31
            fr9 r0 = r1.x
            java.lang.Object r4 = r0.getValue()
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto Lf
            goto L19
        Lf:
            int r5 = r1.E
            java.lang.Object r4 = defpackage.fc1.A0(r5, r4)
            ne3 r4 = (defpackage.ne3) r4
            if (r4 != 0) goto L1a
        L19:
            return
        L1a:
            int r5 = r1.E
            double r5 = r1.l(r5)
            r7 = 0
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 <= 0) goto L2b
            r7 = r29
            double r5 = (double) r7
            double r2 = (double) r2
            double r5 = r5 / r2
        L2b:
            r7 = r5
            int r2 = r1.E
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L38
            lc3 r0 = defpackage.lc3.a
        L38:
            java.lang.Object r0 = defpackage.fc1.A0(r2, r0)
            ne3 r0 = (defpackage.ne3) r0
            r13 = 0
            java.lang.String r2 = ""
            if (r0 != 0) goto L45
        L43:
            r3 = r2
            goto L5f
        L45:
            java.util.Map r3 = r1.z
            java.lang.String r0 = r0.a
            java.lang.Object r0 = r3.get(r0)
            pva r0 = (defpackage.pva) r0
            if (r0 == 0) goto L5a
            java.util.Map r0 = r0.c
            if (r0 == 0) goto L5a
            java.lang.String r0 = u(r0)
            goto L5b
        L5a:
            r0 = r13
        L5b:
            if (r0 != 0) goto L5e
            goto L43
        L5e:
            r3 = r0
        L5f:
            zv5 r14 = r1.m()
            java.lang.String r0 = r4.a
            int r2 = r4.b
            r9 = 0
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r23 = defpackage.wx1.O(r7, r9, r11)
            r26 = 0
            r27 = -983041(0xfffffffffff0ffff, float:NaN)
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r25 = 0
            r21 = r0
            r22 = r2
            r20 = r3
            zv5 r0 = defpackage.zv5.a(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26, r27)
            r1.v = r0
            fr9 r0 = r1.J
            if (r0 == 0) goto Lad
        L8f:
            java.lang.Object r2 = r0.getValue()
            r14 = r2
            ipb r14 = (defpackage.ipb) r14
            int r5 = r1.E
            double r18 = r1.l(r5)
            r20 = 7
            r15 = 0
            r16 = 0
            r17 = 0
            ipb r5 = defpackage.ipb.a(r14, r15, r16, r17, r18, r20)
            boolean r2 = r0.j(r2, r5)
            if (r2 == 0) goto L8f
        Lad:
            vx1 r9 = defpackage.utb.a(r1)
            aj2 r0 = defpackage.rw2.a
            nh2 r10 = defpackage.nh2.c
            d45 r0 = new d45
            r6 = 0
            r2 = r4
            r4 = r7
            r7 = 4
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r1 = 2
            defpackage.ah1.J(r9, r10, r13, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h49.s(long, long):void");
    }

    public final void t(int i) {
        Object value;
        lc3 lc3Var;
        prb prbVar = (prb) fc1.A0(i, this.B);
        if (prbVar == null) {
            return;
        }
        fr9 fr9Var = this.L;
        if (fr9Var != null) {
            do {
                value = fr9Var.getValue();
                lc3Var = lc3.a;
            } while (!fr9Var.j(value, urb.a((urb) value, true, false, null, null, i, null, lc3Var, -1, lc3Var, -1, 12)));
        }
        yd5 yd5Var = this.C;
        jt1 jt1Var = null;
        if (yd5Var != null) {
            yd5Var.cancel(null);
        }
        yd5 yd5Var2 = this.D;
        if (yd5Var2 != null) {
            yd5Var2.cancel(null);
        }
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        this.C = g(za1VarA, nh2.c, new pc(this, i, prbVar, jt1Var, 15));
    }

    public final void v() {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new dsb(this, null, 8));
    }
}

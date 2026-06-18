package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class i45 extends qtb {
    public final fr9 A;
    public final fr9 B;
    public Map C;
    public Map D;
    public final se6 E;
    public final se6 F;
    public final HashSet G;
    public int H;
    public boolean I;
    public boolean J;
    public long K;
    public final pp1 L;
    public final fr9 M;
    public final fr9 N;
    public final fr9 O;
    public final fr9 P;
    public final fr9 Q;
    public final fr9 R;
    public final fr9 S;
    public final String c;
    public final aw5 d;
    public final i13 e;
    public final q15 f;
    public final cm0 s;
    public final t0c t;
    public final f4b u;
    public final xy4 v;
    public final rd8 w;
    public final t07 x = u07.a();
    public zv5 y;
    public t25 z;

    public i45(String str, aw5 aw5Var, i13 i13Var, q15 q15Var, cm0 cm0Var, t0c t0cVar, f4b f4bVar, xy4 xy4Var, rd8 rd8Var) {
        this.c = str;
        this.d = aw5Var;
        this.e = i13Var;
        this.f = q15Var;
        this.s = cm0Var;
        this.t = t0cVar;
        this.u = f4bVar;
        this.v = xy4Var;
        this.w = rd8Var;
        gr9.a(null);
        this.A = gr9.a(null);
        this.B = gr9.a(null);
        mc3 mc3Var = mc3.a;
        this.C = mc3Var;
        this.D = mc3Var;
        this.E = new se6(10);
        this.F = new se6(100);
        this.G = new HashSet();
        this.H = -1;
        this.I = true;
        this.J = true;
        this.L = new pp1();
        this.M = gr9.a(new zy4(0, 0, 1.0f, 0, 0, false, false, false, false, 0.5f, 2, 0, false, false, false, true, true, true, true, false));
        this.N = gr9.a(new ny4("", "", "", "", "", 0, "", "", "", false, false, false, false, false, false, false, false, false));
        this.O = gr9.a(new wy4(0, "", 0));
        sc3 sc3Var = sc3.a;
        lc3 lc3Var = lc3.a;
        this.P = gr9.a(new c35("", lc3Var, sc3Var));
        this.Q = gr9.a(new rz4(new st5(0, 3, 0), lc3Var));
        this.R = gr9.a(new o25(-1, -1, -1));
        this.S = gr9.a(new py4(lc3Var));
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new e45(0, null, this));
    }

    public static final qva j(i45 i45Var, int i) {
        List list = (List) i45Var.A.getValue();
        if (list == null) {
            list = lc3.a;
        }
        b21 b21Var = (b21) fc1.A0(i, list);
        if (b21Var == null) {
            return null;
        }
        return (qva) i45Var.D.get(b21Var.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.i45 r6, defpackage.kt1 r7) {
        /*
            fr9 r0 = r6.Q
            boolean r1 = r7 instanceof defpackage.g45
            if (r1 == 0) goto L15
            r1 = r7
            g45 r1 = (defpackage.g45) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            g45 r1 = new g45
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.a
            int r2 = r1.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.e11.e0(r7)
            goto L5e
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r3
        L2e:
            defpackage.e11.e0(r7)
            int r7 = r6.H
            r1.c = r4
            java.lang.Object r2 = r0.getValue()
            rz4 r2 = (defpackage.rz4) r2
            st5 r2 = r2.a
            int r2 = r2.h()
            java.lang.Object r5 = r0.getValue()
            rz4 r5 = (defpackage.rz4) r5
            java.util.List r5 = r5.b
            java.lang.Object r2 = defpackage.fc1.A0(r2, r5)
            uj7 r2 = (defpackage.uj7) r2
            if (r2 == 0) goto L54
            java.lang.String r2 = r2.a
            goto L55
        L54:
            r2 = r3
        L55:
            java.lang.Object r7 = r6.n(r7, r1, r2)
            xx1 r6 = defpackage.xx1.a
            if (r7 != r6) goto L5e
            return r6
        L5e:
            java.util.List r7 = (java.util.List) r7
            if (r0 == 0) goto L73
        L62:
            java.lang.Object r6 = r0.getValue()
            r1 = r6
            rz4 r1 = (defpackage.rz4) r1
            rz4 r1 = defpackage.rz4.b(r1, r3, r7, r4)
            boolean r6 = r0.j(r6, r1)
            if (r6 == 0) goto L62
        L73:
            heb r6 = defpackage.heb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i45.k(i45, kt1):java.lang.Object");
    }

    public static String x(Map map) {
        String str = (String) map.get("raw");
        return str == null ? "" : str;
    }

    public abstract void A(boolean z);

    public final void d() throws Exception {
        boolean zIsTerminated;
        AutoCloseable autoCloseableR = r();
        if (autoCloseableR instanceof AutoCloseable) {
            autoCloseableR.close();
            return;
        }
        if (!(autoCloseableR instanceof ExecutorService)) {
            if (autoCloseableR instanceof TypedArray) {
                ((TypedArray) autoCloseableR).recycle();
                return;
            }
            if (autoCloseableR instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseableR).release();
                return;
            } else if (autoCloseableR instanceof MediaDrm) {
                ((MediaDrm) autoCloseableR).release();
                return;
            } else {
                w58.p();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseableR;
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

    public final void l() {
        long j = this.K;
        if (j > 0) {
            long jC = r95.a.k().c() - j;
            this.K = 0L;
            vx1 vx1VarA = utb.a(this);
            aj2 aj2Var = rw2.a;
            ah1.J(vx1VarA, nh2.c, null, new w35(this, j, jC, null, 0), 2);
        }
    }

    public final String m(int i) {
        Map map;
        List list = (List) this.A.getValue();
        if (list == null) {
            list = lc3.a;
        }
        b21 b21Var = (b21) fc1.A0(i, list);
        if (b21Var != null) {
            qva qvaVar = (qva) this.D.get(b21Var.a);
            String strX = (qvaVar == null || (map = qvaVar.c) == null) ? null : x(map);
            if (strX != null) {
                return strX;
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(int r5, defpackage.kt1 r6, java.lang.String r7) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.x35
            if (r0 == 0) goto L13
            r0 = r6
            x35 r0 = (defpackage.x35) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            x35 r0 = new x35
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r6)
            goto L3f
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r6)
            hi r6 = new hi
            r6.<init>(r7, r5, r2)
            r0.c = r2
            java.io.Serializable r6 = r4.o(r5, r6, r0)
            xx1 r4 = defpackage.xx1.a
            if (r6 != r4) goto L3f
            return r4
        L3f:
            xl7 r6 = (defpackage.xl7) r6
            java.lang.Object r4 = r6.b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i45.n(int, kt1, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable o(int r5, defpackage.kb4 r6, defpackage.kt1 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.y35
            if (r0 == 0) goto L13
            r0 = r7
            y35 r0 = (defpackage.y35) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            y35 r0 = new y35
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
            goto L44
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r2
        L2e:
            defpackage.e11.e0(r7)
            r0.a = r6
            r0.d = r3
            pc r7 = new pc
            r1 = 6
            r7.<init>(r4, r5, r2, r1)
            java.lang.Object r7 = defpackage.wx1.a0(r7, r0)
            xx1 r4 = defpackage.xx1.a
            if (r7 != r4) goto L44
            return r4
        L44:
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i45.o(int, kb4, kt1):java.io.Serializable");
    }

    public final zv5 p() {
        zv5 zv5Var = this.y;
        if (zv5Var != null) {
            return zv5Var;
        }
        lc5.i0("book");
        throw null;
    }

    public abstract a15 q();

    public final t25 r() {
        t25 t25Var = this.z;
        if (t25Var != null) {
            return t25Var;
        }
        lc5.i0("imageSource");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r9.a.get(r3) == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        if (r3 == r11) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0145, code lost:
    
        if (r3 == r11) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0147, code lost:
    
        return r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(int r22, boolean r23, defpackage.kt1 r24) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i45.s(int, boolean, kt1):java.lang.Object");
    }

    public final void t(int i) {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new tl0(this, i, (jt1) null, 4));
    }

    public final void u(int i, float f) {
        if (i < 0) {
            return;
        }
        if (i != this.H) {
            z();
            this.H = i;
        }
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new b45(this, i, f, null, 0));
    }

    public final void v() {
        b21 b21Var;
        List list = (List) this.A.getValue();
        if (list == null || (b21Var = (b21) fc1.A0(this.H, list)) == null) {
            return;
        }
        fr9 fr9Var = this.R;
        int i = ((o25) fr9Var.getValue()).b;
        int i2 = ((o25) fr9Var.getValue()).c;
        ah1.J(utb.a(this), null, null, new d45(this, b21Var, m(this.H), i2 > 0 ? ((double) i) / ((double) i2) : 0.0d, null), 3);
    }

    public final void w() {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        nh2 nh2Var = nh2.c;
        jt1 jt1Var = null;
        g(za1VarA, nh2Var, new yw3(this, jt1Var, 24));
        g(vtb.a(this), nh2Var, new v35(5, jt1Var, this));
        g(vtb.a(this), nh2Var, new yw3(this, jt1Var, 25));
        g(vtb.a(this), nh2Var, new d45(this, jt1Var, 0));
    }

    public final void y() {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new e45(1, null, this));
    }

    public final void z() {
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        g(za1VarA, nh2.c, new v35(7, null, this));
    }
}

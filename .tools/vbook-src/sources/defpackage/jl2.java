package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jl2 implements dl2, cwb {
    public static final /* synthetic */ AtomicReferenceFieldUpdater t;
    public static final /* synthetic */ AtomicIntegerFieldUpdater u;
    public static final /* synthetic */ AtomicIntegerFieldUpdater v;
    public final cwb a;
    public final bi1 b;
    public final ae5 c;
    private volatile /* synthetic */ int closed;
    public final jx1 d;
    public final ir0 e;
    public final ir0 f;
    volatile /* synthetic */ Object pinger;
    public final ArrayList s;
    private volatile /* synthetic */ int started;

    static {
        new la4(new byte[0], m77.a);
        t = AtomicReferenceFieldUpdater.newUpdater(jl2.class, Object.class, "pinger");
        u = AtomicIntegerFieldUpdater.newUpdater(jl2.class, "closed");
        v = AtomicIntegerFieldUpdater.newUpdater(jl2.class, "started");
    }

    public jl2(cwb cwbVar, j11 j11Var, j11 j11Var2) {
        cwbVar.getClass();
        j11Var.getClass();
        j11Var2.getClass();
        this.a = cwbVar;
        this.pinger = null;
        this.b = p7c.d();
        ae5 ae5VarD = qx1.d();
        this.c = ae5VarD;
        this.d = cwbVar.q().minusKey(s00.s).plus(ae5VarD).plus(new rx1("ws-default"));
        g11 g11Var = h11.i;
        this.e = hn9.n(g11Var, j11Var);
        this.f = hn9.n(g11Var, j11Var2);
        this.closed = 0;
        this.s = new ArrayList();
        this.started = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.jl2 r8, defpackage.bg9 r9, defpackage.na4 r10, defpackage.kt1 r11) throws defpackage.qa4 {
        /*
            cwb r0 = r8.a
            boolean r1 = r11 instanceof defpackage.el2
            if (r1 == 0) goto L15
            r1 = r11
            el2 r1 = (defpackage.el2) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            el2 r1 = new el2
            r1.<init>(r8, r11)
        L1a:
            java.lang.Object r11 = r1.b
            int r2 = r1.d
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 == r3) goto L2a
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            r8 = 0
            return r8
        L2a:
            int r8 = r1.a
            defpackage.e11.e0(r11)
            goto L7a
        L30:
            defpackage.e11.e0(r11)
            byte[] r10 = r10.b
            int r10 = r10.length
            if (r9 == 0) goto L40
            wq0 r11 = r9.b()
            long r4 = r11.c
            int r11 = (int) r4
            goto L41
        L40:
            r11 = 0
        L41:
            int r10 = r10 + r11
            long r4 = (long) r10
            long r6 = r0.O0()
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 <= 0) goto L81
            if (r9 == 0) goto L50
            r9.close()
        L50:
            va1 r9 = new va1
            wfc r11 = defpackage.ua1.b
            java.lang.String r11 = "Frame is too big: "
            java.lang.String r2 = ". Max size is "
            java.lang.StringBuilder r11 = defpackage.xv5.u(r10, r11, r2)
            long r4 = r0.O0()
            r11.append(r4)
            java.lang.String r11 = r11.toString()
            r0 = 1009(0x3f1, float:1.414E-42)
            r9.<init>(r0, r11)
            r1.a = r10
            r1.d = r3
            java.lang.Object r8 = defpackage.qn9.i(r8, r9, r1)
            xx1 r9 = defpackage.xx1.a
            if (r8 != r9) goto L79
            return r9
        L79:
            r8 = r10
        L7a:
            qa4 r9 = new qa4
            long r10 = (long) r8
            r9.<init>(r10)
            throw r9
        L81:
            heb r8 = defpackage.heb.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl2.a(jl2, bg9, na4, kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009e, code lost:
    
        if (r10.d(r11, null, r0) == r6) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00c3 -> B:19:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.jl2 r10, defpackage.kt1 r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl2.b(jl2, kt1):java.lang.Object");
    }

    @Override // defpackage.cwb
    public final h11 A() {
        return this.e;
    }

    @Override // defpackage.cwb
    public final void F0(long j) {
        this.a.F0(j);
    }

    @Override // defpackage.cwb
    public final Object N(dwb dwbVar) {
        Object objN = this.a.N(dwbVar);
        return objN == xx1.a ? objN : heb.a;
    }

    @Override // defpackage.cwb
    public final long O0() {
        return this.a.O0();
    }

    public final void c() {
        w29 w29Var = (w29) t.getAndSet(this, null);
        if (w29Var != null) {
            w29Var.h(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.va1 r11, java.io.IOException r12, defpackage.kt1 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl2.d(va1, java.io.IOException, kt1):java.lang.Object");
    }

    @Override // defpackage.cwb
    public final w29 e0() {
        return this.f;
    }

    @Override // defpackage.vx1
    public final jx1 q() {
        return this.d;
    }

    @Override // defpackage.dl2
    public final void x0(List list) {
        List list2;
        int i = 0;
        if (!v.compareAndSet(this, 0, 1)) {
            w58.i(this, " is already started.", "WebSocket session ");
            return;
        }
        k46 k46Var = kl2.a;
        if (ww1.S(k46Var)) {
            StringBuilder sb = new StringBuilder("Starting default WebSocketSession(");
            sb.append(this);
            sb.append(") with negotiated extensions: ");
            list2 = list;
            sb.append(fc1.D0(list2, null, null, null, null, 63));
            k46Var.j(sb.toString());
        } else {
            list2 = list;
        }
        this.s.addAll(list2);
        c();
        rx1 rx1Var = xs7.a;
        ir0 ir0Var = this.f;
        ir0Var.getClass();
        jt1 jt1Var = null;
        ir0 ir0VarC = vm7.c(5, 6, null);
        ah1.J(this, xs7.a, null, new ws7(ir0VarC, ir0Var, null), 2);
        rx1 rx1Var2 = kl2.b;
        xdb xdbVar = rw2.b;
        rx1Var2.getClass();
        oq9 oq9VarJ = ah1.J(this, gx1.T(rx1Var2, xdbVar), null, new gl2(this, ir0VarC, null), 2);
        rx1 rx1Var3 = kl2.c;
        rx1Var3.getClass();
        ah1.J(this, null, null, new hl2(oq9VarJ, ah1.I(this, gx1.T(rx1Var3, xdbVar), zx1.d, new hl2(this, jt1Var, i)), this, jt1Var, 1), 3);
    }
}

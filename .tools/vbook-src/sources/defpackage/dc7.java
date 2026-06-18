package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import okhttp3.Protocol;
import okhttp3.Response;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class dc7 extends ts4 {
    public static final d6a v = new d6a(new av6(6));
    public final zb7 e;
    public final Set f = fw.Q0(new us4[]{aw4.a, xvb.a, er8.a});
    public final jx1 s;
    public final jx1 t;
    public final Map u;

    public dc7(zb7 zb7Var) {
        this.e = zb7Var;
        Map mapSynchronizedMap = Collections.synchronizedMap(new jl5(new qd2(1, this, dc7.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeoutConfig;)Lokhttp3/OkHttpClient;", 0, 20), new ss6(18)));
        mapSynchronizedMap.getClass();
        this.u = mapSynchronizedMap;
        if (System.getProperty("kotlinx.io.pool.size.bytes") == null && lc5.Q(System.getProperty("java.vm.name"), "Dalvik") && Runtime.getRuntime().maxMemory() > 10000000) {
            System.setProperty("kotlinx.io.pool.size.bytes", "2097152");
        }
        jx1 jx1VarT = gx1.T(new o0a(qx1.w(super.q())), new dy1(lr3.e, 0));
        this.s = jx1VarT;
        this.t = super.q().plus(jx1VarT);
        ah1.I(yf4.a, super.q(), zx1.c, new l64(this, (jt1) null, 20));
    }

    public static iv4 E(Response response, wc4 wc4Var, Object obj, jx1 jx1Var, fx3 fx3Var) {
        yv4 yv4Var = new yv4(response.d, response.c);
        Protocol protocol = response.b;
        protocol.getClass();
        int iOrdinal = protocol.ordinal();
        qu4 qu4Var = qu4.e;
        switch (iOrdinal) {
            case 0:
                qu4Var = qu4.g;
                break;
            case 1:
                qu4Var = qu4.f;
                break;
            case 2:
                qu4Var = qu4.h;
                break;
            case 3:
            case 4:
                break;
            case 5:
                qu4Var = qu4.i;
                break;
            case 6:
                qu4Var = qu4.d;
                break;
            default:
                mn5.g();
                return null;
        }
        qu4 qu4Var2 = qu4Var;
        jc7 jc7Var = new jc7(response.f);
        if (!(obj instanceof ut0) || ((on1) fx3Var.s).e(yu4.a) == null) {
            return new iv4(yv4Var, wc4Var, jc7Var, qu4Var2, obj, jx1Var);
        }
        j31.j();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(defpackage.fx3 r24, defpackage.kt1 r25) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc7.P(fx3, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a0(okhttp3.OkHttpClient r6, okhttp3.Request r7, defpackage.jx1 r8, defpackage.fx3 r9, defpackage.kt1 r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof defpackage.bc7
            if (r0 == 0) goto L13
            r0 = r10
            bc7 r0 = (defpackage.bc7) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            bc7 r0 = new bc7
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r5 = r0.d
            int r10 = r0.f
            r1 = 1
            r2 = 0
            if (r10 == 0) goto L32
            if (r10 != r1) goto L2c
            wc4 r6 = r0.c
            fx3 r9 = r0.b
            jx1 r8 = r0.a
            defpackage.e11.e0(r5)
            goto L80
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r2
        L32:
            defpackage.e11.e0(r5)
            wc4 r5 = defpackage.t62.a(r2)
            r0.a = r8
            r0.b = r9
            r0.c = r5
            r0.f = r1
            ay0 r10 = new ay0
            jt1 r0 = bx1.J(r0)
            r10.<init>(r1, r0)
            r10.u()
            r6.getClass()
            r7.getClass()
            okhttp3.internal.connection.RealCall r0 = new okhttp3.internal.connection.RealCall
            r3 = 0
            r0.<init>(r6, r7, r3)
            s00 r6 = defpackage.s00.s
            hx1 r6 = r8.get(r6)
            r6.getClass()
            yd5 r6 = (defpackage.yd5) r6
            vo0 r7 = new vo0
            r7.<init>(r0, r1)
            r6.invokeOnCompletion(r1, r1, r7)
            ab6 r6 = new ab6
            r6.<init>(r9, r10)
            r0.e(r6)
            java.lang.Object r6 = r10.s()
            xx1 r7 = defpackage.xx1.a
            if (r6 != r7) goto L7d
            return r7
        L7d:
            r4 = r6
            r6 = r5
            r5 = r4
        L80:
            okhttp3.Response r5 = (okhttp3.Response) r5
            okhttp3.ResponseBody r7 = r5.s
            yd5 r10 = defpackage.qx1.w(r8)
            zs5 r0 = new zs5
            r1 = 23
            r0.<init>(r7, r1)
            r10.invokeOnCompletion(r0)
            mr0 r7 = r7.I0()
            fc7 r10 = new fc7
            r10.<init>(r7, r8, r9, r2)
            r7 = 2
            yf4 r0 = defpackage.yf4.a
            wo9 r7 = defpackage.md2.y0(r0, r8, r10, r7)
            java.lang.Object r7 = r7.b
            jt0 r7 = (defpackage.jt0) r7
            iv4 r5 = E(r5, r6, r7, r8, r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc7.a0(okhttp3.OkHttpClient, okhttp3.Request, jx1, fx3, kt1):java.lang.Object");
    }

    @Override // defpackage.ts4, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        hx1 hx1Var = this.s.get(s00.s);
        hx1Var.getClass();
        ((ae5) hx1Var).o0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g0(okhttp3.OkHttpClient r11, okhttp3.Request r12, defpackage.jx1 r13, defpackage.fx3 r14, defpackage.kt1 r15) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.cc7
            if (r0 == 0) goto L13
            r0 = r15
            cc7 r0 = (defpackage.cc7) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            cc7 r0 = new cc7
            r0.<init>(r10, r15)
        L18:
            java.lang.Object r15 = r0.e
            int r1 = r0.s
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            hc7 r10 = r0.d
            wc4 r11 = r0.c
            fx3 r14 = r0.b
            jx1 r13 = r0.a
            defpackage.e11.e0(r15)
            goto L75
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r10)
            return r2
        L34:
            defpackage.e11.e0(r15)
            wc4 r15 = defpackage.t62.a(r2)
            java.lang.Object r1 = r14.s
            on1 r1 = (defpackage.on1) r1
            j00 r2 = defpackage.iwb.b
            java.lang.Object r1 = r1.c(r2)
            hwb r1 = (defpackage.hwb) r1
            hc7 r4 = new hc7
            zb7 r10 = r10.e
            r10.getClass()
            yvb r9 = r1.c
            r6 = r11
            r5 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            bi1 r10 = r4.c
            r10.Q(r4)
            r0.a = r8
            r0.b = r14
            r0.c = r15
            r0.d = r4
            r0.s = r3
            bi1 r10 = r4.d
            java.lang.Object r10 = r10.o(r0)
            xx1 r11 = defpackage.xx1.a
            if (r10 != r11) goto L71
            return r11
        L71:
            r11 = r15
            r13 = r8
            r15 = r10
            r10 = r4
        L75:
            okhttp3.Response r15 = (okhttp3.Response) r15
            iv4 r10 = E(r15, r11, r10, r13, r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc7.g0(okhttp3.OkHttpClient, okhttp3.Request, jx1, fx3, kt1):java.lang.Object");
    }

    @Override // defpackage.ts4, defpackage.vx1
    public final jx1 q() {
        return this.t;
    }
}

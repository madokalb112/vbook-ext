package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pz2 implements jz2 {
    public final m62 a;
    public final HashMap b;

    public pz2(m62 m62Var) {
        this.a = m62Var;
        aj2 aj2Var = rw2.a;
        iw0 iw0VarB = wx1.b(nh2.c);
        this.b = new HashMap();
        ah1.J(iw0VarB, null, null, new rf(this, null, 18), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.kt1 r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.lz2
            if (r0 == 0) goto L13
            r0 = r11
            lz2 r0 = (defpackage.lz2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            lz2 r0 = new lz2
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2d
            if (r1 != r3) goto L26
            defpackage.e11.e0(r11)
            goto L93
        L26:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r10)
            r10 = 0
            return r10
        L2d:
            defpackage.e11.e0(r11)
            m62 r10 = r10.a
            n92 r10 = r10.t
            ra8 r10 = r10.P()
            java.util.List r10 = r10.c()
            java.util.ArrayList r11 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.gc1.M(r10, r1)
            r11.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        L4b:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r10.next()
            fa2 r1 = (defpackage.fa2) r1
            dz2 r4 = new dz2
            java.lang.String r5 = r1.b
            java.lang.String r6 = r1.c
            boolean r1 = r1.d
            r4.<init>(r5, r6, r1)
            r11.add(r4)
            goto L4b
        L66:
            long r4 = defpackage.zk4.j()
            java.lang.String r10 = "yyyyMMdd_HHmmss"
            java.lang.String r10 = defpackage.zk4.i(r4, r10)
            java.lang.String r1 = "domains_"
            java.lang.String r5 = r1.concat(r10)
            mz2 r7 = new mz2
            r8 = 0
            r7.<init>(r11, r8, r2)
            r0.c = r3
            aj2 r10 = defpackage.rw2.a
            fj4 r10 = defpackage.r76.a
            xw3 r4 = new xw3
            r9 = 0
            java.lang.String r6 = "json"
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r11 = defpackage.ah1.b0(r10, r4, r0)
            xx1 r10 = defpackage.xx1.a
            if (r11 != r10) goto L93
            return r10
        L93:
            if (r11 == 0) goto L96
            r2 = r3
        L96:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz2.a(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.bi5 r6, defpackage.kt1 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.oz2
            if (r0 == 0) goto L13
            r0 = r7
            oz2 r0 = (defpackage.oz2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            oz2 r0 = new oz2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            xx1 r1 = defpackage.xx1.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L28
            defpackage.e11.e0(r7)
            goto L3a
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            return r4
        L2e:
            defpackage.e11.e0(r7)
            r0.c = r3
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r1) goto L3a
            return r1
        L3a:
            byte[] r7 = (byte[]) r7
            java.lang.String r6 = defpackage.iw9.z(r7)
            uf5 r7 = defpackage.xf5.a     // Catch: java.lang.Exception -> L5c
            r7.getClass()     // Catch: java.lang.Exception -> L5c
            wv r0 = new wv     // Catch: java.lang.Exception -> L5c
            cz2 r1 = defpackage.dz2.Companion     // Catch: java.lang.Exception -> L5c
            oi5 r1 = r1.serializer()     // Catch: java.lang.Exception -> L5c
            r2 = 0
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L5c
            oi5 r0 = defpackage.s32.J0(r0)     // Catch: java.lang.Exception -> L5c
            oi5 r0 = (defpackage.oi5) r0     // Catch: java.lang.Exception -> L5c
            java.lang.Object r4 = r7.a(r0, r6)     // Catch: java.lang.Exception -> L5c
            goto L7e
        L5c:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            if (r6 != 0) goto L65
            java.lang.String r6 = ""
        L65:
            boolean r7 = defpackage.pu.a()
            if (r7 == 0) goto L7e
            e46 r7 = e46.b
            k89 r0 = k89.c
            bh5 r1 = r7.a
            k89 r1 = r1.a
            int r1 = r1.compareTo(r0)
            if (r1 > 0) goto L7e
            java.lang.String r1 = "Log"
            r7.a(r0, r1, r6, r4)
        L7e:
            java.util.List r4 = (java.util.List) r4
            m62 r6 = r5.a
            n92 r6 = r6.t
            kz2 r7 = new kz2
            r7.<init>(r5, r4, r3)
            ym9.l(r6, r7)
            heb r5 = defpackage.heb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz2.b(bi5, kt1):java.lang.Object");
    }
}

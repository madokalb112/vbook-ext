package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class lw2 {
    public static final zy2 a = new zy2("UNDEFINED", 6);
    public static final zy2 b = new zy2("REUSABLE_CLAIMED", 6);

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #2 {all -> 0x0069, blocks: (B:16:0x0049, B:18:0x0057, B:20:0x005d, B:33:0x008d, B:23:0x006b, B:25:0x0079, B:30:0x0084, B:32:0x008a, B:38:0x009a, B:41:0x00a3, B:40:0x00a0, B:28:0x007f), top: B:54:0x0049, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.jt1 r9, java.lang.Object r10) {
        /*
            boolean r0 = r9 instanceof defpackage.kw2
            if (r0 == 0) goto Lae
            kw2 r9 = (defpackage.kw2) r9
            nx1 r0 = r9.d
            kt1 r1 = r9.e
            java.lang.Throwable r2 = defpackage.qm8.a(r10)
            if (r2 != 0) goto L12
            r3 = r10
            goto L18
        L12:
            ei1 r3 = new ei1
            r4 = 0
            r3.<init>(r4, r2)
        L18:
            jx1 r2 = r1.getContext()
            boolean r2 = c(r0, r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r9.f = r3
            r9.c = r4
            jx1 r10 = r1.getContext()
            b(r0, r10, r9)
            return
        L2f:
            zg3 r0 = defpackage.isa.a()
            long r5 = r0.c
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r9.f = r3
            r9.c = r4
            r0.x0(r9)
            goto La8
        L46:
            r0.F0(r4)
            jx1 r2 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            s00 r3 = defpackage.s00.s     // Catch: java.lang.Throwable -> L69
            hx1 r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L69
            yd5 r2 = (defpackage.yd5) r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L6b
            boolean r3 = r2.isActive()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r10 = r2.getCancellationException()     // Catch: java.lang.Throwable -> L69
            pm8 r10 = defpackage.e11.I(r10)     // Catch: java.lang.Throwable -> L69
            r9.resumeWith(r10)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r10 = move-exception
            goto La4
        L6b:
            java.lang.Object r2 = r9.s     // Catch: java.lang.Throwable -> L69
            jx1 r3 = r1.getContext()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = defpackage.gsa.c(r3, r2)     // Catch: java.lang.Throwable -> L69
            zy2 r5 = defpackage.gsa.a     // Catch: java.lang.Throwable -> L69
            if (r2 == r5) goto L7e
            aeb r5 = defpackage.lx1.B0(r1, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r1.resumeWith(r10)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r10 = r5.t0()     // Catch: java.lang.Throwable -> L69
            if (r10 == 0) goto L8d
        L8a:
            defpackage.gsa.a(r3, r2)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r10 = r0.T0()     // Catch: java.lang.Throwable -> L69
            if (r10 != 0) goto L8d
        L93:
            r0.p0(r4)
            goto La8
        L97:
            r10 = move-exception
            if (r5 == 0) goto La0
            boolean r1 = r5.t0()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La3
        La0:
            defpackage.gsa.a(r3, r2)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r10     // Catch: java.lang.Throwable -> L69
        La4:
            r9.h(r10)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.p0(r4)
            throw r9
        Lae:
            r9.resumeWith(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw2.a(jt1, java.lang.Object):void");
    }

    public static final void b(nx1 nx1Var, jx1 jx1Var, Runnable runnable) {
        try {
            nx1Var.A(jx1Var, runnable);
        } catch (Throwable th) {
            throw new jw2(th, nx1Var, jx1Var);
        }
    }

    public static final boolean c(nx1 nx1Var, jx1 jx1Var) throws jw2 {
        try {
            return nx1Var.R(jx1Var);
        } catch (Throwable th) {
            throw new jw2(th, nx1Var, jx1Var);
        }
    }
}

package defpackage;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface rs4 extends vx1, Closeable {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object i0(defpackage.dc7 r9, defpackage.fx3 r10, defpackage.kt1 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.qs4
            if (r0 == 0) goto L13
            r0 = r11
            qs4 r0 = (defpackage.qs4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            qs4 r0 = new qs4
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 1
            r4 = 0
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.e11.e0(r11)
            return r11
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            return r4
        L31:
            fx3 r10 = r0.a
            defpackage.e11.e0(r11)
            goto L7a
        L37:
            defpackage.e11.e0(r11)
            java.lang.Object r11 = r10.f
            yd5 r11 = (defpackage.yd5) r11
            r0.a = r10
            r0.d = r3
            rx1 r1 = defpackage.ys4.a
            ae5 r1 = new ae5
            r1.<init>(r11)
            jx1 r11 = r9.t
            jx1 r11 = r11.plus(r1)
            rx1 r6 = defpackage.ys4.a
            jx1 r11 = r11.plus(r6)
            jx1 r6 = r0.getContext()
            s00 r7 = defpackage.s00.s
            hx1 r6 = r6.get(r7)
            yd5 r6 = (defpackage.yd5) r6
            if (r6 != 0) goto L64
            goto L77
        L64:
            vo0 r7 = new vo0
            r8 = 6
            r7.<init>(r1, r8)
            ax2 r3 = r6.invokeOnCompletion(r3, r3, r7)
            vo0 r6 = new vo0
            r7 = 5
            r6.<init>(r3, r7)
            r1.invokeOnCompletion(r6)
        L77:
            if (r11 != r5) goto L7a
            goto L9a
        L7a:
            jx1 r11 = (defpackage.jx1) r11
            bl5 r1 = new bl5
            r1.<init>(r11)
            jx1 r11 = r11.plus(r1)
            yw3 r1 = new yw3
            r3 = 19
            r1.<init>(r9, r10, r4, r3)
            nl2 r9 = defpackage.ah1.x(r9, r11, r1, r2)
            r0.a = r4
            r0.d = r2
            java.lang.Object r9 = r9.o(r0)
            if (r9 != r5) goto L9b
        L9a:
            return r5
        L9b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rs4.i0(dc7, fx3, kt1):java.lang.Object");
    }
}

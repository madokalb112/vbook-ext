package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ad3 {
    public static final bv4 a = new bv4(23);
    public static final fu6 b = new fu6(23);
    public static final rx1 c = new rx1("encoder-inflate-writer");

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.util.zip.Inflater r4, defpackage.bv0 r5, java.nio.ByteBuffer r6, java.util.zip.CRC32 r7, defpackage.kt1 r8) throws java.util.zip.DataFormatException {
        /*
            boolean r0 = r8 instanceof defpackage.zc3
            if (r0 == 0) goto L13
            r0 = r8
            zc3 r0 = (defpackage.zc3) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zc3 r0 = new zc3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            int r4 = r0.a
            defpackage.e11.e0(r8)
            goto L5f
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r8)
            r6.clear()
            byte[] r8 = r6.array()
            int r1 = r6.position()
            int r3 = r6.remaining()
            int r4 = r4.inflate(r8, r1, r3)
            int r8 = r6.position()
            int r8 = r8 + r4
            r6.position(r8)
            r6.flip()
            defpackage.yl2.g(r7, r6)
            r0.a = r4
            r0.c = r2
            java.lang.Object r5 = defpackage.gc1.k0(r5, r6, r0)
            xx1 r6 = defpackage.xx1.a
            if (r5 != r6) goto L5f
            return r6
        L5f:
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad3.a(java.util.zip.Inflater, bv0, java.nio.ByteBuffer, java.util.zip.CRC32, kt1):java.lang.Object");
    }

    public static final ut0 b(ut0 ut0Var, boolean z, jx1 jx1Var) {
        return (jt0) md2.y0(yf4.a, jx1Var.plus(c), new yc3(z, ut0Var, null), 2).b;
    }
}

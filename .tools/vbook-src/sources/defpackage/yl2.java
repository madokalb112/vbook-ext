package defpackage;

import java.nio.ByteBuffer;
import java.util.zip.Checksum;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class yl2 {
    public static final byte[] a = new byte[7];
    public static final rx1 b = new rx1("encoder-deflate-writer");
    public static final rx1 c = new rx1("encoder-deflate-reader");

    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:107)|(1:(1:(3:(1:(6:15|101|16|90|91|92)(2:20|21))(7:22|103|23|24|(3:86|(2:89|90)|88)|91|92)|94|95)(5:27|105|28|29|110))(7:33|34|35|36|108|62|(4:64|(2:66|(2:68|88)(2:69|70))(2:73|74)|94|95)(2:75|76)))(4:39|40|41|111)|100|56|(2:58|(8:61|36|108|62|(0)(0)|100|56|(2:79|(2:81|(1:83)(4:84|(0)|91|92))(1:93))(0)))(0)|88) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fd, code lost:
    
        if (e(r20, r3) == r11) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00ac: MOVE (r1 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:173), block:B:38:0x00ab */
    /* JADX WARN: Path cross not found for [B:107:0x002c, B:42:0x00c6], limit reached: 107 */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117 A[Catch: all -> 0x01a3, TRY_LEAVE, TryCatch #2 {all -> 0x01a3, blocks: (B:86:0x01d1, B:56:0x0111, B:58:0x0117, B:79:0x01a5, B:81:0x01ab, B:93:0x01fb), top: B:100:0x0111 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0143 A[Catch: all -> 0x018d, TryCatch #7 {all -> 0x018d, blocks: (B:62:0x013b, B:64:0x0143, B:66:0x014f, B:73:0x0193, B:74:0x019a), top: B:108:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a5 A[Catch: all -> 0x01a3, TRY_ENTER, TryCatch #2 {all -> 0x01a3, blocks: (B:86:0x01d1, B:56:0x0111, B:58:0x0117, B:79:0x01a5, B:81:0x01ab, B:93:0x01fb), top: B:100:0x0111 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d1 A[Catch: all -> 0x01a3, TRY_LEAVE, TryCatch #2 {all -> 0x01a3, blocks: (B:86:0x01d1, B:56:0x0111, B:58:0x0117, B:79:0x01a5, B:81:0x01ab, B:93:0x01fb), top: B:100:0x0111 }] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [pa7] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [pa7] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [pa7] */
    /* JADX WARN: Type inference failed for: r1v20, types: [pa7] */
    /* JADX WARN: Type inference failed for: r1v21, types: [pa7] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r21v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.nio.Buffer, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.ut0 r19, defpackage.bv0 r20, boolean r21, defpackage.pa7 r22, defpackage.kt1 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl2.a(ut0, bv0, boolean, pa7, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.bv0 r5, java.util.zip.Deflater r6, java.nio.ByteBuffer r7, defpackage.ib4 r8, defpackage.kt1 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.ul2
            if (r0 == 0) goto L13
            r0 = r9
            ul2 r0 = (defpackage.ul2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ul2 r0 = new ul2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.e
            int r1 = r0.f
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L33
            ib4 r5 = r0.d
            java.nio.ByteBuffer r6 = r0.c
            java.util.zip.Deflater r7 = r0.b
            bv0 r8 = r0.a
            defpackage.e11.e0(r9)
            r4 = r8
            r8 = r5
            r5 = r4
            r4 = r7
            r7 = r6
            r6 = r4
            goto L3d
        L33:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L3a:
            defpackage.e11.e0(r9)
        L3d:
            java.lang.Object r9 = r8.invoke()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L85
            r7.clear()
            boolean r9 = r7.hasRemaining()
            if (r9 == 0) goto L6f
            byte[] r9 = r7.array()
            int r1 = r7.arrayOffset()
            int r3 = r7.position()
            int r3 = r3 + r1
            int r1 = r7.remaining()
            int r9 = r6.deflate(r9, r3, r1)
            int r1 = r7.position()
            int r1 = r1 + r9
            r7.position(r1)
        L6f:
            r7.flip()
            r0.a = r5
            r0.b = r6
            r0.c = r7
            r0.d = r8
            r0.f = r2
            java.lang.Object r9 = defpackage.gc1.k0(r5, r7, r0)
            xx1 r1 = defpackage.xx1.a
            if (r9 != r1) goto L3d
            return r1
        L85:
            heb r5 = defpackage.heb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl2.b(bv0, java.util.zip.Deflater, java.nio.ByteBuffer, ib4, kt1):java.lang.Object");
    }

    public static ut0 c(ut0 ut0Var, boolean z, jx1 jx1Var) {
        ws0 ws0Var = xs0.a;
        ut0Var.getClass();
        ws0Var.getClass();
        jx1Var.getClass();
        return (jt0) md2.x0(yf4.a, jx1Var.plus(b), new vl2(0, (jt1) null, ut0Var, ws0Var, z)).b;
    }

    public static ta1 d(bv0 bv0Var, boolean z, jx1 jx1Var) {
        ws0 ws0Var = xs0.a;
        bv0Var.getClass();
        ws0Var.getClass();
        jx1Var.getClass();
        jx1 jx1VarPlus = jx1Var.plus(c);
        jt1 jt1Var = null;
        vl2 vl2Var = new vl2(1, jt1Var, bv0Var, ws0Var, z);
        jx1VarPlus.getClass();
        int i = 0;
        jt0 jt0Var = new jt0(false);
        oq9 oq9VarJ = ah1.J(yf4.a, jx1VarPlus, null, new ug(vl2Var, jt0Var, jt1Var, 4), 2);
        oq9VarJ.invokeOnCompletion(new vt0(jt0Var, i));
        return new ta1(jt0Var, new ju0(oq9VarJ, jt1Var, i));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.bv0 r8, defpackage.kt1 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.wl2
            if (r0 == 0) goto L13
            r0 = r9
            wl2 r0 = (defpackage.wl2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wl2 r0 = new wl2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.c
            r2 = 0
            heb r3 = defpackage.heb.a
            r4 = 3
            r5 = 2
            r6 = 1
            xx1 r7 = defpackage.xx1.a
            if (r1 == 0) goto L42
            if (r1 == r6) goto L3c
            if (r1 == r5) goto L36
            if (r1 != r4) goto L30
            defpackage.e11.e0(r9)
            return r3
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r2
        L36:
            bv0 r8 = r0.a
            defpackage.e11.e0(r9)
            goto L79
        L3c:
            bv0 r8 = r0.a
            defpackage.e11.e0(r9)
            goto L61
        L42:
            defpackage.e11.e0(r9)
            r9 = -29921(0xffffffffffff8b1f, float:NaN)
            short r9 = java.lang.Short.reverseBytes(r9)
            r0.a = r8
            r0.c = r6
            bg9 r1 = r8.f()
            r1.C(r9)
            java.lang.Object r9 = defpackage.sdc.j0(r8, r0)
            if (r9 != r7) goto L5d
            goto L5e
        L5d:
            r9 = r3
        L5e:
            if (r9 != r7) goto L61
            goto L86
        L61:
            r0.a = r8
            r0.c = r5
            bg9 r9 = r8.f()
            r1 = 8
            r9.M(r1)
            java.lang.Object r9 = defpackage.sdc.j0(r8, r0)
            if (r9 != r7) goto L75
            goto L76
        L75:
            r9 = r3
        L76:
            if (r9 != r7) goto L79
            goto L86
        L79:
            r0.a = r2
            r0.c = r4
            r9 = 7
            byte[] r1 = defpackage.yl2.a
            java.lang.Object r8 = defpackage.md2.v0(r8, r1, r9, r0)
            if (r8 != r7) goto L87
        L86:
            return r7
        L87:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl2.e(bv0, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.bv0 r9, java.util.zip.CRC32 r10, java.util.zip.Deflater r11, defpackage.kt1 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.xl2
            if (r0 == 0) goto L13
            r0 = r12
            xl2 r0 = (defpackage.xl2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            xl2 r0 = new xl2
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.d
            heb r2 = defpackage.heb.a
            r3 = 2
            r4 = 1
            r5 = 0
            xx1 r6 = defpackage.xx1.a
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            defpackage.e11.e0(r12)
            goto L7f
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            return r5
        L33:
            java.util.zip.Deflater r11 = r0.b
            bv0 r9 = r0.a
            defpackage.e11.e0(r12)
            goto L5f
        L3b:
            defpackage.e11.e0(r12)
            long r7 = r10.getValue()
            int r10 = (int) r7
            int r10 = java.lang.Integer.reverseBytes(r10)
            r0.a = r9
            r0.b = r11
            r0.d = r4
            bg9 r12 = r9.f()
            r12.writeInt(r10)
            java.lang.Object r10 = defpackage.sdc.j0(r9, r0)
            if (r10 != r6) goto L5b
            goto L5c
        L5b:
            r10 = r2
        L5c:
            if (r10 != r6) goto L5f
            goto L7e
        L5f:
            int r10 = r11.getTotalIn()
            int r10 = java.lang.Integer.reverseBytes(r10)
            r0.a = r5
            r0.b = r5
            r0.d = r3
            bg9 r11 = r9.f()
            r11.writeInt(r10)
            java.lang.Object r9 = defpackage.sdc.j0(r9, r0)
            if (r9 != r6) goto L7b
            goto L7c
        L7b:
            r9 = r2
        L7c:
            if (r9 != r6) goto L7f
        L7e:
            return r6
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl2.f(bv0, java.util.zip.CRC32, java.util.zip.Deflater, kt1):java.lang.Object");
    }

    public static final void g(Checksum checksum, ByteBuffer byteBuffer) {
        checksum.getClass();
        byteBuffer.getClass();
        if (!byteBuffer.hasArray()) {
            gp.l("buffer need to be array-backed");
            return;
        }
        checksum.update(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }
}

package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xk5 implements c24 {
    public int a;
    public final /* synthetic */ bv0 b;
    public final /* synthetic */ ze5 c;
    public final /* synthetic */ zk5 d;
    public final /* synthetic */ oi5 e;
    public final /* synthetic */ Charset f;

    public xk5(bv0 bv0Var, ze5 ze5Var, zk5 zk5Var, oi5 oi5Var, Charset charset) {
        this.b = bv0Var;
        this.c = ze5Var;
        this.d = zk5Var;
        this.e = oi5Var;
        this.f = charset;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
    
        if (r2.c(r0) != r7) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.c24
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10, defpackage.jt1 r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.wk5
            if (r0 == 0) goto L13
            r0 = r11
            wk5 r0 = (defpackage.wk5) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            wk5 r0 = new wk5
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.b
            bv0 r2 = r9.b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            xx1 r7 = defpackage.xx1.a
            if (r1 == 0) goto L4b
            if (r1 == r5) goto L3f
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            defpackage.e11.e0(r11)
            goto La0
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            return r6
        L37:
            int r9 = r0.f
            int r10 = r0.e
            defpackage.e11.e0(r11)
            goto L91
        L3f:
            int r10 = r0.f
            int r1 = r0.e
            java.lang.Object r5 = r0.d
            defpackage.e11.e0(r11)
            r11 = r10
            r10 = r5
            goto L6d
        L4b:
            defpackage.e11.e0(r11)
            int r1 = r9.a
            int r11 = r1 + 1
            r9.a = r11
            if (r1 < 0) goto La3
            r11 = 0
            if (r1 <= 0) goto L6d
            ze5 r8 = r9.c
            byte[] r8 = r8.c
            r0.d = r10
            r0.e = r1
            r0.f = r11
            r0.b = r5
            int r5 = r8.length
            java.lang.Object r5 = defpackage.md2.v0(r2, r8, r5, r0)
            if (r5 != r7) goto L6d
            goto L9f
        L6d:
            zk5 r5 = r9.d
            ue5 r5 = r5.a
            oi5 r8 = r9.e
            oi5 r8 = (defpackage.oi5) r8
            java.lang.String r10 = r5.b(r8, r10)
            java.nio.charset.Charset r9 = r9.f
            byte[] r9 = sg9.p(r10, r9)
            r0.d = r6
            r0.e = r1
            r0.f = r11
            r0.b = r4
            int r10 = r9.length
            java.lang.Object r9 = defpackage.md2.v0(r2, r9, r10, r0)
            if (r9 != r7) goto L8f
            goto L9f
        L8f:
            r9 = r11
            r10 = r1
        L91:
            r0.d = r6
            r0.e = r10
            r0.f = r9
            r0.b = r3
            java.lang.Object r9 = r2.c(r0)
            if (r9 != r7) goto La0
        L9f:
            return r7
        La0:
            heb r9 = defpackage.heb.a
            return r9
        La3:
            java.lang.ArithmeticException r9 = new java.lang.ArithmeticException
            java.lang.String r10 = "Index overflow has happened"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk5.b(java.lang.Object, jt1):java.lang.Object");
    }
}

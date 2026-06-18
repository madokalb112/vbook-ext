package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xq9 extends o1a implements zb4 {
    public int a;
    public /* synthetic */ c24 b;
    public /* synthetic */ int c;
    public final /* synthetic */ yq9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq9(yq9 yq9Var, jt1 jt1Var) {
        super(3, jt1Var);
        this.d = yq9Var;
    }

    @Override // defpackage.zb4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        xq9 xq9Var = new xq9(this.d, (jt1) obj3);
        xq9Var.b = (c24) obj;
        xq9Var.c = iIntValue;
        return xq9Var.invokeSuspend(heb.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r14.b(defpackage.gb9.a, r13) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0081, code lost:
    
        if (r0.b(defpackage.gb9.c, r13) != r10) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077 A[PHI: r0
  0x0077: PHI (r0v6 c24) = (r0v4 c24), (r0v5 c24), (r0v9 c24) binds: [B:26:0x005d, B:31:0x0074, B:12:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            yq9 r0 = r13.d
            long r1 = r0.b
            int r3 = r13.a
            r4 = 0
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            xx1 r10 = defpackage.xx1.a
            if (r3 == 0) goto L37
            if (r3 == r9) goto L33
            if (r3 == r8) goto L2d
            if (r3 == r7) goto L27
            if (r3 == r6) goto L21
            if (r3 != r5) goto L1b
            goto L33
        L1b:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r13)
            return r4
        L21:
            c24 r0 = r13.b
            defpackage.e11.e0(r14)
            goto L77
        L27:
            c24 r0 = r13.b
            defpackage.e11.e0(r14)
            goto L6c
        L2d:
            c24 r0 = r13.b
            defpackage.e11.e0(r14)
            goto L59
        L33:
            defpackage.e11.e0(r14)
            goto L84
        L37:
            defpackage.e11.e0(r14)
            c24 r14 = r13.b
            int r3 = r13.c
            if (r3 <= 0) goto L4b
            r13.a = r9
            gb9 r0 = defpackage.gb9.a
            java.lang.Object r13 = r14.b(r0, r13)
            if (r13 != r10) goto L84
            goto L83
        L4b:
            long r11 = r0.a
            r13.b = r14
            r13.a = r8
            java.lang.Object r0 = defpackage.tw1.H(r11, r13)
            if (r0 != r10) goto L58
            goto L83
        L58:
            r0 = r14
        L59:
            r8 = 0
            int r14 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r14 <= 0) goto L77
            r13.b = r0
            r13.a = r7
            gb9 r14 = defpackage.gb9.b
            java.lang.Object r14 = r0.b(r14, r13)
            if (r14 != r10) goto L6c
            goto L83
        L6c:
            r13.b = r0
            r13.a = r6
            java.lang.Object r14 = defpackage.tw1.H(r1, r13)
            if (r14 != r10) goto L77
            goto L83
        L77:
            r13.b = r4
            r13.a = r5
            gb9 r14 = defpackage.gb9.c
            java.lang.Object r13 = r0.b(r14, r13)
            if (r13 != r10) goto L84
        L83:
            return r10
        L84:
            heb r13 = defpackage.heb.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xq9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

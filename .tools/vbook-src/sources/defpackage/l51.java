package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class l51 implements c24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l51(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(int r5, defpackage.jt1 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.wq9
            if (r0 == 0) goto L13
            r0 = r6
            wq9 r0 = (defpackage.wq9) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wq9 r0 = new wq9
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            heb r2 = defpackage.heb.a
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L27
            defpackage.e11.e0(r6)
            return r2
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r6)
            if (r5 <= 0) goto L4e
            java.lang.Object r5 = r4.b
            ng8 r5 = (defpackage.ng8) r5
            boolean r6 = r5.a
            if (r6 != 0) goto L4e
            r5.a = r3
            java.lang.Object r4 = r4.c
            c24 r4 = (defpackage.c24) r4
            r0.c = r3
            gb9 r5 = defpackage.gb9.a
            java.lang.Object r4 = r4.b(r5, r0)
            xx1 r5 = defpackage.xx1.a
            if (r4 != r5) goto L4e
            return r5
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l51.a(int, jt1):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x069e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:308:0x0686 -> B:309:0x068c). Please report as a decompilation issue!!! */
    @Override // defpackage.c24
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r69, defpackage.jt1 r70) {
        /*
            Method dump skipped, instruction units count: 1790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l51.b(java.lang.Object, jt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(defpackage.jt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.poa
            if (r0 == 0) goto L13
            r0 = r5
            poa r0 = (defpackage.poa) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            poa r0 = new poa
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            a07 r4 = r0.a
            defpackage.e11.e0(r5)
            goto L54
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r5)
            java.lang.Object r5 = r4.c
            a07 r5 = (a07) r5
            java.lang.Object r4 = r4.b
            ec r4 = (defpackage.ec) r4
            r0.a = r5
            r0.d = r2
            android.os.BatteryManager r4 = r4.b
            if (r4 == 0) goto L47
            r0 = 4
            int r4 = r4.getIntProperty(r0)
            goto L48
        L47:
            r4 = -1
        L48:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r4)
            xx1 r4 = defpackage.xx1.a
            if (r0 != r4) goto L52
            return r4
        L52:
            r4 = r5
            r5 = r0
        L54:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.setValue(r5)
            heb r4 = defpackage.heb.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l51.c(jt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r8.b(r10, r0) == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(defpackage.gnb r9, defpackage.jt1 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.smb
            if (r0 == 0) goto L13
            r0 = r10
            smb r0 = (defpackage.smb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            smb r0 = new smb
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L38
            if (r1 == r4) goto L32
            if (r1 != r3) goto L2c
            defpackage.e11.e0(r10)
            goto L9d
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r2
        L32:
            c24 r8 = r0.a
            defpackage.e11.e0(r10)
            goto L92
        L38:
            defpackage.e11.e0(r10)
            java.lang.Object r10 = r8.b
            c24 r10 = (defpackage.c24) r10
            java.lang.Object r8 = r8.c
            af r8 = (defpackage.af) r8
            r0.a = r10
            r0.d = r4
            int r1 = r8.b
            switch(r1) {
                case 1: goto L57;
                default: goto L4c;
            }
        L4c:
            java.lang.String r9 = r9.c
            gnb r8 = r8.k()
            gnb r8 = r8.b(r9)
            goto L8c
        L57:
            java.lang.String r1 = r9.c
            java.lang.String r1 = defpackage.ww1.T(r1)
            java.lang.Object r4 = r8.d
            java.lang.String r4 = (java.lang.String) r4
            r6 = 0
            boolean r6 = defpackage.iw9.K(r1, r4, r6)
            if (r6 == 0) goto L79
            int r9 = r4.length()
            java.lang.String r9 = r1.substring(r9)
            gnb r8 = r8.k()
            gnb r8 = r8.b(r9)
            goto L8c
        L79:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "Jail not base root : "
            r8.<init>(r1)
            java.lang.String r9 = r9.c
            java.lang.String r1 = " | "
            java.lang.String r8 = defpackage.j39.n(r8, r9, r1, r4)
            sy3.p(r8)
            r8 = r2
        L8c:
            if (r8 != r5) goto L8f
            goto L9c
        L8f:
            r7 = r10
            r10 = r8
            r8 = r7
        L92:
            r0.a = r2
            r0.d = r3
            java.lang.Object r8 = r8.b(r10, r0)
            if (r8 != r5) goto L9d
        L9c:
            return r5
        L9d:
            heb r8 = defpackage.heb.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l51.d(gnb, jt1):java.lang.Object");
    }
}

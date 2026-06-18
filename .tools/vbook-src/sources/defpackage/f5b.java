package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f5b implements c24 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n5b b;

    public /* synthetic */ f5b(n5b n5bVar, int i) {
        this.a = i;
        this.b = n5bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r7, defpackage.jt1 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.e5b
            if (r0 == 0) goto L13
            r0 = r8
            e5b r0 = (defpackage.e5b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            e5b r0 = new e5b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            n5b r6 = r6.b
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            n5b r7 = r0.b
            java.lang.String r0 = r0.a
            defpackage.e11.e0(r8)
            goto L63
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r2
        L37:
            java.lang.String r7 = r0.a
            defpackage.e11.e0(r8)
            goto L50
        L3d:
            defpackage.e11.e0(r8)
            r6.o()
            r6.u = r7
            r0.a = r7
            r0.e = r4
            java.lang.Object r8 = defpackage.n5b.j(r6, r0)
            if (r8 != r5) goto L50
            goto L60
        L50:
            v5b r8 = r6.s
            if (r8 == 0) goto L67
            r0.a = r7
            r0.b = r6
            r0.e = r3
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r5) goto L61
        L60:
            return r5
        L61:
            r0 = r7
            r7 = r6
        L63:
            r2 = r8
            java.util.List r2 = (java.util.List) r2
            goto L69
        L67:
            r0 = r7
            r7 = r6
        L69:
            if (r2 != 0) goto L6d
            lc3 r2 = defpackage.lc3.a
        L6d:
            r7.v = r2
            fr9 r6 = r6.z
            r6.k(r0)
            heb r6 = defpackage.heb.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f5b.a(java.lang.String, jt1):java.lang.Object");
    }

    @Override // defpackage.c24
    public final Object b(Object obj, jt1 jt1Var) {
        Object value;
        int i = this.a;
        heb hebVar = heb.a;
        n5b n5bVar = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                if (!n5bVar.G) {
                    n5bVar.F = true;
                } else {
                    n5bVar.y();
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fr9 fr9Var = n5bVar.d;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, u4b.a((u4b) value, false, zBooleanValue, false, false, null, null, null, null, 253)));
                }
                break;
        }
        return hebVar;
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class gs4 {
    public static final k46 a = n46.b("io.ktor.client.plugins.HttpCallValidator");
    public static final y91 b = new y91("HttpResponseValidator", bs4.a, new xl4(11));
    public static final j00 c;

    static {
        fbb fbbVarD;
        a91 a91VarA = ug8.a(Boolean.class);
        try {
            fbbVarD = ug8.d(Boolean.TYPE);
        } catch (Throwable unused) {
            fbbVarD = null;
        }
        c = new j00("ExpectSuccessAttributeKey", new bbb(a91VarA, fbbVarD));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.util.List r4, java.lang.Throwable r5, defpackage.wu4 r6, defpackage.kt1 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ds4
            if (r0 == 0) goto L13
            r0 = r7
            ds4 r0 = (defpackage.ds4) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ds4 r0 = new ds4
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            int r0 = r0.b
            if (r0 == 0) goto L30
            r4 = 1
            if (r0 == r4) goto L24
            r4 = 2
            if (r0 != r4) goto L28
        L24:
            defpackage.e11.e0(r7)
            goto L2e
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return
        L2e:
            r4 = 0
            goto L56
        L30:
            defpackage.e11.e0(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Processing exception "
            r7.<init>(r0)
            r7.append(r5)
            java.lang.String r5 = " for request "
            r7.append(r5)
            ngb r5 = r6.getUrl()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            k46 r6 = defpackage.gs4.a
            r6.j(r5)
            java.util.Iterator r4 = r4.iterator()
        L56:
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L5d
            return
        L5d:
            java.lang.Object r4 = r4.next()
            if (r4 != 0) goto L67
            defpackage.mn5.g()
            return
        L67:
            defpackage.j31.j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gs4.a(java.util.List, java.lang.Throwable, wu4, kt1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(java.util.List r5, defpackage.gv4 r6, defpackage.kt1 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.es4
            if (r0 == 0) goto L13
            r0 = r7
            es4 r0 = (defpackage.es4) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            es4 r0 = new es4
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            int r5 = r0.c
            java.util.Iterator r6 = r0.b
            gv4 r1 = r0.a
            defpackage.e11.e0(r7)
            r7 = r1
            goto L5e
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L33:
            defpackage.e11.e0(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "Validating response for request "
            r7.<init>(r1)
            ks4 r1 = r6.p0()
            wu4 r1 = r1.c()
            ngb r1 = r1.getUrl()
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            k46 r1 = defpackage.gs4.a
            r1.j(r7)
            java.util.Iterator r5 = r5.iterator()
            r7 = 0
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L5e:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L7b
            java.lang.Object r1 = r6.next()
            yb4 r1 = (defpackage.yb4) r1
            r0.a = r7
            r0.b = r6
            r0.c = r5
            r0.e = r2
            java.lang.Object r1 = r1.invoke(r7, r0)
            xx1 r3 = defpackage.xx1.a
            if (r1 != r3) goto L5e
            return r3
        L7b:
            heb r5 = defpackage.heb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gs4.b(java.util.List, gv4, kt1):java.lang.Object");
    }
}

package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class ma8 extends qtb {
    public final d6a c = new d6a(new wn6(this, 15));
    public final pp1 d = new pp1();

    public abstract void j(String str, String str2);

    public abstract void k();

    public abstract void l(String str);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.bi5 r5, defpackage.kb4 r6, defpackage.kt1 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ka8
            if (r0 == 0) goto L13
            r0 = r7
            ka8 r0 = (defpackage.ka8) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ka8 r0 = new ka8
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.d
            heb r2 = defpackage.heb.a
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2b
            bi5 r5 = r0.a
            defpackage.e11.e0(r7)     // Catch: java.lang.Throwable -> L29
            goto L42
        L29:
            r6 = move-exception
            goto L44
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L32:
            defpackage.e11.e0(r7)
            r0.a = r5     // Catch: java.lang.Throwable -> L29
            r0.d = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r6 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L29
            xx1 r7 = defpackage.xx1.a
            if (r6 != r7) goto L42
            return r7
        L42:
            r7 = r2
            goto L49
        L44:
            pm8 r7 = new pm8
            r7.<init>(r6)
        L49:
            boolean r6 = r7 instanceof defpackage.pm8
            pp1 r0 = r4.d
            if (r6 != 0) goto L5e
            r6 = r7
            heb r6 = (defpackage.heb) r6
            ha8 r6 = new ha8
            java.lang.String r1 = r5.getName()
            r6.<init>(r1)
            r4.i(r0, r6)
        L5e:
            java.lang.Throwable r6 = defpackage.qm8.a(r7)
            if (r6 == 0) goto L73
            r6.printStackTrace()
            ga8 r6 = new ga8
            java.lang.String r5 = r5.getName()
            r6.<init>(r5)
            r4.i(r0, r6)
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ma8.m(bi5, kb4, kt1):java.lang.Object");
    }

    public abstract Object n(byte[] bArr, jt1 jt1Var);

    public abstract b24 o();

    public abstract void p(bi5 bi5Var, lm8 lm8Var);
}

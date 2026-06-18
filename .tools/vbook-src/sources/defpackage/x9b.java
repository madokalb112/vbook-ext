package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class x9b extends dj0 {
    public static final String q(x9b x9bVar, wi0 wi0Var, jl3 jl3Var) {
        String str = jl3Var.h;
        StringBuilder sb = new StringBuilder();
        sb.append(wi0Var.f);
        String str2 = wi0Var.g;
        if (!bw9.a0(str2)) {
            sb.append("\n");
            sb.append(str2);
        }
        if (!bw9.a0(str)) {
            sb.append("\n\n");
            sb.append(bw9.B0(str).toString());
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.x9b r5, defpackage.wi0 r6, defpackage.kt1 r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof defpackage.u9b
            if (r0 == 0) goto L16
            r0 = r7
            u9b r0 = (defpackage.u9b) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.s = r1
            goto L1b
        L16:
            u9b r0 = new u9b
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r5 = r0.e
            int r7 = r0.s
            r1 = 1
            if (r7 == 0) goto L37
            if (r7 != r1) goto L30
            java.lang.StringBuilder r6 = r0.d
            java.lang.StringBuilder r7 = r0.c
            java.lang.StringBuilder r1 = r0.b
            wi0 r0 = r0.a
            defpackage.e11.e0(r5)
            goto L5f
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r5)
            r5 = 0
            return r5
        L37:
            defpackage.e11.e0(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            d6a r7 = defpackage.eu9.R
            java.lang.Object r7 = r7.getValue()
            pv9 r7 = (defpackage.pv9) r7
            r0.a = r6
            r0.b = r5
            r0.c = r5
            r0.d = r5
            r0.s = r1
            java.lang.Object r7 = defpackage.wn9.y(r7, r0)
            xx1 r0 = defpackage.xx1.a
            if (r7 != r0) goto L5a
            return r0
        L5a:
            r1 = r5
            r0 = r6
            r6 = r1
            r5 = r7
            r7 = r6
        L5f:
            java.lang.String r5 = (java.lang.String) r5
            r6.append(r5)
            java.lang.String r5 = "\n"
            r7.append(r5)
            java.util.List r6 = r0.b
            java.util.Iterator r6 = r6.iterator()
        L6f:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L9a
            java.lang.Object r2 = r6.next()
            v92 r2 = (defpackage.v92) r2
            java.lang.String r3 = "- "
            r7.append(r3)
            java.util.Map r3 = r0.c
            int r2 = r2.d
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r2)
            java.lang.Object r2 = r3.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L93
            java.lang.String r2 = ""
        L93:
            r7.append(r2)
            r7.append(r5)
            goto L6f
        L9a:
            java.lang.String r5 = r1.toString()
            java.lang.CharSequence r5 = defpackage.bw9.B0(r5)
            java.lang.String r5 = r5.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x9b.r(x9b, wi0, kt1):java.lang.Object");
    }

    public static final String s(x9b x9bVar, String str) {
        x9bVar.getClass();
        aq4 aq4Var = aq4.a;
        b93 b93VarY = aq4.f(str).Y();
        b93VarY.U("img, video, audio, svg, canvas, picture, source, embed, object, iframe").d();
        return bw9.B0(aq4.g(aq4.e().d(b93VarY)).b).toString();
    }
}

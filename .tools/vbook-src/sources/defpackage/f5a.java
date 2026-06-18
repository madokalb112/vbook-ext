package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class f5a implements z4a {
    public final m4a a;
    public final e4a b;

    public f5a(m4a m4aVar, e4a e4aVar) {
        this.a = m4aVar;
        this.b = e4aVar;
    }

    public static String e(String str) {
        String strC0 = bw9.C0(bw9.B0(iw9.I(str, '\\', '/')).toString(), '/');
        return strC0.length() == 0 ? "" : "/".concat(strC0);
    }

    public final Object a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, j5a j5aVar, o5a o5aVar) throws Throwable {
        String strConcat = "backup_".concat(zk4.i(zk4.j(), "yyyyMMdd_HHmmss"));
        a5a a5aVar = new a5a(this, z, z2, z3, z4, z5, j5aVar, null);
        aj2 aj2Var = rw2.a;
        Object objB0 = ah1.b0(r76.a, new xw3(strConcat, "zip", a5aVar, null, 1), o5aVar);
        return objB0 == xx1.a ? objB0 : heb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00df -> B:26:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0106 -> B:41:0x0109). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(be5 r11, java.lang.String r12, defpackage.kt1 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f5a.b(be5, java.lang.String, kt1):java.lang.Object");
    }

    public final f4a c() {
        m4a m4aVar = this.a;
        int iIntValue = ((Number) m4aVar.b.c(m4a.h[0], m4aVar)).intValue();
        f4a.b.getClass();
        return xn7.a(iIntValue);
    }

    public final vvb d() {
        m4a m4aVar = this.a;
        da7 da7Var = m4aVar.d;
        ni5[] ni5VarArr = m4a.h;
        String string = bw9.B0((String) da7Var.c(ni5VarArr[2], m4aVar)).toString();
        String string2 = bw9.B0((String) m4aVar.e.c(ni5VarArr[3], m4aVar)).toString();
        String str = (String) m4aVar.f.c(ni5VarArr[4], m4aVar);
        String string3 = bw9.B0((String) m4aVar.g.c(ni5VarArr[5], m4aVar)).toString();
        if (string.length() == 0 || string2.length() == 0 || str.length() == 0) {
            return null;
        }
        return new vvb(string, string2, str, string3);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.bi5 r9, defpackage.lm8 r10, defpackage.j5a r11, defpackage.kt1 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f5a.f(bi5, lm8, j5a, kt1):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        if (r8 == r6) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.kt1 r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.d5a
            if (r0 == 0) goto L13
            r0 = r8
            d5a r0 = (defpackage.d5a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            d5a r0 = new d5a
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            xx1 r6 = defpackage.xx1.a
            if (r1 == 0) goto L3c
            if (r1 == r5) goto L38
            if (r1 == r4) goto L34
            if (r1 == r3) goto L30
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            return r2
        L30:
            defpackage.e11.e0(r8)
            goto L62
        L34:
            defpackage.e11.e0(r8)
            return r8
        L38:
            defpackage.e11.e0(r8)
            goto L48
        L3c:
            defpackage.e11.e0(r8)
            r0.c = r5
            f4a r8 = r7.c()
            if (r8 != r6) goto L48
            goto L72
        L48:
            f4a r8 = (defpackage.f4a) r8
            int r8 = r8.ordinal()
            if (r8 == 0) goto L6a
            if (r8 == r5) goto L59
            if (r8 != r4) goto L55
            goto L59
        L55:
            defpackage.mn5.g()
            return r2
        L59:
            r0.c = r3
            f4a r8 = r7.c()
            if (r8 != r6) goto L62
            goto L72
        L62:
            java.lang.String r7 = "Cloud sync for "
            java.lang.String r0 = " is not implemented"
            so9.l(r8, r0, r7)
            return r2
        L6a:
            r0.c = r4
            java.lang.Object r7 = r7.h(r0)
            if (r7 != r6) goto L73
        L72:
            return r6
        L73:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f5a.g(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0102 A[Catch: all -> 0x0171, TRY_ENTER, TryCatch #1 {all -> 0x0171, blocks: (B:56:0x00f3, B:60:0x0102, B:61:0x0106, B:53:0x00d5), top: B:88:0x00d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012a A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #4 {all -> 0x003b, blocks: (B:16:0x0036, B:65:0x0124, B:67:0x012a, B:70:0x0157, B:72:0x015b, B:74:0x0161, B:75:0x0168, B:76:0x0169, B:77:0x016e), top: B:94:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0157 A[Catch: all -> 0x003b, TRY_ENTER, TryCatch #4 {all -> 0x003b, blocks: (B:16:0x0036, B:65:0x0124, B:67:0x012a, B:70:0x0157, B:72:0x015b, B:74:0x0161, B:75:0x0168, B:76:0x0169, B:77:0x016e), top: B:94:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.kt1 r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f5a.h(kt1):java.lang.Object");
    }

    public final Object i(vvb vvbVar, lq8 lq8Var) throws Throwable {
        Object objB = b(new be5(bw9.B0(vvbVar.a).toString(), bw9.B0(vvbVar.b).toString(), vvbVar.c), bw9.B0(vvbVar.d).toString(), lq8Var);
        return objB == xx1.a ? objB : heb.a;
    }
}

package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fxb {
    public static final rt8 m = qu1.k0(new rhb(2), new elb(21));
    public final cn7 a = dk9.x((Object) null);
    public final cn7 b;
    public final cn7 c;
    public final cn7 d;
    public final cn7 e;
    public final cn7 f;
    public final cn7 g;
    public final zm7 h;
    public Bundle i;
    public long j;
    public tvb k;
    public final fr9 l;

    public fxb() {
        Boolean bool = Boolean.FALSE;
        this.b = dk9.x(bool);
        this.c = dk9.x(bool);
        this.d = dk9.x((Object) null);
        this.e = dk9.x("");
        this.f = dk9.x((Object) null);
        this.g = dk9.x(bool);
        this.h = new zm7(-1);
        this.j = 0L;
        this.l = gr9.a(null);
    }

    public final Object a(kt1 kt1Var) {
        Object objN = cx1.N(new u31(this.l, 2), kt1Var);
        return objN == xx1.a ? objN : heb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r9, defpackage.kt1 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.wwb
            if (r0 == 0) goto L13
            r0 = r10
            wwb r0 = (defpackage.wwb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            wwb r0 = new wwb
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            heb r2 = defpackage.heb.a
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            xx1 r7 = defpackage.xx1.a
            if (r1 == 0) goto L40
            if (r1 == r5) goto L3a
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            defpackage.e11.e0(r10)
            return r2
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r8)
            return r6
        L36:
            defpackage.e11.e0(r10)
            goto L98
        L3a:
            java.lang.String r9 = r0.a
            defpackage.e11.e0(r10)
            goto L4e
        L40:
            defpackage.e11.e0(r10)
            r0.a = r9
            r0.d = r5
            java.lang.Object r10 = r8.a(r0)
            if (r10 != r7) goto L4e
            goto La2
        L4e:
            owb r10 = r8.e()
            if (r10 == 0) goto L65
            uf4 r10 = r10.d
            if (r10 == 0) goto L65
            java.lang.Object r10 = r10.b
            android.webkit.WebView r10 = (android.webkit.WebView) r10
            android.webkit.WebSettings r10 = r10.getSettings()
            java.lang.String r10 = r10.getUserAgentString()
            goto L66
        L65:
            r10 = r6
        L66:
            boolean r10 = defpackage.lc5.Q(r9, r10)
            if (r10 != 0) goto La3
            owb r10 = r8.e()
            if (r10 == 0) goto L81
            uf4 r10 = r10.d
            if (r10 == 0) goto L81
            java.lang.Object r10 = r10.b
            android.webkit.WebView r10 = (android.webkit.WebView) r10
            android.webkit.WebSettings r10 = r10.getSettings()
            r10.setUserAgentString(r9)
        L81:
            java.lang.String r9 = r8.d()
            if (r9 == 0) goto La3
            boolean r9 = r8.h()
            if (r9 == 0) goto L98
            r0.a = r6
            r0.d = r4
            java.lang.Object r9 = r8.n(r0)
            if (r9 != r7) goto L98
            goto La2
        L98:
            r0.a = r6
            r0.d = r3
            java.lang.Object r8 = r8.k(r0)
            if (r8 != r7) goto La3
        La2:
            return r7
        La3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxb.b(java.lang.String, kt1):java.lang.Object");
    }

    public final void c() {
        this.l.k(null);
        Boolean bool = Boolean.FALSE;
        this.g.setValue(bool);
        this.b.setValue(bool);
        this.c.setValue(bool);
        this.d.setValue((Object) null);
        this.e.setValue("");
        this.f.setValue((Object) null);
        owb owbVarE = e();
        if (owbVarE != null) {
            owbVarE.a.destroy();
            owbVarE.f.clear();
            owbVarE.e = null;
        }
        this.a.setValue((Object) null);
        uv1.a.getClass();
        tv1.a().getClass();
    }

    public final String d() {
        return (String) this.f.getValue();
    }

    public final owb e() {
        return (owb) this.a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.kt1 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.xwb
            if (r0 == 0) goto L13
            r0 = r7
            xwb r0 = (defpackage.xwb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xwb r0 = new xwb
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            heb r4 = defpackage.heb.a
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            defpackage.e11.e0(r7)
            return r4
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            r6 = 0
            return r6
        L33:
            defpackage.e11.e0(r7)
            goto L43
        L37:
            defpackage.e11.e0(r7)
            r0.c = r3
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r5) goto L43
            goto L52
        L43:
            owb r6 = r6.e()
            if (r6 == 0) goto L53
            r0.c = r2
            android.webkit.WebView r6 = r6.a
            r6.goBack()
            if (r4 != r5) goto L53
        L52:
            return r5
        L53:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxb.f(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.kt1 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ywb
            if (r0 == 0) goto L13
            r0 = r7
            ywb r0 = (defpackage.ywb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ywb r0 = new ywb
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            heb r4 = defpackage.heb.a
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            defpackage.e11.e0(r7)
            return r4
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            r6 = 0
            return r6
        L33:
            defpackage.e11.e0(r7)
            goto L43
        L37:
            defpackage.e11.e0(r7)
            r0.c = r3
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r5) goto L43
            goto L52
        L43:
            owb r6 = r6.e()
            if (r6 == 0) goto L53
            r0.c = r2
            android.webkit.WebView r6 = r6.a
            r6.goForward()
            if (r4 != r5) goto L53
        L52:
            return r5
        L53:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxb.g(kt1):java.lang.Object");
    }

    public final boolean h() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r8, java.lang.String r9, defpackage.jt1 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.zwb
            if (r0 == 0) goto L13
            r0 = r10
            zwb r0 = (defpackage.zwb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            zwb r0 = new zwb
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            heb r5 = defpackage.heb.a
            xx1 r6 = defpackage.xx1.a
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            defpackage.e11.e0(r10)
            return r5
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            return r2
        L33:
            java.lang.String r9 = r0.b
            java.lang.String r8 = r0.a
            defpackage.e11.e0(r10)
            goto L4b
        L3b:
            defpackage.e11.e0(r10)
            r0.a = r8
            r0.b = r9
            r0.e = r4
            java.lang.Object r10 = r7.a(r0)
            if (r10 != r6) goto L4b
            goto L63
        L4b:
            r7.m(r9)
            owb r7 = r7.e()
            if (r7 == 0) goto L64
            r0.a = r2
            r0.b = r2
            r0.e = r3
            android.webkit.WebView r7 = r7.a
            java.lang.String r10 = "text/html"
            r7.loadData(r8, r10, r9)
            if (r5 != r6) goto L64
        L63:
            return r6
        L64:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxb.i(java.lang.String, java.lang.String, jt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r8, defpackage.kt1 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.axb
            if (r0 == 0) goto L13
            r0 = r9
            axb r0 = (defpackage.axb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            axb r0 = new axb
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            heb r5 = defpackage.heb.a
            xx1 r6 = defpackage.xx1.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            defpackage.e11.e0(r9)
            return r5
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            return r2
        L33:
            java.lang.String r8 = r0.a
            defpackage.e11.e0(r9)
            goto L47
        L39:
            defpackage.e11.e0(r9)
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = r7.a(r0)
            if (r9 != r6) goto L47
            goto L5e
        L47:
            r7.m(r8)
            cn7 r9 = r7.f
            r9.setValue(r8)
            owb r7 = r7.e()
            if (r7 == 0) goto L5f
            r0.a = r2
            r0.d = r3
            r7.b(r8)
            if (r5 != r6) goto L5f
        L5e:
            return r6
        L5f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxb.j(java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.kt1 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.bxb
            if (r0 == 0) goto L13
            r0 = r7
            bxb r0 = (defpackage.bxb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            bxb r0 = new bxb
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 2
            heb r3 = defpackage.heb.a
            r4 = 1
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L33
            if (r1 != r2) goto L2c
            defpackage.e11.e0(r7)
            return r3
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            r6 = 0
            return r6
        L33:
            defpackage.e11.e0(r7)
            goto L43
        L37:
            defpackage.e11.e0(r7)
            r0.c = r4
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r5) goto L43
            goto L5f
        L43:
            r7 = 0
            zm7 r1 = r6.h
            r1.i(r7)
            cn7 r7 = r6.g
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.setValue(r1)
            owb r6 = r6.e()
            if (r6 == 0) goto L60
            r0.c = r2
            android.webkit.WebView r6 = r6.a
            r6.reload()
            if (r3 != r5) goto L60
        L5f:
            return r5
        L60:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxb.k(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(boolean r8, defpackage.kt1 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cxb
            if (r0 == 0) goto L13
            r0 = r9
            cxb r0 = (defpackage.cxb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cxb r0 = new cxb
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            heb r5 = defpackage.heb.a
            xx1 r6 = defpackage.xx1.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            defpackage.e11.e0(r9)
            return r5
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            return r2
        L33:
            boolean r8 = r0.a
            defpackage.e11.e0(r9)
            goto L47
        L39:
            defpackage.e11.e0(r9)
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = r7.a(r0)
            if (r9 != r6) goto L47
            goto Laf
        L47:
            owb r7 = r7.e()
            if (r7 == 0) goto Lb0
            r0.a = r8
            r0.d = r3
            java.lang.String r9 = "ALGORITHMIC_DARKENING"
            boolean r9 = tn9.m(r9)
            if (r9 == 0) goto Lad
            android.webkit.WebView r7 = r7.a
            android.webkit.WebSettings r7 = r7.getSettings()
            qwb r9 = swb.a
            boolean r9 = r9.b()
            if (r9 == 0) goto La7
            wx7 r9 = twb.a     // Catch: java.lang.ClassCastException -> L7f
            pq7 r0 = new pq7     // Catch: java.lang.ClassCastException -> L7f
            java.lang.Class<org.chromium.support_lib_boundary.WebSettingsBoundaryInterface> r1 = org.chromium.support_lib_boundary.WebSettingsBoundaryInterface.class
            java.lang.Object r9 = r9.a     // Catch: java.lang.ClassCastException -> L7f
            org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface r9 = (org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface) r9     // Catch: java.lang.ClassCastException -> L7f
            java.lang.reflect.InvocationHandler r9 = r9.convertSettings(r7)     // Catch: java.lang.ClassCastException -> L7f
            java.lang.Object r9 = kf0.x(r1, r9)     // Catch: java.lang.ClassCastException -> L7f
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r9 = (org.chromium.support_lib_boundary.WebSettingsBoundaryInterface) r9     // Catch: java.lang.ClassCastException -> L7f
            r0.<init>(r9)     // Catch: java.lang.ClassCastException -> L7f
            goto La2
        L7f:
            r9 = move-exception
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 != r1) goto La6
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getCanonicalName()
            java.lang.String r0 = "android.webkit.WebSettingsWrapper"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto La6
            java.lang.String r7 = "WebSettingsCompat"
            java.lang.String r0 = "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info."
            android.util.Log.e(r7, r0, r9)
            wvb r0 = new wvb
            r0.<init>(r2)
        La2:
            r0.C(r8)
            goto Lad
        La6:
            throw r9
        La7:
            java.lang.String r7 = "This method is not supported by the current version of the framework and the current WebView APK"
            sy3.p(r7)
            return r2
        Lad:
            if (r5 != r6) goto Lb0
        Laf:
            return r6
        Lb0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxb.l(boolean, kt1):java.lang.Object");
    }

    public final void m(String str) {
        str.getClass();
        this.e.setValue(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.kt1 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.exb
            if (r0 == 0) goto L13
            r0 = r7
            exb r0 = (defpackage.exb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            exb r0 = new exb
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r1 = r0.c
            r2 = 2
            r3 = 1
            heb r4 = defpackage.heb.a
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            defpackage.e11.e0(r7)
            return r4
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            r6 = 0
            return r6
        L33:
            defpackage.e11.e0(r7)
            goto L43
        L37:
            defpackage.e11.e0(r7)
            r0.c = r3
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r5) goto L43
            goto L52
        L43:
            owb r6 = r6.e()
            if (r6 == 0) goto L53
            r0.c = r2
            android.webkit.WebView r6 = r6.a
            r6.stopLoading()
            if (r4 != r5) goto L53
        L52:
            return r5
        L53:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxb.n(kt1):java.lang.Object");
    }
}

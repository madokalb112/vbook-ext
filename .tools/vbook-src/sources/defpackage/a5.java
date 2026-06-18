package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a5 extends rl5 implements ib4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a5(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    @Override // defpackage.ib4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.a
            heb r1 = defpackage.heb.a
            java.lang.Object r2 = r10.e
            java.lang.Object r3 = r10.d
            java.lang.Object r4 = r10.c
            java.lang.Object r10 = r10.b
            switch(r0) {
                case 0: goto L1b;
                default: goto Lf;
            }
        Lf:
            zr2 r10 = (zr2) r10
            ib4 r4 = (defpackage.ib4) r4
            xr2 r3 = (xr2) r3
            zm5 r2 = (zm5) r2
            r10.g(r4, r3, r2)
            return r1
        L1b:
            android.app.Activity r4 = (android.app.Activity) r4
            android.content.Intent r3 = (android.content.Intent) r3
            java.lang.String r10 = (java.lang.String) r10
            r0 = 0
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r10 == 0) goto L64
            java.lang.String r9 = "ACTIVITY"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L32
            r0 = r8
            goto L69
        L32:
            java.lang.String r9 = "BROADCAST"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L3c
            r0 = r7
            goto L69
        L3c:
            java.lang.String r9 = "SERVICE"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L46
            r0 = r6
            goto L69
        L46:
            java.lang.String r9 = "FOREGROUND_SERVICE"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L50
            r0 = r5
            goto L69
        L50:
            java.lang.String r9 = "CALLBACK"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L5a
            r0 = 5
            goto L69
        L5a:
            java.lang.String r9 = "No enum constant androidx.glance.appwidget.action.ActionTrampolineType."
            java.lang.String r10 = r9.concat(r10)
            gp.l(r10)
            goto L69
        L64:
            java.lang.String r10 = "Name is null"
            defpackage.k27.n(r10)
        L69:
            int r10 = defpackage.dx1.C(r0)
            if (r10 == 0) goto L90
            if (r10 == r8) goto L8c
            if (r10 == r7) goto L88
            if (r10 == r6) goto L78
            if (r10 == r5) goto L8c
            goto L95
        L78:
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r10 < r0) goto L84
            xy5 r10 = defpackage.xy5.a
            r10.a(r4, r3)
            goto L95
        L84:
            r4.startService(r3)
            goto L95
        L88:
            r4.startService(r3)
            goto L95
        L8c:
            r4.sendBroadcast(r3)
            goto L95
        L90:
            android.os.Bundle r2 = (android.os.Bundle) r2
            r4.startActivity(r3, r2)
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a5.invoke():java.lang.Object");
    }
}

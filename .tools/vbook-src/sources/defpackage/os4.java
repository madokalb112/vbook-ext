package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class os4 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(os4.class, "requestLogged");
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(os4.class, "responseLogged");
    public final i46 a;
    public final StringBuilder b = new StringBuilder();
    public final StringBuilder c = new StringBuilder();
    public final ae5 d = qx1.d();
    public final ae5 e = qx1.d();
    private volatile /* synthetic */ int requestLogged = 0;
    private volatile /* synthetic */ int responseLogged = 0;

    public os4(i46 i46Var) {
        this.a = i46Var;
    }

    public final void a() {
        ae5 ae5Var = this.d;
        if (f.compareAndSet(this, 0, 1)) {
            try {
                String string = bw9.B0(this.b).toString();
                if (string.length() > 0) {
                    this.a.p(string);
                }
            } finally {
                ae5Var.o0();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.ls4
            if (r0 == 0) goto L13
            r0 = r5
            ls4 r0 = (defpackage.ls4) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ls4 r0 = new ls4
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.c
            heb r2 = defpackage.heb.a
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L27
            defpackage.e11.e0(r5)
            goto L48
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = defpackage.os4.g
            r1 = 0
            boolean r5 = r5.compareAndSet(r4, r1, r3)
            if (r5 != 0) goto L3b
            goto L5d
        L3b:
            r0.c = r3
            ae5 r5 = r4.d
            java.lang.Object r5 = r5.join(r0)
            xx1 r0 = defpackage.xx1.a
            if (r5 != r0) goto L48
            return r0
        L48:
            java.lang.StringBuilder r5 = r4.c
            java.lang.CharSequence r5 = defpackage.bw9.B0(r5)
            java.lang.String r5 = r5.toString()
            int r0 = r5.length()
            if (r0 <= 0) goto L5d
            i46 r4 = r4.a
            r4.p(r5)
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.os4.b(kt1):java.lang.Object");
    }

    public final void c(String str) {
        String string = bw9.B0(str).toString();
        StringBuilder sb = this.b;
        sb.append(string);
        sb.append('\n');
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, defpackage.kt1 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ms4
            if (r0 == 0) goto L13
            r0 = r6
            ms4 r0 = (defpackage.ms4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ms4 r0 = new ms4
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.lang.String r5 = r0.a
            defpackage.e11.e0(r6)
            goto L40
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r6)
            r0.a = r5
            r0.d = r2
            ae5 r6 = r4.e
            java.lang.Object r6 = r6.join(r0)
            xx1 r0 = defpackage.xx1.a
            if (r6 != r0) goto L40
            return r0
        L40:
            java.lang.StringBuilder r4 = r4.c
            r4.append(r5)
            heb r4 = defpackage.heb.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.os4.d(java.lang.String, kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r5, defpackage.kt1 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ns4
            if (r0 == 0) goto L13
            r0 = r6
            ns4 r0 = (defpackage.ns4) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ns4 r0 = new ns4
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            java.lang.String r5 = r0.a
            defpackage.e11.e0(r6)
            goto L40
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.e11.e0(r6)
            r0.a = r5
            r0.d = r2
            ae5 r6 = r4.d
            java.lang.Object r6 = r6.join(r0)
            xx1 r0 = defpackage.xx1.a
            if (r6 != r0) goto L40
            return r0
        L40:
            java.lang.CharSequence r5 = defpackage.bw9.B0(r5)
            java.lang.String r5 = r5.toString()
            i46 r4 = r4.a
            r4.p(r5)
            heb r4 = defpackage.heb.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.os4.e(java.lang.String, kt1):java.lang.Object");
    }
}

package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lc8 implements ut0 {
    public final k85 b;
    public xa1 c;
    public final wq0 d;
    public final ae5 e;
    public final jx1 f;

    public lc8(k85 k85Var, jx1 jx1Var) {
        jx1Var.getClass();
        this.b = k85Var;
        this.d = new wq0();
        ae5 ae5Var = new ae5((yd5) jx1Var.get(s00.s));
        this.e = ae5Var;
        this.f = jx1Var.plus(ae5Var).plus(new rx1("RawSourceChannel"));
    }

    @Override // defpackage.ut0
    public final void a(Throwable th) throws IOException {
        if (this.c != null) {
            return;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "Channel was cancelled";
        }
        qx1.p(this.e, message, th);
        this.b.close();
        String message2 = th.getMessage();
        this.c = new xa1(new IOException(message2 != null ? message2 : "Channel was cancelled", th));
    }

    @Override // defpackage.ut0
    public final Throwable b() {
        xa1 xa1Var = this.c;
        if (xa1Var != null) {
            return xa1Var.a(wa1.a);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ut0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(int r5, defpackage.kt1 r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.kc8
            if (r0 == 0) goto L13
            r0 = r6
            kc8 r0 = (defpackage.kc8) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kc8 r0 = new kc8
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            int r5 = r0.a
            defpackage.e11.e0(r6)
            goto L4c
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r2
        L2e:
            defpackage.e11.e0(r6)
            xa1 r6 = r4.c
            if (r6 == 0) goto L38
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L38:
            l64 r6 = new l64
            r6.<init>(r4, r5, r2)
            r0.a = r5
            r0.d = r3
            jx1 r1 = r4.f
            java.lang.Object r6 = defpackage.ah1.b0(r1, r6, r0)
            xx1 r0 = defpackage.xx1.a
            if (r6 != r0) goto L4c
            return r0
        L4c:
            wq0 r4 = r4.d
            long r0 = r4.c
            long r4 = (long) r5
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 < 0) goto L56
            goto L57
        L56:
            r3 = 0
        L57:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc8.e(int, kt1):java.lang.Object");
    }

    @Override // defpackage.ut0
    public final wq0 h() {
        return this.d;
    }

    @Override // defpackage.ut0
    public final boolean i() {
        return this.c != null && this.d.k();
    }
}

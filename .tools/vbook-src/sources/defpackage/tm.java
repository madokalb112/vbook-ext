package defpackage;

import android.graphics.pdf.PdfRenderer;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class tm implements AutoCloseable {
    public final /* synthetic */ int a;
    public final String b;
    public final t07 c;
    public AutoCloseable d;

    public tm(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = str;
                this.c = u07.a();
                break;
            default:
                this.b = str;
                this.c = u07.a();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable A(defpackage.kt1 r10) {
        /*
            r9 = this;
            int r0 = r9.a
            r1 = 0
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            xx1 r4 = defpackage.xx1.a
            r5 = 1
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            switch(r0) {
                case 0: goto L5a;
                default: goto Le;
            }
        Le:
            boolean r0 = r10 instanceof defpackage.kv5
            if (r0 == 0) goto L1f
            r0 = r10
            kv5 r0 = (defpackage.kv5) r0
            int r7 = r0.c
            r8 = r7 & r6
            if (r8 == 0) goto L1f
            int r7 = r7 - r6
            r0.c = r7
            goto L24
        L1f:
            kv5 r0 = new kv5
            r0.<init>(r9, r10)
        L24:
            java.lang.Object r10 = r0.a
            int r6 = r0.c
            if (r6 == 0) goto L34
            if (r6 != r5) goto L30
            defpackage.e11.e0(r10)
            goto L41
        L30:
            gp.j(r3)
            goto L59
        L34:
            defpackage.e11.e0(r10)
            r0.c = r5
            java.lang.Object r10 = r9.N(r0)
            if (r10 != r4) goto L41
            r2 = r4
            goto L59
        L41:
            android.graphics.pdf.PdfRenderer r10 = (android.graphics.pdf.PdfRenderer) r10
            int r9 = r10.getPageCount()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r9)
        L4c:
            if (r1 >= r9) goto L59
            dj7 r10 = new dj7
            r10.<init>(r1)
            r2.add(r10)
            int r1 = r1 + 1
            goto L4c
        L59:
            return r2
        L5a:
            boolean r0 = r10 instanceof defpackage.qm
            if (r0 == 0) goto L6b
            r0 = r10
            qm r0 = (defpackage.qm) r0
            int r7 = r0.c
            r8 = r7 & r6
            if (r8 == 0) goto L6b
            int r7 = r7 - r6
            r0.c = r7
            goto L70
        L6b:
            qm r0 = new qm
            r0.<init>(r9, r10)
        L70:
            java.lang.Object r10 = r0.a
            int r6 = r0.c
            if (r6 == 0) goto L80
            if (r6 != r5) goto L7c
            defpackage.e11.e0(r10)
            goto L8d
        L7c:
            gp.j(r3)
            goto La3
        L80:
            defpackage.e11.e0(r10)
            r0.c = r5
            java.lang.Object r10 = r9.E(r0)
            if (r10 != r4) goto L8d
            r2 = r4
            goto La3
        L8d:
            fs8 r10 = (defpackage.fs8) r10
            int r9 = r10.f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r9)
        L96:
            if (r1 >= r9) goto La3
            dj7 r10 = new dj7
            r10.<init>(r1)
            r2.add(r10)
            int r1 = r1 + 1
            goto L96
        La3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm.A(kt1):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(defpackage.kt1 r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.rm
            if (r0 == 0) goto L13
            r0 = r10
            rm r0 = (defpackage.rm) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            rm r0 = new rm
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 2
            r4 = 0
            xx1 r5 = defpackage.xx1.a
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L35
            if (r1 != r3) goto L2f
            r07 r0 = r0.a
            defpackage.e11.e0(r10)     // Catch: java.lang.Throwable -> L2d
            goto L7e
        L2d:
            r9 = move-exception
            goto L8c
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r9)
            return r4
        L35:
            int r1 = r0.b
            r07 r2 = r0.a
            defpackage.e11.e0(r10)
            r10 = r2
            goto L51
        L3e:
            defpackage.e11.e0(r10)
            t07 r10 = r9.c
            r0.a = r10
            r1 = 0
            r0.b = r1
            r0.e = r2
            java.lang.Object r2 = r10.p(r0)
            if (r2 != r5) goto L51
            goto L7a
        L51:
            java.lang.AutoCloseable r2 = r9.d     // Catch: java.lang.Throwable -> L85
            fs8 r2 = (defpackage.fs8) r2     // Catch: java.lang.Throwable -> L85
            if (r2 != 0) goto L88
            ab6 r2 = new ab6     // Catch: java.lang.Throwable -> L85
            android.content.Context r6 = defpackage.kl8.D     // Catch: java.lang.Throwable -> L85
            r6.getClass()     // Catch: java.lang.Throwable -> L85
            r7 = 23
            r2.<init>(r6, r7)     // Catch: java.lang.Throwable -> L85
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = r9.b     // Catch: java.lang.Throwable -> L85
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L85
            android.net.Uri r6 = android.net.Uri.fromFile(r6)     // Catch: java.lang.Throwable -> L85
            r0.a = r10     // Catch: java.lang.Throwable -> L85
            r0.b = r1     // Catch: java.lang.Throwable -> L85
            r0.e = r3     // Catch: java.lang.Throwable -> L85
            java.lang.Object r0 = r2.w(r6, r0)     // Catch: java.lang.Throwable -> L85
            if (r0 != r5) goto L7b
        L7a:
            return r5
        L7b:
            r8 = r0
            r0 = r10
            r10 = r8
        L7e:
            r2 = r10
            fs8 r2 = (defpackage.fs8) r2     // Catch: java.lang.Throwable -> L2d
            r9.d = r2     // Catch: java.lang.Throwable -> L2d
            r10 = r0
            goto L88
        L85:
            r9 = move-exception
            r0 = r10
            goto L8c
        L88:
            r10.q(r4)
            return r2
        L8c:
            r0.q(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm.E(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object N(defpackage.kt1 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.lv5
            if (r0 == 0) goto L13
            r0 = r5
            lv5 r0 = (defpackage.lv5) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            lv5 r0 = new lv5
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            t07 r0 = r0.a
            defpackage.e11.e0(r5)
            goto L41
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            return r3
        L2e:
            defpackage.e11.e0(r5)
            t07 r5 = r4.c
            r0.a = r5
            r0.d = r2
            java.lang.Object r0 = r5.p(r0)
            xx1 r1 = defpackage.xx1.a
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            java.lang.AutoCloseable r5 = r4.d     // Catch: java.lang.Throwable -> L5c
            android.graphics.pdf.PdfRenderer r5 = (android.graphics.pdf.PdfRenderer) r5     // Catch: java.lang.Throwable -> L5c
            if (r5 != 0) goto L5e
            android.graphics.pdf.PdfRenderer r5 = new android.graphics.pdf.PdfRenderer     // Catch: java.lang.Throwable -> L5c
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L5c
            java.lang.String r2 = r4.b     // Catch: java.lang.Throwable -> L5c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5c
            r2 = 268435456(0x10000000, float:2.524355E-29)
            android.os.ParcelFileDescriptor r1 = android.os.ParcelFileDescriptor.open(r1, r2)     // Catch: java.lang.Throwable -> L5c
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L5c
            r4.d = r5     // Catch: java.lang.Throwable -> L5c
            goto L5e
        L5c:
            r4 = move-exception
            goto L62
        L5e:
            r0.q(r3)
            return r5
        L62:
            r0.q(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm.N(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(defpackage.dj7 r18, int r19, int r20, int r21, int r22, int r23, int r24, defpackage.kt1 r25) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm.P(dj7, int, int, int, int, int, int, kt1):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.a) {
            case 0:
                fs8 fs8Var = (fs8) this.d;
                if (fs8Var != null) {
                    fs8Var.close();
                }
                break;
            default:
                PdfRenderer pdfRenderer = (PdfRenderer) this.d;
                if (pdfRenderer != null) {
                    pdfRenderer.close();
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.kt1 r18) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm.p(kt1):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(defpackage.dj7 r9, defpackage.kt1 r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm.q(dj7, kt1):java.lang.Object");
    }
}

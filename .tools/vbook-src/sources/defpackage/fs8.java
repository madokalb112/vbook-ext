package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class fs8 implements Closeable {
    public final Uri a;
    public final lq7 b;
    public final String c;
    public final ParcelFileDescriptor d;
    public final jx1 e;
    public final int f;
    public final ui8 s;
    public final AtomicInteger t;
    public final iw0 u;
    public final List v;
    public final AtomicBoolean w;

    public fs8(Uri uri, lq7 lq7Var, String str, ParcelFileDescriptor parcelFileDescriptor, jx1 jx1Var, int i, ui8 ui8Var) {
        uri.getClass();
        lq7Var.getClass();
        this.a = uri;
        this.b = lq7Var;
        this.c = str;
        this.d = parcelFileDescriptor;
        this.e = jx1Var;
        this.f = i;
        this.s = ui8Var;
        this.t = new AtomicInteger(1);
        this.u = wx1.b(jx1Var.plus(zib.a()));
        new CopyOnWriteArrayList();
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        listSynchronizedList.getClass();
        this.v = listSynchronizedList;
        if (((mq7) lq7Var).c() != null) {
            this.w = new AtomicBoolean(false);
        } else {
            gp.l("Required value was null.");
            throw null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.t.decrementAndGet() > 0) {
            return;
        }
        this.w.set(true);
        this.b.b();
        this.d.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (defpackage.tw1.H(((long) r11) * 400, r0) == r4) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0073 -> B:13:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.kb4 r11, defpackage.kt1 r12) throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.es8
            if (r0 == 0) goto L13
            r0 = r12
            es8 r0 = (defpackage.es8) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            es8 r0 = new es8
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            xx1 r4 = defpackage.xx1.a
            if (r1 == 0) goto L41
            if (r1 == r3) goto L37
            if (r1 != r2) goto L30
            int r11 = r0.b
            kb4 r1 = r0.a
            defpackage.e11.e0(r12)
        L2d:
            r12 = r11
            r11 = r1
            goto L45
        L30:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r10)
            r10 = 0
            return r10
        L37:
            int r11 = r0.b
            kb4 r1 = r0.a
            defpackage.e11.e0(r12)     // Catch: java.lang.Exception -> L3f
            return r12
        L3f:
            r12 = move-exception
            goto L58
        L41:
            defpackage.e11.e0(r12)
            r12 = r3
        L45:
            r0.a = r11     // Catch: java.lang.Exception -> L53
            r0.b = r12     // Catch: java.lang.Exception -> L53
            r0.e = r3     // Catch: java.lang.Exception -> L53
            java.lang.Object r10 = r10.q(r11, r0)     // Catch: java.lang.Exception -> L53
            if (r10 != r4) goto L52
            goto L75
        L52:
            return r10
        L53:
            r1 = move-exception
            r9 = r1
            r1 = r11
            r11 = r12
            r12 = r9
        L58:
            r5 = 3
            if (r11 > r5) goto L76
            boolean r5 = r12 instanceof android.os.DeadObjectException
            if (r5 != 0) goto L63
            boolean r5 = r12 instanceof java.util.concurrent.TimeoutException
            if (r5 == 0) goto L76
        L63:
            int r11 = r11 + 1
            r5 = 400(0x190, double:1.976E-321)
            long r7 = (long) r11
            long r7 = r7 * r5
            r0.a = r1
            r0.b = r11
            r0.e = r2
            java.lang.Object r12 = defpackage.tw1.H(r7, r0)
            if (r12 != r4) goto L2d
        L75:
            return r4
        L76:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fs8.p(kb4, kt1):java.lang.Object");
    }

    public final Object q(kb4 kb4Var, es8 es8Var) {
        jt1 jt1Var = null;
        if (this.w.get()) {
            throw new mp7(null);
        }
        s00 s00Var = s00.s;
        jx1 jx1Var = this.e;
        ae5 ae5Var = new ae5((yd5) jx1Var.get(s00Var));
        this.b.c.add(ae5Var);
        ae5Var.invokeOnCompletion(new q57(21, this, ae5Var));
        return ah1.b0(jx1Var.plus(ae5Var), new lq8(this, kb4Var, ae5Var, jt1Var, 1), es8Var);
    }
}

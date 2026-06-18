package defpackage;

import android.content.Context;
import android.os.Build;
import baidu.lac.jni.LacLib;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pl5 implements x07 {
    public static final boolean e;
    public final Context a;
    public final t07 b;
    public qg c;
    public boolean d;

    static {
        String[] strArr = Build.SUPPORTED_ABIS;
        strArr.getClass();
        boolean z = false;
        for (String str : strArr) {
            if (lc5.Q(str, "arm64-v8a") || lc5.Q(str, "armeabi-v7a")) {
                z = true;
                break;
            }
        }
        e = z;
    }

    public pl5() {
        Context context = kl8.D;
        context.getClass();
        this.a = context;
        this.b = u07.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r9 == r6) goto L25;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.x07
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable M0(java.lang.String r8, defpackage.kt1 r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl5.M0(java.lang.String, kt1):java.io.Serializable");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        qg qgVar = this.c;
        if (qgVar != null) {
            LacLib.destroy(((Number) qgVar.c.getValue()).longValue());
        }
        this.c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.kt1 r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.a
            boolean r1 = r7 instanceof defpackage.ol5
            if (r1 == 0) goto L15
            r1 = r7
            ol5 r1 = (defpackage.ol5) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            ol5 r1 = new ol5
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.b
            int r2 = r1.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L2a
            t07 r1 = r1.a
            defpackage.e11.e0(r7)
            goto L4d
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r6)
            return r4
        L30:
            defpackage.e11.e0(r7)
            boolean r7 = r6.d
            if (r7 == 0) goto L38
            return r4
        L38:
            qg r7 = r6.c
            if (r7 == 0) goto L3d
            return r7
        L3d:
            t07 r7 = r6.b
            r1.a = r7
            r1.d = r3
            java.lang.Object r1 = r7.p(r1)
            xx1 r2 = defpackage.xx1.a
            if (r1 != r2) goto L4c
            return r2
        L4c:
            r1 = r7
        L4d:
            boolean r7 = r6.d     // Catch: java.lang.Throwable -> L92
            if (r7 == 0) goto L53
            r7 = r4
            goto L8e
        L53:
            qg r7 = r6.c     // Catch: java.lang.Throwable -> L92
            if (r7 == 0) goto L58
            goto L8e
        L58:
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L7b
            java.io.File r2 = r0.getFilesDir()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = "analyzer/model"
            r7.<init>(r2, r5)     // Catch: java.lang.Throwable -> L7b
            ml5 r2 = new ml5     // Catch: java.lang.Throwable -> L7b
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L7b
            qg r7 = new qg     // Catch: java.lang.Throwable -> L7b
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L7b
            r0.getClass()     // Catch: java.lang.Throwable -> L7b
            r7.<init>(r0, r2)     // Catch: java.lang.Throwable -> L7b
            r6.c = r7     // Catch: java.lang.Throwable -> L7b
            goto L82
        L7b:
            r7 = move-exception
            pm8 r0 = new pm8     // Catch: java.lang.Throwable -> L92
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L92
            r7 = r0
        L82:
            java.lang.Throwable r0 = defpackage.qm8.a(r7)     // Catch: java.lang.Throwable -> L92
            if (r0 != 0) goto L89
            goto L8c
        L89:
            r6.d = r3     // Catch: java.lang.Throwable -> L92
            r7 = r4
        L8c:
            qg r7 = (defpackage.qg) r7     // Catch: java.lang.Throwable -> L92
        L8e:
            r1.q(r4)
            return r7
        L92:
            r6 = move-exception
            r1.q(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl5.p(kt1):java.lang.Object");
    }
}

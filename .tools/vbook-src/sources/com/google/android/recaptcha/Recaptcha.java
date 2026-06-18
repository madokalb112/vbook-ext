package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzcq;
import defpackage.ao2;
import defpackage.jt1;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String str) {
        return zzcq.zze(application, str);
    }

    /* JADX INFO: renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m0getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j, jt1 jt1Var, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 10000;
        }
        return recaptcha.m1getClientBWLJW6A(application, str, j, jt1Var);
    }

    @ao2
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzcq.zzc(application, str, 10000L);
    }

    public final Object fetchClient(Application application, String str, jt1 jt1Var) {
        return zzcq.zzd(application, str, jt1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @defpackage.ao2
    /* JADX INFO: renamed from: getClient-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1getClientBWLJW6A(android.app.Application r5, java.lang.String r6, long r7, defpackage.jt1 r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r4 = r0.zza
            int r9 = r0.zzc
            r1 = 1
            if (r9 == 0) goto L2c
            if (r9 != r1) goto L25
            defpackage.e11.e0(r4)     // Catch: java.lang.Throwable -> L3d
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r4)
            r0.zzc = r1     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r4 = com.google.android.recaptcha.internal.zzcq.zzb(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L3d
            xx1 r5 = defpackage.xx1.a
            if (r4 != r5) goto L3a
            return r5
        L3a:
            com.google.android.recaptcha.internal.zzdc r4 = (com.google.android.recaptcha.internal.zzdc) r4     // Catch: java.lang.Throwable -> L3d
            return r4
        L3d:
            r4 = move-exception
            pm8 r5 = new pm8
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m1getClientBWLJW6A(android.app.Application, java.lang.String, long, jt1):java.lang.Object");
    }

    @ao2
    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j) {
        return zzcq.zzc(application, str, j);
    }
}
